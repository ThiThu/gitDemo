package PhuongThuc;

public class CongHaiMaTran {
    public static void main(String[] args) {
        float[][] maTran1 = {{1, 2, 3}, {5, 6, 7}};
        float[][] maTran2 = {{7, 8, 9}, {10, 22, 14}};
        float sum = tongHaiMaTran(maTran1, maTran2);
        System.out.println("tong" + sum);
    }

    public static float tongHaiMaTran(float[][] maTran1, float[][] maTran2) {
        for (int i = 0; i < maTran1.length; i++) {
            for (int j = 0; j < maTran1[j].length; j++) {
                maTran1[i][j] = maTran2[i][j];


            }

        }
        return tongHaiMaTran(maTran1, maTran2);
    }

}


