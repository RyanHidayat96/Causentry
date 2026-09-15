package androidx.appcompat.widget;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes5.dex */
public interface FitWindowsViewGroup {

    /* JADX INFO: loaded from: classes4.dex */
    public interface OnFitSystemWindowsListener {
        void onFitSystemWindows(Rect rect);
    }

    void setOnFitSystemWindowsListener(OnFitSystemWindowsListener onFitSystemWindowsListener);
}
