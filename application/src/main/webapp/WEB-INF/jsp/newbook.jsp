
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library Management</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
 
<style type="text/css">
.hoo{
margin-top: 20px;
}
</style>
</head>
<body>
<%@ include file="header.jsp" %>
<div class="container">
<form action="/saveBook" method="post">
  <div style="margin-top:10px;" class="form-group row">
    <label for="bookid" class="col-sm-2 col-form-label">BookId</label>
    <div class="col-sm-10">
      <input type="text" name="bookId" class="form-control"  id="bookid" placeholder="bookid">
    </div>
  </div>
   <div class="form-group row">
    <label for="quantity" class="col-sm-2 col-form-label">Quantity</label>
    <div class="col-sm-10">
      <input type="text" name="quantity" class="form-control" id="quantity" placeholder="quantity">
    </div>
  </div>
   <div class="form-group row">
    <label for="bookname" class="col-sm-2 col-form-label">Book Name</label>
    <div class="col-sm-10">
      <input type="text" name="bookName" class="form-control" id="bookname" placeholder="bookname">
    </div>
  </div>
   <div class="form-group row">
    <label for="genre" class="col-sm-2 col-form-label">Genre</label>
    <div class="col-sm-10">
      <input type="text" name="genre" class="form-control" id="genre" placeholder="genre">
    </div>
  </div>
   <div class="form-group row">
    <div class="col-sm-10">
      <button style="margin-left:200px;" type="submit" class="btn btn-primary">Add Book</button>
    </div>
  </div>
  </div>
</form>

<div style="margin-left:550px;">
 <h5>${ data }</h5>
</div>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>