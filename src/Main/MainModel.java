package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author Paul Duschek
 * @version 1.0, 8.12.2020
 */

public class MainModel {

    ArrayList<String> replies = new ArrayList<>();

    public MainModel()
    {
        replies.add("It is certain.");
        replies.add("It is decidedly so.");
        replies.add("Without a doubt.");
        replies.add("Yes – definitely.");
        replies.add("You may rely on it.");
        replies.add("As I see it, yes.");
        replies.add("Most likely.");
        replies.add("Outlook good.");
        replies.add("Yes.");
        replies.add("Signs point to yes.");
        replies.add("Reply hazy, try again.");
        replies.add("Ask again later.");
        replies.add("Better not tell you now.");
        replies.add("Cannot predict now.");
        replies.add("Concentrate and ask again.");
        replies.add("Don’t count on it.");
        replies.add("My reply is no.");
        replies.add("My sources say no.");
        replies.add("Outlook not so good.");
        replies.add("Very doubtful.");
    }

    public String getRandomReply(String s)
    {
        Random rd = new Random();

        if(s.equals(""))
        {
            return "Empty, please answer a question.";
        }
        else if(s.contains("Softwareentwicklung") && s.contains("?")){
            return replies.get(rd.nextInt(10));
        }
        else if(s.contains("Essen") && s.contains("?"))
        {
            return replies.get(rd.nextInt(5)+10);
        }
        else if(s.contains("Regen") && s.contains("?"))
        {
            return replies.get(rd.nextInt(5)+15);
        }
        else if(s.contains("?")){
            return replies.get(rd.nextInt(replies.size()));
        }
        return "An error occured. Make sure to write a ? at the end of your question.";
    }


}
