<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>Add a song</title>
 </head>
 <body>
 <jsp:useBean id="song" class="com.example.servletjspdemo.domain.Song" scope="session" />
 
 <jsp:setProperty name="song" property="*" /> 
 
 <jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application" />
 
 <% 
   storage.add(song);
 %>
 
 <p>New Song has been added to storage: </p>
 <p>Song name: ${song.songname} </p>
 <p>Band name: ${song.bandname} </p>
 <p>Year of release: <jsp:getProperty name="song" property="yor"></jsp:getProperty></p>
 <p>Price: <jsp:getProperty name="song" property="price"></jsp:getProperty></p>
 <p>
   <a href="showAllSongs.jsp">Show all songs</a>
   <a href="showBasket.jsp">Show basket</a><br>
   <a href="index.jsp">Home Page</a>
 </p>
 </body>
 </html>