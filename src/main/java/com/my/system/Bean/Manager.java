package com.my.system.Bean;

import java.util.Date;

public class Manager {
    private Integer ManagerNum;
    private String ManagerName;
    private String ManagerSex;
    private Date ManagerBirthday;
    private String ManagerPassword;

    public Integer getManagerNum() {
        return ManagerNum;
    }

    public void setManagerNum(Integer managerNum) {
        ManagerNum = managerNum;
    }

    public String getManagerName() {
        return ManagerName;
    }

    public void setManagerName(String managerName) {
        ManagerName = managerName;
    }

    public String getManagerSex() {
        return ManagerSex;
    }

    public void setManagerSex(String managerSex) {
        ManagerSex = managerSex;
    }

    public Date getManagerBirthday() {
        return ManagerBirthday;
    }

    public void setManagerBirthday(Date managerBirthday) {
        ManagerBirthday = managerBirthday;
    }

    public String getManagerPassword() {
        return ManagerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        ManagerPassword = managerPassword;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "ManagerNum=" + ManagerNum +
                ", ManagerName='" + ManagerName + '\'' +
                ", ManagerSex='" + ManagerSex + '\'' +
                ", ManagerBirthday=" + ManagerBirthday +
                ", ManagerPassword='" + ManagerPassword + '\'' +
                '}';
    }
}
