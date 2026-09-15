package androidx.room;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.EncoderImplExternalSyntheticLambda14;
import defpackage.addSignalEosTimeoutIfNeeded;
import defpackage.lambdastop3androidxcameravideointernalencoderEncoderImpl;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\r\u001a\u00020\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/room/ObservedTableVersions;", "", "", "p0", "<init>", "(I)V", "", "", "increment", "(Ljava/util/Set;)V", "LaddSignalEosTimeoutIfNeeded;", "", "", "collect", "(LaddSignalEosTimeoutIfNeeded;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "versions", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ObservedTableVersions {
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<int[]> versions;

    /* JADX INFO: renamed from: androidx.room.ObservedTableVersions$collect$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.ObservedTableVersions", f = "InvalidationTracker.kt", i = {}, l = {TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE}, m = "collect", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ObservedTableVersions.this.collect(null, this);
        }
    }

    public ObservedTableVersions(int i) {
        this.versions = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[i]);
    }

    public final void increment(Set<Integer> p0) {
        int[] iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int[] iArr;
        int i;
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0.isEmpty()) {
            return;
        }
        lambdastop3androidxcameravideointernalencoderEncoderImpl<int[]> lambdastop3androidxcameravideointernalencoderencoderimpl = this.versions;
        do {
            iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdastop3androidxcameravideointernalencoderencoderimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int[] iArr2 = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                if (p0.contains(Integer.valueOf(i2))) {
                    i = iArr2[i2] + 1;
                } else {
                    i = iArr2[i2];
                }
                iArr[i2] = i;
            }
        } while (!lambdastop3androidxcameravideointernalencoderencoderimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, iArr));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object collect(addSignalEosTimeoutIfNeeded<? super int[]> addsignaleostimeoutifneeded, Continuation<?> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            lambdastop3androidxcameravideointernalencoderEncoderImpl<int[]> lambdastop3androidxcameravideointernalencoderencoderimpl = this.versions;
            anonymousClass1.label = 1;
            if (lambdastop3androidxcameravideointernalencoderencoderimpl.collect(addsignaleostimeoutifneeded, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
