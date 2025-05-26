/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1245;
import java.util.Scanner;
public class P1245 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] botasE = new int[61];
            int[] botasD = new int[61];
            int pares = 0;

            for (int i = 0; i < n; i++) {
                int tamanho = scanner.nextInt();
                String lado = scanner.next();

                if (lado.equals("E")) {
                    botasE[tamanho]++;
                } else {
                    botasD[tamanho]++;
                }
            }

            for (int i = 30; i <= 60; i++) {
                pares += Math.min(botasE[i], botasD[i]);
            }

            System.out.println(pares);
        }
        scanner.close();
    }
}
