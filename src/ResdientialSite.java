public class ResdientialSite extends Site {

    private double _units;
    private double _rate;

    public ResdientialSite(double units, double rate) {
        _units = units;
        _rate = rate;
    }

    public double getBillableAmount() {
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
