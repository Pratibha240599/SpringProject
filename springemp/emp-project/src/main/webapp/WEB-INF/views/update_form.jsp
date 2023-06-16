<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<%@include file="./base.jsp" %>

</head>
<body>

	<form action="${pageContext.request.contextPath }/handle-form" method="post">
	 
	  <input id="empId" type="text" value="${empById.empId }" />

	  
	  <div class="form-group">
	    <label for="exampleFormControlInput1">Emp First Name</label>
	    <input type="text" class="form-control" id="empFirstName" placeholder="Enter your First Name" name="empFirstName" value="${empById.empFirstName }">
	  </div>
	  
	  <div class="form-group">
	    <label for="exampleFormControlInput1">Emp Last Name</label>
	    <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter your Last Name" name="empLastName" value="${empById.empLastName }">
	  </div>
	  
	  <div class="form-group">
	    <label for="exampleFormControlInput1">Emp Mobile Number</label>
	    <input type="number" class="form-control" id="exampleFormControlInput1" placeholder="Enter your Mobile Number" name="empMobile" value="${empById.empMobile }">
	  </div>
	  
	  <div class="form-group">
	    <label for="exampleFormControlInput1">Emp Address</label>
	    <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter your Address" name="empAddress" value="${empById.empAddress }">
	  </div>
	  
	  <div class="container text-center">
	  
	  
	  <!-- <button class="btn btn-success">Back</button> -->
	  
	  <button class="btn btn-outline-primary">Update</button> 
	  
	  
	  
	  </div>
	</form>

</body>
</html>