package lesson;

public class Letters {
    public static void main(String args[]){

        String letters = "abcdefghijklmnopqrstuvwxyz";
        String[] vowels = {"a","e","i","o","u","y"};

        for (int i = 0; i < vowels.length; i++) {
            if (i > 0){
                letters = letters.replace(vowels[i], "");
            }
        }
        System.out.println(letters);
    }
}
