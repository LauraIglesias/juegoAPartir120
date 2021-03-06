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
    // private HashMap<String, Option> comandos;
    private Option[] commands;
    /**
     * Constructor - initialise the command words.
     */
    public CommandWords()
    {
        commands = Option.values();
        /* comandos = new HashMap<>();
        comandos.put(Option.GO.getOptionString(), Option.GO);
        comandos.put(Option.QUIT.getOptionString(), Option.QUIT);
        comandos.put(Option.HELP.getOptionString(), Option.HELP);
        comandos.put(Option.LOOK.getOptionString(), Option.LOOK);
        comandos.put(Option.EAT.getOptionString(), Option.EAT);
        comandos.put(Option.BACK.getOptionString(), Option.BACK);
        comandos.put(Option.ITEMS.getOptionString(), Option.ITEMS);
        comandos.put(Option.TAKE.getOptionString(), Option.TAKE);
        comandos.put(Option.DROP.getOptionString(), Option.DROP);*/
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
        //return comandos.containsKey(aString);
        boolean command = false;
        int index= 0; 
        while (index<commands.length && !command){
            Option key = commands[index];
            if (key != Option.UNKNOWN){
                if (key.getOptionString().equals(aString)){
                    command= true;
                }
            }
            index++;
        }
        return command;
    }

    /**
     * Print all valid commands to System.out.
     * muestre en la terminal todos los comandos disponibles
     */    
    public void showAll()
    {
        /* for(String key :comandos.keySet()){
        System.out.print(" " + key);
        }
        System.out.println();*/
        for(Option option: commands){
            if (option != Option.UNKNOWN){
                System.out.print(option.getOptionString()+ " ");
            }
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
        /*Option opciones = Option.UNKNOWN; 
        if(isCommand(commandWord) == true){
        opciones =  comandos.get(commandWord);
        }
        return opciones;*/
        Option comando= Option.UNKNOWN;
        boolean encontrado = false;
        int index=0;
        while(index<commands.length && !encontrado) {
            Option key = commands[index];
            if (key != Option.UNKNOWN){
                if (key.getOptionString().equals(commandWord)){
                    encontrado = true;
                    comando = key;
                }
            }
            index++;
        }	  
        return comando;
    }
}

