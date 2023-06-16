<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<%@include file="./base.jsp" %>

</head>
<body>
	<table class="table">
	  <thead class="thead-dark">
	    <tr>
	      <th scope="col">ID</th>
	      <th scope="col">First Name</th>
	      <th scope="col">Last Name</th>
	      <th scope="col">Mobile</th>
	      <th scope="col">Address</th>
	      <th scope="col">Delete/Update Employee</th>
	      <!-- <th scope="col">Update Employee</th> -->
	    </tr>
	  </thead>
	  
	  <c:forEach items="${employee }" var="e">
	  <tbody>
	  
	    <tr>
	      <th scope="row">${e.empId }</th>
	      <td>${e.empFirstName }</td>
	      <td>${e.empLastName }</td>
	      <td>${e.empMobile }</td>
	      <td>${e.empAddress }</td>
	      <td>
	      	<%-- <a href="delete/${e.empId}"><i class="fa-solid fa-trash text-primary" style="font-size:30px;"></i></a> --%>
	      	<%-- <a href="update/${e.empId}">Update</a> --%>
	      	<a href="delete/${e.empId }">Delete</a>
	      	<a href="update/${e.empId }">Update</a>
	      	
	  		</td>
	    </tr>
	  </tbody>
	 
	  </c:forEach>
	</table>
	
	<div class="container text-center">
	  
	  <a href="{pageContext.request.contextPath }"/>
	  
	  <a href="showForm">Add</a>
	  <!-- <button class="btn btn-outline-danger">Add</button> -->
	  
	  <a href="showForm"></a>
	
	  </a>
	  </div>
	


</body>
</html>