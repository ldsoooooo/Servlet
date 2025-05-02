<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<title>날짜 시간</title>
</head>
<body>

	<div class="container">
		
		<%--심플데이트포멧 으로 오늘날짜, 현재시간을 가져오는 기능을 불러온다. --%>
		<%
			Date now = new Date();
			SimpleDateFormat dateFormatter = new SimpleDateFormat("오늘 날짜 yyyy년 M월 d일");
			SimpleDateFormat timeFormatter = new SimpleDateFormat("현재시간 HH시 mm분 ss초");
			
			String dateString = dateFormatter.format(now);
			String timeString = timeFormatter.format(now);
			
			// 날짜와 시간중 어떤정보를 확인하고싶은지 전달받는다 전달받는건 (파라미터값으로).
			// 전달받을 파라미터값을 하나 만든다 what 으로
			// time : 시간, date : 날짜
			
			// 뭘 전달 받을건지?모르니 what 스트링으로 전달받을 값 태그를 만든다.
			String what = request.getParameter("what");
			
			// 둘중 하나를 보여주기 위해서 if문을 만든다.
			String result = null;
			if(what.equals("time")) {
				result = timeString;
			} else {
				result = dateString;
			}
			
		%>
		
		<div class="display-4"><%= result %></div>
		
	</div>
	

</body>
</html>