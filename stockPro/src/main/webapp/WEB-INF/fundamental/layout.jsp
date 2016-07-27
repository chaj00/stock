<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<style type="text/css">
#content {
	width: 70%;
	float: center;
}
#left {
	width: 10%;
	float: left;
}
#right {
	width: 20%;
	float: right;
}
buttom {
	width: 20%;
	float: buttom;
}
</style>

</head>
<body>
	<div id="content">
		<tiles:insertAttribute name="content" />
	</div>
	<div id="left">
		<tiles:insertAttribute name="left" />
	</div>
	<div id="right">
		<tiles:insertAttribute name="right" />
	</div>
	<div id="buttom">
		<tiles:insertAttribute name="buttom" />
	</div>
	
</body>
</html>