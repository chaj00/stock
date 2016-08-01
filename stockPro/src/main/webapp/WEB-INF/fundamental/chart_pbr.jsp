<%@page import="java.util.ArrayList"%>
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
		
		$(function() {
			
		   <%
		    List<StockCloseWDTO> stockClose = (List<StockCloseWDTO>)request.getAttribute("stockCloseList");
			EnterpriseFinanceDTO finance = (EnterpriseFinanceDTO)request.getAttribute("enterpriseFinance");
			BpsDTO 				 bps 	 = (BpsDTO)request.getAttribute("bps");
			List<EnterpriseTotalDTO> total = (List<EnterpriseTotalDTO>)request.getAttribute("codeList");
			List<StockCloseWDTO> closeList = (List<StockCloseWDTO>)request.getAttribute("closeList");
		   %>
		   
		    // create the chart
			$('#container').highcharts('StockChart', {
			    
			    rangeSelector: {
			        selected: 5
			    },
			    
			    title: {
			        text: ' ' 
			    },
				
			    yAxis: [{
			        title: {
			            text: 'OHLC'
			        },
			        height: 500,
			        lineWidth: 1
			    }],
			    
			    series: [{
			        type: 'line',
			        name: 'END_PRICE',
			        data: [
			               <%for(int i=0;i<stockClose.size();i++){%>
			               	<%=stockClose.get(i).getPrice()%>,
			               <%}%>
			               ],
			    	pointStart: Date.UTC(2006, 1, 1),
			    	/* pointInterval: 24 * 3600 * 1000 // one day */
			    	pointInterval: 7 * 24 * 3600 * 1000 // one week
			    },{
			        type: 'line',
			        name: '1PBR',
			        data: [
			               <%=bps.getBps07y2()%>,<%=bps.getBps08y2()%>,<%=bps.getBps09y2()%>,<%=bps.getBps10y2()%>,<%=bps.getBps11y2()%>,
			               <%=bps.getBps12y2()%>,<%=bps.getBps13y2()%>,<%=bps.getBps14y2()%>,<%=bps.getBps15y2()%>,<%=bps.getBps16y2()%>,
			               <%=bps.getBps17y2()%>,<%=bps.getBps18y2()%>,<%=bps.getBps19y2()%>,
			               ],
			    	pointStart: Date.UTC(2007, 1, 1),
			    	pointInterval: 365 * 24 * 3600 * 1000 // one year
			    },{
			        type: 'line',
			        name: '2PBR',
			        data: [
			               <%=bps.getBps07y2()%>,<%=bps.getBps08y2()%>,<%=bps.getBps09y2()%>,<%=bps.getBps10y2()%>,<%=bps.getBps11y2()%>,
			               <%=bps.getBps12y2()%>,<%=bps.getBps13y2()%>,<%=bps.getBps14y2()%>,<%=bps.getBps15y2()%>,<%=bps.getBps16y2()%>,
			               <%=bps.getBps17y2()%>,<%=bps.getBps18y2()%>,<%=bps.getBps19y2()%>,
			               ],
			    	pointStart: Date.UTC(2007, 1, 1),
			    	pointInterval: 365 * 24 * 3600 * 1000 // one year
			    },{
			        type: 'line',
			        name: '3PBR',
			        data: [
			               <%=bps.getBps07y3()%>,<%=bps.getBps08y3()%>,<%=bps.getBps09y3()%>,<%=bps.getBps10y3()%>,<%=bps.getBps11y3()%>,
			               <%=bps.getBps12y3()%>,<%=bps.getBps13y3()%>,<%=bps.getBps14y3()%>,<%=bps.getBps15y3()%>,<%=bps.getBps16y3()%>,
			               <%=bps.getBps17y3()%>,<%=bps.getBps18y3()%>,<%=bps.getBps19y3()%>,
			               ],
			    	pointStart: Date.UTC(2007, 1, 1),
			    	pointInterval: 365 * 24 * 3600 * 1000 // one year
			    },{
			        type: 'line',
			        name: '4PBR',
			        data: [
			               <%=bps.getBps07y4()%>,<%=bps.getBps08y4()%>,<%=bps.getBps09y4()%>,<%=bps.getBps10y4()%>,<%=bps.getBps11y4()%>,
			               <%=bps.getBps12y4()%>,<%=bps.getBps13y4()%>,<%=bps.getBps14y4()%>,<%=bps.getBps15y4()%>,<%=bps.getBps16y4()%>,
			               <%=bps.getBps17y4()%>,<%=bps.getBps18y4()%>,<%=bps.getBps19y4()%>,
			               ],
			    	pointStart: Date.UTC(2007, 1, 1),
			    	pointInterval: 365 * 24 * 3600 * 1000 // one year
			    }]
			});
	});
		</script>
	</head>
	<body>
<script src="http://code.highcharts.com/stock/highstock.js"></script>
<script src="http://code.highcharts.com/stock/modules/exporting.js"></script>
<h3><%=total.get(1).getName()%>(<%= total.get(1).getCode() %>)  -  PBR band</h3><h3><%=stockClose.get(1).getPrice()%>,<%=stockClose.get(1).getCode() %></h3>
<div id="container" style="height: 700px; min-width: 500px"></div>
	</body>
</html>
