package com.nology.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String courseName;
    private String location;
    private double price;
    private String duration;
    private String summary;

    public Course(String courseName, String location, double price, String duration, String summary) {
        this.courseName = courseName;
        this.location = location;
        this.price = price;
        this.duration = duration;
        this.summary = summary;
    }

    public Course() {

    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }

    public String getDuration() {
        return duration;
    }

    public String getSummary() {
        return summary;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id:" + id +
                " courseName:" + courseName +
                " location:" + location +
                " price:" + price +
                "duration:" + duration +
                "summary:" + summary +
                '}';
    }
}
