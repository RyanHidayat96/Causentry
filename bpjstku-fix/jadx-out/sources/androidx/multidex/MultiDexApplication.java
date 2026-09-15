package androidx.multidex;

import android.app.Application;
import android.content.Context;
import defpackage.ViewPortBuilder;
import defpackage.computeCropRectFromAspectRatio;

/* JADX INFO: loaded from: classes.dex */
public class MultiDexApplication extends Application {
    public MultiDexApplication() {
        if (computeCropRectFromAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
        }
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (computeCropRectFromAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            super.attachBaseContext(context);
        } else {
            super.attachBaseContext(context);
            MultiDex.install(this);
        }
    }

    @Override // android.app.Application
    public /* synthetic */ void onCreate() {
        if (computeCropRectFromAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            super.onCreate();
        } else {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
            super.onCreate();
        }
    }
}
