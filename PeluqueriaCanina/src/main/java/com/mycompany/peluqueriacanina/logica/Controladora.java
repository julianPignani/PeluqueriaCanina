package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class Controladora {
    
    //instanciamos la controladora de persistencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMascota, String raza, String color, String observaciones, String alergico,
            String atenEsp, String nombreDuenio, String celDuenio) {
        
        //Creamos el dueño y asignamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        //Creamos la mascota y asigamos sus valores
        Mascota mascota = new Mascota();
        mascota.setNombre(nombreMascota);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atenEsp);
        mascota.setObservaciones(observaciones);
        mascota.setDuenio(duenio); //Le agregamos el dueño creado
        
        controlPersis.guardar(duenio,mascota);
        
        //Mostramos un mensaje si se guarda todo correctamente
        JOptionPane optionPane = new JOptionPane("Se guardó Correctamente");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Guardado Exitoso");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    public List<Mascota> traerMascota() {
        
        //Ahora desde la logica, llamamos a la persistencia
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int numCliente) {
        
        controlPersis.borrarMascota(numCliente);
    }
    
    
}
