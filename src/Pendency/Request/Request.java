package Pendency;

import java.util.ArrayList;

public class Request {
    int id;
    int pos;

    ArrayList<String> tags;

    public ArrayList<String> getTags() {
        return tags;
    }



    public Request(int id, ArrayList<String> tags) {
        this.id = id;
        this.pos = pos;
        this.tags = tags;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
}
