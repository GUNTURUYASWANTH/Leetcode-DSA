class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> a = new ArrayList<>();
        Set<Integer> s = new HashSet<>();

        for(int num : nums1)
        {
            s.add(num);
        }
        for(int num : nums2)
        {
            if(s.contains(num))
            {
                a.add(num);
                s.remove(num);
            }
        }
        return a.stream().mapToInt(Integer::intValue).toArray();
    }
}