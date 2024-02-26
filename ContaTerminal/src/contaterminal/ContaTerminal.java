/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contaterminal;

import java.util.Scanner;

/**
 *
 * @author Ana Macedo
 */
public class ContaTerminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero;
       String agencia, nome;
       double saldo;
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        nome = entrada.next();
        
        System.out.println("Digite sua Agencia: ");
        agencia = entrada.next();
        
        System.out.println("Digite o numero: ");
        numero = entrada.nextInt();
        
        System.out.println("Digite o saldo: ");
        saldo = entrada.nextDouble();
        
        
        System.out.println("Olá " + nome + " Obrigado por criar uma conta em nosso banco, sua agencia é  "+ agencia + " conta " + numero + " e seu saldo já está disponivel para saque "+ saldo);
        
        
    }
    
}
