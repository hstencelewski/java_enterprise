<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>Song Info</title>
 </head>
 <body>
 
 <jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application" />
 <jsp:useBean id="song" class="com.example.servletjspdemo.domain.Song" scope="session" />
 
 <form action="addSong.jsp">
 
   Song name :<input type="text" name="songname" value="${song.songname}" /><br />
   Band name :<input type="text" name="bandname" value="${song.bandname}" /><br />
   Year of release :<input type="text"  name="yor" value="${song.yor}" /><br />
   Price :<input type="text"  name="price" value="${song.price}" /><br />
   <input type="submit" value=" OK ">
   
 </form>
 
 </body>
 </html> 