package com.br.model;

import com.br.model.Usuario;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Resposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mensagem;
    private LocalDateTime dataCriacao = LocalDateTime.now();

    @ManyToOne
    private com.model.Topico topico;

    @ManyToOne
    private Usuario autor;
}
