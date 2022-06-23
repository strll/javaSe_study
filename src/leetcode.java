import org.junit.Test;

public class leetcode {
    public boolean hasAlternatingBits(int n) {
        int a = n ^ (n >> 1);
        return (a & (a + 1)) == 0;
    }
    @Test
    public void testLeetcode(){
        hasAlternatingBits(10);
    }
}
