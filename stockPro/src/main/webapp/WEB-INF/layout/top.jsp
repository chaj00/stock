<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-fluid">
		<h1>Stock Analysis System</h1>
		<nav class="navbar navbar-inverse">
		
				<ul class="nav navbar-nav">
					<li class="active"><a href="/stock/index.do">HOME</a></li>
					<li><a href="#">Fundamental</a></li>
					<li class="dropdown">
						<a class="dropdown-toggle" data-toggle="dropdown" href="#">Technical 
																						<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="/stock/goldencross.do?mode=20">GoldenCross</a></li>
							<li><a href="/stock/rsi.do?mode=14">RSI</a></li>
						</ul>
					</li>
					<li><a href="#">Bigdata</a></li>
					
				</ul>
			
		</nav>
	</div>
</body>
</html>