package javacase.Statistic;

public class MeanProgram {
    private static int[] dataNumber;
    private static int sum = 0;

    public static void main(String[] args) {
        String data = "5, 6, 3, 5, 3, 5, 4, 5, 7, 8, 5, 5";
        int[] dtNum = getDataNumber(data);

        System.out.println("Data : " + data);
        System.out.println("n    : " + dtNum.length);
        System.out.println("Mean : " + mean(dtNum));

    }

    private static float mean(int[] dataNumber) {
        for (int dt: dataNumber) {
            sum += dt;
        }
        return (float) sum / dataNumber.length;
    }

    private static int[] getDataNumber(String data) {
        String s = data.replace(" ", "");
        long countComa = s.chars().filter(c -> c == ',').count();
        dataNumber = new int[s.length() - (int) countComa];

        int y = 0;
        for (int x = 0; x < s.length(); x++) {
            if (s.charAt(x) == ',')
                setDataNumberArray(y++, s.charAt(x-1));
            if (x == s.length() - 1)
                setDataNumberArray(y, s.charAt(x));
        }
        return dataNumber;
    }

    private static void setDataNumberArray(int i, char c) {
        dataNumber[i] = Integer.parseInt(String.valueOf(c));
    }

}
