package com.telusko_part1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class part1_servlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int i=Integer.parseInt(req.getParameter("numb1"));
		int j=Integer.parseInt(req.getParameter("numb2"));
		int k=i+j;
		PrintWriter out=res.getWriter();
		out.print("this servlet 1 is"+ k);
		
		ServletContext ctx=getServletContext();
		String st=ctx.getInitParameter("name");
		out.println(st);
		
		ServletConfig con=getServletConfig();
		String str=con.getInitParameter("name");
		out.println(str);
	}

}
