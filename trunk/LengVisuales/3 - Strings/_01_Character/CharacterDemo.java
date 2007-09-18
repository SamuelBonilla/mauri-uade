/*
 * Created on 10/05/2006
 *
 * Clase Character
 */
package _01_Character;

public class CharacterDemo {

    public static void main(String[] args) {

        Character c = new Character('c');	// crea un objeto Character
        char h = c.charValue();				// tipo char de un objeto Character
        System.out.println("char= " + h);
        
        String s = c.toString();			// convierte a String
        System.out.println("String= " + s);
        
        Character a = new Character('a');
        int comp = c.compareTo(a);			// compara numéricamente
        System.out.println("c.compareTo(a)= " + comp);
        System.out.println("a.compareTo(c)= " + a.compareTo(c));
        
        									// comparación booleana
        System.out.println("a.equals(c)= " + a.equals(c));
        
        // métodos de clase
        System.out.println("\nCharacter.isDigit('1')= " + Character.isDigit('1'));
        System.out.println("Character.isDigit('@')= " + Character.isDigit('@'));
        System.out.println("Character.isLetter('a')= " + Character.isLetter('a'));
        System.out.println("Character.isLetter('@')= " + Character.isLetter('@'));
        System.out.println("Character.isSpaceChar(' ')= " + Character.isSpaceChar(' '));
                
        System.out.println("\nCharacter.isLowerCase('a')= " + Character.isLowerCase('a'));
        System.out.println("Character.toUpperCase('a')= " + Character.toUpperCase('a'));
        System.out.println("Character.isUpperCase('A')= " + Character.isUpperCase('A'));
        System.out.println("Character.toLowerCase('A')= " + Character.toLowerCase('A'));
      
    }
}
