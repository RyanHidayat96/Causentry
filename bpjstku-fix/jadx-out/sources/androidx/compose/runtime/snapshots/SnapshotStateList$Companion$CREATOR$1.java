package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0002\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001J)\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\nJ'\u0010\r\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList$Companion$CREATOR$1;", "Landroid/os/Parcelable$ClassLoaderCreator;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "Landroid/os/Parcel;", "p0", "Ljava/lang/ClassLoader;", "p1", "createFromParcel", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "(Landroid/os/Parcel;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "", "newArray", "(I)[Landroidx/compose/runtime/snapshots/SnapshotStateList;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnapshotStateList$Companion$CREATOR$1 implements Parcelable.ClassLoaderCreator<SnapshotStateList<Object>> {
    SnapshotStateList$Companion$CREATOR$1() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final SnapshotStateList<Object> createFromParcel(final Parcel p0, final ClassLoader p1) {
        if (p1 == null) {
            p1 = getClass().getClassLoader();
        }
        return SnapshotStateListKt.SnapshotStateList(p0.readInt(), new Function1() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList$Companion$CREATOR$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SnapshotStateList$Companion$CREATOR$1.createFromParcel$lambda$0(p0, p1, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object createFromParcel$lambda$0(Parcel parcel, ClassLoader classLoader, int i) {
        return parcel.readValue(classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final SnapshotStateList<Object> createFromParcel(Parcel p0) {
        return createFromParcel(p0, (ClassLoader) null);
    }

    @Override // android.os.Parcelable.Creator
    public final SnapshotStateList<Object>[] newArray(int p0) {
        return new SnapshotStateList[p0];
    }
}
