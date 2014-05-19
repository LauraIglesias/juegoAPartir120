import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/**
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 * 
 * This class holds an enumeration of all command words known to the game.
 * It is used to recognise commands as they are typed in.
 *
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */

public class CommandWords
{
    // a constant array that holds all valid command words
    private HashMap<String, Option> comandos;

    /**
     * Constructor - initialise the command words.
     */
    public CommandWords()
    {
        comandos = new HashMap<>();
        comandos.put("go", Option.GO);
        comandos.put("quit", Option.QUIT);
        comandos.put("help", Option.HELP);
        comandos.put("look", Option.LOOK);
        comandos.put("eat", Option.EAT);
        comandos.put("back", Option.BACK);
        comandos.put("items", Option.ITEMS);
        comandos.put("take", Option.TAKE);
        comandos.put("drop", Option.DROP);
    }

    /**
     * Check whether a given String is a valid command word. 
     * @return true if a given string is a valid command,
     * false if it isn't.
     * Comprobar si una cadena dada es una palabra de comando válida.
     * @ Return true si una cadena dada es un comando válido, false si no lo es.
     */
    public boolean isCommand(String aString)
    {
        return comandos.containsKey(aString);
    }

    /**
     * Print all valid commands to System.out.
     * muestre en la terminal todos los comandos disponibles
     */    
    public void showAll()
    {
        for(String key :comandos.keySet()){
            System.out.print(" " + key);
        }
    }

    /**
     * Return the Option associated with a word.
     * @param commandWord The word to look up (as a string).
     * @return The Option correspondng to commandWord, or UNKNOWN
     *         if it is not a valid command word.
     * Devuelva la opción asociada a una palabra.
     * @ Param commandWord La palabra que desee buscar (como una cadena).
     * @ Return la opción correspondiente al commandWord o DESCONOCIDO
     * Si no es una palabra de comando válido.
     */
    public Option getCommandWord(String commandWord)
    {
        Option opciones = Option.UNKNOWN; 
        if(isCommand(commandWord) == true){
            opciones =  comandos.get(commandWord);
        }
        return opciones;
    }
}

