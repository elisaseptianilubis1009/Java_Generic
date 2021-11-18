/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_generic;

/**
 *
 * @author admin
 */
public class Generic <T,U> {
    
    private T name;
    
    private U umur;

    public Generic(T name, U umur) {
        this.name = name;
        this.umur = umur;
    }

    public U getUmur() {
        return umur;
    }

    public void setUmur(U umur) {
        this.umur = umur;
    }

   

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
    
    
    
}
