public class CharacterCheck {
    public static void main(String[] args) {

        char c = '@';

        String r =
            ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
                ? (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                    ? "Uppercase Vowel"
                    : (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                        ? "Lowercase Vowel"
                        : (c >= 'A' && c <= 'Z')
                            ? "Uppercase Consonant"
                            : "Lowercase Consonant"
                : (c >= '0' && c <= '9')
                    ? "Number"
                    : "Special Character";

        System.out.println(r);
    }
}
