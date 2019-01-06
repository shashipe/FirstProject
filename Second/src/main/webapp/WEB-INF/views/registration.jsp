<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf"  uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
  <nav class="navbar navbar-expand-sm bg-dark">
    <ul class="navbar-nav">
      <li class="nav-item"><a class="nav-link" href="home">Home</a></li>
      <li class="nav-item"><a class="nav-link" href="login">Login</a></li>
      <li class="nav-item"><a class="nav-link" href="registration">Registration</a></li>
      <li class="nav-item">
      <a class="nav-link" href="aboutus">AboutUs</a>
    </li> 
    </ul>
  </nav>
  <h2 class="text-center text-primary">This is Registration</h2>
  <div class="container-fluid">
    <div class="row">
      <div class="col-3"></div>
      <div class="col-6">
        <div class="card">
          <div class="card-header bg-primary">Login Here</div>
          <div class="card-body">
            <sf:form action="regSubmit" method="POST" commandName="registration">
            <div class="form-group">
                <label class="text-danger text-center">${regError}</label>
              </div>
              <div class="form-group">
                <label for="userName">Username:</label> 
                <sf:input path="userName" type="text" class="form-control"></sf:input>
              </div>
              <div class="form-group">
                <label for="userName">EmailID:</label>
                 <sf:input path="emailId" type="email" class="form-control"></sf:input>
              </div>
              <div class="form-group">
                <label for="password">Password:</label> <sf:input path="password" type="password" class="form-control"></sf:input>
              </div>
              <div class="form-group">
                <label for="password">Enter Password Again:</label> <sf:input path="password" type="password" class="form-control"></sf:input>
              </div>
              <div class="form-group">
                <label for="age">Age:</label> <sf:input path="age" type="number" class="form-control"></sf:input>
              </div>
              <button type="submit" class="btn btn-primary">Submit</button>
           </sf:form>
          </div>
          <div class="card-footer">Note: All Fields Are Mandatory</div>
        </div>
      </div>
      <div class="col-3"></div>
    </div>
  </div>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>