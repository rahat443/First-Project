package bubbleShort;

public class bubble {
    public static void main(String[] args) {
        int[] houseNumber = {12,14,13,16,18,15,11,17,19,20};
        System.out.println("The original sequience:-\n   ");
        for(int i = 0; i < houseNumber.length; i++){
            System.out.println(houseNumber[i] + ", ");
        }
        System.out.println();
        sortEm(houseNumber);
    }

    private static void sortEm(int[] ar){
        int temp;

        for(int i = ar.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(ar[j] > ar[j + 1]){
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }

        System.out.print("The new sequence:-\n   ");
        for(int i = 0; i < ar.length; i++){
            System.out.println(ar[i] + ", ");
        }

        System.out.println();
    }


}
