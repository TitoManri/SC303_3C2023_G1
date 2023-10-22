package Jframe;


import java.util.LinkedList;

public class RegistroUsuarios {

    private LinkedList<Usuario> listaUsuarios;

    public RegistroUsuarios() {
        this.listaUsuarios = new LinkedList<>();
    }

    // Metodo para agregar usuario
    public void agregarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    // Metodo para consultar usuarios
    public LinkedList<Usuario> getUsuarios() {
        return listaUsuarios;
    }

    // Método modificado para inactivar usuario
    public boolean inactivarUsuario(String nickname) {
          for (Usuario usuario : listaUsuarios) {
        if (usuario.getNickname().equals(nickname)) {
            if (usuario.estaActivo()) {
                usuario.inactivarUsuario();
                return true; // usuario encontrado y marcado como inactivo
            } else {
                return false; // usuario ya estaba inactivo
            }
        }
    }
    return false; // usuario no encontrado
    }

    public boolean tieneDatosRelacionados(Usuario usuario) {
        // Metodo para verificar si el usuario no tiene datos relacionados en otro catalogos (por asignar)
        return false;
    }

    //Método para mostrar los usuarios
    public String mostrarUsuarios() {
        StringBuilder sb = new StringBuilder();
        for (Usuario usuario : listaUsuarios) {
            sb.append(usuario.getNickname())
                    .append(" (")
                    .append(usuario.estaActivo() ? "Activo" : "Inactivo")
                    .append(")\n");
        }
        return sb.toString();
    }

}
