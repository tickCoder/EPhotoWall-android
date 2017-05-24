package io.github.tickcoder.ephotowall.Utils;

import android.content.Context;

/**
 * Created by claris on 2017.05.24.Wednesday.
 */

public class ScreenUtil {

    /**
     * 根据手机的分辨率从 dp 转成为 px
     * @param context
     * @param dpValue
     * @return
     */
    public static float dp2px(Context context, float dpValue) {
        final float density = context.getResources().getDisplayMetrics().density;
        return (dpValue * density + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     * @param context
     * @param pxValue
     * @return
     */
    public static float px2dp(Context context, float pxValue) {
        final float density = context.getResources().getDisplayMetrics().density;
        return (pxValue / density + 0.5f);
    }
}
