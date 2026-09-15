package defpackage;

import com.google.firebase.messaging.Constants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B1\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0002\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b"}, d2 = {"LSurfaceViewImplementationSurfaceRequestCallback;", "", "<init>", "()V", "", "p0", "", "p1", "p2", "", "p3", "p4", "([BIIZZ)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()LSurfaceViewImplementationSurfaceRequestCallback;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(LSurfaceViewImplementationSurfaceRequestCallback;)LSurfaceViewImplementationSurfaceRequestCallback;", "TuitionPaymentFragmentbindingInflater1", "", "(LSurfaceViewImplementationSurfaceRequestCallback;I)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "[B", "limit", "I", "next", "LSurfaceViewImplementationSurfaceRequestCallback;", "owner", "Z", "pos", "prev", "shared", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SurfaceViewImplementationSurfaceRequestCallback {
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;
    public final byte[] data;
    public int limit;
    public SurfaceViewImplementationSurfaceRequestCallback next;
    public boolean owner;
    public int pos;
    public SurfaceViewImplementationSurfaceRequestCallback prev;
    public boolean shared;

    public SurfaceViewImplementationSurfaceRequestCallback() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public SurfaceViewImplementationSurfaceRequestCallback(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.data = bArr;
        this.pos = i;
        this.limit = i2;
        this.shared = z;
        this.owner = z2;
    }

    public final SurfaceViewImplementationSurfaceRequestCallback TuitionPaymentFragmentbindingInflater1() {
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
        return new SurfaceViewImplementationSurfaceRequestCallback(bArrCopyOf, this.pos, this.limit, false, true);
    }

    public final SurfaceViewImplementationSurfaceRequestCallback TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.next;
        if (surfaceViewImplementationSurfaceRequestCallback == this) {
            surfaceViewImplementationSurfaceRequestCallback = null;
        }
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback2 = this.prev;
        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback2);
        surfaceViewImplementationSurfaceRequestCallback2.next = this.next;
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback3 = this.next;
        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback3);
        surfaceViewImplementationSurfaceRequestCallback3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return surfaceViewImplementationSurfaceRequestCallback;
    }

    public final SurfaceViewImplementationSurfaceRequestCallback TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementationSurfaceRequestCallback p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.prev = this;
        p0.next = this.next;
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.next;
        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
        surfaceViewImplementationSurfaceRequestCallback.prev = p0;
        this.next = p0;
        return p0;
    }

    public final void TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementationSurfaceRequestCallback p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (!p0.owner) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i = p0.limit;
        int i2 = i + p1;
        if (i2 > 8192) {
            if (p0.shared) {
                throw new IllegalArgumentException();
            }
            int i3 = p0.pos;
            if (i2 - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = p0.data;
            ArraysKt.copyInto$default(bArr, bArr, 0, i3, i, 2, (Object) null);
            p0.limit -= p0.pos;
            p0.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = p0.data;
        int i4 = p0.limit;
        int i5 = this.pos;
        ArraysKt.copyInto(bArr2, bArr3, i4, i5, i5 + p1);
        p0.limit += p1;
        this.pos += p1;
    }
}
