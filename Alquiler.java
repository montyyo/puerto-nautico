
/**
 * clase alquiler
 * 
 * @author Eduardo , Marco
 * @version 1-18/5/2015
 */
public class Alquiler
{
   //atributo para que representa un objeto barco
   private Barco barco;
   //atributo que representa un objeto cliente
   private Cliente cliente;
   //atributo para representar el numero de dias de duracion del alquiler 
   private int numeroDeDias;
   //contante de precio para calcular coeficiente bernua
   private static final int  COEFBERNUA= 300;
   //constante para el calculo del precio segun la eslora
   private static final int  COEFESLORA=10;
   
   /**
    * Constructor de la clase alquiler
    * @param b barco 
    * @param c cliente
    * @param d dias de alquiler
    */
   public Alquiler(Barco b , Cliente c , int d)
   {
       barco = b;
       cliente= c;
       numeroDeDias=d;
   }
   
   /**
    * metodo para devolver el objeto barco
    * @return Barco objeto barco
    */
   public Barco getBarco()
   {
       return barco;
   }
   
   /**
    * metodo para devolver el objeto cliente
    * @return cliente objeto cliente
    */
   public Cliente getCliente()
   {
        return cliente;
    }
    
    /**
     * metodo que devuelve el numero de dias del alquiler
     * @return int numero de dias
     */
    public int getNumeroDiasAlquiler()
    {
        return numeroDeDias;
    }
    
    /**
     * metodo para calcular al coste del alquiler
     * @return float coste del alquiler
     */
    public float getCoste()
    {
        return numeroDeDias *((barco.getEslora() * COEFESLORA)+(COEFBERNUA* barco.coeficienteBernua()));
    }
    
    /**
     * metodo para devolver los datos del alquiler 
     * @return String datos del alquiler
     */
    public String toString()
    {
        return  "Datos del alquiler"+
                 "\n ====================================="+
        
                 "\nDatos del cliente: \n" + cliente.toString()+
                 
                 "\n Datos del barco: \n" + barco.toString()+
              
                 "\n dias de alquiler: " + numeroDeDias+
                 "\n coste del alquiler: " + getCoste() + " €"+
                 "\n ";
    }
}
