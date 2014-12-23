package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.ScenarioDAO;
import entity.State;
import java.util.ArrayList;

public final class createScenario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/protectPage/protectAdmin.jsp");
    _jspx_dependants.add("/topbar/topbarAdmin.jsp");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

   if(session.getAttribute("admin") == null){
       response.sendRedirect("viewMainLogin.jsp");
   }
    

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/foundation.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"responsive-tables.css\">\r\n");
      out.write("        <script src=\"responsive-tables.js\"></script>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html><html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/DefaultLogo-favicon.ico\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        \r\n");
      out.write("        <!--FONT-->\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>\r\n");
      out.write("        \r\n");
      out.write("        <!--ICON-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/foundation-icons/foundation-icons.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/foundation-icons/foundation-icons.svg\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("      <nav class=\"top-bar\" data-topbar>\r\n");
      out.write("            <ul class=\"title-area\">\r\n");
      out.write("                <li class=\"name\">\r\n");
      out.write("                    <h1><a href=\"viewScenarioAdmin.jsp\"><img src=\"./img/DefaultLogo.png\" width=\"30\" height=\"30\"/> EMR</a></h1>\r\n");
      out.write("\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- Remove the class \"menu-icon\" to get rid of menu icon. Take out \"Menu\" to just have icon alone -->\r\n");
      out.write("                <li class=\"toggle-topbar menu-icon\"><a href=\"#\"><span>Menu</span></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("                \r\n");
      out.write("            <section class=\"top-bar-section\">\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"left\">\r\n");
      out.write("                    <li class=\"has-dropdown\">\r\n");
      out.write("                        <a href=\"#\">Case Management</a>\r\n");
      out.write("                        <ul class=\"dropdown\">\r\n");
      out.write("                            <li><a href=\"./viewScenarioAdmin.jsp\">Manage Case</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Create Case</a></li>\r\n");
      out.write("                        </ul>   \r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"has-dropdown\">\r\n");
      out.write("                        <a href=\"#\">User Management</a>\r\n");
      out.write("                        <ul class=\"dropdown\">\r\n");
      out.write("                            <li><a href=\"./viewAdminAccounts.jsp\">Admin</a></li>\r\n");
      out.write("                            <li><a href=\"./viewLecturerAccounts.jsp\">Lecturer</a></li>\r\n");
      out.write("                            <li><a href=\"./viewPracticalGroupAccounts.jsp\">Practical Group</a></li>\r\n");
      out.write("                        </ul>   \r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"right\"> \r\n");
      out.write("                    <li><a href=\"./viewAdminHomePage.jsp\">Welcome, Admin!</a></li>\r\n");
      out.write("                    <li><a href=\"ProcessLogoutAdmin\">Log Out</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("            </section>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <script src =\"js/vendor/jquery.js\"></script>\r\n");
      out.write("        <script src=\"js/foundation.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).foundation();\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.1/themes/smoothness/jquery-ui.css\">\r\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\r\n");
      out.write("        <script src=\"//code.jquery.com/ui/1.11.1/jquery-ui.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n");
      out.write("        <script>\r\n");
      out.write("            $(function () {\r\n");
      out.write("                $(\"#datepicker\").datepicker();\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <title>Create Scenario</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("    <center><h1>Case Set Up</h1>\r\n");
      out.write("\r\n");
      out.write("        <form action =\"ProcessAddScenario\" method =\"POST\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"small-8\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"small-3 columns\">\r\n");
      out.write("                            <label for=\"right-label\" class=\"right inline\">Scenario Name</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"small-9 columns\">\r\n");
      out.write("                            <input type=\"text\" id=\"password\" name=\"scenarioName\" value = \"For E.g: ECS Analphylactic Reaction\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("    </center>    \r\n");
      out.write("    <dl class=\"accordion\" data-accordion>\r\n");
      out.write("        <dd class=\"accordion-navigation\">\r\n");
      out.write("            <a href=\"#panel1\">Case Information</a>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"panel1\" class=\"content\">\r\n");
      out.write("                <center>\r\n");
      out.write("                    <div class=\"large-9\">\r\n");
      out.write("                        <label>Case Description</label>\r\n");
      out.write("                        <textarea style = \"resize:vertical\"  name=\"scenarioDescription\" rows=\"2\" cols=\"10\" value = \"A woman is being admitted...\"></textarea>\r\n");
      out.write("\r\n");
      out.write("                        <label>Admission Information</label>\r\n");
      out.write("                        <textarea style = \"resize:vertical\"  name=\"admissionInfo\" rows=\"2\" cols=\"10\" value = \"Her last vitals are...\"></textarea>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </center>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"large-4 columns\">\r\n");
      out.write("                        <label>Status</label>\r\n");
      out.write("                        <input type=\"radio\" value=\"activated\" name = \"status\"> Activated <br/>\r\n");
      out.write("                        <input type=\"radio\" value=\"deactivated\" name = \"status\"> Deactivated\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dd class=\"accordion-navigation\">\r\n");
      out.write("            <a href=\"#panel2\">Patient's Information</a>\r\n");
      out.write("            <div id=\"panel2\" class=\"content\">\r\n");
      out.write("                <!--New row 1-->\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"large-4 columns\">\r\n");
      out.write("                        <label>Patient's NRIC\r\n");
      out.write("                            <input type=\"text\" name =\"patientNRIC\" value = \"S7843522A\"/>\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"large-4 columns\">\r\n");
      out.write("                        <label>First Name\r\n");
      out.write("                            <input type=\"text\" name =\"firstName\" value = \"Bella\"/>\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"large-4 columns\">\r\n");
      out.write("                        <label>Last Name\r\n");
      out.write("                            <input type=\"text\" name =\"lastName\" value = \"Cullen\" />\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--New Row 2-->\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"large-4 columns\">\r\n");
      out.write("                        <label>Gender</label>\r\n");
      out.write("                        <input type=\"radio\" value=\"Male\" name = \"gender\"> Male <br/>\r\n");
      out.write("                        <input type=\"radio\" value=\"Female\" name = \"gender\"> Female\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"large-4 columns\">\r\n");
      out.write("                        <label>Date of Birth</label>\r\n");
      out.write("                        <input type=\"text\" id=\"datepicker\" name = \"DOB\" value = \"19/11/1992\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"large-4 columns\">\r\n");
      out.write("                        <label>Marital Status</label>\r\n");
      out.write("                        <select name=\"maritalStatus\">\r\n");
      out.write("                            <option>Single</option>\r\n");
      out.write("                            <option>Married</option>\r\n");
      out.write("                            <option>Divorced</option>\r\n");
      out.write("                            <option>Separated</option>\r\n");
      out.write("                            <option>Widowed</option>\r\n");
      out.write("                            <option>NA</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--New Row 3-->\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"large-4 columns\">\r\n");
      out.write("                        <label>Weight</label>\r\n");
      out.write("                        <input type=\"text\" name=\"weight\" value = \"1\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"large-4 columns\">\r\n");
      out.write("                        <label>Height</label>\r\n");
      out.write("                        <input type=\"text\" name=\"height\" value =\"1\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"large-4 columns\">\r\n");
      out.write("                        <label>Occupation</label>\r\n");
      out.write("                        <input type=\"text\" name=\"occupation\" value = \"vampire\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"large-4 columns\">\r\n");
      out.write("                        <label>Race</label>\r\n");
      out.write("                        <input type=\"text\" name=\"race\" value = \"vampire\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"large-4 columns\">\r\n");
      out.write("                        <label>Religion</label>\r\n");
      out.write("                        <input type=\"text\" name=\"religion\" value = \"vampire\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"large-4 columns\">\r\n");
      out.write("                        <label>Nationality</label>\r\n");
      out.write("                        <input type=\"text\" name=\"nationality\" value = \"vampire\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dd class=\"accordion-navigation\">\r\n");
      out.write("            <a href=\"#panel3\">Default Vital Signs</a>\r\n");
      out.write("            <!--State 0-->\r\n");
      out.write("            <div id=\"panel3\" class=\"content\">\r\n");
      out.write("                <div style=\"margin-left:100px;\"> Leave empty if not applicable.</div><br/>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"large-4 columns\">\r\n");
      out.write("                        <label>Respiratory Rate</label>\r\n");
      out.write("                        <input type=\"text\" name=\"RR0\" value = \"11\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"large-4 columns\">\r\n");
      out.write("                        <label>Blood Pressure</label>\r\n");
      out.write("                        <input type=\"text\" name=\"BP0\" value = \"12\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"large-4 columns\">\r\n");
      out.write("                        <label>Heart Rate</label>\r\n");
      out.write("                        <input type=\"text\" name=\"HR0\" value = \"13\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"large-4 columns\">\r\n");
      out.write("                        <label>SPO</label>\r\n");
      out.write("                        <input type=\"text\" name=\"SPO0\" value = \"14\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"large-4 columns\">\r\n");
      out.write("                        <label>Intake</label>\r\n");
      out.write("                        <input type=\"text\" name=\"intake0\" value = \"15\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"large-4 columns\">\r\n");
      out.write("                        <label>Output</label>\r\n");
      out.write("                        <input type=\"text\" name=\"output0\" value = \"16\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"large-4 columns\">\r\n");
      out.write("                        <label>Temperature</label>\r\n");
      out.write("                        <input type=\"text\" name=\"temperature0\" value = \"17\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"large-4 columns\"></div>\r\n");
      out.write("                    <div class=\"large-4 columns\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dd class=\"accordion-navigation\">\r\n");
      out.write("            <a href=\"#panel4\">Define State(s)</a>\r\n");
      out.write("            <div id=\"panel4\" class=\"content\">\r\n");
      out.write("                <center>\r\n");
      out.write("\r\n");
      out.write("                    <div class =\"rows\">\r\n");
      out.write("                        <div class =\"large-9\">\r\n");
      out.write("                            <label>Enter Total Number of States (E.g: 3)</label>\r\n");
      out.write("                            <input type=\"text\" name=\"totalNumberOfStates\" value = \"2\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!--                State 1\r\n");
      out.write("                                <center><div class=\"large-9\">\r\n");
      out.write("                                        <label>State Description</label>\r\n");
      out.write("                                        <textarea style = \"resize:vertical\" name=\"stateDescription1\" rows=\"2\" cols=\"10\"></textarea>\r\n");
      out.write("                                    </div></center>\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"large-4 columns\">\r\n");
      out.write("                                        <label>Respiratory Rate</label>\r\n");
      out.write("                                        <input type=\"text\" name=\"RR1\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"large-4 columns\">\r\n");
      out.write("                                        <label>Blood Pressure</label>\r\n");
      out.write("                                        <input type=\"text\" name=\"BP1\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"large-4 columns\">\r\n");
      out.write("                                        <label>Heart Rate</label>\r\n");
      out.write("                                        <input type=\"text\" name=\"HR1\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"large-4 columns\">\r\n");
      out.write("                                        <label>SPO</label>\r\n");
      out.write("                                        <input type=\"text\" name=\"SPO1\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"large-4 columns\">\r\n");
      out.write("                                        <label>Intake</label>\r\n");
      out.write("                                        <input type=\"text\" name=\"intake1\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"large-4 columns\">\r\n");
      out.write("                                        <label>Output</label>\r\n");
      out.write("                                        <input type=\"text\" name=\"output1\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                \r\n");
      out.write("                                    <div class=\"large-4 columns\">\r\n");
      out.write("                                        <label>Temperature</label>\r\n");
      out.write("                                        <input type=\"text\" name=\"temperature1\">\r\n");
      out.write("                                    </div>-->\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--Add more states button-->\r\n");
      out.write("            <!--            <div class=\"input_fields_wrap\">\r\n");
      out.write("                            <button class=\"add_field_button\">Add More States</button>\r\n");
      out.write("                        </div>-->\r\n");
      out.write("            <!--End of add more states-->\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </dd>\r\n");
      out.write("    </dl>\r\n");
      out.write("    <br/>\r\n");
      out.write("    <center><input type =\"submit\" class =\"button\" value =\"Continue\"></center>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--<script>\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("        var max_fields = 15; //maximum input boxes allowed\r\n");
      out.write("        var wrapper = $(\".input_fields_wrap\"); //Fields wrapper\r\n");
      out.write("        var add_button = $(\".add_field_button\"); //Add button ID\r\n");
      out.write("\r\n");
      out.write("        var x = 2; //initlal text box count, first box already added above\r\n");
      out.write("        $(add_button).click(function(e) { //on add input button click\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("            if (x < max_fields) { //max input box allowed\r\n");
      out.write("                x++; //text box increment\r\n");
      out.write("                $(wrapper).append('<div><br>State X <center><div class = \"large-9\"><label>State Description</label><textarea name = \"stateDescription\" rows = \"2\" cols = \"10\"></textarea></div></center><div class = \"row\">\\n\\\r\n");
      out.write("                           <div class =\"large-4 columns\"><label>Respiratory Rate</label><input type=\"text\" name=\"RR2\"/></div>\\n\\\r\n");
      out.write("                           <div class =\"large-4 columns\"><label>Blood Pressure</label><input type=\"text\" name=\"BP\"/></div>\\n\\\r\n");
      out.write("                           <div class =\"large-4 columns\"><label>Heart Rate</label><input type=\"text\" name=\"HR\"/></div>\\n\\\r\n");
      out.write("                           <div class =\"large-4 columns\"><label>SPO</label><input type=\"text\" name=\"SPO\"/></div>\\n\\\r\n");
      out.write("                           <div class =\"large-4 columns\"><label>Intake</label><input type=\"text\" name=\"intake\"/></div>\\n\\\r\n");
      out.write("                           <div class =\"large-4 columns\"><label>Output</label><input type=\"text\" name=\"output\"/></div>\\n\\\r\n");
      out.write("                           <div class =\"large-4 columns\"><label>Temperature</label><input type=\"text\" name=\"temperature\"/></div>\\n\\\r\n");
      out.write("                           </div>\\n\\\r\n");
      out.write("                           <a href = \"#\" class = \"remove_field\">Remove State</a></div>'); //add input box\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $(wrapper).on(\"click\", \".remove_field\", function(e) { //user click on remove text\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("            $(this).parent('div').remove();\r\n");
      out.write("            x--;\r\n");
      out.write("        })\r\n");
      out.write("    });\r\n");
      out.write("</script>-->\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/vendor/jquery.js\"></script>\r\n");
      out.write("<script src=\"js/foundation.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("            $(document).foundation();\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
