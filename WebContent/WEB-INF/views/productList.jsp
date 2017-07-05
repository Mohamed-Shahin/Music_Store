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
    	<!-- FOOTER -->
    	<footer>
        	<p class="pull-right"><a href="#">Back to top</a></p>
        	<p>&copy; 2015 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
    	</footer>
	</div>
</div><!-- /.container -->


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script>window.jQuery ||
document.write('<script src="<c:url value="/resources/js/jquery-1.11.3.min.js" />"><\/script>')</script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</body>
</html>
