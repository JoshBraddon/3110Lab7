public class ResdientialSite extends Site {

    private double RS_units;
    private double RS_rate;

    public ResdientialSite(double units, double rate) {
        RS_units = units;
        RS_rate = rate;
    }

    public double getBillableAmount() {
        double base = RS_units * RS_rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
