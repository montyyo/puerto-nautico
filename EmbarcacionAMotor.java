
/**
 * clase embarcacion a motor
 * 
 * @author Eduardo, Marco 
 * @version 1-18/05/2015
 */
public class EmbarcacionAMotor extends Barco
{
    //atributo que contiene la potencia del motor en CV
    private int potencia;
    
    /**
     * contructor de la clase embarcacion a motor
     * @param String m   matricula del barco
     * @param float e eslora del barco en metros
     * @param int a año de fabricacion
     * @param int p potencia del barco CV
     */
    public EmbarcacionAMotor(String m , float e, int a , int p)
    {
        super(m,e,a);
        potencia=p;
    }
    
    /**
     * metodo para devolver la potencia de la embarcacion
     * @return int potencia
     */
    public int getPotencia()
    {
        return potencia;
    }
    
    /**
     * metodo para devolver los datos del coeficiente de bernua
     * @return int potencia
     */
    public int coeficienteBernua()
    {
        return super.coeficienteBernua() + potencia;
    }
    
    /**
     * metodo que devuelve los datos de la embarcacion
     * @return String datos de la embarcacion
     */
    public String toString()
    {
        return super.toString() + 
                "\n potencia de la embarcacion: " + potencia;
    }
}
