package dev.projects.exercises;

public class SwitchStatementChallenge {

    public static void main(String[] args) {

        char ch = 'A'; // Initialize with a single character
        switch (ch) {
            case 'A':
                System.out.println("ABLE for NATO  character A");
                break;
            case 'B':
                System.out.println("BAKER for NATO character B");
                break;
            case 'C':
                System.out.println("CHARLIE for NATO character C");
                break;
            case 'D':
                System.out.println(" DOG for NATO character D");
                break;
            case 'E':
                System.out.println("EASY for NATO character E");
                break;
            default:
                System.out.println("Letter " + ch + " was not found");
                break;
        }
    }
}
