package it.euris.academy2023.portfolio;

public class Account {
    private String cusCode;
    private float cusBalance;
    private CusRelation cusRelation;

    public Account(String cusCode, float cusBalance, CusRelation cusRelation) {
        this.cusCode = cusCode;
        this.cusBalance = cusBalance;
        this.cusRelation = cusRelation;
    }

    public String getCusCode() {
        return cusCode;
    }

    public void setCusCode(String cusCode) {
        this.cusCode = cusCode;
    }

    public float getCusBalance() {
        return cusBalance;
    }

    public void setCusBalance(float cusBalance) {
        this.cusBalance = cusBalance;
    }

    public CusRelation getCusRelation() {
        return cusRelation;
    }

    public void setCusRelation(CusRelation cusRelation) {
        this.cusRelation = cusRelation;
    }
}