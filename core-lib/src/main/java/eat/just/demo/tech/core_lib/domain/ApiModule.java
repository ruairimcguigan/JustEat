package eat.just.demo.tech.core_lib.domain;

import eat.just.demo.tech.core_lib.domain.model.Restaurant;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by c0249298 on 13/08/2017.
 */

public interface ApiModule {

    String POST_CODE = "postCode";
    String CUISINE = "cuisine";
    String RESTAURANT_NAME = "restaurantName";

    @GET("restaurants/v3")
    Observable<Restaurant> findRestaurantsByPostcode(
            @Query(POST_CODE) String postCodeQuery,
            @Query(CUISINE) String cuisine,
            @Query(RESTAURANT_NAME) String name;
    );
}
