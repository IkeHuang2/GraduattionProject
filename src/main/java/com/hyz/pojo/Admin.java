package com.hyz.pojo;

public class Admin {
    private String adminPassword;
    private Integer adminAccount;

    @Override
    public String toString() {
        return "Admin{" +
                "adminPassword='" + adminPassword + '\'' +
                ", adminAccount=" + adminAccount +
                '}';
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public Integer getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(Integer adminAccount) {
        this.adminAccount = adminAccount;
    }
}
