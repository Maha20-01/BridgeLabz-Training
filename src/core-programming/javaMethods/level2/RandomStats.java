package level2;

public class RandomStats
{

    public static int[] generate4DigitRandomArray(int size)
    {
        int[] a = new int[size];

        for (int i = 0; i < size; i++)
        {
            a[i] = (int) (Math.random() * 9000) + 1000;
        }
        return a;
    }
    
    
    public static double[] findAverageMinMax(int[] numbers) 
    {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) 
        {
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }
        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }

    
    
    public static void main(String[] args) 
    {
        int[] nums = generate4DigitRandomArray(5);
        System.out.print("Random numbers: ");
        for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }
        double[] res = findAverageMinMax(nums);
        System.out.println();
        System.out.println("Average = " + res[0]);
        System.out.println("Minimum = " + (int) res[1]);
        System.out.println("Maximum = " + (int) res[2]);
    }
}
