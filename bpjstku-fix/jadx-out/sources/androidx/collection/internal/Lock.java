package androidx.collection.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/internal/Lock;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "p0", "synchronizedImpl", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Lock {
    public final <T> T synchronizedImpl(Function0<? extends T> p0) {
        T tInvoke;
        Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this) {
            tInvoke = p0.invoke();
        }
        return tInvoke;
    }
}
