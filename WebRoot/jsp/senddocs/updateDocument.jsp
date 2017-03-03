<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String basePath = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8" />
<title>操作</title>
<jsp:include page="/base.jsp"></jsp:include>
<script language="javascript" type="text/javascript"
	src="<%=basePath %>/jsp/js/senddocjs/updateDocument.js"></script>
<script language="javascript" type="text/javascript"
	src="<%=basePath %>/js/common.js"></script>
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/addDocument.css" />
<style type="text/css">
 input[type="text"]
    {
    width:100px;
    }
 .white1 {
	background-color: #CCFFCC;
	width: 100px;
}
      
</style>
</head>
<body topmargin='0' leftmargin='0' rightmargin='0' bottomnargin='0'>
	<div id="tt" class="easyui-tabs" style="height: 600px;" border="0px;">
		<div title="基本信息" id="addWin">
			<div id="tab-tools" style="background-color: #E0ECFF;" class="Noprint">
				<!-- <a href="#" class="easyui-linkbutton" plain="true"
					iconCls="icon-gw-folder_add" onclick="selectDepJSP('org')">设置承办部门</a> <a
					href="#" class="easyui-linkbutton" plain="true" iconCls="icon-gw-book_add"
					onclick="selectDepJSP('loginOrg')">设置登记部门</a> --> 
					<a
					class="easyui-linkbutton" plain="true" iconCls="icon-gw-EditInformationHS"
					onclick="setFileNum('fileNum')">生成文件字号</a> <a
					href="javascript:void(0)" class="easyui-linkbutton" plain="true"
					iconCls="icon-gw-modify" onclick="forMainSendJSP('mainSend','mainSend.jsp')">设置主送</a> <a
					class="easyui-linkbutton" plain="true" iconCls="icon-edit"
					onclick="mainSendJSP('duplicateSend','copySend.jsp')">设置抄送</a> 
					<a href="javascript:void(0)" class="easyui-linkbutton" plain="true"
					iconCls="icon-gw-modify"
					onclick="shouquanfanwei()">发放范围授权</a>
	<!-- 				<a href="javascript:void(0)" class="easyui-linkbutton" plain="true"
					iconCls="icon-gw-modify"
					onclick="forMainSendJSP2('readRange','selectSendAim.jsp?type=0',0)">发送到公司</a>
					<a href="javascript:void(0)" class="easyui-linkbutton" plain="true"
					iconCls="icon-gw-modify"
					onclick="forMainSendJSP2('readRange','selectSendAim.jsp?type=1',1)">发送到部门</a>
					<a href="javascript:void(0)" class="easyui-linkbutton" plain="true"
					iconCls="icon-gw-modify"
					onclick="forMainSendJSP2('readRange','selectSendAimPosition.jsp?type=2',2)">发送到岗位组</a>
					<a href="javascript:void(0)" class="easyui-linkbutton" plain="true"
					iconCls="icon-gw-modify"
					onclick="forMainSendJSP2('readRange','selectSendAim.jsp?type=3',3)">发送到岗位</a>  --><a
					class="easyui-linkbutton" iconcls="icon-save"
					onclick="addUpdate('草稿')" plain="true" id="update"
					style="float: right;">保存</a> <a style="float: right;"
					class="easyui-linkbutton" iconcls="icon-save"
					onclick="addUpdate('待审核')" plain="true" id="verifyOk">保存</a> <a
					style="float: right;" class="easyui-linkbutton" iconcls="icon-save"
					plain="true" onclick="addUpdate('待排版校对')" id="sendDocFinish">保存</a>

			</div>

			<div data-options="region:'center',title:'center title'">
				<form class="easyui-form" id="addForm" method="post">
					<table bordercolor='#ECE9D8'>
						<tr style="height: 20px">
							<td class="bigbig" align="right" style="width:85px"><font color="red"></font>形成年度&nbsp;</td>
							<td class="white"><input id="year" name="year"
								class="myinput" style="height: 20px; border: 0px;"
								type="text" /></td>
							<td class="black" align="right"  style="width:85px"><font color="red" ></font>承办部门&nbsp;</td>
							<!-- onclick="selectDepJSP('org')" -->
							<td class="white" style="background-color: #CCFFCC"><span
								id="org" name="org" class="myinput"
								style="background-color: #CCFFCC; height: 20px; border: 0px; "
								 type="text"></span><input
								type="hidden" id="org_hidden"></td>
							<td class="black" align="right"  style="width:85px"><font color="red"></font>文件日期&nbsp;</td>
							<td class="whitebig"><input id="fileDate" name="fileDate"
								type="text" class="easyui-datebox" required="required" /></td>
						</tr>
						<tr style="height: 20px;">
							<td class="black" align="right"><font color=red></font>责任者&nbsp;</td>
							<td class="white" colspan='5'><span id="fresponsior"
								value="中铁建设" class="myinput" />中铁建设&nbsp;</span></td>
							</td>
						</tr>
						<tr style="height: 28px;">
							<td class="black" align="right"><font color="red"></font>保密期限&nbsp;</td>
							<td class="white"><input id="secretPeriod"
								name="secretPeriod" type="text" class="myinput" /></td>
							<td class="black" align="right">文件字号&nbsp;</td>
							<td class="white" colspan='3'><input id="fileNum" style="width:100%"
								onclick="setFileNum('fileNum')" name="fileNum" type="text"
								class="myinput" value="" /></td>
						</tr>
						<tr style="height: 20px;">
							<td class="black" align="right"><font color="red"></font>题名&nbsp;</td>
							<td class="white" colspan='5'><input id="fileName"  style="width:100%"
								name="fileName" type="text" class="myinput"
								 /></td>
						</tr>
						<tr style="height: 20px;">
							<td class="black" class="black" align="right"><font
								color="red"></font>份数&nbsp;</td>
							<td class="white"><input id="fenshu" name="fenshu"
								 class="easyui-numberbox myinput" min=1
								type="text" /></td>
							<td class="black" class="black" align="right"><font
								color="red"></font>张数&nbsp;</td>
							<td class="white"><input id="zhangshu" name="zhangshu"
								class="easyui-numberbox myinput" min=1  /></td>
							<td class="black" class="black" align="right"><font
								color="red"></font>附件题名&nbsp;</td>
							<td class="white"><input id="attachmentName"
								name="attachmentName" class="myinput" style="width:600px;" /></td>
						</tr>
						<tr style="height: 20px">
							<td class="black" class="black" align="right"><font
								color="red"></font>附件数&nbsp;</td>
							<td class="white"><input id="attachmentNums"
								name="attachmentNums" class="easyui-numberbox myinput"
							 min=1 style="" /></td>
							<td class="black" class="black" align="right"><font
								color="red"></font>密级&nbsp;</td>
							<td class="white"><input class="myinput" id="secretItems"
								name="secretItems"  type="text"></td>
							<td class="black" class="black" align="right"><font
								color="red"></font>登记日期&nbsp;</td>
							<td class="white"><input id="loginDate" name="loginDate"
								type="text" class="easyui-datebox" required="required"></input></td>
						</tr>
						<tr style="height: 20px;">
							<td class="black" class="black" align="right"><font
								color="red"></font>退文日期&nbsp;</td>
							<td class="white"><input id="backDate" name="backDate"
								type="text" class="easyui-datebox" ></td>
							<td class="black" align="right">发文分类&nbsp;</td>
							<td class="white"><span id="sendType" name="sendType"
								class="myinput" >公文</span></td>
							<td class="black" align="right"><font color="red"></font>承办人&nbsp;</td>
							<td class="white"><input id="loginPerson" name="loginPerson"
								class="myinput" style="width:100%" type="text" /> <input type="hidden"
								id="loginPerson_hidden"></td>
						</tr>
						<tr style="height: 20px;">
							<!-- onclick="selectDepJSP('loginOrg')" -->
							<td class="bigbig" align="right"><font color="red"></font>文件登记部门&nbsp;</td>
							<td class="white" style="background-color: #CCFFCC"><span
								id="loginOrg" name="loginOrg" class="myinput"
								style="background-color: #CCFFCC;"
								 ></span> <input type="hidden"
								id="loginOrg_hidden"></td>
							<td class="black" align="right"><font color="red"></font>受控号&nbsp;</td>
							<td class="white"><input id="controllNum" name="controllNum"
								class="myinput" /></td>
							<td class="black" align="right"><font color="red"></font>电子文件名&nbsp;</td>
							<td class="white"><input id="emailName" name="emailName"
								class="myinput" style="width:100%" /></td>
						</tr>
						<tr style="height: 20px;">
							<td class="bigbig" align="right"><font color="red"></font>处理情况说明&nbsp;</td>
							<td class="white" colspan=5><input id="FDealSituationExp"  style="width:100%"
								name="FDealSituationExp" class="myinput" /></td>
						</tr>
						<tr style="height: 20px;">
							<td class="black" align="right"><font color="red"></font>主送&nbsp;</td>
							<td class="white" colspan='5'><input id="mainSend"  style="width:100%"
								name="mainSend" class="myinput" /> <input
								type="hidden" id="mainSend_hidden"><input type="hidden"
								id="mainSend_hidden_type"><input type="hidden"
								id="mainSend_hidden_sortnumber"></td>
						</tr>
						<tr style="height: 20px;">
							<td class="black" align="right"><font color="red"></font>抄送&nbsp;</td>
							<td class="white" colspan=5><input id="duplicateSend"  style="width:100%"
								name="duplicateSend" class="myinput" /> <input
								type="hidden" id="duplicateSend_hidden"> <input
								type="hidden" id="duplicateSend_hidden_type"><input
								type="hidden" id="duplicateSend_hidden_sortnumber"></td>
						</tr>
						<tr style="height: 20px;">
							<td class="black" align="right"><font color="red"></font>拟稿人&nbsp;</td>
							<td class="white"><input id="drafter" name="drafter"
								class="myinput" /> <input type="hidden"
								id="drafter_hidden"></td>
							<td class="black" align="right"><font color="red"></font>核稿人&nbsp;</td>
							<td class="white"><input id="hegaoPerson" name="hegaoPerson"
								 class="myinput" /> <input type="hidden"
								id="hegaoPerson_hidden"></td>
							<td class="black" align="right"><font color="red"></font>审核人&nbsp;</td>
							<td class="white"><input id="verifyPerson"
								 name="verifyPerson" class="myinput" style="width:100%"/> <input
								type="hidden" id="verifyPerson_hidden"></td>
						</tr>
						<tr style="height: 20px;">
							<td class="black" align="right"><font color="red"></font>会签人&nbsp;</td>
							<td class="white" colspan=3><input id="countersign"  style="width:100%"
								name="countersign" class="myinput" /> <input
								type="hidden" id="countersign_hidden"></td>
							<td class="black" align="right"><font color="red"></font>制度&nbsp;</td>
							<td class="white"><input id="fzhidu" name="fzhidu"
								class="myinput"></input></td>
						</tr>
						<tr style="height: 20px;">
							<td class="black" align="right"><font color="red"></font>签发人&nbsp;</td>
							<td class="white" colspan=3><input id="issuer" name="issuer"  style="width:100%"
								class="myinput" /> <input type="hidden"
								id="issuer_hidden"></td>
							<td class="black" align="right"><font color="red"></font>缓急&nbsp;</td>
							<td class="white"><input id="isUrgency" name="isUrgency"
								class="myinput"></input></td>
						</tr>
						<tr style="height: 20px;">
							<td class="black" align="right"><font color="red"></font>馆件号&nbsp;</td>
							<td class="white"><input id="fPackageNum" name="fPackageNum"
								class="myinput"/> </td>
							<td class="black" align="right"><font color="red"></font>室件号&nbsp;</td>
							<td class="white"><input id="fRoomNum" name="fRoomNum"
								class="myinput"/></td>
							<td class="black" align="right"><font color="red"></font>卷内顺序号&nbsp;</td>
							<td class="white"><input id="fNum" name="fNum"
								class="myinput"  style="width:100%"/></td>
						</tr>
					<!-- 	<tr style="height: 20px;">
							<td class="black" align="right">发放范围授权&nbsp;</td>
							<td class="white1" colspan='5' style="background-color: #CCFFCC;">
							<span id="readRange"></span> <input
								type="hidden" id="readRange_hidden"><input type="hidden"
								id="readRange_hidden_type"><input type="hidden"
								id="readRange_hidden_sortnumber"><input type="hidden"
								id="readRange_hidden_sendtype"></td>
						</tr> -->
						<tr style="height: 55px;">
							<td class="black" align="right"><font color="red"></font>拟办意见&nbsp;</td>
								<td class="white" colspan=5  height="55px">
							<textarea id="fSuggestion"
								name="fSuggestion"   style="width:99%;height:100%">
							</textarea>
							</td>
						</tr>
						<tr style="height: 55px;">
							<td class="black" align="right"><font color="red"></font>处理情况&nbsp;</td>
									<td class="white" colspan=5  height="55px">
								<textarea id="fDealSituation" 
								name="fDealSituation"  style="width:99%;height:100%">
							</textarea>
								</td>
						</tr>
						<tr style="height: 20px;">
							<td class="black" align="right"><font color="red"></font>备注&nbsp;</td>
							<td class="white" colspan=5><input name="fRemark"  style="width:100%"
								id="fRemark" class="myinput"  /></td>
						</tr>
						
					</table>
				</form>
			</div>
			<div style="display: none" closed="true">
				<tr>
					<td align="right"><font color="red"></font><b>存档&nbsp;&nbsp;</b></td>
					<td class="white"><span id="file" name="file" class="myinput">是</span>
					<td align="right"><font color="red"></font><b>本人档案&nbsp;&nbsp;</b></td>
					<td class="white"><input id="selfFile" name="selfFile"
						class="myinput" />
				</tr>
			</div>
		</div>
		<div title="正文" id="mainDocumentBody" class="Noprint">
			<div id='model' title="模版" class="easyui-window" closed="true"
				style="margin: 0 auto;">
				<div class="easyui-layout" id="modelClass"
					style="width: 686px; height: 515px;">
					<div region="west" style="width: 270px; padding: 0px;"
						title="请选择模版类别">
						<ul id="mainModel" border="0px"></ul>
					</div>
					<div region="center" title="请选择模版" id="modeldetail">
						<table id="detailModel" border="0px"></table>
					</div>
				</div>
			</div>
			<div region="center" border="false">
				<table id="documentModel" border="0px"></table>
			</div>

		</div>
		<div title="附件" id="postingClassifiedBody" class="Noprint" >
			<div region="center" border="false">
				<table id="uploadAttachment" border='0px'></table>
			</div>
			<div id="uploadWindow" class="easyui-window" closed="true" 
				title="上传附件" style="padding-top: 16px;padding-left:22px;padding-bottom:60px;padding-right:18px;">
				<form id="uploadForm" class="easyui-form"
					action="UploadAttachmentAction" method="post"
					enctype="multipart/form-data">
					<table style="background-color:#F0F0F0" >
						<tr align="right" style="height:25px">
							<td style="width:74px">文件&nbsp;&nbsp;</td>
							<td  align="left" style="width:370px"><input type="file"  style="width:100%"
								name="upload"></input></td>
						</tr>
						<tr align="right" style="height:25px">
							<td>描述&nbsp;&nbsp;</td>
							<td align="left"><input id="description" style="width:290px"
								name="description" type="text"></input></td>
						</tr>
					</table>
					<div align="center" id="buttons" style="margin-top:20px" >
						<a class="easyui-linkbutton" iconcls="icon-search"
							onclick="submitUploadForm()">确定</a> <a class="easyui-linkbutton"
							iconcls="icon-cancel" onclick="closeUploadWin()"
							>取消</a>
					</div>
					<div class="datagrid-mask-msg" id="attachMessage"
						style="display: none; left: 180px; top: 60px;">正在处理，请稍待。。。</div>

					<input type="hidden" value=<%=request.getParameter("docId")%>
						id="documentId" name="documentId"></input> <input type="hidden"
						value=<%=request.getParameter("docStatus")%> id="docStatus"
						name="docStatus"></input>
				</form>
			</div>
		</div>
	</div>
	<div class="datagrid-mask-msg" id="mloadMessage"
						style="display: none; left: 180px; top: 60px;">正在处理，请稍待。。。</div>
</body>
</html>