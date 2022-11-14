public class ResdientialSite extends Site {

    private double RS_units;
    private double RS_rate;

    public ResdientialSite(double units, double rate) {
        RS_units = units;
        RS_rate = rate;
    }

    protected double getBaseAmount() {
        return RS_units * RS_rate;
    }

    protected double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }
}
