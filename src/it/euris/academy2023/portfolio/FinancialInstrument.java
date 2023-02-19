package it.euris.academy2023.portfolio;

public class FinancialInstrument {
    private String code;
    private String description;
    private float lastPrice;
    private String country;
    private String currency;
    private TypeFinancialInstrument type;

    public FinancialInstrument(String code, String description, float lastPrice, String country, String currency, TypeFinancialInstrument type) {
        this.code = code;
        this.description = description;
        this.lastPrice = lastPrice;
        this.country = country;
        this.currency = currency;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(float lastPrice) {
        this.lastPrice = lastPrice;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public TypeFinancialInstrument getType() {
        return type;
    }

    public void setType(TypeFinancialInstrument type) {
        this.type = type;
    }
}
