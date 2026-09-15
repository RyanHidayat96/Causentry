package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdaprovideSurface5 {
    private static final String INotificationSideChannel;
    public static String TuitionPaymentFragmentbindingInflater1;
    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static String b;
    private static lambdaprovideSurface5 cancelAll;
    lambdaprovideSurface4 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public SurfaceRequestTransformationInfo TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public Context g;
    public volatile ServerConfiguration onTransact;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AtomicBoolean f1258a = new AtomicBoolean(false);
    public AtomicBoolean asInterface = new AtomicBoolean(true);
    public int notify = 1;
    public removeStateChangeCallback asBinder = null;
    boolean d = false;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("AdkSettings");
        INotificationSideChannel = sb.toString();
        b = "";
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "";
        TuitionPaymentFragmentbindingInflater1 = "";
        cancelAll = new lambdaprovideSurface5();
    }

    private lambdaprovideSurface5() {
        ServerConfiguration.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new ServerConfiguration.TuitionPaymentFragmentbindingInflater1();
        tuitionPaymentFragmentbindingInflater1.asInterface = 1;
        ServerConfiguration serverConfiguration = new ServerConfiguration(tuitionPaymentFragmentbindingInflater1, (byte) 0);
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("switching settings: ".concat(String.valueOf(serverConfiguration)));
        }
        this.onTransact = serverConfiguration;
    }

    public static lambdaprovideSurface5 TuitionPaymentFragmentbindingInflater1() {
        return cancelAll;
    }

    static String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return "Dynatrace OneAgent (Android)";
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SurfaceRequestTransformationInfo surfaceRequestTransformationInfo, Context context) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = surfaceRequestTransformationInfo;
        this.d = surfaceRequestTransformationInfo.cancel;
        if (context == null || this.g == context.getApplicationContext()) {
            return;
        }
        this.g = context;
        String string = context.getApplicationInfo().loadLabel(this.g.getPackageManager()).toString();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = string;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(string, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        TuitionPaymentFragmentbindingInflater1 = this.g.getPackageName();
        removeStateChangeCallback removestatechangecallbackB = removeStateChangeCallback.b(this.g, new snapToSurfaceRotation(surfaceRequestTransformationInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        this.asBinder = removestatechangecallbackB;
        this.asInterface.set(removestatechangecallbackB.b("DTXNewVisitorSent"));
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean z) {
        this.asInterface.set(z);
        this.asBinder.b.edit().putBoolean("DTXNewVisitorSent", z).apply();
    }
}
