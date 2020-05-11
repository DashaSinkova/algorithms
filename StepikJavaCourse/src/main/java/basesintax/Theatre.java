package basesintax;

import java.util.StringJoiner;

public class Theatre {
    public static void main(String[] args) {
        Theatre theatre = new Theatre();
        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(theatre.printTextPerRole(roles, textLines));

    }
    private String printTextPerRole(String[] roles, String[] textLines) {
        StringJoiner result = new StringJoiner(System.lineSeparator());
        for (String role : roles) {
            result.add(role + ":");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role)) {
                    result.add((i + 1) + ") " + textLines[i].substring(role.length() + 2));
                }
            }
            System.lineSeparator();
        }
        return result.toString();
    }
}
