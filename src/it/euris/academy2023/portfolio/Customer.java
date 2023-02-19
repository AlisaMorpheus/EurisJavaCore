package it.euris.academy2023.portfolio;

public class Customer {
    private String cusName;
    private String cusSurname;
    private int cusBirthYear;
    private String cusFiscalCode;
    private CusRelation cusRelation;

    public Customer(String cusName, String cusSurname, int cusBirthYear, String cusFiscalCode, CusRelation cusRelation) {
        this.cusName = cusName;
        this.cusSurname = cusSurname;
        this.cusBirthYear = cusBirthYear;
        this.cusFiscalCode = cusFiscalCode;
        this.cusRelation = cusRelation;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusSurname() {
        return cusSurname;
    }

    public void setCusSurname(String cusSurname) {
        this.cusSurname = cusSurname;
    }

    public int getCusBirthYear() {
        return cusBirthYear;
    }

    public void setCusBirthYear(int cusBirthYear) {
        this.cusBirthYear = cusBirthYear;
    }

    public String getCusFiscalCode() {
        return cusFiscalCode;
    }

    public void setCusFiscalCode(String cusFiscalCode) {
        this.cusFiscalCode = cusFiscalCode;
    }

    public CusRelation getCusRelation() {
        return cusRelation;
    }

    public void setCusRelation(CusRelation cusRelation) {
        this.cusRelation = cusRelation;
    }
}
