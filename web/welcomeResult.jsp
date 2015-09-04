<%-- 
    Document   : WelcomeResult
    Created on : Sep 4, 2015, 11:09:55 AM
    Author     : Steven
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Result</title>
    </head>
    <body>
        <h1 align="center">Welcome Result (JSP)</h1>
        
        <p>

    <%
        // the getAttribute method returns a plain object, not a String or other type
        
        
        
        Object objList = request.getAttribute("welcome");
        List list = null;
        // cannot cast if null
        if(objList == null) {
            // do something so program doesn't crash, like
            // here we create a list with an error message
           list = new ArrayList();
           list.add("Sorry, list came back empty");
        } else {
            // cast it
            list = (List)objList;
         
        }
        for(Object item : list) {
            // Notice we're outputting some HTML. Is that a good idea?
            // Also, notice we do not cast the object returned by the
            // iterator to a String. Why?
            out.print("<br>try: " + item.toString());
        }
        
        // THIS CODE IS OVERLY COMPLICATED and FRAGILE!!!
        // See result2.jsp for a better way
    %>
    </p>
    <%-- <p><a href="form.html">Back</a></p>
    --%>
    </body>
</html>
