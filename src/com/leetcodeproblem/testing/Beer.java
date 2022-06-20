package com.leetcodeproblem.testing;

import java.util.UUID;

public class Beer {


    private UUID id;
    private String bearName;
    private String bearStyle;
    private long upc;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getBearName() {
        return bearName;
    }

    public void setBearName(String bearName) {
        this.bearName = bearName;
    }

    public String getBearStyle() {
        return bearStyle;
    }

    public void setBearStyle(String bearStyle) {
        this.bearStyle = bearStyle;
    }

    public long getUpc() {
        return upc;
    }

    public void setUpc(long upc) {
        this.upc = upc;
    }

    public Beer(UUID id, String bearName, String bearStyle, long upc) {
        this.id = id;
        this.bearName = bearName;
        this.bearStyle = bearStyle;
        this.upc = upc;
    }

    public Beer() {

    }

    @Override
    public String toString() {
        return "Beer{" +
                "id=" + id +
                ", bearName='" + bearName + '\'' +
                ", bearStyle='" + bearStyle + '\'' +
                ", upc=" + upc +
                '}';
    }


}
