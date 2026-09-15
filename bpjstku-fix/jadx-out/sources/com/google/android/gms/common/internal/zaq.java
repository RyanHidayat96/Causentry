package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes3.dex */
public final class zaq implements PendingResultUtil.ResultConverter {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final /* synthetic */ Response zaa;

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ Object convert(Result result) {
        this.zaa.setResult(result);
        return this.zaa;
    }

    zaq(Response response) {
        this.zaa = response;
    }

    public static int TuitionPaymentFragmentbindingInflater1() {
        int i = TuitionPaymentFragmentbindingInflater1;
        int i2 = i % 9969748;
        TuitionPaymentFragmentbindingInflater1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        return i3;
    }
}
