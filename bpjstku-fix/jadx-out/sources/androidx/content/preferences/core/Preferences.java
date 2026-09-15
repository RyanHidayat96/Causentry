package androidx.content.preferences.core;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/datastore/preferences/core/Preferences;", "", "<init>", "()V", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "asMap", "()Ljava/util/Map;", ExifInterface.GPS_DIRECTION_TRUE, "p0", "", "contains", "(Landroidx/datastore/preferences/core/Preferences$Key;)Z", "get", "(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;", "Landroidx/datastore/preferences/core/MutablePreferences;", "toMutablePreferences", "()Landroidx/datastore/preferences/core/MutablePreferences;", "toPreferences", "()Landroidx/datastore/preferences/core/Preferences;", "Key", "Pair"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Preferences {
    public abstract Map<Key<?>, Object> asMap();

    public abstract <T> boolean contains(Key<T> p0);

    public abstract <T> T get(Key<T> p0);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0004\u001a\u00028\u0000H\u0087\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011"}, d2 = {"Landroidx/datastore/preferences/core/Preferences$Key;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/datastore/preferences/core/Preferences$Pair;", TypedValues.TransitionType.S_TO, "(Ljava/lang/Object;)Landroidx/datastore/preferences/core/Preferences$Pair;", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Key<T> {
        private final String name;

        public Key(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        }

        public final String getName() {
            return this.name;
        }

        public final Pair<T> to(T p0) {
            return new Pair<>(this, p0);
        }

        public final boolean equals(Object p0) {
            if (p0 instanceof Key) {
                return Intrinsics.areEqual(this.name, ((Key) p0).name);
            }
            return false;
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final String toString() {
            return this.name;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00028\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/datastore/preferences/core/Preferences$Pair;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/datastore/preferences/core/Preferences$Key;", "p0", "p1", "<init>", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V", "key", "Landroidx/datastore/preferences/core/Preferences$Key;", "getKey$datastore_preferences_core", "()Landroidx/datastore/preferences/core/Preferences$Key;", "value", "Ljava/lang/Object;", "getValue$datastore_preferences_core", "()Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Pair<T> {
        private final Key<T> key;
        private final T value;

        public Pair(Key<T> key, T t) {
            Intrinsics.checkNotNullParameter(key, "");
            this.key = key;
            this.value = t;
        }

        public final Key<T> getKey$datastore_preferences_core() {
            return this.key;
        }

        public final T getValue$datastore_preferences_core() {
            return this.value;
        }
    }

    public final MutablePreferences toMutablePreferences() {
        return new MutablePreferences(MapsKt.toMutableMap(asMap()), false);
    }

    public final Preferences toPreferences() {
        return new MutablePreferences(MapsKt.toMutableMap(asMap()), true);
    }
}
