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
<title>发文附件管理</title>
<jsp:include page="/base.jsp"></jsp:include>
<link rel="stylesheet" type="text/css" href="<%=path%>/css/addDocument.css" />
<script language="javascript" type="text/javascript" src="<%=path %>/jsp/js/senddocjs/attachment.js"></script>
</head>

<body id="postingClassifiedBody" class="easyui-layout"
	style="width: 100%; padding: 0; margin: 0; height: 100%;">
	<div region="center">
		<table id="uploadAttachment" border="0px"></table>
	</div>
	<div id="uploadWindow" class="easyui-window" closed="true" title="上传附件" 
		style="padding-top: 16px;padding-left:22px;padding-bottom:60px;padding-right:18px; ">
		<form id="uploadForm" class="easyui-form" 
			action="UploadAttachmentAction" method="post"
			enctype="multipart/form-data">
			<table align="center"  style="background-color:#F0F0F0">
				<tr  align="right" style="height:25px">
					<td  style="width:74px">文件&nbsp;&nbsp;</td>
					<td align="left" style="width:370px"><input type="file" name="upload"  style="width:100%"></input>
					</td>
				</tr>
				<tr align="right"  style="height:25px">
					<td  >描述&nbsp;&nbsp;</td>
					<td width=150 align="left"><input id="description"  style="width:290px"
						name="description" type="text"></input></td>
				</tr>
			</table>
			<div align="center" style="margin-top:20px" id="buttons">
				<a class="easyui-linkbutton" iconcls="icon-ok"
					onclick="submitUploadForm()">确定</a> <a class="easyui-linkbutton"
					iconcls="icon-cancel" onclick="closeUploadWin()"
					style="magrin: 20px 0 0 0;">取消</a>
			</div>
			<div class="datagrid-mask-msg" id="attachMessage"
						style="display: none; left: 180px; top: 60px;">正在处理，请稍待。。。</div>
		</form>
	</div>	
	
	<input type="hidden" value=<%=request.getParameter("docType")%>
		id="docType" name="docType"></input>
	<input type="hidden" value=<%=request.getParameter("documentId")%>
		id="documentId" name="documentId"></input>
	<input type="hidden" value=<%=request.getParameter("fDocumentStatus")%>
		id="fDocumentStatus" name="fDocumentStatus"></input>
	<div class="datagrid-mask-msg" id="mloadMessage"
						style="display: none; position:absolute; top:30%;left:30%;">正在处理，请稍待。。。</div>
</body>
</html>