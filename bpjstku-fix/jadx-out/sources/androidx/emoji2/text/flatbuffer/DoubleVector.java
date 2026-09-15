package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class DoubleVector extends BaseVector {
    public final DoubleVector __assign(int i, ByteBuffer byteBuffer) {
        __reset(i, 8, byteBuffer);
        return this;
    }

    public final double get(int i) {
        return this.bb.getDouble(__element(i));
    }
}
