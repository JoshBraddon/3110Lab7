public abstract class Site {
    public static final double TAX_RATE = 1.13;

    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }

    abstract double getBaseAmount();

    abstract double getTaxAmount();
}
