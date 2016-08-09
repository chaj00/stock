<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

<!-- my -->
<!-- <link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script> -->
	
	
<!-- bigdata -->
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  
  
</head>
<body>
	<div class="container-fluid">
		<h2>Stock Analysis System</h2>
		<nav class="navbar navbar-inverse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="/stock/index.do">HOME</a></li>
				<li class="divider-vertical"></li>
				
				<!-- fundamental -->
				<li><a class="dropdown-toggle" data-toggle="dropdown" href="#">Fundamental
						<span class="caret"></span>
				</a><ul class="dropdown-menu">
						<li><a href="/stock/perbandindex.do">PERband</a></li>
						<li><a href="/stock/pbrbandindex.do">PBRband</a></li>
						<li><a href="/stock/checkpbrper_per.do">PER_Check</a></li>
						<li><a href="/stock/checkpbrper_pbr.do">PBR_Check</a></li>
						
						
				</ul></li>
				<!-- fundamental -->
				
				<li class="divider-vertical"></li>
				
				<!-- technical -->
				<li class="dropdown">
						<a class="dropdown-toggle" data-toggle="dropdown" href="#">
						Technical <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="/stock/goldencross.do?mode=20">GoldenCross</a></li>
							<li><a href="/stock/rsi.do?mode=14">RSI</a></li>
						</ul>
					</li>
				<!-- technical -->
				
				<li class="divider-vertical"></li>
				<li><a href="/stock/bigdata.do">Bigdata</a></li>
				<li class="divider-vertical"></li>
			</ul>
		</nav>
	</div>
</body>
</html>