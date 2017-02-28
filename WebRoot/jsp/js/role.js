(function(){
	var updateOrSave;
	$('#roleTable').datagrid({  
		idField:'roleid',
		title:'角色列表',
		loadMsg:'数据正在加载...',
	    url:'privilege/getAllRolesByPage.action', 
	    fitColumns:true,
	    rownumbers:true,
	    striped:true,
	    pagination:true,
	    pageSize:2,
	    columns:[[   
	            {field:'checkbox',checkbox:true},
		        {field:'roleid',title:'ID',hidden:true},
		        {field:'name',title:'角色名称',width:50},
		        {field:'description',title:'角色描述',width:50}
	        ]],
	    onLoadSuccess:function(data){
	     
	    },
	    onDblClickRow:function(rowIndex,rowData){
	    	var roleId = rowData.roleid;
	    	
	    	$("#selectPrivilege").dialog("open");
	    	$("#selectedPrivileges").datagrid({
	    		loadMsg:'数据正在加载...',
	    	    url:'privilege/getResourcePrivilegeRelate.action', 
	    	    fitColumns:true,
	    	    rownumbers:true,
	    	    striped:true,
	    	    queryParams:{"roleId":roleId},
	    	    pagination:false,
	    	    pageSize:20,
	    	    columns:[[   
	    	            {field:'checkbox',checkbox:true},
	    		        {field:'privilegeid',title:'ID',hidden:true},
	    		        {field:'privilegename',title:'权限名称',width:50},
	    		        {field:'description',title:'角色描述',width:50}
	    	        ]],
	    	        toolbar:[
		    	                 {
		    	                	 text:'移除权限',
		    	                	 iconCls:'icon-remove',
		    	                	 handler:function(){
		    	                		 var selectDatas = $('#selectedPrivileges').datagrid('getSelections');
		    	                		 if(selectDatas == 0){		    			        			   $.messager.show({
		    			        				   msg:'至少选中一条进行删除',
		    			        				   title:'操作错误',
		    			        				   timeout:0
		    			        			   });
		    			        		   }else{
		    			        			   $.messager.confirm("确认删除","确认移除"+selectDatas.length+"条权限",function(sure){
		    			        				   if(sure){
		    			        					   //删除
		    			        					   var ids = "";
		    			        					   $.each(selectDatas,function(i,v){
		    			        						  ids = ids + (v.privilegeid+",");
		    			        					   });
		    			        					   ids = ids.substring(0,ids.lastIndexOf(","));
		    			        					   var data = "privilegeIds="+ids+"&roleId="+roleId;
		    			        					   $.ajax({
		    			        						   type:'post',
		    			        						   url:'privilege/deletePrivilegeRelated.action',
		    			        						   data:data,
		    			        						   success:function(msg){
		    			        							   console.log(msg);
		    			        							   $("#selectedPrivileges").datagrid('reload');
		    			        						   }
		    			        					   });
		    			        				   }else{
		    			        					   return;
		    			        				   }
		    			        			   });
		    			        		   }
		    	                	 }
		    	                 }
	    	                 ]
	    	});
	    	
	    	//可选择的权限
	    	$("#selectPrivileges").datagrid({
	    		loadMsg:'数据正在加载...',
	    	    url:'privilege/getPrivilegeUnRelated.action', 
	    	    fitColumns:true,
	    	    rownumbers:true,
	    	    striped:true,
	    	    queryParams:{"roleid":roleId},
	    	    pagination:true,
	    	    pageSize:20,
	    	    columns:[[   
		    	            {field:'checkbox',checkbox:true},
		    		        {field:'privilegeid',title:'ID',hidden:true},
		    		        {field:'privilegename',title:'权限名称',width:50},
		    		        {field:'description',title:'角色描述',width:50}
		    	        ]],
		    	toolbar:[
			    	         {
			    	        	 text:'增加权限',
	    	                	 iconCls:'icon-remove',
	    	                	 handler:function(){
	    	                		 //增加权限
	    	                		 var selectDatas = $('#selectPrivileges').datagrid('getSelections');
	    	                		 if(selectDatas.length == 0){
	    	                			   $.messager.show({
	    	    	        				   msg:'至少选择一条数据进行添加',
	    	    	        				   title:'操作错误',
	    	    	        				   timeout:0
	    	    	        			   });
	    	                		 }else{
	    	                			 var ids = "";
			        					   $.each(selectDatas,function(i,v){
			        						  ids = ids + (v.privilegeid+",");
			        					   });
			        					   var data = "roleId="+roleId+"&privilegeIds="+ids;
	    	                			 $.ajax({
	    	                				   type:'post',
			        						   url:'privilege/addPrivilegeRoleRelate.action',
			        						   data:data,
			        						   success:function(msg){
			        							   console.log(msg);
			        							   $("#selectPrivileges").datagrid('reload');
			        							   $("#selectedPrivileges").datagrid('reload');
			        						   }
	    	                			 });
	    	                		 }
	    	                	 }
			    	         }
		    	         ]
	    	});
	    	
	    },
	    toolbar:[
	             {
		        	   text:'新增资源',
		        	   iconCls:'icon-add' , 
		        	   handler:function(){
		        		   $("#addrole").dialog('open');
		        		   console.log($('#addRoleForm'));
		        		   $('#addRoleForm').get(0).reset();
		        		   updateOrSave = "save";
		        	   }
	             },
		         {
		        	   text:'修改角色',
		        	   iconCls:'icon-edit' , 
		        	   handler:function(){
		        		   var selecetDatas = $('#roleTable').datagrid('getSelections');
		        		   if(selecetDatas.length != 1){
		        			   $.messager.show({
		        				   msg:'选中一条记录进行修改',
		        				   title:'操作错误',
		        				   timeout:0
		        			   });
		        		   }else{
		        			   $("#addrole").dialog('open');
			        		   $('#addRoleForm').get(0).reset();
			        		   $("#addRoleForm").form('load',{
			        			   roleid:selecetDatas[0].roleid,
			        			   name:selecetDatas[0].name,
			        			   description:selecetDatas[0].description
			        		   });
			        		   updateOrSave = "update";
		        		   }
		        	   }
		         },
		         {
		        	   text:'删除用户',
		        	   iconCls:'icon-remove', 
		        	   handler:function(){
		        		   var selecetDatas = $('#roleTable').datagrid('getSelections');
		        		   if(selecetDatas == 0){
		        			   $.messager.show({
		        				   msg:'至少选中一条进行删除',
		        				   title:'操作错误',
		        				   timeout:0
		        			   });
		        		   }else{
		        			   $.messager.confirm("确认删除","确认删除"+selecetDatas.length+"条信息",function(sure){
		        				   if(sure){
		        					   //删除
		        					   var ids = "";
		        					   $.each(selecetDatas,function(i,v){
		        						  ids = ids + (v.roleid+",");
		        					   });
		        					   ids = ids.substring(0,ids.lastIndexOf(","));
		        					   
		        					   $.ajax({
		        						   type:'post',
		        						   url:'privilege/deleteRoles.action',
		        						   data:"ids="+ids,
		        						   success:function(msg){
		        							   console.log(msg);
		        							   $("#roleTable").datagrid('reload');
		        						   }
		        					   });
		        					   
		        				   }else{
		        					   return;
		        				   }
		        			   });
		        		   }
		        	   
		        	   }
		         }
	    ]
	});
	//按钮事件
	$("#addRoleSureBtn").click(function(){
		if(updateOrSave == 'save'){
			$.ajax({
				type:'post',
				url:'privilege/addRole.action',
				data:$("#addRoleForm").serialize(),
				dataType:'json',
				success:function(msg){
					console.log(msg);
					$("#roleTable").datagrid('reload');
					$("#addrole").dialog('close');
				}
			});
		}else if(updateOrSave == 'update'){
			$.ajax({
				type:'post',
				url:'privilege/modifyRole.action',
				data:$("#addRoleForm").serialize(),
				dataType:'json',
				success:function(msg){
					$("#roleTable").datagrid('reload');
					$("#addRole").dialog('close');
				}
			});
		}
	});
	$("#addRoleResetBtn").click(function(){
		$('#addRoleForm').get(0).reset();
	});
})();