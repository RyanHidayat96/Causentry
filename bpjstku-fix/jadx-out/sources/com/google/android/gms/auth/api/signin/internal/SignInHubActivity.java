package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import android.view.accessibility.AccessibilityEvent;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import com.bpjstku.R;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.internal.zzpu;
import defpackage.CameraUseCaseAdapter;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.getConfigs;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
public class SignInHubActivity extends FragmentActivity {
    private static boolean TuitionPaymentFragmentbindingInflater1 = false;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
    private static int b = 0;
    private static boolean zba = false;
    private boolean zbb = false;
    private SignInConfiguration zbc;
    private boolean zbd;
    private int zbe;
    private Intent zbf;
    private static final byte[] $$c = {29, 88, -118, 32};
    private static final int $$f = 14;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {91, -17, 90, 37, 15, -13, 4, 5, 11, -1, -9, 68, 6, -49, -1, 5, -13, -2, 17, -11, 70, -66, -4, 16, 11, -19, 23, 49, 6, -18, -43, 13, -19, 44, -17, -15, 16, -11, -2, 23, 1, -8, 9, -31, 14, -9, 13, -4, 3, 32, -15, -22, 14, 10, -7, -4, 48, -42, 19, -4, -4, 10, -7, -4, 20, -5, -3, 12, -3, -3, 9, 32, -35, 10, -4, 13, -17, 17, -11, 67, 4, -13, 52, -29, -16, 16, 49, 4, -29, -20, 4, -5, 15, -17, 1, 5, 15, -31, 14, -9, 13, -4, 3, 32, -15, -22, 14, 10, -7, -4, 48, -42, 19, -4, -4, 10, -7, -4, 3, 5, 13, 4, -4, 10, -9, 5, -3, 4, 5, -3, 11, 3, -16, 15, 6, -16, 44, -32, 13, 1, -5, 10, 1, 1, 7, -18, 11, -6, 67, 13, -22, 12, -4, 3, 45, -35, 44, -35, -8, 5, 6, 13, -22, 56, -48, 3, 7, -4, 3, 41, -32, 13, 1, -10, 4, 65, -55, -6, 2, 10, -3, 9, 57, -49, -11, 12, -12, 5, 8, 7, 56, -55, -4, -4, 71, -57, -3, -4, 17, -11, 6, 15, -9, 64, -61, 3, 3, 4, -9, 23, -2, -10, 4, 2, 0, 3, 66, -74, 2, 15, 8, -31, 14, -9, 13, -4, 3, 32, -15, -22, 14, 10, -7, -4, 48, -42, 19, -4, -4, 10, -7, -4, 3, 5, 13, 4, -4, 10, -9, 5, -3, 4, 5, -3, 11, 3, -16, 15, 6, -16, 44, -32, 13, 1, -5, 10, 1, 1, 7, -18, 11, -6, 69, -10, 4, 65, -50, -12, 8, -7, 1, 11, -8, 73, -52, 5, -17, 21, 53, -66, 15, 0, 0, -8, 1, 4, 19, -17, 13, -4, 3, 66, -50, -12, -3, 73, -18, -12, -3, 5, -17, 0, 0, -8, 1, 4, 19, -17, 13, -4, 3, 44, -27, -17, 21, 16, -31, 7, -1, 15, 67, 2, -31, -49, 6, 17, -11, 6, 15, -9, 27, -36, 13, -4, 14, 5, -13, 13, 8, 25, -19, -10, 13, 0, 5, 45, -10, 4, 65, -50, -12, 8, -7, 1, 11, -8, 73, -52, 5, -17, 21, 53, -67, 18, -3, -5, 5, 13, -15, 1, 13, 1, -5, 68, -61, 0, 13, 1, -5, 64, -66, 15, -12, 5, 3, 3, -3, 16, 57, -19, -42, 3, 10, -1, -7, 7, 29, -17, -12, 5, 3, 3, -3, 16, -10, 4, 65, -55, -6, 2, 10, -3, 9, 57, -61, 3, 3, 4, -9, 72, -51, -10, 4, 2, 0, 3, 66, -67, 17, -5, 4, -3, -4, 17, -11, 6, 15, -9, 64, -74, 2, 15, -31, 14, -9, 13, -4, 3, 32, -15, -22, 14, 10, -7, -4, 48, -42, 19, -4, -4, 10, -7, -4, 3, 5, 13, 4, -4, 10, -9, 5, -3, 4, 5, -3, 11, 3, -16, 15, 6, -16, 44, -32, 13, 1, -5, 10, 1, 1, 7, -18, 11, -6, 68};
    private static final int $$e = 152;
    private static final byte[] $$a = {57, -50, -56, -93, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24};
    private static final int $$b = 73;
    private static int g = 0;
    private static int d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f768a = 1;

    private static void e(byte b2, byte b3, int i, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = i + 4;
        int i3 = 103 - b3;
        byte[] bArr2 = new byte[b2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i3 = (b2 + i2) - 11;
            i2 = i2;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            int i6 = i2 + 1;
            bArr2[i5] = (byte) i3;
            if (i5 == b2) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = (i3 + bArr[i6]) - 11;
                i2 = i6;
                i4 = i5;
            }
        }
    }

    private static void f(byte b2, int i, byte b3, Object[] objArr) {
        int i2 = 114 - b3;
        byte[] bArr = $$d;
        int i3 = i + 4;
        byte[] bArr2 = new byte[84 - b2];
        int i4 = 83 - b2;
        int i5 = -1;
        if (bArr == null) {
            int i6 = i4 + (-i3);
            i3++;
            i2 = i6 + 2;
            i5 = -1;
        }
        while (true) {
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i2;
            int i9 = i3;
            int i10 = i8 + (-bArr[i3]);
            i3 = i9 + 1;
            i2 = i10 + 2;
            i5 = i7;
        }
    }

    private final void zbd() {
        int i = 2 % 2;
        Object obj = null;
        getSupportLoaderManager().initLoader(0, null, new zbv(this, null));
        zba = false;
        int i2 = d + 23;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        int intExtra;
        int i3 = 2 % 2;
        if (this.zbb) {
            return;
        }
        int i4 = d + 41;
        g = i4 % 128;
        int i5 = i4 % 2;
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
            if (signInAccount != null && signInAccount.zba() != null) {
                int i6 = g + 109;
                d = i6 % 128;
                int i7 = i6 % 2;
                GoogleSignInAccount googleSignInAccountZba = signInAccount.zba();
                if (googleSignInAccountZba == null) {
                    zbe(GoogleSignInStatusCodes.SIGN_IN_FAILED);
                    return;
                }
                zbn.zba(this).zbc(this.zbc.zba(), googleSignInAccountZba);
                intent.removeExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
                intent.putExtra("googleSignInAccount", googleSignInAccountZba);
                this.zbd = true;
                this.zbe = i2;
                this.zbf = intent;
                zbd();
                return;
            }
            if (!(!intent.hasExtra("errorCode"))) {
                int i8 = d + 17;
                g = i8 % 128;
                if (i8 % 2 == 0 ? (intExtra = intent.getIntExtra("errorCode", 8)) == 13 : (intExtra = intent.getIntExtra("errorCode", 36)) == 92) {
                    int i9 = d + 101;
                    g = i9 % 128;
                    intExtra = i9 % 2 != 0 ? 1036 : GoogleSignInStatusCodes.SIGN_IN_CANCELLED;
                }
                zbe(intExtra);
                return;
            }
        }
        zbe(8);
    }

    private final void zbe(int i) {
        int i2 = 2 % 2;
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        zba = false;
        int i3 = g + 47;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 68 / 0;
        }
    }

    private final void zbc(String str) {
        int i = 2 % 2;
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            int i2 = d + 105;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                intent.setPackage("com.google.android.gms");
                throw null;
            }
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.zbc);
        try {
            startActivityForResult(intent, 40962);
            int i3 = g + 49;
            d = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 81 / 0;
            }
        } catch (ActivityNotFoundException unused) {
            this.zbb = true;
            zbe(17);
        }
    }

    private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        long j = 0;
        int i4 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = $11 + 107;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 125;
                $11 = i8 % 128;
                if (i8 % i2 == 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i4] = Integer.valueOf(cArr2[i7]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) i4;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.getTrimmedLength("") + 31339), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 2993, Color.green(i4) + 17, 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 31339), 2994 - TextUtils.getOffsetAfter("", 0), Gravity.getAbsoluteGravity(0, 0) + 17, 1182129903, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                }
                i7++;
                i2 = 2;
                j = 0;
                i4 = 0;
            }
            int i9 = $10 + 65;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - ExpandableListView.getPackedPositionGroup(0L)), Color.green(0) + 253, Color.alpha(0) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i11 = $11 + 29;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33650 - AndroidCharacter.getMirror('0')), (Process.myTid() >> 22) + 3085, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, -2146875848, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        int i13 = 0;
        if (TuitionPaymentFragmentbindingInflater1) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (Color.green(0) + 33602), TextUtils.indexOf("", "", 0) + 3085, 26 - ((Process.getThreadPriority(0) + 20) >> 6), -2146875848, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13;
            if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i14 = $10 + 63;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            i13 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = g + 7;
        d = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        zba = false;
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = g + 101;
        d = i2 % 128;
        int i3 = i2 % 2;
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.zbd);
        if (this.zbd) {
            int i4 = d + 77;
            g = i4 % 128;
            int i5 = i4 % 2;
            bundle.putInt("signInResultCode", this.zbe);
            bundle.putParcelable("signInResultData", this.zbf);
            int i6 = g + 69;
            d = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -916351692
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r41) {
        /*
            Method dump skipped, instruction units count: 14418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.SignInHubActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = g + 41;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        if (i4 != (-1230553996) + (((-136331845) | i5) * (-381)) + (((~((~i5) | (-1554080334))) | 2005509435) * 381) + 402825012) {
            throw null;
        }
        int i6 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = (int) Runtime.getRuntime().totalMemory();
        if (i6 != 1862978656 + (((~((-247728203) | i7)) | 180619266) * 345) + (((~((-247728203) | (~i7))) | (-2144258800)) * 345) + ((~(i7 | (-180619267))) * 345)) {
            int i8 = (-1426882400) % 2;
            throw new ArithmeticException();
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 46401), 40 - View.resolveSize(0, 0), View.MeasureSpec.getMode(0) + 19, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46400 - (ViewConfiguration.getTouchSlop() >> 8)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 40, (ViewConfiguration.getWindowTouchSlop() >> 8) + 19, 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
            super.onResume();
            int i9 = g + 17;
            d = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 9 / 0;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = d + 109;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), KeyEvent.normalizeMetaState(0) + 40, 19 - View.resolveSize(0, 0), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46400 - View.resolveSize(0, 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40, 19 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 41588667, false, "b", new Class[0]);
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
                super.onPause();
                return;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46400 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 41 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 19, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((Process.myTid() >> 22) + 46400), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 41, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 19, 41588667, false, "b", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(obj2, null);
            super.onPause();
            int i3 = 86 / 0;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        int i;
        Object[] objArr;
        int i2 = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29944);
            int maxKeyCode = 1755 - (KeyEvent.getMaxKeyCode() >> 16);
            int edgeSlop = 23 - (ViewConfiguration.getEdgeSlop() >> 16);
            byte b2 = $$a[54];
            Object[] objArr2 = new Object[1];
            e((byte) 37, b2, (short) (b2 | 32), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, maxKeyCode, edgeSlop, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i3 = g + 47;
            d = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char defaultSize = (char) (29944 - View.getDefaultSize(0, 0));
                int iArgb = 1755 - Color.argb(0, 0, 0, 0);
                int maxKeyCode2 = 23 - (KeyEvent.getMaxKeyCode() >> 16);
                byte[] bArr = $$a;
                Object[] objArr3 = new Object[1];
                e((byte) 52, bArr[54], bArr[5], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, iArgb, maxKeyCode2, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iMyUid = Process.myUid();
            int i5 = (((120607351 + (((~((-3541044) | iMyUid)) | (-209063480)) * (-502))) + ((~((~iMyUid) | (-2098))) * (-502))) + (((~(iMyUid | (-209061383))) | (-3541044)) * TypedValues.PositionType.TYPE_DRAWPATH)) - 1163504845;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            c(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_1).substring(26, 27).length() + 126, new byte[]{-105, -112, -117, -106, -115, -107, -121, -108, -126, -127, -110, -121, -127, -116, -127, -109}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            c(null, null, Color.alpha(0) + 127, new byte[]{-112, -125, -123, -103, -113, -106, -127, -104, -115, -117, -122, -117, -126, -112, -125, -122}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {683807379};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42049), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1725, 29 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = zzpu.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -1163504845, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char bitsPerPixel = (char) (29943 - ImageFormat.getBitsPerPixel(0));
                    int offsetAfter = 1755 - TextUtils.getOffsetAfter("", 0);
                    int scrollDefaultDelay = 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte[] bArr2 = $$a;
                    Object[] objArr8 = new Object[1];
                    e((byte) 52, bArr2[54], bArr2[5], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel, offsetAfter, scrollDefaultDelay, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    c(null, null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), new byte[]{-102, -118, -123, -110, -103, -105, -112, -117, -106, -115, -107, -121, -106, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    c(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, new byte[]{-112, -105, -122, -117, -110, -127, -112, -101, -125, -112, -106, -120, -127, -110, -112}, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29944);
                        int scrollBarFadeDuration = 1755 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int iMakeMeasureSpec = 23 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        Object[] objArr11 = new Object[1];
                        e((byte) 52, $$a[54], (short) 140, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, scrollBarFadeDuration, iMakeMeasureSpec, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29944);
                        int i8 = 1755 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 24;
                        byte b3 = $$a[54];
                        Object[] objArr12 = new Object[1];
                        e((byte) 37, b3, (short) (b3 | 32), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, i8, bitsPerPixel2, 986134021, false, (String) objArr12[0], null);
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
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        if (i10 == i9) {
            int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int i12 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1178687491;
            int i13 = (~(702442558 | i12)) | 369103424;
            int i14 = ~i12;
            int i15 = i11 + 2063492835 + ((i13 | (~((-156500999) | i14))) * 886) + (((~(i14 | (-702442559))) | 915044984) * (-1772)) + ((~(i14 | 915044984)) * 886);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr13[3])[0] = i17 ^ (i17 << 5);
            i = d + 87;
            g = i % 128;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
            int i18 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int i19 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1510933369;
            int i20 = (~((-194589209) | i19)) | 17829888;
            int i21 = ~i19;
            int i22 = i18 + 1459905429 + ((i20 | (~(194772537 | i21))) * 886) + (((~(i21 | 194589208)) | 18013217) * (-1772)) + ((~(i21 | 18013217)) * 886);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr14[3])[0] = i24 ^ (i24 << 5);
            i = g + 5;
            d = i % 128;
        }
        int i25 = i % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 1031;
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 15;
            Object[] objArr15 = new Object[1];
            e((byte) 52, $$a[54], (short) 88, objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(jumpTapTimeout, iIndexOf, capsMode, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        c(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 116, new byte[]{-102, -118, -123, -110, -103, -105, -112, -117, -106, -115, -107, -121, -106, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        c(null, null, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, new byte[]{-112, -105, -122, -117, -110, -127, -112, -101, -125, -112, -106, -120, -127, -110, -112}, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
            int i26 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1030;
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 15;
            byte[] bArr3 = $$a;
            Object[] objArr18 = new Object[1];
            e((byte) 52, bArr3[54], bArr3[5], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, i26, fadingEdgeLength, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i27 = g + 97;
            d = i27 % 128;
            int i28 = i27 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1031;
                int iIndexOf2 = 15 - TextUtils.indexOf("", "");
                byte b4 = $$a[7];
                Object[] objArr19 = new Object[1];
                e(b4, (byte) (b4 + 5), (short) DerHeader.TAG_CLASS_PRIVATE, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cCombineMeasuredStates, iNormalizeMetaState, iIndexOf2, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i29 = ((int[]) objArr20[3])[0];
            int i30 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i31 = (((((~((-158385668) | startElapsedRealtime)) | 140526081) * (-566)) - 1822336609) + ((~(startElapsedRealtime | (-17859587))) * 566)) - 589777324;
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr[2])[0] = i33 ^ (i33 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            c(null, null, 127 - (ViewConfiguration.getScrollBarSize() >> 8), new byte[]{-105, -112, -117, -106, -115, -107, -121, -108, -126, -127, -110, -121, -127, -116, -127, -109}, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            c(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, new byte[]{-112, -125, -123, -103, -113, -106, -127, -104, -115, -117, -122, -117, -126, -112, -125, -122}, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {683807379};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46037 - TextUtils.lastIndexOf("", '0')), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1133, 19 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -589777324, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int maximumFlingVelocity = 1031 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int mode = View.MeasureSpec.getMode(0) + 15;
                Object[] objArr25 = new Object[1];
                e((byte) 52, $$a[54], (short) 88, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(tapTimeout, maximumFlingVelocity, mode, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.keyCodeFromString("") + 45993), 1117 - (ViewConfiguration.getJumpTapTimeout() >> 16), 17 - (ViewConfiguration.getEdgeSlop() >> 16)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                int iIndexOf3 = 1031 - TextUtils.indexOf("", "");
                int iAxisFromString = 14 - MotionEvent.axisFromString("");
                byte b5 = $$a[7];
                Object[] objArr26 = new Object[1];
                e(b5, (byte) (b5 + 5), (short) DerHeader.TAG_CLASS_PRIVATE, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(offsetBefore, iIndexOf3, iAxisFromString, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                c(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 21, new byte[]{-102, -118, -123, -110, -103, -105, -112, -117, -106, -115, -107, -121, -106, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                c(null, null, View.resolveSizeAndState(0, 0, 0) + 127, new byte[]{-112, -105, -122, -117, -110, -127, -112, -101, -125, -112, -106, -120, -127, -110, -112}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int trimmedLength = TextUtils.getTrimmedLength("") + 1031;
                    int packedPositionChild = 14 - ExpandableListView.getPackedPositionChild(0L);
                    byte[] bArr4 = $$a;
                    Object[] objArr29 = new Object[1];
                    e((byte) 52, bArr4[54], bArr4[5], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(windowTouchSlop, trimmedLength, packedPositionChild, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c4 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0) + 1032;
                    int touchSlop = 15 - (ViewConfiguration.getTouchSlop() >> 8);
                    Object[] objArr30 = new Object[1];
                    e((byte) 52, $$a[54], (short) 88, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c4, bitsPerPixel3, touchSlop, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i34 = d + 111;
                g = i34 % 128;
                int i35 = i34 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i36 = ((int[]) objArr[1])[0];
        int i37 = ((int[]) objArr[3])[0];
        if (i37 == i36) {
            int i38 = d + 7;
            g = i38 % 128;
            int i39 = i38 % 2;
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i40 = ((int[]) objArr[2])[0];
            int i41 = ((int[]) objArr[3])[0];
            int i42 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step4).substring(76, 78).length() + 732888541;
            int i43 = i40 + (((1739565539 + (((~length) | 269488132) * 1324)) + (((~(length | (-636350140))) | (~(880630309 | length))) * (-1324))) - 1815286570);
            int i44 = i43 ^ (i43 << 13);
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr31[2])[0] = i45 ^ (i45 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i46 = d + 37;
            g = i46 % 128;
            int i47 = i46 % 2;
            for (String str2 : strArr4) {
                arrayList2.add(str2);
            }
        }
        Toast.makeText((Context) null, i37 / (((i37 - 1) * i37) % 2), 0).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i48 = ((int[]) objArr[2])[0];
        int i49 = ((int[]) objArr[3])[0];
        int i50 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_guideline_text).substring(9, 10).codePointAt(0) + 1120380185;
        int i51 = ~iCodePointAt;
        int i52 = i48 + (-1845692181) + (((~(397756893 | i51)) | (~((-642037064) | iCodePointAt))) * 210) + (((~(iCodePointAt | 938868191)) | (~(i51 | (-100925766)))) * 210);
        int i53 = (i52 << 13) ^ i52;
        int i54 = i53 ^ (i53 >>> 17);
        ((int[]) objArr32[2])[0] = i54 ^ (i54 << 5);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = g + 115;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
        if (i4 != ((((~(991151963 | i5)) | (-847834080)) * 262) - 1284457328) + (((~((~i5) | 991151963)) | (-847834080)) * 262)) {
            throw new RuntimeException("-2071686957");
        }
        int i6 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        if (i6 != (-2048010436) + (((~(i7 | 710543933)) | (-1868512064)) * (-160)) + (((~(i7 | (-1868512032))) | 710543933) * 160)) {
            throw null;
        }
        super.onStart();
        int i8 = d + 93;
        g = i8 % 128;
        int i9 = i8 % 2;
    }

    static {
        b = 0;
        TuitionPaymentFragmentbindingInflater1();
        int i = f768a + 73;
        b = i % 128;
        int i2 = i % 2;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i = 2 % 2;
        int i2 = d + 91;
        g = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    final /* synthetic */ int zba() {
        int i;
        int i2 = 2 % 2;
        int i3 = g + 97;
        int i4 = i3 % 128;
        d = i4;
        if (i3 % 2 == 0) {
            i = this.zbe;
            int i5 = 14 / 0;
        } else {
            i = this.zbe;
        }
        int i6 = i4 + 75;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ Intent zbb() {
        int i = 2 % 2;
        int i2 = g + 71;
        d = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = this.zbf;
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return intent;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{47394, 47445, 47455, 47441, 47444, 47450, 47381, 47443, 47362, 47392, 47439, 47437, 47434, 47407, 47451, 47454, 47438, 47447, 47449, 47452, 47408, 47440, 47446, 47419, 47360, 47448, 47409, 47377, 47453, 47393, 47373, 47370, 47374, 47372, 47378, 47376, 47375, 47371, 47379};
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2047719619;
        TuitionPaymentFragmentbindingInflater1 = true;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r7, short r8, byte r9) {
        /*
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r0 = com.google.android.gms.auth.api.signin.internal.SignInHubActivity.$$c
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r9 = 68 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r9 = r8
            r4 = r2
            goto L28
        L15:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r9]
        L28:
            int r8 = r8 + r3
            int r9 = r9 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.SignInHubActivity.$$g(int, short, byte):java.lang.String");
    }
}
