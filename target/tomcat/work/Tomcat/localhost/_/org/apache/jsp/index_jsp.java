/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-06-28 07:44:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../static/js/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf8\" pageEncodeing=\"utf-8\">  \r\n");
      out.write("<title>Insert title here</title>  \r\n");
      out.write("<script type=\"text/javascript\">  \r\n");
      out.write("    function ajaxTest(){  \r\n");
      out.write("        $.ajax({  \r\n");
      out.write("        data:\"name=\"+$(\"#name\").val(),  \r\n");
      out.write("        type:\"GET\",  \r\n");
      out.write("        dataType: 'json',  \r\n");
      out.write("        url:\"comm/login.do\",  \r\n");
      out.write("        error:function(data){ \r\n");
      out.write("            alert(\"åºéäºï¼ï¼:\"+data.msg);  \r\n");
      out.write("        },  \r\n");
      out.write("        success:function(data){  \r\n");
      out.write("        \tconsole.log(data);\r\n");
      out.write("            alert(\"success:\"+data.msg);  \r\n");
      out.write("            $(\"#result\").html(data.msg) ;  \r\n");
      out.write("        }  \r\n");
      out.write("        });  \r\n");
      out.write("    }  \r\n");
      out.write("</script>  \r\n");
      out.write("</head>  \r\n");
      out.write("<body>  \r\n");
      out.write("    <input type=\"text\" name=\"name\" id=\"name\"/>  \r\n");
      out.write("    <input type=\"submit\" value=\"ç»å½\" onclick=\"ajaxTest();\"/>  \r\n");
      out.write("    <div id=\"result\"></div>  \r\n");
      out.write("</body>  \r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
