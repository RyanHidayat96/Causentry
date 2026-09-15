package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class LongVector extends BaseVector {
    public final LongVector __assign(int i, ByteBuffer byteBuffer) {
        __reset(i, 8, byteBuffer);
        return this;
    }

    public final long get(int i) {
        return this.bb.getLong(__element(i));
    }
}
