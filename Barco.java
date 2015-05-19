
/**
 * clase barco
 * 
 * @author Eduardo , Marco
 * @version 1-18/05/2015
 */
public class Barco
{
    //atributo int que representa el año de fabricacion
    private int anoFabricacion;
    //atributo que representa los metros de eslora
    private float eslora;
    //atributo que representa la matricula del barco
    private String matricula;
    /**
     * contructor de la clase barco
     * @param String m   matricula del barco
     * @param float e eslora del barco en metros
     * @param int a año de fabricacion
     */
    public Barco( float e,String m , int a)
    {
        matricula=m;
        eslora=e;
        anoFabricacion=a;
    }
    
    /**
     * metodo que devuelve la matricula del barco
     * @return String matricula del barco
     */
    public String getMatricula()
    {
        return matricula;
    }
    
    /**
     * metodo que devuelve los metros de eslora del barco
     * @return float metros de eslora
     */
    public float getEslora()
    {
        return eslora;
    }
    
    /**
     * devuelve el año de fabricacion del barco
     * @return int año de fabricacion
     */
    public int getAnoFabricacion()
    {
           return anoFabricacion;
    }
    
    /**
     * metodo para calcular el coeficiente de bernua
     * @return int coeficiente de bernua
     */
    public int coeficienteBernua()
    {
        return 0;
    }
    
    /**
     * metodo para devover los datos del barco
     * @return String datos del barco
     */
    public String toString()
    {
        return "matricula del barco: " + matricula+
               "\nmetros de eslora:" + eslora+ " metros"+
               "\naño fabricacion: " + anoFabricacion;
    }
}

