package net.sabamiso.android.camera2opencvtest;

import android.util.Log;

public class FPSCounter {
    int count;
    int max_count = 100;
    long st;

    String name;

    public FPSCounter() {
        name = "FPSCounter";
        clear();
    }

    public void clear() {
        count = 0;
        st = System.currentTimeMillis();
    }

    public void check() {
        count ++;
        if (count >= max_count) {
            float diff = (float)(System.currentTimeMillis() - st) / 1000.0f; // ms → s
            float t = diff / max_count;
            float fps = 1.0f / t;

            Log.d(name, "t=" + t + ", fps=" + fps);

            clear();
        }
    }
}
