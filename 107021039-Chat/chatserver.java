import java.net.*;
import java.io.*;
import java.awt.*;


public class chatserver extends Thread{
    private serverFrame chatframe;
    private String hostIP,hostName;
    private InetAddress inetAdder;
    private int port = 5300;
    private OutputStream outputStream;
    private InputStream inputStream;
    private Socket socket;
    private ServerSocket serversocket;

    public chatserver(serverFrame frm){
        this.setDaemon(true);
        chatframe=frm;
        try {
            inetAdder=InetAddress.getLocalHost();
            hostIP = inetAdder.getHostAddress();
            hostName = inetAdder.getHostName();
        } catch (UnknownHostException e) {
            System.out.println("Null");
        }
    }


    public void run(){
        byte data[]=new byte[1024];
        int n =0;
        try {
            serversocket = new ServerSocket(port);
            chatframe.appendMessage("Server Start,Waiting Client Conncet");
            chatframe.repaint();
            socket = serversocket.accept();
        } catch (Exception e) {
            
        }
    }

    public String HostIP(){
        return hostIP;
    }
    public void close(){
        try {
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
} 