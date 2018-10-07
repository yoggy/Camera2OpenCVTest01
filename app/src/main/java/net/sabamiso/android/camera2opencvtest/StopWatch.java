package net.sabamiso.android.camera2opencvtest;

import android.util.Log;

class StopWatch {
    long total_t;
    long st;
    long count;

    public StopWatch() {
    }

    public long getCount() {
        return count;
    }

    public void clear() {
        total_t = 0;
        count = 0;
    }

    public void start() {
        st = System.currentTimeMillis();
    }

    public void stop() {
        long diff = System.currentTimeMillis() - st;
        total_t += diff;
        count ++;

        if (count >= 100) {
            float avg_t = total_t / (float)count / 1000.0f;
            Log.d("StopWatch", "avg_t=" + avg_t);
            clear();
        }
    }
}
