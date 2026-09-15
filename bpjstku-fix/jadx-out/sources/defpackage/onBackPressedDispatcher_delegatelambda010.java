package defpackage;

import android.content.Context;
import com.bpjstku.data.ict.IctRepository;
import com.bpjstku.data.ict.model.request.IctTokenRequest;
import com.bpjstku.data.ict.model.response.IctTokenResponse;
import com.bpjstku.domain.ict.model.IctTokenModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class onBackPressedDispatcher_delegatelambda010 implements addContentView {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final IctRepository TuitionPaymentFragmentbindingInflater1;

    public onBackPressedDispatcher_delegatelambda010(IctRepository ictRepository) {
        Intrinsics.checkNotNullParameter(ictRepository, "");
        this.TuitionPaymentFragmentbindingInflater1 = ictRepository;
    }

    @Override // defpackage.addContentView
    public final deriveCodec<IctTokenModel> b(IctTokenRequest ictTokenRequest) {
        Intrinsics.checkNotNullParameter(ictTokenRequest, "");
        deriveCodec<IctTokenResponse> derivecodecGenerateTokenIct = this.TuitionPaymentFragmentbindingInflater1.generateTokenIct(ictTokenRequest);
        final Function1 function1 = new Function1() { // from class: addMenuProvider
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onBackPressedDispatcher_delegatelambda010.TuitionPaymentFragmentspecialinlinedviewModeldefault3((IctTokenResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: addOnConfigurationChangedListener
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return onBackPressedDispatcher_delegatelambda010.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecGenerateTokenIct, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ IctTokenModel TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (IctTokenModel) function1.invoke(obj);
    }

    public static /* synthetic */ IctTokenModel TuitionPaymentFragmentspecialinlinedviewModeldefault3(IctTokenResponse ictTokenResponse) {
        Intrinsics.checkNotNullParameter(ictTokenResponse, "");
        Intrinsics.checkNotNullParameter(ictTokenResponse, "");
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        return new IctTokenModel(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(ictTokenResponse.getApiToken()), true));
    }

    public static int TuitionPaymentFragmentbindingInflater1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 9574993;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        return i3;
    }
}
