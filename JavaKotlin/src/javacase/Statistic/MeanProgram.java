package javacase.Statistic;

public class MeanProgram {
    public static void main(String[] args) {
        String data = "532, 61, 3323, 5434, 3233";
        String removeSpace = data.replace(" ", "");
        long countComa = removeSpace.chars().filter(c -> c == ',').count();
        int[] dataNumber = new int[removeSpace.length() - (int) countComa];

        // Success Make Data Set Array
        /*int y = 0, z = 0;
        for (int x = 0; x < removeSpace.length(); x++) {
            if (removeSpace.charAt(x) == ',') {
                dataNumber[y] = Integer.parseInt(removeSpace.substring(z, x));
                y++;
                z = x + 1;
            }
        }
        for (int d: dataNumber) {
            System.out.print(d + " ");
        }*/


    }
}
