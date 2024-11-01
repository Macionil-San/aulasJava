package aula06.exemplos;

public class exemplo05 {
    public static void main(String[] args) {
        int[] nums  = {10,20,30,40};

        for (int i = 0 ; i < nums.length; i++) {
            System.out.println(nums[i]);
        }


        String[] nnomes = {"RMS", "MKC" , "SGO"};
        System.out.println("valor da posição [1] = " + nnomes[1]);
        for (int i = 0 ; i < nnomes.length; i++) {
            System.out.println(nnomes[i]);
        }
    }
}
