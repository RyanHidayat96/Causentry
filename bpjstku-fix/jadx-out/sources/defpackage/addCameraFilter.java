package defpackage;

import android.content.Context;
import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.bumptech.glide.load.engine.Resource;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
final class addCameraFilter<Z> implements Resource<Z> {
    private final boolean TuitionPaymentFragmentbindingInflater1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final Resource<Z> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final getCameraControl asBinder;
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault1 asInterface;
    final boolean b;

    interface TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getCameraControl getcameracontrol, addCameraFilter<?> addcamerafilter);
    }

    addCameraFilter(Resource<Z> resource, boolean z, boolean z2, getCameraControl getcameracontrol, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        if (resource != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = resource;
            this.b = z;
            this.TuitionPaymentFragmentbindingInflater1 = z2;
            this.asBinder = getcameracontrol;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                throw new NullPointerException("Argument must not be null");
            }
            this.asInterface = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class<Z> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Z TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > 0) {
                throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            if (this.TuitionPaymentFragmentbindingInflater1) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
        }
    }

    final void b() {
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                throw new IllegalStateException("Cannot acquire a recycled resource");
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
        }
    }

    final void g() throws IllegalAccessException {
        boolean z;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 46401), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 40, 19 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 37835), 'k' - AndroidCharacter.getMirror('0'), 18 - TextUtils.indexOf("", "", 0), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 37836), 59 - Gravity.getAbsoluteGravity(0, 0), 19 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -755;
        long j3 = -1;
        long j4 = ((249928032140581191L ^ j3) | (j3 ^ 5269325465019205048L)) ^ j3;
        long jIdentityHashCode = System.identityHashCode(this);
        long j5 = (j2 * 249928032140581191L) + (j2 * 5269325465019205048L) + (((long) 1512) * j4) + (((long) (-756)) * (j4 | ((5438078681767992831L | jIdentityHashCode) ^ j3))) + (((long) 756) * (5438078681767992831L | (jIdentityHashCode ^ j3)));
        int i4 = 0;
        int i5 = i3;
        while (true) {
            for (int i6 = 0; i6 != 8; i6++) {
                i5 = (((((int) (j >> i6)) & 255) + (i5 << 6)) + (i5 << 16)) - i5;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j = j5;
        }
        if (i5 != i) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.getSize(0) + 46400), 40 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
        }
        synchronized (this) {
            int i7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (i7 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            int i8 = i7 - 1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8;
            z = i8 == 0;
        }
        if (z) {
            this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.asBinder, this);
        }
    }

    public final String toString() {
        String string;
        synchronized (this) {
            StringBuilder sb = new StringBuilder("EngineResource{isMemoryCacheable=");
            sb.append(this.b);
            sb.append(", listener=");
            sb.append(this.asInterface);
            sb.append(", key=");
            sb.append(this.asBinder);
            sb.append(", acquired=");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            sb.append(", isRecycled=");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            sb.append(", resource=");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            sb.append('}');
            string = sb.toString();
        }
        return string;
    }
}
