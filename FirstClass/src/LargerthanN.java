public class LargerthanN 
{
    public static void main(String[] args) 
    {
        int[] array = {  0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,26};
        final int n = 15;

        greaterthann(array, n);
    }

    public static void  greaterthann(int[] arrayy, int n) 
    {
        for(int num : arrayy) 
        {
            if (num > n) 
            {
                System.out.println(num);
            }
        }
    }
}








