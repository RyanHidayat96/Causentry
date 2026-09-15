package kotlinx.coroutines.sync;

import defpackage.SystemTimeProvider;
import defpackage.VideoEncoderInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final /* synthetic */ class MutexImpl$onLock$1 extends FunctionReferenceImpl implements Function3<VideoEncoderInfo, SystemTimeProvider<?>, Object, Unit> {
    public static final MutexImpl$onLock$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new MutexImpl$onLock$1();

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(VideoEncoderInfo videoEncoderInfo, SystemTimeProvider<?> systemTimeProvider, Object obj) {
        videoEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(systemTimeProvider, obj);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ Unit invoke(VideoEncoderInfo videoEncoderInfo, SystemTimeProvider<?> systemTimeProvider, Object obj) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(videoEncoderInfo, systemTimeProvider, obj);
        return Unit.INSTANCE;
    }

    MutexImpl$onLock$1() {
        super(3, VideoEncoderInfo.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }
}
