package p004;

public class altERnaTIngcAsETOALTerNAtiNGCaSe {
    /*altERnaTIng cAsE <=> ALTerNAtiNG CaSe altERnaTIng cAsE <=> ALTerNAtiNG CaSe
    Define String.prototype.toAlternatingCase (or a similar function/method such as
    to_alternating_case/toAlternatingCase/ToAlternatingCase in your selected language; see the
    initial solution for details) such that each lowercase letter becomes uppercase and each uppercase
    letter becomes lowercase. For example:*/
    public static void main(String[] args) {
        System.out.println("ALTerNAtiNG CaSe    " + "\n"
                + toAlternativeString("altERnaTIng cAsE"));
        System.out.println("ALTerNAtiNG CaSe <=> altERnaTIng cAsE   " + "\n"
                + toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe").toString());
    }

    public static String toAlternativeString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            stringBuilder.append(Character.isLowerCase(string.charAt(i))
                    ? Character.toUpperCase(string.charAt(i))
                    : Character.toLowerCase(string.charAt(i)));
        }
        return stringBuilder.toString();
    }
//    public static String toAlternativeString(String string) {
//        return string.chars()
//                .map(c -> isUpperCase(c) ? toLowerCase(c) : toUpperCase(c))
//                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
//                .toString();
//    }
}
