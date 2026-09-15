package com.datadog.android.telemetry.model;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import defpackage.toBitmap;
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
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u000b$(+ &30;.,2By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\"\u0010#R\u0013\u0010&\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\u0006\n\u0004\b$\u0010%R\u0013\u0010$\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\u0006\n\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010*R\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010,\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00100\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00105R\u0014\u0010.\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0006\n\u0004\b6\u0010/R\u0014\u00107\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010/R\u0016\u0010:\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u00109"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent;", "", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "p0", "", "p1", "", "p2", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Source;", "p3", "p4", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TuitionPaymentFragmentbindingInflater1;", "p5", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$d;", "p6", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$a;", "p7", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "p8", "", "p9", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$g;", "p10", "<init>", "(Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;JLjava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Source;Ljava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TuitionPaymentFragmentbindingInflater1;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$d;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$a;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;Ljava/util/List;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$g;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TuitionPaymentFragmentbindingInflater1;", "TuitionPaymentFragmentbindingInflater1", "J", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "b", "asInterface", "Ljava/util/List;", "g", "Ljava/lang/String;", "d", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$d;", "a", "asBinder", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Source;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$g;", "INotificationSideChannel", "onTransact", "notify", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$a;", "cancel", "Source"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class TelemetryUsageEvent {

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final String g;
    private final long TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault2 b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g d;
    private final Source asBinder;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final List<String> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final d a;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String asInterface;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final a cancel;
    private final String onTransact;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        final long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2;
    }

    private TelemetryUsageEvent(TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, long j, String str, Source source, String str2, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, d dVar, a aVar, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, List<String> list, g gVar) {
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(source, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(gVar, "");
        this.b = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.TuitionPaymentFragmentbindingInflater1 = j;
        this.asInterface = str;
        this.asBinder = source;
        this.onTransact = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentbindingInflater1;
        this.a = dVar;
        this.cancel = aVar;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = list;
        this.d = gVar;
        this.g = "telemetry";
    }

    public /* synthetic */ TelemetryUsageEvent(TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, long j, String str, Source source, String str2, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, d dVar, a aVar, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, List list, g gVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tuitionPaymentFragmentspecialinlinedviewModeldefault2, j, str, source, str2, (i & 32) != 0 ? null : tuitionPaymentFragmentbindingInflater1, (i & 64) != 0 ? null : dVar, (i & 128) != 0 ? null : aVar, (i & 256) != 0 ? null : tuitionPaymentFragmentspecialinlinedviewModeldefault1, (i & 512) != 0 ? null : list, gVar);
    }

    public final JsonElement TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        JsonObject jsonObject = new JsonObject();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.b;
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("format_version", Long.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        jsonObject.add("_dd", jsonObject2);
        jsonObject.addProperty("type", this.g);
        jsonObject.addProperty("date", Long.valueOf(this.TuitionPaymentFragmentbindingInflater1));
        jsonObject.addProperty(NotificationCompat.CATEGORY_SERVICE, this.asInterface);
        jsonObject.add("source", new JsonPrimitive(this.asBinder.jsonValue));
        jsonObject.addProperty("version", this.onTransact);
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("id", tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            jsonObject.add("application", jsonObject3);
        }
        d dVar = this.a;
        if (dVar != null) {
            JsonObject jsonObject4 = new JsonObject();
            jsonObject4.addProperty("id", dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            jsonObject.add("session", jsonObject4);
        }
        a aVar = this.cancel;
        if (aVar != null) {
            JsonObject jsonObject5 = new JsonObject();
            jsonObject5.addProperty("id", aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            jsonObject.add("view", jsonObject5);
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            JsonObject jsonObject6 = new JsonObject();
            jsonObject6.addProperty("id", tuitionPaymentFragmentspecialinlinedviewModeldefault1.b);
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
        jsonObject.add("telemetry", this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        return jsonObject;
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TuitionPaymentFragmentbindingInflater1;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentbindingInflater1 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentbindingInflater1(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((TuitionPaymentFragmentbindingInflater1) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$d;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public d(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof d) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((d) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("d(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$a;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class a {
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public a(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof a) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((a) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("a(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        final String b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.b = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.b, ((TuitionPaymentFragmentspecialinlinedviewModeldefault1) p0).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            String str = this.b;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault1(b=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryUsageEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1$b;", "", "<init>", "()V"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public static int TuitionPaymentFragmentbindingInflater1;
            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
                int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i2 = i % 6099738;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
                if (i2 != 0) {
                    return TuitionPaymentFragmentbindingInflater1;
                }
                int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
                TuitionPaymentFragmentbindingInflater1 = i3;
                return i3;
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tH×\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\t8\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$g;", "", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$asBinder;", "p1", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$asInterface;", "p2", "", "", "p3", "<init>", "(Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$asBinder;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$asInterface;Ljava/util/Map;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/util/Map;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "b", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$asBinder;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "Ljava/lang/String;", "g", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$asInterface;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class g {
        private static final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {"device", "os", "type", "usage"};

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        private final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        private final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final asBinder TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String b;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final asInterface TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public g(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, asBinder asbinder, asInterface asinterface, Map<String, Object> map) {
            Intrinsics.checkNotNullParameter(asinterface, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = asbinder;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = asinterface;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = map;
            this.b = "usage";
        }

        public /* synthetic */ g(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, asBinder asbinder, asInterface asinterface, LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : tuitionPaymentFragmentspecialinlinedviewModeldefault3, (i & 2) != 0 ? null : asbinder, asinterface, (i & 8) != 0 ? new LinkedHashMap() : linkedHashMap);
        }

        public final JsonElement TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            JsonObject jsonObject = new JsonObject();
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentbindingInflater1;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                jsonObject.add("device", tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
            asBinder asbinder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (asbinder != null) {
                jsonObject.add("os", asbinder.b());
            }
            jsonObject.addProperty("type", this.b);
            jsonObject.add("usage", this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            for (Map.Entry<String, Object> entry : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!ArraysKt.contains(TuitionPaymentFragmentspecialinlinedviewModeldefault3, key)) {
                    toBitmap tobitmap = toBitmap.INSTANCE;
                    jsonObject.add(key, toBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3(value));
                }
            }
            return jsonObject;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof g)) {
                return false;
            }
            g gVar = (g) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, gVar.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode = tuitionPaymentFragmentspecialinlinedviewModeldefault3 == null ? 0 : tuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
            asBinder asbinder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return (((((iHashCode * 31) + (asbinder != null ? asbinder.hashCode() : 0)) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentbindingInflater1;
            asBinder asbinder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            asInterface asinterface = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Map<String, Object> map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("g(TuitionPaymentFragmentbindingInflater1=");
            sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(asbinder);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(asinterface);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        private final String b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        private final String TuitionPaymentFragmentbindingInflater1;
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, String str2, String str3) {
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
            this.b = str3;
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public final JsonElement TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            JsonObject jsonObject = new JsonObject();
            String str = this.TuitionPaymentFragmentbindingInflater1;
            if (str != null) {
                jsonObject.addProperty("architecture", str);
            }
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str2 != null) {
                jsonObject.addProperty("brand", str2);
            }
            String str3 = this.b;
            if (str3 != null) {
                jsonObject.addProperty("model", str3);
            }
            return jsonObject;
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.b, tuitionPaymentFragmentspecialinlinedviewModeldefault3.b);
        }

        public final int hashCode() {
            String str = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.b;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentbindingInflater1;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str3 = this.b;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentbindingInflater1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str2);
            sb.append(", b=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$asBinder;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "b", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class asBinder {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        private final String TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public asBinder(String str, String str2, String str3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
            this.TuitionPaymentFragmentbindingInflater1 = str3;
        }

        public /* synthetic */ asBinder(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public final JsonElement b() {
            JsonObject jsonObject = new JsonObject();
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str != null) {
                jsonObject.addProperty("build", str);
            }
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str2 != null) {
                jsonObject.addProperty("name", str2);
            }
            String str3 = this.TuitionPaymentFragmentbindingInflater1;
            if (str3 != null) {
                jsonObject.addProperty("version", str3);
            }
            return jsonObject;
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
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, asbinder.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.TuitionPaymentFragmentbindingInflater1;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str3 = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("asBinder(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u0000 \u00052\u00020\u0001:\u0002\u0007\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$asInterface;", "", "<init>", "()V", "Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$asInterface$TuitionPaymentFragmentspecialinlinedviewModeldefault3;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static abstract class asInterface {
        public abstract JsonElement TuitionPaymentFragmentspecialinlinedviewModeldefault2();

        private asInterface() {
        }

        public /* synthetic */ asInterface(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000f\u001a\u00020\u00118\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$asInterface$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$asInterface;", "", "p0", "p1", "p2", "<init>", "(ZZZ)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends asInterface {

            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
            private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
            private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
            private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            private final boolean TuitionPaymentFragmentbindingInflater1;

            public TuitionPaymentFragmentspecialinlinedviewModeldefault3(boolean z, boolean z2, boolean z3) {
                super(null);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z2;
                this.TuitionPaymentFragmentbindingInflater1 = z3;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "addViewLoadingTime";
            }

            @Override // com.datadog.android.telemetry.model.TelemetryUsageEvent.asInterface
            public final JsonElement TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("feature", this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                jsonObject.addProperty("no_view", Boolean.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
                jsonObject.addProperty("no_active_view", Boolean.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                jsonObject.addProperty("overwritten", Boolean.valueOf(this.TuitionPaymentFragmentbindingInflater1));
                return jsonObject;
            }

            public final boolean equals(Object p0) {
                if (this == p0) {
                    return true;
                }
                if (!(p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                    return false;
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) p0;
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && this.TuitionPaymentFragmentbindingInflater1 == tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
            }

            public final int hashCode() {
                return (((Boolean.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) * 31) + Boolean.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) * 31) + Boolean.hashCode(this.TuitionPaymentFragmentbindingInflater1);
            }

            public final String toString() {
                boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                boolean z2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                boolean z3 = this.TuitionPaymentFragmentbindingInflater1;
                StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
                sb.append(z);
                sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
                sb.append(z2);
                sb.append(", TuitionPaymentFragmentbindingInflater1=");
                sb.append(z3);
                sb.append(")");
                return sb.toString();
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Source;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "asInterface", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "g", "d", "a"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Source {
        ANDROID("android"),
        IOS("ios"),
        BROWSER("browser"),
        FLUTTER("flutter"),
        REACT_NATIVE("react-native"),
        UNITY("unity"),
        KOTLIN_MULTIPLATFORM("kotlin-multiplatform");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        final String jsonValue;

        Source(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryUsageEvent$Source$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Source$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Source;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Source;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static Source TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
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
        if (!(p0 instanceof TelemetryUsageEvent)) {
            return false;
        }
        TelemetryUsageEvent telemetryUsageEvent = (TelemetryUsageEvent) p0;
        return Intrinsics.areEqual(this.b, telemetryUsageEvent.b) && this.TuitionPaymentFragmentbindingInflater1 == telemetryUsageEvent.TuitionPaymentFragmentbindingInflater1 && Intrinsics.areEqual(this.asInterface, telemetryUsageEvent.asInterface) && this.asBinder == telemetryUsageEvent.asBinder && Intrinsics.areEqual(this.onTransact, telemetryUsageEvent.onTransact) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, telemetryUsageEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.a, telemetryUsageEvent.a) && Intrinsics.areEqual(this.cancel, telemetryUsageEvent.cancel) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, telemetryUsageEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, telemetryUsageEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.d, telemetryUsageEvent.d);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode();
        int iHashCode2 = Long.hashCode(this.TuitionPaymentFragmentbindingInflater1);
        int iHashCode3 = this.asInterface.hashCode();
        int iHashCode4 = this.asBinder.hashCode();
        int iHashCode5 = this.onTransact.hashCode();
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode6 = tuitionPaymentFragmentbindingInflater1 == null ? 0 : tuitionPaymentFragmentbindingInflater1.hashCode();
        d dVar = this.a;
        int iHashCode7 = dVar == null ? 0 : dVar.hashCode();
        a aVar = this.cancel;
        int iHashCode8 = aVar == null ? 0 : aVar.hashCode();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode9 = tuitionPaymentFragmentspecialinlinedviewModeldefault1 == null ? 0 : tuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        List<String> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.b;
        long j = this.TuitionPaymentFragmentbindingInflater1;
        String str = this.asInterface;
        Source source = this.asBinder;
        String str2 = this.onTransact;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        d dVar = this.a;
        a aVar = this.cancel;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        List<String> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        g gVar = this.d;
        StringBuilder sb = new StringBuilder("TelemetryUsageEvent(b=");
        sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(j);
        sb.append(", asInterface=");
        sb.append(str);
        sb.append(", asBinder=");
        sb.append(source);
        sb.append(", onTransact=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(tuitionPaymentFragmentbindingInflater1);
        sb.append(", a=");
        sb.append(dVar);
        sb.append(", cancel=");
        sb.append(aVar);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(list);
        sb.append(", d=");
        sb.append(gVar);
        sb.append(")");
        return sb.toString();
    }
}
