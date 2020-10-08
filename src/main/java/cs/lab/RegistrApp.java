package cs.lab;

public class RegistrApp {
    boolean validar=true;

    public RegistrApp(){}

    public boolean iniciarSesion(String nombre){
        validar = nombre.matches("(?i)(^[a-z])((?![ .,'-]$)[a-z .,'-]){0,24}$");
        return validar;
    }

    public boolean validarClase(String titulo, String enlace){
        String[] tituloTokens = titulo.split(" ");

        String prefix = "https://utec.zoom.us/rec/share/";

        for (int x=0;x<prefix.length();x++){
            if(prefix.charAt(x) == enlace.charAt(x)){
                validar = true;
            } else{
                validar = false;
            }
        }

        return validar;
    }

    public boolean notificar() throws Exception {
        return validar;
    }


}
