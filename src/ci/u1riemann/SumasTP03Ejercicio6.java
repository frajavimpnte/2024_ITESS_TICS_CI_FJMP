
package ci.u1riemann;


public class SumasTP03Ejercicio6 extends SumasRiemann {

    public SumasTP03Ejercicio6(double[] x, double[] w) {
        super(x, w);
    }
  
    @Override
    public double funcion(double x) {
        return 3*Math.cos(0.5*x);
    }
}
