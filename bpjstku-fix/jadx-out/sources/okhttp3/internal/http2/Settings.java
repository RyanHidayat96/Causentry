package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\tJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\tJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u000eR\u0011\u0010\u001a\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000eR\u0011\u0010\u001c\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000eR\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lokhttp3/internal/http2/Settings;", "", "<init>", "()V", "", "clear", "", "p0", "get", "(I)I", "", "getEnablePush", "(Z)Z", "getMaxConcurrentStreams", "()I", "getMaxFrameSize", "getMaxHeaderListSize", "isSet", "(I)Z", "merge", "(Lokhttp3/internal/http2/Settings;)V", "p1", "set", "(II)Lokhttp3/internal/http2/Settings;", "size", "getHeaderTableSize", "headerTableSize", "getInitialWindowSize", "initialWindowSize", "I", "", "values", "[I", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Settings {
    public static final int COUNT = 10;
    public static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    public static final int ENABLE_PUSH = 2;
    public static final int HEADER_TABLE_SIZE = 1;
    public static final int INITIAL_WINDOW_SIZE = 7;
    public static final int MAX_CONCURRENT_STREAMS = 4;
    public static final int MAX_FRAME_SIZE = 5;
    public static final int MAX_HEADER_LIST_SIZE = 6;
    private int set;
    private final int[] values = new int[10];

    public final int getHeaderTableSize() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    public final int getInitialWindowSize() {
        if ((this.set & 128) != 0) {
            return this.values[7];
        }
        return 65535;
    }

    public final void clear() {
        this.set = 0;
        ArraysKt.fill$default(this.values, 0, 0, 0, 6, (Object) null);
    }

    public final Settings set(int p0, int p1) {
        if (p0 >= 0) {
            int[] iArr = this.values;
            if (p0 < iArr.length) {
                this.set = (1 << p0) | this.set;
                iArr[p0] = p1;
            }
        }
        return this;
    }

    public final boolean isSet(int p0) {
        return ((1 << p0) & this.set) != 0;
    }

    public final int get(int p0) {
        return this.values[p0];
    }

    public final int size() {
        return Integer.bitCount(this.set);
    }

    public final boolean getEnablePush(boolean p0) {
        if ((this.set & 4) != 0) {
            return this.values[2] == 1;
        }
        return p0;
    }

    public final int getMaxConcurrentStreams() {
        if ((this.set & 16) != 0) {
            return this.values[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int getMaxFrameSize(int p0) {
        return (this.set & 32) != 0 ? this.values[5] : p0;
    }

    public final int getMaxHeaderListSize(int p0) {
        return (this.set & 64) != 0 ? this.values[6] : p0;
    }

    public final void merge(Settings p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        for (int i = 0; i < 10; i++) {
            if (p0.isSet(i)) {
                set(i, p0.get(i));
            }
        }
    }
}
