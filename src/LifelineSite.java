public class LifelineSite extends Site {

    private double base;
    private double tax;

    public LifelineSite() {

    }

    public double getBillableAmount() {
        base = _units * _rate * 0.5;
        tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }
}
