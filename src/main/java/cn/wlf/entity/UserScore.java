package cn.wlf.entity;

public class UserScore {

    private String score;
    private String username;
    private String project;

    public UserScore() {
    }

    public UserScore(String score, String username, String project) {
        this.score = score;
        this.username = username;
        this.project = project;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
}
