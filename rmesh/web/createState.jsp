<%@page import="dao.StateDAO"%>
<%@page import="dao.PatientDAO"%>
<%@page import="dao.ScenarioDAO"%>
<%@include file="protect.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/foundation.css" />
        <link rel="stylesheet" href="responsive-tables.css">
        <script src="responsive-tables.js"></script>
        <%@include file="/topbar/topbarAdmin.jsp" %>

        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.1/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.1/jquery-ui.js"></script>
        <link rel="stylesheet" href="/resources/demos/style.css">
    </head>
    <body>
        <%
//            //Retrieve case information
//            String scenarioName = request.getParameter("scenarioName");
//            String scenarioDescription = request.getParameter("scenarioDescription");
//            String status = request.getParameter("status");
//            String admissionInfo = request.getParameter("admissionInfo");
//            String scenarioID = "SC" + (ScenarioDAO.retrieveAll().size() + 1);
//
//            //Retrieve patient's information
//            String patientNRIC = request.getParameter("patientNRIC");
//            String firstName = request.getParameter("firstName");
//            String lastName = request.getParameter("lastName");
//            String gender = request.getParameter("gender");
//            String dob = request.getParameter("DOB");
//            String maritalStatus = request.getParameter("maritalStatus");
//            String weightString = request.getParameter("weight");
//            double weight = Double.parseDouble(weightString);
//
//            String heightString = request.getParameter("height");
//            double height = Double.parseDouble(heightString);
//
//            String occupation = request.getParameter("occupation");
//            String race = request.getParameter("race");
//            String religion = request.getParameter("religion");
//            String nationality = request.getParameter("nationality");
//
//            //Retrieve patient's default state
//            String stateID0 = "ST0";
//            String RR0 = request.getParameter("RR0");
//            String BP0 = request.getParameter("BP0");
//            String HR0 = request.getParameter("HR0");
//            String SPO0 = request.getParameter("SPO0");
//            String intake0 = request.getParameter("intake0");
//            String output0 = request.getParameter("output0");
//            String temperatureString0 = request.getParameter("temperature0");
//            double temperature0 = Double.parseDouble(temperatureString0);
//            String stateDescription0 = ""; //empty for the default state only
//
            //String totalNumberOfStatesString = request.getParameter("totalNumberOfStates");
            //int totalNumberOfStates = Integer.parseInt(totalNumberOfStatesString);
//
//            //Adding Scenario, Patient, State, etc into the database, don't need to send them to the next page
//            
//            PatientDAO.add(patientNRIC, "a", "1", "2", dob, maritalStatus, weight, height, occupation, race, religion, nationality, 1);
//            ScenarioDAO.add(scenarioID, scenarioName, scenarioDescription, status, admissionInfo);
//            //PatientDAO.add(patientNRIC, firstName, lastName, gender, dob, maritalStatus, weight, height, occupation, race, religion, nationality, 1);
//            StateDAO.add(stateID0, scenarioID, RR0, BP0, HR0, SPO0, intake0, output0, temperature0, stateDescription0, patientNRIC);

            //loop to show the number of states 
            
            String totalNumberOfStatesString = (String) request.getAttribute("totalNumberOfStates");
            int totalNumberOfStates = Integer.parseInt(totalNumberOfStatesString);
            
            String scenarioID = (String) request.getAttribute("scenarioID");
            String patientNRIC = (String) request.getAttribute("patientNRIC");
            
            for (int i = 0; i < totalNumberOfStates; i++) {
                String RR = "RR" + (i + 1);
                String BP = "BP" + (i + 1);
                String HR = "HR" + (i + 1);
                String SPO = "SPO" + (i + 1);
                String intake = "intake" + (i + 1);
                String output = "output" + (i + 1);
                String temperature = "temperature" + (i + 1);
                String stateDescription = "stateDescription" + (i + 1);
        %>
        <form action ="ProcessAddState" method ="POST">
            <br><h2>State <%=i + 1%></h2>
            <div class="row">
                <div class = "large-12">
                    <label>State Description</label>
                    <textarea style = "resize:vertical" name = "<%=stateDescription%>" rows = "2" cols = "10"></textarea>
                </div>
            </div>
            
            <div class="row">
                <div class="large-4 columns">
                    <label>Respiratory Rate</label>
                    <input type="text" name="<%=RR%>" value = "11">
                </div>
                <div class="large-4 columns">
                    <label>Blood Pressure</label>
                    <input type="text" name="<%=BP%>" value = "12">
                </div>
                <div class="large-4 columns">
                    <label>Heart Rate</label>
                    <input type="text" name="<%=HR%>" value = "13">
                </div>
                <div class="large-4 columns">
                    <label>SPO</label>
                    <input type="text" name="<%=SPO%>" value = "14">
                </div>
                <div class="large-4 columns">
                    <label>Intake</label>
                    <input type="text" name="<%=intake%>" value = "15">
                </div>
                <div class="large-4 columns">
                    <label>Output</label>
                    <input type="text" name="<%=output%>" value = "16">
                </div>
                <div class="large-4 columns">
                    <label>Temperature</label>
                    <input type="text" name="<%=temperature%>" value = "17">
                </div>
            </div> 
        <%   }
        %>
        
        <input type ="hidden" name ="totalNumberOfStates" value ="<%=totalNumberOfStates%>"/>
        <input type ="hidden" name ="scenarioID" value ="<%=scenarioID%>"/>
        <input type ="hidden" name ="patientNRIC" value ="<%=patientNRIC%>"/>
        <center><input type ="submit" class ="button" value ="Add New Case"></center>
        
        </form>
       
        <script src="js/vendor/jquery.js"></script>
        <script src="js/foundation.min.js"></script>

        <script>
            $(document).foundation();
        </script>
    </body>
</html>
