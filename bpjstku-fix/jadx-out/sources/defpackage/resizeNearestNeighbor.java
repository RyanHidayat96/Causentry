package defpackage;

import com.datadog.android.api.InternalLogger;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class resizeNearestNeighbor {
    public static final JsonElement TuitionPaymentFragmentspecialinlinedviewModeldefault1(Iterable<?> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        JsonArray jsonArray = new JsonArray();
        for (Object obj : iterable) {
            toBitmap tobitmap = toBitmap.INSTANCE;
            jsonArray.add(toBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj));
        }
        return jsonArray;
    }

    public static final JsonElement b(Map<?, ?> map) {
        Intrinsics.checkNotNullParameter(map, "");
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            String strValueOf = String.valueOf(entry.getKey());
            toBitmap tobitmap = toBitmap.INSTANCE;
            jsonObject.add(strValueOf, toBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3(entry.getValue()));
        }
        return jsonObject;
    }

    public static final JsonElement TuitionPaymentFragmentspecialinlinedviewModeldefault2(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        JsonObject jsonObject = new JsonObject();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            toBitmap tobitmap = toBitmap.INSTANCE;
            jsonObject.add(next, toBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jSONObject.get(next)));
        }
        return jsonObject;
    }

    public static final JsonElement b(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "");
        JsonArray jsonArray = new JsonArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            toBitmap tobitmap = toBitmap.INSTANCE;
            jsonArray.add(toBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jSONArray.get(i)));
        }
        return jsonArray;
    }

    public static final boolean b(long j, InternalLogger internalLogger, Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(function0, "");
        long jNanoTime = System.nanoTime() - j;
        int i = 1;
        boolean zBooleanValue = false;
        while (i <= 3 && !zBooleanValue) {
            if (System.nanoTime() - jNanoTime >= j) {
                try {
                    zBooleanValue = function0.invoke().booleanValue();
                    jNanoTime = System.nanoTime();
                    i++;
                } catch (Exception e2) {
                    internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.utils.MiscUtilsKt$retryWithDelay$1
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            return "Internal I/O operation failed";
                        }
                    }, e2, false, null);
                    return false;
                }
            }
        }
        return zBooleanValue;
    }
}
