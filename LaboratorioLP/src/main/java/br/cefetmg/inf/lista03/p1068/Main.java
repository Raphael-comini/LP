package br.cefetmg.inf.lista03.p1068;
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
public class Main {
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
