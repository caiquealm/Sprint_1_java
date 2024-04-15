package com.example.sprint_1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "TB_STATUSPEDIDO")
public class StatusPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_STATUSPEDIDO")
    @SequenceGenerator(name = "SQ_STATUSPEDIDO", sequenceName = "SQ_STATUSPEDIDO", allocationSize = 1)
    @Column(name = "ID_STATUSPEDIDO")
    private Long id;

    private String status;

    private String  localizacao;
}
