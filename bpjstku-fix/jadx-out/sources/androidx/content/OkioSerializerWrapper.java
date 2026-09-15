package androidx.content;

import androidx.content.core.Serializer;
import androidx.content.core.okio.OkioSerializer;
import androidx.exifinterface.media.ExifInterface;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\b\u0010\tJ \u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00028\u00008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/datastore/OkioSerializerWrapper;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/okio/OkioSerializer;", "Landroidx/datastore/core/Serializer;", "p0", "<init>", "(Landroidx/datastore/core/Serializer;)V", "LRotationProvider1;", "readFrom", "(LRotationProvider1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LRotationProviderListener;", "p1", "", "writeTo", "(Ljava/lang/Object;LRotationProviderListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", "defaultValue", "delegate", "Landroidx/datastore/core/Serializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkioSerializerWrapper<T> implements OkioSerializer<T> {
    private final Serializer<T> delegate;

    public OkioSerializerWrapper(Serializer<T> serializer) {
        Intrinsics.checkNotNullParameter(serializer, "");
        this.delegate = serializer;
    }

    @Override // androidx.content.core.okio.OkioSerializer
    public final T getDefaultValue() {
        return this.delegate.getDefaultValue();
    }

    @Override // androidx.content.core.okio.OkioSerializer
    public final Object readFrom(RotationProvider1 rotationProvider1, Continuation<? super T> continuation) {
        return this.delegate.readFrom(rotationProvider1.a(), continuation);
    }

    @Override // androidx.content.core.okio.OkioSerializer
    public final Object writeTo(T t, RotationProviderListener rotationProviderListener, Continuation<? super Unit> continuation) {
        Object objWriteTo = this.delegate.writeTo(t, rotationProviderListener.asBinder(), continuation);
        return objWriteTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteTo : Unit.INSTANCE;
    }
}
