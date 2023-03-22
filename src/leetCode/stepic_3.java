package leetCode;

import java.util.Objects;

public final class stepic_3 {
    private final double re;
    private final double im;

    public stepic_3(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }

    public static void main(String[] args) {
        stepic_3 a = new stepic_3(1, 1);
        stepic_3 b = new stepic_3(1, 1);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}

