package com.telusko_part1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/sq")
public class sqrservlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		HttpSession ses=req.getSession();
//		ses.removeAttribute("value"); we can also remove the value
		int k=(int)ses.getAttribute("value");
		int m=(int)ses.getAttribute("value2");
		
//		int k=0;
//		Cookie cokks[]=req.getCookies();
//		for(Cookie c:cokks) {
//			if(c.getName().equals("cokval"))
//				k=Integer.parseInt(c.getValue());
//		}
		 
//		int k=Integer.parseInt(req.getParameter("ke")); for url
		
//		int k=(int) req.getAttribute("ke");
		
		k=k*k;
		PrintWriter out=res.getWriter();
		out.println("hiii result is "+ k);
		out.println("this is value2 "+ m);

	}

}
