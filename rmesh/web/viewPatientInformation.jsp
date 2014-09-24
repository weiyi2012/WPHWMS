<%-- 
    Document   : viewPatientInformation
    Created on : Sep 10, 2014, 2:37:16 PM
    Author     : Administrator
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="javax.swing.JLabel"%>
<%@page import="javax.swing.ImageIcon"%>
<%@page import="java.awt.Image"%>
<%@page import="java.util.List"%>
<%@page import="entity.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dao.*"%>
<%@include file="protect.jsp" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" c="text/html; charset=UTF-8">
        <title>Patient Information</title>
        <link rel="stylesheet" href="css/foundation.css" />
        <%@include file="/topbar/topbar.jsp" %> 
    </head>
    <body>

        <%            Patient patient = PatientDAO.retrieve("S7843522B");
            State stateRetrieved = StateDAO.retrieve("ST1", "SC1");
            Scenario scenarioRetrieved = ScenarioDAO.retrieve("SC1");

            //retrieve case's information
            String admissionNotes = scenarioRetrieved.getAdmissionInfo();

            //retrieve patient's information
            String firstName = patient.getFirstName();
            String lastName = patient.getLastName();
            String fullName = firstName + " " + lastName;
            String patientNRIC = patient.getPatientNRIC();
            String dob = patient.getDob();
            String gender = patient.getGender();

            //retrieve state's information
            String RR = stateRetrieved.getRR();
            String BP = stateRetrieved.getBP();
            String HR = stateRetrieved.getHR();
            String SPO = stateRetrieved.getSPO();
            String intake = stateRetrieved.getIntake();
            String output = stateRetrieved.getOutput();
            double temperature = stateRetrieved.getTemperature();
            String stateID = stateRetrieved.getStateID();
        %>
        <br>
        <div align ="center">
            <div class="large-centered large-10 columns">
                <div class="panel">
                    <h5>Patient's Basic Information</h5>
                    <span class="label">Name</span> <%=fullName%>&nbsp;
                    <span class="label">NRIC</span> <%=patientNRIC%>&nbsp;
                    <span class="label">DOB</span> <%=dob%>&nbsp;
                    <span class="label">Gender</span> <%=gender%>&nbsp;
                    </p>
                </div></div>

            <div class="large-centered large-10 columns">
                <div class="tabs-content">
                    <dl class="tabs" data-tab>
                        <dd class="active"><a href="#panel1">Admission Notes</a></dd>
                        <dd><a href="#panel2">Multidisciplinary Notes</a></dd>
                        <dd><a href="#panel3">Investigations</a></dd>
                        <dd><a href="#panel4">Medication</a></dd>
                        <dd><a href="#panel5">Clinical Chart</a></dd>
                    </dl>

                    <div class="content active" id="panel1">

                        <p><%=admissionNotes%></p>
                    </div>
                    <div class="content" id="panel2">
                        <p>
                            <%
                                String msg = (String) request.getAttribute("successMsg");

                                if (msg != null) {
                                    out.println(msg);
                                }
                            %>
                        <form action="ProcessAddNote" method="POST">
                            <div class="row">
                                <div class="small-8">
                                    <div class="row">
                                        <div class="small-3 columns">
                                            <label for="right-label" class="right inline">Tutorial Group</label>
                                            <label for="right-label" class="right inline">Group Member Names</label>
                                            <label for="right-label" class="right inline">Multidisciplinary Note</label>
                                        </div>
                                        <div class="small-9 columns">
                                            <input type ="text" id= "tutorialGrp" name="tutorialGrp" required>
                                            <input type ="text" id= "grpNames" name="grpNames" required>
                                            <input type ="text" id= "notes" name="notes" required>
                                        </div>
                                    </div>
                                </div>
                            </div>


                            <input type="Submit" value="Submit" class="button"> 
                            <input type="button" value="Cancel" class="button" onClick="window.location = 'viewPatientInformation.jsp'"/>
                        </form>
                        </p>
                    </div>
                    <div class="content" id="panel3">
                        <%
                            String location = "reports/heartReport.png";

                            //      Image image = ImageIO.read(getClass().getResource(path));
                            List<Report> reports = ReportDAO.retrieveAll();

                        %>
                        <a href="#" >
                            <img class="opaque" src="<%=location%>" style="float:left; padding-right:5px;" /></a>
                        <form action="ProcessReport" method="POST">
                            <%
                                String currentScenarioID = (String) session.getAttribute("currentScenarioID");

                                for (Report report : reports) {
                                    if (report.getScenarioID().equals(currentScenarioID) && report.getStateID().equals("ST1")) {
                            %>
                            <input type="checkbox" name="report" value="<%=report.getReportName()%>" /><%=report.getReportName()%><br>
                            <input type="hidden" name="location" value="<%=report.getReportFile()%>"/><br>
                            <%
                                    } else {
                                        out.println("No available report");
                                    }
                                }
                            %>
                            <input type="submit" value="Retrieve Report"/>
                        </form>

                        <%
                            List<Report> reportsRetrieved = (List) session.getAttribute("reports");

                        if (reportsRetrieved != null && reportsRetrieved.size() > 0) {
                        %>
                        <h1>Existing Report</h1>
                        <table>
                            <tr>
                                <td>Report Name</td>
                                <td>Report Retrieved On</td>
                            </tr>
                            <%
                                for (Report reportRetrieved : reportsRetrieved) {
                                    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                                    Date date = new Date();
                            %>
                            <tr>
                                <td><%=reportRetrieved.getReportName()%></td>
                                <td><%=dateFormat.format(date)%></td>
                            </tr>
                            <%
                                }

                                } else {
                                    out.println("No existing reports yet.");
                                }
                            %>
                        </table>

                    </div>



                    <div class="content" id="panel4">
                        <p>This is the fourth panel of the basic tab example. This is the fourth panel of the basic tab example.</p>
                    </div>
                    <div class="content" id="panel5">
                        <p>
                        <table border = "0">   
                            <tr><td>Vitals</td>
                                <td>Last Updated</td>
                                <td>Current</td>
                            </tr>
                            <form action="ProcessUpdateState" method="POST">
                                <tr><td>Respiratory Rate</td>
                                    <td><%=RR%></td>
                                    <td><input type="text" name = "RR" style="width:250px" required/></td></tr>
                                <tr><td>Blood Pressure</td>
                                    <td><%=BP%></td>
                                    <td><input type="text" name ="BP" style="width:250px" required/></td></tr>
                                <tr><td>Heart Rate</td>
                                    <td><%=HR%></td>
                                    <td><input type="text" name ="HR" style="width:250px" required/></td></tr>
                                <tr><td>SPO</td>
                                    <td><%=SPO%></td>
                                    <td><input type="text" name ="SPO" style="width:250px" required/></td></tr>
                                <tr><td>Intake</td>
                                    <td><%=intake%></td>
                                    <td><input type="text" name ="intake" style="width:250px" required/></td></tr>
                                <tr><td>Output</td>
                                    <td><%=output%></td>
                                    <td><input type="text" name ="output" style="width:250px" required/></td></tr>
                                <tr><td>Temperature</td>
                                    <td><%=temperature%></td>
                                    <td><input type="text" name ="temperature" style="width:250px" required/></td></tr>
                                <td><input type="hidden" name ="stateID" value = "<%=stateID%>"/></td></tr>


                        </table>
                        <input type="Submit" value="Update Vitals" class="button"> 
                        </form>

                        <!--                        <form>
                                                    <div class="row">
                                                        <div class="small-8">
                                                            <div class="row">
                                                                <div class="small-3 columns">
                                                                    <label for="right-label" class="right inline">Respiratory Rate</label>
                                                                    <label for="right-label" class="right inline">Blood Pressure</label>
                                                                    <label for="right-label" class="right inline">Heart Rate</label>
                                                                    <label for="right-label" class="right inline">SPO</label>
                                                                    <label for="right-label" class="right inline">Intake</label>
                                                                    <label for="right-label" class="right inline">Output</label>
                                                                    <label for="right-label" class="right inline">Temperature</label>
                                                                </div>
                                                                <div class="small-9 columns">
                                                                    <input type="text" id="right-label" placeholder="<%=RR%>">
                                                                    <input type="text" id="right-label" placeholder="<%=BP%>">
                                                                    <input type="text" id="right-label" placeholder="<%=HR%>">
                                                                    <input type="text" id="right-label" placeholder="<%=SPO%>">
                                                                    <input type="text" id="right-label" placeholder="<%=intake%>">
                                                                    <input type="text" id="right-label" placeholder="<%=output%>">
                                                                    <input type="text" id="right-label" placeholder="<%=temperature%>">
                                                                </div>    
                                                            </div>
                                                        </div>
                                                    </div>
                                                </form>-->


                        </p>
                    </div>
                </div>

            </div>

        </div>



        <script src="js/vendor/jquery.js"></script>
        <script src="js/foundation.min.js"></script>
        <script>
                                $(document).foundation();
        </script>
    </body>
</html>
