/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Omar
 */
public class Ramo {
    String nivel;
    String codigo;
    String nom1;
    String nom2;
    String pre;
    String tipo;
    
    public Ramo(String niv,String cod,String nom1,String nom2,String pre,String tipo)
    {
        nivel=niv;
        codigo=cod;
        this.nom1=nom1;
        this.nom2=nom2;
        this.pre=pre;
        this.tipo=tipo;
    }

    public String getNivel() {
        return nivel;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNom1() {
        return nom1;
    }
    
    public String getNom2() {
        return nom2;
    }

    public String getPre() {
        return pre;
    }
    
    public String getTipo() {
        return tipo;
    }
    
}
