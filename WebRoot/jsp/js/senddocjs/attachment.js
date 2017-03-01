var attachmentGrid;
var documentId=null;
var fDocumentStatus;
var docType;
$(function() {
	// 附件上传列表
	attachmentGrid = $("#uploadAttachment");
	//params = window.dialogArguments;

//	if (params == undefined){
//		params = "305_草稿";
//	}fDocumentStatus
	fDocumentStatus = decodeURI($('#fDocumentStatus').val());
	documentId = decodeURI($('#documentId').val());
	/*if (params.indexOf("_") > 0) {
		fDocumentStatus = params.split("_")[1];
		documentId = params.split("_")[0];
	}*/
	if (fDocumentStatus == "待设定传阅范围" || fDocumentStatus == '待董事长审批'
			|| fDocumentStatus == '待总经理审批' || fDocumentStatus == '待分管副总审批') {
		docType = 1;
	}
	if (docType != 1) {
		docType = $('#docType').val();
	}
	// 标志位，如果是收文，就给个1标志位。事实上，2是没用到的
	if (docType != 1) {
		docType = 2;
	}
	// alert(documentId);
	// alert('docType=' + docType);
	// 获取上传的附件的所有信息
	$("#uploadAttachment")
			.datagrid(
					{
						url : 'attachmentAction_queryAll.do?documentId='
								+ documentId + '&doctype=' + docType,
						height : document.body.clientHeight*0.9,
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
									width : document.body.clientWidth*0.38,
									align : 'left',
									// 添加超级链
									formatter : function(value, rowData,
											rowIndex) {
										var generatedName = rowData.generatedName
												.toString();
										
										var ext = getExtension(generatedName);
										var attachURl = "";
										if(ext=='.jpg'){
											 /* "<a href='#'   onclick=\"checkonlineJPG('"
													+ generatedName
													+ "');\">"
													+ value + "</a>";*/
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
									width : document.body.clientWidth*0.18,
									align:'left'
									//align : 'center'
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
									width : document.body.clientWidth*0.2,
									align : 'center',
									// 添加超级链
									formatter : function(value, rowData,
											rowIndex) {
										// alert("value" + value);
										// alert("rowData=" + rowData);
										// alert("rowIndex=" + rowIndex);
										// function里面的三个参数代表当前字段值，当前行数据对象，行号（行号从0开始）
										// alert("rowDataID=" + rowData.id);

										var generatedName = rowData.generatedName;
										
										var attachurl="<a href='#' id='downloadAttachment' onclick='downloadAttachment(\""
											+ generatedName
											+ "\")'>下载</a>";
										if(fDocumentStatus == "草稿" || fDocumentStatus == "待排版校对"|| fDocumentStatus == "待设定传阅范围")
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
										
										
								/*		if (docType == 1) {
											if (fDocumentStatus == "草稿" || fDocumentStatus == "待设定传阅范围") {
												return "<a href='#' id='downloadAttachment' onclick='downloadAttachment(\""
													+ generatedName + "\")'>下载</a>"
													+"&nbsp;&nbsp;&nbsp;"
													+ "<a href='#' id='deleteAttachment'"
													+"onclick='deleteAttachment("
													+ rowData.id + ")'>删除</a>";
											}else{
												return "<a href='#' id='downloadAttachment' onclick='downloadAttachment(\""
													+ generatedName + "\")'>下载</a>";
											}
										} else {
											if(fDocumentStatus == "草稿" || fDocumentStatus == "待排版校对")
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
											}
										}*/
									}
								}

						// {field:'dept',title:'操作',width:100,align:'center'},
						] ],
						toolbar : [{
							id : 'uploadDoc',
							text : '上传',
							iconCls : 'icon-gw-backup',
							handler : uploadFileJSP
						} ],onBeforeLoad:function(){
							if(docType == 1&&fDocumentStatus!='草稿'&&fDocumentStatus!='待设定传阅范围'){
								$('#uploadDoc').hide();
							}
						}
					});
	var p = $('#uploadAttachment').datagrid('getPager');
	if (p) {
		$(p).pagination({
			beforePageText : "第",
			afterPageText : "共{pages}页",
			displayMsg : "共{total}条记录"
		});
	}

});

function viewAttachPDF(filepath) {
		$('#mloadMessage').show();
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
					$('#mloadMessage').hide();
					window.open('viewPdf.do'+'?fileName=' + data.filename);
				}else{
					$('#mloadMessage').hide();
					alert("查看失败，请联系管理员");
				}
			}
		}); 
}
function uploadFileJSP() {
	$('#uploadWindow').window({
		modal : true,
		width : 500,
		height : 160,
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
function submitUploadForm() {
	
	$('#buttons').hide();
	$('#attachMessage').show();
	
	var url;
	if (docType != 1) {
		url = "UploadAttachmentAction.do?documentId=" + documentId;
	} else {
		url = 'UploadAttachmentAction.do?receiveDocId=' + documentId
				+ "&doctype=1";
	}
	
	$('#uploadForm').form('submit', {
		url : url,
		dataType : "json",
		// 注意ajax的url的后台action方法必须有返回值return "json"，而不是return
		// null,否则下面的回调函数不起作用，sucess方法失效
		success : function(data) {
			closeUploadWin();
			$("#uploadAttachment").datagrid('reload');
		},
		error:function(data) {
		
		}
	});
}
function closeUploadWin() {
	$('#attachMessage').hide();
	$('#uploadWindow').window('close');
}
function cancel() {
	window.close();
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