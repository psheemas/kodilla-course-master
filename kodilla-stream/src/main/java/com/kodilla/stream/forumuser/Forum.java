package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(227695, "Piotr", 'M', LocalDate.of(1990, 1, 1), 12));
        forumUsersList.add(new ForumUser(239205, "Janusz", 'M', LocalDate.of(2005, 3, 12), 121));
        forumUsersList.add(new ForumUser(200593, "Blazej", 'M', LocalDate.of(1990, 4, 22), 1232));
        forumUsersList.add(new ForumUser(295838, "Igor", 'M', LocalDate.of(1991, 4, 23), 929));
        forumUsersList.add(new ForumUser(201932, "Tomek", 'M', LocalDate.of(2010, 5, 9), 5));
        forumUsersList.add(new ForumUser(210101, "Mirek", 'M', LocalDate.of(1992, 6, 7), 938));
        forumUsersList.add(new ForumUser(299040, "Natalia", 'F', LocalDate.of(1990, 7, 28), 2319872));
        forumUsersList.add(new ForumUser(298496, "Monika", 'F', LocalDate.of(2009, 8, 10), 4358));
        forumUsersList.add(new ForumUser(259433, "Kasia", 'F', LocalDate.of(1993, 9, 2), 234));
    }
    public List<ForumUser> getForumUserList(){
        return new ArrayList<>(forumUsersList);
    }
}
