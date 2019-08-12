package co.kr.hufstory.busapi.buslib;

import co.kr.hufstory.busapi.buslib.datas.BusLocResult;
import retrofit2.Call;
import retrofit2.http.GET;

public interface HUFSBusApi {
    @GET("getBusLoc")
    Call<BusLocResult> getBusLoc();
}
