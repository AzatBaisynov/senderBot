package org.example.repo;

public class Request {
    private String id;
    private String msg;
    private String time;

    public Request(String id, String msg, String time) {
        this.id = id;
        this.msg = msg;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return  "■ id: " + id + " ■■■■ req: " + msg + " ■■■■ time: " + time + " ■";
    }
}
