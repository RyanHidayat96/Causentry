package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class CameraRepository {
    public static final Map TuitionPaymentFragmentbindingInflater1;
    public static final Map TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    static {
        HashMap map = new HashMap();
        TuitionPaymentFragmentbindingInflater1 = map;
        HashMap map2 = new HashMap();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = map2;
        map.put(-1, "The Play Store app is either not installed or not the official version.");
        map.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(-2, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }
}
