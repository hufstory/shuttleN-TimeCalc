package co.kr.hufstory.busapi;

import co.kr.hufstory.busapi.buslib.HUFSBus;
import com.google.gson.Gson;
import io.javalin.Javalin;

public class Main {
    public static void main(String args[]) {
        Javalin app = Javalin.create().start(7000);
        app.get("/", ctx -> ctx.result(new Gson().toJson(HUFSBus.getInstance().getApi().getBusLoc().execute().body())));
    }
}