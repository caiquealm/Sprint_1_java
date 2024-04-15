package com.example.sprint_1.resource;

import com.example.sprint_1.entity.Produto;
import com.example.sprint_1.entity.StatusPedido;
import com.example.sprint_1.repository.ProdutoRepository;
import com.example.sprint_1.repository.StatusPedidoRepository;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/statuspedido")
public class StatusPedidoResource {
    @Autowired
    private StatusPedidoRepository repo;

    @GetMapping
    public List<StatusPedido> findAll() {
        return repo.findAll();
    }

    @GetMapping(value = "/{id}")
    public StatusPedido findById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Transactional
    @PostMapping
    public StatusPedido salvar(@RequestBody StatusPedido statusPedido) {
        return repo.save(statusPedido);
    }
}
