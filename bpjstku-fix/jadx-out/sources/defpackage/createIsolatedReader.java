package defpackage;

import com.datadog.android.api.InternalLogger;
import java.security.SecureRandom;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0015\u0010\u000e\u001a\u00020\r8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"LcreateIsolatedReader;", "LImageReaderProxyProvider;", "", "p0", "<init>", "(F)V", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Ljava/lang/Float;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Z", "Ljava/security/SecureRandom;", "b", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/jvm/functions/Function0;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class createIsolatedReader implements ImageReaderProxyProvider {
    private static final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Function0<Float> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Lazy b;

    private createIsolatedReader(Function0<Float> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function0;
        this.b = LazyKt.lazy(new Function0<SecureRandom>() { // from class: com.datadog.android.core.sampling.RateBasedSampler$random$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
            public final SecureRandom invoke() {
                return new SecureRandom();
            }
        });
    }

    public createIsolatedReader(final float f) {
        this(new Function0<Float>() { // from class: com.datadog.android.core.sampling.RateBasedSampler$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(f);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // defpackage.ImageReaderProxyProvider
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        float fFloatValue = TuitionPaymentFragmentspecialinlinedviewModeldefault3().floatValue();
        if (fFloatValue == 0.0f) {
            return false;
        }
        return fFloatValue == 100.0f || ((SecureRandom) this.b.getValue()).nextFloat() * 100.0f <= fFloatValue;
    }

    private Float TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        final float fFloatValue = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke().floatValue();
        float f = 0.0f;
        if (fFloatValue < 0.0f) {
            InternalLogger.Companion companion = InternalLogger.INSTANCE;
            InternalLogger.Companion.b().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.sampling.RateBasedSampler$getSampleRate$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    float f2 = fFloatValue;
                    StringBuilder sb = new StringBuilder("Sample rate value provided ");
                    sb.append(f2);
                    sb.append(" is below 0, setting it to 0.");
                    return sb.toString();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, null, false, null);
        } else {
            f = 100.0f;
            if (fFloatValue > 100.0f) {
                InternalLogger.Companion companion2 = InternalLogger.INSTANCE;
                InternalLogger.Companion.b().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.sampling.RateBasedSampler$getSampleRate$2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        float f2 = fFloatValue;
                        StringBuilder sb = new StringBuilder("Sample rate value provided ");
                        sb.append(f2);
                        sb.append(" is above 100, setting it to 100.");
                        return sb.toString();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, null, false, null);
            }
            return Float.valueOf(fFloatValue);
        }
        fFloatValue = f;
        return Float.valueOf(fFloatValue);
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LcreateIsolatedReader$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V"}, k = 1, mv = {1, 7, 0}, xi = 48)
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        private TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
