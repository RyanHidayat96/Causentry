package defpackage;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0004¢\u0006\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"LsetInputTimebase;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "p0", "p1", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/CoroutineDispatcher;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()LsetInputTimebase;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class setInputTimebase extends CoroutineDispatcher {
    public abstract setInputTimebase TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String strTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
        if (strTuitionPaymentFragmentbindingInflater1 != null) {
            return strTuitionPaymentFragmentbindingInflater1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(resolveAudioMimeInfo.TuitionPaymentFragmentbindingInflater1(this));
        sb.append('@');
        sb.append(resolveAudioMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this));
        return sb.toString();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int p0, String p1) {
        if (p0 > 0) {
            setInputTimebase setinputtimebase = this;
            return p1 != null ? new lambdaonOutputBufferAvailable1androidxcameravideointernalencoderEncoderImplMediaCodecCallback(setinputtimebase, p1) : setinputtimebase;
        }
        throw new IllegalArgumentException("Expected positive parallelism level, but got ".concat(String.valueOf(p0)).toString());
    }

    protected final String TuitionPaymentFragmentbindingInflater1() {
        setInputTimebase setinputtimebaseTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        setInputTimebase setinputtimebaseTuitionPaymentFragmentbindingInflater1 = Dispatchers.TuitionPaymentFragmentbindingInflater1();
        if (this == setinputtimebaseTuitionPaymentFragmentbindingInflater1) {
            return "Dispatchers.Main";
        }
        try {
            setinputtimebaseTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setinputtimebaseTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        } catch (UnsupportedOperationException unused) {
            setinputtimebaseTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        }
        if (this == setinputtimebaseTuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
