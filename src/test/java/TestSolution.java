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
}
