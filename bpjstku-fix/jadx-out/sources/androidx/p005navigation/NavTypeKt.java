package androidx.p005navigation;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.p013savedstate.SavedStateReader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a;\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001aE\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\b\u0010\u000b\u001a\u001f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u000f\u0010\r\u001a!\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a;\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0012\u0010\t"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/navigation/NavType;", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p0", "", "p1", "p2", "navTypeParseAndPut", "(Landroidx/navigation/NavType;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "p3", "(Landroidx/navigation/NavType;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "navTypeFromArgType", "(Ljava/lang/String;)Landroidx/navigation/NavType;", "", "navTypeInferFromValue", "navTypeInferFromValueType", "(Ljava/lang/Object;)Landroidx/navigation/NavType;", "parseAndPutFromUri"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NavTypeKt {
    public static final <T> T navTypeParseAndPut(NavType<T> navType, Bundle bundle, String str, String str2) {
        Intrinsics.checkNotNullParameter(navType, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        T value = navType.parseValue(str2);
        navType.put(bundle, str, value);
        return value;
    }

    public static final NavType<?> navTypeFromArgType(String str) {
        if (Intrinsics.areEqual(NavType.IntType.getName(), str)) {
            return NavType.IntType;
        }
        if (Intrinsics.areEqual(NavType.IntArrayType.getName(), str)) {
            return NavType.IntArrayType;
        }
        if (Intrinsics.areEqual(NavType.IntListType.getName(), str)) {
            return NavType.IntListType;
        }
        if (Intrinsics.areEqual(NavType.LongType.getName(), str)) {
            return NavType.LongType;
        }
        if (Intrinsics.areEqual(NavType.LongArrayType.getName(), str)) {
            return NavType.LongArrayType;
        }
        if (Intrinsics.areEqual(NavType.LongListType.getName(), str)) {
            return NavType.LongListType;
        }
        if (Intrinsics.areEqual(NavType.BoolType.getName(), str)) {
            return NavType.BoolType;
        }
        if (Intrinsics.areEqual(NavType.BoolArrayType.getName(), str)) {
            return NavType.BoolArrayType;
        }
        if (Intrinsics.areEqual(NavType.BoolListType.getName(), str)) {
            return NavType.BoolListType;
        }
        if (Intrinsics.areEqual(NavType.StringType.getName(), str)) {
            return NavType.StringType;
        }
        if (Intrinsics.areEqual(NavType.StringArrayType.getName(), str)) {
            return NavType.StringArrayType;
        }
        if (Intrinsics.areEqual(NavType.StringListType.getName(), str)) {
            return NavType.StringListType;
        }
        if (Intrinsics.areEqual(NavType.FloatType.getName(), str)) {
            return NavType.FloatType;
        }
        if (Intrinsics.areEqual(NavType.FloatArrayType.getName(), str)) {
            return NavType.FloatArrayType;
        }
        if (Intrinsics.areEqual(NavType.FloatListType.getName(), str)) {
            return NavType.FloatListType;
        }
        return null;
    }

    public static final NavType<Object> navTypeInferFromValue(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            try {
                try {
                    try {
                        NavType.IntType.parseValue(str);
                        NavType<Integer> navType = NavType.IntType;
                        Intrinsics.checkNotNull(navType, "");
                        return navType;
                    } catch (IllegalArgumentException unused) {
                        NavType.LongType.parseValue(str);
                        NavType<Long> navType2 = NavType.LongType;
                        Intrinsics.checkNotNull(navType2, "");
                        return navType2;
                    }
                } catch (IllegalArgumentException unused2) {
                    NavType<String> navType3 = NavType.StringType;
                    Intrinsics.checkNotNull(navType3, "");
                    return navType3;
                }
            } catch (IllegalArgumentException unused3) {
                NavType.FloatType.parseValue(str);
                NavType<Float> navType4 = NavType.FloatType;
                Intrinsics.checkNotNull(navType4, "");
                return navType4;
            }
        } catch (IllegalArgumentException unused4) {
            NavType.BoolType.parseValue(str);
            NavType<Boolean> navType5 = NavType.BoolType;
            Intrinsics.checkNotNull(navType5, "");
            return navType5;
        }
    }

    public static final NavType<Object> navTypeInferFromValueType(Object obj) {
        if (obj instanceof Integer) {
            NavType<Integer> navType = NavType.IntType;
            Intrinsics.checkNotNull(navType, "");
            return navType;
        }
        if (obj instanceof int[]) {
            NavType<int[]> navType2 = NavType.IntArrayType;
            Intrinsics.checkNotNull(navType2, "");
            return navType2;
        }
        if (obj instanceof Long) {
            NavType<Long> navType3 = NavType.LongType;
            Intrinsics.checkNotNull(navType3, "");
            return navType3;
        }
        if (obj instanceof long[]) {
            NavType<long[]> navType4 = NavType.LongArrayType;
            Intrinsics.checkNotNull(navType4, "");
            return navType4;
        }
        if (obj instanceof Float) {
            NavType<Float> navType5 = NavType.FloatType;
            Intrinsics.checkNotNull(navType5, "");
            return navType5;
        }
        if (obj instanceof float[]) {
            NavType<float[]> navType6 = NavType.FloatArrayType;
            Intrinsics.checkNotNull(navType6, "");
            return navType6;
        }
        if (obj instanceof Boolean) {
            NavType<Boolean> navType7 = NavType.BoolType;
            Intrinsics.checkNotNull(navType7, "");
            return navType7;
        }
        if (obj instanceof boolean[]) {
            NavType<boolean[]> navType8 = NavType.BoolArrayType;
            Intrinsics.checkNotNull(navType8, "");
            return navType8;
        }
        if (!(obj instanceof String) && obj != null) {
            return null;
        }
        NavType<String> navType9 = NavType.StringType;
        Intrinsics.checkNotNull(navType9, "");
        return navType9;
    }

    public static final <T> T parseAndPutFromUri(NavType<T> navType, Bundle bundle, String str, String str2) {
        Intrinsics.checkNotNullParameter(navType, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return navType.parseAndPut(bundle, str, NavUriUtils.INSTANCE.decode(str2));
    }

    public static final <T> T navTypeParseAndPut(NavType<T> navType, Bundle bundle, String str, String str2, T t) {
        Intrinsics.checkNotNullParameter(navType, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (!SavedStateReader.m7369containsimpl(SavedStateReader.m7368constructorimpl(bundle), str)) {
            throw new IllegalArgumentException("There is no previous value in this savedState.");
        }
        if (str2 == null) {
            return t;
        }
        T value = navType.parseValue(str2, t);
        navType.put(bundle, str, value);
        return value;
    }
}
