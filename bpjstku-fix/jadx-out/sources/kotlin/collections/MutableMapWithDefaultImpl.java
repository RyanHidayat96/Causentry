package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B>\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ%\u0010\"\u001a\u00020!2\u0014\u0010\u0005\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010\u001cR&\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R/\u0010+\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0013R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000/8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00028\u0001038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R&\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001070/8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00101"}, d2 = {"Lkotlin/collections/MutableMapWithDefaultImpl;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/collections/MutableMapWithDefault;", "", "p0", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "key", "p1", "<init>", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isEmpty", "()Z", "containsKey", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "", "", "putAll", "(Ljava/util/Map;)V", "clear", "()V", "getOrImplicitDefault", "map", "Ljava/util/Map;", "getMap", "()Ljava/util/Map;", "default", "Lkotlin/jvm/functions/Function1;", "getSize", "size", "", "getKeys", "()Ljava/util/Set;", UserMetadata.KEYDATA_FILENAME, "", "getValues", "()Ljava/util/Collection;", "values", "", "getEntries", RemoteConfigConstants.ResponseFieldKey.ENTRIES}, k = 1, mv = {2, 1, 0}, xi = 48)
final class MutableMapWithDefaultImpl<K, V> implements MutableMapWithDefault<K, V> {
    private final Function1<K, V> default;
    private final Map<K, V> map;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableMapWithDefaultImpl(Map<K, V> map, Function1<? super K, ? extends V> function1) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.map = map;
        this.default = function1;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // kotlin.collections.MutableMapWithDefault, kotlin.collections.MapWithDefault
    public final Map<K, V> getMap() {
        return this.map;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return getValues();
    }

    @Override // java.util.Map
    public final boolean equals(Object p0) {
        return getMap().equals(p0);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return getMap().hashCode();
    }

    public final String toString() {
        return getMap().toString();
    }

    public final int getSize() {
        return getMap().size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return getMap().isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object p0) {
        return getMap().containsKey(p0);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object p0) {
        return getMap().containsValue(p0);
    }

    @Override // java.util.Map
    public final V get(Object p0) {
        return getMap().get(p0);
    }

    public final Set<K> getKeys() {
        return getMap().keySet();
    }

    public final Collection<V> getValues() {
        return getMap().values();
    }

    public final Set<Map.Entry<K, V>> getEntries() {
        return getMap().entrySet();
    }

    @Override // java.util.Map
    public final V put(K p0, V p1) {
        return getMap().put(p0, p1);
    }

    @Override // java.util.Map
    public final V remove(Object p0) {
        return getMap().remove(p0);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        getMap().putAll(p0);
    }

    @Override // java.util.Map
    public final void clear() {
        getMap().clear();
    }

    @Override // kotlin.collections.MapWithDefault
    public final V getOrImplicitDefault(K p0) {
        Map<K, V> map = getMap();
        V v = map.get(p0);
        return (v != null || map.containsKey(p0)) ? v : this.default.invoke(p0);
    }
}
