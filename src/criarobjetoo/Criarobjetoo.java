
package criarobjetoo;


public class Criarobjetoo {


    public static void main(String[] args) {
      
        funcionario f1 = new funcionario();
        
        
        f1.nome = "Pedro";
        f1.trabalho = "Programador";
        f1.datadentrada = "05/04/2015";
        f1.RG = "44.888.376-4";
        f1.salario = 2500;
               
        
        f1.Apresentar();
        System.out.println("-------------------");
        System.out.println("Aumento: ");
        f1.recebeAumento();
        System.out.println("Ganho anual: ");
        f1.calcularGanhoAnual();
       }
    
    
   
}
    
