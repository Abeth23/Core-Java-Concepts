package Collections.HashSet;

import java.util.HashSet;

public class UniqueEmails {
    //Only unique values are stored in HashSet, duplicates are ignored
    public static void main(String[] args) {
        HashSet<String> email = new HashSet<>();
        email.add("ac1@gmail.com");
        email.add("ac2@gmail.com");
        email.add("ac1@gmail.com");

        System.out.println("Unique Emails: " + email);
}
}
