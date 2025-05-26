/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1068;
import java.util.Scanner;
class Expressao {
    String texto;
    String verificar() {
        int contador = 0;

        for (char c : texto.toCharArray()) {
            if (c == '(') {
                contador++;
            } else if (c == ')') {
                if (contador == 0) {
                    return "incorrect";
                }
                contador--;
            }
        }

        if (contador == 0) {
            return "correct";
        } else {
            return "incorrect";
        }
    }
}
public class P1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            if (linha.isEmpty()) break; 
            Expressao expressao = new Expressao();
            expressao.texto = linha;
            System.out.println(expressao.verificar());
        }
        sc.close();
    }
}
