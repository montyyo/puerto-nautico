
/**
 * clase para crear yates
 * 
 * @author Marco, Eduardo
 * @version 1-18/05/2015
 */
public class Yate extends EmbarcacionAMotor
{
    //atributo para indicar el numero de camarotes del yate
    private int numeroCamarotes;
    
    /**
     * contructor de la clase yate
     * @param String m   matricula del barco
     * @param float e eslora del barco en metros
     * @param int a año de fabricacion
     * @param int p potencia del barco CV
     * @param int c numero de camarotes del yate
     */
    public Yate( float e ,String m, int a , int p , int c)
    {
        super(e,m,a,p);
        numeroCamarotes=c;
    }
    
    /**
     * metodo que devuelve el numero de camarotes del yate
     * @return int numero de camarotes
     */
    public int getNumeroCamarotes()
    {
        return numeroCamarotes;
    }
    
    /**
     * metodo para calcualar el coeficiente de bernua
     * @return int nuemro de camarotes
     */
    public int coeficienteBernua()
    {
        return super.coeficienteBernua() + numeroCamarotes;
    }
    
    /**
     * metodo que devuelve los datos del barco
     * @return String datos del barco
     */
    public String toString()
    {
        return super.toString() + 
               "\n numero de camarotes del yate: " + numeroCamarotes;
    }
}
