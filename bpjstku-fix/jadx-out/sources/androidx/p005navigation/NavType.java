package androidx.p005navigation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.p013savedstate.SavedStateReader;
import androidx.p013savedstate.SavedStateWriter;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001d\b&\u0018\u0000 $*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006$%&'()B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\r\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u000f\u001a\u0004\u0018\u00018\u00002\n\u0010\u0004\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\n\u001a\u00020\tH¦\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0013J+\u0010\u0014\u001a\u00028\u00002\n\u0010\u0004\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0014\u001a\u00028\u00002\n\u0010\u0004\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0017¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001a\u0010!\u001a\u00020\t8\u0017X\u0097D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001d"}, d2 = {"Landroidx/navigation/NavType;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "p0", "<init>", "(Z)V", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "", "p1", "p2", "", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "parseValue", "(Ljava/lang/String;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "parseAndPut", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "p3", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "serializeAsValue", "(Ljava/lang/Object;)Ljava/lang/String;", "valueEquals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "isNullableAllowed", "Z", "()Z", "name", "Ljava/lang/String;", "getName", "Companion", "ParcelableType", "ParcelableArrayType", "SerializableType", "EnumType", "SerializableArrayType"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NavType<T> {
    private final boolean isNullableAllowed;
    private final String name = "nav_type";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final NavType<Integer> IntType = new IntNavType();
    public static final NavType<Integer> ReferenceType = new NavType<Integer>() { // from class: androidx.navigation.NavType$Companion$ReferenceType$1
        @Override // androidx.p005navigation.NavType
        public final /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Integer num) {
            put(bundle, str, num.intValue());
        }

        @Override // androidx.p005navigation.NavType
        public final String getName() {
            return TypedValues.Custom.S_REFERENCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.p005navigation.NavType
        public final Integer parseValue(String p0) {
            int i;
            Intrinsics.checkNotNullParameter(p0, "");
            if (StringsKt.startsWith$default(p0, "0x", false, 2, (Object) null)) {
                String strSubstring = p0.substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                i = Integer.parseInt(strSubstring, CharsKt.checkRadix(16));
            } else {
                i = Integer.parseInt(p0);
            }
            return Integer.valueOf(i);
        }

        public final void put(Bundle p0, String p1, int p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            SavedStateWriter.m7471putIntimpl(SavedStateWriter.m7454constructorimpl(p0), p1, p2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.p005navigation.NavType
        public final Integer get(Bundle p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            return Integer.valueOf(SavedStateReader.m7399getIntimpl(SavedStateReader.m7368constructorimpl(p0), p1));
        }
    };
    public static final NavType<int[]> IntArrayType = new IntArrayNavType();
    public static final NavType<List<Integer>> IntListType = new IntListNavType();
    public static final NavType<Long> LongType = new LongNavType();
    public static final NavType<long[]> LongArrayType = new LongArrayNavType();
    public static final NavType<List<Long>> LongListType = new LongListNavType();
    public static final NavType<Float> FloatType = new FloatNavType();
    public static final NavType<float[]> FloatArrayType = new FloatArrayNavType();
    public static final NavType<List<Float>> FloatListType = new FloatListNavType();
    public static final NavType<Boolean> BoolType = new BoolNavType();
    public static final NavType<boolean[]> BoolArrayType = new BoolArrayNavType();
    public static final NavType<List<Boolean>> BoolListType = new BoolListNavType();
    public static final NavType<String> StringType = new StringNavType();
    public static final NavType<String[]> StringArrayType = new StringArrayNavType();
    public static final NavType<List<String>> StringListType = new StringListNavType();

    public abstract T get(Bundle p0, String p1);

    public abstract T parseValue(String p0);

    public abstract void put(Bundle p0, String p1, T p2);

    public NavType(boolean z) {
        this.isNullableAllowed = z;
    }

    /* JADX INFO: renamed from: isNullableAllowed, reason: from getter */
    public boolean getIsNullableAllowed() {
        return this.isNullableAllowed;
    }

    public T parseValue(String p0, T p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return parseValue(p0);
    }

    public final T parseAndPut(Bundle p0, String p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return (T) NavTypeKt.navTypeParseAndPut(this, p0, p1, p2);
    }

    public final T parseAndPut(Bundle p0, String p1, String p2, T p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return (T) NavTypeKt.navTypeParseAndPut(this, p0, p1, p2, p3);
    }

    public String serializeAsValue(T p0) {
        return String.valueOf(p0);
    }

    public String getName() {
        return this.name;
    }

    public boolean valueEquals(T p0, T p1) {
        return Intrinsics.areEqual(p0, p1);
    }

    public String toString() {
        return getName();
    }

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0006\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00180\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00180\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0014R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0014R\"\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00180\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0014R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0014R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0014R\"\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00180\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0014R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0014R\"\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010)0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0014R\"\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00180\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0014"}, d2 = {"Landroidx/navigation/NavType$Companion;", "", "<init>", "()V", "", "p0", "p1", "Landroidx/navigation/NavType;", "fromArgType", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation/NavType;", "Ljava/lang/Class;", "", "parseSerializableOrParcelableType$navigation_common_release", "(Ljava/lang/Class;Z)Landroidx/navigation/NavType;", "inferFromValue", "(Ljava/lang/String;)Landroidx/navigation/NavType;", "inferFromValueType", "(Ljava/lang/Object;)Landroidx/navigation/NavType;", "", "IntType", "Landroidx/navigation/NavType;", "ReferenceType", "", "IntArrayType", "", "IntListType", "", "LongType", "", "LongArrayType", "LongListType", "", "FloatType", "", "FloatArrayType", "FloatListType", "BoolType", "", "BoolArrayType", "BoolListType", "StringType", "", "StringArrayType", "StringListType"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final NavType<?> fromArgType(String p0, String p1) {
            String strSubstring;
            NavType<?> navTypeNavTypeFromArgType = NavTypeKt.navTypeFromArgType(p0);
            if (navTypeNavTypeFromArgType != null) {
                return navTypeNavTypeFromArgType;
            }
            if (Intrinsics.areEqual(NavType.ReferenceType.getName(), p0)) {
                return NavType.ReferenceType;
            }
            String str = p0;
            if (str != null && str.length() != 0) {
                try {
                    if (!StringsKt.startsWith$default(p0, ".", false, 2, (Object) null) || p1 == null) {
                        strSubstring = p0;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(p1);
                        sb.append(p0);
                        strSubstring = sb.toString();
                    }
                    boolean zEndsWith$default = StringsKt.endsWith$default(p0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, false, 2, (Object) null);
                    if (zEndsWith$default) {
                        strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    }
                    Class<?> cls = Class.forName(strSubstring);
                    Intrinsics.checkNotNull(cls);
                    NavType<?> serializableOrParcelableType$navigation_common_release = parseSerializableOrParcelableType$navigation_common_release(cls, zEndsWith$default);
                    if (serializableOrParcelableType$navigation_common_release != null) {
                        return serializableOrParcelableType$navigation_common_release;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strSubstring);
                    sb2.append(" is not Serializable or Parcelable.");
                    throw new IllegalArgumentException(sb2.toString().toString());
                } catch (ClassNotFoundException e2) {
                    throw new RuntimeException(e2);
                }
            }
            return NavType.StringType;
        }

        public final NavType<?> parseSerializableOrParcelableType$navigation_common_release(Class<?> p0, boolean p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (Parcelable.class.isAssignableFrom(p0)) {
                if (p1) {
                    return new ParcelableArrayType(p0);
                }
                return new ParcelableType(p0);
            }
            if (Enum.class.isAssignableFrom(p0) && !p1) {
                return new EnumType(p0);
            }
            if (!Serializable.class.isAssignableFrom(p0)) {
                return null;
            }
            if (p1) {
                return new SerializableArrayType(p0);
            }
            return new SerializableType(p0);
        }

        @JvmStatic
        public final NavType<Object> inferFromValue(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return NavTypeKt.navTypeInferFromValue(p0);
        }

        @JvmStatic
        public final NavType<Object> inferFromValueType(Object p0) {
            NavType<Object> navTypeNavTypeInferFromValueType = NavTypeKt.navTypeInferFromValueType(p0);
            if (navTypeNavTypeInferFromValueType != null) {
                return navTypeNavTypeInferFromValueType;
            }
            if ((p0 instanceof Object[]) && (((Object[]) p0) instanceof String[])) {
                NavType<String[]> navType = NavType.StringArrayType;
                Intrinsics.checkNotNull(navType, "");
                return navType;
            }
            Intrinsics.checkNotNull(p0);
            if (p0.getClass().isArray()) {
                Class<?> componentType = p0.getClass().getComponentType();
                Intrinsics.checkNotNull(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType2 = p0.getClass().getComponentType();
                    Intrinsics.checkNotNull(componentType2, "");
                    return new ParcelableArrayType(componentType2);
                }
            }
            if (p0.getClass().isArray()) {
                Class<?> componentType3 = p0.getClass().getComponentType();
                Intrinsics.checkNotNull(componentType3);
                if (Serializable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = p0.getClass().getComponentType();
                    Intrinsics.checkNotNull(componentType4, "");
                    return new SerializableArrayType(componentType4);
                }
            }
            if (p0 instanceof Parcelable) {
                return new ParcelableType(p0.getClass());
            }
            if (p0 instanceof Enum) {
                return new EnumType(p0.getClass());
            }
            if (p0 instanceof Serializable) {
                return new SerializableType(p0.getClass());
            }
            StringBuilder sb = new StringBuilder("Object of type ");
            sb.append(p0.getClass().getName());
            sb.append(" is not supported for navigation arguments.");
            throw new IllegalArgumentException(sb.toString());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmStatic
    public static NavType<?> fromArgType(String str, String str2) {
        return INSTANCE.fromArgType(str, str2);
    }

    @JvmStatic
    public static final NavType<Object> inferFromValue(String str) {
        return INSTANCE.inferFromValue(str);
    }

    @JvmStatic
    public static final NavType<Object> inferFromValueType(Object obj) {
        return INSTANCE.inferFromValueType(obj);
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\r\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u000f\u001a\u0004\u0018\u00018\u00012\n\u0010\u0004\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0004\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/navigation/NavType$ParcelableType;", "D", "Landroidx/navigation/NavType;", "Ljava/lang/Class;", "p0", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "", "p1", "p2", "", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "parseValue", "(Ljava/lang/String;)Ljava/lang/Object;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "type", "Ljava/lang/Class;", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ParcelableType<D> extends NavType<D> {
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableType(Class<D> cls) {
            super(true);
            Intrinsics.checkNotNullParameter(cls, "");
            if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
                StringBuilder sb = new StringBuilder();
                sb.append(cls);
                sb.append(" does not implement Parcelable or Serializable.");
                throw new IllegalArgumentException(sb.toString().toString());
            }
            this.type = cls;
        }

        @Override // androidx.p005navigation.NavType
        public final String getName() {
            String name = this.type.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            return name;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.p005navigation.NavType
        public final void put(Bundle p0, String p1, D p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.type.cast(p2);
            if (p2 == 0 || (p2 instanceof Parcelable)) {
                p0.putParcelable(p1, (Parcelable) p2);
            } else if (p2 instanceof Serializable) {
                p0.putSerializable(p1, (Serializable) p2);
            }
        }

        @Override // androidx.p005navigation.NavType
        public final D get(Bundle p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            return (D) p0.get(p1);
        }

        @Override // androidx.p005navigation.NavType
        public final D parseValue(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (p0 == null || !Intrinsics.areEqual(getClass(), p0.getClass())) {
                return false;
            }
            return Intrinsics.areEqual(this.type, ((ParcelableType) p0).type);
        }

        public final int hashCode() {
            return this.type.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0006\u001a\u00060\tj\u0002`\n2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\n\u0010\u0006\u001a\u00060\tj\u0002`\n2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0006\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001c\u001a\u00020\u00162\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/navigation/NavType$ParcelableArrayType;", "Landroid/os/Parcelable;", "D", "Landroidx/navigation/NavType;", "", "Ljava/lang/Class;", "p0", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "", "p1", "p2", "", "put", "(Landroid/os/Bundle;Ljava/lang/String;[Landroid/os/Parcelable;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Parcelable;", "parseValue", "(Ljava/lang/String;)[Landroid/os/Parcelable;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "valueEquals", "([Landroid/os/Parcelable;[Landroid/os/Parcelable;)Z", "arrayType", "Ljava/lang/Class;", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ParcelableArrayType<D extends Parcelable> extends NavType<D[]> {
        private final Class<D[]> arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableArrayType(Class<D> cls) {
            super(true);
            Intrinsics.checkNotNullParameter(cls, "");
            if (!Parcelable.class.isAssignableFrom(cls)) {
                StringBuilder sb = new StringBuilder();
                sb.append(cls);
                sb.append(" does not implement Parcelable.");
                throw new IllegalArgumentException(sb.toString().toString());
            }
            try {
                StringBuilder sb2 = new StringBuilder("[L");
                sb2.append(cls.getName());
                sb2.append(';');
                Class<D[]> cls2 = (Class<D[]>) Class.forName(sb2.toString());
                Intrinsics.checkNotNull(cls2, "");
                this.arrayType = cls2;
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // androidx.p005navigation.NavType
        public final String getName() {
            String name = this.arrayType.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            return name;
        }

        @Override // androidx.p005navigation.NavType
        public final void put(Bundle p0, String p1, D[] p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.arrayType.cast(p2);
            p0.putParcelableArray(p1, p2);
        }

        @Override // androidx.p005navigation.NavType
        public final D[] get(Bundle p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            return (D[]) ((Parcelable[]) p0.get(p1));
        }

        @Override // androidx.p005navigation.NavType
        public final D[] parseValue(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (p0 == null || !Intrinsics.areEqual(getClass(), p0.getClass())) {
                return false;
            }
            return Intrinsics.areEqual(this.arrayType, ((ParcelableArrayType) p0).arrayType);
        }

        public final int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.p005navigation.NavType
        public final boolean valueEquals(D[] p0, D[] p1) {
            return ArraysKt.contentDeepEquals(p0, p1);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0017\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\nJ+\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0005\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0012\u001a\u0004\u0018\u00018\u00012\n\u0010\u0005\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\t\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/navigation/NavType$SerializableType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "Ljava/lang/Class;", "p0", "<init>", "(Ljava/lang/Class;)V", "", "p1", "(ZLjava/lang/Class;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "", "p2", "", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "parseValue", "(Ljava/lang/String;)Ljava/io/Serializable;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "type", "Ljava/lang/Class;", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class SerializableType<D extends Serializable> extends NavType<D> {
        private final Class<D> type;

        @Override // androidx.p005navigation.NavType
        public String getName() {
            String name = this.type.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            return name;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableType(Class<D> cls) {
            super(true);
            Intrinsics.checkNotNullParameter(cls, "");
            if (!Serializable.class.isAssignableFrom(cls)) {
                StringBuilder sb = new StringBuilder();
                sb.append(cls);
                sb.append(" does not implement Serializable.");
                throw new IllegalArgumentException(sb.toString().toString());
            }
            if (cls.isEnum()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls);
                sb2.append(" is an Enum. You should use EnumType instead.");
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            this.type = cls;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableType(boolean z, Class<D> cls) {
            super(z);
            Intrinsics.checkNotNullParameter(cls, "");
            if (!Serializable.class.isAssignableFrom(cls)) {
                StringBuilder sb = new StringBuilder();
                sb.append(cls);
                sb.append(" does not implement Serializable.");
                throw new IllegalArgumentException(sb.toString().toString());
            }
            this.type = cls;
        }

        @Override // androidx.p005navigation.NavType
        public void put(Bundle p0, String p1, D p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            this.type.cast(p2);
            p0.putSerializable(p1, p2);
        }

        @Override // androidx.p005navigation.NavType
        public D get(Bundle p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            return (D) p0.get(p1);
        }

        @Override // androidx.p005navigation.NavType
        public D parseValue(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (p0 instanceof SerializableType) {
                return Intrinsics.areEqual(this.type, ((SerializableType) p0).type);
            }
            return false;
        }

        public int hashCode() {
            return this.type.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000*\f\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\bH\u0017¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/navigation/NavType$EnumType;", "", "D", "Landroidx/navigation/NavType$SerializableType;", "Ljava/lang/Class;", "p0", "<init>", "(Ljava/lang/Class;)V", "", "parseValue", "(Ljava/lang/String;)Ljava/lang/Enum;", "type", "Ljava/lang/Class;", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EnumType<D extends Enum<?>> extends SerializableType<D> {
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumType(Class<D> cls) {
            super(false, cls);
            Intrinsics.checkNotNullParameter(cls, "");
            if (!cls.isEnum()) {
                StringBuilder sb = new StringBuilder();
                sb.append(cls);
                sb.append(" is not an Enum type.");
                throw new IllegalArgumentException(sb.toString().toString());
            }
            this.type = cls;
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.p005navigation.NavType
        public final String getName() {
            String name = this.type.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            return name;
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.p005navigation.NavType
        public final D parseValue(String p0) {
            D d;
            Intrinsics.checkNotNullParameter(p0, "");
            D[] enumConstants = this.type.getEnumConstants();
            Intrinsics.checkNotNullExpressionValue(enumConstants, "");
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    d = null;
                    break;
                }
                d = enumConstants[i];
                if (StringsKt.equals(d.name(), p0, true)) {
                    break;
                }
                i++;
            }
            D d2 = d;
            if (d2 != null) {
                return d2;
            }
            StringBuilder sb = new StringBuilder("Enum value ");
            sb.append(p0);
            sb.append(" not found for type ");
            sb.append(this.type.getName());
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0006\u001a\u00060\tj\u0002`\n2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\n\u0010\u0006\u001a\u00060\tj\u0002`\n2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0006\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001c\u001a\u00020\u00162\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/navigation/NavType$SerializableArrayType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "", "Ljava/lang/Class;", "p0", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "", "p1", "p2", "", "put", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/io/Serializable;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/io/Serializable;", "parseValue", "(Ljava/lang/String;)[Ljava/io/Serializable;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "valueEquals", "([Ljava/io/Serializable;[Ljava/io/Serializable;)Z", "arrayType", "Ljava/lang/Class;", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SerializableArrayType<D extends Serializable> extends NavType<D[]> {
        private final Class<D[]> arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableArrayType(Class<D> cls) {
            super(true);
            Intrinsics.checkNotNullParameter(cls, "");
            if (!Serializable.class.isAssignableFrom(cls)) {
                StringBuilder sb = new StringBuilder();
                sb.append(cls);
                sb.append(" does not implement Serializable.");
                throw new IllegalArgumentException(sb.toString().toString());
            }
            try {
                StringBuilder sb2 = new StringBuilder("[L");
                sb2.append(cls.getName());
                sb2.append(';');
                Class<D[]> cls2 = (Class<D[]>) Class.forName(sb2.toString());
                Intrinsics.checkNotNull(cls2, "");
                this.arrayType = cls2;
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // androidx.p005navigation.NavType
        public final String getName() {
            String name = this.arrayType.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            return name;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.p005navigation.NavType
        public final void put(Bundle p0, String p1, D[] p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.arrayType.cast(p2);
            p0.putSerializable(p1, (Serializable) p2);
        }

        @Override // androidx.p005navigation.NavType
        public final D[] get(Bundle p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            return (D[]) ((Serializable[]) p0.get(p1));
        }

        @Override // androidx.p005navigation.NavType
        public final D[] parseValue(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (p0 == null || !Intrinsics.areEqual(getClass(), p0.getClass())) {
                return false;
            }
            return Intrinsics.areEqual(this.arrayType, ((SerializableArrayType) p0).arrayType);
        }

        public final int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.p005navigation.NavType
        public final boolean valueEquals(D[] p0, D[] p1) {
            return ArraysKt.contentDeepEquals(p0, p1);
        }
    }
}
