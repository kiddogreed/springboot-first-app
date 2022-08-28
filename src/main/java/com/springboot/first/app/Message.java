package com.springboot.first.app;

public class Message {

  private String description;
  private String comment;

  //constructor
  public Message(String description, String comment) {
    this.description = description;
    this.comment = comment;
  }

  //getter and setter
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }

  
  
}
