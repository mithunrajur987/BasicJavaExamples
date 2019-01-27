package com.cluster.customtag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ShowTagHandler extends TagSupport {
	
	@Override
	public int doStartTag() throws JspException {
		System.out.println("Inside doStartTag() method");
		try {
			pageContext.getResponse().getWriter().println("No 1 Java Training Insitute. Happy Leraning in Cluster");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		//return EVAL_BODY_INCLUDE or SKIP_BODY
		return SKIP_BODY;
	}
	
	@Override
	public int doEndTag() throws JspException {
		System.out.println("Inside doEndTag() method");
		//return EVAL_PAGE or SKIP_PAGE;
		return EVAL_PAGE;
	}

	

}
