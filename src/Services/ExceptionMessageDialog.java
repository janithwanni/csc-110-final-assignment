/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author JanithWanni
 */
public class ExceptionMessageDialog {
    public static void show(Component c,String message){
        JOptionPane.showMessageDialog(c, message);
    }
}
