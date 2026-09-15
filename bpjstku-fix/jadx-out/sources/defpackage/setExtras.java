package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.size.Scale;
import com.google.android.gms.internal.mlkit_vision_face.zzbr;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class setExtras implements setMediaId {
    private final getStarRating TuitionPaymentFragmentbindingInflater1;
    private final Drawable b;

    public setExtras(Drawable drawable, getStarRating getstarrating) {
        this.b = drawable;
        this.TuitionPaymentFragmentbindingInflater1 = getstarrating;
    }

    @Override // defpackage.setMediaId
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Continuation<? super setMediaUri> continuation) {
        BitmapDrawable bitmapDrawable;
        boolean zB = getRatingType.b(this.b);
        if (zB) {
            getRepeatMode getrepeatmode = getRepeatMode.INSTANCE;
            Drawable drawable = this.b;
            Bitmap.Config configTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            onQueueTitleChanged onqueuetitlechangedCancel = this.TuitionPaymentFragmentbindingInflater1.cancel();
            Scale scaleCancelAll = this.TuitionPaymentFragmentbindingInflater1.cancelAll();
            Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            bitmapDrawable = new BitmapDrawable(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getResources(), getRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(drawable, configTuitionPaymentFragmentspecialinlinedviewModeldefault3, onqueuetitlechangedCancel, scaleCancelAll, ((Boolean) getStarRating.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1007128350, zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1007128351, objArr, zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3())).booleanValue()));
        } else {
            bitmapDrawable = this.b;
        }
        return new setTitle(bitmapDrawable, zB, DataSource.MEMORY);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1<Drawable> {
        @Override // setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final /* synthetic */ setMediaId TuitionPaymentFragmentspecialinlinedviewModeldefault2(Drawable drawable, getStarRating getstarrating) {
            return new setExtras(drawable, getstarrating);
        }
    }
}
