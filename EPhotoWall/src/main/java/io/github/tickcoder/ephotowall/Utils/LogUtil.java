package io.github.tickcoder.ephotowall.Utils;

import android.util.Log;

import io.github.tickcoder.ephotowall.BuildConfig;

/**
 * Created by claris on 2017.05.24.Wednesday.
 */

public class LogUtil {

    public static final String TICK_LOGTAG = "TICK";

    public static void Log_Verbose(String msg) {
        if (BuildConfig.TICK_ENABLE_DEBUG_LOG) {
            Log.v(TICK_LOGTAG, msg);
        }
    }

    public static void Log_Debug(String msg) {
        if (BuildConfig.TICK_ENABLE_DEBUG_LOG) {
            Log.d(TICK_LOGTAG, msg);
        }
    }

    public static void Log_Info(String msg) {
        if (BuildConfig.TICK_ENABLE_DEBUG_LOG) {
            Log.i(TICK_LOGTAG, msg);
        }
    }

    public static void Log_Warn(String msg) {
        if (BuildConfig.TICK_ENABLE_DEBUG_LOG) {
            Log.w(TICK_LOGTAG, msg);
        }
    }

    public static void Log_Error(String msg) {
        if (BuildConfig.TICK_ENABLE_DEBUG_LOG) {
            Log.e(TICK_LOGTAG, msg);
        }
    }
}
