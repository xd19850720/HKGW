<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8" />
<title>文件字号生成器</title>
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/common.css" />
	<script type="text/javascript" src="<%=path %>/js/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
	<link rel="stylesheet" type="text/css" href="<%=path %>/js/jquery-easyui-1.2.6/themes/default/easyui.css" />
	<link rel="stylesheet" type="text/css" href="<%=path %>/js/jquery-easyui-1.2.6/themes/icon.css" />
	<script type="text/javascript" src="<%=path %>/js/jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="<%=path %>/js/jquery-easyui-1.2.6/locale/easyui-lang-zh_CN.js"></script>

<script type="text/javascript">
	window.returnValue = "非正常关闭";
	documentId = window.dialogArguments;

	function getNowYear() {
		date = new Date();
		nowYear = date.getFullYear();
		nowYear = (nowYear < 1900 ? (1900 + nowYear) : nowYear);
		return nowYear;
	}
	//这里添加默认值字段
	$(function() {
		

		var createYear = getNowYear();
		$('#creatYear').val(createYear);
	
		//
		$("#creatYear, #CodeName, #SerialNumber").change(function() {
			createValue();
		});

		createValue();
	});

	function closePage() {
		window.close();
	}
	function returnPage() {

		var values = $('#fileName').val();
		window.returnValue = values;
		window.close();
	
	}
	//获取文件字号
	function getAllValue() {
		var codeName = $('#CodeName').val();
		var serialNumber = $('#SerialNumber').val();
		var creatYear = $('#creatYear').val();
		return codeName + '〔' + creatYear + '〕' + serialNumber;
	}
	function createValue() {
		var values = getAllValue();
		$('#fileName').val(values);
	}
</script>
</head>
<body class="easyui-layout">
	<div region="center" style="background-color: #DFE8F6; border: 0px;">
		<table border=0>
			<tr>
				<td height="5px" colspan=2></td>
			</tr>
			<tr>
				<td width="100px" align="right">形成年度：</td>
				<td><input id="creatYear" name="creatYear"
					class="easyui-validatebox myinput"
					style="width: 210px; height: 27px; font-size: 15px; vertical-align: bottom;"
					type="text" /></td>
			</tr>
			<tr>
				<td width="100px" align="right">文件代号：</td>
				<td><input id="CodeName" name="CodeName"
					class="easyui-validatebox myinput"
					style="width: 210px; height: 27px; font-size: 15px; vertical-align: bottom;"
					type="text" value="惠科" /></td>
			</tr>
			<tr>
				<td width="100px" align="right">文件序号：</td>
				<td><input id="SerialNumber" name="SerialNumber"
					class="easyui-validatebox myinput"
					style="width: 210px; height: 27px; font-size: 15px; vertical-align: bottom;"
					type="text" value="号" /></td>
			</tr>
			<tr>
				<td width="100px" align="right">文件字号：</td>
				<td><input id="fileName" name="fileName"
					class="easyui-validatebox myinput"
					style="width: 210px; height: 27px; font-size: 15px; vertical-align: bottom;"
					type="text" readonly="readonly"/></td>
			</tr>
		</table>
	</div>
	<div region="south"
		style="text-align: right; padding: 0px 31px 0px 0px; height: 47px; background-color: #DFE8F6; border: 0px;">
		
		<a class="easyui-linkbutton" href="javascript:void(0)"  iconcls="icon-ok" onclick="returnPage()">确定</a>
		&nbsp;
		<a class="easyui-linkbutton" href="javascript:void(0)" onclick="closePage()"> 取消</a>
	</div>
</body>
</html>
