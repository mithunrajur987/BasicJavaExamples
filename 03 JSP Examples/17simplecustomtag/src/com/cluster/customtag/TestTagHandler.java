package com.cluster.customtag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class TestTagHandler implements Tag {
	
	Tag p;
	PageContext pc;
	
	@Override
	public void setPageContext(PageContext p) {
		System.out.println("Inside setPageContext() method");
		pc = p;

	}
	
	@Override
	public void setParent(Tag t) {
		System.out.println("Inside setParent() method");
		p = t;
	}

	@Override
	public Tag getParent() {
		System.out.println("Inside getParent() method");
		return p;
	}

	@Override
	public int doStartTag() throws JspException {
		System.out.println("Inside doStartTag() method");
		try {
			pc.getResponse().getWriter().println(" Hi guys");
			pc.getResponse().getWriter().println("Welcome To");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		//return EVAL_BODY_INCLUDE or SKIP_BODY
		return EVAL_BODY_INCLUDE;
	}
	
	@Override
	public int doEndTag() throws JspException {
		System.out.println("Inside doEndTag() method");
		//return EVAL_PAGE or SKIP_PAGE;
		return EVAL_PAGE;
	}

	@Override
	public void release() {
		System.out.println("Inside release() method");

	}
}
