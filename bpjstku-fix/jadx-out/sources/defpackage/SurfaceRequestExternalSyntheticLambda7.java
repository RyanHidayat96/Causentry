package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class SurfaceRequestExternalSyntheticLambda7 {
    public final String TuitionPaymentFragmentbindingInflater1;
    public final Map<String, List<String>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public SurfaceRequestExternalSyntheticLambda7(int i, String str, String str2, Map<String, List<String>> map) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SurfaceRequestExternalSyntheticLambda7 surfaceRequestExternalSyntheticLambda7 = (SurfaceRequestExternalSyntheticLambda7) obj;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != surfaceRequestExternalSyntheticLambda7.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return false;
            }
            String str = this.TuitionPaymentFragmentbindingInflater1;
            if (str == null ? surfaceRequestExternalSyntheticLambda7.TuitionPaymentFragmentbindingInflater1 != null : !str.equals(surfaceRequestExternalSyntheticLambda7.TuitionPaymentFragmentbindingInflater1)) {
                return false;
            }
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str3 = surfaceRequestExternalSyntheticLambda7.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }
}
