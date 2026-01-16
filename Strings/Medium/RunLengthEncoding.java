// Problem: Compress a string using run-length encoding (character followed by frequency)
// Time Complexity: O(n)
// Space Complexity: O(n) -> output StringBuilder

public class RunLengthEncoding {

    public static String runLengthEncode(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < s.length() ; i++) {
            Integer count = 1;
            while (i+1 < s.length() && s.charAt(i) == s.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(s.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(runLengthEncode("aabbccccddd"));
        System.out.println(runLengthEncode("aaabbbcc"));
        System.out.println(runLengthEncode("abcd"));
        System.out.println(runLengthEncode("aabbccddeee"));
        System.out.println(runLengthEncode("zzzzzz"));
        System.out.println(runLengthEncode("ppqqqrrrrs"));
    }
}