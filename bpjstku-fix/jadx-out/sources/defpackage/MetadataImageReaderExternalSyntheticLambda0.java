package defpackage;

import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import com.datadog.android.rum.internal.domain.scope.RumViewScope;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u001a\b\u0080\b\u0018\u0000 (2\u00020\u0001:\u0001(B©\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b!\u0010\"R\u0016\u0010%\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u0014\u0010(\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010'R\u0014\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010$R\u0014\u0010*\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010$R\u0016\u0010/\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010$R\u0016\u00101\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010$R\u0016\u0010,\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010$R\u0014\u00104\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010&\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u0014\u00107\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00106R\u0016\u00108\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010$"}, d2 = {"LMetadataImageReaderExternalSyntheticLambda0;", "", "", "p0", "p1", "", "p2", "p3", "p4", "p5", "p6", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;", "p7", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "p8", "Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$RumViewType;", "p9", "p10", "p11", "", "p12", "p13", "p14", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$RumViewType;Ljava/lang/String;Ljava/lang/String;JJZ)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "b", "cancelAll", "Z", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "a", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "onTransact", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;", "asInterface", "asBinder", "g", "d", "RemoteActionCompatParcelizer", "J", "cancel", "getInterfaceDescriptor", "Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$RumViewType;", "notify", "INotificationSideChannel"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class MetadataImageReaderExternalSyntheticLambda0 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String notify;
    public final String INotificationSideChannel;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long cancel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String b;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final RumSessionScope.StartReason a;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final String g;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final String d;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public final RumViewScope.RumViewType notify;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final boolean TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String onTransact;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String asBinder;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private final long cancelAll;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final RumSessionScope.State asInterface;

    public MetadataImageReaderExternalSyntheticLambda0(String str, String str2, boolean z, String str3, String str4, String str5, String str6, RumSessionScope.State state, RumSessionScope.StartReason startReason, RumViewScope.RumViewType rumViewType, String str7, String str8, long j, long j2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(startReason, "");
        Intrinsics.checkNotNullParameter(rumViewType, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
        this.d = str3;
        this.onTransact = str4;
        this.INotificationSideChannel = str5;
        this.b = str6;
        this.asInterface = state;
        this.a = startReason;
        this.notify = rumViewType;
        this.asBinder = str7;
        this.g = str8;
        this.cancel = j;
        this.cancelAll = j2;
        this.TuitionPaymentFragmentbindingInflater1 = z2;
    }

    public /* synthetic */ MetadataImageReaderExternalSyntheticLambda0(String str, String str2, boolean z, String str3, String str4, String str5, String str6, RumSessionScope.State state, RumSessionScope.StartReason startReason, RumViewScope.RumViewType rumViewType, String str7, String str8, long j, long j2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? notify : str, (i & 2) != 0 ? notify : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? RumSessionScope.State.NOT_TRACKED : state, (i & 256) != 0 ? RumSessionScope.StartReason.USER_APP_LAUNCH : startReason, (i & 512) != 0 ? RumViewScope.RumViewType.NONE : rumViewType, (i & 1024) != 0 ? null : str7, (i & 2048) == 0 ? str8 : null, (i & 4096) != 0 ? 0L : j, (i & 8192) == 0 ? j2 : 0L, (i & 16384) == 0 ? z2 : false);
    }

    public final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return MapsKt.mapOf(TuplesKt.to("application_id", this.TuitionPaymentFragmentspecialinlinedviewModeldefault2), TuplesKt.to("session_id", this.TuitionPaymentFragmentspecialinlinedviewModeldefault1), TuplesKt.to("session_active", Boolean.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)), TuplesKt.to("session_state", this.asInterface.getAsString()), TuplesKt.to("session_start_reason", this.a.getAsString()), TuplesKt.to("view_id", this.d), TuplesKt.to("view_name", this.onTransact), TuplesKt.to("view_url", this.INotificationSideChannel), TuplesKt.to("view_type", this.notify.getAsString()), TuplesKt.to("action_id", this.b), TuplesKt.to("synthetics_test_id", this.asBinder), TuplesKt.to("synthetics_result_id", this.g), TuplesKt.to("view_timestamp", Long.valueOf(this.cancel)), TuplesKt.to("view_has_replay", Boolean.valueOf(this.TuitionPaymentFragmentbindingInflater1)), TuplesKt.to("view_timestamp_offset", Long.valueOf(this.cancelAll)));
    }

    /* JADX INFO: renamed from: MetadataImageReaderExternalSyntheticLambda0$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"LMetadataImageReaderExternalSyntheticLambda0$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "", "", "p0", "LMetadataImageReaderExternalSyntheticLambda0;", "b", "(Ljava/util/Map;)LMetadataImageReaderExternalSyntheticLambda0;", "notify", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Ljava/lang/String;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return MetadataImageReaderExternalSyntheticLambda0.notify;
        }

        public static MetadataImageReaderExternalSyntheticLambda0 b(Map<String, ? extends Object> p0) throws CloneNotSupportedException {
            Intrinsics.checkNotNullParameter(p0, "");
            Object obj = p0.get("application_id");
            String str = obj instanceof String ? (String) obj : null;
            Object obj2 = p0.get("session_id");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = p0.get("session_active");
            Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
            RumSessionScope.State.Companion tuitionPaymentFragmentbindingInflater1 = RumSessionScope.State.INSTANCE;
            Object obj4 = p0.get("session_state");
            RumSessionScope.State stateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RumSessionScope.State.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj4 instanceof String ? (String) obj4 : null);
            RumSessionScope.StartReason.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = RumSessionScope.StartReason.INSTANCE;
            Object obj5 = p0.get("session_start_reason");
            RumSessionScope.StartReason startReasonTuitionPaymentFragmentspecialinlinedviewModeldefault2 = RumSessionScope.StartReason.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(obj5 instanceof String ? (String) obj5 : null);
            Object obj6 = p0.get("view_id");
            String str3 = obj6 instanceof String ? (String) obj6 : null;
            Object obj7 = p0.get("view_name");
            String str4 = obj7 instanceof String ? (String) obj7 : null;
            Object obj8 = p0.get("view_url");
            String str5 = obj8 instanceof String ? (String) obj8 : null;
            RumViewScope.RumViewType.Companion companion = RumViewScope.RumViewType.INSTANCE;
            Object obj9 = p0.get("view_type");
            RumViewScope.RumViewType rumViewTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RumViewScope.RumViewType.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj9 instanceof String ? (String) obj9 : null);
            Object obj10 = p0.get("action_id");
            String str6 = obj10 instanceof String ? (String) obj10 : null;
            Object obj11 = p0.get("synthetics_test_id");
            String str7 = obj11 instanceof String ? (String) obj11 : null;
            Object obj12 = p0.get("synthetics_result_id");
            String str8 = obj12 instanceof String ? (String) obj12 : null;
            Object obj13 = p0.get("view_has_replay");
            Boolean bool2 = obj13 instanceof Boolean ? (Boolean) obj13 : null;
            boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
            Object obj14 = p0.get("view_timestamp");
            Long l = obj14 instanceof Long ? (Long) obj14 : null;
            long jLongValue = l != null ? l.longValue() : 0L;
            Object obj15 = p0.get("view_timestamp_offset");
            Long l2 = obj15 instanceof Long ? (Long) obj15 : null;
            long jLongValue2 = l2 != null ? l2.longValue() : 0L;
            if (str == null) {
                str = MetadataImageReaderExternalSyntheticLambda0.notify;
            }
            if (str2 == null) {
                str2 = MetadataImageReaderExternalSyntheticLambda0.notify;
            }
            String str9 = str2;
            boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
            if (stateTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                stateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RumSessionScope.State.NOT_TRACKED;
            }
            RumSessionScope.State state = stateTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (startReasonTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                startReasonTuitionPaymentFragmentspecialinlinedviewModeldefault2 = RumSessionScope.StartReason.USER_APP_LAUNCH;
            }
            return new MetadataImageReaderExternalSyntheticLambda0(str, str9, zBooleanValue2, str3, str4, str5, str6, state, startReasonTuitionPaymentFragmentspecialinlinedviewModeldefault2, rumViewTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null ? RumViewScope.RumViewType.NONE : rumViewTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3, str7, str8, jLongValue, jLongValue2, zBooleanValue);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String string = new UUID(0L, 0L).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        notify = string;
    }

    public static /* synthetic */ MetadataImageReaderExternalSyntheticLambda0 b(MetadataImageReaderExternalSyntheticLambda0 metadataImageReaderExternalSyntheticLambda0, String str, String str2, boolean z, String str3, String str4, String str5, String str6, RumSessionScope.State state, RumSessionScope.StartReason startReason, RumViewScope.RumViewType rumViewType, String str7, String str8, long j, long j2, boolean z2, int i) {
        String str9 = (i & 1) != 0 ? metadataImageReaderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : str;
        String str10 = (i & 2) != 0 ? metadataImageReaderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : str2;
        boolean z3 = (i & 4) != 0 ? metadataImageReaderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : z;
        String str11 = (i & 8) != 0 ? metadataImageReaderExternalSyntheticLambda0.d : str3;
        String str12 = (i & 16) != 0 ? metadataImageReaderExternalSyntheticLambda0.onTransact : str4;
        String str13 = (i & 32) != 0 ? metadataImageReaderExternalSyntheticLambda0.INotificationSideChannel : str5;
        String str14 = (i & 64) != 0 ? metadataImageReaderExternalSyntheticLambda0.b : str6;
        RumSessionScope.State state2 = (i & 128) != 0 ? metadataImageReaderExternalSyntheticLambda0.asInterface : state;
        RumSessionScope.StartReason startReason2 = (i & 256) != 0 ? metadataImageReaderExternalSyntheticLambda0.a : startReason;
        RumViewScope.RumViewType rumViewType2 = (i & 512) != 0 ? metadataImageReaderExternalSyntheticLambda0.notify : rumViewType;
        String str15 = (i & 1024) != 0 ? metadataImageReaderExternalSyntheticLambda0.asBinder : str7;
        String str16 = (i & 2048) != 0 ? metadataImageReaderExternalSyntheticLambda0.g : str8;
        long j3 = (i & 4096) != 0 ? metadataImageReaderExternalSyntheticLambda0.cancel : j;
        long j4 = (i & 8192) != 0 ? metadataImageReaderExternalSyntheticLambda0.cancelAll : j2;
        boolean z4 = (i & 16384) != 0 ? metadataImageReaderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1 : z2;
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(state2, "");
        Intrinsics.checkNotNullParameter(startReason2, "");
        Intrinsics.checkNotNullParameter(rumViewType2, "");
        return new MetadataImageReaderExternalSyntheticLambda0(str9, str10, z3, str11, str12, str13, str14, state2, startReason2, rumViewType2, str15, str16, j3, j4, z4);
    }

    public MetadataImageReaderExternalSyntheticLambda0() {
        this(null, null, false, null, null, null, null, null, null, null, null, null, 0L, 0L, false, 32767, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MetadataImageReaderExternalSyntheticLambda0)) {
            return false;
        }
        MetadataImageReaderExternalSyntheticLambda0 metadataImageReaderExternalSyntheticLambda0 = (MetadataImageReaderExternalSyntheticLambda0) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, metadataImageReaderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, metadataImageReaderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == metadataImageReaderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && Intrinsics.areEqual(this.d, metadataImageReaderExternalSyntheticLambda0.d) && Intrinsics.areEqual(this.onTransact, metadataImageReaderExternalSyntheticLambda0.onTransact) && Intrinsics.areEqual(this.INotificationSideChannel, metadataImageReaderExternalSyntheticLambda0.INotificationSideChannel) && Intrinsics.areEqual(this.b, metadataImageReaderExternalSyntheticLambda0.b) && this.asInterface == metadataImageReaderExternalSyntheticLambda0.asInterface && this.a == metadataImageReaderExternalSyntheticLambda0.a && this.notify == metadataImageReaderExternalSyntheticLambda0.notify && Intrinsics.areEqual(this.asBinder, metadataImageReaderExternalSyntheticLambda0.asBinder) && Intrinsics.areEqual(this.g, metadataImageReaderExternalSyntheticLambda0.g) && this.cancel == metadataImageReaderExternalSyntheticLambda0.cancel && this.cancelAll == metadataImageReaderExternalSyntheticLambda0.cancelAll && this.TuitionPaymentFragmentbindingInflater1 == metadataImageReaderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1;
    }

    public final int hashCode() {
        int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        int iHashCode3 = Boolean.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        String str = this.d;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.onTransact;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.INotificationSideChannel;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.b;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        int iHashCode8 = this.asInterface.hashCode();
        int iHashCode9 = this.a.hashCode();
        int iHashCode10 = this.notify.hashCode();
        String str5 = this.asBinder;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.g;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31) + Long.hashCode(this.cancel)) * 31) + Long.hashCode(this.cancelAll)) * 31) + Boolean.hashCode(this.TuitionPaymentFragmentbindingInflater1);
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str3 = this.d;
        String str4 = this.onTransact;
        String str5 = this.INotificationSideChannel;
        String str6 = this.b;
        RumSessionScope.State state = this.asInterface;
        RumSessionScope.StartReason startReason = this.a;
        RumViewScope.RumViewType rumViewType = this.notify;
        String str7 = this.asBinder;
        String str8 = this.g;
        long j = this.cancel;
        long j2 = this.cancelAll;
        boolean z2 = this.TuitionPaymentFragmentbindingInflater1;
        StringBuilder sb = new StringBuilder("MetadataImageReaderExternalSyntheticLambda0(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(z);
        sb.append(", d=");
        sb.append(str3);
        sb.append(", onTransact=");
        sb.append(str4);
        sb.append(", INotificationSideChannel=");
        sb.append(str5);
        sb.append(", b=");
        sb.append(str6);
        sb.append(", asInterface=");
        sb.append(state);
        sb.append(", a=");
        sb.append(startReason);
        sb.append(", notify=");
        sb.append(rumViewType);
        sb.append(", asBinder=");
        sb.append(str7);
        sb.append(", g=");
        sb.append(str8);
        sb.append(", cancel=");
        sb.append(j);
        sb.append(", cancelAll=");
        sb.append(j2);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }
}
