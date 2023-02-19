package it.euris.academy2023.supermercato.Departments;

import Products.Product;

import java.util.List;

public class HomePersonalDept extends Department{
    private static final DepartmentType DEPARTMENT_TYPE=DepartmentType.HOMECLEANINGANDPERSONALCARE;

    public HomePersonalDept(List<Product> productList) {
        super(productList);
    }

    @Override
    public DepartmentType getDepartmentType() {
        return DEPARTMENT_TYPE;
    }

    /*@Override
    public String toString() {
        return "Home and personal care department " + super.toString();
    }*/
}
