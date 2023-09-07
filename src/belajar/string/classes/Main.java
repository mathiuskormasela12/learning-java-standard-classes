package belajar.string.classes;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
      String name = "Mathius Kormasela";

      // 1. Change string to be upper case letter
      String nameUpperCase = name.toUpperCase();
      System.out.println(nameUpperCase);

      // 2. Change string to be lower case letter
      String nameLowerCase = name.toLowerCase();
      System.out.println(nameLowerCase);

      // 3. Check string length
      System.out.println(name.length());

      // 4. Convert string to be an array
      String[] names = name.split(" ");
      for(String val : names) {
        System.out.println(val);
      }

      // 5. Check if a string starts or ends with a specific value
      System.out.println(name.startsWith("Mathius"));
      System.out.println(name.endsWith("Kormasela"));

      // 6. Check if a string is trully empty ("")
      String a = "";
      System.out.println(a.isEmpty());

      // 7. Check if a string filled with empty string or space only
      String b = "     ";
      System.out.println(b.isBlank());

      // 8. Get a single character
      System.out.println(name.charAt(2));

      // 9. Convert string to char array
      char[] val = name.toCharArray();
      System.out.println(val);

      System.out.println("============================");

      /*
        in Java string is an immutable object,
        so actually we can't modify a string.
        When we try to modify string, example to do
        a concatination string, Java will create a different
        string instead. So it will lead us to memory issue.
        Because of that, if we want to modify string, we can use
        StringBuffer or StringBuilder.
      */

      // 1. StringBuffer (thread safe)
      // StringBuffer can be used to manipulate string pararelly.
      // Because StringBuffer is thread-safe, it will make StringBuffer is run slowly
      StringBuffer csrLeader = new StringBuffer();
      csrLeader.append("Sua");
      csrLeader.append(" ");
      csrLeader.append("Yo");
      System.out.println(csrLeader.toString());

      // 2. StringBuilder (non thread-safe)
      // StringBuilder can be used to manipulate string noramaly not pararel
      StringBuilder gfriendLeader = new StringBuilder();
      gfriendLeader.append("Sojung");
      gfriendLeader.append(" ");
      gfriendLeader.append("Kim");
      System.out.println(gfriendLeader.toString());

      // 3. StringJoiner is a class that can be used to join an array to be a string
      String[] vivizMembers = {"Eunha", "Sin B", "Umji"};
      StringJoiner vivizMemberStr = new StringJoiner(",", "[", "]");
      for(var v : vivizMembers) {
        vivizMemberStr.add(v);
      }
      System.out.println(vivizMemberStr);

      // 4. StringTokenizer is a class that can be used to split a string to be an array lazyly. (satu-persatu, gk langsung kyk split)
      String txt = "Intel M1 M1-Pro-Max M2 M2-Pro-Max";
      StringTokenizer tokenizer = new StringTokenizer(txt, " ");
      while (tokenizer.hasMoreTokens()) {
        String res = tokenizer.nextToken();
        System.out.println(res);
      }
    }
}
