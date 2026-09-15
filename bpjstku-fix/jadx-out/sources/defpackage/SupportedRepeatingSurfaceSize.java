package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sofakingforever.analytics.exceptions.UnsupportedEventException;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u000f\u0010\u0012J\u0013\u0010\t\u001a\u00020\u0013*\u00020\u0013H\u0002¢\u0006\u0004\b\t\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\f\u0010\u0017R\u0014\u0010\t\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0018\u001a\u00020\u00138\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u0018\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u001c8\u0017X\u0097\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\f\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\f\u0010 "}, d2 = {"LSupportedRepeatingSurfaceSize;", "LgetOverrideParams;", "", "p0", "Landroid/content/Context;", "p1", "<init>", "(Landroid/content/Context;)V", "", "TuitionPaymentFragmentbindingInflater1", "()V", "LgetQuality;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(LgetQuality;)V", "LsetContentValues;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(LsetContentValues;)V", "LgetCallbackExecutor;", "(LgetCallbackExecutor;)V", "", "(Ljava/lang/String;)Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Z", "()Z", "b", "Landroid/content/Context;", "Ljava/lang/String;", "()Ljava/lang/String;", "LAutoValue_Recorder_RecordingRecord;", "a", "LAutoValue_Recorder_RecordingRecord;", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "Lcom/google/firebase/analytics/FirebaseAnalytics;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SupportedRepeatingSurfaceSize implements getOverrideParams {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final String b;
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public FirebaseAnalytics TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AutoValue_Recorder_RecordingRecord TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Context TuitionPaymentFragmentbindingInflater1;

    public SupportedRepeatingSurfaceSize(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        this.TuitionPaymentFragmentbindingInflater1 = context;
        this.b = "DefaultFirebaseDispatcher";
        AutoValue_Recorder_RecordingRecord.Companion companion = AutoValue_Recorder_RecordingRecord.INSTANCE;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = AutoValue_Recorder_RecordingRecord.Companion.TuitionPaymentFragmentbindingInflater1();
    }

    @Override // defpackage.AutoValue_OutputResults
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from getter */
    public final boolean getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.AutoValue_OutputResults
    public final void b(AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality) {
        boolean z;
        Intrinsics.checkNotNullParameter(autoValue_Quality_ConstantQuality, "");
        SupportedRepeatingSurfaceSize supportedRepeatingSurfaceSize = this;
        if (autoValue_Quality_ConstantQuality.b(supportedRepeatingSurfaceSize.TuitionPaymentFragmentspecialinlinedviewModeldefault2())) {
            boolean z2 = true;
            if (autoValue_Quality_ConstantQuality instanceof getQuality) {
                supportedRepeatingSurfaceSize.TuitionPaymentFragmentspecialinlinedviewModeldefault3((getQuality) autoValue_Quality_ConstantQuality);
                z = true;
            } else {
                z = false;
            }
            if (autoValue_Quality_ConstantQuality instanceof setContentValues) {
                supportedRepeatingSurfaceSize.TuitionPaymentFragmentspecialinlinedviewModeldefault1((setContentValues) autoValue_Quality_ConstantQuality);
            } else {
                z2 = z;
            }
            if (autoValue_Quality_ConstantQuality instanceof getCallbackExecutor) {
                supportedRepeatingSurfaceSize.TuitionPaymentFragmentspecialinlinedviewModeldefault1((getCallbackExecutor) autoValue_Quality_ConstantQuality);
            } else if (!z2) {
                throw new UnsupportedEventException(autoValue_Quality_ConstantQuality);
            }
        }
    }

    @Override // defpackage.AutoValue_OutputResults
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // defpackage.AutoValue_OutputResults
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getQuality p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        FirebaseAnalytics firebaseAnalytics = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (firebaseAnalytics != null) {
            String strTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(p0.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            Bundle bundle = new Bundle();
            for (Map.Entry<String, Object> entry : p0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).entrySet()) {
                Object value = entry.getValue();
                if (value instanceof Integer) {
                    String key = entry.getKey();
                    Object value2 = entry.getValue();
                    Intrinsics.checkNotNull(value2, "");
                    bundle.putInt(key, ((Integer) value2).intValue());
                } else if (value instanceof Float) {
                    String key2 = entry.getKey();
                    Object value3 = entry.getValue();
                    Intrinsics.checkNotNull(value3, "");
                    bundle.putFloat(key2, ((Float) value3).floatValue());
                } else if (value instanceof Double) {
                    String key3 = entry.getKey();
                    Object value4 = entry.getValue();
                    Intrinsics.checkNotNull(value4, "");
                    bundle.putDouble(key3, ((Double) value4).doubleValue());
                } else if (value instanceof Long) {
                    String key4 = entry.getKey();
                    Object value5 = entry.getValue();
                    Intrinsics.checkNotNull(value5, "");
                    bundle.putLong(key4, ((Long) value5).longValue());
                } else if (value instanceof String) {
                    String key5 = entry.getKey();
                    Object value6 = entry.getValue();
                    Intrinsics.checkNotNull(value6, "");
                    bundle.putString(key5, (String) value6);
                } else {
                    if (!(value instanceof Boolean)) {
                        Class<?> cls = entry.getValue().getClass();
                        StringBuilder sb = new StringBuilder("value type ");
                        sb.append(cls);
                        sb.append(" is illegal");
                        throw new RuntimeException(sb.toString());
                    }
                    String key6 = entry.getKey();
                    Object value7 = entry.getValue();
                    Intrinsics.checkNotNull(value7, "");
                    bundle.putBoolean(key6, ((Boolean) value7).booleanValue());
                }
            }
            firebaseAnalytics.logEvent(strTuitionPaymentFragmentbindingInflater1, bundle);
        }
    }

    @Override // defpackage.AutoValue_OutputResults
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(setContentValues p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        FirebaseAnalytics firebaseAnalytics = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (firebaseAnalytics != null) {
            AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            firebaseAnalytics.logEvent("contentView_".concat(String.valueOf(TuitionPaymentFragmentbindingInflater1(p0.TuitionPaymentFragmentspecialinlinedviewModeldefault2()))), Bundle.EMPTY);
        }
    }

    private static String TuitionPaymentFragmentbindingInflater1(String str) {
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String strReplace$default = StringsKt.replace$default(lowerCase, " ", "_", false, 4, (Object) null);
        if (strReplace$default.length() <= 40) {
            return strReplace$default;
        }
        StringBuilder sb = new StringBuilder("firebase event title shouldn't have more than 40 chars (");
        sb.append(strReplace$default);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.AutoValue_OutputResults
    public final /* synthetic */ AutoValue_QualityRatioToResolutionsTable_QualityRatio TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.AutoValue_OutputResults
    public final void TuitionPaymentFragmentbindingInflater1() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = FirebaseAnalytics.getInstance(this.TuitionPaymentFragmentbindingInflater1);
    }

    @Override // defpackage.AutoValue_OutputResults
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getCallbackExecutor p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        for (Map.Entry<String, Object> entry : p0.TuitionPaymentFragmentspecialinlinedviewModeldefault2().entrySet()) {
            FirebaseAnalytics firebaseAnalytics = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (firebaseAnalytics != null) {
                firebaseAnalytics.setUserProperty(entry.getKey(), entry.getValue().toString());
            }
        }
    }
}
