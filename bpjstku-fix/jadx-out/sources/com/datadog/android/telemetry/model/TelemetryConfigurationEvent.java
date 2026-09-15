package com.datadog.android.telemetry.model;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.midtrans.sdk.corekit.models.snap.TransactionResult;
import defpackage.toBitmap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0010 &+($4.2;,<0=>?@By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\"\u0010#R\u0013\u0010$\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\u0006\n\u0004\b$\u0010%R\u0013\u0010(\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\u0006\n\u0004\b&\u0010'R\u0011\u0010&\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b \u0010)R\u0014\u0010+\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010*R\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00100\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010,\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00104\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0006\n\u0004\b6\u0010/R\u0014\u00108\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010/R\u0016\u0010:\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u00109"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent;", "", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "p0", "", "p1", "", "p2", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Source;", "p3", "p4", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$b;", "p5", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$g;", "p6", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$cancelAll;", "p7", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "p8", "", "p9", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$asInterface;", "p10", "<init>", "(Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;JLjava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Source;Ljava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$b;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$g;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$cancelAll;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;Ljava/util/List;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$asInterface;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "b", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$b;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "J", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "TuitionPaymentFragmentbindingInflater1", "g", "Ljava/util/List;", "d", "Ljava/lang/String;", "asInterface", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$g;", "asBinder", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Source;", "a", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$asInterface;", "INotificationSideChannel", "cancel", "onTransact", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$cancelAll;", "notify", "SelectedTracingPropagator", "Source", "TraceContextInjection", "TrackingConsent", "cancelAll", "ViewTrackingStrategy"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class TelemetryConfigurationEvent {

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final String a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1;
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final long b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final asInterface g;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Source asInterface;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final g asBinder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final b TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final String onTransact;
    private final String d;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<String> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final cancelAll notify;

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "", "TuitionPaymentFragmentbindingInflater1", "J", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        final long b = 2;
    }

    public TelemetryConfigurationEvent(TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, long j, String str, Source source, String str2, b bVar, g gVar, cancelAll cancelall, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, List<String> list, asInterface asinterface) {
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(source, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(asinterface, "");
        this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.b = j;
        this.d = str;
        this.asInterface = source;
        this.onTransact = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bVar;
        this.asBinder = gVar;
        this.notify = cancelall;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
        this.g = asinterface;
        this.a = "telemetry";
    }

    public /* synthetic */ TelemetryConfigurationEvent(TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, long j, String str, Source source, String str2, b bVar, g gVar, cancelAll cancelall, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, List list, asInterface asinterface, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tuitionPaymentFragmentspecialinlinedviewModeldefault2, j, str, source, str2, (i & 32) != 0 ? null : bVar, (i & 64) != 0 ? null : gVar, (i & 128) != 0 ? null : cancelall, (i & 256) != 0 ? null : tuitionPaymentFragmentspecialinlinedviewModeldefault3, (i & 512) != 0 ? null : list, asinterface);
    }

    public final JsonElement TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        JsonObject jsonObject = new JsonObject();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentbindingInflater1;
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("format_version", Long.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.b));
        jsonObject.add("_dd", jsonObject2);
        jsonObject.addProperty("type", this.a);
        jsonObject.addProperty("date", Long.valueOf(this.b));
        jsonObject.addProperty(NotificationCompat.CATEGORY_SERVICE, this.d);
        jsonObject.add("source", new JsonPrimitive(this.asInterface.jsonValue));
        jsonObject.addProperty("version", this.onTransact);
        b bVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (bVar != null) {
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("id", bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            jsonObject.add("application", jsonObject3);
        }
        g gVar = this.asBinder;
        if (gVar != null) {
            JsonObject jsonObject4 = new JsonObject();
            jsonObject4.addProperty("id", gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            jsonObject.add("session", jsonObject4);
        }
        cancelAll cancelall = this.notify;
        if (cancelall != null) {
            JsonObject jsonObject5 = new JsonObject();
            jsonObject5.addProperty("id", cancelall.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            jsonObject.add("view", jsonObject5);
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            JsonObject jsonObject6 = new JsonObject();
            jsonObject6.addProperty("id", tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            jsonObject.add("action", jsonObject6);
        }
        List<String> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (list != null) {
            JsonArray jsonArray = new JsonArray(list.size());
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                jsonArray.add((String) it.next());
            }
            jsonObject.add("experimental_features", jsonArray);
        }
        jsonObject.add("telemetry", this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        return jsonObject;
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$b;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public b(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((b) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("b(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$g;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class g {
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public g(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof g) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((g) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("g(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$cancelAll;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class cancelAll {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public cancelAll(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof cancelAll) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((cancelAll) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("cancelAll(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((TuitionPaymentFragmentspecialinlinedviewModeldefault3) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tH×\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0087D¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$asInterface;", "", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$a;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$d;", "p1", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "p2", "", "", "p3", "<init>", "(Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$a;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$d;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;Ljava/util/Map;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/Map;", "b", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "TuitionPaymentFragmentbindingInflater1", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$a;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "d", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$d;", "asInterface", "Ljava/lang/String;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class asInterface {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        private final a TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        private final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        private final Map<String, Object> b;

        /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final d TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {"device", "os", "type", "configuration"};

        private asInterface(a aVar, d dVar, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, Map<String, Object> map) {
            Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = aVar;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = dVar;
            this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
            this.b = map;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "configuration";
        }

        public /* synthetic */ asInterface(a aVar, d dVar, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : aVar, (i & 2) != 0 ? null : dVar, tuitionPaymentFragmentspecialinlinedviewModeldefault1, (i & 8) != 0 ? new LinkedHashMap() : linkedHashMap);
        }

        public final JsonElement TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            JsonObject jsonObject = new JsonObject();
            a aVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (aVar != null) {
                jsonObject.add("device", aVar.TuitionPaymentFragmentbindingInflater1());
            }
            d dVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (dVar != null) {
                jsonObject.add("os", dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
            jsonObject.addProperty("type", this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            jsonObject.add("configuration", this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            for (Map.Entry<String, Object> entry : this.b.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!ArraysKt.contains(TuitionPaymentFragmentspecialinlinedviewModeldefault2, key)) {
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
            if (!(p0 instanceof asInterface)) {
                return false;
            }
            asInterface asinterface = (asInterface) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, asinterface.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, asinterface.b);
        }

        public final int hashCode() {
            a aVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode = aVar == null ? 0 : aVar.hashCode();
            d dVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return (((((iHashCode * 31) + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.b.hashCode();
        }

        public final String toString() {
            a aVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            d dVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentbindingInflater1;
            Map<String, Object> map = this.b;
            StringBuilder sb = new StringBuilder("asInterface(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(aVar);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(dVar);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
            sb.append(", b=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$a;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentbindingInflater1", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class a {
        private final String TuitionPaymentFragmentbindingInflater1;
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public a(String str, String str2, String str3) {
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str3;
        }

        public /* synthetic */ a(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public final JsonElement TuitionPaymentFragmentbindingInflater1() {
            JsonObject jsonObject = new JsonObject();
            String str = this.TuitionPaymentFragmentbindingInflater1;
            if (str != null) {
                jsonObject.addProperty("architecture", str);
            }
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str2 != null) {
                jsonObject.addProperty("brand", str2);
            }
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str3 != null) {
                jsonObject.addProperty("model", str3);
            }
            return jsonObject;
        }

        public a() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof a)) {
                return false;
            }
            a aVar = (a) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, aVar.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            String str = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentbindingInflater1;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("a(TuitionPaymentFragmentbindingInflater1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$d;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class d {
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        private final String TuitionPaymentFragmentbindingInflater1;
        private final String b;

        public d(String str, String str2, String str3) {
            this.b = str;
            this.TuitionPaymentFragmentbindingInflater1 = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str3;
        }

        public /* synthetic */ d(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public final JsonElement TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            JsonObject jsonObject = new JsonObject();
            String str = this.b;
            if (str != null) {
                jsonObject.addProperty("build", str);
            }
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            if (str2 != null) {
                jsonObject.addProperty("name", str2);
            }
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str3 != null) {
                jsonObject.addProperty("version", str3);
            }
            return jsonObject;
        }

        public d() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof d)) {
                return false;
            }
            d dVar = (d) p0;
            return Intrinsics.areEqual(this.b, dVar.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, dVar.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            String str = this.b;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            String str = this.b;
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("d(b=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bS\b\u0087\b\u0018\u0000 g2\u00020\u0001:\u0001gBó\u0006\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\"\u0012\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\"\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010Q\u001a\n\u0012\u0004\u0012\u00020P\u0018\u00010\"¢\u0006\u0004\bR\u0010SJ\u001a\u0010T\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bT\u0010UJ\u0010\u0010W\u001a\u00020VHÖ\u0001¢\u0006\u0004\bW\u0010XJ\u000f\u0010Z\u001a\u00020YH\u0007¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020\u001eH×\u0001¢\u0006\u0004\b\\\u0010]R\u0016\u0010`\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010Z\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010d\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bc\u0010bR\u0016\u0010g\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010i\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bh\u0010bR\u0016\u0010k\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bj\u0010fR\u0016\u0010m\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bl\u0010fR\u0016\u0010o\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bn\u0010fR\u0016\u0010q\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bp\u0010bR\u0018\u0010r\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bi\u0010_R\u0018\u0010s\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b`\u0010_R\u0018\u0010t\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bd\u0010bR\u001c\u0010w\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010y\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bx\u0010bR\u001c\u0010{\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bz\u0010vR\u0018\u0010|\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bZ\u0010_R\u0018\u0010}\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\br\u0010_R\u0018\u0010~\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bo\u0010fR\u001d\u0010\u0080\u0001\u001a\n\u0012\u0004\u0012\u00020P\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010vR\u0018\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010fR\u0019\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bm\u0010_R\u0019\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bq\u0010_R\u0018\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010fR\u001e\u0010\u0088\u0001\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010vR\u0019\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bk\u0010bR\u0019\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bw\u0010fR\u0018\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010fR\u0018\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010bR\u0019\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\by\u0010bR\u0019\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bt\u0010bR\u0018\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010bR\u0018\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010fR\u0018\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010fR\u0018\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010fR\u0019\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b{\u0010_R\u0018\u0010e\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bs\u0010_R\u0019\u0010a\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\f¢\u0006\u0007\n\u0005\b}\u0010\u009a\u0001R\u0017\u0010^\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010fR\u0019\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b|\u0010_R\u0019\u0010c\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\f¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010_R\u0019\u0010p\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010bR\u0018\u0010n\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b~\u0010bR\u0019\u0010j\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010bR\u0019\u0010h\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010bR\u0019\u0010l\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010bR\u0019\u0010u\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010bR\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010bR\u0019\u0010z\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010bR\u0019\u0010\u007f\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010bR\u0019\u0010x\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010bR\u001a\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010bR\u001a\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010bR\u0018\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010bR\u001a\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010bR\u001a\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010bR\u0019\u0010\u0093\u0001\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001a\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\f¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010_R\u0018\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b \u0001\u0010bR\u0018\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b¡\u0001\u0010bR\u0018\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b¢\u0001\u0010bR\u0018\u0010¡\u0001\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b£\u0001\u0010bR\u0018\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b¤\u0001\u0010bR\u001a\u0010£\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010bR\u0018\u0010¢\u0001\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b¥\u0001\u0010bR\u0018\u0010 \u0001\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b¦\u0001\u0010bR\u001a\u0010¤\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010bR\u001a\u0010¥\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010bR\u0018\u0010§\u0001\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b§\u0001\u0010bR\u0018\u0010¨\u0001\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b¨\u0001\u0010bR\u0018\u0010¦\u0001\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b©\u0001\u0010bR\u0019\u0010¬\u0001\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "", "p0", "p1", "p2", "p3", "p4", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TraceContextInjection;", "p5", "p6", "p7", "p8", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TrackingConsent;", "p9", "", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "", "p24", "p25", "p26", "", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$SelectedTracingPropagator;", "p27", "p28", "p29", "p30", "p31", "p32", "p33", "p34", "p35", "p36", "p37", "p38", "p39", "p40", "p41", "p42", "p43", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$ViewTrackingStrategy;", "p44", "p45", "p46", "p47", "p48", "p49", "p50", "p51", "p52", "p53", "p54", "p55", "p56", "p57", "p58", "p59", "p60", "p61", "p62", "p63", "p64", "p65", "p66", "p67", "p68", "p69", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$asBinder;", "p70", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TraceContextInjection;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TrackingConsent;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$ViewTrackingStrategy;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "setCallbacksMessenger", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "handleMessage", "Ljava/lang/Boolean;", "MediaBrowserCompatCallbackHandler", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "subscribe", "Ljava/lang/Long;", "TuitionPaymentFragmentbindingInflater1", "setInternalConnectionCallback", "b", "onConnectionSuspended", "d", "onConnected", "asInterface", "MediaBrowserCompatConnectionCallback", "asBinder", "onConnectionFailed", "g", "a", "cancel", "cancelAll", "MediaBrowserCompatCustomActionCallback", "Ljava/util/List;", "INotificationSideChannel", "MediaBrowserCompatConnectionCallbackConnectionCallbackInternal", "onTransact", "onError", "notify", "RemoteActionCompatParcelizer", "INotificationSideChannelStubProxy", "INotificationSideChannelDefault", "onProgressUpdate", "getInterfaceDescriptor", "MediaBrowserCompatConnectionCallbackStubApi21", "INotificationSideChannelStub", "write", "read", "onItemLoaded", "MediaBrowserCompat", "onReceiveResult", "IconCompatParcelizer", "connect", "getExtras", "MediaBrowserCompatCustomActionResultReceiver", "getItem", "onResult", "getRoot", "getNotifyChildrenChangedOptions", "disconnect", "MediaBrowserCompatItemCallback", FirebaseAnalytics.Event.SEARCH, "onLoadChildren", "isConnected", "MediaBrowserCompatMediaBrowserImplApi21", "getSessionToken", "MediaBrowserCompatMediaBrowserImpl", "sendCustomAction", "getServiceComponent", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TraceContextInjection;", "MediaBrowserCompatItemReceiver", "unsubscribe", "MediaBrowserCompatItemCallbackStubApi23", "MediaBrowserCompatMediaBrowserImplApi211", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TrackingConsent;", "run", "MediaBrowserCompatMediaBrowserImplApi213", "onServiceConnected", "MediaBrowserCompatMediaBrowserImplApi212", "MediaBrowserCompatMediaBrowserImplApi23", "MediaBrowserCompatMediaBrowserImplApi214", "MediaBrowserCompatMediaBrowserImplApi215", "MediaBrowserCompatMediaBrowserImplApi216", "MediaBrowserCompatMediaBrowserImplApi217", "dump", "MediaBrowserCompatMediaBrowserImplApi26", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$ViewTrackingStrategy;", "isCurrent"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {

        /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
        public Long getExtras;

        /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
        public Boolean MediaBrowserCompatConnectionCallback;

        /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
        public Boolean onConnectionFailed;

        /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
        public TraceContextInjection handleMessage;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        public Boolean MediaBrowserCompatConnectionCallbackStubApi21;

        /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
        public Boolean setInternalConnectionCallback;

        /* JADX INFO: renamed from: MediaBrowserCompatCallbackHandler, reason: from kotlin metadata */
        private final Boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: MediaBrowserCompatConnectionCallback, reason: from kotlin metadata */
        private final Long asBinder;

        /* JADX INFO: renamed from: MediaBrowserCompatConnectionCallbackConnectionCallbackInternal, reason: from kotlin metadata */
        private final Boolean onTransact;

        /* JADX INFO: renamed from: MediaBrowserCompatConnectionCallbackStubApi21, reason: from kotlin metadata */
        private final Long INotificationSideChannelStub;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionCallback, reason: from kotlin metadata */
        private final List<String> INotificationSideChannel;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private final Long getItem;

        /* JADX INFO: renamed from: MediaBrowserCompatItemCallback, reason: from kotlin metadata */
        private final Boolean search;

        /* JADX INFO: renamed from: MediaBrowserCompatItemCallbackStubApi23, reason: from kotlin metadata */
        private final Boolean onItemLoaded;

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private final Long setCallbacksMessenger;

        /* JADX INFO: renamed from: MediaBrowserCompatMediaBrowserImpl, reason: from kotlin metadata */
        private final Long sendCustomAction;

        /* JADX INFO: renamed from: MediaBrowserCompatMediaBrowserImplApi21, reason: from kotlin metadata */
        private final Long getSessionToken;

        /* JADX INFO: renamed from: MediaBrowserCompatMediaBrowserImplApi211, reason: from kotlin metadata */
        private final TrackingConsent onLoadChildren;

        /* JADX INFO: renamed from: MediaBrowserCompatMediaBrowserImplApi212, reason: from kotlin metadata */
        private final Boolean MediaBrowserCompatMediaBrowserImplApi213;

        /* JADX INFO: renamed from: MediaBrowserCompatMediaBrowserImplApi213, reason: from kotlin metadata */
        private final Boolean MediaBrowserCompatItemCallbackStubApi23;

        /* JADX INFO: renamed from: MediaBrowserCompatMediaBrowserImplApi214, reason: from kotlin metadata */
        private final Boolean onServiceConnected;

        /* JADX INFO: renamed from: MediaBrowserCompatMediaBrowserImplApi215, reason: from kotlin metadata */
        private final Boolean run;
        private final Boolean MediaBrowserCompatMediaBrowserImplApi216;
        private final Boolean MediaBrowserCompatMediaBrowserImplApi217;

        /* JADX INFO: renamed from: MediaBrowserCompatMediaBrowserImplApi23, reason: from kotlin metadata */
        private final Boolean MediaBrowserCompatMediaBrowserImplApi211;

        /* JADX INFO: renamed from: MediaBrowserCompatMediaBrowserImplApi26, reason: from kotlin metadata */
        private final ViewTrackingStrategy isCurrent;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        public String unsubscribe;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public String cancel;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public Boolean cancelAll;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public String RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public String INotificationSideChannelStubProxy;

        /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
        public Long INotificationSideChannelDefault;

        /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
        public String write;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public String a;

        /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
        public String subscribe;

        /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
        public Boolean disconnect;

        /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
        public Boolean onConnected;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public Boolean connect;

        /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
        public Boolean MediaBrowserCompatItemCallback;

        /* JADX INFO: renamed from: dump, reason: from kotlin metadata */
        private final Boolean MediaBrowserCompatMediaBrowserImplApi215;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public String read;

        /* JADX INFO: renamed from: getExtras, reason: from kotlin metadata */
        public Boolean onResult;

        /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
        public String MediaBrowserCompatCallbackHandler;

        /* JADX INFO: renamed from: getItem, reason: from kotlin metadata */
        public Boolean onProgressUpdate;

        /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from kotlin metadata */
        public Boolean MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;

        /* JADX INFO: renamed from: getRoot, reason: from kotlin metadata */
        public Boolean onError;

        /* JADX INFO: renamed from: getServiceComponent, reason: from kotlin metadata */
        public Boolean MediaBrowserCompatMediaBrowserImplApi23;

        /* JADX INFO: renamed from: getSessionToken, reason: from kotlin metadata */
        public Boolean onReceiveResult;

        /* JADX INFO: renamed from: handleMessage, reason: from kotlin metadata */
        private final Boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: isConnected, reason: from kotlin metadata */
        public String MediaBrowserCompatItemReceiver;

        /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
        public String getServiceComponent;

        /* JADX INFO: renamed from: onConnected, reason: from kotlin metadata */
        private final Long asInterface;

        /* JADX INFO: renamed from: onConnectionFailed, reason: from kotlin metadata */
        private final Boolean g;

        /* JADX INFO: renamed from: onConnectionSuspended, reason: from kotlin metadata */
        private final Long d;

        /* JADX INFO: renamed from: onError, reason: from kotlin metadata */
        private final List<String> notify;

        /* JADX INFO: renamed from: onItemLoaded, reason: from kotlin metadata */
        private final Long MediaBrowserCompat;

        /* JADX INFO: renamed from: onLoadChildren, reason: from kotlin metadata */
        private final Long isConnected;

        /* JADX INFO: renamed from: onProgressUpdate, reason: from kotlin metadata */
        private final List<asBinder> getInterfaceDescriptor;

        /* JADX INFO: renamed from: onReceiveResult, reason: from kotlin metadata */
        private final List<SelectedTracingPropagator> IconCompatParcelizer;

        /* JADX INFO: renamed from: onResult, reason: from kotlin metadata */
        private final Boolean getRoot;

        /* JADX INFO: renamed from: onServiceConnected, reason: from kotlin metadata */
        private final Boolean MediaBrowserCompatMediaBrowserImplApi21;

        /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
        public Boolean getNotifyChildrenChangedOptions;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        public Boolean onConnectionSuspended;

        /* JADX INFO: renamed from: run, reason: from kotlin metadata */
        private final Boolean MediaBrowserCompatMediaBrowserImpl;

        /* JADX INFO: renamed from: search, reason: from kotlin metadata */
        public Boolean MediaBrowserCompatCustomActionResultReceiver;

        /* JADX INFO: renamed from: sendCustomAction, reason: from kotlin metadata */
        public Boolean MediaBrowserCompatMediaBrowserImplApi212;

        /* JADX INFO: renamed from: setCallbacksMessenger, reason: from kotlin metadata */
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: setInternalConnectionCallback, reason: from kotlin metadata */
        private final Boolean b;

        /* JADX INFO: renamed from: subscribe, reason: from kotlin metadata */
        private final Long TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: unsubscribe, reason: from kotlin metadata */
        public Boolean MediaBrowserCompatMediaBrowserImplApi214;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        public Boolean MediaBrowserCompatCustomActionCallback;

        /* JADX WARN: Multi-variable type inference failed */
        private TuitionPaymentFragmentspecialinlinedviewModeldefault1(Long l, Long l2, Long l3, Long l4, Long l5, TraceContextInjection traceContextInjection, Long l6, Long l7, Long l8, TrackingConsent trackingConsent, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, String str, Boolean bool15, Boolean bool16, List<? extends SelectedTracingPropagator> list, String str2, String str3, String str4, String str5, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, List<String> list2, List<String> list3, Boolean bool26, ViewTrackingStrategy viewTrackingStrategy, Boolean bool27, Long l9, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, String str6, Boolean bool36, Long l10, Long l11, Long l12, Boolean bool37, String str7, String str8, String str9, String str10, Long l13, Boolean bool38, String str11, String str12, Boolean bool39, List<asBinder> list4) {
            this.getItem = l;
            this.getSessionToken = l2;
            this.isConnected = l3;
            this.sendCustomAction = l4;
            this.setCallbacksMessenger = l5;
            this.handleMessage = traceContextInjection;
            this.INotificationSideChannelStub = l6;
            this.MediaBrowserCompat = l7;
            this.getExtras = l8;
            this.onLoadChildren = trackingConsent;
            this.disconnect = bool;
            this.getNotifyChildrenChangedOptions = bool2;
            this.MediaBrowserCompatMediaBrowserImplApi214 = bool3;
            this.MediaBrowserCompatMediaBrowserImplApi21 = bool4;
            this.getRoot = bool5;
            this.onItemLoaded = bool6;
            this.onResult = bool7;
            this.MediaBrowserCompatConnectionCallbackStubApi21 = bool8;
            this.MediaBrowserCompatMediaBrowserImplApi213 = bool9;
            this.run = bool10;
            this.MediaBrowserCompatMediaBrowserImplApi216 = bool11;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bool12;
            this.search = bool13;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bool14;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.MediaBrowserCompatMediaBrowserImpl = bool15;
            this.MediaBrowserCompatItemCallbackStubApi23 = bool16;
            this.IconCompatParcelizer = list;
            this.cancel = str2;
            this.getServiceComponent = str3;
            this.RemoteActionCompatParcelizer = str4;
            this.subscribe = str5;
            this.cancelAll = bool17;
            this.MediaBrowserCompatMediaBrowserImplApi211 = bool18;
            this.MediaBrowserCompatMediaBrowserImplApi215 = bool19;
            this.g = bool20;
            this.onConnected = bool21;
            this.MediaBrowserCompatCustomActionResultReceiver = bool22;
            this.MediaBrowserCompatCustomActionCallback = bool23;
            this.onReceiveResult = bool24;
            this.onTransact = bool25;
            this.INotificationSideChannel = list2;
            this.notify = list3;
            this.onServiceConnected = bool26;
            this.isCurrent = viewTrackingStrategy;
            this.onConnectionFailed = bool27;
            this.INotificationSideChannelDefault = l9;
            this.onConnectionSuspended = bool28;
            this.MediaBrowserCompatItemCallback = bool29;
            this.MediaBrowserCompatMediaBrowserImplApi217 = bool30;
            this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal = bool31;
            this.onError = bool32;
            this.onProgressUpdate = bool33;
            this.MediaBrowserCompatConnectionCallback = bool34;
            this.MediaBrowserCompatMediaBrowserImplApi212 = bool35;
            this.INotificationSideChannelStubProxy = str6;
            this.setInternalConnectionCallback = bool36;
            this.asInterface = l10;
            this.asBinder = l11;
            this.d = l12;
            this.b = bool37;
            this.read = str7;
            this.write = str8;
            this.a = str9;
            this.MediaBrowserCompatItemReceiver = str10;
            this.TuitionPaymentFragmentbindingInflater1 = l13;
            this.MediaBrowserCompatMediaBrowserImplApi23 = bool38;
            this.unsubscribe = str11;
            this.MediaBrowserCompatCallbackHandler = str12;
            this.connect = bool39;
            this.getInterfaceDescriptor = list4;
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1(Long l, Long l2, Long l3, Long l4, Long l5, TraceContextInjection traceContextInjection, Long l6, Long l7, Long l8, TrackingConsent trackingConsent, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, String str, Boolean bool15, Boolean bool16, List list, String str2, String str3, String str4, String str5, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, List list2, List list3, Boolean bool26, ViewTrackingStrategy viewTrackingStrategy, Boolean bool27, Long l9, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, String str6, Boolean bool36, Long l10, Long l11, Long l12, Boolean bool37, String str7, String str8, String str9, String str10, Long l13, Boolean bool38, String str11, String str12, Boolean bool39, List list4, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : l3, (i & 8) != 0 ? null : l4, (i & 16) != 0 ? null : l5, (i & 32) != 0 ? null : traceContextInjection, (i & 64) != 0 ? null : l6, (i & 128) != 0 ? null : l7, (i & 256) != 0 ? null : l8, (i & 512) != 0 ? null : trackingConsent, (i & 1024) != 0 ? null : bool, (i & 2048) != 0 ? null : bool2, (i & 4096) != 0 ? null : bool3, (i & 8192) != 0 ? null : bool4, (i & 16384) != 0 ? null : bool5, (i & 32768) != 0 ? null : bool6, (i & 65536) != 0 ? null : bool7, (i & 131072) != 0 ? null : bool8, (i & 262144) != 0 ? null : bool9, (i & 524288) != 0 ? null : bool10, (i & 1048576) != 0 ? null : bool11, (i & 2097152) != 0 ? null : bool12, (i & 4194304) != 0 ? null : bool13, (i & 8388608) != 0 ? null : bool14, (i & 16777216) != 0 ? null : str, (i & 33554432) != 0 ? null : bool15, (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : bool16, (i & 134217728) != 0 ? null : list, (i & 268435456) != 0 ? null : str2, (i & 536870912) != 0 ? null : str3, (i & BasicMeasure.EXACTLY) != 0 ? null : str4, (i & Integer.MIN_VALUE) != 0 ? null : str5, (i2 & 1) != 0 ? null : bool17, (i2 & 2) != 0 ? null : bool18, (i2 & 4) != 0 ? null : bool19, (i2 & 8) != 0 ? null : bool20, (i2 & 16) != 0 ? null : bool21, (i2 & 32) != 0 ? null : bool22, (i2 & 64) != 0 ? null : bool23, (i2 & 128) != 0 ? null : bool24, (i2 & 256) != 0 ? null : bool25, (i2 & 512) != 0 ? null : list2, (i2 & 1024) != 0 ? null : list3, (i2 & 2048) != 0 ? null : bool26, (i2 & 4096) != 0 ? null : viewTrackingStrategy, (i2 & 8192) != 0 ? null : bool27, (i2 & 16384) != 0 ? null : l9, (i2 & 32768) != 0 ? null : bool28, (i2 & 65536) != 0 ? null : bool29, (i2 & 131072) != 0 ? null : bool30, (i2 & 262144) != 0 ? null : bool31, (i2 & 524288) != 0 ? null : bool32, (i2 & 1048576) != 0 ? null : bool33, (i2 & 2097152) != 0 ? null : bool34, (i2 & 4194304) != 0 ? null : bool35, (i2 & 8388608) != 0 ? null : str6, (i2 & 16777216) != 0 ? null : bool36, (i2 & 33554432) != 0 ? null : l10, (i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : l11, (i2 & 134217728) != 0 ? null : l12, (i2 & 268435456) != 0 ? null : bool37, (i2 & 536870912) != 0 ? null : str7, (i2 & BasicMeasure.EXACTLY) != 0 ? null : str8, (i2 & Integer.MIN_VALUE) != 0 ? null : str9, (i3 & 1) != 0 ? null : str10, (i3 & 2) != 0 ? null : l13, (i3 & 4) != 0 ? null : bool38, (i3 & 8) != 0 ? null : str11, (i3 & 16) != 0 ? null : str12, (i3 & 32) != 0 ? null : bool39, (i3 & 64) != 0 ? null : list4);
        }

        public final JsonElement TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            JsonObject jsonObject = new JsonObject();
            Long l = this.getItem;
            if (l != null) {
                jsonObject.addProperty("session_sample_rate", Long.valueOf(l.longValue()));
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            }
            Long l2 = this.getSessionToken;
            if (l2 != null) {
                jsonObject.addProperty("telemetry_sample_rate", Long.valueOf(l2.longValue()));
                Unit unit3 = Unit.INSTANCE;
                Unit unit4 = Unit.INSTANCE;
            }
            Long l3 = this.isConnected;
            if (l3 != null) {
                jsonObject.addProperty("telemetry_configuration_sample_rate", Long.valueOf(l3.longValue()));
                Unit unit5 = Unit.INSTANCE;
                Unit unit6 = Unit.INSTANCE;
            }
            Long l4 = this.sendCustomAction;
            if (l4 != null) {
                jsonObject.addProperty("telemetry_usage_sample_rate", Long.valueOf(l4.longValue()));
                Unit unit7 = Unit.INSTANCE;
                Unit unit8 = Unit.INSTANCE;
            }
            Long l5 = this.setCallbacksMessenger;
            if (l5 != null) {
                jsonObject.addProperty("trace_sample_rate", Long.valueOf(l5.longValue()));
                Unit unit9 = Unit.INSTANCE;
                Unit unit10 = Unit.INSTANCE;
            }
            TraceContextInjection traceContextInjection = this.handleMessage;
            if (traceContextInjection != null) {
                jsonObject.add("trace_context_injection", new JsonPrimitive(traceContextInjection.jsonValue));
                Unit unit11 = Unit.INSTANCE;
                Unit unit12 = Unit.INSTANCE;
            }
            Long l6 = this.INotificationSideChannelStub;
            if (l6 != null) {
                jsonObject.addProperty("premium_sample_rate", Long.valueOf(l6.longValue()));
                Unit unit13 = Unit.INSTANCE;
                Unit unit14 = Unit.INSTANCE;
            }
            Long l7 = this.MediaBrowserCompat;
            if (l7 != null) {
                jsonObject.addProperty("replay_sample_rate", Long.valueOf(l7.longValue()));
                Unit unit15 = Unit.INSTANCE;
                Unit unit16 = Unit.INSTANCE;
            }
            Long l8 = this.getExtras;
            if (l8 != null) {
                jsonObject.addProperty("session_replay_sample_rate", Long.valueOf(l8.longValue()));
                Unit unit17 = Unit.INSTANCE;
                Unit unit18 = Unit.INSTANCE;
            }
            TrackingConsent trackingConsent = this.onLoadChildren;
            if (trackingConsent != null) {
                jsonObject.add("tracking_consent", new JsonPrimitive(trackingConsent.jsonValue));
                Unit unit19 = Unit.INSTANCE;
                Unit unit20 = Unit.INSTANCE;
            }
            Boolean bool = this.disconnect;
            if (bool != null) {
                jsonObject.addProperty("start_session_replay_recording_manually", Boolean.valueOf(bool.booleanValue()));
                Unit unit21 = Unit.INSTANCE;
                Unit unit22 = Unit.INSTANCE;
            }
            Boolean bool2 = this.getNotifyChildrenChangedOptions;
            if (bool2 != null) {
                jsonObject.addProperty("start_recording_immediately", Boolean.valueOf(bool2.booleanValue()));
                Unit unit23 = Unit.INSTANCE;
                Unit unit24 = Unit.INSTANCE;
            }
            Boolean bool3 = this.MediaBrowserCompatMediaBrowserImplApi214;
            if (bool3 != null) {
                jsonObject.addProperty("use_proxy", Boolean.valueOf(bool3.booleanValue()));
                Unit unit25 = Unit.INSTANCE;
                Unit unit26 = Unit.INSTANCE;
            }
            Boolean bool4 = this.MediaBrowserCompatMediaBrowserImplApi21;
            if (bool4 != null) {
                jsonObject.addProperty("use_before_send", Boolean.valueOf(bool4.booleanValue()));
                Unit unit27 = Unit.INSTANCE;
                Unit unit28 = Unit.INSTANCE;
            }
            Boolean bool5 = this.getRoot;
            if (bool5 != null) {
                jsonObject.addProperty("silent_multiple_init", Boolean.valueOf(bool5.booleanValue()));
                Unit unit29 = Unit.INSTANCE;
                Unit unit30 = Unit.INSTANCE;
            }
            Boolean bool6 = this.onItemLoaded;
            if (bool6 != null) {
                jsonObject.addProperty("track_session_across_subdomains", Boolean.valueOf(bool6.booleanValue()));
                Unit unit31 = Unit.INSTANCE;
                Unit unit32 = Unit.INSTANCE;
            }
            Boolean bool7 = this.onResult;
            if (bool7 != null) {
                jsonObject.addProperty("track_resources", Boolean.valueOf(bool7.booleanValue()));
                Unit unit33 = Unit.INSTANCE;
                Unit unit34 = Unit.INSTANCE;
            }
            Boolean bool8 = this.MediaBrowserCompatConnectionCallbackStubApi21;
            if (bool8 != null) {
                jsonObject.addProperty("track_long_task", Boolean.valueOf(bool8.booleanValue()));
                Unit unit35 = Unit.INSTANCE;
                Unit unit36 = Unit.INSTANCE;
            }
            Boolean bool9 = this.MediaBrowserCompatMediaBrowserImplApi213;
            if (bool9 != null) {
                jsonObject.addProperty("use_cross_site_session_cookie", Boolean.valueOf(bool9.booleanValue()));
                Unit unit37 = Unit.INSTANCE;
                Unit unit38 = Unit.INSTANCE;
            }
            Boolean bool10 = this.run;
            if (bool10 != null) {
                jsonObject.addProperty("use_partitioned_cross_site_session_cookie", Boolean.valueOf(bool10.booleanValue()));
                Unit unit39 = Unit.INSTANCE;
                Unit unit40 = Unit.INSTANCE;
            }
            Boolean bool11 = this.MediaBrowserCompatMediaBrowserImplApi216;
            if (bool11 != null) {
                jsonObject.addProperty("use_secure_session_cookie", Boolean.valueOf(bool11.booleanValue()));
                Unit unit41 = Unit.INSTANCE;
                Unit unit42 = Unit.INSTANCE;
            }
            Boolean bool12 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (bool12 != null) {
                jsonObject.addProperty("allow_fallback_to_local_storage", Boolean.valueOf(bool12.booleanValue()));
                Unit unit43 = Unit.INSTANCE;
                Unit unit44 = Unit.INSTANCE;
            }
            Boolean bool13 = this.search;
            if (bool13 != null) {
                jsonObject.addProperty("store_contexts_across_pages", Boolean.valueOf(bool13.booleanValue()));
                Unit unit45 = Unit.INSTANCE;
                Unit unit46 = Unit.INSTANCE;
            }
            Boolean bool14 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (bool14 != null) {
                jsonObject.addProperty("allow_untrusted_events", Boolean.valueOf(bool14.booleanValue()));
                Unit unit47 = Unit.INSTANCE;
                Unit unit48 = Unit.INSTANCE;
            }
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str != null) {
                jsonObject.addProperty("action_name_attribute", str);
                Unit unit49 = Unit.INSTANCE;
                Unit unit50 = Unit.INSTANCE;
            }
            Boolean bool15 = this.MediaBrowserCompatMediaBrowserImpl;
            if (bool15 != null) {
                jsonObject.addProperty("use_allowed_tracing_origins", Boolean.valueOf(bool15.booleanValue()));
                Unit unit51 = Unit.INSTANCE;
                Unit unit52 = Unit.INSTANCE;
            }
            Boolean bool16 = this.MediaBrowserCompatItemCallbackStubApi23;
            if (bool16 != null) {
                jsonObject.addProperty("use_allowed_tracing_urls", Boolean.valueOf(bool16.booleanValue()));
                Unit unit53 = Unit.INSTANCE;
                Unit unit54 = Unit.INSTANCE;
            }
            List<SelectedTracingPropagator> list = this.IconCompatParcelizer;
            if (list != null) {
                JsonArray jsonArray = new JsonArray(list.size());
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    jsonArray.add(new JsonPrimitive(((SelectedTracingPropagator) it.next()).jsonValue));
                }
                jsonObject.add("selected_tracing_propagators", jsonArray);
                Unit unit55 = Unit.INSTANCE;
                Unit unit56 = Unit.INSTANCE;
            }
            String str2 = this.cancel;
            if (str2 != null) {
                jsonObject.addProperty("default_privacy_level", str2);
                Unit unit57 = Unit.INSTANCE;
                Unit unit58 = Unit.INSTANCE;
            }
            String str3 = this.getServiceComponent;
            if (str3 != null) {
                jsonObject.addProperty("text_and_input_privacy_level", str3);
                Unit unit59 = Unit.INSTANCE;
                Unit unit60 = Unit.INSTANCE;
            }
            String str4 = this.RemoteActionCompatParcelizer;
            if (str4 != null) {
                jsonObject.addProperty("image_privacy_level", str4);
                Unit unit61 = Unit.INSTANCE;
                Unit unit62 = Unit.INSTANCE;
            }
            String str5 = this.subscribe;
            if (str5 != null) {
                jsonObject.addProperty("touch_privacy_level", str5);
                Unit unit63 = Unit.INSTANCE;
                Unit unit64 = Unit.INSTANCE;
            }
            Boolean bool17 = this.cancelAll;
            if (bool17 != null) {
                jsonObject.addProperty("enable_privacy_for_action_name", Boolean.valueOf(bool17.booleanValue()));
                Unit unit65 = Unit.INSTANCE;
                Unit unit66 = Unit.INSTANCE;
            }
            Boolean bool18 = this.MediaBrowserCompatMediaBrowserImplApi211;
            if (bool18 != null) {
                jsonObject.addProperty("use_excluded_activity_urls", Boolean.valueOf(bool18.booleanValue()));
                Unit unit67 = Unit.INSTANCE;
                Unit unit68 = Unit.INSTANCE;
            }
            Boolean bool19 = this.MediaBrowserCompatMediaBrowserImplApi215;
            if (bool19 != null) {
                jsonObject.addProperty("use_worker_url", Boolean.valueOf(bool19.booleanValue()));
                Unit unit69 = Unit.INSTANCE;
                Unit unit70 = Unit.INSTANCE;
            }
            Boolean bool20 = this.g;
            if (bool20 != null) {
                jsonObject.addProperty("compress_intake_requests", Boolean.valueOf(bool20.booleanValue()));
                Unit unit71 = Unit.INSTANCE;
                Unit unit72 = Unit.INSTANCE;
            }
            Boolean bool21 = this.onConnected;
            if (bool21 != null) {
                jsonObject.addProperty("track_frustrations", Boolean.valueOf(bool21.booleanValue()));
                Unit unit73 = Unit.INSTANCE;
                Unit unit74 = Unit.INSTANCE;
            }
            Boolean bool22 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (bool22 != null) {
                jsonObject.addProperty("track_views_manually", Boolean.valueOf(bool22.booleanValue()));
                Unit unit75 = Unit.INSTANCE;
                Unit unit76 = Unit.INSTANCE;
            }
            Boolean bool23 = this.MediaBrowserCompatCustomActionCallback;
            if (bool23 != null) {
                jsonObject.addProperty("track_interactions", Boolean.valueOf(bool23.booleanValue()));
                Unit unit77 = Unit.INSTANCE;
                Unit unit78 = Unit.INSTANCE;
            }
            Boolean bool24 = this.onReceiveResult;
            if (bool24 != null) {
                jsonObject.addProperty("track_user_interactions", Boolean.valueOf(bool24.booleanValue()));
                Unit unit79 = Unit.INSTANCE;
                Unit unit80 = Unit.INSTANCE;
            }
            Boolean bool25 = this.onTransact;
            if (bool25 != null) {
                jsonObject.addProperty("forward_errors_to_logs", Boolean.valueOf(bool25.booleanValue()));
                Unit unit81 = Unit.INSTANCE;
                Unit unit82 = Unit.INSTANCE;
            }
            List<String> list2 = this.INotificationSideChannel;
            if (list2 != null) {
                JsonArray jsonArray2 = new JsonArray(list2.size());
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    jsonArray2.add((String) it2.next());
                }
                jsonObject.add("forward_console_logs", jsonArray2);
                Unit unit83 = Unit.INSTANCE;
                Unit unit84 = Unit.INSTANCE;
            }
            List<String> list3 = this.notify;
            if (list3 != null) {
                JsonArray jsonArray3 = new JsonArray(list3.size());
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    jsonArray3.add((String) it3.next());
                }
                jsonObject.add("forward_reports", jsonArray3);
                Unit unit85 = Unit.INSTANCE;
                Unit unit86 = Unit.INSTANCE;
            }
            Boolean bool26 = this.onServiceConnected;
            if (bool26 != null) {
                jsonObject.addProperty("use_local_encryption", Boolean.valueOf(bool26.booleanValue()));
                Unit unit87 = Unit.INSTANCE;
                Unit unit88 = Unit.INSTANCE;
            }
            ViewTrackingStrategy viewTrackingStrategy = this.isCurrent;
            if (viewTrackingStrategy != null) {
                jsonObject.add("view_tracking_strategy", new JsonPrimitive(viewTrackingStrategy.jsonValue));
                Unit unit89 = Unit.INSTANCE;
                Unit unit90 = Unit.INSTANCE;
            }
            Boolean bool27 = this.onConnectionFailed;
            if (bool27 != null) {
                jsonObject.addProperty("track_background_events", Boolean.valueOf(bool27.booleanValue()));
                Unit unit91 = Unit.INSTANCE;
                Unit unit92 = Unit.INSTANCE;
            }
            Long l9 = this.INotificationSideChannelDefault;
            if (l9 != null) {
                jsonObject.addProperty("mobile_vitals_update_period", Long.valueOf(l9.longValue()));
                Unit unit93 = Unit.INSTANCE;
                Unit unit94 = Unit.INSTANCE;
            }
            Boolean bool28 = this.onConnectionSuspended;
            if (bool28 != null) {
                jsonObject.addProperty("track_errors", Boolean.valueOf(bool28.booleanValue()));
                Unit unit95 = Unit.INSTANCE;
                Unit unit96 = Unit.INSTANCE;
            }
            Boolean bool29 = this.MediaBrowserCompatItemCallback;
            if (bool29 != null) {
                jsonObject.addProperty("track_network_requests", Boolean.valueOf(bool29.booleanValue()));
                Unit unit97 = Unit.INSTANCE;
                Unit unit98 = Unit.INSTANCE;
            }
            Boolean bool30 = this.MediaBrowserCompatMediaBrowserImplApi217;
            if (bool30 != null) {
                jsonObject.addProperty("use_tracing", Boolean.valueOf(bool30.booleanValue()));
                Unit unit99 = Unit.INSTANCE;
                Unit unit100 = Unit.INSTANCE;
            }
            Boolean bool31 = this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;
            if (bool31 != null) {
                jsonObject.addProperty("track_native_views", Boolean.valueOf(bool31.booleanValue()));
                Unit unit101 = Unit.INSTANCE;
                Unit unit102 = Unit.INSTANCE;
            }
            Boolean bool32 = this.onError;
            if (bool32 != null) {
                jsonObject.addProperty("track_native_errors", Boolean.valueOf(bool32.booleanValue()));
                Unit unit103 = Unit.INSTANCE;
                Unit unit104 = Unit.INSTANCE;
            }
            Boolean bool33 = this.onProgressUpdate;
            if (bool33 != null) {
                jsonObject.addProperty("track_native_long_tasks", Boolean.valueOf(bool33.booleanValue()));
                Unit unit105 = Unit.INSTANCE;
                Unit unit106 = Unit.INSTANCE;
            }
            Boolean bool34 = this.MediaBrowserCompatConnectionCallback;
            if (bool34 != null) {
                jsonObject.addProperty("track_cross_platform_long_tasks", Boolean.valueOf(bool34.booleanValue()));
                Unit unit107 = Unit.INSTANCE;
                Unit unit108 = Unit.INSTANCE;
            }
            Boolean bool35 = this.MediaBrowserCompatMediaBrowserImplApi212;
            if (bool35 != null) {
                jsonObject.addProperty("use_first_party_hosts", Boolean.valueOf(bool35.booleanValue()));
                Unit unit109 = Unit.INSTANCE;
                Unit unit110 = Unit.INSTANCE;
            }
            String str6 = this.INotificationSideChannelStubProxy;
            if (str6 != null) {
                jsonObject.addProperty("initialization_type", str6);
                Unit unit111 = Unit.INSTANCE;
                Unit unit112 = Unit.INSTANCE;
            }
            Boolean bool36 = this.setInternalConnectionCallback;
            if (bool36 != null) {
                jsonObject.addProperty("track_flutter_performance", Boolean.valueOf(bool36.booleanValue()));
                Unit unit113 = Unit.INSTANCE;
                Unit unit114 = Unit.INSTANCE;
            }
            Long l10 = this.asInterface;
            if (l10 != null) {
                jsonObject.addProperty("batch_size", Long.valueOf(l10.longValue()));
                Unit unit115 = Unit.INSTANCE;
                Unit unit116 = Unit.INSTANCE;
            }
            Long l11 = this.asBinder;
            if (l11 != null) {
                jsonObject.addProperty("batch_upload_frequency", Long.valueOf(l11.longValue()));
                Unit unit117 = Unit.INSTANCE;
                Unit unit118 = Unit.INSTANCE;
            }
            Long l12 = this.d;
            if (l12 != null) {
                jsonObject.addProperty("batch_processing_level", Long.valueOf(l12.longValue()));
                Unit unit119 = Unit.INSTANCE;
                Unit unit120 = Unit.INSTANCE;
            }
            Boolean bool37 = this.b;
            if (bool37 != null) {
                jsonObject.addProperty("background_tasks_enabled", Boolean.valueOf(bool37.booleanValue()));
                Unit unit121 = Unit.INSTANCE;
                Unit unit122 = Unit.INSTANCE;
            }
            String str7 = this.read;
            if (str7 != null) {
                jsonObject.addProperty("react_version", str7);
                Unit unit123 = Unit.INSTANCE;
                Unit unit124 = Unit.INSTANCE;
            }
            String str8 = this.write;
            if (str8 != null) {
                jsonObject.addProperty("react_native_version", str8);
                Unit unit125 = Unit.INSTANCE;
                Unit unit126 = Unit.INSTANCE;
            }
            String str9 = this.a;
            if (str9 != null) {
                jsonObject.addProperty("dart_version", str9);
                Unit unit127 = Unit.INSTANCE;
                Unit unit128 = Unit.INSTANCE;
            }
            String str10 = this.MediaBrowserCompatItemReceiver;
            if (str10 != null) {
                jsonObject.addProperty("unity_version", str10);
                Unit unit129 = Unit.INSTANCE;
                Unit unit130 = Unit.INSTANCE;
            }
            Long l13 = this.TuitionPaymentFragmentbindingInflater1;
            if (l13 != null) {
                jsonObject.addProperty("app_hang_threshold", Long.valueOf(l13.longValue()));
                Unit unit131 = Unit.INSTANCE;
                Unit unit132 = Unit.INSTANCE;
            }
            Boolean bool38 = this.MediaBrowserCompatMediaBrowserImplApi23;
            if (bool38 != null) {
                jsonObject.addProperty("use_pci_intake", Boolean.valueOf(bool38.booleanValue()));
                Unit unit133 = Unit.INSTANCE;
                Unit unit134 = Unit.INSTANCE;
            }
            String str11 = this.unsubscribe;
            if (str11 != null) {
                jsonObject.addProperty("tracer_api", str11);
                Unit unit135 = Unit.INSTANCE;
                Unit unit136 = Unit.INSTANCE;
            }
            String str12 = this.MediaBrowserCompatCallbackHandler;
            if (str12 != null) {
                jsonObject.addProperty("tracer_api_version", str12);
                Unit unit137 = Unit.INSTANCE;
                Unit unit138 = Unit.INSTANCE;
            }
            Boolean bool39 = this.connect;
            if (bool39 != null) {
                jsonObject.addProperty("send_logs_after_session_expiration", Boolean.valueOf(bool39.booleanValue()));
                Unit unit139 = Unit.INSTANCE;
                Unit unit140 = Unit.INSTANCE;
            }
            List<asBinder> list4 = this.getInterfaceDescriptor;
            if (list4 != null) {
                JsonArray jsonArray4 = new JsonArray(list4.size());
                for (asBinder asbinder : list4) {
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.addProperty("name", asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    for (Map.Entry<String, Object> entry : asbinder.TuitionPaymentFragmentbindingInflater1.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (!ArraysKt.contains(asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1, key)) {
                            toBitmap tobitmap = toBitmap.INSTANCE;
                            jsonObject2.add(key, toBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3(value));
                        }
                    }
                    jsonArray4.add(jsonObject2);
                }
                jsonObject.add("plugins", jsonArray4);
                Unit unit141 = Unit.INSTANCE;
                Unit unit142 = Unit.INSTANCE;
            }
            return jsonObject;
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 127, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TuitionPaymentFragmentspecialinlinedviewModeldefault1) p0;
            return Intrinsics.areEqual(this.getItem, tuitionPaymentFragmentspecialinlinedviewModeldefault1.getItem) && Intrinsics.areEqual(this.getSessionToken, tuitionPaymentFragmentspecialinlinedviewModeldefault1.getSessionToken) && Intrinsics.areEqual(this.isConnected, tuitionPaymentFragmentspecialinlinedviewModeldefault1.isConnected) && Intrinsics.areEqual(this.sendCustomAction, tuitionPaymentFragmentspecialinlinedviewModeldefault1.sendCustomAction) && Intrinsics.areEqual(this.setCallbacksMessenger, tuitionPaymentFragmentspecialinlinedviewModeldefault1.setCallbacksMessenger) && this.handleMessage == tuitionPaymentFragmentspecialinlinedviewModeldefault1.handleMessage && Intrinsics.areEqual(this.INotificationSideChannelStub, tuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub) && Intrinsics.areEqual(this.MediaBrowserCompat, tuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompat) && Intrinsics.areEqual(this.getExtras, tuitionPaymentFragmentspecialinlinedviewModeldefault1.getExtras) && this.onLoadChildren == tuitionPaymentFragmentspecialinlinedviewModeldefault1.onLoadChildren && Intrinsics.areEqual(this.disconnect, tuitionPaymentFragmentspecialinlinedviewModeldefault1.disconnect) && Intrinsics.areEqual(this.getNotifyChildrenChangedOptions, tuitionPaymentFragmentspecialinlinedviewModeldefault1.getNotifyChildrenChangedOptions) && Intrinsics.areEqual(this.MediaBrowserCompatMediaBrowserImplApi214, tuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi214) && Intrinsics.areEqual(this.MediaBrowserCompatMediaBrowserImplApi21, tuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi21) && Intrinsics.areEqual(this.getRoot, tuitionPaymentFragmentspecialinlinedviewModeldefault1.getRoot) && Intrinsics.areEqual(this.onItemLoaded, tuitionPaymentFragmentspecialinlinedviewModeldefault1.onItemLoaded) && Intrinsics.areEqual(this.onResult, tuitionPaymentFragmentspecialinlinedviewModeldefault1.onResult) && Intrinsics.areEqual(this.MediaBrowserCompatConnectionCallbackStubApi21, tuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatConnectionCallbackStubApi21) && Intrinsics.areEqual(this.MediaBrowserCompatMediaBrowserImplApi213, tuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi213) && Intrinsics.areEqual(this.run, tuitionPaymentFragmentspecialinlinedviewModeldefault1.run) && Intrinsics.areEqual(this.MediaBrowserCompatMediaBrowserImplApi216, tuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi216) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.search, tuitionPaymentFragmentspecialinlinedviewModeldefault1.search) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.MediaBrowserCompatMediaBrowserImpl, tuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImpl) && Intrinsics.areEqual(this.MediaBrowserCompatItemCallbackStubApi23, tuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatItemCallbackStubApi23) && Intrinsics.areEqual(this.IconCompatParcelizer, tuitionPaymentFragmentspecialinlinedviewModeldefault1.IconCompatParcelizer) && Intrinsics.areEqual(this.cancel, tuitionPaymentFragmentspecialinlinedviewModeldefault1.cancel) && Intrinsics.areEqual(this.getServiceComponent, tuitionPaymentFragmentspecialinlinedviewModeldefault1.getServiceComponent) && Intrinsics.areEqual(this.RemoteActionCompatParcelizer, tuitionPaymentFragmentspecialinlinedviewModeldefault1.RemoteActionCompatParcelizer) && Intrinsics.areEqual(this.subscribe, tuitionPaymentFragmentspecialinlinedviewModeldefault1.subscribe) && Intrinsics.areEqual(this.cancelAll, tuitionPaymentFragmentspecialinlinedviewModeldefault1.cancelAll) && Intrinsics.areEqual(this.MediaBrowserCompatMediaBrowserImplApi211, tuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi211) && Intrinsics.areEqual(this.MediaBrowserCompatMediaBrowserImplApi215, tuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi215) && Intrinsics.areEqual(this.g, tuitionPaymentFragmentspecialinlinedviewModeldefault1.g) && Intrinsics.areEqual(this.onConnected, tuitionPaymentFragmentspecialinlinedviewModeldefault1.onConnected) && Intrinsics.areEqual(this.MediaBrowserCompatCustomActionResultReceiver, tuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatCustomActionResultReceiver) && Intrinsics.areEqual(this.MediaBrowserCompatCustomActionCallback, tuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatCustomActionCallback) && Intrinsics.areEqual(this.onReceiveResult, tuitionPaymentFragmentspecialinlinedviewModeldefault1.onReceiveResult) && Intrinsics.areEqual(this.onTransact, tuitionPaymentFragmentspecialinlinedviewModeldefault1.onTransact) && Intrinsics.areEqual(this.INotificationSideChannel, tuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannel) && Intrinsics.areEqual(this.notify, tuitionPaymentFragmentspecialinlinedviewModeldefault1.notify) && Intrinsics.areEqual(this.onServiceConnected, tuitionPaymentFragmentspecialinlinedviewModeldefault1.onServiceConnected) && this.isCurrent == tuitionPaymentFragmentspecialinlinedviewModeldefault1.isCurrent && Intrinsics.areEqual(this.onConnectionFailed, tuitionPaymentFragmentspecialinlinedviewModeldefault1.onConnectionFailed) && Intrinsics.areEqual(this.INotificationSideChannelDefault, tuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelDefault) && Intrinsics.areEqual(this.onConnectionSuspended, tuitionPaymentFragmentspecialinlinedviewModeldefault1.onConnectionSuspended) && Intrinsics.areEqual(this.MediaBrowserCompatItemCallback, tuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatItemCallback) && Intrinsics.areEqual(this.MediaBrowserCompatMediaBrowserImplApi217, tuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi217) && Intrinsics.areEqual(this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal, tuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal) && Intrinsics.areEqual(this.onError, tuitionPaymentFragmentspecialinlinedviewModeldefault1.onError) && Intrinsics.areEqual(this.onProgressUpdate, tuitionPaymentFragmentspecialinlinedviewModeldefault1.onProgressUpdate) && Intrinsics.areEqual(this.MediaBrowserCompatConnectionCallback, tuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatConnectionCallback) && Intrinsics.areEqual(this.MediaBrowserCompatMediaBrowserImplApi212, tuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi212) && Intrinsics.areEqual(this.INotificationSideChannelStubProxy, tuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStubProxy) && Intrinsics.areEqual(this.setInternalConnectionCallback, tuitionPaymentFragmentspecialinlinedviewModeldefault1.setInternalConnectionCallback) && Intrinsics.areEqual(this.asInterface, tuitionPaymentFragmentspecialinlinedviewModeldefault1.asInterface) && Intrinsics.areEqual(this.asBinder, tuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder) && Intrinsics.areEqual(this.d, tuitionPaymentFragmentspecialinlinedviewModeldefault1.d) && Intrinsics.areEqual(this.b, tuitionPaymentFragmentspecialinlinedviewModeldefault1.b) && Intrinsics.areEqual(this.read, tuitionPaymentFragmentspecialinlinedviewModeldefault1.read) && Intrinsics.areEqual(this.write, tuitionPaymentFragmentspecialinlinedviewModeldefault1.write) && Intrinsics.areEqual(this.a, tuitionPaymentFragmentspecialinlinedviewModeldefault1.a) && Intrinsics.areEqual(this.MediaBrowserCompatItemReceiver, tuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatItemReceiver) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.MediaBrowserCompatMediaBrowserImplApi23, tuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi23) && Intrinsics.areEqual(this.unsubscribe, tuitionPaymentFragmentspecialinlinedviewModeldefault1.unsubscribe) && Intrinsics.areEqual(this.MediaBrowserCompatCallbackHandler, tuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatCallbackHandler) && Intrinsics.areEqual(this.connect, tuitionPaymentFragmentspecialinlinedviewModeldefault1.connect) && Intrinsics.areEqual(this.getInterfaceDescriptor, tuitionPaymentFragmentspecialinlinedviewModeldefault1.getInterfaceDescriptor);
        }

        public final int hashCode() {
            Long l = this.getItem;
            int iHashCode = l == null ? 0 : l.hashCode();
            Long l2 = this.getSessionToken;
            int iHashCode2 = l2 == null ? 0 : l2.hashCode();
            Long l3 = this.isConnected;
            int iHashCode3 = l3 == null ? 0 : l3.hashCode();
            Long l4 = this.sendCustomAction;
            int iHashCode4 = l4 == null ? 0 : l4.hashCode();
            Long l5 = this.setCallbacksMessenger;
            int iHashCode5 = l5 == null ? 0 : l5.hashCode();
            TraceContextInjection traceContextInjection = this.handleMessage;
            int iHashCode6 = traceContextInjection == null ? 0 : traceContextInjection.hashCode();
            Long l6 = this.INotificationSideChannelStub;
            int iHashCode7 = l6 == null ? 0 : l6.hashCode();
            Long l7 = this.MediaBrowserCompat;
            int iHashCode8 = l7 == null ? 0 : l7.hashCode();
            Long l8 = this.getExtras;
            int iHashCode9 = l8 == null ? 0 : l8.hashCode();
            TrackingConsent trackingConsent = this.onLoadChildren;
            int iHashCode10 = trackingConsent == null ? 0 : trackingConsent.hashCode();
            Boolean bool = this.disconnect;
            int iHashCode11 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.getNotifyChildrenChangedOptions;
            int iHashCode12 = bool2 == null ? 0 : bool2.hashCode();
            Boolean bool3 = this.MediaBrowserCompatMediaBrowserImplApi214;
            int iHashCode13 = bool3 == null ? 0 : bool3.hashCode();
            Boolean bool4 = this.MediaBrowserCompatMediaBrowserImplApi21;
            int iHashCode14 = bool4 == null ? 0 : bool4.hashCode();
            Boolean bool5 = this.getRoot;
            int iHashCode15 = bool5 == null ? 0 : bool5.hashCode();
            Boolean bool6 = this.onItemLoaded;
            int iHashCode16 = bool6 == null ? 0 : bool6.hashCode();
            Boolean bool7 = this.onResult;
            int iHashCode17 = bool7 == null ? 0 : bool7.hashCode();
            Boolean bool8 = this.MediaBrowserCompatConnectionCallbackStubApi21;
            int iHashCode18 = bool8 == null ? 0 : bool8.hashCode();
            Boolean bool9 = this.MediaBrowserCompatMediaBrowserImplApi213;
            int iHashCode19 = bool9 == null ? 0 : bool9.hashCode();
            Boolean bool10 = this.run;
            int iHashCode20 = bool10 == null ? 0 : bool10.hashCode();
            Boolean bool11 = this.MediaBrowserCompatMediaBrowserImplApi216;
            int iHashCode21 = bool11 == null ? 0 : bool11.hashCode();
            Boolean bool12 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode22 = bool12 == null ? 0 : bool12.hashCode();
            Boolean bool13 = this.search;
            int iHashCode23 = bool13 == null ? 0 : bool13.hashCode();
            Boolean bool14 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode24 = bool14 == null ? 0 : bool14.hashCode();
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode25 = str == null ? 0 : str.hashCode();
            Boolean bool15 = this.MediaBrowserCompatMediaBrowserImpl;
            int iHashCode26 = bool15 == null ? 0 : bool15.hashCode();
            Boolean bool16 = this.MediaBrowserCompatItemCallbackStubApi23;
            int iHashCode27 = bool16 == null ? 0 : bool16.hashCode();
            List<SelectedTracingPropagator> list = this.IconCompatParcelizer;
            int iHashCode28 = list == null ? 0 : list.hashCode();
            String str2 = this.cancel;
            int iHashCode29 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.getServiceComponent;
            int iHashCode30 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.RemoteActionCompatParcelizer;
            int iHashCode31 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.subscribe;
            int iHashCode32 = str5 == null ? 0 : str5.hashCode();
            Boolean bool17 = this.cancelAll;
            int iHashCode33 = bool17 == null ? 0 : bool17.hashCode();
            Boolean bool18 = this.MediaBrowserCompatMediaBrowserImplApi211;
            int iHashCode34 = bool18 == null ? 0 : bool18.hashCode();
            Boolean bool19 = this.MediaBrowserCompatMediaBrowserImplApi215;
            int iHashCode35 = bool19 == null ? 0 : bool19.hashCode();
            Boolean bool20 = this.g;
            int iHashCode36 = bool20 == null ? 0 : bool20.hashCode();
            Boolean bool21 = this.onConnected;
            int iHashCode37 = bool21 == null ? 0 : bool21.hashCode();
            Boolean bool22 = this.MediaBrowserCompatCustomActionResultReceiver;
            int iHashCode38 = bool22 == null ? 0 : bool22.hashCode();
            Boolean bool23 = this.MediaBrowserCompatCustomActionCallback;
            int iHashCode39 = bool23 == null ? 0 : bool23.hashCode();
            Boolean bool24 = this.onReceiveResult;
            int iHashCode40 = bool24 == null ? 0 : bool24.hashCode();
            Boolean bool25 = this.onTransact;
            int iHashCode41 = bool25 == null ? 0 : bool25.hashCode();
            List<String> list2 = this.INotificationSideChannel;
            int iHashCode42 = list2 == null ? 0 : list2.hashCode();
            List<String> list3 = this.notify;
            int iHashCode43 = list3 == null ? 0 : list3.hashCode();
            Boolean bool26 = this.onServiceConnected;
            int iHashCode44 = bool26 == null ? 0 : bool26.hashCode();
            ViewTrackingStrategy viewTrackingStrategy = this.isCurrent;
            int iHashCode45 = viewTrackingStrategy == null ? 0 : viewTrackingStrategy.hashCode();
            Boolean bool27 = this.onConnectionFailed;
            int iHashCode46 = bool27 == null ? 0 : bool27.hashCode();
            Long l9 = this.INotificationSideChannelDefault;
            int iHashCode47 = l9 == null ? 0 : l9.hashCode();
            Boolean bool28 = this.onConnectionSuspended;
            int iHashCode48 = bool28 == null ? 0 : bool28.hashCode();
            Boolean bool29 = this.MediaBrowserCompatItemCallback;
            int iHashCode49 = bool29 == null ? 0 : bool29.hashCode();
            Boolean bool30 = this.MediaBrowserCompatMediaBrowserImplApi217;
            int iHashCode50 = bool30 == null ? 0 : bool30.hashCode();
            Boolean bool31 = this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;
            int iHashCode51 = bool31 == null ? 0 : bool31.hashCode();
            Boolean bool32 = this.onError;
            int iHashCode52 = bool32 == null ? 0 : bool32.hashCode();
            Boolean bool33 = this.onProgressUpdate;
            int iHashCode53 = bool33 == null ? 0 : bool33.hashCode();
            Boolean bool34 = this.MediaBrowserCompatConnectionCallback;
            int iHashCode54 = bool34 == null ? 0 : bool34.hashCode();
            Boolean bool35 = this.MediaBrowserCompatMediaBrowserImplApi212;
            int iHashCode55 = bool35 == null ? 0 : bool35.hashCode();
            String str6 = this.INotificationSideChannelStubProxy;
            int iHashCode56 = str6 == null ? 0 : str6.hashCode();
            Boolean bool36 = this.setInternalConnectionCallback;
            int iHashCode57 = bool36 == null ? 0 : bool36.hashCode();
            Long l10 = this.asInterface;
            int iHashCode58 = l10 == null ? 0 : l10.hashCode();
            Long l11 = this.asBinder;
            int iHashCode59 = l11 == null ? 0 : l11.hashCode();
            Long l12 = this.d;
            int iHashCode60 = l12 == null ? 0 : l12.hashCode();
            Boolean bool37 = this.b;
            int iHashCode61 = bool37 == null ? 0 : bool37.hashCode();
            String str7 = this.read;
            int iHashCode62 = str7 == null ? 0 : str7.hashCode();
            String str8 = this.write;
            int iHashCode63 = str8 == null ? 0 : str8.hashCode();
            String str9 = this.a;
            int iHashCode64 = str9 == null ? 0 : str9.hashCode();
            String str10 = this.MediaBrowserCompatItemReceiver;
            int iHashCode65 = str10 == null ? 0 : str10.hashCode();
            Long l13 = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode66 = l13 == null ? 0 : l13.hashCode();
            Boolean bool38 = this.MediaBrowserCompatMediaBrowserImplApi23;
            int iHashCode67 = bool38 == null ? 0 : bool38.hashCode();
            String str11 = this.unsubscribe;
            int iHashCode68 = str11 == null ? 0 : str11.hashCode();
            String str12 = this.MediaBrowserCompatCallbackHandler;
            int iHashCode69 = str12 == null ? 0 : str12.hashCode();
            Boolean bool39 = this.connect;
            int iHashCode70 = bool39 == null ? 0 : bool39.hashCode();
            List<asBinder> list4 = this.getInterfaceDescriptor;
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + (list4 != null ? list4.hashCode() : 0);
        }

        public final String toString() {
            Long l = this.getItem;
            Long l2 = this.getSessionToken;
            Long l3 = this.isConnected;
            Long l4 = this.sendCustomAction;
            Long l5 = this.setCallbacksMessenger;
            TraceContextInjection traceContextInjection = this.handleMessage;
            Long l6 = this.INotificationSideChannelStub;
            Long l7 = this.MediaBrowserCompat;
            Long l8 = this.getExtras;
            TrackingConsent trackingConsent = this.onLoadChildren;
            Boolean bool = this.disconnect;
            Boolean bool2 = this.getNotifyChildrenChangedOptions;
            Boolean bool3 = this.MediaBrowserCompatMediaBrowserImplApi214;
            Boolean bool4 = this.MediaBrowserCompatMediaBrowserImplApi21;
            Boolean bool5 = this.getRoot;
            Boolean bool6 = this.onItemLoaded;
            Boolean bool7 = this.onResult;
            Boolean bool8 = this.MediaBrowserCompatConnectionCallbackStubApi21;
            Boolean bool9 = this.MediaBrowserCompatMediaBrowserImplApi213;
            Boolean bool10 = this.run;
            Boolean bool11 = this.MediaBrowserCompatMediaBrowserImplApi216;
            Boolean bool12 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Boolean bool13 = this.search;
            Boolean bool14 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Boolean bool15 = this.MediaBrowserCompatMediaBrowserImpl;
            Boolean bool16 = this.MediaBrowserCompatItemCallbackStubApi23;
            List<SelectedTracingPropagator> list = this.IconCompatParcelizer;
            String str2 = this.cancel;
            String str3 = this.getServiceComponent;
            String str4 = this.RemoteActionCompatParcelizer;
            String str5 = this.subscribe;
            Boolean bool17 = this.cancelAll;
            Boolean bool18 = this.MediaBrowserCompatMediaBrowserImplApi211;
            Boolean bool19 = this.MediaBrowserCompatMediaBrowserImplApi215;
            Boolean bool20 = this.g;
            Boolean bool21 = this.onConnected;
            Boolean bool22 = this.MediaBrowserCompatCustomActionResultReceiver;
            Boolean bool23 = this.MediaBrowserCompatCustomActionCallback;
            Boolean bool24 = this.onReceiveResult;
            Boolean bool25 = this.onTransact;
            List<String> list2 = this.INotificationSideChannel;
            List<String> list3 = this.notify;
            Boolean bool26 = this.onServiceConnected;
            ViewTrackingStrategy viewTrackingStrategy = this.isCurrent;
            Boolean bool27 = this.onConnectionFailed;
            Long l9 = this.INotificationSideChannelDefault;
            Boolean bool28 = this.onConnectionSuspended;
            Boolean bool29 = this.MediaBrowserCompatItemCallback;
            Boolean bool30 = this.MediaBrowserCompatMediaBrowserImplApi217;
            Boolean bool31 = this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;
            Boolean bool32 = this.onError;
            Boolean bool33 = this.onProgressUpdate;
            Boolean bool34 = this.MediaBrowserCompatConnectionCallback;
            Boolean bool35 = this.MediaBrowserCompatMediaBrowserImplApi212;
            String str6 = this.INotificationSideChannelStubProxy;
            Boolean bool36 = this.setInternalConnectionCallback;
            Long l10 = this.asInterface;
            Long l11 = this.asBinder;
            Long l12 = this.d;
            Boolean bool37 = this.b;
            String str7 = this.read;
            String str8 = this.write;
            String str9 = this.a;
            String str10 = this.MediaBrowserCompatItemReceiver;
            Long l13 = this.TuitionPaymentFragmentbindingInflater1;
            Boolean bool38 = this.MediaBrowserCompatMediaBrowserImplApi23;
            String str11 = this.unsubscribe;
            String str12 = this.MediaBrowserCompatCallbackHandler;
            Boolean bool39 = this.connect;
            List<asBinder> list4 = this.getInterfaceDescriptor;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault1(getItem=");
            sb.append(l);
            sb.append(", getSessionToken=");
            sb.append(l2);
            sb.append(", isConnected=");
            sb.append(l3);
            sb.append(", sendCustomAction=");
            sb.append(l4);
            sb.append(", setCallbacksMessenger=");
            sb.append(l5);
            sb.append(", handleMessage=");
            sb.append(traceContextInjection);
            sb.append(", INotificationSideChannelStub=");
            sb.append(l6);
            sb.append(", MediaBrowserCompat=");
            sb.append(l7);
            sb.append(", getExtras=");
            sb.append(l8);
            sb.append(", onLoadChildren=");
            sb.append(trackingConsent);
            sb.append(", disconnect=");
            sb.append(bool);
            sb.append(", getNotifyChildrenChangedOptions=");
            sb.append(bool2);
            sb.append(", MediaBrowserCompatMediaBrowserImplApi214=");
            sb.append(bool3);
            sb.append(", MediaBrowserCompatMediaBrowserImplApi21=");
            sb.append(bool4);
            sb.append(", getRoot=");
            sb.append(bool5);
            sb.append(", onItemLoaded=");
            sb.append(bool6);
            sb.append(", onResult=");
            sb.append(bool7);
            sb.append(", MediaBrowserCompatConnectionCallbackStubApi21=");
            sb.append(bool8);
            sb.append(", MediaBrowserCompatMediaBrowserImplApi213=");
            sb.append(bool9);
            sb.append(", run=");
            sb.append(bool10);
            sb.append(", MediaBrowserCompatMediaBrowserImplApi216=");
            sb.append(bool11);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(bool12);
            sb.append(", search=");
            sb.append(bool13);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(bool14);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(", MediaBrowserCompatMediaBrowserImpl=");
            sb.append(bool15);
            sb.append(", MediaBrowserCompatItemCallbackStubApi23=");
            sb.append(bool16);
            sb.append(", IconCompatParcelizer=");
            sb.append(list);
            sb.append(", cancel=");
            sb.append(str2);
            sb.append(", getServiceComponent=");
            sb.append(str3);
            sb.append(", RemoteActionCompatParcelizer=");
            sb.append(str4);
            sb.append(", subscribe=");
            sb.append(str5);
            sb.append(", cancelAll=");
            sb.append(bool17);
            sb.append(", MediaBrowserCompatMediaBrowserImplApi211=");
            sb.append(bool18);
            sb.append(", MediaBrowserCompatMediaBrowserImplApi215=");
            sb.append(bool19);
            sb.append(", g=");
            sb.append(bool20);
            sb.append(", onConnected=");
            sb.append(bool21);
            sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
            sb.append(bool22);
            sb.append(", MediaBrowserCompatCustomActionCallback=");
            sb.append(bool23);
            sb.append(", onReceiveResult=");
            sb.append(bool24);
            sb.append(", onTransact=");
            sb.append(bool25);
            sb.append(", INotificationSideChannel=");
            sb.append(list2);
            sb.append(", notify=");
            sb.append(list3);
            sb.append(", onServiceConnected=");
            sb.append(bool26);
            sb.append(", isCurrent=");
            sb.append(viewTrackingStrategy);
            sb.append(", onConnectionFailed=");
            sb.append(bool27);
            sb.append(", INotificationSideChannelDefault=");
            sb.append(l9);
            sb.append(", onConnectionSuspended=");
            sb.append(bool28);
            sb.append(", MediaBrowserCompatItemCallback=");
            sb.append(bool29);
            sb.append(", MediaBrowserCompatMediaBrowserImplApi217=");
            sb.append(bool30);
            sb.append(", MediaBrowserCompatConnectionCallbackConnectionCallbackInternal=");
            sb.append(bool31);
            sb.append(", onError=");
            sb.append(bool32);
            sb.append(", onProgressUpdate=");
            sb.append(bool33);
            sb.append(", MediaBrowserCompatConnectionCallback=");
            sb.append(bool34);
            sb.append(", MediaBrowserCompatMediaBrowserImplApi212=");
            sb.append(bool35);
            sb.append(", INotificationSideChannelStubProxy=");
            sb.append(str6);
            sb.append(", setInternalConnectionCallback=");
            sb.append(bool36);
            sb.append(", asInterface=");
            sb.append(l10);
            sb.append(", asBinder=");
            sb.append(l11);
            sb.append(", d=");
            sb.append(l12);
            sb.append(", b=");
            sb.append(bool37);
            sb.append(", read=");
            sb.append(str7);
            sb.append(", write=");
            sb.append(str8);
            sb.append(", a=");
            sb.append(str9);
            sb.append(", MediaBrowserCompatItemReceiver=");
            sb.append(str10);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(l13);
            sb.append(", MediaBrowserCompatMediaBrowserImplApi23=");
            sb.append(bool38);
            sb.append(", unsubscribe=");
            sb.append(str11);
            sb.append(", MediaBrowserCompatCallbackHandler=");
            sb.append(str12);
            sb.append(", connect=");
            sb.append(bool39);
            sb.append(", getInterfaceDescriptor=");
            sb.append(list4);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$asBinder;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/Map;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class asBinder {
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        final Map<String, Object> TuitionPaymentFragmentbindingInflater1;
        static final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {"name"};

        private asBinder(String str, Map<String, Object> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.TuitionPaymentFragmentbindingInflater1 = map;
        }

        public /* synthetic */ asBinder(String str, LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? new LinkedHashMap() : linkedHashMap);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof asBinder)) {
                return false;
            }
            asBinder asbinder = (asBinder) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, asbinder.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode() * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Map<String, Object> map = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("asBinder(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Source;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "asInterface", "asBinder", "a"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryConfigurationEvent$Source$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Source$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Source;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Source;"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TraceContextInjection;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum TraceContextInjection {
        ALL("all"),
        SAMPLED("sampled");

        final String jsonValue;

        TraceContextInjection(String str) {
            this.jsonValue = str;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TrackingConsent;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum TrackingConsent {
        GRANTED("granted"),
        NOT_GRANTED("not-granted"),
        PENDING(TransactionResult.STATUS_PENDING);

        final String jsonValue;

        TrackingConsent(String str) {
            this.jsonValue = str;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$SelectedTracingPropagator;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "g"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum SelectedTracingPropagator {
        DATADOG("datadog"),
        B3("b3"),
        B3MULTI("b3multi"),
        TRACECONTEXT("tracecontext");

        final String jsonValue;

        SelectedTracingPropagator(String str) {
            this.jsonValue = str;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$ViewTrackingStrategy;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ViewTrackingStrategy {
        ACTIVITYVIEWTRACKINGSTRATEGY("ActivityViewTrackingStrategy"),
        FRAGMENTVIEWTRACKINGSTRATEGY("FragmentViewTrackingStrategy"),
        MIXEDVIEWTRACKINGSTRATEGY("MixedViewTrackingStrategy"),
        NAVIGATIONVIEWTRACKINGSTRATEGY("NavigationViewTrackingStrategy");

        final String jsonValue;

        ViewTrackingStrategy(String str) {
            this.jsonValue = str;
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TelemetryConfigurationEvent)) {
            return false;
        }
        TelemetryConfigurationEvent telemetryConfigurationEvent = (TelemetryConfigurationEvent) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, telemetryConfigurationEvent.TuitionPaymentFragmentbindingInflater1) && this.b == telemetryConfigurationEvent.b && Intrinsics.areEqual(this.d, telemetryConfigurationEvent.d) && this.asInterface == telemetryConfigurationEvent.asInterface && Intrinsics.areEqual(this.onTransact, telemetryConfigurationEvent.onTransact) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, telemetryConfigurationEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.asBinder, telemetryConfigurationEvent.asBinder) && Intrinsics.areEqual(this.notify, telemetryConfigurationEvent.notify) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, telemetryConfigurationEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, telemetryConfigurationEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.g, telemetryConfigurationEvent.g);
    }

    public final int hashCode() {
        int iHashCode = this.TuitionPaymentFragmentbindingInflater1.hashCode();
        int iHashCode2 = Long.hashCode(this.b);
        int iHashCode3 = this.d.hashCode();
        int iHashCode4 = this.asInterface.hashCode();
        int iHashCode5 = this.onTransact.hashCode();
        b bVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode6 = bVar == null ? 0 : bVar.hashCode();
        g gVar = this.asBinder;
        int iHashCode7 = gVar == null ? 0 : gVar.hashCode();
        cancelAll cancelall = this.notify;
        int iHashCode8 = cancelall == null ? 0 : cancelall.hashCode();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode9 = tuitionPaymentFragmentspecialinlinedviewModeldefault3 == null ? 0 : tuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        List<String> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentbindingInflater1;
        long j = this.b;
        String str = this.d;
        Source source = this.asInterface;
        String str2 = this.onTransact;
        b bVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        g gVar = this.asBinder;
        cancelAll cancelall = this.notify;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        List<String> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        asInterface asinterface = this.g;
        StringBuilder sb = new StringBuilder("TelemetryConfigurationEvent(TuitionPaymentFragmentbindingInflater1=");
        sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", b=");
        sb.append(j);
        sb.append(", d=");
        sb.append(str);
        sb.append(", asInterface=");
        sb.append(source);
        sb.append(", onTransact=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(bVar);
        sb.append(", asBinder=");
        sb.append(gVar);
        sb.append(", notify=");
        sb.append(cancelall);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(list);
        sb.append(", g=");
        sb.append(asinterface);
        sb.append(")");
        return sb.toString();
    }
}
