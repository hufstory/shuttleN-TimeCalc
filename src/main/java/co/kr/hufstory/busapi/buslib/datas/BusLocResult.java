package co.kr.hufstory.busapi.buslib.datas;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BusLocResult {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("bus_array")
    @Expose
    private List<Bus> busArray = null;
    @SerializedName("count")
    @Expose
    private Integer count;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Bus> getBusArray() {
        return busArray;
    }

    public void setBusArray(List<Bus> busArray) {
        this.busArray = busArray;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}