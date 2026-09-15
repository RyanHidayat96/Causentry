package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class CameraStateRegistry {
    private static final Map b;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        b = new HashMap();
        new CameraInfoInternal("PlayCoreVersion");
    }

    public static Map TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        Map map;
        synchronized (CameraStateRegistry.class) {
            map = b;
            map.put("java", 20002);
        }
        return map;
    }
}
