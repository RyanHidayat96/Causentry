package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class setStateToInitialized implements BitmapPool {
    private static final Bitmap.Config TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Bitmap.Config.ARGB_8888;
    private int TuitionPaymentFragmentbindingInflater1;
    private final Set<Bitmap.Config> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f1391a;
    private int asBinder;
    private final long asInterface;
    private int b;
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault3 cancel;
    private final updateOrResetMinLogLevel d;
    private int g;

    interface TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
    }

    private setStateToInitialized(long j, updateOrResetMinLogLevel updateorresetminloglevel, Set<Bitmap.Config> set) {
        this.asInterface = j;
        this.f1391a = j;
        this.d = updateorresetminloglevel;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = set;
        this.cancel = new b();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final void TuitionPaymentFragmentbindingInflater1(Bitmap bitmap) {
        synchronized (this) {
            try {
                if (bitmap == null) {
                    throw new NullPointerException("Bitmap must not be null");
                }
                if (bitmap.isRecycled()) {
                    throw new IllegalStateException("Cannot pool recycled bitmap");
                }
                if (bitmap.isMutable() && this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bitmap) <= this.f1391a && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.contains(bitmap.getConfig())) {
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bitmap);
                    this.d.b(bitmap);
                    this.g++;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 += (long) iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bitmap);
                    }
                    TuitionPaymentFragmentbindingInflater1(this.f1391a);
                    return;
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bitmap);
                    bitmap.isMutable();
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.contains(bitmap.getConfig());
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB = b(i, i2, config);
        if (bitmapB != null) {
            bitmapB.eraseColor(0);
            return bitmapB;
        }
        if (config == null) {
            config = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final Bitmap TuitionPaymentFragmentbindingInflater1(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB = b(i, i2, config);
        if (bitmapB != null) {
            return bitmapB;
        }
        if (config == null) {
            config = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentbindingInflater1(0L);
    }

    private void TuitionPaymentFragmentbindingInflater1(long j) {
        synchronized (this) {
            while (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > j) {
                Bitmap bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                if (bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0L;
                    return;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 -= (long) this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                this.b++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
                bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1.recycle();
            }
        }
    }

    static final class b implements TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        b() {
        }
    }

    public setStateToInitialized(long j) {
        getCameraFactory getcamerafactory = new getCameraFactory();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        this(j, getcamerafactory, Collections.unmodifiableSet(hashSet));
    }

    private Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        synchronized (this) {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                StringBuilder sb = new StringBuilder("Cannot create a mutable Bitmap with config: ");
                sb.append(config);
                sb.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                throw new IllegalArgumentException(sb.toString());
            }
            bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, i2, config != null ? config : TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, i2, config);
                }
                this.asBinder++;
            } else {
                this.TuitionPaymentFragmentbindingInflater1++;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 -= (long) this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault2.setHasAlpha(true);
                bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault2.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, i2, config);
            }
        }
        return bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        if (i >= 40 || i >= 20) {
            TuitionPaymentFragmentbindingInflater1(0L);
        } else if (i >= 20 || i == 15) {
            TuitionPaymentFragmentbindingInflater1(this.f1391a / 2);
        }
    }
}
