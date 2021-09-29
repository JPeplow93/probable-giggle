import java.util.Scanner;

public class TrainerFinder {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the Trainer Finder! Lets see what Nike trainer is best for you");
        System.out.println("To make your selection please enter the letter exactly as you see it in the brackets");
        System.out.println("Firstly, are the trainers are for (I)ndoors or (O)utdoors?: ");

        String locationInput = userInput.nextLine();

        if ("I".equals(locationInput)) {
            System.out.println("Stay-at-home-styled! Do you need the trainers to be warm? (Y)/(N)");
        } else if ("O".equals(locationInput)) {
            System.out.println("Ahh the wild outdoors! Are we looking thinking (A)esthietics, (P)racticality or (R)unning?");
        } else {
            System.out.println(locationInput + " is an invalid choice. Please enter value in () exactly as it appears.");
        }
        String purposeInput = userInput.nextLine();
        if("A".equals(purposeInput)){
            System.out.println("Okay, so we need you looking your best! Do you prefer (C)lassic styling or a more (F)uturistic style?");
        } else if ("P".equals(purposeInput)){
            System.out.println("Looking good whilst working hard, I would recommend the Air Force 1 Gore-Tex range or the Nike Air Max 95");
        } else if ("R".equals(purposeInput)){
            System.out.println("Not my cup of tea but someones got to do it. Will the trainer be used for (S)hort or (L)ong distance running?");
        } else if("Y".equals(purposeInput)){
            System.out.println("Comfort and style around the house, then I have to recommend the Nike Court Vision Low. These can be found in four stylish colour ways");
        } else if ("N".equals(purposeInput)){
            System.out.println("That's a no brainer. I would recommend the Nike Sliders, with over 80 options I am sure there is a pair for you!");
        } else {
            System.out.println(purposeInput + " is an invalid choice. Please enter value in () exactly as it appears.");
        }
        String specificInput = userInput.nextLine();

        if("C".equals(specificInput)){
            System.out.println("Too easy! Has to be the sleek innovative design offered by the Air Max 90 or the Air Max 97");
        } else if ("F".equals(specificInput)){
            System.out.println("Has to be the Air Max Genome or the Air Max Plus");
        } else if("S".equals(specificInput) ){
            System.out.println("Leave your competitors with something nice to look at as you fly off with the Zoom Rival or the Ja Fly 3");
        } else if ("L".equals(specificInput)){
            System.out.println("What happens when you combine innovative technology and styling? You get the Zoom Alphafly Next % or the Zoom Fly 3. Perfect from a 10K to a marathon");
        } else {
            System.out.println(specificInput + " is an invalid choice. Please enter value in () exactly as it appears.");
        }
    }
}

