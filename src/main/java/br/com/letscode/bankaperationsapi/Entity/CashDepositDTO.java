package br.com.letscode.bankaperationsapi.Entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CashDepositDTO {

    private Long id;

    private BigDecimal value;

    private BigDecimal balance;
}
