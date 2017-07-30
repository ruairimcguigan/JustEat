package eat.just.demo.tech.justeat.app;

import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import butterknife.BindView;
import eat.just.demo.tech.justeat.R;

public abstract class BaseActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    protected Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public abstract void setupDependencies();

    public void setToolbar(String title, String contentDescription, @DrawableRes int backIcon, View.OnClickListener onBack) {
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(backIcon);
        toolbar.setNavigationContentDescription(contentDescription);
        toolbar.setNavigationOnClickListener(onBack);

        if (title == null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        } else {
            getSupportActionBar().setTitle(title);
        }
    }

    public void showProgress(){
    }

    public void hideProgress(){

    }

}
