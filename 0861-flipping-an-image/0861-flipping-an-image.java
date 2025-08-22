class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++)
        {
            reverse(image[i]);
        }
        return image;
    }
    public static void reverse(int a[])
    {
        int start = 0;
        int end = a.length-1;
        while(start<=end)
        {
            int temp = a[start];
            a[start++] = a[end]^1;
            a[end--] = temp^1;
        }
        
    }
}