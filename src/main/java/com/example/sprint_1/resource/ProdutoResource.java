package com.example.sprint_1.resource;


import com.example.sprint_1.entity.Produto;
import com.example.sprint_1.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoResource {
    @Autowired
    private ProdutoRepository repo;

    @GetMapping
    public List<Produto> findAll() {
        return repo.findAll();
    }

    @GetMapping(value = "/{id}")
    public Produto findById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Transactional
    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return repo.save(produto);
    }
}
