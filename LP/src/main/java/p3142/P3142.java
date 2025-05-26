/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3142;
import java.util.Scanner;
public class P3142 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String coluna = scanner.next();
            int valor = 0;
            boolean valida = true;
            
            for (int i = 0; i < coluna.length(); i++) {
                char c = coluna.charAt(i);
                if (c < 'A' || c > 'Z') {
                    valida = false;
                    break;
                }
                valor = valor * 26 + (c - 'A' + 1);
            }
            
            if (valida && valor >= 1 && valor <= 16384) {
                System.out.println(valor);
            } else {
                System.out.println("Essa coluna nao existe Tobias!");
            }
        }
    }
}
