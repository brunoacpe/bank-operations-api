package br.com.letscode.bankaperationsapi.Entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class WithdrawAccountDTO {

    private Long id;
    private BigDecimal balance;
    private BigDecimal value;

}
