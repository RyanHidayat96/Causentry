package defpackage;

import com.midtrans.sdk.corekit.core.BaseSdkBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class intersectDynamicRangeEncoding extends BaseSdkBuilder<intersectDynamicRangeEncoding> {
    public static intersectDynamicRangeEncoding TuitionPaymentFragmentbindingInflater1() {
        return new intersectDynamicRangeEncoding();
    }

    private intersectDynamicRangeEncoding() {
        this.flow = BaseSdkBuilder.UI_FLOW;
        this.sdkFlow = new connect();
    }

    @Override // com.midtrans.sdk.corekit.core.BaseSdkBuilder
    public final /* synthetic */ intersectDynamicRangeEncoding enableLog(boolean z) {
        this.enableLog = z;
        return this;
    }
}
