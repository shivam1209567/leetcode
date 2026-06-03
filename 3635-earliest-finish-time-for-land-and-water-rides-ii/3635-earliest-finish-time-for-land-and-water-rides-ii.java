class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int land = Integer.MAX_VALUE;
        int water = Integer.MAX_VALUE;
        int landWater = Integer.MAX_VALUE;
        int waterLand = Integer.MAX_VALUE;
        for(int i = 0; i < landStartTime.length; i++){
         land = Math.min(land,landStartTime[i] + landDuration[i]);
        }
        for(int i = 0; i < waterStartTime.length; i++){
         water = Math.min(water,waterStartTime[i]+waterDuration[i]);
         landWater = Math.min(landWater, Math.max(waterStartTime[i],land) + waterDuration[i]);
        }
        for(int i = 0; i < landStartTime.length; i++){
            waterLand = Math.min(waterLand, Math.max(landStartTime[i],water) + landDuration[i]);
        }
        return Math.min(landWater,waterLand);
    }
}