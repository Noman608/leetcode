class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     ArrayList<Integer> arrayList = new ArrayList<>();
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		if(nums1.length>=nums2.length) {
			for(int i = 0;i<nums1.length;i++) {
				if(mp.containsKey(nums1[i])) {
					mp.put(nums1[i],mp.get(nums1[i])+1);
				}
				else {
					mp.put(nums1[i],1);
				}
			}
		  for(int i =0 ; i < nums2.length;i++) {
			  if(mp.containsKey(nums2[i]) && mp.get(nums2[i])>0) {
				  arrayList.add(nums2[i]);
				  mp.put(nums2[i], mp.get(nums2[i])-1);
			  }
		  }
		}
		else {
			for(int i = 0;i<nums2.length;i++) {
				if(mp.containsKey(nums2[i])) {
					mp.put(nums2[i],mp.get(nums2[i])+1);
				}
				else {
					mp.put(nums2[i],1);
				}
			}
			for(int i =0 ; i < nums1.length;i++) {
				  if(mp.containsKey(nums1[i]) && mp.get(nums1[i])>0) {
					  arrayList.add(nums1[i]);
					  mp.put(nums1[i], mp.get(nums1[i])-1);
				  }
			  }
		}
		int arr[]= new int[arrayList.size()];
		for(int i=0;i<arrayList.size();i++) {
			arr[i]=arrayList.get(i);
		}
        return arr;
    }
}
