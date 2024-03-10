package Draft;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) {
        String input = "(\n" +
                "\t{full_name} == null\n" +
                "\t|| {full_name} == \"\"\n" +
                ")\n" +
                "? ({short_name} == null ? \"\" : {short_name})\n" +
                ": {full_name}";
        Set<String> columns = new HashSet<>();

        Pattern pattern = Pattern.compile("\\{([^}]*)\\}");
        Matcher matcher = pattern.matcher(input);

        // Поиск и вывод всех слов внутри фигурных скобок
        while (matcher.find()) {
            String word = matcher.group(1);
            columns.add(word);
        }
        System.out.println(columns);
    }
}

