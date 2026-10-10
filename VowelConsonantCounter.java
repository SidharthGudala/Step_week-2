class VowelConsonantCounter {
    public static void main(String[] args) {
        String s = "Java Programming";
        int v = 0, c = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if ("aeiou".indexOf(ch) >= 0)
                v++;
            else if (ch >= 'a' && ch <= 'z')
                c++;
        }

        System.out.println("Vowels: " + v + " | Consonants: " + c);
    }
}
