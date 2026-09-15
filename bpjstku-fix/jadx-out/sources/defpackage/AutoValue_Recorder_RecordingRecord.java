package defpackage;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import defpackage.AutoValue_Recorder_RecordingRecord;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0002\b\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0016X\u0097D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"LAutoValue_Recorder_RecordingRecord;", "LAutoValue_QualityRatioToResolutionsTable_QualityRatio;", "<init>", "()V", "", "b", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 3, 0})
public final class AutoValue_Recorder_RecordingRecord implements AutoValue_QualityRatioToResolutionsTable_QualityRatio {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<AutoValue_Recorder_RecordingRecord>() { // from class: com.sofakingforever.analytics.kits.firebase.FirebaseKit$Companion$instance$2
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
        public final AutoValue_Recorder_RecordingRecord invoke() {
            AutoValue_Recorder_RecordingRecord.b bVar = AutoValue_Recorder_RecordingRecord.b.INSTANCE;
            return AutoValue_Recorder_RecordingRecord.b.TuitionPaymentFragmentbindingInflater1();
        }
    });

    private AutoValue_Recorder_RecordingRecord() {
        this.TuitionPaymentFragmentbindingInflater1 = RemoteConfigComponent.DEFAULT_NAMESPACE;
    }

    public /* synthetic */ AutoValue_Recorder_RecordingRecord(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007"}, d2 = {"LAutoValue_Recorder_RecordingRecord$b;", "", "<init>", "()V", "LAutoValue_Recorder_RecordingRecord;", "TuitionPaymentFragmentbindingInflater1", "LAutoValue_Recorder_RecordingRecord;", "()LAutoValue_Recorder_RecordingRecord;", "b"}, k = 1, mv = {2, 3, 0})
    public static final class b {
        public static final b INSTANCE = new b();

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        private static final AutoValue_Recorder_RecordingRecord b = new AutoValue_Recorder_RecordingRecord(null);

        private b() {
        }

        public static AutoValue_Recorder_RecordingRecord TuitionPaymentFragmentbindingInflater1() {
            return b;
        }
    }

    /* JADX INFO: renamed from: AutoValue_Recorder_RecordingRecord$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\b\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007"}, d2 = {"LAutoValue_Recorder_RecordingRecord$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "LAutoValue_Recorder_RecordingRecord;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "()LAutoValue_Recorder_RecordingRecord;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 3, 0})
    public static final class Companion {
        private static /* synthetic */ KProperty[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/sofakingforever/analytics/kits/firebase/FirebaseKit;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static AutoValue_Recorder_RecordingRecord TuitionPaymentFragmentbindingInflater1() {
            Lazy lazy = AutoValue_Recorder_RecordingRecord.TuitionPaymentFragmentbindingInflater1;
            KProperty kProperty = TuitionPaymentFragmentspecialinlinedviewModeldefault1[0];
            return (AutoValue_Recorder_RecordingRecord) lazy.getValue();
        }
    }
}
