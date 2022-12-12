package com.hyz.pojo;

public class Locker {
    private Integer memberAccount;
    private Integer employeeAccount;
    private Integer lockerNumber;
    private Integer lockerStatus;


    @Override
    public String toString() {
        return "Locker{" +
                "memberAccount=" + memberAccount +
                ", employeeAccount=" + employeeAccount +
                ", lockerNumber=" + lockerNumber +
                ", lockerStatus=" + lockerStatus +
                '}';
    }

    public Locker() {
    }

    public Integer getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(Integer memberAccount) {
        this.memberAccount = memberAccount;
    }

    public Integer getEmployeeAccount() {
        return employeeAccount;
    }

    public void setEmployeeAccount(Integer employeeAccount) {
        this.employeeAccount = employeeAccount;
    }

    public Integer getLockerNumber() {
        return lockerNumber;
    }

    public void setLockerNumber(Integer lockerNumber) {
        this.lockerNumber = lockerNumber;
    }

    public Integer getLockerStatus() {
        return lockerStatus;
    }

    public void setLockerStatus(Integer lockerStatus) {
        this.lockerStatus = lockerStatus;
    }

    public Locker(Integer memberAccount, Integer employeeAccount, Integer lockerNumber, Integer lockerStatus) {
        this.memberAccount = memberAccount;
        this.employeeAccount = employeeAccount;
        this.lockerNumber = lockerNumber;
        this.lockerStatus = lockerStatus;
    }
}
