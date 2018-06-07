package cargo.jiayuan.jinrong.com.cargo.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;

import cargo.jiayuan.jinrong.com.cargo.di.component.Daggerprimary_cargoComponent;
import cargo.jiayuan.jinrong.com.cargo.di.module.primary_cargoModule;
import cargo.jiayuan.jinrong.com.cargo.mvp.contract.primary_cargoContract;
import cargo.jiayuan.jinrong.com.cargo.mvp.presenter.primary_cargoPresenter;

import cargo.jiayuan.jinrong.com.cargo.R;


import static com.jess.arms.utils.Preconditions.checkNotNull;


public class primary_cargoActivity extends BaseActivity<primary_cargoPresenter> implements primary_cargoContract.View {

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        Daggerprimary_cargoComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .primary_cargoModule(new primary_cargoModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_primary_cargo; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(@NonNull String message) {
        checkNotNull(message);
        ArmsUtils.snackbarText(message);
    }

    @Override
    public void launchActivity(@NonNull Intent intent) {
        checkNotNull(intent);
        ArmsUtils.startActivity(intent);
    }

    @Override
    public void killMyself() {
        finish();
    }
}
