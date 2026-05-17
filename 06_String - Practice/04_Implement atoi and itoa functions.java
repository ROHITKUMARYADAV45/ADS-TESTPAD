class Result {
    static String itoa(int num) {
        if (num == 0)
            return "0";
        return convert(num);
    }
    static String convert(int num) {
        if (num == 0)
            return "";
        return convert(num / 10) + (char)((num % 10) + '0');
    }
    static int atoi(String str) {
        return convertToInt(str, 0);
    }
    static int convertToInt(String str, int index) {
        if (index == str.length())
            return 0;
        return (str.charAt(index) - '0') *
               (int)Math.pow(10, str.length() - index - 1)
               + convertToInt(str, index + 1);
    }
}