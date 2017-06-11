<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showProv.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <h1>省份基本信息如下</h1>
       <form action="prov/queryAll" method="get">
       
        编号:<input type="text" name="prov_id">&nbsp;
        省份名字:<input type="text" name="prov_name">
        <input type="submit" value="查询">
        
       </form>
   <c:forEach items="${listP}" var="provs" varStatus="i">
             ${i.index+1 }
             ${provs.prov_id },
             ${provs.prov_name },
             <a href="prov/delProv?prov_id=${provs.prov_id }">删除</a><br>
       
       </c:forEach>
  </body>
</html>
