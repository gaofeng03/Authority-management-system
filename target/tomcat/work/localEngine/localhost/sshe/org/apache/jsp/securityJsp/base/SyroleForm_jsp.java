package org.apache.jsp.securityJsp.base;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SyroleForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

	String id = request.getParameter("id");
	if (id == null) {
		id = "";
	}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title></title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../inc.jsp", out, false);
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar submitForm = function($dialog, $grid, $pjq) {\r\n");
      out.write("\t\tif ($('form').form('validate')) {\r\n");
      out.write("\t\t\tvar url;\r\n");
      out.write("\t\t\tif ($(':input[name=\"data.id\"]').val().length > 0) {\r\n");
      out.write("\t\t\t\turl = sy.contextPath + '/base/syrole!update.sy';\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\turl = sy.contextPath + '/base/syrole!save.sy';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$.post(url, sy.serializeObject($('form')), function(result) {\r\n");
      out.write("\t\t\t\tif (result.success) {\r\n");
      out.write("\t\t\t\t\t$grid.datagrid('load');\r\n");
      out.write("\t\t\t\t\t$dialog.dialog('destroy');\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$pjq.messager.alert('提示', result.msg, 'error');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}, 'json');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tif ($(':input[name=\"data.id\"]').val().length > 0) {\r\n");
      out.write("\t\t\tparent.$.messager.progress({\r\n");
      out.write("\t\t\t\ttext : '数据加载中....'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$.post(sy.contextPath + '/base/syrole!getById.sy', {\r\n");
      out.write("\t\t\t\tid : $(':input[name=\"data.id\"]').val()\r\n");
      out.write("\t\t\t}, function(result) {\r\n");
      out.write("\t\t\t\tif (result.id != undefined) {\r\n");
      out.write("\t\t\t\t\t$('form').form('load', {\r\n");
      out.write("\t\t\t\t\t\t'data.id' : result.id,\r\n");
      out.write("\t\t\t\t\t\t'data.name' : result.name,\r\n");
      out.write("\t\t\t\t\t\t'data.description' : result.description,\r\n");
      out.write("\t\t\t\t\t\t'data.seq' : result.seq\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tparent.$.messager.progress('close');\r\n");
      out.write("\t\t\t}, 'json');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form method=\"post\" class=\"form\">\r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\t\t\t<legend>角色基本信息</legend>\r\n");
      out.write("\t\t\t<table class=\"table\" style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>编号</th>\r\n");
      out.write("\t\t\t\t\t<td><input name=\"data.id\" value=\"");
      out.print(id);
      out.write("\" readonly=\"readonly\" /></td>\r\n");
      out.write("\t\t\t\t\t<th>角色名称</th>\r\n");
      out.write("\t\t\t\t\t<td><input name=\"data.name\" class=\"easyui-validatebox\" data-options=\"required:true\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>顺序</th>\r\n");
      out.write("\t\t\t\t\t<td><input name=\"data.seq\" class=\"easyui-numberspinner\" data-options=\"required:true,min:0,max:100000,editable:false\" style=\"width: 155px;\" value=\"100\" /></td>\r\n");
      out.write("\t\t\t\t\t<th>角色描述</th>\r\n");
      out.write("\t\t\t\t\t<td><textarea name=\"data.description\"></textarea></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t</form>\r\n");
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
