package defpackage;

import com.datadog.android.api.InternalLogger;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b*\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\u0006\u0010\u0004\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"LtoBitmap;", "", "<init>", "()V", "p0", "Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/Object;)Lcom/google/gson/JsonElement;", "", "", "Lcom/datadog/android/api/InternalLogger;", "TuitionPaymentFragmentbindingInflater1", "(Ljava/util/Map;Lcom/datadog/android/api/InternalLogger;)Ljava/util/Map;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class toBitmap {
    public static final toBitmap INSTANCE = new toBitmap();

    private toBitmap() {
    }

    public static JsonElement TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object p0) {
        if (Intrinsics.areEqual(p0, createPlaneProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2())) {
            JsonNull jsonNull = JsonNull.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(jsonNull, "");
            return jsonNull;
        }
        if (p0 == null) {
            JsonNull jsonNull2 = JsonNull.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(jsonNull2, "");
            return jsonNull2;
        }
        if (Intrinsics.areEqual(p0, JsonNull.INSTANCE)) {
            JsonNull jsonNull3 = JsonNull.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(jsonNull3, "");
            return jsonNull3;
        }
        if (p0 instanceof Boolean) {
            return new JsonPrimitive((Boolean) p0);
        }
        if (!(p0 instanceof Integer) && !(p0 instanceof Long) && !(p0 instanceof Float) && !(p0 instanceof Double)) {
            if (p0 instanceof String) {
                return new JsonPrimitive((String) p0);
            }
            if (p0 instanceof Date) {
                return new JsonPrimitive(Long.valueOf(((Date) p0).getTime()));
            }
            if (p0 instanceof JsonArray) {
                return (JsonElement) p0;
            }
            if (p0 instanceof Iterable) {
                return resizeNearestNeighbor.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Iterable) p0);
            }
            if (p0 instanceof Map) {
                return resizeNearestNeighbor.b((Map<?, ?>) p0);
            }
            if (!(p0 instanceof JsonObject) && !(p0 instanceof JsonPrimitive)) {
                if (p0 instanceof JSONObject) {
                    return resizeNearestNeighbor.TuitionPaymentFragmentspecialinlinedviewModeldefault2((JSONObject) p0);
                }
                return p0 instanceof JSONArray ? resizeNearestNeighbor.b((JSONArray) p0) : new JsonPrimitive(p0.toString());
            }
            return (JsonElement) p0;
        }
        return new JsonPrimitive((Number) p0);
    }

    public static Map<String, JsonElement> TuitionPaymentFragmentbindingInflater1(Map<String, ? extends Object> map, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (final Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            try {
                Pair pair = TuplesKt.to(entry.getKey(), TuitionPaymentFragmentspecialinlinedviewModeldefault3(entry.getValue()));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            } catch (Exception e2) {
                internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.utils.JsonSerializer$safeMapValuesToJson$1$1
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        String str = String.format(Locale.US, "Error serializing value for key %s, value was dropped.", Arrays.copyOf(new Object[]{entry.getKey()}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        return str;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, e2, false, null);
            }
        }
        return linkedHashMap;
    }
}
