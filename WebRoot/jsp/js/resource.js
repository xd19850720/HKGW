(function(){
	var updateOrSave;
	$('#resourceTable').datagrid({  
		idField:'resourceid',
		title:'权限列表',
		loadMsg:'数据正在加载...',
	    url:'privilege/getAllresourcesByPage.action', 
	    fitColumns:true,
	    rownumbers:true,
	    striped:true,
	    pagination:true,
//	    singleSelect:true,
	    pageSize:2,
	    columns:[[   
	            {field:'checkbox',checkbox:true},
		        {field:'resourceid',title:'ID',hidden:true},
		        {field:'uri',title:'资源链接',width:50},
		        {field:'description',title:'资源描述',width:50},
		        {field:'privilegeName',title:'所属权限',width:50}
	        ]],
	    onLoadSuccess:function(data){
	     
	    },
	    onDblClickRow:function(rowIndex,rowData){
	    	$("#selectPrivilegeDialog").dialog('open');
	    	//显示已经选择的角色
	    	var selectedId = rowData.resourceid;
	    	$("#selectedPrivileges").datagrid({
	    		loadMsg:'数据正在加载...',
	    	    url:'privilege/getPrivilegeByResourceId.action', 
	    	    fitColumns:true,
	    	    striped:true,
	    	    pagination:false,
	    	    singleSelect:true,
	    	    pageSize:20,
	    	    queryParams:{"resourceId":selectedId},
	    	    columns:[[
	    	           {field:'privilegeid',title:'权限ID',hidden:true},
	    	           {field:'privilegename',title:'权限名称',width:100}
	    	    ]]
	    	});
	    	$("#selectPrivilegesTable").datagrid({
	    		 url:'privilege/getUnSelectedPrivilegeByResourceId.action', 
		    	    fitColumns:true,
		    	    striped:true,
		    	    pagination:true,
		    	    rownumbers:true,
		    	    singleSelect:true,
		    	    pageSize:20,
		    	    queryParams:{"resourceid":selectedId},
		    	    columns:[[
		    	           {field:'privilegeid',title:'权限ID',hidden:true},
		    	           {field:'privilegename',title:'权限',width:50},
		    	           {field:'description',title:'描述',width:100}
		    	    ]],
		    	    onDblClickRow:function(rowIndex,rowData){
		    	    	var privilegeId = rowData.privilegeid;
		    	    	var data = "resourceId="+selectedId+"&"+"privilegeId="+privilegeId;
		    	    	//更改权限
		    	    	 $.messager.confirm('更改权限','确认更改权限?',function(flag){
		    	    		 if(flag){
		    	    			 $.ajax({
		    	    				type:'post',
	    	    					url:'privilege/modifyResourcePrivilege.action',
	    	    					data:data,
	    	    					dataType:'json',
	    	    					success:function(msg){
	    	    						$.messager.alert('更新成功','更改权限成功','info',function(){
	    	    							$("#selectRole").dialog('close');
	    	    						});   
	    	    						$("#selectPrivilegesTable").datagrid("reload");
	    	    						$("#selectedPrivileges").datagrid("reload");
	    	    						$("#resourceTable").datagrid("reload");
	    	    					}
		    	    			 });
		    	    		 }else{
		    	    			 $("#selectRole").dialog('close');
		    	    		 }
		    	    	 });
		    	    }
	    	});
	    },
	    toolbar:[
	             {
		        	   text:'新增资源',
		        	   iconCls:'icon-add' , 
		        	   handler:function(){
		        		   $("#addresource").dialog('open');
		        		   console.log($('#addresourceForm'));
		        		   $('#addResourceForm').get(0).reset();
		        		   updateOrSave = "save";
		        	   }
	             },
		         {
		        	   text:'修改资源',
		        	   iconCls:'icon-edit' , 
		        	   handler:function(){
		        		   var selecetDatas = $('#resourceTable').datagrid('getSelections');
		        		   if(selecetDatas.length != 1){
		        			   $.messager.show({
		        				   msg:'选中一条记录进行修改',
		        				   title:'操作错误',
		        				   timeout:0
		        			   });
		        		   }else{
		        			   $("#addresource").dialog('open');
			        		   $('#addResourceForm').get(0).reset();
			        		   $("#addResourceForm").form('load',{
			        			   resourceid:selecetDatas[0].resourceid,
			        			   uri:selecetDatas[0].uri,
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
		        		   var selecetDatas = $('#resourceTable').datagrid('getSelections');
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
		        						  ids = ids + (v.resourceid+",");
		        					   });
		        					   ids = ids.substring(0,ids.lastIndexOf(","));
		        					   
		        					   $.ajax({
		        						   type:'post',
		        						   url:'privilege/deleteResources.action',
		        						   data:"ids="+ids,
		        						   success:function(msg){
		        							   console.log(msg);
		        							   $("#resourceTable").datagrid('reload');
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
	$("#addResourceSureBtn").click(function(){
		if(updateOrSave == 'save'){
			$.ajax({
				type:'post',
				url:'privilege/addResource.action',
				data:$("#addResourceForm").serialize(),
				dataType:'json',
				success:function(msg){
					console.log(msg);
					$("#resourceTable").datagrid('reload');
					$("#addresource").dialog('close');
				}
			});
		}else if(updateOrSave == 'update'){
			$.ajax({
				type:'post',
				url:'privilege/modifyResource.action',
				data:$("#addResourceForm").serialize(),
				dataType:'json',
				success:function(msg){
					$("#resourceTable").datagrid('reload');
					$("#addresource").dialog('close');
				}
			});
		}
	});
	$("#addResourceResetBtn").click(function(){
		$('#addResourceForm').get(0).reset();
	});
})();