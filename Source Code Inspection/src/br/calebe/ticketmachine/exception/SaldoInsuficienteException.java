package br.calebe.ticketmachine.exception;
/**
 * @author Calebe de Paula Bianchini
 * @author Giovani Castilho
 * @author Otavio Villela
 */
public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException() {
        super("O saldo é insuficiente no momento, tente novamente!");
    }
}
