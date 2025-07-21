package br.cefetmg.inf.lab20250721;
import java.util.Scanner;
//Folha de Pagamento-Versão B
class Func{
    int codigo;
    String nome;
    public Func(String nome, int codigo){
        this.nome = nome;
        this.codigo = codigo;
    }
    double horasNormais = 0;
    double INSS;
    public void setarHorasNormais(double HorasNormais){
        this.horasNormais += horasNormais;
    }
    double horasExtras = 0;
    public void setarHorasExtras(double HorasExtras){
        this.horasExtras += horasExtras;
    }
    double SalarioBruto;
    public void setarSalarioBruto(double salarioBruto)
    {
        this.salarioBruto = salarioBruto;
    }
    public void setarINSS(double INSS){
        this.INSS = INSS;
    }
}
class CalcularINSS{
    
}
class CalcularSalarioBruto{
    private Func funcionario;
    void calcularSalarioBruto(){
        double salarioBruto = (funcionario.horasTrabalhadas*100) + (funcionario.horasExtras*150);
    }
}
class Registro{
    Func funcionario;
    int codigoregistro;
    double horasTrabalhadas;
    String data;
    public Registro(String data, int codigoregistro, double horasTrabalhadas){
        this.data = data;
        this.codigoregistro = codigoregistro;
        this. horasTrabalhadas = horasTrabalhadas;
    }
    void relacionarFuncionario(){
        for(int j = 0; j < listaFuncionarios.tamanho(); j ++){
            Func temp = listaFuncionarios.obterPosicao(i);
            if(codigoregistro == temp.codigo){
                    Func funcionario = temp;
                }
            }
        double horasNormais;
        double horasExtras;
        if(horasTrabalhadas > 8){
            horasNormais = 8;
            horasExtras = horasTrabalhadas - 8;
        }
        else{
            horasExtras = 0;
            horasNormais = horasTrabalhadas;
        }
        funcionario.setarHorasNormais(horasNormais);
    }
}

class Console{
    Scanner scanner = new Scanner(System.in);
    public int quant;
    public ListaArray listaFuncionarios = new ListaArray();
    ListaArray listaRegistros = new ListaArray();
    public Console(int quant){
        this.quant = quant;
    }
    void Ler(){
        for(int i = 0; i<quant; i++)
        {
            int codigo = scanner.nextInt();
            String nome = scanner.next();
            Func funcionario = new Func(nome, codigo);
            listaFuncionarios.inserirInicio(funcionario);
        }
        int m = scanner.nextInt();
        for(int i = 0; i < m; i++){
            String data = scanner.next();
            int codigoregistro = scanner.nextInt();
            double horasTrabalhadas = scanner.nextDouble();
            Registro registro = new Registro(data, codigoregistro, horasTrabalhadas);
            listaRegistros.inserirInicio(registro);
        }
    }
}
public class Main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Console console = new Console(n);
    console.Ler();
    }
}
