package com.example.sprint_1.resource;


import com.example.sprint_1.entity.Devolucao;
import com.example.sprint_1.repository.DevolucaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/devolucao")
    public class DevolucaoResource {

        @Autowired
        private DevolucaoRepository repo;

        @GetMapping
        public List<Devolucao> findAll() {
            return repo.findAll();
        }

        @GetMapping(value = "/{id}")
        public Devolucao findById(@PathVariable Long id) {
            return repo.findById(id).orElseThrow();
        }

        @Transactional
        @PostMapping
        public Devolucao salvar(@RequestBody Devolucao devolucao) {
            return repo.save(devolucao);
        }
    }

