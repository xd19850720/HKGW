<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8" />
<title>设置主送</title>
<jsp:include page="/base.jsp"></jsp:include>
<script language="javascript" type="text/javascript">

	var inputID;
	$(function() {
		inputID = window.dialogArguments;
		var lastRowIndex;
		$('#depDictionary').datagrid({
			url : '/HKGW/department/getAlldDepartment.action',
			rownumbers : true,
			singleSelect : false,
			sortName : 'id',
			idField : 'id',
			columns : [ [ {
				field : 'ck',
				checkbox : 'true'
			}, {
				field : 'deptid',
				title : 'id',
				width : 100
			}, {
				field : 'departmentname',
				title : '名称',
				width : 100
			} ] ],
			onSelect : function checkToConsole(rowIndex, rowData) {
				if (rowIndex == lastRowIndex) {
					$('#depDictionary').datagrid('unselectAll');
					lastRowIndex = null;
				} else {
					lastRowIndex = rowIndex;
				}
			}
		});

	
});
	
	function getData() {
		var row = $("#depDictionary").datagrid('getSelections');
		if (row) {
			window.returnValue = row;
			window.close();
		}

	}
</script>

</head>
<body class="easyui-layout">
	<div region="center" style="height: 260px;" title="设置主送/抄送部门">
		<table id="depDictionary" class="easyui-datagrid" border="false">
		</table>
	</div>
	<div region="south"
		style="text-align: center; padding: 5px 0; height: 50px;">
		<a class="easyui-linkbutton" iconcls="icon-ok"
			href="javascript:void(0)" onclick="getData()"> 确定</a>
	</div>
</body>
</html>