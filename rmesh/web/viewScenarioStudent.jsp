<%-- 
    Document   : viewCaseStudent
    Created on : Sep 19, 2014, 7:37:45 PM
    Author     : hpkhoo.2012
--%>

<%@page import="entity.Scenario"%>
<%@page import="java.util.*"%>
<%@page import="dao.ScenarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="protect.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Patient Case Information</title>
        <link rel="stylesheet" href="css/foundation.css" />
        <%@include file="/topbar/topbar.jsp" %>
    </head>

    <body style="font-size:14px; line-height:30px;">
        <div class="row" style="padding-top: 15px;">
            <div class="large-centered large-12 columns">
                <center><h3>Case Information</h3></center>
                <div class="panel" style="background-color: white; border:1px solid black">
                    <br/>
                    <%           //retrieve the list of scenario that has all activated status
                        List<Scenario> scenarioActivatedList = ScenarioDAO.retrieveActivatedStatus();
                    %>
                    <!--<form action = "viewPatientInformation.jsp" method = "GET">-->
                    <form action = "HARDCODEviewAllWardInformation.jsp" method = "GET">

                        <%
                            if (scenarioActivatedList.size() != 0) {
                                //get the most recently activated scenario
                                Scenario retrieveLastScenario = scenarioActivatedList.get(scenarioActivatedList.size() - 1);
                                session.setAttribute("currentScenarioID", retrieveLastScenario.getScenarioID());
                        %>

                        <div class="large-centered large-12 columns">
                            <b>Case Number: </b><%=retrieveLastScenario.getScenarioID()%><br/><br/> 
                        </div>

                        <div class="large-centered large-12 columns">
                            <b>Case Name: </b><%=retrieveLastScenario.getScenarioName()%><br/><br/>
                        </div>

                        <div class="large-centered large-12 columns"> 
                            <b>Case Description: </b> <%=retrieveLastScenario.getScenarioDescription()%><br/><br/> 
                        </div>

                        <center><input type = "submit" class="button hms small" value = "Proceed"></center>
                            <%
                                } else {
                                    out.println("No case has been activated by your lecturer yet.");
                                }
                            %> 
                    </form> 
                </div> 
            </div>  
        </div>
    </body>
</html>
