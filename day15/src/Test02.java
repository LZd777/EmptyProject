import org.junit.Test;

public class Test02 {
    public static void main(String[] args) {
        String s1 = "abd423abc3523abc";
        String s2 = "abc";
        System.out.println(count(s1, s2));

    }

    @Test
    /**
     * 返回字符串s1中有多少个s2
     */
    public static int count(String s1, String s2) {
        int count = 0;
        for (int index = 0; index <= s1.length(); ) {
            index = s1.indexOf(s2, index);
            if (index != -1) {
                index++;
                count += s2.length();
            } else {
                break;
            }
        }
        return count;
    }

}
