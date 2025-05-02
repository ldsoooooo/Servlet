<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>

	<%-- 키와 몸무게를 입력받아서 BMI 수치를 계산하고 비만도를 표시하기 --%>
	
	<%
	
		int weight = Integer.parseInt(request.getParameter("weight"));
		int height = Integer.parseInt(request.getParameter("height"));
		
		double BMI = weight / ((height / 100.0) * (height / 100.0));
		
		// int는 기본값0 String은 null로 사용한다~!
		String result = null;
		if(BMI < 18.5) {
			result = "저체중";
		} else if(BMI >= 18.5 & BMI < 25) {
			result = "정상";
		} else if(BMI >= 25 & BMI < 30) {
			result = "과체중";
		} else {
			result = "비만";
		}
		
	%>
	
	<div class="container">	
		<h2>BMI 측정 결과</h2>
		<div class="display-4">당신은 <span class="text-info"><%= result %></span> 입니다.</div>
		<div>BMI 수치 : <%= BMI %></div>
	</div>

</body>
</html>