/*
 * Copyright © Yan Zhenjie. All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lc.core.utils;

import android.support.annotation.StringRes;
import android.view.View;
import android.widget.Toast;

import com.lc.core.base.BaseApp;


/*
 * author ls
 * created at 2017/9/19 0019 10:46
 * be your self
 * Log.e("666","!<-///->!"+);
 * Toast.makeText(this, "不支持输入Emoji表情符号", Toast.LENGTH_SHORT).show();
 */
public class ToastUtils {

    public static void showL(CharSequence msg) {
        Toast.makeText(BaseApp.getInstance(), msg, Toast.LENGTH_LONG).show();
    }

    public static void showL(@StringRes int stringId) {
        Toast.makeText(BaseApp.getInstance(), stringId, Toast.LENGTH_LONG).show();
    }

    public static void showL(View view, CharSequence msg) {
        showL(msg);
    }

    public static void showL(View view, @StringRes int stringId) {
        showL(stringId);
    }

    public static void showS(CharSequence msg) {
        Toast.makeText(BaseApp.getInstance(), msg, Toast.LENGTH_SHORT).show();
    }

    public static void showS(@StringRes int stringId) {
        Toast.makeText(BaseApp.getInstance(), stringId, Toast.LENGTH_SHORT).show();
    }

    public static void showS(View view, CharSequence msg) {
        showS(msg);
    }

    public static void showS(View view, @StringRes int stringId) {
        showS(stringId);
    }

}
