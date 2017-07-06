package com.test.ex.frontcon;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.ex.cmd.ACommand;
import com.test.ex.cmd.ADeleteCommand;
import com.test.ex.cmd.AListCommand;
import com.test.ex.cmd.AModifyCommand;
import com.test.ex.cmd.AViewCommand;
import com.test.ex.cmd.AWriteCommand;
import com.test.ex.cmd.Action;
import com.test.ex.cmd.BoardListCommand;

/**
 * Servlet implementation class frontController
 */
@WebServlet("*.do")
public class frontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public frontController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("do get");
		try {
			actionDo(request, response);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("do post");
		try {
			actionDo(request, response);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("actionDo");

		request.setCharacterEncoding("utf-8");
		ACommand command = null;
		Action command2 = null;
		String viewPage = null;

		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String cmd = uri.substring(conPath.length());

		if (cmd.equals("/write_view.do")) {
			viewPage = "write_form.jsp";
		} else if (cmd.equals("/write.do")) {
			command = new AWriteCommand();
			command.execute(request, response);
			viewPage = "list.do";
		} else if (cmd.equals("/list.do")) {
			command = new AListCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
		} else if (cmd.equals("/view.do")) {
			command = new AViewCommand();
			command.execute(request, response);
			viewPage = "view.jsp";
		} else if (cmd.equals("/modify.do")) {
			command = new AModifyCommand();
			command.execute(request, response);
			viewPage = "list.do";
		}else if (cmd.equals("/delete.do")) {
			command = new ADeleteCommand();
			command.execute(request, response);
			viewPage = "list.do";
		}else if (cmd.equals("/BoardListForm.do")){
			command2 = new BoardListCommand();
			command2.execute(request, response);
			viewPage = "BoardListForm.do";
		}

		RequestDispatcher dispat = request.getRequestDispatcher(viewPage);
		dispat.forward(request, response);

	}

}
