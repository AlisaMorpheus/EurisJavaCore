package it.euris.academy2023.supermercato.Supermarkets;

import it.euris.academy2023.supermercato.Departments.Department;

import java.util.List;

public class Supermarket {
    private String sName;
    private Integer maxStock;
    private List<Department> departments;

    //constructor
    public Supermarket(String sName, Integer maxStock, List<Department> departments) {
        this.sName = sName;
        this.maxStock = maxStock;
        this.departments = departments;
    }
    //getters and setters

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(Integer maxStock) {
        this.maxStock = maxStock;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Supermarket{" +
                "Name='" + sName + '\'' +
                ", maxStock=" + maxStock +
                //for
                //", departments=" + departments+
                '}';
    }
}