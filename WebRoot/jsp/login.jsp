<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>慧科公文</title>
    <link rel='stylesheet' type='text/css' href='<%=path %>/css/bootstrap.min.css' /> 
    <link rel='stylesheet' type='text/css' href='<%=path %>/css/login-m.css' />         
  </head>
  <body>
     <div class="container">

      <form class="form-signin" role="form"  action="<%=path %>/privilege/login.action" method="post">
        <h2 class="form-signin-heading">请登录</h2>
        <input type="text" name="username" class="form-control" placeholder="账号" required autofocus>
        <input type="password" name="password" class="form-control" placeholder="密码" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> 记住密码
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登陆</button>
      </form>

    </div> 
  </body>
</html>
