
package criarobjetoo;

import java.awt.BorderLayout;


public class funcionario {
    
   
    
    String nome;
    String trabalho;
    String datadentrada;
    String RG;
    double salario;
    
    public void recebeAumento(){
        
        System.out.println(salario + 1000);
  
    }
    
    public void calcularGanhoAnual(){
        
        System.out.println(salario + 1000 * 12);
        
        
    }
    
    public void Apresentar(){
        System.out.println(nome);
        System.out.println(trabalho);
        System.out.println(datadentrada);
        System.out.println(RG);
        System.out.println(salario);
    }
}
