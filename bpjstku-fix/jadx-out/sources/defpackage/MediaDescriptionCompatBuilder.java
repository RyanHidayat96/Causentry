package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.decode.DataSource;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompatBuilder implements setMediaId {
    private final getStarRating TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Bitmap b;

    public MediaDescriptionCompatBuilder(Bitmap bitmap, getStarRating getstarrating) {
        this.b = bitmap;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getstarrating;
    }

    @Override // defpackage.setMediaId
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Continuation<? super setMediaUri> continuation) {
        return new setTitle(new BitmapDrawable(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getResources(), this.b), false, DataSource.MEMORY);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1<Bitmap> {
        @Override // setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final /* synthetic */ setMediaId TuitionPaymentFragmentspecialinlinedviewModeldefault2(Bitmap bitmap, getStarRating getstarrating) {
            return new MediaDescriptionCompatBuilder(bitmap, getstarrating);
        }
    }
}
