import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class TestSolution {
    @Test
    public void lengthOfLISTest1() {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        Assert.assertEquals(4, new Solution().lengthOfLIS(nums));
    }

    @Test
    public void lengthOfLISTest2() {
        int[] nums = {0, 1, 0, 3, 2, 3};
        Assert.assertEquals(4, new Solution().lengthOfLIS(nums));
    }

    @Test
    public void lengthOfLISTest3() {
        int[] nums = {7, 7, 7, 7, 7, 7, 7};
        Assert.assertEquals(1, new Solution().lengthOfLIS(nums));
    }

    @Test
    public void lengthOfLISTest4() {
        int[] nums = {4, 10, 4, 3, 8, 9};
        Assert.assertEquals(3, new Solution().lengthOfLIS(nums));
    }

    @Test
    public void lengthOfLISTest5() {
        int[] nums = {1, 3, 6, 7, 9, 4, 10, 5, 6};
        Assert.assertEquals(6, new Solution().lengthOfLIS(nums));
    }
}
