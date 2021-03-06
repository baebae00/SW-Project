package com.example.sw_project;

import android.widget.EditText;

public class StudentInfo {

    private String email;
    private String userName;
    private String college;
    private String department;
    private String studentId;

    public StudentInfo(String email, String userName, String college, String department, String studentId){
        this.email = email;
        this.userName = userName;
        this.college = college;
        this.department = department;
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) { this.studentId = studentId;
    }


}
