public class ResdientialSite extends Site {

    private double base;
    private double tax;

    public ResdientialSite() {

    }

    public double getBillableAmount() {
        base = _units * _rate;
        tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
