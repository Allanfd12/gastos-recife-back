package com.api.nyx.gastosrecife.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DespesasRepository extends JpaRepository<DespesasRepository, UUID> {

}
