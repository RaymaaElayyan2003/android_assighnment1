package com.example.mtodo;

public class TasksList {
    private String topic;
    private String briefDesc;//a description
    private boolean isALlDone;

    public TasksList() {
    }

    public TasksList(String topic, String briefDesc) {
        this.briefDesc = briefDesc;
        this.topic = topic;

    }

    public String getTopic() {
        return topic;
    }

    public String getBriefDesc() {
        return briefDesc;
    }

    public boolean isALlDone() {
        return true;

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

}


