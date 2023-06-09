/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle_firstproject.app;

import gradle_firstproject.list.LinkedList;

import static gradle_firstproject.utilities.StringUtils.join;
import static gradle_firstproject.utilities.StringUtils.split;
import static gradle_firstproject.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
