class FindSumPairs {

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.a = nums1;
        this.b = nums2;
        this.hash = new HashMap<>();
        for(int g: b) {
            hash.put(g, hash.getOrDefault(g, 0)+1);
        }
    }
    
    int [] a;
    int [] b;
    HashMap<Integer,Integer> hash;
    public void add(int index, int val) {
        hash.put(b[index], hash.get(b[index])-1);
        b[index]=b[index]+val;
        hash.put(b[index], hash.getOrDefault(b[index],0)+1);

    }
    public int count(int tot) {
        int count =0;
        for(int i : a){
            int rem = tot-i;
            count += hash.getOrDefault(rem,0);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */