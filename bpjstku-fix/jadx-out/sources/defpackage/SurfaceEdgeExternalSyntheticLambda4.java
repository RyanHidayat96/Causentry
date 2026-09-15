package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class SurfaceEdgeExternalSyntheticLambda4 {
    public static boolean TuitionPaymentFragmentbindingInflater1(File file) {
        File[] fileArrListFiles;
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (int i = 0; i < fileArrListFiles.length; i++) {
                if (fileArrListFiles[i].isDirectory()) {
                    TuitionPaymentFragmentbindingInflater1(fileArrListFiles[i]);
                } else {
                    fileArrListFiles[i].delete();
                }
            }
        }
        return file.delete();
    }
}
