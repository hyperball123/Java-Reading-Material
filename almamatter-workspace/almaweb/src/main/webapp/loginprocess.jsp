<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String uname=request.getParameter("uname");
	if(uname.equals("rahim")){
		RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
		rd.forward(request,response);
	}
	else{
		RequestDispatcher rd=request.getRequestDispatcher("register.jsp");
		rd.forward(request,response);
	}	
	%>
</body>
</html>