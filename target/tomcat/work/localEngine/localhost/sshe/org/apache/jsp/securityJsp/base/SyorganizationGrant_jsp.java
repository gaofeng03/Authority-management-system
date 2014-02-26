package org.apache.jsp.securityJsp.base;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SyorganizationGrant_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\tvar nodes = $('#tree').tree('getChecked', [ 'checked', 'indeterminate' ]);\r\n");
      out.write("\t\tvar ids = [];\r\n");
      out.write("\t\tfor (var i = 0; i < nodes.length; i++) {\r\n");
      out.write("\t\t\tids.push(nodes[i].id);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$.post(sy.contextPath + '/base/syorganization!grant.sy', {\r\n");
      out.write("\t\t\tid : $(':input[name=\"data.id\"]').val(),\r\n");
      out.write("\t\t\tids : ids.join(',')\r\n");
      out.write("\t\t}, function(result) {\r\n");
      out.write("\t\t\tif (result.success) {\r\n");
      out.write("\t\t\t\t$dialog.dialog('destroy');\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$pjq.messager.alert('提示', result.msg, 'error');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$pjq.messager.alert('提示', '授权成功！', 'info');\r\n");
      out.write("\t\t}, 'json');\r\n");
      out.write("\t};\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tparent.$.messager.progress({\r\n");
      out.write("\t\t\ttext : '数据加载中....'\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$('#tree').tree({\r\n");
      out.write("\t\t\turl : sy.contextPath + '/base/syresource!doNotNeedSecurity_getResourcesTree.sy',\r\n");
      out.write("\t\t\tparentField : 'pid',\r\n");
      out.write("\t\t\tcheckbox : true,\r\n");
      out.write("\t\t\tformatter : function(node) {\r\n");
      out.write("\t\t\t\treturn node.name;\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tonLoadSuccess : function(node, data) {\r\n");
      out.write("\t\t\t\t$.post(sy.contextPath + '/base/syresource!doNotNeedSecurity_getOrganizationResources.sy', {\r\n");
      out.write("\t\t\t\t\tid : $(':input[name=\"data.id\"]').val()\r\n");
      out.write("\t\t\t\t}, function(result) {\r\n");
      out.write("\t\t\t\t\tif (result) {\r\n");
      out.write("\t\t\t\t\t\tfor (var i = 0; i < result.length; i++) {\r\n");
      out.write("\t\t\t\t\t\t\tvar node = $('#tree').tree('find', result[i].id);\r\n");
      out.write("\t\t\t\t\t\t\tif (node) {\r\n");
      out.write("\t\t\t\t\t\t\t\tvar isLeaf = $('#tree').tree('isLeaf', node.target);\r\n");
      out.write("\t\t\t\t\t\t\t\tif (isLeaf) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#tree').tree('check', node.target);\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tparent.$.messager.progress('close');\r\n");
      out.write("\t\t\t\t}, 'json');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<input name=\"data.id\" value=\"");
      out.print(id);
      out.write("\" readonly=\"readonly\" type=\"hidden\" />\r\n");
      out.write("\t<fieldset>\r\n");
      out.write("\t\t<legend>机构授权</legend>\r\n");
      out.write("\t\t<ul id=\"tree\"></ul>\r\n");
      out.write("\t</fieldset>\r\n");
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
