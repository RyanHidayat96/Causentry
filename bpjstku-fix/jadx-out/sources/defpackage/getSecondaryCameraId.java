package defpackage;

import android.os.Process;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getSecondaryCameraId {
    private static Thread.UncaughtExceptionHandler TuitionPaymentFragmentbindingInflater1;
    private static List<getMirrorModeInternal> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static Throwable b;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("CrashCatcher");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sb.toString();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ArrayList();
        TuitionPaymentFragmentbindingInflater1 = null;
        b = null;
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(getMirrorModeInternal getmirrormodeinternal) {
        if (getmirrormodeinternal != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(getmirrormodeinternal);
        }
    }

    public static void b(Thread thread, Throwable th) {
        getExpectedFrameRate.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        if (!provideSurface.b()) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.g("Not reporting uncaught exception due to capturing state is off");
                return;
            }
            return;
        }
        for (getMirrorModeInternal getmirrormodeinternal : TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            try {
                getmirrormodeinternal.TuitionPaymentFragmentbindingInflater1(thread, th);
            } catch (Throwable unused) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    StringBuilder sb = new StringBuilder("Failed to process an uncaught exception by ");
                    sb.append(getmirrormodeinternal.toString());
                    ViewPort.a(sb.toString());
                }
            }
        }
    }

    public static void b() {
        if (!provideSurface.b()) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.g("Not reporting uncaught exception due to capturing state is off");
                return;
            }
            return;
        }
        for (getMirrorModeInternal getmirrormodeinternal : TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            try {
                getmirrormodeinternal.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            } catch (Throwable unused) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    StringBuilder sb = new StringBuilder("Failed to process an uncaught exception by ");
                    sb.append(getmirrormodeinternal.toString());
                    ViewPort.a(sb.toString());
                }
            }
        }
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null && (defaultUncaughtExceptionHandler instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("The agent crash handler is already registered.");
            }
        } else {
            TuitionPaymentFragmentbindingInflater1 = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Registered agent crash handler");
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Thread.UncaughtExceptionHandler {
        private static TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        private TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        static TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                String str = String.format("Uncaught exception occurred in %s[name=%s, id=%d, pid=%d]", thread.getClass().getName(), thread.getName(), Long.valueOf(thread.getId()), Integer.valueOf(Process.myPid()));
                String unused = getSecondaryCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                ViewPort.g(str);
            }
            if (getSecondaryCameraId.b != th) {
                Throwable unused2 = getSecondaryCameraId.b = th;
                getSecondaryCameraId.b(thread, th);
            }
            if (getSecondaryCameraId.TuitionPaymentFragmentbindingInflater1 != null) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = getSecondaryCameraId.TuitionPaymentFragmentbindingInflater1;
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    String unused3 = getSecondaryCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    StringBuilder sb = new StringBuilder("Passing exception to ");
                    sb.append(uncaughtExceptionHandler.getClass().getName());
                    ViewPort.g(sb.toString());
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
