package androidx.room;

import androidx.exifinterface.media.ExifInterface;
import androidx.room.RoomDatabase;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u000f\u0010\u0004\u001a\u00028\u0000H'¢\u0006\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/room/RoomDatabaseConstructor;", "Landroidx/room/RoomDatabase;", ExifInterface.GPS_DIRECTION_TRUE, "", "initialize", "()Landroidx/room/RoomDatabase;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RoomDatabaseConstructor<T extends RoomDatabase> {
    T initialize();
}
