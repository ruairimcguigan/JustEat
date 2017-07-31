package eat.just.demo.tech.justeat.restaurant_selection.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import javax.inject.Inject;

import eat.just.demo.tech.justeat.R;
import eat.just.demo.tech.justeat.app.base.BaseActivity;
import eat.just.demo.tech.justeat.app.ui.di.AppComponent;

public class RestaurantsSelectionActivity extends BaseActivity <AppComponent, RestaurantSelectionPresenter>
        implements RestaurantSelectionView{

    @Inject
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setToolbar("Details", "content", R.drawable.ic_android_black_24dp, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RestaurantsSelectionActivity.this, "back clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void setupDependencies() {

        AppComponent injector = getInjector();
        injector.inject(this);

        // set presenter
        presenter = new RestaurantSelectionPresenter(this);

        injector.inject(presenter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
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
