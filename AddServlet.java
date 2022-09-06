package com.telusko_part1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/addition")
public class AddServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int i=Integer.parseInt(req.getParameter("numb1"));
		int j=Integer.parseInt(req.getParameter("numb2"));
		
		int k=i+j;
		PrintWriter out=res.getWriter();
		out.println("the result is " + k);
		
		HttpSession sesn=req.getSession();
		sesn.setAttribute("value",k);
		sesn.setAttribute("value2",i);
		
		res.sendRedirect("sq");
		
//		Cookie cok=new Cookie("cokval",k+"");     	
//		res.addCookie(cok);
		
//		res.sendRedirect("sq?ke="+k);   url rewriting
		
//		session_management
		
//		req.setAttribute("ke",k);
		
//		request_dispatcher
		
//		RequestDispatcher redi=req.getRequestDispatcher("sq");
//		redi.forward(req,res);
	}
		
}
