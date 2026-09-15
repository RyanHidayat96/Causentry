package com.datadog.android.telemetry.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import androidx.core.app.NotificationCompat;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u0000 '2\u00020\u0001:\n#('%!*.80,By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010.\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010*\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0006\n\u0004\b4\u0010-R\u0014\u00104\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010-R\u0016\u00105\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u00107"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryDebugEvent;", "", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "p0", "", "p1", "", "p2", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$Source;", "p3", "p4", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "p5", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$g;", "p6", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$asBinder;", "p7", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$b;", "p8", "", "p9", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$a;", "p10", "<init>", "(Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;JLjava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$Source;Ljava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$g;Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$asBinder;Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$b;Ljava/util/List;Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$a;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$b;", "b", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "J", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "asInterface", "Ljava/util/List;", "asBinder", "Ljava/lang/String;", "g", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$g;", "a", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$Source;", "d", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$a;", "cancelAll", "notify", "INotificationSideChannel", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$asBinder;", "Source"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class TelemetryDebugEvent {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public final asBinder notify;
    public final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final long TuitionPaymentFragmentbindingInflater1;
    public final b TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Source g;
    public final String asBinder;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final List<String> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final TuitionPaymentFragmentspecialinlinedviewModeldefault1 b;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public final String asInterface;
    public final a d;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final g a;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public final String cancelAll;

    public TelemetryDebugEvent(TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, long j, String str, Source source, String str2, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, g gVar, asBinder asbinder, b bVar, List<String> list, a aVar) {
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(source, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(aVar, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.TuitionPaymentFragmentbindingInflater1 = j;
        this.asBinder = str;
        this.g = source;
        this.cancelAll = str2;
        this.b = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.a = gVar;
        this.notify = asbinder;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bVar;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = list;
        this.d = aVar;
        this.asInterface = "telemetry";
    }

    public /* synthetic */ TelemetryDebugEvent(TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, long j, String str, Source source, String str2, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, g gVar, asBinder asbinder, b bVar, List list, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tuitionPaymentFragmentspecialinlinedviewModeldefault2, j, str, source, str2, (i & 32) != 0 ? null : tuitionPaymentFragmentspecialinlinedviewModeldefault1, (i & 64) != 0 ? null : gVar, (i & 128) != 0 ? null : asbinder, (i & 256) != 0 ? null : bVar, (i & 512) != 0 ? null : list, aVar);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TelemetryDebugEvent)) {
            return false;
        }
        TelemetryDebugEvent telemetryDebugEvent = (TelemetryDebugEvent) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, telemetryDebugEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && this.TuitionPaymentFragmentbindingInflater1 == telemetryDebugEvent.TuitionPaymentFragmentbindingInflater1 && Intrinsics.areEqual(this.asBinder, telemetryDebugEvent.asBinder) && this.g == telemetryDebugEvent.g && Intrinsics.areEqual(this.cancelAll, telemetryDebugEvent.cancelAll) && Intrinsics.areEqual(this.b, telemetryDebugEvent.b) && Intrinsics.areEqual(this.a, telemetryDebugEvent.a) && Intrinsics.areEqual(this.notify, telemetryDebugEvent.notify) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, telemetryDebugEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, telemetryDebugEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.d, telemetryDebugEvent.d);
    }

    public final int hashCode() {
        int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        int iHashCode2 = Long.hashCode(this.TuitionPaymentFragmentbindingInflater1);
        int iHashCode3 = this.asBinder.hashCode();
        int iHashCode4 = this.g.hashCode();
        int iHashCode5 = this.cancelAll.hashCode();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.b;
        int iHashCode6 = tuitionPaymentFragmentspecialinlinedviewModeldefault1 == null ? 0 : tuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        g gVar = this.a;
        int iHashCode7 = gVar == null ? 0 : gVar.hashCode();
        asBinder asbinder = this.notify;
        int iHashCode8 = asbinder == null ? 0 : asbinder.hashCode();
        b bVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode9 = bVar == null ? 0 : bVar.hashCode();
        List<String> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        long j = this.TuitionPaymentFragmentbindingInflater1;
        String str = this.asBinder;
        Source source = this.g;
        String str2 = this.cancelAll;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.b;
        g gVar = this.a;
        asBinder asbinder = this.notify;
        b bVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        List<String> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        a aVar = this.d;
        StringBuilder sb = new StringBuilder("TelemetryDebugEvent(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(j);
        sb.append(", asBinder=");
        sb.append(str);
        sb.append(", g=");
        sb.append(source);
        sb.append(", cancelAll=");
        sb.append(str2);
        sb.append(", b=");
        sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", a=");
        sb.append(gVar);
        sb.append(", notify=");
        sb.append(asbinder);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(bVar);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(list);
        sb.append(", d=");
        sb.append(aVar);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryDebugEvent$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryDebugEvent;"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
        public static TelemetryDebugEvent TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
            String str;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1;
            JsonElement jsonElement;
            g gVarTuitionPaymentFragmentbindingInflater1;
            JsonElement jsonElement2;
            asBinder asbinderTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            JsonElement jsonElement3;
            b bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            JsonElement jsonElement4;
            a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            JsonArray asJsonArray;
            JsonObject asJsonObject;
            JsonObject asJsonObject2;
            JsonObject asJsonObject3;
            String str2 = "Unable to parse json into type TelemetryDebugEvent";
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                try {
                    JsonObject asJsonObject4 = p0.get("_dd").getAsJsonObject();
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2.Companion companion = TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(asJsonObject4, "");
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject4);
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
                                tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject5);
                            }
                            jsonElement = p0.get("session");
                            if (jsonElement != null || (asJsonObject3 = jsonElement.getAsJsonObject()) == null) {
                                gVarTuitionPaymentFragmentbindingInflater1 = null;
                            } else {
                                g.Companion companion4 = g.INSTANCE;
                                gVarTuitionPaymentFragmentbindingInflater1 = g.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject3);
                            }
                            jsonElement2 = p0.get("view");
                            if (jsonElement2 != null || (asJsonObject2 = jsonElement2.getAsJsonObject()) == null) {
                                asbinderTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                            } else {
                                asBinder.Companion companion5 = asBinder.INSTANCE;
                                asbinderTuitionPaymentFragmentspecialinlinedviewModeldefault1 = asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject2);
                            }
                            jsonElement3 = p0.get("action");
                            if (jsonElement3 != null || (asJsonObject = jsonElement3.getAsJsonObject()) == null) {
                                bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                            } else {
                                b.Companion companion6 = b.INSTANCE;
                                bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = b.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject);
                            }
                            jsonElement4 = p0.get("experimental_features");
                            if (jsonElement4 == null && (asJsonArray = jsonElement4.getAsJsonArray()) != null) {
                                str = "Unable to parse json into type TelemetryDebugEvent";
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
                            a.Companion companion7 = a.INSTANCE;
                            Intrinsics.checkNotNullExpressionValue(asJsonObject6, "");
                            aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = a.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject6);
                            if (Intrinsics.areEqual(asString, "telemetry")) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                            Intrinsics.checkNotNullExpressionValue(asString2, "");
                            Intrinsics.checkNotNullExpressionValue(asString4, "");
                            return new TelemetryDebugEvent(TuitionPaymentFragmentspecialinlinedviewModeldefault2, asLong, asString2, sourceTuitionPaymentFragmentspecialinlinedviewModeldefault1, asString4, tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1, gVarTuitionPaymentFragmentbindingInflater1, asbinderTuitionPaymentFragmentspecialinlinedviewModeldefault1, bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2, arrayList, aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        } catch (IllegalStateException e5) {
                            e = e5;
                            throw new JsonParseException(str2, e);
                        } catch (NumberFormatException e6) {
                            e = e6;
                            throw new JsonParseException(str2, e);
                        }
                    }
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1 = null;
                    jsonElement = p0.get("session");
                    if (jsonElement != null) {
                        gVarTuitionPaymentFragmentbindingInflater1 = null;
                    } else {
                        gVarTuitionPaymentFragmentbindingInflater1 = null;
                    }
                    jsonElement2 = p0.get("view");
                    if (jsonElement2 != null) {
                        asbinderTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    } else {
                        asbinderTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    }
                    jsonElement3 = p0.get("action");
                    if (jsonElement3 != null) {
                        bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    } else {
                        bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    }
                    jsonElement4 = p0.get("experimental_features");
                    if (jsonElement4 == null) {
                    }
                    JsonObject asJsonObject7 = p0.get("telemetry").getAsJsonObject();
                    a.Companion companion8 = a.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(asJsonObject7, "");
                    aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = a.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject7);
                    if (Intrinsics.areEqual(asString, "telemetry")) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    Intrinsics.checkNotNullExpressionValue(asString2, "");
                    Intrinsics.checkNotNullExpressionValue(asString4, "");
                    return new TelemetryDebugEvent(TuitionPaymentFragmentspecialinlinedviewModeldefault2, asLong, asString2, sourceTuitionPaymentFragmentspecialinlinedviewModeldefault1, asString4, tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1, gVarTuitionPaymentFragmentbindingInflater1, asbinderTuitionPaymentFragmentspecialinlinedviewModeldefault1, bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2, arrayList, aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                } catch (NullPointerException e7) {
                    e = e7;
                    str = "Unable to parse json into type TelemetryDebugEvent";
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "J", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final long TuitionPaymentFragmentbindingInflater1 = 2;

        /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: loaded from: classes6.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    if (p0.get("format_version").getAsLong() != 2) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    return new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentbindingInflater1 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, ((TuitionPaymentFragmentspecialinlinedviewModeldefault1) p0).TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentbindingInflater1.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentbindingInflater1=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes6.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$asInterface;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class asInterface {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static byte[] f755a;
        private static short[] asInterface;
        private static int b;
        private static int cancel;
        private static int d;
        private static int g;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static final byte[] $$c = {97, 58, 103, -72};
        private static final int $$f = 170;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {87, -91, 60, 112, 12, -2, -63, 57, 8, 0, -8, 5, -7, -55, 51, 13, -10, 14, -3, -6, -5, -54, 57, 6, 6, -69, 51, 20, -1, -12, -58, 51, 15, -7, -59, 69, -10, -2, 7, -5, 5, -64, 36, 19, 17, -7, -12, -2, 19, -11, 6, -1, -44, 45, 6, -7, -10, -17, 18, 13, 4, -13, -6, 2, 33, -12, 11, -11, 6, -1, -30, 17, 24, -12, -8, 9, 6, -46, 44, -17, 6, 6, -8, 9, 6, -1, -3, -11, -2, 6, -8, 11, -3, 5, -2, -3, 5, -9, -1, 18, -13, -4, 18, -42, 34, -11, 1, 7, -8, 1, 1, -5, 20, -9, 8, -67};
        private static final int $$e = 177;
        private static final byte[] $$a = {33, -59, 107, -108, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
        private static final int $$b = 72;
        private static int notify = 0;
        private static int cancelAll = 1;
        private static int asBinder = 0;

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r5, byte r6, int r7, java.lang.Object[] r8) {
            /*
                int r6 = r6 * 52
                int r6 = 55 - r6
                int r7 = r7 * 14
                int r7 = 98 - r7
                byte[] r0 = com.datadog.android.telemetry.model.TelemetryDebugEvent.asInterface.$$a
                int r5 = 53 - r5
                byte[] r1 = new byte[r5]
                r2 = 0
                if (r0 != 0) goto L14
                r4 = r5
                r3 = r2
                goto L28
            L14:
                r3 = r2
            L15:
                int r6 = r6 + 1
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r5) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L26:
                r4 = r0[r6]
            L28:
                int r7 = r7 + r4
                int r7 = r7 + (-10)
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.telemetry.model.TelemetryDebugEvent.asInterface.c(short, byte, int, java.lang.Object[]):void");
        }

        private static void f(byte b2, int i, byte b3, Object[] objArr) {
            int i2 = 64 - (b3 * 60);
            byte[] bArr = $$d;
            int i3 = i * 8;
            int i4 = (b2 * 15) + 84;
            byte[] bArr2 = new byte[i3 + 53];
            int i5 = i3 + 52;
            int i6 = -1;
            if (bArr == null) {
                i2++;
                i4 = i5 + i2;
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i4;
                if (i6 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    int i7 = bArr[i2];
                    i2++;
                    i4 += i7;
                }
            }
        }

        private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
            boolean z;
            int i4 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(g)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 2268;
                    int i5 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 34;
                    byte length = (byte) $$c.length;
                    byte b3 = (byte) (length - 4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, iLastIndexOf, i5, 1387473586, false, $$g(length, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                int i6 = iIntValue == -1 ? 1 : 0;
                if (i6 != 0) {
                    int i7 = $11 + 99;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        throw null;
                    }
                    byte[] bArr = f755a;
                    if (bArr != null) {
                        int length2 = bArr.length;
                        byte[] bArr2 = new byte[length2];
                        for (int i8 = 0; i8 < length2; i8++) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getLongPressTimeout() >> 16), Color.green(0) + 3358, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, -1054011043, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = f755a;
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(b)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                            int iAxisFromString = 2266 - MotionEvent.axisFromString("");
                            int iIndexOf = 33 - TextUtils.indexOf("", "");
                            byte length3 = (byte) $$c.length;
                            byte b6 = (byte) (length3 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, iAxisFromString, iIndexOf, 1387473586, false, $$g(length3, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) g) ^ 3046761265686732006L)));
                    } else {
                        iIntValue = (short) (((short) (((long) asInterface[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) g) ^ 3046761265686732006L)));
                    }
                }
                if (iIntValue > 0) {
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) b) ^ 3046761265686732006L)) + i6;
                    Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(d), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 3;
                        byte b8 = (byte) (b7 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 55904), 2855 - KeyEvent.normalizeMetaState(0), 13 - Drawable.resolveOpacity(0, 0), -1529949196, false, $$g(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr4 = f755a;
                    if (bArr4 != null) {
                        int length4 = bArr4.length;
                        byte[] bArr5 = new byte[length4];
                        for (int i9 = 0; i9 < length4; i9++) {
                            bArr5[i9] = (byte) (((long) bArr4[i9]) ^ 3046761265686732006L);
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        z = true;
                    } else {
                        int i10 = $10 + 49;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        z = false;
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        int i12 = $11 + 7;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        if (z) {
                            byte[] bArr6 = f755a;
                            int i14 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i14 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i14]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            short[] sArr = asInterface;
                            int i15 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i15 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i15]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        public asInterface(String str, String str2, String str3) {
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ asInterface(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = notify + 57;
                int i3 = i2 % 128;
                cancelAll = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                int i4 = i3 + 5;
                notify = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
                str = null;
            }
            if ((i & 2) != 0) {
                int i6 = 2 % 2;
                str2 = null;
            }
            this(str, str2, (i & 4) != 0 ? null : str3);
        }

        /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryDebugEvent$asInterface$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes6.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$asInterface$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$asInterface;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$asInterface;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static asInterface TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("build");
                    String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = p0.get("name");
                    String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    JsonElement jsonElement3 = p0.get("version");
                    return new asInterface(asString, asString2, jsonElement3 != null ? jsonElement3.getAsString() : null);
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

        public final int hashCode() throws Throwable {
            String str;
            int iHashCode;
            int i;
            int iHashCode2;
            Object[] objArr;
            int i2 = 2 % 2;
            int i3 = notify;
            int i4 = i3 + 53;
            cancelAll = i4 % 128;
            if (i4 % 2 == 0) {
                str = this.TuitionPaymentFragmentbindingInflater1;
                if (str == null) {
                    i = 1;
                    int i5 = i3 + 85;
                    cancelAll = i5 % 128;
                    int i6 = i5 % 2;
                    iHashCode = i;
                    iHashCode2 = 0;
                } else {
                    iHashCode = 1;
                    iHashCode2 = str.hashCode();
                }
            } else {
                str = this.TuitionPaymentFragmentbindingInflater1;
                if (str == null) {
                    i = 0;
                    int i7 = i3 + 85;
                    cancelAll = i7 % 128;
                    int i8 = i7 % 2;
                    iHashCode = i;
                    iHashCode2 = 0;
                } else {
                    iHashCode = 0;
                    iHashCode2 = str.hashCode();
                }
            }
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str3 != null) {
                int i9 = cancelAll + 121;
                notify = i9 % 128;
                int i10 = i9 % 2;
                iHashCode = str3.hashCode();
            }
            int i11 = iHashCode2 * 31;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cGreen = (char) (31533 - Color.green(0));
                int iArgb = 921 - Color.argb(0, 0, 0, 0);
                int iIndexOf = TextUtils.indexOf("", "") + 28;
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                c((byte) 52, bArr[37], bArr[80], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, iArgb, iIndexOf, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            e((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 721756497, (-95) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (short) (ViewConfiguration.getPressedStateDuration() >> 16), (byte) (73 - (Process.myTid() >> 22)), (-146672815) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(ExpandableListView.getPackedPositionGroup(0L) + 721756501, (-95) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (ViewConfiguration.getTouchSlop() >> 8), (byte) (3 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 146672794, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char bitsPerPixel = (char) (31532 - ImageFormat.getBitsPerPixel(0));
                int iMyTid = (Process.myTid() >> 22) + 921;
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 29;
                byte[] bArr2 = $$a;
                byte b2 = bArr2[80];
                byte b3 = bArr2[37];
                Object[] objArr5 = new Object[1];
                c(b2, b3, b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(bitsPerPixel, iMyTid, modifierMetaStateMask, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i12 = notify + 79;
                cancelAll = i12 % 128;
                int i13 = i12 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cResolveSizeAndState = (char) (31533 - View.resolveSizeAndState(0, 0, 0));
                    int iIndexOf2 = 920 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int size = 28 - View.MeasureSpec.getSize(0);
                    byte[] bArr3 = $$a;
                    Object[] objArr6 = new Object[1];
                    c(bArr3[33], bArr3[80], bArr3[37], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, iIndexOf2, size, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i14 = ((((-1123713015) + (((~(815703327 | iFreeMemory)) | 151062624) * (-140))) + ((~(966765951 | iFreeMemory)) * 70)) + (((~(iFreeMemory | 958376316)) | 159452259) * 70)) - 563938978;
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr[0])[0] = i16 ^ (i16 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                e(TextUtils.indexOf("", "") + 721756497, (-95) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (short) (MotionEvent.axisFromString("") + 1), (byte) ((-16) - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getTapTimeout() >> 16) - 146672779, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e((ViewConfiguration.getFadingEdgeLength() >> 16) + 721756499, TextUtils.getOffsetAfter("", 0) - 95, (short) View.resolveSizeAndState(0, 0, 0), (byte) (Color.alpha(0) - 95), (-146672753) - View.MeasureSpec.makeMeasureSpec(0, 0), objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                e(721756506 - (Process.myTid() >> 22), ExpandableListView.getPackedPositionType(0L) - 95, (short) View.MeasureSpec.getSize(0), (byte) (TextUtils.indexOf("", "") + 1), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 146672735, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                e((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 721756504, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 96, (short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((-107) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getTouchSlop() >> 8) - 146672719, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i17 = cancelAll + 1;
                notify = i17 % 128;
                int i18 = i17 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -563938978};
                    byte[] bArr4 = $$d;
                    byte b4 = bArr4[106];
                    byte b5 = b4;
                    Object[] objArr13 = new Object[1];
                    f(b4, b5, b5, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b6 = bArr4[9];
                    byte b7 = b6;
                    Object[] objArr14 = new Object[1];
                    f(b6, b7, b7, objArr14);
                    objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31533);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 921;
                        int iIndexOf3 = 28 - TextUtils.indexOf("", "", 0);
                        byte[] bArr5 = $$a;
                        Object[] objArr15 = new Object[1];
                        c(bArr5[33], bArr5[80], bArr5[37], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, scrollBarFadeDuration, iIndexOf3, -1142834547, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        e(Process.getGidForName("") + 721756498, Color.alpha(0) - 95, (short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (73 - (ViewConfiguration.getPressedStateDuration() >> 16)), ImageFormat.getBitsPerPixel(0) - 146672815, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        e(721756501 - (ViewConfiguration.getScrollBarSize() >> 8), (-94) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (byte) (View.combineMeasuredStates(0, 0) + 3), (KeyEvent.getMaxKeyCode() >> 16) - 146672794, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 31533);
                            int iResolveSizeAndState = 921 - View.resolveSizeAndState(0, 0, 0);
                            int iMyPid = (Process.myPid() >> 22) + 28;
                            byte[] bArr6 = $$a;
                            byte b8 = bArr6[80];
                            byte b9 = bArr6[37];
                            Object[] objArr18 = new Object[1];
                            c(b8, b9, b9, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(doubleTapTimeout, iResolveSizeAndState, iMyPid, -778300370, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cAlpha = (char) (31533 - Color.alpha(0));
                            int trimmedLength = 921 - TextUtils.getTrimmedLength("");
                            int trimmedLength2 = 28 - TextUtils.getTrimmedLength("");
                            byte[] bArr7 = $$a;
                            Object[] objArr19 = new Object[1];
                            c((byte) 52, bArr7[37], bArr7[80], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAlpha, trimmedLength, trimmedLength2, -1048449946, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    int i19 = cancelAll + 19;
                    notify = i19 % 128;
                    int i20 = i19 % 2;
                    for (String str4 : strArr) {
                        arrayList.add(str4);
                    }
                }
                throw null;
            }
            int i21 = ((int[]) objArr[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i22 = ~startElapsedRealtime;
            int i23 = i21 + (-1128424400) + (((~((-1418360388) | i22)) | 355719256) * 226) + (((~(i22 | (-1082664452))) | (~((-355719257) | startElapsedRealtime)) | 20023320) * (-113)) + ((~(startElapsedRealtime | (-1418360388))) * 113);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            Object obj = objArr20[0];
            ((int[]) obj)[0] = i25 ^ (i25 << 5);
            int i26 = ((int[]) obj)[0];
            int i27 = ((((i26 * i26) - (~(-(1657529138 * i26)))) - 1) - (~(-(i26 * 2075054428)))) - 1;
            int i28 = (i27 ^ (-1213464655)) + (((-1213464655) & i27) << 1);
            int i29 = i28 >> 26;
            int i30 = (((i29 ^ ComposerKt.defaultsKey) + ((i29 & ComposerKt.defaultsKey) << 1)) / 64) + 1;
            int i31 = (i28 ^ i30) + ((i30 & i28) << 1);
            int i32 = i28 >> 28;
            int i33 = -(i31 ^ ((((i32 & (-31)) + (i32 | (-31))) / 16) + 1));
            int i34 = (i33 & 8) + (i33 | 8);
            int i35 = i34 >> 17;
            int i36 = (((-65535) & i35) + (i35 | (-65535))) / 32768;
            int i37 = (i36 ^ 1) + ((i36 & 1) << 1);
            return ((i11 + iHashCode3) * (155744 / (((-((i37 & 1) + (i37 | 1))) & i34) * 628))) + iHashCode;
        }

        static {
            cancel = 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            INSTANCE = new Companion(null);
            int i = asBinder + 111;
            cancel = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public asInterface() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(Object p0) {
            int i = 2 % 2;
            int i2 = notify + 51;
            int i3 = i2 % 128;
            cancelAll = i3;
            int i4 = i2 % 2;
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof asInterface)) {
                int i5 = i3 + 3;
                notify = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            asInterface asinterface = (asInterface) p0;
            if (!Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, asinterface.TuitionPaymentFragmentbindingInflater1)) {
                int i7 = cancelAll + 71;
                notify = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            int i9 = notify + 69;
            cancelAll = i9 % 128;
            return i9 % 2 == 0;
        }

        public final String toString() {
            int i = 2 % 2;
            String str = this.TuitionPaymentFragmentbindingInflater1;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("asInterface(TuitionPaymentFragmentbindingInflater1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str3);
            sb.append(")");
            String string = sb.toString();
            int i2 = notify + 21;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            b = -2079109034;
            g = -1934795592;
            d = 1482130422;
            f755a = new byte[]{94, -89, 91, -84, -122, 121, -89, 94, -82, 85, -119, -118, 20, -85, -18, 101, 84, 85, 82, -95, 89, -94, 87, 29, -31, 16, -19, -18, 25, -10, 11, 26, 23, -26, -22, 16, -30, 90, 21, -22, -27, 28, 2, -51, 19, 29, -27, 27, -29, 7, 52, 5, -88, 22, 25, 37, -36, -19, -20, -21, 24, -32, 27, 82, -72, 65, -78, 84, -71, -67, -70, -69, 71, 104, -118, 65, 78, -76, 71, -70, 85, 84, -17, 22, -26, 29, -63, -62, 32, 30, -22, 18, -39, 42, 12, -14, 16, 84, 113, -123, 92, -85, -123, 98, 105, -65, 117, 123, -123, 118, 121, 113, -117};
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r7, int r8, byte r9) {
            /*
                int r7 = 121 - r7
                int r8 = r8 * 2
                int r8 = r8 + 4
                byte[] r0 = com.datadog.android.telemetry.model.TelemetryDebugEvent.asInterface.$$c
                int r9 = r9 * 2
                int r9 = r9 + 1
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L27
            L14:
                r3 = r2
            L15:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r9) goto L22
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L22:
                r3 = r0[r8]
                r6 = r3
                r3 = r8
                r8 = r6
            L27:
                int r8 = -r8
                int r7 = r7 + r8
                int r8 = r3 + 1
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.telemetry.model.TelemetryDebugEvent.asInterface.$$g(byte, int, byte):java.lang.String");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$g;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class g {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String b;

        public g(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.b = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof g) && Intrinsics.areEqual(this.b, ((g) p0).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            String str = this.b;
            StringBuilder sb = new StringBuilder("g(b=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryDebugEvent$g$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes6.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$g$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$g;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$g;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static g TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$asBinder;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class asBinder {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public asBinder(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof asBinder) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((asBinder) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("asBinder(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryDebugEvent$asBinder$b, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes6.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$asBinder$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$asBinder;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$asBinder;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static asBinder TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("id").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new asBinder(asString);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$b;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final String b;

        public b(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.b = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof b) && Intrinsics.areEqual(this.b, ((b) p0).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            String str = this.b;
            StringBuilder sb = new StringBuilder("b(b=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryDebugEvent$b$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes6.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$b$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$b;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$b;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static b TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("id").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new b(asString);
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

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0017\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u001f\u0010\u001a"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$a;", "", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$asInterface;", "p1", "", "p2", "", "p3", "<init>", "(Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$asInterface;Ljava/lang/String;Ljava/util/Map;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/util/Map;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "g", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$asInterface;", "b", "a", "d"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final String[] b = {"device", "os", "type", NotificationCompat.CATEGORY_STATUS, "message"};

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final String a;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public final asInterface b;

        public a(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, asInterface asinterface, String str, Map<String, Object> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.b = asinterface;
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = map;
            this.a = "log";
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "debug";
        }

        public /* synthetic */ a(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, asInterface asinterface, String str, LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : tuitionPaymentFragmentspecialinlinedviewModeldefault3, (i & 2) != 0 ? null : asinterface, str, (i & 8) != 0 ? new LinkedHashMap() : linkedHashMap);
        }

        /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryDebugEvent$a$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes6.dex */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$a$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$a;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$a;", "", "", "b", "[Ljava/lang/String;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static a TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                asInterface asinterfaceTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                JsonObject asJsonObject;
                JsonObject asJsonObject2;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("device");
                    if (jsonElement == null || (asJsonObject2 = jsonElement.getAsJsonObject()) == null) {
                        tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    } else {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3.Companion companion = TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE;
                        tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject2);
                    }
                    JsonElement jsonElement2 = p0.get("os");
                    if (jsonElement2 == null || (asJsonObject = jsonElement2.getAsJsonObject()) == null) {
                        asinterfaceTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    } else {
                        asInterface.Companion companion2 = asInterface.INSTANCE;
                        asinterfaceTuitionPaymentFragmentspecialinlinedviewModeldefault2 = asInterface.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject);
                    }
                    JsonElement jsonElement3 = p0.get("type");
                    String asString = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    String asString2 = p0.get(NotificationCompat.CATEGORY_STATUS).getAsString();
                    String asString3 = p0.get("message").getAsString();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, JsonElement> entry : p0.entrySet()) {
                        if (!ArraysKt.contains(a.b, entry.getKey())) {
                            String key = entry.getKey();
                            Intrinsics.checkNotNullExpressionValue(key, "");
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    if (asString != null && !Intrinsics.areEqual(asString, "log")) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (!Intrinsics.areEqual(asString2, "debug")) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    Intrinsics.checkNotNullExpressionValue(asString3, "");
                    return new a(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2, asinterfaceTuitionPaymentFragmentspecialinlinedviewModeldefault2, asString3, linkedHashMap);
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
            if (!(p0 instanceof a)) {
                return false;
            }
            a aVar = (a) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, aVar.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode = tuitionPaymentFragmentspecialinlinedviewModeldefault3 == null ? 0 : tuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
            asInterface asinterface = this.b;
            return (((((iHashCode * 31) + (asinterface != null ? asinterface.hashCode() : 0)) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            asInterface asinterface = this.b;
            String str = this.TuitionPaymentFragmentbindingInflater1;
            Map<String, Object> map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("a(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
            sb.append(", b=");
            sb.append(asinterface);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String b;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, String str2, String str3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
            this.b = str3;
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
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
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, tuitionPaymentFragmentspecialinlinedviewModeldefault3.b);
        }

        public final int hashCode() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.b;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str3 = this.b;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str2);
            sb.append(", b=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes6.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("architecture");
                    String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = p0.get("brand");
                    String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    JsonElement jsonElement3 = p0.get("model");
                    return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(asString, asString2, jsonElement3 != null ? jsonElement3.getAsString() : null);
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
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$Source;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "a", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asInterface", "asBinder", "g"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Source {
        ANDROID("android"),
        IOS("ios"),
        BROWSER("browser"),
        FLUTTER("flutter"),
        REACT_NATIVE("react-native"),
        UNITY("unity"),
        KOTLIN_MULTIPLATFORM("kotlin-multiplatform");


        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        Source(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.telemetry.model.TelemetryDebugEvent$Source$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes6.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$Source$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$Source;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$Source;"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
}
