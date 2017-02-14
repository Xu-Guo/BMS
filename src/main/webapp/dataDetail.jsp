<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/blog.css">
<script src="${pageContext.request.contextPath}/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
<script src="${pageContext.request.contextPath}/static/bootstrap3/js/bootstrap.min.js"></script>
<title>DataDetail page</title>
<style>
	body{
		padding-top:40px;
		padding-bottom:40px;
	}
</style>
</head>
<body>

<div class="data_list">
	Battery Data Info:
	<div class="BatteryData_info" >
		Time:[<fmt:formatDate value="${batteryData.timestp}" type="date" pattern="yyyy-MM-dd HH:mm"/>] &nbsp;&nbsp;
		Battery Id:${batteryData.battery_id }&nbsp;&nbsp;
		Charge Current:${batteryData.ch_cur }&nbsp;&nbsp; 
		Discharge Current:${batteryData.dis_cur }&nbsp;&nbsp;
		Temperature:${batteryData.temperature }&nbsp;&nbsp;
		Status:${batteryData.battery_status }&nbsp;&nbsp;
		Charger:${batteryData.charger_status }&nbsp;&nbsp;
		SoC:${batteryData.stateofcharge }%&nbsp;&nbsp;
	</div>
	Error Info:
	<div class="errorDatas">
		<c:choose>
			<c:when test="${errorList.size()==0 }">
				No errors.
			</c:when>
			<c:otherwise>
				<c:forEach var="error" items="${errorList}">
					<div class="error">
						<span><font>[&nbsp;<fmt:formatDate value="${error.eTime }" type="date" pattern="yyyy-MM-dd HH:mm:ss"/>&nbsp;]:</font>
						ErrorType:${error.errorTypeId }&nbsp;&nbsp;
						Detail:${error.errorDetail }&nbsp;&nbsp;
						HandleMark:${error.handledMark }&nbsp;&nbsp;
						</span>			
					</div>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</div>
	Alarm Info:
	<div class="alarmDatas">
		<c:choose>
			<c:when test="${alarmList.size()==0 }">
				No alarms.
			</c:when>
			<c:otherwise>
				<c:forEach var="alarm" items="${alarmList}">
					<div class="alarm">
						<span><font>[&nbsp;<fmt:formatDate value="${alarm.aTime }" type="date" pattern="yyyy-MM-dd HH:mm:ss"/>&nbsp;]:</font>
						Alarm Type:${alarm.alarmTypeId }&nbsp;&nbsp;
						Detail:${alarm.alarmDetail }&nbsp;&nbsp;
						HandleMark:${alarm.handledMark }&nbsp;&nbsp;
						</span>			
					</div>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</div>
	
</div>


</body>
</html>
