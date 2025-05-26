/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1042poo;
import java.util.Scanner;
import java.util.Arrays;
class Numeros {
    int[] valores = new int[3];
    int[] ordenar() {
        int[] copia = Arrays.copyOf(valores, valores.length);
        Arrays.sort(copia);
        return copia;
    }
    void exibir(int[] array) {
        for (int num : array) {
            System.out.println(num);
        }
    }
}
public class P1042poo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numeros numeros = new Numeros();
        for (int i = 0; i < 3; i++) {
            numeros.valores[i] = sc.nextInt();
        }
        sc.close();
        int[] ordenados = numeros.ordenar();
        numeros.exibir(ordenados);

        System.out.println(); 

        numeros.exibir(numeros.valores);
    }
}
