package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.google.common.base.Suppliers;
import defpackage.CameraStateRegistryCameraRegistrationExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes5.dex */
public final class zzow implements CameraStateRegistryCameraRegistrationExternalSyntheticLambda0 {
    private static final zzow zza = new zzow();
    private final CameraStateRegistryCameraRegistrationExternalSyntheticLambda0 zzb = Suppliers.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new zzoy());

    public static boolean zza() {
        return zza.zzb().zza();
    }

    @Override // defpackage.CameraStateRegistryCameraRegistrationExternalSyntheticLambda0
    public final /* synthetic */ Object get() throws IllegalAccessException {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 46400), (ViewConfiguration.getPressedStateDuration() >> 16) + 40, KeyEvent.keyCodeFromString("") + 19, 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 37835), TextUtils.indexOf("", "", 0, 0) + 59, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 17, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.red(0) + 37836), 60 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 17 - MotionEvent.axisFromString(""), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -751;
        long j3 = -1;
        long j4 = j3 ^ 3871671299285729786L;
        long j5 = j3 ^ 1647582197874056453L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j6 = j4 | 1647582197874056453L;
        long j7 = (j2 * 3871671299285729786L) + (j2 * 1647582197874056453L) + (((long) 1504) * (((j4 | j5) ^ j3) | ((j4 | jIdentityHashCode) ^ j3))) + (((long) (-1504)) * ((j6 | jIdentityHashCode) ^ j3)) + (((long) 752) * ((j3 ^ (j5 | 3871671299285729786L)) | (j6 ^ j3)));
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
            j = j7;
        }
        if (i5 != i) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.blue(0) + 46400), 41 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), View.MeasureSpec.getMode(0) + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            int[] iArr = new int[i2];
            int i7 = i2 - 1;
            iArr[i7] = 1;
            Toast.makeText((Context) null, iArr[((i2 * i7) % 2) - 1], 1).show();
        }
        return zzb();
    }

    public final zzox zzb() {
        return (zzox) this.zzb.get();
    }
}
