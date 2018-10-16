package com.lc.core.base;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Toast;

/**
 * Author:Edward
 * Date:2018/3/21
 * Description:
 */

public abstract class BaseActivity extends AppCompatActivity {

    private Toast toast;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setFullScreen();
        keepScreenOn();
        setLandscape(true);
        super.onCreate(savedInstanceState);
        setContentView(getActLayoutId());

    }

    /**
     * 获取activity布局.
     */
    @LayoutRes
    protected abstract int getActLayoutId();


    /**
     * 全屏
     */
    protected void setFullScreen() {
        int flagFullscreen = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(flagFullscreen, flagFullscreen);
    }

    /**
     * 屏幕常亮
     */
    protected void keepScreenOn() {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    /**
     * 固定横竖屏
     */
    protected void setLandscape(boolean isLandscape) {
        int orientation = isLandscape ? ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE : ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
        setRequestedOrientation(orientation);
    }

    /**
     * Toast
     */
    public void showToast(@StringRes int strId) {
        if (toast == null) {
            toast = Toast.makeText(this, strId, Toast.LENGTH_SHORT);
        } else {
            toast.setText(strId);
        }
        toast.show();
    }

    public void showToast(String str) {
        if (toast == null) {
            toast = Toast.makeText(this, str, Toast.LENGTH_SHORT);
        } else {
            toast.setText(str);
        }
        toast.show();
    }

}
