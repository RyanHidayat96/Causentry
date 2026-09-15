package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes5.dex */
public class zzmw {
    protected volatile zznm zza;
    private volatile zzlh zzb;
    private volatile boolean zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmw)) {
            return false;
        }
        zzmw zzmwVar = (zzmw) obj;
        zznm zznmVar = this.zza;
        zznm zznmVar2 = zzmwVar.zza;
        if (zznmVar == null && zznmVar2 == null) {
            return zzc().equals(zzmwVar.zzc());
        }
        if (zznmVar != null && zznmVar2 != null) {
            return zznmVar.equals(zznmVar2);
        }
        if (zznmVar != null) {
            zzmwVar.zzd(zznmVar.zzcE());
            return zznmVar.equals(zzmwVar.zza);
        }
        zzd(zznmVar2.zzcE());
        return this.zza.equals(zznmVar2);
    }

    public final int zzb() {
        if (this.zzb != null) {
            return ((zzlg) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzcn();
        }
        return 0;
    }

    public final zzlh zzc() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            if (this.zzb != null) {
                return this.zzb;
            }
            if (this.zza == null) {
                this.zzb = zzlh.zzb;
            } else {
                this.zzb = this.zza.zzcb();
            }
            return this.zzb;
        }
    }

    protected final void zzd(zznm zznmVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zznmVar;
                this.zzb = zzlh.zzb;
            } catch (zzmr unused) {
                this.zzc = true;
                this.zza = zznmVar;
                this.zzb = zzlh.zzb;
            }
        }
    }

    public int hashCode() throws IllegalAccessException {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 46400), 40 - (ViewConfiguration.getPressedStateDuration() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 19, 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 37836), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 59, (ViewConfiguration.getLongPressTimeout() >> 16) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - Color.green(0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 58, 18 - (ViewConfiguration.getEdgeSlop() >> 16), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -1;
        long j3 = 1640391135779676261L ^ j2;
        long j4 = 333;
        long jIdentityHashCode = System.identityHashCode(this);
        long j5 = jIdentityHashCode ^ j2;
        long j6 = (((long) (-665)) * 1640391135779676261L) + (((long) 334) * 3878862361380109978L) + (((long) (-333)) * j3) + ((((j3 | j5) ^ j2) | ((jIdentityHashCode | 3878862361380109978L) ^ j2)) * j4) + (j4 * ((j2 ^ (j5 | 3878862361380109978L)) | ((jIdentityHashCode | j3) ^ j2)));
        int i4 = i3;
        long j7 = j;
        int i5 = 0;
        while (true) {
            for (int i6 = 0; i6 != 8; i6++) {
                i4 = (((((int) (j7 >> i6)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
            }
            if (i5 != 0) {
                break;
            }
            i5++;
            j7 = j6;
        }
        if (i4 == i) {
            return 1;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 46400), ExpandableListView.getPackedPositionGroup(0L) + 40, TextUtils.indexOf("", "") + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
        }
        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
        Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
        return 1;
    }

    public final zznm zza(zznm zznmVar) {
        zznm zznmVar2 = this.zza;
        this.zzb = null;
        this.zza = zznmVar;
        return zznmVar2;
    }
}
