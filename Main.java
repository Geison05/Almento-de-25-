import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    //Variavel
    double salarioAtual = 0.0,
           novoSalario = 0.0;
    //Entrada de dados
    System.out.println("Salario Atual :"); 
    salarioAtual = leitor.nextDouble();
    //Processamento
    novoSalario = salarioAtual * 1.25;   
    //Saida
    System.out.println("Novo Salario :" + novoSalario);
  }
}