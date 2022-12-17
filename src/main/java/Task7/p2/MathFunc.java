package Task7.p2;

public class MathFunc implements MathCalculable{

    @Override
    public double pow(double a, double n) {
        return Math.pow(a, n);
    }

    @Override
    public double absolutePsevdo(double real, double imagine) {
        return Math.sqrt(real * real + imagine * imagine);
    }

    public double square(double r) {
        return PI * pow(r, 2);
    }
}
