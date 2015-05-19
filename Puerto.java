import java.util.ArrayList;
/**
 * clase puerto
 * 
 * @author Marco , Eduardo
 * @version 1-18/5/2015
 */
public class Puerto
{
    //array de amarres
    private ArrayList<Amarre> amarres;
    //atributo que representa el numero de amarres del puerto
    private int numAmarres;
    /**
     * constructor de la clase puerto
     * @param int numero amarres
     */
    public Puerto (int n)
    {
        numAmarres=n;
        amarres= new ArrayList<>();
        for(int i = 0 ; i < numAmarres;i++)
        {
            amarres.add(new Amarre(i));
        }
    }
    
    /**
     * metodo para alquilar un amarre
     * @param cliente
     * @param barco
     * @param num dias
     */
    public void alquilar(Cliente cliente, Barco barco, int numDias)
    {
    
        Alquiler nuevoAlquiler=new Alquiler(barco,cliente,numDias);
        boolean findFree=false;
    
      
        for(int i = 0; i<amarres.size();i++)
        {
            if(amarres.get(i).disponible()==true && findFree==false)
            {
                amarres.get(i).ocupar(nuevoAlquiler);
                findFree=true;
            }
            
        }
        
        if(findFree == false)
        {
            System.out.println("No hay amarres libres");
           for(int i = 0; i<amarres.size();i++)
          {
             System.out.println(""+amarres.get(i).precioAlquilerActual());
          }
        }
     }
      
        
    
    
    /**
     * metodo para saber si hay amarres libres
     * @return boolean true si hay amarres libres
     */
    public boolean hayAmarresLibres()
    {
    
        return amarres.isEmpty();
    }

    /**
     * liquidar amarre
     * 
     */
    public void liquidarAmarre(int numeroAmarre)
    {
        for(int i = 0;i<amarres.size();i++)
        {
            if(amarres.get(i).getNumeroAmarre() == numeroAmarre)
            {
                amarres.get(i).desocupar();
            }
        }
    }
    
    /**
     * metodo para mostrar estado del amarre
     * 
     */
    public void mostrarEstado()
    {
        //         for(Amarre amarre:amarres)
       //         {
       //              if(amarre.disponible() == true )
      //             {
      //                 System.out.println("Amarre nº : " + amarre.getNumeroAmarre());
        //                 System.out.println("Libre");
      //                 System.out.println("");
      //             }
      //             else 
      //             {
      //                 
      //                  System.out.println("Amarre nº : " + amarre.getNumeroAmarre());
      //                  
      //                  System.out.println(amarre.toString());
      //                  System.out.println("");
      //             }
      //         }
        for(int i = 0;i<amarres.size();i++)
        {
            if(amarres.get(i).disponible() == true)
             {
                System.out.println("Amarre nº : " + amarres.get(i).getNumeroAmarre());          
                System.out.println("Libre");
                System.out.println("");
           }
           else
           {
                System.out.println("Amarre nº : " + amarres.get(i).getNumeroAmarre());
                      
                      System.out.println(amarres.get(i).toString());
                      System.out.println("");
            }
        }
        

    }
    
    /**
     * metodo para saber cual es el primer amarre libre
     */
    public int  posicionPrimerAmarre()
    {
        boolean findFirstFree= false;
        int firstFree=0;
       
        for(int i = 0 ; i < numAmarres;i++)
        {
            if(amarres.get(i).disponible() ==true  && findFirstFree==false )
            {
               
               firstFree= i;
               findFirstFree=true;
            }
            else
            {
                firstFree=-1;
            }
            
        }
        return firstFree;
    }
}
