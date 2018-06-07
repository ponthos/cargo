package cargo.jiayuan.jinrong.com.cargo.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import cargo.jiayuan.jinrong.com.cargo.di.module.primary_cargoModule;

import com.jess.arms.di.scope.ActivityScope;

import cargo.jiayuan.jinrong.com.cargo.mvp.ui.activity.primary_cargoActivity;

@ActivityScope
@Component(modules = primary_cargoModule.class, dependencies = AppComponent.class)
public interface primary_cargoComponent {
    void inject(primary_cargoActivity activity);
}