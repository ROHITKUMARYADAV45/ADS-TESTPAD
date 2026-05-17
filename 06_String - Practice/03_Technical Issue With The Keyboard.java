class Result {
    // Return the updated string
    static String getDesiredString(String str) {
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        if (n == 0)
            return "";
        sb.append(str.charAt(0));
        for (int i = 1; i < n; i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}