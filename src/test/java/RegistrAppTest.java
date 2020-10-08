import cs.lab.Profesor;
import cs.lab.RegistrApp;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

@Test
public class RegistrAppTest {
    @Test
    public void testName() throws Exception{
        Profesor profesor = new Profesor("Jose fiestas");
        RegistrApp registrApp = new RegistrApp();
        if(!registrApp.iniciarSesion(profesor.getNombre())){
            throw new Exception("Error");
        }
    }

    @Test
    public void testClase() throws Exception{
        RegistrApp registrApp = new RegistrApp();
        if(!registrApp.validarClase("Compiladores", "https://utec.zoom.us/rec/share/compiladoresClase1")){
            throw new Exception("Error");
        }
    }

    @Test(invocationCount = 100, threadPoolSize = 100)
    public void testTime() throws Exception {
        long startTime = System.currentTimeMillis();
        Profesor profesor = new Profesor("Jose fiestas");
        RegistrApp registrApp = new RegistrApp();
        registrApp.iniciarSesion(profesor.getNombre());
        registrApp.validarClase("Compiladores", "https://utec.zoom.us/rec/share/compiladoresClase1");
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        Assert.assertTrue(time <= 500);
    }
}
