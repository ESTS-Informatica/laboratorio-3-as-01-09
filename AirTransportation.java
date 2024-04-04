
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String name;
    private int numberOfContainers;
    private static double FEES = 4.0; 
    /**
     * Construtor para objetos da classe AirTransportation
     */
    public AirTransportation(String name, int numberOfContainers)
    {
        super();
        super.setFees(FEES);
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }
    public void setName(String name){
        this.name= name;
    }
    public void setNumberOfContainers(int number){
        this.numberOfContainers=number;
    }
    public String getName(){
        return this.name;
    }
    public int getNumberOfContainers(){
        return this.numberOfContainers;
    }
    public double getFees(){
        return this.FEES;
    }
    @Override
    public String getTransportType(){
        return "Transporte Aéreo";
    }
    @Override
    public String toString(){
        final StringBuilder strb = new StringBuilder(super.toString());
        strb.append(String.format("%15s: %s\n", "Nome: ", this.name));
        strb.append(String.format("%15s: %d\n", "Número de Contentores: ", this.numberOfContainers));
        return strb.toString();
    }
}
