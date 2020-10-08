package cs.lab;

import javax.swing.text.AbstractDocument;

public class Administrativos {

    public Administrativos(){}

    public boolean notificado(RegistrApp registrApp) throws Exception {
        return registrApp.notificar();
    }
}
