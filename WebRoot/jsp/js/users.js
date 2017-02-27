(function(){
	
	$.fn.serializeObject = function()
	{
		var o = {};
		var a = this.serializeArray();
		$.each(a, function() {
			if (o[this.name] !== undefined) {
				if (!o[this.name].push) {
					o[this.name] = [o[this.name]];
				}
				o[this.name].push(this.value || '');
			} else {
				o[this.name] = this.value || '';
			}
		});
		return o;
	};
	var updateOrSave;
	$('#usersTable').datagrid({  
		//idField:'employeeId',
		title:'员工列表',
		loadMsg:'数据正在加载...',
	    url:'employee/getEmployeesByPage.action', 
	    fitColumns:true,
	    rownumbers:true,
	    striped:true,
	    pagination:true,
	    singleSelect:false,
	    pageSize:20,
	    columns:[[   
	        {field:'employeeid',title:'员工ID',hidden:true},
	        {field:'checkbox',checkbox:true},
	        {field:'employeecode',title:'员工编号',width:30,align:'center'},   
	        {field:'employeename',title:'员工姓名',width:100,align:'right'},
	        {field:'age',title:'年龄',width:20,align:'center'},   
	        {field:'positionName',title:'职位',width:50,align:'center'},
	        {
	        	field:'sex',
	        	title:'性别',
	        	width:20,
	        	align:'center',
	        	formatter:function(value,rowData,rowIndex){
	        		if(value==0){
	        			return '女';
	        		}
	        		return '男';
	        	}
	        },  
	        {field:'tel',title:'电话',width:100,align:'right'},  
	        {field:'mail',title:'邮箱',width:100,align:'right'}, 
	        {field:'name',title:'员工角色',width:100,align:'right'}
	    ]],
	    //事件
	    onDblClickRow:function(rowIndex,rowData){
	    	$("#selectRole").dialog('open');
	    	//显示已经选择的角色
	    	var selectedId = rowData.employeeid;
	    	$("#selectedRolesTable").datagrid({
	    		loadMsg:'数据正在加载...',
	    	    url:'privilege/getRolesByEmployeeId.action', 
	    	    fitColumns:true,
	    	    striped:true,
	    	    pagination:false,
	    	    singleSelect:true,
	    	    pageSize:20,
	    	    queryParams:{"employeeId":selectedId},
	    	    columns:[[
	    	           {field:'roleid',title:'角色ID',hidden:true},
	    	           {field:'name',title:'角色',width:100}
	    	    ]]
	    	});
	    	$("#selectRolesTable").datagrid({
	    		 url:'privilege/getRolesUnSelectedByEmployeeId.action', 
		    	    fitColumns:true,
		    	    striped:true,
		    	    pagination:false,
		    	    rownumbers:true,
		    	    singleSelect:true,
		    	    pageSize:20,
		    	    queryParams:{"employeeId":selectedId},
		    	    columns:[[
		    	           {field:'roleid',title:'角色ID',hidden:true},
		    	           {field:'name',title:'角色',width:50},
		    	           {field:'description',title:'描述',width:100}
		    	    ]],
		    	    onDblClickRow:function(rowIndex,rowData){
		    	    	var roleId = rowData.roleid;
		    	    	var data = "employeeId="+selectedId+"&"+"roleId="+roleId;
		    	    	//更改权限
		    	    	 $.messager.confirm('更改权限','确认更改权限?',function(flag){
		    	    		 if(flag){
		    	    			 $.ajax({
		    	    				type:'post',
	    	    					url:'privilege/modifyEmployeeRole.action',
	    	    					data:data,
	    	    					dataType:'json',
	    	    					success:function(msg){
	    	    						$.messager.alert('更新成功','更改权限成功','info',function(){
	    	    							$("#selectRole").dialog('close');
	    	    						});   
	    	    						$("#selectRolesTable").datagrid("reload");
	    	    						$("#selectedRolesTable").datagrid("reload");
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
	        	   text:'新增用户',
	        	   iconCls:'icon-add' , 
	        	   handler:function(){
	        		   $("#addUser").dialog('open');
	        		   $('#addUserForm').get(0).reset();
	        		   $('#addUserFormEmployyeeCode').hide();
	        		   updateOrSave = "save";
	        	   }
	           } ,
	           {
	        	   text:'修改用户',
	        	   iconCls:'icon-edit' , 
	        	   handler:function(){
	        		   var selecetDatas = $('#usersTable').datagrid('getSelections');
	        		   console.log(selecetDatas);
	        		   if(selecetDatas.length != 1){
	        			   $.messager.show({
	        				   msg:'选中一条记录进行修改',
	        				   title:'操作错误',
	        				   timeout:0
	        			   });
	        		   }else{
	        			   $("#addUser").dialog('open');
		        		   $('#addUserForm').get(0).reset();
		        		   $('#addUserFormEmployyeeCode').show();
		        		   updateOrSave = "update";
	        			   $("#addUserForm").form('load',{
	        				   employeeid:selecetDatas[0].employeeid,
	        				   employeecode:selecetDatas[0].employeecode,
	        				   employeename:selecetDatas[0].employeename,
	        				   age:selecetDatas[0].age,
	        				   sex:selecetDatas[0].sex,
	        				   positionid:selecetDatas[0].positionid,
	        				   tel:selecetDatas[0].tel,
	        				   mail:selecetDatas[0].mail,
		        		   });
	        		   }
	        	   }
	           } ,
	           {
	        	   text:'删除用户',
	        	   iconCls:'icon-remove' ,
	        	   handler:function(){
	        		   var selecetDatas = $('#usersTable').datagrid('getSelections');
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
	        						  ids = ids + (v.employeeid+",");
	        					   });
	        					   ids = ids.substring(0,ids.lastIndexOf(","));
	        					   
	        					   $.ajax({
	        						   type:'post',
	        						   url:'employee/deleteEmployees.action',
	        						   data:"ids="+ids,
	        						   success:function(msg){
	        							   console.log(msg);
	        							   $("#usersTable").datagrid('reload');
	        						   }
	        					   });
	        					   
	        				   }else{
	        					   return;
	        				   }
	        			   });
	        		   }
	        	   }
	           } ,
	           {
	        	   text:'查找用户',
	        	   iconCls:'icon-search' ,
	        	   handler:function(){
	        			$("#user").layout('expand','north');
	        	   }
	           } ,
	    ]
	});  
	
	//添加雇员
	$("#addUserSureBtn").click(function(){
		if(updateOrSave == 'save'){
			//保存操作
			$.ajax({
				type:'post',
				url:'employee/addEmployee.action',
				data:$("#addUserForm").serialize(),
				dataType:'json',
				success:function(msg){
					$("#usersTable").datagrid('reload');
					$("#addUser").dialog('close');
				}
			});
		}else if(updateOrSave == 'update'){
			//更新操作
			$.ajax({
				type:'post',
				url:'employee/editEmployee.action',
				data:$("#addUserForm").serialize(),
				dataType:'json',
				success:function(msg){
					$("#usersTable").datagrid('reload');
					$("#addUser").dialog('close');
				}
			});
		}
	});
	$("#addUserResetBtn").click(function(){
		$('#addUserForm').get(0).reset();
	});
	//查询雇员
	$("#searchUserSureBtn").click(function(){
		//TODO 脚本验证
		var datas = $("#searchEmployeeForm").serializeObject();
		datas.page = 1;
//		console.log(datas);
		//$("#usersTable").datagrid('loadData',msg);
		$("#usersTable").datagrid('options').queryParams = datas;
		$("#usersTable").datagrid('load');
//		$.ajax({
//			type:'post',
//			url:'employee/getEmployeesByConditions.action',
//			data:$("#searchEmployeeForm").serialize(),
//			dataType:'json',
//			success:function(msg){
//				
//			}
//		});
	});
//	//初始化员工职位下拉框
	$("#employeePosition").combobox({
		url:'position/getAllPositions.action',   
		valueField:'id',   
		textField:'text'
			//TODO 优化一次请求，所有的下拉框都使用
//		onLoadSuccess:function(){
//			console.log($("#employeePosition").combobox('getData'));
//			console.log($("#addEmployeePosition").combobox("options"));
//		}
	});
	$("#addEmployeePosition").combobox({
		url:'position/getAllPositions.action',   
		valueField:'id',   
		textField:'text'
	});
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	$("#searchUserCancleBtn").click(function(){
		$('#searchEmployeeForm').get(0).reset();
	});
	
	
})();