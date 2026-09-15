package com.bpjstku.data.complaint;

import android.content.Context;
import com.bpjstku.data.complaint.model.response.ComplaintHistoryResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ComplaintDataStore$$ExternalSyntheticLambda2 implements Function1 {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public static int b() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 8294044;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        return i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ComplaintDataStore.getHistoryComplaint$lambda$0((ComplaintHistoryResponse) obj);
    }
}
