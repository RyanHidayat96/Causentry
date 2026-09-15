package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class getUseCaseEdge {
    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(File file) {
        File[] fileArrListFiles;
        try {
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(file2);
                }
            }
            if (file.getName().contains("MixpanelAPI.Images.") || file.getName().contains("MP_IMG_")) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }
}
