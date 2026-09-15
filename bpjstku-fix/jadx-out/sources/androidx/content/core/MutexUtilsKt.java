package androidx.content.core;

import defpackage.VideoEncoderConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aJ\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0081\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"R", "LVideoEncoderConfig;", "", "p0", "Lkotlin/Function1;", "", "p1", "withTryLock", "(LVideoEncoderConfig;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MutexUtilsKt {
    public static /* synthetic */ Object withTryLock$default(VideoEncoderConfig videoEncoderConfig, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        Intrinsics.checkNotNullParameter(videoEncoderConfig, "");
        Intrinsics.checkNotNullParameter(function1, "");
        boolean zTryLock = videoEncoderConfig.tryLock(obj);
        try {
            return function1.invoke(Boolean.valueOf(zTryLock));
        } finally {
            if (zTryLock) {
                videoEncoderConfig.unlock(obj);
            }
        }
    }

    public static final <R> R withTryLock(VideoEncoderConfig videoEncoderConfig, Object obj, Function1<? super Boolean, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(videoEncoderConfig, "");
        Intrinsics.checkNotNullParameter(function1, "");
        boolean zTryLock = videoEncoderConfig.tryLock(obj);
        try {
            return function1.invoke(Boolean.valueOf(zTryLock));
        } finally {
            if (zTryLock) {
                videoEncoderConfig.unlock(obj);
            }
        }
    }
}
