<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alarm Management</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/locale/easyui-lang-en.js"></script>
<script type="text/javascript">

 	function formatDataTitle(val, row){
 		if(val==null){
 			return "<font color='red'>Data has been deleted!</font>";
 		}else{
 			return "<a target='_blank' href='${pageContext.request.contextPath}/public/batteryData/details/"+val+".html'>"+val+"</a>";
 		}
 	}
 	
 	function formatState(val, row){
 		if(val==0){
 			return "Not yet reviewed!"
 		}else{
 			return "Review passed!"
 		}
 	}
 	
 	
</script>
</head>
<body style="margin: 1px">
<table id="dg" title="Manage Alarms" class="easyui-datagrid" 
  fitColumns="true" pagination="true" rownumbers="true"
  url="${pageContext.request.contextPath}/public/alarm/list.do" fit="true" toolbar="#tb">
  <thead>
  	<tr>
  		<th field="id" width="20" align="center">ID</th>
  		<th field="aTime" width="100" align="center">Alarm Time</th>
  		<th field="batteryDataId" width="50" align="center" formatter="formatDataTitle">BatteryDataId</th>
  		<th field="alarmTypeId" width="50" align="center">Alarm Type Id</th> 		
  		<th field="alarmDetail" width="200" align="center">Detail</th>
  		<th field="handledMark" width="50" align="center" formatter="formatState">State</th>
  	</tr>
  </thead>
</table>
</body>
</html>