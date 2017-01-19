/*
* AdminPanel GUI Form (incomplete)
*/

package AdminFrame;
import javax.swing.*;

/*
 * @author jobayersozib
*/


public class RegistrationFrame {

    private JFrame registrationFrame;
    public RegistrationFrame(JFrame log){
        log.dispose();
        this.registrationFrame= new JFrame("Registration Form");
        this.registrationFrame.setSize(500,500);
        this.registrationFrame.setBounds(300,100,500,500);
        this.registrationFrame.setResizable(false);
        this.registrationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.registrationFrame.setVisible(true);
        
    }
}
