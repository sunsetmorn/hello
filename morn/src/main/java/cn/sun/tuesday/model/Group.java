package cn.sun.tuesday.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Group implements Serializable {

    private String groupName;
    private String groupIntroduce;
    private String createTime;
    private User groupOwner;
    private List<User> users = new ArrayList<>();

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupIntroduce() {
        return groupIntroduce;
    }

    public void setGroupIntroduce(String groupIntroduce) {
        this.groupIntroduce = groupIntroduce;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public User getGroupOwner() {
        return groupOwner;
    }

    public void setGroupOwner(User groupOwner) {
        this.groupOwner = groupOwner;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", groupIntroduce='" + groupIntroduce + '\'' +
                ", createTime='" + createTime + '\'' +
                ", groupOwner=" + groupOwner +
                ", users=" + users +
                '}';
    }
}
