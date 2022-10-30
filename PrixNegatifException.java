/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionmagasin;

public class PrixNegatifException  extends Exception{

    public PrixNegatifException() {
    }

    public PrixNegatifException(String message) {
        super(message);
    }
    
}
