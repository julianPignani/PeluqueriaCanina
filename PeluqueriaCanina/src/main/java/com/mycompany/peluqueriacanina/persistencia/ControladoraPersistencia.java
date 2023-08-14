
package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;


public class ControladoraPersistencia {
    
    //Instanciamos a los dos JpaControllers
    
    MascotaJpaController mascoJpa = new MascotaJpaController();
    
    DuenioJpaController duenioJpa = new DuenioJpaController();

    //Crear en la base de datos el dueño y la mascota
    public void guardar(Duenio duenio, Mascota mascota) {
        
        duenioJpa.create(duenio);
        
        mascoJpa.create(mascota);
        
    }

   
}
