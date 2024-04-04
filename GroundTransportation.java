
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    private String licensePlate;
    private static double FEES = 3.0;
    /**
     * Construtor para objetos da classe GroundTransportation
     */
    public GroundTransportation(String licensePlate)
    {
        super();
        super.setFees(FEES);
        this.licensePlate = licensePlate;
    }
    public void setLicensePlate(String name){
        this.licensePlate=name;
    }
    public String getLicensePlate(){
        return this.licensePlate;
    }
    public double getFees(){
        return this.FEES;
    }
    @Override
    public String getTransportType(){
        return "Transporte Terrestre";
    }
    @Override
    public String toString(){
        final StringBuilder str = new StringBuilder(super.toString());
        str.append(String.format("%15s: %s\n", "Matrícula: ", this.licensePlate));
        return str.toString();
    }
}
