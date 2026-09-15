package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getAvailableCamerasLimiter implements CameraXConfig {
    private volatile Map<String, String> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Map<String, List<getCameraExecutor>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    getAvailableCamerasLimiter(Map<String, List<getCameraExecutor>> map) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Collections.unmodifiableMap(map);
    }

    @Override // defpackage.CameraXConfig
    public final Map<String, String> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            synchronized (this) {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                    HashMap map = new HashMap();
                    for (Map.Entry<String, List<getCameraExecutor>> entry : this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.entrySet()) {
                        List<getCameraExecutor> value = entry.getValue();
                        StringBuilder sb = new StringBuilder();
                        int size = value.size();
                        for (int i = 0; i < size; i++) {
                            String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = value.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            if (!TextUtils.isEmpty(strTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                                sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                if (i != value.size() - 1) {
                                    sb.append(',');
                                }
                            }
                        }
                        String string = sb.toString();
                        if (!TextUtils.isEmpty(string)) {
                            map.put(entry.getKey(), string);
                        }
                    }
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Collections.unmodifiableMap(map);
                }
            }
        }
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LazyHeaders{headers=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof getAvailableCamerasLimiter) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(((getAvailableCamerasLimiter) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return false;
    }

    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
    }

    static final class TuitionPaymentFragmentbindingInflater1 implements getCameraExecutor {
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentbindingInflater1(String str) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        }

        @Override // defpackage.getCameraExecutor
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StringHeaderFactory{value='");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            sb.append("'}");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof TuitionPaymentFragmentbindingInflater1) {
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(((TuitionPaymentFragmentbindingInflater1) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            return false;
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private static final Map<String, List<getCameraExecutor>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        boolean TuitionPaymentFragmentbindingInflater1 = true;
        Map<String, List<getCameraExecutor>> b = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i = 0; i < length; i++) {
                    char cCharAt = property.charAt(i);
                    if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                        sb.append(cCharAt);
                    } else {
                        sb.append('?');
                    }
                }
                property = sb.toString();
            }
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                map.put("User-Agent", Collections.singletonList(new TuitionPaymentFragmentbindingInflater1(property)));
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Collections.unmodifiableMap(map);
        }
    }
}
