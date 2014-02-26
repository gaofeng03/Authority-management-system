package org.apache.jsp.securityJsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sy.model.base.SessionInfo;
import sy.model.base.Syrole;
import sy.model.base.Syorganization;
import sy.model.base.Syresource;
import sy.model.easyui.Tree;
import sy.util.base.DateUtil;
import sy.util.base.BeanUtils;
import sy.util.base.ConfigUtil;
import sy.util.base.StringUtil;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public final class userInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String contextPath = request.getContextPath();
	SessionInfo sessionInfo = (SessionInfo) session.getAttribute(ConfigUtil.getSessionInfoName());
	Set<Syrole> roles = sessionInfo.getUser().getSyroles();//用户的角色
	Set<Syorganization> organizations = sessionInfo.getUser().getSyorganizations();//用户的机构
	List<Syresource> resources = new ArrayList<Syresource>();//用户可访问的资源
	for (Syrole role : roles) {
		resources.addAll(role.getSyresources());
	}
	for (Syorganization organization : organizations) {
		resources.addAll(organization.getSyresources());
	}
	resources = new ArrayList<Syresource>(new HashSet<Syresource>(resources));//去重
	List<Tree> resourceTree = new ArrayList<Tree>();
	for (Syresource resource : resources) {
		Tree node = new Tree();
		BeanUtils.copyNotNullProperties(resource, node);
		node.setText(resource.getName());
		if (resource.getSyresource() != null) {
			node.setPid(resource.getSyresource().getId());
		}
		resourceTree.add(node);
	}
	String resourceTreeJson = com.alibaba.fastjson.JSON.toJSONString(resourceTree);

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title></title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../inc.jsp", out, false);
      out.write('\r');
      out.write('\n');

	out.println("<script>var resourceTreeJson = '" + resourceTreeJson + "';</script>");

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$('#resources').tree({\r\n");
      out.write("\t\t\tparentField : 'pid',\r\n");
      out.write("\t\t\tdata : eval(\"(\" + resourceTreeJson + \")\")\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\" data-options=\"fit:true,border:false\">\r\n");
      out.write("\t<div data-options=\"region:'center',fit:true,border:false\">\r\n");
      out.write("\t\t<table style=\"width: 100%;\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><fieldset>\r\n");
      out.write("\t\t\t\t\t\t<legend>用户信息</legend>\r\n");
      out.write("\t\t\t\t\t\t<table class=\"table\" style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>用户ID</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(sessionInfo.getUser().getId());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>使用IP</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(sessionInfo.getUser().getIp());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>登录名</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(sessionInfo.getUser().getLoginname());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>姓名</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(sessionInfo.getUser().getName());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>性别</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										if (sessionInfo.getUser().getSex() != null && sessionInfo.getUser().getSex().equals("1")) {
											out.print("男");
										} else {
											out.print("女");
										}
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>年龄</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(sessionInfo.getUser().getAge());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>创建时间</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(DateUtil.dateToString(sessionInfo.getUser().getCreatedatetime()));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>最后修改时间</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(DateUtil.dateToString(sessionInfo.getUser().getUpdatedatetime()));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</fieldset></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t<legend>权限信息</legend>\r\n");
      out.write("\t\t\t\t\t\t<table class=\"table\" style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>角色</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>机构</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>权限</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										out.println("<ul>");
										for (Syrole role : roles) {
											out.println(StringUtil.formateString("<li title='{1}'>{0}</li>", role.getName(), role.getDescription()));
										}
										out.println("</ul>");
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										out.println("<ul>");
										for (Syorganization organization : organizations) {
											out.println(StringUtil.formateString("<li>{0}</li>", organization.getName()));
										}
										out.println("</ul>");
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td valign=\"top\"><ul id=\"resources\"></ul></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
