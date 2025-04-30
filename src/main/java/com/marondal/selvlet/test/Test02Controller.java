package com.marondal.selvlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test03")
//
public class Test02Controller extends HttpServlet {		// extends HttpServlet 적고 컨쉽오 추가
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();  		
		// 프린트라이터 OUT = 리스폰스.겟라이터(); 태그적고 컨쉽오 add 쓰로우 기능을 넣어서 출력기능을 생성한다
		
		out.println(""
				+"<html>\n"
				+"		<head><title>기사</title></head>\n"
				+"		<body>\n"
				+" 		<h2>[단독] 고양이가 야옹해</h2>\n"
				+"		<div>기사 입력시간 : 2025/04/28 16:11:11</div)\n"
				+" 		<hr>\n"
				+"  	<div>끝</div>\n"
				+"  	</body>");
		
	}

}
