package com.mycompany.pawsshop;

import com.mycompany.pawsshop.ui.LoginFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author mihin
 */
public class PawsShop {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginFrame loginFrame = new LoginFrame();
            loginFrame.setVisible(true);
        });
    }
}
