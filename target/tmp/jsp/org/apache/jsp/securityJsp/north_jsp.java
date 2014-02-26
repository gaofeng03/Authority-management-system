package org.apache.jsp.securityJsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sy.model.base.SessionInfo;

public final class north_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	String contextPath = request.getContextPath();
	SessionInfo sessionInfo = (SessionInfo) session.getAttribute("sessionInfo");

      out.write("\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\">\r\n");
      out.write("\tvar lockWindowFun = function() {\r\n");
      out.write("\t\t$.post(sy.contextPath + '/base/syuser!doNotNeedSessionAndSecurity_logout.do', function(result) {\r\n");
      out.write("\t\t\t$('#loginDialog').dialog('open');\r\n");
      out.write("\t\t}, 'json');\r\n");
      out.write("\t};\r\n");
      out.write("\tvar logoutFun = function() {\r\n");
      out.write("\t\t$.post(sy.contextPath + '/base/syuser!doNotNeedSessionAndSecurity_logout.do', function(result) {\r\n");
      out.write("\t\t\tlocation.replace(sy.contextPath + '/index.jsp');\r\n");
      out.write("\t\t}, 'json');\r\n");
      out.write("\t};\r\n");
      out.write("\tvar showMyInfoFun = function() {\r\n");
      out.write("\t\tvar dialog = parent.sy.modalDialog({\r\n");
      out.write("\t\t\ttitle : '我的信息',\r\n");
      out.write("\t\t\turl : sy.contextPath + '/securityJsp/userInfo.jsp'\r\n");
      out.write("\t\t});\r\n");
      out.write("\t};\r\n");
      out.write("</script>\r\n");
      out.write("<div id=\"sessionInfoDiv\" style=\"position: absolute; right: 10px; top: 5px;\">\r\n");
      out.write("\t");

		if (sessionInfo != null) {
			out.print(sy.util.base.StringUtil.formateString("欢迎您，{0}", sessionInfo.getUser().getLoginname()));
		}
	
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"position: absolute; right: 0px; bottom: 0px;\">\r\n");
      out.write("\t<a href=\"javascript:void(0);\" class=\"easyui-menubutton\" data-options=\"menu:'#layout_north_pfMenu',iconCls:'ext-icon-rainbow'\">更换皮肤</a> <a href=\"javascript:void(0);\" class=\"easyui-menubutton\" data-options=\"menu:'#layout_north_kzmbMenu',iconCls:'ext-icon-cog'\">控制面板</a> <a href=\"javascript:void(0);\" class=\"easyui-menubutton\" data-options=\"menu:'#layout_north_zxMenu',iconCls:'ext-icon-disconnect'\">注销</a>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"layout_north_pfMenu\" style=\"width: 120px; display: none;\">\r\n");
      out.write("\t<div onclick=\"sy.changeTheme('default');\" title=\"default\">default</div>\r\n");
      out.write("\t<div onclick=\"sy.changeTheme('gray');\" title=\"gray\">gray</div>\r\n");
      out.write("\t<div onclick=\"sy.changeTheme('metro');\" title=\"metro\">metro</div>\r\n");
      out.write("\t<div onclick=\"sy.changeTheme('bootstrap');\" title=\"bootstrap\">bootstrap</div>\r\n");
      out.write("\t<div onclick=\"sy.changeTheme('black');\" title=\"black\">black</div>\r\n");
      out.write("\t<div class=\"menu-sep\"></div>\r\n");
      out.write("\t<div onclick=\"sy.changeTheme('metro-blue');\" title=\"metro-blue\">metro-blue</div>\r\n");
      out.write("\t<div onclick=\"sy.changeTheme('metro-gray');\" title=\"metro-gray\">metro-gray</div>\r\n");
      out.write("\t<div onclick=\"sy.changeTheme('metro-green');\" title=\"metro-green\">metro-green</div>\r\n");
      out.write("\t<div onclick=\"sy.changeTheme('metro-orange');\" title=\"metro-orange\">metro-orange</div>\r\n");
      out.write("\t<div onclick=\"sy.changeTheme('metro-red');\" title=\"metro-red\">metro-red</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"layout_north_kzmbMenu\" style=\"width: 100px; display: none;\">\r\n");
      out.write("\t<div data-options=\"iconCls:'ext-icon-user_edit'\" onclick=\"$('#passwordDialog').dialog('open');\">修改密码</div>\r\n");
      out.write("\t<div class=\"menu-sep\"></div>\r\n");
      out.write("\t<div data-options=\"iconCls:'ext-icon-user'\" onclick=\"showMyInfoFun();\">我的信息</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"layout_north_zxMenu\" style=\"width: 100px; display: none;\">\r\n");
      out.write("\t<div data-options=\"iconCls:'ext-icon-lock'\" onclick=\"lockWindowFun();\">锁定窗口</div>\r\n");
      out.write("\t<div class=\"menu-sep\"></div>\r\n");
      out.write("\t<div data-options=\"iconCls:'ext-icon-door_out'\" onclick=\"logoutFun();\">退出系统</div>\r\n");
      out.write("</div>");
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
