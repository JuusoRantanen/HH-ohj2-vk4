/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2022-11-27 19:24:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listaaasiakkaat_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("#listaus {\n");
      out.write("  font-family: roboto;\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#listaus td, #listaus th {\n");
      out.write("  border: 1px solid #ddd;\n");
      out.write("  padding: 8px;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write(".poista{\n");
      out.write("	color: black;\n");
      out.write("	text-decoration: underline;\n");
      out.write("	cursor: pointer;	\n");
      out.write("}\n");
      out.write("#listaus tr:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write("#listaus tr:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write("#listaus th {\n");
      out.write("  padding-top: 12px;\n");
      out.write("  padding-bottom: 12px;\n");
      out.write("  background-color: #04AA6D;\n");
      out.write("  color: white;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write(".rightside{\n");
      out.write("	text-align: right;	\n");
      out.write("}\n");
      out.write("input[type=button] {\n");
      out.write("  background-color: #006400; /* Green */\n");
      out.write("  border: none;\n");
      out.write("  color: white;\n");
      out.write("  padding: 10px 24px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: 16px;\n");
      out.write("  margin: 2px 1px;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("input [type=text] {\n");
      out.write("	margin: 0 auto;\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("}</style>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<script src=\"scripts/main.js\"></script>\n");
      out.write("<title>Asiakashaku</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<table id=\"listaus\">\n");
      out.write("	<thead>	\n");
      out.write("	<tr>\n");
      out.write("			<th colspan=\"5\" class=\"rightside\"><a id=\"linkki\" href=\"lisaauusi.jsp\">Lisää uusi asiakas</a></th>\n");
      out.write("		</tr>\n");
      out.write("		<tr>\n");
      out.write("			<th>Hakusana:</th>\n");
      out.write("			<th colspan=\"3\"><input type=\"text\" id=\"hakusana\"></th>\n");
      out.write("			<th><input type=\"button\" value=\"hae\" id=\"hakunappi\" onclick=\"haeAsiakkaat()\"></th>\n");
      out.write("		</tr>		\n");
      out.write("		<tr>\n");
      out.write("			<th>Etunimi</th>\n");
      out.write("			<th>Sukunimi</th>\n");
      out.write("			<th>Puhelin</th>\n");
      out.write("			<th>Sähköposti</th>\n");
      out.write("			<th>Asiakkaan poistaminen</th>\n");
      out.write("			\n");
      out.write("		</tr>\n");
      out.write("	</thead>\n");
      out.write("	<tbody id=\"tbody\">\n");
      out.write("	</tbody>\n");
      out.write("</table>\n");
      out.write("<span id=\"ilmo\"></span>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("haeAsiakkaat();\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
