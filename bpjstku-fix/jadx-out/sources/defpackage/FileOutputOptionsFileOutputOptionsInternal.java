package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class FileOutputOptionsFileOutputOptionsInternal {
    public static final AtomicInteger b = new AtomicInteger();
    public Drawable TuitionPaymentFragmentbindingInflater1;
    public final FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f144a;
    public boolean asBinder;
    public int asInterface;
    public int cancel;
    public boolean cancelAll;
    public final Picasso d;
    public int g;
    public Object notify;

    public FileOutputOptionsFileOutputOptionsInternal(Picasso picasso, Uri uri) {
        this.cancelAll = true;
        boolean z = picasso.f871a;
        this.d = picasso;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.TuitionPaymentFragmentbindingInflater1(uri, 0, picasso.TuitionPaymentFragmentbindingInflater1);
    }

    FileOutputOptionsFileOutputOptionsInternal() {
        this.cancelAll = true;
        this.d = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.TuitionPaymentFragmentbindingInflater1(null, 0, null);
    }
}
