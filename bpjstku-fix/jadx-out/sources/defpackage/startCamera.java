package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.MissingFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final class startCamera {
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(createimageanalysis.TuitionPaymentFragmentbindingInflater1(i4));
            }
            i3 >>>= 1;
        }
        throw new MissingFieldException(arrayList, createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }
}
