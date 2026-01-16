// Problem: Reverse the order of words in a string
// LeetCode 151
// Time Complexity: O(n) 
// Space Complexity: O(n) -> StringBuilder + temporary word buffer
public class ReverseWords {
	
	public static String reverseWords(String s) {
		StringBuilder rev = new StringBuilder("");

		for (int i = s.length() - 1 ; i >= 0 ; i--) {
            while ( i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) {
                break;
            }

			StringBuilder word = new StringBuilder("");	
			while ( i >= 0 && s.charAt(i) != ' ') {
				word.append(s.charAt(i));
				i--;
			}
			word.reverse();
			rev.append(word);

			while (i >= 0 && s.charAt(i) == ' ') {
				i--;
			}

			if ( i >= 0) {
				rev.append(' ');
				i++;
			}
		}

		return rev.toString();
	}

	public static void main(String[] args) {
		System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello   world  "));
        System.out.println(reverseWords("Java is   fun"));
        System.out.println(reverseWords("  this     is a     string"));
	}
}