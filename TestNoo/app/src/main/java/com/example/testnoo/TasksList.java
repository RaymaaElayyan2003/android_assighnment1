package com.example.testnoo;
public class TasksList {
    private String topic;
    private String briefDesc;//a description
    private boolean isALlDone;


    public  TasksList(String topicc){
        this.topic=topicc;
    }

//    public TasksList(String topic, String briefDesc) {
//        this.briefDesc = briefDesc;
//        this.topic = topic;
//
//    }
//    public TasksList(String topic, String briefDesc , boolean isALlDone) {
//        this.briefDesc = briefDesc;
//        this.topic = topic;
//        this.isALlDone=isALlDone;
//
//    }

//    public TasksList(String newTask) {
//        this.topic = newTask;
//        this.isALlDone=false;
//    }

    public String getTopic() {
        return topic;
    }

    public String getBriefDesc() {
        return briefDesc;
    }

//    public boolean isALlDone() {
//        return true;
//
//    }
    public boolean isALlDone() {
        return isALlDone;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setdesc(String Decription) {
        this.briefDesc = Decription;
    }

    public void setMyBoolean(boolean myBoolean) {
        this.isALlDone = myBoolean;
    }
    public String toString() {
        return topic;
    }
//   // public String toString() {
//        return topic+briefDesc+isALlDone;
//    }
}



