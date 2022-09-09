package Pendency;

import java.util.ArrayList;

public class SearchRequest {
    ArrayList<String> tags;
    int pos;


    public ArrayList<String> getTags() {
        return tags;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public SearchRequest(ArrayList<String> tags) {
        this.tags = tags;
    }
}
