/*
 * ITESS-TICS
 * ENERO - JUNO 2024
 * CALCULO INTEGRAL
 * UNIDAD 1: TEORAMA FUNDAMENTAL DEL CALCULO
 * CALCULO DE APROXIMACION DE AREAS TEST
 * FRANCISCO MONTECILLO
 * 09 / FEBRERO / 2024
 */
package ci.u1teoremaf;


public class AreaAproximationTest {
    public static void main(String args[]) {
        AreaAproximation ap = new AreaAproximation(0.0, 4.0, 10000);
        
        ap.computeArea();
        
        System.out.println(ap.getArea());
         
    }
}
