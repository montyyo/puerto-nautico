
/**
 * clase amarre
 * 
 * @author Eduardo , Marco 
 * @version 1- 18/5/2015
 */
public class Amarre
{
    //atributo que representa un objeto alquiler
    private Alquiler alquiler;
    //atributo que representa la posicion del amarre
    private int posicion;
    
    /**
     * contructor de la clase alquiler
     * @param p posicion del amarre
     * 
     */
    public Amarre (int p)
    {
        alquiler = null;
        posicion  = p;
    }
    
    /**
     * metodo para devolver el numero de amarre
     * @return int numero de amarre
     */
    public int getNumeroAmarre()
    {
        return posicion;
    }
    
    /**
     * metodo para desocupar un amarre
     * 
     */
    public void desocupar()
    {
        alquiler=null;
    }
    
    /**
     * metodo para saber si esta disponible el amarre
     * @return boolean true si esta desocupado y false si esta ocupado
     */
    public boolean disponible()
    {
        boolean disponible = true;
        if(alquiler != null)
        {
            disponible = false;
        }
        
        return disponible;
    }
    
    /**
     * metodo para ocupar un amarre
     */
    public void ocupar(Alquiler a)
    {
        if(disponible()==true)
        {
            alquiler= a;
        }
        else
        {
            System.out.println(" Lo sentimos el amarre esta ocupado");
        }
    }
    
    /**
     * metodo para devolver el precio del alquiler
     * @return float precio del alquiler
     */
    public float precioAlquilerActual()
    {
        return alquiler.getCoste();
    }
    
    /**
     * metodo para devolver los datos del amarre
     * @return String datos del amarre
     */
    public String toString()
    {
        String datos="";
       if(disponible()==true || alquiler==null)
       {
           datos="amarre vacio";
        }
        else
        {
            datos=alquiler.toString();
        }
        return   datos;
    }
}
