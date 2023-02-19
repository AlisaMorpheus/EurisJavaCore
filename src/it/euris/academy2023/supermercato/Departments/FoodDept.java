package it.euris.academy2023.supermercato.Departments;

import Products.Product;

import java.util.List;

public class FoodDept extends Department{
    private static final DepartmentType DEPARTMENT_TYPE=DepartmentType.FOOD;

    public FoodDept(List<Product> productList) {
        super(productList);
    }

    @Override
    public DepartmentType getDepartmentType() {
        return DEPARTMENT_TYPE;
    }

    /*@Override
    public String toString() {
        return "Food department " + super.toString();
    }*/
}
