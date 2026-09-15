package androidx.content.core;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/datastore/core/NativeSharedCounter;", "", "<init>", "()V", "", "p0", "", "nativeCreateSharedCounter", "(I)J", "nativeGetCounterValue", "(J)I", "nativeIncrementAndGetCounterValue", "nativeTruncateFile", "(I)I"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NativeSharedCounter {
    public final native long nativeCreateSharedCounter(int p0);

    public final native int nativeGetCounterValue(long p0);

    public final native int nativeIncrementAndGetCounterValue(long p0);

    public final native int nativeTruncateFile(int p0);
}
