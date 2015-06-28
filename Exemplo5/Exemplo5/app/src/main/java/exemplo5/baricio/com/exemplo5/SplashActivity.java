package exemplo5.baricio.com.exemplo5;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;


import exemplo5.baricio.com.exemplo5.fw.SharedPreferenceHelper;


public class SplashActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        String user = SharedPreferenceHelper.read(this,"user_preference","user",null);

        if(user == null){
            abreLogin();
        }else{
            abreHome();
        }

    }

    private void abreHome() {
        Handler h = new Handler();

        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, HomeActivity.class);
                startActivity(i);
                finish();
            }
        },2000);
    }

    private void abreLogin() {
        Handler h = new Handler();

        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        },2000);
    }

}
