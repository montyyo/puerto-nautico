
/**
 * Write a description of class Cliente here.
 * 
 * @author Marco, Eduardo
 * @version 1-18/05/2015
 */
public class Cliente
{
   //atributo string para el nombre del cliente
   private String nombre;
   //atributo para string para el dni del cliente
   private String dni;
   
   /**
    * contructor de la clase cliente
    * @param String d cliente
    * @param String n del cliente
    */
   public Cliente(String d,String n)
   {
       nombre = n;
       dni=d;
    }
    
    /**
     * metodo getter que devuelve el nombre 
     * @return String nombre del cliente
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * metodo que devuelve el dni del cliente
     * @return String dni del cliente
     */
    public String getDni()
    {
        return dni;
    }
    
    /**
     * metodo para devolver los datos del cliente
     * @return String datos del cliente
     */
    public String toString()
    {
        return "nombre del cliente: " + nombre+
                "\n DNI del cliente: " + dni;
    }
}
