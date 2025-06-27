public class trappingRain {
    public static void rainWater(int height[]){
        int [] maxL = new int[height.length];
        int [] maxR = new int[height.length];
        int max = Integer.MIN_VALUE;
        

        // calculating left max boudary - array
        for (int i = 0; i< height.length; i++){
            if (max < height[i]){
                max = height[i];
            }
            maxL[i]= max;
        }
        // Printing left max boundary array
         for (int i = 0; i< height.length; i++){
            System.out.print(maxL[i]+" ");
            }
           
        System.out.println();

        // calculating right max boundary array
        max = Integer.MIN_VALUE;
        for (int i = height.length-1; i>=0; i--){
            if (max < height[i]){
                max = height[i];
            }
            maxR[i]= max;
        }

        // Printing right max boundary array
         for (int i = 0; i< height.length; i++){
            System.out.print(maxR[i]+" ");
            }
         int rain = 0;
         System.out.println();

         // calculating the water level 
       for (int i = 0; i< height.length; i++){
          rain = rain + Math.min(maxR[i],maxL[i])- height[i];
        }
        System.out.println(rain);
    }
    public static void main (String [] args){
        
        int[] height = { 4,2,0,6,3,2,5};
        rainWater(height);
    }
}
