/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1134;
import java.util.Scanner;
public class P1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (true) {
            int codigo = sc.nextInt();
            if (codigo < 1 || codigo > 4) {
                continue; // pede novo código
            }

            if (codigo == 4) {
                break; 
            }
            if (codigo == 1) alcool++;
            else if (codigo == 2) gasolina++;
            else if (codigo == 3) diesel++;
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
