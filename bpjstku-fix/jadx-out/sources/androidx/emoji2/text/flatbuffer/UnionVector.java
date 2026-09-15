package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class UnionVector extends BaseVector {
    public final UnionVector __assign(int i, int i2, ByteBuffer byteBuffer) {
        __reset(i, i2, byteBuffer);
        return this;
    }

    public final Table get(Table table, int i) {
        return Table.__union(table, __element(i), this.bb);
    }
}
