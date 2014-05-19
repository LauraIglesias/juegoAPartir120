
/**
 * Enumeration class Option - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Option
{
    GO("ir"), QUIT("salir"), HELP("ayuda"), LOOK("mirar"), EAT("comer"), BACK("salir"),
    ITEMS("objetos"),TAKE("coger"),DROP("dejar"),UNKNOWN("desconocido");
    private String optionString;

    Option(String optionString)
    {
        this.optionString = optionString;
    }

    /**
     *
     *@return 
     */
    public String getOptionString(){
        return optionString;
    }
}
