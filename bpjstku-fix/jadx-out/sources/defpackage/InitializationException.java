package defpackage;

import android.content.Context;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00108\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\r\u001a\u0006*\u00020\u00140\u00148\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"LInitializationException;", "Ldetach;", "LImageAnalysisBlockingAnalyzer;", "p0", "<init>", "(LImageAnalysisBlockingAnalyzer;)V", "Landroid/content/Context;", "", "b", "(Landroid/content/Context;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/concurrent/atomic/AtomicBoolean;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "()Ljava/lang/String;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "g", "LImageAnalysisBlockingAnalyzer;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class InitializationException implements detach {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final String b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public Thread.UncaughtExceptionHandler TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final AtomicBoolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final ImageAnalysisBlockingAnalyzer TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public InitializationException(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer) {
        Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = imageAnalysisBlockingAnalyzer;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AtomicBoolean(false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Thread.getDefaultUncaughtExceptionHandler();
        this.b = AppMeasurement.CRASH_ORIGIN;
    }

    @Override // defpackage.detach
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // defpackage.detach
    public final void b(Context p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Thread.getDefaultUncaughtExceptionHandler();
        getOffsetX getoffsetx = new getOffsetX(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, p0);
        getoffsetx.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(getoffsetx);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(true);
    }

    @Override // defpackage.detach
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        Thread.setDefaultUncaughtExceptionHandler(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(false);
    }
}
