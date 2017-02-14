<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Error Management</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/locale/easyui-lang-en.js"></script>
<script type="text/javascript">

 	function formatDataTitle(val,rows){
 		if(val==null){
 			return "<font color='red'>Data has been deleted!</font>";
 		}else{
 			return "<a target='_blank' href='${pageContext.request.contextPath}/public/batterydata/details/"+val+".html'>"+val+"</a>";
 		}
 	}
 	
 	function formatState(val, row){
 		if(val==0){
 			return "Not yet reviewed!"
 		}else{
 			return "Review passed!"
 		}
 	}
 	
	function errorReview(handledMark){
		var selectedRows=$("#dg").datagrid("getSelections");
		if(selectedRows.length==0){
			$.messager.alert("System","Please select a error to review!");
			return;
		}
		var strIds=[];
		for(var i=0;i<selectedRows.length;i++){
			strIds.push(selectedRows[i].id);
		}
		var ids=strIds.join(",");
		$.messager.confirm("System","Please confirm to operate on the selected <font color=red>"+selectedRows.length+"</font> error.",function(r){
			if(r){
				$.post("${pageContext.request.contextPath}/public/error/review.do",{ids:ids,handledMark:handledMark},function(result){
					if(result.success){
						$.messager.alert("System","Operation succeed!");
						$("#dg").datagrid("reload");
					}else{
						$.messager.alert("System","Operation Failed!");
					}
				},"json");
			}
		});
	}
</script>
</head>
<body style="margin: 1px">
<table id="dg" title="Review Errors" class="easyui-datagrid" 
  fitColumns="true" pagination="true" rownumbers="true"
  url="${pageContext.request.contextPath}/public/error/list.do?handledMark=0" fit="true" toolbar="#tb">
  <thead>
  	<tr>
  		<th field="cb" checkbox="true" align="center"></th>
  		<th field="id" width="20" align="center">ID</th>
  		<th field="eTime" width="100" align="center">Error Time</th>
  		<th field="batteryDataId" width="50" align="center" formatter="formatDataTitle">BatteryDataId</th>
  		<th field="errorTypeId" width="50" align="center">Error Type Id</th>
  		<th field="errorDetail" width="200" align="center">Detail</th>
  		<th field="handledMark" width="50" align="center" formatter="formatState">State</th>
  	</tr>
  </thead>
</table>
<div id="tb">
	<div>
		<a href="javascript:errorReview(1)" class="easyui-linkbutton" iconCls="icon-ok" plain="true">Mark handled</a>
	</div>
</div>


</body>
</html>