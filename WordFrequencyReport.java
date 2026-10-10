import java.util.*;

class WordFrequencyReport {
    public static void main(String[] args) {
        String text = "The mentor was great, the session was great and clear.";
        String[] stop = {"the", "was", "and", "a", "is", "of", "in"};
        String[] words = text.toLowerCase()
                .replace(".", "").replace(",", "").split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String w : words) {
            boolean skip = false;

            for (String s : stop)
                if (w.equals(s)) skip = true;

            if (!skip)
                map.put(w, map.getOrDefault(w, 0) + 1);
        }

        map.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
