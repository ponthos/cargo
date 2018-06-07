package cargo.jiayuan.jinrong.com.cargo.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import cargo.jiayuan.jinrong.com.cargo.mvp.contract.primary_cargoContract;
import cargo.jiayuan.jinrong.com.cargo.mvp.model.primary_cargoModel;


@Module
public class primary_cargoModule {
    private primary_cargoContract.View view;

    /**
     * 构建primary_cargoModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public primary_cargoModule(primary_cargoContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    primary_cargoContract.View provideprimary_cargoView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    primary_cargoContract.Model provideprimary_cargoModel(primary_cargoModel model) {
        return model;
    }
}