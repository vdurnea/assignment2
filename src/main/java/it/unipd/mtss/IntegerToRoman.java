////////////////////////////////////////////////////////////////////
// [CATERINA] [VALLOTTO] [2076434]
// [VICTORIA] [DURNEA] [2076324]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 3) {
            return "Numero non valido";
        }
        String roman = "";
        while(number > 0){
            roman += "I";
            number -= 1;
        }
        return roman;
    }
}
