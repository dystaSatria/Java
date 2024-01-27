public String moreKarelLetters(String str)
{
        StringBuilder modifiedString = new StringBuilder();
        String lettersToDuplicate = "karel";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (lettersToDuplicate.contains(String.valueOf(currentChar))) {
                modifiedString.append(currentChar);
            }
            modifiedString.append(currentChar);
        }

        return modifiedString.toString();
}
