<%@page import="Beans.MasterBean"%>
<%@page import="MasterClass.MyClass"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>

    <head>
        <meta charset="utf-8">
        <title>Book Own Taxi</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width">

        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>

        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/addnote.css">
        <link rel="stylesheet" href="css/font-awesome.css">
        <link rel="stylesheet" href="css/templatemo_style.css">
        <link rel="stylesheet" href="css/templatemo_misc.css">
        <link rel="stylesheet" href="css/flexslider.css">
        <link rel="stylesheet" href="css/testimonails-slider.css">

        <script src="js/vendor/modernizr-2.6.1-respond-1.1.0.min.js"></script>
    </head>
    <body>


            <header>
                <div id="top-header">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="home-account">
                                    <a href="index.jsp"></a>
                                    <a href="index.jsp"></a>
                                    <a href="index.jsp"></a>

                                </div>
                            </div>
                            <div class="col-md-6">

                            </div>
                        </div>
                    </div>
                </div>
                <div id="main-header">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-3">
                                <div class="logo">
                                    <a href="home.jsp"><img src="images/logo5.jpg" width="280px" height="100px" title="Book My Taxi" alt="Book My Taxi" ></a>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="main-menu">
                                    <ul>
                                       <br><li><a href="home.jsp">Home</a></li>

                                        <li><a href="dd.jsp">Driver Details</a></li>
                                       
                                    </ul>
                                </div>
                            </div>
                            <div class="col-md-3">

                            </div>
                        </div>
                    </div>
                </div>
            </header>


                        <table id="tb2" class="table"  border="1">
                            <tr>
                                <th>Mobile NO</th>
                                <th>User Name</th>
                                <th>Pick Up Loctaion</th>
                                <th>Destination Location</th>
                                 <th>Booking Date</th>
                            </tr>
                            <%
                            ArrayList al = MyClass.showEntry();
                            for(int i=0;i<al.size();i++)
                                {
                                MasterBean mb = (MasterBean)al.get(i);
                            %>
                            <tr>
                                <td><%=mb.getMobile()%></td>
                                <td><%=mb.getName()%></td>
                                <td><%=mb.getPickup()%></td>
                                <td><%=mb.getDesti()%></td>
                                <td><%=mb.getDate()%></td>
                                </tr>
                                        <%
                                        }%>
                        </table>
          


            <div id="services">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="heading-section">
                                <h2>We provide Our Best Deals</h2>
                                <img src="images/under-heading.png" alt="under-heading" >
                            </div>
                        </div>
                    </div>

                </div>
            </div>








			<footer>
                <div class="container">
                    <div class="top-footer">
                        <div class="row">
                            <div class="col-md-9">
                                <div class="subscribe-form">
                                    <span>Get in touch with us</span>
                                    <form method="get" class="subscribeForm">
                                        <input id="subscribe" type="text" />
                                        <input type="submit" id="submitButton" />
                                    </form>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="social-bottom">
                                    <span>Follow us:</span>
                                    <ul>
                                        <li><a href="#" class="fa fa-facebook"></a></li>
                                        <li><a href="#" class="fa fa-twitter"></a></li>

                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="bottom-footer">
                        <p>
                        	<span>Copyright @ B.TECH Power
                                </span>
                        </p>
                    </div>

                </div>
            </footer>


        <script src="js/vendor/jquery-1.11.0.min.js"></script>
        <script src="js/vendor/jquery.gmap3.min.js"></script>
        <script src="js/plugins.js"></script>
        <script src="js/main.js"></script>

    </body>
</html>