package com.example.sprint_1.entity;

import com.example.sprint_1.dto.response.ProdutoResponse;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder

@Entity
@Table(name = "TB_DEVOLUCAO")
public class Devolucao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DEVOLUCAO")
    @SequenceGenerator(name = "SQ_DEVOLUCAO", sequenceName = "SQ_DEVOLUCAO", allocationSize = 1)
    @Column(name = "ID_DEVOLUCAO")
    private Long id;

    private String motivo;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "PRODUTO",
            referencedColumnName = "ID_PRODUTO",
            foreignKey = @ForeignKey(
                    name = "FK_PRODUTO_DEVOLUCAO"
            )
    )
    private Produto produto;
}
