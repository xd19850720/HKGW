<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8" />
<title>请您录入：新增公文</title>
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/common.css" />
	<script type="text/javascript" src="<%=path %>/js/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
	<link rel="stylesheet" type="text/css" href="<%=path %>/js/jquery-easyui-1.2.6/themes/default/easyui.css" />
	<link rel="stylesheet" type="text/css" href="<%=path %>/js/jquery-easyui-1.2.6/themes/icon.css" />
	<script type="text/javascript" src="<%=path %>/js/jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="<%=path %>/js/jquery-easyui-1.2.6/locale/easyui-lang-zh_CN.js"></script>


<script language="javascript" type="text/javascript"
	src="<%=path %>/jsp/js/senddocjs/addDocument.js"></script>

<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/addDocument.css" />
<style  type="text/css">
	input[type='text']{
	  width:100px
	}
	
	.white1 {
	background-color: #CCFFCC;
	width: 100px;
}

</style>
</head>
<body topmargin='0' leftmargin='0' rightmargin='0' bottomnargin='0'>
	<div id="tt" class="easyui-tabs" style="height: 600px" border="0px;">

		<div title="基本信息" id="addWin" style="overflow:hidden">
			<div id="tab-tools" style="background-color: #E0ECFF;">
					<a
					class="easyui-linkbutton" plain="true" iconCls="icon-gw-EditInformationHS"
					onclick="setFileNum('fileNum')">生成文件字号</a> <a
					href="javascript:void(0)" class="easyui-linkbutton" plain="true"
					iconCls="icon-gw-modify"
					onclick="forMainSendJSP('mainSend','mainSend.jsp')">设置主送</a> <a
					class="easyui-linkbutton" plain="true" iconCls="icon-edit"
					onclick="forMainSendJSP('duplicateSend','mainSend.jsp')">设置抄送</a>
					<a id="button" style="float: right;" plain="true" class="easyui-linkbutton"
					iconcls="icon-save" onclick="return add()">保存</a>
			</div>

			<div data-options="region:'center',title:'center title'">
				<form class="easyui-form" id="addForm" method="post">
					<table bordercolor='#ECE9D8'>
						<tr style="height: 20px">
							<td class="black" align="right">承办人&nbsp;&nbsp;</td>
							<td class="white"><input id="loginPerson" name="loginPerson"
								class="myinput" style="width:100%" type="text" /> <input type="hidden"
								id="loginPerson_hidden"></td>
							<td class="black" align="right" style="width:85px "><font color="red" ></font>承办部门&nbsp;&nbsp;</td>
							<td class="white" style="background-color: #CCFFCC"><span
								id="org" name="org" class="myinput"
								style="background-color: #CCFFCC; height: 20px; border: 0px; "
								type="text" ></span><input
								type="hidden" id="org_hidden"></td>
							<td class="black" align="right" style="width:85px">文件日期&nbsp;&nbsp;</td>
							<td class="whitebig" ><input id="fileDate" name="fileDate"
								type="text" class="easyui-datebox" required="required" /></td>
						</tr>
						<tr style="height: 20px;" >
							<td class="black" align="right">保密期限&nbsp;&nbsp;</td>
							<td class="white"><input id="secretPeriod"
								name="secretPeriod" type="text" class="myinput"
								 /></td>
							<td class="black" align="right">文件字号&nbsp;&nbsp;</td>
							<td class="white" colspan='3'><input id="fileNum" style="width:100%"
								onclick="setFileNum('fileNum')" name="fileNum" type="text"
								class="myinput"  value="" /></td>
						</tr>
						<tr style="height: 20px;">
							<td class="black" align="right">题名&nbsp;&nbsp;</td>
							<td class="white" colspan='5'><input id="fileName" style="width:100%"
								name="fileName" type="text" class="myinput"
								 /></td>
						</tr>
						<tr style="height: 20px;">
							<td class="black" class="black" align="right"><font
								color="red"></font>附件题名&nbsp;&nbsp;</td>
							<td class="white"><input id="attachmentName" colspan='5'
								name="attachmentName" class="myinput"  style="width:100%" /></td>
						</tr>
						<tr style="height: 20px">
							<td class="black" class="black" align="right"><font
								color="red"></font>附件数&nbsp;&nbsp;</td>
							<td class="white"><input id="attachmentNums"
								name="attachmentNums" class="easyui-numberbox myinput"
								 min=1 style="" /></td>
							<td class="black" align="right"><font
								color="red"></font>密级&nbsp;&nbsp;</td>
							<td class="white"><input class="myinput" id="secretItems"
								name="secretItems"  type="text"></td>
							<td class="black" class="black" align="right"><font
								color="red"></font>登记日期&nbsp;&nbsp;</td>
							<td class="white"><input id="loginDate" name="loginDate"
								type="text" class="easyui-datebox" required="required"></input></td>
						</tr>
						<tr style="height: 20px;">
							<td class="black" align="right">主送&nbsp;&nbsp;</td>
							<td class="white" colspan='5'><input id="mainSend" style="width:100%"
								name="mainSend" class="myinput"  /> <input
								type="hidden" id="mainSend_hidden"><input type="hidden"
								id="mainSend_hidden_type"><input type="hidden"
								id="mainSend_hidden_sortnumber"></td>
						</tr>
						<tr style="height: 20px;">
							<td class="black" align="right">抄送&nbsp;&nbsp;</td>
							<td class="white" colspan=5><input id="duplicateSend" style="width:100%"
								name="duplicateSend" class="myinput" /> <input
								type="hidden" id="duplicateSend_hidden"> <input
								type="hidden" id="duplicateSend_hidden_type"><input
								type="hidden" id="duplicateSend_hidden_sortnumber"></td>
						</tr>
						<tr style="height: 20px;">
							<td class="black" align="right">拟稿人&nbsp;&nbsp;</td>
							<td class="white"><input id="drafter" name="drafter"  
								class="myinput" /> <input type="hidden"
								id="drafter_hidden"></td>
							<td class="black" align="right">核稿人&nbsp;&nbsp;</td>
							<td class="white"><input id="hegaoPerson" name="hegaoPerson" 
								class="myinput"  /> <input type="hidden"
								id="hegaoPerson_hidden"></td>
							<td class="black" align="right">审核人&nbsp;&nbsp;</td>
							<td class="white"><input id="verifyPerson" 
								name="verifyPerson" class="myinput"  style="width:100%"/> <input
								type="hidden" id="verifyPerson_hidden"></td>
						</tr>
						<tr style="height: 20px;">
							<td class="black" align="right">会签人&nbsp;&nbsp;</td>
							<td class="white" colspan=5><input id="countersign"  style="width:100%"
								name="countersign" class="myinput"  /> <input
								type="hidden" id="countersign_hidden"></td>
						</tr>
					 <tr style="height: 20px;">
							<td class="black" align="right">签发人&nbsp;&nbsp;</td>
							<td class="white" colspan=3><input id="issuer" name="issuer" style="width:100%"
								class="myinput"  /> <input type="hidden"
								id="issuer_hidden"></td>
							<td class="black" align="right">缓急&nbsp;&nbsp;</td>
							<td class="white"><input id="isUrgency" name="isUrgency"
								class="myinput" ></input></td>
						</tr>
						<tr style="height: 20px;">
							<td class="black" align="right">备注&nbsp;&nbsp;</td>
							<td class="white" colspan=5><input name="fRemark" style="width:100%" 
								id="fRemark" class="myinput"  /></td>
						</tr>
					</table>
				</form>
			</div>
			<div style="margin-top: 30px">
				<div class="datagrid-mask-msg" id="readme"
					style="display: none; left: 360px; top: 232.5px;">正在处理，请稍待。。。</div>
			</div>
		</div>
	</div>
</body>
</html>