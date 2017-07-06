package com.test.ex.cmd;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.ex.common.ActionForward;

public interface Action {
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception;

}
