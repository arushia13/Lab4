/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 *This class has a function that finds the larger of two Strings that searches
 *for a String, and if that isn't available, finds the largest instance of that
 *String available.
 */
public class ReclamationProject {

    /**
     *
     * @param a input variable
     * @param b input variable
     * @return r string variable
     */

    static String doit(final String a, final String b) {
        String r = "";
        String str1;
        String str2;

        if (a.compareTo(b) > 0) {
            str1 = a; // makes str1 the longer string
            str2 = b;
        } else {
            str1 = b;
            str2 = a;
        }

        for (int i = 0; i < str1.length(); i++) {
            for (int j = str1.length() - i; j > 0; j--) {
                for (int k = 0; k < str2.length() - j; k++) {
                    if ((a.regionMatches(i, b, k, j) && j > r.length())) {
                        r = a.substring(i, i + j);
                    }
                }
            }
        } return r; }
}
