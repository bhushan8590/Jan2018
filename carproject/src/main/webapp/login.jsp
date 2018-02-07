<jsp:useBean id="user" class="com.carproject.java.User" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>
<jsp:forward page="HandlerServlet"></jsp:forward>