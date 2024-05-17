////////////////////////////////////////////////////////////////////
// [CATERINA] [VALLOTTO] [2076434]
// [VICTORIA] [DURNEA] [2076324]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    static String[] I = " _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n".split("\n");

    private static String printAsciiArt(String romanNumber){
        if (romanNumber == "Numero non valido"){
            return ("Numero non valido");
        }
        int lung=romanNumber.length();
        StringBuilder asciiArt=new StringBuilder();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < lung; j++) {
                asciiArt.append(I[i]);
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }
}
