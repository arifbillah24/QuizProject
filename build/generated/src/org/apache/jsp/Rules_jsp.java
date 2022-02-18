package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class Rules_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1><center>Welcome to the Exam </center></h1>\n");
      out.write("        <h2><u> Please Check The Rules below  </u></h2>\n");
      out.write("        \n");
      out.write("        <h3>1. You will have to click \"I Agree\" button below and also have to select your level and subject before you proceed to exam </h3>\n");
      out.write("        <h3>2. 20 Questions will be there for each topic.All are M C Q type questions.You have to select one of four option by clicking the radio button beside every option </h3>\n");
      out.write("        <h3>3. You will get 20 minutes time to answer the questions. However there is no definite time limit for each of the questions.</h3>\n");
      out.write("        \n");
      out.write("        <h3>4. After answering one question,click on the \"Next\" button to see next question. You can also click to the \"Previous\" button to see the earlier question.</h3>\n");
      out.write("        <h3>5. When you finish the test test,click on the \"End Exam\" button.</h3>\n");
      out.write("        <h3>6. Your results will be displayed once you have clicked on \"End Exam\" button</h3>\n");
      out.write("        \n");
      out.write("       <form action=\"/action_page.php\">\n");
      out.write("    <h2> Select level </h2>   \n");
      out.write("    <select name=\"Select Level\">\n");
      out.write("        <option value=\"volvo\">Beginners</option>  \n");
      out.write("        <option value=\"saab\">Professional</option>\n");
      out.write("   \n");
      out.write("  </select>\n");
      out.write("       \n");
      out.write("     \n");
      out.write("   \n");
      out.write("    <h2> Select Topic </h2>   \n");
      out.write("    <select name=\"Select Level\">\n");
      out.write("    <option value=\"C\">C</option>\n");
      out.write("    <option value=\"C++\">C++</option>\n");
      out.write("    <option value=\"Java\">Java</option>\n");
      out.write("    <option value=\"Python\">Python</option>\n");
      out.write("    <option value=\"HTML5\">HTML5</option>\n");
      out.write("    <option value=\"PHP\">PHP</option>\n");
      out.write("  </select>\n");
      out.write("       </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form>\n");
      out.write("            <button onclick=\"myFunction()\">Click me</button>\n");
      out.write("           \n");
      out.write("   \n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("    function myFunction() {\n");
      out.write("        var btn = document.createElement(\"BUTTON\");\n");
      out.write("        var t = document.createTextNode(\"SUBMIT\");\n");
      out.write("        btn.appendChild(t);\n");
      out.write("        document.body.appendChild(btn);\n");
      out.write("    }\n");
      out.write("    </script> \n");
      out.write("       </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
