package io.github.sylviameows.gameruleblocker;

import org.bukkit.ChatColor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ChatUtil {
    static final char CHAR = '&';

    public static String translateHex(String raw) {
        final Pattern hex = Pattern.compile(CHAR + "([A-Fa-f0-9]{6})");
        Matcher matcher = hex.matcher(raw);
        StringBuffer buffer = new StringBuffer(raw.length() + 4 * 8);

        while (matcher.find()) {
            String group = matcher.group();
            matcher.appendReplacement(buffer, CHAR + "x"
                    + CHAR + group.charAt(0)
                    + CHAR + group.charAt(1)
                    + CHAR + group.charAt(2)
                    + CHAR + group.charAt(3)
                    + CHAR + group.charAt(4)
                    + CHAR + group.charAt(5)
            );
        }

        return matcher.appendTail(buffer).toString();
    }

    public static String translate(String raw) {
        return ChatColor.translateAlternateColorCodes(CHAR, raw);
    }
}
