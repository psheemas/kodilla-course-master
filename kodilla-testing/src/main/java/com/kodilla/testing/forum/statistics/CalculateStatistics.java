package com.kodilla.testing.forum.statistics;

class StatisticsCalculator {
    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    int averagePostsPerUser;
    int averageCommentsPerUser;
    int averageCommentsPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public int getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public int getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public int getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postCount();
        this.numberOfComments = statistics.commentsCount();

        if(this.numberOfUsers > 0){
            this.averagePostsPerUser = this.numberOfPosts/this.numberOfUsers;
            this.averageCommentsPerUser = this.numberOfComments/this.numberOfUsers;
        }else{
            this.averagePostsPerUser = -1;
            this.averageCommentsPerUser = -1;
        }

        if(this.numberOfPosts > 0){
            this.averageCommentsPerPost = this.numberOfComments/this.numberOfPosts;
        }else{
            this.averageCommentsPerPost = -1;
        }
    }

    public void showStatistics(){
        System.out.print("Number of Users: " + numberOfUsers);
        System.out.print("Number of Posts: " + numberOfPosts);
        System.out.print("Number of Comments: " + numberOfComments);
        System.out.print("Average number of posts per user: " + averagePostsPerUser);
        System.out.print("Average number of comments per user: " + averageCommentsPerPost);
        System.out.print("Average number of comments per post: " + averageCommentsPerPost);
    }
}

