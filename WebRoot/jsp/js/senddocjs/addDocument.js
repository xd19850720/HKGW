$(function() {
	// 获取密级字段的全部可选信息
	$('#secretItems').combobox({
		url : '/HKGW/secretlevel/getAllSecretlevel.action',
		valueField : 'id',
		textField : 'name',
		panelHeight : 110,
		mode : 'remote'
	});
	// 获取保密期限的全部可选信息
	$('#secretPeriod').combobox({
		url : '/HKGW/secretperiod/getAllSecretperiod.action',
		valueField : 'id',
		textField : 'name',
		panelHeight : 110,
		mode : 'remote'
	});

	date = new Date();
	nowYear = date.getFullYear();
	nowYear = (nowYear < 1900 ? (1900 + nowYear) : nowYear);
	// 给形成年度赋值
	$('#year').val(nowYear);
	var monthTime = null;
	if (date.getMonth() < 9) {
		monthTime = '0' + (date.getMonth() + 1);
	} else {
		monthTime = date.getMonth() + 1;
	}

	var mydate = date.getDate();
	if (mydate < 10) {
		mydate = '0' + mydate;
	}
	nowDate = nowYear + "-" + monthTime + "-" + mydate;

	// 初始化值 --登记日期，退文日期，文件日期
	$("#loginDate").datebox("setValue", nowDate);
	// $("#backDate").datebox("setValue", nowDate);
	$("#fileDate").datebox("setValue", nowDate);
	// 从接口获取承办人和拟稿人信息
	$.ajax({
		type : "POST",
		url : "/HKGW/employee/getLoginUser.action",
		data : "",
		dataType : 'json',
		success : function(user) {
			// 承办人
			$('#loginPerson').val(user.employeename);
			$('#loginPerson_hidden').val(user.employeeid);
			// 拟稿人
			$('#drafter').val(user.employeename);
			$('#drafter_hidden').val(user.employeeid);
			
			
			$('#org').html(user.employeename);
			$('#org_hidden').val(user.deptID);
			$('#loginOrg').html(user.employeename);
			$('#loginOrg_hidden').val(user.deptID);
		/*	$('#org').html(user.deptname);
			$('#org_hidden').val(user.deptID);
			$('#loginOrg').html(user.deptname);
			$('#loginOrg_hidden').val(user.deptID);*/
		}
	});
	// 初始化紧急字段
	$('#isUrgency').combobox({
		url : 'flazy.json',
		valueField : 'id',
		panelHeight : 60,
		textField : 'text'
	});

});
// 取消按钮，关闭窗口
function cancel() {
	window.close();
}
// 设置承办部门
function selectDepJSP(inputID) {
	var resultText = "";
	var resultId = "";
	var iTop = (window.screen.availHeight - 400) / 2; // 获得窗口的垂直位置;
	var iLeft = (window.screen.availWidth - 450) / 2; // 获得窗口的水平位置;
	var value = window.showModalDialog('../sendDocument/selectDep.jsp', '',
			'dialogHeight=400px;' + 'dialogWidth=450px;' + 'dialogTop=' + iTop
					+ ';dialogLeft=' + iLeft + ';resizeable=yes;status=no');
	if (value) {
		resultId = value[0].id;
		resultText = value[0].text;
		document.getElementById(inputID + '_hidden').value = resultId;
		document.getElementById(inputID).value = resultText;
	}
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
// 增加信息
function add() {

	// var fileDate2 = $('#fileDate').datebox("getValue");
	// 形成年度
	var year = $('#year').val() ? $('#year').val() : '';
	// 承办部门
	var org = $('#org').html() ? $('#org').html() : '';
	var orgID = $('#org_hidden').val() ? $('#org_hidden').val() : '';
	// 文件日期
	var fileDate = $('#fileDate').datebox("getValue") ? $('#fileDate').datebox(
			"getValue") : '';
	// 责任者

	var fresponsior = $('#fresponsior').attr('value') ? $('#fresponsior').attr(
			'value') : '';
	// 保密期限
	var secretPeriod = $('#secretPeriod').combobox('getValue') ? $(
			'#secretPeriod').combobox('getValue') : '';
	// 文件字号
	var fileNum = $('#fileNum').val() ? $('#fileNum').val() : '';
	// 题名
	var fileName = $('#fileName').val() ? $('#fileName').val() : '';
	// 主题词
	var keyWord = $('#keyWord').val() ? $('#keyWord').val() : '';
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
	var sendType = "公文";
	// 存档
	var ffile = "是";

	// alert(sendType);
	// console.info(sendType);
	// 承办人
	var loginPerson = $('#loginPerson').val() ? $('#loginPerson').val() : '';
	var loginPersonID = $('#loginPerson_hidden').val() ? $(
			'#loginPerson_hidden').val() : '';
	// 文件登记部门
	var loginOrg = $('#loginOrg').html() ? $('#loginOrg').html() : '';
	var loginOrgID = $('#loginOrg_hidden').val() ? $('#loginOrg_hidden').val()
			: '';
	// 受控号
	var controllNum = $('#controllNum').val() ? $('#controllNum').val() : '';
	// 处理情况说明
	var dealDesc = $('#dealDesc').val() ? $('#dealDesc').val() : '';
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
//	var readRange = $('#readRange').text() ? $('#readRange').text() : '';
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
	var DraftPeopleID = $('#drafter_hidden').val() ? $('#drafter_hidden').val()
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
	// 本人档案
	var selfFile = $('#selfFile').combobox('getText') ? $('#selfFile')
			.combobox('getText') : '';
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
	if (!dateFormate(loginDate)) {
		return false;
	}
	if (!dateFormate(fileDate)) {
		return false;
	}
	if (backDate) {
		if (!dateFormate(backDate)) {
			return false;
		}
	}
	//校验年度
	var reg = /^\d{4}$/;
	if(!reg.test(year)){
		alert("年度格式不正确");
		return false;
	}
	
	$('#button').hide();
	$('#readme').show();
	alert(0);
	$.ajax({
		url : '/HKGW/sendDocs/add.action',
		type : "POST",
		data : {
			// 编码
			"fcode" : "",
			// 形成年度
			"fyear" : year,
			// 承办部门
			"fdepartment" : org,
			// 承办部门ID
			"fdepartmentid" : orgID,
			// 文件日期
			"ffiledate" : fileDate,
			// 保密期限
			"fsecrecy" : secretPeriod,
			// 文件字号
			"fno" : fileNum,
			// 主题词
			"fkeyword" : keyWord,
			// 题名
			"ftitle" : fileName,
			// 份数
			"fcopies" : fenshu,
			// 张数
			"fsheets" : zhangshu,
			// 附件ID
			// "fUploadFile" :"" ,
			// 附件题名
			"fuploadname" : attachmentName,
			// 附件数
			"fuploadnumer" : attachmentNums,
			// 密级
			"fsecrecylevel" : secretItems,
			// 登记日期
			"fcreatedate" : loginDate,
			// 退文日期
			"fbackdate" : backDate,
			// 发文类型
			"ftype" : sendType,
			// 存档
			"ffile" : ffile,
			// * 承办人
			"fcarrier" : loginPerson,
			// * 承办人ID
			"fcarrierID" : loginPersonID,
			// * 文件登记部门
			"fregisterdept" : loginOrg,
			// * 文件登记部门ID
			"fregisterdeptid" : loginOrgID,
			// * 拟稿人
			"fdraftpeople" : drafter,
			// * 拟稿人ID
			"fdraftpeopleid" : DraftPeopleID,
			// * 核稿人
			"fnucleardraft" : hegaoPerson,
			// * 核稿人ID
			"fnucleardraftid" : "",
			// * 审核人
			"faudit" : verifyPerson,
			// * 审核人ID
			"fauditid" : "",
			// * 会签人
			"fcountersign" : countersign,
			// * 签发人
			"fissuer" : issuer,
			// * 签发人ID
			"fissuerid" : "",
			// * 缓急
			"flazy" : isUrgency,
			// * 制度
			"fzhidu" : fzhidu,
			// * 本人档案
			"fselffile" : selfFile,
			// * 倌件号
			"fpackagenum" : fPackageNum,
			// * 室件号
			"froomnum" : fRoomNum,
			// * 卷内顺序号
			"fnum" : fNum,
			// * 拟办意见
			"fsuggestion" : fSuggestion,
			// * 处理情况
			"fdealsituation" : fDealSituation,
			// * 备注
			"fremark" : fRemark,
			// * 正文ID
			// "fMainBodyId" : "",
			// * 模版ID
			"fmodelid" : "",
			// * 公文状态
			"fdocumentstatus" : "草稿",

			// * 主送部门
			"fmainsupplydep" : mainSend,
			// * 主送部门id
			"fmainsupplydepid" : mainSendID,
			// * 主送部门type //2014-2-26 xuda 修改 这个是给主送表用，为了方尽量少的修改，接收字段没有变化
//			"fMainSupplyDepType" : readRangeType,
			// * 抄送部门
			"fcopydepartments" : duplicateSend,
			// * 抄送部门
			"fcopydepartmentsid" : duplicateSendID,
			// * 抄送部门
			"fcopydepartmentstype" : duplicateSendType,
			// * 责任者
			"fresponsior" : fresponsior,
			// * 文件登记部门ID
			// "fRegisterDeptId" :loginOrgID,
			// * 电子文件名
			"femailname" : FEmailName,
			// * 受控号
			"fconnum" : controllNum,
			// * 处理情况说明
			"fdealsituationexp" : FDealSituationExp,
			// 主送
			/*"doc.mainSupplyDep_FDeptID" : mainSendID,
			"doc.mainSupplyDep_FDeptCode" : mainSendSortNumber,
			"doc.mainSupplyDep_FDeptName" : mainSend,*/
			// 抄送
			/*"doc.copyDepartments_FDeptID" : duplicateSendID,
			"doc.copyDepartments_FDeptCode" : duplicateSendSortNumber,
			"doc.copyDepartments_FDeptName" : duplicateSend,*/
			/*alert(readRange);
			alert(readRangeID);
			alert(readRangeSortNumber);
			alert(readRangeType);
			return;*/
			// 可传阅范围
//			"doc.mainSupplyDep_FDeptID" : readRangeID,
//			"doc.mainSupplyDep_FDeptCode" : readRangeSortNumber,
//			"doc.mainSupplyDep_FDeptName" : readRange,
			// 会签
			"countersigns_fcountersignsid" : "",
			"countersigns_fcountersignscode" : "",
//			"doc.sendtype" : readsendtype,
			"countersigns_fcountersignsname" : countersign
		},
		dataType : "json",
		success : function(data) {
			// window.returnValue = data;
			// window.open('sendDocument.jsp', "发文");
			window.location.href = "updateDocument.jsp?docId=" + data.fid;
			// opener.refresh();
			// window.open('updateDocument.jsp?docId=' + data.fid, "_blank");
			// window.close();
		},
		failure : function() {

		}
	});

}

// 主送信息
function forMainSendJSP(inputID,mainSend) {
	var resultId = "";
	var resultText = "";
	var iTop = (window.screen.availHeight - 600) / 2; // 获得窗口的垂直位置;
	var iLeft = (window.screen.availWidth - 500) / 2; // 获得窗口的水平位置;
	var value = window.showModalDialog(mainSend, inputID,
			'dialogHeight=650px;' + 'dialogWidth=500px;' + 'dialogTop=' + iTop
					+ ';dialogLeft=' + iLeft + ';resizeable=yes;status=no');
	if (value != null) {
		for(var i=0;i<value.length;i++){
			if (i < value.length - 1) {
				resultId += value[i].id + ",";
				resultText += value[i].departmentname + ",";
			} else {
				resultId += value[i].id;
				resultText += value[i].departmentname;
			}
		}
		document.getElementById(inputID + '_hidden').value = resultId;
		document.getElementById(inputID).value = resultText;
		document.getElementById(inputID + '_hidden' + '_type').value = resultType;
	}

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