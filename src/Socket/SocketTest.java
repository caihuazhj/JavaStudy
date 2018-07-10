package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class SocketTest {
    public static void main(String[] args) {
        Socket socket = null;
        {
            try {
                socket = new Socket("time.nist.gov",13);
                socket.setSoTimeout(15000);
                InputStream in = socket.getInputStream();
                StringBuilder time = new StringBuilder();
                InputStreamReader reader =  new InputStreamReader(in,"utf-8");

                for (int c = reader.read();c!=-1;c = reader.read()){
                    time.append(c);
                }
                System.out.println(time);
            } catch (IOException e) {
                System.out.println("can't connect time.nist");
            }
        }
    }




}
