/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1105;
import java.util.Scanner;
class Banco {
    int reserva;

    Banco(int reservaInicial) {
        this.reserva = reservaInicial;
    }
    void debitar(int valor) {
        this.reserva -= valor;
    }
    void creditar(int valor) {
        this.reserva += valor;
    }
}
public class P1105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int B = sc.nextInt();
            int N = sc.nextInt();

            if (B == 0 && N == 0) {
                break;
            }

            Banco[] bancos = new Banco[B + 1]; 

            for (int i = 1; i <= B; i++) {
                int reserva = sc.nextInt();
                bancos[i] = new Banco(reserva);
            }

            for (int i = 0; i < N; i++) {
                int D = sc.nextInt(); 
                int C = sc.nextInt();
                int V = sc.nextInt(); 

                bancos[D].debitar(V);
                bancos[C].creditar(V);
            }

            boolean possivel = true;
            for (int i = 1; i <= B; i++) {
                if (bancos[i].reserva < 0) {
                    possivel = false;
                    break;
                }
            }

            if (possivel) {
                System.out.println("S");
            } else {
                System.out.println("N");
            }
        }

        sc.close();
    }
}
