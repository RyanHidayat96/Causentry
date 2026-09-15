package androidx.work;

import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 N2\u00020\u0001:\u0002ONB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0010\u0012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0003\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u001d\u0010*\u001a\u00020)2\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.J,\u00100\u001a\u00028\u0000\"\n\b\u0000\u0010/\u0018\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0082\b¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b2\u00103J\u001d\u00105\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001042\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b5\u00106Ja\u0010;\u001a\u0004\u0018\u00018\u0001\"\n\b\u0000\u0010/\u0018\u0001*\u00020\u0001\"\u0004\b\u0001\u001072\u0006\u0010\u0002\u001a\u00020\u000623\u0010\u000b\u001a/\u0012\t\u0012\u00070#¢\u0006\u0002\b9\u0012\u001a\u0012\u0018\u0012\t\u0012\u00070#¢\u0006\u0002\b9\u0012\u0004\u0012\u00028\u00000:¢\u0006\u0002\b9\u0012\u0004\u0012\u00028\u000108H\u0082\b¢\u0006\u0004\b;\u0010<J \u0010=\u001a\u00020\b\"\u0006\b\u0000\u0010/\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0006H\u0080\b¢\u0006\u0004\b=\u0010>J)\u0010@\u001a\u00020\b\"\u0004\b\u0000\u0010/2\u0006\u0010\u0002\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000?¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020#H\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020#H\u0007¢\u0006\u0004\bD\u0010CJ\u000f\u0010E\u001a\u00020\u0014H\u0007¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0006H\u0017¢\u0006\u0004\bG\u0010HR\u001f\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058G¢\u0006\u0006\u001a\u0004\bI\u0010JR\"\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bL\u0010M"}, d2 = {"Landroidx/work/Data;", "", "p0", "<init>", "(Landroidx/work/Data;)V", "", "", "(Ljava/util/Map;)V", "", "equals", "(Ljava/lang/Object;)Z", "p1", "getBoolean", "(Ljava/lang/String;Z)Z", "", "getBooleanArray", "(Ljava/lang/String;)[Z", "", "getByte", "(Ljava/lang/String;B)B", "", "getByteArray", "(Ljava/lang/String;)[B", "", "getDouble", "(Ljava/lang/String;D)D", "", "getDoubleArray", "(Ljava/lang/String;)[D", "", "getFloat", "(Ljava/lang/String;F)F", "", "getFloatArray", "(Ljava/lang/String;)[F", "", "getInt", "(Ljava/lang/String;I)I", "", "getIntArray", "(Ljava/lang/String;)[I", "", "getLong", "(Ljava/lang/String;J)J", "", "getLongArray", "(Ljava/lang/String;)[J", ExifInterface.GPS_DIRECTION_TRUE, "getOrDefault", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getString", "(Ljava/lang/String;)Ljava/lang/String;", "", "getStringArray", "(Ljava/lang/String;)[Ljava/lang/String;", "TArray", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "Lkotlin/Function1;", "getTypedArray", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "hasKey$work_runtime_release", "(Ljava/lang/String;)Z", "Ljava/lang/Class;", "hasKeyWithValueOfType", "(Ljava/lang/String;Ljava/lang/Class;)Z", "hashCode", "()I", "size", "toByteArray", "()[B", "toString", "()Ljava/lang/String;", "getKeyValueMap", "()Ljava/util/Map;", "keyValueMap", "values", "Ljava/util/Map;", "Companion", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Data {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Data EMPTY = new Builder().build();
    public static final int MAX_DATA_BYTES = 10240;
    private static final String NULL_STRING_V1 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
    private static final short STREAM_MAGIC = -21521;
    private static final short STREAM_VERSION = 1;
    private static final byte TYPE_BOOLEAN = 1;
    private static final byte TYPE_BOOLEAN_ARRAY = 8;
    private static final byte TYPE_BYTE = 2;
    private static final byte TYPE_BYTE_ARRAY = 9;
    private static final byte TYPE_DOUBLE = 6;
    private static final byte TYPE_DOUBLE_ARRAY = 13;
    private static final byte TYPE_FLOAT = 5;
    private static final byte TYPE_FLOAT_ARRAY = 12;
    private static final byte TYPE_INTEGER = 3;
    private static final byte TYPE_INTEGER_ARRAY = 10;
    private static final byte TYPE_LONG = 4;
    private static final byte TYPE_LONG_ARRAY = 11;
    private static final byte TYPE_NULL = 0;
    private static final byte TYPE_STRING = 7;
    private static final byte TYPE_STRING_ARRAY = 14;
    private final Map<String, Object> values;

    public Data(Data data) {
        Intrinsics.checkNotNullParameter(data, "");
        this.values = new HashMap(data.values);
    }

    public Data(Map<String, ?> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.values = new HashMap(map);
    }

    private final /* synthetic */ <T> T getOrDefault(String p0, T p1) {
        T t = (T) this.values.get(p0);
        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
        return t instanceof Object ? t : p1;
    }

    private final /* synthetic */ <T, TArray> TArray getTypedArray(String p0, Function2<? super Integer, ? super Function1<? super Integer, ? extends T>, ? extends TArray> p1) {
        final Object obj = this.values.get(p0);
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (!(objArr instanceof Object[])) {
            return null;
        }
        int length = objArr.length;
        Intrinsics.needClassReification();
        return p1.invoke(Integer.valueOf(length), new Function1<Integer, T>() { // from class: androidx.work.Data.getTypedArray.1
            public final T invoke(int i) {
                T t = (T) ((Object[]) obj)[i];
                Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
                return t;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    public final boolean getBoolean(String p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object objValueOf = Boolean.valueOf(p1);
        Object obj = this.values.get(p0);
        if (obj instanceof Boolean) {
            objValueOf = obj;
        }
        return ((Boolean) objValueOf).booleanValue();
    }

    public final byte getByte(String p0, byte p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object objValueOf = Byte.valueOf(p1);
        Object obj = this.values.get(p0);
        if (obj instanceof Byte) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).byteValue();
    }

    public final int getInt(String p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object objValueOf = Integer.valueOf(p1);
        Object obj = this.values.get(p0);
        if (obj instanceof Integer) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).intValue();
    }

    public final long getLong(String p0, long p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object objValueOf = Long.valueOf(p1);
        Object obj = this.values.get(p0);
        if (obj instanceof Long) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).longValue();
    }

    public final float getFloat(String p0, float p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object objValueOf = Float.valueOf(p1);
        Object obj = this.values.get(p0);
        if (obj instanceof Float) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).floatValue();
    }

    public final double getDouble(String p0, double p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object objValueOf = Double.valueOf(p1);
        Object obj = this.values.get(p0);
        if (obj instanceof Double) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).doubleValue();
    }

    public final String getString(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object obj = this.values.get(p0);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final Map<String, Object> getKeyValueMap() {
        Map<String, Object> mapUnmodifiableMap = Collections.unmodifiableMap(this.values);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "");
        return mapUnmodifiableMap;
    }

    public final byte[] toByteArray() {
        return INSTANCE.toByteArrayInternalV1(this);
    }

    public final <T> boolean hasKeyWithValueOfType(String p0, Class<T> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Object obj = this.values.get(p0);
        return obj != null && p1.isAssignableFrom(obj.getClass());
    }

    public final /* synthetic */ <T> boolean hasKey$work_runtime_release(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return hasKeyWithValueOfType(p0, Object.class);
    }

    public final int size() {
        return this.values.size();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    public final boolean equals(Object p0) {
        boolean zAreEqual;
        if (this == p0) {
            return true;
        }
        if (p0 == null || !Intrinsics.areEqual(getClass(), p0.getClass())) {
            return false;
        }
        Data data = (Data) p0;
        Set<String> setKeySet = this.values.keySet();
        if (!Intrinsics.areEqual(setKeySet, data.values.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj = this.values.get(str);
            Object obj2 = data.values.get(str);
            if (obj == null || obj2 == null) {
                if (obj != obj2) {
                    return false;
                }
            } else {
                if (obj instanceof Object[]) {
                    Object[] objArr = (Object[]) obj;
                    if ((objArr instanceof Object[]) && (obj2 instanceof Object[])) {
                        Object[] objArr2 = (Object[]) obj2;
                        if (objArr2 instanceof Object[]) {
                            zAreEqual = ArraysKt.contentDeepEquals(objArr, objArr2);
                        } else {
                            zAreEqual = Intrinsics.areEqual(obj, obj2);
                        }
                    } else {
                        zAreEqual = Intrinsics.areEqual(obj, obj2);
                    }
                } else {
                    zAreEqual = Intrinsics.areEqual(obj, obj2);
                }
                if (!zAreEqual) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 0;
        for (Map.Entry<String, Object> entry : this.values.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Object[]) {
                iHashCode = Objects.hashCode(entry.getKey()) ^ ArraysKt.contentDeepHashCode((Object[]) value);
            } else {
                iHashCode = entry.hashCode();
            }
            i += iHashCode;
        }
        return i * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        sb.append(CollectionsKt.joinToString$default(this.values.entrySet(), null, null, null, 0, null, new Function1<Map.Entry<? extends String, ? extends Object>, CharSequence>() { // from class: androidx.work.Data$toString$1$content$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final CharSequence invoke2(Map.Entry<String, ? extends Object> entry) {
                Intrinsics.checkNotNullParameter(entry, "");
                String key = entry.getKey();
                Object value = entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(key);
                sb2.append(" : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    Intrinsics.checkNotNullExpressionValue(value, "");
                }
                sb2.append(value);
                return sb2.toString();
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends Object> entry) {
                return invoke2((Map.Entry<String, ? extends Object>) entry);
            }
        }, 31, null));
        sb.append("}");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\f\u001a\u00020\u00002\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0007¢\u0006\u0004\b\f\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u000bJ\u001f\u0010\u001e\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020 H\u0007¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020#H\u0007¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020&H\u0007¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020)H\u0007¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020,H\u0007¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020/H\u0007¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u000202H\u0007¢\u0006\u0004\b3\u00104J!\u00105\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b5\u00106J'\u00108\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000707H\u0007¢\u0006\u0004\b8\u00109R\"\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010:8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<"}, d2 = {"Landroidx/work/Data$Builder;", "", "<init>", "()V", "Landroidx/work/Data;", "build", "()Landroidx/work/Data;", "", "p0", "p1", "put", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;", "putAll", "(Landroidx/work/Data;)Landroidx/work/Data$Builder;", "", "(Ljava/util/Map;)Landroidx/work/Data$Builder;", "", "putBoolean", "(Ljava/lang/String;Z)Landroidx/work/Data$Builder;", "", "putBooleanArray", "(Ljava/lang/String;[Z)Landroidx/work/Data$Builder;", "", "putByte", "(Ljava/lang/String;B)Landroidx/work/Data$Builder;", "", "putByteArray", "(Ljava/lang/String;[B)Landroidx/work/Data$Builder;", "putDirect", "", "putDouble", "(Ljava/lang/String;D)Landroidx/work/Data$Builder;", "", "putDoubleArray", "(Ljava/lang/String;[D)Landroidx/work/Data$Builder;", "", "putFloat", "(Ljava/lang/String;F)Landroidx/work/Data$Builder;", "", "putFloatArray", "(Ljava/lang/String;[F)Landroidx/work/Data$Builder;", "", "putInt", "(Ljava/lang/String;I)Landroidx/work/Data$Builder;", "", "putIntArray", "(Ljava/lang/String;[I)Landroidx/work/Data$Builder;", "", "putLong", "(Ljava/lang/String;J)Landroidx/work/Data$Builder;", "", "putLongArray", "(Ljava/lang/String;[J)Landroidx/work/Data$Builder;", "putString", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/Data$Builder;", "", "putStringArray", "(Ljava/lang/String;[Ljava/lang/String;)Landroidx/work/Data$Builder;", "", "values", "Ljava/util/Map;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private final Map<String, Object> values = new LinkedHashMap();

        private final Builder putDirect(String p0, Object p1) {
            this.values.put(p0, p1);
            return this;
        }

        public final Builder putBoolean(String p0, boolean p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            return putDirect(p0, Boolean.valueOf(p1));
        }

        public final Builder putBooleanArray(String p0, boolean[] p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.values.put(p0, Data_Kt.convertPrimitiveArray(p1));
            return this;
        }

        public final Builder putByte(String p0, byte p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            return putDirect(p0, Byte.valueOf(p1));
        }

        public final Builder putByteArray(String p0, byte[] p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.values.put(p0, Data_Kt.convertPrimitiveArray(p1));
            return this;
        }

        public final Builder putInt(String p0, int p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            return putDirect(p0, Integer.valueOf(p1));
        }

        public final Builder putIntArray(String p0, int[] p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.values.put(p0, Data_Kt.convertPrimitiveArray(p1));
            return this;
        }

        public final Builder putLong(String p0, long p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            return putDirect(p0, Long.valueOf(p1));
        }

        public final Builder putLongArray(String p0, long[] p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.values.put(p0, Data_Kt.convertPrimitiveArray(p1));
            return this;
        }

        public final Builder putFloat(String p0, float p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            return putDirect(p0, Float.valueOf(p1));
        }

        public final Builder putFloatArray(String p0, float[] p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.values.put(p0, Data_Kt.convertPrimitiveArray(p1));
            return this;
        }

        public final Builder putDouble(String p0, double p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            return putDirect(p0, Double.valueOf(p1));
        }

        public final Builder putDoubleArray(String p0, double[] p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.values.put(p0, Data_Kt.convertPrimitiveArray(p1));
            return this;
        }

        public final Builder putString(String p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            return putDirect(p0, p1);
        }

        public final Builder putStringArray(String p0, String[] p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            return putDirect(p0, p1);
        }

        public final Builder putAll(Data p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            putAll(p0.values);
            return this;
        }

        public final Builder put(String p0, Object p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Map<String, Object> map = this.values;
            if (p1 == null) {
                p1 = null;
            } else {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(p1.getClass());
                if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte.TYPE)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean[].class)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte[].class)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer[].class)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long[].class)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float[].class)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double[].class)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String[].class))) {
                    if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(boolean[].class))) {
                        p1 = Data_Kt.convertPrimitiveArray((boolean[]) p1);
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(byte[].class))) {
                        p1 = Data_Kt.convertPrimitiveArray((byte[]) p1);
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(int[].class))) {
                        p1 = Data_Kt.convertPrimitiveArray((int[]) p1);
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(long[].class))) {
                        p1 = Data_Kt.convertPrimitiveArray((long[]) p1);
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(float[].class))) {
                        p1 = Data_Kt.convertPrimitiveArray((float[]) p1);
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(double[].class))) {
                        p1 = Data_Kt.convertPrimitiveArray((double[]) p1);
                    } else {
                        StringBuilder sb = new StringBuilder("Key ");
                        sb.append(p0);
                        sb.append(" has invalid type ");
                        sb.append(orCreateKotlinClass);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
            map.put(p0, p1);
            return this;
        }

        public final Data build() {
            Data data = new Data((Map<String, ?>) this.values);
            Data.INSTANCE.toByteArrayInternalV1(data);
            return data;
        }

        public final Builder putAll(Map<String, ? extends Object> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            for (Map.Entry<String, ? extends Object> entry : p0.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0010\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00188\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00188\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00188\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0014\u0010 \u001a\u00020\u00188\u0002X\u0083T¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0014\u0010!\u001a\u00020\u00188\u0002X\u0083T¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0014\u0010\"\u001a\u00020\u00188\u0002X\u0083T¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u0014\u0010#\u001a\u00020\u00188\u0002X\u0083T¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u0014\u0010$\u001a\u00020\u00188\u0002X\u0083T¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u0014\u0010%\u001a\u00020\u00188\u0002X\u0083T¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u0014\u0010&\u001a\u00020\u00188\u0002X\u0083T¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\u00020\u00188\u0002X\u0083T¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u0014\u0010(\u001a\u00020\u00188\u0002X\u0083T¢\u0006\u0006\n\u0004\b(\u0010\u001a"}, d2 = {"Landroidx/work/Data$Companion;", "", "<init>", "()V", "", "p0", "Landroidx/work/Data;", "fromByteArray", "([B)Landroidx/work/Data;", "toByteArrayInternalV0", "(Landroidx/work/Data;)[B", "toByteArrayInternalV1", "EMPTY", "Landroidx/work/Data;", "", "MAX_DATA_BYTES", "I", "", "NULL_STRING_V1", "Ljava/lang/String;", "", "STREAM_MAGIC", ExifInterface.LATITUDE_SOUTH, "STREAM_VERSION", "", "TYPE_BOOLEAN", "B", "TYPE_BOOLEAN_ARRAY", "TYPE_BYTE", "TYPE_BYTE_ARRAY", "TYPE_DOUBLE", "TYPE_DOUBLE_ARRAY", "TYPE_FLOAT", "TYPE_FLOAT_ARRAY", "TYPE_INTEGER", "TYPE_INTEGER_ARRAY", "TYPE_LONG", "TYPE_LONG_ARRAY", "TYPE_NULL", "TYPE_STRING", "TYPE_STRING_ARRAY"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @Deprecated(message = "This is kept for testing migration", replaceWith = @ReplaceWith(expression = "toByteArrayInternalV1", imports = {}))
        @JvmStatic
        public final byte[] toByteArrayInternalV0(Data p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream2);
                    try {
                        ObjectOutputStream objectOutputStream2 = objectOutputStream;
                        objectOutputStream2.writeInt(p0.size());
                        for (Map.Entry entry : p0.values.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            objectOutputStream2.writeUTF(str);
                            objectOutputStream2.writeObject(value);
                        }
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(objectOutputStream, null);
                        CloseableKt.closeFinally(byteArrayOutputStream, null);
                        if (byteArrayOutputStream2.size() > 10240) {
                            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                        }
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        Intrinsics.checkNotNullExpressionValue(byteArray, "");
                        return byteArray;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(objectOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(byteArrayOutputStream, th3);
                        throw th4;
                    }
                }
            } catch (IOException e2) {
                Logger.get().error(Data_Kt.TAG, "Error in Data#toByteArray: ", e2);
                return new byte[0];
            }
        }

        private static final void toByteArrayInternalV1$writeHeader(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
        }

        private static final void toByteArrayInternalV1$writeArray(DataOutputStream dataOutputStream, Object[] objArr) throws IOException {
            int i;
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(objArr.getClass());
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean[].class))) {
                i = 8;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte[].class))) {
                i = 9;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer[].class))) {
                i = 10;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long[].class))) {
                i = 11;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float[].class))) {
                i = 12;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double[].class))) {
                i = 13;
            } else {
                if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String[].class))) {
                    StringBuilder sb = new StringBuilder("Unsupported value type ");
                    sb.append(Reflection.getOrCreateKotlinClass(objArr.getClass()).getQualifiedName());
                    throw new IllegalArgumentException(sb.toString());
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj : objArr) {
                if (i == 8) {
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i == 9) {
                    Byte b = obj instanceof Byte ? (Byte) obj : null;
                    dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    Long l = obj instanceof Long ? (Long) obj : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i == 12) {
                    Float f = obj instanceof Float ? (Float) obj : null;
                    dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                } else if (i == 13) {
                    Double d = obj instanceof Double ? (Double) obj : null;
                    dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                } else if (i == 14) {
                    String str = obj instanceof String ? (String) obj : null;
                    if (str == null) {
                        str = Data.NULL_STRING_V1;
                    }
                    dataOutputStream.writeUTF(str);
                }
            }
        }

        private static final void toByteArrayInternalV1$writeEntry(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else if (obj instanceof Object[]) {
                toByteArrayInternalV1$writeArray(dataOutputStream, (Object[]) obj);
            } else {
                StringBuilder sb = new StringBuilder("Unsupported value type ");
                sb.append(Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName());
                throw new IllegalArgumentException(sb.toString());
            }
            dataOutputStream.writeUTF(str);
        }

        @JvmStatic
        public final byte[] toByteArrayInternalV1(Data p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    DataOutputStream dataOutputStream2 = dataOutputStream;
                    toByteArrayInternalV1$writeHeader(dataOutputStream2);
                    dataOutputStream2.writeInt(p0.size());
                    for (Map.Entry entry : p0.values.entrySet()) {
                        toByteArrayInternalV1$writeEntry(dataOutputStream2, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream2.flush();
                    if (dataOutputStream2.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized".toString());
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    CloseableKt.closeFinally(dataOutputStream, null);
                    Intrinsics.checkNotNullExpressionValue(byteArray, "");
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(dataOutputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e2) {
                Logger.get().error(Data_Kt.TAG, "Error in Data#toByteArray: ", e2);
                return new byte[0];
            }
        }

        private static final boolean fromByteArray$isObjectStream(ByteArrayInputStream byteArrayInputStream) throws IOException {
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            boolean z = false;
            if (bArr[0] == -84 && bArr[1] == -19) {
                z = true;
            }
            byteArrayInputStream.reset();
            return z;
        }

        private static final void fromByteArray$readHeader(DataInputStream dataInputStream) throws IOException {
            short s = dataInputStream.readShort();
            if (s != -21521) {
                throw new IllegalStateException("Magic number doesn't match: ".concat(String.valueOf((int) s)).toString());
            }
            short s2 = dataInputStream.readShort();
            if (s2 != 1) {
                throw new IllegalStateException("Unsupported version number: ".concat(String.valueOf((int) s2)).toString());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static final Object fromByteArray$readValue(DataInputStream dataInputStream, byte b) throws IOException {
            if (b == 0) {
                return null;
            }
            if (b == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b == 7) {
                return dataInputStream.readUTF();
            }
            int i = 0;
            if (b == 8) {
                int i2 = dataInputStream.readInt();
                Boolean[] boolArr = new Boolean[i2];
                while (i < i2) {
                    boolArr[i] = Boolean.valueOf(dataInputStream.readBoolean());
                    i++;
                }
                return (Serializable) boolArr;
            }
            if (b == 9) {
                int i3 = dataInputStream.readInt();
                Byte[] bArr = new Byte[i3];
                while (i < i3) {
                    bArr[i] = Byte.valueOf(dataInputStream.readByte());
                    i++;
                }
                return (Serializable) bArr;
            }
            if (b == 10) {
                int i4 = dataInputStream.readInt();
                Integer[] numArr = new Integer[i4];
                while (i < i4) {
                    numArr[i] = Integer.valueOf(dataInputStream.readInt());
                    i++;
                }
                return (Serializable) numArr;
            }
            if (b == 11) {
                int i5 = dataInputStream.readInt();
                Long[] lArr = new Long[i5];
                while (i < i5) {
                    lArr[i] = Long.valueOf(dataInputStream.readLong());
                    i++;
                }
                return (Serializable) lArr;
            }
            if (b == 12) {
                int i6 = dataInputStream.readInt();
                Float[] fArr = new Float[i6];
                while (i < i6) {
                    fArr[i] = Float.valueOf(dataInputStream.readFloat());
                    i++;
                }
                return (Serializable) fArr;
            }
            if (b == 13) {
                int i7 = dataInputStream.readInt();
                Double[] dArr = new Double[i7];
                while (i < i7) {
                    dArr[i] = Double.valueOf(dataInputStream.readDouble());
                    i++;
                }
                return (Serializable) dArr;
            }
            if (b == 14) {
                int i8 = dataInputStream.readInt();
                String[] strArr = new String[i8];
                while (i < i8) {
                    String utf = dataInputStream.readUTF();
                    if (Intrinsics.areEqual(utf, Data.NULL_STRING_V1)) {
                        utf = null;
                    }
                    strArr[i] = utf;
                    i++;
                }
                return (Serializable) strArr;
            }
            throw new IllegalStateException("Unsupported type ".concat(String.valueOf((int) b)));
        }

        @JvmStatic
        public final Data fromByteArray(byte[] p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.length > 10240) {
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized".toString());
            }
            if (p0.length == 0) {
                return Data.EMPTY;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(p0);
                int i = 0;
                if (fromByteArray$isObjectStream(byteArrayInputStream)) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        ObjectInputStream objectInputStream2 = objectInputStream;
                        int i2 = objectInputStream2.readInt();
                        while (i < i2) {
                            String utf = objectInputStream2.readUTF();
                            Intrinsics.checkNotNullExpressionValue(utf, "");
                            linkedHashMap.put(utf, objectInputStream2.readObject());
                            i++;
                        }
                        CloseableKt.closeFinally(objectInputStream, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(objectInputStream, th);
                            throw th2;
                        }
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        DataInputStream dataInputStream2 = dataInputStream;
                        fromByteArray$readHeader(dataInputStream2);
                        int i3 = dataInputStream2.readInt();
                        while (i < i3) {
                            Object objFromByteArray$readValue = fromByteArray$readValue(dataInputStream2, dataInputStream2.readByte());
                            String utf2 = dataInputStream2.readUTF();
                            Intrinsics.checkNotNullExpressionValue(utf2, "");
                            linkedHashMap.put(utf2, objFromByteArray$readValue);
                            i++;
                        }
                        CloseableKt.closeFinally(dataInputStream, null);
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            CloseableKt.closeFinally(dataInputStream, th3);
                            throw th4;
                        }
                    }
                }
            } catch (IOException e2) {
                Logger.get().error(Data_Kt.TAG, "Error in Data#fromByteArray: ", e2);
            } catch (ClassNotFoundException e3) {
                Logger.get().error(Data_Kt.TAG, "Error in Data#fromByteArray: ", e3);
            }
            return new Data(linkedHashMap);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean[] getBooleanArray(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        final Object obj = this.values.get(p0);
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (!(objArr instanceof Object[])) {
            return null;
        }
        int length = objArr.length;
        Function1<Integer, Boolean> function1 = new Function1<Integer, Boolean>() { // from class: androidx.work.Data$getBooleanArray$$inlined$getTypedArray$1
            public final Boolean invoke(int i) {
                Object obj2 = ((Object[]) obj)[i];
                if (obj2 != null) {
                    return (Boolean) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Boolean, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                return invoke(num.intValue());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        };
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = function1.invoke(Integer.valueOf(i)).booleanValue();
        }
        return zArr;
    }

    public final byte[] getByteArray(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        final Object obj = this.values.get(p0);
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (!(objArr instanceof Object[])) {
            return null;
        }
        int length = objArr.length;
        Function1<Integer, Byte> function1 = new Function1<Integer, Byte>() { // from class: androidx.work.Data$getByteArray$$inlined$getTypedArray$1
            public final Byte invoke(int i) {
                Object obj2 = ((Object[]) obj)[i];
                if (obj2 != null) {
                    return (Byte) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Byte");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Byte, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Byte invoke(Integer num) {
                return invoke(num.intValue());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        };
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = function1.invoke(Integer.valueOf(i)).byteValue();
        }
        return bArr;
    }

    public final int[] getIntArray(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        final Object obj = this.values.get(p0);
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (!(objArr instanceof Object[])) {
            return null;
        }
        int length = objArr.length;
        Function1<Integer, Integer> function1 = new Function1<Integer, Integer>() { // from class: androidx.work.Data$getIntArray$$inlined$getTypedArray$1
            public final Integer invoke(int i) {
                Object obj2 = ((Object[]) obj)[i];
                if (obj2 != null) {
                    return (Integer) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Integer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        };
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = function1.invoke(Integer.valueOf(i)).intValue();
        }
        return iArr;
    }

    public final long[] getLongArray(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        final Object obj = this.values.get(p0);
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (!(objArr instanceof Object[])) {
            return null;
        }
        int length = objArr.length;
        Function1<Integer, Long> function1 = new Function1<Integer, Long>() { // from class: androidx.work.Data$getLongArray$$inlined$getTypedArray$1
            public final Long invoke(int i) {
                Object obj2 = ((Object[]) obj)[i];
                if (obj2 != null) {
                    return (Long) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Long, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Long invoke(Integer num) {
                return invoke(num.intValue());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        };
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = function1.invoke(Integer.valueOf(i)).longValue();
        }
        return jArr;
    }

    public final float[] getFloatArray(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        final Object obj = this.values.get(p0);
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (!(objArr instanceof Object[])) {
            return null;
        }
        int length = objArr.length;
        Function1<Integer, Float> function1 = new Function1<Integer, Float>() { // from class: androidx.work.Data$getFloatArray$$inlined$getTypedArray$1
            public final Float invoke(int i) {
                Object obj2 = ((Object[]) obj)[i];
                if (obj2 != null) {
                    return (Float) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Float, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Float invoke(Integer num) {
                return invoke(num.intValue());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        };
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = function1.invoke(Integer.valueOf(i)).floatValue();
        }
        return fArr;
    }

    public final double[] getDoubleArray(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        final Object obj = this.values.get(p0);
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (!(objArr instanceof Object[])) {
            return null;
        }
        int length = objArr.length;
        Function1<Integer, Double> function1 = new Function1<Integer, Double>() { // from class: androidx.work.Data$getDoubleArray$$inlined$getTypedArray$1
            public final Double invoke(int i) {
                Object obj2 = ((Object[]) obj)[i];
                if (obj2 != null) {
                    return (Double) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Double");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Double, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Double invoke(Integer num) {
                return invoke(num.intValue());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        };
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = function1.invoke(Integer.valueOf(i)).doubleValue();
        }
        return dArr;
    }

    public final String[] getStringArray(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        final Object obj = this.values.get(p0);
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (!(objArr instanceof Object[])) {
            return null;
        }
        int length = objArr.length;
        Function1<Integer, String> function1 = new Function1<Integer, String>() { // from class: androidx.work.Data$getStringArray$$inlined$getTypedArray$1
            public final String invoke(int i) {
                Object obj2 = ((Object[]) obj)[i];
                if (obj2 != null) {
                    return (String) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.lang.String] */
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ String invoke(Integer num) {
                return invoke(num.intValue());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        };
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = function1.invoke(Integer.valueOf(i));
        }
        return strArr;
    }

    @JvmStatic
    public static final Data fromByteArray(byte[] bArr) {
        return INSTANCE.fromByteArray(bArr);
    }

    @Deprecated(message = "This is kept for testing migration", replaceWith = @ReplaceWith(expression = "toByteArrayInternalV1", imports = {}))
    @JvmStatic
    public static final byte[] toByteArrayInternalV0(Data data) {
        return INSTANCE.toByteArrayInternalV0(data);
    }

    @JvmStatic
    public static final byte[] toByteArrayInternalV1(Data data) {
        return INSTANCE.toByteArrayInternalV1(data);
    }
}
