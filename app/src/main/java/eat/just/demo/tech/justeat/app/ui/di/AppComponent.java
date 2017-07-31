package eat.just.demo.tech.justeat.app.ui.di;

import javax.inject.Singleton;

import dagger.Component;
import eat.just.demo.tech.justeat.app.JustEatApplication;
import eat.just.demo.tech.justeat.restaurant_details.ui.RestaurantDetailsActivity;
import eat.just.demo.tech.justeat.restaurant_details.ui.RestaurantDetailsPresenter;
import eat.just.demo.tech.justeat.restaurant_selection.ui.RestaurantSelectionPresenter;
import eat.just.demo.tech.justeat.restaurant_selection.ui.RestaurantsSelectionActivity;

/**
 * defines the location we'd like to inject components
 */
@Singleton
@Component(modules = { AppModule.class })
public interface AppComponent {

    void inject(JustEatApplication application);

    void inject(RestaurantsSelectionActivity activity);

    void inject(RestaurantSelectionPresenter presenter);

    void inject(RestaurantDetailsActivity activity);

    void inject(RestaurantDetailsPresenter presenter);

}
