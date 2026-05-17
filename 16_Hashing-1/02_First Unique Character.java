class Result {
    static int firstUniqueChar(String str) {
        int freq[] = new int[26];
        // Count frequency of characters
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        // Find first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}