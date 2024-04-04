
/**
 * Escreva uma descrição da classe Van aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Van extends GroundTransportation
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int packages;

    /**
     * Construtor para objetos da classe Van
     */
    public Van(String licensePlate,int packages)
    {
        super(licensePlate);
        this.packages=packages;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public int getPackages(){
        return packages;
    }
    public void setPackages(int packages){
        this.packages=packages;
    }
    public String toString(){
        final StringBuilder str = new StringBuilder(super.toString());
        str.append(String.format("%15s: %d\n", "Numero de Pacotes: ", this.packages));
        return str.toString();
    }
}
