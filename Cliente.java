
import java.rmi.Naming;

public class Cliente {
    private String nome;
    private Lance lance;
    private boolean estadoCliente = true;


    public static void main(String[] args) {
        try { 
            InterfaceLeilao servidor = (InterfaceLeilao)Naming.lookup("InterfaceLeilao");

            Cliente enviarCliente = new Cliente("Felipe");
           enviarCliente.setLance(new Lance(30));

           boolean sucesso = servidor.registrar(enviarCliente);
           System.out.println("Registro: " + (sucesso ? "SUCESSO" : "FALHA"));
           servidor.notificar();

            
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
