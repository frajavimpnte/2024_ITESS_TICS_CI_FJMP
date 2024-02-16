/*
 * ITESS-TICS
 * ENERO - JUNO 2024
 * CALCULO INTEGRAL
 * UNIDAD 1: TEOREMA FUNDAMENTAL DEL CALCULO
 * CALCULO DE APROXIMACION DE AREAS TEST
 * FRANCISCO MONTECILLO
 * 09 / FEBRERO / 2024
 */
package ci.u1teoremaf;


public class AreaAproximationTest {
    public static void main(String args[]) {
        AreaAproximation ap = new AreaAproximation(1, 3, 10);
        
        ap.computeArea();
        ap.print();
        System.out.println(ap.getArea());
         
    }
}
