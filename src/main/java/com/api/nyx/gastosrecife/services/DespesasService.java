package com.api.nyx.gastosrecife.services;

import com.api.nyx.gastosrecife.models.DespesasModel;
import com.api.nyx.gastosrecife.repositories.DespesasRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class DespesasService {

    final DespesasRepository despesasRepository;

    public DespesasService(DespesasRepository despesasRepository) {
        this.despesasRepository = despesasRepository;
    }

    @Transactional
    public DespesasModel save(DespesasModel despesaModel) {
        return despesasRepository.save(despesaModel);
    }
}
