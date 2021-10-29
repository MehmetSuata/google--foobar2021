public class LanceAndLenice {


    public static void main(String args[]){

        System.out.println(minionCatch("Yvzs! I xzm'g yvorvev Lzmxv olhg srh qly zg gsv xlolmb!!"));

    }

    public static String minionCatch(String word){
        String ansWord="";
        for(int i=0;i<word.length();i++){
        int dif='z'-word.charAt(i);
            if(word.charAt(i)>=97 && word.charAt(i)<=122){
                ansWord=ansWord+(char)(97+dif);
            }
            else
                ansWord=ansWord+word.charAt(i);
        }

        return ansWord;
    }

}
