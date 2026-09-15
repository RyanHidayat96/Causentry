package androidx.compose.runtime.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/runtime/internal/AtomicInt;", "Ljava/util/concurrent/atomic/AtomicInteger;", "", "p0", "<init>", "(I)V", "add", "(I)I", "", "toByte", "()B", "", "toShort", "()S", "", "toChar", "()C"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AtomicInt extends AtomicInteger {
    public static final int $stable = 8;

    public AtomicInt(int i) {
        super(i);
    }

    @Override // java.lang.Number
    public final byte byteValue() {
        return toByte();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final double doubleValue() {
        return toDouble();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final float floatValue() {
        return toFloat();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final int intValue() {
        return toInt();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final long longValue() {
        return toLong();
    }

    @Override // java.lang.Number
    public final short shortValue() {
        return toShort();
    }

    public final double toDouble() {
        return super.doubleValue();
    }

    public final float toFloat() {
        return super.floatValue();
    }

    public final int toInt() {
        return super.intValue();
    }

    public final long toLong() {
        return super.longValue();
    }

    public final int add(int p0) {
        return addAndGet(p0);
    }

    public final byte toByte() {
        return (byte) intValue();
    }

    public final short toShort() {
        return (short) intValue();
    }

    @Deprecated(message = "Direct conversion to Char is deprecated. Use toInt().toChar() or Char constructor instead.\nIf you override toChar() function in your Number inheritor, it's recommended to gradually deprecate the overriding function and then remove it.\nSee https://youtrack.jetbrains.com/issue/KT-46465 for details about the migration", replaceWith = @ReplaceWith(expression = "this.toInt().toChar()", imports = {}))
    public final char toChar() {
        return (char) intValue();
    }
}
