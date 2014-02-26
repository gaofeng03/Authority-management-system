package org.apache.jsp.securityJsp.base;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SyresourceForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\tvar submitForm = function($dialog, $grid, $pjq, $mainMenu) {\r\n");
      out.write("\t\tif ($('form').form('validate')) {\r\n");
      out.write("\t\t\tvar url;\r\n");
      out.write("\t\t\tif ($(':input[name=\"data.id\"]').val().length > 0) {\r\n");
      out.write("\t\t\t\turl = sy.contextPath + '/base/syresource!update.do';\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\turl = sy.contextPath + '/base/syresource!save.do';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$.post(url, sy.serializeObject($('form')), function(result) {\r\n");
      out.write("\t\t\t\tif (result.success) {\r\n");
      out.write("\t\t\t\t\t$grid.treegrid('reload');\r\n");
      out.write("\t\t\t\t\t$dialog.dialog('destroy');\r\n");
      out.write("\t\t\t\t\t$mainMenu.tree('reload');\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$pjq.messager.alert('提示', result.msg, 'error');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}, 'json');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\tvar showIcons = function() {\r\n");
      out.write("\t\tvar dialog = parent.sy.modalDialog({\r\n");
      out.write("\t\t\ttitle : '浏览小图标',\r\n");
      out.write("\t\t\turl : sy.contextPath + '/style/icons.jsp',\r\n");
      out.write("\t\t\tbuttons : [ {\r\n");
      out.write("\t\t\t\ttext : '确定',\r\n");
      out.write("\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\tdialog.find('iframe').get(0).contentWindow.selectIcon(dialog, $('#iconCls'));\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} ]\r\n");
      out.write("\t\t});\r\n");
      out.write("\t};\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tif ($(':input[name=\"data.id\"]').val().length > 0) {\r\n");
      out.write("\t\t\tparent.$.messager.progress({\r\n");
      out.write("\t\t\t\ttext : '数据加载中....'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$.post(sy.contextPath + '/base/syresource!getById.do', {\r\n");
      out.write("\t\t\t\tid : $(':input[name=\"data.id\"]').val(),\r\n");
      out.write("\t\t\t}, function(result) {\r\n");
      out.write("\t\t\t\tif (result.id != undefined) {\r\n");
      out.write("\t\t\t\t\t$('form').form('load', {\r\n");
      out.write("\t\t\t\t\t\t'data.id' : result.id,\r\n");
      out.write("\t\t\t\t\t\t'data.name' : result.name,\r\n");
      out.write("\t\t\t\t\t\t'data.url' : result.url,\r\n");
      out.write("\t\t\t\t\t\t'data.syresourcetype.id' : result.syresourcetype.id,\r\n");
      out.write("\t\t\t\t\t\t'data.description' : result.description,\r\n");
      out.write("\t\t\t\t\t\t'data.syresource.id' : result.syresource ? result.syresource.id : '',\r\n");
      out.write("\t\t\t\t\t\t'data.iconCls' : result.iconCls,\r\n");
      out.write("\t\t\t\t\t\t'data.seq' : result.seq,\r\n");
      out.write("\t\t\t\t\t\t'data.target' : result.target\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t$('#iconCls').attr('class', result.iconCls);//设置背景图标\r\n");
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
      out.write("\t\t\t<legend>资源基本信息</legend>\r\n");
      out.write("\t\t\t<table class=\"table\" style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>编号</th>\r\n");
      out.write("\t\t\t\t\t<td><input name=\"data.id\" value=\"");
      out.print(id);
      out.write("\" readonly=\"readonly\" /></td>\r\n");
      out.write("\t\t\t\t\t<th>资源名称</th>\r\n");
      out.write("\t\t\t\t\t<td><input name=\"data.name\" class=\"easyui-validatebox\" data-options=\"required:true\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>资源路径</th>\r\n");
      out.write("\t\t\t\t\t<td><input name=\"data.url\" /></td>\r\n");
      out.write("\t\t\t\t\t<th>资源类型</th>\r\n");
      out.write("\t\t\t\t\t<td><select name=\"data.syresourcetype.id\" class=\"easyui-combobox\" data-options=\"required:true,editable:false,valueField:'id',textField:'name',url:'");
      out.print(contextPath);
      out.write("/base/syresourcetype!doNotNeedSecurity_combobox.do',panelHeight:'auto'\" style=\"width: 155px;\"></select></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>上级资源</th>\r\n");
      out.write("\t\t\t\t\t<td><select id=\"syresource_id\" name=\"data.syresource.id\" class=\"easyui-combotree\" data-options=\"editable:false,idField:'id',textField:'text',parentField:'pid',url:'");
      out.print(contextPath);
      out.write("/base/syresource!doNotNeedSecurity_getMainMenu.do'\" style=\"width: 155px;\"></select><img class=\"iconImg ext-icon-cross\" onclick=\"$('#syresource_id').combotree('clear');\" title=\"清空\" /></td>\r\n");
      out.write("\t\t\t\t\t<th>资源图标</th>\r\n");
      out.write("\t\t\t\t\t<td><input id=\"iconCls\" name=\"data.iconCls\" readonly=\"readonly\" style=\"padding-left: 18px; width: 134px;\" /><img class=\"iconImg ext-icon-zoom\" onclick=\"showIcons();\" title=\"浏览图标\" />&nbsp;<img class=\"iconImg ext-icon-cross\" onclick=\"$('#iconCls').val('');$('#iconCls').attr('class','');\" title=\"清空\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>顺序</th>\r\n");
      out.write("\t\t\t\t\t<td><input name=\"data.seq\" class=\"easyui-numberspinner\" data-options=\"required:true,min:0,max:100000,editable:false\" style=\"width: 155px;\" value=\"100\" /></td>\r\n");
      out.write("\t\t\t\t\t<th>目标</th>\r\n");
      out.write("\t\t\t\t\t<td><input name=\"data.target\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>资源描述</th>\r\n");
      out.write("\t\t\t\t\t<td><textarea name=\"data.description\"></textarea></td>\r\n");
      out.write("\t\t\t\t\t<th></th>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
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
