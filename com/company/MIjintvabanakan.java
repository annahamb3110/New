public class MIjintvabanakan {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8};
        float f = mijin(arr);
        System.out.println(f);
    }

    static float mijin(int[]arr)
    { float mijin;
        int sum=0;

        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }

        mijin=sum/(arr.length*1.f);
        return mijin;
    }

}
