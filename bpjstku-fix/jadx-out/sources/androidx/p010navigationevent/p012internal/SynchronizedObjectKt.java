package androidx.p010navigationevent.p012internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/navigationevent/internal/SynchronizedObject;", "p0", "Lkotlin/Function0;", "p1", "synchronized", "(Landroidx/navigationevent/internal/SynchronizedObject;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SynchronizedObjectKt {
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <T> T m7332synchronized(SynchronizedObject synchronizedObject, Function0<? extends T> function0) {
        T tInvoke;
        Intrinsics.checkNotNullParameter(synchronizedObject, "");
        Intrinsics.checkNotNullParameter(function0, "");
        synchronized (synchronizedObject) {
            tInvoke = function0.invoke();
        }
        return tInvoke;
    }
}
