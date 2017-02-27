<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'users.jsp' starting page</title> 
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
	<script type="text/javascript" src="<%=path %>/jsp/js/users.js"></script>
  </head>
  
  <body>
  	<!-- 显示用户 -->
  	<div id="user" class="easyui-layout" style="width: 100%;height:100%" >
  	<div region="north" title="用户查询" collapsed="true" style="height:100%">
	  		<form action="" id="searchEmployeeForm">
	  			<table style="width:100%">
	  				<tr>
	  					<td style="width:10%" align="right" >员工姓名:</td>
	  					<td style="width:20%"><input type = "text" name="employeename"></td>
	  					<td style="width:10%" align="right" >员工编号:</td>
	  					<td style="width:20%"><input type = "text" name="employeecode"></td>
	  					<td style="width:10%" align="right" >员工职位:</td>
	  					<td style="width:20%">
		  					<select id="employeePosition" name="positionid" style="width:150px" >
	   						</select>
   						</td>
	  				</tr>
	  				<tr>
	  					<td align="right">员工电话:</td>
	  					<td><input type = "text" name="tel"></td>
	  					<td align="right">入职开始时间:</td>
	  					<td><input type = "text" class="easyui-datebox" editable="false" name="startDate"></td>
	  					<td align="right">入职结束时间:</td>
	  					<td><input type = "text" class="easyui-datebox" editable="false" name="endDate"></td>
	  				</tr>
	  				<tr align = "center">
	  					<td colspan="3" align="right"><a id="searchUserSureBtn" class="easyui-linkbutton">确认</a></td>
	  					<td colspan="3" align="left"><a id="searchUserCancleBtn" class="easyui-linkbutton">清空</a></td>
	  				</tr>
	  			</table>
	  			
	  		</form>
  		</div>
  		<div id="center" region="center">
    		<table id="usersTable"></table>
  		</div>
  	</div>
 	<!-- 选择角色 -->
 	<div id="selectRole"  class="easyui-dialog" closed ="true" modal="true" draggable="false" style="width:800px;height:600px">
 		<div id="roles" title="角色管理" class="easyui-layout" style="width: 100%;height:100%">
 				<div  id="selectedRoles" region="west" title="已选择角色" style="width:100%">
 					<div id="selectedRolesTable" class="easyui-datagrid"></div>
 				</div>
 				<div id="selectRoles" region="center" title="可选择角色" style="width:100%">
 					<div id="selectRolesTable" class="easyui-datagrid"></div>
 				</div>
 				
 		</div>
 	</div>
	<!-- 增加用户 -->
   <div id="addUser" class="easyui-dialog" closed ="true" style="width:250px;" modal="true" draggable="false">
   		<form action="" method="post" id="addUserForm">
   			<table>
   				<input type="hidden" name="employeeid">
   				<tr hidden="true" id="addUserFormEmployyeeCode">
   					<td>员工编号:</td>
   					<td><input type="text" name="employeecode" readonly="true"></td>
   				</tr>
   				<tr>	
   					<td>员工姓名:</td>
   					<td><input type="text" name="employeename"></td>
   				</tr>
   				<tr>	
   					<td>员工年龄:</td>
   					<td><input type="text" name="age"></td>
   				</tr>
   				<tr>	
   					<td>员工性别:</td>
   					<td>男<input type="radio" name="sex" value="1">
   					女<input type="radio" name="sex" value="0"></td>
   				</tr>
   				<tr>
   					<td>员工职位</td>
   					<td>
   						<select id="addEmployeePosition" name="positionid">
   						</select>
   					</td>
   				</tr>
   				<tr>
   					<td>
   						员工电话
   					</td>
   					<td>
   						<input type="text" name="tel">
   					</td>
   				</tr>
   				<tr>
   					<td>
   						员工邮箱
   					</td>
   					<td><input type="text" name="mail"></td>
   				</tr>
   				<tr align="center">
					<td colspan="2">
						<a id="addUserSureBtn" class="easyui-linkbutton">确定</a>
						<a id="addUserResetBtn" class="easyui-linkbutton">重置</a>
					</td>
	    		</tr>   		
   			</table>
   		</form>
   </div>
  <script type="text/javascript" src="<%=path %>/jsp/js/users.js"></script>
  </body>
</html>
