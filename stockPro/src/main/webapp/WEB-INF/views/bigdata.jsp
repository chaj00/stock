<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" import="java.util.*,bigdata.dto.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<title>Bigdata</title>
</head>
<body>
	<P>bigdata hello</P>
	<div id="container" class="container">
		<h1>
			<strong>Bigdata</strong>
		</h1>
		<div class="radio text-center">
			<form id="radioform">
				<h3>
					
						
							<label class="radio-inline"><input type="radio"
								name="news" value=1>뉴스에 많이 나온</label>
					
					
				</h3>
			</form>
		</div>
		<div id="result_table" class="table-responsive">
			<table class="table table-hover">
				<tr class="info row">
					<th class="col text-center">Stockname</th>
					<th class="col text-center">Count</th>
				</tr>
				<thead>
				<tbody>
					<c:forEach var="data" items="${topiclist}" varStatus="status">
						<tr class="row">
							
							<td class="text-center">${data.stockName}</td>
							<td class="text-center">${data.Count}</td>
							
						</tr>
					</c:forEach>

				</tbody>
			</table>
		</div>
	</div>
	<footer class="container-fluid text-center">
		<p>Footer Text</p>
	</footer>
<script type="text/javascript">
	$(document).ready(function(){
		$('input:radio').change(function(){
			
				var url ='http://localhost:8088/stock/bigdata.do';
				$(location).attr('href',url);
			
		});
		
	})
</script>
</body>
</html>
