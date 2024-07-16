package cn.wlf.entity;

public class Score {
     private Integer id;
     private String project;
     private String score;
     private Integer studentId;

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", project='" + project + '\'' +
                ", score='" + score + '\'' +
                ", studentId=" + studentId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Score() {
    }

    public Score(Integer id, String project, String score, Integer studentId) {
        this.id = id;
        this.project = project;
        this.score = score;
        this.studentId = studentId;
    }
}
