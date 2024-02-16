/*
 * ITESS-TICS
 * ENERO - JUNO 2024
 * CALCULO INTEGRAL
 * UNIDAD 1: TEOREMA FUNDAMENTAL DEL CALCULO
 * CALCULO DE SERIES
 * FRANCISCO MONTECILLO
 * 16 / FEBRERO / 2024
 */

package ci.u1serie;

public class Serie {
    private int iIni;
    private int iEnd;
    private int n;
    private int i[];
    private int f[];
    private int suma;

    public Serie(int iIni, int iEnd) {
        this.iIni = iIni;
        this.iEnd = iEnd;
        
        n = iEnd - iIni + 1;
        i = new int[n];
        f = new int[n];
    }
    
    public void compute() {
        int index = 0;
        suma = 0;
        for (int i = iIni; i <= iEnd; i++) {
            this.i[index] = i;
            f[index] = 2*i*i - 2*i;
            suma += f[index];
            index++;
        }
    }
    
    public void print() {
        System.out.println("index  |   i   |   f");
        for (int index = 0; index < n; index++) {
            System.out.println(index + "   |   " + i[index] + "   | " + f[index]);
        }
        System.out.println("suma: " + suma);
    }
}
