package com.zupedu.bancodigital.domain.conta;

import com.zupedu.bancodigital.domain.correntista.RetornaCorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastraNovaConta {

    @Autowired
    private CadastraContaRepository repository;

    @Autowired
    private RetornaCorrentistaRepository correntistaRepository;

    public Conta salva(DadosNovaConta novaConta){

        Conta conta = repository.salva(novaConta.toModel(correntistaRepository));

        return conta;
    }

}
