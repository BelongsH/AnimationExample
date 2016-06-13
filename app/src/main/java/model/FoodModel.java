package model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by liuhuiliang on 16/6/13.
 */
public class FoodModel implements Parcelable {


    private String name;

    private int path;

    private String description;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public FoodModel(String name, int path, String description) {
        this.name = name;
        this.path = path;
        this.description = description;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.path);
        dest.writeString(this.description);
    }

    public FoodModel() {
    }

    protected FoodModel(Parcel in) {
        this.name = in.readString();
        this.path = in.readInt();
        this.description = in.readString();
    }

    public static final Parcelable.Creator<FoodModel> CREATOR = new Parcelable.Creator<FoodModel>() {
        @Override
        public FoodModel createFromParcel(Parcel source) {
            return new FoodModel(source);
        }

        @Override
        public FoodModel[] newArray(int size) {
            return new FoodModel[size];
        }
    };
}
