package leetCode;


import java.util.Arrays;

public class stepic_1 {

    public static void main(String[] args) {

        String [] roles= {
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука",
                "Fucker",
                "Лука Лукич"};
        String [] textLines={"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор. ",
                "Аммос Федорович: Как ревизор? ",
                "Артемий Филиппович: Как ревизор? ",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем. ",
                "Аммос Федорович: Вот те на! ",
                "Артемий Филиппович: Вот не было заботы, так подай! ",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем! "};
        StringBuilder answer = new StringBuilder();
        for (String role:roles) {
            answer.append(role).append(":").append("\n");
            for (String text:textLines) {
                if (text.startsWith(role.concat(": "))){
                    answer.append(Arrays.asList(textLines).indexOf(text) + 1).append(")").append(text.replaceFirst(role.concat(":"),"")).append('\n');
                }
            }
            answer.append("\n");
        }

//        for (String role : roles) {
//            answer.append(role).append(":").append('\n');
//            for (int j = 0; j < textLines.length; j++) {
//                if (textLines[j].startsWith(role.concat(": "))) {
//                    answer.append(j + 1).append(")").append(textLines[j].replaceFirst(role + ":", "")).append('\n');
//                }
//            }
//            answer.append('\n');
//        }
        System.out.println(answer);
    }
}


// [[C@48140564]