<%@page import="com.example.servletjspdemo.domain.Song"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>All SOngs</title>
 </head>
 <body>
 
 <jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application" />
 <%
   for (Song song : storage.getAllSongs()) { 
 	  out.println("<p><form action='addToBasket.jsp'><input type='hidden' name='item' value='"+ song.getsongname()+"'>Song Name: " + song.getsongname() + "<br>Band Name: " + song.getbandname() + "<br>Year of Release: " + song.getyor() + "<br>Price: " + song.getprice() + "</input><br><INPUT TYPE=submit name='submit' value='Added to Basket!'></input></form></p>");
   }
 %>
 
 <p>
   <a href="getSongData.jsp">Add another song</a><br>
   <a href="showBasket.jsp">Show Basket</a><br>
   <a href="index.jsp">Main page</a>
 </p>
 
 </body>
 </html>