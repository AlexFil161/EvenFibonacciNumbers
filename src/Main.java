public class Main {
    public static void main(String[] args) {
        int[] firstArray = new int[35];
        firstArray[0] = 1;
        firstArray[1] = 2;
        int sum = 0;
        for (int i = 2; i < firstArray.length; i++) {
            firstArray[i]= firstArray[i - 1] + firstArray[i - 2];
        }

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 == 0 && firstArray[i] < 4000000) {
                sum = sum + firstArray[i];
            }
        }
        System.out.println(sum);
    }
}