package br.com.letscode.bankaperationsapi.Exceptions;

public class InsufficientBalanceException extends RuntimeException{

    private final String MESSAGE  = "Você não tem saldo para realizar este saque.";

    public InsufficientBalanceException(){

    }
}
