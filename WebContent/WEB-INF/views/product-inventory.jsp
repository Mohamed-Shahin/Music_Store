<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="/WEB-INF/views/template/header.jsp" %>
<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1> Product Inventory Page</h1>
			<p class="lead">Checkout this is Product Inventory </p>
		</div>  
		<table class="table table-stripped table-hover">
			<thead>
				<tr>
					<th>photo thumb</th>
					<th>product Name </th>
					<th>Category</th>
					<th>Condition</th>
					<th>Price</th>
					<th>Detail</th>
				</tr>
			</thead>
			
				<c:forEach var="tempProduct" items="${theProducts}">
					<tr>
					<td><img src="#" alt="image"/></td>
                    <td>${tempProduct.productName}</td>
                    <td>${tempProduct.productCategory}</td>
                    <td>${tempProduct.productCondition}</td>
                    <td>${tempProduct.productPrice} USD</td>
                    <td>
                    	<a href="${pageContext.request.contextPath}/productList/viewProduct/${tempProduct.productId}">
                    		<span class="glyphicon glyphicon-info-sign"></span>
                    	</a>
                    </td>
					
					</tr>
				</c:forEach>
				
			
		</table> 
		
<a href="${pageContext.request.contextPath}/admin/productInventory/addProduct" class="btn btn-primary">Add product</a>
<%@ include file="/WEB-INF/views/template/footer.jsp" %>