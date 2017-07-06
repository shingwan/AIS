package com.test.ex.cmd;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.ex.Adao.ADao;
import com.test.ex.Adto.ADto;

public class AViewCommand implements ACommand{

	public void execute(HttpServletRequest request, HttpServletResponse response){
		String aId = request.getParameter("aId");
		ADao dao = new ADao();
		ADto dto = dao.view(aId);

		request.setAttribute("view", dto);

	}
}
