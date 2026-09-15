package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import defpackage.VideoMimeInfoBuilder;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/Deferred;", ExifInterface.GPS_DIRECTION_TRUE, "LVideoMimeInfoBuilder;", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Deferred<T> extends VideoMimeInfoBuilder {
    Object await(Continuation<? super T> continuation);

    T b();
}
