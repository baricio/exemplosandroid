package com.baricio.instagramfake.task;

import android.os.AsyncTask;

import com.baricio.instagramfake.fw.Constant;
import com.baricio.instagramfake.fw.Util;
import com.baricio.instagramfake.to.TORede;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * Created by Fabricio on 21/06/2015.
 */
public class RedeTask extends AsyncTask<String, Void, TORede> {

    @Override
    protected TORede doInBackground(String... params) {

        TORede t = null;

        try {

            URL url = new URL(Constant.API.OBTER_REDE);
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            http.setRequestMethod("GET");
            http.setRequestProperty("Content-Type", "text/plain; charset=utf-8");

            InputStream i = new BufferedInputStream(http.getInputStream());
            String result = Util.readString(i);
            t = TORede.createByJson(result, TORede.class);

        } catch (Exception e) {
            t = null;
        }

        return t;
    }
}
