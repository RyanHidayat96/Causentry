package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class findNearestHigherSupportedEncoderProfilesFor<T> {
    final int TuitionPaymentFragmentbindingInflater1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final Drawable TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Picasso f902a;
    final boolean asBinder;
    final Object asInterface;
    public boolean b;
    public boolean cancel;
    public final FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder d;
    final int g;
    public final WeakReference<T> onTransact;

    public abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Exception exc);

    public abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault2<M> extends WeakReference<M> {
        public final findNearestHigherSupportedEncoderProfilesFor TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(findNearestHigherSupportedEncoderProfilesFor findnearesthighersupportedencoderprofilesfor, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.TuitionPaymentFragmentbindingInflater1 = findnearesthighersupportedencoderprofilesfor;
        }
    }

    findNearestHigherSupportedEncoderProfilesFor(Picasso picasso, T t, FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
        this.f902a = picasso;
        this.d = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder;
        this.onTransact = t == null ? null : new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, t, picasso.asBinder);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        this.g = i2;
        this.asBinder = z;
        this.TuitionPaymentFragmentbindingInflater1 = i3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = drawable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.asInterface = obj == null ? this : obj;
    }

    public void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        this.b = true;
    }
}
