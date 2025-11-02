
import java.rmi.Naming;

public class Cliente {
    private String nome;
    private Lance lance;
    private boolean estadoCliente = true;


    public static void main(String[] args) {
        try { 
            ServidorLeilao servidor = (ServidorLeilao)Naming.lookup("rim//firipu");
         //   String retorno = servidor.registrar("felipe", lance); TEM QUE VER ISSO AI
            
        } catch (Exception e) {
        }
    }


    public Cliente(String nome){

        this.nome = nome;        
    }
    public String getNome() {
        return nome;
    }
    public Lance getLance() {
        return lance;
    }

    public void setLance(Lance lance) {
        this.lance = lance;
    }

    public boolean isEstadoCliente() {
        return estadoCliente;
    }
    public void setEstadoCliente(boolean estadoCliente) {
        this.estadoCliente = estadoCliente;
    }
    

}
