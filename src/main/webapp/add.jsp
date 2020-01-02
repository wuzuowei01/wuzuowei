<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>

<form action="add.do" method="post" enctype="" >

	商品名称:<input type="text" name="gname" >
	英文名称:<input type="text" name="ggname" >
	商品品牌:<input type="text" name="brand_bid" >
	商品种类:<input type="text" name="gk_kid" >
	尺寸:<input type="text" name="size" >
	单价:<input type="text" name="price" >
	数量:<input type="text" name="number" >
	标签:<input type="text" name="bq" >
	商品图片上传:<input type="file" name="img" >
		   <input type="submit" value="添加" >
	

</form>

</body>
</html>