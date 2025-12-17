
import java.util.Random;


public class randomgenerate {
    public static void main(String[] args) {
    String possiblecharactersString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890~!@#$%^&*()_+-=[]{}\\|:;,./<>?";
    char[] possiblecharacters = possiblecharactersString.toCharArray();

    Random random = new Random();

    int charactersToGennerate = 15;
        StringBuilder password = new StringBuilder();

        for (int i =0; i<charactersToGennerate;i++){
            int randomIndex = random.nextInt(possiblecharacters.length);

            char randomChar = possiblecharacters[randomIndex];

            password.append(randomChar);

        }

                    System.out.println("The generated Password is: " +password.toString());
    }

   
}
