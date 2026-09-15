package com.google.android.libraries.places.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzava extends zzbae implements zzbbm {
    private static final zzava zzj;
    private static volatile zzbbt zzk;
    private int zze;
    private int zzf;
    private String zzb = "";
    private zzbao zzg = zzbu();
    private String zzh = "";
    private String zzi = "";

    static {
        zzava zzavaVar = new zzava();
        zzj = zzavaVar;
        zzbae.zzbn(zzava.class, zzavaVar);
    }

    private zzava() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzj, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u001b\u0005Ȉ\u0006Ȉ", new Object[]{"zzb", "zze", "zzf", "zzg", zzasu.class, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzava();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzauz(bArr);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzk;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzava.class) {
            zzazzVar = zzk;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzj);
                zzk = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public final int zzc() throws IllegalAccessException {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 46401), 39 - TextUtils.indexOf((CharSequence) "", '0'), 19 - (ViewConfiguration.getEdgeSlop() >> 16), 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - Color.red(0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 59, View.combineMeasuredStates(0, 0) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 37837), TextUtils.indexOf("", "", 0, 0) + 59, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -518;
        long j3 = (j2 * 1434016326443652850L) + (j2 * 4085237170716133389L);
        long j4 = 519;
        long j5 = -1;
        long jIdentityHashCode = System.identityHashCode(this);
        long j6 = (j5 ^ 1434016326443652850L) | (jIdentityHashCode ^ j5);
        long j7 = j3 + (((j6 ^ j5) | 4085237170716133389L) * j4) + (((long) (-519)) * (((j6 | 4085237170716133389L) ^ j5) | ((4321115675101355775L | jIdentityHashCode) ^ j5))) + (j4 * ((j5 ^ (jIdentityHashCode | 4085237170716133389L)) | 1434016326443652850L));
        long j8 = j;
        int i4 = 0;
        while (true) {
            for (int i5 = 0; i5 != 8; i5++) {
                i3 = (((((int) (j8 >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j8 = j7;
        }
        if (i3 != i) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - View.MeasureSpec.getSize(0)), 40 - Color.green(0), 18 - Process.getGidForName(""), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
        }
        return this.zze;
    }

    public final String zza() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzf;
    }

    public final List zze() {
        return this.zzg;
    }

    public final String zzf() {
        return this.zzh;
    }
}
