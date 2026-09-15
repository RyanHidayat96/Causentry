package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.rum.model.ActionEvent;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.LongTaskEvent;
import com.datadog.android.rum.model.ResourceEvent;
import com.datadog.android.rum.model.ViewEvent;
import com.datadog.android.telemetry.model.TelemetryConfigurationEvent;
import com.datadog.android.telemetry.model.TelemetryDebugEvent;
import com.datadog.android.telemetry.model.TelemetryErrorEvent;
import com.datadog.android.telemetry.model.TelemetryUsageEvent;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010%\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00162\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0015H\u0002¢\u0006\u0004\b\r\u0010\u0017J3\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00162\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0015H\u0002¢\u0006\u0004\b\u0010\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"LsetSurfaceAspectRatio;", "LImageReaderFormatRecommender;", "", "Lcom/datadog/android/api/InternalLogger;", "p0", "LcomputeDispatchCropRect;", "p1", "<init>", "(Lcom/datadog/android/api/InternalLogger;LcomputeDispatchCropRect;)V", "Lcom/google/gson/JsonObject;", "b", "(Lcom/google/gson/JsonObject;)Lcom/google/gson/JsonObject;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/Object;)Ljava/lang/String;", "Lcom/datadog/android/rum/model/ActionEvent;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/datadog/android/rum/model/ActionEvent;)Ljava/lang/String;", "Lcom/datadog/android/rum/model/ErrorEvent;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/datadog/android/rum/model/ErrorEvent;)Ljava/lang/String;", "", "", "(Ljava/util/Map;)Ljava/util/Map;", "LcomputeDispatchCropRect;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "a", "Lcom/datadog/android/api/InternalLogger;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3_"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class setSurfaceAspectRatio implements ImageReaderFormatRecommender<Object> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final computeDispatchCropRect TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InternalLogger b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3_, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<String> b = SetsKt.setOf((Object[]) new String[]{"action.gesture.direction", "action.gesture.from_state", "action.gesture.to_state", "action.target.parent.resource_id", "action.target.parent.classname", "action.target.parent.index", "action.target.classname", "action.target.resource_id", "action.target.title", "error.resource.method", "error.resource.status_code", "error.resource.url"});
    private static final Set<String> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = SetsKt.setOf((Object[]) new String[]{"_dd.timestamp", "_dd.error_type", "_dd.error.source_type", "_dd.error.is_crash"});
    private static final Set<String> TuitionPaymentFragmentbindingInflater1 = SetsKt.setOf((Object[]) new String[]{"_dd.timestamp", "_dd.error_type", "_dd.error.source_type", "_dd.error.is_crash"});

    private setSurfaceAspectRatio(InternalLogger internalLogger, computeDispatchCropRect computedispatchcroprect) {
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(computedispatchcroprect, "");
        this.b = internalLogger;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = computedispatchcroprect;
    }

    public /* synthetic */ setSurfaceAspectRatio(InternalLogger internalLogger, getImageCaptureCapabilities getimagecapturecapabilities, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(internalLogger, (i & 2) != 0 ? new getImageCaptureCapabilities(internalLogger) : getimagecapturecapabilities);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ImageReaderFormatRecommender
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object p0) {
        LongTaskEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizerTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        ResourceEvent.getExtras getextrasTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        ViewEvent.getItem getitemTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        ViewEvent.a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(p0, "");
        String str3 = "source";
        Object objB = null;
        if (!(p0 instanceof ViewEvent)) {
            if (p0 instanceof ErrorEvent) {
                return TuitionPaymentFragmentbindingInflater1((ErrorEvent) p0);
            }
            if (p0 instanceof ActionEvent) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2((ActionEvent) p0);
            }
            if (p0 instanceof ResourceEvent) {
                ResourceEvent resourceEvent = (ResourceEvent) p0;
                ResourceEvent.getExtras getextrasB = resourceEvent.b();
                if (getextrasB != null) {
                    toBitmap tobitmap = toBitmap.INSTANCE;
                    getextrasTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ResourceEvent.getExtras.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getextrasB, MapsKt.toMutableMap(toBitmap.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault2(resourceEvent.b().TuitionPaymentFragmentbindingInflater1), this.b)));
                } else {
                    getextrasTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                }
                if (resourceEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3() != null) {
                    toBitmap tobitmap2 = toBitmap.INSTANCE;
                    objB = ResourceEvent.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(MapsKt.toMutableMap(toBitmap.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault1(resourceEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1), this.b)));
                }
                JsonObject asJsonObject = ResourceEvent.TuitionPaymentFragmentbindingInflater1(resourceEvent, getextrasTuitionPaymentFragmentspecialinlinedviewModeldefault2, objB).TuitionPaymentFragmentspecialinlinedviewModeldefault2().getAsJsonObject();
                Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                String string = b(asJsonObject).toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }
            if (!(p0 instanceof LongTaskEvent)) {
                if (!(p0 instanceof TelemetryDebugEvent)) {
                    if (p0 instanceof TelemetryErrorEvent) {
                        String string2 = ((TelemetryErrorEvent) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault2().toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "");
                        return string2;
                    }
                    if (p0 instanceof TelemetryConfigurationEvent) {
                        String string3 = ((TelemetryConfigurationEvent) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault3().toString();
                        Intrinsics.checkNotNullExpressionValue(string3, "");
                        return string3;
                    }
                    if (p0 instanceof TelemetryUsageEvent) {
                        String string4 = ((TelemetryUsageEvent) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault2().toString();
                        Intrinsics.checkNotNullExpressionValue(string4, "");
                        return string4;
                    }
                    if (p0 instanceof JsonObject) {
                        return p0.toString();
                    }
                    String string5 = new JsonObject().toString();
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    return string5;
                }
                TelemetryDebugEvent telemetryDebugEvent = (TelemetryDebugEvent) p0;
                JsonObject jsonObject = new JsonObject();
                TelemetryDebugEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = telemetryDebugEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("format_version", Long.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1));
                jsonObject.add("_dd", jsonObject2);
                jsonObject.addProperty("type", telemetryDebugEvent.asInterface);
                jsonObject.addProperty("date", Long.valueOf(telemetryDebugEvent.TuitionPaymentFragmentbindingInflater1));
                jsonObject.addProperty(NotificationCompat.CATEGORY_SERVICE, telemetryDebugEvent.asBinder);
                jsonObject.add("source", new JsonPrimitive(telemetryDebugEvent.g.jsonValue));
                jsonObject.addProperty("version", telemetryDebugEvent.cancelAll);
                TelemetryDebugEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = telemetryDebugEvent.b;
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                    JsonObject jsonObject3 = new JsonObject();
                    jsonObject3.addProperty("id", tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1);
                    jsonObject.add("application", jsonObject3);
                }
                TelemetryDebugEvent.g gVar = telemetryDebugEvent.a;
                if (gVar != null) {
                    JsonObject jsonObject4 = new JsonObject();
                    jsonObject4.addProperty("id", gVar.b);
                    jsonObject.add("session", jsonObject4);
                }
                TelemetryDebugEvent.asBinder asbinder = telemetryDebugEvent.notify;
                if (asbinder != null) {
                    JsonObject jsonObject5 = new JsonObject();
                    jsonObject5.addProperty("id", asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    jsonObject.add("view", jsonObject5);
                }
                TelemetryDebugEvent.b bVar = telemetryDebugEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (bVar != null) {
                    JsonObject jsonObject6 = new JsonObject();
                    jsonObject6.addProperty("id", bVar.b);
                    jsonObject.add("action", jsonObject6);
                }
                List<String> list = telemetryDebugEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (list != null) {
                    JsonArray jsonArray = new JsonArray(list.size());
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        jsonArray.add((String) it.next());
                    }
                    jsonObject.add("experimental_features", jsonArray);
                }
                TelemetryDebugEvent.a aVar = telemetryDebugEvent.d;
                JsonObject jsonObject7 = new JsonObject();
                TelemetryDebugEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                    JsonObject jsonObject8 = new JsonObject();
                    String str4 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (str4 != null) {
                        jsonObject8.addProperty("architecture", str4);
                    }
                    String str5 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (str5 != null) {
                        jsonObject8.addProperty("brand", str5);
                    }
                    String str6 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
                    if (str6 != null) {
                        jsonObject8.addProperty("model", str6);
                    }
                    jsonObject7.add("device", jsonObject8);
                }
                TelemetryDebugEvent.asInterface asinterface = aVar.b;
                if (asinterface != null) {
                    JsonObject jsonObject9 = new JsonObject();
                    String str7 = asinterface.TuitionPaymentFragmentbindingInflater1;
                    if (str7 != null) {
                        jsonObject9.addProperty("build", str7);
                    }
                    String str8 = asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (str8 != null) {
                        jsonObject9.addProperty("name", str8);
                    }
                    String str9 = asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (str9 != null) {
                        jsonObject9.addProperty("version", str9);
                    }
                    jsonObject7.add("os", jsonObject9);
                }
                jsonObject7.addProperty("type", aVar.a);
                jsonObject7.addProperty(NotificationCompat.CATEGORY_STATUS, aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                jsonObject7.addProperty("message", aVar.TuitionPaymentFragmentbindingInflater1);
                for (Map.Entry<String, Object> entry : aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!ArraysKt.contains(TelemetryDebugEvent.a.b, key)) {
                        toBitmap tobitmap3 = toBitmap.INSTANCE;
                        jsonObject7.add(key, toBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3(value));
                    }
                }
                jsonObject.add("telemetry", jsonObject7);
                String string6 = jsonObject.toString();
                Intrinsics.checkNotNullExpressionValue(string6, "");
                return string6;
            }
            LongTaskEvent longTaskEvent = (LongTaskEvent) p0;
            LongTaskEvent.RemoteActionCompatParcelizer iNotificationSideChannelStubProxy = longTaskEvent.getINotificationSideChannelStubProxy();
            if (iNotificationSideChannelStubProxy != null) {
                toBitmap tobitmap4 = toBitmap.INSTANCE;
                remoteActionCompatParcelizerTuitionPaymentFragmentspecialinlinedviewModeldefault1 = LongTaskEvent.RemoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iNotificationSideChannelStubProxy, MapsKt.toMutableMap(toBitmap.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault2(longTaskEvent.getINotificationSideChannelStubProxy().TuitionPaymentFragmentspecialinlinedviewModeldefault1), this.b)));
            } else {
                remoteActionCompatParcelizerTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            }
            if (longTaskEvent.getG() != null) {
                toBitmap tobitmap5 = toBitmap.INSTANCE;
                objB = LongTaskEvent.asBinder.b(MapsKt.toMutableMap(toBitmap.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault1(longTaskEvent.getG().TuitionPaymentFragmentspecialinlinedviewModeldefault2), this.b)));
            }
            LongTaskEvent longTaskEventTuitionPaymentFragmentbindingInflater1 = LongTaskEvent.TuitionPaymentFragmentbindingInflater1(longTaskEvent, remoteActionCompatParcelizerTuitionPaymentFragmentspecialinlinedviewModeldefault1, objB);
            JsonObject jsonObject10 = new JsonObject();
            jsonObject10.addProperty("date", Long.valueOf(longTaskEventTuitionPaymentFragmentbindingInflater1.asInterface));
            LongTaskEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = longTaskEventTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            JsonObject jsonObject11 = new JsonObject();
            jsonObject11.addProperty("id", tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            jsonObject10.add("application", jsonObject11);
            String str10 = longTaskEventTuitionPaymentFragmentbindingInflater1.INotificationSideChannel;
            if (str10 != null) {
                jsonObject10.addProperty(NotificationCompat.CATEGORY_SERVICE, str10);
            }
            String str11 = longTaskEventTuitionPaymentFragmentbindingInflater1.connect;
            if (str11 != null) {
                jsonObject10.addProperty("version", str11);
            }
            String str12 = longTaskEventTuitionPaymentFragmentbindingInflater1.b;
            if (str12 != null) {
                jsonObject10.addProperty("build_version", str12);
            }
            String str13 = longTaskEventTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str13 != null) {
                jsonObject10.addProperty("build_id", str13);
            }
            LongTaskEvent.INotificationSideChannelDefault iNotificationSideChannelDefault = longTaskEventTuitionPaymentFragmentbindingInflater1.INotificationSideChannelDefault;
            JsonObject jsonObject12 = new JsonObject();
            jsonObject12.addProperty("id", iNotificationSideChannelDefault.b);
            jsonObject12.add("type", new JsonPrimitive(iNotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1.jsonValue));
            Boolean bool = iNotificationSideChannelDefault.TuitionPaymentFragmentbindingInflater1;
            if (bool != null) {
                jsonObject12.addProperty("has_replay", Boolean.valueOf(bool.booleanValue()));
            }
            jsonObject10.add("session", jsonObject12);
            LongTaskEvent.LongTaskEventSource longTaskEventSource = longTaskEventTuitionPaymentFragmentbindingInflater1.INotificationSideChannelStub;
            if (longTaskEventSource != null) {
                jsonObject10.add("source", longTaskEventSource.b());
            }
            LongTaskEvent.INotificationSideChannelStub iNotificationSideChannelStub = longTaskEventTuitionPaymentFragmentbindingInflater1.MediaBrowserCompat;
            JsonObject jsonObject13 = new JsonObject();
            jsonObject13.addProperty("id", iNotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            String str14 = iNotificationSideChannelStub.b;
            if (str14 != null) {
                jsonObject13.addProperty("referrer", str14);
            }
            jsonObject13.addProperty(ImagesContract.URL, iNotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String str15 = iNotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str15 != null) {
                jsonObject13.addProperty("name", str15);
            }
            jsonObject10.add("view", jsonObject13);
            LongTaskEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer = longTaskEventTuitionPaymentFragmentbindingInflater1.INotificationSideChannelStubProxy;
            if (remoteActionCompatParcelizer != null) {
                JsonObject jsonObject14 = new JsonObject();
                String str16 = remoteActionCompatParcelizer.TuitionPaymentFragmentbindingInflater1;
                if (str16 != null) {
                    jsonObject14.addProperty("id", str16);
                }
                String str17 = remoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (str17 != null) {
                    jsonObject14.addProperty("name", str17);
                }
                String str18 = remoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str18 != null) {
                    jsonObject14.addProperty("email", str18);
                }
                for (Map.Entry<String, Object> entry2 : remoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault1.entrySet()) {
                    String key2 = entry2.getKey();
                    Object value2 = entry2.getValue();
                    if (!ArraysKt.contains(LongTaskEvent.RemoteActionCompatParcelizer.b, key2)) {
                        toBitmap tobitmap6 = toBitmap.INSTANCE;
                        jsonObject14.add(key2, toBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3(value2));
                    }
                }
                jsonObject10.add("usr", jsonObject14);
            }
            LongTaskEvent.d dVar = longTaskEventTuitionPaymentFragmentbindingInflater1.asBinder;
            if (dVar != null) {
                JsonObject jsonObject15 = new JsonObject();
                jsonObject15.add(NotificationCompat.CATEGORY_STATUS, new JsonPrimitive(dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2.jsonValue));
                List<LongTaskEvent.Interface> list2 = dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (list2 != null) {
                    JsonArray jsonArray2 = new JsonArray(list2.size());
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        jsonArray2.add(new JsonPrimitive(((LongTaskEvent.Interface) it2.next()).jsonValue));
                    }
                    jsonObject15.add("interfaces", jsonArray2);
                }
                LongTaskEvent.EffectiveType effectiveType = dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (effectiveType != null) {
                    jsonObject15.add("effective_type", new JsonPrimitive(effectiveType.jsonValue));
                }
                LongTaskEvent.b bVar2 = dVar.TuitionPaymentFragmentbindingInflater1;
                if (bVar2 != null) {
                    JsonObject jsonObject16 = new JsonObject();
                    String str19 = bVar2.TuitionPaymentFragmentbindingInflater1;
                    if (str19 != null) {
                        jsonObject16.addProperty("technology", str19);
                    }
                    String str20 = bVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (str20 != null) {
                        jsonObject16.addProperty("carrier_name", str20);
                    }
                    jsonObject15.add("cellular", jsonObject16);
                }
                jsonObject10.add("connectivity", jsonObject15);
            }
            LongTaskEvent.onTransact ontransact = longTaskEventTuitionPaymentFragmentbindingInflater1.cancel;
            if (ontransact != null) {
                JsonObject jsonObject17 = new JsonObject();
                LongTaskEvent.connect connectVar = ontransact.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (connectVar != null) {
                    JsonObject jsonObject18 = new JsonObject();
                    jsonObject18.addProperty("width", connectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    jsonObject18.addProperty("height", connectVar.TuitionPaymentFragmentbindingInflater1);
                    jsonObject17.add("viewport", jsonObject18);
                }
                jsonObject10.add(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, jsonObject17);
            }
            LongTaskEvent.INotificationSideChannelStubProxy iNotificationSideChannelStubProxy2 = longTaskEventTuitionPaymentFragmentbindingInflater1.RemoteActionCompatParcelizer;
            if (iNotificationSideChannelStubProxy2 != null) {
                JsonObject jsonObject19 = new JsonObject();
                jsonObject19.addProperty("test_id", iNotificationSideChannelStubProxy2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                jsonObject19.addProperty("result_id", iNotificationSideChannelStubProxy2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                Boolean bool2 = iNotificationSideChannelStubProxy2.TuitionPaymentFragmentbindingInflater1;
                if (bool2 != null) {
                    jsonObject19.addProperty("injected", Boolean.valueOf(bool2.booleanValue()));
                }
                jsonObject10.add("synthetics", jsonObject19);
            }
            LongTaskEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault5 = longTaskEventTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault5 != null) {
                JsonObject jsonObject20 = new JsonObject();
                jsonObject20.addProperty("test_execution_id", tuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                jsonObject10.add("ci_test", jsonObject20);
            }
            LongTaskEvent.getInterfaceDescriptor getinterfacedescriptor = longTaskEventTuitionPaymentFragmentbindingInflater1.onTransact;
            if (getinterfacedescriptor != null) {
                JsonObject jsonObject21 = new JsonObject();
                jsonObject21.addProperty("name", getinterfacedescriptor.TuitionPaymentFragmentbindingInflater1);
                jsonObject21.addProperty("version", getinterfacedescriptor.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                String str21 = getinterfacedescriptor.b;
                if (str21 != null) {
                    jsonObject21.addProperty("build", str21);
                }
                jsonObject21.addProperty("version_major", getinterfacedescriptor.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                jsonObject10.add("os", jsonObject21);
            }
            LongTaskEvent.cancelAll cancelall = longTaskEventTuitionPaymentFragmentbindingInflater1.cancelAll;
            if (cancelall != null) {
                JsonObject jsonObject22 = new JsonObject();
                jsonObject22.add("type", new JsonPrimitive(cancelall.TuitionPaymentFragmentspecialinlinedviewModeldefault1.jsonValue));
                String str22 = cancelall.TuitionPaymentFragmentbindingInflater1;
                if (str22 != null) {
                    jsonObject22.addProperty("name", str22);
                }
                String str23 = cancelall.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str23 != null) {
                    jsonObject22.addProperty("model", str23);
                }
                String str24 = cancelall.b;
                if (str24 != null) {
                    jsonObject22.addProperty("brand", str24);
                }
                String str25 = cancelall.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (str25 != null) {
                    jsonObject22.addProperty("architecture", str25);
                }
                jsonObject10.add("device", jsonObject22);
            }
            LongTaskEvent.cancel cancelVar = longTaskEventTuitionPaymentFragmentbindingInflater1.a;
            JsonObject jsonObject23 = new JsonObject();
            jsonObject23.addProperty("format_version", Long.valueOf(cancelVar.b));
            LongTaskEvent.notify notifyVar = cancelVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (notifyVar != null) {
                JsonObject jsonObject24 = new JsonObject();
                LongTaskEvent.Plan plan = notifyVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (plan != null) {
                    jsonObject24.add("plan", new JsonPrimitive(plan.jsonValue));
                }
                LongTaskEvent.SessionPrecondition sessionPrecondition = notifyVar.b;
                if (sessionPrecondition != null) {
                    jsonObject24.add("session_precondition", new JsonPrimitive(sessionPrecondition.jsonValue));
                }
                jsonObject23.add("session", jsonObject24);
            }
            LongTaskEvent.g gVar2 = cancelVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (gVar2 != null) {
                JsonObject jsonObject25 = new JsonObject();
                jsonObject25.addProperty("session_sample_rate", gVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                Number number = gVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (number != null) {
                    jsonObject25.addProperty("session_replay_sample_rate", number);
                }
                jsonObject23.add("configuration", jsonObject25);
            }
            String str26 = cancelVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str26 != null) {
                jsonObject23.addProperty("browser_sdk_version", str26);
            }
            Boolean bool3 = cancelVar.TuitionPaymentFragmentbindingInflater1;
            if (bool3 != null) {
                jsonObject23.addProperty("discarded", Boolean.valueOf(bool3.booleanValue()));
            }
            jsonObject10.add("_dd", jsonObject23);
            LongTaskEvent.asBinder asbinder2 = longTaskEventTuitionPaymentFragmentbindingInflater1.g;
            if (asbinder2 != null) {
                JsonObject jsonObject26 = new JsonObject();
                for (Map.Entry<String, Object> entry3 : asbinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.entrySet()) {
                    String key3 = entry3.getKey();
                    Object value3 = entry3.getValue();
                    toBitmap tobitmap7 = toBitmap.INSTANCE;
                    jsonObject26.add(key3, toBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3(value3));
                }
                jsonObject10.add("context", jsonObject26);
            }
            LongTaskEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault6 = longTaskEventTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault6 != null) {
                JsonObject jsonObject27 = new JsonObject();
                JsonArray jsonArray3 = new JsonArray(tuitionPaymentFragmentspecialinlinedviewModeldefault6.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size());
                Iterator<T> it3 = tuitionPaymentFragmentspecialinlinedviewModeldefault6.TuitionPaymentFragmentspecialinlinedviewModeldefault2.iterator();
                while (it3.hasNext()) {
                    jsonArray3.add((String) it3.next());
                }
                jsonObject27.add("id", jsonArray3);
                jsonObject10.add("action", jsonObject27);
            }
            LongTaskEvent.asInterface asinterface2 = longTaskEventTuitionPaymentFragmentbindingInflater1.d;
            if (asinterface2 != null) {
                JsonObject jsonObject28 = new JsonObject();
                LongTaskEvent.a aVar2 = asinterface2.TuitionPaymentFragmentbindingInflater1;
                JsonObject jsonObject29 = new JsonObject();
                jsonObject29.addProperty("id", aVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                jsonObject28.add("view", jsonObject29);
                jsonObject28.add("source", asinterface2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b());
                jsonObject10.add("container", jsonObject28);
            }
            jsonObject10.addProperty("type", longTaskEventTuitionPaymentFragmentbindingInflater1.getInterfaceDescriptor);
            LongTaskEvent.INotificationSideChannel iNotificationSideChannel = longTaskEventTuitionPaymentFragmentbindingInflater1.notify;
            JsonObject jsonObject30 = new JsonObject();
            String str27 = iNotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str27 != null) {
                jsonObject30.addProperty("id", str27);
            }
            jsonObject30.addProperty(TypedValues.TransitionType.S_DURATION, Long.valueOf(iNotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            Boolean bool4 = iNotificationSideChannel.TuitionPaymentFragmentbindingInflater1;
            if (bool4 != null) {
                jsonObject30.addProperty("is_frozen_frame", Boolean.valueOf(bool4.booleanValue()));
            }
            jsonObject10.add("long_task", jsonObject30);
            JsonObject asJsonObject2 = jsonObject10.getAsJsonObject();
            Intrinsics.checkNotNullExpressionValue(asJsonObject2, "");
            String string7 = b(asJsonObject2).toString();
            Intrinsics.checkNotNullExpressionValue(string7, "");
            return string7;
        }
        ViewEvent viewEvent = (ViewEvent) p0;
        ViewEvent.getItem getitem = viewEvent.getInterfaceDescriptor;
        if (getitem != null) {
            toBitmap tobitmap8 = toBitmap.INSTANCE;
            getitemTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ViewEvent.getItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getitem, MapsKt.toMutableMap(toBitmap.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(viewEvent.getInterfaceDescriptor.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "usr", "user extra information", TuitionPaymentFragmentspecialinlinedviewModeldefault1), this.b)));
        } else {
            getitemTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        }
        if (viewEvent.g != null) {
            toBitmap tobitmap9 = toBitmap.INSTANCE;
            aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ViewEvent.a.TuitionPaymentFragmentspecialinlinedviewModeldefault1(MapsKt.toMutableMap(toBitmap.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewEvent.g.b), this.b)));
        } else {
            aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        }
        ViewEvent viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ViewEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewEvent, 0L, null, null, null, null, null, null, null, ViewEvent.search.TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewEvent.connect, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, viewEvent.connect.asInterface != null ? ViewEvent.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewEvent.connect.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) : null, null, null, null, null, null, null, null, null, null, -4194305), getitemTuitionPaymentFragmentspecialinlinedviewModeldefault3, null, null, null, null, null, null, null, aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1, null, null, null, 1965311);
        JsonObject jsonObject31 = new JsonObject();
        jsonObject31.addProperty("date", Long.valueOf(viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface));
        ViewEvent.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        JsonObject jsonObject32 = new JsonObject();
        jsonObject32.addProperty("id", tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        jsonObject31.add("application", jsonObject32);
        String str28 = viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.notify;
        if (str28 != null) {
            jsonObject31.addProperty(NotificationCompat.CATEGORY_SERVICE, str28);
        }
        String str29 = viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.read;
        if (str29 != null) {
            jsonObject31.addProperty("version", str29);
        }
        String str30 = viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1;
        if (str30 != null) {
            jsonObject31.addProperty("build_version", str30);
        }
        String str31 = viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
        if (str31 != null) {
            jsonObject31.addProperty("build_id", str31);
        }
        jsonObject31.add("session", viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.INotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        ViewEvent.ViewEventSource viewEventSource = viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.RemoteActionCompatParcelizer;
        if (viewEventSource != null) {
            jsonObject31.add("source", new JsonPrimitive(viewEventSource.jsonValue));
        }
        ViewEvent.search searchVar = viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.connect;
        JsonObject jsonObject33 = new JsonObject();
        jsonObject33.addProperty("id", searchVar.connect);
        String str32 = searchVar.unsubscribe;
        if (str32 != null) {
            jsonObject33.addProperty("referrer", str32);
        }
        jsonObject33.addProperty(ImagesContract.URL, searchVar.onConnectionSuspended);
        String str33 = searchVar.MediaBrowserCompatCallbackHandler;
        if (str33 != null) {
            jsonObject33.addProperty("name", str33);
        }
        Long l = searchVar.search;
        if (l != null) {
            jsonObject33.addProperty("loading_time", Long.valueOf(l.longValue()));
        }
        ViewEvent.LoadingType loadingType = searchVar.getServiceComponent;
        if (loadingType != null) {
            jsonObject33.add("loading_type", new JsonPrimitive(loadingType.jsonValue));
        }
        jsonObject33.addProperty("time_spent", Long.valueOf(searchVar.onConnected));
        Long l2 = searchVar.cancel;
        if (l2 != null) {
            jsonObject33.addProperty("first_contentful_paint", Long.valueOf(l2.longValue()));
        }
        Long l3 = searchVar.getItem;
        if (l3 != null) {
            jsonObject33.addProperty("largest_contentful_paint", Long.valueOf(l3.longValue()));
        }
        String str34 = searchVar.getNotifyChildrenChangedOptions;
        if (str34 != null) {
            jsonObject33.addProperty("largest_contentful_paint_target_selector", str34);
        }
        Long l4 = searchVar.cancelAll;
        if (l4 != null) {
            jsonObject33.addProperty("first_input_delay", Long.valueOf(l4.longValue()));
        }
        Long l5 = searchVar.INotificationSideChannelStubProxy;
        if (l5 != null) {
            jsonObject33.addProperty("first_input_time", Long.valueOf(l5.longValue()));
        }
        String str35 = searchVar.onTransact;
        if (str35 != null) {
            jsonObject33.addProperty("first_input_target_selector", str35);
        }
        Long l6 = searchVar.write;
        if (l6 != null) {
            jsonObject33.addProperty("interaction_to_next_paint", Long.valueOf(l6.longValue()));
        }
        String str36 = searchVar.MediaBrowserCompat;
        if (str36 != null) {
            jsonObject33.addProperty("interaction_to_next_paint_target_selector", str36);
        }
        Number number2 = searchVar.b;
        if (number2 != null) {
            jsonObject33.addProperty("cumulative_layout_shift", number2);
        }
        String str37 = searchVar.g;
        if (str37 != null) {
            jsonObject33.addProperty("cumulative_layout_shift_target_selector", str37);
        }
        Long l7 = searchVar.asBinder;
        if (l7 != null) {
            jsonObject33.addProperty("dom_complete", Long.valueOf(l7.longValue()));
        }
        Long l8 = searchVar.a;
        if (l8 != null) {
            jsonObject33.addProperty("dom_content_loaded", Long.valueOf(l8.longValue()));
        }
        Long l9 = searchVar.d;
        if (l9 != null) {
            jsonObject33.addProperty("dom_interactive", Long.valueOf(l9.longValue()));
        }
        Long l10 = searchVar.disconnect;
        if (l10 != null) {
            jsonObject33.addProperty("load_event", Long.valueOf(l10.longValue()));
        }
        Long l11 = searchVar.INotificationSideChannel;
        if (l11 != null) {
            jsonObject33.addProperty("first_byte", Long.valueOf(l11.longValue()));
        }
        ViewEvent.INotificationSideChannel iNotificationSideChannel2 = searchVar.asInterface;
        if (iNotificationSideChannel2 != null) {
            JsonObject jsonObject34 = new JsonObject();
            for (Map.Entry<String, Long> entry4 : iNotificationSideChannel2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.entrySet()) {
                jsonObject34.addProperty(entry4.getKey(), Long.valueOf(entry4.getValue().longValue()));
            }
            jsonObject33.add("custom_timings", jsonObject34);
        }
        Boolean bool5 = searchVar.IconCompatParcelizer;
        if (bool5 != null) {
            jsonObject33.addProperty("is_active", Boolean.valueOf(bool5.booleanValue()));
        }
        Boolean bool6 = searchVar.getRoot;
        if (bool6 != null) {
            jsonObject33.addProperty("is_slow_rendered", Boolean.valueOf(bool6.booleanValue()));
        }
        ViewEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault7 = searchVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        JsonObject jsonObject35 = new JsonObject();
        jsonObject35.addProperty("count", Long.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault7.TuitionPaymentFragmentbindingInflater1));
        jsonObject33.add("action", jsonObject35);
        ViewEvent.INotificationSideChannelStubProxy iNotificationSideChannelStubProxy3 = searchVar.notify;
        JsonObject jsonObject36 = new JsonObject();
        jsonObject36.addProperty("count", Long.valueOf(iNotificationSideChannelStubProxy3.TuitionPaymentFragmentbindingInflater1));
        jsonObject33.add(Constants.IPC_BUNDLE_KEY_SEND_ERROR, jsonObject36);
        ViewEvent.cancelAll cancelall2 = searchVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (cancelall2 != null) {
            JsonObject jsonObject37 = new JsonObject();
            jsonObject37.addProperty("count", Long.valueOf(cancelall2.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            jsonObject33.add(AppMeasurement.CRASH_ORIGIN, jsonObject37);
        }
        ViewEvent.read readVar = searchVar.isConnected;
        if (readVar != null) {
            JsonObject jsonObject38 = new JsonObject();
            jsonObject38.addProperty("count", Long.valueOf(readVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            jsonObject33.add("long_task", jsonObject38);
        }
        ViewEvent.getInterfaceDescriptor getinterfacedescriptor2 = searchVar.INotificationSideChannelDefault;
        if (getinterfacedescriptor2 != null) {
            JsonObject jsonObject39 = new JsonObject();
            jsonObject39.addProperty("count", Long.valueOf(getinterfacedescriptor2.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            jsonObject33.add("frozen_frame", jsonObject39);
        }
        ViewEvent.getNotifyChildrenChangedOptions getnotifychildrenchangedoptions = searchVar.subscribe;
        JsonObject jsonObject40 = new JsonObject();
        jsonObject40.addProperty("count", Long.valueOf(getnotifychildrenchangedoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
        jsonObject33.add("resource", jsonObject40);
        ViewEvent.INotificationSideChannelStub iNotificationSideChannelStub2 = searchVar.getInterfaceDescriptor;
        if (iNotificationSideChannelStub2 != null) {
            JsonObject jsonObject41 = new JsonObject();
            jsonObject41.addProperty("count", Long.valueOf(iNotificationSideChannelStub2.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
            jsonObject33.add("frustration", jsonObject41);
        }
        List<ViewEvent.connect> list3 = searchVar.read;
        if (list3 != null) {
            JsonArray jsonArray4 = new JsonArray(list3.size());
            for (ViewEvent.connect connectVar2 : list3) {
                JsonObject jsonObject42 = new JsonObject();
                jsonObject42.addProperty("start", Long.valueOf(connectVar2.b));
                jsonObject42.addProperty(TypedValues.TransitionType.S_DURATION, Long.valueOf(connectVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
                jsonArray4.add(jsonObject42);
                str3 = str3;
            }
            str = str3;
            jsonObject33.add("in_foreground_periods", jsonArray4);
        } else {
            str = "source";
        }
        Number number3 = searchVar.sendCustomAction;
        if (number3 != null) {
            jsonObject33.addProperty("memory_average", number3);
        }
        Number number4 = searchVar.getSessionToken;
        if (number4 != null) {
            jsonObject33.addProperty("memory_max", number4);
        }
        Number number5 = searchVar.TuitionPaymentFragmentbindingInflater1;
        if (number5 != null) {
            jsonObject33.addProperty("cpu_ticks_count", number5);
        }
        Number number6 = searchVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (number6 != null) {
            jsonObject33.addProperty("cpu_ticks_per_second", number6);
        }
        Number number7 = searchVar.setCallbacksMessenger;
        if (number7 != null) {
            jsonObject33.addProperty("refresh_rate_average", number7);
        }
        Number number8 = searchVar.handleMessage;
        if (number8 != null) {
            jsonObject33.addProperty("refresh_rate_min", number8);
        }
        ViewEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = searchVar.INotificationSideChannelStub;
        if (remoteActionCompatParcelizer2 != null) {
            jsonObject33.add("flutter_build_time", remoteActionCompatParcelizer2.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        }
        ViewEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = searchVar.RemoteActionCompatParcelizer;
        if (remoteActionCompatParcelizer3 != null) {
            jsonObject33.add("flutter_raster_time", remoteActionCompatParcelizer3.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        }
        ViewEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = searchVar.getExtras;
        if (remoteActionCompatParcelizer4 != null) {
            jsonObject33.add("js_refresh_rate", remoteActionCompatParcelizer4.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        }
        jsonObject31.add("view", jsonObject33);
        ViewEvent.getItem getitem2 = viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.getInterfaceDescriptor;
        if (getitem2 != null) {
            JsonObject jsonObject43 = new JsonObject();
            String str38 = getitem2.b;
            if (str38 != null) {
                jsonObject43.addProperty("id", str38);
            }
            String str39 = getitem2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str39 != null) {
                jsonObject43.addProperty("name", str39);
            }
            String str40 = getitem2.TuitionPaymentFragmentbindingInflater1;
            if (str40 != null) {
                jsonObject43.addProperty("email", str40);
            }
            for (Map.Entry<String, Object> entry5 : getitem2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.entrySet()) {
                String key4 = entry5.getKey();
                Object value4 = entry5.getValue();
                if (!ArraysKt.contains(ViewEvent.getItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3, key4)) {
                    toBitmap tobitmap10 = toBitmap.INSTANCE;
                    jsonObject43.add(key4, toBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3(value4));
                }
            }
            jsonObject31.add("usr", jsonObject43);
        }
        ViewEvent.g gVar3 = viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (gVar3 != null) {
            JsonObject jsonObject44 = new JsonObject();
            jsonObject44.add(NotificationCompat.CATEGORY_STATUS, new JsonPrimitive(gVar3.TuitionPaymentFragmentbindingInflater1.jsonValue));
            List<ViewEvent.Interface> list4 = gVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (list4 != null) {
                JsonArray jsonArray5 = new JsonArray(list4.size());
                Iterator<T> it4 = list4.iterator();
                while (it4.hasNext()) {
                    jsonArray5.add(new JsonPrimitive(((ViewEvent.Interface) it4.next()).jsonValue));
                }
                jsonObject44.add("interfaces", jsonArray5);
            }
            ViewEvent.EffectiveType effectiveType2 = gVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (effectiveType2 != null) {
                jsonObject44.add("effective_type", new JsonPrimitive(effectiveType2.jsonValue));
            }
            ViewEvent.b bVar3 = gVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (bVar3 != null) {
                JsonObject jsonObject45 = new JsonObject();
                String str41 = bVar3.b;
                if (str41 != null) {
                    jsonObject45.addProperty("technology", str41);
                }
                String str42 = bVar3.TuitionPaymentFragmentbindingInflater1;
                if (str42 != null) {
                    jsonObject45.addProperty("carrier_name", str42);
                }
                jsonObject44.add("cellular", jsonObject45);
            }
            jsonObject31.add("connectivity", jsonObject44);
        }
        ViewEvent.INotificationSideChannelDefault iNotificationSideChannelDefault2 = viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.onTransact;
        if (iNotificationSideChannelDefault2 != null) {
            JsonObject jsonObject46 = new JsonObject();
            ViewEvent.getServiceComponent getservicecomponent = iNotificationSideChannelDefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (getservicecomponent != null) {
                JsonObject jsonObject47 = new JsonObject();
                jsonObject47.addProperty("width", getservicecomponent.TuitionPaymentFragmentbindingInflater1);
                jsonObject47.addProperty("height", getservicecomponent.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                jsonObject46.add("viewport", jsonObject47);
            }
            ViewEvent.disconnect disconnectVar = iNotificationSideChannelDefault2.b;
            if (disconnectVar != null) {
                JsonObject jsonObject48 = new JsonObject();
                jsonObject48.addProperty("max_depth", disconnectVar.b);
                jsonObject48.addProperty("max_depth_scroll_top", disconnectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                jsonObject48.addProperty("max_scroll_height", disconnectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                jsonObject48.addProperty("max_scroll_height_time", disconnectVar.TuitionPaymentFragmentbindingInflater1);
                jsonObject46.add("scroll", jsonObject48);
            }
            jsonObject31.add(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, jsonObject46);
        }
        ViewEvent.getRoot getroot = viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.INotificationSideChannelDefault;
        if (getroot != null) {
            JsonObject jsonObject49 = new JsonObject();
            jsonObject49.addProperty("test_id", getroot.b);
            jsonObject49.addProperty("result_id", getroot.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            Boolean bool7 = getroot.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (bool7 != null) {
                jsonObject49.addProperty("injected", Boolean.valueOf(bool7.booleanValue()));
            }
            jsonObject31.add("synthetics", jsonObject49);
        }
        ViewEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault8 = viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault8 != null) {
            JsonObject jsonObject50 = new JsonObject();
            jsonObject50.addProperty("test_execution_id", tuitionPaymentFragmentspecialinlinedviewModeldefault8.TuitionPaymentFragmentbindingInflater1);
            jsonObject31.add("ci_test", jsonObject50);
        }
        ViewEvent.IconCompatParcelizer iconCompatParcelizer = viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.cancelAll;
        if (iconCompatParcelizer != null) {
            JsonObject jsonObject51 = new JsonObject();
            jsonObject51.addProperty("name", iconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            jsonObject51.addProperty("version", iconCompatParcelizer.TuitionPaymentFragmentbindingInflater1);
            String str43 = iconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str43 != null) {
                jsonObject51.addProperty("build", str43);
            }
            jsonObject51.addProperty("version_major", iconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            jsonObject31.add("os", jsonObject51);
        }
        ViewEvent.onTransact ontransact2 = viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder;
        if (ontransact2 != null) {
            JsonObject jsonObject52 = new JsonObject();
            str2 = "type";
            jsonObject52.add(str2, new JsonPrimitive(ontransact2.TuitionPaymentFragmentbindingInflater1.jsonValue));
            String str44 = ontransact2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str44 != null) {
                jsonObject52.addProperty("name", str44);
            }
            String str45 = ontransact2.b;
            if (str45 != null) {
                jsonObject52.addProperty("model", str45);
            }
            String str46 = ontransact2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str46 != null) {
                jsonObject52.addProperty("brand", str46);
            }
            String str47 = ontransact2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str47 != null) {
                jsonObject52.addProperty("architecture", str47);
            }
            jsonObject31.add("device", jsonObject52);
        } else {
            str2 = "type";
        }
        ViewEvent.notify notifyVar2 = viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.a;
        JsonObject jsonObject53 = new JsonObject();
        jsonObject53.addProperty("format_version", Long.valueOf(notifyVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
        ViewEvent.cancel cancelVar2 = notifyVar2.asInterface;
        if (cancelVar2 != null) {
            JsonObject jsonObject54 = new JsonObject();
            ViewEvent.Plan plan2 = cancelVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (plan2 != null) {
                jsonObject54.add("plan", new JsonPrimitive(plan2.jsonValue));
            }
            ViewEvent.SessionPrecondition sessionPrecondition2 = cancelVar2.TuitionPaymentFragmentbindingInflater1;
            if (sessionPrecondition2 != null) {
                jsonObject54.add("session_precondition", new JsonPrimitive(sessionPrecondition2.jsonValue));
            }
            jsonObject53.add("session", jsonObject54);
        }
        ViewEvent.d dVar2 = notifyVar2.b;
        if (dVar2 != null) {
            JsonObject jsonObject55 = new JsonObject();
            jsonObject55.addProperty("session_sample_rate", dVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Number number9 = dVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (number9 != null) {
                jsonObject55.addProperty("session_replay_sample_rate", number9);
            }
            Boolean bool8 = dVar2.TuitionPaymentFragmentbindingInflater1;
            if (bool8 != null) {
                jsonObject55.addProperty("start_session_replay_recording_manually", Boolean.valueOf(bool8.booleanValue()));
            }
            jsonObject53.add("configuration", jsonObject55);
        }
        String str48 = notifyVar2.TuitionPaymentFragmentbindingInflater1;
        if (str48 != null) {
            jsonObject53.addProperty("browser_sdk_version", str48);
        }
        jsonObject53.addProperty("document_version", Long.valueOf(notifyVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        List<ViewEvent.write> list5 = notifyVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (list5 != null) {
            JsonArray jsonArray6 = new JsonArray(list5.size());
            for (ViewEvent.write writeVar : list5) {
                JsonObject jsonObject56 = new JsonObject();
                jsonObject56.add(RemoteConfigConstants.ResponseFieldKey.STATE, new JsonPrimitive(writeVar.TuitionPaymentFragmentbindingInflater1.jsonValue));
                jsonObject56.addProperty("start", Long.valueOf(writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
                jsonArray6.add(jsonObject56);
            }
            jsonObject53.add("page_states", jsonArray6);
        }
        ViewEvent.getExtras getextras = notifyVar2.d;
        if (getextras != null) {
            JsonObject jsonObject57 = new JsonObject();
            Long l12 = getextras.b;
            if (l12 != null) {
                jsonObject57.addProperty("records_count", Long.valueOf(l12.longValue()));
            }
            Long l13 = getextras.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (l13 != null) {
                jsonObject57.addProperty("segments_count", Long.valueOf(l13.longValue()));
            }
            Long l14 = getextras.TuitionPaymentFragmentbindingInflater1;
            if (l14 != null) {
                jsonObject57.addProperty("segments_total_raw_size", Long.valueOf(l14.longValue()));
            }
            jsonObject53.add("replay_stats", jsonObject57);
        }
        jsonObject31.add("_dd", jsonObject53);
        ViewEvent.a aVar3 = viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.g;
        if (aVar3 != null) {
            jsonObject31.add("context", aVar3.TuitionPaymentFragmentbindingInflater1());
        }
        ViewEvent.asBinder asbinder3 = viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.d;
        if (asbinder3 != null) {
            JsonObject jsonObject58 = new JsonObject();
            ViewEvent.asInterface asinterface3 = asbinder3.b;
            JsonObject jsonObject59 = new JsonObject();
            jsonObject59.addProperty("id", asinterface3.b);
            jsonObject58.add("view", jsonObject59);
            jsonObject58.add(str, new JsonPrimitive(asbinder3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.jsonValue));
            jsonObject31.add("container", jsonObject58);
        }
        jsonObject31.addProperty(str2, viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.INotificationSideChannelStubProxy);
        ViewEvent.a aVar4 = viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.INotificationSideChannel;
        if (aVar4 != null) {
            jsonObject31.add("feature_flags", aVar4.TuitionPaymentFragmentbindingInflater1());
        }
        ViewEvent.MediaBrowserCompat mediaBrowserCompat = viewEventTuitionPaymentFragmentspecialinlinedviewModeldefault2.cancel;
        if (mediaBrowserCompat != null) {
            JsonObject jsonObject60 = new JsonObject();
            jsonObject60.add("replay_level", new JsonPrimitive(mediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3.jsonValue));
            jsonObject31.add("privacy", jsonObject60);
        }
        JsonObject asJsonObject3 = jsonObject31.getAsJsonObject();
        Intrinsics.checkNotNullExpressionValue(asJsonObject3, "");
        String string8 = b(asJsonObject3).toString();
        Intrinsics.checkNotNullExpressionValue(string8, "");
        return string8;
    }

    private final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Map<String, ? extends Object> p0) {
        computeDispatchCropRect computedispatchcroprect = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : p0.entrySet()) {
            if (!TuitionPaymentFragmentbindingInflater1.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return computedispatchcroprect.b(linkedHashMap, "context", null, TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    private final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Map<String, ? extends Object> p0) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(p0, "usr", "user extra information", TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    private static JsonObject b(JsonObject p0) {
        if (p0.has("context")) {
            JsonObject asJsonObject = p0.getAsJsonObject("context");
            Set<Map.Entry<String, JsonElement>> setEntrySet = asJsonObject.entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
            ArrayList<Map.Entry> arrayList = new ArrayList();
            for (Object obj : setEntrySet) {
                if (b.contains(((Map.Entry) obj).getKey())) {
                    arrayList.add(obj);
                }
            }
            for (Map.Entry entry : arrayList) {
                asJsonObject.remove((String) entry.getKey());
                p0.add((String) entry.getKey(), (JsonElement) entry.getValue());
            }
        }
        return p0;
    }

    /* JADX INFO: renamed from: setSurfaceAspectRatio$TuitionPaymentFragmentspecialinlinedviewModeldefault3_, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007"}, d2 = {"LsetSurfaceAspectRatio$TuitionPaymentFragmentspecialinlinedviewModeldefault3_;", "", "<init>", "()V", "", "", "TuitionPaymentFragmentbindingInflater1", "Ljava/util/Set;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b() {
            UseCaseConfigFactory.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0] = Class.forName("SurfaceEdgeExternalSyntheticLambda3").getDeclaredField("TuitionPaymentFragmentspecialinlinedviewModeldefault2");
        }

        public static int TuitionPaymentFragmentbindingInflater1() {
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i2 = i % 5396768;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
            if (i2 != 0) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            return i3;
        }
    }

    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActionEvent p0) throws IllegalAccessException {
        ActionEvent.getRoot getrootTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        ActionEvent.onTransact ontransactTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i;
        ActionEvent.getRoot getroot = p0.INotificationSideChannelStub;
        if (getroot != null) {
            toBitmap tobitmap = toBitmap.INSTANCE;
            getrootTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ActionEvent.getRoot.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getroot, MapsKt.toMutableMap(toBitmap.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(p0.INotificationSideChannelStub.b, "usr", "user extra information", TuitionPaymentFragmentspecialinlinedviewModeldefault1), this.b)));
        } else {
            getrootTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        }
        if (p0.g != null) {
            toBitmap tobitmap2 = toBitmap.INSTANCE;
            ontransactTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ActionEvent.onTransact.TuitionPaymentFragmentspecialinlinedviewModeldefault3(MapsKt.toMutableMap(toBitmap.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0.g.b), this.b)));
        } else {
            ontransactTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        }
        ActionEvent actionEventTuitionPaymentFragmentbindingInflater1 = ActionEvent.TuitionPaymentFragmentbindingInflater1(p0, getrootTuitionPaymentFragmentspecialinlinedviewModeldefault3, ontransactTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("date", Long.valueOf(actionEventTuitionPaymentFragmentbindingInflater1.asBinder));
        ActionEvent.b bVar = actionEventTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("id", bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        jsonObject.add("application", jsonObject2);
        String str = actionEventTuitionPaymentFragmentbindingInflater1.onTransact;
        if (str != null) {
            jsonObject.addProperty(NotificationCompat.CATEGORY_SERVICE, str);
        }
        String str2 = actionEventTuitionPaymentFragmentbindingInflater1.RemoteActionCompatParcelizer;
        if (str2 != null) {
            jsonObject.addProperty("version", str2);
        }
        String str3 = actionEventTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (str3 != null) {
            jsonObject.addProperty("build_version", str3);
        }
        String str4 = actionEventTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (str4 != null) {
            jsonObject.addProperty("build_id", str4);
        }
        ActionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = actionEventTuitionPaymentFragmentbindingInflater1.cancel;
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("id", tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        String str5 = "type";
        jsonObject3.add("type", new JsonPrimitive(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.jsonValue));
        Boolean bool = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (bool != null) {
            jsonObject3.addProperty("has_replay", Boolean.valueOf(bool.booleanValue()));
        }
        jsonObject.add("session", jsonObject3);
        ActionEvent.ActionEventSource actionEventSource = actionEventTuitionPaymentFragmentbindingInflater1.getInterfaceDescriptor;
        String str6 = "source";
        if (actionEventSource != null) {
            jsonObject.add("source", new JsonPrimitive(actionEventSource.jsonValue));
        }
        ActionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = actionEventTuitionPaymentFragmentbindingInflater1.connect;
        JsonObject jsonObject4 = new JsonObject();
        jsonObject4.addProperty("id", tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        String str7 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (str7 != null) {
            jsonObject4.addProperty("referrer", str7);
        }
        jsonObject4.addProperty(ImagesContract.URL, tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        String str8 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
        if (str8 != null) {
            jsonObject4.addProperty("name", str8);
        }
        Boolean bool2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
        if (bool2 != null) {
            jsonObject4.addProperty("in_foreground", Boolean.valueOf(bool2.booleanValue()));
        }
        jsonObject.add("view", jsonObject4);
        ActionEvent.getRoot getroot2 = actionEventTuitionPaymentFragmentbindingInflater1.INotificationSideChannelStub;
        if (getroot2 != null) {
            JsonObject jsonObject5 = new JsonObject();
            String str9 = getroot2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str9 != null) {
                jsonObject5.addProperty("id", str9);
            }
            String str10 = getroot2.TuitionPaymentFragmentbindingInflater1;
            if (str10 != null) {
                jsonObject5.addProperty("name", str10);
            }
            String str11 = getroot2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str11 != null) {
                jsonObject5.addProperty("email", str11);
            }
            for (Map.Entry<String, Object> entry : getroot2.b.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!ArraysKt.contains(ActionEvent.getRoot.b, key)) {
                    toBitmap tobitmap3 = toBitmap.INSTANCE;
                    jsonObject5.add(key, toBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3(value));
                }
            }
            jsonObject.add("usr", jsonObject5);
        }
        ActionEvent.a aVar = actionEventTuitionPaymentFragmentbindingInflater1.asInterface;
        if (aVar != null) {
            JsonObject jsonObject6 = new JsonObject();
            jsonObject6.add(NotificationCompat.CATEGORY_STATUS, new JsonPrimitive(aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.jsonValue));
            List<ActionEvent.Interface> list = aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (list != null) {
                JsonArray jsonArray = new JsonArray(list.size());
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    jsonArray.add(new JsonPrimitive(((ActionEvent.Interface) it.next()).jsonValue));
                }
                jsonObject6.add("interfaces", jsonArray);
            }
            ActionEvent.EffectiveType effectiveType = aVar.TuitionPaymentFragmentbindingInflater1;
            if (effectiveType != null) {
                jsonObject6.add("effective_type", new JsonPrimitive(effectiveType.jsonValue));
            }
            ActionEvent.d dVar = aVar.b;
            if (dVar != null) {
                JsonObject jsonObject7 = new JsonObject();
                String str12 = dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str12 != null) {
                    jsonObject7.addProperty("technology", str12);
                }
                String str13 = dVar.b;
                if (str13 != null) {
                    jsonObject7.addProperty("carrier_name", str13);
                }
                jsonObject6.add("cellular", jsonObject7);
            }
            jsonObject.add("connectivity", jsonObject6);
        }
        ActionEvent.INotificationSideChannelStub iNotificationSideChannelStub = actionEventTuitionPaymentFragmentbindingInflater1.notify;
        if (iNotificationSideChannelStub != null) {
            JsonObject jsonObject8 = new JsonObject();
            ActionEvent.getExtras getextras = iNotificationSideChannelStub.b;
            if (getextras != null) {
                JsonObject jsonObject9 = new JsonObject();
                jsonObject9.addProperty("width", getextras.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                jsonObject9.addProperty("height", getextras.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                jsonObject8.add("viewport", jsonObject9);
            }
            jsonObject.add(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, jsonObject8);
        }
        ActionEvent.getNotifyChildrenChangedOptions getnotifychildrenchangedoptions = actionEventTuitionPaymentFragmentbindingInflater1.INotificationSideChannelDefault;
        if (getnotifychildrenchangedoptions != null) {
            JsonObject jsonObject10 = new JsonObject();
            jsonObject10.addProperty("test_id", getnotifychildrenchangedoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            jsonObject10.addProperty("result_id", getnotifychildrenchangedoptions.b);
            Boolean bool3 = getnotifychildrenchangedoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (bool3 != null) {
                jsonObject10.addProperty("injected", Boolean.valueOf(bool3.booleanValue()));
            }
            jsonObject.add("synthetics", jsonObject10);
        }
        ActionEvent.asBinder asbinder = actionEventTuitionPaymentFragmentbindingInflater1.b;
        if (asbinder != null) {
            JsonObject jsonObject11 = new JsonObject();
            jsonObject11.addProperty("test_execution_id", asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            jsonObject.add("ci_test", jsonObject11);
        }
        ActionEvent.write writeVar = actionEventTuitionPaymentFragmentbindingInflater1.cancelAll;
        if (writeVar != null) {
            JsonObject jsonObject12 = new JsonObject();
            jsonObject12.addProperty("name", writeVar.b);
            jsonObject12.addProperty("version", writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            String str14 = writeVar.TuitionPaymentFragmentbindingInflater1;
            if (str14 != null) {
                jsonObject12.addProperty("build", str14);
            }
            jsonObject12.addProperty("version_major", writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            jsonObject.add("os", jsonObject12);
        }
        ActionEvent.getInterfaceDescriptor getinterfacedescriptor = actionEventTuitionPaymentFragmentbindingInflater1.INotificationSideChannel;
        if (getinterfacedescriptor != null) {
            JsonObject jsonObject13 = new JsonObject();
            jsonObject13.add("type", new JsonPrimitive(getinterfacedescriptor.TuitionPaymentFragmentspecialinlinedviewModeldefault3.jsonValue));
            String str15 = getinterfacedescriptor.b;
            if (str15 != null) {
                jsonObject13.addProperty("name", str15);
            }
            String str16 = getinterfacedescriptor.TuitionPaymentFragmentbindingInflater1;
            if (str16 != null) {
                jsonObject13.addProperty("model", str16);
            }
            String str17 = getinterfacedescriptor.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str17 != null) {
                jsonObject13.addProperty("brand", str17);
            }
            String str18 = getinterfacedescriptor.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str18 != null) {
                jsonObject13.addProperty("architecture", str18);
            }
            jsonObject.add("device", jsonObject13);
        }
        ActionEvent.cancelAll cancelall = actionEventTuitionPaymentFragmentbindingInflater1.d;
        JsonObject jsonObject14 = new JsonObject();
        jsonObject14.addProperty("format_version", Long.valueOf(cancelall.b));
        ActionEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer = cancelall.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (remoteActionCompatParcelizer != null) {
            JsonObject jsonObject15 = new JsonObject();
            ActionEvent.Plan plan = remoteActionCompatParcelizer.b;
            if (plan != null) {
                jsonObject15.add("plan", new JsonPrimitive(plan.jsonValue));
            }
            ActionEvent.SessionPrecondition sessionPrecondition = remoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (sessionPrecondition != null) {
                jsonObject15.add("session_precondition", new JsonPrimitive(sessionPrecondition.jsonValue));
            }
            jsonObject14.add("session", jsonObject15);
        }
        ActionEvent.g gVar = cancelall.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (gVar != null) {
            JsonObject jsonObject16 = new JsonObject();
            jsonObject16.addProperty("session_sample_rate", gVar.TuitionPaymentFragmentbindingInflater1);
            Number number = gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (number != null) {
                jsonObject16.addProperty("session_replay_sample_rate", number);
            }
            jsonObject14.add("configuration", jsonObject16);
        }
        String str19 = cancelall.TuitionPaymentFragmentbindingInflater1;
        if (str19 != null) {
            jsonObject14.addProperty("browser_sdk_version", str19);
        }
        ActionEvent.INotificationSideChannelDefault iNotificationSideChannelDefault = cancelall.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (iNotificationSideChannelDefault == null) {
            str5 = "type";
            str6 = "source";
        } else {
            JsonObject jsonObject17 = new JsonObject();
            ActionEvent.MediaBrowserCompat mediaBrowserCompat = iNotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (mediaBrowserCompat != null) {
                JsonObject jsonObject18 = new JsonObject();
                jsonObject18.addProperty("x", Long.valueOf(mediaBrowserCompat.b));
                jsonObject18.addProperty("y", Long.valueOf(mediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
                jsonObject17.add("position", jsonObject18);
            }
            ActionEvent.INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = iNotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (iNotificationSideChannelStubProxy != null) {
                JsonObject jsonObject19 = new JsonObject();
                String str20 = iNotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str20 != null) {
                    jsonObject19.addProperty("selector", str20);
                }
                Long l = iNotificationSideChannelStubProxy.b;
                if (l != null) {
                    jsonObject19.addProperty("width", Long.valueOf(l.longValue()));
                }
                Long l2 = iNotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (l2 != null) {
                    jsonObject19.addProperty("height", Long.valueOf(l2.longValue()));
                }
                jsonObject17.add(TypedValues.AttributesType.S_TARGET, jsonObject19);
            }
            jsonObject14.add("action", jsonObject17);
        }
        jsonObject.add("_dd", jsonObject14);
        ActionEvent.onTransact ontransact = actionEventTuitionPaymentFragmentbindingInflater1.g;
        if (ontransact != null) {
            JsonObject jsonObject20 = new JsonObject();
            for (Map.Entry<String, Object> entry2 : ontransact.b.entrySet()) {
                String key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                toBitmap tobitmap4 = toBitmap.INSTANCE;
                jsonObject20.add(key2, toBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3(value2));
            }
            jsonObject.add("context", jsonObject20);
        }
        ActionEvent.notify notifyVar = actionEventTuitionPaymentFragmentbindingInflater1.a;
        if (notifyVar != null) {
            JsonObject jsonObject21 = new JsonObject();
            ActionEvent.INotificationSideChannel iNotificationSideChannel = notifyVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            JsonObject jsonObject22 = new JsonObject();
            jsonObject22.addProperty("id", iNotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            jsonObject21.add("view", jsonObject22);
            jsonObject21.add(str6, new JsonPrimitive(notifyVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.jsonValue));
            jsonObject.add("container", jsonObject21);
        }
        String str21 = str5;
        jsonObject.addProperty(str21, actionEventTuitionPaymentFragmentbindingInflater1.INotificationSideChannelStubProxy);
        ActionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = actionEventTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1;
        JsonObject jsonObject23 = new JsonObject();
        jsonObject23.add(str21, new JsonPrimitive(tuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder.jsonValue));
        String str22 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
        if (str22 != null) {
            jsonObject23.addProperty("id", str22);
        }
        Long l3 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (l3 != null) {
            jsonObject23.addProperty("loading_time", Long.valueOf(l3.longValue()));
        }
        ActionEvent.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            JsonObject jsonObject24 = new JsonObject();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 46399), 40 - (ViewConfiguration.getScrollBarSize() >> 8), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 18, 1513912262, false, "b", null);
            }
            int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - (Process.myPid() >> 22)), 59 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 18 - View.combineMeasuredStates(0, 0), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
            }
            int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
            long j = i3;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 59, TextUtils.getTrimmedLength("") + 18, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
            long j2 = -755;
            long j3 = -1;
            long j4 = ((j3 ^ 3695122280119495135L) | (j3 ^ 1824131217040291104L)) ^ j3;
            long jIdentityHashCode = System.identityHashCode(this);
            long j5 = (j2 * 3695122280119495135L) + (j2 * 1824131217040291104L) + (((long) 1512) * j4) + (((long) (-756)) * (j4 | ((4276097133299858943L | jIdentityHashCode) ^ j3))) + (((long) 756) * (4276097133299858943L | (j3 ^ jIdentityHashCode)));
            int i5 = i4;
            long j6 = j;
            int i6 = 0;
            while (true) {
                int i7 = 0;
                while (i7 != 8) {
                    i5 = (((((int) (j6 >> i7)) & 255) + (i5 << 6)) + (i5 << 16)) - i5;
                    i7++;
                    i3 = i3;
                }
                i = i3;
                if (i6 != 0) {
                    break;
                }
                i6++;
                i3 = i;
                j6 = j5;
            }
            if (i5 != i2) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.red(0) + 46400), 40 - (ViewConfiguration.getJumpTapTimeout() >> 16), (-16777197) - Color.rgb(0, 0, 0), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                Toast.makeText((Context) null, i / (((i - 1) * i) % 2), 0).show();
            }
            jsonObject24.addProperty("name", tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            jsonObject23.add(TypedValues.AttributesType.S_TARGET, jsonObject24);
        }
        ActionEvent.read readVar = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1;
        if (readVar != null) {
            JsonObject jsonObject25 = new JsonObject();
            JsonArray jsonArray2 = new JsonArray(readVar.b.size());
            Iterator<T> it2 = readVar.b.iterator();
            while (it2.hasNext()) {
                jsonArray2.add(new JsonPrimitive(((ActionEvent.Type) it2.next()).jsonValue));
            }
            jsonObject25.add(str21, jsonArray2);
            jsonObject23.add("frustration", jsonObject25);
        }
        ActionEvent.IconCompatParcelizer iconCompatParcelizer = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (iconCompatParcelizer != null) {
            JsonObject jsonObject26 = new JsonObject();
            jsonObject26.addProperty("count", Long.valueOf(iconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
            jsonObject23.add(Constants.IPC_BUNDLE_KEY_SEND_ERROR, jsonObject26);
        }
        ActionEvent.cancel cancelVar = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (cancelVar != null) {
            JsonObject jsonObject27 = new JsonObject();
            jsonObject27.addProperty("count", Long.valueOf(cancelVar.TuitionPaymentFragmentbindingInflater1));
            jsonObject23.add(AppMeasurement.CRASH_ORIGIN, jsonObject27);
        }
        ActionEvent.connect connectVar = tuitionPaymentFragmentspecialinlinedviewModeldefault2.d;
        if (connectVar != null) {
            JsonObject jsonObject28 = new JsonObject();
            jsonObject28.addProperty("count", Long.valueOf(connectVar.b));
            jsonObject23.add("long_task", jsonObject28);
        }
        ActionEvent.disconnect disconnectVar = tuitionPaymentFragmentspecialinlinedviewModeldefault2.g;
        if (disconnectVar != null) {
            JsonObject jsonObject29 = new JsonObject();
            jsonObject29.addProperty("count", Long.valueOf(disconnectVar.TuitionPaymentFragmentbindingInflater1));
            jsonObject23.add("resource", jsonObject29);
        }
        jsonObject.add("action", jsonObject23);
        JsonObject asJsonObject = jsonObject.getAsJsonObject();
        Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
        String string = b(asJsonObject).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private final String TuitionPaymentFragmentbindingInflater1(ErrorEvent p0) {
        ErrorEvent.getItem getitemB;
        ErrorEvent.getItem getitem = p0.connect;
        ErrorEvent.notify notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        if (getitem != null) {
            toBitmap tobitmap = toBitmap.INSTANCE;
            getitemB = ErrorEvent.getItem.b(getitem, MapsKt.toMutableMap(toBitmap.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(p0.connect.TuitionPaymentFragmentspecialinlinedviewModeldefault3, "usr", "user extra information", TuitionPaymentFragmentspecialinlinedviewModeldefault1), this.b)));
        } else {
            getitemB = null;
        }
        if (p0.a != null) {
            toBitmap tobitmap2 = toBitmap.INSTANCE;
            notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ErrorEvent.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault3(MapsKt.toMutableMap(toBitmap.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0.a.TuitionPaymentFragmentspecialinlinedviewModeldefault1), this.b)));
        }
        ErrorEvent errorEventB = ErrorEvent.b(p0, getitemB, notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("date", Long.valueOf(errorEventB.g));
        ErrorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = errorEventB.TuitionPaymentFragmentbindingInflater1;
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("id", tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1);
        jsonObject.add("application", jsonObject2);
        String str = errorEventB.INotificationSideChannelStubProxy;
        if (str != null) {
            jsonObject.addProperty(NotificationCompat.CATEGORY_SERVICE, str);
        }
        String str2 = errorEventB.MediaBrowserCompat;
        if (str2 != null) {
            jsonObject.addProperty("version", str2);
        }
        String str3 = errorEventB.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (str3 != null) {
            jsonObject.addProperty("build_version", str3);
        }
        String str4 = errorEventB.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (str4 != null) {
            jsonObject.addProperty("build_id", str4);
        }
        ErrorEvent.INotificationSideChannelDefault iNotificationSideChannelDefault = errorEventB.getInterfaceDescriptor;
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("id", iNotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        jsonObject3.add("type", new JsonPrimitive(iNotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault3.jsonValue));
        Boolean bool = iNotificationSideChannelDefault.b;
        if (bool != null) {
            jsonObject3.addProperty("has_replay", Boolean.valueOf(bool.booleanValue()));
        }
        jsonObject.add("session", jsonObject3);
        ErrorEvent.ErrorEventSource errorEventSource = errorEventB.RemoteActionCompatParcelizer;
        if (errorEventSource != null) {
            jsonObject.add("source", new JsonPrimitive(errorEventSource.jsonValue));
        }
        ErrorEvent.INotificationSideChannelStub iNotificationSideChannelStub = errorEventB.write;
        JsonObject jsonObject4 = new JsonObject();
        jsonObject4.addProperty("id", iNotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        String str5 = iNotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (str5 != null) {
            jsonObject4.addProperty("referrer", str5);
        }
        jsonObject4.addProperty(ImagesContract.URL, iNotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        String str6 = iNotificationSideChannelStub.TuitionPaymentFragmentbindingInflater1;
        if (str6 != null) {
            jsonObject4.addProperty("name", str6);
        }
        Boolean bool2 = iNotificationSideChannelStub.b;
        if (bool2 != null) {
            jsonObject4.addProperty("in_foreground", Boolean.valueOf(bool2.booleanValue()));
        }
        jsonObject.add("view", jsonObject4);
        ErrorEvent.getItem getitem2 = errorEventB.connect;
        if (getitem2 != null) {
            JsonObject jsonObject5 = new JsonObject();
            String str7 = getitem2.TuitionPaymentFragmentbindingInflater1;
            if (str7 != null) {
                jsonObject5.addProperty("id", str7);
            }
            String str8 = getitem2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str8 != null) {
                jsonObject5.addProperty("name", str8);
            }
            String str9 = getitem2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str9 != null) {
                jsonObject5.addProperty("email", str9);
            }
            for (Map.Entry<String, Object> entry : getitem2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!ArraysKt.contains(ErrorEvent.getItem.TuitionPaymentFragmentbindingInflater1, key)) {
                    toBitmap tobitmap3 = toBitmap.INSTANCE;
                    jsonObject5.add(key, toBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3(value));
                }
            }
            jsonObject.add("usr", jsonObject5);
        }
        ErrorEvent.asInterface asinterface = errorEventB.asBinder;
        if (asinterface != null) {
            JsonObject jsonObject6 = new JsonObject();
            jsonObject6.add(NotificationCompat.CATEGORY_STATUS, new JsonPrimitive(asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1.jsonValue));
            List<ErrorEvent.Interface> list = asinterface.b;
            if (list != null) {
                JsonArray jsonArray = new JsonArray(list.size());
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    jsonArray.add(new JsonPrimitive(((ErrorEvent.Interface) it.next()).jsonValue));
                }
                jsonObject6.add("interfaces", jsonArray);
            }
            ErrorEvent.EffectiveType effectiveType = asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (effectiveType != null) {
                jsonObject6.add("effective_type", new JsonPrimitive(effectiveType.jsonValue));
            }
            ErrorEvent.b bVar = asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (bVar != null) {
                JsonObject jsonObject7 = new JsonObject();
                String str10 = bVar.b;
                if (str10 != null) {
                    jsonObject7.addProperty("technology", str10);
                }
                String str11 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (str11 != null) {
                    jsonObject7.addProperty("carrier_name", str11);
                }
                jsonObject6.add("cellular", jsonObject7);
            }
            jsonObject.add("connectivity", jsonObject6);
        }
        ErrorEvent.INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = errorEventB.INotificationSideChannel;
        if (iNotificationSideChannelStubProxy != null) {
            JsonObject jsonObject8 = new JsonObject();
            ErrorEvent.disconnect disconnectVar = iNotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (disconnectVar != null) {
                JsonObject jsonObject9 = new JsonObject();
                jsonObject9.addProperty("width", disconnectVar.TuitionPaymentFragmentbindingInflater1);
                jsonObject9.addProperty("height", disconnectVar.b);
                jsonObject8.add("viewport", jsonObject9);
            }
            jsonObject.add(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, jsonObject8);
        }
        ErrorEvent.MediaBrowserCompat mediaBrowserCompat = errorEventB.INotificationSideChannelStub;
        if (mediaBrowserCompat != null) {
            JsonObject jsonObject10 = new JsonObject();
            jsonObject10.addProperty("test_id", mediaBrowserCompat.TuitionPaymentFragmentbindingInflater1);
            jsonObject10.addProperty("result_id", mediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Boolean bool3 = mediaBrowserCompat.b;
            if (bool3 != null) {
                jsonObject10.addProperty("injected", Boolean.valueOf(bool3.booleanValue()));
            }
            jsonObject.add("synthetics", jsonObject10);
        }
        ErrorEvent.d dVar = errorEventB.b;
        if (dVar != null) {
            JsonObject jsonObject11 = new JsonObject();
            jsonObject11.addProperty("test_execution_id", dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            jsonObject.add("ci_test", jsonObject11);
        }
        ErrorEvent.write writeVar = errorEventB.notify;
        if (writeVar != null) {
            JsonObject jsonObject12 = new JsonObject();
            jsonObject12.addProperty("name", writeVar.b);
            jsonObject12.addProperty("version", writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String str12 = writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str12 != null) {
                jsonObject12.addProperty("build", str12);
            }
            jsonObject12.addProperty("version_major", writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            jsonObject.add("os", jsonObject12);
        }
        ErrorEvent.onTransact ontransact = errorEventB.cancel;
        if (ontransact != null) {
            JsonObject jsonObject13 = new JsonObject();
            jsonObject13.add("type", new JsonPrimitive(ontransact.TuitionPaymentFragmentspecialinlinedviewModeldefault2.jsonValue));
            String str13 = ontransact.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str13 != null) {
                jsonObject13.addProperty("name", str13);
            }
            String str14 = ontransact.TuitionPaymentFragmentbindingInflater1;
            if (str14 != null) {
                jsonObject13.addProperty("model", str14);
            }
            String str15 = ontransact.b;
            if (str15 != null) {
                jsonObject13.addProperty("brand", str15);
            }
            String str16 = ontransact.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str16 != null) {
                jsonObject13.addProperty("architecture", str16);
            }
            jsonObject.add("device", jsonObject13);
        }
        ErrorEvent.INotificationSideChannel iNotificationSideChannel = errorEventB.d;
        JsonObject jsonObject14 = new JsonObject();
        jsonObject14.addProperty("format_version", Long.valueOf(iNotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
        ErrorEvent.cancel cancelVar = iNotificationSideChannel.b;
        if (cancelVar != null) {
            JsonObject jsonObject15 = new JsonObject();
            ErrorEvent.Plan plan = cancelVar.b;
            if (plan != null) {
                jsonObject15.add("plan", new JsonPrimitive(plan.jsonValue));
            }
            ErrorEvent.SessionPrecondition sessionPrecondition = cancelVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (sessionPrecondition != null) {
                jsonObject15.add("session_precondition", new JsonPrimitive(sessionPrecondition.jsonValue));
            }
            jsonObject14.add("session", jsonObject15);
        }
        ErrorEvent.a aVar = iNotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (aVar != null) {
            JsonObject jsonObject16 = new JsonObject();
            jsonObject16.addProperty("session_sample_rate", aVar.TuitionPaymentFragmentbindingInflater1);
            Number number = aVar.b;
            if (number != null) {
                jsonObject16.addProperty("session_replay_sample_rate", number);
            }
            jsonObject14.add("configuration", jsonObject16);
        }
        String str17 = iNotificationSideChannel.TuitionPaymentFragmentbindingInflater1;
        if (str17 != null) {
            jsonObject14.addProperty("browser_sdk_version", str17);
        }
        jsonObject.add("_dd", jsonObject14);
        ErrorEvent.notify notifyVar = errorEventB.a;
        if (notifyVar != null) {
            jsonObject.add("context", notifyVar.b());
        }
        ErrorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = errorEventB.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            JsonObject jsonObject17 = new JsonObject();
            JsonArray jsonArray2 = new JsonArray(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size());
            Iterator<T> it2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.iterator();
            while (it2.hasNext()) {
                jsonArray2.add((String) it2.next());
            }
            jsonObject17.add("id", jsonArray2);
            jsonObject.add("action", jsonObject17);
        }
        ErrorEvent.g gVar = errorEventB.asInterface;
        if (gVar != null) {
            JsonObject jsonObject18 = new JsonObject();
            ErrorEvent.cancelAll cancelall = gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            JsonObject jsonObject19 = new JsonObject();
            jsonObject19.addProperty("id", cancelall.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            jsonObject18.add("view", jsonObject19);
            jsonObject18.add("source", new JsonPrimitive(gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.jsonValue));
            jsonObject.add("container", jsonObject18);
        }
        jsonObject.addProperty("type", errorEventB.INotificationSideChannelDefault);
        ErrorEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer = errorEventB.cancelAll;
        JsonObject jsonObject20 = new JsonObject();
        String str18 = remoteActionCompatParcelizer.asInterface;
        if (str18 != null) {
            jsonObject20.addProperty("id", str18);
        }
        jsonObject20.addProperty("message", remoteActionCompatParcelizer.asBinder);
        jsonObject20.add("source", new JsonPrimitive(remoteActionCompatParcelizer.INotificationSideChannel.jsonValue));
        String str19 = remoteActionCompatParcelizer.notify;
        if (str19 != null) {
            jsonObject20.addProperty("stack", str19);
        }
        List<ErrorEvent.TuitionPaymentFragmentbindingInflater1> list2 = remoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (list2 != null) {
            JsonArray jsonArray3 = new JsonArray(list2.size());
            for (ErrorEvent.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 : list2) {
                JsonObject jsonObject21 = new JsonObject();
                jsonObject21.addProperty("message", tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1);
                String str20 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (str20 != null) {
                    jsonObject21.addProperty("type", str20);
                }
                String str21 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (str21 != null) {
                    jsonObject21.addProperty("stack", str21);
                }
                jsonObject21.add("source", new JsonPrimitive(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.jsonValue));
                jsonArray3.add(jsonObject21);
            }
            jsonObject20.add("causes", jsonArray3);
        }
        Boolean bool4 = remoteActionCompatParcelizer.a;
        if (bool4 != null) {
            jsonObject20.addProperty("is_crash", Boolean.valueOf(bool4.booleanValue()));
        }
        String str22 = remoteActionCompatParcelizer.TuitionPaymentFragmentbindingInflater1;
        if (str22 != null) {
            jsonObject20.addProperty("fingerprint", str22);
        }
        String str23 = remoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        if (str23 != null) {
            jsonObject20.addProperty("type", str23);
        }
        ErrorEvent.Category category = remoteActionCompatParcelizer.b;
        if (category != null) {
            jsonObject20.add("category", new JsonPrimitive(category.jsonValue));
        }
        ErrorEvent.Handling handling = remoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (handling != null) {
            jsonObject20.add("handling", new JsonPrimitive(handling.jsonValue));
        }
        String str24 = remoteActionCompatParcelizer.d;
        if (str24 != null) {
            jsonObject20.addProperty("handling_stack", str24);
        }
        ErrorEvent.SourceType sourceType = remoteActionCompatParcelizer.cancel;
        if (sourceType != null) {
            jsonObject20.add("source_type", new JsonPrimitive(sourceType.jsonValue));
        }
        ErrorEvent.read readVar = remoteActionCompatParcelizer.onTransact;
        if (readVar != null) {
            JsonObject jsonObject22 = new JsonObject();
            jsonObject22.add(FirebaseAnalytics.Param.METHOD, new JsonPrimitive(readVar.TuitionPaymentFragmentbindingInflater1.jsonValue));
            jsonObject22.addProperty("status_code", Long.valueOf(readVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            jsonObject22.addProperty(ImagesContract.URL, readVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            ErrorEvent.IconCompatParcelizer iconCompatParcelizer = readVar.b;
            if (iconCompatParcelizer != null) {
                JsonObject jsonObject23 = new JsonObject();
                String str25 = iconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (str25 != null) {
                    jsonObject23.addProperty(DynamicLink.Builder.KEY_DOMAIN, str25);
                }
                String str26 = iconCompatParcelizer.TuitionPaymentFragmentbindingInflater1;
                if (str26 != null) {
                    jsonObject23.addProperty("name", str26);
                }
                ErrorEvent.ProviderType providerType = iconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (providerType != null) {
                    jsonObject23.add("type", new JsonPrimitive(providerType.jsonValue));
                }
                jsonObject22.add("provider", jsonObject23);
            }
            jsonObject20.add("resource", jsonObject22);
        }
        List<ErrorEvent.connect> list3 = remoteActionCompatParcelizer.cancelAll;
        if (list3 != null) {
            JsonArray jsonArray4 = new JsonArray(list3.size());
            for (ErrorEvent.connect connectVar : list3) {
                JsonObject jsonObject24 = new JsonObject();
                jsonObject24.addProperty("name", connectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                jsonObject24.addProperty("crashed", Boolean.valueOf(connectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
                jsonObject24.addProperty("stack", connectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                String str27 = connectVar.b;
                if (str27 != null) {
                    jsonObject24.addProperty(RemoteConfigConstants.ResponseFieldKey.STATE, str27);
                }
                jsonArray4.add(jsonObject24);
            }
            jsonObject20.add("threads", jsonArray4);
        }
        List<ErrorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2> list4 = remoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (list4 != null) {
            JsonArray jsonArray5 = new JsonArray(list4.size());
            for (ErrorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 : list4) {
                JsonObject jsonObject25 = new JsonObject();
                jsonObject25.addProperty("uuid", tuitionPaymentFragmentspecialinlinedviewModeldefault2.g);
                jsonObject25.addProperty("name", tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1);
                jsonObject25.addProperty("is_system", Boolean.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.b));
                String str28 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (str28 != null) {
                    jsonObject25.addProperty("load_address", str28);
                }
                String str29 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (str29 != null) {
                    jsonObject25.addProperty("max_address", str29);
                }
                String str30 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str30 != null) {
                    jsonObject25.addProperty("arch", str30);
                }
                jsonArray5.add(jsonObject25);
            }
            jsonObject20.add("binary_images", jsonArray5);
        }
        Boolean bool5 = remoteActionCompatParcelizer.INotificationSideChannelStub;
        if (bool5 != null) {
            jsonObject20.addProperty("was_truncated", Boolean.valueOf(bool5.booleanValue()));
        }
        ErrorEvent.getInterfaceDescriptor getinterfacedescriptor = remoteActionCompatParcelizer.g;
        if (getinterfacedescriptor != null) {
            JsonObject jsonObject26 = new JsonObject();
            String str31 = getinterfacedescriptor.b;
            if (str31 != null) {
                jsonObject26.addProperty("code_type", str31);
            }
            String str32 = getinterfacedescriptor.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str32 != null) {
                jsonObject26.addProperty("parent_process", str32);
            }
            String str33 = getinterfacedescriptor.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str33 != null) {
                jsonObject26.addProperty("incident_identifier", str33);
            }
            String str34 = getinterfacedescriptor.g;
            if (str34 != null) {
                jsonObject26.addProperty("process", str34);
            }
            String str35 = getinterfacedescriptor.TuitionPaymentFragmentbindingInflater1;
            if (str35 != null) {
                jsonObject26.addProperty("exception_type", str35);
            }
            String str36 = getinterfacedescriptor.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str36 != null) {
                jsonObject26.addProperty("exception_codes", str36);
            }
            String str37 = getinterfacedescriptor.asInterface;
            if (str37 != null) {
                jsonObject26.addProperty("path", str37);
            }
            jsonObject20.add("meta", jsonObject26);
        }
        Long l = remoteActionCompatParcelizer.getInterfaceDescriptor;
        if (l != null) {
            jsonObject20.addProperty("time_since_app_start", Long.valueOf(l.longValue()));
        }
        jsonObject.add(Constants.IPC_BUNDLE_KEY_SEND_ERROR, jsonObject20);
        ErrorEvent.notify notifyVar2 = errorEventB.onTransact;
        if (notifyVar2 != null) {
            jsonObject.add("feature_flags", notifyVar2.b());
        }
        JsonObject asJsonObject = jsonObject.getAsJsonObject();
        Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
        String string = b(asJsonObject).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
