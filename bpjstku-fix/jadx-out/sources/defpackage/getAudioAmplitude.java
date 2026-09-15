package defpackage;

import com.rd.animation.type.AnimationType;

/* JADX INFO: loaded from: classes4.dex */
public final class getAudioAmplitude {
    public getAudioState TuitionPaymentFragmentbindingInflater1;
    public ProcessCameraProviderCompanionExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public AudioStats TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public b TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public interface b {
    }

    public getAudioAmplitude(AudioStats audioStats) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = audioStats;
        this.TuitionPaymentFragmentbindingInflater1 = new getAudioState(audioStats);
    }

    /* JADX INFO: renamed from: getAudioAmplitude$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] TuitionPaymentFragmentbindingInflater1;

        static {
            int[] iArr = new int[AnimationType.values().length];
            TuitionPaymentFragmentbindingInflater1 = iArr;
            try {
                iArr[AnimationType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[AnimationType.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[AnimationType.SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[AnimationType.WORM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[AnimationType.SLIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[AnimationType.FILL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[AnimationType.THIN_WORM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[AnimationType.DROP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[AnimationType.SWAP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[AnimationType.SCALE_DOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }
}
