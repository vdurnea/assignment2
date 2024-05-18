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
    static String[] V = "__      __\n\\ \\    / /\n \\ \\  / / \n  \\ \\/ /  \n   \\  /   \n    \\/    \n".split("\n");
    static String[] X = " __   __\n \\ \\ / /\n  \\ V / \n   > <  \n  / . \\ \n /_/ \\_\\\n".split("\n");

    private static String printAsciiArt(String romanNumber){
        if (romanNumber =="Numero non valido"){
            return romanNumber;
        }
        int lung=romanNumber.length();
        StringBuilder asciiArt=new StringBuilder();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < lung; j++) {
                char c = romanNumber.charAt(j);
                switch(c) {
                    case 'I':
                        asciiArt.append(I[i]);
                        break;
                    case 'V':
                        asciiArt.append(V[i]);
                        break;
                    case 'X':
                        asciiArt.append(X[i]);
                        break;
                }
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }

}