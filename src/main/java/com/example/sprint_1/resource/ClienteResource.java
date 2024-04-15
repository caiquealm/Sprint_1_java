package com.example.sprint_1.resource;


import com.example.sprint_1.entity.Cliente;
import com.example.sprint_1.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cliente")
    public class ClienteResource {

        @Autowired
        private ClienteRepository repo;

        @GetMapping
        public List<Cliente> findAll() {
            return repo.findAll();
        }

        @GetMapping(value = "/{id}")
        public Cliente findById(@PathVariable Long id) {
            return repo.findById(id).orElseThrow();
        }

        @Transactional
        @PostMapping
        public Cliente salvar(@RequestBody Cliente cliente) {
            return repo.save(cliente);
        }
    }
