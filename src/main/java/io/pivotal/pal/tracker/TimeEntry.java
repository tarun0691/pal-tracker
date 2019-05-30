package io.pivotal.pal.tracker;

import java.time.LocalDate;

public class TimeEntry {

    private long id;
    private long projectId;
    private long userId;
    private LocalDate date;
    private int hours;

    void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    void setUserId(long userId) {
        this.userId = userId;
    }

    void setDate(LocalDate date) {
        this.date = date;
    }

    void setHours(int hours) {
        this.hours = hours;
    }

    long getProjectId() {
        return projectId;
    }

    long getUserId() {
        return userId;
    }

    LocalDate getDate() {
        return date;
    }

    int getHours() {
        return hours;
    }

    void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals (Object o) {
        if (!(o instanceof TimeEntry)) {
            return false;
        }
        TimeEntry other = (TimeEntry)o;
        return getId()==(other.getId()) &&
                getProjectId()==(other.getProjectId()) &&
                getUserId()==(other.getUserId())&&
                getDate().equals(other.getDate())&&
                getHours()==(other.getHours());
    }


    public TimeEntry(long projectId, long userId, LocalDate date, int hours) {
        this.projectId = projectId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
    }

    public TimeEntry(long id, long projectId, long userId, LocalDate date, int hours) {
        this.id = id;
        this.projectId = projectId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
    }

    public TimeEntry() {

    }

    public long getId() {
        return id;
    }
}
