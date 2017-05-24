package io.github.tickcoder.ephotowall.Base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.github.tickcoder.ephotowall.Utils.LogUtil;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LogUtil.Log_Error(getClass().getSimpleName()+"-onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        LogUtil.Log_Error(getClass().getSimpleName()+"-onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        LogUtil.Log_Error(getClass().getSimpleName()+"-onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        LogUtil.Log_Error(getClass().getSimpleName()+"-onPause");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        LogUtil.Log_Error(getClass().getSimpleName()+"-onRestart");
        super.onRestart();
    }

    @Override
    public void onTrimMemory(int level) {
        LogUtil.Log_Error(getClass().getSimpleName()+"-onTrimMemory:"+level);
        super.onTrimMemory(level);
    }

    @Override
    public void onLowMemory() {
        LogUtil.Log_Error(getClass().getSimpleName()+"-onLowMemory");
        super.onLowMemory();
    }

    @Override
    protected void onDestroy() {
        LogUtil.Log_Error(getClass().getSimpleName()+"-onDestroy");
        super.onDestroy();
    }
}
