package androidx.core.os;

import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0000H\u0015¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/core/os/HeapProfileRequestBuilder;", "Landroidx/core/os/ProfilingRequestBuilder;", "<init>", "()V", "Landroid/os/Bundle;", "getParams", "()Landroid/os/Bundle;", "", "getProfilingType", "()I", "getThis", "()Landroidx/core/os/HeapProfileRequestBuilder;", "p0", "setBufferSizeKb", "(I)Landroidx/core/os/HeapProfileRequestBuilder;", "setDurationMs", "", "setSamplingIntervalBytes", "(J)Landroidx/core/os/HeapProfileRequestBuilder;", "", "setTrackJavaAllocations", "(Z)Landroidx/core/os/HeapProfileRequestBuilder;", "mParams", "Landroid/os/Bundle;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HeapProfileRequestBuilder extends ProfilingRequestBuilder<HeapProfileRequestBuilder> {
    private final Bundle mParams = new Bundle();

    @Override // androidx.core.os.ProfilingRequestBuilder
    protected final int getProfilingType() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.os.ProfilingRequestBuilder
    public final HeapProfileRequestBuilder getThis() {
        return this;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    /* JADX INFO: renamed from: getParams, reason: from getter */
    protected final Bundle getMParams() {
        return this.mParams;
    }

    public final HeapProfileRequestBuilder setBufferSizeKb(int p0) {
        this.mParams.putInt("KEY_SIZE_KB", p0);
        return this;
    }

    public final HeapProfileRequestBuilder setDurationMs(int p0) {
        this.mParams.putInt("KEY_DURATION_MS", p0);
        return this;
    }

    public final HeapProfileRequestBuilder setSamplingIntervalBytes(long p0) {
        this.mParams.putLong("KEY_SAMPLING_INTERVAL_BYTES", p0);
        return this;
    }

    public final HeapProfileRequestBuilder setTrackJavaAllocations(boolean p0) {
        this.mParams.putBoolean("KEY_TRACK_JAVA_ALLOCATIONS", p0);
        return this;
    }
}
