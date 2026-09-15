package defpackage;

import android.util.Log;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class onSurfaceTextureSizeChanged implements lambdatryToProvidePreviewSurface2androidxcameraviewTextureViewImplementation {
    private static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Class.forName("android.util.Log") != null;
    }

    public static boolean b() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public onSurfaceTextureSizeChanged(String str) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
    }

    @Override // defpackage.lambdatryToProvidePreviewSurface2androidxcameraviewTextureViewImplementation
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Level level, String str) {
        if (level != Level.OFF) {
            Log.println(TuitionPaymentFragmentspecialinlinedviewModeldefault2(level), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, str);
        }
    }

    @Override // defpackage.lambdatryToProvidePreviewSurface2androidxcameraviewTextureViewImplementation
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Level level, String str, Throwable th) {
        if (level != Level.OFF) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(level);
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("\n");
            sb.append(Log.getStackTraceString(th));
            Log.println(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, str2, sb.toString());
        }
    }

    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue < 800) {
            return iIntValue < 500 ? 2 : 3;
        }
        if (iIntValue < 900) {
            return 4;
        }
        return iIntValue < 1000 ? 5 : 6;
    }
}
