package controlnames;
import java.util.Scanner;
/**
 *
 * @author David Sanmartín
 */
public class ControlNames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String name;
        int firstAsciiValue;
        boolean isValid;
        System.out.println("Ingresa un nombre: ");
        System.out.print("V?: ");
        name = key.nextLine();
        firstAsciiValue = name.codePointAt(0);
        //System.out.println(firstAsciiValue);
        //System.out.println(name.length());
        isValid = ControlNames.isNameValid(name, firstAsciiValue);
        if(isValid == true){
            System.out.println("SI");
        }else{System.out.println("NO");}
    }
    static boolean isNameValid(String name, int firstAsciiValue){
        int numAscii;
        boolean isValid = false;
        //if(name.length() < 2){ // Si la longitud del nombre es menor a 2 chars. 
            // (Este "if" es opcional, puede funcionar solo con el for).
            // Si en el "if" se le pone name.length < 1  funcionará bien pero porque se inutilizará el "if" y pasará 
            // directamente al "else", como si el "if" no estuviera ya que no se puede introducir un string que sea menor
            // a 1.
            //isValid = false;
        //}else{
        for(int position = 0; position < name.length(); position ++){
            numAscii = name.codePointAt(position);
            if(numAscii == firstAsciiValue){
                isValid = false;
                //System.out.println("for-if: " + isValid);
            }else{return true;}
        }
        //}
        return isValid;
    }
}
