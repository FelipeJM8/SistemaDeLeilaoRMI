
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServidorLeilao extends UnicastRemoteObject{

    List<Cliente> clientes = new ArrayList<>();
    

    public static void main(String[] args) {
        try {
            ServidorLeilao serv = new ServidorLeilao();
            LocateRegistry.createRegistry(1099); // 1099 é a porta padrão
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

    public boolean registrar(Cliente cliente){
        clientes.add(new Cliente(cliente.getNome()));
        return true;
    }

    public String notificar(){
        for (Cliente cliente : clientes) {//TEM QUE VER ISSO AI   
        }
        return "Novo lance feito:";//ve ai se faz uma lista de lance ou sei la, inventa ai
    }

    public boolean  ofertarLance(Cliente cliente){

    cliente.setLance(new Lance(33));//ATEM QUER VER ISSO AI: a oferta deve ser passada por scan
        notificar();

            return true;
    }
    public boolean  sairDoLeilao(Cliente cliente){// ok!

        cliente.setEstadoCliente(false);
        System.out.println("Voce saiu do leilao");
                return true;
    }

     public List<Cliente> getClientes() {
        return clientes;
    }
    
}
