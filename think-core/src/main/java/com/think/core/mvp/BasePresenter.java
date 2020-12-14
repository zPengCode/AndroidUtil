package com.think.core.mvp;

import android.content.Context;

import java.lang.ref.WeakReference;

public abstract class BasePresenter<V,M> {

    private WeakReference<V> mContextRef;

    private M model;

    public void attach(V view){
        mContextRef = new WeakReference<>(view);
        model = createModel();
    }

    protected abstract M createModel();

    public void detach(){
        if(mContextRef != null){
            mContextRef.clear();
        }
    }
}
