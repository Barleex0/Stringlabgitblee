import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String fstr = " Welcome to the Java String Lab! ";
        int javaloc = fstr.indexOf("Java");



        System.out.println(fstr.length());
        System.out.println(fstr.charAt(7));
        System.out.println(fstr.substring(javaloc, javaloc + 4));
        System.out.println(fstr.toLowerCase());
        System.out.println(fstr.toUpperCase());
        System.out.println(javaloc);
        System.out.println(fstr.contains("Lab"));
        System.out.println(fstr.trim());
        for (String string : fstr.split("\\s+")) {
            System.out.println(string);
        };
        System.out.println("java string lab!".equals(" Welcome to the java String Lab! "));
        System.out.println("java string lab!".equalsIgnoreCase(" Welcome to the java String Lab! "));


        int count = 0;
        char[] vowels = {'a','e','i','o','u'};//why curly brackets JavAAAAA

        for (int i = 0; i <= fstr.length(); i++) {
            
            if (i ==fstr.length()){ System.out.println(count);break;}
            for (char c : vowels) {
                // For each is so epic ngl

                //This basically just interates through the vowels array and checks if the current character is valid
                if (c==fstr.charAt(i)) {
                    count++;
                    break;//no need to waste more cycles after a vowel is found
                }
                
            }
            

            
        }

        String palin = "Helloh";

        
        for (int i = 0; i <= palin.length(); i++) {
            if (i>palin.length()/2) {
                System.out.println("True\n");
                break;

                
            }
            int x = palin.length()-i-1;
            if ((palin.charAt(i))==(palin.charAt(x))){

                continue;

            }
            else{
                System.out.println("false\n");
            }
            
        }

        Scanner ans = new Scanner(System.in);

        String answer;

        do {
            System.out.println("Say Something with Java in it\n");
            answer = ans.nextLine();
        } while (!answer.contains("Java"));
        System.out.println("Thank you!\n");
        ans.close();

        StringBuilder Goonew = new StringBuilder("StringBuilder Lab");
        
        Goonew.append(" - Learning Java");
        Goonew.insert(Goonew.indexOf("Lab")+3, " is fun");
        Goonew.delete(Goonew.indexOf("Learning"), Goonew.indexOf("Learning")+8);
        System.out.println(Goonew.reverse());

        StringBuffer Goonewsb = new StringBuffer("Multithreading Lab");
        
        Goonewsb.append(" - Learning Java");
        Goonewsb.insert(Goonewsb.indexOf("Lab")+3, " is fun");
        Goonewsb.delete(Goonewsb.indexOf("Learning"), Goonewsb.indexOf("Learning")+8);
        System.out.println(Goonewsb.reverse());

    };
};
