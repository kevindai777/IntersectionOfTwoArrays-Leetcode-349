//Java Solution

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1 = 0;
        int p2 = 0;
        List<Integer> temp = new ArrayList<>();
        
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] == nums2[p2]) {
                if (!temp.contains(nums1[p1])) {
                    temp.add(nums1[p1]);
                }
                p1++;
                p2++;
            } else if (nums1[p1] < nums2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        
        int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }
        
        return result;
    }
}