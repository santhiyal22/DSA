class Solution {
    public int maxEvents(int[][] events) {
        // int n = events.length;
        // Arrays.sort(events, (a, b) -> Integer.compare(a[1], b[1]));
        // int maxDay = 0;
        // for (int[] event : events) {
        //     maxDay = Math.max(maxDay, event[1]);
        // }
        // boolean[] attended = new boolean[maxDay + 1];
        // ;
        // int count = 0;
        // for (int i = 0; i < n; i++) {
        //     int start = events[i][0];
        //     int end = events[i][1];
        //     for (int d = start; d <= end; d++) {
        //         if (!attended[d]) {
        //             attended[d] = true;
        //             count++;
        //             break;
        //         }
        //     }
        // }
        // return count;
        
        int n = events.length;
        int maxDay = 0;
        for (int[] event : events) {
            maxDay = Math.max(maxDay, event[1]);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int ans = 0;
        for (int i = 1, j = 0; i <= maxDay; i++) {
            while (j < n && events[j][0] <= i) {
                pq.offer(events[j][1]);
                j++;
            }
            while (!pq.isEmpty() && pq.peek() < i) {
                pq.poll();
            }
            if (!pq.isEmpty()) {
                pq.poll();
                ans++;
            }
        }

        return ans;
    }
}