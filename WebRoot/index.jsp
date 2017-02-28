<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8" />
<title>慧科集团--公文管理系统</title>
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/common.css" />
	<script type="text/javascript" src="<%=path %>/js/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
	<link rel="stylesheet" type="text/css" href="<%=path %>/js/jquery-easyui-1.2.6/themes/default/easyui.css" />
	<link rel="stylesheet" type="text/css" href="<%=path %>/js/jquery-easyui-1.2.6/themes/icon.css" />
	<script type="text/javascript" src="<%=path %>/js/jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="<%=path %>/js/jquery-easyui-1.2.6/locale/easyui-lang-zh_CN.js"></script>

</head>
<style>
#mid {
	position: absolute;
	top: 25%;
	left: 25%;
}

a {
	TEXT-DECORATION: none
}

.menu {
	margin-left: 50px;
}

.importanttext {
	color: #FFFFFF
}

.tree-folder-gwxt{
	display:inline-block;
	background:url('jeasyui/themes/default/images/tree_folder.gif') no-repeat;
	width:16px;
	height:18px;
	vertical-align:middle;
}
.tree-folder-open-gwxt{
	background:url('jeasyui/themes/default/images/tree_folder_open.gif') no-repeat;
}
.tree-file{
	display:inline-block;
	background:url('jeasyui/themes/default/images/left_tree/grouping.png') no-repeat;
	width:16px;
	height:18px;
	vertical-align:middle;
}

.tree-inputedit-gwxt{
	display:inline-block;
	background:url('jeasyui/themes/default/images/left_tree/Input_edit.png') no-repeat;
	width:16px;
	height:18px;
	vertical-align:middle;
}
.tree-inputsearch-gwxt{
	display:inline-block;
	background:url('jeasyui/themes/default/images/left_tree/Inquiry.png') no-repeat;
	width:16px;
	height:18px;
	vertical-align:middle;
}

.tree-loading-gwxt{
	background:url('jeasyui/themes/default/images/tree_loading.gif') no-repeat;
}



</style>
<script type="text/javascript">
	var myselfDeptID;
	var positionId;

	function openl(title, url) {

		if ($('#centerTab').tabs('exists', "欢迎您")) {
			$('#centerTab').tabs('close', "欢迎您");
		}
		if ($('#centerTab').tabs('exists', title)) {
			$('#centerTab').tabs('close', title);
		}
		var content = '<iframe scrolling="auto" frameborder="0" src="' + url
				+ '" style="width:100%;height:100%;"></iframe>';
		$('#centerTab').tabs('add', {
			title : title,
			content : content,
			closable : true
		});
	}

	$(function() {
		//请求用户名
		$.ajax({
			url : 'UserLogin_getUser.do',
			type : "POST",
			dataType : 'json',
			success : function(data) {
				$('#gongWenUserName').html(data.userName);
				$('#gongWenPosition').html(data.userPosition);
			}
		});
		//打开欢迎界面
		openl('欢迎您', 'welcome.jsp');
		//为部门赋值
		$('#getSelfDepts').combobox({
							url : 'UserLogin_getAllSelfDepts.do',
							valueField : 'id',
							textField : 'name',
							panelHeight : 100,
							mode : 'remote',
							onSelect : function(dept) {
								$.ajax({
											url : 'UserLogin_changeDept.do?myselfDeptID='
													+ dept.id,
											type : "POST"
										});
								window.location.href = "<%=basePath%>/index.jsp";
							}, 
							onLoadSuccess : function() {
								//为什么这里加载两次
								myselfDeptID=$("#getSelfDepts").combobox('getValue');
								//获取首页左侧树结构
								//判断下发/排版校对权限
								getPuTongTree();
								
								$(".combobox-item").attr("onmouseover","ComboboxHover()");
							},onShowPanel:function(){
								
								$(".combobox-item-selected1").addClass("combobox-item-selected");
								$(".combobox-item-selected1").removeClass("combobox-item-selected1");
							}
						});
	});
	
	function ComboboxHover()
	{
		$(".combobox-item-selected").addClass("combobox-item-selected1");
		$(".combobox-item-selected").removeClass("combobox-item-selected");
	}
	
	function getTreeUrl(method) {
		$('#docTree').tree('options').url = 'DocumentDealAction_' + method
				+ '.do?myselfDeptID=' + myselfDeptID;
	}
	function getReceiveTreeUrl(method) {
		$('#docTree').tree('options').url = 'ReceiveDocumentAction_' + method
				+ '.do?myselfDeptID=' + myselfDeptID;
	}
	//得到普通树
	function getPuTongTree() {
		$('#docTree').tree({
							url : 'indexdoctree.json',
							cascadeCheck : false,
							onExpand:function(node)
							{
								expandAddIcon(node);
							},
							onBeforeExpand : function(node) {
								
								expandRemoveIcon(node);
								
								if (node.isFile == "year") {
									getTreeUrl("getAllNowYears");
								} else if (node.isFile == "searchyear") {
									if(node.id==31){
										getReceiveTreeUrl("getAllSearchYears");
									}else{
										getTreeUrl("getAllSearchYears");
									}
								} else if (node.isFile == "dept") {
									getTreeUrl("getAllDepts");
								}else if (node.isFile == "paiban") {
									getPaibanUrl('DocumentDealAction_getPaiBanDepts.do?myselfDeptID='
											+ myselfDeptID);
								} else if (node.isFile == "xiafa") {
									getPaibanUrl('DocumentDealAction_getAllXiaFaDepts.do?myselfDeptID='
											+ myselfDeptID);
								} else if (node.isFile == "yifayear") {
									getPaibanUrl('DocumentDealAction_getAllYiFaYear.do');
								} else if (node.isFile == "yifadepts") {
									getPaibanUrl('DocumentDealAction_getAllYiFaDepts.do');
								}else if(node.isFile == "receivesearchyear"){
									$('#docTree').tree('options').url = 'ReceiveDocumentAction_getReceiveDocYears.do?myselfDeptID=' + myselfDeptID;
								}else if(node.isFile == "receivedept"){
									$('#docTree').tree('options').url = 'ReceiveDocumentAction_getReceiveDocDepts.do?myselfDeptID=' + myselfDeptID;
								}
							},
							onClick : function(node) {
								if (node.id == 1) {
									openl('待处理公文',
											'receiveDocument/read.jsp?docTypeView=1');
								}
								if (node.id == 12) {
									openl('待处理公文',
											'receiveDocument/read.jsp?docTypeView=12');
								}
								if (node.id == 13) {
									openl('待处理公文',
											'receiveDocument/read.jsp?docTypeView=13');
								}
								if (node.id == 21) {
									openSendDoc(node.id, "21");
								}
								if (node.id == 22) {
									openSendDocumentFile(node.id, "22");
								}
								if (node.id == "221") {
									openSendDocumentFile(node.id, "221");
								}
								if (node.id == "32"||node.id == "321"||node.id == "322") {
									openReceiveDocumentFile(node.id, node.text);
								}
								if (node.id == "222") {
									openSendDocumentFile(node.id, "222");
								}
								if (node.id == 31) {
									openReceiveDoc();
								}
								if (node.id ==6) {
									openl('收文', 'receiveDocument/receiveDocument.jsp?leaderdealed=leaderdealed');
								}
								if(node.id == 32||node.id == 321||node.id == 322){
									openl('收文', 'receiveDocument/receiveDocumentFile.jsp?myselfDeptID=' + myselfDeptID);
								}
								
								if ($("#docTree").tree('isLeaf', node.target)) {

									if(node.id =="receivedept"||node.id =="receiveyear"){
										openReceiveDocumentFile(node.id,node.text);
									}
									if (node.id == 5) {
										openl('系统管理', 'systemManager/powerManage.jsp');
									}
									if (node.id == 10) {
										openl('待处理公文',
												'receiveDocument/read.jsp?docTypeView=10');
									}
									if (node.id == 11) {
										openl('待处理公文',
												'receiveDocument/read.jsp?docTypeView=11');
									}
									//now是现行下的具体年份
									if (node.id == "now") {
										openSendDoc(node.id, node.text);
									}
									//可查询年份
									if (node.id == "search") {
										openSendDocumentFile(node.id, node.text);
									}
									if (node.id == "dept") {
										openSendDocumentFile(node.id, node.text);
									}
									//收文按照年度查询
									if (node.id == "receiveYear") {
										openReceiveDocParm(node.text);
									}
									if (node.id == "paiban") {
										readyOpen('待处理公文',
												'receiveDocument/read.jsp?nodeId='
														+ node.id
														+ '&nodeText='
														+ node.text);
									}
									if (node.id == "xiafa") {
										readyOpen('待处理公文',
												'receiveDocument/read.jsp?nodeId='
														+ node.id
														+ '&nodeText='
														+ node.text);
									}
									if (node.id == "yifayears") {
										readyOpen('已发文件库',
												'searchDocment/search.jsp?nodeId='
														+ node.id
														+ '&nodeText='
														+ node.text);
									}
									if (node.isFile == "myyifadepts") {
										readyOpen('已发文件库',
												'searchDocment/search.jsp?nodeId='
														+ node.isFile
														+ '&nodeText='
														+ node.id);
									}
								}
							},
							onLoadError:function()
							{
									$("[node-id='21']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
									$("[node-id='221']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
									$("[node-id='222']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
									$("[node-id='31']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
									$("[node-id='32']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
									$("[node-id='321']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
									$("[node-id='322']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
							},onLoadSuccess:function(node,data1){
								changeICON();
								 $.ajax({
									url : 'PendingDocAction_CheckFunctions.do',
									type : "POST",
									dataType : 'json',
									success : function(data) {
										if (data.flag == true) {
											//保留特殊
											hidePutongNode();
										} else {
											//保留一般
											hideTeShuNode();
										}
										expandAddIcon(node);
									}
								}); 
								//判断权限，隐藏系统管理树节点
								 $.ajax({
										url : 'UserLogin_isSysManager.do',
										type : "POST",
										dataType : 'json',
										success : function(data) {
											if (data.flag == false) {
												//去掉系统节点
												hideSysNode();
											} 
										}
									}); 
								//判断权限，隐藏领导已办节点
								 $.ajax({
										url : 'PendingDocAction_CheckLeaderFunction.do',
										type : "POST",
										dataType : 'json',
										success : function(data) {
											if (data.flag == false) {
												var node6 = $('#docTree').tree('find', 6);
												if(node6!=null)
													$('#docTree').tree("remove",node6.target);
											} else{
												//领导有权限
												var node2 = $('#docTree').tree('find',2);
												var node3 = $('#docTree').tree('find',3);
												if(node2!=null)
													$('#docTree').tree("remove",node2.target);
												if(node3!=null)
													$('#docTree').tree("remove",node3.target);
												
											}
												
										}
									}); 
							}
						});
	}
	function getPaibanUrl(url) {
		$('#docTree').tree('options').url = url;
	}
	function readyOpen(title, url) {
		url = encodeURI(encodeURI(url));
		openl(title, url);
	}
	
	function expandAddIcon(p_node)
	{
		if(p_node == null)
			return;
		
		if (p_node.isFile == "year") {
			$("[node-id='21']").children(".tree-icon").addClass("tree-inputedit-gwxt");
		} else if (p_node.isFile == "searchyear") {
			$("[node-id='221']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
			$("[node-id='31']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
		} else if (p_node.isFile == "dept") {
			$("[node-id='222']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
		}
			$("[node-id='32']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
			$("[node-id='321']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
			$("[node-id='322']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
	}
	
	function expandRemoveIcon(p_node)
	{
		if(p_node == null)
			return;
		
		if (p_node.isFile == "year") {
			$("[node-id='21']").children(".tree-icon").removeClass("tree-inputedit-gwxt");
		} else if (p_node.isFile == "searchyear") {
			$("[node-id='221']").children(".tree-icon").removeClass("tree-inputsearch-gwxt");
			$("[node-id='31']").children(".tree-icon").removeClass("tree-inputsearch-gwxt");
		} else if (p_node.isFile == "dept") {
			$("[node-id='222']").children(".tree-icon").removeClass("tree-inputsearch-gwxt");
		}
		$("[node-id='32']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
		$("[node-id='321']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
		$("[node-id='322']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
	}

	//下载帮助文档
	function downLoadHelper() {
		var fileName = "sendFileHelper.docx";
		var url = encodeURI('download.do?fileName=' + fileName);
		window.location = url;
	}
	//打开发文页面
	function openSendDoc(nodeId, nodeText) {
		var url = 'sendDocument/sendDocument.jsp?myselfDeptID=' + myselfDeptID
				+ "&nodeId=" + nodeId + "&nodeText=" + nodeText;
		url = encodeURI(encodeURI(url));
		openl('发文', url);
	}
	//打开发文可查询页面
	function openSendDocumentFile(nodeId, nodeText) {
		var url = 'sendDocument/sendDocumentFile.jsp?myselfDeptID=' + myselfDeptID
				+ "&nodeId=" + nodeId + "&nodeText=" + nodeText;
		url = encodeURI(encodeURI(url));
		openl('发文', url);
	}
	
	//打开发文可查询页面
	function openReceiveDocumentFile(nodeId, nodeText) {
		var url = 'receiveDocument/receiveDocumentFile.jsp?myselfDeptID=' + myselfDeptID
				+ "&nodeId=" + nodeId + "&nodeText=" + nodeText;
		url = encodeURI(encodeURI(url));
		openl('收文', url);
	}
	//打开收文页面
	function openReceiveDoc() {
		openl('收文', 'receiveDocument/receiveDocument.jsp?myselfDeptID='
				+ myselfDeptID);
	}
	//打开收文页面
	function openReceiveDocParm(year) {
		openl('收文', 'receiveDocument/receiveDocument.jsp?myselfDeptID='
				+ myselfDeptID+'&year='+year);
	}
	/* //显示收文岗位
	function showPosition() {
		//显示框
		position_Window();
		//加载数据
		getPositionData();
	}
	//画出窗口
	function position_Window() {
		$('#position_Window').window({
			modal : true,
			width : 445,
			height : 240,
			collapsible : false,
			closable : true,
			draggable : true,
			minimizable : false,
			maximizable : false
		});
		$('#position_Window').window('open');
	} */
	//获取数据
	function getPositionData() {
		$('#position_table').datagrid({
			url : 'UserLogin_getAllSelfPositions.do',
			rownumbers : true,
			singleSelect : true,
			sortName : 'id',
			idField : 'id',
			columns : [ [ {
				field : 'deptID',
				title : "部门ID",
				width : 150,
				hidden : true
			}, {
				field : 'deptName',
				title : "部门名称",
				width : 180
			}, {
				field : 'id',
				title : "岗位ID",
				width : 100,
				hidden : true
			}, {
				field : 'name',
				title : "岗位名称",
				width : 180
			} ] ],
			onDblClickRow : function openPage(rowIndex, rowData) {
				dbchange(rowIndex, rowData);
			}
		});
	}
	//双击切换
	function dbchange(rowIndex, rowData) {
		var positionId = rowData.id;
		$.ajax({
					url : 'UserLogin_changePosition.do?positionId=' + positionId,
					type : "POST",
					dataType : 'json',
					success : function(data) {
						if (data.flag == "ok") {
							window.location.href = "<%=basePath%>/index.jsp"
						}
					}
				});
	}
	
	//需要优化，给一个相同的type
	function changeICON()
	{
		
		$("[node-id='2']").children(".tree-icon").addClass("tree-inputedit-gwxt");
		$("[node-id='3']").children(".tree-icon").addClass("tree-inputedit-gwxt");
		$("[node-id='12']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
		$("[node-id='13']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
		$("[node-id='21']").children(".tree-icon").addClass("tree-inputedit-gwxt");
		$("[node-id='22']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
		$("[node-id='41']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
		$("[node-id='42']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
		$("[node-id='221']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
		$("[node-id='222']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
		$("[node-id='31']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
		$("[node-id='32']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
		$("[node-id='321']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
		$("[node-id='322']").children(".tree-icon").addClass("tree-inputsearch-gwxt");
		
	}
	function hidePutongNode(){
		var node10 = $('#docTree').tree('find', 10);
		var node11 = $('#docTree').tree('find', 11);
		if(node10!=null)
			$('#docTree').tree("remove",node10.target);
		if(node11!=null)
			$('#docTree').tree("remove",node11.target);
	}
	function hideTeShuNode(){
		var node12 = $('#docTree').tree('find', 12);
		var node13 = $('#docTree').tree('find', 13); 
		var node4 = $('#docTree').tree('find', 4);
		if(node12!=null)
			$('#docTree').tree("remove",node12.target);
		if(node13!=null)
			$('#docTree').tree("remove",node13.target);
		if(node4!=null)
			$('#docTree').tree("remove",node4.target);
	}
	function hideSysNode(){
		var node5 = $('#docTree').tree('find', 5);
		if(node5!=null)
			$('#docTree').tree("remove",node5.target);
	}
</script>
<body class="easyui-layout">
	<div region="north" border="false"
		style="background: #56a1d8; text-align: left; height: 66px; padding: 0px; background-image: url(images/header.jpg); background-repeat: no-repeat">
		<br/>
		<div class="importanttext">
			<p id="userName" align="right">
				您好：<span id="gongWenUserName"></span>&nbsp;|&nbsp;<span
					id="gongWenPosition">包宜洋</span>&nbsp;|&nbsp;欢迎进入公文系统&nbsp;&nbsp;
			</p>
			<p align="right">
				<!--  <input id='getSelfPositions' class='easyui-combobox' style='width: 115px; height: 15px;'></input>  -->
				<!-- <a href="#" onclick="showPosition()">切换岗位</a>&nbsp;&nbsp;&nbsp;&nbsp; -->
				<%-- <a
					href="<%=request.getContextPath()%>/weboffice/editoffice.jsp?fileType=word">下载控件</a>&nbsp;&nbsp;&nbsp;&nbsp; --%><a
					href="#" onclick="downLoadHelper();" style="color:red">发文帮助</a>&nbsp;&nbsp;&nbsp;&nbsp;<a
					margin-top="40px" href="logout.jsp">退出</a>&nbsp;&nbsp;&nbsp;&nbsp;
			</p>
		</div>
	</div>


	<div region="west" style="width: 220px; padding: 0px;"
		title="&nbsp;&nbsp;<input id='getSelfDepts' class='easyui-combobox'
			style='width: 115px; height: 15px;'></input>">
		<!-- <ul id="menu" class="ztree"></ul> -->
		<div style="margin-left: 10%">
			<ul id="docTree">
			</ul>
		</div>
	</div>

	<div region="center">
		<div id="centerTab" class="easyui-tabs" fit="true" border="false">
		</div>
	</div>
	<div region="south" align="center" style="height: 24px;">
		北京开课吧科技有限公司 客服电话：℡18810609610&nbsp;徐达&nbsp;&nbsp;&nbsp;℡18510123126&nbsp;包宜洋
	</div>


	<!-- <div id="position_Window" class="position" closed="true"
		title="选择岗位--请双击切换岗位">
		<table id="position_table" class="easyui-datagrid" border="false">
		</table>
	</div> -->
</body>
</html>