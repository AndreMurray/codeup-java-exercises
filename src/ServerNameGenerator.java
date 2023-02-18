public class ServerNameGenerator {
    private static String[] nouns = {
            "BandWidth",
            "Berry",
            "Moonlight",
            "Rating"
    };

    private static String[] adjectives = {
            "ichy",
            "inconclusive",
            "classy",
            "capable"
    };

    public static String returnRandomElement(String[] strs) {
        int randomIndex = (int) (Math.random() * strs.length);
        return strs[randomIndex];
    }

//    public static void main(String[] args) {
//        String randomNoun = returnRandomElement(nouns);
//        String randomAdjectives = returnRandomElement(adjectives);
//        System.out.printf(strs[randomIndex]);
//
//    }

}
