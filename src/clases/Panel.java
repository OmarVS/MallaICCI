/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Omar
 */
public class Panel extends JPanel{
    JLabel nivel,cod,nom1,nom2,pre;
    JCheckBox jcb;
    
    public Panel() {
        nivel=new JLabel();
        cod=new JLabel();
        nom1=new JLabel();
        nom2=new JLabel();
        pre=new JLabel();
        jcb=new JCheckBox();
        jcb.setSelected(true);
    }
    
    public Panel(Ramo r)
    {
        this.setLayout(new GridBagLayout());
        GridBagConstraints cont = new GridBagConstraints();
        jcb=new JCheckBox();
        cont.gridx=0;
        cont.gridy=1;
        cont.gridwidth=1;
        cont.gridheight=4;
        this.add(jcb,cont);
        nivel=new JLabel(String.valueOf(r.getNivel()));
        nivel.setFont(new java.awt.Font("Tahoma", 0, 10));
        cont.gridx=1;
        cont.gridy=0;
        cont.gridwidth=1;
        cont.gridheight=1;
        this.add(nivel,cont);
        cod=new JLabel(r.getCodigo());
        cod.setFont(new java.awt.Font("Tahoma", 0, 10));
        cod.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cont.gridx=2;
        cont.gridy=0;
        cont.gridwidth=1;
        cont.gridheight=1;
        this.add(cod,cont);
        nom1=new JLabel(r.getNom1());
        nom1.setFont(new java.awt.Font("Tahoma", 0, 10));
        cont.gridx=1;
        cont.gridy=1;
        cont.gridwidth=2;
        cont.gridheight=1;
        this.add(nom1,cont);
        nom2=new JLabel(r.getNom2());
        nom2.setFont(new java.awt.Font("Tahoma", 0, 10));
        cont.gridx=1;
        cont.gridy=2;
        cont.gridwidth=2;
        cont.gridheight=1;
        this.add(nom2,cont);
        pre=new JLabel(String.valueOf(r.getPre()));
        pre.setFont(new java.awt.Font("Tahoma", 0, 10));
        cont.gridx=1;
        cont.gridy=3;
        cont.gridwidth=2;
        cont.gridheight=1;
        this.add(pre,cont);
        switch(r.tipo)
        {
            case "bas":
                this.setBackground(new java.awt.Color(255, 255, 102));
                this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                break;
            case "bas lic":
                this.setBackground(new java.awt.Color(255, 255, 102));
                this.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                break;
            case "ing":
                this.setBackground(new java.awt.Color(51, 255, 204));
                this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                break;
            case "ing lic":
                this.setBackground(new java.awt.Color(51, 255, 204));
                this.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                break;
            case "gen":
                this.setBackground(new java.awt.Color(255, 153, 102));
                this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                break;
            case "gen lic":
                this.setBackground(new java.awt.Color(255, 153, 102));
                this.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                break;
            case "esp":
                this.setBackground(new java.awt.Color(22, 228, 177));
                this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                break;
            case "esp lic":
                this.setBackground(new java.awt.Color(22, 228, 177));
                this.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                break;
        }
    }
    
    public String getNivel()
    {
        return nivel.getText();
    }
    
    public String getCod()
    {
        return cod.getText();
    }
    
    public String getNom1()
    {
        return nom1.getText();
    }
    
    public String getNom2()
    {
        return nom2.getText();
    }
    
    public String getPre()
    {
        return pre.getText();
    }
    
    public JCheckBox getJCheckBox()
    {
        return jcb;
    }
    
    public int getFila()
    {
        int niv=Integer.parseInt(nivel.getText().substring(0, 2));
        return niv;
    }
    
    public int getColumna()
    {
        int niv=0;
        try
        {
            niv=Integer.parseInt(nivel.getText().substring(2));
        }catch(Exception e){}
        return niv;
    }

}
