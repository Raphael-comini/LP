package br.cefetmg.inf.lista03.p1038;
import java.util.Scanner;
class ItemCardapio {
    int codigo;
    double preco;
    void definirPreco() {
        if (codigo == 1) preco = 4.00;
        else if (codigo == 2) preco = 4.50;
        else if (codigo == 3) preco = 5.00;
        else if (codigo == 4) preco = 2.00;
        else if (codigo == 5) preco = 1.50;
    }
    double calcularTotal(int quantidade) {
        return preco * quantidade;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        sc.close();
        ItemCardapio item = new ItemCardapio();
        item.codigo = codigo;
        item.definirPreco();
        double total = item.calcularTotal(quantidade);
        System.out.printf("Total: R$ %.2f\n", total);
        sc.close();
    }
}
