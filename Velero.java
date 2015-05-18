
/**
 * clase velero
 * 
 * @author Marco, Eduardo
 * @version 1-18/05/2015
 */
public class Velero extends Barco
{
    //atributo para especificar el numero de mastiles
    private int numeroDeMastiles;
    
    /**
     * constructor de la clase velero
     * @param int n numero de mastiles
     * @param String m   matricula del barco
     * @param float e eslora del barco en metros
     * @param int a año de fabricacion
     */
    public Velero(String m , float e, int a, int n)
    {
        super(m,e,a);
        numeroDeMastiles=n;
    }
    
    /**
     * metodo que devuelve el numero de mastiles del velero
     * @return int numero de mastiles 
     */
    public int getNumeroDeMastiles()
    {
        return numeroDeMastiles;
    }
    
    /**
     * metodo para calculas el coeficiente de bernua numero de mastiles para su uso en la clase alquiler
     * @return int coeficiente de bernua
     */
    public int coeficienteBernua()
    {
        
        return super.coeficienteBernua()+ numeroDeMastiles;
    }
    
    /**
     * metodo para devolver los datos del barco
     * 
     * @return String datos del barco
     */
    public String toString()
    {
        
        return super.toString()+
               "\n nuemro de mastiles: " + numeroDeMastiles;
    }
}
