package co.kr.hufstory.busapi.buslib;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HUFSBus {
    private static HUFSBus ourInstance = new HUFSBus();
    private HUFSBusApi api;

    public static HUFSBus getInstance() {
        return ourInstance;
    }

    private HUFSBus() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://bis.hufs.ac.kr")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(HUFSBusApi.class);
    }

    public HUFSBusApi getApi() {
        return api;
    }
}
