package defpackage;

import android.content.Context;
import kotlin.Metadata;
import kotlin.io.FilesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"LplayFromSearch;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "LfromMediaDescription;", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;)LfromMediaDescription;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LfromMediaDescription;", "b"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class playFromSearch {
    public static final playFromSearch INSTANCE = new playFromSearch();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private static fromMediaDescription b;

    private playFromSearch() {
    }

    public final fromMediaDescription TuitionPaymentFragmentbindingInflater1(Context p0) {
        fromMediaDescription frommediadescriptionB;
        synchronized (this) {
            frommediadescriptionB = b;
            if (frommediadescriptionB == null) {
                playFromSearch playfromsearch = this;
                frommediadescriptionB = new fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault3(FilesKt.resolve(getRatingType.TuitionPaymentFragmentbindingInflater1(p0), "image_cache")).b();
                b = frommediadescriptionB;
            }
        }
        return frommediadescriptionB;
    }
}
