package string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 151. 翻转字符串里的单词
 *
 * @author Haixiang
 * @email haixiang7c6@gmail.com
 * @since 2020-04-10
 */
public class ReverseWords151 {

    /**
     * 方法一：代码更简洁
     */
    public String reverseWords(String s) {
        //去掉头尾空格
        s = s.trim();
        List<String> list = Arrays.asList(s.split("\\s+"));
        Collections.reverse(list);
        return String.join(" ", list);
    }

    /**
     * 方法二，效率更高
     */
    public String reverseWords2(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].equals("")) {
                if (i != words.length - 1) {
                    sb.append(" ");
                }
                sb.append(words[i]);
            }
        }
        return sb.toString();
    }
}
