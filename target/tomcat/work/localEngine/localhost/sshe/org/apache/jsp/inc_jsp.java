package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;

public final class inc_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
      out.write('\r');
      out.write('\n');
String contextPath = request.getContextPath();
      out.write('\r');
      out.write('\n');
String version = "20131115";
      out.write("\r\n");
      out.write("\r\n");

Map<String, Cookie> cookieMap = new HashMap<String, Cookie>();
Cookie[] cookies = request.getCookies();
if (null != cookies) {
	for (Cookie cookie : cookies) {
		cookieMap.put(cookie.getName(), cookie);
	}
}
String easyuiTheme = "bootstrap";//指定如果用户未选择样式，那么初始化一个默认样式
if (cookieMap.containsKey("easyuiTheme")) {
	Cookie cookie = (Cookie) cookieMap.get("easyuiTheme");
	easyuiTheme = cookie.getValue();
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var sy = sy || {};\r\n");
      out.write("sy.contextPath = '");
      out.print(contextPath);
      out.write("';\r\n");
      out.write("sy.basePath = '");
      out.print(basePath);
      out.write("';\r\n");
      out.write("sy.version = '");
      out.print(version);
      out.write("';\r\n");
      out.write("sy.pixel_0 = '");
      out.print(contextPath);
      out.write("/style/images/pixel_0.gif';//0像素的背景，一般用于占位\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(contextPath);
      out.write("/jslib/My97DatePicker4.8Beta3/My97DatePicker/WdatePicker.js\" charset=\"utf-8\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\">window.UEDITOR_HOME_URL = '");
      out.print(contextPath);
      out.write("/jslib/ueditor1_2_6_1-utf8-jsp/';</script>\r\n");
      out.write("<script src=\"");
      out.print(contextPath);
      out.write("/jslib/ueditor1_2_6_1-utf8-jsp/ueditor.config.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("<script src=\"");
      out.print(contextPath);
      out.write("/jslib/ueditor1_2_6_1-utf8-jsp/ueditor.all.min.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

String User_Agent = request.getHeader("User-Agent");
if (StringUtils.indexOfIgnoreCase(User_Agent, "MSIE") > -1 && (StringUtils.indexOfIgnoreCase(User_Agent, "MSIE 6") > -1 || StringUtils.indexOfIgnoreCase(User_Agent, "MSIE 7") > -1 || StringUtils.indexOfIgnoreCase(User_Agent, "MSIE 8") > -1)) {
	out.println("<script src='" + contextPath + "/jslib/jquery-1.9.1.js' type='text/javascript' charset='utf-8'></script>");
} else {
	out.println("<script src='" + contextPath + "/jslib/jquery-2.0.3.js' type='text/javascript' charset='utf-8'></script>");
}

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<script src=\"");
      out.print(contextPath);
      out.write("/jslib/syExtJquery.js?version=");
      out.print(version);
      out.write("\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.print(contextPath);
      out.write("/jslib/Highcharts-3.0.6/js/highcharts.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("<script src=\"");
      out.print(contextPath);
      out.write("/jslib/Highcharts-3.0.6/js/modules/exporting.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.print(contextPath);
      out.write("/jslib/syExtHighcharts.js?version=");
      out.print(version);
      out.write("\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(contextPath);
      out.write("/jslib/plupload-2.0.0/js/plupload.full.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(contextPath);
      out.write("/jslib/plupload-2.0.0/js/i18n/zh_CN.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link id=\"easyuiTheme\" rel=\"stylesheet\" href=\"");
      out.print(contextPath);
      out.write("/jslib/jquery-easyui-1.3.4/themes/");
      out.print(easyuiTheme);
      out.write("/easyui.css\" type=\"text/css\">\r\n");
      out.write("<!-- <link rel=\"stylesheet\" href=\"");
      out.print(contextPath);
      out.write("/jslib/jquery-easyui-1.3.4/themes/icon.css\" type=\"text/css\"> -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(contextPath);
      out.write("/jslib/jquery-easyui-1.3.4/jquery.easyui.min.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(contextPath);
      out.write("/jslib/jquery-easyui-1.3.4/locale/easyui-lang-zh_CN.js\" charset=\"utf-8\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(contextPath);
      out.write("/jslib/jquery-easyui-portal/portal.css\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(contextPath);
      out.write("/jslib/jquery-easyui-portal/jquery.portal.js\" charset=\"utf-8\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.print(contextPath);
      out.write("/jslib/syExtEasyUI.js?version=");
      out.print(version);
      out.write("\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(contextPath);
      out.write("/style/syExtIcon.css?version=");
      out.print(version);
      out.write("\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(contextPath);
      out.write("/style/syExtCss.css?version=");
      out.print(version);
      out.write("\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.print(contextPath);
      out.write("/jslib/syExtJavascript.js?version=");
      out.print(version);
      out.write("\" type=\"text/javascript\" charset=\"utf-8\"></script>");
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
