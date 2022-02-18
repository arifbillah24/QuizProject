package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>jQuery AJAX example with Java</title>\n");
      out.write("      <script src=\"https://code.jquery.com/jquery-1.11.3.min.js\" integrity=\"sha256-7LkWEzqTdpEfELxcZZlS6wAx5Ff13zZ83lYO2/ujj7g=\"  crossorigin=\"anonymous\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/mystyle.css\" type=\"text/css\"/>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("            <div class=\"container_login\">\n");
      out.write("            <div class=\"login\">\n");
      out.write("                <h1> LogIn Here:</h1>\n");
      out.write("                <p>  Username : <input type=\"text\" name=\"username\" id=\"username\" placeholder=\"username\"/></br></p>\n");
      out.write("                <p>Password : <input type=\"password\" name=\"password\" id=\"password\" placeholder=\"password\"/></br></p>\n");
      out.write("                <p class=\"submit\"><button name=\"login\" id=\"login\">Login</button> </p>\n");
      out.write("            </div>\n");
      out.write("                <div class=\"login_help\">\n");
      out.write("                    <p>forgot password ?&nbsp;&nbsp;<a href=\"retrive_pass.jsp\">reset your password</a></p>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            <div id=\"messageDiv\" style=\"display:none;\"></div>\n");
      out.write("        </center>\n");
      out.write("        <script>\n");
      out.write("            $(\"#login\").on('click', function(){\n");
      out.write("                var username = $(\"#username\").val();\n");
      out.write("                var password = $(\"#password\").val();\n");
      out.write("                if(username === \"\"){\n");
      out.write("                    $('#messageDiv').css(\"display\",\"none\");\n");
      out.write("                    alert(\"Username is required\");\n");
      out.write("                    return;\n");
      out.write("                }\n");
      out.write("                if(password === \"\"){\n");
      out.write("                    $('#messageDiv').css(\"display\",\"none\");\n");
      out.write("                    alert(\"Password is required\");\n");
      out.write("                    return;\n");
      out.write("                }\n");
      out.write("                $.ajax({\n");
      out.write("                    url : 'LoginServlet',\n");
      out.write("                    method : 'post',\n");
      out.write("                    data : {\n");
      out.write("                        username : username,\n");
      out.write("                        password : password\n");
      out.write("                    },\n");
      out.write("                    success : function(results){\n");
      out.write("                       \n");
      out.write("                        if(results !== null && results !== \"\"){\n");
      out.write("                            showMessage(results);\n");
      out.write("                            $('#messageDiv').css(\"display\",\"block\");\n");
      out.write("                        }else{\n");
      out.write("                            $('#messageDiv').css(\"display\",\"none\");\n");
      out.write("                            $('#messageDiv').html(\"\");\n");
      out.write("                            alert(\"Some exception occurred! Please try again.\");\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    error: function(){alert(\"error in ajax\");}\n");
      out.write("                    \n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("             \n");
      out.write("            //function to display message to the user\n");
      out.write("            function showMessage(results){\n");
      out.write("                if(results === 'SUCCESS'){\n");
      out.write("                    $('#messageDiv').html(\"<font color='green'>You are successfully logged in. </font>\");\n");
      out.write("                }else if(results === 'FAILURE'){\n");
      out.write("                    $('#messageDiv').html(\"<font color='red'>Username or password incorrect </font>\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
