package defpackage;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.Random;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001\u0013B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\u00020\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u00152\b\u0010\b\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ9\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001f2\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u001f2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010 J\u0018\u0010\u0013\u001a\u00020\u00152\u0006\u0010\b\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\u0013\u0010\u0017J\u000f\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b\"\u0010#J%\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010$0\u001f2\u0006\u0010\b\u001a\u00020!H\u0001¢\u0006\u0004\b\u0018\u0010%J/\u0010\u0013\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020!2\u0006\u0010\t\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020!2\u0006\u0010&\u001a\u00020!H\u0002¢\u0006\u0004\b\u0013\u0010'J\u000f\u0010(\u001a\u00020\u0015H\u0002¢\u0006\u0004\b(\u0010\u001bJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010)J\u0017\u0010\u001d\u001a\u00020!2\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001d\u0010*J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\b\u001a\u00020!H\u0002¢\u0006\u0004\b\u0019\u0010+J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0018\u0010,J3\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010$0\u001f2\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010$0\u001fH\u0002¢\u0006\u0004\b\u0013\u0010-J\u000f\u0010.\u001a\u00020\u0003H\u0015¢\u0006\u0004\b.\u0010/J\u001f\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001f2\u0006\u0010\b\u001a\u00020\u0007H\u0015¢\u0006\u0004\b(\u00100J\u000f\u0010\u001d\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ-\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u0000022\u0006\u0010\b\u001a\u0002012\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u001d\u00103R\u0014\u0010\u001d\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u00105R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u00106R \u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u00107R\u0016\u0010\u0013\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u00109R\u0016\u0010:\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u00105R\u0016\u0010;\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u00105R\u0014\u00108\u001a\u00020!8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010#R\u0014\u00104\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010\u001a\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010>R\u0014\u0010@\u001a\u00020!8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010#R\u0014\u0010B\u001a\u00020!8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010#R\u0014\u0010A\u001a\u00028\u00008EX\u0084\u0004¢\u0006\u0006\u001a\u0004\b;\u0010C"}, d2 = {"LlambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl;", ExifInterface.GPS_DIRECTION_TRUE, "LEncoderImplExternalSyntheticLambda13;", "LmatchAcquisitionsAndFreeBufferIndexes;", "LlambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl;", "LEncoderFactory;", "LEncoderImplExternalSyntheticLambda9;", "", "p0", "p1", "Lkotlinx/coroutines/channels/BufferOverflow;", "p2", "<init>", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "LaddSignalEosTimeoutIfNeeded;", "", "collect", "(LaddSignalEosTimeoutIfNeeded;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/Object;)Z", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "INotificationSideChannel", "()V", "", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/Object;)V", "", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "", "g", "()J", "Lkotlin/coroutines/Continuation;", "(J)[Lkotlin/coroutines/Continuation;", "p3", "(JJJJ)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(LmatchAcquisitionsAndFreeBufferIndexes;)Ljava/lang/Object;", "(LmatchAcquisitionsAndFreeBufferIndexes;)J", "(J)Ljava/lang/Object;", "(LmatchAcquisitionsAndFreeBufferIndexes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "getInterfaceDescriptor", "()LmatchAcquisitionsAndFreeBufferIndexes;", "(I)[LmatchAcquisitionsAndFreeBufferIndexes;", "Lkotlin/coroutines/CoroutineContext;", "LclampVideoBitrateIfNotSupported;", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)LclampVideoBitrateIfNotSupported;", "asBinder", "I", "Lkotlinx/coroutines/channels/BufferOverflow;", "[Ljava/lang/Object;", "d", "J", "a", "asInterface", "onTransact", "RemoteActionCompatParcelizer", "()I", "INotificationSideChannelStub", "cancel", "cancelAll", "notify", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl<T> extends EncoderImplExternalSyntheticLambda13<matchAcquisitionsAndFreeBufferIndexes> implements lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl<T>, EncoderFactory<T>, EncoderImplExternalSyntheticLambda9<T> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private int a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final BufferOverflow b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private long g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int asInterface;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda13
    public final /* synthetic */ EncoderImplExternalSyntheticLambda15[] TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(2);
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda13
    public final /* synthetic */ EncoderImplExternalSyntheticLambda15 b() {
        return getInterfaceDescriptor();
    }

    public lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl(int i, int i2, BufferOverflow bufferOverflow) {
        this.TuitionPaymentFragmentbindingInflater1 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
        this.b = bufferOverflow;
    }

    private final long onTransact() {
        return Math.min(this.g, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    private final int RemoteActionCompatParcelizer() {
        return (int) ((onTransact() + ((long) this.a)) - this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    private final int INotificationSideChannelStub() {
        return this.a + this.asInterface;
    }

    private final long cancel() {
        return onTransact() + ((long) this.a);
    }

    private final long cancelAll() {
        return onTransact() + ((long) this.a) + ((long) this.asInterface);
    }

    protected final T asInterface() {
        Object[] objArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Intrinsics.checkNotNull(objArr);
        return (T) setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr, (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + ((long) RemoteActionCompatParcelizer())) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b5 A[Catch: all -> 0x0049, TryCatch #2 {all -> 0x0049, blocks: (B:17:0x0045, B:34:0x009a, B:36:0x00a2, B:40:0x00b5, B:41:0x00b8), top: B:53:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c8 A[EDGE_INSN: B:60:0x00c8->B:43:0x00c8 BREAK  A[LOOP:0: B:34:0x009a->B:61:0x009a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (((defpackage.EncoderImplExternalSyntheticLambda10) r9).b(r0) != r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <T> java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(defpackage.lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl<T> r8, defpackage.addSignalEosTimeoutIfNeeded<? super T> r9, kotlin.coroutines.Continuation<?> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl, addSignalEosTimeoutIfNeeded, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(T p0) {
        int i;
        boolean z;
        Continuation<Unit>[] continuationArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = EncoderImplExternalSyntheticLambda16.b;
        synchronized (this) {
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0)) {
                continuationArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(continuationArrTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation<Unit> continuation : continuationArrTuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m8024constructorimpl(Unit.INSTANCE));
            }
        }
        return z;
    }

    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(T p0) {
        if (a() == 0) {
            return b(p0);
        }
        if (this.a >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && this.g <= this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.b.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        TuitionPaymentFragmentbindingInflater1(p0);
        int i2 = this.a + 1;
        this.a = i2;
        if (i2 > this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            INotificationSideChannel();
        }
        if (RemoteActionCompatParcelizer() > this.TuitionPaymentFragmentbindingInflater1) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1, this.g, cancel(), cancelAll());
        }
        return true;
    }

    private final boolean b(T p0) {
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (this.TuitionPaymentFragmentbindingInflater1 == 0) {
            return true;
        }
        TuitionPaymentFragmentbindingInflater1(p0);
        int i = this.a + 1;
        this.a = i;
        if (i > this.TuitionPaymentFragmentbindingInflater1) {
            INotificationSideChannel();
        }
        this.g = onTransact() + ((long) this.a);
        return true;
    }

    private final void INotificationSideChannel() {
        EncoderImplExternalSyntheticLambda15[] encoderImplExternalSyntheticLambda15Arr;
        Object[] objArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Intrinsics.checkNotNull(objArr);
        setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, onTransact(), null);
        this.a--;
        long jOnTransact = onTransact() + 1;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < jOnTransact) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = jOnTransact;
        }
        if (this.g < jOnTransact) {
            lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl<T> lambdastopmediacodec12androidxcameravideointernalencoderencoderimpl = this;
            if (((EncoderImplExternalSyntheticLambda13) lambdastopmediacodec12androidxcameravideointernalencoderencoderimpl).TuitionPaymentFragmentbindingInflater1 != 0 && (encoderImplExternalSyntheticLambda15Arr = ((EncoderImplExternalSyntheticLambda13) lambdastopmediacodec12androidxcameravideointernalencoderencoderimpl).TuitionPaymentFragmentspecialinlinedviewModeldefault3) != null) {
                for (EncoderImplExternalSyntheticLambda15 encoderImplExternalSyntheticLambda15 : encoderImplExternalSyntheticLambda15Arr) {
                    if (encoderImplExternalSyntheticLambda15 != null) {
                        matchAcquisitionsAndFreeBufferIndexes matchacquisitionsandfreebufferindexes = (matchAcquisitionsAndFreeBufferIndexes) encoderImplExternalSyntheticLambda15;
                        if (matchacquisitionsandfreebufferindexes.TuitionPaymentFragmentbindingInflater1 >= 0 && matchacquisitionsandfreebufferindexes.TuitionPaymentFragmentbindingInflater1 < jOnTransact) {
                            matchacquisitionsandfreebufferindexes.TuitionPaymentFragmentbindingInflater1 = jOnTransact;
                        }
                    }
                }
            }
            this.g = jOnTransact;
        }
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    private final void TuitionPaymentFragmentbindingInflater1(Object p0) {
        int iINotificationSideChannelStub = INotificationSideChannelStub();
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(null, 0, 2);
        } else if (iINotificationSideChannelStub >= objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length) {
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, iINotificationSideChannelStub, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length * 2);
        }
        setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, onTransact() + ((long) iINotificationSideChannelStub), p0);
    }

    private final Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] p0, int p1, int p2) {
        if (p2 <= 0) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr = new Object[p2];
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = objArr;
        if (p0 != null) {
            long jOnTransact = onTransact();
            for (int i = 0; i < p1; i++) {
                long j = ((long) i) + jOnTransact;
                setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, j, setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, j));
            }
        }
        return objArr;
    }

    public final long g() {
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (j < this.g) {
            this.g = j;
        }
        return j;
    }

    public final Continuation<Unit>[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(long p0) {
        int iMin;
        long j;
        long j2;
        EncoderImplExternalSyntheticLambda15[] encoderImplExternalSyntheticLambda15Arr;
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (p0 > this.g) {
            return EncoderImplExternalSyntheticLambda16.b;
        }
        long jOnTransact = onTransact();
        long j3 = ((long) this.a) + jOnTransact;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0 && this.asInterface > 0) {
            j3++;
        }
        lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl<T> lambdastopmediacodec12androidxcameravideointernalencoderencoderimpl = this;
        int i = 0;
        if (((EncoderImplExternalSyntheticLambda13) lambdastopmediacodec12androidxcameravideointernalencoderencoderimpl).TuitionPaymentFragmentbindingInflater1 != 0 && (encoderImplExternalSyntheticLambda15Arr = ((EncoderImplExternalSyntheticLambda13) lambdastopmediacodec12androidxcameravideointernalencoderencoderimpl).TuitionPaymentFragmentspecialinlinedviewModeldefault3) != null) {
            for (EncoderImplExternalSyntheticLambda15 encoderImplExternalSyntheticLambda15 : encoderImplExternalSyntheticLambda15Arr) {
                if (encoderImplExternalSyntheticLambda15 != null) {
                    matchAcquisitionsAndFreeBufferIndexes matchacquisitionsandfreebufferindexes = (matchAcquisitionsAndFreeBufferIndexes) encoderImplExternalSyntheticLambda15;
                    if (matchacquisitionsandfreebufferindexes.TuitionPaymentFragmentbindingInflater1 >= 0 && matchacquisitionsandfreebufferindexes.TuitionPaymentFragmentbindingInflater1 < j3) {
                        j3 = matchacquisitionsandfreebufferindexes.TuitionPaymentFragmentbindingInflater1;
                    }
                }
            }
        }
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (j3 <= this.g) {
            return EncoderImplExternalSyntheticLambda16.b;
        }
        long jCancel = cancel();
        if (a() > 0) {
            iMin = Math.min(this.asInterface, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - ((int) (jCancel - j3)));
        } else {
            iMin = this.asInterface;
        }
        Continuation<Unit>[] continuationArr = EncoderImplExternalSyntheticLambda16.b;
        long j4 = ((long) this.asInterface) + jCancel;
        if (iMin > 0) {
            continuationArr = new Continuation[iMin];
            Object[] objArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Intrinsics.checkNotNull(objArr);
            long j5 = jCancel;
            while (true) {
                if (jCancel >= j4) {
                    j = j3;
                    break;
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr, jCancel);
                j = j3;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 != setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    Intrinsics.checkNotNull(objTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TuitionPaymentFragmentspecialinlinedviewModeldefault2) objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i2 = i + 1;
                    continuationArr[i] = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, jCancel, setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, j5, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    j2 = 1;
                    j5++;
                    if (i2 >= iMin) {
                        break;
                    }
                    i = i2;
                } else {
                    j2 = 1;
                }
                jCancel += j2;
                j3 = j;
            }
            jCancel = j5;
        } else {
            j = j3;
        }
        long j6 = jCancel;
        Continuation<Unit>[] continuationArr2 = continuationArr;
        int i3 = (int) (j6 - jOnTransact);
        if (a() == 0) {
            j = j6;
        }
        long jMax = Math.max(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, j6 - ((long) Math.min(this.TuitionPaymentFragmentbindingInflater1, i3)));
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0 && jMax < j4) {
            Object[] objArr2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Intrinsics.checkNotNull(objArr2);
            if (Intrinsics.areEqual(setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr2, jMax), setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                j6++;
                jMax++;
            }
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(jMax, j, j6, j4);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return continuationArr2.length == 0 ? continuationArr2 : TuitionPaymentFragmentspecialinlinedviewModeldefault2(continuationArr2);
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(long p0, long p1, long p2, long p3) {
        long jMin = Math.min(p1, p0);
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        for (long jOnTransact = onTransact(); jOnTransact < jMin; jOnTransact++) {
            Object[] objArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Intrinsics.checkNotNull(objArr);
            setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, jOnTransact, null);
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = p0;
        this.g = p1;
        this.a = (int) (p2 - jMin);
        this.asInterface = (int) (p3 - p2);
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != 0 || this.asInterface > 1) {
            Object[] objArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Intrinsics.checkNotNull(objArr);
            while (this.asInterface > 0 && setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr, (onTransact() + ((long) INotificationSideChannelStub())) - 1) == setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                this.asInterface--;
                setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, onTransact() + ((long) INotificationSideChannelStub()), null);
            }
        }
    }

    private final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(matchAcquisitionsAndFreeBufferIndexes p0) {
        Object obj;
        Continuation<Unit>[] continuationArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = EncoderImplExternalSyntheticLambda16.b;
        synchronized (this) {
            long jTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(p0);
            if (jTuitionPaymentFragmentbindingInflater1 < 0) {
                obj = setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            } else {
                long j = p0.TuitionPaymentFragmentbindingInflater1;
                Object objB = b(jTuitionPaymentFragmentbindingInflater1);
                p0.TuitionPaymentFragmentbindingInflater1 = jTuitionPaymentFragmentbindingInflater1 + 1;
                continuationArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(j);
                obj = objB;
            }
        }
        for (Continuation<Unit> continuation : continuationArrTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m8024constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long TuitionPaymentFragmentbindingInflater1(matchAcquisitionsAndFreeBufferIndexes p0) {
        long j = p0.TuitionPaymentFragmentbindingInflater1;
        if (j < cancel() || (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 <= 0 && j <= onTransact() && this.asInterface != 0)) {
            return j;
        }
        return -1L;
    }

    private final Object b(long p0) {
        Object[] objArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Intrinsics.checkNotNull(objArr);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr, p0);
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? ((TuitionPaymentFragmentspecialinlinedviewModeldefault2) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).TuitionPaymentFragmentspecialinlinedviewModeldefault1 : objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation<kotlin.Unit>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    private final Continuation<Unit>[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(Continuation<Unit>[] p0) {
        EncoderImplExternalSyntheticLambda15[] encoderImplExternalSyntheticLambda15Arr;
        matchAcquisitionsAndFreeBufferIndexes matchacquisitionsandfreebufferindexes;
        Continuation<? super Unit> continuation;
        int length = p0.length;
        lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl<T> lambdastopmediacodec12androidxcameravideointernalencoderencoderimpl = this;
        if (((EncoderImplExternalSyntheticLambda13) lambdastopmediacodec12androidxcameravideointernalencoderencoderimpl).TuitionPaymentFragmentbindingInflater1 != 0 && (encoderImplExternalSyntheticLambda15Arr = ((EncoderImplExternalSyntheticLambda13) lambdastopmediacodec12androidxcameravideointernalencoderencoderimpl).TuitionPaymentFragmentspecialinlinedviewModeldefault3) != null) {
            int length2 = encoderImplExternalSyntheticLambda15Arr.length;
            int i = 0;
            while (i < length2) {
                EncoderImplExternalSyntheticLambda15 encoderImplExternalSyntheticLambda15 = encoderImplExternalSyntheticLambda15Arr[i];
                if (encoderImplExternalSyntheticLambda15 == null || (continuation = (matchacquisitionsandfreebufferindexes = (matchAcquisitionsAndFreeBufferIndexes) encoderImplExternalSyntheticLambda15).TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null || TuitionPaymentFragmentbindingInflater1(matchacquisitionsandfreebufferindexes) < 0) {
                    p0 = p0;
                } else {
                    if (length >= p0.length) {
                        p0 = p0;
                        p0 = p0;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) p0, Math.max(2, p0.length * 2));
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
                        p0 = objArrCopyOf;
                    }
                    p0 = p0;
                    p0 = p0;
                    ((Continuation[]) p0)[length] = continuation;
                    matchacquisitionsandfreebufferindexes.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    length++;
                }
                i++;
                p0 = p0;
            }
            p0 = p0;
        }
        return (Continuation[]) p0;
    }

    private static matchAcquisitionsAndFreeBufferIndexes getInterfaceDescriptor() {
        return new matchAcquisitionsAndFreeBufferIndexes();
    }

    private static matchAcquisitionsAndFreeBufferIndexes[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int p0) {
        return new matchAcquisitionsAndFreeBufferIndexes[2];
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda9
    public final clampVideoBitrateIfNotSupported<T> TuitionPaymentFragmentbindingInflater1(CoroutineContext p0, int p1, BufferOverflow p2) {
        return setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, p0, p1, p2);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements setCompatibleAudioProfile {
        public static int TuitionPaymentFragmentbindingInflater1;
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final Continuation<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public long b;
        private lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl<?> g;

        /* JADX WARN: Multi-variable type inference failed */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl<?> lambdastopmediacodec12androidxcameravideointernalencoderencoderimpl, long j, Object obj, Continuation<? super Unit> continuation) {
            this.g = lambdastopmediacodec12androidxcameravideointernalencoderencoderimpl;
            this.b = j;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = obj;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = continuation;
        }

        @Override // defpackage.setCompatibleAudioProfile
        public final void dispose() {
            lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentbindingInflater1(this.g, this);
        }

        public static int b() {
            int i = TuitionPaymentFragmentbindingInflater1;
            int i2 = i % 6271196;
            TuitionPaymentFragmentbindingInflater1 = i + 1;
            if (i2 != 0) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            int iNextInt = new Random().nextInt();
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iNextInt;
            return iNextInt;
        }
    }

    private final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(T t, Continuation<? super Unit> continuation) {
        Continuation<Unit>[] continuationArrTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        Continuation<Unit>[] continuationArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = EncoderImplExternalSyntheticLambda16.b;
        synchronized (this) {
            try {
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(t)) {
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuationImpl2.resumeWith(Result.m8024constructorimpl(Unit.INSTANCE));
                    continuationArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(continuationArrTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                } else {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, ((long) INotificationSideChannelStub()) + onTransact(), t, cancellableContinuationImpl2);
                    TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    this.asInterface++;
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                        continuationArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(continuationArrTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                    continuationArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = continuationArrTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            MediaStoreVideoCannotWrite.b(cancellableContinuationImpl2, tuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        for (Continuation<Unit> continuation2 : continuationArrTuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            if (continuation2 != null) {
                Result.Companion companion2 = Result.INSTANCE;
                continuation2.resumeWith(Result.m8024constructorimpl(Unit.INSTANCE));
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    private final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(matchAcquisitionsAndFreeBufferIndexes matchacquisitionsandfreebufferindexes, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        synchronized (this) {
            if (TuitionPaymentFragmentbindingInflater1(matchacquisitionsandfreebufferindexes) < 0) {
                matchacquisitionsandfreebufferindexes.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cancellableContinuationImpl2;
                matchacquisitionsandfreebufferindexes.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cancellableContinuationImpl2;
            } else {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(Result.m8024constructorimpl(Unit.INSTANCE));
            }
            Unit unit = Unit.INSTANCE;
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    @Override // defpackage.lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl
    public final void TuitionPaymentFragmentbindingInflater1() {
        synchronized (this) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(cancel(), this.g, cancel(), cancelAll());
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl lambdastopmediacodec12androidxcameravideointernalencoderencoderimpl, TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        synchronized (lambdastopmediacodec12androidxcameravideointernalencoderencoderimpl) {
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.b < lambdastopmediacodec12androidxcameravideointernalencoderencoderimpl.onTransact()) {
                return;
            }
            Object[] objArr = lambdastopmediacodec12androidxcameravideointernalencoderencoderimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Intrinsics.checkNotNull(objArr);
            if (setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr, tuitionPaymentFragmentspecialinlinedviewModeldefault2.b) != tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, tuitionPaymentFragmentspecialinlinedviewModeldefault2.b, setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            lambdastopmediacodec12androidxcameravideointernalencoderencoderimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl, defpackage.addSignalEosTimeoutIfNeeded
    public Object emit(T t, Continuation<? super Unit> continuation) {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        return (TuitionPaymentFragmentspecialinlinedviewModeldefault2(t) || (objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(t, continuation)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : objTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.lambdastop2androidxcameravideointernalencoderEncoderImpl, defpackage.clampVideoBitrateIfNotSupported
    public Object collect(addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, Continuation<?> continuation) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, addsignaleostimeoutifneeded, continuation);
    }
}
