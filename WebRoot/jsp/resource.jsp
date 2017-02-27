<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>资源页面</title>
    <link rel="stylesheet" type="text/css" href="<%=path %>/css/common.css" />
	<script type="text/javascript" src="<%=path %>/js/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
	<link rel="stylesheet" type="text/css" href="<%=path %>/js/jquery-easyui-1.2.6/themes/default/easyui.css" />
	<link rel="stylesheet" type="text/css" href="<%=path %>/js/jquery-easyui-1.2.6/themes/icon.css" />
	<script type="text/javascript" src="<%=path %>/js/jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="<%=path %>/js/jquery-easyui-1.2.6/locale/easyui-lang-zh_CN.js"></script>
	
  </head>
  
  <body>
    <div id="center" region="center">
    	<table id="resourceTable"></table>
  	</div>
  	<!-- 设置权限 -->
 	<div id="selectPrivilegeDialog"  class="easyui-dialog" closed ="true" modal="true" draggable="false" style="width:800px;height:600px">
 		<div id="privileges" title="权限管理" class="easyui-layout" style="width: 100%;height:100%">
 				<div  id="selectedPrivileges" region="west" title="已选择权限" style="width:100%">
 					<div id="selectedPrivilegesTable" class="easyui-datagrid"></div>
 				</div>
 				<div id="selectPrivileges" region="center" title="可选择权限" style="width:100%">
 					<div id="selectPrivilegesTable" class="easyui-datagrid"></div>
 				</div>
 		</div>
 	</div>
  	<div id="addresource" class="easyui-dialog" closed ="true" style="width:250px;" modal="true" draggable="false">
  		<form action="" method="post" id="addResourceForm">
   			<table>
   				<input type="hidden" name="resourceid" value="">
   				<tr>	
   					<td>公开链接:</td>
   					<td><input type="text" name="uri"></td>
   				</tr>
   				<tr>	
   					<td>权限描述:</td>
   					<td><input type="text" name="description"></td>
   				</tr>
   				<tr align="center">
					<td colspan="2">
						<a id="addResourceSureBtn" class="easyui-linkbutton">确定</a>
						<a id="addResourceResetBtn" class="easyui-linkbutton">重置</a>
					</td>
	    		</tr>   		
   			</table>
   		</form>
  	</div>
  	<script type="text/javascript" src="<%=path %>/jsp/js/resource.js"></script>
  </body>
</html>
