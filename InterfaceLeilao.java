
import java.rmi.Remote;

public interface InterfaceLeilao extends Remote {

    public boolean  registrar(Cliente cliente);
    public Cliente notificar();
    public boolean  ofertarLance(Cliente cliente);
    public boolean  sairDoLeilao(Cliente cliente);
    
}
