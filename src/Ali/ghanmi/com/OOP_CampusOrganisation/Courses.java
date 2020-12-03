package ghanmi.com.OOP_CampusOrganisation;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Courses {
    private String coursDesignation;
    private String cousDiscreption;
    private int duration;
    private LocalDate startDate;
    private LocalDate endDate;
    private String coursDays;
    private LocalTime startTime;
    private LocalTime endTime;
    private int maxAttendee;

    public Courses(String coursDesignation, String cousDiscreption, int duration, LocalDate startDate, LocalDate endDate, String coursDays,
                   LocalTime startTime, LocalTime endTime, int maxAttendee) {
        this.coursDesignation = coursDesignation;
        this.cousDiscreption = cousDiscreption;
        this.duration = duration;
        this.startDate = startDate;
        this.endDate = endDate;
        this.coursDays = coursDays;
        this.startTime = startTime;
        this.endTime = endTime;
        this.maxAttendee = maxAttendee;
    }

    public void setCoursDesignation(String coursDesignation) {
        this.coursDesignation = coursDesignation;
    }

    public void setCousDiscreption(String cousDiscreption) {
        this.cousDiscreption = cousDiscreption;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setStartDate( int day, int month,int year) {
        this.startDate = LocalDate.of(year, month, day);
    }

    public void setEndDate(int day, int month,int year) {
        this.endDate = LocalDate.of(year, month, day);
    }

    public void setCoursDays(String coursDays) {
        this.coursDays = coursDays;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void setMaxAttendee(int maxAttendee) {
        this.maxAttendee = maxAttendee;
    }

    public String getCoursDesignation() {
        return coursDesignation;
    }

    public String getCousDiscreption() {
        return cousDiscreption;
    }

    public int getDuration() {
        return duration;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getCoursDays() {
        return coursDays;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public int getMaxAttendee() {
        return maxAttendee;
    }

    public Courses() {

    }

    @Override
    public String toString() {
        return "\n"+"Courses      :" + coursDesignation + "\n" +
                "Kurs Beschreibung:" + cousDiscreption + "\n" +
                "Dauer            :" + duration +"Monate"+ "\n" +
                "Start Datum      :" + startDate +"\n" +
                "End datum        :" + endDate +"\n" +
                "Kurstage         :" + coursDays +"\n" +
                "Dienstag und Donnerstag: \nvon " +startTime +"  bis " + endTime +"\n" +
                "Samstag: \nvon " +startTime +"  bis " + endTime +"\n" +
                "Maximal Teilnehmer:" + maxAttendee;
    }
}