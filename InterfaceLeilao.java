
import java.rmi.Remote;

public interface InterfaceLeilao extends Remote {

    public boolean  registrar(Cliente nome, Lance lance);
    public Cliente notiClienteficar();
    public boolean  ofertarLance(Cliente cliente, float oferta);
    public boolean  sairDoLeilao(Cliente nome);
    
}
