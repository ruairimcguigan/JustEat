package eat.just.demo.tech.justeat.app;

import android.app.Application;

import timber.log.Timber;

import static eat.just.demo.tech.justeat.app.util.Constants.SERVICE_DEPENDENCY_INJECTOR;

public class JustEatApplication extends Application {

    private static JustEatApplication app;
    private AppComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();
//        initLeakCanary();
        initDagger();
        initTimber();
        initStrictMode();
    }

//    private void initLeakCanary() {
//        if (LeakCanary.isInAnalyzerProcess(this)) {
//
//            // This process is dedicated to LeakCanary for heap analysis.
//            // You should not init your app in this process.
//            return;
//        }
//        LeakCanary.install(this);
//    }

    private void initDagger() {
        Timber.d("Pre-Set up object graph");

        injector = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();

        injector.inject(this);

        Timber.d("Post-Set up object graph");
    }

    public AppComponent getInjector(){
        return injector;
    }

    public static JustEatApplication getApp() {
        return app;
    }

    private void initTimber() {
        Timber.plant(new Timber.DebugTree());
    }

    // TODO: 31/07/2017 set up strict mode
    private void initStrictMode() {

    }

    @Override
    public Object getSystemService(String name) {
        if (SERVICE_DEPENDENCY_INJECTOR.equals(name)) {
            return injector;
        } else {
            return super.getSystemService(name);
        }
    }
}

