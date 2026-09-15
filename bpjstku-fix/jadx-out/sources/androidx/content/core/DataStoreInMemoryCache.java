package androidx.content.core;

import androidx.exifinterface.media.ExifInterface;
import defpackage.EncoderImplExternalSyntheticLambda14;
import defpackage.clampVideoBitrateIfNotSupported;
import defpackage.lambdastop3androidxcameravideointernalencoderEncoderImpl;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\t8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\u0004R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/datastore/core/DataStoreInMemoryCache;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "Landroidx/datastore/core/State;", "p0", "tryUpdate", "(Landroidx/datastore/core/State;)Landroidx/datastore/core/State;", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "cachedValue", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "getCachedValue$annotations", "getCurrentState", "()Landroidx/datastore/core/State;", "currentState", "LclampVideoBitrateIfNotSupported;", "getFlow", "()LclampVideoBitrateIfNotSupported;", "flow"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataStoreInMemoryCache<T> {
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<State<T>> cachedValue;

    private static /* synthetic */ void getCachedValue$annotations() {
    }

    public DataStoreInMemoryCache() {
        UnInitialized unInitialized = UnInitialized.INSTANCE;
        Intrinsics.checkNotNull(unInitialized, "");
        this.cachedValue = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(unInitialized);
    }

    public final State<T> getCurrentState() {
        return this.cachedValue.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public final clampVideoBitrateIfNotSupported<State<T>> getFlow() {
        return this.cachedValue;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    public final State<T> tryUpdate(State<T> p0) {
        State<T> stateTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        State<T> state;
        Intrinsics.checkNotNullParameter(p0, "");
        lambdastop3androidxcameravideointernalencoderEncoderImpl<State<T>> lambdastop3androidxcameravideointernalencoderencoderimpl = this.cachedValue;
        do {
            stateTuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdastop3androidxcameravideointernalencoderencoderimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            state = stateTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if ((state instanceof ReadException) || Intrinsics.areEqual(state, UnInitialized.INSTANCE)) {
                state = p0;
            } else if (state instanceof Data) {
                if (p0.getVersion() > state.getVersion()) {
                    state = p0;
                }
            } else if (!(state instanceof Final)) {
                throw new NoWhenBranchMatchedException();
            }
        } while (!lambdastop3androidxcameravideointernalencoderencoderimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(stateTuitionPaymentFragmentspecialinlinedviewModeldefault1, state));
        return state;
    }
}
