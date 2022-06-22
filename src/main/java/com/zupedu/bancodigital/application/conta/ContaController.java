package com.zupedu.bancodigital.application.conta;

import com.zupedu.bancodigital.adapters.persistence.conta.ContaRepository;
import com.zupedu.bancodigital.adapters.persistence.correntista.CorrentistaRepository;
import com.zupedu.bancodigital.domain.conta.CadastraNovaConta;
import com.zupedu.bancodigital.domain.conta.Conta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/api/contas")
public class ContaController {

    @Autowired
    private ContaRepository contaRepository;

    @Autowired
    private CadastraNovaConta service;

//    @Autowired
//    private CorrentistaRepository correntistaRepository;

    @PostMapping
    public ResponseEntity<?> cadastra(NovaContaRequest request,
                                      UriComponentsBuilder uriBuilder) {


//        var conta = contaRepository.save(request.paraConta(correntistaRepository));

        Conta conta = service.salva(request);

        var location = uriBuilder.path("/api/contas/{id}")
                .buildAndExpand(conta.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

}
