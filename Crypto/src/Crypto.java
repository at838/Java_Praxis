public class Crypto {
    public static void main(String[] args) {
        String myText;
        myText = "This is a (good) way \\ to !write,,.";
        System.out.println(myText);
        myText= normalizeText(myText);
        System.out.println(myText);
    }
    
    
    private static String normalizeText(String myText){
       myText=myText.toUpperCase();
    
        for (int i=0; i < myText.length(); i++){
            final char a = myText.charAt(i);
            if((a=='\\')|| (a=='.')|| (a==' ')||(a=='(')|| (a=='%')||(a==')')||
               (a=='/')|| (a=='!')|| (a=='"')||(a==';')||(a==':')||(a==',')){
                myText= myText.replace(a,'\0');
           }
       }
       return myText;
    }
}
