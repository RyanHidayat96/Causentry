package androidx.content.preferences.core;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\u0005\u001a\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\u0005\u001a\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\r\u0010\u0005\u001a\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0005\u001a\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0005\u001a#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00110\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0005"}, d2 = {"", "p0", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "booleanKey", "(Ljava/lang/String;)Landroidx/datastore/preferences/core/Preferences$Key;", "", "byteArrayKey", "", "doubleKey", "", "floatKey", "", "intKey", "", "longKey", "stringKey", "", "stringSetKey"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PreferencesKeys {
    public static final Preferences.Key<Integer> intKey(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Preferences.Key<>(str);
    }

    public static final Preferences.Key<Double> doubleKey(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Preferences.Key<>(str);
    }

    public static final Preferences.Key<String> stringKey(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Preferences.Key<>(str);
    }

    public static final Preferences.Key<Boolean> booleanKey(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Preferences.Key<>(str);
    }

    public static final Preferences.Key<Float> floatKey(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Preferences.Key<>(str);
    }

    public static final Preferences.Key<Long> longKey(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Preferences.Key<>(str);
    }

    public static final Preferences.Key<Set<String>> stringSetKey(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Preferences.Key<>(str);
    }

    public static final Preferences.Key<byte[]> byteArrayKey(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Preferences.Key<>(str);
    }
}
