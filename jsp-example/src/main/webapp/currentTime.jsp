<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- 현재 시간 출력 --%>
<h2>현재 시간</h2>
<p>
    <%
        Date now = new Date();
        out.println(now.toString());
    %>
</p>
</body>
</html>
