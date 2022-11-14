public class LifelineSite extends Site {

    private double LS_units;
    private double LS_rate;

    public LifelineSite(double units, double rate) {
        LS_units = units;
        LS_rate = rate;
    }

    public double getBillableAmount() {
        double base = LS_units * LS_rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }
}
