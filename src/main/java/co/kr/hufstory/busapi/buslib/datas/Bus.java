package co.kr.hufstory.busapi.buslib.datas;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Bus {

    @SerializedName("bus_number")
    @Expose
    private String busNumber;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("direction")
    @Expose
    private String direction;
    @SerializedName("direction_flow")
    @Expose
    private List<Object> directionFlow = null;
    @SerializedName("bus_stop")
    @Expose
    private Integer busStop;
    @SerializedName("distance")
    @Expose
    private Integer distance;
    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("to_top")
    @Expose
    private Integer toTop;
    @SerializedName("is_operating")
    @Expose
    private Integer isOperating;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lng")
    @Expose
    private String lng;
    @SerializedName("is_stop_now")
    @Expose
    private Integer isStopNow;
    @SerializedName("recent_data_day")
    @Expose
    private Integer recentDataDay;
    @SerializedName("recent_data_date")
    @Expose
    private String recentDataDate;

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public List<Object> getDirectionFlow() {
        return directionFlow;
    }

    public void setDirectionFlow(List<Object> directionFlow) {
        this.directionFlow = directionFlow;
    }

    public Integer getBusStop() {
        return busStop;
    }

    public void setBusStop(Integer busStop) {
        this.busStop = busStop;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getToTop() {
        return toTop;
    }

    public void setToTop(Integer toTop) {
        this.toTop = toTop;
    }

    public Integer getIsOperating() {
        return isOperating;
    }

    public void setIsOperating(Integer isOperating) {
        this.isOperating = isOperating;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public Integer getIsStopNow() {
        return isStopNow;
    }

    public void setIsStopNow(Integer isStopNow) {
        this.isStopNow = isStopNow;
    }

    public Integer getRecentDataDay() {
        return recentDataDay;
    }

    public void setRecentDataDay(Integer recentDataDay) {
        this.recentDataDay = recentDataDay;
    }

    public String getRecentDataDate() {
        return recentDataDate;
    }

    public void setRecentDataDate(String recentDataDate) {
        this.recentDataDate = recentDataDate;
    }

}