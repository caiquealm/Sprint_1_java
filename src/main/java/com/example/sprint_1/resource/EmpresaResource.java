package com.example.sprint_1.resource;

import com.example.sprint_1.entity.Empresa;
import com.example.sprint_1.repository.EmpresaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/empresa")
public class EmpresaResource {

    @Autowired
    private EmpresaRepository repo;

    @GetMapping
    public List<Empresa> findAll() {
        return repo.findAll();
    }

    @GetMapping(value = "/{id}")
    public Empresa findById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Transactional
    @PostMapping
    public Empresa salvar(@RequestBody Empresa empresa) {
        return repo.save(empresa);
    }
}
