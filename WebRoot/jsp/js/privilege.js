(function(){
	var updateOrSave;
	$('#privilegeTable').datagrid({  
		idField:'privilegeid',
		title:'权限列表',
		loadMsg:'数据正在加载...',
	    url:'privilege/getAllPrivilegeByPage.action', 
	    fitColumns:true,
	    rownumbers:true,
	    striped:true,
	    pagination:true,
	    singleSelect:true,
	    pageSize:2,
	    columns:[[   
	            {field:'checkbox',checkbox:true},
		        {field:'privilegeid',title:'员工ID',hidden:true},
		        {field:'privilegename',title:'权限',width:50},
		        {field:'description',title:'权限描述',width:50}
	        ]],
	    onLoadSuccess:function(data){
	       console.log(data);
	    },
	    toolbar:[
	             {
		        	   text:'新增权限',
		        	   iconCls:'icon-add' , 
		        	   handler:function(){
		        		   $("#addprivilege").dialog('open');
		        		   $('#addPrivilegeForm').get(0).reset();
		        		   updateOrSave = "save";
		        	   }
	             },
		         {
		        	   text:'修改权限',
		        	   iconCls:'icon-edit' , 
		        	   handler:function(){
		        		   var selecetDatas = $('#privilegeTable').datagrid('getSelections');
		        		   if(selecetDatas.length != 1){
		        			   $.messager.show({
		        				   msg:'选中一条记录进行修改',
		        				   title:'操作错误',
		        				   timeout:0
		        			   });
		        		   }else{
		        			   $("#addprivilege").dialog('open');
			        		   $('#addPrivilegeForm').get(0).reset();
			        		   $("#addPrivilegeForm").form('load',{
			        			   privilegeid:selecetDatas[0].privilegeid,
			        			   privilegename:selecetDatas[0].privilegename,
			        			   description:selecetDatas[0].description
			        		   });
			        		   updateOrSave = "update";
		        		   }
		        	   }
		         },
		         {
		        	   text:'删除权限',
		        	   iconCls:'icon-remove', 
		        	   handler:function(){
		        		   var selecetDatas = $('#privilegeTable').datagrid('getSelections');
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
		        						  ids = ids + (v.privilegeid+",");
		        					   });
		        					   ids = ids.substring(0,ids.lastIndexOf(","));
		        					   
		        					   $.ajax({
		        						   type:'post',
		        						   url:'privilege/deletePrivilege.action',
		        						   data:"ids="+ids,
		        						   success:function(msg){
		        							   console.log(msg);
		        							   $("#privilegeTable").datagrid('reload');
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
	$("#addPrivilegeSureBtn").click(function(){
		if(updateOrSave == 'save'){
			$.ajax({
				type:'post',
				url:'privilege/addPrivilege.action',
				data:$("#addPrivilegeForm").serialize(),
				dataType:'json',
				success:function(msg){
					$("#privilegeTable").datagrid('reload');
					$("#addprivilege").dialog('close');
				}
			});
		}else if(updateOrSave == 'update'){
			$.ajax({
				type:'post',
				url:'privilege/modifyPrivilege.action',
				data:$("#addPrivilegeForm").serialize(),
				dataType:'json',
				success:function(msg){
					$("#privilegeTable").datagrid('reload');
					$("#addprivilege").dialog('close');
				}
			});
		}
	});
	$("#addPrivilegeResetBtn").click(function(){
		$('#addPrivilegeForm').get(0).reset();
	});
})();