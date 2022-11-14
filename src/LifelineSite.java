public class LifelineSite extends Site {

    private double LS_units;
    private double LS_rate;

    public LifelineSite(double units, double rate) {
        LS_units = units;
        LS_rate = rate;
    }

    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }

    private double getBaseAmount() {
        return LS_units * LS_rate * 0.5;
    }

    private double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE * 0.2;
    }
}
