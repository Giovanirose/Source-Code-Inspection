package br.calebe.ticketmachine.exception;
/**
 * @author Calebe de Paula Bianchini
 * @author Giovani Castilho
 * @author Otavio Villela
 */
public class PapelMoedaInvalidaException extends Exception {

    public PapelMoedaInvalidaException() {
        super("Esta nota de papel moeda é inválida, tente novamente!");
    }   
}
