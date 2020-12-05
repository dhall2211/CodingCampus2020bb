package Bokhee.CodingCampus;

public class CodingCampus {

    private String buildingName;
    private String roomName;
    private String course;
    private String trainer;
    private String[] studenten;

    public CodingCampus(String buildingName, String roomName, String course, String trainer, String[] studenten) {
        this.buildingName = buildingName;
        this.roomName = roomName;
        this.course = course;
        this.trainer = trainer;
        this.studenten = studenten;
    }

    public String getBuildingName() {

        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String[] getStudenten() {
        return studenten;
    }

    public void setStudenten(String[] studenten) {

        this.studenten = studenten;
    }



}
