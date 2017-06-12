<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<html>
<c:choose>
<c:when test="${sessionScope.mvo==null}">
<script type="text/javascript">
			alert("로그인 실패!");
			location.href="${pageContext.request.contextPath}/home.do";
	</script>
</c:when>
</c:choose>


<body>
asdfsad;flkasflsa
</body>
</html>