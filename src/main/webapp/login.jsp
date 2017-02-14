<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<SCRIPT type="text/javascript">

function checkForm(){
	var userName=$("#userName").val();
	var password=$("#password").val();
	if(userName==null||userName==""){
		$("#error").html("用户名不能为空！");
		return false;
	}
	if(password==null||password==""){
		$("#error").html("密码不能为空！");
		return false;
	}
	return true;
}
</SCRIPT>
  <head>

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>BMS Login Page</title>

    <!-- Bootstrap -->
    <!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

  </head>
  <body>
  	<div class="container">    
       <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
          <div class="panel panel-info" >
             <div class="panel-heading">
                 <div class="panel-title">ITU BMS login</div>
             </div>     
             <div style="padding-top:30px" class="panel-body" >
                 <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>
                                    
                 <form id="loginform" class="form-horizontal"  action="${pageContext.request.contextPath}/public/system/login.do" method="post" onsubmit="return checkForm()">
                           
                   <div style="margin-bottom: 25px" class="input-group">
                       <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                       <input id="userName" type="text" class="form-control" name="userName" value="${user.userName }" placeholder="username">                                        
                   </div>
                        
                   <div style="margin-bottom: 25px" class="input-group">
                       <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                       <input id="password" type="password" class="form-control" name="password" value="${user.password }"placeholder="password">
                   </div>
                   
                   <div style="margin-top:10px" class="form-group">
                       <!-- Button -->
                       <div class="col-sm-12 controls">
                         <div class="btn-group" role="group" aria-label="...">
						  <button type="submit" class="btn btn-success" >Login</button>
						</div>
                       </div>
                    </div>
                    
                    <div>
                    	<span><font color="red" id="error">${errorInfo }</font></span>
                    </div>
                    
                 </form>     
              </div>                     
           </div>  
        </div>
     </div>
  </body>
</html>