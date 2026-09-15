package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B/\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00028\u00008WX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00028\u00018WX\u0096\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001b\u0010\u0013R\"\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a"}, d2 = {"Landroidx/collection/MutableMapEntry;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "", "p0", "p1", "", "p2", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;I)V", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", FirebaseAnalytics.Param.INDEX, "I", "getIndex", "()I", "getKey", "()Ljava/lang/Object;", "getKey$annotations", "()V", "key", UserMetadata.KEYDATA_FILENAME, "[Ljava/lang/Object;", "getKeys", "()[Ljava/lang/Object;", "getValue", "getValue$annotations", "value", "values", "getValues"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class MutableMapEntry<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {
    private final int index;
    private final Object[] keys;
    private final Object[] values;

    public static /* synthetic */ void getKey$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public MutableMapEntry(Object[] objArr, Object[] objArr2, int i) {
        Intrinsics.checkNotNullParameter(objArr, "");
        Intrinsics.checkNotNullParameter(objArr2, "");
        this.keys = objArr;
        this.values = objArr2;
        this.index = i;
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    public final Object[] getValues() {
        return this.values;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V p0) {
        Object[] objArr = this.values;
        int i = this.index;
        V v = (V) objArr[i];
        objArr[i] = p0;
        return v;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) this.keys[this.index];
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return (V) this.values[this.index];
    }
}
