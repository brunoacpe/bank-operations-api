package br.com.letscode.bankaperationsapi.Services;

import br.com.letscode.bankaperationsapi.Entity.CashDepositDTO;
import br.com.letscode.bankaperationsapi.Entity.WithdrawAccountDTO;
import br.com.letscode.bankaperationsapi.Exceptions.InsufficientBalanceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Slf4j
public class OperationsService {

    public WithdrawAccountDTO withdraw(WithdrawAccountDTO account) {
        BigDecimal balance = account.getBalance();
        BigDecimal value = account.getValue();
        Long id = account.getId();

        if(account.getBalance().compareTo(value) ==-1){
            throw new InsufficientBalanceException();
        }

        account.setBalance(balance.subtract(value));
        return account;
    }

    public CashDepositDTO cashDeposit(CashDepositDTO account) {
        account.setBalance(account.getBalance().add(account.getValue()));
        return account;
    }
}
