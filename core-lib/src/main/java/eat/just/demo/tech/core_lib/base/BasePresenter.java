package eat.just.demo.tech.core_lib.base;

import eat.just.demo.tech.core_lib.BasePresenterView;

public abstract class BasePresenter implements BasePresenterView {

    public final void onStart() {

    }

    public final void onResume() {

    }

    public final void onStop() {

    }

    public abstract void onNoConnectivity();

    public abstract void onTimeOut();

}
