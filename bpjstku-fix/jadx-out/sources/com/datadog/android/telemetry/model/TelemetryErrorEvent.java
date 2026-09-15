package com.datadog.android.telemetry.model;

import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.Constants;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import defpackage.toBitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u000b(&+$ 03.<,2By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\"\u0010#R\u0013\u0010$\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\u0006\n\u0004\b$\u0010%R\u0013\u0010&\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\u0006\n\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010*R\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010,\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00103\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00105R\u0014\u0010.\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0006\n\u0004\b6\u0010/R\u0014\u00108\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010/R\u0016\u0010;\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010:"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent;", "", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "p0", "", "p1", "", "p2", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;", "p3", "p4", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "p5", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$g;", "p6", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$d;", "p7", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentbindingInflater1;", "p8", "", "p9", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$asInterface;", "p10", "<init>", "(Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;JLjava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;Ljava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$g;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$d;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentbindingInflater1;Ljava/util/List;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$asInterface;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentbindingInflater1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "TuitionPaymentFragmentbindingInflater1", "J", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "b", "asInterface", "Ljava/util/List;", "g", "Ljava/lang/String;", "a", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$g;", "d", "asBinder", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$asInterface;", "onTransact", "INotificationSideChannel", "cancelAll", "cancel", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$d;", "notify", "Source"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class TelemetryErrorEvent {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final String cancelAll;
    private final long TuitionPaymentFragmentbindingInflater1;
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault3 b;
    private final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g d;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Source asInterface;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final List<String> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final d notify;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final asInterface asBinder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String a;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final String g;

    public TelemetryErrorEvent(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, long j, String str, Source source, String str2, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, g gVar, d dVar, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, List<String> list, asInterface asinterface) {
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(source, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(asinterface, "");
        this.b = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.TuitionPaymentFragmentbindingInflater1 = j;
        this.a = str;
        this.asInterface = source;
        this.cancelAll = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.d = gVar;
        this.notify = dVar;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentbindingInflater1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = list;
        this.asBinder = asinterface;
        this.g = "telemetry";
    }

    public /* synthetic */ TelemetryErrorEvent(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, long j, String str, Source source, String str2, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, g gVar, d dVar, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, List list, asInterface asinterface, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tuitionPaymentFragmentspecialinlinedviewModeldefault3, j, str, source, str2, (i & 32) != 0 ? null : tuitionPaymentFragmentspecialinlinedviewModeldefault1, (i & 64) != 0 ? null : gVar, (i & 128) != 0 ? null : dVar, (i & 256) != 0 ? null : tuitionPaymentFragmentbindingInflater1, (i & 512) != 0 ? null : list, asinterface);
    }

    public final JsonElement TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        JsonObject jsonObject = new JsonObject();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.b;
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("format_version", Long.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
        jsonObject.add("_dd", jsonObject2);
        jsonObject.addProperty("type", this.g);
        jsonObject.addProperty("date", Long.valueOf(this.TuitionPaymentFragmentbindingInflater1));
        jsonObject.addProperty(NotificationCompat.CATEGORY_SERVICE, this.a);
        jsonObject.add("source", new JsonPrimitive(this.asInterface.jsonValue));
        jsonObject.addProperty("version", this.cancelAll);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("id", tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            jsonObject.add("application", jsonObject3);
        }
        g gVar = this.d;
        if (gVar != null) {
            JsonObject jsonObject4 = new JsonObject();
            jsonObject4.addProperty("id", gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            jsonObject.add("session", jsonObject4);
        }
        d dVar = this.notify;
        if (dVar != null) {
            JsonObject jsonObject5 = new JsonObject();
            jsonObject5.addProperty("id", dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            jsonObject.add("view", jsonObject5);
        }
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            JsonObject jsonObject6 = new JsonObject();
            jsonObject6.addProperty("id", tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            jsonObject.add("action", jsonObject6);
        }
        List<String> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (list != null) {
            JsonArray jsonArray = new JsonArray(list.size());
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                jsonArray.add((String) it.next());
            }
            jsonObject.add("experimental_features", jsonArray);
        }
        jsonObject.add("telemetry", this.asBinder.b());
        return jsonObject;
    }

    /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryErrorEvent$b, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0087  */
        /* JADX WARN: Code duplicated, block: B:25:0x009e  */
        /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:46:0x0104 A[Catch: NullPointerException -> 0x0121, NumberFormatException -> 0x0123, IllegalStateException -> 0x0127, TryCatch #6 {IllegalStateException -> 0x0127, NullPointerException -> 0x0121, NumberFormatException -> 0x0123, blocks: (B:39:0x00ca, B:40:0x00d7, B:42:0x00dd, B:44:0x00ed, B:46:0x0104, B:48:0x0115, B:49:0x0120), top: B:72:0x00ca }] */
        /* JADX WARN: Code duplicated, block: B:48:0x0115 A[Catch: NullPointerException -> 0x0121, NumberFormatException -> 0x0123, IllegalStateException -> 0x0127, TryCatch #6 {IllegalStateException -> 0x0127, NullPointerException -> 0x0121, NumberFormatException -> 0x0123, blocks: (B:39:0x00ca, B:40:0x00d7, B:42:0x00dd, B:44:0x00ed, B:46:0x0104, B:48:0x0115, B:49:0x0120), top: B:72:0x00ca }] */
        @JvmStatic
        public static TelemetryErrorEvent TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
            String str;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            JsonElement jsonElement;
            g gVarTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            JsonElement jsonElement2;
            d dVarTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            JsonElement jsonElement3;
            TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1;
            JsonElement jsonElement4;
            asInterface asinterfaceTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            JsonArray asJsonArray;
            JsonObject asJsonObject;
            JsonObject asJsonObject2;
            JsonObject asJsonObject3;
            String str2 = "Unable to parse json into type TelemetryErrorEvent";
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                try {
                    JsonObject asJsonObject4 = p0.get("_dd").getAsJsonObject();
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3.Companion companion = TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(asJsonObject4, "");
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject4);
                    String asString = p0.get("type").getAsString();
                    long asLong = p0.get("date").getAsLong();
                    String asString2 = p0.get(NotificationCompat.CATEGORY_SERVICE).getAsString();
                    Source.Companion companion2 = Source.INSTANCE;
                    String asString3 = p0.get("source").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString3, "");
                    Source sourceTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Source.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asString3);
                    String asString4 = p0.get("version").getAsString();
                    JsonElement jsonElement5 = p0.get("application");
                    ArrayList arrayList = null;
                    if (jsonElement5 != null) {
                        try {
                            JsonObject asJsonObject5 = jsonElement5.getAsJsonObject();
                            if (asJsonObject5 != null) {
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1.Companion companion3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE;
                                tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject5);
                            }
                            jsonElement = p0.get("session");
                            if (jsonElement != null || (asJsonObject3 = jsonElement.getAsJsonObject()) == null) {
                                gVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                            } else {
                                g.Companion companion4 = g.INSTANCE;
                                gVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = g.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject3);
                            }
                            jsonElement2 = p0.get("view");
                            if (jsonElement2 != null || (asJsonObject2 = jsonElement2.getAsJsonObject()) == null) {
                                dVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                            } else {
                                d.Companion companion5 = d.INSTANCE;
                                dVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = d.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject2);
                            }
                            jsonElement3 = p0.get("action");
                            if (jsonElement3 != null || (asJsonObject = jsonElement3.getAsJsonObject()) == null) {
                                TuitionPaymentFragmentbindingInflater1 = null;
                            } else {
                                TuitionPaymentFragmentbindingInflater1.Companion companion6 = TuitionPaymentFragmentbindingInflater1.INSTANCE;
                                TuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject);
                            }
                            jsonElement4 = p0.get("experimental_features");
                            if (jsonElement4 == null && (asJsonArray = jsonElement4.getAsJsonArray()) != null) {
                                str = "Unable to parse json into type TelemetryErrorEvent";
                                try {
                                    arrayList = new ArrayList(asJsonArray.size());
                                    Iterator<JsonElement> it = asJsonArray.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(it.next().getAsString());
                                    }
                                } catch (IllegalStateException e2) {
                                    e = e2;
                                    str2 = str;
                                    throw new JsonParseException(str2, e);
                                } catch (NullPointerException e3) {
                                    e = e3;
                                    throw new JsonParseException(str, e);
                                } catch (NumberFormatException e4) {
                                    e = e4;
                                    str2 = str;
                                    throw new JsonParseException(str2, e);
                                }
                            }
                            JsonObject asJsonObject6 = p0.get("telemetry").getAsJsonObject();
                            asInterface.Companion companion7 = asInterface.INSTANCE;
                            Intrinsics.checkNotNullExpressionValue(asJsonObject6, "");
                            asinterfaceTuitionPaymentFragmentspecialinlinedviewModeldefault2 = asInterface.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject6);
                            if (Intrinsics.areEqual(asString, "telemetry")) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                            Intrinsics.checkNotNullExpressionValue(asString2, "");
                            Intrinsics.checkNotNullExpressionValue(asString4, "");
                            return new TelemetryErrorEvent(TuitionPaymentFragmentspecialinlinedviewModeldefault3, asLong, asString2, sourceTuitionPaymentFragmentspecialinlinedviewModeldefault1, asString4, tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault3, gVarTuitionPaymentFragmentspecialinlinedviewModeldefault3, dVarTuitionPaymentFragmentspecialinlinedviewModeldefault2, TuitionPaymentFragmentbindingInflater1, arrayList, asinterfaceTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        } catch (IllegalStateException e5) {
                            e = e5;
                            throw new JsonParseException(str2, e);
                        } catch (NumberFormatException e6) {
                            e = e6;
                            throw new JsonParseException(str2, e);
                        }
                    }
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    jsonElement = p0.get("session");
                    if (jsonElement != null) {
                        gVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    } else {
                        gVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    }
                    jsonElement2 = p0.get("view");
                    if (jsonElement2 != null) {
                        dVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    } else {
                        dVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    }
                    jsonElement3 = p0.get("action");
                    if (jsonElement3 != null) {
                        TuitionPaymentFragmentbindingInflater1 = null;
                    } else {
                        TuitionPaymentFragmentbindingInflater1 = null;
                    }
                    jsonElement4 = p0.get("experimental_features");
                    if (jsonElement4 == null) {
                    }
                    JsonObject asJsonObject7 = p0.get("telemetry").getAsJsonObject();
                    asInterface.Companion companion8 = asInterface.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(asJsonObject7, "");
                    asinterfaceTuitionPaymentFragmentspecialinlinedviewModeldefault2 = asInterface.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject7);
                    if (Intrinsics.areEqual(asString, "telemetry")) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    Intrinsics.checkNotNullExpressionValue(asString2, "");
                    Intrinsics.checkNotNullExpressionValue(asString4, "");
                    return new TelemetryErrorEvent(TuitionPaymentFragmentspecialinlinedviewModeldefault3, asLong, asString2, sourceTuitionPaymentFragmentspecialinlinedviewModeldefault1, asString4, tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault3, gVarTuitionPaymentFragmentspecialinlinedviewModeldefault3, dVarTuitionPaymentFragmentspecialinlinedviewModeldefault2, TuitionPaymentFragmentbindingInflater1, arrayList, asinterfaceTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                } catch (NullPointerException e7) {
                    e = e7;
                    str = "Unable to parse json into type TelemetryErrorEvent";
                }
            } catch (IllegalStateException e8) {
                e = e8;
            } catch (NumberFormatException e9) {
                e = e9;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        final long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;

        /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    if (p0.get("format_version").getAsLong() != 2) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    return new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Dd", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Dd", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Dd", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((TuitionPaymentFragmentspecialinlinedviewModeldefault1) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("id").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(asString);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Application", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Application", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Application", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$g;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class g {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public g(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof g) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((g) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("g(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryErrorEvent$g$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$g$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$g;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$g;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static g TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("id").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new g(asString);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Session", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Session", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Session", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$d;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public d(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof d) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((d) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("d(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryErrorEvent$d$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$d$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$d;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$d;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static d TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("id").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new d(asString);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type View", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type View", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type View", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentbindingInflater1;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentbindingInflater1 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public TuitionPaymentFragmentbindingInflater1(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((TuitionPaymentFragmentbindingInflater1) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryErrorEvent$TuitionPaymentFragmentbindingInflater1$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentbindingInflater1$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentbindingInflater1;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentbindingInflater1;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("id").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new TuitionPaymentFragmentbindingInflater1(asString);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Action", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Action", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Action", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010!\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u001f\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0006\n\u0004\b$\u0010 R\u0014\u0010\"\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0006\n\u0004\b%\u0010 "}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$asInterface;", "", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$asBinder;", "p1", "", "p2", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$a;", "p3", "", "p4", "<init>", "(Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$asBinder;Ljava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$a;Ljava/util/Map;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "b", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$a;", "TuitionPaymentFragmentbindingInflater1", "asInterface", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asBinder", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$asBinder;", "d", "g"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class asInterface {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        private final a TuitionPaymentFragmentbindingInflater1;
        private final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
        private final asBinder b;

        /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String asInterface;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String asBinder;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String[] TuitionPaymentFragmentbindingInflater1 = {"device", "os", "type", NotificationCompat.CATEGORY_STATUS, "message", Constants.IPC_BUNDLE_KEY_SEND_ERROR};

        public asInterface(TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, asBinder asbinder, String str, a aVar, Map<String, Object> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
            this.b = asbinder;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.TuitionPaymentFragmentbindingInflater1 = aVar;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = map;
            this.asBinder = "log";
            this.asInterface = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
        }

        public /* synthetic */ asInterface(TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, asBinder asbinder, String str, a aVar, LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : tuitionPaymentFragmentspecialinlinedviewModeldefault2, (i & 2) != 0 ? null : asbinder, str, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? new LinkedHashMap() : linkedHashMap);
        }

        public final JsonElement b() {
            JsonObject jsonObject = new JsonObject();
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                jsonObject.add("device", tuitionPaymentFragmentspecialinlinedviewModeldefault2.b());
            }
            asBinder asbinder = this.b;
            if (asbinder != null) {
                jsonObject.add("os", asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
            jsonObject.addProperty("type", this.asBinder);
            jsonObject.addProperty(NotificationCompat.CATEGORY_STATUS, this.asInterface);
            jsonObject.addProperty("message", this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            a aVar = this.TuitionPaymentFragmentbindingInflater1;
            if (aVar != null) {
                jsonObject.add(Constants.IPC_BUNDLE_KEY_SEND_ERROR, aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
            for (Map.Entry<String, Object> entry : this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!ArraysKt.contains(TuitionPaymentFragmentbindingInflater1, key)) {
                    toBitmap tobitmap = toBitmap.INSTANCE;
                    jsonObject.add(key, toBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3(value));
                }
            }
            return jsonObject;
        }

        /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryErrorEvent$asInterface$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$asInterface$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$asInterface;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$asInterface;", "", "", "TuitionPaymentFragmentbindingInflater1", "[Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static asInterface TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2B;
                asBinder asbinderTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                JsonObject asJsonObject;
                JsonObject asJsonObject2;
                JsonObject asJsonObject3;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("device");
                    a aVarB = null;
                    if (jsonElement == null || (asJsonObject3 = jsonElement.getAsJsonObject()) == null) {
                        tuitionPaymentFragmentspecialinlinedviewModeldefault2B = null;
                    } else {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2.Companion companion = TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE;
                        tuitionPaymentFragmentspecialinlinedviewModeldefault2B = TuitionPaymentFragmentspecialinlinedviewModeldefault2.Companion.b(asJsonObject3);
                    }
                    JsonElement jsonElement2 = p0.get("os");
                    if (jsonElement2 == null || (asJsonObject2 = jsonElement2.getAsJsonObject()) == null) {
                        asbinderTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    } else {
                        asBinder.Companion companion2 = asBinder.INSTANCE;
                        asbinderTuitionPaymentFragmentspecialinlinedviewModeldefault2 = asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject2);
                    }
                    JsonElement jsonElement3 = p0.get("type");
                    String asString = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    String asString2 = p0.get(NotificationCompat.CATEGORY_STATUS).getAsString();
                    String asString3 = p0.get("message").getAsString();
                    JsonElement jsonElement4 = p0.get(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                    if (jsonElement4 != null && (asJsonObject = jsonElement4.getAsJsonObject()) != null) {
                        a.Companion companion3 = a.INSTANCE;
                        aVarB = a.Companion.b(asJsonObject);
                    }
                    a aVar = aVarB;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, JsonElement> entry : p0.entrySet()) {
                        if (!ArraysKt.contains(asInterface.TuitionPaymentFragmentbindingInflater1, entry.getKey())) {
                            String key = entry.getKey();
                            Intrinsics.checkNotNullExpressionValue(key, "");
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    if (asString != null && !Intrinsics.areEqual(asString, "log")) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (!Intrinsics.areEqual(asString2, Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    Intrinsics.checkNotNullExpressionValue(asString3, "");
                    return new asInterface(tuitionPaymentFragmentspecialinlinedviewModeldefault2B, asbinderTuitionPaymentFragmentspecialinlinedviewModeldefault2, asString3, aVar, linkedHashMap);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Telemetry", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Telemetry", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Telemetry", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof asInterface)) {
                return false;
            }
            asInterface asinterface = (asInterface) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.b, asinterface.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, asinterface.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode = tuitionPaymentFragmentspecialinlinedviewModeldefault2 == null ? 0 : tuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
            asBinder asbinder = this.b;
            int iHashCode2 = asbinder == null ? 0 : asbinder.hashCode();
            int iHashCode3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
            a aVar = this.TuitionPaymentFragmentbindingInflater1;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            asBinder asbinder = this.b;
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            a aVar = this.TuitionPaymentFragmentbindingInflater1;
            Map<String, Object> map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("asInterface(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
            sb.append(", b=");
            sb.append(asbinder);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(aVar);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "b", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final String b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, String str2, String str3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
            this.b = str3;
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public final JsonElement b() {
            JsonObject jsonObject = new JsonObject();
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str != null) {
                jsonObject.addProperty("architecture", str);
            }
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str2 != null) {
                jsonObject.addProperty("brand", str2);
            }
            String str3 = this.b;
            if (str3 != null) {
                jsonObject.addProperty("model", str3);
            }
            return jsonObject;
        }

        /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentspecialinlinedviewModeldefault2 b(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("architecture");
                    String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = p0.get("brand");
                    String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    JsonElement jsonElement3 = p0.get("model");
                    return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(asString, asString2, jsonElement3 != null ? jsonElement3.getAsString() : null);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Device", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Device", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Device", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TuitionPaymentFragmentspecialinlinedviewModeldefault2) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.b, tuitionPaymentFragmentspecialinlinedviewModeldefault2.b);
        }

        public final int hashCode() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.b;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str3 = this.b;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str2);
            sb.append(", b=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$asBinder;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class asBinder {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        private final String TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final String b;

        public asBinder(String str, String str2, String str3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.TuitionPaymentFragmentbindingInflater1 = str2;
            this.b = str3;
        }

        public /* synthetic */ asBinder(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public final JsonElement TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            JsonObject jsonObject = new JsonObject();
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str != null) {
                jsonObject.addProperty("build", str);
            }
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            if (str2 != null) {
                jsonObject.addProperty("name", str2);
            }
            String str3 = this.b;
            if (str3 != null) {
                jsonObject.addProperty("version", str3);
            }
            return jsonObject;
        }

        /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryErrorEvent$asBinder$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$asBinder$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$asBinder;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$asBinder;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static asBinder TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("build");
                    String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = p0.get("name");
                    String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    JsonElement jsonElement3 = p0.get("version");
                    return new asBinder(asString, asString2, jsonElement3 != null ? jsonElement3.getAsString() : null);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Os", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Os", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Os", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public asBinder() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof asBinder)) {
                return false;
            }
            asBinder asbinder = (asBinder) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, asbinder.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, asbinder.b);
        }

        public final int hashCode() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.b;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            String str3 = this.b;
            StringBuilder sb = new StringBuilder("asBinder(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str2);
            sb.append(", b=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$a;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String TuitionPaymentFragmentbindingInflater1;
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public a(String str, String str2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.TuitionPaymentFragmentbindingInflater1 = str2;
        }

        public /* synthetic */ a(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public final JsonElement TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            JsonObject jsonObject = new JsonObject();
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str != null) {
                jsonObject.addProperty("stack", str);
            }
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            if (str2 != null) {
                jsonObject.addProperty("kind", str2);
            }
            return jsonObject;
        }

        /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryErrorEvent$a$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$a$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$a;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$a;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static a b(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("stack");
                    String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = p0.get("kind");
                    return new a(asString, jsonElement2 != null ? jsonElement2.getAsString() : null);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Error", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Error", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Error", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof a)) {
                return false;
            }
            a aVar = (a) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, aVar.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("a(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "asInterface", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "asBinder", "d"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Source {
        ANDROID("android"),
        IOS("ios"),
        BROWSER("browser"),
        FLUTTER("flutter"),
        REACT_NATIVE("react-native"),
        UNITY("unity"),
        KOTLIN_MULTIPLATFORM("kotlin-multiplatform");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        final String jsonValue;

        Source(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryErrorEvent$Source$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static Source TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (Source source : Source.values()) {
                    if (Intrinsics.areEqual(source.jsonValue, p0)) {
                        return source;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TelemetryErrorEvent)) {
            return false;
        }
        TelemetryErrorEvent telemetryErrorEvent = (TelemetryErrorEvent) p0;
        return Intrinsics.areEqual(this.b, telemetryErrorEvent.b) && this.TuitionPaymentFragmentbindingInflater1 == telemetryErrorEvent.TuitionPaymentFragmentbindingInflater1 && Intrinsics.areEqual(this.a, telemetryErrorEvent.a) && this.asInterface == telemetryErrorEvent.asInterface && Intrinsics.areEqual(this.cancelAll, telemetryErrorEvent.cancelAll) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, telemetryErrorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.d, telemetryErrorEvent.d) && Intrinsics.areEqual(this.notify, telemetryErrorEvent.notify) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, telemetryErrorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, telemetryErrorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.asBinder, telemetryErrorEvent.asBinder);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode();
        int iHashCode2 = Long.hashCode(this.TuitionPaymentFragmentbindingInflater1);
        int iHashCode3 = this.a.hashCode();
        int iHashCode4 = this.asInterface.hashCode();
        int iHashCode5 = this.cancelAll.hashCode();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode6 = tuitionPaymentFragmentspecialinlinedviewModeldefault1 == null ? 0 : tuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        g gVar = this.d;
        int iHashCode7 = gVar == null ? 0 : gVar.hashCode();
        d dVar = this.notify;
        int iHashCode8 = dVar == null ? 0 : dVar.hashCode();
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode9 = tuitionPaymentFragmentbindingInflater1 == null ? 0 : tuitionPaymentFragmentbindingInflater1.hashCode();
        List<String> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.asBinder.hashCode();
    }

    public final String toString() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.b;
        long j = this.TuitionPaymentFragmentbindingInflater1;
        String str = this.a;
        Source source = this.asInterface;
        String str2 = this.cancelAll;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        g gVar = this.d;
        d dVar = this.notify;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        List<String> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        asInterface asinterface = this.asBinder;
        StringBuilder sb = new StringBuilder("TelemetryErrorEvent(b=");
        sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(j);
        sb.append(", a=");
        sb.append(str);
        sb.append(", asInterface=");
        sb.append(source);
        sb.append(", cancelAll=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", d=");
        sb.append(gVar);
        sb.append(", notify=");
        sb.append(dVar);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(tuitionPaymentFragmentbindingInflater1);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(list);
        sb.append(", asBinder=");
        sb.append(asinterface);
        sb.append(")");
        return sb.toString();
    }
}
