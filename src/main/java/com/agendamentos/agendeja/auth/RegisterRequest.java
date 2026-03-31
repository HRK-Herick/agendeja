package com.agendamentos.agendeja.auth;

import com.agendamentos.agendeja.model.enums.TipoUsuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Classe responsável pelo cadastro do Usuário (ADMIN, FUNCIONARIO, CLIENTE)

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {

    private String name;
    private String email;
    private String password;
    private TipoUsuario tipoUsuario;

}
