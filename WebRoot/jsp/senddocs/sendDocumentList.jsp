<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8" />
<title>发文</title>
<jsp:include page="/base.jsp"></jsp:include>
<script language="javascript" type="text/javascript"
	src="<%=path %>/jsp/js/senddocjs/sendDocumentList.js"></script>
<script language="javascript" type="text/javascript"
	src="<%=path %>/js/dateFormat.js"></script>
<style media="print">
.Noprint {
	display: none;
}

.PageNext {
	page-break-after: always;
}
</style>
</head>

<body class="easyui-layout">
	<div id="printmyself" style="display: none">
		<OBJECT id="WebBrowser"
			classid="CLSID:8856F961-340A-11D0-A96B-00C04FD705A2" height="0"
			width="0"></OBJECT>
		<a href="#" class="easyui-linkbutton" plain="true" id="print"
			iconCls="icon-print" onclick="getPrintIds()"
			style="float: right; display: none">打印</a>
	</div>
	<div region="center" border="false">
		<table id="sendDocumentList"></table>
	</div>
	<div id="div_search" class="easyui-dialog" title="查询窗口"
		data-options="iconCls:'icon-search'"
		style="width: 750px; height: 207px; text-align: left"
		buttons="#dlg-buttons">
		<br />
		<table width="700" align="left" cellpadding="1" border="0">
			<tr>
				<td width="100" align="right">公文状态：</td>
				<td style="width: 130px;"><select style="width: 131px;"
					class="easyui-combobox" id="slt_dj_state">
						<option>全部</option>
						<option>草稿</option>
						<option>待排版校对</option>
						<option>待下发</option>
						<option>发文完成</option>
				</select></td>
				<td width="100" align="right">文件名：</td>
				<td width="130"><input type="text" id="txt_file_name"
					style="width: 125px;" /></td>
				<td width="100" align="right"><span>文件字号：</span></td>
				<td width="130"><input type="text" id="txt_file_code"
					style="width: 125px;" /></td>
			</tr>
			<tr>
				<td width="100" align="right">文件日期：</td>
				<td><input type="text" id="txt_file_date" style="width: 131px;"
					class="easyui-datebox"> </input></td>
				<td width="100" align="right">起始日期：</td>
				<td width="130"><input type="text" id="txt_from_date"
					class="easyui-datebox" style="width: 131px;" /></td>
				<td width="100" align="right">截止日期：</td>
				<td><input type="text" id="txt_end_date" style="width: 131px;"
					class="easyui-datebox"> </input></td>
			</tr>
			<tr>
				<td width="100" align="right">承办人：</td>
				<td><input type="text" id="fcarrier" style="width: 125px;">
					</input></td>
				<td width="100" align="right">主送：</td>
				<td><input type="text" id="txt_mainSend" style="width: 125px;">
					</input></td>
				<td width="100" align="right">抄送：</td>
				<td><input type="text" id="txt_copySend" style="width: 125px;">
					</input></td>
			</tr>
			<tr>
				<td width="100" align="right">签发人：</td>
				<td colspan=5><input type="text" id="fIssuer"
					style="width: 125px;"> </input></td>
			</tr>
		</table>
		<br />
	</div>
 	<div id="dlg-buttons">
		<a href="#" class="easyui-linkbutton" iconCls="icon-search"
			onclick="javascript:do_search()">查询</a> <a href="#"
			class="easyui-linkbutton" iconCls="icon-undo"
			onclick="javascript:do_clear()">重置</a>
	</div> 
	<div id="div_file_search" class="easyui-dialog" title="查询窗口"
		data-options="iconCls:'icon-search'"
		style="width: 600px; height: 180px; padding: 10px">
		<br /> <br />
		<table width="500" style="margin-right: 45px;" cellpadding="7">
			<tr>
				<td width="100px" align="right">文件名：</td>
				<td><input type="text" id="txt_file_name_send"
					style="width: 150px;" /></td>
				<td width="100px" align="right">文件字号：</td>
				<td><input type="text" id="txt_file_num" style="width: 150px;" /></td>

			</tr>
		</table>
		<br /> <br />
		<center>
			<a onclick="do_file_search()" id="btn_search" plain="true" class="easyui-linkbutton" iconCls="icon-search">查询</a> <a href="#"
				class="easyui-linkbutton" iconcls="icon-remove" plain="true"
				onclick="do_file_clear()" id="btn_clear" style="margin-left: 15px;">清除</a>
		</center>
	</div>
	<input type="hidden" value=<%=request.getParameter("myselfDeptID")%>
		id="myselfDeptID" name="myselfDeptID"></input>
	<input type="hidden" value=<%=request.getParameter("nodeId")%>
		id="nodeId" name="nodeId"></input>
	<input type="hidden" value=<%=request.getParameter("nodeText")%>
		id="nodeText" name="nodeText"></input>
</body>
</html>