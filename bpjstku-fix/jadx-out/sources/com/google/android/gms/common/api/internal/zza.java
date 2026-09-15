package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.libraries.places.internal.zzpu;
import defpackage.AudioExecutor;
import defpackage.C0699audioExecutor;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.Threads;
import defpackage.TransformUtils;
import defpackage.abortCapture;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.getRectToRect;
import defpackage.initSession;
import defpackage.isMirrored;
import defpackage.nativeGetSurfaceInfo;
import defpackage.onCaptureSessionStart;
import defpackage.rectToVertices;
import defpackage.runOnMain;
import defpackage.sizeToRect;
import defpackage.updateSensorToBufferTransform;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.WeakHashMap;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
public final class zza extends Fragment implements LifecycleFragment {
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;
    private static final WeakHashMap zza;
    private final zzc zzb = new zzc();
    private static final byte[] $$c = {51, -99, -8, -59};
    private static final int $$f = 79;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {2, -84, 82, -15, 4, -13, 52, -29, -16, 16, 49, 4, -29, -20, 4, -5, 15, -17, 1, 5, 15, -31, 14, -9, 13, -4, 3, 32, -15, -22, 14, 10, -7, -4, 48, -42, 19, -4, -4, 10, -7, -4, 3, 5, 13, 4, -4, 10, -9, 5, -3, 4, 5, -3, 11, 3, -16, 15, 6, -16, 44, -32, 13, 1, -5, 10, 1, 1, 7, -18, 11, -6, 67, -10, 4, 65, -55, -6, 2, 10, -3, 9, 57, -49, -11, 12, -12, 5, 8, 7, 56, -60, 5, 9, -14, 19, -15, 11, 6, -12, 71, -64, 6, 13, 0, 0, -12, 71, -49, -13, 9, Base64.padSymbol, -61, 0, 13, 1, -5, 64, -74, 2, 25, -13, -10, 4, 65, -50, -12, 8, -7, 1, 11, -8, 73, -69, 3, 13, -1, 64, -51, -10, 3, -3, 1, 21, -11, -4, 72, -21, -29, -15, 20, 4, -17, 13, -4, 3, 45, -42, 13, 1, 67, -46, -31, 14, -9, 13, -4, 3, 32, -15, -22, 14, 10, -7, -4, 48, -42, 19, -4, -4, 10, -7, -4, 3, 5, 13, 4, -4, 10, -9, 5, -3, 4, 5, -3, 11, 3, -16, 15, 6, -16, 44, -32, 13, 1, -5, 10, 1, 1, 7, -18, 11, -6, 69, -10, 4, 65, -55, -6, 2, 10, -3, 9, 57, -49, -11, 12, -12, 5, 8, 7, 56, -55, -4, -4, 71, -61, 10, 6, -16, 0, 5, 15, -6, 10, -7, -4, 72, -57, -3, -4, 17, -11, 6, 15, -9, 64, -74, 2, 13, 14, -31, 14, -9, 13, -4, 3, 32, -15, -22, 14, 10, -7, -4, 48, -42, 19, -4, -4, 10, -7, -4, 20, -5, -3, 12, -3, -3, 9, 32, -35, 10, -4, 13, -17, 17, -11, 67, -10, 4, 65, -55, -6, 2, 10, -3, 9, 57, -49, -11, 12, -12, 5, 8, 7, 56, -55, -4, -4, 71, -60, -1, 14, 4, -17, 13, -4, 3, 66, -74, 2, 4, -10, 4, 65, -55, -6, 2, 10, -3, 9, 57, -49, -11, 12, -12, 5, 8, 7, 56, -55, -4, -4, 71, -57, -3, -4, 17, -11, 6, 15, -9, 64, -61, 3, 3, 4, -9, 23, -21, 15, -8, 12, -4, 3, 17, -5, 7, 0, 0, 57, -74, 2, 16, 2, -31, 14, -9, 13, -4, 3, 32, -15, -22, 14, 10, -7, -4, 48, -42, 19, -4, -4, 10, -7, -4, 3, 5, 13, 4, -4, 10, -9, 5, -3, 4, 5, -3, 11, 3, -16, 15, 6, -16, 44, -32, 13, 1, -5, 10, 1, 1, 7, -18, 11, -6, 69, -10, 4, 65, -50, -12, 8, -7, 1, 11, -8, 73, -52, 5, -17, 21, 1, -5, -3, 12, -3, -3, 9, 59, -17, -32, -15, 13, -11, 15, -9, -3, 58, -48, 12, 0, 27, -17, -12, 12, 4, -5, 29, -12, -9, 13, -15, 11, 6, 3, 15, -22, -1, 9, 8, -11, 34, -17, 0, 0, -8, 1, 4, 19, -17, 13, -4, 3, 46, -37, -3, 12, -3, -3, 9};
    private static final int $$e = 160;
    private static final byte[] $$a = {Base64.padSymbol, -108, 49, -100, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 18;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;

    static {
        b = 1;
        TuitionPaymentFragmentbindingInflater1();
        zza = new WeakHashMap();
        int i = TuitionPaymentFragmentbindingInflater1 + 117;
        b = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 84
            byte[] r0 = com.google.android.gms.common.api.internal.zza.$$a
            int r7 = 213 - r7
            int r1 = 53 - r8
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r7 = r7 + 1
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2a:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            r7 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zza.c(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r0 = 93 - r7
            int r6 = 103 - r6
            int r5 = 436 - r5
            byte[] r1 = com.google.android.gms.common.api.internal.zza.$$d
            byte[] r0 = new byte[r0]
            int r7 = 92 - r7
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r5 = r5 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            r3 = r1[r5]
        L26:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + 2
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zza.d(short, short, byte, java.lang.Object[]):void");
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void addCallback(String str, LifecycleCallback lifecycleCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.zzb.zzd(str, lifecycleCallback);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final <T extends LifecycleCallback> T getCallbackOrNull(String str, Class<T> cls) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.zzb.zzc(str, cls);
            throw null;
        }
        T t = (T) this.zzb.zzc(str, cls);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final Activity getLifecycleActivity() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Activity activity = getActivity();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return activity;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isCreated() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zZzm = this.zzb.zzm();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return zZzm;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isStarted() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        zzc zzcVar = this.zzb;
        if (i3 == 0) {
            return zzcVar.zzn();
        }
        zzcVar.zzn();
        throw null;
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.zzb.zze(str, fileDescriptor, printWriter, strArr);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            super.onActivityResult(i, i2, intent);
            this.zzb.zzf(i, i2, intent);
        } else {
            super.onActivityResult(i, i2, intent);
            this.zzb.zzf(i, i2, intent);
            int i5 = 22 / 0;
        }
    }

    public static zza zza(Activity activity) {
        int i = 2 % 2;
        WeakHashMap weakHashMap = zza;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            zza zzaVar = (zza) weakReference.get();
            if (zzaVar != null) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                int i4 = i3 % 2;
                return zzaVar;
            }
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 5;
            }
        }
        try {
            zza zzaVar2 = (zza) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zzaVar2 == null || zzaVar2.isRemoving()) {
                zzaVar2 = new zza();
                activity.getFragmentManager().beginTransaction().add(zzaVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(zzaVar2));
            return zzaVar2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $10 + 101;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 64838), 1356 - ((Process.getThreadPriority(0) + 20) >> 6), Drawable.resolveOpacity(0, 0) + 38, 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 47774), 468 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $11 + 41;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) throws Throwable {
        String str;
        Object[] objArr;
        Object[] objArr2;
        int i;
        Object[] objArr3;
        String str2;
        Object[] objArr4;
        Object[] objArr5;
        int i2;
        String str3;
        Object[] objArr6;
        Object[] objArr7;
        Object[] objArr8;
        char c;
        int i3;
        Object[] objArr9;
        int i4;
        Object obj;
        String str4;
        Object[] objArr10;
        char c2;
        Object[] objArr11;
        Object[] objArr12;
        char c3;
        int i5;
        Object[] objArr13;
        Object[] objArr14;
        char c4;
        char c5;
        Object[] objArr15;
        Object[] objArr16;
        char c6;
        int i6;
        Object[] objArr17;
        int i7 = 2 % 2;
        Object[] objArr18 = new Object[1];
        a(new char[]{50354, 544, 29417, 50387, 21508, 20025, 60003, 45331, 62721, 31770, 47175, 17259, 42853, 45692, 36449, 7498, 20831, 57432, 23583, 11928, 943, 4484, 4827, 63678, 15773, 18312}, AndroidCharacter.getMirror('0') - '/', objArr18);
        String str5 = (String) objArr18[0];
        Object[] objArr19 = new Object[1];
        a(new char[]{18205, 12582, 61075, 18296, 55159, 32061, 30236, 12898, 30386, 20240, 9277, 49252, 9408, 33128, 4697, 40478, 53984, 54080, 49268}, Drawable.resolveOpacity(0, 0) + 1, objArr19);
        String str6 = (String) objArr19[0];
        Object[] objArr20 = new Object[1];
        a(new char[]{30322, 29988, 30078, 30232, 38528, 14642, 60902, 29572, 18304, 2843, 49109, 33199, 5549, 50469, 35211, 57316, 58261, 38747, 23449, 60436}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr20);
        String str7 = (String) objArr20[0];
        Object[] objArr21 = new Object[1];
        a(new char[]{20987, 23101, 35333, 20882, 10158, 5678, 4750, 49829, 24659, 9223, 16571, 12438, 12811, 60019, 30416, 28379, 50220, 47193, 42211, 23858}, 1 - (Process.myPid() >> 22), objArr21);
        String str8 = (String) objArr21[0];
        Object[] objArr22 = new Object[1];
        a(new char[]{42950, 64761, 55557, 42919, 58960, 45280, 16783, 839, 38517, 33475, 5035, 61759, 50207, 19622, 9683, 44899, 12819, 7825, 63475, 40128, 24768, 61303, 47407, 19196, 24286, 47442, 19277, 14468, 35983, 35586}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr22);
        String str9 = (String) objArr22[0];
        Object[] objArr23 = new Object[1];
        a(new char[]{2759, 29264, 38401, 2724, 30232, 15954, 3741, 37647, 15230, 3181, 23743, 24856, 26895, 49679, 27339, 16236, 40752, 36922, 47351, 3208, 52696, 25049}, -ImageFormat.getBitsPerPixel(0), objArr23);
        String str10 = (String) objArr23[0];
        int i8 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i9 = ~((int) Process.getElapsedCpuTime());
        if (i8 != (-1207001997) + (((-542340559) | (~(1372328101 | i9))) * (-983)) + (((~((-542340559) | i9)) | 4198532) * 983)) {
            throw new RuntimeException(String.valueOf(-38668086));
        }
        int i10 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i11 = ~iIdentityHashCode;
        if (i10 != 1135938500 + (((~(iIdentityHashCode | 1649970159)) | (-929085806) | (~((-1649970160) | i11))) * (-564)) + ((~((-354430977) | iIdentityHashCode)) * 1128) + (((~((-929085806) | i11)) | (-2004401136)) * 564)) {
            throw null;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 43042);
            int trimmedLength = TextUtils.getTrimmedLength("") + 3111;
            int keyRepeatDelay = 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr24 = new Object[1];
            c(b3, (short) (b3 | 210), b2, objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, trimmedLength, keyRepeatDelay, -1272852037, false, (String) objArr24[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char packedPositionType = (char) (43042 - ExpandableListView.getPackedPositionType(0L));
                int i12 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3111;
                int scrollDefaultDelay = 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte b4 = $$a[7];
                Object[] objArr25 = new Object[1];
                c(b4, (short) (b4 | 158), (byte) ($$b - 3), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, i12, scrollDefaultDelay, 154975793, false, (String) objArr25[0], null);
            }
            Object[] objArr26 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i13 = ((int[]) objArr26[2])[0];
            int i14 = ((int[]) objArr26[1])[0];
            String[] strArr = (String[]) objArr26[3];
            int[] iArr = {i14};
            str = str6;
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i15 = ~iElapsedRealtime;
            int i16 = 382624002 + ((~(619774124 | i15)) * (-560)) + ((~(iElapsedRealtime | (-1074706003))) * (-560)) + (((~(1085257334 | i15)) | 609222792) * 560) + 1340751718;
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
            objArr = new Object[]{new int[1], iArr, new int[]{i13}, strArr};
        } else {
            str = str6;
            try {
                Object[] objArr27 = {null, Integer.valueOf(((Integer) Class.forName(str7).getMethod(str8, Object.class).invoke(null, this)).intValue()), 0, 1340751718};
                int i19 = $$e;
                byte[] bArr = $$d;
                byte b5 = bArr[104];
                Object[] objArr28 = new Object[1];
                d((short) (i19 | 273), b5, (byte) (b5 | 75), objArr28);
                Class<?> cls = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                d((short) (i19 | 256), bArr[36], (byte) (i19 >>> 2), objArr29);
                Object[] objArr30 = (Object[]) cls.getMethod((String) objArr29[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr27);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char mirror = (char) (43090 - AndroidCharacter.getMirror('0'));
                    int i20 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3110;
                    int i21 = 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    byte b6 = $$a[7];
                    Object[] objArr31 = new Object[1];
                    c(b6, (short) (b6 | 158), (byte) ($$b - 3), objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, i20, i21, 154975793, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr30);
                try {
                    long jLongValue = ((Long) Class.forName(str5).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cAxisFromString = (char) (43041 - MotionEvent.axisFromString(""));
                        int iRed = 3111 - Color.red(0);
                        int keyRepeatTimeout = 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr32 = new Object[1];
                        c(b8, (short) (b8 | 121), b7, objArr32);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAxisFromString, iRed, keyRepeatTimeout, -1269618118, false, (String) objArr32[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cResolveSize = (char) (View.resolveSize(0, 0) + 43042);
                        int i22 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3111;
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 22;
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr33 = new Object[1];
                        c(b10, (short) (b10 | 210), b9, objArr33);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSize, i22, absoluteGravity, -1272852037, false, (String) objArr33[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                    objArr = objArr30;
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
        int i23 = ((int[]) objArr[1])[0];
        int i24 = ((int[]) objArr[2])[0];
        if (i24 == i23) {
            int i25 = ((int[]) objArr[0])[0];
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr2 = {i27};
            int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            int i28 = i25 + (-813662414) + (((~((-1326895708) | iElapsedRealtime2)) | (-378135752)) * (-948)) + ((~((~iElapsedRealtime2) | (-100712516))) * (-948)) + 1514470252;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr2[0])[0] = i30 ^ (i30 << 5);
            objArr2 = new Object[]{new int[1], iArr2, new int[]{i26}, strArr2};
            i = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str11 : strArr3) {
                    arrayList.add(str11);
                }
            }
            Toast.makeText((Context) null, i24 / (((i24 - 1) * i24) % 2), 0).show();
            int i31 = ((int[]) objArr[0])[0];
            int i32 = ((int[]) objArr[2])[0];
            int i33 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr3 = {i32};
            int[] iArr4 = {i33};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i34 = i31 + ((~((-268862977) | iIdentityHashCode2)) * 521) + 1100925538 + (((~((~iIdentityHashCode2) | (-268862977))) | 160968896) * 521);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            i = 0;
            ((int[]) objArr2[0])[0] = i36 ^ (i36 << 5);
            objArr2 = new Object[]{new int[1], iArr4, iArr3, strArr4};
        }
        ((Field) C0699audioExecutor.TuitionPaymentFragmentbindingInflater1[i]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1624059296, 556940060, 1516299484}, ((int[]) objArr2[i])[i], Integer.MAX_VALUE) - (-251030993));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(i, i);
            int maxKeyCode = 1031 - (KeyEvent.getMaxKeyCode() >> 16);
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 16;
            byte b11 = $$a[7];
            byte b12 = b11;
            Object[] objArr34 = new Object[1];
            c(b12, (short) (b12 | 210), b11, objArr34);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec, maxKeyCode, modifierMetaStateMask, 1357589585, false, (String) objArr34[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
        long jLongValue2 = ((Long) Class.forName(str5).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char modifierMetaStateMask2 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
            int iIndexOf = 1031 - TextUtils.indexOf("", "", 0);
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 15;
            byte b13 = $$a[7];
            byte b14 = b13;
            Object[] objArr35 = new Object[1];
            c(b14, (short) (b14 | 121), b13, objArr35);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(modifierMetaStateMask2, iIndexOf, fadingEdgeLength, 1344079056, false, (String) objArr35[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                int packedPositionChild = 1030 - ExpandableListView.getPackedPositionChild(0L);
                int iNormalizeMetaState = 15 - KeyEvent.normalizeMetaState(0);
                Object[] objArr36 = new Object[1];
                c((byte) ($$b - 4), (short) 69, (byte) 52, objArr36);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cLastIndexOf, packedPositionChild, iNormalizeMetaState, 632103528, false, (String) objArr36[0], null);
            }
            Object[] objArr37 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
            objArr3 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i37 = ((int[]) objArr37[3])[0];
            int i38 = ((int[]) objArr37[1])[0];
            String[] strArr5 = (String[]) objArr37[0];
            int iElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
            int i39 = ~iElapsedRealtime3;
            int i40 = (((((~(i39 | 812969870)) | ((~(568689700 | i39)) | (~((-812969871) | iElapsedRealtime3)))) * 959) - 519269070) + (((~(iElapsedRealtime3 | 812969870)) | ((~(i39 | (-812969871))) | (~(568689700 | iElapsedRealtime3)))) * 959)) - 590192099;
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr3[2])[0] = i42 ^ (i42 << 5);
            int i43 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i43 % 128;
            int i44 = i43 % 2;
        } else {
            int iIntValue = ((Integer) Class.forName(str7).getMethod(str8, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr38 = {2073362654};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) (46037 - Process.getGidForName("")), TextUtils.getOffsetAfter("", 0) + 1134, 18 - Color.alpha(0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr39 = {Integer.valueOf(iIntValue), 0, -590192099, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).newInstance(objArr38), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int i45 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1031;
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 15;
                    byte b15 = $$a[7];
                    byte b16 = b15;
                    Object[] objArr40 = new Object[1];
                    c(b16, (short) (b16 | 210), b15, objArr40);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cIndexOf, i45, iKeyCodeFromString, 1298546779, false, (String) objArr40[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 1117 - View.resolveSizeAndState(0, 0, 0), 17 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), Boolean.TYPE});
                }
                objArr3 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr39);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                    int iGreen = 1031 - Color.green(0);
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 15;
                    Object[] objArr41 = new Object[1];
                    c((byte) ($$b - 4), (short) 69, (byte) 52, objArr41);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(packedPositionChild2, iGreen, edgeSlop, 632103528, false, (String) objArr41[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, objArr3);
                try {
                    long jLongValue3 = ((Long) Class.forName(str5).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int iArgb = Color.argb(0, 0, 0, 0) + 1031;
                        int iMyPid = (Process.myPid() >> 22) + 15;
                        byte b17 = $$a[7];
                        byte b18 = b17;
                        Object[] objArr42 = new Object[1];
                        c(b18, (short) (b18 | 121), b17, objArr42);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(maximumDrawingCacheSize, iArgb, iMyPid, 1344079056, false, (String) objArr42[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                        int i46 = 1031 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int iIndexOf2 = 15 - TextUtils.indexOf("", "", 0, 0);
                        byte b19 = $$a[7];
                        byte b20 = b19;
                        Object[] objArr43 = new Object[1];
                        c(b20, (short) (b20 | 210), b19, objArr43);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cRgb, i46, iIndexOf2, 1357589585, false, (String) objArr43[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (((int[]) objArr3[3])[0] != ((int[]) objArr3[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr6 = (String[]) objArr3[0];
            if (strArr6 != null) {
                for (String str12 : strArr6) {
                    arrayList2.add(str12);
                }
            }
            throw null;
        }
        int i47 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i47 % 128;
        int i48 = i47 % 2;
        Object[] objArr44 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i49 = ((int[]) objArr3[2])[0];
        int i50 = ((int[]) objArr3[3])[0];
        int i51 = ((int[]) objArr3[1])[0];
        String[] strArr7 = (String[]) objArr3[0];
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i52 = i49 + 1831667045 + (((~((-9576769) | iIdentityHashCode3)) | 253856938) * (-756)) + (((~iIdentityHashCode3) | (-9576769)) * 756);
        int i53 = (i52 << 13) ^ i52;
        int i54 = i53 ^ (i53 >>> 17);
        Object obj2 = objArr44[2];
        ((int[]) obj2)[0] = i54 ^ (i54 << 5);
        ((Field) AudioExecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1966723509, 602556370, 1151756470}, ((int[]) obj2)[0], Integer.MAX_VALUE) - (-747659573));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
            char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0) + 31534);
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 921;
            int mirror2 = AndroidCharacter.getMirror('0') - 20;
            Object[] objArr45 = new Object[1];
            c((byte) ($$b - 4), (short) 69, (byte) 52, objArr45);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cLastIndexOf2, offsetAfter, mirror2, -1048449946, false, (String) objArr45[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                char cResolveSize2 = (char) (31533 - View.resolveSize(0, 0));
                int iMyTid = (Process.myTid() >> 22) + 921;
                int i55 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27;
                byte b21 = $$a[7];
                Object[] objArr46 = new Object[1];
                c(b21, (short) (b21 | 158), (byte) ($$b - 3), objArr46);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cResolveSize2, iMyTid, i55, -1142834547, false, (String) objArr46[0], null);
            }
            Object[] objArr47 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).get(null);
            objArr4 = new Object[]{new int[1], new int[]{((int[]) objArr47[1])[0]}, (Object[]) objArr47[2], new int[]{((int[]) objArr47[3])[0]}, (String[]) objArr47[4]};
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i56 = ~iIdentityHashCode4;
            int i57 = 472914295 + (((~((-234697301) | i56)) | 163647556 | (~((-1539382344) | i56)) | (~(1610432087 | iIdentityHashCode4))) * (-84));
            int i58 = (~(iIdentityHashCode4 | (-1539382344))) | 234697300;
            int i59 = ~(i56 | 1539382343);
            int i60 = ((i57 + ((i58 | i59) * (-84))) + (((-1610432088) | i59) * 84)) - 1539076545;
            int i61 = (i60 << 13) ^ i60;
            int i62 = i61 ^ (i61 >>> 17);
            ((int[]) objArr4[0])[0] = i62 ^ (i62 << 5);
            str2 = str10;
        } else {
            Context applicationContext = (Context) Class.forName(str9).getMethod(str2, new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    str2 = str10;
                    applicationContext = null;
                } else {
                    str2 = str10;
                    str2 = str10;
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            str2 = str10;
            Object[] objArr48 = {applicationContext, Integer.valueOf(((Integer) Class.forName(str7).getMethod(str8, Object.class).invoke(null, this)).intValue()), 0, -1539076545};
            byte[] bArr2 = $$d;
            Object[] objArr49 = new Object[1];
            d((short) 364, bArr2[4], (byte) (bArr2[60] - 1), objArr49);
            Class<?> cls2 = Class.forName((String) objArr49[0]);
            Object[] objArr50 = new Object[1];
            d((short) 315, bArr2[19], (byte) 92, objArr50);
            Object[] objArr51 = (Object[]) cls2.getMethod((String) objArr50[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr48);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                char cIndexOf2 = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0'));
                int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 921;
                int i63 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 28;
                byte b22 = $$a[7];
                Object[] objArr52 = new Object[1];
                c(b22, (short) (b22 | 158), (byte) ($$b - 3), objArr52);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cIndexOf2, packedPositionType2, i63, -1142834547, false, (String) objArr52[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, objArr51);
            try {
                long jLongValue4 = ((Long) Class.forName(str5).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                    char c7 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31532);
                    int packedPositionGroup = 921 - ExpandableListView.getPackedPositionGroup(0L);
                    int iLastIndexOf = 27 - TextUtils.lastIndexOf("", '0');
                    byte b23 = $$a[7];
                    byte b24 = b23;
                    Object[] objArr53 = new Object[1];
                    c(b24, (short) (b24 | 121), b23, objArr53);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(c7, packedPositionGroup, iLastIndexOf, -778300370, false, (String) objArr53[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                    char maximumDrawingCacheSize2 = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31533);
                    int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 922;
                    int defaultSize = 28 - View.getDefaultSize(0, 0);
                    Object[] objArr54 = new Object[1];
                    c((byte) ($$b - 4), (short) 69, (byte) 52, objArr54);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(maximumDrawingCacheSize2, iIndexOf3, defaultSize, -1048449946, false, (String) objArr54[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).set(null, lValueOf6);
                objArr4 = objArr51;
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
        }
        int i64 = ((int[]) objArr4[1])[0];
        int i65 = ((int[]) objArr4[3])[0];
        if (i65 == i64) {
            int i66 = ((int[]) objArr4[0])[0];
            objArr5 = new Object[]{new int[1], new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[]{((int[]) objArr4[3])[0]}, (String[]) objArr4[4]};
            int iElapsedRealtime4 = (int) SystemClock.elapsedRealtime();
            int i67 = ~iElapsedRealtime4;
            int i68 = ~((-21217444) | i67);
            int i69 = ~((-1752862201) | iElapsedRealtime4);
            int i70 = i66 + (-414465930) + ((i68 | i69) * 1150) + (((~(1752862200 | i67)) | i69) * (-575)) + (((~(iElapsedRealtime4 | (-21217444))) | (~(i67 | 21217443))) * 575);
            int i71 = (i70 << 13) ^ i70;
            int i72 = i71 ^ (i71 >>> 17);
            i2 = 0;
            ((int[]) objArr5[0])[0] = i72 ^ (i72 << 5);
        } else {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr8 = (String[]) objArr4[4];
            if (strArr8 != null) {
                for (String str13 : strArr8) {
                    arrayList3.add(str13);
                }
            }
            int[] iArr5 = new int[i65];
            int i73 = i65 - 1;
            iArr5[i73] = 1;
            Toast.makeText((Context) null, iArr5[((i65 * i73) % 2) - 1], 1).show();
            int i74 = ((int[]) objArr4[0])[0];
            objArr5 = new Object[]{new int[1], new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[]{((int[]) objArr4[3])[0]}, (String[]) objArr4[4]};
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i75 = i74 + ((((~((-934371220) | iIdentityHashCode5)) | 95490195) * (-566)) - 13044835) + ((~(iIdentityHashCode5 | (-838881025))) * 566);
            int i76 = (i75 << 13) ^ i75;
            int i77 = i76 ^ (i76 >>> 17);
            i2 = 0;
            ((int[]) objArr5[0])[0] = i77 ^ (i77 << 5);
        }
        ((Field) sizeToRect.TuitionPaymentFragmentbindingInflater1[i2]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1190331092, 2090589526, 938801286}, ((int[]) objArr5[i2])[i2], Integer.MAX_VALUE) - (-931038926));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
            char c8 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int deadChar = KeyEvent.getDeadChar(i2, i2) + 876;
            int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 10;
            byte b25 = $$a[7];
            Object[] objArr55 = new Object[1];
            c(b25, (short) (b25 | 158), (byte) ($$b - 3), objArr55);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(c8, deadChar, packedPositionType3, -1650998592, false, (String) objArr55[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).getLong(null);
        long jLongValue5 = ((Long) Class.forName(str5).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
            char offsetAfter2 = (char) TextUtils.getOffsetAfter("", 0);
            int iLastIndexOf2 = 875 - TextUtils.lastIndexOf("", '0');
            int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 10;
            byte b26 = $$a[7];
            byte b27 = b26;
            Object[] objArr56 = new Object[1];
            c(b27, (short) (b27 | 121), b26, objArr56);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(offsetAfter2, iLastIndexOf2, fadingEdgeLength2, 2012020043, false, (String) objArr56[0], null);
        }
        if (j2 == ((jLongValue5 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 876;
                int absoluteGravity2 = 10 - Gravity.getAbsoluteGravity(0, 0);
                byte b28 = $$a[7];
                byte b29 = b28;
                Object[] objArr57 = new Object[1];
                c(b29, (short) (b29 | 210), b28, objArr57);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(cMyTid, jumpTapTimeout, absoluteGravity2, 2012931276, false, (String) objArr57[0], null);
            }
            Object[] objArr58 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).get(null);
            objArr6 = new Object[]{new int[]{((int[]) objArr58[0])[0]}, new int[1], new int[]{((int[]) objArr58[2])[0]}, (String[]) objArr58[3]};
            int iElapsedRealtime5 = (int) SystemClock.elapsedRealtime();
            int i78 = ~((-1004352243) | iElapsedRealtime5);
            int i79 = ~iElapsedRealtime5;
            int i80 = 1352257108 + ((i78 | (~((-964042014) | i79))) * (-1808)) + (((~((-42541795) | iElapsedRealtime5)) | (~(i79 | (-2231566)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iElapsedRealtime5 | 964042013)) | 961810448 | (~(1004352242 | i79))) * TypedValues.Custom.TYPE_BOOLEAN) + 917875215;
            int i81 = (i80 << 13) ^ i80;
            int i82 = i81 ^ (i81 >>> 17);
            ((int[]) objArr6[1])[0] = i82 ^ (i82 << 5);
            str3 = str;
        } else {
            Context applicationContext2 = (Context) Class.forName(str9).getMethod(str2, new Class[0]).invoke(null, null);
            if (applicationContext2 != null) {
                applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : applicationContext2.getApplicationContext();
            }
            Object[] objArr59 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(str7).getMethod(str8, Object.class).invoke(null, this)).intValue()), 0, 917875215};
            byte[] bArr3 = $$d;
            Object[] objArr60 = new Object[1];
            d((short) 315, bArr3[4], bArr3[104], objArr60);
            Class<?> cls3 = Class.forName((String) objArr60[0]);
            int i83 = $$e;
            Object[] objArr61 = new Object[1];
            d((short) (i83 | 256), bArr3[36], (byte) (i83 >>> 2), objArr61);
            Object[] objArr62 = (Object[]) cls3.getMethod((String) objArr61[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr59);
            if (applicationContext2 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                    char c9 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                    int trimmedLength2 = 876 - TextUtils.getTrimmedLength("");
                    int mode = 10 - View.MeasureSpec.getMode(0);
                    byte b30 = $$a[7];
                    byte b31 = b30;
                    Object[] objArr63 = new Object[1];
                    c(b31, (short) (b31 | 210), b30, objArr63);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(c9, trimmedLength2, mode, 2012931276, false, (String) objArr63[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, objArr62);
                try {
                    str3 = str;
                    long jLongValue6 = ((Long) Class.forName(str5).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf7 = Long.valueOf(jLongValue6);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                        char cMyTid2 = (char) (Process.myTid() >> 22);
                        int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 876;
                        int longPressTimeout = 10 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte b32 = $$a[7];
                        byte b33 = b32;
                        Object[] objArr64 = new Object[1];
                        c(b33, (short) (b33 | 121), b32, objArr64);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cMyTid2, maxKeyCode2, longPressTimeout, 2012020043, false, (String) objArr64[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, lValueOf7);
                    Long lValueOf8 = Long.valueOf(jLongValue6 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                        char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                        int iResolveSizeAndState = 876 - View.resolveSizeAndState(0, 0, 0);
                        int iIndexOf4 = TextUtils.indexOf("", "", 0, 0) + 10;
                        byte b34 = $$a[7];
                        Object[] objArr65 = new Object[1];
                        c(b34, (short) (b34 | 158), (byte) ($$b - 3), objArr65);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(capsMode, iResolveSizeAndState, iIndexOf4, -1650998592, false, (String) objArr65[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, lValueOf8);
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            } else {
                str3 = str;
                objArr62 = objArr62;
            }
            objArr6 = objArr62;
        }
        int i84 = ((int[]) objArr6[2])[0];
        int i85 = ((int[]) objArr6[0])[0];
        if (i85 != i84) {
            throw new RuntimeException(String.valueOf(i85));
        }
        int i86 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i86 % 128;
        int i87 = i86 % 2;
        int i88 = ((int[]) objArr6[1])[0];
        Object[] objArr66 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
        int iMyPid2 = Process.myPid();
        int i89 = (~((-860997339) | iMyPid2)) | 51463898;
        int i90 = i88 + 1521273620 + (i89 * 992) + ((i89 | (~((~iMyPid2) | (-11153670)))) * (-496)) + ((iMyPid2 | (-820687110)) * 496);
        int i91 = i90 ^ (i90 << 13);
        int i92 = i91 ^ (i91 >>> 17);
        Object obj3 = objArr66[1];
        ((int[]) obj3)[0] = i92 ^ (i92 << 5);
        ((Field) updateSensorToBufferTransform.TuitionPaymentFragmentbindingInflater1[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1578833770, 803559425, 249907576}, ((int[]) obj3)[0], Integer.MAX_VALUE) + 247772000);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
            char cMyPid = (char) (Process.myPid() >> 22);
            int trimmedLength3 = TextUtils.getTrimmedLength("") + 876;
            int i93 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
            Object[] objArr67 = new Object[1];
            c((byte) (-$$a[153]), (short) 69, (byte) 42, objArr67);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cMyPid, trimmedLength3, i93, -1199417970, false, (String) objArr67[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).getLong(null);
        long jLongValue7 = ((Long) Class.forName(str5).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
            char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int iRgb = Color.rgb(0, 0, 0) + 16778092;
            int offsetAfter3 = TextUtils.getOffsetAfter("", 0) + 10;
            byte b35 = (byte) (-$$a[33]);
            Object[] objArr68 = new Object[1];
            c(b35, (short) (b35 | 43), (byte) 52, objArr68);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(keyRepeatDelay2, iRgb, offsetAfter3, 254769921, false, (String) objArr68[0], null);
        }
        if (j3 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).getLong(null) << 52) >>> 52)) >> 12)) {
            int i94 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i94 % 128;
            int i95 = i94 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                char c10 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int doubleTapTimeout = 876 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iLastIndexOf3 = 9 - TextUtils.lastIndexOf("", '0', 0, 0);
                byte[] bArr4 = $$a;
                Object[] objArr69 = new Object[1];
                c((byte) (-bArr4[153]), (short) ($$b | 41), (byte) (-bArr4[44]), objArr69);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(c10, doubleTapTimeout, iLastIndexOf3, 1324201839, false, (String) objArr69[0], null);
            }
            Object[] objArr70 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).get(null);
            objArr7 = new Object[]{new int[]{((int[]) objArr70[0])[0]}, new int[1], new int[]{((int[]) objArr70[2])[0]}, (String[]) objArr70[3]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i96 = (((143013812 + (((~(703227044 | iFreeMemory)) | 68229721) * 104)) + ((~((~iFreeMemory) | (-27919493))) * (-104))) + ((iFreeMemory | 743537273) * 104)) - 2083299510;
            int i97 = (i96 << 13) ^ i96;
            int i98 = i97 ^ (i97 >>> 17);
            ((int[]) objArr7[1])[0] = i98 ^ (i98 << 5);
        } else {
            Object[] objArr71 = {Integer.valueOf(((Integer) Class.forName(str7).getMethod(str8, Object.class).invoke(null, this)).intValue()), -2083299510};
            byte[] bArr5 = $$d;
            Object[] objArr72 = new Object[1];
            d((short) 223, bArr5[4], bArr5[156], objArr72);
            Class<?> cls4 = Class.forName((String) objArr72[0]);
            Object[] objArr73 = new Object[1];
            d((short) ($$e | 16), bArr5[36], (byte) (-bArr5[76]), objArr73);
            Object[] objArr74 = (Object[]) cls4.getMethod((String) objArr73[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr71);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int i99 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 877;
                int tapTimeout = 10 - (ViewConfiguration.getTapTimeout() >> 16);
                byte[] bArr6 = $$a;
                Object[] objArr75 = new Object[1];
                c((byte) (-bArr6[153]), (short) ($$b | 41), (byte) (-bArr6[44]), objArr75);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(windowTouchSlop, i99, tapTimeout, 1324201839, false, (String) objArr75[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, objArr74);
            try {
                long jLongValue8 = ((Long) Class.forName(str5).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf9 = Long.valueOf(jLongValue8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                    char cAlpha = (char) Color.alpha(0);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 876;
                    int iIndexOf5 = TextUtils.indexOf("", "") + 10;
                    byte b36 = (byte) (-$$a[33]);
                    Object[] objArr76 = new Object[1];
                    c(b36, (short) (b36 | 43), (byte) 52, objArr76);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(cAlpha, threadPriority, iIndexOf5, 254769921, false, (String) objArr76[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, lValueOf9);
                Long lValueOf10 = Long.valueOf(jLongValue8 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                    char cMyTid3 = (char) (Process.myTid() >> 22);
                    int i100 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 877;
                    int mode2 = View.MeasureSpec.getMode(0) + 10;
                    Object[] objArr77 = new Object[1];
                    c((byte) (-$$a[153]), (short) 69, (byte) 42, objArr77);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cMyTid3, i100, mode2, -1199417970, false, (String) objArr77[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf10);
                objArr7 = objArr74;
            } catch (Exception unused5) {
                throw new RuntimeException();
            }
        }
        int i101 = ((int[]) objArr7[2])[0];
        int i102 = ((int[]) objArr7[0])[0];
        if (i102 == i101) {
            int i103 = ((int[]) objArr7[1])[0];
            objArr8 = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i104 = i103 + ((((~((-98504343) | iIdentityHashCode6)) | 22481024) * (-566)) - 120332076) + ((~(iIdentityHashCode6 | (-76023319))) * 566);
            int i105 = (i104 << 13) ^ i104;
            int i106 = i105 ^ (i105 >>> 17);
            ((int[]) objArr8[1])[0] = i106 ^ (i106 << 5);
            i3 = 0;
            c = 1;
        } else {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr9 = (String[]) objArr7[3];
            if (strArr9 != null) {
                for (String str14 : strArr9) {
                    arrayList4.add(str14);
                }
            }
            Toast.makeText((Context) null, i102 / (((i102 - 1) * i102) % 2), 0).show();
            int i107 = ((int[]) objArr7[1])[0];
            objArr8 = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i108 = i107 + (((~(682635525 | iIdentityHashCode7)) | (-61306848)) * 262) + 1673392440 + (((~((~iIdentityHashCode7) | 682635525)) | (-61306848)) * 262);
            int i109 = i108 ^ (i108 << 13);
            int i110 = i109 ^ (i109 >>> 17);
            c = 1;
            i3 = 0;
            ((int[]) objArr8[1])[0] = i110 ^ (i110 << 5);
        }
        ((Field) rectToVertices.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i3]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1129121303, 488590574, 224347027}, ((int[]) objArr8[c])[i3], Integer.MAX_VALUE) - (-1361745667));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
            char cIndexOf3 = (char) TextUtils.indexOf("", "", i3);
            int keyRepeatDelay3 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 651;
            int iArgb2 = Color.argb(i3, i3, i3, i3) + 44;
            byte b37 = $$a[7];
            byte b38 = b37;
            Object[] objArr78 = new Object[1];
            c(b38, (short) (b38 | 52), b37, objArr78);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(cIndexOf3, keyRepeatDelay3, iArgb2, -459846511, false, (String) objArr78[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).getLong(null);
        long jLongValue9 = ((Long) Class.forName(str5).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
            char c11 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int keyRepeatTimeout2 = 651 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int iResolveSize = 44 - View.resolveSize(0, 0);
            Object[] objArr79 = new Object[1];
            c((byte) ($$b - 4), (short) 69, (byte) 52, objArr79);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(c11, keyRepeatTimeout2, iResolveSize, -873460649, false, (String) objArr79[0], null);
        }
        if (j4 == ((jLongValue9 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                char c12 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int iIndexOf6 = 651 - TextUtils.indexOf("", "", 0, 0);
                int iGreen2 = Color.green(0) + 44;
                byte b39 = $$a[7];
                Object[] objArr80 = new Object[1];
                c(b39, (short) (b39 | 158), (byte) ($$b - 3), objArr80);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(c12, iIndexOf6, iGreen2, -1595579076, false, (String) objArr80[0], null);
            }
            Object[] objArr81 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).get(null);
            objArr9 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i111 = ((int[]) objArr81[2])[0];
            int i112 = ((int[]) objArr81[0])[0];
            int iIdentityHashCode8 = System.identityHashCode(this);
            int i113 = 326830926 + (((~((-67394603) | (~iIdentityHashCode8))) | 63963792) * (-591)) + ((iIdentityHashCode8 | (-67394603)) * 591) + 1987132830;
            int i114 = (i113 << 13) ^ i113;
            int i115 = i114 ^ (i114 >>> 17);
            ((int[]) objArr9[3])[0] = i115 ^ (i115 << 5);
            i4 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), 1610 - Drawable.resolveOpacity(0, 0), TextUtils.getTrimmedLength("") + 26, 2145681644, false, null, new Class[0]);
            }
            Object[] objArr82 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).newInstance(null), 1987132830, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                char cBlue = (char) Color.blue(0);
                int iRgb2 = (-16776565) - Color.rgb(0, 0, 0);
                int iIndexOf7 = 44 - TextUtils.indexOf("", "", 0);
                Object[] objArr83 = new Object[1];
                c((byte) ($$b - 4), (short) 69, (byte) 52, objArr83);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(cBlue, iRgb2, iIndexOf7, 2075921419, false, (String) objArr83[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 695 - Color.blue(0), 98 - Color.alpha(0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 793 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.lastIndexOf("", '0', 0) + 84), Integer.TYPE, Integer.TYPE});
            }
            objArr9 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).invoke(null, objArr82);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                char cIndexOf4 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                int iRgb3 = (-16776565) - Color.rgb(0, 0, 0);
                int iBlue = Color.blue(0) + 44;
                byte b40 = $$a[7];
                Object[] objArr84 = new Object[1];
                c(b40, (short) (b40 | 158), (byte) ($$b - 3), objArr84);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(cIndexOf4, iRgb3, iBlue, -1595579076, false, (String) objArr84[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, objArr9);
            try {
                long jLongValue10 = ((Long) Class.forName(str5).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf11 = Long.valueOf(jLongValue10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                    char absoluteGravity3 = (char) Gravity.getAbsoluteGravity(0, 0);
                    int iRgb4 = Color.rgb(0, 0, 0) + 16777867;
                    int mirror3 = AndroidCharacter.getMirror('0') - 4;
                    Object[] objArr85 = new Object[1];
                    c((byte) ($$b - 4), (short) 69, (byte) 52, objArr85);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(absoluteGravity3, iRgb4, mirror3, -873460649, false, (String) objArr85[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, lValueOf11);
                Long lValueOf12 = Long.valueOf(jLongValue10 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                    char cIndexOf5 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                    int iIndexOf8 = 651 - TextUtils.indexOf("", "", 0);
                    int iKeyCodeFromString2 = 44 - KeyEvent.keyCodeFromString("");
                    byte b41 = $$a[7];
                    byte b42 = b41;
                    Object[] objArr86 = new Object[1];
                    c(b42, (short) (b42 | 52), b41, objArr86);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(cIndexOf5, iIndexOf8, iKeyCodeFromString2, -459846511, false, (String) objArr86[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, lValueOf12);
                i4 = 0;
            } catch (Exception unused6) {
                throw new RuntimeException();
            }
        }
        int i116 = ((int[]) objArr9[i4])[i4];
        int i117 = ((int[]) objArr9[2])[i4];
        if (i117 != i116) {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr10 = (String[]) objArr9[1];
            if (strArr10 != null) {
                for (String str15 : strArr10) {
                    arrayList5.add(str15);
                }
            }
            throw new RuntimeException(String.valueOf(i117));
        }
        Object[] objArr87 = new Object[4];
        int[] iArr6 = new int[1];
        objArr87[i4] = iArr6;
        int[] iArr7 = new int[1];
        objArr87[2] = iArr7;
        objArr87[3] = new int[1];
        int i118 = ((int[]) objArr9[3])[i4];
        int i119 = ((int[]) objArr9[2])[i4];
        int i120 = ((int[]) objArr9[i4])[i4];
        iArr7[i4] = i119;
        iArr6[i4] = i120;
        objArr87[1] = new String[i4];
        int iNextInt = new Random().nextInt();
        int i121 = i118 + 637038825 + (((~((-33850395) | (~iNextInt))) | (~((-30419585) | iNextInt))) * (-272)) + (((~((-973984864) | iNextInt)) | 940134469) * (-272)) + (((~(iNextInt | 973984863)) | (-970554054)) * 272);
        int i122 = (i121 << 13) ^ i121;
        int i123 = i122 ^ (i122 >>> 17);
        Object obj4 = objArr87[3];
        ((int[]) obj4)[0] = i123 ^ (i123 << 5);
        ((Field) isMirrored.b[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1020758984, 1359965718, 159700024}, ((int[]) obj4)[0], Integer.MAX_VALUE) + 1087547473);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
            char c13 = (char) (37568 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            int pressedStateDuration = 625 - (ViewConfiguration.getPressedStateDuration() >> 16);
            int iRgb5 = (-16777202) - Color.rgb(0, 0, 0);
            Object[] objArr88 = new Object[1];
            c((byte) ($$b - 4), (short) 69, (byte) 52, objArr88);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(c13, pressedStateDuration, iRgb5, -477065106, false, (String) objArr88[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).getLong(null);
        long jLongValue11 = ((Long) Class.forName(str5).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
            char c14 = (char) (37567 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
            int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0) + 626;
            int i124 = 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            byte b43 = $$a[7];
            byte b44 = b43;
            Object[] objArr89 = new Object[1];
            c(b44, (short) (b44 | 210), b43, objArr89);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(c14, iLastIndexOf4, i124, -976899241, false, (String) objArr89[0], null);
        }
        if (j5 == ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                char pressedStateDuration2 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 37567);
                int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 625;
                int gidForName = Process.getGidForName("") + 15;
                byte b45 = $$a[7];
                byte b46 = b45;
                Object[] objArr90 = new Object[1];
                c(b46, (short) (b46 | 121), b45, objArr90);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(pressedStateDuration2, doubleTapTimeout2, gidForName, -973632554, false, (String) objArr90[0], null);
            }
            Object[] objArr91 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).get(null);
            int i125 = ((int[]) objArr91[2])[0];
            int i126 = ((int[]) objArr91[0])[0];
            String[] strArr11 = (String[]) objArr91[3];
            int[] iArr8 = {i125};
            int iIdentityHashCode9 = System.identityHashCode(this);
            int i127 = ~iIdentityHashCode9;
            int i128 = (((473238928 + ((1001654264 | i127) * (-369))) + (((~((-967837529) | i127)) | 855900592) * (-369))) + ((((~(iIdentityHashCode9 | 967837528)) | 33816736) | (~(i127 | (-145753673)))) * 369)) - 1341032375;
            int i129 = (i128 << 13) ^ i128;
            int i130 = i129 ^ (i129 >>> 17);
            ((int[]) objArr10[1])[0] = i130 ^ (i130 << 5);
            objArr10 = new Object[]{new int[]{i126}, new int[1], iArr8, strArr11};
            c2 = 0;
            str4 = str8;
        } else {
            Context applicationContext3 = (Context) Class.forName(str9).getMethod(str2, new Class[0]).invoke(null, null);
            if (applicationContext3 == null) {
                obj = null;
            } else {
                if (applicationContext3 instanceof ContextWrapper) {
                    int i131 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i131 % 128;
                    if (i131 % 2 != 0) {
                        ((ContextWrapper) applicationContext3).getBaseContext();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext3).getBaseContext() == null) {
                        applicationContext3 = null;
                        obj = null;
                    }
                }
                obj = null;
                applicationContext3 = applicationContext3.getApplicationContext();
            }
            str4 = str8;
            int iIntValue2 = ((Integer) Class.forName(str7).getMethod(str4, Object.class).invoke(obj, this)).intValue();
            Object[] objArr92 = new Object[1];
            a(new char[]{35269, 60528, 45597, 35319, 10352, 41058, 10901, 52596, 47224, 37441, 30897, 16135, 59972, 23609, 20189, 24920, 7220, 3614, 40190, 21180, 20098, 65446, 53877, 33984, 28860, 43396, 8208, 63139, 41608, 39896, 30313, 14540, 54514, 17775, 18395, 27168, 1820, 14150, 38369, 23564, 18760, 57714, 60303, 36400, 31547, 54090, 14767, 65461, 44503, 40190, 3916, 8604, 57332, 20103, 23835, 5028, 477, 14571, 37685, 17795, 13300, 59959, 57567, 46975, 25155, 54349, 14077, 63835}, -((byte) KeyEvent.getModifierMetaStateMask()), objArr92);
            String str16 = (String) objArr92[0];
            Object[] objArr93 = new Object[1];
            a(new char[]{59956, 6564, 64084, 59991, 22734, 21938, 25310, 48541, 56280, 26562, 12540, 20408, 35305, 43501, 1730, 4529, 32709, 64413, 54448, 8707, 11638, 2672, 39484, 62504, 4941, 23632, 26632, 34377, 49534, 28175, 15904, 18554, 46851, 45286, 3999, 6815, 25837, 49809, 56751, 11450, 10940, 5362, 41887, 65245, 6302, 9934, 29108, 36613, 52855, 27003, 18181, 20772, 48221, 47872, 5459, 25410, 25210, 52531, 56189, 13677, 20575, 8125, 43152, 51095, 433, 8655, 32432, 35297}, 1 - (KeyEvent.getMaxKeyCode() >> 16), objArr93);
            Object[] objArr94 = {applicationContext3, new String[]{str16, (String) objArr93[0]}, Integer.valueOf(iIntValue2), 17, -1341032375};
            byte[] bArr7 = $$d;
            Object[] objArr95 = new Object[1];
            d((short) 139, bArr7[4], bArr7[468], objArr95);
            Class<?> cls5 = Class.forName((String) objArr95[0]);
            Object[] objArr96 = new Object[1];
            d((short) 315, bArr7[19], (byte) 92, objArr96);
            Object[] objArr97 = (Object[]) cls5.getMethod((String) objArr96[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr94);
            int i132 = ((int[]) objArr97[0])[0];
            int i133 = ((int[]) objArr97[2])[0];
            if (applicationContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                    char tapTimeout2 = (char) (37567 - (ViewConfiguration.getTapTimeout() >> 16));
                    int i134 = 626 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int keyRepeatTimeout3 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 14;
                    byte b47 = $$a[7];
                    byte b48 = b47;
                    Object[] objArr98 = new Object[1];
                    c(b48, (short) (b48 | 121), b47, objArr98);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(tapTimeout2, i134, keyRepeatTimeout3, -973632554, false, (String) objArr98[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, objArr97);
                try {
                    long jLongValue12 = ((Long) Class.forName(str5).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                        char cResolveSizeAndState = (char) (37567 - View.resolveSizeAndState(0, 0, 0));
                        int iIndexOf9 = 624 - TextUtils.indexOf((CharSequence) "", '0');
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14;
                        byte b49 = $$a[7];
                        byte b50 = b49;
                        Object[] objArr99 = new Object[1];
                        c(b50, (short) (b50 | 210), b49, objArr99);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(cResolveSizeAndState, iIndexOf9, scrollBarFadeDuration, -976899241, false, (String) objArr99[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue12 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                        char cAxisFromString2 = (char) (37566 - MotionEvent.axisFromString(""));
                        int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 625;
                        int gidForName2 = 13 - Process.getGidForName("");
                        Object[] objArr100 = new Object[1];
                        c((byte) ($$b - 4), (short) 69, (byte) 52, objArr100);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(cAxisFromString2, scrollDefaultDelay2, gidForName2, -477065106, false, (String) objArr100[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, lValueOf14);
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            } else {
                objArr97 = objArr97;
            }
            objArr10 = objArr97;
            c2 = 0;
        }
        int i135 = ((int[]) objArr10[c2])[c2];
        int i136 = ((int[]) objArr10[2])[c2];
        if (i136 != i135) {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr12 = (String[]) objArr10[3];
            if (strArr12 != null) {
                for (String str17 : strArr12) {
                    arrayList6.add(str17);
                }
            }
            throw new RuntimeException(String.valueOf(i136));
        }
        Object[] objArr101 = new Object[4];
        int[] iArr9 = new int[1];
        objArr101[c2] = iArr9;
        objArr101[1] = new int[1];
        int[] iArr10 = new int[1];
        objArr101[2] = iArr10;
        int i137 = ((int[]) objArr10[1])[c2];
        int i138 = ((int[]) objArr10[2])[c2];
        int i139 = ((int[]) objArr10[c2])[c2];
        String[] strArr13 = (String[]) objArr10[3];
        iArr10[c2] = i138;
        iArr9[c2] = i139;
        int iIdentityHashCode10 = System.identityHashCode(this);
        int i140 = i137 + (-1960991772) + (((~((-1676227993) | iIdentityHashCode10)) | (-147510129)) * (-964)) + (((~((~iIdentityHashCode10) | (-1676227993))) | 1663116424) * (-964));
        int i141 = (i140 << 13) ^ i140;
        int i142 = i141 ^ (i141 >>> 17);
        Object obj5 = objArr101[1];
        ((int[]) obj5)[0] = i142 ^ (i142 << 5);
        objArr101[3] = strArr13;
        ((Field) getRectToRect.TuitionPaymentFragmentbindingInflater1[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{540921210, 1572506514, 1672586992}, ((int[]) obj5)[0], Integer.MAX_VALUE) + 1295685590);
        super.onCreate(bundle);
        zzc zzcVar = this.zzb;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
            char c15 = (char) (29945 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int keyRepeatTimeout4 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1755;
            int mirror4 = AndroidCharacter.getMirror('0') - 25;
            byte b51 = $$a[7];
            Object[] objArr102 = new Object[1];
            c(b51, (short) (b51 | 158), (byte) ($$b - 3), objArr102);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(c15, keyRepeatTimeout4, mirror4, 986134021, false, (String) objArr102[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char fadingEdgeLength3 = (char) (29944 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                int keyRepeatDelay4 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1755;
                int maxKeyCode3 = (KeyEvent.getMaxKeyCode() >> 16) + 23;
                byte b52 = $$a[7];
                byte b53 = b52;
                Object[] objArr103 = new Object[1];
                c(b53, (short) (b53 | 121), b52, objArr103);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(fadingEdgeLength3, keyRepeatDelay4, maxKeyCode3, 1599039318, false, (String) objArr103[0], null);
            }
            Object[] objArr104 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).get(null);
            objArr11 = new Object[]{new int[]{((int[]) objArr104[0])[0]}, new int[]{((int[]) objArr104[1])[0]}, (Object[]) objArr104[2], new int[1], (String[]) objArr104[4]};
            int iIdentityHashCode11 = System.identityHashCode(this);
            int i143 = (((~((-134447297) | iIdentityHashCode11)) * 521) - 1539392400) + (((~((~iIdentityHashCode11) | (-134447297))) | (-460832511)) * 521) + 520620105;
            int i144 = (i143 << 13) ^ i143;
            int i145 = i144 ^ (i144 >>> 17);
            ((int[]) objArr11[3])[0] = i145 ^ (i145 << 5);
            zzcVar = zzcVar;
        } else {
            int iIntValue3 = ((Integer) Class.forName(str7).getMethod(str4, Object.class).invoke(null, this)).intValue();
            Object[] objArr105 = {-2008861011};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b((char) (42049 - ExpandableListView.getPackedPositionGroup(0L)), 1727 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = zzpu.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue3, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).newInstance(objArr105), 520620105, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                char doubleTapTimeout3 = (char) (29944 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                int longPressTimeout2 = 1755 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int scrollBarSize = 23 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte b54 = $$a[7];
                byte b55 = b54;
                Object[] objArr106 = new Object[1];
                c(b55, (short) (b55 | 121), b54, objArr106);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(doubleTapTimeout3, longPressTimeout2, scrollBarSize, 1599039318, false, (String) objArr106[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
            try {
                long jLongValue13 = ((Long) Class.forName(str5).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf15 = Long.valueOf(jLongValue13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                    char tapTimeout3 = (char) (29944 - (ViewConfiguration.getTapTimeout() >> 16));
                    int absoluteGravity4 = 1755 - Gravity.getAbsoluteGravity(0, 0);
                    int scrollDefaultDelay3 = 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte b56 = $$a[7];
                    byte b57 = b56;
                    Object[] objArr107 = new Object[1];
                    c(b57, (short) (b57 | 52), b56, objArr107);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(tapTimeout3, absoluteGravity4, scrollDefaultDelay3, 1596667560, false, (String) objArr107[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, lValueOf15);
                Long lValueOf16 = Long.valueOf(jLongValue13 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                    char scrollDefaultDelay4 = (char) (29944 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                    int iLastIndexOf5 = 1754 - TextUtils.lastIndexOf("", '0', 0);
                    int threadPriority2 = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte b58 = $$a[7];
                    Object[] objArr108 = new Object[1];
                    c(b58, (short) (b58 | 158), (byte) ($$b - 3), objArr108);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(scrollDefaultDelay4, iLastIndexOf5, threadPriority2, 986134021, false, (String) objArr108[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, lValueOf16);
                objArr11 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        }
        int i146 = ((int[]) objArr11[1])[0];
        int i147 = ((int[]) objArr11[0])[0];
        if (i147 == i146) {
            int i148 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i148 % 128;
            int i149 = i148 % 2;
            int i150 = ((int[]) objArr11[3])[0];
            objArr12 = new Object[]{new int[]{((int[]) objArr11[0])[0]}, new int[]{((int[]) objArr11[1])[0]}, (Object[]) objArr11[2], new int[1], (String[]) objArr11[4]};
            int iIdentityHashCode12 = System.identityHashCode(this);
            int i151 = i150 + (-118798613) + (((~((~iIdentityHashCode12) | 733369389)) | 272638530) * 446) + (((~(iIdentityHashCode12 | 1006007919)) | 673333285) * 446) + 1337700092;
            int i152 = (i151 << 13) ^ i151;
            int i153 = i152 ^ (i152 >>> 17);
            ((int[]) objArr12[3])[0] = i153 ^ (i153 << 5);
            i5 = 0;
            c3 = 3;
        } else {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr14 = (String[]) objArr11[4];
            if (strArr14 != null) {
                for (int i154 = 0; i154 < strArr14.length; i154++) {
                    int i155 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i155 % 128;
                    if (i155 % 2 == 0) {
                        arrayList7.add(strArr14[i154]);
                    } else {
                        arrayList7.add(strArr14[i154]);
                    }
                }
            }
            int[] iArr11 = new int[i147];
            int i156 = i147 - 1;
            iArr11[i156] = 1;
            Toast.makeText((Context) null, iArr11[((i147 * i156) % 2) - 1], 1).show();
            int i157 = ((int[]) objArr11[3])[0];
            objArr12 = new Object[]{new int[]{((int[]) objArr11[0])[0]}, new int[]{((int[]) objArr11[1])[0]}, (Object[]) objArr11[2], new int[1], (String[]) objArr11[4]};
            int i158 = ~System.identityHashCode(this);
            int i159 = i157 + (((847911140 + (((~((-143468837) | i158)) | (-69133590)) * (-933))) + (((~(i158 | (-69133590))) | 68338705) * 933)) - 47941070);
            int i160 = (i159 << 13) ^ i159;
            int i161 = i160 ^ (i160 >>> 17);
            c3 = 3;
            i5 = 0;
            ((int[]) objArr12[3])[0] = i161 ^ (i161 << 5);
        }
        ((Field) runOnMain.b[i5]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1972306765, 2136494675, 1226272670}, ((int[]) objArr12[c3])[i5], Integer.MAX_VALUE) + 1564476104);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
            char cIndexOf6 = (char) TextUtils.indexOf("", "", i5, i5);
            int bitsPerPixel = 2266 - ImageFormat.getBitsPerPixel(i5);
            int fadingEdgeLength4 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 33;
            byte b59 = $$a[7];
            byte b60 = b59;
            Object[] objArr109 = new Object[1];
            c(b60, (short) (b60 | 121), b59, objArr109);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(cIndexOf6, bitsPerPixel, fadingEdgeLength4, -887667012, false, (String) objArr109[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                char cMyTid4 = (char) (Process.myTid() >> 22);
                int touchSlop2 = 2267 - (ViewConfiguration.getTouchSlop() >> 8);
                int iMakeMeasureSpec = 33 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte b61 = $$a[7];
                Object[] objArr110 = new Object[1];
                c(b61, (short) (b61 | 158), (byte) ($$b - 3), objArr110);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(cMyTid4, touchSlop2, iMakeMeasureSpec, -654680577, false, (String) objArr110[0], null);
            }
            Object[] objArr111 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).get(null);
            objArr13 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i162 = ((int[]) objArr111[0])[0];
            int i163 = ((int[]) objArr111[3])[0];
            String[] strArr15 = (String[]) objArr111[1];
            int iIdentityHashCode13 = System.identityHashCode(this);
            int i164 = ((((~((-499059632) | iIdentityHashCode13)) | 265026331) * 398) - 518376073) + (((~((~iIdentityHashCode13) | (-499059632))) | 265026331) * 398) + 2080097706;
            int i165 = (i164 << 13) ^ i164;
            int i166 = i165 ^ (i165 >>> 17);
            ((int[]) objArr13[2])[0] = i166 ^ (i166 << 5);
        } else {
            Context applicationContext4 = (Context) Class.forName(str9).getMethod(str2, new Class[0]).invoke(null, null);
            if (applicationContext4 != null) {
                applicationContext4 = ((applicationContext4 instanceof ContextWrapper) && ((ContextWrapper) applicationContext4).getBaseContext() == null) ? null : applicationContext4.getApplicationContext();
            }
            Object[] objArr112 = {applicationContext4, Integer.valueOf(((Integer) Class.forName(str7).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, 2080097706};
            byte[] bArr8 = $$d;
            byte b62 = bArr8[4];
            Object[] objArr113 = new Object[1];
            d((short) 105, b62, (byte) (b62 | 35), objArr113);
            Class<?> cls6 = Class.forName((String) objArr113[0]);
            Object[] objArr114 = new Object[1];
            d(bArr8[6], bArr8[36], (byte) ($$e >>> 2), objArr114);
            Object[] objArr115 = (Object[]) cls6.getMethod((String) objArr114[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr112);
            if (applicationContext4 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                    char c16 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                    int defaultSize2 = 2267 - View.getDefaultSize(0, 0);
                    int i167 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 32;
                    byte b63 = $$a[7];
                    Object[] objArr116 = new Object[1];
                    c(b63, (short) (b63 | 158), (byte) ($$b - 3), objArr116);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(c16, defaultSize2, i167, -654680577, false, (String) objArr116[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, objArr115);
                try {
                    long jLongValue14 = ((Long) Class.forName(str5).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue14);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                        char absoluteGravity5 = (char) Gravity.getAbsoluteGravity(0, 0);
                        int i168 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2266;
                        int i169 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32;
                        byte b64 = $$a[7];
                        byte b65 = b64;
                        Object[] objArr117 = new Object[1];
                        c(b65, (short) (b65 | 210), b64, objArr117);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(absoluteGravity5, i168, i169, -874156483, false, (String) objArr117[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue14 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                        char size = (char) View.MeasureSpec.getSize(0);
                        int iIndexOf10 = TextUtils.indexOf("", "", 0, 0) + 2267;
                        int i170 = 32 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        byte b66 = $$a[7];
                        byte b67 = b66;
                        Object[] objArr118 = new Object[1];
                        c(b67, (short) (b67 | 121), b66, objArr118);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(size, iIndexOf10, i170, -887667012, false, (String) objArr118[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            } else {
                objArr115 = objArr115;
            }
            objArr13 = objArr115;
        }
        int i171 = ((int[]) objArr13[3])[0];
        int i172 = ((int[]) objArr13[0])[0];
        if (i172 == i171) {
            objArr14 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i173 = ((int[]) objArr13[2])[0];
            int i174 = ((int[]) objArr13[0])[0];
            int i175 = ((int[]) objArr13[3])[0];
            String[] strArr16 = (String[]) objArr13[1];
            int iMyTid2 = Process.myTid();
            int i176 = ~iMyTid2;
            int i177 = i173 + (((~((-789968007) | i176)) | (~((-18745310) | iMyTid2)) | (~(i176 | 18745309))) * 959) + 641144230 + (((~(iMyTid2 | 18745309)) | (~(i176 | (-18745310))) | (~((-789968007) | iMyTid2))) * 959);
            int i178 = (i177 << 13) ^ i177;
            int i179 = i178 ^ (i178 >>> 17);
            ((int[]) objArr14[2])[0] = i179 ^ (i179 << 5);
            c5 = 0;
            c4 = 2;
        } else {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr17 = (String[]) objArr13[1];
            if (strArr17 != null) {
                for (String str18 : strArr17) {
                    arrayList8.add(str18);
                }
            }
            Toast.makeText((Context) null, i172 / (((i172 - 1) * i172) % 2), 0).show();
            objArr14 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i180 = ((int[]) objArr13[2])[0];
            int i181 = ((int[]) objArr13[0])[0];
            int i182 = ((int[]) objArr13[3])[0];
            String[] strArr18 = (String[]) objArr13[1];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i183 = 238573475 + (((~(93597416 | elapsedCpuTime)) | 715115899) * 672);
            int i184 = ~elapsedCpuTime;
            int i185 = i180 + i183 + (((~(elapsedCpuTime | 715115899)) | (~((-93597417) | i184))) * (-672)) + (((~((-715115900) | i184)) | 705413395) * 672);
            int i186 = (i185 << 13) ^ i185;
            int i187 = i186 ^ (i186 >>> 17);
            c4 = 2;
            c5 = 0;
            ((int[]) objArr14[2])[0] = i187 ^ (i187 << 5);
        }
        ((Field) TransformUtils.TuitionPaymentFragmentspecialinlinedviewModeldefault3[c5]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{567083382, 1140394622, 94282939}, ((int[]) objArr14[c4])[c5], Integer.MAX_VALUE) - (-1911752354));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
            char longPressTimeout3 = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 53893);
            int iIndexOf11 = 1320 - TextUtils.indexOf("", "");
            int pressedStateDuration3 = (ViewConfiguration.getPressedStateDuration() >> 16) + 36;
            Object[] objArr119 = new Object[1];
            c((byte) ($$b - 4), (short) 69, (byte) 52, objArr119);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(longPressTimeout3, iIndexOf11, pressedStateDuration3, -1433084963, false, (String) objArr119[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                char capsMode2 = (char) (53893 - TextUtils.getCapsMode("", 0, 0));
                int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 1320;
                int maxKeyCode4 = (KeyEvent.getMaxKeyCode() >> 16) + 36;
                byte b68 = $$a[7];
                byte b69 = b68;
                Object[] objArr120 = new Object[1];
                c(b69, (short) (b69 | 121), b68, objArr120);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(capsMode2, edgeSlop2, maxKeyCode4, -1920778747, false, (String) objArr120[0], null);
            }
            Object[] objArr121 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).get(null);
            objArr15 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i188 = ((int[]) objArr121[0])[0];
            int i189 = ((int[]) objArr121[3])[0];
            String[] strArr19 = (String[]) objArr121[2];
            int iIdentityHashCode14 = System.identityHashCode(this);
            int i190 = 583274754 + (((~((~iIdentityHashCode14) | 780995523)) | (-799874032)) * 529) + (((~(iIdentityHashCode14 | 780995523)) | (-589632302)) * 529) + 766135929;
            int i191 = (i190 << 13) ^ i190;
            int i192 = i191 ^ (i191 >>> 17);
            ((int[]) objArr15[1])[0] = i192 ^ (i192 << 5);
        } else {
            Context applicationContext5 = (Context) Class.forName(str9).getMethod(str2, new Class[0]).invoke(null, null);
            if (applicationContext5 != null) {
                applicationContext5 = ((applicationContext5 instanceof ContextWrapper) && ((ContextWrapper) applicationContext5).getBaseContext() == null) ? null : applicationContext5.getApplicationContext();
            }
            int iIntValue4 = ((Integer) Class.forName(str7).getMethod(str4, Object.class).invoke(null, this)).intValue();
            Object[] objArr122 = {-164706017};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b((char) (47977 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1300, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr123 = {applicationContext5, "com.bpjstku", 766135929, Integer.valueOf(iIntValue4), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).newInstance(objArr122), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                char mode3 = (char) (53893 - View.MeasureSpec.getMode(0));
                int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 1320;
                int i193 = 36 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                byte b70 = $$a[7];
                byte b71 = b70;
                Object[] objArr124 = new Object[1];
                c(b71, (short) (b71 | 121), b70, objArr124);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(mode3, edgeSlop3, i193, 819724799, false, (String) objArr124[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - TextUtils.indexOf("", "", 0, 0)), 1394 - TextUtils.indexOf("", "", 0), Color.argb(0, 0, 0, 0) + 75), Boolean.TYPE});
            }
            Object[] objArr125 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).invoke(null, objArr123);
            if (applicationContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                    char c17 = (char) (53894 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int defaultSize3 = View.getDefaultSize(0, 0) + 1320;
                    int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 36;
                    byte b72 = $$a[7];
                    byte b73 = b72;
                    Object[] objArr126 = new Object[1];
                    c(b73, (short) (b73 | 121), b72, objArr126);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(c17, defaultSize3, jumpTapTimeout2, -1920778747, false, (String) objArr126[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, objArr125);
                try {
                    long jLongValue15 = ((Long) Class.forName(str5).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf19 = Long.valueOf(jLongValue15);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                        char cAlpha2 = (char) (53893 - Color.alpha(0));
                        int i194 = 1320 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iMakeMeasureSpec2 = 36 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte b74 = $$a[7];
                        Object[] objArr127 = new Object[1];
                        c(b74, (short) (b74 | 158), (byte) ($$b - 3), objArr127);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(cAlpha2, i194, iMakeMeasureSpec2, -1273706634, false, (String) objArr127[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf19);
                    Long lValueOf20 = Long.valueOf(jLongValue15 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                        char fadingEdgeLength5 = (char) (53893 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                        int iRgb6 = (-16775896) - Color.rgb(0, 0, 0);
                        int tapTimeout4 = 36 - (ViewConfiguration.getTapTimeout() >> 16);
                        Object[] objArr128 = new Object[1];
                        c((byte) ($$b - 4), (short) 69, (byte) 52, objArr128);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(fadingEdgeLength5, iRgb6, tapTimeout4, -1433084963, false, (String) objArr128[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf20);
                } catch (Exception unused10) {
                    throw new RuntimeException();
                }
            } else {
                objArr125 = objArr125;
            }
            objArr15 = objArr125;
        }
        int i195 = ((int[]) objArr15[3])[0];
        int i196 = ((int[]) objArr15[0])[0];
        if (i196 == i195) {
            int i197 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i197 % 128;
            int i198 = i197 % 2;
            objArr16 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i199 = ((int[]) objArr15[1])[0];
            int i200 = ((int[]) objArr15[0])[0];
            int i201 = ((int[]) objArr15[3])[0];
            String[] strArr20 = (String[]) objArr15[2];
            int iNextInt2 = new Random().nextInt();
            int i202 = i199 + 526413628 + (((~((-537133826) | iNextInt2)) | (~((~iNextInt2) | 833493999))) * (-318)) + (((~(808196971 | iNextInt2)) | 25297028) * (-318)) + (((~(iNextInt2 | (-808196972))) | (-562430854)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i203 = i202 ^ (i202 << 13);
            int i204 = i203 ^ (i203 >>> 17);
            ((int[]) objArr16[1])[0] = i204 ^ (i204 << 5);
            c6 = 1;
            i6 = 0;
        } else {
            int[] iArr12 = new int[i196];
            int i205 = i196 - 1;
            iArr12[i205] = 1;
            Toast.makeText((Context) null, iArr12[((i196 * i205) % 2) - 1], 1).show();
            objArr16 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i206 = ((int[]) objArr15[1])[0];
            int i207 = ((int[]) objArr15[0])[0];
            int i208 = ((int[]) objArr15[3])[0];
            String[] strArr21 = (String[]) objArr15[2];
            int iIdentityHashCode15 = System.identityHashCode(this);
            int i209 = i206 + 1410641520 + (((-766351565) | iIdentityHashCode15) * 376) + (((~((~iIdentityHashCode15) | 1051450206)) | (-1068489695)) * (-376)) + (((~(iIdentityHashCode15 | (-1051450207))) | 319177618) * 376);
            int i210 = (i209 << 13) ^ i209;
            int i211 = i210 ^ (i210 >>> 17);
            c6 = 1;
            i6 = 0;
            ((int[]) objArr16[1])[0] = i211 ^ (i211 << 5);
        }
        ((Field) Threads.TuitionPaymentFragmentbindingInflater1[i6]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{992062073, 1107470950, 173794554}, ((int[]) objArr16[c6])[i6], Integer.MAX_VALUE) + 1637921685);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
            char c18 = (char) (TypedValue.complexToFraction(i6, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i6, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i212 = (TypedValue.complexToFloat(i6) > 0.0f ? 1 : (TypedValue.complexToFloat(i6) == 0.0f ? 0 : -1)) + 876;
            int i213 = 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            Object[] objArr129 = new Object[1];
            c((byte) ($$b - 4), (short) 69, (byte) 52, objArr129);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(c18, i212, i213, 252381699, false, (String) objArr129[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).getLong(null);
        long jLongValue16 = ((Long) Class.forName(str5).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
            char doubleTapTimeout4 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 876;
            int packedPositionGroup2 = 10 - ExpandableListView.getPackedPositionGroup(0L);
            byte b75 = $$a[7];
            byte b76 = b75;
            Object[] objArr130 = new Object[1];
            c(b76, (short) (b76 | 52), b75, objArr130);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(doubleTapTimeout4, offsetBefore, packedPositionGroup2, 2009631821, false, (String) objArr130[0], null);
        }
        if (j6 == ((jLongValue16 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                char cArgb = (char) Color.argb(0, 0, 0, 0);
                int iIndexOf12 = TextUtils.indexOf("", "", 0) + 876;
                int keyRepeatTimeout5 = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte[] bArr9 = $$a;
                byte b77 = bArr9[10];
                short s = bArr9[7];
                Object[] objArr131 = new Object[1];
                c(b77, s, (byte) (s | 52), objArr131);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(cArgb, iIndexOf12, keyRepeatTimeout5, 256017550, false, (String) objArr131[0], null);
            }
            Object[] objArr132 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).get(null);
            objArr17 = new Object[]{new int[]{((int[]) objArr132[0])[0]}, new int[1], new int[]{((int[]) objArr132[2])[0]}, (String[]) objArr132[3]};
            int iIdentityHashCode16 = System.identityHashCode(this);
            int i214 = 1145597176 + (((~(iIdentityHashCode16 | 221648413)) | 181338184) * (-668)) + ((221648413 | (~(181338184 | iIdentityHashCode16))) * 1336) + ((iIdentityHashCode16 | 268375645) * 668) + 1416966075;
            int i215 = (i214 << 13) ^ i214;
            int i216 = i215 ^ (i215 >>> 17);
            ((int[]) objArr17[1])[0] = i216 ^ (i216 << 5);
        } else {
            Context applicationContext6 = (Context) Class.forName(str9).getMethod(str2, new Class[0]).invoke(null, null);
            if (applicationContext6 != null) {
                int i217 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i217 % 128;
                int i218 = i217 % 2;
                if ((applicationContext6 instanceof ContextWrapper) && ((ContextWrapper) applicationContext6).getBaseContext() == null) {
                    applicationContext6 = null;
                } else {
                    applicationContext6 = applicationContext6.getApplicationContext();
                    int i219 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i219 % 128;
                    int i220 = i219 % 2;
                }
            }
            Object[] objArr133 = {applicationContext6, Integer.valueOf(((Integer) Class.forName(str7).getMethod(str4, Object.class).invoke(null, this)).intValue()), 1416966075};
            byte[] bArr10 = $$d;
            Object[] objArr134 = new Object[1];
            d(bArr10[104], bArr10[4], (byte) (-bArr10[69]), objArr134);
            Class<?> cls7 = Class.forName((String) objArr134[0]);
            Object[] objArr135 = new Object[1];
            d(bArr10[6], bArr10[36], (byte) ($$e >>> 2), objArr135);
            objArr17 = (Object[]) cls7.getMethod((String) objArr135[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr133);
            if (applicationContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                    char trimmedLength4 = (char) TextUtils.getTrimmedLength("");
                    int i221 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 876;
                    int minimumFlingVelocity = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte[] bArr11 = $$a;
                    byte b78 = bArr11[10];
                    short s2 = bArr11[7];
                    Object[] objArr136 = new Object[1];
                    c(b78, s2, (byte) (s2 | 52), objArr136);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(trimmedLength4, i221, minimumFlingVelocity, 256017550, false, (String) objArr136[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArr17);
                try {
                    long jLongValue17 = ((Long) Class.forName(str5).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue17);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                        char cArgb2 = (char) Color.argb(0, 0, 0, 0);
                        int packedPositionType4 = ExpandableListView.getPackedPositionType(0L) + 876;
                        int gidForName3 = 9 - Process.getGidForName("");
                        byte b79 = $$a[7];
                        byte b80 = b79;
                        Object[] objArr137 = new Object[1];
                        c(b80, (short) (b80 | 52), b79, objArr137);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(cArgb2, packedPositionType4, gidForName3, 2009631821, false, (String) objArr137[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                        char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                        int defaultSize4 = View.getDefaultSize(0, 0) + 876;
                        int packedPositionType5 = 10 - ExpandableListView.getPackedPositionType(0L);
                        Object[] objArr138 = new Object[1];
                        c((byte) ($$b - 4), (short) 69, (byte) 52, objArr138);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cResolveOpacity, defaultSize4, packedPositionType5, 252381699, false, (String) objArr138[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
        }
        int i222 = ((int[]) objArr17[2])[0];
        int i223 = ((int[]) objArr17[0])[0];
        if (i223 != i222) {
            throw new RuntimeException(String.valueOf(i223));
        }
        int i224 = ((int[]) objArr17[1])[0];
        Object[] objArr139 = {new int[]{((int[]) objArr17[0])[0]}, new int[1], new int[]{((int[]) objArr17[2])[0]}, (String[]) objArr17[3]};
        int iMyTid3 = Process.myTid();
        int i225 = i224 + (-1230941284) + (((~((~iMyTid3) | (-184641))) | (~((-27331636) | iMyTid3))) * (-302)) + ((~((-184641) | iMyTid3)) * (-604)) + (((~(iMyTid3 | (-27516276))) | (-95158140)) * 302);
        int i226 = (i225 << 13) ^ i225;
        int i227 = i226 ^ (i226 >>> 17);
        Object obj6 = objArr139[1];
        ((int[]) obj6)[0] = i227 ^ (i227 << 5);
        ((Field) nativeGetSurfaceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1078533483, 596654925, 418689126}, ((int[]) obj6)[0], Integer.MAX_VALUE) - Integer.MAX_VALUE);
        zzcVar.zzg(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onDestroy();
            this.zzb.zzh();
            obj.hashCode();
            throw null;
        }
        super.onDestroy();
        this.zzb.zzh();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -854616863
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // android.app.Fragment
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zza.onResume():void");
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            super.onSaveInstanceState(bundle);
            this.zzb.zzj(bundle);
        } else {
            super.onSaveInstanceState(bundle);
            this.zzb.zzj(bundle);
            throw null;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -647350916
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // android.app.Fragment
    public final void onStart() {
        /*
            Method dump skipped, instruction units count: 925
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zza.onStart():void");
    }

    @Override // android.app.Fragment
    public final void onStop() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            super.onStop();
            this.zzb.zzl();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.onStop();
        this.zzb.zzl();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 8267055109344241169L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r5, byte r6, byte r7) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r5 = r5 * 2
            int r5 = r5 + 107
            byte[] r0 = com.google.android.gms.common.api.internal.zza.$$c
            int r7 = r7 * 3
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r5
            r5 = r7
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r3 = r0[r6]
        L27:
            int r6 = r6 + 1
            int r5 = r5 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zza.$$g(short, byte, byte):java.lang.String");
    }
}
