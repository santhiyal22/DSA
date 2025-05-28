class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = releaseTimes.length;
       
            int max = releaseTimes[0];
            char slowestKey = keysPressed.charAt(0);
             for(int i=1;i<n;i++) {
                int duration = releaseTimes[i] - releaseTimes[i-1];

                if(duration > max ||duration == max && keysPressed.charAt(i) > slowestKey ) {
                    max = duration;
                    slowestKey =  keysPressed.charAt(i);
                }
        }
        return slowestKey;
    }
}