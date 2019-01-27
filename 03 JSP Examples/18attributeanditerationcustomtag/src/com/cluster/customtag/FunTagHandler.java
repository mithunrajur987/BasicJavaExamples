package com.cluster.customtag;

import javax.servlet.jsp.tagext.TagSupport;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class FunTagHandler extends TagSupport {
	private String var;
	int count;
	int n;
	
	public String getVar() {
		return var;
	}
	public void setVar(String var) {
		this.var = var;
	}
	public int doStartTag()
	{
		//return EVAL_BODY_INCLUDE or SKIP_BODY;
		count=1;
		n=Integer.parseInt(var);
		System.out.println("Do Start Tag");
		return EVAL_BODY_INCLUDE;
		
	}
	public int doAfterBody()
	{
		// return  EVAL_BODY_AGAIN or SKIP_BODY
		System.out.println("Do After Body");
		if(count<n)
		{
			count++;
			return EVAL_BODY_AGAIN;
		}
		else
		{
			return SKIP_BODY;
		}
	}
	public int doEndTag()
	{
		//return EVAL_PAGE or SKIP_PAGE
		System.out.println("Do End Tag");
		return EVAL_PAGE;
	}
}