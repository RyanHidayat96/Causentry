package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbrc extends zzbpk {
    final /* synthetic */ zzbrx zza;

    /* synthetic */ zzbrc(zzbrx zzbrxVar, byte[] bArr) {
        Objects.requireNonNull(zzbrxVar);
        this.zza = zzbrxVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbpk
    protected final void zzd() {
        this.zza.zze();
    }

    @Override // com.google.android.libraries.places.internal.zzbpk
    protected final void zze() throws IllegalAccessException {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 46399), 40 - KeyEvent.getDeadChar(0, 0), 19 - View.getDefaultSize(0, 0), 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37835 - TextUtils.lastIndexOf("", '0', 0)), Color.green(0) + 59, 17 - TextUtils.indexOf((CharSequence) "", '0', 0), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.resolveSizeAndState(0, 0, 0) + 37836), 58 - TextUtils.indexOf((CharSequence) "", '0'), 18 - Color.argb(0, 0, 0, 0), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = 253;
        long j3 = (j2 * 1091332705496441295L) + (j2 * 4427920791663344944L);
        long j4 = -252;
        long j5 = -1;
        long j6 = j5 ^ 4427920791663344944L;
        long j7 = ((j5 ^ 1091332705496441295L) | j6) ^ j5;
        long jIdentityHashCode = System.identityHashCode(this);
        long j8 = j6 | (jIdentityHashCode ^ j5);
        long j9 = (4573180571381530111L | jIdentityHashCode) ^ j5;
        long j10 = j3 + ((j7 | (j8 ^ j5) | j9) * j4) + (j4 * 4573180571381530111L) + (((long) 252) * (j9 | (j5 ^ (j8 | 1091332705496441295L))));
        int i4 = 0;
        while (true) {
            for (int i5 = 0; i5 != 8; i5++) {
                i3 = (((((int) (j >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j = j10;
        }
        if (i3 != i) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (KeyEvent.normalizeMetaState(0) + 46400), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 40, 18 - TextUtils.lastIndexOf("", '0', 0), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            throw new RuntimeException(String.valueOf(i2));
        }
        zzbrx zzbrxVar = this.zza;
        if (zzbrxVar.zzM().get()) {
            return;
        }
        zzbrxVar.zzm();
    }
}
