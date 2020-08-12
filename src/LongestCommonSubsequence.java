public class LongestCommonSubsequence {
    public static int getLongestCommonSubsequence(String a, String b) {
        int[][] matrix = new int[a.length() + 1][b.length() + 1];
        for (int i = 0; i <= a.length(); i++) {
            for (int j = 0; j <= b.length(); j++) {
                if (i == 0 || j == 0) {
                    matrix[i][j] = 0;
                } else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    matrix[i][j] = 1 + matrix[i - 1][j - 1];
                } else {
                    matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i][j - 1]);
                }
            }
        }
        return matrix[a.length()][b.length()];
    }
    public static String getLCS(String a, String b)
    {
        int[][] matrix = new int[a.length() + 1][b.length() + 1];
        for (int i = 0; i <= a.length(); i++) {
            for (int j = 0; j <= b.length(); j++) {
                if (i == 0 || j == 0) {
                    matrix[i][j] = 0;
                } else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    matrix[i][j] = 1 + matrix[i - 1][j - 1];
                } else {
                    matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i][j - 1]);
                }
            }
        }
        int i=a.length();
        int j=b.length();
        String LCS="";
        while (i>0&&j>0) {
            if(1 + matrix[i - 1][j - 1]==matrix[i][j]) {
                LCS += a.charAt(i-1);
                i--;
                j--;
            }
            else if((matrix[i][j-1])>= matrix[i-1][j]) {
                j=j-1;
            }
            else if((matrix[i][j-1])< matrix[i-1][j]) {
                i=i-1;
            }
        }
        return LCS;
    }
    public static void main(String[] args) {
        String s1 = "ABCABC";
        String s2 = "BABCAAA";
        System.out.println("Length of LCS is" + " " + getLongestCommonSubsequence(s1, s2));
        System.out.println("LCS is" + " " + getLCS(s1, s2));
    }

}


