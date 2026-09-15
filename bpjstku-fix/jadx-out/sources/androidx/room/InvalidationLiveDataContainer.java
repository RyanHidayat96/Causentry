package androidx.room;

import androidx.database.SQLiteConnection;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JC\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJI\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0010H\u0007¢\u0006\u0004\b\u000e\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00132\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00132\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\r¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u00198\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/room/InvalidationLiveDataContainer;", "", "Landroidx/room/RoomDatabase;", "p0", "<init>", "(Landroidx/room/RoomDatabase;)V", ExifInterface.GPS_DIRECTION_TRUE, "", "", "", "p1", "Ljava/util/concurrent/Callable;", "p2", "Landroidx/lifecycle/LiveData;", "create", "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteConnection;", "([Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)Landroidx/lifecycle/LiveData;", "", "onActive", "(Landroidx/lifecycle/LiveData;)V", "onInactive", "database", "Landroidx/room/RoomDatabase;", "", "liveDataSet", "Ljava/util/Set;", "getLiveDataSet$room_runtime_release", "()Ljava/util/Set;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InvalidationLiveDataContainer {
    private final RoomDatabase database;
    private final Set<LiveData<?>> liveDataSet;

    public InvalidationLiveDataContainer(RoomDatabase roomDatabase) {
        Intrinsics.checkNotNullParameter(roomDatabase, "");
        this.database = roomDatabase;
        Set<LiveData<?>> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "");
        this.liveDataSet = setNewSetFromMap;
    }

    public final Set<LiveData<?>> getLiveDataSet$room_runtime_release() {
        return this.liveDataSet;
    }

    public final <T> LiveData<T> create(String[] p0, boolean p1, Callable<T> p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new RoomCallableTrackingLiveData(this.database, this, p1, p0, p2);
    }

    public final <T> LiveData<T> create(String[] p0, boolean p1, Function1<? super SQLiteConnection, ? extends T> p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new RoomLambdaTrackingLiveData(this.database, this, p1, p0, p2);
    }

    public final void onActive(LiveData<?> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.liveDataSet.add(p0);
    }

    public final void onInactive(LiveData<?> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.liveDataSet.remove(p0);
    }
}
