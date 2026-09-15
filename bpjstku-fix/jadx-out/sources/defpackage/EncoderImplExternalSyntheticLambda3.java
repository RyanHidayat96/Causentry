package defpackage;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow$collect$2;
import kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\f\u0010\u000eJ-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H%¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0013\u001a\u00020\u00122\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H¤@¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0004\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u000f\u0010\u0017J\u001e\u0010\u0019\u001a\u00020\u00122\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0014\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0014\u0010!\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"LEncoderImplExternalSyntheticLambda3;", ExifInterface.GPS_DIRECTION_TRUE, "LEncoderImplExternalSyntheticLambda9;", "Lkotlin/coroutines/CoroutineContext;", "p0", "", "p1", "Lkotlinx/coroutines/channels/BufferOverflow;", "p2", "<init>", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "LclampVideoBitrateIfNotSupported;", "TuitionPaymentFragmentbindingInflater1", "()LclampVideoBitrateIfNotSupported;", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)LclampVideoBitrateIfNotSupported;", "b", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)LEncoderImplExternalSyntheticLambda3;", "LonEncodePaused;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(LonEncodePaused;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "LEncoderSurfaceInput;", "(Lkotlinx/coroutines/CoroutineScope;)LEncoderSurfaceInput;", "LaddSignalEosTimeoutIfNeeded;", "collect", "(LaddSignalEosTimeoutIfNeeded;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Ljava/lang/String;", "toString", "Lkotlin/coroutines/CoroutineContext;", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlinx/coroutines/channels/BufferOverflow;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EncoderImplExternalSyntheticLambda3<T> implements EncoderImplExternalSyntheticLambda9<T> {
    public final BufferOverflow TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final CoroutineContext b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int TuitionPaymentFragmentbindingInflater1;

    public clampVideoBitrateIfNotSupported<T> TuitionPaymentFragmentbindingInflater1() {
        return null;
    }

    public abstract Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(onEncodePaused<? super T> onencodepaused, Continuation<? super Unit> continuation);

    protected String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return null;
    }

    protected abstract EncoderImplExternalSyntheticLambda3<T> b(CoroutineContext p0, int p1, BufferOverflow p2);

    public EncoderImplExternalSyntheticLambda3(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        this.b = coroutineContext;
        this.TuitionPaymentFragmentbindingInflater1 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bufferOverflow;
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a A[PHI: r4
  0x002a: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v6 int) binds: [B:6:0x0012, B:10:0x0018, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.EncoderImplExternalSyntheticLambda9
    public final clampVideoBitrateIfNotSupported<T> TuitionPaymentFragmentbindingInflater1(CoroutineContext p0, int p1, BufferOverflow p2) {
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        CoroutineContext coroutineContextPlus = p0.plus(this.b);
        if (p2 == BufferOverflow.SUSPEND) {
            int i = this.TuitionPaymentFragmentbindingInflater1;
            if (i != -3) {
                if (p1 == -3) {
                    p1 = i;
                } else if (i != -2) {
                    if (p1 == -2) {
                        p1 = i;
                    } else {
                        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        i = this.TuitionPaymentFragmentbindingInflater1 + p1;
                        if (i < 0) {
                            p1 = Integer.MAX_VALUE;
                        } else {
                            p1 = i;
                        }
                    }
                }
            }
            p2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        if (Intrinsics.areEqual(coroutineContextPlus, this.b) && p1 == this.TuitionPaymentFragmentbindingInflater1 && p2 == this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return this;
        }
        return b(coroutineContextPlus, p1, p2);
    }

    public EncoderSurfaceInput<T> b(CoroutineScope p0) {
        CoroutineContext coroutineContext = this.b;
        int i = this.TuitionPaymentFragmentbindingInflater1;
        if (i == -3) {
            i = -2;
        }
        return setEncoderCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, coroutineContext, i, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, CoroutineStart.ATOMIC, null, new ChannelFlow$collectToFun$1(this, null));
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (strTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            arrayList.add(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        if (this.b != EmptyCoroutineContext.INSTANCE) {
            StringBuilder sb = new StringBuilder("context=");
            sb.append(this.b);
            arrayList.add(sb.toString());
        }
        if (this.TuitionPaymentFragmentbindingInflater1 != -3) {
            StringBuilder sb2 = new StringBuilder("capacity=");
            sb2.append(this.TuitionPaymentFragmentbindingInflater1);
            arrayList.add(sb2.toString());
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != BufferOverflow.SUSPEND) {
            StringBuilder sb3 = new StringBuilder("onBufferOverflow=");
            sb3.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            arrayList.add(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(resolveAudioMimeInfo.TuitionPaymentFragmentbindingInflater1(this));
        sb4.append('[');
        sb4.append(CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null));
        sb4.append(']');
        return sb4.toString();
    }

    @Override // defpackage.clampVideoBitrateIfNotSupported
    public Object collect(addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, Continuation<? super Unit> continuation) {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CoroutineScopeKt.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ChannelFlow$collect$2(addsignaleostimeoutifneeded, this, null), continuation);
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault1 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTuitionPaymentFragmentspecialinlinedviewModeldefault1 : Unit.INSTANCE;
    }
}
