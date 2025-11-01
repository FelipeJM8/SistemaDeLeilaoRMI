
import java.net.MalformedURLException;
import java.nio.charset.MalformedInputException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServidorLeilao extends UnicastRemoteObject{

    List<Cliente> clientes = new ArrayList<>();
    

    public static void main(String[] args) {
        try {
            ServidorLeilao serv = new ServidorLeilao();
            Naming.rebind("ServidorLeilao", serv);
            System.out.println("Servidor pronto.");
        } catch (Exception e) {
            System.out.println("Execao remota:" +e);
        }

        //catch(MalformedURLException e){};
    }
    
    public ServidorLeilao() throws RemoteException{

        super();
    }

    public boolean registrar(String nome, Lance lance){
        clientes.add(new Cliente(nome, lance)); 
        return true;
    }

    public String notificar(){
        for (Cliente cliente : clientes) {//TEM QUE VER ISSO AI   
        }
        return "javaRuim";
    }

    public boolean  ofertarLance(Cliente cliente, float oferta){

        cliente.lance = new Lance(oferta);
        notificar();

            return true;
    }
    public boolean  sairDoLeilao(String nome){


                return true;
    }

     public List<Cliente> getClientes() {
        return clientes;
    }
    
}
