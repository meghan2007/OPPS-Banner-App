public class OOPSBannerApp {

    public static String getOPattern() {
        return String.join("\n",
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** ");
    }

    public static String getPPattern() {
        return String.join("\n",
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    ");
    }

    public static String getSPattern() {
        return String.join("\n",
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** ");
    }

    public static void main(String[] args) {

        String[] banner = {
                getOPattern(),
                getOPattern(),
                getPPattern(),
                getSPattern()
        };

        for (String letter : banner) {
            System.out.println(letter);
        }
    }
}
