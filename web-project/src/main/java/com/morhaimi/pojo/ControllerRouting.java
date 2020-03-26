package com.morhaimi.pojo;

public class ControllerRouting {
    private Integer id;

    private String conerName;

    private Integer parentNode;

    private String rgConerName;

    private Integer rgNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConerName() {
        return conerName;
    }

    public void setConerName(String conerName) {
        this.conerName = conerName == null ? null : conerName.trim();
    }

    public Integer getParentNode() {
        return parentNode;
    }

    public void setParentNode(Integer parentNode) {
        this.parentNode = parentNode;
    }

    public String getRgConerName() {
        return rgConerName;
    }

    public void setRgConerName(String rgConerName) {
        this.rgConerName = rgConerName == null ? null : rgConerName.trim();
    }

    public Integer getRgNum() {
        return rgNum;
    }

    public void setRgNum(Integer rgNum) {
        this.rgNum = rgNum;
    }
}