import socket.*;
import threadmethod.*;

import java.io.IOException;

public class MainEntry {
    public static void main(String args[]){
        ThreadDemo T1 = new ThreadDemo("Thread1");
        ThreadDemo T2 = new ThreadDemo("Thread2");
        ThreadDemo T3 = new ThreadDemo("Thread3");
        ThreadDemo T4 = new ThreadDemo("Thread4");

        T1.start();
        T2.start();
        T3.start();
        T4.start();
        try{
            SocketServer socketServer = new SocketServer(9090);
            socketServer.start();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
