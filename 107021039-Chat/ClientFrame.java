import javax.swing.*;
import java.awt.*;
import java.awt.event.*;   
import java.util.Random;   
import java.util.ArrayList;

public class ClientFrame extends JFrame{
    private Container cp;
    private JPanel jpnN=new JPanel();
    private JPanel jpnC=new JPanel();
    private JPanel jpnS=new JPanel();
    private JLabel IP =new JLabel("IP:");
    private JTextField IpTF =new JTextField();
    private JLabel port=new JLabel("PORT:");
    private JTextField portTF=new JTextField();
    private JButton setting =new JButton("Setting");
    private JButton start =new JButton("Start");
    private JButton exit =new JButton("Exit");
    private JTextArea ChatArea = new JTextArea();
    private JTextField ChatTF = new JTextField();
    private JButton Send = new JButton("Send");




    public ClientFrame(){

            init();
        }
    public void init(){
        cp=this.getContentPane();
        this.setBounds(100,100,700,700);

        cp.setLayout(new BorderLayout());

        cp.add(jpnN,BorderLayout.NORTH);
        jpnN.setLayout(new GridLayout(1,7));
        jpnN.add(IP);
        jpnN.add(IpTF);
        jpnN.add(port);
        jpnN.add(portTF);
        jpnN.add(setting);
        jpnN.add(start);
        jpnN.add(exit);

        cp.add(jpnC,BorderLayout.CENTER);
        jpnC.setLayout(null);
        jpnC.add(ChatArea);
        
        cp.add(jpnS,BorderLayout.SOUTH);
        jpnS.setLayout(new BorderLayout());
        jpnS.add(ChatTF,BorderLayout.CENTER);
        jpnS.add(Send,BorderLayout.EAST);
    }
}