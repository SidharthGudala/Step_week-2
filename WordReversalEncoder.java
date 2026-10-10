class WordReversalEncoder {
    public static void main(String[] args) {
        String sentence = "hello club";
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }

        System.out.println(String.join(" ", words));
    }
}
