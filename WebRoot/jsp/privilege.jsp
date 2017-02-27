<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>权限管理</title>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/common.css" />
	<script type="text/javascript" src="<%=path %>/js/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
	<link rel="stylesheet" type="text/css" href="<%=path %>/js/jquery-easyui-1.2.6/themes/default/easyui.css" />
	<link rel="stylesheet" type="text/css" href="<%=path %>/js/jquery-easyui-1.2.6/themes/icon.css" />
	<script type="text/javascript" src="<%=path %>/js/jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="<%=path %>/js/jquery-easyui-1.2.6/locale/easyui-lang-zh_CN.js"></script>
	
  </head>
  
  <body>
    <div id="center" region="center">
    	<table id="privilegeTable"></table>
  	</div>
  	
  	<div id="addprivilege" class="easyui-dialog" closed ="true" style="width:250px;" modal="true" draggable="false">
  		<form action="" method="post" id="addPrivilegeForm">
   			<table>
   				<input type="hidden" name="privilegeid" value="">
   				<tr>	
   					<td>权限名称:</td>
   					<td><input type="text" name="privilegename"></td>
   				</tr>
   				<tr>	
   					<td>权限描述:</td>
   					<td><input type="text" name="description"></td>
   				</tr>
   				<tr align="center">
					<td colspan="2">
						<a id="addPrivilegeSureBtn" class="easyui-linkbutton">确定</a>
						<a id="addPrivilegeResetBtn" class="easyui-linkbutton">重置</a>
					</td>
	    		</tr>   		
   			</table>
   		</form>
  	</div>
  	<script type="text/javascript" src="<%=path %>/jsp/js/privilege.js"></script>
  	
  </body>
</html>
