package defpackage;

import android.os.SystemClock;
import androidx.work.WorkRequest;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\n\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"LgetTag;", "", "<init>", "()V", "LgetVolumeAttributes;", "p0", "", "TuitionPaymentFragmentbindingInflater1", "(LgetVolumeAttributes;)Z", "Ljava/io/File;", "b", "Ljava/io/File;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "I", "", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getTag {
    public static final getTag INSTANCE = new getTag();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final File TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new File("/proc/self/fd");

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private static int b = 30;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private static long TuitionPaymentFragmentbindingInflater1 = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;

    private getTag() {
    }

    public final boolean TuitionPaymentFragmentbindingInflater1(getVolumeAttributes p0) {
        boolean z;
        synchronized (this) {
            int i = b;
            b = i + 1;
            if (i >= 30 || SystemClock.uptimeMillis() > TuitionPaymentFragmentbindingInflater1 + WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                b = 0;
                TuitionPaymentFragmentbindingInflater1 = SystemClock.uptimeMillis();
                String[] list = TuitionPaymentFragmentspecialinlinedviewModeldefault2.list();
                if (list == null) {
                    list = new String[0];
                }
                boolean z2 = list.length < 800;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z2;
                if (!z2 && p0 != null) {
                    p0.TuitionPaymentFragmentbindingInflater1();
                }
            }
            z = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        return z;
    }
}
