package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\tJ\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006*\u00020\u00030\u00030\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00138\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0011\u0010 \u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001f"}, d2 = {"Lpause;", "Landroid/content/ComponentCallbacks2;", "LMediaMetadataCompatLongKey$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "LMediaBrowserCompatSearchCallback;", "p0", "<init>", "(LMediaBrowserCompatSearchCallback;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()V", "b", "TuitionPaymentFragmentbindingInflater1", "Landroid/content/res/Configuration;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "onTrimMemory", "(I)V", "onLowMemory", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Z)V", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "Landroid/content/Context;", "LMediaMetadataCompatLongKey;", "asInterface", "LMediaMetadataCompatLongKey;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Z", "()Z", "a"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class pause implements ComponentCallbacks2, MediaMetadataCompatLongKey.TuitionPaymentFragmentspecialinlinedviewModeldefault1 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final WeakReference<MediaBrowserCompatSearchCallback> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private boolean TuitionPaymentFragmentbindingInflater1 = true;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private MediaMetadataCompatLongKey TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private Context b;

    public pause(MediaBrowserCompatSearchCallback mediaBrowserCompatSearchCallback) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new WeakReference<>(mediaBrowserCompatSearchCallback);
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        boolean z;
        synchronized (this) {
            b();
            z = this.TuitionPaymentFragmentbindingInflater1;
        }
        return z;
    }

    private void TuitionPaymentFragmentbindingInflater1() {
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            Context context = this.b;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            MediaMetadataCompatLongKey mediaMetadataCompatLongKey = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (mediaMetadataCompatLongKey != null) {
                mediaMetadataCompatLongKey.b();
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.clear();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        synchronized (this) {
            onTrimMemory(80);
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        synchronized (this) {
            MediaBrowserCompatSearchCallback mediaBrowserCompatSearchCallback = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
            if (mediaBrowserCompatSearchCallback != null) {
                if (this.b == null) {
                    Context b = mediaBrowserCompatSearchCallback.getB();
                    this.b = b;
                    b.registerComponentCallbacks(this);
                }
            } else {
                TuitionPaymentFragmentbindingInflater1();
            }
        }
    }

    private final void b() {
        MediaMetadataCompatTextKey mediaMetadataCompatTextKey;
        synchronized (this) {
            MediaBrowserCompatSearchCallback mediaBrowserCompatSearchCallback = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
            if (mediaBrowserCompatSearchCallback != null) {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    if (mediaBrowserCompatSearchCallback.getAsBinder().getTuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                        mediaMetadataCompatTextKey = MediaMetadataCompatApi21.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mediaBrowserCompatSearchCallback.getB(), this, mediaBrowserCompatSearchCallback.getD());
                    } else {
                        mediaMetadataCompatTextKey = new MediaMetadataCompatTextKey();
                    }
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mediaMetadataCompatTextKey;
                    this.TuitionPaymentFragmentbindingInflater1 = mediaMetadataCompatTextKey.TuitionPaymentFragmentbindingInflater1();
                }
            } else {
                TuitionPaymentFragmentbindingInflater1();
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration p0) {
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get() == null) {
                TuitionPaymentFragmentbindingInflater1();
            }
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int p0) {
        synchronized (this) {
            MediaBrowserCompatSearchCallback mediaBrowserCompatSearchCallback = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
            if (mediaBrowserCompatSearchCallback != null) {
                getVolumeAttributes d = mediaBrowserCompatSearchCallback.getD();
                if (d != null) {
                    d.TuitionPaymentFragmentbindingInflater1();
                }
                mediaBrowserCompatSearchCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
            } else {
                TuitionPaymentFragmentbindingInflater1();
            }
        }
    }

    @Override // MediaMetadataCompatLongKey.TuitionPaymentFragmentspecialinlinedviewModeldefault1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean p0) {
        synchronized (this) {
            MediaBrowserCompatSearchCallback mediaBrowserCompatSearchCallback = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
            if (mediaBrowserCompatSearchCallback != null) {
                mediaBrowserCompatSearchCallback.getD();
                this.TuitionPaymentFragmentbindingInflater1 = p0;
            } else {
                TuitionPaymentFragmentbindingInflater1();
            }
        }
    }
}
