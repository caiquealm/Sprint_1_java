package com.example.sprint_1.resource;



import com.example.sprint_1.entity.Telefone;
import com.example.sprint_1.repository.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/telefone")
public class TelefoneResource {
    @Autowired
    private TelefoneRepository repo;

    @GetMapping
    public List<Telefone> findAll() {
        return repo.findAll();
    }

    @GetMapping(value = "/{id}")
    public Telefone findById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Transactional
    @PostMapping
    public Telefone salvar(@RequestBody Telefone telefone) {
        return repo.save(telefone);
    }
}


