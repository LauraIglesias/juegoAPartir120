
/**
 * Enumeration class Option - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Option
{
    GO("ir"), QUIT("salir"), HELP("ayuda"), LOOK("mirar"), EAT("comer"), BACK("atras"),
    ITEMS("objetos"),TAKE("coger"),DROP("dejar"),UNKNOWN("");
    private String optionString;

    Option(String optionString)
    {
        this.optionString = optionString;
    }

    /**
     *
     *@return la constante en string
     */
    public String getOptionString(){
        return optionString;
    }
}
