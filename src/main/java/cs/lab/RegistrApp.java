package cs.lab;

public class RegistrApp {
    boolean validar=true;

    public boolean iniciarSesion(Profesor profesorName){
        validar = profesorName.getNombre().matches("(?i)(^[a-z])((?![ .,'-]$)[a-z .,'-]){0,24}$");
        return validar;
    }

    public boolean validarClase(String titulo, String enlace){
        String prefix = "https://utec.zoom.us/rec/share/";

        for (int x=0;x<prefix.length();x++){
            validar = prefix.charAt(x) == enlace.charAt(x);
        }

        return validar;
    }

    public boolean notificar(){
        return validar;
    }


}
