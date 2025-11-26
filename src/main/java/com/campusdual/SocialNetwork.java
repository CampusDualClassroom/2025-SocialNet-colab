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
}
