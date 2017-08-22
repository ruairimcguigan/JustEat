package eat.just.demo.tech.justeat.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import eat.just.demo.tech.justeat.app.util.Constants;
import okhttp3.HttpUrl;

/**
 * This module provides global UI related dependencies.
 */

@Module
public class AppModule {

    private JustEatApplication application;

    public AppModule(JustEatApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Context provideContext(){
        return application;
    }

    @Provides
    @Singleton
    public SharedPreferences provideSharedPreferences(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Provides
    @Singleton
    HttpUrl provideEndpoint() {
        return HttpUrl.parse(Constants.BASE_URL);
    }

}
