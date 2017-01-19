/*
 * Simple logInBox GUI Form.
 */
package GUI_first;
import AdminFrame.RegistrationFrame;
import AdminFrame.UserDashboard;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author jobayersozib
 */
public class MyFrame implements ActionListener{
    
    /*Private Field Block*/
    private JFrame myFrame;
    private JPanel myPanel;
    private JButton loginButton;
    private JButton registerButton;
    private JLabel userName;
    private JLabel passWord;
    private JLabel loginFail;
    private JTextField T1;
    private JPasswordField T2;
    private String uName="jobayersozib";
    private String uPass="mypassword";
    
    /* Constructor */
    public MyFrame(){
        
        /*JFrame Block start*/
        this.myFrame=new JFrame("Login Box");
        this.myFrame.setSize(300,200);
        this.myFrame.setVisible(true);
        this.myFrame.setLayout(new BorderLayout());
        this.myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.myFrame.setResizable(false);
        this.myFrame.setBounds(500,100,300,200);
        /*JFrame Block start*/
        
        /*JPanel Block start*/
        this.myPanel=new JPanel();
        this.myPanel.setLayout(null);
        this.myFrame.add(myPanel,BorderLayout.CENTER);
        /*JPanel Block end*/
        
        
		/*userName label Block start*/
            this.userName=new JLabel("Username :");
            this.myPanel.add(this.userName);
            this.userName.setBounds(10,30,75,10);
        /*userName label Block End*/
        
        
         /*userName label Block start*/
            this.T1=new JTextField();
            this.myPanel.add(this.T1);
            this.T1.setBounds(85,25,200,25);
        /*userName label Block End*/
        
        /*passWord label Block start*/
            this.passWord=new JLabel("Password :");
            this.myPanel.add(this.passWord);
            this.passWord.setBounds(10,70,75,10);
        /*Password label Block End*/    
            
        /*PassWord field Block start*/
            this.T2=new JPasswordField();
            this.myPanel.add(this.T2);
            this.T2.setBounds(85,65,200,25);
            //this.T2.
            
        /*passWord field Block End*/    
        
        /*loginButton Block start*/
            this.loginButton=new JButton("Login");
            this.myPanel.add(this.loginButton);
            this.loginButton.setBounds(84,100,70,30);
            this.loginButton.addActionListener(this);
        /*loginButton Block end*/
            
       /*registerButton Block start*/
            this.registerButton=new JButton("Register");
            this.myPanel.add(this.registerButton);
            this.registerButton.setBounds(165,100,90,30);
            this.registerButton.addActionListener(this);
        /*registerButton Block end*/
        
        
        /*loginFail label Block start*/
            this.loginFail=new JLabel("Invalid username or password !!!");
            this.loginFail.setBounds(75,147,250,15);
            this.myPanel.add(this.loginFail);
            this.loginFail.setForeground(Color.red);
            this.loginFail.setVisible(false);
        /*loginFail label Block End*/
        
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.loginButton){
            if(this.T1.getText().equals(this.uName) && this.T2.getText().equals(this.uPass)){
               this.loginFail.setVisible(false); 
               new UserDashboard(this.T1,this.myFrame);
             }else{
                 this.loginFail.setVisible(true);
             }
        }else{
            new RegistrationFrame(this.myFrame);
        }
    }

    
    
}
