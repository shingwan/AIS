package com.test.ex.cmd;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.ex.Adao.ADao;
import com.test.ex.Adto.ADto;

public class AListCommand implements ACommand{
	public void execute(HttpServletRequest request, HttpServletResponse response){
		ADao dao = new ADao();
		ArrayList<ADto> dtos = dao.list();
		request.setAttribute("list", dtos);
	}
}
