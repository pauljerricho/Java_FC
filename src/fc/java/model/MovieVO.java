package fc.java.model;

public class MovieVO {
    private String name;
    private int day;
    private String major;
    private String part;
    private float time;
    private int level;
    public MovieVO(){
    }

    public MovieVO(String name, int day, String major, String part, float time, int level) {
        this.name = name;
        this.day = day;
        this.major = major;
        this.part = part;
        this.time = time;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "name='" + name + '\'' +
                ", day=" + day +
                ", major='" + major + '\'' +
                ", part='" + part + '\'' +
                ", time=" + time +
                ", level=" + level +
                '}';
    }
}
