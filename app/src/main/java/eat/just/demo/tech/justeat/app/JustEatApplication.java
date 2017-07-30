package eat.just.demo.tech.justeat.app;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by c0249298 on 30/07/2017.
 */

public class JustEatApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
    }
}
