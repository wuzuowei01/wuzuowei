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


<input type="button" value="添加" class="tj" >

<table>
  <tr>
    <th>商品ID</th>
    <th>商品名称</th>
    <th>商品品牌</th>
    <th>商品种类</th>
    <th>商品价格</th>
    <th>商品图片</th>
    <th>操作</th>
  </tr>
<c:forEach items="${list }" var="g" >
  <tr>
    <td>${g.gid }</td>
    <td>${g.gname }</td>
    <td>${g.bname }</td>
    <td>${g.kname }</td>
    <td>${g.price }</td>
    <td><img alt="图片受损" src="${list.img }"></td>
    <td><button value="${g.gid }" class="sc" >删除</button></td>
  </tr>
</c:forEach>
</table>

<script type="text/javascript">

$(".sc").click(function(){
	var gid = this.value;
	alert(gid);
	$.post("del.do",{"gid":gid},function(res){
		if(res){
			alert("删除成功");
		}else{
			alert("删除失败");
		}
	})
})

$(".tj").click(function(){
	location.href="add.jsp";
})

</script>

</body>
</html>