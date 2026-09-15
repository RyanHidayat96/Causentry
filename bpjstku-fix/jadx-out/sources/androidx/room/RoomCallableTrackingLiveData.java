package androidx.room;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/room/RoomCallableTrackingLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/room/RoomTrackingLiveData;", "Landroidx/room/RoomDatabase;", "p0", "Landroidx/room/InvalidationLiveDataContainer;", "p1", "", "p2", "", "", "p3", "Ljava/util/concurrent/Callable;", "p4", "<init>", "(Landroidx/room/RoomDatabase;Landroidx/room/InvalidationLiveDataContainer;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)V", "compute", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callableFunction", "Ljava/util/concurrent/Callable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoomCallableTrackingLiveData<T> extends RoomTrackingLiveData<T> {
    private final Callable<T> callableFunction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomCallableTrackingLiveData(RoomDatabase roomDatabase, InvalidationLiveDataContainer invalidationLiveDataContainer, boolean z, String[] strArr, Callable<T> callable) {
        super(roomDatabase, invalidationLiveDataContainer, z, strArr, null);
        Intrinsics.checkNotNullParameter(roomDatabase, "");
        Intrinsics.checkNotNullParameter(invalidationLiveDataContainer, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(callable, "");
        this.callableFunction = callable;
    }

    @Override // androidx.room.RoomTrackingLiveData
    public final Object compute(Continuation<? super T> continuation) {
        return this.callableFunction.call();
    }
}
