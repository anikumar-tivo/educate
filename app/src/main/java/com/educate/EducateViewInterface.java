package com.educate;

import android.app.Activity;
import android.content.Context;
import android.webkit.JavascriptInterface;

public class EducateViewInterface {
    private Context context;
    private Activity activity;
    public EducateViewInterface(Context context, Activity activity) {
        this.context = context;
        this.activity = activity;
    }

    @JavascriptInterface
    public void stop() {
        activity.finish();
    }
}
