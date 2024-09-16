/**
 * the word game class tester, for functions invocation.
 * Author: wafi izzeldin
 */
public class WordGamesTester {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        WordGames wordGames = new WordGames();
        System.out.println(wordGames.addHelloWord("universe"));
        System.out.println(wordGames.getFullName("jane","doe"));
    }
}

/**
 * The type Word games.
 * Author: wafi izzeldin
 */
class WordGames {
    /**
     * Instantiates a new Word games.
     */
    public WordGames(){

    }

    /**
     * Add hello word string.
     *
     * @param word the word
     * @return the string
     */
    public String addHelloWord(String word) {
        return "Hello " + word;
    }

    /**
     * Get full name string.
     *
     * @param name    the name
     * @param surname the surname
     * @return the string
     */
    public String getFullName(String name,String surname){
        return name + " " + surname;
    }
}
