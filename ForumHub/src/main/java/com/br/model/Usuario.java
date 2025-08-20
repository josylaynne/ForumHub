package com.br.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    private static final Object GenerationType = new Object();
    //@GeneratedValue(strategy = GenerationType);
    private Long id;

    private String nome;
    private String email;
    private String senha;
}
