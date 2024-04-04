
/**
 * Escreva uma descrição da classe Lorry aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Lorry extends GroundTransportation
{
    private int numberOfPallets;
    private int trailers;

    /**
     * Construtor para objetos da classe Lorry
     */
    public Lorry(String licensePlate,int numberOfPallets,int trailers)
    {
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers=trailers;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public int getNumberOfPallets(){
        return numberOfPallets;
    }
    public int getTrailers(){
        return trailers;
    }
    public void setNumberOfPalets(int number){
        this.numberOfPallets=number;
    }
    public void setTrailers(int number){
        this.trailers=number;
    }
    public String toString(){
        final StringBuilder str = new StringBuilder(super.toString());
        str.append(String.format("%15s: %d\n", "Numero de Paletes: ", this.numberOfPallets));
        str.append(String.format("%15s: %d\n", "Trailers: ", this.trailers));
        return str.toString();
    }
}
