<!DOCTYPE html>
<html lang='en'>
<head><title>HR Application </title>
<link rel='stylesheet' type='text/css' href='/styletwo/css/styles.css'>
</head>
<body>
<form method="post" id="Invalid" action='/stylethree/LoginForm.jsp'></form>
<input type='hidden' id='username' value='${username}'>
<script>
function back(){
var username=document.getElementById("username").value;
if(username.trim()=='null'||username.length==0)
{
document.getElementById("Invalid").submit();
}
}
back();
</script>
<!-- main container starts here -->
<div class='main-container'>
<!-- header starts here -->
<div class='header'>
<img src='/styletwo/images/logo.jpg' class='logo'>
<div class='brand-name'>&nbsp;&nbsp; Stunning Programmer 
<div class='username'>
<img src='/stylethree/images/userlogo.jpg'  style="width:30px;height:30px;">
${username}<a href='/stylethree/logout' style='text-decoration:none'>&nbsp;&nbsp;logout</a></div>
</div>
</div>
<!-- header ends here -->
<!-- content-section starts here -->
<div class='content'>
<!-- left panels ends here -->
<div class='content-left-panel'>
<!-- Designation -->
<a href='/stylethree/Designations.jsp'>Designations</a><br>
<a href='/stylethree/Employees.jsp'>Employees</a><br><br>
<a href='/stylethree/index.jsp'>Home</a>
</div>
<!-- left panel ends here -->
<!-- right panel starts here -->
<div class='content-right-panel'>

