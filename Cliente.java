
import java.rmi.Naming;

public class Cliente {
    String nome;
    Lance lance;
    boolean estadoCliente = true;


    public static void main(String[] args) {
        try { 
            ServidorLeilao servidor = (ServidorLeilao)Naming.lookup("rim//firipu");
         //   String retorno = servidor.registrar("felipe", lance); TEM QUE VER ISSO AI
            
        } catch (Exception e) {
        }
    }


    public Cliente(String nome,  Lance lance){

        this.nome = nome;
        this.lance = lance;        
    }
    public String getNome() {
        return nome;
    }
    public Lance getLance() {
        return lance;
    }

    public boolean isEstadoCliente() {
        return estadoCliente;
    }
    public void setEstadoCliente(boolean estadoCliente) {
        this.estadoCliente = estadoCliente;
    }
    

}
