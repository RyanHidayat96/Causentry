package defpackage;

import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.point.PointRepository;
import com.bpjstku.data.point.model.request.PointRequest;
import com.bpjstku.data.point.model.response.PointResponse;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dispatchOnBackProgressed implements dispatchOnBackStarted {
    private final PointRepository TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final PreferenceManager b;

    public dispatchOnBackProgressed(PointRepository pointRepository, PreferenceManager preferenceManager) {
        Intrinsics.checkNotNullParameter(pointRepository, "");
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = pointRepository;
        this.b = preferenceManager;
    }

    @Override // defpackage.dispatchOnBackStarted
    public final deriveCodec<PointResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(PointRequest pointRequest) throws Throwable {
        Intrinsics.checkNotNullParameter(pointRequest, "");
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(pointRequest.getNomorIdentitas());
        Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
        deriveCodec<PointResponse> pointKey = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getPointKey(new PointRequest(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(pointRequest.getEmail())));
        final Function1 function1 = new Function1() { // from class: OnBackPressedDispatcherExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dispatchOnBackProgressed.TuitionPaymentFragmentbindingInflater1((PointResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: setOnBackInvokedDispatcher
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dispatchOnBackProgressed.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(pointKey, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ PointResponse TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (PointResponse) function1.invoke(obj);
    }

    public static /* synthetic */ PointResponse TuitionPaymentFragmentbindingInflater1(PointResponse pointResponse) {
        Intrinsics.checkNotNullParameter(pointResponse, "");
        return pointResponse;
    }
}
