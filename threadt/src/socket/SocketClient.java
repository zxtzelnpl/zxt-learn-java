package socket;

import java.net.*;
import java.io.*;

public class SocketClient {
    private String name;
    private int port;

    public SocketClient(String name,int port){
        this.name = name;
        this.port = port;
    }

    public void connect(){
        try{
            System.out.println("连接到主机"+name+":"+port);
            Socket client = new Socket(name,port);
            System.out.println("远程主机地址：" + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outToServer);

            dataOutputStream.writeUTF("Hello from "+client.getLocalSocketAddress());

            InputStream inputStream = client.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            System.out.println("服务器响应："+ dataInputStream.readUTF());

            client.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
