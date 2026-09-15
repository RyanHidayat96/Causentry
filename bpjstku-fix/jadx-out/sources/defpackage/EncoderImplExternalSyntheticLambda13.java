package defpackage;

import defpackage.EncoderImplExternalSyntheticLambda15;
import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class EncoderImplExternalSyntheticLambda13<S extends EncoderImplExternalSyntheticLambda15<?>> {
    private int TuitionPaymentFragmentbindingInflater1;
    private lambdaaddObserver7androidxcameravideointernalencoderEncoderImplByteBufferInput TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private S[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private int b;

    protected abstract S[] TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    protected abstract S b();

    protected final S[] asBinder() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    protected final int a() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    public final stopMediaCodec<Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        lambdaaddObserver7androidxcameravideointernalencoderEncoderImplByteBufferInput lambdaaddobserver7androidxcameravideointernalencoderencoderimplbytebufferinput;
        synchronized (this) {
            lambdaaddobserver7androidxcameravideointernalencoderencoderimplbytebufferinput = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (lambdaaddobserver7androidxcameravideointernalencoderencoderimplbytebufferinput == null) {
                lambdaaddobserver7androidxcameravideointernalencoderencoderimplbytebufferinput = new lambdaaddObserver7androidxcameravideointernalencoderEncoderImplByteBufferInput(this.TuitionPaymentFragmentbindingInflater1);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdaaddobserver7androidxcameravideointernalencoderencoderimplbytebufferinput;
            }
        }
        return lambdaaddobserver7androidxcameravideointernalencoderencoderimplbytebufferinput;
    }

    public final S d() {
        S s;
        lambdaaddObserver7androidxcameravideointernalencoderEncoderImplByteBufferInput lambdaaddobserver7androidxcameravideointernalencoderencoderimplbytebufferinput;
        synchronized (this) {
            S[] sArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (sArr == null) {
                sArr = (S[]) TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = sArr;
            } else if (this.TuitionPaymentFragmentbindingInflater1 >= sArr.length) {
                Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (S[]) ((EncoderImplExternalSyntheticLambda15[]) objArrCopyOf);
                sArr = (S[]) ((EncoderImplExternalSyntheticLambda15[]) objArrCopyOf);
            }
            int i = this.b;
            do {
                s = sArr[i];
                if (s == null) {
                    s = (S) b();
                    sArr[i] = s;
                }
                i++;
                if (i >= sArr.length) {
                    i = 0;
                }
                Intrinsics.checkNotNull(s, "");
            } while (!s.b(this));
            this.b = i;
            this.TuitionPaymentFragmentbindingInflater1++;
            lambdaaddobserver7androidxcameravideointernalencoderencoderimplbytebufferinput = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        if (lambdaaddobserver7androidxcameravideointernalencoderencoderimplbytebufferinput != null) {
            lambdaaddobserver7androidxcameravideointernalencoderencoderimplbytebufferinput.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1);
        }
        return s;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(S s) {
        lambdaaddObserver7androidxcameravideointernalencoderEncoderImplByteBufferInput lambdaaddobserver7androidxcameravideointernalencoderencoderimplbytebufferinput;
        int i;
        Continuation<Unit>[] continuationArrTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        synchronized (this) {
            int i2 = this.TuitionPaymentFragmentbindingInflater1 - 1;
            this.TuitionPaymentFragmentbindingInflater1 = i2;
            lambdaaddobserver7androidxcameravideointernalencoderencoderimplbytebufferinput = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (i2 == 0) {
                this.b = 0;
            }
            Intrinsics.checkNotNull(s, "");
            continuationArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = s.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        }
        for (Continuation<Unit> continuation : continuationArrTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m8024constructorimpl(Unit.INSTANCE));
            }
        }
        if (lambdaaddobserver7androidxcameravideointernalencoderencoderimplbytebufferinput != null) {
            lambdaaddobserver7androidxcameravideointernalencoderencoderimplbytebufferinput.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1);
        }
    }
}
