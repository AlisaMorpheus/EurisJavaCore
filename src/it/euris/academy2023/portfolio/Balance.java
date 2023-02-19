package it.euris.academy2023.portfolio;

public class Balance {
    private float quoteNum;
    private FinancialInstrument tool;

    public Balance(FinancialInstrument tool, float quoteNum) {
        this.quoteNum = quoteNum;
        this.tool = tool;
    }

    public float getQuoteNum() {
        return quoteNum;
    }

    public void setQuoteNum(float quoteNum) {
        this.quoteNum = quoteNum;
    }

    public FinancialInstrument getTool() {
        return tool;
    }

    public void setTool(FinancialInstrument tool) {
        this.tool = tool;
    }
}
