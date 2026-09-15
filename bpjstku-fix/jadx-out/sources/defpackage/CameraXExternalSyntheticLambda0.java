package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraXExternalSyntheticLambda0 {
    public final int TuitionPaymentFragmentbindingInflater1;
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final int b;

    interface b {
        int TuitionPaymentFragmentbindingInflater1();

        int TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public CameraXExternalSyntheticLambda0(TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        int i;
        Context context = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = context;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.b.isLowRamDevice()) {
            i = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1 / 2;
        } else {
            i = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1;
        }
        this.b = i;
        ActivityManager activityManager = tuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : tuitionPaymentFragmentspecialinlinedviewModeldefault1.f115a));
        float fTuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder.TuitionPaymentFragmentbindingInflater1() * tuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1() * 4;
        int iRound2 = Math.round(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * fTuitionPaymentFragmentbindingInflater1);
        int iRound3 = Math.round(fTuitionPaymentFragmentbindingInflater1 * tuitionPaymentFragmentspecialinlinedviewModeldefault1.g);
        int i2 = iRound - i;
        if (iRound3 + iRound2 <= i2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iRound3;
            this.TuitionPaymentFragmentbindingInflater1 = iRound2;
        } else {
            float f = i2 / (tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + tuitionPaymentFragmentspecialinlinedviewModeldefault1.g);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Math.round(tuitionPaymentFragmentspecialinlinedviewModeldefault1.g * f);
            this.TuitionPaymentFragmentbindingInflater1 = Math.round(f * tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            Formatter.formatFileSize(context, this.TuitionPaymentFragmentbindingInflater1);
            Formatter.formatFileSize(context, i);
            Formatter.formatFileSize(context, iRound);
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.b.getMemoryClass();
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.b.isLowRamDevice();
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private static int asInterface;
        final Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        b asBinder;
        ActivityManager b;
        float g = 2.0f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f115a = 0.4f;
        float TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0.33f;
        int TuitionPaymentFragmentbindingInflater1 = 4194304;

        static {
            asInterface = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = asInterface;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = context;
            this.b = (ActivityManager) context.getSystemService("activity");
            this.asBinder = new TuitionPaymentFragmentbindingInflater1(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !this.b.isLowRamDevice()) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0.0f;
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1 implements b {
        private final DisplayMetrics TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentbindingInflater1(DisplayMetrics displayMetrics) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = displayMetrics;
        }

        @Override // CameraXExternalSyntheticLambda0.b
        public final int TuitionPaymentFragmentbindingInflater1() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.widthPixels;
        }

        @Override // CameraXExternalSyntheticLambda0.b
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.heightPixels;
        }
    }
}
