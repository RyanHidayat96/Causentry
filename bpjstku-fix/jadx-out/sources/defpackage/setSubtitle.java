package defpackage;

import android.webkit.MimeTypeMap;
import coil.decode.DataSource;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.io.FilesKt;

/* JADX INFO: loaded from: classes.dex */
public final class setSubtitle implements setMediaId {
    private final File TuitionPaymentFragmentbindingInflater1;

    public setSubtitle(File file) {
        this.TuitionPaymentFragmentbindingInflater1 = file;
    }

    @Override // defpackage.setMediaId
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Continuation<? super setMediaUri> continuation) {
        return new MediaDescriptionCompatApi21Builder(MediaBrowserCompatApi26SubscriptionCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SurfaceViewImplementationExternalSyntheticLambda1.Companion.b(SurfaceViewImplementationExternalSyntheticLambda1.INSTANCE, this.TuitionPaymentFragmentbindingInflater1), animateToFullOpacity.TuitionPaymentFragmentbindingInflater1, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(FilesKt.getExtension(this.TuitionPaymentFragmentbindingInflater1)), DataSource.DISK);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1<File> {
        @Override // setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final /* synthetic */ setMediaId TuitionPaymentFragmentspecialinlinedviewModeldefault2(File file, getStarRating getstarrating) {
            return new setSubtitle(file);
        }
    }
}
