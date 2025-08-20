package br.com.ForumHub.repository;

import com.br.model.Resposta;
import com.br.model.Usuario;
import com.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}
public interface TopicoRepository extends JpaRepository<com.model.Topico, Long> {}
public interface RespostaRepository extends JpaRepository<Resposta, Long> {}
