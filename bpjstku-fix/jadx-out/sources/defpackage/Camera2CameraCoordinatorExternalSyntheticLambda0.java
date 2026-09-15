package defpackage;

import android.os.Environment;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class Camera2CameraCoordinatorExternalSyntheticLambda0 {
    public static final File TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        String path = Environment.getExternalStorageDirectory().getPath();
        StringBuilder sb = new StringBuilder();
        sb.append(path);
        sb.append("/BpjstkuTemp");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append("/images/temporary");
        return new File(sb2.toString());
    }
}
