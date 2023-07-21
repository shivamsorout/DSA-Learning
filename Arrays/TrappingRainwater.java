package Arrays;
public class TrappingRainwater {
    public static int trapWater(int [] height){
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i=1;i<=height.length;i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for (int i= height.length-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        int trapWater = 0;
        for(int i=0;i< height.length-1;i++){
            int waterLevel = Math.min(leftmax[i],rightMax[i]);
            trapWater += waterLevel-height[i];
        }
        return trapWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int trapWater = trapWater(height);
        System.out.println(trapWater);
    }
}
