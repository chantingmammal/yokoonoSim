import java.util.Random;
import java.util.Scanner;

public class YokoOnoSIM {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Yoko Ono Simulator!");
        
        while (true) {
            System.out.print("What would you like to do today? (scream, whisper, create art, break up the Beatles, exit):");
                String action = scanner.nextLine().toLowerCase();
                
                switch (action) {
                    case "scream":
                        scream();
                        break;
                    case "whisper":
                        whisper();
                        break;
                    case "create art":
                        createArt();
                        break;
                    case "breakup":
                        breakupBeatle();
                    case "exit":
                        System.out.println("Exiting the simulator, as McCartney says (And in the End, the love you take is equal to the love you make)");
                        return;
                    default:
                        System.out.println("Invalid input. Please try again or starting over");
                }
             }
        }

    /* This makes Yoko Ono Scream */
        public static void scream() {
            String[] screams = {"AAAAAAAAAAHHHH!", "YAAAAAAAAAAA!", "WOOOOOOOOOOOOO!"};
            Random random = new Random();
            String scream = screams[random.nextInt(screams.length)];
            System.out.println(scream);
        }
    /* This makes Yoko Ono Whisper */
        public static void whisper() {
            String[] whispers = {"I have a message for the world...", "Listen closely to what I have to say...", "Can you hear me? I have something important to share...", "John...", "Sean...", "Julian..."};
            Random random = new Random();
            String whisper = whispers[random.nextInt(whispers.length)];
            System.out.println(whisper);
            }
    /* This makes Yoko Ono do Art */
        public static void createArt() {
            //To be added
        }
    /* This makes Yoko break up her husband John's band "The Beatles" */
        public static void breakupBeatle() {
            System.out.println("Yoko Ono breaks up the Beatles, it's super effective!");
        }
        
    }
