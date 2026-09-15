package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.conf.DataCollectionLevel;

/* JADX INFO: loaded from: classes3.dex */
public final class getCurrentConfig {
    getCurrentConfig() {
    }

    public static String b(mergeConfigs mergeconfigs) {
        StringBuilder sb = new StringBuilder("v_4_ol_");
        if (!mergeconfigs.f1275a.configurationApplied) {
            sb.append(ExifInterface.GPS_MEASUREMENT_2D);
        } else if (!mergeconfigs.f1275a.active) {
            sb.append("1");
        } else {
            sb.append("0_mul_");
            sb.append(mergeconfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        sb.append("_prv_");
        int i = AnonymousClass3.TuitionPaymentFragmentbindingInflater1[mergeconfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.ordinal()];
        if (i == 1) {
            sb.append(ExifInterface.GPS_MEASUREMENT_3D);
        } else if (i == 2) {
            sb.append("4");
        } else {
            sb.append(ExifInterface.GPS_MEASUREMENT_2D);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: getCurrentConfig$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] TuitionPaymentFragmentbindingInflater1;

        static {
            int[] iArr = new int[DataCollectionLevel.values().length];
            TuitionPaymentFragmentbindingInflater1 = iArr;
            try {
                iArr[DataCollectionLevel.PERFORMANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[DataCollectionLevel.USER_BEHAVIOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[DataCollectionLevel.OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
