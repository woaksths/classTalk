<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>

</body>

<c:choose>
	<c:when test="${sessionScope.mvo==null}">
		<script type="text/javascript">
			alert("회원정보 불일치");
			location.href = "${pageContext.request.contextPath}/home.do";
		</script>
	</c:when>
	<c:otherwise>
		<script type="text/javascript">
			alert("학생은 권한이 없습니다.");
			location.href = "${pageContext.request.contextPath}/home.do";
		</script>
	</c:otherwise>
</c:choose>

</html>