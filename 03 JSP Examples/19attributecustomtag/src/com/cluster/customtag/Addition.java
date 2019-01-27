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
public class Addition implements Tag{
	PageContext pc;
	private String x;
	private String y;
	

	public String getX() {
		System.out.println("Inside getter method of X");
		return x;
	}


	public void setX(String x) {
		System.out.println("Inside setter method of X");
		this.x = x;
	}


	public String getY() {
		System.out.println("Inside getter method of Y");
		return y;
	}


	public void setY(String y) {
		System.out.println("Inside setter method of Y");
		this.y = y;
	}


	public void setPageContext(PageContext pc) {
		System.out.println("Inside setPageContext() method");
		this.pc=pc;
	}

	
	public void setParent(Tag t) {
		System.out.println("Inside setParent() method");
	}

	
	public Tag getParent() {
		System.out.println("Inside getParent() method");
		return null;
	}

	
	public int doStartTag() throws JspException 
	{
		System.out.println("Inside doStartTag() method");
		int p = Integer.parseInt(x);
		int q = Integer.parseInt(y);
		int sum = p + q;
		
		try
		{    
			pc.getResponse().getWriter().println("Value of num1 = " + p +"<br>");
			pc.getResponse().getWriter().println("Value of num2 = " +q +"<br>");
			pc.getResponse().getWriter().println("Addition of num1 and num2 = " +sum+"<br>");
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

	
	public int doEndTag() throws JspException {
		
		System.out.println("Inside doEndTag() method");
		return EVAL_PAGE;
	}

	
	public void release() {
		System.out.println("Inside release() method");
		
	}
}
