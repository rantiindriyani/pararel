import java.net.Socket;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;

public class server1 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss;
        Socket s;
        DataInputStream input;
        String pesan ="";
        try{
            ss=new ServerSocket(12345);//ini port
            System.out.println("Server sudah siap ");

            s = ss.accept();// ini menghubungkan S dengan SS
            System.out.println("Ada client yang hadir...");

            //menerima input dari client
            input = new DataInputStream((s.getInputStream()));
            pesan=input.readLine();
            System.out.println("client bilang :"+pesan);

            input.close();
            s.close();;
            ss.close();

        }catch (IOException e) {
            
        }


    }
    
}
