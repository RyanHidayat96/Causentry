package androidx.room.concurrent;

import androidx.exifinterface.media.ExifInterface;
import defpackage.EncoderImplMediaCodecCallbackExternalSyntheticLambda8;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t*\u001c\u0010\n\u001a\u0004\b\u0000\u0010\u0000\"\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0001"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/ThreadLocal;", "Landroidx/room/concurrent/TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "p0", "Lkotlin/coroutines/CoroutineContext$Element;", "asContextElement", "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)Lkotlin/coroutines/CoroutineContext$Element;", "", "currentThreadId", "()J", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ThreadLocal_jvmAndroidKt {
    public static /* synthetic */ void ThreadLocal$annotations() {
    }

    public static final long currentThreadId() {
        return Thread.currentThread().getId();
    }

    public static final <T> CoroutineContext.Element asContextElement(ThreadLocal<T> threadLocal, T t) {
        Intrinsics.checkNotNullParameter(threadLocal, "");
        return new EncoderImplMediaCodecCallbackExternalSyntheticLambda8(t, threadLocal);
    }
}
