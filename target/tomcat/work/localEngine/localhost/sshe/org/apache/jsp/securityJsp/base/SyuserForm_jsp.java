package org.apache.jsp.securityJsp.base;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SyuserForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\tvar uploader;//上传对象\r\n");
      out.write("\tvar submitNow = function($dialog, $grid, $pjq) {\r\n");
      out.write("\t\tvar url;\r\n");
      out.write("\t\tif ($(':input[name=\"data.id\"]').val().length > 0) {\r\n");
      out.write("\t\t\turl = sy.contextPath + '/base/syuser!update.sy';\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\turl = sy.contextPath + '/base/syuser!save.sy';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$.post(url, sy.serializeObject($('form')), function(result) {\r\n");
      out.write("\t\t\tparent.sy.progressBar('close');//关闭上传进度条\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (result.success) {\r\n");
      out.write("\t\t\t\t$pjq.messager.alert('提示', result.msg, 'info');\r\n");
      out.write("\t\t\t\t$grid.datagrid('load');\r\n");
      out.write("\t\t\t\t$dialog.dialog('destroy');\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$pjq.messager.alert('提示', result.msg, 'error');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}, 'json');\r\n");
      out.write("\t};\r\n");
      out.write("\tvar submitForm = function($dialog, $grid, $pjq) {\r\n");
      out.write("\t\tif ($('form').form('validate')) {\r\n");
      out.write("\t\t\tif (uploader.files.length > 0) {\r\n");
      out.write("\t\t\t\tuploader.start();\r\n");
      out.write("\t\t\t\tuploader.bind('StateChanged', function(uploader) {// 在所有的文件上传完毕时，提交表单\r\n");
      out.write("\t\t\t\t\tif (uploader.files.length === (uploader.total.uploaded + uploader.total.failed)) {\r\n");
      out.write("\t\t\t\t\t\tsubmitNow($dialog, $grid, $pjq);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tsubmitNow($dialog, $grid, $pjq);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\r\n");
      out.write("\t\tif ($(':input[name=\"data.id\"]').val().length > 0) {\r\n");
      out.write("\t\t\tparent.$.messager.progress({\r\n");
      out.write("\t\t\t\ttext : '数据加载中....'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$.post(sy.contextPath + '/base/syuser!getById.sy', {\r\n");
      out.write("\t\t\t\tid : $(':input[name=\"data.id\"]').val()\r\n");
      out.write("\t\t\t}, function(result) {\r\n");
      out.write("\t\t\t\tif (result.id != undefined) {\r\n");
      out.write("\t\t\t\t\t$('form').form('load', {\r\n");
      out.write("\t\t\t\t\t\t'data.id' : result.id,\r\n");
      out.write("\t\t\t\t\t\t'data.name' : result.name,\r\n");
      out.write("\t\t\t\t\t\t'data.loginname' : result.loginname,\r\n");
      out.write("\t\t\t\t\t\t'data.sex' : result.sex,\r\n");
      out.write("\t\t\t\t\t\t'data.age' : result.age,\r\n");
      out.write("\t\t\t\t\t\t'data.photo' : result.photo\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\tif (result.photo) {\r\n");
      out.write("\t\t\t\t\t\t$('#photo').attr('src', sy.contextPath + result.photo);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tparent.$.messager.progress('close');\r\n");
      out.write("\t\t\t}, 'json');\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tuploader = new plupload.Uploader({//上传插件定义\r\n");
      out.write("\t\t\tbrowse_button : 'pickfiles',//选择文件的按钮\r\n");
      out.write("\t\t\tcontainer : 'container',//文件上传容器\r\n");
      out.write("\t\t\truntimes : 'html5,flash',//设置运行环境，会按设置的顺序，可以选择的值有html5,gears,flash,silverlight,browserplus,html4\r\n");
      out.write("\t\t\tflash_swf_url : sy.contextPath + '/jslib/plupload_1_5_7/plupload/js/plupload.flash.swf',// Flash环境路径设置\r\n");
      out.write("\t\t\turl : sy.contextPath + '/plupload?fileFolder=/userPhoto',//上传文件路径\r\n");
      out.write("\t\t\tmax_file_size : '5mb',//100b, 10kb, 10mb, 1gb\r\n");
      out.write("\t\t\tchunk_size : '10mb',//分块大小，小于这个大小的不分块\r\n");
      out.write("\t\t\tunique_names : true,//生成唯一文件名\r\n");
      out.write("\t\t\t// 如果可能的话，压缩图片大小\r\n");
      out.write("\t\t\t/*resize : {\r\n");
      out.write("\t\t\t\twidth : 320,\r\n");
      out.write("\t\t\t\theight : 240,\r\n");
      out.write("\t\t\t\tquality : 90\r\n");
      out.write("\t\t\t},*/\r\n");
      out.write("\t\t\t// 指定要浏览的文件类型\r\n");
      out.write("\t\t\tfilters : [ {\r\n");
      out.write("\t\t\t\ttitle : '图片文件',\r\n");
      out.write("\t\t\t\textensions : 'jpg,gif,png'\r\n");
      out.write("\t\t\t} ]\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tuploader.bind('Init', function(up, params) {//初始化时\r\n");
      out.write("\t\t\t//$('#filelist').html(\"<div>当前运行环境: \" + params.runtime + \"</div>\");\r\n");
      out.write("\t\t\t$('#filelist').html(\"\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tuploader.bind('BeforeUpload', function(uploader, file) {//上传之前\r\n");
      out.write("\t\t\tif (uploader.files.length > 1) {\r\n");
      out.write("\t\t\t\tparent.$.messager.alert('提示', '只允许选择一张照片！', 'error');\r\n");
      out.write("\t\t\t\tuploader.stop();\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$('.ext-icon-cross').hide();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tuploader.bind('FilesAdded', function(up, files) {//选择文件后\r\n");
      out.write("\t\t\t$.each(files, function(i, file) {\r\n");
      out.write("\t\t\t\t$('#filelist').append('<div id=\"' + file.id + '\">' + file.name + '(' + plupload.formatSize(file.size) + ')<strong></strong>' + '<span onclick=\"uploader.removeFile(uploader.getFile($(this).parent().attr(\\'id\\')));$(this).parent().remove();\" style=\"cursor:pointer;\" class=\"ext-icon-cross\" title=\"删除\">&nbsp;&nbsp;&nbsp;&nbsp;</span></div>');\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tup.refresh();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tuploader.bind('UploadProgress', function(up, file) {//上传进度改变\r\n");
      out.write("\t\t\tvar msg;\r\n");
      out.write("\t\t\tif (file.percent == 100) {\r\n");
      out.write("\t\t\t\tmsg = '99';//因为某些大文件上传到服务器需要合并的过程，所以强制客户看到99%，等后台合并完成...\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tmsg = file.percent;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$('#' + file.id + '>strong').html(msg + '%');\r\n");
      out.write("\r\n");
      out.write("\t\t\tparent.sy.progressBar({//显示文件上传滚动条\r\n");
      out.write("\t\t\t\ttitle : '文件上传中...',\r\n");
      out.write("\t\t\t\tvalue : msg\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tuploader.bind('Error', function(up, err) {//出现错误\r\n");
      out.write("\t\t\t$('#filelist').append(\"<div>错误代码: \" + err.code + \", 描述信息: \" + err.message + (err.file ? \", 文件名称: \" + err.file.name : \"\") + \"</div>\");\r\n");
      out.write("\t\t\tup.refresh();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tuploader.bind('FileUploaded', function(up, file, info) {//上传完毕\r\n");
      out.write("\t\t\tvar response = $.parseJSON(info.response);\r\n");
      out.write("\t\t\tif (response.status) {\r\n");
      out.write("\t\t\t\t$('#' + file.id + '>strong').html(\"100%\");\r\n");
      out.write("\t\t\t\t//console.info(response.fileUrl);\r\n");
      out.write("\t\t\t\t//console.info(file.name);\r\n");
      out.write("\t\t\t\t//$('#f1').append('<input type=\"hidden\" name=\"fileUrl\" value=\"'+response.fileUrl+'\"/>');\r\n");
      out.write("\t\t\t\t//$('#f1').append('<input type=\"hidden\" name=\"fileName\" value=\"'+file.name+'\"/><br/>');\r\n");
      out.write("\t\t\t\t$(':input[name=\"data.photo\"]').val(response.fileUrl);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tuploader.init();\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form method=\"post\" class=\"form\">\r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\t\t\t<legend>用户基本信息</legend>\r\n");
      out.write("\t\t\t<table class=\"table\" style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>编号</th>\r\n");
      out.write("\t\t\t\t\t<td><input name=\"data.id\" value=\"");
      out.print(id);
      out.write("\" readonly=\"readonly\" /></td>\r\n");
      out.write("\t\t\t\t\t<th>登陆名称</th>\r\n");
      out.write("\t\t\t\t\t<td><input name=\"data.loginname\" class=\"easyui-validatebox\" data-options=\"required:true\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>姓名</th>\r\n");
      out.write("\t\t\t\t\t<td><input name=\"data.name\" /></td>\r\n");
      out.write("\t\t\t\t\t<th>性别</th>\r\n");
      out.write("\t\t\t\t\t<td><select class=\"easyui-combobox\" name=\"data.sex\" data-options=\"panelHeight:'auto',editable:false\" style=\"width: 155px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">男</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\">女</option>\r\n");
      out.write("\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>照片上传</th>\r\n");
      out.write("\t\t\t\t\t<td><div id=\"container\">\r\n");
      out.write("\t\t\t\t\t\t\t<a id=\"pickfiles\" href=\"javascript:void(0);\" class=\"easyui-linkbutton\" data-options=\"iconCls:'ext-icon-zoom'\">选择文件</a>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"filelist\">您的浏览器没有安装Flash插件，或不支持HTML5！</div>\r\n");
      out.write("\t\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t\t<th></th>\r\n");
      out.write("\t\t\t\t\t<td><input name=\"data.photo\" readonly=\"readonly\" style=\"display: none;\" /> <img id=\"photo\" src=\"\" style=\"width: 200px; height: 200px;\"></td>\r\n");
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
