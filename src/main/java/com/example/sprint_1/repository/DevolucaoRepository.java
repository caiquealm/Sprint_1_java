package com.example.sprint_1.repository;


import com.example.sprint_1.entity.Devolucao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DevolucaoRepository extends JpaRepository<Devolucao, Long> {



}
