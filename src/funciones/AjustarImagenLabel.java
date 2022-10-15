/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author 54934
 */
public class AjustarImagenLabel {

    public void setImageLabel(JLabel labelNombre, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelNombre.getWidth(), labelNombre.getHeight(), Image.SCALE_SMOOTH));

        labelNombre.setIcon(icon);
    }


}
