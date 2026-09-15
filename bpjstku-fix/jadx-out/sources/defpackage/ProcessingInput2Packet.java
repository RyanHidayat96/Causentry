package defpackage;

import com.esafirm.imagepicker.features.ReturnMode;
import com.esafirm.imagepicker.features.common.BaseConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class ProcessingInput2Packet {
    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(BaseConfig baseConfig, boolean z) {
        ReturnMode returnMode = baseConfig.cancelAll;
        if (z) {
            return returnMode == ReturnMode.ALL || returnMode == ReturnMode.CAMERA_ONLY;
        }
        return returnMode == ReturnMode.ALL || returnMode == ReturnMode.GALLERY_ONLY;
    }
}
