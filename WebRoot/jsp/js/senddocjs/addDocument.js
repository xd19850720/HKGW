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

	// 承办部门
	var org = $('#org').html() ? $('#org').html() : '';
	var orgID = $('#org_hidden').val() ? $('#org_hidden').val() : '';
	// 文件日期
	var fileDate = $('#fileDate').datebox("getValue") ? $('#fileDate').datebox(
			"getValue") : '';
	var loginDate = $('#loginDate').datebox("getValue") ? $('#loginDate').datebox(
			"getValue") : '';
	// 保密期限
	var secretPeriod = $('#secretPeriod').combobox('getValue') ? $(
			'#secretPeriod').combobox('getValue') : '';
	// 文件字号
	var fileNum = $('#fileNum').val() ? $('#fileNum').val() : '';
	// 题名
	var fileName = $('#fileName').val() ? $('#fileName').val() : '';
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
	// 承办人
	var loginPerson = $('#loginPerson').val() ? $('#loginPerson').val() : '';
	var loginPersonID = $('#loginPerson_hidden').val() ? $(
			'#loginPerson_hidden').val() : '';
	// 文件登记部门
	var loginOrg = $('#loginOrg').html() ? $('#loginOrg').html() : '';
	var loginOrgID = $('#loginOrg_hidden').val() ? $('#loginOrg_hidden').val()
			: '';
	// 主送
	var mainSend = $('#mainSend').val() ? $('#mainSend').val() : '';
	var mainSendID = $('#mainSend_hidden').val() ? $('#mainSend_hidden').val()
			: '';
	// 抄送
	var duplicateSend = $('#duplicateSend').val() ? $('#duplicateSend').val()
			: '';
	var duplicateSendID = $('#duplicateSend_hidden').val() ? $(
			'#duplicateSend_hidden').val() : '';
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
	// 备注 
	var fRemark = $('#fRemark').val() ? $('#fRemark').val() : '';
	if (!dateFormate(loginDate)) {
		return false;
	}
	if (!dateFormate(fileDate)) {
		return false;
	}
	
	$('#button').hide();
	$('#readme').show();
	$.ajax({
		url : '/HKGW/sendDocs/add.action',
		type : "POST",
		data : {
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
			// 题名
			"ftitle" : fileName,
			// 附件题名
			"fuploadname" : attachmentName,
			// 附件数
			"fuploadnumer" : attachmentNums,
			// 密级
			"fsecrecylevel" : secretItems,
			// * 承办人
			"fcarrier" : loginPerson,
			// * 承办人ID
			"fcarrierID" : loginPersonID,
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
			// * 备注
			"fremark" : fRemark,
			// * 正文ID
			// "fMainBodyId" : "",
			"fdocumentstatus" : "草稿",
			// * 主送部门
			"fmainsupplydep" : mainSend,
			// * 主送部门id
			"fmainsupplydepid" : mainSendID,
			// * 抄送部门
			"fcopydepartments" : duplicateSend,
			// * 抄送部门
			"fcopydepartmentsid" : duplicateSendID,
		},
		dataType : "json",
		success : function(data) {
			window.location.href = "updateDocument.jsp?docId=" + data.fid;
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
				resultId += value[i].deptid + ",";
				resultText += value[i].departmentname + ",";
			} else {
				resultId += value[i].deptid;
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