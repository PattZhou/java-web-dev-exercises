package exercises.day2;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice();
       // arrayPractice.printOddNumbers();
        //arrayPractice.splitAString();
        arrayPractice.splitIntoSentence();
    }

    public void printOddNumbers() {
        int[] anIntArray = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < anIntArray.length; i++) {
            if (anIntArray[i] % 2 == 1) {
                System.out.println(anIntArray[i]);
            }
        }
    }
    public void splitAString() {
        String foxString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] theSplitString = foxString.split(" ");
        System.out.println(Arrays.toString(theSplitString));
    }
    public void splitIntoSentence() {
        String foxString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] theSplitString = foxString.split("\\.");
        System.out.println(Arrays.toString(theSplitString));
    }
}
