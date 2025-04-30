package com.marondal.selvlet.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex01Controller extends HttpServlet { 		// extends HttpServlet 넣고 컨쉽오 
	
	@Override	// 오버라이드 밑에 양식 적고 컨쉽오
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// 결과물에대한 정보 설정
		// Response Header
		// Character set : utf-8
		response.setCharacterEncoding("utf-8");
		// 데이터 타입
		// MIME : 데이터의 타입을 구분하기 위한 정해진 문자열 (PNG,JPG 같은)
		response.setContentType("text/plain");
		
		// 실제 결과물을 출력 : Response Body
		PrintWriter out = response.getWriter(); 	// PrintWriter 기능 넣고 컨쉽오! response.getWriter(); 적고 throws클릭
		out.println("Servlet Response!!");
		
		Date now = new Date();
		
		out.println(now);
		
		// Date 객체의 날짜 시간 정보를 원하는 규격의 날짜 시간 문자열로 만들기.
		// 2025년 04월 25일 16:54:11 금요일
		SimpleDateFormat formatter = new SimpleDateFormat("현재 시간은 HH시 mm분 ss초 입니다.");
		
		String dateTimeString = formatter.format(now);
		
		out.println(dateTimeString);
		
		
		
		
	}

}
