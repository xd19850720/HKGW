<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main.jsp' starting page</title>
    
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
	<script type="text/javascript">
	$(function(){
		$('a[title]').click(function(e){
			e.preventDefault();
			var src = $(this).attr('title');
			var title = $(this).html();
			if($('#tt').tabs('exists',title)){
				$('#tt').tabs('select',title);
			}else{
				$('#tt').tabs('add',{
					title:title,
					content:'<iframe frameborder=0 style=width:100%;height:100% src='+ src +' ></iframe>',
					closable:true
				});
			}
			
		});
	});
	</script>
  </head>
  
  <body>
    <div id="cc" class="easyui-layout" fit=true style="width:100%;height:100%;">  
		    <div region="north" title="easyui-layout"  split="false" style="height:100px;"></div>  
		    <div region="west"  iconCls="icon-ok" split="true" title="菜单" style="width:200px;">
				<div id="aa" class="easyui-accordion" fit=true >  
				    <div title="用户管理"  style="overflow:auto;padding:10px;">  
				    	<a title="jsp/users.jsp" >用户列表</a> <br/>
				    	<a title="jsp/window.jsp" >用户功能</a> 
				    </div>  
				    <div title="安全管理"  selected="true" style="padding:10px;">
					    <a title="jsp/resource.jsp">资源管理</a><br>
					    <a title="jsp/privilege.jsp">权限管理</a><br>
					    <a title="jsp/role.jsp" href="#">角色管理</a>
				    </div>  
				    <div title="权限管理">  
				    </div> 
				    <div title="资源管理">  
				    </div> 				     
				</div>  
		    </div>  
		    <div region="center"  title="主界面" style="padding:5px;">
				<div id="tt" class="easyui-tabs" fit=true style="width:500px;height:250px;">  

				</div>  
		    </div>  
		</div> 
   
  </body>
</html>
