public class Main {
    public static void main(String[] args) {

        int start = 2 , end = 100 ;

        for (int i = start ;i<end ; i++){
            boolean asal = true;

            for (int j = 2 ; j<=i/2 ; j++ ){
                if (i % j == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal){
                System.out.print(i + " ");
            }
        }












    }
}
