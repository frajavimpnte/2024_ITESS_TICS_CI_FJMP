/*
 * ITESS-TICS
 * ENERO - JUNO 2024
 * CALCULO INTEGRAL
 * UNIDAD 1: TEOREMA FUNDAMENTAL DEL CALCULO
 * CALCULO DE SERIES TEST
 * FRANCISCO MONTECILLO
 * 16 / FEBRERO / 2024
 */
package ci.u1serie;

import ci.u1serie.Serie;

public class SerieTest {
    public static void main(String ... args) {
        Serie s = new Serie(1,25);
        
        s.compute();
        s.print();
    }
}
