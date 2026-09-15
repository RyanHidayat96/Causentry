package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes4.dex */
public final class deriveVideoProfile {
    public static final <T> isBitDepthMatched<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setTargetOutputSize<T> settargetoutputsize, setActiveRecording setactiverecording, String str) {
        Intrinsics.checkNotNullParameter(settargetoutputsize, "");
        Intrinsics.checkNotNullParameter(setactiverecording, "");
        isBitDepthMatched<T> isbitdepthmatchedTuitionPaymentFragmentspecialinlinedviewModeldefault1 = settargetoutputsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1(setactiverecording, str);
        if (isbitdepthmatchedTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            return isbitdepthmatchedTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        startRecordingInternal.b(str, settargetoutputsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        throw new KotlinNothingValueException();
    }

    public static final <T> QualityAddedEncoderProfilesProvider<T> b(setTargetOutputSize<T> settargetoutputsize, startListeningToRotationEvents startlisteningtorotationevents, T t) {
        Intrinsics.checkNotNullParameter(settargetoutputsize, "");
        Intrinsics.checkNotNullParameter(startlisteningtorotationevents, "");
        Intrinsics.checkNotNullParameter(t, "");
        QualityAddedEncoderProfilesProvider<T> qualityAddedEncoderProfilesProviderTuitionPaymentFragmentbindingInflater1 = settargetoutputsize.TuitionPaymentFragmentbindingInflater1(startlisteningtorotationevents, t);
        if (qualityAddedEncoderProfilesProviderTuitionPaymentFragmentbindingInflater1 != null) {
            return qualityAddedEncoderProfilesProviderTuitionPaymentFragmentbindingInflater1;
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(t.getClass());
        KClass<T> kClassTuitionPaymentFragmentspecialinlinedviewModeldefault1 = settargetoutputsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        Intrinsics.checkNotNullParameter(orCreateKotlinClass, "");
        Intrinsics.checkNotNullParameter(kClassTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
        String simpleName = orCreateKotlinClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(orCreateKotlinClass);
        }
        startRecordingInternal.b(simpleName, kClassTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        throw new KotlinNothingValueException();
    }
}
