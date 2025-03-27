package com.distribuidora.pdv.repository;

import com.distribuidora.pdv.model.NF;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NFRepository extends JpaRepository<NF, Long> {
}
