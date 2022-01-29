package javacase.Statistic;

import java.util.Arrays;

public class ModusProgram {
    private static int[][] modus;

    public static void main(String[] args) {
        Statistic statistic = new Statistic();

        String data = "5, 6, 3, 5, 3, 5, 4, 5, 7, 8, 5";
        int[] dtNum = statistic.getDataNumber(data);

        String arrayStr = Arrays.toString(dtNum);
        System.out.println(arrayStr);
        String rplArray = arrayStr.replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .replace(" ", "");
        System.out.println(rplArray);
        String dataNumber = removeDuplicate(rplArray);
        System.out.println(dataNumber);
        modusData(dataNumber);
        int modusValue = getModus(dtNum);
        System.out.println("Modus: "+modusValue);
    }

    private static String removeDuplicate(String data) {
        String str = "";
        for (int x = 0; x < data.length(); x++) {
            char charAtPosition = data.charAt(x);
            if (str.indexOf(charAtPosition) < 0)
                str += charAtPosition;
        }
        return str;
    }

    private static void modusData(String str) {
        modus = new int[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            modus[i][0] = Integer.parseInt(String.valueOf(str.charAt(i)));
            modus[i][1] = 0;
        }
    }

    private static int getModus(int[] dt) {
        for (int i : dt) {
            for (int z = 0; z < modus.length; z++) {
                if (modus[z][0] == i) {
                    modus[z][1]++;
                    break;
                }
            }
        }
        int n = 0, max = modus[n][1];
        for (int m = 0; m < modus.length; m++) {
            if (max < modus[m][1]) {
                max = modus[m][1];
                n = m;
            }
        }
        return modus[n][0];
    }

}
