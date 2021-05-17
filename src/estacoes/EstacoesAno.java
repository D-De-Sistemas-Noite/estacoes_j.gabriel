/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacoes;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class EstacoesAno {
    public static void main(String[] args) {
         int dia, mes;
         Scanner entrada = new Scanner(System.in);
         
         //Apresentação do sistema
        System.out.println("\n\t\t\t -- Estações do Ano --\n");
        
        
        //Entradas
        System.out.print("Informe o dia: ");
        dia = entrada.nextInt();
        System.out.print("Informe o mês: ");
        mes = entrada.nextInt();
        
        
        //Processamento
        if((dia >= 1) && (dia <= 31)){
            if((mes == 1) || (mes == 2) || (mes == 3)){
                //Saída
                if((mes == 3) && (dia >= 20)){
                    System.out.println("Outono!");
                } else {
                    System.out.println("Verão!");
                }
            } else if((mes == 4) || (mes == 5) || (mes == 6)){
                //Saída
                if((mes == 6) && (dia >= 21)){
                    System.out.println("Inverno!");
                } else {
                    System.out.println("Outono!");
                }
            } else if((mes == 7) || (mes == 8) || (mes == 9)){
                //Saída
                if((mes == 9) && (dia >= 23)){
                    System.out.println("Primavera");
                } else {
                    System.out.println("Inverno!");
                }
            } else if((mes == 10) || (mes == 11) || (mes == 12)){
                //Saída
                if((mes == 12) && (dia >= 22)){
                    System.out.println("Verão");
                } else {
                    System.out.println("Primavera");
                }
            } else {
                //Saída
                System.out.printf("Mês %d incorreto!\n\n", mes);
            }
        } else {
            //Saída
            System.out.printf("Dia %d incorreto!\n\n", dia);
        }
        
        
        
    }
    
}
    
