package eat.just.demo.tech.justeat.app;

import javax.inject.Singleton;

import dagger.Component;
import eat.just.demo.tech.core_lib.restaurant.details.RestaurantDetailsPresenter;
import eat.just.demo.tech.core_lib.restaurant.selection.RestaurantSelectionPresenter;
import eat.just.demo.tech.justeat.restaurant_details.ui.RestaurantDetailsActivity;
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
