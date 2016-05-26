<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>${board.kind}</h2>
<div>
	<table>
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>조회수</td>
			<td>작성일</td>
		</tr>		
	<c:forEach items="${list}" var="bdto">
		<tr>
			<td>${bdto.num}</td>
			<td><a href="view?num=${dto.num}">${bdto.title}</a></td>
			<td>${bdto.id}</td>		
			<td>${bdto.counts}</td>
			<td>${bdto.reg_date}</td>
		</tr>
	</c:forEach>	
	</table>	
</div>

	<div>
	<c:if test="${page.curBlock > 1}">
		<a href="./board?curPage=${page.startNum-1}">[이전]</a>
	</c:if>
	<c:forEach begin="${page.startNum}" end="${page.lastNum}" var="i">
		<a href="./board?curPage=${i}">${i}</a>
	</c:forEach>
	<c:if test="${page.lastNum < page.totalBlock}">
		<a href="./board?curPage=${page.lastNum+1}">[다음]</a>
	</c:if>
	</div>
	<form action="./search" method="get">
	<select> 
		<option value="title">제목</option>
		<option value="contents">내용</option>
		<option value="writer">작성자</option>
	</select>
	<input type="text" name="search"><input type="submit" value="검색">
	</form>
	
	
<input type="button" name="write" id="write" value="글쓰기">
</body>
<script type="text/javascript">
	$("#write").on('click',function(){
		location.href = "write?kind=${board.kind}";
	});
</script>
</html>