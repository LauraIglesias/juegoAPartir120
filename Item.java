/**
 * An item contained in a room
 * 
 * @author Miguel Bayon
 * @version 1.0
 */
public class Item
{
    private String description;
    private double weight;
    private String id;
    private static int idSiguiente = 1; 
    private boolean canBeTaken;
    private boolean magico;
    private boolean esMalo;
    
    /**
     * Constructor for objects of class Item
     * 
     * @param description The item's description
     * @param weight The item's weight
     */
    public Item(String description, double weight, boolean canBeTaken , boolean magico, boolean esMalo)
    {
        this.id = "" + idSiguiente;
        this.idSiguiente++;
        
        this.description = description;
        this.weight = weight;
        this.canBeTaken = canBeTaken;
        this.magico = magico;
        this.esMalo = esMalo;
    }
    
    /**
     * Get the long description of item
     * 
     * @return     The long description of item
     */
    public String getLongDescription()
    {
        return "ID " + id + ": " + description + " (" + weight + " kg.)";
    }
    
    
    /**
     * Devuelve el id del objeto
     * 
     * @return el id del objeto
     */
    public String getId()
    {
        return id;
    }
    
    /**
     * Get the item's weight
     * 
     * @return weight the item's weight in kg
     */
    public double getWeight()  
    {
    	return weight;
    }  
    
    /**
     * Return if the item can be taken
     * 
     * @return true if the item can be taken, false otherwise
     */
    public boolean canBeTaken() 
    {
     	return canBeTaken;
    }  
    /**
     * @return true ->Si el objeto es magico 
     *         false-> si no es magico
     */
    public boolean esMagico()
    {
        return magico;
    }
    /**
     * @return true-> si el objeto magico es malo
     *         false-> si el objeto no es malo
     */
    public boolean esMalo()
    {
        return esMalo;
    }
}
