
package com.mycompany.peluqueriacanina;

import com.mycompany.peluqueriacanina.igu.Principal;


public class PeluqueriaCanina {

    public static void main(String[] args) {
        
        //Desde la logica mostramos la ventana principal y la ventana cargar datos
        Principal principal = new Principal(); //instanciamos
        principal.setVisible(true);//ventana visible
        principal.setLocationRelativeTo(null); //centramos
        
    }
}
