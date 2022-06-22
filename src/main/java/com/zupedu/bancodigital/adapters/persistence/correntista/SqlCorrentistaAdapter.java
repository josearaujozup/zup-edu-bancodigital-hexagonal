package com.zupedu.bancodigital.adapters.persistence.correntista;

import com.zupedu.bancodigital.domain.correntista.CadastraCorrentistaRepository;
import com.zupedu.bancodigital.domain.correntista.Correntista;
import com.zupedu.bancodigital.domain.correntista.RetornaCorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SqlCorrentistaAdapter implements CadastraCorrentistaRepository, RetornaCorrentistaRepository {

    @Autowired
    private CorrentistaRepository repository;

    @Override
    public Correntista salva(Correntista correntista) {
        return repository.save(correntista);
    }

    @Override
    public Optional<Correntista> retorna(Long id) {
        return repository.findById(id);
    }
}
