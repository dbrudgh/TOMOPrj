<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판</title>
</head>

<body>
	<!--Table Search v1-->
	<div class="table-search-v1 margin-bottom-20">
		<div class="table-responsive">
			<table class="table table-hover table-bordered table-striped">
				<thead>
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>작성자</th>
						<th>등록일</th>
						<th>조회수</th>
						<th>추천수</th>
					</tr>
				</thead>
				<c:forEach items="${list}" var="BoardVO">
				<tbody>
					<tr>
						<td class="td-width">${BoardVO.board_num}</td>
						<td>
							<a href="/board/readPage/cate_num=${BoardVO.cate_num}&board_num=${BoardVO.board_num}">
							${BoardVO.board_name}</a>
						</td>
						<td>${BoardVO.user_email}</td>
						<td>${BoardVO.board_reg}</td>
						<td>${BoardVO.board_count}</td>
						<td>${BoardVO.board_reccount}
						<button class="btn-u btn-block btn-u-green btn-u-xs">
						<i class="fa fa-level-up margin-right-5"></i>추천</button></td>						
					</tr>
				</tbody>
				</c:forEach>
			</table>
		</div>
	</div>
	<!--End Table Search v1-->

<%@include file="../include/footer.jsp"%>
</body>
</html>