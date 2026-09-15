package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* JADX INFO: loaded from: classes4.dex */
public final class FallbackStrategy extends findNearestHigherSupportedEncoderProfilesFor<ImageView> {
    private getSupportedQualities INotificationSideChannel;

    public FallbackStrategy(Picasso picasso, ImageView imageView, FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder, int i, int i2, int i3, Drawable drawable, String str, Object obj, getSupportedQualities getsupportedqualities, boolean z) {
        super(picasso, imageView, fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder, i, i2, i3, drawable, str, obj, z);
        this.INotificationSideChannel = getsupportedqualities;
    }

    @Override // defpackage.findNearestHigherSupportedEncoderProfilesFor
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        ImageView imageView = (ImageView) this.onTransact.get();
        if (imageView != null) {
            FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(imageView, this.f902a.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bitmap, loadedFrom, this.asBinder, this.f902a.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            getSupportedQualities getsupportedqualities = this.INotificationSideChannel;
            if (getsupportedqualities != null) {
                getsupportedqualities.TuitionPaymentFragmentbindingInflater1();
            }
        }
    }

    @Override // defpackage.findNearestHigherSupportedEncoderProfilesFor
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Exception exc) {
        ImageView imageView = (ImageView) this.onTransact.get();
        if (imageView != null) {
            Object drawable = imageView.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            }
            if (this.TuitionPaymentFragmentbindingInflater1 != 0) {
                imageView.setImageResource(this.TuitionPaymentFragmentbindingInflater1);
            } else if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                imageView.setImageDrawable(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            getSupportedQualities getsupportedqualities = this.INotificationSideChannel;
            if (getsupportedqualities != null) {
                getsupportedqualities.TuitionPaymentFragmentspecialinlinedviewModeldefault2(exc);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.findNearestHigherSupportedEncoderProfilesFor
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (this.INotificationSideChannel != null) {
            this.INotificationSideChannel = null;
        }
    }
}
