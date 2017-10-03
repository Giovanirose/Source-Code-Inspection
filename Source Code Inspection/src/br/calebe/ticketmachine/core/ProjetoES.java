package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Calebe de Paula Bianchini
 * @author Giovani Castilho
 * @author Otavio Villela
 */
 
public class ProjetoES {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        TicketMachine tm = null; //Instância nula para facilitar testes e utilização
        Utilizar(tm); // Método para utilização da classe TicketMachine
        
        // --- TESTES --- //
        tm.valor = 20;
        tm.saldo = 1000;
        int notaDeDois = tm.papelMoeda[0];
        int notaDeCinco = tm.papelMoeda[1];
        int notaDeDez = tm.papelMoeda[2];
        int notaDeVinte = tm.papelMoeda[3];
        int notaDeCinquenta = tm.papelMoeda[4];
        int notaDeCem = tm.papelMoeda[5];
        
        try {
            tm.inserir(40);
        } catch (PapelMoedaInvalidaException ex) {
            ex.getMessage();
        }
        // --- FIM DOS TESTES --- //
    } 
    
    public static void Utilizar(TicketMachine tm){
        System.out.println("Digite a quantia a ser inserida: ");
            int quantia = Integer.parseInt(sc.nextLine());
        tm = new TicketMachine(quantia);
        
        try {
           tm.inserir(quantia);
           tm.getTroco();
        } catch (PapelMoedaInvalidaException | SaldoInsuficienteException ex){
           ex.getMessage();
        }
        tm.imprimir();
    }
}