public class ResdientialSite extends Site {

    private double RS_units;
    private double RS_rate;

    public ResdientialSite(double units, double rate) {
        RS_units = units;
        RS_rate = rate;
    }

    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }

    private double getBaseAmount() {
        return RS_units * RS_rate;
    }

    private double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }
}
