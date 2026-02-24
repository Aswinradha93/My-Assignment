package week4.day1;
import java.util.Arrays;
public class MajorityElement {
	public static void main(String[] args) {
        int[] nums = {2,2,3,1,1,2,2};
        Arrays.sort(nums);
        System.out.println(nums[nums.length/2]);
        int[] nums1 = {3,2,3};
        int ans = 0;
        int count = 0;
        for(int num: nums1)
        {
        	if(count == 0)
        		ans = num;
        	count += (num == ans)?1:-1;
        }
        System.out.println(ans);
	}
}