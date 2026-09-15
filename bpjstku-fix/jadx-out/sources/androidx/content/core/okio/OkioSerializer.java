package androidx.content.core.okio;

import androidx.exifinterface.media.ExifInterface;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0018\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00028\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/datastore/core/okio/OkioSerializer;", ExifInterface.GPS_DIRECTION_TRUE, "", "LRotationProvider1;", "p0", "readFrom", "(LRotationProvider1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LRotationProviderListener;", "p1", "", "writeTo", "(Ljava/lang/Object;LRotationProviderListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", "defaultValue"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface OkioSerializer<T> {
    T getDefaultValue();

    Object readFrom(RotationProvider1 rotationProvider1, Continuation<? super T> continuation);

    Object writeTo(T t, RotationProviderListener rotationProviderListener, Continuation<? super Unit> continuation);
}
