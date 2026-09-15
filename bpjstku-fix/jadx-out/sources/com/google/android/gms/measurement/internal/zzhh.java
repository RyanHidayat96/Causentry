package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
final class zzhh extends zzjf {
    private static int[] TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    static final Pair zza;
    public zzhf zzb;
    public final zzhe zzc;
    public final zzhe zzd;
    public final zzhg zze;
    public final zzhe zzf;
    public final zzhc zzg;
    public final zzhg zzh;
    public final zzhd zzi;
    public final zzhc zzj;
    public final zzhe zzk;
    public final zzhe zzl;
    public boolean zzm;
    public final zzhc zzn;
    public final zzhc zzo;
    public final zzhe zzp;
    public final zzhg zzq;
    public final zzhg zzr;
    public final zzhe zzs;
    public final zzhd zzt;
    private SharedPreferences zzv;
    private SharedPreferences zzw;
    private String zzx;
    private boolean zzy;
    private long zzz;
    private static final byte[] $$c = {53, -70, 9, -72};
    private static final int $$d = 41;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {6, -86, -9, -124, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 42;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        TuitionPaymentFragmentbindingInflater1();
        zza = new Pair("", 0L);
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        int i2 = i % 2;
    }

    zzhh(zzic zzicVar) {
        super(zzicVar);
        this.zzf = new zzhe(this, "session_timeout", 1800000L);
        this.zzg = new zzhc(this, "start_new_session", true);
        this.zzk = new zzhe(this, "last_pause_time", 0L);
        this.zzl = new zzhe(this, "session_id", 0L);
        this.zzh = new zzhg(this, "non_personalized_ads", null);
        this.zzi = new zzhd(this, "last_received_uri_timestamps_by_source", null);
        this.zzj = new zzhc(this, "allow_remote_dynamite", false);
        this.zzc = new zzhe(this, "first_open_time", 0L);
        this.zzd = new zzhe(this, "app_install_time", 0L);
        this.zze = new zzhg(this, "app_instance_id", null);
        this.zzn = new zzhc(this, "app_backgrounded", false);
        this.zzo = new zzhc(this, "deep_link_retrieval_complete", false);
        this.zzp = new zzhe(this, "deep_link_retrieval_attempts", 0L);
        this.zzq = new zzhg(this, "firebase_feature_rollouts", null);
        this.zzr = new zzhg(this, "deferred_attribution_cache", null);
        this.zzs = new zzhe(this, "deferred_attribution_cache_timestamp", 0L);
        this.zzt = new zzhd(this, "default_event_parameters", null);
    }

    private static void c(int i, short s, int i2, Object[] objArr) {
        int i3 = s * 4;
        int i4 = (i2 * 3) + 84;
        int i5 = 4 - (i * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 53];
        int i6 = i3 + 52;
        int i7 = -1;
        if (bArr == null) {
            i5++;
            i4 = (i5 + i6) - 11;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b2 = bArr[i5];
                i5++;
                i4 = (i4 + b2) - 11;
            }
        }
    }

    protected final SharedPreferences zzd() {
        int i = 2 % 2;
        int i2 = b + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            zzg();
            zzw();
            Preconditions.checkNotNull(this.zzv);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zzg();
        zzw();
        Preconditions.checkNotNull(this.zzv);
        SharedPreferences sharedPreferences = this.zzv;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        b = i3 % 128;
        int i4 = i3 % 2;
        return sharedPreferences;
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    protected final void zzba() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzic zzicVar = this.zzu;
        SharedPreferences sharedPreferences = zzicVar.zzaY().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzv = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzm = z;
        if (!z) {
            int i4 = b + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                SharedPreferences.Editor editorEdit = this.zzv.edit();
                editorEdit.putBoolean("has_been_opened", false);
                editorEdit.apply();
            } else {
                SharedPreferences.Editor editorEdit2 = this.zzv.edit();
                editorEdit2.putBoolean("has_been_opened", true);
                editorEdit2.apply();
            }
        }
        zzicVar.zzc();
        this.zzb = new zzhf(this, "health_monitor", Math.max(0L, ((Long) zzfy.zzc.zzb(null)).longValue()), null);
    }

    final Pair zzb(String str) {
        int i = 2 % 2;
        int i2 = b + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzg();
        if (!zzl().zzo(zzjk.AD_STORAGE)) {
            return new Pair("", false);
        }
        zzic zzicVar = this.zzu;
        long jElapsedRealtime = zzicVar.zzaZ().elapsedRealtime();
        String str2 = this.zzx;
        if (str2 != null) {
            if (jElapsedRealtime < this.zzz) {
                return new Pair(str2, Boolean.valueOf(this.zzy));
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
            b = i4 % 128;
            int i5 = i4 % 2;
        }
        this.zzz = jElapsedRealtime + zzicVar.zzc().zzl(str, zzfy.zza);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zzicVar.zzaY());
            this.zzx = "";
            String id2 = advertisingIdInfo.getId();
            if (id2 != null) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
                b = i6 % 128;
                if (i6 % 2 != 0) {
                    this.zzx = id2;
                    int i7 = 7 / 0;
                } else {
                    this.zzx = id2;
                }
            }
            this.zzy = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e2) {
            this.zzu.zzaV().zzj().zzb("Unable to get advertising id", e2);
            this.zzx = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.zzx, Boolean.valueOf(this.zzy));
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = -1870535734;
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 5;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getLongPressTimeout() >> 16), View.MeasureSpec.getSize(0) + 3291, 31 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1948206109, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.resolveSize(0, 0) + 3291, 31 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1948206109, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i6++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = -1870535734;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentbindingInflater1;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = $10 + 87;
            $11 = i8 % 128;
            int i9 = 2;
            int i10 = i8 % 2;
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $10 + 77;
                $11 = i12 % 128;
                if (i12 % i9 == 0) {
                    try {
                        Object[] objArr4 = new Object[i4];
                        objArr4[i5] = Integer.valueOf(iArr5[i11]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) i5;
                            byte b7 = (byte) (b6 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TypedValue.complexToFloat(i5) > 0.0f ? 1 : (TypedValue.complexToFloat(i5) == 0.0f ? 0 : -1)), Gravity.getAbsoluteGravity(i5, i5) + 3291, (KeyEvent.getMaxKeyCode() >> 16) + 31, 1948206109, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr6[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    Object[] objArr5 = {Integer.valueOf(iArr5[i11])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 3292 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 31 - (KeyEvent.getMaxKeyCode() >> 16), 1948206109, false, $$e(b8, b9, (byte) (b9 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    i11++;
                }
                i4 = 1;
                i5 = 0;
                i9 = 2;
            }
            iArr5 = iArr6;
        }
        int i13 = i5;
        System.arraycopy(iArr5, i13, iArr4, i13, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[i13] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i14 = 17;
            for (int i15 = 1; i14 > i15; i15 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i14];
                Object[] objArr6 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 2559, 29 - View.combineMeasuredStates(0, 0), 683220507, false, $$e(b10, b11, b11), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i14--;
            }
            int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr7 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (28879 - (ViewConfiguration.getLongPressTimeout() >> 16)), Process.getGidForName("") + 349, AndroidCharacter.getMirror('0') - 23, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i13 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    final boolean zzo() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SharedPreferences sharedPreferences = this.zzv;
        if (sharedPreferences != null) {
            return sharedPreferences.contains("deferred_analytics_collection");
        }
        int i4 = i3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        return i4 % 2 == 0;
    }

    final boolean zzk(int i) {
        int i2 = 2 % 2;
        int i3 = b + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        boolean zZzu = zzjl.zzu(i, zzd().getInt("consent_source", 100));
        int i5 = b + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return zZzu;
    }

    final boolean zzp(long j) {
        int i = 2 % 2;
        int i2 = b + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            if (j * this.zzf.zza() > this.zzk.zza()) {
                return true;
            }
        } else {
            if (j - this.zzf.zza() > this.zzk.zza()) {
                return true;
            }
        }
        int i3 = b + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            return false;
        }
        throw null;
    }

    final Boolean zzi() {
        int i = 2 % 2;
        int i2 = b + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            zzg();
            int i3 = 35 / 0;
            if (!zzd().contains("measurement_enabled")) {
                return null;
            }
        } else {
            zzg();
            if (!zzd().contains("measurement_enabled")) {
                return null;
            }
        }
        Boolean boolValueOf = Boolean.valueOf(zzd().getBoolean("measurement_enabled", true));
        int i4 = b + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return boolValueOf;
    }

    final zzaz zzj() {
        int i = 2 % 2;
        int i2 = b + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            zzg();
            zzaz.zzg(zzd().getString("dma_consent_settings", null));
            obj.hashCode();
            throw null;
        }
        zzg();
        zzaz zzazVarZzg = zzaz.zzg(zzd().getString("dma_consent_settings", null));
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 21 / 0;
        }
        return zzazVarZzg;
    }

    final SparseArray zzf() {
        int i = 2 % 2;
        Bundle bundleZza = this.zzi.zza();
        int[] intArray = bundleZza.getIntArray("uriSources");
        long[] longArray = bundleZza.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        Object obj = null;
        if (intArray.length != longArray.length) {
            this.zzu.zzaV().zzb().zza("Trigger URI source and timestamp array lengths do not match");
            SparseArray sparseArray = new SparseArray();
            int i2 = b + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                return sparseArray;
            }
            throw null;
        }
        SparseArray sparseArray2 = new SparseArray();
        for (int i3 = 0; i3 < intArray.length; i3++) {
            sparseArray2.put(intArray[i3], Long.valueOf(longArray[i3]));
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return sparseArray2;
        }
        obj.hashCode();
        throw null;
    }

    final void zzh(Boolean bool) {
        int i = 2 % 2;
        zzg();
        SharedPreferences.Editor editorEdit = zzd().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
            b = i2 % 128;
            int i3 = i2 % 2;
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    final zzjl zzl() {
        int i = 2 % 2;
        int i2 = b + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzg();
        zzjl zzjlVarZzf = zzjl.zzf(zzd().getString("consent_settings", "G1"), zzd().getInt("consent_source", 100));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        b = i4 % 128;
        int i5 = i4 % 2;
        return zzjlVarZzf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        if ((r7 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        r7 = null;
        r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        if (r7.equals(r1) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if ((!r7.equals(r1)) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        r1 = zzd().edit();
        r1.putString("stored_tcf_param", r7);
        r1.apply();
        r7 = com.google.android.gms.measurement.internal.zzhh.b + 9;
        com.google.android.gms.measurement.internal.zzhh.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r7 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean zzm(com.google.android.gms.measurement.internal.zzod r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.measurement.internal.zzhh.b
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.google.android.gms.measurement.internal.zzhh.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            java.lang.String r4 = ""
            java.lang.String r5 = "stored_tcf_param"
            if (r1 != 0) goto L2d
            r6.zzg()
            android.content.SharedPreferences r1 = r6.zzd()
            java.lang.String r1 = r1.getString(r5, r4)
            java.lang.String r7 = r7.zza()
            boolean r1 = r7.equals(r1)
            r4 = 67
            int r4 = r4 / r3
            if (r1 != 0) goto L62
            goto L43
        L2d:
            r6.zzg()
            android.content.SharedPreferences r1 = r6.zzd()
            java.lang.String r1 = r1.getString(r5, r4)
            java.lang.String r7 = r7.zza()
            boolean r1 = r7.equals(r1)
            r1 = r1 ^ r2
            if (r1 == 0) goto L62
        L43:
            android.content.SharedPreferences r1 = r6.zzd()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putString(r5, r7)
            r1.apply()
            int r7 = com.google.android.gms.measurement.internal.zzhh.b
            int r7 = r7 + 9
            int r1 = r7 % 128
            com.google.android.gms.measurement.internal.zzhh.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1
            int r7 = r7 % r0
            if (r7 == 0) goto L5d
            return r2
        L5d:
            r7 = 0
            r7.hashCode()
            throw r7
        L62:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhh.zzm(com.google.android.gms.measurement.internal.zzod):boolean");
    }

    final void zzn(boolean z) {
        int i = 2 % 2;
        int i2 = b + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzg();
        this.zzu.zzaV().zzk().zzb("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = zzd().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    protected final SharedPreferences zze() throws Throwable {
        int i;
        int i2 = 2 % 2;
        int i3 = b + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        zzg();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        int i5 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (Process.myPid() >> 22)), 40 - TextUtils.indexOf("", "", 0, 0), View.MeasureSpec.getMode(0) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        a(new int[]{-1491962118, 1521334019, -2021457073, 224803768, 1621654499, 1445728718, 1777565689, -846806811, 878526442, 1457677676, -66684713, 1111332723, 352164944, -1757851988}, 22 - View.MeasureSpec.getMode(0), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        int i7 = 10;
        Object[] objArr2 = new Object[1];
        a(new int[]{-1706755472, -635258121, -559531235, -898216214, 1408741425, -1623401815, 1876072180, -949801961, -564612667, 1178683083}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = -783;
        long j2 = -1;
        long j3 = j2 ^ 1230803969877185454L;
        long jIdentityHashCode = ((long) System.identityHashCode(this)) ^ j2;
        long j4 = (((long) 784) * 1230803969877185454L) + (((long) (-782)) * 866453204864773533L) + ((j2 ^ 866453204864773533L) * j) + (j * (((j3 | jIdentityHashCode) | 866453204864773533L) ^ j2)) + (((long) 783) * (j3 | ((jIdentityHashCode | 866453204864773533L) ^ j2)));
        int i8 = 0;
        long j5 = jLongValue;
        while (true) {
            int i9 = 8;
            if (i8 == i7) {
                int i10 = i7;
                int[] iArr = new int[i10];
                // fill-array-data instruction
                iArr[0] = 1930418793;
                iArr[1] = 224551181;
                iArr[2] = 1279863323;
                iArr[3] = -1453763985;
                iArr[4] = 1684299771;
                iArr[5] = -500587344;
                iArr[6] = 459511030;
                iArr[7] = 1599199847;
                iArr[8] = -1371832966;
                iArr[9] = 1928306272;
                Object[] objArr3 = new Object[1];
                a(iArr, Color.argb(0, 0, 0, 0) + 16, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                int[] iArr2 = new int[i10];
                // fill-array-data instruction
                iArr2[0] = -1580478610;
                iArr2[1] = -2100336634;
                iArr2[2] = -1488929845;
                iArr2[3] = -636544889;
                iArr2[4] = -125056503;
                iArr2[5] = 621200417;
                iArr2[6] = -1671259806;
                iArr2[7] = 1522844695;
                iArr2[8] = 1869827168;
                iArr2[9] = -2002996889;
                Object[] objArr4 = new Object[1];
                a(iArr2, 17 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {1472078146};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 46038), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1135, (ViewConfiguration.getJumpTapTimeout() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 917232689, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cGreen = (char) Color.green(0);
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 1031;
                        int size = 15 - View.MeasureSpec.getSize(0);
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        c(b2, b3, b3, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen, capsMode, size, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (AndroidCharacter.getMirror('0') + 45945), 1117 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 17), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6);
                    int i11 = ((int[]) objArr8[1])[0];
                    int i12 = ((int[]) objArr8[3])[0];
                    if (i12 == i11) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr8[0];
                    if (strArr != null) {
                        int i13 = 0;
                        while (i13 < strArr.length) {
                            int i14 = b + 13;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                            if (i14 % 2 == 0) {
                                arrayList.add(strArr[i13]);
                                i13 += 3;
                            } else {
                                arrayList.add(strArr[i13]);
                                i13++;
                            }
                        }
                    }
                    int[] iArr3 = new int[i12];
                    int i15 = i12 - 1;
                    iArr3[i15] = 1;
                    Toast.makeText((Context) null, iArr3[((i12 * i15) % 2) - 1], 1).show();
                    break;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.red(i5) + 37836), Color.alpha(i5) + 59, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 17, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i16 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
            int i17 = i5;
            long j6 = j5;
            while (true) {
                int i18 = i5;
                while (i18 != i9) {
                    int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
                    b = i19 % 128;
                    int i20 = i19 % 2;
                    int i21 = i16;
                    i16 = (((((int) (j6 >> i18)) & 255) + (i21 << 6)) + (i21 << 16)) - i21;
                    i18++;
                    i9 = 8;
                }
                i = i16;
                if (i17 != 0) {
                    break;
                }
                i17++;
                i16 = i;
                j6 = j4;
                i5 = 0;
                i9 = 8;
            }
            if (i == i6) {
                break;
            }
            int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
            b = i22 % 128;
            int i23 = i22 % 2;
            j5 -= 1024;
            i8++;
            i5 = 0;
            i7 = 10;
        }
        zzw();
        if (this.zzw == null) {
            zzic zzicVar = this.zzu;
            String packageName = zzicVar.zzaY().getPackageName();
            String.valueOf(packageName);
            String strValueOf = String.valueOf(packageName);
            zzgs zzgsVarZzk = zzicVar.zzaV().zzk();
            String strConcat = strValueOf.concat("_preferences");
            zzgsVarZzk.zzb("Default prefs file", strConcat);
            this.zzw = zzicVar.zzaY().getSharedPreferences(strConcat, 0);
        }
        return this.zzw;
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    protected final boolean zza() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        boolean z = i3 % 2 != 0;
        int i4 = i2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentbindingInflater1 = new int[]{-502061674, -958345167, 1888845094, -619116394, 1010562780, -755614046, 1035105007, -189862815, -614616681, -353192194, -557014126, 1014472341, 1016879075, -1728688743, 283356423, 316645119, -1668450356, 1797221121};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, short r7, short r8) {
        /*
            int r6 = r6 * 3
            int r6 = 1 - r6
            byte[] r0 = com.google.android.gms.measurement.internal.zzhh.$$c
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r7 = r7 * 56
            int r7 = 122 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r5 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r8]
        L26:
            int r3 = -r3
            int r8 = r8 + 1
            int r7 = r7 + r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhh.$$e(short, short, short):java.lang.String");
    }
}
