package com.api.nyx.gastosrecife.services;

import com.api.nyx.gastosrecife.repositories.DespesasRepository;
import org.springframework.stereotype.Service;

@Service
public class DespesasService {

    private final DespesasRepository despesasRepository;

    public DespesasService(DespesasRepository despesasRepository) {
        this.despesasRepository = despesasRepository;
    }
}
