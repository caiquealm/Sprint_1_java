package com.example.sprint_1.repository;

import com.example.sprint_1.entity.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusPedidoRepository extends JpaRepository<StatusPedido, Long> {
}
