package dio.web.api.repository;


import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if(usuario.getId() ==null)
            System.out.println("SAVE - Recebendo o usuario na camada de repositório");
        else
            System.out.println( "UPDATE - Recebendo o usuario na camada de repositório");
        System.out.println(usuario);


    }
    public void deleteById(Integer id){
        System.out.println( String.format("DELETE/id- Recebendo o id: %d para excluir um usuario" ,id));
    }
    public List<Usuario> findAll(){
        System.out.println( "LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList();
        usuarios.add(new Usuario("Ramon","password"));
        usuarios.add(new Usuario("Pessoa","superpassword"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println( String.format("Find/id- Recebendo o id: %d para localizar um usuario",id));
        return new Usuario("Ramon","password");
    }
    public  Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username",username));
        return new Usuario("Ramon","password");
    }
}
