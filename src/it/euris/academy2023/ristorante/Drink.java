package it.euris.academy2023.ristorante;

public class Drink{
    String nameDrink;
    double priceDrink;

    public Drink(String nameDrink, double priceDrink) {
        this.nameDrink = nameDrink;
        this.priceDrink = priceDrink;
    }

    public String getNameDrink() {
        return nameDrink;
    }

    public void setNameDrink(String nameDrink) {
        this.nameDrink = nameDrink;
    }

    public double getPriceDrink() {
        return priceDrink;
    }

    public void setPriceDrink(double priceDrink) {
        this.priceDrink = priceDrink;
    }
}


