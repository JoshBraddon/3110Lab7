public class LifelineSite extends Site {

    private double _units;
    private double _rate;

    public LifelineSite(double units, double rate) {
        _units = units;
        _rate = rate;
    }

    public double getBillableAmount() {
        base = _units * _rate * 0.5;
        tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }
}
