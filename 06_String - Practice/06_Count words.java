class Result {
    static int countWords(String str) {
        str = str.trim();
        if (str.length() == 0)
            return 0;
        String[] words = str.split("\\s+");
        return words.length;
    }
}