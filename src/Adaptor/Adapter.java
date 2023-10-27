package Adaptor;

import java.util.*;

public class Adapter implements LanguageChoice{
    private ResourceBundle messages;

    public void ResourceBundleAdapter(int languageChoice) {
        Locale locale;

        switch (languageChoice) {
            case 1:
                locale = Locale.ENGLISH;
                break;
            case 2:
                locale = Locale.FRENCH;
                break;
            case 3:
                locale = Locale.GERMAN;
            default:
                locale = Locale.getDefault();
                break;
        }

        this.messages = ResourceBundle.getBundle("messages", locale);
    }
    @Override
    public String getMessage(String key) {
        return messages.getString(key);
    }
}
