package defpackage;

import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.mlt.MltRepository;
import com.bpjstku.data.mlt.model.request.MltRequest;
import com.bpjstku.data.mlt.model.response.MltData;
import com.bpjstku.domain.mlt.model.MltItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class setOnDrawScheduled implements onLaunchlambda1 {
    private final MltRepository TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final PreferenceManager b;

    public setOnDrawScheduled(MltRepository mltRepository, PreferenceManager preferenceManager) {
        Intrinsics.checkNotNullParameter(mltRepository, "");
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mltRepository;
        this.b = preferenceManager;
    }

    @Override // defpackage.onLaunchlambda1
    public final deriveCodec<MltItem> TuitionPaymentFragmentbindingInflater1(MltRequest mltRequest) {
        Intrinsics.checkNotNullParameter(mltRequest, "");
        deriveCodec<MltData> mlt = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getMlt(mltRequest);
        final Function1 function1 = new Function1() { // from class: ComponentActivityactivityResultRegistry1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setOnDrawScheduled.b((MltData) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: onLaunch
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return setOnDrawScheduled.b(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(mlt, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ MltItem b(MltData mltData) {
        Intrinsics.checkNotNullParameter(mltData, "");
        Intrinsics.checkNotNullParameter(mltData, "");
        String rspdesc = mltData.getRspdesc();
        if (rspdesc == null) {
            rspdesc = "";
        }
        String url = mltData.getUrl();
        if (url == null) {
            url = "";
        }
        String rsp = mltData.getRsp();
        return new MltItem(rspdesc, url, rsp != null ? rsp : "");
    }

    public static /* synthetic */ MltItem b(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (MltItem) function1.invoke(obj);
    }
}
