package com.zupedu.bancodigital.adapters.persistence;

import com.zupedu.bancodigital.domain.CadastraPropostaRepository;
import com.zupedu.bancodigital.domain.Proposta;
import org.springframework.stereotype.Component;

@Component
public class SqlPropostaRepository implements CadastraPropostaRepository {

    private final PropostaRepository propostaRepository;

    public SqlPropostaRepository(PropostaRepository propostaRepository) {
        this.propostaRepository = propostaRepository;
    }

    @Override
    public Proposta salva(Proposta proposta) {
        return propostaRepository.save(proposta);
    }
}
