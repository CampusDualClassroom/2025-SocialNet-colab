package com.campusdual;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {
    List<Usuario> usuarios = new ArrayList<>();
    List<Post> post = new ArrayList<>();

    private void createUsers(){
        String nuevoUsuario = Utils.string("Añade nombre del nuevo usuario");
        usuarios.add(new Usuario(nuevoUsuario));
    }

    private Coments createComents(Usuario user){
        String nuevoComentario = Utils.string("Añade un comentario");
        return new Coments(nuevoComentario,user);
    }
}
