package com.marondal.selvlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test07")
public class Test07Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();

		// 주소 결제카드 가격정보를 전달받고 결과화면을 보여주는 페이지 생성하기
//		아래 조건에 해당 할 경우 제시된 안내 문구를 표시하세요.
//		전달받은 주소에 서울시 가 포함되어 있지 않으면, 배달 불가 지역입니다 를 출력하세요.
//		전달 받은 결제 카드가 신한카드인 경우 결제 불가 카드 입니다. 를 출력하세요.
		
		
		String address = request.getParameter("address");
		String creditCard = request.getParameter("creditcard");
		String price = request.getParameter("price");		
		
		out.println(""
				+"<html>\n"
				+"		<head><title>배달 정보</title></head>\n"
				+" 		<body>\n");
				
		// 서울시가 포함되면 실행, 안되면 실행안함! 경고메세지출력!
		if(!address.contains("서울시")) {
			out.println("<h3>배달불가 지역입니다.</h3>");
		} else if (creditCard.equals("신한카드")) {
			out.println("<h3>결제불가 카드입니다.</h3>");
		} else {
			out.println(""
					+" 			<h3>" + address + " 배달 준비중</h3>\n"
					+" 			<hr>\n"
					+" 			<div>결제금액 : " + price + "원 </div>\n");
			
		}
		
		out.println(""
				+" 		</body>\n"
				+"</html>");
		
		
		
		
	}
}
