package com.google.firebase.codelab.friendlychat;

import android.app.Activity;
import android.util.DisplayMetrics;

/**
 * Created by Gold on 2017-06-12.
 */

public class DeviceUtils {

    public static int getScreenHeight(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        return displayMetrics.heightPixels;
    }

}
