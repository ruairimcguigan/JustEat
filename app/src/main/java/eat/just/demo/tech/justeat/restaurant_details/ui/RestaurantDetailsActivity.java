package eat.just.demo.tech.justeat.restaurant_details.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import javax.inject.Inject;

import eat.just.demo.tech.justeat.R;
import eat.just.demo.tech.justeat.app.base.BaseActivity;
import eat.just.demo.tech.justeat.app.ui.module.AppComponent;

public class RestaurantDetailsActivity extends BaseActivity<AppComponent, RestaurantDetailsPresenter>
        implements RestaurantDetailsView{

    @Inject
    SharedPreferences prefs;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setToolbar("Details", "content", R.drawable.ic_android_black_24dp, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RestaurantDetailsActivity.this, "back clicked", Toast.LENGTH_SHORT).show();
            }
        });
        
    }

    @Override
    public void setupDependencies() {

        AppComponent injector = getInjector();
        injector.inject(this);

        presenter = new RestaurantDetailsPresenter(this);
        injector.inject(presenter);
    }

    @Override
    public void showNoConnectivityMessage() {

    }

    @Override
    public void showTimeOutMessage() {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }
}
