
// 웹 개발을 하기전 기본 틀!!
package com.marondal.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController extends HttpServlet {
	// 컨 쉽 O 눌러서 기능 추가!
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {		// 컨 쉽 O 눌러서 기능 추가!
		
		PrintWriter out = response.getWriter();
		
		out.println("Hello World!");
	}
	

}