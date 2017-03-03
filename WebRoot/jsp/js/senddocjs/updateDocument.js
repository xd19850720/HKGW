var documentId;
var fDocumentStatus;
var fMainBodyId;
var titleForDoc;
var mainSendForDoc;
var fileNo;
var myfCopyDepartments;
var myfuploadName;
var docstatus;
// model 这是后来合并的页面
var dwgw = '[{"fModelName":"党委公文1-1","fModelPath":"templateFile/dwgw1-1.doc"},'
		+ '{"fModelName":"党委公文1-2","fModelPath":"templateFile/dwgw1-2.doc"},'
		+ '{"fModelName":"党委公文1-3","fModelPath":"templateFile/dwgw1-3.doc"},'
		+ '{"fModelName":"党委公文2-1","fModelPath":"templateFile/dwgw2-1.doc"},'
		+ '{"fModelName":"党委公文2-2","fModelPath":"templateFile/dwgw2-2.doc"},'
		+ '{"fModelName":"党委公文2-3","fModelPath":"templateFile/dwgw2-3.doc"},'
		+ '{"fModelName":"党委公文3-1","fModelPath":"templateFile/dwgw3-1.doc"},'
		+ '{"fModelName":"党委公文3-2","fModelPath":"templateFile/dwgw3-2.doc"},'
		+ '{"fModelName":"党委公文3-3","fModelPath":"templateFile/dwgw3-3.doc"}'
		+ ']';
var ghwj = '[{"fModelName":"工会文件1-1","fModelPath":"templateFile/ghwj1-1.doc"},'
		+ '{"fModelName":"工会文件1-2","fModelPath":"templateFile/ghwj1-2.doc"},'
		+ '{"fModelName":"工会文件1-3","fModelPath":"templateFile/ghwj1-3.doc"},'
		+ '{"fModelName":"工会文件2-1","fModelPath":"templateFile/ghwj2-1.doc"},'
		+ '{"fModelName":"工会文件2-2","fModelPath":"templateFile/ghwj2-2.doc"},'
		+ '{"fModelName":"工会文件2-3","fModelPath":"templateFile/ghwj2-3.doc"},'
		+ '{"fModelName":"工会文件3-1","fModelPath":"templateFile/ghwj3-1.doc"},'
		+ '{"fModelName":"工会文件3-2","fModelPath":"templateFile/ghwj3-2.doc"},'
		+ '{"fModelName":"工会文件3-3","fModelPath":"templateFile/ghwj3-3.doc"}'
		+ ']';
var gswj = '[{"fModelName":"公司文件1-1行抄送","fModelPath":"templateFile/gswj1-1.doc"},'
		+ '{"fModelName":"公司文件1-2行抄送","fModelPath":"templateFile/gswj1-2.doc"},'
		+ '{"fModelName":"公司文件1-3行抄送","fModelPath":"templateFile/gswj1-3.doc"},'
		+ '{"fModelName":"公司文件2-1行抄送","fModelPath":"templateFile/gswj2-1.doc"},'
		+ '{"fModelName":"公司文件2-2行抄送","fModelPath":"templateFile/gswj2-2.doc"},'
		+ '{"fModelName":"公司文件2-3行抄送","fModelPath":"templateFile/gswj2-3.doc"},'
		+ '{"fModelName":"公司文件3-1行抄送","fModelPath":"templateFile/gswj3-1.doc"},'
		+ '{"fModelName":"公司文件3-2行抄送","fModelPath":"templateFile/gswj3-2.doc"},'
		+ '{"fModelName":"公司文件3-3行抄送","fModelPath":"templateFile/gswj3-3.doc"}'
		+ ']';
var jwwj = '[{"fModelName":"纪委文件1-1","fModelPath":"templateFile/jwwj1-1.doc"},'
		+ '{"fModelName":"纪委文件1-2","fModelPath":"templateFile/jwwj1-2.doc"},'
		+ '{"fModelName":"纪委文件1-3","fModelPath":"templateFile/jwwj1-3.doc"},'
		+ '{"fModelName":"纪委文件2-1","fModelPath":"templateFile/jwwj2-1.doc"},'
		+ '{"fModelName":"纪委文件2-2","fModelPath":"templateFile/jwwj2-2.doc"},'
		+ '{"fModelName":"纪委文件2-3","fModelPath":"templateFile/jwwj2-3.doc"},'
		+ '{"fModelName":"纪委文件3-1","fModelPath":"templateFile/jwwj3-1.doc"},'
		+ '{"fModelName":"纪委文件3-2","fModelPath":"templateFile/jwwj3-2.doc"},'
		+ '{"fModelName":"纪委文件3-3","fModelPath":"templateFile/jwwj3-3.doc"}'
		+ ']';
var sxmbww = '[{"fModelName":"上行模板1-1","fModelPath":"templateFile/sxmb1-1.doc"},'
		+ '{"fModelName":"上行模板1-2","fModelPath":"templateFile/sxmb1-2.doc"},'
		+ '{"fModelName":"上行模板1-3","fModelPath":"templateFile/sxmb1-3.doc"},'
		+ '{"fModelName":"上行模板2-1","fModelPath":"templateFile/sxmb2-1.doc"},'
		+ '{"fModelName":"上行模板2-2","fModelPath":"templateFile/sxmb2-2.doc"},'
		+ '{"fModelName":"上行模板2-3","fModelPath":"templateFile/sxmb2-3.doc"},'
		+ '{"fModelName":"上行模板3-1","fModelPath":"templateFile/sxmb3-1.doc"},'
		+ '{"fModelName":"上行模板3-2","fModelPath":"templateFile/sxmb3-2.doc"},'
		+ '{"fModelName":"上行模板3-3","fModelPath":"templateFile/sxmb3-3.doc"}'
		+ ']';
var twwj = '[{"fModelName":"团委文件1-1","fModelPath":"templateFile/twwj1-1.doc"},'
		+ '{"fModelName":"团委文件1-2","fModelPath":"templateFile/twwj1-2.doc"},'
		+ '{"fModelName":"团委文件1-3","fModelPath":"templateFile/twwj1-3.doc"},'
		+ '{"fModelName":"团委文件2-1","fModelPath":"templateFile/twwj2-1.doc"},'
		+ '{"fModelName":"团委文件2-2","fModelPath":"templateFile/twwj2-2.doc"},'
		+ '{"fModelName":"团委文件2-3","fModelPath":"templateFile/twwj2-3.doc"},'
		+ '{"fModelName":"团委文件3-1","fModelPath":"templateFile/twwj3-1.doc"},'
		+ '{"fModelName":"团委文件3-2","fModelPath":"templateFile/twwj3-2.doc"},'
		+ '{"fModelName":"团委文件3-3","fModelPath":"templateFile/twwj3-3.doc"}'
		+ ']';

var hmb = '[{"fModelName":"函模板","fModelPath":"templateFile/hmb.doc"}]';
var hyjy = '[{"fModelName":"会议纪要","fModelPath":"templateFile/hyjy.doc"}]';
var jsx = '[{"fModelName":"介绍信","fModelPath":"templateFile/jsx.doc"}]';
var tzmb = '[{"fModelName":"通知模版","fModelPath":"templateFile/tzmb.doc"}]';

// 生成正文
function addMainBody() {

	$('#model').window({
		modal : true,
		width : 700,
		height : 550,
		collapsible : false,
		closable : true,
		//draggable : true,
		minimizable:false,
		draggable:false
	});

	$('#model').window('open');
	// 加载模板类型
	getModelTree();
}
// 得到模板类型
function getModelTree() {
	$('#mainModel').tree({
		url : 'model.json',
		onBeforeSelect : function(node) {
			var node = $('#mainModel').tree('getSelected');
			if (node) {
				$('#mainModel').tree('uncheck', node.target);
			}
		},
		onClick : function(node) {

			functioncode = node.text;
			getPower(functioncode);
		}
	});
}

// 获取拥有对应权限的所有岗位
function getPower(functioncode) {
	if (functioncode == undefined) {
		functioncode = "";
		return;
	}
	// var modelName = encodeURI(encodeURI(functioncode));
	var jsonstr = null;
	if (functioncode == '党委公文') {
		jsonstr = dwgw;
	} else if (functioncode == '工会文件') {
		jsonstr = ghwj;
	} else if (functioncode == '纪委文件') {
		jsonstr = jwwj;
	} else if (functioncode == '公司文件') {
		jsonstr = gswj;
	} else if (functioncode == '上行模板') {
		jsonstr = sxmbww;
	} else if (functioncode == '团委文件') {
		jsonstr = twwj;
	} else if (functioncode == '函模板') {
		jsonstr = hmb;
	} else if (functioncode == '会议纪要') {
		jsonstr = hyjy;
	} else if (functioncode == '介绍信') {
		jsonstr = jsx;
	} else if (functioncode == '通知模版') {
		jsonstr = tzmb;
	}
	var data = $.parseJSON(jsonstr);
	//
	// 加载模版
	$("#detailModel").datagrid({
		// url : 'DocumentDealAction_getModelByName.do?modelName=' + modelName,
		// url : 'modeldate.json',
		// url : data,
		// 禁止文字自动换行
		nowrap : true,
		// 间色
		striped : true,
		collapsible : true,
		sortName : 'ID',
		sortOrder : 'desc',
		idField : 'ID',
		// fitColumns: true,
		// pagination : true,
		singleSelect : true,
		height : 450,
		rownumbers : true,
		columns : [ [ {
			field : 'id',
			title : 'ID',
			width : 30,
			hidden : true
		}, {
			field : 'fCode',
			title : '编码',
			width : 300,
			hidden : true
		}, {
			field : 'fModelName',
			title : '模版名称',
			width : 165
		}, {
			field : 'fModelPath',
			title : '模版路径',
			width : 400,
			hidden : true
		}, {
			field : 'fDescribe',
			title : '描述',
			width : 165
		} ] ],
		toolbar : [ {
			id : 'newMainBody',
			text : '请双击模版新建正文'
		} ],
		// toolbar : [ {
		// id : 'newMainBody',
		// text : '新建正文',
		// iconCls : 'icon-add',
		// handler : getMainBody
		// } ],
		onDblClickRow : getMainBodyFormModel
	});
	$('#detailModel').datagrid('loadData', data);
}
// 加载正文
function getMainBodyFormModel() {

	var row = $("#detailModel").datagrid('getSelected');
	if (row) {
//		+ '&title=' + titleForDoc
//		+ '&mainSend=' + mainSendForDoc + '&myfCopyDepartments='
//		+ myfCopyDepartments + '&myfileNo=' + fileNo
//		+ '&myfuploadName=' + myfuploadName
		var params = '?documentId=' + documentId  + '&docType=1'
				+ '&newMainBody=1';
		var fModelPath = row.fModelPath;
		params = params + '&fModelPath=' + fModelPath;
		var url = '../weboffice/editoffice.jsp' + params;
		url = encodeURI(url);
		url = encodeURI(url);
		window.open(url, "_blank",
				"toolbar=yes, menubar=yes,   resizable=yes,location=yes,status=yes,height="
						+ document.body.clientHeight + ", width="
						+ document.body.clientWidth);

		$('#model').window('close');

	} else {
		alert("请选择模版!");
		return;
	}

}
// 刷新正文
function refreshMainBody(bodyId) {
	getMainBodyData(bodyId);
	window.opener.refresh();
}
$(function() {
	var titleFlag = true;
	var attachFlag = true;

	documentId = window.dialogArguments;
	$('#model').window('close');
	if (documentId == undefined || documentId == null) {
		documentId = $('#documentId').val();
		fDocumentStatus = $('#docStatus').val();
		fDocumentStatus = decodeURI(fDocumentStatus);
	}
	if (documentId.indexOf("-") > 0) {
		fDocumentStatus = documentId.split("-")[1];
		documentId = documentId.split("-")[0];
	}
	// 对保存按钮的选择
	if (fDocumentStatus == "待审核") {
		$('#update').hide();
		$('#sendDocFinish').hide();
	} else if (fDocumentStatus == "待排版校对") {
		$('#update').hide();
		$('#verifyOk').hide();
	} else if (fDocumentStatus == "待下发") {
		$('#update').hide();
		$('#verifyOk').hide();
		$('#sendDocFinish').hide();
	} else {
		$('#verifyOk').hide();
		$('#sendDocFinish').hide();
	}
	$('#secretItems').combobox({
		url : 'SecretLevel_queryAll.do',
		valueField : 'id',
		textField : 'name',
		panelHeight : 110,
		mode : 'remote'
	});
	$('#secretPeriod').combobox({
		url : 'SecretPeriod_quereyAll.do',
		valueField : 'id',
		textField : 'name',
		panelHeight : 110,
		mode : 'remote'
	});

	// 初始化本人档案字段
	$('#selfFile').combobox({
		url : 'selfFileData.json',
		valueField : 'id',
		panelHeight : 60,
		textField : 'text'
	});
	/*
	 * $('#sendType').combobox({ url : 'PostingClassified_quereyAll.do',
	 * valueField : 'id', textField : 'name', mode : 'remote' });
	 */

	$('#isUrgency').combobox({
		url : 'flazy.json',
		valueField : 'id',
		panelHeight : 60,
		textField : 'text'
	});
	$('#fzhidu').combobox({
		url : 'fzhidu.json',
		valueField : 'id',
		panelHeight : 60,
		textField : 'text'
	});
	$.ajax({
		url : "DocumentDealAction_queryDocumentById.do",
		type : "POST",
		data : {
			"id" : documentId
		},
		dataType : 'json',
		success : function(data) {

			fDocumentStatus = data[0].fDocumentStatus;
			// 形成年度
			$('#year').val(data[0].fyear);
			// 承办部门
			$('#org').html(data[0].fdepartment);
			$('#org_hidden').val(data[0].fdepartmentID);

			// 文件日期
			var getFormateFileDate = formatTimeStr(data[0].fFiledate);
			$('#fileDate').datebox('setValue', getFormateFileDate);
			// 责任者
			$('#fresponsior').html(data[0].fResponsior);
			// 保密期限
			// $('#secretPeriod').combobox('setValue', data[0].fSecrecyName);
			$('#secretPeriod').combobox('select', data[0].fSecrecy);
			// 文件字号
			$('#fileNum').val(data[0].fNo);
			// 题名
			$('#fileName').val(data[0].ftitle);
			// 主题词
			// $('#keyWord').val(data[0].fKeyWord);
			// 份数
			$('#fenshu').val(data[0].fcopies);
			// 张数
			$('#zhangshu').val(data[0].fsheets);
			// 附件题名
			$('#attachmentName').val(data[0].fuploadName);
			// 附件数
			$('#attachmentNums').val(data[0].fuploadNumer);
			// 秘密
			$('#secretItems').combobox('select', data[0].fSecrecyLevel);
			// 登记日期

			var getFormateCreateDate = formatTimeStr(data[0].fCreateDate);
			$('#loginDate').datebox('setValue', getFormateCreateDate);
			// 退文日期
			var getFormateBackDate = formatTimeStr(data[0].fbackDate);
			$('#backDate').datebox('setValue', getFormateBackDate);
			// 发文分类
			$('#sendType').html('公文');
			// 存档
			$('#file').html('是');
			// 本人档案
			$('#selfFile').combobox('select', data[0].fselfFile);
			// 承办人
			$('#loginPerson').val(data[0].fcarrier);
			$('#loginPerson_hidden').val(data[0].fcarrierID);
			// 文件登记部门
			$('#loginOrg').html(data[0].fRegisterDept);
			$('#loginOrg_hidden').val(data[0].fRegisterDeptId);
			// 受控号
			$('#controllNum').val(data[0].fConNum);
			// 处理情况说明
			$('#dealDesc').val(data[0].fDealSituationExp);
			// 主送
			$('#mainSend').val(data[0].fMainSupplyDep);
			$('#mainSend_hidden').val(data[0].mainSupplyDep_FDeptID);
			// 可传阅范围
//			$('#readRange').text(data[0].readRangeName);
//			$('#readRange_hidden').val(data[0].readRangeId);
//			$('#readRange_hidden_type').val(data[0].readRangeType);
//			$('#readRange_hidden_sendtype').val(data[0].sendtype);
			// 抄送
			$('#duplicateSend').val(data[0].fCopyDepartments);
			$('#duplicateSend_hidden').val(data[0].copyDepartments_FDeptID);
			// 拟稿人
			$('#drafter').val(data[0].fDraftPeople);
			$('#drafter_hidden').val(data[0].fDraftPeopleID);
			// 核稿人
			$('#hegaoPerson').val(data[0].fNuclearDraft);
			// 审核人
			$('#verifyPerson').val(data[0].faudit);
			// 签发人
			$('#issuer').val(data[0].fIssuer);
			// 会签人
			$('#countersign').val(data[0].fcountersign);
			// 缓急
			$('#isUrgency').combobox('select', data[0].fLazy);
			// 制度
			$('#fzhidu').combobox('select', data[0].fzhidu);
			// 增加
			// 电子文件名
			$('#emailName').val(data[0].fEmailName);
			// 馆件号
			$('#fPackageNum').val(data[0].fPackageNum);
			// 室件号
			$('#fRoomNum').val(data[0].fRoomNum);
			// 卷内顺序号
			$('#fNum').val(data[0].fNum);
			// 拟办意见
			$('#fSuggestion').val(data[0].fSuggestion);
			// 处理情况
			$('#fDealSituation').val(data[0].fDealSituation);

			// 处理情况说明
			$('#FDealSituationExp').val(data[0].fDealSituationExp);
			// 备注
			$('#fRemark').val(data[0].fRemark);
			fMainBodyId = data[0].fMainBodyId;
			titleForDoc = data[0].ftitle;
			fileNo = data[0].fNo;
			myfuploadName = data[0].fuploadName;
			myfCopyDepartments = data[0].fCopyDepartments;
			mainSendForDoc = data[0].fMainSupplyDep;
			$('#tt').tabs({
				onSelect : function(title) {
					if (titleFlag && title == "正文") {
						titleFlag = false;
						InitMainBody();
					}
					if (attachFlag && title == "附件") {
						attachFlag = false;
						getUploadData();
					}
				}
			});

		}
	});

	$('#tt').tabs('select', '基本信息');
	// 初始化模板类型

});
function formatTimeStr(val) {
	if (val) {
		return val.substring(0, 10);
	}
}
$('#secretItems').combobox({
	url : 'SecretLevel_queryAll.do',
	valueField : 'code',
	textField : 'name',
	mode : 'remote'
});

// });
function cancel() {
	window.close();
}
// 编辑正文
function getMainBody() {

	var row = $("#documentModel").datagrid('getSelected');
	if (row) {
		var fModelPath = row.fModelPath;
		var url = '../weboffice/editoffice.jsp?fModelPath=' + fModelPath
				+ '&documentId=' + documentId + '&title=' + titleForDoc
				+ '&mainSend=' + mainSendForDoc + '&myfCopyDepartments='
				+ myfCopyDepartments + '&myfileNo=' + fileNo
				+ '&myfuploadName=' + myfuploadName + '&docType=1'
				+ "&newMainBody=1";
		url = encodeURI(url);
		url = encodeURI(url);
		// url = encodeURI(url);
		var iTop = (window.screen.availHeight - window.screen.height) / 2; // 获得窗口的垂直位置;
		var iLeft = (window.screen.availWidth - window.screen.width) / 2; // 获得窗口的水平位置;
		var winWith = window.screen.width + "px";
		var winHeight = window.screen.height + "px";

		var value = window
				.showModalDialog(
						url,
						'',
						'dialogHeight='
								+ winHeight
								+ ';dialogWidth='
								+ winWith
								+ ';dialogTop='
								+ iTop
								+ ';dialogLeft='
								+ iLeft
								+ ';resizeable=yes;status=no;dialogTop:no;scroll:no;minimize:yes;maximize:yes;');

		var fMainBodyId = value;
		if (value) {
			getMainBodyData(fMainBodyId);
		}

	} else {
		alert("请选择模版!");
		return;
	}

}
// 加载正文
function getMainBodyData(fMainBodyId) {

	var hrefStr = "";

	if (fDocumentStatus == "草稿" || fDocumentStatus == "待排版校对") {
		hrefStr = "<a href='#' id='docMainBodyView' onclick='viewDoc()'>编辑</a>"
				+ "&nbsp;&nbsp;"
				+ "<a href='#' id='viewPDFID' style='display:none' onclick='viewPDF()'>查看PDF</a>"
				+ "&nbsp;&nbsp;<a href='#' id='docMainBodyDel' onclick='deleteMainBodyIdInDocument()'>删除</a>";
		// $('#docMainBodyView').hide();
		// $('#viewPDFID').hide();

	} else if (fDocumentStatus == "待下发" || fDocumentStatus == "发文完成") {
		hrefStr = "<a href='#' id='docMainBodyView' onclick='viewDoc()'>查看</a>&nbsp;&nbsp;<a href='#' id='viewPDFID' onclick='viewPDF()'>查看PDF</a>&nbsp;&nbsp;<a href='#' style='display:none' id='docMainBodyDel' onclick='deleteMainBodyIdInDocument()'>删除</a>";
	} else {
	}

	$("#documentModel").datagrid({
		url : 'DocumentDealAction_queryMainBodyById.do?id=' + fMainBodyId,
		// url : 'modeldate.json',
		// 禁止文字自动换行
		nowrap : true,
		// 间色
		striped : true,
		collapsible : true,
		sortName : 'ID',
		sortOrder : 'desc',
		idField : 'ID',
		// fitColumns: true,
		singleSelect : true,
		height : document.body.clientHeight*0.92,
		rownumbers : true,
		columns : [ [ {
			field : 'fCode',
			title : '编码',
			width : 300,
			hidden : true
		}, {
			field : 'fFileName',
			title : '文件名称',
			width : 160,
			hidden : true
		}, {
			field : 'fFilePath',
			title : '文件路径',
			width : 400,
			hidden : true
		}, {
			field : 'fFileNameView',
			title : '文件名称',
			width : document.body.clientWidth*0.6
		}, {
			field : 'id',
			title : '操作',
			width : document.body.clientWidth*0.36 ,
			align:'center',
			// 添加超级链
			formatter : function(value, rowData, rowIndex) {

				// function里面的三个参数代表当前字段值，当前行数据对象，行号（行号从0开始）
				// alert(rowData.username);
				/*
				 * return "<a href='#' id='docMainBodyView'
				 * onclick='viewDoc()'>查看</a>" +
				 * "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + "<a href='#'
				 * id='viewPDFID' onclick='viewPDF()'>查看PDF</a>";
				 */
				return hrefStr;
			}
		} ] ],
		toolbar : [ 
		{
			id : 'submit',
			text : '提交',
			iconCls : 'icon-ok',
			handler : readyToVerify
		}, {
			id : 'lock',
			text : '锁定',
			iconCls : 'icon-gw-lock',
			handler : lockMainBody
		}, {
			id : 'unlock',
			text : '解锁',
			iconCls : 'icon-search',
			handler : unlockMainBody
		}, {
			id : 'addMainBody',
			text : '生成正文',
			iconCls : 'icon-gw-Loan',
			handler : addMainBody
		}, {
			id : 'sendDocNow',
			text : '下发文件',
			iconCls : 'icon-edit',
			handler : sendDocNow
		}, {
			id : 'chexiao',
			text : '撤销',
			iconCls : 'icon-undo',
			handler : dropDoc
		} ],
		onDblClickRow : function() {
			if (fDocumentStatus != '待下发' && fDocumentStatus != '发文完成') {
				viewDoc();
			}
		},
		onLoadSuccess:function(){
			controlViewButton();
		}
	});
}

// 控制正文的按钮
function controlViewButton() {

	$('#lock').hide();
	$('#chexiao').hide();
	$("#submit").hide();
	$('#unlock').hide();
	$('#sendDocNow').hide();
	$('#addMainBody').hide();
	
	$.ajax({
		url : "DocumentDealAction_queryDocumentById.do",
		type : "POST",
		data : {
			"id" : documentId
		},
		dataType : 'json',
		success : function(data) {
			fDocumentStatus = data[0].fDocumentStatus;

			if (fDocumentStatus == "草稿") {
				$('#addMainBody').show();
				$("#submit").show();
			}
			else if (fDocumentStatus == "待排版校对")
			{
				$('#addMainBody').show();
				$.ajax({
					url : 'PendingDocAction_CheckFunction.do',
					type : "POST",
					data : {
						functioncode : "1-2"
					},
					dataType : 'json',
					success : function(data) {
						if (data.flag == true) {
							$('#lock').show();
						}
					}
				});
			}
			else if (fDocumentStatus == "待下发") {
				
				
				$.ajax({
					url : 'PendingDocAction_CheckFunction.do',
					type : "POST",
					data : {
						functioncode : "1-13"
					},
					dataType : 'json',
					success : function(data) {
						if (data.flag == true) {
							$('#sendDocNow').show();
							$('#unlock').show();
						}
					}
				});
				
			} else  {
				$.ajax({
					url : 'PendingDocAction_CheckFunction.do',
					type : "POST",
					data : {
						functioncode : "1-13"
					},
					dataType : 'json',
					success : function(data) {
						if (data.flag == true) {
							$('#chexiao').show();
						}
					}
				});
			} 
		}
	});
}

// 查看PDF
function viewPDF() {
	var rows = $("#documentModel").datagrid('getRows');
	var row = rows[0];
	if (row) {
		var fname = row.fFileName + ".pdf";
		window.open('viewPdf.do?fileName=' + fname,'newwindow');
	} else {
		alert("请选择查看的公文!");
		return;
	}
}
// 查看word
function viewDoc() {
	var rows = $("#documentModel").datagrid('getRows');
	var row = rows[0];
	if (row) {
		var fname = row.fFileName;
		var fpath = row.fFilePath;

		var fModelPath = fpath + fname + ".doc";

		var url = '../weboffice/editoffice.jsp?fModelPath=' + fModelPath
				+ '&documentId=' + documentId + '&docType=1';
		window.open(url, "_blank",
				"toolbar=yes, menubar=yes,   resizable=yes,location=yes,status=yes,height="
						+ document.body.clientHeight + ", width="
						+ document.body.clientWidth);
	} else {
		alert("请选择查看的公文!");
		return;
	}
}
// 删除正文
function deleteMainBodyIdInDocument() {
	// alert(fMainBodyId);
	$.messager.confirm('删除', '确认删除吗？', function(r) {
		if (r) {
			var rows = $("#documentModel").datagrid('getRows');
			var row = rows[0];
			$.ajax({
				type : "POST",
				url : "DocumentDealAction_deleteMainBodyIdInDocument.do",
				data : {
					"doc.fMainBodyId" : row.id,
					"doc.id" : documentId
				},
				dataType : "json",
				success : function(data) {
					// getAllModel();
					getMainBodyData(null);
					$.messager.alert('提示', "正文删除成功");
				},
				failure : function(data) {
					alert(data.flag);
				}
			});
		}
	});
}
// 加载模版
function getAllModel() {
	$("#documentModel").datagrid({
		url : 'DocumentDealAction_getAllModel.do',
		// url : 'modeldate.json',
		// 禁止文字自动换行
		nowrap : true,
		// 间色
		striped : true,
		collapsible : true,
		sortName : 'ID',
		sortOrder : 'desc',
		idField : 'ID',
		// fitColumns: true,
		// pagination : true,
		singleSelect : true,
		height : document.body.clientHeight - 50,
		rownumbers : true,
		columns : [ [ {
			field : 'id',
			title : 'ID',
			width : 30,
			hidden : true
		}, {
			field : 'fCode',
			title : '编码',
			width : 300,
			hidden : true
		}, {
			field : 'fModelName',
			title : '模版名称',
			width : 300
		}, {
			field : 'fModelPath',
			title : '模版路径',
			width : 400,
			hidden : true
		}, {
			field : 'fDescribe',
			title : '描述',
			width : 400
		} ] ],
		toolbar : [ {
			id : 'newMainBody',
			text : '请双击模版新建正文'
		} ],
		// toolbar : [ {
		// id : 'newMainBody',
		// text : '新建正文',
		// iconCls : 'icon-add',
		// handler : getMainBody
		// } ],
		onDblClickRow : getMainBody
	});
}

// 确定、更新、完成
// 改成了状态不变，是在jsp的状态中修改的
function addUpdate(mystatus) {

	if (mystatus != "草稿" && fDocumentStatus != "草稿" && fDocumentStatus != "待审核"
			&& fDocumentStatus != "待排版校对") {
		$.messager.alert('提示', '只有草稿状态和待排版校对状态可以修改');
		return;
	}
	if (fDocumentStatus == "待审核" && mystatus == "草稿") {
		mystatus = "待审核";
	}
	if (fDocumentStatus == "待排版校对") {
		mystatus = "待排版校对";
	}
	var fileNum = $('#fileNum').val() ? $('#fileNum').val() : '';
	
	addupdateLast(mystatus, fileNum);
	
}

function addupdateLast(mystatus, fileNum) {

	// var fileDate2 = $('#fileDate').datebox("getValue");
	// 形成年度
	var year = $('#year').val() ? $('#year').val() : '';
	// 承办部门
	var selfFile = $('#selfFile').combobox('getText') ? $('#selfFile')
			.combobox('getText') : '';
	// var selfFile = $('#selfFile').val() ? $('#selfFile').val() : '';
	// 承办部门
	var org = $('#org').html() ? $('#org').html() : '';
	var orgID = $('#org_hidden').val() ? $('#org_hidden').val() : '';
	// 文件日期
	var fileDate = $('#fileDate').datebox("getValue") ? $('#fileDate').datebox(
			"getValue") : '';
	// 责任者
	var fresponsior = $('#fresponsior').html() ? $('#fresponsior').html() : '';
	// 保密期限
	var secretPeriod = $('#secretPeriod').combobox('getValue') ? $(
			'#secretPeriod').combobox('getValue') : '';
	// 题名
	var fileName = $('#fileName').val() ? $('#fileName').val() : '';
	// 主题词
	// var keyWord = $('#keyWord').val() ? $('#keyWord').val() : '';
	// 份数
	var fenshu = $('#fenshu').val() ? $('#fenshu').val() : '';
	// 张数
	var zhangshu = $('#zhangshu').val() ? $('#zhangshu').val() : '';
	// 附件题名
	var attachmentName = $('#attachmentName').val() ? $('#attachmentName')
			.val() : '';
	// 附件数
	var attachmentNums = $('#attachmentNums').val() ? $('#attachmentNums')
			.val() : '';
	// 秘密
	var secretItems = $('#secretItems').combobox('getValue') ? $('#secretItems')
			.combobox('getValue')
			: '';
	// 登记日期
	var loginDate = $('#loginDate').datebox("getValue") ? $('#loginDate')
			.datebox("getValue") : '';
	// 退文日期
	var backDate = $('#backDate').datebox("getValue") ? $('#backDate').datebox(
			"getValue") : '';
	// 发文分类
	/*
	 * var sendType = $('#sendType').combobox('getValue') ? $('#sendType')
	 * .combobox('getValue') : '';
	 */// 承办人
	var loginPerson = $('#loginPerson').val() ? $('#loginPerson').val() : '';
	var loginPersonID = $('#loginPerson_hidden').val() ? $(
			'#loginPerson_hidden').val() : '';
	// 文件登记部门
	var loginOrg = $('#loginOrg').html() ? $('#loginOrg').html() : '';
	var loginOrgID = $('#loginOrg_hidden').val() ? $('#loginOrg_hidden').val()
			: '';
	// 受控号
	var controllNum = $('#controllNum').val() ? $('#controllNum').val() : '';
	// 主送
	var mainSend = $('#mainSend').val() ? $('#mainSend').val() : '';
	var mainSendID = $('#mainSend_hidden').val() ? $('#mainSend_hidden').val()
			: '';
	var mainSendSortNumber = $('#mainSend_hidden_sortnumber').val() ? $(
			'#mainSend_hidden_sortnumber').val() : '';
	var mainSendType = $('#mainSend_hidden_type').val() ? $(
			'#mainSend_hidden_type').val() : '';
	//2014-2-26 xuda 修改
	//可传阅范围	要求可传阅范围不可手写
//	var readRange = $('#readRange').text()? $('#readRange').text():'';
//	var readRangeID = $('#readRange_hidden').val() ? $('#readRange_hidden').val(): '';
//	var readRangeSortNumber = $('#readRange_hidden_sortnumber').val() ? $('#readRange_hidden_sortnumber').val() : '';
//	var readRangeType = $('#readRange_hidden_type').val() ? $('#readRange_hidden_type').val() : '';
//	var readsendtype = $('#readRange_hidden_sendtype').val() ? $('#readRange_hidden_sendtype').val() : '';
	// 抄送
	var duplicateSend = $('#duplicateSend').val() ? $('#duplicateSend').val()
			: '';
	var duplicateSendID = $('#duplicateSend_hidden').val() ? $(
			'#duplicateSend_hidden').val() : '';
	var duplicateSendType = $('#duplicateSend_hidden_type').val() ? $(
			'#duplicateSend_hidden_type').val() : '';
	var duplicateSendSortNumber = $('#duplicateSend_hidden_sortnumber').val() ? $(
			'#duplicateSend_hidden_sortnumber').val()
			: '';
	// 拟稿人
	var drafter = $('#drafter').val() ? $('#drafter').val() : '';
	var drafterID = $('#drafter_hidden').val() ? $('#drafter_hidden').val()
			: '';
	// 核稿人
	var hegaoPerson = $('#hegaoPerson').val() ? $('#hegaoPerson').val() : '';
	// 审核人
	var verifyPerson = $('#verifyPerson').val() ? $('#verifyPerson').val() : '';
	// 签发人
	var issuer = $('#issuer').val() ? $('#issuer').val() : '';
	// 会签人
	var countersign = $('#countersign').val() ? $('#countersign').val() : '';
	// 缓急
	var isUrgency = $('#isUrgency').combobox('getText') ? $('#isUrgency')
			.combobox('getText') : '';
	// 制度
	var fzhidu = $('#fzhidu').combobox('getText') ? $('#fzhidu').combobox(
			'getText') : '';

	// 增加
	// 电子文件名
	var FEmailName = $('#emailName').val() ? $('#emailName').val() : '';
	// 馆件号
	var fPackageNum = $('#fPackageNum').val() ? $('#fPackageNum').val() : '';
	// 室件号
	var fRoomNum = $('#fRoomNum').val() ? $('#fRoomNum').val() : '';
	// 卷内顺序号
	var fNum = $('#fNum').val() ? $('#fNum').val() : '';
	// 拟办意见
	var fSuggestion = $('#fSuggestion').val() ? $('#fSuggestion').val() : '';
	// 拟办意见
	var fRemark = $('#fRemark').val() ? $('#fRemark').val() : '';
	// 处理情况
	var fDealSituation = $('#fDealSituation').val() ? $('#fDealSituation')
			.val() : '';

	// 处理情况说明
	var FDealSituationExp = $('#FDealSituationExp').val() ? $(
			'#FDealSituationExp').val() : '';
			
	//校验年度
	var reg = /^\d{4}$/;
	if(!reg.test(year)){
		alert("年度格式不正确");
		return false;
	}		
			
	if (mystatus == '待排版校对' || mystatus == '发文完成') {

		// 校验数据
		if (!year) {
			$.messager.alert("提示", "形成年度不能为空");
			return false;
		}
		if (!fileDate) {
			$.messager.alert("提示", "文件日期不能为空");
			return false;
		}
		if (!fresponsior) {
			$.messager.alert("提示", "责任者不能为空");
			return false;
		}
		if (!fileName) {
			$.messager.alert("提示", "题名不能为空");
			return false;
		}
		if (!zhangshu) {
			$.messager.alert("提示", "张数不能为空");
			return false;
		}
		if (!fenshu) {
			$.messager.alert("提示", "份数不能为空");
			return false;
		}
		if (!mainSend) {
			$.messager.alert("提示", "主送不能为空");
			return false;
		}
		if (fileNum == "排版校对") {
			if (!fileNum) {
				$.messager.alert("提示", "文件字号不能为空");
				return false;
			}
		}

		if (!attachmentName || !attachmentNums) {
			var OKNO = confirm('您确认没有附件吗?');
			if (OKNO) {

			} else {
				return;
			}
		}
	}

	if (loginDate) {
		if (!dateFormate(loginDate)) {
			return false;
		}
	}
	if (fileDate) {
		if (!dateFormate(fileDate)) {
			return false;
		}
	}
	if (backDate) {
		if (!dateFormate(backDate)) {
			return false;
		}
	}
	// 由于公文和的档案具有不可更改行，所以在此没有更新
	$.ajax({
		url : 'DocumentDealAction_update.do',
		type : "POST",
		data : {
			// 编码
			"doc.id" : documentId,
			"doc.fCode" : "",
			// 形成年度
			"doc.fyear" : year,
			// 承办部门
			"doc.fdepartment" : org,
			// 承办部门ID
			"doc.fdepartmentID" : orgID,
			// 文件日期
			"doc.fFiledate" : fileDate,
			// 保密期限

			"doc.fSecrecy" : secretPeriod,
			// 文件字号
			"doc.fNo" : fileNum,
			// 主题词
			// "doc.fKeyWord" : keyWord,
			// 题名
			"doc.ftitle" : fileName,
			// 份数
			"doc.fcopies" : fenshu,
			// 张数
			"doc.fsheets" : zhangshu,
			// 附件ID
			// "doc.fUploadFile" :"" ,
			// 附件题名
			"doc.fuploadName" : attachmentName,
			// 附件数
			"doc.fuploadNumer" : attachmentNums,
			// 密级
			"doc.fSecrecyLevel" : secretItems,
			// 登记日期
			"doc.fCreateDate" : loginDate,
			// 退文日期
			"doc.fbackDate" : backDate,
			// 发文类型
			// "doc.ftype" : sendType,
			// * 承办人
			"doc.fcarrier" : loginPerson,
			// * 承办人ID
			"doc.fcarrierID" : loginPersonID,
			// * 文件登记部门
			"doc.fRegisterDept" : loginOrg,
			// * 文件登记部门ID
			"doc.fRegisterDeptId" : loginOrgID,
			// * 拟稿人
			"doc.fDraftPeople" : drafter,
			// * 拟稿人ID
			"doc.fDraftPeopleID" : drafterID,
			// * 核稿人
			"doc.fNuclearDraft" : hegaoPerson,
			// * 核稿人ID
			"doc.fNuclearDraftID" : "",
			// * 审核人
			"doc.faudit" : verifyPerson,
			// * 审核人ID
			"doc.fauditID" : "",
			// * 会签人
			"doc.fcountersign" : countersign,
			// * 签发人
			"doc.fIssuer" : issuer,
			// * 签发人ID
			"doc.fIssuerID" : "",
			// * 缓急
			"doc.fLazy" : isUrgency,
			// * 制度
			"doc.fzhidu" : fzhidu,
			// * 倌件号
			"doc.fPackageNum" : fPackageNum,
			// * 室件号
			"doc.fRoomNum" : fRoomNum,
			// * 卷内顺序号
			"doc.fNum" : fNum,
			// * 拟办意见
			"doc.fSuggestion" : fSuggestion,
			// * 处理情况
			"doc.fDealSituation" : fDealSituation,
			// * 备注
			"doc.fRemark" : fRemark,
			// * 正文ID
			// "doc.fMainBodyId" : "",
			// * 模版ID
			"doc.fModelId" : "",
			// * 公文状态
			"doc.fDocumentStatus" : mystatus,

			// * 主送部门
			"doc.fMainSupplyDep" : mainSend,
			// * 主送部门id
			"doc.fMainSupplyDepId" : mainSendID,
			// * 主送部门type
//			"doc.fMainSupplyDepType" : readRangeType,
			// * 抄送部门
			"doc.fCopyDepartments" : duplicateSend,
			// * 抄送部门
			"doc.fCopyDepartmentsId" : duplicateSendID,
			// * 抄送部门
			"doc.fCopyDepartmentsType" : duplicateSendType,
			// * 责任者
			"doc.fResponsior" : fresponsior,
			// * 文件登记部门ID
			// "doc.fRegisterDeptId" : "",
			// * 电子文件名
			"doc.fEmailName" : FEmailName,
			// * 文件档案
			"doc.fselfFile" : selfFile,
			// * 受控号
			"doc.fConNum" : controllNum,
			// * 处理情况说明
			"doc.fDealSituationExp" : FDealSituationExp,
			// 主送
//			"doc.mainSupplyDep_FDeptID" : readRangeID,
//			"doc.mainSupplyDep_FDeptCode" : readRangeSortNumber,
//			"doc.mainSupplyDep_FDeptName" : readRange,
			// 抄送
		/*	"doc.copyDepartments_FDeptID" : duplicateSendID,
			"doc.copyDepartments_FDeptCode" : duplicateSendSortNumber,
			"doc.copyDepartments_FDeptName" : duplicateSend,*/
			// 会签
			"doc.countersigns_FCountersignsID" : "",
			"doc.countersigns_FCountersignsCode" : "",
			"doc.countersigns_FCountersignsName" : countersign
//			"doc.sendtype" : readsendtype,

		},
		dataType : "json",
		success : function(data) {
			// if (mystatus == "草稿") {
			// window.returnValue = data;
			// opener.refresh();
			// } else {
			// opener.refresh();
			// window.close();
			// $.messager.alert('提示', "保存成功");
			// }
			if (data) {
				$.messager.alert('提示', "保存成功");
				opener.refresh();
			}
			// if (fDocumentStatus != '待排版校对') {
			// window.close();
			// }
		},
		failure : function() {

		}
	});
	/*
	 * } }); }
	 */

}

// 下面是附件的方法

function uploadFileJSP() {
	$('#uploadWindow').window({
		modal : true,
		width : 500,
		height : 170,
		collapsible : false,
		closable : true,
		draggable : true,
		minimizable : false,
		maximizable : true
	});
	$('#uploadWindow').window('open');
	$('#buttons').show();
}
function downloadAttachment(generatedName) {
	// alert('generatedName=' + generatedName);
	// 选中的某行
	// var row = $('#uploadAttachment').datagrid('getSelected');
	//
	// if (row) {
	var fileName = generatedName;
	// alert("fileName=" + fileName);
	var url = encodeURI('download.do?fileName=' + fileName);
	window.location = url;
	// } else {
	// $.messager.alert("提示", "请选择一条数据");
	// }
}
function deleteAttachment(attachId) {
	// 选中的某行
	// var row = $('#uploadAttachment').datagrid('getSelected');
	// if (row) {
	$.messager.confirm('删除', '确认删除吗？', function(r) {
		if (r) {
			$.ajax({
				url : 'attachmentAction_delete.do',
				type : "POST",
				data : {
					id : attachId
				},
				dataType : 'json',
				success : function(data) {
					$.messager.alert("提示", data.flag);
					$('#uploadAttachment').datagrid('reload');
				}
			});
		}
	});
	// } else {
	// $.messager.alert("提示", "请选择一条数据");
	// }
}
//上传
function submitUploadForm() {

	$('#buttons').hide();
	$('#attachMessage').show();

	$('#uploadForm').form('submit', {
		url : 'UploadAttachmentAction.do?documentId=' + documentId,
		dataType : "json",
		// 注意ajax的url的后台action方法必须有返回值return "json"，而不是return
		// null,否则下面的回调函数不起作用，sucess方法失效
		success : function(data) {

			closeUploadWin();
			$('#buttons').show();
			$('#attachMessage').hide();
			$("#uploadAttachment").datagrid('reload');
		}
	});
}
function closeUploadWin() {
	$('#uploadWindow').window('close');
}
// 获取正文页面的数据
function InitMainBody() {
	if (fMainBodyId && fMainBodyId.length > 0) {
		getMainBodyData(fMainBodyId);
	} else {
		getMainBodyData(null);
	}
}
// 获取附件页面的数据
function getUploadData() {
	$("#uploadAttachment")
			.datagrid(
					{
						url : 'attachmentAction_queryAll.do?documentId='
								+ documentId,
						
						// pagination : true,
						nowrap : false,
						striped : true,
						singleSelect : true,
						nowrap : false,
						striped : true,
						sortName : 'ID',
						sortOrder : 'desc',
						idField : 'ID',
						rownumbers : true,
						collapsible : true,
						columns : [ [
								{
									field : 'attachName',
									title : '文件名称',
									width : document.body.clientWidth*0.4,
									align : 'left',
									// 添加超级链
									formatter : function(value, rowData,
											rowIndex) {
										var generatedName = rowData.generatedName
										.toString();
								var ext = getExtension(generatedName);
								var attachURl = "";
								if(ext=='.jpg'){
									attachURl = "<a href='#' onclick='javascript:checkonlineJPG(\""+generatedName+"\");return false;' style='color: blue;font-size:12px; cursor: hand; text-decoration: none'  >"
											+ value + "</a>";
								}else if(checkView(ext))
								{
									 attachURl = "<a href='#'   onclick=\"viewAttachPDF('"
											+ generatedName
											+ "');\">"
											+ value + "</a>";
								}else{
									 attachURl = "<p>"
											+ value + "</p>";
								} 
								
								return attachURl;
									}
									
								},
								{
									field : 'description',
									title : '文件描述',
									width : document.body.clientWidth*0.2,
									align : 'left'
								},
								{
									field : 'getTime',
									title : '上传时间',
									width : document.body.clientWidth*0.1,
									align : 'center'
								},
								{
									field : 'generatedName',
									title : '保存名称',
									width : 100,
									align : 'center',
									hidden : true
								},
								{
									field : 'id',
									title : '操作',
									width : document.body.clientWidth*0.16,
									align : 'center',
									// 添加超级链
									formatter : function(value, rowData,
											rowIndex) {
										var generatedName = rowData.generatedName;
										
										var attachurl="<a href='#' id='downloadAttachment' onclick='downloadAttachment(\""
											+ generatedName
											+ "\")'>下载</a>";
										if(fDocumentStatus == "草稿" || fDocumentStatus == "待排版校对")
										{
											attachurl+= "&nbsp;&nbsp;&nbsp;"
											+ "<a href='#' id='deleteAttachment' onclick='deleteAttachment("
											+ rowData.id + ")'>删除</a>";
										}
										
										var ext = getExtension(generatedName);
										
										if(ext=='.jpg'){
											attachurl+= "&nbsp;&nbsp;&nbsp;<a href='#' onclick='javascript:checkonlineJPG(\""+generatedName+"\");return false;' style='color: blue;font-size:12px; cursor: hand;'  >"
													 + "PDF查看</a>";
										}else if(checkView(ext))
										{
											 attachurl += "&nbsp;&nbsp;&nbsp;<a href='#' style='color: blue;font-size:12px; cursor: hand;'  onclick=\"viewAttachPDF('"
													+ generatedName
													+ "');\">"
													+"PDF查看</a>";
										}
										return attachurl;
										/*if(fDocumentStatus == "草稿" || fDocumentStatus == "待排版校对")
											{
										return "<a href='#' id='downloadAttachment' onclick='downloadAttachment(\""
												+ generatedName
												+ "\")'>下载</a>"
												+ "&nbsp;&nbsp;&nbsp;"
												+ "<a href='#' id='deleteAttachment' onclick='deleteAttachment("
												+ rowData.id + ")'>删除</a>";
											}
										else
											{
											return "<a href='#' id='downloadAttachment' onclick='downloadAttachment(\""
											+ generatedName
											+ "\")'>下载</a>";
											}*/
									}
								}
						] ],
						toolbar : [ {
							text : '上传',
							iconCls : 'icon-gw-backup',
							handler : uploadFileJSP
						}
						]
					});
	var p = $('#uploadAttachment').datagrid('getPager');
	if (p) {
		$(p).pagination({
			beforePageText : "第",
			afterPageText : "共{pages}页",
			displayMsg : "共{total}条记录"
		});
	}
}

function viewAttachPDF(filepath) {
	$("#mloadMessage").show();
	var url = "onlineCheck.do";
	 $.ajax({
		url : url,
		type : "POST",
		data : {
			"fileName" : filepath
		},
		dataType : 'json',
		success : function(data) {
			if(data.success=="success"){
				$("#mloadMessage").hide();
				window.open('viewPdf.do'+'?fileName=' + data.filename);
			}else{
				$("#mloadMessage").hide();
				alert("查看失败，请联系管理员");
			}
		}
	}); 
}


//可传阅范围
/*function forMainSendJSP2(inputID,mainSend) {
	var iTop = (window.screen.availHeight - 600) / 2; // 获得窗口的垂直位置;
	var iLeft = (window.screen.availWidth - 500) / 2; // 获得窗口的水平位置;
	var value = window.showModalDialog(mainSend, inputID,
			'dialogHeight=650px;' + 'dialogWidth=500px;' + 'dialogTop=' + iTop
					+ ';dialogLeft=' + iLeft + ';resizeable=yes;status=no');
	if (value != null) {
		data = value.split(';');
		var resultId = data[0];
		var resultText = data[1];
		var resultType = data[2];
		document.getElementById(inputID + '_hidden').value = resultId;
		$('#'+inputID).text(resultText);
		document.getElementById(inputID + '_hidden' + '_type').value = resultType;
	}
}*/
//可传阅范围
function forMainSendJSP2(inputID,mainSend,type) {
	var iTop = (window.screen.availHeight - 600) / 2; // 获得窗口的垂直位置;
	var iLeft = (window.screen.availWidth - 500) / 2; // 获得窗口的水平位置;
	var value = window.showModalDialog(mainSend, inputID,
			'dialogHeight=650px;' + 'dialogWidth=500px;' + 'dialogTop=' + iTop
					+ ';dialogLeft=' + iLeft + ';resizeable=yes;status=no');
	if (value != null) {
		data = value.split(';');
		var resultId = data[0];
		var resultText = data[1];
		var resultType = data[2];
		var myId=document.getElementById(inputID + '_hidden').value;
		var inputText=$('#'+inputID).text();
		var inputType=document.getElementById(inputID + '_hidden' + '_type').value
		
		if(myId.substring(0,1)=="，"){
			myId=myId.substring(1);
			inputText=inputText.substring(1);
			inputType=inputType.substring(1);
		}
		
		document.getElementById(inputID + '_hidden').value = myId + resultId;
		$('#'+inputID).text(inputText+resultText);
		document.getElementById(inputID + '_hidden' + '_type').value = inputType + resultType;
		var sendtype=0;
		if(type!=-1){
			sendtype=1;
		}
		document.getElementById(inputID + '_hidden' + '_sendtype').value = sendtype;
	}
}
// 主送信息
function forMainSendJSP(inputID,mainSend) {
	var resultId = "";
	var resultText = "";
	var resultType = "";
	// var resultSortNum = "";
	var iTop = (window.screen.availHeight - 600) / 2; // 获得窗口的垂直位置;
	var iLeft = (window.screen.availWidth - 500) / 2; // 获得窗口的水平位置;
	var value = window.showModalDialog(mainSend, inputID,
			'dialogHeight=650px;' + 'dialogWidth=500px;' + 'dialogTop=' + iTop
					+ ';dialogLeft=' + iLeft + ';resizeable=yes;status=no');
	if (value != null) {
		if ("datagride" == value.state) {
			resultId = value.id;
			resultText = value.name;
			resultType = 0;
			// resultSortNum = value.sortnumber;
		} else {
			for ( var i = 0; i < value.length; i++) {
				var tmp_type = "";
				if ("isFile" == value[i].isFile) {
					tmp_type = "2";
				} else if ("is_top_File" == value[i].isFile) {
					tmp_type = "3";
				} else {
					tmp_type = "1";
				}
				if (i < value.length - 1) {
					resultId += value[i].id + "，";
					resultText += value[i].text + "、";
					// resultSortNum += value[i].sortnumber + "，";
					resultType += tmp_type + ",";
				} else {
					resultId += value[i].id;
					resultText += value[i].text;
					// resultSortNum += value[i].sortnumber;
					resultType += tmp_type;
				}
			}
		}
		
		if(inputID=='readRange'){
			$('#'+inputID).text(resultText);
		}else{
			document.getElementById(inputID).value = resultText;
		}
		document.getElementById(inputID + '_hidden').value = resultId;
		document.getElementById(inputID).value = resultText;
		document.getElementById(inputID + '_hidden' + '_type').value = resultType;
		// document.getElementById(inputID + '_hidden' + '_sortnumber').value =
		// resultSortNum;
	}

}
//为抄送字段赋值
function mainSendJSP(inputID, jsp) {
	var resultId = "";
	var resultText = "";
	var resultType = "";
	// var resultSortNum = "";
	var iTop = (window.screen.availHeight - 600) / 2; // 获得窗口的垂直位置;
	var iLeft = (window.screen.availWidth - 500) / 2; // 获得窗口的水平位置;
	var value1 = window.showModalDialog(jsp, inputID, 'dialogHeight=650px;'
			+ 'dialogWidth=500px;' + 'dialogTop=' + iTop + ';dialogLeft='
			+ iLeft + ';resizeable=yes;status=no');
	if (value1 != null) {

		var value = value1[0];
		var viewData = value1[1];

		if (value) {
			if (viewData.length > 0)
				viewData = viewData + "、";
			if ("datagride" == value.state) {
				resultId = value.id;
				resultText = viewData + value.name;
				resultType = 0;
				// resultSortNum = value.sortnumber;
			} else {
				resultText = "、" + viewData;
				for ( var i = 0; i < value.length; i++) {
					var tmp_type = "";
					if ("isFile" == value[i].isFile) {
						tmp_type = "2";
					} else if ("is_top_File" == value[i].isFile) {
						tmp_type = "3";
					} else {
						tmp_type = "1";
					}

					resultId += "，" + value[i].id;
					// resultSortNum += "，" + value[i].sortnumber;
					resultText += value[i].text + "、";
					resultType += "," + tmp_type;
				}
				if (resultId.length > 0)
					resultId = resultId.substring(1);
				if (resultText.length > 0) {
					resultText = resultText.substring(1);
					resultText = resultText.substring(0, resultText.length - 1);
				}
				// if (resultSortNum.length > 0)
				// resultSortNum = resultSortNum.substring(1);
				if (resultType.length > 0)
					resultType = resultType.substring(1);
			}
			document.getElementById(inputID + '_hidden').value = resultId;
			document.getElementById(inputID).value = resultText + "、存档";
			document.getElementById(inputID + '_hidden' + '_type').value = resultType;
			// document.getElementById(inputID + '_hidden' +
			// '_sortnumber').value = resultSortNum;
		} else {
			if (viewData.length > 0) {
				document.getElementById(inputID).value = viewData + "、" + "存档";
			} else {
				document.getElementById(inputID).value = "存档";
			}
		}
	}

}
// 锁定前验证文件字号重复
function lockMainBody() {

	// 查看是否存在正文
//	var rows = $("#documentModel").datagrid('getRows');
//	var row = rows[0];

	$("#mloadMessage").show();
	var fileNum = $('#fileNum').val() ? $('#fileNum').val() : '';
	// 验证文件字号
	$.ajax({
		url : 'DocumentDealAction_FileNumSole.do',
		type : "POST",
		data : {
			fileNum : fileNum,
			id : documentId
		},
		dataType : 'json',
		success : function(data) {
			if (data.flag != "该文件字号重复，请修改") {
				lockMainBody2();
			} else {
				$("#mloadMessage").hide();
				alert(data.flag);
			}
		}
	});
}
// 锁定
function lockMainBody2() {

	$.ajax({
		url : 'DocumentDealAction_readyToVerify.do',
		type : "POST",
		data : {
			id : documentId,
			status : "待下发",
			version:1
		},
		dataType : 'json',
		success : function(data) {
			// $.messager.alert('提示','锁定成功');
			// 刷新父页面
			opener.refresh();
			
			fDocumentStatus = "待下发";
			getUploadData();
			lockfinal();
		}
	});
	

}
function lockfinal(){
	// 生成pdf
	$.ajax({
		url : 'DocumentDealAction_lockedup.do',
		type : "POST",
		data : {
			id : documentId
		},
		dataType : 'json',
		success : function(data) {
			$("#mloadMessage").hide();
			$('#docMainBodyDel').hide();
			$('#docMainBodyView').html("查看");
			$('#viewPDFID').show();
			
			$('#addMainBody').hide();
			$('#lock').hide();
			
			$('#unlock').show();
			$('#sendDocNow').show();
			
			$.messager.alert("提示", data.flag);
		}
	});
}
// 解锁
function unlockMainBody() {


	$('#docMainBodyDel').show();
	$('#docMainBodyView').html("编辑");
	$('#viewPDFID').hide();
	
	$('#addMainBody').show();
	$('#lock').show();
	
	$('#unlock').hide();
	$('#sendDocNow').hide();
	// 刷新父页面
	opener.refresh();

	$.ajax({
		url : 'DocumentDealAction_readyToVerify.do',
		type : "POST",
		data : {
			id : documentId,
			status : "待排版校对",
			version:2
		},
		dataType : 'json',
		success : function(data) {
			$.messager.alert('提示', '解锁成功');
			fDocumentStatus = "待排版校对";
			getUploadData();
		}
	});
}
// 提交状态
function submitStatus() {
	var status = '';
	if (fDocumentStatus == '待审核') {
		status = '待排版校对';
	}
	$.ajax({
		url : 'DocumentDealAction_readyToVerify.do',
		type : "POST",
		data : {
			id : documentId,
			status : status,
			version:0
		},
		dataType : 'json',
		success : function(data) {
			$.messager.alert('提示', '审核完成');
			window.reload();
		}
	});
}

// 生成文件字号
function setFileNum(inputID) {
	var iTop = (window.screen.availHeight - 255) / 2; // 获得窗口的垂直位置;
	var iLeft = (window.screen.availWidth - 350) / 2; // 获得窗口的水平位置;
	var value = window.showModalDialog('createFileNum.jsp', '',
			'dialogHeight=210px;' + 'dialogWidth=350px;' + 'dialogTop=' + iTop
					+ ';dialogLeft=' + iLeft + ';resizeable=yes;status=no');
	if (value != "非正常关闭") {
		document.getElementById(inputID).value = value;
	}
}
// 提交
function readyToVerify() {

	$.ajax({
		url : "DocumentDealAction_queryDocumentById.do",
		type : "POST",
		data : {
			"id" : documentId
		},
		dataType : 'json',
		success : function(data) {
//			var readRange= data[0].readRangeName ;
			// 份数
			var fenshu = data[0].fcopies;
			// 张数
			var zhangshu = data[0].fsheets;
			// 附件题名
			var attachmentName = data[0].fuploadName;
			// 附件数
			var attachmentNums = data[0].fuploadNumer;
			// 文件日期
			var fileDate = data[0].fFiledate;
			var year = data[0].fyear;
			var fresponsior = data[0].fResponsior;
			var mainSend = data[0].fMainSupplyDep;
			var fileName = data[0].ftitle;
			if (!year) {
				$.messager.alert("提示", "形成年度不能为空");
				return false;
			}
			if (!fileDate) {
				$.messager.alert("提示", "文件日期不能为空");
				return false;
			}
			if (!fresponsior) {
				$.messager.alert("提示", "责任者不能为空");
				return false;
			}
			if (!fileName) {
				$.messager.alert("提示", "题名不能为空");
				return false;
			}
			if (!zhangshu) {
				$.messager.alert("提示", "张数不能为空");
				return false;
			}
			if (!fenshu) {
				$.messager.alert("提示", "份数不能为空");
				return false;
			}
			if (!mainSend) {
				$.messager.alert("提示", "主送不能为空");
				return false;
			}
//			if (!readRange) {
//				$.messager.alert("提示", "可传阅范围不能为空");
//				return false;
//			}
			var readRange= data[0].readRangeName ;
			if(!readRange){
				$.messager.alert("提示", "发放范围授权不能为空");
				return false;
			}
			if (!attachmentName || !attachmentNums) {
				var OKNO = confirm('您确认没有附件吗?');
				if (OKNO) {

				} else {
					return;
				}
			}
			$.ajax({
				url : 'DocumentDealAction_readyToVerify.do',
				type : "POST",
				data : {
					id : documentId,
					status : '待排版校对',
					version:0
				},
				dataType : 'json',
				success : function(data) {
					$.messager.alert("提示", data.flag);
					window.close();
					window.opener.refresh();
				}
			});
		}
	});
}

function dropDoc() {


	$('#chexiao').hide();
	
	$('#unlock').show();
	$('#sendDocNow').show();
	
	$.ajax({
		url : 'DocumentDealAction_readyToVerify.do',
		type : "POST",
		data : {
			id : documentId,
			status : '待下发',
			version:4
		},
		dataType : 'json',
		success : function(data) {
			$.messager.alert("提示", data.flag);
			// $("#sendDocumentList").datagrid('reload');
		}
	});
}

// 发文完成
function sendDocNow() {

	$('#unlock').hide();
	$('#sendDocNow').hide();
	
	$('#chexiao').show();
	
	$.ajax({
		url : 'DocumentDealAction_readyToVerify.do',
		type : "POST",
		data : {
			id : documentId,
			status : "发文完成",
			version:3
		},
		dataType : 'json',
		success : function(data) {
			// 刷新父页面
			opener.refresh();
			$.messager.alert('提示', '发文成功');
		}
	});
}
// 验证日期格式
function dateFormate(date) {
	var a = /^(\d{4})-(\d{2})-(\d{2})$/;
	if (!a.test(date)) {
		alert("日期格式不正确!");
		return false;
	}
	return true;
}

//获得后缀名
function getExtension(fileName){
        var extension=/\.[^\.]+$/.exec(fileName);;
        return extension;
}

function checkView(ext)
{
	var extensions=['.doc','.docx','.pdf','.jpg','.xls','.xlsx'];
	for(var i=0;i<extensions.length;i++)
	{
		if(ext.toString().toLowerCase()== extensions[i])
			return true;
	}
	
	return false;
}

function checkonlineJPG(filename){
	window.open('../weboffice/saveFile/'+filename);
}

//打开发放范围授权页面
function shouquanfanwei(){
	//window.open('shouquanfanwei.jsp?docId='+documentId);
	window.open('shouquanfanwei.jsp?docId='+documentId, "_blank",
			"toolbar=yes, menubar=yes,   resizable=yes,location=yes,status=yes,height="
					+ window.screen.availHeight + ", width="
					+ window.screen.availWidth);
}