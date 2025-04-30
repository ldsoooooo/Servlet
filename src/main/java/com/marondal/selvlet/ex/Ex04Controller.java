package com.marondal.selvlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex04")
public class Ex04Controller extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// 이름과 생년월일을 전달받고,
		// 이름과 나이를 HTML로 구성!
		
		// 기본적용 3개 리스폰.셋캐릭터인코딩utf-8 // 리스폰.셋컨텐츠타입어플리케이션json //프린트라이터 out = 리스폰겟라이터
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		
		int year = Integer.parseInt(birthday.substring(0, 4));
		
		int age = 2025 - year + 1;
		
		out.println(""
				+"<html>\n"
				+"		<head><title>정보</title></head>\n"
				+" 		<body>\n");
		
		out.println(""
				+" 			<h3>이름 : " + name + "</h3>\n"
				+" 			<h3>나이 : " + age + "</h3>\n");
		
		
		
		out.println(""
				+" 		</body>\n"
				+"</html>");
		
		
		
		
	}

}
