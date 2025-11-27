package com.campusdual;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SocialNetwork {
    List<Usuario> usuarios = new ArrayList<>();
    List<Post> post = new ArrayList<>();
    Usuario usuarioactivo = null;

    private void createUsers(){
        String nuevoUsuario = Utils.string("Añade nombre del nuevo usuario");
        usuarios.add(new Usuario(nuevoUsuario));
    }

    private Coments createComents(Usuario user){
        String nuevoComentario = Utils.string("Añade un comentario");
        return new Coments(nuevoComentario,user);
    }

    private void newPost(){
        int Opcion = Utils.integer("¿Que tipo de post quieres?\n 1.PostImagen\n 2.PostVideo\n 3.PostTexto");
        String title = Utils.string("Añade un titulo:");
        switch(Opcion){
            case 1:
                int dimensions = Utils.integer("Dimensiones de la imagen(numero):");
                ImagenPost newImage = new ImagenPost(dimensions, title);
                post.add(newImage);
                break;

            case 2:
                String quality = Utils.string("Calidad del video:");
                int duration = Utils.integer("Duracion del video");
                VideoPost newVideoPost = new VideoPost(quality, duration, title);
                post.add(newVideoPost);
                break;

            case 3:
                String coment = Utils.string("Post de texto:");
                TextPost newTextPost = new TextPost(coment, title);
                post.add(newTextPost);
                break;

            default:
                System.out.println("Opcion no encontrada");
                break;



        }
    }
    private void login (){
        String username= Utils.string("Nombre usuario: ");
        for (int i = 0; i<this.usuarios.size(); i ++){
          Usuario usertemporal =  usuarios.get(i);
          if (usertemporal.getUsername().equalsIgnoreCase(username)){
              usuarioactivo = usertemporal;
          }
        }
        if (usuarioactivo== null){
            System.out.println("Usuario no encontrado.");
        }
    }
    private void followuser(){
        String username= Utils.string("Usuario al que se quiere seguir: ");
        for (int i = 0; i<this.usuarios.size(); i ++){
            Usuario usertemporal =  usuarios.get(i);
            if (usertemporal.getUsername().equalsIgnoreCase(username)){
                usuarioactivo.addfollowers(usertemporal);
            }
        }
    }
    private void unfollowerUser(){
        usuarioactivo.listarFollowers();
        String username= Utils.string("Usuario al que se quiere dejar de seguir: ");
        List<Usuario> temporalSeguidores = usuarioactivo.getFollowers().stream()
            .filter(user -> !user.getUsername().equalsIgnoreCase(username))
            .collect(Collectors.toList());
        usuarioactivo.setFollowers(temporalSeguidores);
    }

}


