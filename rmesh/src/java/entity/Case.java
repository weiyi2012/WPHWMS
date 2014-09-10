/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author hpkhoo.2012
 */
public class Case {
    
    private int caseID;
    private String caseName;
    private String caseDescription;
    private String status;
    private String admissionInfo;
    
    public Case(int caseID, String caseName, String caseDescription, String status, String admissionInfo) {
        this.caseID = caseID;
        this.caseName = caseName;
        
    }

    public int getCaseID() {
        return caseID;
    }

    public String getCaseName() {
        return caseName;
    }

    public String getCaseDescription() {
        return caseDescription;
    }

    public String getStatus() {
        return status;
    }

    public String getAdmissionInfo() {
        return admissionInfo;
    }

    public void setCaseID(int caseID) {
        this.caseID = caseID;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public void setCaseDescription(String caseDescription) {
        this.caseDescription = caseDescription;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAdmissionInfo(String admissionInfo) {
        this.admissionInfo = admissionInfo;
    }
    
    
         
}
