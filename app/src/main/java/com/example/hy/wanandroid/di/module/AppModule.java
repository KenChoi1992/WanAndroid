package com.example.hy.wanandroid.di.module;

import com.example.hy.wanandroid.config.App;
import com.example.hy.wanandroid.config.BaseUrl;
import com.example.hy.wanandroid.network.gson.CustomGsonConverterFactory;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/**
 * App的module
 * Created by 陈健宇 at 2018/10/26
 */
@Module
public class AppModule {

    private final App mApp;

    public AppModule(App app) {
        mApp = app;
    }

    @Provides
    @Singleton
    public App provideApp(){
        return mApp;
    }

    @Provides
    @Singleton
    public Retrofit provideRetrofit(){
        return new Retrofit.Builder()
                .baseUrl(BaseUrl.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(CustomGsonConverterFactory.create())
                .build();
    }

}