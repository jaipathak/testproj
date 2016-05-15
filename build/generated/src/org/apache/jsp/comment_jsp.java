package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class comment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Book Own Taxi</title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/addnote.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/templatemo_style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/templatemo_misc.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flexslider.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/testimonails-slider.css\">\n");
      out.write("\n");
      out.write("        <script src=\"js/vendor/modernizr-2.6.1-respond-1.1.0.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <header>\n");
      out.write("                <div id=\"top-header\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"home-account\">\n");
      out.write("                                    <a href=\"index.jsp\"></a>\n");
      out.write("                                    <a href=\"index.jsp\"></a>\n");
      out.write("                                    <a href=\"index.jsp\"></a>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"main-header\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <div class=\"logo\">\n");
      out.write("                                    <a href=\"home.jsp\"><img src=\"images/logo5.jpg\" width=\"280px\" height=\"100px\" title=\"Book My Taxi\" alt=\"Book My Taxi\" ></a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"main-menu\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <br><li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                                        <li><a href=\"booking.jsp\">Booking</a></li>\n");
      out.write("                                        <li><a href=\"rates.jsp\">Rates</a></li>\n");
      out.write("                                        <li><a href=\"cartype.jsp\">Car-Type</a></li>\n");
      out.write("                                         <li><a href=\"aboutus.jsp\">About Us</a></li>\n");
      out.write("                                          <li><a href=\"comment.jsp\">Comment</a> </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"slider\">\n");
      out.write("                <div class=\"flexslider\">\n");
      out.write("                    <div id=\"flexi\">\n");
      out.write("  <div id=\"product-post\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"heading-section\">\n");
      out.write("                                <h2>Feel free to send a message</h2>\n");
      out.write("                                <img src=\"images/under-heading.png\" alt=\"\" >\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"contact-us\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"product-item col-md-12\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-8\">\n");
      out.write("                                            <div class=\"message-form\">\n");
      out.write("                                                <form action=\"#\" method=\"post\" class=\"send-message\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                    <div class=\"name col-md-4\">\n");
      out.write("                                                        <input type=\"text\" name=\"name\" id=\"name\" placeholder=\"Name\" />\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"email col-md-4\">\n");
      out.write("                                                        <input type=\"text\" name=\"email\" id=\"email\" placeholder=\"Email\" />\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"subject col-md-4\">\n");
      out.write("                                                        <input type=\"text\" name=\"subject\" id=\"subject\" placeholder=\"Subject\" />\n");
      out.write("                                                    </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"text col-md-12\">\n");
      out.write("                                                            <textarea name=\"text\" placeholder=\"Message\"></textarea>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"send\">\n");
      out.write("                                                        <button type=\"submit\">Send</button>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </form>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-4\">\n");
      out.write("                                            <div class=\"info\">\n");
      out.write("                                                <p>UTaxi Technologies Inc. is an American multinational online transportation network company headquartered in San Francisco, California. </p>\n");
      out.write("                                                <ul>\n");
      out.write("                                                    <li><i class=\"fa fa-phone\"></i>090-080-0760</li>\n");
      out.write("                                                    <li><i class=\"fa fa-globe\"></i>456 New Dagon City Studio, Yankinn, Digital Estate</li>\n");
      out.write("                                                    <li><i class=\"fa fa-envelope\"></i><a href=\"index.jsp\">UTaxi@company.com</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"heading-section\">\n");
      out.write("                                <h2>Find Us On Map</h2>\n");
      out.write("                                <img src=\"images/under-heading.png\" alt=\"\" >\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div id=\"googleMap\" style=\"height:340px;\">\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"services\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"heading-section\">\n");
      out.write("                                <h2>We provide Our Best Deals</h2>\n");
      out.write("                                <img src=\"images/under-heading.png\" alt=\"under-heading\" >\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<footer>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"top-footer\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <div class=\"subscribe-form\">\n");
      out.write("                                    <span>Get in touch with us</span>\n");
      out.write("                                    <form method=\"get\" class=\"subscribeForm\">\n");
      out.write("                                        <input id=\"subscribe\" type=\"text\" />\n");
      out.write("                                        <input type=\"submit\" id=\"submitButton\" />\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <div class=\"social-bottom\">\n");
      out.write("                                    <span>Follow us:</span>\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"#\" class=\"fa fa-facebook\"></a></li>\n");
      out.write("                                        <li><a href=\"#\" class=\"fa fa-twitter\"></a></li>\n");
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"bottom-footer\">\n");
      out.write("                        <p>\n");
      out.write("                        \t<span>Copyright @ B.TECH Power\n");
      out.write("                                </span>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/vendor/jquery-1.11.0.min.js\"></script>\n");
      out.write("        <script src=\"js/vendor/jquery.gmap3.min.js\"></script>\n");
      out.write("        <script src=\"js/plugins.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
