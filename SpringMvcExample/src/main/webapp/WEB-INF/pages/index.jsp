<%--
  Created by IntelliJ IDEA.
  User: issam
  Date: 20/10/2016
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<script>

		function getNotify() {
			<% String mp = (String) request.getSession(false).getAttribute("sound"); %>
			var mp = "<%= mp %>";
			console.log("value>>>>>>> "+mp);//returns the actual value
			<%  request.getSession().setAttribute("sound7", mp);  %>
		}

		setInterval(getNotify, 2000);

	</script>
</head>
<body>
	<a href="/SpringMvcExample/sound">go to sound.jsp</a>
</body>
</html>
