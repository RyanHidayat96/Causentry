package com.bpjstku.data.registration.bpu;

import android.content.Context;
import defpackage.readableMs;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class BPURegistrationDataStore$$ExternalSyntheticLambda24 implements readableMs {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ BPURegistrationDataStore$$ExternalSyntheticLambda24(Function1 function1) {
        this.f$0 = function1;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = i % 9269785;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        TuitionPaymentFragmentbindingInflater1 = i3;
        return i3;
    }

    @Override // defpackage.readableMs
    public final Object apply(Object obj) {
        return BPURegistrationDataStore.$r8$lambda$LdjhqwHRcrh2HdtPuDXOzJ3p_wc(this.f$0, obj);
    }
}
