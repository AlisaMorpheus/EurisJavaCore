package it.euris.academy2023.supermercato.Departments;

import Products.Product;

import java.util.List;

public class FrozenFoodDept extends Department{
    private static final DepartmentType DEPARTMENT_TYPE=DepartmentType.FROZENFOOD;

    public FrozenFoodDept(List<Product> productList) {
        super(productList);
    }

    @Override
    public DepartmentType getDepartmentType() {
        return DEPARTMENT_TYPE;
    }

    /*@Override
    public String toString() {
        return "Frozen food department " + super.toString();
    }*/
}
