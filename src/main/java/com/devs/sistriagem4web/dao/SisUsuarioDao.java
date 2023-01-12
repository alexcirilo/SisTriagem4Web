package com.devs.sistriagem4web.dao;

import com.devs.sistriagem4web.model.SisUsuario;
import org.springframework.jdbc.core.JdbcTemplate;

public class SisUsuarioDao {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int save(SisUsuario u){
        String sql = "insert into sis_usuario (nome, login,senha,perfil_id) VALUES(?,?,?,?)";
        return template.update(sql,u.getNome(), u.getLogin(),u.getSenha(),u.getPerfil_id());
    }
}
