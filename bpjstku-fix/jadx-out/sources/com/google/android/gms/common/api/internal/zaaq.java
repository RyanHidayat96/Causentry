package com.google.android.gms.common.api.internal;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public final class zaaq extends zabg {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final /* synthetic */ zaaw zaa;
    final /* synthetic */ com.google.android.gms.signin.internal.zak zab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zaaq(zaar zaarVar, zabf zabfVar, zaaw zaawVar, com.google.android.gms.signin.internal.zak zakVar) {
        super(zabfVar);
        this.zaa = zaawVar;
        this.zab = zakVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabg
    public final void zaa() {
        zaaw.zar(this.zaa, this.zab);
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 8852751;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int iMyUid = Process.myUid();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iMyUid;
        return iMyUid;
    }
}
