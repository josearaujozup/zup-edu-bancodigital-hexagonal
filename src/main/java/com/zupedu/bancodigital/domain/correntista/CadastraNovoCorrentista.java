package com.zupedu.bancodigital.domain.correntista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastraNovoCorrentista {

    @Autowired
    private CadastraCorrentistaRepository repository;

    public Correntista salva(DadosNovoCorrentista novoCorrentista){

        Correntista correntista = repository.salva(novoCorrentista.toModel());

        return correntista;
    }

}
