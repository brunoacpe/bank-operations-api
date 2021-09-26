package br.com.letscode.bankaperationsapi.Controller;

import br.com.letscode.bankaperationsapi.Entity.CashDepositDTO;
import br.com.letscode.bankaperationsapi.Entity.WithdrawAccountDTO;
import br.com.letscode.bankaperationsapi.Services.OperationsService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operations")
public class OperationsController {

    @Autowired
    private OperationsService service;


    @PostMapping("/withdraw")
    public ResponseEntity<WithdrawAccountDTO> withdrawMoney(@RequestBody WithdrawAccountDTO account){
        return ResponseEntity.status(200).body(service.withdraw(account));
    }

    @PostMapping("/deposit")
    public ResponseEntity<CashDepositDTO> cashDeposit(@RequestBody CashDepositDTO account){
        return ResponseEntity.status(200).body(service.cashDeposit(account));
    }
}
