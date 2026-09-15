package com.google.android.libraries.places.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.mlkit.common.MlKitException;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlt implements zzmd {
    private final zzmp zzA;
    final zzbes zza;
    final zzbes zzb;
    final zzbes zzc;
    final zzbes zzd;
    final zzbes zze;
    final zzbes zzf;
    final zzbes zzg;
    final zzbes zzh;
    final zzbes zzi;
    final zzbes zzj;
    final zzbes zzk;
    final zzbes zzl;
    final zzbes zzm;
    final zzbes zzn;
    final zzbes zzo;
    final zzbes zzp;
    final zzbes zzq;
    final zzbes zzr;
    final zzbes zzs;
    final zzbes zzt;
    final zzbes zzu;
    final zzbes zzv;
    final zzbes zzw;
    final zzbes zzx;
    private final zzmf zzy;
    private final Context zzz;
    private static final byte[] $$a = {46, 47, -18, 64};
    private static final int $$b = 219;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int g = 0;
    private static int asInterface = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {59690, 59715, 59726, 59700, 59740, 59746, 59744, 59771, 59751, 59757, 59721, 59705, 59743, 59752, 59744, 59749, 59714, 59702, 59725, 59700, 59740, 59746, 59744, 59771, 59751, 59757, 59715, 59708, 59723, 59714, 59743, 59707, 59744, 59744, 59751, 59736, 59739, 59751, 59759, 59751, 59768, 59750, 59749, 59773, 59736, 59724, 59744, 59775, 59749, 59712, 59736, 59741, 59705, 59707, 59684, 59720, 59725, 59705, 59707, 59723, 59754, 59750, 59744, 59747, 59757, 59751, 59747, 59757, 59744, 59734, 59827, 59850, 59847, 59836, 59838, 59829, 59836, 59844, 59882, 59880, 59875, 59887, 59861, 59851, 59812, 59851, 59830, 59836, 59844, 59882, 59880, 59875, 59887, 59861, 59825, 59809, 59847, 59856, 59880, 59885, 59697, 59751, 59746, 59770, 59738, 59699, 59730, 59749, 59770, 59751, 59749, 59773, 59745, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59715, 59746, 59749, 59831, 59883, 59866, 59864, 59861, 59866, 59864, 59846, 59857, 59846, 59826, 59866, 59864, 59846, 59868, 59844, 59846, 59707, 59756, 59746, 59757, 59757, 59751, 59753, 59731, 59753, 59756, 59757, 59759, 59757, 59730, 59704, 59757, 59740, 59728, 59745, 59745, 59744, 59757, 59751, 59753, 59731, 59753, 59756, 59757, 59703, 59774, 59771, 59770, 59744, 59753, 59736, 59742, 59751, 59745, 59753, 59757, 59756, 59756, 59749, 59768, 59744, 59743, 59699, 59738, 59768, 59744, 59759, 59715, 59736, 59773, 59749, 59750, 59768, 59751, 59759, 59751, 59739, 59724, 59744, 59744, 59758, 59704, 59757, 59751, 59733, 59728, 59771, 59768, 59745, 59756, 59747, 59759, 59703, 59750, 59746, 59769, 59730, 59736, 59751, 59773, 59734, 59731, 59770, 59726, 59802, 59780, 59788, 59776, 59783, 59783, 59800, 59795, 59803, 59762, 59752, 59730, 59740, 59744, 59747, 59773, 59795, 59803, 59778, 59750, 59763, 59792, 59800, 59801, 59795, 59802, 59778, 59802, 59774, 59751, 59803, 59803, 59777, 59697, 59744, 59757, 59756, 59759, 59744, 59757, 59725, 59705, 59707, 59723, 59754, 59750, 59744, 59747, 59757, 59751, 59747, 59757, 59746, 59757, 59751, 59752};
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {47384, 47371, 47381, 47367, 47370, 47376, 47307, 47382, 47365, 47380, 47369, 47372, 47337, 47374, 47378, 47340, 47344, 47379, 47366, 47364, 47329, 47300, 47305, 47296, 47334, 47350};
    private static int b = 2047719609;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;

    zzlt(Context context, zzmf zzmfVar, zzmp zzmpVar) {
        this.zzy = zzmfVar;
        this.zzz = context;
        this.zzA = zzmpVar;
        zzbep zzbepVarZza = zzbeq.zza(context);
        this.zza = zzbepVarZza;
        zzbes zzbesVarZza = zzbeo.zza(zzmk.zza(zzbepVarZza, zzei.zza()));
        this.zzb = zzbesVarZza;
        this.zzc = zzbew.zza(zzea.zza());
        this.zzd = zzbeo.zza(zzlz.zza);
        zzbes zzbesVarZza2 = zzbeo.zza(zzhh.zza());
        this.zze = zzbesVarZza2;
        zzbes zzbesVarZza3 = zzbeo.zza(zzjp.zza(zzbesVarZza2));
        this.zzf = zzbesVarZza3;
        this.zzg = zzbeo.zza(zzjw.zza(zzbesVarZza2, zzbesVarZza3));
        this.zzh = zzbeo.zza(zzju.zza(zzbesVarZza2, zzbesVarZza3));
        this.zzi = zzbeo.zza(zzhs.zza());
        this.zzj = zzbeo.zza(zzhp.zza());
        this.zzk = zzbeo.zza(zzhe.zza(zzbesVarZza2));
        zzbes zzbesVarZza4 = zzbeo.zza(zzjb.zza());
        this.zzl = zzbesVarZza4;
        this.zzm = zzbeo.zza(zzix.zza(zzbesVarZza4));
        this.zzn = zzbeo.zza(zzjs.zza());
        this.zzo = zzbeo.zza(zzjy.zza(zzbesVarZza4));
        zzmi zzmiVarZzc = zzmi.zzc(zzbepVarZza);
        this.zzp = zzmiVarZzc;
        zzbes zzbesVarZza5 = zzbeo.zza(zzlx.zza);
        this.zzq = zzbesVarZza5;
        this.zzr = zzbeo.zza(zzjg.zza(zzmiVarZzc, zzbesVarZza5));
        zzex zzexVarZza = zzex.zza(zzbesVarZza);
        this.zzs = zzexVarZza;
        zzbeu zzbeuVarZza = zzbev.zza(1, 0);
        zzbeuVarZza.zza(zzexVarZza);
        zzbev zzbevVarZzb = zzbeuVarZza.zzb();
        this.zzt = zzbevVarZzb;
        this.zzu = zzew.zzc(zzbevVarZzb);
        this.zzv = zzbeo.zza(zzlv.zza);
        zzbes zzbesVar = zzlu.zza;
        this.zzw = zzbesVar;
        this.zzx = zzbeo.zza(zzey.zza(zzbesVar));
    }

    final zzfj zza() {
        int i = 2 % 2;
        zzfj zzfjVarZza = zzfk.zza(new zzmu(zzmj.zza(this.zzz), (zzeo) this.zzb.zzb()), this.zzA, this.zzy);
        int i2 = asInterface + 69;
        g = i2 % 128;
        int i3 = i2 % 2;
        return zzfjVarZza;
    }

    final zzir zzb() {
        int i = 2 % 2;
        zzir zzirVar = new zzir(zzmi.zzd(this.zzz));
        int i2 = g + 123;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return zzirVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzmd
    public final PlacesClient zzc() {
        int i = 2 % 2;
        Context context = this.zzz;
        zzmx zzmxVar = new zzmx(context);
        zzfr zzfrVarZza = zzfs.zza(zzmb.zza(zzmi.zzd(context)), new zzkr());
        zzfx zzfxVarZza = zzfy.zza(zzmb.zza(zzmi.zzd(context)));
        zzbes zzbesVar = this.zzc;
        zzfj zzfjVarZza = zza();
        zzdy zzdyVar = (zzdy) zzbesVar.zzb();
        zzkd zzkdVarZza = zzke.zza();
        zzkh zzkhVarZza = zzki.zza(zzlg.zza());
        zzkl zzklVarZza = zzkm.zza();
        zzkp zzkpVarZza = zzkq.zza(zzlg.zza());
        zzmf zzmfVar = this.zzy;
        zzlc zzlcVarZza = zzld.zza(zzmfVar, zzmxVar, zzfrVarZza, zzfxVarZza, zzfjVarZza, zzdyVar, zzkdVarZza, zzkhVarZza, zzklVarZza, zzkpVarZza);
        Context contextZzd = zzmi.zzd(context);
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(zzmi.zzd(context));
        zzber.zza(fusedLocationProviderClient);
        zzfc zzfcVarZza = zzfd.zza(contextZzd, fusedLocationProviderClient, new zzlr(new zzln()));
        zzfh zzfhVarZza = zzfi.zza(zzmi.zzd(context), (zzdy) zzbesVar.zzb());
        zzfj zzfjVarZza2 = zza();
        zzdy zzdyVar2 = (zzdy) zzbesVar.zzb();
        zzbif zzbifVar = (zzbif) this.zzd.zzb();
        zzfj zzfjVarZza3 = zza();
        zzdy zzdyVar3 = (zzdy) zzbesVar.zzb();
        zzbes zzbesVar2 = this.zzq;
        zzbes zzbesVar3 = this.zzr;
        zzbes zzbesVar4 = this.zzo;
        zzbes zzbesVar5 = this.zzn;
        zzbes zzbesVar6 = this.zzm;
        zzbes zzbesVar7 = this.zzk;
        zzbes zzbesVar8 = this.zzj;
        zzbes zzbesVar9 = this.zzi;
        zzhb zzhbVarZza = zzhc.zza(zzmfVar, zzlcVarZza, zzfcVarZza, zzfhVarZza, zzfjVarZza2, zzdyVar2, zziq.zza(zzmfVar, zzbifVar, zzfjVarZza3, zzdyVar3, this.zzg.zzb(), this.zzh.zzb(), zzbesVar9.zzb(), zzbesVar8.zzb(), zzbesVar7.zzb(), zzbesVar6.zzb(), zzbesVar5.zzb(), zzbesVar4.zzb(), zzb(), zzbesVar3.zzb(), zzjn.zza(zzmi.zzd(context), (zzbif) zzbesVar2.zzb(), zzmfVar, zzb(), zzbesVar3.zzb()), zzapd.zza(this.zzu), zzhm.zza((zzbif) this.zzv.zzb(), zzb())), new zzev((zzbif) this.zzx.zzb(), (zzeo) this.zzb.zzb(), zzei.zzc()));
        int i2 = asInterface + 125;
        g = i2 % 128;
        int i3 = i2 % 2;
        return zzhbVarZza;
    }

    private static void c(int i, char[] cArr, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (cArr2 != null) {
            int i4 = $11 + 17;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 79;
                $11 = i7 % 128;
                int i8 = i7 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31339), View.combineMeasuredStates(0, 0) + 2994, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16, 1182129903, false, $$c(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            long j = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 43325), View.resolveSizeAndState(0, 0, 0) + 253, ExpandableListView.getPackedPositionGroup(0L) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                int i9 = $10 + 83;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33603 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1))), 3085 - Color.green(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 27, -2146875848, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    j = 0;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i11 = $11 + 37;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i13 = $10 + 81;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i15 = $11 + 85;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                try {
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - Color.blue(0)), 3084 - MotionEvent.axisFromString(""), (ViewConfiguration.getWindowTouchSlop() >> 8) + 26, -2146875848, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    int i17 = $10 + 81;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = TuitionPaymentFragmentbindingInflater1;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 73;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i3] = Integer.valueOf(cArr[i8]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cMyPid = (char) (Process.myPid() >> 22);
                            int i10 = 1271 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1));
                            int i11 = (ExpandableListView.getPackedPositionForChild(i3, i3) > j ? 1 : (ExpandableListView.getPackedPositionForChild(i3, i3) == j ? 0 : -1)) + 19;
                            byte b2 = (byte) i3;
                            byte b3 = (byte) (b2 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, i10, i11, 407021364, false, $$c(b2, b3, (byte) (b3 & 33)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i8 /= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), View.MeasureSpec.getMode(0) + 1270, (ViewConfiguration.getLongPressTimeout() >> 16) + 18, 407021364, false, $$c(b4, b5, (byte) (b5 & 33)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i8++;
                }
                i3 = 0;
                j = 0;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i5) {
                int i12 = $10 + 61;
                $11 = i12 % 128;
                if (i12 % 2 != 0 ? bArr[setvideostabilizationmode.b] != 1 : bArr[setvideostabilizationmode.b] != 0) {
                    int i13 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 29944), 1754 - TextUtils.lastIndexOf("", '0', 0), 22 - ImageFormat.getBitsPerPixel(0), 387247676, false, $$c(b6, b7, (byte) (b7 & 34)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                } else {
                    int i14 = $10 + 79;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = setvideostabilizationmode.b;
                    Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 3225 - View.resolveSize(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 13, 2133916302, false, $$c(b8, b9, (byte) (b9 & 32)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (41241 - TextUtils.getTrimmedLength("")), View.resolveSizeAndState(0, 0, 0) + 1705, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 21, -1434471773, false, $$c(b10, b11, (byte) (b11 & 38)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i17 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i17, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i17);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            loop2: while (true) {
                setvideostabilizationmode.b = i;
                while (true) {
                    if (setvideostabilizationmode.b >= i5) {
                        break loop2;
                    }
                    int i18 = $10 + 103;
                    $11 = i18 % 128;
                    if (i18 % 2 == 0) {
                        cArr6[setvideostabilizationmode.b] = cArr3[i5 % setvideostabilizationmode.b];
                        setvideostabilizationmode.b = setvideostabilizationmode.b;
                    } else {
                        cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                        i = setvideostabilizationmode.b + 1;
                    }
                }
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            setvideostabilizationmode.b = 0;
            while (setvideostabilizationmode.b < i5) {
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                setvideostabilizationmode.b++;
                int i19 = $10 + 79;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = 3 % 5;
                }
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r13v85 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v35 */
    public static Object[] TuitionPaymentFragmentbindingInflater1(Context context, int i, int i2) {
        Class<?> cls;
        Class<?>[] clsArr;
        Object objInvoke;
        int i3;
        int iB;
        int i4;
        int i5;
        String str;
        Object[] objArr;
        int[] iArr;
        int i6;
        int i7;
        ?? r11;
        Class<?> cls2;
        int i8;
        int[] iArr2;
        int i9 = 2;
        int i10 = 2 % 2;
        int i11 = 1;
        if (context != null) {
            int i12 = g;
            int i13 = (i12 ^ 9) + ((i12 & 9) << 1);
            asInterface = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr2 = new Object[1];
                a(new int[]{0, 31, 0, 0}, false, new byte[]{1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0}, objArr2);
                try {
                    Object[] objArr3 = {(String) objArr2[0]};
                    int[] iArr3 = {31, 38, 0, 37};
                    byte[] bArr = {1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0};
                    int i15 = g + 61;
                    asInterface = i15 % 128;
                    if (i15 % 2 == 0) {
                        Object[] objArr4 = new Object[1];
                        a(iArr3, false, bArr, objArr4);
                        cls = Class.forName((String) objArr4[0]);
                        clsArr = new Class[1];
                    } else {
                        Object[] objArr5 = new Object[1];
                        a(iArr3, false, bArr, objArr5);
                        cls = Class.forName((String) objArr5[0]);
                        clsArr = new Class[1];
                    }
                    int i16 = g;
                    int i17 = (i16 & 43) + (i16 | 43);
                    asInterface = i17 % 128;
                    int i18 = i17 % 2;
                    clsArr[0] = String.class;
                    Object objNewInstance = cls.getDeclaredConstructor(clsArr).newInstance(objArr3);
                    Object[] objArr6 = new Object[1];
                    a(new int[]{69, 31, 120, 0}, false, new byte[]{1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0}, objArr6);
                    String str2 = (String) objArr6[0];
                    int i19 = g;
                    int i20 = ((i19 | 101) << 1) - (i19 ^ 101);
                    asInterface = i20 % 128;
                    int i21 = i20 % 2;
                    try {
                        Object[] objArr7 = {str2};
                        int[] iArr4 = {31, 38, 0, 37};
                        byte[] bArr2 = {1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0};
                        int i22 = i19 + 85;
                        asInterface = i22 % 128;
                        int i23 = i22 % 2;
                        Object[] objArr8 = new Object[1];
                        a(iArr4, false, bArr2, objArr8);
                        Class<?> cls3 = Class.forName((String) objArr8[0]);
                        Class<?>[] clsArr2 = {String.class};
                        int i24 = asInterface + 79;
                        g = i24 % 128;
                        int i25 = i24 % 2;
                        Object objNewInstance2 = cls3.getDeclaredConstructor(clsArr2).newInstance(objArr7);
                        try {
                            Object[] objArr9 = new Object[1];
                            a(new int[]{100, 23, 0, 12}, false, new byte[]{0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1}, objArr9);
                            Class<?> cls4 = Class.forName((String) objArr9[0]);
                            int[] iArr5 = {123, 17, 108, 4};
                            int i26 = asInterface;
                            int i27 = ((i26 | 69) << 1) - (i26 ^ 69);
                            g = i27 % 128;
                            int i28 = i27 % 2;
                            Object[] objArr10 = new Object[1];
                            a(iArr5, true, null, objArr10);
                            Object objInvoke2 = cls4.getMethod((String) objArr10[0], null).invoke(context, null);
                            try {
                                Object[] objArr11 = new Object[1];
                                a(new int[]{100, 23, 0, 12}, false, new byte[]{0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1}, objArr11);
                                Class<?> cls5 = Class.forName((String) objArr11[0]);
                                Object[] objArr12 = new Object[1];
                                a(new int[]{140, 14, 0, 3}, false, new byte[]{1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1}, objArr12);
                                try {
                                    Object[] objArr13 = {cls5.getMethod((String) objArr12[0], null).invoke(context, null), 64};
                                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 127;
                                    byte[] bArr3 = {-124, -118, -113, -127, -126, -127, -112, -118, -113, -127, -114, -120, -127, -115, -121, -116, -117, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127};
                                    int i29 = g + 67;
                                    asInterface = i29 % 128;
                                    int i30 = i29 % 2;
                                    Object[] objArr14 = new Object[1];
                                    c(scrollBarSize, null, null, bArr3, objArr14);
                                    Class<?> cls6 = Class.forName((String) objArr14[0]);
                                    Object[] objArr15 = new Object[1];
                                    a(new int[]{154, 14, 0, 6}, false, new byte[]{1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0}, objArr15);
                                    String str3 = (String) objArr15[0];
                                    Class<?>[] clsArr3 = new Class[2];
                                    clsArr3[0] = String.class;
                                    Class<?> cls7 = Integer.TYPE;
                                    int i31 = asInterface;
                                    int i32 = ((i31 | 115) << 1) - (i31 ^ 115);
                                    g = i32 % 128;
                                    if (i32 % 2 != 0) {
                                        clsArr3[1] = cls7;
                                        objInvoke = cls6.getMethod(str3, clsArr3).invoke(objInvoke2, objArr13);
                                        i3 = (PointF.length(1.0f, 0.0f) > 2.0f ? 1 : (PointF.length(1.0f, 0.0f) == 2.0f ? 0 : -1));
                                        iB = com.google.android.gms.internal.mlkit_vision_face.zznv.b();
                                        i4 = 9;
                                    } else {
                                        clsArr3[1] = cls7;
                                        objInvoke = cls6.getMethod(str3, clsArr3).invoke(objInvoke2, objArr13);
                                        i3 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        iB = com.google.android.gms.internal.mlkit_vision_face.zznv.b();
                                        i4 = 127;
                                    }
                                    int i33 = asInterface + 3;
                                    g = i33 % 128;
                                    if (i33 % 2 != 0) {
                                        i5 = ((-813) << i3) * (408 / i4);
                                    } else {
                                        int i34 = (-813) * i3;
                                        int i35 = i4 * 408;
                                        i5 = ((i35 & i34) << 1) + (i34 ^ i35);
                                    }
                                    int i36 = ~i4;
                                    int i37 = i5 + ((-814) * ((~((i36 & i3) | (i36 ^ i3))) | (~((i3 ^ iB) | (i3 & iB)))));
                                    int i38 = ~i4;
                                    int i39 = ~iB;
                                    int i40 = ~((i38 & i39) | (i38 ^ i39));
                                    int i41 = ~i3;
                                    int i42 = ~((i41 & i4) | (i41 ^ i4));
                                    int i43 = (i40 & i42) | (i40 ^ i42);
                                    int i44 = ~((i3 ^ iB) | (i3 & iB));
                                    int i45 = i37 + (((i43 & i44) | (i43 ^ i44)) * 407);
                                    int i46 = ~i3;
                                    int i47 = ~((i46 ^ i4) | (i46 & i4));
                                    int i48 = ~((i46 & iB) | (i46 ^ iB));
                                    int i49 = (i48 & i47) | (i47 ^ i48);
                                    int i50 = ~(iB | i4);
                                    int i51 = ((i49 & i50) | (i49 ^ i50)) * 407;
                                    Object[] objArr16 = new Object[1];
                                    c((i45 ^ i51) + ((i51 & i45) << 1), null, null, new byte[]{-123, -110, -126, -111, -118, -113, -127, -114, -120, -127, -115, -121, -116, -117, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr16);
                                    Class<?> cls8 = Class.forName((String) objArr16[0]);
                                    Object[] objArr17 = new Object[1];
                                    c(127 - View.MeasureSpec.makeMeasureSpec(0, 0), null, null, new byte[]{-109, -118, -124, -108, -119, -127, -126, -113, -122, -109}, objArr17);
                                    Object[] objArr18 = (Object[]) cls8.getField((String) objArr17[0]).get(objInvoke);
                                    int length = objArr18.length;
                                    int i52 = 0;
                                    while (true) {
                                        if (i52 < length) {
                                            Object obj = objArr18[i52];
                                            int i53 = -ImageFormat.getBitsPerPixel(0);
                                            int iB2 = com.google.android.gms.internal.mlkit_vision_face.zznv.b();
                                            int i54 = i53 * (-1335);
                                            int i55 = (i54 ^ (-84042)) + ((i54 & (-84042)) << i11);
                                            int i56 = -(-(((~(i53 | iB2)) | ComposerKt.defaultsKey) * (-668)));
                                            int i57 = (i55 ^ i56) + ((i55 & i56) << i11);
                                            int i58 = g;
                                            int i59 = (i58 ^ 121) + ((i58 & 121) << 1);
                                            asInterface = i59 % 128;
                                            int i60 = i59 % i9;
                                            int i61 = ~(((-127) ^ iB2) | ((-127) & iB2));
                                            int i62 = -(-(1336 * ((i61 & i53) | (i53 ^ i61))));
                                            int i63 = ((i57 | i62) << i11) - (i57 ^ i62);
                                            int i64 = (i53 ^ iB2) | (i53 & iB2);
                                            int i65 = ((i58 | 89) << i11) - (i58 ^ 89);
                                            asInterface = i65 % 128;
                                            if (i65 % i9 == 0) {
                                                int i66 = i63 << (668 << ((i64 & ComposerKt.defaultsKey) | (i64 ^ ComposerKt.defaultsKey)));
                                                Object[] objArr19 = new Object[i11];
                                                c(i66, null, null, new byte[]{-104, -105, -106, -121, -107}, objArr19);
                                                str = (String) objArr19[0];
                                            } else {
                                                int i67 = ((i64 & ComposerKt.defaultsKey) | (i64 ^ ComposerKt.defaultsKey)) * 668;
                                                Object[] objArr20 = new Object[i11];
                                                c((i63 & i67) + (i67 | i63), null, null, new byte[]{-104, -105, -106, -121, -107}, objArr20);
                                                str = (String) objArr20[0];
                                            }
                                            int i68 = asInterface + 103;
                                            g = i68 % 128;
                                            if (i68 % i9 != 0) {
                                                try {
                                                    objArr = new Object[i11];
                                                    objArr[i11] = str;
                                                    iArr = new int[]{168, 37, 0, 0};
                                                    i6 = 37;
                                                    i7 = 0;
                                                } catch (Throwable th) {
                                                    Throwable cause = th.getCause();
                                                    if (cause != null) {
                                                        throw cause;
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                objArr = new Object[]{str};
                                                i6 = 37;
                                                i7 = 0;
                                                iArr = new int[]{168, 37, 0, 0};
                                            }
                                            byte[] bArr4 = new byte[i6];
                                            // fill-array-data instruction
                                            bArr4[0] = 1;
                                            bArr4[1] = 1;
                                            bArr4[2] = 1;
                                            bArr4[3] = 1;
                                            bArr4[4] = 1;
                                            bArr4[5] = 0;
                                            bArr4[6] = 1;
                                            bArr4[7] = 1;
                                            bArr4[8] = 1;
                                            bArr4[9] = 1;
                                            bArr4[10] = 0;
                                            bArr4[11] = 0;
                                            bArr4[12] = 1;
                                            bArr4[13] = 1;
                                            bArr4[14] = 1;
                                            bArr4[15] = 0;
                                            bArr4[16] = 1;
                                            bArr4[17] = 0;
                                            bArr4[18] = 1;
                                            bArr4[19] = 0;
                                            bArr4[20] = 0;
                                            bArr4[21] = 1;
                                            bArr4[22] = 0;
                                            bArr4[23] = 1;
                                            bArr4[24] = 1;
                                            bArr4[25] = 1;
                                            bArr4[26] = 1;
                                            bArr4[27] = 1;
                                            bArr4[28] = 1;
                                            bArr4[29] = 0;
                                            bArr4[30] = 0;
                                            bArr4[31] = 0;
                                            bArr4[32] = 1;
                                            bArr4[33] = 1;
                                            bArr4[34] = 1;
                                            bArr4[35] = 1;
                                            bArr4[36] = 1;
                                            Object[] objArr21 = new Object[i11];
                                            a(iArr, i11, bArr4, objArr21);
                                            Class<?> cls9 = Class.forName((String) objArr21[i7]);
                                            Object[] objArr22 = new Object[i11];
                                            a(new int[]{MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 11, i7, i7}, i7, new byte[]{1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0}, objArr22);
                                            String str4 = (String) objArr22[i7];
                                            Class<?>[] clsArr4 = new Class[i11];
                                            clsArr4[i7] = String.class;
                                            Object objInvoke3 = cls9.getMethod(str4, clsArr4).invoke(null, objArr);
                                            try {
                                                Object[] objArr23 = new Object[i11];
                                                c(127 - (CdmaCellLocation.convertQuartSecToDecDegrees(i7) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i7) == 0.0d ? 0 : -1)), null, null, new byte[]{-118, -124, -108, -119, -127, -126, -113, -122, -103, -121, -116, -117, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr23);
                                                Class<?> cls10 = Class.forName((String) objArr23[0]);
                                                Object[] objArr24 = new Object[i11];
                                                a(new int[]{216, 11, 0, 11}, i11, new byte[]{1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1}, objArr24);
                                                try {
                                                    Object[] objArr25 = {new ByteArrayInputStream((byte[]) cls10.getMethod((String) objArr24[0], null).invoke(obj, null))};
                                                    Object[] objArr26 = new Object[i11];
                                                    a(new int[]{168, 37, 0, 0}, i11, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1}, objArr26);
                                                    Class<?> cls11 = Class.forName((String) objArr26[0]);
                                                    int i69 = asInterface;
                                                    int i70 = (i69 & 39) + (i69 | 39);
                                                    g = i70 % 128;
                                                    int i71 = i70 % 2;
                                                    int i72 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    int i73 = asInterface;
                                                    int i74 = ((i73 | 63) << i11) - (i73 ^ 63);
                                                    g = i74 % 128;
                                                    int i75 = i74 % 2;
                                                    int i76 = i72 * (-112);
                                                    int i77 = (i76 & (-14336)) + (i76 | (-14336));
                                                    int i78 = ~i;
                                                    int i79 = ~(((-129) & i78) | ((-129) ^ i78));
                                                    int i80 = i77 + (((i79 & i72) | (i72 ^ i79)) * 226);
                                                    int i81 = ~((~i72) | 128);
                                                    int i82 = ~i72;
                                                    int i83 = ~((i82 ^ i) | (i82 & i));
                                                    int i84 = (i81 ^ i83) | (i81 & i83);
                                                    int i85 = ((-129) ^ i78) | ((-129) & i78);
                                                    int i86 = i80 + (((~((i85 ^ i72) | (i72 & i85))) | i84) * (-113));
                                                    int i87 = -(-((~(((-129) & i) | ((-129) ^ i))) * 113));
                                                    int i88 = (i86 ^ i87) + ((i87 & i86) << i11);
                                                    Object[] objArr27 = new Object[i11];
                                                    c(i88, null, null, new byte[]{-118, -119, -127, -120, -122, -110, -122, -119, -124, -118, -102, -118, -119, -127, -124, -118, -126, -118, -113}, objArr27);
                                                    String str5 = (String) objArr27[0];
                                                    Class<?>[] clsArr5 = new Class[i11];
                                                    int i89 = asInterface + 31;
                                                    g = i89 % 128;
                                                    int i90 = i89 % 2;
                                                    clsArr5[0] = InputStream.class;
                                                    Object objInvoke4 = cls11.getMethod(str5, clsArr5).invoke(objInvoke3, objArr25);
                                                    int i91 = g;
                                                    int i92 = (i91 ^ 55) + ((i91 & 55) << 1);
                                                    int i93 = i92 % 128;
                                                    asInterface = i93;
                                                    if (i92 % 2 == 0) {
                                                        int i94 = 3 / 3;
                                                    }
                                                    int i95 = ((i93 | 71) << 1) - (i93 ^ 71);
                                                    g = i95 % 128;
                                                    if (i95 % 2 != 0) {
                                                        try {
                                                            Object[] objArr28 = new Object[1];
                                                            a(new int[]{227, 34, 37, 0}, true, new byte[]{0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1}, objArr28);
                                                            cls2 = Class.forName((String) objArr28[0]);
                                                            iArr2 = new int[]{261, 23, 0, 19};
                                                            r11 = 0;
                                                            i8 = 23;
                                                        } catch (Throwable th2) {
                                                            Throwable cause2 = th2.getCause();
                                                            if (cause2 != null) {
                                                                throw cause2;
                                                            }
                                                            throw th2;
                                                        }
                                                    } else {
                                                        r11 = 0;
                                                        Object[] objArr29 = new Object[1];
                                                        a(new int[]{227, 34, 37, 0}, true, new byte[]{0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1}, objArr29);
                                                        cls2 = Class.forName((String) objArr29[0]);
                                                        i8 = 23;
                                                        iArr2 = new int[]{261, 23, 0, 19};
                                                    }
                                                    byte[] bArr5 = new byte[i8];
                                                    // fill-array-data instruction
                                                    bArr5[0] = 1;
                                                    bArr5[1] = 1;
                                                    bArr5[2] = 0;
                                                    bArr5[3] = 1;
                                                    bArr5[4] = 0;
                                                    bArr5[5] = 1;
                                                    bArr5[6] = 0;
                                                    bArr5[7] = 1;
                                                    bArr5[8] = 1;
                                                    bArr5[9] = 0;
                                                    bArr5[10] = 0;
                                                    bArr5[11] = 0;
                                                    bArr5[12] = 1;
                                                    bArr5[13] = 1;
                                                    bArr5[14] = 1;
                                                    bArr5[15] = 0;
                                                    bArr5[16] = 1;
                                                    bArr5[17] = 1;
                                                    bArr5[18] = 1;
                                                    bArr5[19] = 1;
                                                    bArr5[20] = 0;
                                                    bArr5[21] = 1;
                                                    bArr5[22] = 1;
                                                    Object[] objArr30 = new Object[1];
                                                    a(iArr2, r11, bArr5, objArr30);
                                                    Object objInvoke5 = cls2.getMethod((String) objArr30[r11], null).invoke(objInvoke4, null);
                                                    int i96 = g + 71;
                                                    asInterface = i96 % 128;
                                                    int i97 = i96 % 2;
                                                    if (!objNewInstance.equals(objInvoke5)) {
                                                        int i98 = asInterface + 31;
                                                        g = i98 % 128;
                                                        int i99 = i98 % 2;
                                                        try {
                                                            Object[] objArr31 = new Object[1];
                                                            a(new int[]{227, 34, 37, 0}, true, new byte[]{0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1}, objArr31);
                                                            Class<?> cls12 = Class.forName((String) objArr31[0]);
                                                            Object[] objArr32 = new Object[1];
                                                            a(new int[]{261, 23, 0, 19}, false, new byte[]{1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1}, objArr32);
                                                            Object objInvoke6 = cls12.getMethod((String) objArr32[0], null).invoke(objInvoke4, null);
                                                            int i100 = g + 105;
                                                            asInterface = i100 % 128;
                                                            if (i100 % 2 == 0) {
                                                                objNewInstance2.equals(objInvoke6);
                                                                Object obj2 = null;
                                                                obj2.hashCode();
                                                                throw null;
                                                            }
                                                            if (!objNewInstance2.equals(objInvoke6)) {
                                                                i52 = (i52 ^ 1) + ((i52 & 1) << 1);
                                                                int i101 = asInterface;
                                                                int i102 = ((i101 | 79) << 1) - (i101 ^ 79);
                                                                g = i102 % 128;
                                                                if (i102 % 2 != 0) {
                                                                    int i103 = 5 % 2;
                                                                }
                                                                i9 = 2;
                                                                i11 = 1;
                                                            }
                                                        } catch (Throwable th3) {
                                                            Throwable cause3 = th3.getCause();
                                                            if (cause3 != null) {
                                                                throw cause3;
                                                            }
                                                            throw th3;
                                                        }
                                                    }
                                                    Object[] objArr33 = {new int[]{i}, new int[]{i ^ (i << 5)}, new int[]{(i & (-2)) | (i78 & 1)}, null};
                                                    int i104 = (((-942559356) + (((~((-516685964) | i78)) | 556996192) * (-828))) + (((-516685964) | i78) * (-828))) - 1680752220;
                                                    int i105 = i104 * (-721);
                                                    int i106 = i2 * (-721);
                                                    int i107 = ((i105 | i106) << 1) - (i105 ^ i106);
                                                    int i108 = ~i104;
                                                    int i109 = ~i2;
                                                    int i110 = ~((i108 & i109) | (i108 ^ i109));
                                                    int i111 = (i110 & i78) | (i78 ^ i110);
                                                    int i112 = (i104 ^ i2) | (i104 & i2);
                                                    int i113 = ~i112;
                                                    int i114 = (i107 - (~(((i111 & i113) | (i111 ^ i113)) * 1444))) - 1;
                                                    int i115 = ~i112;
                                                    int i116 = ~((i104 ^ i) | (i104 & i));
                                                    int i117 = (i115 & i116) | (i115 ^ i116);
                                                    int i118 = ~((i2 ^ i) | (i2 & i));
                                                    int i119 = ((i117 & i118) | (i117 ^ i118)) * (-1444);
                                                    int i120 = ((i114 | i119) << 1) - (i119 ^ i114);
                                                    int i121 = ~((~i104) | i2);
                                                    int i122 = ~i2;
                                                    int i123 = -(-((i121 | (~((i104 & i122) | (i122 ^ i104)))) * 722));
                                                    int i124 = (i120 ^ i123) + ((i123 & i120) << 1);
                                                    int i125 = (i124 << 13) ^ i124;
                                                    int i126 = i125 ^ (i125 >>> 17);
                                                    int i127 = g;
                                                    int i128 = (i127 & 65) + (i127 | 65);
                                                    asInterface = i128 % 128;
                                                    int i129 = i128 % 2;
                                                    return objArr33;
                                                } catch (Throwable th4) {
                                                    Throwable cause4 = th4.getCause();
                                                    if (cause4 != null) {
                                                        throw cause4;
                                                    }
                                                    throw th4;
                                                }
                                            } catch (Throwable th5) {
                                                Throwable cause5 = th5.getCause();
                                                if (cause5 != null) {
                                                    throw cause5;
                                                }
                                                throw th5;
                                            }
                                        }
                                        int i130 = asInterface;
                                        int i131 = ((i130 | 3) << 1) - (i130 ^ 3);
                                        g = i131 % 128;
                                        if (i131 % 2 != 0) {
                                            int i132 = 5 / 5;
                                        }
                                    }
                                } catch (Throwable th6) {
                                    Throwable cause6 = th6.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th6;
                                }
                            } catch (Throwable th7) {
                                Throwable cause7 = th7.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th7;
                            }
                        } catch (Throwable th8) {
                            Throwable cause8 = th8.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th8;
                        }
                    } catch (Throwable th9) {
                        Throwable cause9 = th9.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th9;
                    }
                } catch (Throwable th10) {
                    Throwable cause10 = th10.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th10;
                }
            } catch (Throwable unused) {
            }
        }
        Object[] objArr34 = new Object[4];
        int[] iArr6 = new int[1];
        objArr34[0] = iArr6;
        int[] iArr7 = new int[1];
        objArr34[1] = iArr7;
        int[] iArr8 = new int[1];
        objArr34[2] = iArr8;
        int i133 = g;
        int i134 = ((i133 | 5) << 1) - (5 ^ i133);
        asInterface = i134 % 128;
        if (i134 % 2 == 0) {
            iArr7[0] = i;
            ((int[]) objArr34[4])[1] = i;
        } else {
            iArr6[0] = i;
            iArr8[0] = i;
        }
        objArr34[3] = null;
        int i135 = ~((~i) | (-849945674));
        int i136 = ((((-934887008) | i135) * (-970)) - 1350703432) + ((i135 | 84941334) * 970);
        int iB3 = com.google.android.gms.internal.mlkit_vision_face.zznv.b();
        int i137 = i136 * 141;
        int i138 = -(-(i2 * (-279)));
        int i139 = (i137 ^ i138) + ((i137 & i138) << 1);
        int i140 = ((i2 ^ iB3) | (i2 & iB3)) * 140;
        int i141 = ((i139 | i140) << 1) - (i140 ^ i139);
        int i142 = ~((~i136) | i2);
        int i143 = ~iB3;
        int i144 = ~((i143 ^ i2) | (i143 & i2));
        int i145 = i141 + (((i142 & i144) | (i142 ^ i144)) * (-280));
        int i146 = ~i2;
        int i147 = (~((i146 & i136) | (i146 ^ i136))) | (~((i143 & i136) | (i143 ^ i136)));
        int i148 = i2 | (~i136);
        int i149 = -(-(((~((iB3 & i148) | (i148 ^ iB3))) | i147) * 140));
        int i150 = (i145 & i149) + (i149 | i145);
        int i151 = i150 << 13;
        int i152 = (i151 | i150) & (~(i150 & i151));
        int i153 = i152 >>> 17;
        int i154 = ((~i152) & i153) | ((~i153) & i152);
        ((int[]) objArr34[1])[0] = i154 ^ (i154 << 5);
        return objArr34;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(byte r5, short r6, byte r7) {
        /*
            int r5 = r5 * 3
            int r0 = r5 + 1
            int r7 = r7 + 67
            int r6 = r6 + 4
            byte[] r1 = com.google.android.libraries.places.internal.zzlt.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r5
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L1f
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L1f:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r1[r6]
        L25:
            int r7 = r7 + r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzlt.$$c(byte, short, byte):java.lang.String");
    }
}
