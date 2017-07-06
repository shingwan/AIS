package com.test.ex.cmd;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.ex.Adao.ADao;

public class ADeleteCommand implements ACommand{
	public void execute(HttpServletRequest request, HttpServletResponse response){

		int aId = Integer.parseInt(request.getParameter("aId"));

		ADao dao = new ADao();
		dao.delete(aId);


	}
}
