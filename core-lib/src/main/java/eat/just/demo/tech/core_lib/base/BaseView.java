package eat.just.demo.tech.core_lib.base;

import android.content.Context;

/**
 * Base view
 */
public interface BaseView {

    Context getContext();

    void showNoConnectivityMessage();

    void showTimeOutMessage();

    void showProgress();

    void hideProgress();

}
