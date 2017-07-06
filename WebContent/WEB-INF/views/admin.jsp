<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="/WEB-INF/views/template/header.jsp" %>
<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Administrator page </h1>
			<p class="lead">This is administrator page </p>
		</div>  
		<h3> Product Inventory</h3>
		<a href="${pageContext.request.contextPath}/admin/product-inventory">Product Inventory</a>
<%@ include file="/WEB-INF/views/template/footer.jsp" %>
