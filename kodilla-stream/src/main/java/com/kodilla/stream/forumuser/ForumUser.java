package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userOwnNumber;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int publishedPosts;

    public ForumUser(final int userOwnNumber,final String userName,final char sex,final LocalDate birthDate,final int publishedPosts) {
        this.userOwnNumber = userOwnNumber;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.publishedPosts = publishedPosts;
    }

    public int getUserOwnNumber() {
        return userOwnNumber;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPublishedPosts() {
        return publishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userOwnNumber=" + userOwnNumber +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", publishedPosts=" + publishedPosts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (userOwnNumber != forumUser.userOwnNumber) return false;
        if (sex != forumUser.sex) return false;
        if (publishedPosts != forumUser.publishedPosts) return false;
        if (userName != null ? !userName.equals(forumUser.userName) : forumUser.userName != null) return false;
        return birthDate != null ? birthDate.equals(forumUser.birthDate) : forumUser.birthDate == null;
    }

    @Override
    public int hashCode() {
        int result = userOwnNumber;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (int) sex;
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + publishedPosts;
        return result;
    }
}
