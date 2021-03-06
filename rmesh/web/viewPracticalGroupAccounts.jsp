<%@page import="entity.PracticalGroup"%>
<%@page import="entity.Nurse"%>
<%@page import="entity.Lecturer"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="entity.Admin"%>
<%@page import="dao.*"%>
<%@page import="dao.LecturerDAO"%>
<%@page import="dao.AdminDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="protect.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="css/foundation.css" />
        <script src="js/vendor/modernizr.js"></script>
        <%@include file="/topbar/topbarAdmin.jsp" %>

        <script type="text/javascript">

            function deleteConfirmation() {
                var deleteButton = confirm("Are you sure you want to delete? ")
                if (deleteButton) {
                    return true;
                }
                else {
                    return false;
                }
            }

        </script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accounts Management</title>
    </head>
    <body>
        <%            List<Nurse> nurseList = NurseDAO.retrieveAll();
        List<PracticalGroup> practicalGroupList = PracticalGroupDAO.retrieveAll();
        %>

        <div class="row" style="padding-top: 30px;">
            <div class="large-centered large-12 columns">
                <center>
                    <h1>Practical Group Accounts Management</h1>
                    <div class ="large-11">
                        <%if (session.getAttribute("successMessageCreateAccount") != null) {%>
                        <div data-alert class="alert-box success radius">
                            The account has been created successfully! 
                            <a href="#" class="close">&times;</a>
                        </div>
                        <%}
                            session.removeAttribute("successMessageCreateAccount"); %>
                    </div>
                    <table class="responsive" id="cssTable">
                        <col width="40%">
                        <col width="40%">
                        <col width="10%">
                        <col width="10%">
                        <tr>
                            <td>User Id</td>
                            <td>Password</td>
                            <td colspan="2" align="center" valign="middle">Actions</td>
                        </tr>
                        <%                            for (Nurse nurse : nurseList) {
                        %>
                        <tr>
                            <td> <%= nurse.getNurseID()%> </td>
                            <td> <%= nurse.getNursePassword()%> </td>
                            <td> 
                                <form action = "editAccount.jsp" method = "post">
                                    <input type="hidden" name="userID" value="<%= nurse.getNurseID()%>">
                                    <input type="hidden" name="password" value="<%= nurse.getNursePassword()%>">
                                    <input type="hidden" name="type" value="nurse">
                                    <input type = "submit" class="button tinytable" value="edit">
                                </form>
                            </td>
                            <%
                                String userLoggedIn = (String) session.getAttribute("user");
                            %>
                            <td>
                                <form action = "ProcessDeleteAccount" method = "post">
                                    <input type="hidden" name="userID" value="<%= nurse.getNurseID()%>">
                                    <input type="hidden" name="password" value="<%= nurse.getNursePassword()%>">
                                    <input type="hidden" name="type" value="nurse">
                                    <%
                                        if (userLoggedIn != null && userLoggedIn.equals(nurse.getNurseID())) {
                                    %>
                                    <!--<input type = "submit" class="button tinytable" value="delete" disabled>-->
                                    Logged in
                                    <%
                                    } else {
                                    %>
                                    <input type = "submit" class="button tinytable" onclick="if (!deleteConfirmation())
                                                return false" value="delete" >
                                    <%
                                        }
                                    %>
                                </form>
                            </td>
                            <%
                                }
                            %>
                        </tr>

                    </table>
                    <form action = "createAccount.jsp" method = "post">
                        <input type="hidden" name="type" value="nurse">
                        <input type = "submit" class="button tiny" value="Create New Account">
                    </form>

                </center>

            </div>
        </div>
        <script>
            $(document).foundation();
        </script>
    </body>
</html>
