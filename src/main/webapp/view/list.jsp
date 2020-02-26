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
	<form action="/list.do" method="post">
	种类:<select id="sp" name="tname">
		<option value="" >请选择</option>
		</select>
	品牌:<select id="sp1" name="bname">
		<option value="" >请选择</option>
		</select>	
	单价:<input type="text" name="p1" value="${con.p1 }">-<input type="text" name="p2" value="${con.p2 }"><br>
	商品名称:<input type="text" name="name" value="${con.name }">	
	英文名称:<input type="text" name="ename" value="${con.ename }">	
	英文标签:<input type="text" name="bq" value="${con.bq }">	
		<input type="submit" value="查询">
		<input type="button" value="添加" onclick="adds()">
	<table>
		<tr>
		<td>编号</td>
		<td>名字</td>
		<td>中文名字</td>
		<td>大小</td>
		<td>价格</td>
		<td>数量</td>
		<td>描述</td>
		<td>图片</td>
		<td>类型</td>
		<td>品牌</td>
		</tr>
		<c:forEach items="${g }" var="c">
			<tr>
			<td>${c.id }</td>
			<td>${c.name }</td>
			<td>${c.ename }</td>
			<td>${c.size }</td>
			<td>${c.price }</td>
			<td>${c.num }</td>
			<td>${c.bq }</td>
			<td>
			<img alt="无" src="${c.pic }">
			</td>
			<td>
				<c:forEach items="${c.type }" var="d">
				${d.tname }
				</c:forEach>
			</td>
			<td>
				<c:forEach items="${c.brand }" var="f">
				${f.bname }
				</c:forEach>
			</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="100">
			<button name="pageNum" value="1">首页</button>
			<button name="pageNum" value="${pg.prePage==0?1:pg.prePage }">上一页</button>
			<button name="pageNum" value="${pg.nextPage==0?pg.pages:pg.nextPage }">下一页</button>
			<button name="pageNum" value="${pg.pages }">尾页</button>
			当前${pg.pageNum }页/共${pg.pages }页,共${pg.total }条数据
			<input type="button" value="批删" onclick="ps()">
		</td>
		</tr>
	</table>
	</form>
	<script type="text/javascript">
	/* $("select option[value='"+${con.tname}+"']").attr("selected",true) */
	$.post(
			"/type.do",
			function(asd) {
				for (var i = 0; i < asd.length; i++) {
					$("#sp").append("<option value='"+asd[i].tname+"'>"+asd[i].tname+"</option>")
				}
			},"json")
	$.post(
			"/brand.do",
			function(asd) {
				for (var i = 0; i < asd.length; i++) {
					$("#sp1").append("<option value='"+asd[i].bname+"'>"+asd[i].bname+"</option>")
				}
			},"json")
	function adds() {
		location="view/add.jsp"
	}
	</script>
</body>
</html>