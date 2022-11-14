public class ResdientialSite extends Site {

    private double RS_units;
    private double RS_rate;

    public ResdientialSite(double units, double rate) {
        RS_units = units;
        RS_rate = rate;
    }

    public double getBillableAmount() {
        return base() + tax();
    }

    private double base() {
        return RS_units * RS_rate;
    }

    private double tax() {
        return base() * Site.TAX_RATE;
    }
}
