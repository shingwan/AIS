package com.test.ex.cmd;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.ex.Adao.ADao;

public class AModifyCommand implements ACommand{

	public void execute(HttpServletRequest request, HttpServletResponse response){
		int aId = Integer.parseInt(request.getParameter("aId"));
		String aName = request.getParameter("aName");
		String aStetas = request.getParameter("sc");
		String aContentM = request.getParameter("aContentM");
		String aContentG = request.getParameter("aContentG");
		String aSpace = request.getParameter("aSpace");
		String aDay = request.getParameter("aDay");
		int aNumber = Integer.parseInt(request.getParameter("aNumber"));
		String aSkill = request.getParameter("aSkill");
		String aYoken = request.getParameter("aYoken");
		String aSangryu = request.getParameter("aSangryu");
		String aEtc = request.getParameter("aEtc");
		String aManager = request.getParameter("aManager");

		ADao dao = new ADao ();
		dao.modify(aId,aName, aStetas, aContentM, aContentG, aSpace, aDay,aNumber,aSkill, aYoken, aSangryu, aEtc, aManager);

	}
}
