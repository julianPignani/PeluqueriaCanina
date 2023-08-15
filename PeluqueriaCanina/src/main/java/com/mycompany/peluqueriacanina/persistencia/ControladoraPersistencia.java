
package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    //Instanciamos a los dos JpaControllers
    
    MascotaJpaController mascoJpa = new MascotaJpaController();
    
    DuenioJpaController duenioJpa = new DuenioJpaController();

    //Crear en la base de datos el dueño y la mascota
    public void guardar(Duenio duenio, Mascota mascota) {
        
        duenioJpa.create(duenio);
        
        mascoJpa.create(mascota);
        
    }
    //busca la lista de mascotas en la BD y la retornamos a la logica
    public List<Mascota> traerMascotas() {
        
        return mascoJpa.findMascotaEntities();
    }
    
    //busca el numero del id sellecionado y lo eliminamos
    public void borrarMascota(int numCliente) {
        
        try {
            mascoJpa.destroy(numCliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
}
