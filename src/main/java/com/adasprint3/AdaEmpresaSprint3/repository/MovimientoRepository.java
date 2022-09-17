package com.adasprint3.AdaEmpresaSprint3.repository;

import com.adasprint3.AdaEmpresaSprint3.model.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {
}