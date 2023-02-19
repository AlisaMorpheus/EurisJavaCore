package it.euris.academy2023.portfolio;

public class Main {
    public static void main(String[] args) {
        FinancialInstrument f1 = new FinancialInstrument("182223", "bbb",
                1.05F, "IT", "EUR", TypeFinancialInstrument.BND);
        FinancialInstrument f2 = new FinancialInstrument("82263763", "hsh", 2.04f, "CH", "CNY", TypeFinancialInstrument.EQY);
        FinancialInstrument f3 = new FinancialInstrument("82328hge", "robeacaso", 92.08f, "JP", "JPY", TypeFinancialInstrument.CC);
        Balance b1 = new Balance(f1, 73.7f);
        Balance b2 = new Balance(f2, 7.5f);
        Balance b3 = new Balance(f3, 63.6f);

        Account a1 = new Account("geueed", 64.5f, CusRelation.DR);
        Account a2 = new Account("uwgwwg", 7.4f, CusRelation.CC);
        Account a3 = new Account("nwhwvw", 2.4f, CusRelation.DT);

        Customer c1 = new Customer("Gino", "Gini", 19888,"RRAARACA65665", CusRelation.DR);

        PortfolioSimulator ps = new PortfolioSimulator();
        //ps.printXml();

        /*
        a1.getBalances().add(b1);
        a1.getBalances().add(b1)
        Customer c1 = new Customer(....)
        c1.getAccounts().add(a1);

        PortfolioSimulator ps = new PortfolioSimulator();
        ps.addCustomer(c1);
         */

    }
}
