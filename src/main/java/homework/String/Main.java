package homework.String;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич",
        "Лука"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
                "Лука: Это ужасно"};
        System.out.println(printTextPerRole(roles, textLines));
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder sbRoles = new StringBuilder();
        for (int i = 0; i < roles.length; i++) {
            sbRoles.append(roles[i]).append(":").append("\n");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i] +":")) {
                        sbRoles.append(textLines[j].replaceFirst(".*?:", j + 1 + ")"));
                        sbRoles.append("\n");
                }
            }

                sbRoles.append("\n");

        }

        return sbRoles.toString();
    }
}

