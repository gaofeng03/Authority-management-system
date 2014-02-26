package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write('\r');
      out.write('\n');

	String contextPath = request.getContextPath();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>系统登录</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc.jsp", out, false);
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\r\n");
      out.write("\t\tvar loginFun = function() {\r\n");
      out.write("\t\t\tvar loginTabs = $('#loginTabs').tabs('getSelected');//当前选中的tab\r\n");
      out.write("\t\t\tvar $form = loginTabs.find('form');//选中的tab里面的form\r\n");
      out.write("\t\t\tif ($form.length == 1 && $form.form('validate')) {\r\n");
      out.write("\t\t\t\t$('#loginBtn').linkbutton('disable');\r\n");
      out.write("\t\t\t\t$.post(sy.contextPath + '/base/syuser!doNotNeedSessionAndSecurity_login.do', $form.serialize(), function(result) {\r\n");
      out.write("\t\t\t\t\tif (result.success) {\r\n");
      out.write("\t\t\t\t\t\tlocation.replace(sy.contextPath + '/index.jsp');\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t$.messager.alert('提示', result.msg, 'error', function() {\r\n");
      out.write("\t\t\t\t\t\t\t$('#loginBtn').linkbutton('enable');\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}, 'json');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\t$('#loginDialog').show().dialog({\r\n");
      out.write("\t\t\tmodal : false,\r\n");
      out.write("\t\t\tclosable : false,\r\n");
      out.write("\t\t\ticonCls : 'ext-icon-lock_open',\r\n");
      out.write("\t\t\tbuttons : [ {\r\n");
      out.write("\t\t\t\ttext : '注册',\r\n");
      out.write("\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\tlocation.replace(sy.contextPath + '/reg.jsp');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tid : 'loginBtn',\r\n");
      out.write("\t\t\t\ttext : '登录',\r\n");
      out.write("\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\tloginFun();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} ],\r\n");
      out.write("\t\t\tonOpen : function() {\r\n");
      out.write("\t\t\t\t$('form :input:first').focus();\r\n");
      out.write("\t\t\t\t$('form :input').keyup(function(event) {\r\n");
      out.write("\t\t\t\t\tif (event.keyCode == 13) {\r\n");
      out.write("\t\t\t\t\t\tloginFun();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$('#userLoginCombobox').combobox({\r\n");
      out.write("\t\t\turl : sy.contextPath + '/base/syuser!doNotNeedSessionAndSecurity_loginNameComboBox.do',\r\n");
      out.write("\t\t\tvalueField : 'loginname',\r\n");
      out.write("\t\t\ttextField : 'loginname',\r\n");
      out.write("\t\t\trequired : true,\r\n");
      out.write("\t\t\tpanelHeight : 'auto',\r\n");
      out.write("\t\t\tmode : 'remote',\r\n");
      out.write("\t\t\tdelay : 500\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$('#userLoginCombogrid').combogrid({\r\n");
      out.write("\t\t\turl : sy.contextPath + '/base/syuser!doNotNeedSessionAndSecurity_loginNameComboGrid.do',\r\n");
      out.write("\t\t\tpanelWidth : 500,\r\n");
      out.write("\t\t\tpanelHeight : 200,\r\n");
      out.write("\t\t\tidField : 'loginname',\r\n");
      out.write("\t\t\ttextField : 'loginname',\r\n");
      out.write("\t\t\tpagination : true,\r\n");
      out.write("\t\t\tfitColumns : true,\r\n");
      out.write("\t\t\trequired : true,\r\n");
      out.write("\t\t\trownumbers : true,\r\n");
      out.write("\t\t\tmode : 'remote',\r\n");
      out.write("\t\t\tdelay : 500,\r\n");
      out.write("\t\t\tsortName : 'loginname',\r\n");
      out.write("\t\t\tsortOrder : 'asc',\r\n");
      out.write("\t\t\tpageSize : 5,\r\n");
      out.write("\t\t\tpageList : [ 5, 10 ],\r\n");
      out.write("\t\t\tcolumns : [ [ {\r\n");
      out.write("\t\t\t\tfield : 'loginname',\r\n");
      out.write("\t\t\t\ttitle : '登录名',\r\n");
      out.write("\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'name',\r\n");
      out.write("\t\t\t\ttitle : '姓名',\r\n");
      out.write("\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'createdatetime',\r\n");
      out.write("\t\t\t\ttitle : '创建时间',\r\n");
      out.write("\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'modifydatetime',\r\n");
      out.write("\t\t\t\ttitle : '最后修改时间',\r\n");
      out.write("\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t} ] ]\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- \r\n");
      out.write("\t<a href=\"");
      out.print(contextPath);
      out.write("/init.jsp\">初始化数据库(");
      out.print(contextPath);
      out.write("/init.jsp)\r\n");
      out.write("\t</a> -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"loginDialog\" title=\"系统登录\" style=\"display: none; width: 320px; height: 180px; overflow: hidden;\">\r\n");
      out.write("\t\t<div id=\"loginTabs\" class=\"easyui-tabs\" data-options=\"fit:true,border:false\">\r\n");
      out.write("\t\t\t<div title=\"用户登陆\" style=\"overflow: hidden; padding: 10px;\">\r\n");
      out.write("\t\t\t\t<form method=\"post\" class=\"form\">\r\n");
      out.write("\t\t\t\t\t<table class=\"table\" style=\"width: 100%; height: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th width=\"50\">登录名</th>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input name=\"data.loginname\" class=\"easyui-validatebox\" data-options=\"required:true\" value=\"administrator\" style=\"width: 210px;\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>密码</th>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input name=\"data.pwd\" type=\"password\" class=\"easyui-validatebox\" data-options=\"required:true\" value=\"123456\" style=\"width: 210px;\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div><!-- \r\n");
      out.write("\t\t\t<div title=\"自动补全模式\" style=\"overflow: hidden; padding: 10px;\">\r\n");
      out.write("\t\t\t\t<form method=\"post\" class=\"form\">\r\n");
      out.write("\t\t\t\t\t<table class=\"table\" style=\"width: 100%; height: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th width=\"50\">登录名</th>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input id=\"userLoginCombobox\" name=\"data.loginname\" type=\"text\" value=\"administrator\" style=\"width: 214px;\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>密码</th>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input name=\"data.pwd\" type=\"password\" class=\"easyui-validatebox\" data-options=\"required:true\" value=\"123456\" style=\"width: 210px;\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div title=\"数据表格模式\" style=\"overflow: hidden; padding: 10px;\">\r\n");
      out.write("\t\t\t\t<form method=\"post\" class=\"form\">\r\n");
      out.write("\t\t\t\t\t<table class=\"table\" style=\"width: 100%; height: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th width=\"50\">登录名</th>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input id=\"userLoginCombogrid\" name=\"data.loginname\" type=\"text\" value=\"administrator\" style=\"width: 214px;\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>密码</th>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input name=\"data.pwd\" type=\"password\" class=\"easyui-validatebox\" data-options=\"required:true\" value=\"123456\" style=\"width: 210px;\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div> -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
