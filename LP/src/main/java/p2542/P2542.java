/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2542;
import java.util.Scanner;
public class P2542 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int numAtributos = scanner.nextInt();
            int numCartasMarcos = scanner.nextInt();
            int numCartasLeonardo = scanner.nextInt();
            
            int[][] cartasMarcos = new int[numCartasMarcos][numAtributos];
            for (int i = 0; i < numCartasMarcos; i++) {
                for (int j = 0; j < numAtributos; j++) {
                    cartasMarcos[i][j] = scanner.nextInt();
                }
            }
            
            int[][] cartasLeonardo = new int[numCartasLeonardo][numAtributos];
            for (int i = 0; i < numCartasLeonardo; i++) {
                for (int j = 0; j < numAtributos; j++) {
                    cartasLeonardo[i][j] = scanner.nextInt();
                }
            }
            
            int cartaMarcos = scanner.nextInt() - 1;  
            int cartaLeonardo = scanner.nextInt() - 1;
            int atributoSorteado = scanner.nextInt() - 1;
            
            int valorMarcos = cartasMarcos[cartaMarcos][atributoSorteado];
            int valorLeonardo = cartasLeonardo[cartaLeonardo][atributoSorteado];
            
            if (valorMarcos > valorLeonardo) {
                System.out.println("Marcos");
            } else if (valorLeonardo > valorMarcos) {
                System.out.println("Leonardo");
            } else {
                System.out.println("Empate");
            }
        }
    }
}
