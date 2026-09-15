package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0007\n\u0002\u0010\u001f\n\u0002\b\u0003\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0010\u001a\u00020\t2\u0014\u0010\u0006\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e0\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R \u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010&8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010("}, d2 = {"Landroidx/collection/MutableMapWrapper;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/collection/MapWrapper;", "", "Landroidx/collection/MutableScatterMap;", "p0", "<init>", "(Landroidx/collection/MutableScatterMap;)V", "", "clear", "()V", "p1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "putAll", "(Ljava/util/Map;)V", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/collection/MutableEntries;", "_entries", "Landroidx/collection/MutableEntries;", "Landroidx/collection/MutableKeys;", "_keys", "Landroidx/collection/MutableKeys;", "Landroidx/collection/MutableValues;", "_values", "Landroidx/collection/MutableValues;", "", "", "getEntries", "()Ljava/util/Set;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "getKeys", UserMetadata.KEYDATA_FILENAME, "parent", "Landroidx/collection/MutableScatterMap;", "", "getValues", "()Ljava/util/Collection;", "values"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class MutableMapWrapper<K, V> extends MapWrapper<K, V> implements Map<K, V>, KMutableMap {
    private MutableEntries<K, V> _entries;
    private MutableKeys<K, V> _keys;
    private MutableValues<K, V> _values;
    private final MutableScatterMap<K, V> parent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableMapWrapper(MutableScatterMap<K, V> mutableScatterMap) {
        super(mutableScatterMap);
        Intrinsics.checkNotNullParameter(mutableScatterMap, "");
        this.parent = mutableScatterMap;
    }

    @Override // androidx.collection.MapWrapper
    public final Set<Map.Entry<K, V>> getEntries() {
        MutableEntries<K, V> mutableEntries = this._entries;
        if (mutableEntries != null) {
            return mutableEntries;
        }
        MutableEntries<K, V> mutableEntries2 = new MutableEntries<>(this.parent);
        this._entries = mutableEntries2;
        return mutableEntries2;
    }

    @Override // androidx.collection.MapWrapper
    public final Set<K> getKeys() {
        MutableKeys<K, V> mutableKeys = this._keys;
        if (mutableKeys != null) {
            return mutableKeys;
        }
        MutableKeys<K, V> mutableKeys2 = new MutableKeys<>(this.parent);
        this._keys = mutableKeys2;
        return mutableKeys2;
    }

    @Override // androidx.collection.MapWrapper
    public final Collection<V> getValues() {
        MutableValues<K, V> mutableValues = this._values;
        if (mutableValues != null) {
            return mutableValues;
        }
        MutableValues<K, V> mutableValues2 = new MutableValues<>(this.parent);
        this._values = mutableValues2;
        return mutableValues2;
    }

    @Override // androidx.collection.MapWrapper, java.util.Map
    public final void clear() {
        this.parent.clear();
    }

    @Override // androidx.collection.MapWrapper, java.util.Map
    public final V remove(Object p0) {
        return this.parent.remove(p0);
    }

    @Override // androidx.collection.MapWrapper, java.util.Map
    public final V put(K p0, V p1) {
        return this.parent.put(p0, p1);
    }

    @Override // androidx.collection.MapWrapper, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        for (Map.Entry<? extends K, ? extends V> entry : p0.entrySet()) {
            this.parent.set(entry.getKey(), entry.getValue());
        }
    }
}
