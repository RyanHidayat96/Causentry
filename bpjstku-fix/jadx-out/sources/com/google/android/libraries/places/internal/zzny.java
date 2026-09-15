package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.p002lifecycle.LiveData;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzny extends ViewModel {
    private final zznn zza;
    private final zzoa zzb;
    private final zzoz zzc;
    private Runnable zze;
    private static final byte[] $$c = {123, -2, -101, -104};
    private static final int $$f = 157;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {58, 66, -14, -31, -4, -20, -6, 6, -26, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -9, -26, 25, -42, -15, -12, -13, 2, -7, -29, 35, -47, 1, -17, -9, 20, -52, -14, -6, 1, -30, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$e = 24;
    private static final byte[] $$a = {56, 94, 119, -19, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 203;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int d = 1;
    private static char b = 1856;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 13336;
    private static char TuitionPaymentFragmentbindingInflater1 = 63406;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 51389;
    private final Handler zzd = new Handler(Looper.getMainLooper());
    private final MutableLiveData zzf = new MutableLiveData();

    /* synthetic */ zzny(zznn zznnVar, zzoa zzoaVar, zzoz zzozVar, byte[] bArr) {
        this.zza = zznnVar;
        this.zzb = zzoaVar;
        this.zzc = zzozVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r0 = 53 - r8
            byte[] r1 = com.google.android.libraries.places.internal.zzny.$$a
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2c:
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzny.a(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 84
            byte[] r0 = com.google.android.libraries.places.internal.zzny.$$d
            int r6 = 81 - r6
            int r1 = r7 + 6
            byte[] r1 = new byte[r1]
            int r7 = r7 + 5
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzny.e(short, int, int, java.lang.Object[]):void");
    }

    public final void zzb(Bundle bundle) {
        int i = 2 % 2;
        int i2 = d + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (bundle == null) {
            this.zzf.setValue(zzni.zzh());
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
    }

    private final void zzp(zzni zzniVar) {
        int i = 2 % 2;
        int i2 = d + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            zzniVar.equals(this.zzf.getValue());
            throw null;
        }
        MutableLiveData mutableLiveData = this.zzf;
        if (zzniVar.equals(mutableLiveData.getValue())) {
            return;
        }
        mutableLiveData.setValue(zzniVar);
        int i3 = d + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
    }

    private static Status zzq(Exception exc) {
        int i = 2 % 2;
        if (!(exc instanceof ApiException)) {
            Status status = new Status(13, exc.getMessage());
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
            d = i2 % 128;
            int i3 = i2 % 2;
            return status;
        }
        int i4 = d + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            ((ApiException) exc).getStatus();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Status status2 = ((ApiException) exc).getStatus();
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return status2;
    }

    private static boolean zzr(Status status) {
        int i = 2 % 2;
        int i2 = d + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (status.isCanceled() || status.getStatusCode() == 9012 || status.getStatusCode() == 9011) {
            return true;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        d = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.zza.zzc();
                this.zzd.removeCallbacks(this.zze);
                zzoa zzoaVar = this.zzb;
                zzoaVar.zzu();
                this.zzc.zza(zzoaVar);
                throw null;
            }
            this.zza.zzc();
            this.zzd.removeCallbacks(this.zze);
            zzoa zzoaVar2 = this.zzb;
            zzoaVar2.zzu();
            this.zzc.zza(zzoaVar2);
            int i3 = d + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    public final void zzc(final String str, final int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            this.zzb.zzA(str);
            throw null;
        }
        this.zzb.zzA(str);
        Runnable runnable = this.zze;
        if (runnable != null) {
            this.zzd.removeCallbacks(runnable);
        }
        if (!str.isEmpty()) {
            Runnable runnable2 = new Runnable() { // from class: com.google.android.libraries.places.internal.zznw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(str, i);
                }
            };
            this.zze = runnable2;
            this.zzd.postDelayed(runnable2, 100L);
            zzp(zzni.zzj());
            return;
        }
        int i4 = d + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        this.zza.zzc();
        zzp(zzni.zzi());
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < cArr.length) {
            int i3 = $11 + 53;
            $10 = i3 % 128;
            int i4 = 58224;
            if (i3 % 2 != 0) {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 1];
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            }
            for (int i5 = 0; i5 < 16; i5++) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i4) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-16729443) - Color.rgb(0, 0, 0)), 468 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 14, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 47773), 468 - (ViewConfiguration.getPressedStateDuration() >> 16), 12 - ExpandableListView.getPackedPositionChild(0L), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr3[0] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 2323;
                int windowTouchSlop = 44 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte b2 = (byte) ($$c[1] + 1);
                byte b3 = (byte) (b2 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionChild, capsMode, windowTouchSlop, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i6 = $10 + 43;
            $11 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public final void zze() {
        int i = 2 % 2;
        int i2 = d + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.zzb.zzC();
        int i4 = d + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void zzh() {
        int i = 2 % 2;
        int i2 = d + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.zzb.zzD();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void zzi() {
        int i = 2 % 2;
        int i2 = d + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.zzb.zzE();
        if (i3 != 0) {
            throw null;
        }
    }

    public final void zzk() {
        int i = 2 % 2;
        int i2 = d + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzd();
        int i4 = d + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void zzl() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.zze();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.zza.zze();
        int i3 = d + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void zzf() {
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            this.zzb.zzB();
            i = 1;
        } else {
            this.zzb.zzB();
            i = 0;
        }
        zzc("", i);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void zzj() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zzb.zzt();
        zzp(zzni.zzr());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void zzg(String str, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.zza.zzc();
        zzc(str, i);
        zzp(zzni.zzk());
        int i5 = d + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ void zzm(final String str, int i) {
        int i2 = 2 % 2;
        this.zza.zza(str, i).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.libraries.places.internal.zznu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task) {
                this.zza.zzn(str, task);
            }
        });
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
        d = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0241  */
    /* JADX WARN: Code duplicated, block: B:26:0x024b  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x04a7, code lost:
    
        if (r5.zzf() == com.google.android.libraries.places.internal.zzmo.PLACES_UI_KIT) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04b0, code lost:
    
        if (r5.zzf() == com.google.android.libraries.places.internal.zzmo.PLACES_UI_KIT) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x04b2, code lost:
    
        r2 = com.google.android.libraries.places.api.model.Place.builder();
        r2.setId(r30.getPlaceId());
        r0 = r2.build();
        r3.zzy();
        zzp(com.google.android.libraries.places.internal.zzni.zzo(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x04cb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x04d2, code lost:
    
        if (r5.zzf() != com.google.android.libraries.places.internal.zzmo.ONE_PLATFORM_AUTOCOMPLETE_WIDGET) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x04d4, code lost:
    
        r2 = com.google.android.libraries.places.internal.zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        com.google.android.libraries.places.internal.zzny.d = r2 % 128;
        r2 = r2 % 2;
        r3.zzy();
        zzp(com.google.android.libraries.places.internal.zzni.zzp(r30, r3.zze()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x04ec, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x04ed, code lost:
    
        r2 = r5.zzb(r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x04f5, code lost:
    
        if (r2.isComplete() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x04f7, code lost:
    
        zzp(com.google.android.libraries.places.internal.zzni.zzj());
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x04fe, code lost:
    
        r2.addOnCompleteListener(new com.google.android.libraries.places.internal.zznv(r29, r30));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0506, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(final com.google.android.libraries.places.api.model.AutocompletePrediction r30, int r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzny.zzd(com.google.android.libraries.places.api.model.AutocompletePrediction, int):void");
    }

    final /* synthetic */ void zzn(String str, Task task) {
        int i = 2 % 2;
        Object obj = null;
        if (task.isCanceled()) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            this.zzb.zzv();
            List<AutocompletePrediction> autocompletePredictions = ((FindAutocompletePredictionsResponse) task.getResult()).getAutocompletePredictions();
            if (!autocompletePredictions.isEmpty()) {
                zzp(zzni.zzl(autocompletePredictions));
                return;
            }
            int i3 = d + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 == 0) {
                zzp(zzni.zzm(str));
                return;
            } else {
                zzp(zzni.zzm(str));
                obj.hashCode();
                throw null;
            }
        }
        String message = exception.getMessage();
        if (message != null && message.contains("Too many concurrent requests")) {
            this.zzb.zzx();
            int i4 = d + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.zzb.zzw();
        Status statusZzq = zzq(exception);
        if (!zzr(statusZzq)) {
            zzp(zzni.zzn(str, statusZzq));
            return;
        }
        zzp(zzni.zzs(statusZzq));
        int i6 = d + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 2 / 0;
        }
    }

    final /* synthetic */ void zzo(AutocompletePrediction autocompletePrediction, Task task) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (43041 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3111;
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 22;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[80], (byte) 88, bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, doubleTapTimeout, touchSlop, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{5763, 24189, 53218, 46332, 47118, 38816, 21047, 28473, 149, 8577, 40026, 55597, 40738, 51656, 18884, 63355, 63179, 34418, 11008, 24589, 33127, 35566, 60846, 1394}, 22 - Drawable.resolveOpacity(0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{40106, 40157, 33504, 3723, 55744, 34596, 45742, 15934, 57022, 26271, 44961, 26608, 44233, 316, 43439, 64198, 41397, 4590}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (43043 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            int mode = View.MeasureSpec.getMode(0) + 3111;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 23;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr2[80], bArr2[5], bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, mode, iLastIndexOf, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = d + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 43042);
                int iResolveOpacity = 3111 - Drawable.resolveOpacity(0, 0);
                int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 22;
                byte[] bArr3 = $$a;
                byte b2 = bArr3[80];
                Object[] objArr6 = new Object[1];
                a(b2, (byte) (b2 | 50), (byte) (bArr3[33] - 1), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec, iResolveOpacity, touchSlop2, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[2])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int i6 = ~(System.identityHashCode(this) | 728328588);
            int i7 = ((((291382298 | i6) * (-658)) - 1325200462) + ((i6 | 269878290) * 658)) - 802208927;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{new int[1], new int[]{i5}, new int[]{i4}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{17506, 20303, 20089, 32973, 31727, 42443, 22445, 58946, 38350, 3222, 29739, 18009, 2747, 47256, 28818, 5003, 49948, 44824}, View.MeasureSpec.getMode(0) + 16, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{50093, 53779, 19617, '\t', 16639, 33707, 28639, 36180, 16507, 1669, 29383, 59293, 3719, 32855, 11512, 9289, 2411, 57133}, Color.argb(0, 0, 0, 0) + 16, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
            d = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, -802208927};
                byte b3 = (byte) ($$e - 3);
                byte[] bArr4 = $$d;
                Object[] objArr11 = new Object[1];
                e(b3, (byte) (-bArr4[38]), bArr4[15], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b4 = bArr4[12];
                Object[] objArr12 = new Object[1];
                e(b4, (byte) (-bArr4[72]), b4, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c3 = (char) (43042 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int iMakeMeasureSpec = 3111 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22;
                    byte[] bArr5 = $$a;
                    byte b5 = bArr5[80];
                    Object[] objArr13 = new Object[1];
                    a(b5, (byte) (b5 | 50), (byte) (bArr5[33] - 1), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, iMakeMeasureSpec, scrollBarFadeDuration, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(new char[]{5763, 24189, 53218, 46332, 47118, 38816, 21047, 28473, 149, 8577, 40026, 55597, 40738, 51656, 18884, 63355, 63179, 34418, 11008, 24589, 33127, 35566, 60846, 1394}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(new char[]{40106, 40157, 33504, 3723, 55744, 34596, 45742, 15934, 57022, 26271, 44961, 26608, 44233, 316, 43439, 64198, 41397, 4590}, 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c4 = (char) (43041 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        int mirror = AndroidCharacter.getMirror('0') + 3063;
                        int iLastIndexOf2 = 21 - TextUtils.lastIndexOf("", '0', 0, 0);
                        byte[] bArr6 = $$a;
                        Object[] objArr16 = new Object[1];
                        a(bArr6[80], bArr6[5], bArr6[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c4, mirror, iLastIndexOf2, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 43042);
                        int maxKeyCode = 3111 - (KeyEvent.getMaxKeyCode() >> 16);
                        int iRed = Color.red(0) + 22;
                        byte[] bArr7 = $$a;
                        Object[] objArr17 = new Object[1];
                        a(bArr7[80], (byte) 88, bArr7[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumFlingVelocity, maxKeyCode, iRed, -1272852037, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    int i14 = d + 91;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
                    int i15 = i14 % 2;
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        int i16 = d + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16 % 128;
        int i17 = i16 % 2;
        int i18 = ((int[]) objArr[0])[0];
        int i19 = ((int[]) objArr[2])[0];
        int i20 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr = {i19};
        int iIdentityHashCode = System.identityHashCode(this);
        int i21 = i18 + (-1680485770) + (((-641816881) | (~iIdentityHashCode)) * (-490)) + (((~(iIdentityHashCode | (-777083185))) | 135266304) * 490) + 571878626;
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr[0])[0] = i23 ^ (i23 << 5);
        Object[] objArr18 = {new int[1], new int[]{i20}, iArr, strArr3};
        if (task.isCanceled()) {
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
            d = i24 % 128;
            if (i24 % 2 != 0) {
                this.zzb.zzy();
                zzp(zzni.zzo(((FetchPlaceResponse) task.getResult()).getPlace()));
                return;
            } else {
                this.zzb.zzy();
                zzp(zzni.zzo(((FetchPlaceResponse) task.getResult()).getPlace()));
                int i25 = 84 / 0;
                return;
            }
        }
        this.zzb.zzz();
        Status statusZzq = zzq(exception);
        if (!zzr(statusZzq)) {
            zzp(zzni.zzq(autocompletePrediction, statusZzq));
            return;
        }
        zzp(zzni.zzs(statusZzq));
        int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
        d = i26 % 128;
        int i27 = i26 % 2;
    }

    public final LiveData zza() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData mutableLiveData = this.zzf;
        int i5 = i2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, int r8) {
        /*
            int r7 = r7 * 4
            int r7 = 108 - r7
            int r8 = r8 * 3
            int r0 = r8 + 1
            int r6 = r6 + 4
            byte[] r1 = com.google.android.libraries.places.internal.zzny.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r6 = r6 + 1
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzny.$$g(int, short, int):java.lang.String");
    }
}
