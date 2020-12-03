package ghanmi.com.OOP_CampusOrganisation;

public class Scool {
    private  String scoolName;
    private  int rommNum;

     public Scool(String scoolName, int rommNum) {
        this.scoolName = scoolName;
        this.rommNum = rommNum;
    }

    public String getScoolName() {
        return scoolName;
    }

    public int getRommNum() {
        return rommNum;
    }

    public void setScoolName(String scoolName) {
        this.scoolName = scoolName;
    }

    public void setRommNum(int rommNum) {
        this.rommNum = rommNum;
    }

    public Scool(){

    }

    @Override
    public String toString() {
        return "\n"+"Schule       :"+ scoolName + '\n' +
                "Anzahl lernräume :" + rommNum;
    }
}
