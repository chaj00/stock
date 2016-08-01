<%@page import="fundamental.dto.EnterpriseTotalDTO"%>
<%@page import="fundamental.dto.BpsDTO"%>
<%@page import="java.util.List"%>
<%@page import="fundamental.dto.StockCloseWDTO"%>
<%@page import="fundamental.dto.EnterpriseFinanceDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>PBR_BAND</title>

		<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
		<script type="text/javascript">

	<%
	List<EnterpriseTotalDTO> codeList = (List<EnterpriseTotalDTO>)request.getAttribute("codeList");
	EnterpriseFinanceDTO finance = (EnterpriseFinanceDTO)request.getAttribute("enterpriseFinance");
	BpsDTO bps = (BpsDTO)request.getAttribute("bpsData");
	List<StockCloseWDTO> closeList = (List<StockCloseWDTO>)request.getAttribute("stockCloseList"); 
	int codeListSize = codeList.size();
	int closeListSize = closeList.size();
	%>
	<%=closeList.get(0).getPrice()%>	
	
		$(function() {
			
			// create the chart
			$('#container').highcharts('StockChart', {
			    
			    rangeSelector: {
			        selected: 5
			    },
			    
			    title: {
			        text: 'AAPL Historical'
			    },


			    yAxis: [{
			        title: {
			            text: 'OHLC'
			        },
			        height: 200,
			        lineWidth: 3
			    }],
			    
			    series: [{
			        type: 'line',
			        name: 'END_PRICE',
			        data: [21,22,23,24,25,26,27,28,29,30],
			    	pointStart: Date.UTC(2010, 1, 1),
			    	/* pointInterval: 24 * 3600 * 1000 // one day */
			    	pointInterval: 7 * 24 * 3600 * 1000 // one week
			    	
			    },{
			        type: 'line',
			        name: '1PBR',
			        data: [21,22,23,24,25,26,27,28,29,30],
			    	pointStart: Date.UTC(2010, 1, 1),
			    	pointInterval: 7 * 24 * 3600 * 1000 // one week
			    },{
			        type: 'line',
			        name: '2PBR',
			        data: [21,22,23,24,25,26,27,28,29,30],
			    	pointStart: Date.UTC(2010, 1, 1),
			    	pointInterval: 7 * 24 * 3600 * 1000 // one week
			    },{
			        type: 'line',
			        name: '3PBR',
			        data: [21,22,23,24,25,26,27,28,29,30],
			    	pointStart: Date.UTC(2010, 1, 1),
			    	pointInterval: 7 * 24 * 3600 * 1000 // one week
			    },{
			        type: 'line',
			        name: '4PBR',
			        data: [21,22,23,24,25,26,27,28,29,30],
			    	pointStart: Date.UTC(2010, 1, 1),
			    	pointInterval: 7 * 24 * 3600 * 1000 // one week
			    }]
			});
	});
		</script>
	</head>
	<body>
<script src="http://code.highcharts.com/stock/highstock.js"></script>
<script src="http://code.highcharts.com/stock/modules/exporting.js"></script>


<div id="container" style="height: 500px; min-width: 500px"></div>
	</body>
</html>
