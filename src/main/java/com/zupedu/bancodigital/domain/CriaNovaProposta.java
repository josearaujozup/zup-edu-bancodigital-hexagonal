package com.zupedu.bancodigital.domain;

import org.springframework.stereotype.Service;

@Service
public class CriaNovaProposta {

    private final CadastraPropostaRepository repository;

    public CriaNovaProposta(CadastraPropostaRepository repository) {
        this.repository = repository;
    }

    public Proposta cria(DadosNovaProposta novaProposta){
        var proposta = novaProposta.toModel();

        repository.salva(proposta);

        return proposta;
    }

}
