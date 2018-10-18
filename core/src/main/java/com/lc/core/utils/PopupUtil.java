package com.lc.core.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.lc.core.R;


/**
 * Created by Administrator on 2018/6/25.
 */

public class PopupUtil {
    private static volatile PopupUtil instance = null;
    private Context context;
    private Activity activity;
    private View view;
    private TextView tvPopupTitle;
    private TextView btPopupOk;
    private TextView btPopupNo;
    private PopupWindow popupWindow;

    public PopupUtil() {

    }

    private void initPopup() {
        popupWindow = new PopupWindow(view, 500, 300);
        popupWindow.setTouchable(true);
        popupWindow.setFocusable(true);

        // 产生背景变暗效果
        WindowManager.LayoutParams lp = activity.getWindow()
                .getAttributes();
        lp.alpha = 0.4f;
        activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        activity.getWindow().setAttributes(lp);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0x00FFFFFF));
        popupWindow.setOutsideTouchable(true);
        popupWindow.update();
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {

            // 在dismiss中恢复透明度
            public void onDismiss() {
                WindowManager.LayoutParams lp = activity.getWindow()
                        .getAttributes();
                lp.alpha = 1f;
                activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
                activity.getWindow().setAttributes(lp);
            }
        });
    }

    public static PopupUtil getInstance() {
        if (instance == null) {
            synchronized (PopupUtil.class) {
                if (instance == null) {
                    instance = new PopupUtil();
                }
            }
        }
        return instance;
    }

    public void showPopup(Activity activity, Context context, View viewByShow, String title, String ok, String no, final onPopupListener listener) {
        this.activity = activity;
        this.context = context;
        view = LayoutInflater.from(context).inflate(R.layout.popup_review_layout, null);
        tvPopupTitle = view.findViewById(R.id.tvPopupTitle);
        btPopupOk = view.findViewById(R.id.btPopupOk);
        btPopupNo = view.findViewById(R.id.btPopupNo);
        tvPopupTitle.setText(TextUtils.isEmpty(title) ? "" : title);
        btPopupOk.setText(TextUtils.isEmpty(title) ? "" : ok);
        btPopupNo.setText(TextUtils.isEmpty(title) ? "" : no);
        btPopupOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dissMiss();
                listener.onOk(v);
            }
        });

        btPopupNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dissMiss();
                listener.onNo(v);
            }
        });

        initPopup();
        popupWindow.showAtLocation(viewByShow, Gravity.CENTER, 0, 0);

    }

    public interface onPopupListener {
        void onOk(View v);

        void onNo(View v);
    }

    private void dissMiss() {
        if (null != popupWindow && popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
    }
}
