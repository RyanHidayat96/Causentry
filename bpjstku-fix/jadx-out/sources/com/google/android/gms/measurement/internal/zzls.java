package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes5.dex */
public enum zzls {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);

    private final int zzg;

    zzls(int i) {
        this.zzg = i;
    }

    public static zzls zzb(int i) {
        for (zzls zzlsVar : values()) {
            if (zzlsVar.zzg == i) {
                return zzlsVar;
            }
        }
        return UNKNOWN;
    }

    public final int zza() throws IllegalAccessException {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", "") + 46400), 40 - View.MeasureSpec.getSize(0), (ViewConfiguration.getTapTimeout() >> 16) + 19, 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37837 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 59 - (ViewConfiguration.getScrollBarSize() >> 8), 18 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 37837), 59 - TextUtils.getCapsMode("", 0, 0), 18 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = 367;
        long j3 = (j2 * 3699215939132806394L) + (j2 * 1820037558026979845L);
        long j4 = -366;
        long j5 = -1;
        long j6 = j5 ^ 1820037558026979845L;
        long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
        long j7 = j3 + (4275697032401346303L * j4) + (j4 * (((j6 | jElapsedRealtime) ^ j5) | 3699215939132806394L)) + (((long) 366) * ((((j5 ^ 3699215939132806394L) | 1820037558026979845L) ^ j5) | (j5 ^ ((j6 | 3699215939132806394L) | jElapsedRealtime))));
        int i4 = 0;
        while (true) {
            for (int i5 = 0; i5 != 8; i5++) {
                i3 = (((((int) (j >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j = j7;
        }
        if (i3 != i) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 46399), (ViewConfiguration.getPressedStateDuration() >> 16) + 40, (ViewConfiguration.getWindowTouchSlop() >> 8) + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
        }
        return this.zzg;
    }
}
