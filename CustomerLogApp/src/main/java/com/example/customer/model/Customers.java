package com.example.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customers 
{
    @Id
    @Column
    private String id;
    @Column
    private String name;
    @Column
    private String date;
    @Column
    private String time;
    @Column
    private String logType;
    
    public String getId() {
	    return id;
    }
    public void setId(String id) {
	    this.id = id;
    }
    public String getName() {
	    return name;
    }
    public void setName(String name) {
	    this.name = name;
     }
    public String getDate() {
	    return date;
    }
    public void setDate(String date) {
	    this.date = date;
    }
    public String getTime() {
	    return time;
    }
    public void setTime(String time) {
	   this.time = time;
    }
    public String getLogType() {
	   return logType;
    }
    public void setLogType(String logType) {
	   this.logType = logType;
    }
}
