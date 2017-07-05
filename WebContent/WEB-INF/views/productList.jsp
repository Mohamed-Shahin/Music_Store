<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>
<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1> All products </h1>
			<p class="lead">Checkout all the awesome products available here </p>
		</div>  
		<table class="table table-stripped table-hover">
			<thead>
				<tr>
					<th>photo thumb</th>
					<th>product Name </th>
					<th>Category</th>
					<th>Condition</th>
					<th>Price</th>
				</tr>
			</thead>
			
				<c:forEach var="tempProduct" items="${theProducts}">
					<tr>
					<td><img alt="product image" src="#"></td>
					<td>${tempProduct.productName}</td>
					<td>${tempProduct.productCategory}</td>
					<td>${tempProduct.productCondition}</td>
					<td>${tempProduct.productPrice}USD</td>
					</tr>
				</c:forEach>
				
			
		</table> 
<%@ include file="/WEB-INF/views/template/footer.jsp" %>
