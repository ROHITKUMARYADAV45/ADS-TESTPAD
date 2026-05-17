class Result {
    static void countFrequency(String str) {
        int freq[] = new int[26];
        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        boolean printed[] = new boolean[26];
        // Print in order of occurrence
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            if (!printed[index]) {
                System.out.print(str.charAt(i));
                System.out.print(freq[index] + " ");
                printed[index] = true;
            }
        }
    }
}