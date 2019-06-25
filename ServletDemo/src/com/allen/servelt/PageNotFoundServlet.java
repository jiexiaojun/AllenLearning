package com.allen.servelt;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageNotFoundServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 设置响应的编码格式为UTF-8编码，否则发生中文乱码现象
		response.setContentType("text/html;charset=UTF-8");
		// 1.获得请求方式
		String method = request.getMethod();
		// 2.获得请求的资源相关的内容
		String requestURI = request.getRequestURI();// 获得请求URI
		StringBuffer requestURL = request.getRequestURL();
		String webName = request.getContextPath();// 获得应用路径（应用名称）
		String querryString = request.getQueryString();// 获得查询字符串

		response.getWriter().write("<h1>下面是获得的字符串</h1>");
		response.getWriter().write("<h1>method(HTTP方法):<h1>");
		response.getWriter().write("<h1>" + method + "</h1><br>");
		response.getWriter().write("<h1>requestURi(请求URI）:</h1>");
		response.getWriter().write("<h1>" + requestURI + "</h1><br>");
		response.getWriter().write("<h1>webname(应用名称):</h1>");
		response.getWriter().write("<h1>" + webName + "</h1><br>");
		response.getWriter().write("<h1>querrystring(查询字符串):</h1>");
		response.getWriter().write("<h1>" + querryString + "</h1>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		String url = request.getRequestURI();
		PrintWriter writer = response.getWriter();
		writer.println(url + "PageNotFoundServlet的doPost");
	}


}
