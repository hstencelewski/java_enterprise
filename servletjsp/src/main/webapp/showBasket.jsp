<html>
<%@page import="com.example.servletjspdemo.domain.Song"%>
<jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application" />

<br> Basket:
<ol>
<% 
for (Song song : storage.getBasket()) { 
	  out.println("<p><form action='delFromBasket.jsp'><input type='hidden' name='item' value='"+ song.getsongname()+"'>Song Name: " + song.getsongname() + "<br>Band Name: " + song.getbandname() + "<br>Year of Release: " + song.getyor() + "<br>Price: " + song.getprice() + "</input><br><INPUT TYPE=submit name='submit' value='Delete from Basket!'></input></form></p>");
}
%>
</ol>
<p>
  <a href="showAllSongs.jsp">Show all songs</a><br>
  <a href="index.jsp">Main page</a>
</p>
</html>