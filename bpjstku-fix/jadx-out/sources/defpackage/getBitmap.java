package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class getBitmap implements fromMediaMetadata<File> {
    private final boolean TuitionPaymentFragmentbindingInflater1;

    public getBitmap(boolean z) {
        this.TuitionPaymentFragmentbindingInflater1 = z;
    }

    @Override // defpackage.fromMediaMetadata
    public final /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3(File file, getStarRating getstarrating) {
        File file2 = file;
        if (this.TuitionPaymentFragmentbindingInflater1) {
            StringBuilder sb = new StringBuilder();
            sb.append(file2.getPath());
            sb.append(':');
            sb.append(file2.lastModified());
            return sb.toString();
        }
        return file2.getPath();
    }
}
