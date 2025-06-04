<%--
  Created by IntelliJ IDEA.
  User: jiwon
  Date: 25. 6. 4.
  Time: 오후 1:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>서블릿에서 전달된 처리 결과를 html파일에 넣어서 응답을 만들기 위한 파일!</h1>
    <hr>
    전달된 id : <%= request.getAttribute("userid") %> <br>
    <%--    표현식, expression --%>
    전달된 pw : ${passwd}<br>
    <%--    표현 언어(EL) : 속성으로 지정된 값을 출력할 때 . if문... --%>
</body>
</html>
