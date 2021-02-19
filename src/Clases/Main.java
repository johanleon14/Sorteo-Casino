/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.UIManager;

/**
 *
 * @author Johan León
 */
public class Main {
    public static void main(String[] args) {
         try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
        } catch (Exception ex) {
            System.out.println(ex);
        }
          new Menu().setVisible(true);
    }
}
