package com.example.sprint_1.resource;

import com.example.sprint_1.entity.Endereco;
import com.example.sprint_1.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/endreco")
public class EnderecoResource {

    @Autowired
    private EnderecoRepository repo;

    @GetMapping
    public List<Endereco> findAll() {
        return repo.findAll();
    }

    @GetMapping(value = "/{id}")
    public Endereco findById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Transactional
    @PostMapping
    public Endereco salvar(@RequestBody Endereco endereco) {
        return repo.save(endereco);
    }
}
