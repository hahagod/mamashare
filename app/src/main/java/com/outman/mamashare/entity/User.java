package com.outman.mamashare.entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 用户实体类
 */
public class User implements Parcelable {

    /**
     * babyBirthday :
     * babyGender :
     * backgroundImg :
     * userID : 12296568
     * mamRoleName :
     * headIcon : 1.jpg
     * nickname : song
     */

    private String babyBirthday;
    private String babyGender;
    private String backgroundImg;
    private int userID;
    private String mamRoleName;
    private String headIcon;
    private String nickname;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.babyBirthday);
        dest.writeString(this.babyGender);
        dest.writeString(this.backgroundImg);
        dest.writeInt(this.userID);
        dest.writeString(this.mamRoleName);
        dest.writeString(this.headIcon);
        dest.writeString(this.nickname);
    }

    public User() {
    }

    protected User(Parcel in) {
        this.babyBirthday = in.readString();
        this.babyGender = in.readString();
        this.backgroundImg = in.readString();
        this.userID = in.readInt();
        this.mamRoleName = in.readString();
        this.headIcon = in.readString();
        this.nickname = in.readString();
    }

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getBabyBirthday() {
        return babyBirthday;
    }

    public void setBabyBirthday(String babyBirthday) {
        this.babyBirthday = babyBirthday;
    }

    public String getBabyGender() {
        return babyGender;
    }

    public void setBabyGender(String babyGender) {
        this.babyGender = babyGender;
    }

    public String getBackgroundImg() {
        return backgroundImg;
    }

    public void setBackgroundImg(String backgroundImg) {
        this.backgroundImg = backgroundImg;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getMamRoleName() {
        return mamRoleName;
    }

    public void setMamRoleName(String mamRoleName) {
        this.mamRoleName = mamRoleName;
    }

    public String getHeadIcon() {
        return headIcon;
    }

    public void setHeadIcon(String headIcon) {
        this.headIcon = headIcon;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

}
