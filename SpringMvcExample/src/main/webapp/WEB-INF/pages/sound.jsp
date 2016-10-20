<%--
  Created by IntelliJ IDEA.
  User: issam
  Date: 20/10/2016
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script>
        <% String postSound = (String) request.getSession(false).getAttribute("sound7"); %>
        var postSound = "<%= postSound %>";
        console.log("value of postSound>>>>>>> "+ postSound );
    </script>
</head>
<body>
</body>
</html>
