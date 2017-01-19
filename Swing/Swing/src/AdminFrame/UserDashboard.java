/*
 * AdminPanel GUI Form (incomplete)
 */
package AdminFrame;

import javax.swing.*;


/**
 *
 * @author jobayerszib
 */
public class UserDashboard {
    private JFrame panelFrame;
    public UserDashboard(JTextField userName,JFrame log){
        log.dispose();
        this.panelFrame= new JFrame(userName.getText());
        this.panelFrame.setSize(500,500);
        this.panelFrame.setBounds(300,100,500,500);
        this.panelFrame.setResizable(false);
        this.panelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.panelFrame.setVisible(true);
        
    }
}
