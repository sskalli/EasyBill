public class Main {

    public static void main(String[] args) {

        String host = "127.0.0.1";
        int port = 2345;

        Server ts = new Server(host, port);
        ts.start();

/*
        for(int i = 0; i < 1; i++){
            Thread t = new Thread(new ClientConnexion(host, port));
            t.start();
        }
*/
    }
}