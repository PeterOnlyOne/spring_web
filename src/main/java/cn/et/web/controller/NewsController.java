package cn.et.web.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.et.web.service.NewsService;

/**
 * Servlet implementation class NewsController
 */
public class NewsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewsController() {
        super();
        // TODO Auto-generated constructor stub
    }

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		NewsService nService = (NewsService) context.getBean("newsServiceImpl");
		System.out.println(nService);
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String contents = request.getParameter("contents");
		Date date = new Date();
		String createtime = sdf.format(date);
		
		List<Map<String, Object>> queryNewsByContent = nService.queryNewsByContent(content);
		request.setAttribute("newsListByContent", queryNewsByContent);
		nService.insert(title, contents, createtime);
		request.getRequestDispatcher("/news.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
