package com.zhailau.springproj.Data;

import jakarta.persistence.*;

@Entity
@Table
public class Habits {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String habitName;
    @Column
    private String dayData;
    @Column
    private String color;

//    public Habits(long id, String habitName, String dayData, String color) {
//        this.id = id;
//        this.habitName = habitName;
//        this.dayData = dayData;
//        this.color = color;
//    }
//
//    public Habits(String habitName, String dayData, String color) {
//        this.habitName = habitName;
//        this.dayData = dayData;
//        this.color = color;
//    }
//
//    public Habits() {
//
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHabitName() {
        return habitName;
    }

    public void setHabitName(String habitName) {
        this.habitName = habitName;
    }

    public String getDayData() {
        return dayData;
    }

    public void setDayData(String dayData) {
        this.dayData = dayData;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
