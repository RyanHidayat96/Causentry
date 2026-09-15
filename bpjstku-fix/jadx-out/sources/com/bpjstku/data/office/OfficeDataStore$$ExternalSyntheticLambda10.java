package com.bpjstku.data.office;

import android.content.Context;
import com.bpjstku.data.office.model.response.BranchOfficeLocationResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OfficeDataStore$$ExternalSyntheticLambda10 implements Function1 {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int b;

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 6361991;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        b = i3;
        return i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return OfficeDataStore.getBranchOffice$lambda$0((BranchOfficeLocationResponse) obj);
    }
}
