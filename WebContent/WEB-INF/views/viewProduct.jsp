<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>
<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Product Detail</h1>
			<p class="lead">Here Infromation about the ${product.productName}  </p>
		</div>  
		<div class="container">
			<div class="row">
				<div class="col-md-5">
					<img alt="image" src="#" width="100%" height="300px">
				</div>
				<div class="col-md-5">
					<h3>Product Name: ${product.productName} </h3> 
					<h3>Product Description: ${product.productDescription} </h3>
					<h3>Product Manufacturer: ${product.productManufacturer}</h3>
					<h3>Product Category: ${product.productCategory}</h3>
					<h3>Condition: ${product.productCondition}</h3>
					<h3>Price: ${product.productPrice}USD</h3>

				</div>
			</div>
		</div>
<%@ include file="/WEB-INF/views/template/footer.jsp" %>