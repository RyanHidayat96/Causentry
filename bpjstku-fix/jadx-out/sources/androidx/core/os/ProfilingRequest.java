package androidx.core.os;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/core/os/ProfilingRequest;", "", "", "p0", "Landroid/os/Bundle;", "p1", "", "p2", "Landroid/os/CancellationSignal;", "p3", "<init>", "(ILandroid/os/Bundle;Ljava/lang/String;Landroid/os/CancellationSignal;)V", "profilingType", "I", "getProfilingType", "()I", "params", "Landroid/os/Bundle;", "getParams", "()Landroid/os/Bundle;", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "cancellationSignal", "Landroid/os/CancellationSignal;", "getCancellationSignal", "()Landroid/os/CancellationSignal;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProfilingRequest {
    private final android.os.CancellationSignal cancellationSignal;
    private final Bundle params;
    private final int profilingType;
    private final String tag;

    public ProfilingRequest(int i, Bundle bundle, String str, android.os.CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(bundle, "");
        this.profilingType = i;
        this.params = bundle;
        this.tag = str;
        this.cancellationSignal = cancellationSignal;
    }

    public final int getProfilingType() {
        return this.profilingType;
    }

    public final Bundle getParams() {
        return this.params;
    }

    public final String getTag() {
        return this.tag;
    }

    public final android.os.CancellationSignal getCancellationSignal() {
        return this.cancellationSignal;
    }
}
