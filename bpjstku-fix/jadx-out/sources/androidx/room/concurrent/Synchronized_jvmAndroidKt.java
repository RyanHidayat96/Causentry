package androidx.room.concurrent;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007*\f\b\u0000\u0010\b\"\u00020\u00012\u00020\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/room/concurrent/SynchronizedObject;", "p0", "Lkotlin/Function0;", "p1", "synchronized", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "SynchronizedObject"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class Synchronized_jvmAndroidKt {
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <T> T m7349synchronized(Object obj, Function0<? extends T> function0) {
        T tInvoke;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(function0, "");
        synchronized (obj) {
            tInvoke = function0.invoke();
        }
        return tInvoke;
    }
}
