package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface CameraXConfig {
    public static final CameraXConfig b;

    Map<String, String> TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    static {
        new CameraXConfig() { // from class: CameraXConfig.2
            @Override // defpackage.CameraXConfig
            public final Map<String, String> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
                return Collections.emptyMap();
            }
        };
        getAvailableCamerasLimiter.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new getAvailableCamerasLimiter.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1 = true;
        b = new getAvailableCamerasLimiter(tuitionPaymentFragmentspecialinlinedviewModeldefault1.b);
    }
}
