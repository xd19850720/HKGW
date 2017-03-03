var myselfDeptID;
var nodeId;
var nodeText;
$(function() {
	var lastRowIndex;
	$('#div_search').dialog('close');
	$('#div_file_search').dialog('close');
	myselfDeptID = $('#myselfDeptID').val();
	nodeId = $('#nodeId').val();
	nodeText = $('#nodeText').val();

	if (nodeText != null && nodeText.length > 0) {
		nodeText = decodeURI(nodeText);
	}

	// 加载部门的json数据
	$('#txt_file_dept').combobox({
		url : '../receiveDocument/dept.json',
		valueField : 'id',
		textField : 'text'
	});

	var url = '/HKGW/sendDocs/getAllDocs.action';
	url = encodeURI(encodeURI(url));
	$("#sendDocumentList")
			.datagrid(
					{
						url : url,
						nowrap : false,
						striped : true,
						collapsible : true,
						// sortName : 'ID',
						// sortOrder : 'desc',
						idField : 'ID',
						// fitColumns : true,
						singleSelect : true,
						height : document.body.clientHeight,
						rownumbers : true,
						pagination : true,
						animate : true,
						columns : [ [
								// {},
								// 方法，以这个顺序为准，这样其它的修改都会顺一些
								{
									field : 'ck',
									checkbox : 'true',
									title : '选择'
								},
								{// 待确认字段
									field : 'fmainbodyid',
									title : '正文',
									width : 35,
									align:'center',
									// 添加超级链
									formatter : function(value, rowData,
											rowIndex) {

										// function里面的三个参数代表当前字段值，当前行数据对象，行号（行号从0开始）
										// alert(rowData.username);
										if (value) {
											return "<input type='checkbox' checked='true' disabled='true'></input>";
										} else {
											return "<input type='checkbox' disabled='true'></input>";
										}
									}
								},
								{
									field : 'fuploadfile',
									title : '附件',
									width : 35,
									align:'center',
									// 添加超级链
									formatter : function(value, rowData,
											rowIndex) {
										// function里面的三个参数代表当前字段值，当前行数据对象，行号（行号从0开始）
										// alert(rowData.username);
										if (value == "附件") {
											return "<input type='checkbox' checked='true' disabled='true'></input>";
										} else {
											return "<input type='checkbox' disabled='true'></input>";
										}
									}
								}, {
									field : 'fdocumentstatus',
									title : '公文状态',
									width : 80,
									sortable : true
								}, {
									field : 'ftitle',
									title : '文件名',
									width : 450,
									sortable : true
								}, {
									field : 'id',
									title : 'ID',
									hidden : true
								}, {
									field : 'fno',
									title : '文件字号',
									width : 120,
									sortable : true
								}, {
									field : 'fyear',
									title : '形成年度',
									width : 60,
									hidden : true
								}, {
									field : 'ffiledate',
									title : '文件日期',
									align:'center',
									width : 100,
									//formatter : formatTimeStr,
									sortable : true
								}, {
									field : 'fdepartment',
									title : '承办部门',
									width : 100,
									sortable : true
								}, {
									field : 'fsecrecyname',
									title : '保密期限',
									width : 60,
									hidden : true
								}, {
									field : 'fkeyword',
									title : '主题词',
									width : 150,
									hidden : true
								}, {
									field : 'fuploadName',
									title : '附件题名',
									width : 150,
									hidden : true
								}, {
									field : 'fuploadNumer',
									title : '附件数',
									width : 50,
									hidden : true
								}, {
									field : 'fSecrecyLevelName',
									title : '密级',
									width : 60,
									hidden : true
								}, {
									field : 'fCreateDate',
									title : '登记日期',
									width : 60,
//									formatter : formatTimeStr,
									hidden : true
								}, {
									field : 'ftypeName',
									title : '发文类型',
									width : 60,
									hidden : true
								}, {
									field : 'fcarrier',
									title : '承办人',
									width : 120,
									sortable : true
								}, {
									field : 'fRegisterDept',
									title : '文件登记部门',
									width : 80,
									hidden : true
								}, {// 数据库建库无此字段
									field : 'controllNum',
									title : '受控号',
									width : 50,
									hidden : true
								}, {
									field : 'fDealSituation',
									title : '处理情况说明',
									width : 100,
									hidden : true
								}, {
									field : 'fmainsupplydep',
									title : '主送',
									width : 150,
									sortable : true
								}, {
									field : 'fcopydepartments',
									title : '抄送',
									width : 150,
									sortable : true
								}, {
									field : 'fDraftPeople',
									title : '拟稿人',
									width : 60,
									sortable : true,
									hidden : true
								}, {
									field : 'fNuclearDraft',
									title : '核稿人',
									width : 60,
									hidden : true
								}, {
									field : 'faudit',
									title : '审核人',
									width : 60,
									sortable : true,
									hidden : true
								}, {
									field : 'fcountersign',
									title : '会签人',
									width : 60,
									hidden : true
								}, {
									field : 'fissuer',
									title : '签发人',
									width : 100,
									sortable : true
								}, {
									field : 'fLazy',
									title : '缓急',
									width : 50,
									hidden : true
								}, {
									field : 'fRemark',
									title : '备注',
									width : 100,
									hidden : true
								},// 增加字段
								{
									field : 'fPackageNum',
									title : '倌件号',
									width : 50,
									hidden : true
								}, {
									field : 'fRoomNum',
									title : '室件号',
									width : 50,
									hidden : true
								}, {
									field : 'fNum',
									title : '卷内顺序号',
									width : 50,
									hidden : true
								}, {
									field : 'fSuggestion',
									title : '拟办意见',
									width : 60,
									hidden : true
								}, {
									field : 'fDealSituation',
									title : '处理情况',
									width : 50,
									hidden : true
								}, {
									field : 'fModelId',
									title : '模版',
									width : 50,
									hidden : true
								} ] ],
						toolbar : [{
							id : "printfile",
							text : '打印',
							iconCls : 'icon-gw-print',
							handler : printfile
						},{
							text : '导出Excel',
							iconCls : 'icon-gw-page_excel',
							handler : daochuexcel
						},{
							id : "submit",
							text : '提交',
							iconCls : 'icon-ok',
							handler : readyToVerify
						}, {
							id : "delItems",
							text : '删除',
							iconCls : 'icon-gw-delete',
							handler : delItems
						}, {
							id : "editDocument",
							text : '修改',
							iconCls : 'icon-gw-modify',
							handler : editDocument
						},{
							id : "addSendDocument",
							text : '新增',
							iconCls : 'icon-gw-add',
							handler : addSendDocument
						},{
							iconCls : 'icon-search',
							text : '查询',
							handler : function searchItem() {
								//$('#div_file_search').dialog('open');
								$('#div_search').dialog('open');
							}
						} ],
						onDblClickRow : function openPage(rowIndex, rowData) {
							dbClickOpenPage(rowIndex, rowData);
						},
						onSelect : function checkToConsole(rowIndex, rowData) {
							if (rowIndex == lastRowIndex) {
								$('#sendDocumentList').datagrid('unselectRow',
										rowIndex);
								lastRowIndex = null;
							} else {
								lastRowIndex = rowIndex;
							}
						},
						onSortColumn : function orderField(sort, order) {

						},
						onLoadSuccess : function controlbutton() {
//							if (nodeId == "now") {
								$("#addSendDocument").show();
								$("#editDocument").show();
								$("#delItems").show();
								$("#submit").show();
								$("#search_field").show();
//							} else if (nodeId == "search" || nodeId == "dept") {
							
//								$("#search_file").show();
//							}
						}
					});

/*	$("#addSendDocument").hide();
	$("#editDocument").hide();
	$("#delItems").hide();
	$("#submit").hide();
	$("#search_field").hide();
	$("#search_file").hide();
*/
	// 自定义页脚
	var pager = $('#sendDocumentList').datagrid('getPager'); // 得到DataGrid页面
	pager.pagination({
		showPageList : false,
		buttons : [ {
			iconCls : 'icon-gw-zhengwen',
			text : '正文',
			handler : viewMainBody
		}, {
			iconCls : 'icon-gw-attach',
			text : '附件',
			handler : viewAttach
		} ]
	});

	$(".datagrid-toolbar").append($("#exportExcel"));
	$(".datagrid-toolbar").append($("#printView"));
	$(".datagrid-toolbar").append($("#print"));
});
// 双击
function dbClickOpenPage(rowIndex, rowData) {

	var status = rowData.fDocumentStatus;
	var id = rowData.id;
	if (status == "草稿" || status == "待排版校对" || status == "待下发") {
		var url = 'updateDocument.jsp?docId=' + id + "&docStatus=" + status;
		url = encodeURI(encodeURI(url));
		window.open(url, "_blank",
				"toolbar=yes, menubar=yes,   resizable=yes,location=yes,status=yes,height="
						+ window.screen.availHeight + ", width="
						+ window.screen.availWidth);
	}
	if (status == "发文完成") {
		var url = '../searchDocment/viewSendDocument.jsp?docId=' + id
				+ "&docStatus=" + status;
		url = encodeURI(encodeURI(url));
		window.open(url, "_blank",
				"toolbar=yes, menubar=yes,   resizable=yes,location=yes,status=yes,height="
						+ window.screen.availHeight + ", width="
						+ window.screen.availWidth);
	}
}
// 直接查看正文
function viewMainBody() {

	var row = $("#sendDocumentList").datagrid('getSelected');
	if (row) {

		var params = '?documentId=' + row.id + '&title=' + row.ftitle
				+ '&mainSend=' + row.fMainSupplyDep + '&myfCopyDepartments='
				+ row.fCopyDepartments + '&myfileNo=' + row.fNo
				+ '&fDocumentStatus=' + row.fDocumentStatus + '&fMainBodyId='
				+ row.fMainBodyId + '&docType=1' + '&newMainBody=1';
		var fModelPath = row.fModelPath;
		params = params + '&fModelPath=' + fModelPath;
		var url = 'mainBody.jsp' + params;
		url = encodeURI(url);
		url = encodeURI(url);
		window.open(url, "_blank",
				"toolbar=yes, menubar=yes,   resizable=yes,location=yes,status=yes,height="
						+ window.screen.availHeight + ", width="
						+ window.screen.availWidth);

	} else {
		$.messager.alert("提示", "请选择一条数据");
	}
}
// 查看附件
function viewAttach() {
	var row = $("#sendDocumentList").datagrid('getSelected');
	if (row) {
		var url = 'attachment.jsp?documentId='+row.id+'&fDocumentStatus='+row.fDocumentStatus;
		url = encodeURI(encodeURI(url));
		window.open(url, "_blank",
				"toolbar=yes, menubar=yes, resizable=yes,location=yes,status=yes,height="
						+ window.screen.availHeight + ", width="
						+ window.screen.availWidth);
		/*var url = 'attachment.jsp';
		var iTop = (window.screen.availHeight - 620) / 2; // 获得窗口的垂直位置;
		var iLeft = (window.screen.availWidth - 900) / 2; // 获得窗口的水平位置;
		var value = window.showModalDialog(url + '?id=' + row.id, row.id + '_'
				+ row.fDocumentStatus, 'dialogHeight=620px;'
				+ 'dialogWidth=670px;' + 'dialogTop=' + iTop + ';dialogLeft='
				+ iLeft + ';resizeable=yes;status=no');*/

	} else {
		$.messager.alert("提示", "请选择一条数据");
	}
}
// 查看
function viewItem() {
	var row = $("#sendDocumentList").datagrid('getSelected');
	if (row) {
		jsp = '../searchDocment/viewSendDocument.jsp';
		var iTop = (window.screen.availHeight - 650) / 2; // 获得窗口的垂直位置;
		var iLeft = (window.screen.availWidth - 1000) / 2; // 获得窗口的水平位置;

		var url = '../searchDocment/viewSendDocument.jsp?docId=' + row.id
				+ "&docStatus=" + row.fDocumentStatus;
		url = encodeURI(encodeURI(url));
		window.open(url, "_blank",
				"toolbar=yes, menubar=yes,resizable=yes,location=yes,status=yes,height="
						+ window.screen.availHeight + ", width="
						+ window.screen.availWidth);
	} else {
		$.messager.alert("提示", "请选择一条数据");
	}
}

function watchAttachent() {
	var row = $("#sendDocumentList").datagrid('getSelected');
	if (row) {
		if (!row.fuploadName) {
			alert("对不起，没有附件！");
			return false;
		}
		var iTop = (window.screen.availHeight - 650) / 2; // 获得窗口的垂直位置;
		var iLeft = (window.screen.availWidth - 1000) / 2; // 获得窗口的水平位置;
		var value = window.showModalDialog('attachment.jsp', row.id,
				'dialogHeight=650px;' + 'dialogWidth=1020px;' + 'dialogTop='
						+ iTop + ';dialogLeft=' + iLeft
						+ ';resizeable=yes;status=no');
	} else {
		$.messager.alert("提示", "请选择一条数据");
	}
}

function selectItems() {
	var iTop = (window.screen.availHeight - 300) / 2; // 获得窗口的垂直位置;
	var iLeft = (window.screen.availWidth - 300) / 2; // 获得窗口的水平位置;
	var value = window.showModalDialog('selectItems.jsp', '',
			'dialogHeight=260px;' + 'dialogWidth=300px;' + 'dialogTop=' + iTop
					+ ';dialogLeft=' + iLeft + ';resizeable=yes;status=no');
	var field = value.split(",");
	if (field) {
		$("#sendDocumentList").datagrid({
			url : 'DocumentDealAction_queryDocumentByField.do',
			queryParams : {
				"doc.ftitle" : field[0],
				"doc.fKeyWord" : field[1],
				"doc.fyear" : field[2],
				"doc.fDocumentStatus" : field[3]
			},
			nowrap : false,
			striped : true,
			collapsible : true,
			sortName : 'ID',
			sortOrder : 'desc',
			idField : 'ID',
			// fitColumns : true,
			singleSelect : true,
			height : document.body.clientHeight,
			rownumbers : true,
			pagination : true,
			animate : true,
			columns : [ [
			// {},
			// 方法，以这个顺序为准，这样其它的修改都会顺一些
			{
				field : 'ck',
				checkbox : 'true',
				title : '选择'
			}, {
				field : 'ftitle',
				title : '文件名',
				width : 150
			}, {
				field : 'id',
				title : 'ID',
				hidden : true
			}, {// 待确认字段
				field : 'fMainBodyId',
				title : '正文',
				width :30,
				align:'center',
				hidden : true
			}, {
				field : 'fUploadFile',
				title : '附件',
				align:'center',
				width : 30,
				hidden : true
			}, {
				field : 'fNo',
				title : '文件字号',
				width : 100
			}, {
				field : 'fyear',
				title : '形成年度',
				width : 60,
				hidden : true
			}, {
				field : 'fdepartment',
				title : '承办部门',
				width : 80
			}, {
				field : 'fFiledate',
				title : '文件日期',
				width : 100,
				sortable : true
//				formatter : formatTimeStr
			}, {
				field : 'fResponsior',
				title : '责任者',
				width : 60,
				hidden : true
			}, {
				field : 'fSecrecyName',
				title : '保密期限',
				width : 60,
				hidden : true
			}, {
				field : 'fKeyWord',
				title : '主题词',
				width : 150,
				hidden : true
			}, {
				field : 'fcopies',
				title : '份数',
				width : 50,
				hidden : true
			}, {
				field : 'fsheets',
				title : '张数',
				width : 50,
				hidden : true
			}, {// 数据库建库无此字段
				field : 'guidangshu',
				title : '归档张数',
				width : 50,
				hidden : true
			}, {
				field : 'fuploadName',
				title : '附件题名',
				width : 150,
				hidden : true
			}, {
				field : 'fuploadNumer',
				title : '附件数',
				width : 50,
				hidden : true
			}, {
				field : 'fSecrecyLevelName',
				title : '密级',
				width : 60
			}, {
				field : 'fCreateDate',
				title : '登记日期',
				width : 60,
				formatter : formatTimeStr,
				hidden : true
			}, {
				field : 'fbackDate',
				title : '退文日期',
				width : 60,
//				formatter : formatTimeStr,
				hidden : true
			}, {
				field : 'ftypeName',
				title : '发文类型',
				width : 60,
				hidden : true
			}, {
				field : 'fcarrier',
				title : '承办人',
				width : 60,
				hidden : true
			}, {
				field : 'fRegisterDept',
				title : '文件登记部门',
				width : 80,
				hidden : true
			}, {// 数据库建库无此字段
				field : 'controllNum',
				title : '受控号',
				width : 50,
				hidden : true
			}, {
				field : 'fDealSituation',
				title : '处理情况说明',
				width : 100,
				hidden : true
			}, {
				field : 'fMainSupplyDep',
				title : '主送',
				width : 80,
				hidden : true
			}, {
				field : 'fCopyDepartments',
				title : '抄送',
				width : 80,
				hidden : true
			}, {
				field : 'fDraftPeople',
				title : '拟稿人',
				width : 60,
				hidden : true
			}, {
				field : 'fNuclearDraft',
				title : '核稿人',
				width : 60,
				hidden : true
			}, {
				field : 'faudit',
				title : '审核人',
				width : 60,
				hidden : true
			}, {
				field : 'fcountersign',
				title : '会签人',
				width : 60,
				hidden : true
			}, {
				field : 'fIssuer',
				title : '签发人',
				width : 60,
				hidden : true
			}, {
				field : 'fLazy',
				title : '缓急',
				width : 50,
				hidden : true
			}, {
				field : 'fRemark',
				title : '备注',
				width : 100,
				hidden : true
			},// 增加字段
			{
				field : 'fPackageNum',
				title : '倌件号',
				width : 50,
				hidden : true
			}, {
				field : 'fRoomNum',
				title : '室件号',
				width : 50,
				hidden : true
			}, {
				field : 'fNum',
				title : '卷内顺序号',
				width : 50,
				hidden : true
			}, {
				field : 'fSuggestion',
				title : '拟办意见',
				width : 60
			}, {
				field : 'fDealSituation',
				title : '处理情况',
				width : 50,
				hidden : true
			}, {
				field : 'fModelId',
				title : '模版',
				width : 50,
				hidden : true
			}, {
				field : 'fDocumentStatus',
				title : '公文状态',
				width : 90
			} ] ],
			toolbar : [ {
				text : '新增',
				iconCls : 'icon-add',
				handler : addSendDocument
			}, {
				text : '修改',
				iconCls : 'icon-edit',
				handler : editDocument
			}, {
				text : '删除',
				iconCls : 'icon-remove',
				handler : delItems
			}, {
				text : '打开文档控件',
				iconCls : 'icon-add',
				handler : openOfficeControl
			}, {
				text : '锁定',
				iconCls : 'icon-gw-lock',
				handler : lockedup
			}, {
				text : '解锁',
				iconCls : 'icon-tip',
				handler : unlockedup
			}, {
				text : '检索',
				iconCls : 'icon-search',
				handler : selectItems
			}
		]
		});
	}

}

function unlockedup() {
	var row = $("#sendDocumentList").datagrid('getSelected');
	if (row) {
		var status = row.fDocumentStatus;
		if ('锁定' != status) {
			$.messager.alert("提示", "只有锁定状态下的公文允许解锁!");
			return;
		} else {
			$.ajax({
				url : 'DocumentDealAction_unlockedup.do',
				type : "POST",
				data : {
					id : row.id
				// fMainBodyID : row.fMainBodyId
				},
				dataType : 'json',
				success : function(data) {
					$.messager.alert("提示", data.flag);
					$("#sendDocumentList").datagrid('reload');
				}
			});
		}
	} else {
		$.messager.alert("提示", "请选择一条数据");
		return;
	}

}

function lockedup() {
	var row = $("#sendDocumentList").datagrid('getSelected');
	if (row) {
		var status = row.fDocumentStatus;
		if ('发送' != status) {
			$.messager.alert("提示", "只有发送状态下的公文发能锁定!");
			return;
		} else {
			$.ajax({
				url : 'DocumentDealAction_lockedup.do',
				type : "POST",
				data : {
					id : row.id,
					fMainBodyID : row.fMainBodyId
				},
				dataType : 'json',
				success : function(data) {
					$.messager.alert("提示", data.flag);
					$("#sendDocumentList").datagrid('reload');
				}
			});
		}
	} else {
		$.messager.alert("提示", "请选择一条数据");
		return;
	}

}
function readyToVerify() {
	var row = $("#sendDocumentList").datagrid('getSelected');
	if (row) {
		var status = row.fdocumentstatus;
			if(status == '草稿' ){
				status = "待审核";
			}else if(status == '待审核'){
				status = "待发送";
			}else if(status == '待发送'){
				status = "待完成";
			}else {
				status = "草稿";
			}
			var fileDate = row.ffiledate;
			var fileName = row.ftitle;
			var mainSend = row.fmainsupplydep;
			var attachmentName = row.fuploadName;
			var attachmentNums = row.fuploadNumer;
			// 校验数据
			if (!fileDate) {
				$.messager.alert("提示", "文件日期不能为空");
				return false;
			}
			if (!fileName) {
				$.messager.alert("提示", "题名不能为空");
				return false;
			}
			if (!mainSend) {
				$.messager.alert("提示", "主送不能为空");
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
				url : '/HKGW/sendDocs/updatestatusbyid.action',
				type : "POST",
				data : {
					id : row.id,
					status : status
				},
				dataType : 'json',
				success : function(data) {
					$.messager.alert("提示", data.flag);
					$("#sendDocumentList").datagrid('reload');
				}
			});
	} else {
		$.messager.alert("提示", "请选择一条数据");
		return;
	}

}
// 修改信息
function editDocument() {
	var row = $("#sendDocumentList").datagrid('getSelected');
	if (row) {
		var status = row.fDocumentStatus;
		if (status == "草稿" || status == "待排版校对") {
			var url = 'updateDocument.jsp';
			if (row.fDocumentStatus == "锁定") {
				url = 'updateDocument2.jsp';
			}

			window.open(url + '?docId=' + row.id, "_blank",
					"toolbar=yes, menubar=yes, resizable=yes,location=yes,status=yes,height="
							+ window.screen.availHeight + ", width="
							+ window.screen.availWidth);
		} else {
			$.messager.alert("提示", "只有草稿状态或待排版校对状态的文件允许修改");
		}
	} else {
		$.messager.alert("提示", "请选择一条数据");
	}

}
// 更新信息
function updateDocument(data) {

	window.open('updateDocument.jsp?docId=' + data.fid, "_blank",
			"toolbar=yes, menubar=yes,resizable=yes,location=yes,status=yes,height="
					+ window.screen.availHeight + ", width="
					+ window.screen.availWidth);
	// var iTop = (window.screen.availHeight - 620) / 2; // 获得窗口的垂直位置;
	// var iLeft = (window.screen.availWidth - 900) / 2; // 获得窗口的水平位置;
	// window.showModalDialog('updateDocument.jsp', data.fid,
	// 'dialogHeight=620px;' + 'dialogWidth=900px;' + 'dialogTop=' + iTop
	// + ';dialogLeft=' + iLeft + ';resizeable=yes;status=no');

}

function openOfficeControl() {
	var winFeatures = "toolbar=no,location=no,directories=no,status=no,menubar=no,scrollbars=yes,resizable=no,copyhistory=no,"
			+ "width=" + screen.width + "px,height=" + screen.height;
	window.open(basePath + '/weboffice/editoffice.jsp?fileType=word', "",
			winFeatures);
	window.location.reload();
}
// 新增
function addSendDocument() {


	var value = window.open('addDocument.jsp', "_blank",
			"toolbar=yes, menubar=yes,   resizable=yes,location=yes,status=yes,height="
					+ window.screen.availHeight + ", width="
					+ window.screen.availWidth);

	if(value){
		$.messager.alert("提示", "新增数据成功");
		refresh();
	}
}


//刷新列表
function refresh() {
	$("#sendDocumentList").datagrid('reload');
}

function delItems() {
	var row = $("#sendDocumentList").datagrid('getSelected');
	if (row) {
		var status = row.fdocumentstatus;
		if (status == "草稿") {
			$.messager.confirm('删除', '确认删除吗？', function(r) {
				if (r) {
					$.ajax({
						url : '/HKGW/sendDocs/deletedoc.action',
						type : "POST",
						data : {
							id : row.id
						},
						dataType : 'json',
						success : function(data) {
							$.messager.alert("提示", data.flag);
							$("#sendDocumentList").datagrid('reload');
						}
					});
				}
			});
		} else {
			alert("只有草稿状态的公文允许删除!");
			return;
		}
	} else {
		$.messager.alert("提示", "请选择一条数据");
	}
}

// 文件查询
function do_file_search() {

	//var txt_file_dept = encodeURI($("#txt_file_dept").combobox('getText'));
	//var txt_file_year = encodeURI($("#txt_file_year").val());
	var txt_file_name = encodeURI($("#txt_file_name_send").val());
	var txt_file_num = encodeURI($("#txt_file_num").val());
	var txt_isFile = "isFile";
	var queryParams = {
		//'fyear' : txt_file_year,
		//'txt_file_dept' : txt_file_dept,
		'txt_isFile' : txt_isFile,
		'ftitle' : txt_file_name,
		'fNo' : txt_file_num
	};
	$('#sendDocumentList').datagrid('options').queryParams = queryParams;
	$("#sendDocumentList").datagrid('reload');
	$('#div_file_search').dialog('close');
}

// 查询
function do_search() {
	var txt_isFile = "isFile";
	// 文件状态
	var slt_dj_state = encodeURI($("#slt_dj_state").combobox('getText'));
	// var slt_cb_dept = encodeURI($("#slt_cb_dept").combobox('getText'));
	// 日期
	var txt_file_date = encodeURI($('#txt_file_date').datebox("getValue"));
	// 文件名
	var txt_file_name = encodeURI($("#txt_file_name").val());
	// 文件字号
	var txt_file_code = encodeURI($("#txt_file_code").val());

	var txt_mainSend = encodeURI($("#txt_mainSend").val());
	var txt_copySend = encodeURI($("#txt_copySend").val());
	// 年度
	//var txt_year = encodeURI($("#txt_year").val());
	// 签发人
	var fIssuer = encodeURI($("#fIssuer").val());
	var txt_from_date = encodeURI($("#txt_from_date").datebox("getValue"));
	var txt_end_date = encodeURI($("#txt_end_date").datebox("getValue"));
	var fcarrier = encodeURI($("#fcarrier").val());

	// 校验日期格式
	if (txt_file_date) {
		if (!dateFormate(txt_file_date)) {
			alert("日期格式错误");
			return false;
		}
	}
	if (txt_from_date) {
		if (!dateFormate(txt_from_date)) {
			alert("日期格式错误");
			return false;
		}
	}
	if (txt_end_date) {
		if (!dateFormate(txt_end_date)) {
			alert("日期格式错误");
			return false;
		}
	}

	var queryParams = {
		'fDocumentStatus' : slt_dj_state,
		// 'fdepartment' : slt_cb_dept,
		'fFiledate' : txt_file_date,
		'ftitle' : txt_file_name,
		'fNo' : txt_file_code,

		'fMainSupplyDep' : txt_mainSend,
		'fCopyDepartments' : txt_copySend,
		//'fyear' : txt_year,
		'fIssuer' : fIssuer,
		'from' : txt_from_date,
		'end' : txt_end_date,
		'fcarrier' : fcarrier,
		'txt_isFile' : txt_isFile
	};

	$('#sendDocumentList').datagrid('options').queryParams = queryParams;
	$("#sendDocumentList").datagrid('reload');
	$('#div_search').dialog('close');
	return queryParams;
}

function getParamsURL(head){
	//var allParams = getqueryparams();
	// 文件状态
	var slt_dj_state = encodeURI($("#slt_dj_state").combobox('getText'));
	// var slt_cb_dept = encodeURI($("#slt_cb_dept").combobox('getText'));
	// 日期
	var txt_file_date = encodeURI($('#txt_file_date').datebox("getValue"));
	// 文件名
	var txt_file_name = encodeURI($("#txt_file_name").val());
	// 文件字号
	var txt_file_code = encodeURI($("#txt_file_code").val());

	var txt_mainSend = encodeURI($("#txt_mainSend").val());
	var txt_copySend = encodeURI($("#txt_copySend").val());
	// 年度
	// var txt_year = encodeURI($("#txt_year").val());
	// 签发人
	var fIssuer = encodeURI($("#fIssuer").val());
	var txt_from_date = encodeURI($("#txt_from_date").datebox("getValue"));
	var txt_end_date = encodeURI($("#txt_end_date").datebox("getValue"));
	var fcarrier = encodeURI($("#fcarrier").val());
	var url = head + 'fDocumentStatus='+slt_dj_state
	+'&fFiledate='+txt_file_date
	+'&ftitle='+txt_file_name
	+'&fNo='+txt_file_code
	+'&fMainSupplyDep='+txt_mainSend
	+'&fCopyDepartments='+txt_copySend
	+'&fIssuer='+fIssuer
	+'&from='+txt_from_date
	+'&end='+txt_end_date
	+'&fcarrier='+fcarrier
	+'&txt_isFile='+'isFile'
	+'&myselfDeptID='+myselfDeptID;
	if (nodeId == "now"||nodeId == "search") {
		url = url+"&fyear=" + nodeText;
	} else if (nodeId == "dept") {
		url = url+"&txt_file_dept=" + encodeURI(nodeText);
	}
	url=encodeURI(url);
	return url;
}

//打印可查询文件数据
function printfile() {
	var url=getParamsURL("DocumentDealAction_printmeFile.do?");
	window.open(url);
}
//导出数据
function daochuexcel(){
	var url=getParamsURL("ExcelDown_exportSendDocumentListToExcel.do?fileName=Excel.xls&");
	window.location = url;
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

// 清除查询的内容
function do_clear() {
	$('#slt_dj_state').combobox('select', '全部');
	$('#txt_file_date').datebox('setValue', '');
	$('#txt_from_date').datebox('setValue', '');
	$('#txt_end_date').datebox('setValue', '');
	$("#txt_file_code").val('');
	$("#txt_file_name").val('');
	$("#fcarrier").val('');
	$("#fIssuer").val('');
	$("#txt_mainSend").val('');
	$("#txt_copySend").val('');
	$("#txt_year").val('');
}
// 清除查询的全部内容
function do_file_clear() {
	$("#txt_file_name_send").val('');
	//$("#txt_file_year").val('');
	$("#txt_file_num").val('');
	$('#txt_file_dept').combobox('select', '全部');
}
// 年份下拉
function InitYearSelect(dropDownListId, start) {
	// 清空年份下拉列表框的内容
	var ddlYear = document.getElementById(dropDownListId);
	var value = parseInt(start, 0);
	while (ddlYear.options.length > 0) {
		ddlYear.removeChild(ddlYear.options[0]);
	}
	var year = new Date().getFullYear();
	var lastYear = year + 4;
	var startYear = 2010;
	if (value != 0) {
		startYear = value;
	}
	if (startYear > 2011) {
		for ( var i = 2; i > 0; i--) {
			ddlYear.options.add(new Option(startYear - i + "年", startYear - i));
		}

		for ( var j = 0; j <= 2; j++) {
			ddlYear.options.add(new Option(startYear + j + "年", startYear + j));
		}
	} else {
		for ( var firstYear = 2010; firstYear <= lastYear; firstYear++) {
			ddlYear.options.add(new Option(firstYear + "年", firstYear));
		}
	}
	ddlYear.value = startYear;
}
// 获取打印的id
function getPrintIds() {
	var ids = "";
	var rows = $('#sendDocumentList').datagrid('getRows');
	for ( var i = 0; i < rows.length; i++) {
		ids += "," + rows[i].id;
	}
	ids = ids.substring(1);

	window.open("PrintAction_getPrintDoc.do?sendPrintIds=" + ids + "&flag=1");
}