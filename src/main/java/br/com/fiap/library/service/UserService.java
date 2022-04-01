package br.com.fiap.library.service;

import br.com.fiap.library.dto.AuthDTO;
import br.com.fiap.library.dto.JwtDTO;
import br.com.fiap.library.dto.UserCreateDTO;
import br.com.fiap.library.dto.UserDTO;

public interface UserService {
    UserDTO create(UserCreateDTO userCreateDTO);
    JwtDTO login(AuthDTO authDTO);
}