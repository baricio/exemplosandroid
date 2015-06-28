package exemplo4.marcelo.com.exemplo4.task;

import android.os.AsyncTask;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import exemplo4.marcelo.com.exemplo4.fw.Constant;
import exemplo4.marcelo.com.exemplo4.fw.Util;
import exemplo4.marcelo.com.exemplo4.to.TORede;

/**
 * Created by Administrador on 16/05/2015.
 */
public class RedeTask extends AsyncTask<String, Void, TORede>{

    @Override
    protected TORede doInBackground(String... params) {

        TORede t = null;

        try{
            URL url = new URL(Constant.API.OBTER_REDE);
            HttpURLConnection http = (HttpURLConnection)url.openConnection();
            http.setRequestMethod("GET");
            http.setRequestProperty("Content-Type", "text/plain; charset=utf-8");

            InputStream i = new BufferedInputStream(http.getInputStream());
            String result = Util.readString(i);
            t = TORede.createByJson(result, TORede.class);

        }catch (Exception e){
          t = null;
        }

        return t;
    }
}
