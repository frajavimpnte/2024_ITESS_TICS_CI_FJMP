package ci.u1riemann;

public class SumasEjemplo1 extends SumasRiemann {
    public SumasEjemplo1(double[] x, double[] w) {
        super(x, w);
    }
    
    @Override
    public double funcion(double x) {
        return 10 - x*x;
    }
}
