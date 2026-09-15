package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.metrics.MethodCallSamplingRate;
import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher$endMetric$1$1;
import com.datadog.android.rum.model.ViewEvent;
import defpackage.PreviewExternalSyntheticLambda2;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\r\u0010\u0013J/\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\r\u0010\u0018R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"LPreviewExternalSyntheticLambda2;", "LPreviewExternalSyntheticLambda3;", "Lcom/datadog/android/api/InternalLogger;", "p0", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "", "", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;J)V", "Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "b", "(Ljava/lang/String;)V", "Lcom/datadog/android/rum/model/ViewEvent;", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ViewEvent;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "p2", "", "p3", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;JZ)V", "Lcom/datadog/android/api/InternalLogger;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/datadog/android/rum/internal/metric/SessionEndedMetric;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/concurrent/ConcurrentHashMap;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class PreviewExternalSyntheticLambda2 implements PreviewExternalSyntheticLambda3 {
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final ConcurrentHashMap<String, SessionEndedMetric> b;

    public PreviewExternalSyntheticLambda2(InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = internalLogger;
        this.b = new ConcurrentHashMap<>();
    }

    @Override // defpackage.PreviewExternalSyntheticLambda3
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0, RumSessionScope.StartReason p1, long p2, boolean p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        this.b.put(p0, new SessionEndedMetric(p0, p1, p2, p3));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0067  */
    @Override // defpackage.PreviewExternalSyntheticLambda3
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0, long p1) {
        long jLongValue;
        int i;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(p0, "");
        SessionEndedMetric sessionEndedMetricRemove = this.b.remove(p0);
        if (sessionEndedMetricRemove != null) {
            InternalLogger internalLogger = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            SessionEndedMetricDispatcher$endMetric$1$1 sessionEndedMetricDispatcher$endMetric$1$1 = new Function0<String>() { // from class: com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher$endMetric$1$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "[Mobile Metric] RUM Session Ended";
                }
            };
            Pair[] pairArr = new Pair[2];
            pairArr[0] = TuplesKt.to("metric_type", "rum session ended");
            Pair[] pairArr2 = new Pair[9];
            pairArr2[0] = TuplesKt.to("process_type", "app");
            pairArr2[1] = TuplesKt.to("precondition", sessionEndedMetricRemove.asBinder.getAsString());
            SessionEndedMetric.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = sessionEndedMetricRemove.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                jLongValue = 0;
            } else {
                SessionEndedMetric.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = sessionEndedMetricRemove.TuitionPaymentFragmentbindingInflater1;
                Long lValueOf = tuitionPaymentFragmentspecialinlinedviewModeldefault4 != null ? Long.valueOf(TimeUnit.MILLISECONDS.toNanos(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 - tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentbindingInflater1) + tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) : null;
                if (lValueOf != null) {
                    jLongValue = lValueOf.longValue();
                } else {
                    jLongValue = 0;
                }
            }
            pairArr2[2] = TuplesKt.to(TypedValues.TransitionType.S_DURATION, Long.valueOf(jLongValue));
            pairArr2[3] = TuplesKt.to("was_stopped", Boolean.valueOf(sessionEndedMetricRemove.a));
            Pair[] pairArr3 = new Pair[4];
            pairArr3[0] = TuplesKt.to("total", Integer.valueOf(sessionEndedMetricRemove.asInterface.size()));
            Collection<SessionEndedMetric.TuitionPaymentFragmentspecialinlinedviewModeldefault3> collectionValues = sessionEndedMetricRemove.asInterface.values();
            if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                i = 0;
            } else {
                Iterator<T> it = collectionValues.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((SessionEndedMetric.TuitionPaymentFragmentspecialinlinedviewModeldefault3) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault1, "com/datadog/background/view") && (i = i + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            pairArr3[1] = TuplesKt.to("background", Integer.valueOf(i));
            Collection<SessionEndedMetric.TuitionPaymentFragmentspecialinlinedviewModeldefault3> collectionValues2 = sessionEndedMetricRemove.asInterface.values();
            if ((collectionValues2 instanceof Collection) && collectionValues2.isEmpty()) {
                i2 = 0;
            } else {
                Iterator<T> it2 = collectionValues2.iterator();
                i2 = 0;
                while (it2.hasNext()) {
                    if (Intrinsics.areEqual(((SessionEndedMetric.TuitionPaymentFragmentspecialinlinedviewModeldefault3) it2.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault1, "com/datadog/application-launch/view") && (i2 = i2 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            pairArr3[2] = TuplesKt.to("app_launch", Integer.valueOf(i2));
            Collection<SessionEndedMetric.TuitionPaymentFragmentspecialinlinedviewModeldefault3> collectionValues3 = sessionEndedMetricRemove.asInterface.values();
            if ((collectionValues3 instanceof Collection) && collectionValues3.isEmpty()) {
                i3 = 0;
            } else {
                Iterator<T> it3 = collectionValues3.iterator();
                i3 = 0;
                while (it3.hasNext()) {
                    if (((SessionEndedMetric.TuitionPaymentFragmentspecialinlinedviewModeldefault3) it3.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault2 && (i3 = i3 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            pairArr3[3] = TuplesKt.to("with_has_replay", Integer.valueOf(i3));
            pairArr2[4] = TuplesKt.to("views_count", MapsKt.mapOf(pairArr3));
            Pair[] pairArr4 = new Pair[2];
            pairArr4[0] = TuplesKt.to("total", Integer.valueOf(CollectionsKt.sumOfInt(sessionEndedMetricRemove.TuitionPaymentFragmentspecialinlinedviewModeldefault2.values())));
            List<Map.Entry> listSubList = CollectionsKt.sortedWith(sessionEndedMetricRemove.TuitionPaymentFragmentspecialinlinedviewModeldefault2.entrySet(), new Comparator() { // from class: com.datadog.android.rum.internal.metric.SessionEndedMetric.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues((Integer) ((Map.Entry) t2).getValue(), (Integer) ((Map.Entry) t).getValue());
                }
            }).subList(0, RangesKt.coerceAtMost(5, sessionEndedMetricRemove.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size()));
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listSubList, 10)), 16));
            for (Map.Entry entry : listSubList) {
                Pair pair = TuplesKt.to(new Regex("[^\\w']+").replace((String) entry.getKey(), "_"), entry.getValue());
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            pairArr4[1] = TuplesKt.to("by_kind", linkedHashMap);
            pairArr2[5] = TuplesKt.to("sdk_errors_count", MapsKt.mapOf(pairArr4));
            Pair[] pairArr5 = new Pair[4];
            Integer num = sessionEndedMetricRemove.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(SessionEndedMetric.MissedEventType.ACTION);
            pairArr5[0] = TuplesKt.to("actions", Integer.valueOf(num != null ? num.intValue() : 0));
            Integer num2 = sessionEndedMetricRemove.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(SessionEndedMetric.MissedEventType.RESOURCE);
            pairArr5[1] = TuplesKt.to("resources", Integer.valueOf(num2 != null ? num2.intValue() : 0));
            Integer num3 = sessionEndedMetricRemove.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(SessionEndedMetric.MissedEventType.ERROR);
            pairArr5[2] = TuplesKt.to("errors", Integer.valueOf(num3 != null ? num3.intValue() : 0));
            Integer num4 = sessionEndedMetricRemove.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(SessionEndedMetric.MissedEventType.LONG_TASK);
            pairArr5[3] = TuplesKt.to("long_tasks", Integer.valueOf(num4 != null ? num4.intValue() : 0));
            pairArr2[6] = TuplesKt.to("no_view_events_count", MapsKt.mapOf(pairArr5));
            pairArr2[7] = TuplesKt.to("has_background_events_tracking_enabled", Boolean.valueOf(sessionEndedMetricRemove.b));
            pairArr2[8] = TuplesKt.to("ntp_offset", MapsKt.mapOf(TuplesKt.to("at_start", Long.valueOf(sessionEndedMetricRemove.d)), TuplesKt.to("at_end", Long.valueOf(p1))));
            pairArr[1] = TuplesKt.to("rse", MapsKt.mapOf(pairArr2));
            internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionEndedMetricDispatcher$endMetric$1$1, MapsKt.mapOf(pairArr), MethodCallSamplingRate.ALL.getRate());
        }
    }

    @Override // defpackage.PreviewExternalSyntheticLambda3
    public final void b(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        SessionEndedMetric sessionEndedMetric = this.b.get(p0);
        if (sessionEndedMetric != null) {
            sessionEndedMetric.a = true;
        }
    }

    @Override // defpackage.PreviewExternalSyntheticLambda3
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final String p0, final ViewEvent p1) {
        String str;
        long j;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        SessionEndedMetric sessionEndedMetric = this.b.get(p0);
        if (sessionEndedMetric != null) {
            Intrinsics.checkNotNullParameter(p1, "");
            if (Intrinsics.areEqual(p1.INotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault3, sessionEndedMetric.g)) {
                SessionEndedMetric.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = sessionEndedMetric.asInterface.get(p1.connect.connect);
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 == null || (str = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) {
                    str = p1.connect.onConnectionSuspended;
                }
                String str2 = str;
                SessionEndedMetric.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = sessionEndedMetric.asInterface.get(p1.connect.connect);
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault4 != null) {
                    j = tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentbindingInflater1;
                } else {
                    j = p1.asInterface;
                }
                long j2 = p1.connect.onConnected;
                Boolean bool = p1.INotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                SessionEndedMetric.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault5 = new SessionEndedMetric.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str2, j, j2, bool != null ? bool.booleanValue() : false);
                sessionEndedMetric.asInterface.put(p1.connect.connect, tuitionPaymentFragmentspecialinlinedviewModeldefault5);
                if (sessionEndedMetric.TuitionPaymentFragmentbindingInflater1 == null) {
                    sessionEndedMetric.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault5;
                }
                sessionEndedMetric.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault5;
                return;
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher$onViewTracked$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return PreviewExternalSyntheticLambda2.TuitionPaymentFragmentbindingInflater1(p0, p1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, null, false, null);
    }

    @Override // defpackage.PreviewExternalSyntheticLambda3
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final String p0, final String p1) {
        Unit unit;
        Intrinsics.checkNotNullParameter(p0, "");
        SessionEndedMetric sessionEndedMetric = this.b.get(p0);
        if (sessionEndedMetric != null) {
            String str = p1 == null ? "Empty error kind" : p1;
            Map<String, Integer> map = sessionEndedMetric.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Integer num = map.get(str);
            map.put(str, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher$onSdkErrorTracked$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return PreviewExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, p1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, null, false, null);
        }
    }

    @Override // defpackage.PreviewExternalSyntheticLambda3
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0, SessionEndedMetric.MissedEventType p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        SessionEndedMetric sessionEndedMetric = this.b.get(p0);
        if (sessionEndedMetric != null) {
            Intrinsics.checkNotNullParameter(p1, "");
            Map<SessionEndedMetric.MissedEventType, Integer> map = sessionEndedMetric.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Integer num = map.get(p1);
            map.put(p1, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        }
    }

    public static final /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, String str2) {
        StringBuilder sb = new StringBuilder("Failed to track ");
        sb.append(str2);
        sb.append(" error, session ");
        sb.append(str);
        sb.append(" has ended");
        return sb.toString();
    }

    public static final /* synthetic */ String TuitionPaymentFragmentbindingInflater1(String str, ViewEvent viewEvent) {
        String str2;
        String str3 = viewEvent.connect.onConnectionSuspended;
        if (Intrinsics.areEqual(str3, "com/datadog/application-launch/view")) {
            str2 = "AppLaunch";
        } else {
            str2 = Intrinsics.areEqual(str3, "com/datadog/background/view") ? "Background" : TypedValues.Custom.NAME;
        }
        StringBuilder sb = new StringBuilder("Failed to track ");
        sb.append(str2);
        sb.append(" view in session with different UUID ");
        sb.append(str);
        return sb.toString();
    }
}
