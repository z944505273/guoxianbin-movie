<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/index1.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.validate.js"></script>
</head>
<body>
	<form:form action="/adds.do" method="post" enctype="multipart/form-data">
		<table>
			<tr>
			<td>商品编号</td>
			<td><input type="text" name="id"></td>
			</tr>
			<tr>
			<td>商品名称</td>
			<td><input type="text" name="name"></td>
			</tr>
			<tr>
			<td>英文名称</td>
			<td><input type="text" name="ename"></td>
			</tr>
			 <tr>
			<td>商品品牌</td>
			<td>
			<select id="sp1" name="pin">
			<option value="">请选择</option>
			</select>
			</td>
			</tr>
			<tr>
			<td>商品种类</td>
			<td>
			<select id="sp" name="zhong">
			<option value="">请选择</option>
			</select>
			</td>
			</tr>
			<tr>
			<td>尺寸</td>
			<td><input type="text" name="size"></td>
			</tr>
			<tr>
			<td>单价</td>
			<td><input type="text" name="price"></td>
			</tr>
			<tr>
			<td>数量</td>
			<td><input type="text" name="num"></td>
			</tr>
			<tr>
			<td>标签</td>
			<td><input type="text" name="bq"></td>
			</tr>
			<tr>
			<td>商品图片上传</td>
			<td>
			<input type="file" name="ff">
			</td>
			</tr>
			<tr>
			<td colspan="100">
			<input type="submit" value="提交">
			</td>
			</tr>
		</table>
	</form:form>
	<script type="text/javascript">
	$.post(
			"/type.do",
			function(asd) {
				for (var i = 0; i < asd.length; i++) {
					$("#sp").append("<option value='"+asd[i].tid+"'>"+asd[i].tname+"</option>")
				}
			},"json")
	$.post(
			"/brand.do",
			function(asd) {
				for (var i = 0; i < asd.length; i++) {
					$("#sp1").append("<option value='"+asd[i].bid+"'>"+asd[i].bname+"</option>")
				}
			},"json")
	</script>
</body>
</html>