package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Printer;
import com.datadog.android.api.SdkCore;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumMonitor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00128\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0015\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0014\u0010\u001d\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001e"}, d2 = {"LgetSurfaceProvider;", "Landroid/util/Printer;", "LSurfaceOutputEventEventCode;", "", "p0", "<init>", "()V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "", "println", "(Ljava/lang/String;)V", "Lcom/datadog/android/api/SdkCore;", "Landroid/content/Context;", "p1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/datadog/android/api/SdkCore;Landroid/content/Context;)V", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;)V", "Lcom/datadog/android/api/SdkCore;", "TuitionPaymentFragmentbindingInflater1", "b", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "asInterface"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class getSurfaceProvider implements Printer, SurfaceOutputEventEventCode {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private SdkCore TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final long b = 100;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = TimeUnit.MILLISECONDS.toNanos(100);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3 = "";

    @Override // defpackage.SurfaceOutputEventEventCode
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(SdkCore p0, Context p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        this.TuitionPaymentFragmentbindingInflater1 = p0;
        Looper.getMainLooper().setMessageLogging(this);
    }

    @Override // defpackage.SurfaceOutputEventEventCode
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0) {
        Looper.getMainLooper().setMessageLogging(null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), p0 != null ? p0.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(p0, "");
        return this.b == ((getSurfaceProvider) p0).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        long j = this.b;
        StringBuilder sb = new StringBuilder("MainLooperLongTaskStrategy(");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.util.Printer
    public final void println(String p0) {
        SdkCore sdkCore;
        if (p0 != null) {
            long jNanoTime = System.nanoTime();
            if (StringsKt.startsWith$default(p0, ">>>>> Dispatching to ", false, 2, (Object) null)) {
                String strSubstring = p0.substring(21);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = strSubstring;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = jNanoTime;
                return;
            }
            if (StringsKt.startsWith$default(p0, "<<<<< Finished to ", false, 2, (Object) null)) {
                long j = jNanoTime - this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (j <= this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 || (sdkCore = this.TuitionPaymentFragmentbindingInflater1) == null) {
                    return;
                }
                if (sdkCore == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    sdkCore = null;
                }
                RumMonitor rumMonitorB = GlobalRumMonitor.b(sdkCore);
                PreviewBuilder previewBuilder = rumMonitorB instanceof PreviewBuilder ? (PreviewBuilder) rumMonitorB : null;
                if (previewBuilder != null) {
                    previewBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(j, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
        }
    }
}
