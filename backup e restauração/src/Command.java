import java.io.Serializable;
//define os métodos que todos os comandos devem implementar
public interface Command extends Serializable{
    void execute();
    void store();
}
