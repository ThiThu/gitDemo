package KieuDuLieu;

public class ex3 {
    public static void main(String[] args) {
        int so = 1;
        for (int i = 1; i <=11 ; i++) {

            System.out.println("in ra"+so);
            if(i == 6){
                so = so *2;
                continue;
            }
            so= so +i;

            }
        }
}






