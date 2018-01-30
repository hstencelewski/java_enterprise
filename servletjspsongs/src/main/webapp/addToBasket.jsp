+<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>Add to Basket</title>
 </head>
 <body>
 <jsp:useBean id="song" class="com.example.servletjspdemo.domain.Song" scope="session" />
 
 <jsp:setProperty name="song" property="*" /> 
 
 <jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application" />
 
 <% 
   storage.addToBasket(song);
 %>
 
 <p>Following song has been added to Basket: </p>
 <p>Song Name: ${song.songname} </p>
 <p>Band Name: <jsp:getProperty name="song" property="bandname"></jsp:getProperty></p>
 <p>Year of Release: ${song.yor} </p>
 <p>Price: <jsp:getProperty name="song" property="price"></jsp:getProperty></p>
 <p>
   <a href="showBasket.jsp">Reveal Basket</a><br>
   <a href="showAllSongs.jsp">Show all Songs</a><br>
   <a href="index.jsp">Home page</a>
 </p>
 </body>
 </html> 