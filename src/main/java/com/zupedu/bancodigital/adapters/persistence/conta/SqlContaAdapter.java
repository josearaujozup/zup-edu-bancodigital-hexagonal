package com.zupedu.bancodigital.adapters.persistence.conta;

import com.zupedu.bancodigital.domain.conta.CadastraContaRepository;
import com.zupedu.bancodigital.domain.conta.Conta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SqlContaAdapter implements CadastraContaRepository {

    @Autowired
    private ContaRepository repository;

    @Override
    public Conta salva(Conta conta) {
        return repository.save(conta);
    }
}
