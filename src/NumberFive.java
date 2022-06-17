public class NumberFive {

    //5.Display correspondences between symbols and their numerical designations in computer memory.

    public static void matchesCharacters() {
        for (int i = 32; i <= 126; i++) {
            System.out.println(i + " = " + (char) i);
        }
    }

    public static void main(String[] args) {
         NumberFive.matchesCharacters();
    }
}
