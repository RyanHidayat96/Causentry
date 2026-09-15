package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
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
import com.bpjstku.R;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.libraries.places.internal.zzpu;
import defpackage.CaptureSession1;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.getConfigs;
import defpackage.initSession;
import defpackage.isTerminated;
import defpackage.myLooperExecutor;
import defpackage.newHandlerExecutor;
import defpackage.onCaptureSessionStart;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    protected int zaa = 0;
    private static final byte[] $$c = {59, -124, -78, 46};
    private static final int $$f = 187;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {68, -119, -76, 97, 31, -1, -3, 11, -2, -19, -1, 8, -9, -20, 32, -5, -14, -7, 0, 0, 12, -48, 49, -6, -17, 11, -6, -15, 9, -27, 36, -13, 4, -14, -5, 13, -13, -8, -25, 19, 10, -13, 0, -5, -51, 31, -14, 9, -13, 4, -3, -32, 15, 22, -14, -10, 7, 4, -48, 42, -19, 4, 4, -10, 7, 4, -3, -5, -13, -4, 4, -10, 9, -5, 3, -4, -5, 3, -11, -3, 16, -15, -6, 16, -44, 32, -13, -1, 5, -10, -1, -1, -7, 18, -11, 6, -69, 10, -4, -65, 50, 12, -8, 7, -1, -11, 8, -73, 52, -5, 17, -21, -53, 65, 2, -18, 14, -18, 2, 3, -9, -59, 66, -15, 6, 0, 3, -17, -57, 33, 34, -18, 14, -18, 2, 3, -9, -40, 45, -9, -16, 13, -36, 17, 9, -13, -6, 17, -13, 3, -9, -39, 49, -5, -1, -1, -36, 17, 10, 2, -18, 12, -1, -3, 31, -14, 9, -13, 4, -3, -32, 15, 22, -14, -10, 7, 4, -48, 42, -19, 4, 4, -10, 7, 4, -20, 5, 3, -12, 3, 3, -9, -32, 35, -10, 4, -13, 17, -17, 11, -67, 10, -4, -65, 55, 6, -2, -10, 3, -9, -57, 49, 11, -12, 12, -5, -8, -7, -56, 55, 4, 4, -71, 57, 3, 4, -17, 11, -6, -15, 9, -64, Base64.padSymbol, -3, -3, -4, 9, -23, 21, -15, 8, -12, 4, -3, -17, 5, -7, 0, 0, -57, 74, -2, -16, -2, 10, -4, -65, 55, 6, -2, -10, 3, -9, -57, 49, 11, -12, 12, -5, -8, -7, -56, 60, -5, -9, 14, -19, 15, -11, -6, 12, -71, 64, -6, -13, 0, 0, 12, -71, 49, 13, -9, -61, Base64.padSymbol, 0, -13, -1, 5, -64, 59, 2, 3, -10, -5, 3, -66, 19, 42, -3, -2, -11, -4, 15, -7, 1, -51, 36, -2, 9, -15, 0, -8, 17, -13, 4, -3, -37, 39, 31, -14, 9, -13, 4, -3, -32, 15, 22, -14, -10, 7, 4, -48, 42, -19, 4, 4, -10, 7, 4, -3, -5, -13, -4, 4, -10, 9, -5, 3, -4, -5, 3, -11, -3, 16, -15, -6, 16, -44, 32, -13, -1, 5, -10, -1, -1, -7, 18, -11, 6, -67, 7, -9, -6, 11, -27, 25, -31, 16, 12, -2, -12, 4, -3, 10, -4, -65, 50, 12, -8, 7, -1, -11, 8, -73, 52, -5, 17, -21, -53, 64, -17, 22, -14, -10, 7, 4, -72, Base64.padSymbol, 0, -13, -1, 5, -64, 66, -15, 10, 2, -18, 12, -1, -72, 22, 39, 1, -17, 0, -34, 49, -10, -9, 7, -15, -23, 15, 22, -14, -10, 7, 4, -41, 22, 13, -14, 5, -13, -20, 17, 10, 2, -18, 12, -1};
    private static final int $$e = 21;
    private static final byte[] $$a = {90, 46, 113, 8, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
    private static final int $$b = 223;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int b = 1;
    private static int[] TuitionPaymentFragmentbindingInflater1 = {693687498, -922642205, -45467154, -76057423, 1118133461, 819021665, -1246113180, -402482610, -1384282004, -1929711141, -901935558, -2135853807, -1607656827, -772121509, 898267232, -487955970, -929020313, 2115748542};

    private static void c(short s, short s2, int i, Object[] objArr) {
        int i2 = s + 84;
        int i3 = s2 + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 = (i2 + (-i)) - 11;
            i3++;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == i) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (i2 + (-bArr[i3])) - 11;
                i3++;
            }
        }
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
    private static void d(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            int r9 = 115 - r9
            int r7 = r7 + 1
            byte[] r0 = com.google.android.gms.common.api.GoogleApiActivity.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r9
            r4 = r2
            r9 = r8
            goto L26
        L11:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r9]
        L26:
            int r8 = r8 + r3
            int r9 = r9 + 1
            int r8 = r8 + 2
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApiActivity.d(short, int, short, java.lang.Object[]):void");
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = b + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.zaa = 0;
        setResult(0);
        finish();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    public static Intent zaa(Context context, PendingIntent pendingIntent, int i, boolean z) {
        int i2 = 2 % 2;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra(CloudMessagingReceiver.IntentKeys.PENDING_INTENT, pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 30 / 0;
        }
        return intent;
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
            b = i4 % 128;
            int i5 = i4 % 2;
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.zaa = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
                b = i6 % 128;
                Object obj = null;
                if (i6 % 2 == 0) {
                    GoogleApiManager.zak(this);
                    obj.hashCode();
                    throw null;
                }
                GoogleApiManager googleApiManagerZak = GoogleApiManager.zak(this);
                if (i2 == -1) {
                    googleApiManagerZak.zay();
                    int i7 = b + 77;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 2 % 5;
                    }
                } else if (i2 == 0) {
                    googleApiManagerZak.zax(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.zaa = 0;
            setResult(i2, intent);
        }
        finish();
    }

    private final void zab() {
        int i = 2 % 2;
        Bundle extras = getIntent().getExtras();
        Object obj = null;
        if (extras == null) {
            int i2 = b + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 == 0) {
                finish();
                return;
            } else {
                finish();
                obj.hashCode();
                throw null;
            }
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get(CloudMessagingReceiver.IntentKeys.PENDING_INTENT);
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            finish();
            int i3 = b + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        if (pendingIntent == null) {
            GoogleApiAvailability.getInstance().showErrorDialogFragment(this, ((Integer) Preconditions.checkNotNull(num)).intValue(), 2, this);
            this.zaa = 1;
            int i5 = b + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            this.zaa = 1;
        } catch (ActivityNotFoundException unused) {
            if (extras.getBoolean("notify_manager", true)) {
                GoogleApiManager.zak(this).zax(new ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                pendingIntent.toString();
                Build.FINGERPRINT.contains("generic");
            }
            this.zaa = 1;
            finish();
        } catch (IntentSender.SendIntentException unused2) {
            finish();
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentbindingInflater1;
        long j = 0;
        int i3 = -1870535734;
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $11 + 43;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)));
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 3291;
                        int size = 31 - View.MeasureSpec.getSize(0);
                        byte b2 = (byte) ($$f & 5);
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, tapTimeout, size, 1948206109, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i8++;
                    j = 0;
                    i3 = -1870535734;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentbindingInflater1;
        if (iArr5 != null) {
            int i9 = $11 + 27;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                try {
                    Object[] objArr3 = new Object[i4];
                    objArr3[i5] = Integer.valueOf(iArr5[i11]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i12 = 3292 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int iIndexOf = TextUtils.indexOf("", "") + 31;
                        byte b4 = (byte) ($$f & 5);
                        byte b5 = (byte) (b4 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, i12, iIndexOf, 1948206109, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i11++;
                    iArr5 = iArr5;
                    i4 = 1;
                    i5 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        int i13 = i5;
        System.arraycopy(iArr5, i13, iArr4, i13, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i14 = $10 + 65;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i16 = 17;
            for (int i17 = 1; i16 > i17; i17 = 1) {
                int i18 = $10 + 15;
                $11 = i18 % 128;
                int i19 = i18 % 2;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i16];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.MeasureSpec.getSize(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 2560, (ViewConfiguration.getLongPressTimeout() >> 16) + 29, 683220507, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i16--;
            }
            int i20 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i21 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28878 - TextUtils.lastIndexOf("", '0', 0)), 348 - (ViewConfiguration.getTapTimeout() >> 16), 25 - (ViewConfiguration.getScrollBarSize() >> 8), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
        int i22 = $10 + 121;
        $11 = i22 % 128;
        if (i22 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:331:0x1f3f  */
    /* JADX WARN: Code duplicated, block: B:332:0x1fb7  */
    /* JADX WARN: Code duplicated, block: B:335:0x204d  */
    /* JADX WARN: Code duplicated, block: B:338:0x20b0  */
    /* JADX WARN: Code duplicated, block: B:341:0x2108  */
    /* JADX WARN: Code duplicated, block: B:343:0x2111  */
    /* JADX WARN: Code duplicated, block: B:345:0x21b8  */
    /* JADX WARN: Code duplicated, block: B:348:0x21c2 A[Catch: all -> 0x31b0, TryCatch #3 {all -> 0x31b0, blocks: (B:379:0x2547, B:381:0x254d, B:382:0x257b, B:436:0x2b16, B:438:0x2b2b, B:439:0x2b5b, B:404:0x2738, B:406:0x274d, B:407:0x2783, B:409:0x27b7, B:410:0x282d, B:346:0x21bc, B:348:0x21c2, B:349:0x21ec, B:351:0x2217, B:352:0x22aa, B:110:0x0b27, B:112:0x0b3c, B:113:0x0b6f, B:115:0x0bac, B:116:0x0c2e), top: B:550:0x0b27 }] */
    /* JADX WARN: Code duplicated, block: B:351:0x2217 A[Catch: all -> 0x31b0, TryCatch #3 {all -> 0x31b0, blocks: (B:379:0x2547, B:381:0x254d, B:382:0x257b, B:436:0x2b16, B:438:0x2b2b, B:439:0x2b5b, B:404:0x2738, B:406:0x274d, B:407:0x2783, B:409:0x27b7, B:410:0x282d, B:346:0x21bc, B:348:0x21c2, B:349:0x21ec, B:351:0x2217, B:352:0x22aa, B:110:0x0b27, B:112:0x0b3c, B:113:0x0b6f, B:115:0x0bac, B:116:0x0c2e), top: B:550:0x0b27 }] */
    /* JADX WARN: Code duplicated, block: B:355:0x22bd  */
    /* JADX WARN: Code duplicated, block: B:360:0x2324  */
    /* JADX WARN: Code duplicated, block: B:363:0x2378  */
    /* JADX WARN: Code duplicated, block: B:367:0x23d2  */
    /* JADX WARN: Code duplicated, block: B:368:0x2468  */
    /* JADX WARN: Code duplicated, block: B:370:0x2474  */
    /* JADX WARN: Code duplicated, block: B:373:0x2478 A[LOOP:3: B:371:0x2475->B:373:0x2478, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:377:0x2516  */
    /* JADX WARN: Code duplicated, block: B:381:0x254d A[Catch: all -> 0x31b0, TryCatch #3 {all -> 0x31b0, blocks: (B:379:0x2547, B:381:0x254d, B:382:0x257b, B:436:0x2b16, B:438:0x2b2b, B:439:0x2b5b, B:404:0x2738, B:406:0x274d, B:407:0x2783, B:409:0x27b7, B:410:0x282d, B:346:0x21bc, B:348:0x21c2, B:349:0x21ec, B:351:0x2217, B:352:0x22aa, B:110:0x0b27, B:112:0x0b3c, B:113:0x0b6f, B:115:0x0bac, B:116:0x0c2e), top: B:550:0x0b27 }] */
    /* JADX WARN: Code duplicated, block: B:385:0x2588  */
    /* JADX WARN: Code duplicated, block: B:386:0x2593  */
    /* JADX WARN: Code duplicated, block: B:389:0x259a  */
    /* JADX WARN: Code duplicated, block: B:392:0x25a6  */
    /* JADX WARN: Code duplicated, block: B:395:0x2611  */
    /* JADX WARN: Code duplicated, block: B:398:0x2662  */
    /* JADX WARN: Code duplicated, block: B:400:0x266b  */
    /* JADX WARN: Code duplicated, block: B:403:0x271a  */
    /* JADX WARN: Code duplicated, block: B:406:0x274d A[Catch: all -> 0x31b0, TryCatch #3 {all -> 0x31b0, blocks: (B:379:0x2547, B:381:0x254d, B:382:0x257b, B:436:0x2b16, B:438:0x2b2b, B:439:0x2b5b, B:404:0x2738, B:406:0x274d, B:407:0x2783, B:409:0x27b7, B:410:0x282d, B:346:0x21bc, B:348:0x21c2, B:349:0x21ec, B:351:0x2217, B:352:0x22aa, B:110:0x0b27, B:112:0x0b3c, B:113:0x0b6f, B:115:0x0bac, B:116:0x0c2e), top: B:550:0x0b27 }] */
    /* JADX WARN: Code duplicated, block: B:409:0x27b7 A[Catch: all -> 0x31b0, TryCatch #3 {all -> 0x31b0, blocks: (B:379:0x2547, B:381:0x254d, B:382:0x257b, B:436:0x2b16, B:438:0x2b2b, B:439:0x2b5b, B:404:0x2738, B:406:0x274d, B:407:0x2783, B:409:0x27b7, B:410:0x282d, B:346:0x21bc, B:348:0x21c2, B:349:0x21ec, B:351:0x2217, B:352:0x22aa, B:110:0x0b27, B:112:0x0b3c, B:113:0x0b6f, B:115:0x0bac, B:116:0x0c2e), top: B:550:0x0b27 }] */
    /* JADX WARN: Code duplicated, block: B:413:0x2840  */
    /* JADX WARN: Code duplicated, block: B:418:0x28ab  */
    /* JADX WARN: Code duplicated, block: B:421:0x28fe  */
    /* JADX WARN: Code duplicated, block: B:425:0x2952  */
    /* JADX WARN: Code duplicated, block: B:427:0x29e0  */
    /* JADX WARN: Code duplicated, block: B:430:0x2a28  */
    /* JADX WARN: Code duplicated, block: B:432:0x2a3b  */
    /* JADX WARN: Code duplicated, block: B:435:0x2af8  */
    /* JADX WARN: Code duplicated, block: B:438:0x2b2b A[Catch: all -> 0x31b0, TryCatch #3 {all -> 0x31b0, blocks: (B:379:0x2547, B:381:0x254d, B:382:0x257b, B:436:0x2b16, B:438:0x2b2b, B:439:0x2b5b, B:404:0x2738, B:406:0x274d, B:407:0x2783, B:409:0x27b7, B:410:0x282d, B:346:0x21bc, B:348:0x21c2, B:349:0x21ec, B:351:0x2217, B:352:0x22aa, B:110:0x0b27, B:112:0x0b3c, B:113:0x0b6f, B:115:0x0bac, B:116:0x0c2e), top: B:550:0x0b27 }] */
    /* JADX WARN: Code duplicated, block: B:442:0x2b71  */
    /* JADX WARN: Code duplicated, block: B:447:0x2bd9  */
    /* JADX WARN: Code duplicated, block: B:450:0x2c2f  */
    /* JADX WARN: Code duplicated, block: B:454:0x2c84  */
    /* JADX WARN: Code duplicated, block: B:456:0x2d2a  */
    /* JADX WARN: Code duplicated, block: B:459:0x2d98  */
    /* JADX WARN: Code duplicated, block: B:462:0x2dec  */
    /* JADX WARN: Code duplicated, block: B:464:0x2df5  */
    /* JADX WARN: Code duplicated, block: B:467:0x2eda  */
    /* JADX WARN: Code duplicated, block: B:471:0x2f64  */
    /* JADX WARN: Code duplicated, block: B:476:0x2fd0  */
    /* JADX WARN: Code duplicated, block: B:479:0x3026  */
    /* JADX WARN: Code duplicated, block: B:483:0x307b  */
    /* JADX WARN: Code duplicated, block: B:485:0x3114  */
    /* JADX WARN: Code duplicated, block: B:487:0x3120  */
    /* JADX WARN: Code duplicated, block: B:490:0x312e A[LOOP:0: B:488:0x312b->B:490:0x312e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:495:0x313e  */
    /* JADX WARN: Code duplicated, block: B:497:0x314a  */
    /* JADX WARN: Code duplicated, block: B:500:0x314e A[LOOP:1: B:498:0x314b->B:500:0x314e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:505:0x3166  */
    /* JADX WARN: Code duplicated, block: B:507:0x3172  */
    /* JADX WARN: Code duplicated, block: B:510:0x3176 A[LOOP:2: B:508:0x3173->B:510:0x3176, LOOP_END] */
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i;
        String str;
        String str2;
        Object[] objArr3;
        char c;
        String str3;
        Object[] objArr4;
        String str4;
        Object[] objArr5;
        String str5;
        Object[] objArr6;
        String str6;
        int i2;
        Object[] objArr7;
        String str7;
        int i3;
        int i4;
        int i5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j;
        long jLongValue;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object[] objArr8;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList;
        String[] strArr;
        int i9;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11;
        GoogleApiActivity googleApiActivity;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12;
        long j2;
        long jLongValue2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15;
        Object[] objArr9;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18;
        ArrayList arrayList2;
        String[] strArr2;
        int i10;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23;
        int i11;
        int i12;
        ArrayList arrayList3;
        String[] strArr3;
        int i13;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24;
        long j3;
        long jLongValue3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28;
        Object[] objArr10;
        ArrayList arrayList4;
        String[] strArr4;
        int i14;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32;
        int i15 = 2 % 2;
        int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        b = i16 % 128;
        int i17 = i16 % 2;
        Object[] objArr11 = new Object[1];
        a(new int[]{-1731451608, -1601602908, 1817432407, 734291081, 106304590, 872144152, -721907688, -847217688, -1669423247, -316142485, 1849285208, -1598630883, -32109610, -1998979481}, 22 - TextUtils.indexOf("", "", 0), objArr11);
        String str8 = (String) objArr11[0];
        Object[] objArr12 = new Object[1];
        a(new int[]{1054582264, -1475515551, -34735432, -367108409, 2020721752, 1829823907, -257365442, 1844189524, -1530916251, 868747907}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15, objArr12);
        String str9 = (String) objArr12[0];
        Object[] objArr13 = new Object[1];
        a(new int[]{-776079623, -1868173187, 174537201, -176057660, -884632874, -1763246560, 968308494, 1306062793, 1226016571, -1776443230}, 16 - (ViewConfiguration.getEdgeSlop() >> 16), objArr13);
        String str10 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        a(new int[]{-2092080144, -621420688, 943363041, 490785373, -1240413694, 198182681, 117529371, 790262218, -975967425, -1922948330}, 16 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr14);
        String str11 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        a(new int[]{1801921947, -642448084, 1174816213, 2116025852, -464407982, 1299934881, 993237571, 131273952, -39560771, -1835750090, 1382648480, -809877912, 1100353097, -798131082, -955557557, -730105305}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_confirm_button).substring(1, 3).codePointAt(1) - 95, objArr15);
        String str12 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        a(new int[]{-2130843012, -593458025, 566453901, -1722988451, -222248999, 605196354, 644982368, 1083375258, -78558738, 2146484126, 119261636, -500760330}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18, objArr16);
        String str13 = (String) objArr16[0];
        int i18 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iMyUid = Process.myUid();
        int i19 = ~iMyUid;
        if (i18 != 804938056 + (((~(i19 | 989111849)) | (~(1819099392 | i19)) | (-2130569002)) * 464) + (((-311469610) | iMyUid) * (-464)) + (((-2130569002) | (~(iMyUid | 989111849))) * 464)) {
            throw new RuntimeException("-1291404784");
        }
        int i20 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i21 = ~System.identityHashCode(this);
        if (i20 != (((-856319252) + (((~((-1887978153) | i21)) | 172066821) * (-828))) + ((i21 | (-1887978153)) * (-828))) - 122185888) {
            int i22 = (-725703656) % 2;
            throw new ArithmeticException();
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
            char cResolveSize = (char) (View.resolveSize(0, 0) + 31533);
            int maxKeyCode = 921 - (KeyEvent.getMaxKeyCode() >> 16);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 29;
            byte b2 = (byte) ($$b & 46);
            short s = $$a[7];
            Object[] objArr17 = new Object[1];
            c(b2, s, (byte) s, objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(cResolveSize, maxKeyCode, iLastIndexOf, -1048449946, false, (String) objArr17[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).getLong(null) != -1) {
            int i23 = b + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i23 % 128;
            int i24 = i23 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 31534);
                int iKeyCodeFromString = 921 - KeyEvent.keyCodeFromString("");
                int iGreen = 28 - Color.green(0);
                byte b3 = $$a[7];
                short s2 = b3;
                Object[] objArr18 = new Object[1];
                c(b3, s2, (byte) (s2 | 37), objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(cIndexOf, iKeyCodeFromString, iGreen, -1142834547, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr19[1])[0]}, (Object[]) objArr19[2], new int[]{((int[]) objArr19[3])[0]}, (String[]) objArr19[4]};
            int i25 = ~((~Process.myUid()) | 936923954);
            int i26 = (((102236178 | i25) * (-970)) - 34366577) + ((i25 | 834687776) * 970) + 2080826823;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr[0])[0] = i28 ^ (i28 << 5);
            str12 = str12;
            str13 = str13;
            str9 = str9;
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i29 = b + 35;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i29 % 128;
                int i30 = i29 % 2;
                baseContext = (Context) Class.forName(str12).getMethod(str13, new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            int iIntValue = ((Integer) Class.forName(str10).getMethod(str11, Object.class).invoke(null, this)).intValue();
            int i31 = b + 53;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i31 % 128;
            int i32 = i31 % 2;
            try {
                Object[] objArr20 = {baseContext, Integer.valueOf(iIntValue), 0, 2080826823};
                byte[] bArr = $$d;
                byte b4 = (byte) (-bArr[449]);
                short s3 = bArr[18];
                Object[] objArr21 = new Object[1];
                d(b4, s3, (byte) (s3 | 47), objArr21);
                Class<?> cls = Class.forName((String) objArr21[0]);
                Object[] objArr22 = new Object[1];
                d(bArr[108], (short) (-bArr[449]), bArr[4], objArr22);
                Object[] objArr23 = (Object[]) cls.getMethod((String) objArr22[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr20);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                    char cResolveSizeAndState = (char) (31533 - View.resolveSizeAndState(0, 0, 0));
                    int packedPositionGroup = 921 - ExpandableListView.getPackedPositionGroup(0L);
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 28;
                    byte b5 = $$a[7];
                    short s4 = b5;
                    Object[] objArr24 = new Object[1];
                    c(b5, s4, (byte) (s4 | 37), objArr24);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(cResolveSizeAndState, packedPositionGroup, touchSlop, -1142834547, false, (String) objArr24[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, objArr23);
                try {
                    long jLongValue4 = ((Long) Class.forName(str8).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue4);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                        char gidForName = (char) (31532 - Process.getGidForName(""));
                        int i33 = 922 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int iIndexOf = 28 - TextUtils.indexOf("", "");
                        byte b6 = $$a[7];
                        Object[] objArr25 = new Object[1];
                        c(b6, (short) (b6 | 37), (byte) 52, objArr25);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(gidForName, i33, iIndexOf, -778300370, false, (String) objArr25[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue4 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                        char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31533);
                        int i34 = 921 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iBlue = 28 - Color.blue(0);
                        byte b7 = (byte) ($$b & 46);
                        short s5 = $$a[7];
                        Object[] objArr26 = new Object[1];
                        c(b7, s5, (byte) s5, objArr26);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(keyRepeatTimeout, i34, iBlue, -1048449946, false, (String) objArr26[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, lValueOf2);
                    objArr = objArr23;
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
        int i35 = ((int[]) objArr[1])[0];
        int i36 = ((int[]) objArr[3])[0];
        if (i36 == i35) {
            int i37 = ((int[]) objArr[0])[0];
            Object[] objArr27 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i38 = (-403930261) + (((~((-238080710) | iIdentityHashCode)) | 167793348 | (~((-1535998935) | iIdentityHashCode))) * (-880));
            int i39 = (~((-238080710) | (~iIdentityHashCode))) | 1535998934;
            int i40 = ~(iIdentityHashCode | 238080709);
            int i41 = i37 + i38 + ((i39 | i40) * (-880)) + (i40 * 880);
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArr27[0])[0] = i43 ^ (i43 << 5);
        } else {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr5 = (String[]) objArr[4];
            if (strArr5 != null) {
                for (String str14 : strArr5) {
                    arrayList5.add(str14);
                }
            }
            int[] iArr = new int[i36];
            int i44 = i36 - 1;
            iArr[i44] = 1;
            Toast.makeText((Context) null, iArr[((i36 * i44) % 2) - 1], 1).show();
            int i45 = ((int[]) objArr[0])[0];
            Object[] objArr28 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i46 = (-42346919) + ((iIdentityHashCode2 | 740026537) * (-50));
            int i47 = ~((-738353313) | iIdentityHashCode2);
            int i48 = ~iIdentityHashCode2;
            int i49 = i45 + i46 + ((i47 | (~((-295699795) | i48))) * 50) + (((~(i48 | 740026537)) | (~((-1034053107) | i48)) | 295699794) * 50);
            int i50 = (i49 << 13) ^ i49;
            int i51 = i50 ^ (i50 >>> 17);
            ((int[]) objArr28[0])[0] = i51 ^ (i51 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
            char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43041);
            int maxKeyCode2 = 3111 - (KeyEvent.getMaxKeyCode() >> 16);
            int i52 = 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            byte b8 = $$a[7];
            Object[] objArr29 = new Object[1];
            c(b8, (short) (b8 | 89), (byte) 52, objArr29);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(c2, maxKeyCode2, i52, -1272852037, false, (String) objArr29[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                char defaultSize = (char) (View.getDefaultSize(0, 0) + 43042);
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3111;
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 23;
                byte b9 = $$a[7];
                short s6 = b9;
                Object[] objArr30 = new Object[1];
                c(b9, s6, (byte) (s6 | 37), objArr30);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(defaultSize, minimumFlingVelocity, iLastIndexOf2, 154975793, false, (String) objArr30[0], null);
            }
            Object[] objArr31 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).get(null);
            int i53 = ((int[]) objArr31[2])[0];
            int i54 = ((int[]) objArr31[1])[0];
            String[] strArr6 = (String[]) objArr31[3];
            int[] iArr2 = {i54};
            int i55 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
            int i56 = ~i55;
            int i57 = (~((-814456677) | i56)) | 9078848 | (~(890574782 | i56));
            int i58 = (-254978122) + (((~(i55 | (-85196955))) | i57) * 590) + (i57 * (-1180)) + (((~((-890574783) | i56)) | (~(i56 | 814456676))) * 590) + 513258374;
            int i59 = (i58 << 13) ^ i58;
            int i60 = i59 ^ (i59 >>> 17);
            ((int[]) objArr2[0])[0] = i60 ^ (i60 << 5);
            objArr2 = new Object[]{new int[1], iArr2, new int[]{i53}, strArr6};
        } else {
            Object[] objArr32 = {null, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str11, Object.class).invoke(null, this)).intValue()), 0, 513258374};
            byte[] bArr2 = $$d;
            Object[] objArr33 = new Object[1];
            d((byte) (bArr2[59] + 1), (short) ($$e | 72), bArr2[80], objArr33);
            Class<?> cls2 = Class.forName((String) objArr33[0]);
            byte b10 = bArr2[18];
            Object[] objArr34 = new Object[1];
            d(b10, (short) (b10 | 136), bArr2[110], objArr34);
            Object[] objArr35 = (Object[]) cls2.getMethod((String) objArr34[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr32);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                char c3 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 43042);
                int i61 = 3111 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int iAxisFromString = 21 - MotionEvent.axisFromString("");
                byte b11 = $$a[7];
                short s7 = b11;
                Object[] objArr36 = new Object[1];
                c(b11, s7, (byte) (s7 | 37), objArr36);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(c3, i61, iAxisFromString, 154975793, false, (String) objArr36[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, objArr35);
            try {
                str9 = str9;
                long jLongValue5 = ((Long) Class.forName(str8).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue5);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                    char scrollDefaultDelay = (char) (43042 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3111;
                    int iIndexOf2 = 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    byte b12 = $$a[7];
                    Object[] objArr37 = new Object[1];
                    c(b12, (short) (b12 | 37), (byte) 52, objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(scrollDefaultDelay, keyRepeatDelay, iIndexOf2, -1269618118, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue5 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                    char cLastIndexOf = (char) (43041 - TextUtils.lastIndexOf("", '0'));
                    int iRgb = (-16774105) - Color.rgb(0, 0, 0);
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 22;
                    byte b13 = $$a[7];
                    Object[] objArr38 = new Object[1];
                    c(b13, (short) (b13 | 89), (byte) 52, objArr38);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(cLastIndexOf, iRgb, longPressTimeout, -1272852037, false, (String) objArr38[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, lValueOf4);
                objArr2 = objArr35;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i62 = ((int[]) objArr2[1])[0];
        int i63 = ((int[]) objArr2[2])[0];
        if (i63 == i62) {
            int i64 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
            b = i64 % 128;
            int i65 = i64 % 2;
            int i66 = ((int[]) objArr2[0])[0];
            int i67 = ((int[]) objArr2[2])[0];
            int i68 = ((int[]) objArr2[1])[0];
            String[] strArr7 = (String[]) objArr2[3];
            int[] iArr3 = {i68};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i69 = i66 + 934697370 + (((~((-35701126) | iIdentityHashCode3)) | (~(1669330333 | iIdentityHashCode3))) * 69) + (((~(iIdentityHashCode3 | 1667294597)) | (~((-37736862) | iIdentityHashCode3)) | 2035736) * (-69)) + 910799872;
            int i70 = (i69 << 13) ^ i69;
            int i71 = i70 ^ (i70 >>> 17);
            ((int[]) objArr[0])[0] = i71 ^ (i71 << 5);
            Object[] objArr39 = {new int[1], iArr3, new int[]{i67}, strArr7};
            i = 0;
        } else {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr8 = (String[]) objArr2[3];
            if (strArr8 != null) {
                for (String str15 : strArr8) {
                    arrayList6.add(str15);
                }
            }
            int[] iArr4 = new int[i63];
            int i72 = i63 - 1;
            iArr4[i72] = 1;
            Toast.makeText((Context) null, iArr4[((i63 * i72) % 2) - 1], 1).show();
            int i73 = ((int[]) objArr2[0])[0];
            int i74 = ((int[]) objArr2[2])[0];
            int i75 = ((int[]) objArr2[1])[0];
            String[] strArr9 = (String[]) objArr2[3];
            int[] iArr5 = {i74};
            int iMyUid2 = Process.myUid();
            int i76 = (-872669592) + (((~((~iMyUid2) | (-1110212297))) | 1074284160) * (-245));
            int i77 = ~(iMyUid2 | (-1110212297));
            int i78 = i73 + i76 + (i77 * (-245)) + ((i77 | 594819162) * 245);
            int i79 = (i78 << 13) ^ i78;
            int i80 = i79 ^ (i79 >>> 17);
            i = 0;
            ((int[]) objArr[0])[0] = i80 ^ (i80 << 5);
            Object[] objArr40 = {new int[1], new int[]{i75}, iArr5, strArr9};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
            char offsetAfter = (char) (TextUtils.getOffsetAfter("", i) + 53893);
            int pressedStateDuration = 1320 - (ViewConfiguration.getPressedStateDuration() >> 16);
            int mode = 36 - View.MeasureSpec.getMode(i);
            byte b14 = (byte) ($$b & 46);
            short s8 = $$a[7];
            Object[] objArr41 = new Object[1];
            c(b14, s8, (byte) s8, objArr41);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(offsetAfter, pressedStateDuration, mode, -1433084963, false, (String) objArr41[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                char cIndexOf2 = (char) (53892 - TextUtils.indexOf((CharSequence) "", '0', 0));
                int pressedStateDuration2 = 1320 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 36;
                byte b15 = $$a[7];
                Object[] objArr42 = new Object[1];
                c(b15, (short) (b15 | 37), (byte) 52, objArr42);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(cIndexOf2, pressedStateDuration2, maximumDrawingCacheSize, -1920778747, false, (String) objArr42[0], null);
            }
            Object[] objArr43 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).get(null);
            objArr3 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i81 = ((int[]) objArr43[0])[0];
            int i82 = ((int[]) objArr43[3])[0];
            String[] strArr10 = (String[]) objArr43[2];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_permission_screen_primary_cta_text).substring(0, 14).length() + 49789923;
            int i83 = ~length;
            int i84 = 1615425440 + (((~(896059045 | i83)) | 134289482) * 184) + ((length | 555779748) * (-184)) + ((~((-474568780) | i83)) * 184) + 1971241377;
            int i85 = (i84 << 13) ^ i84;
            int i86 = i85 ^ (i85 >>> 17);
            ((int[]) objArr3[1])[0] = i86 ^ (i86 << 5);
            str11 = str11;
            str = str13;
            str2 = str9;
            c = 3;
            str10 = str10;
        } else {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                str = str13;
                baseContext2 = (Context) Class.forName(str12).getMethod(str, new Class[0]).invoke(null, null);
            } else {
                str = str13;
            }
            if (baseContext2 != null) {
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            int iIntValue2 = ((Integer) Class.forName(str10).getMethod(str11, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr44 = {1147965210};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b((char) (47977 - TextUtils.getTrimmedLength("")), 1299 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr45 = {baseContext2, "com.bpjstku", 1971241377, Integer.valueOf(iIntValue2), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).newInstance(objArr44), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                    char cMyTid = (char) (53893 - (Process.myTid() >> 22));
                    int iCombineMeasuredStates = 1320 - View.combineMeasuredStates(0, 0);
                    int minimumFlingVelocity2 = 36 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte b16 = $$a[7];
                    Object[] objArr46 = new Object[1];
                    c(b16, (short) (b16 | 37), (byte) 52, objArr46);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(cMyTid, iCombineMeasuredStates, minimumFlingVelocity2, 819724799, false, (String) objArr46[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - KeyEvent.getDeadChar(0, 0)), View.getDefaultSize(0, 0) + 1394, MotionEvent.axisFromString("") + 76), Boolean.TYPE});
                }
                Object[] objArr47 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).invoke(null, objArr45);
                if (baseContext2 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                        char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 53893);
                        int longPressTimeout2 = 1320 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iMyPid = 36 - (Process.myPid() >> 22);
                        byte b17 = $$a[7];
                        Object[] objArr48 = new Object[1];
                        c(b17, (short) (b17 | 37), (byte) 52, objArr48);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(absoluteGravity, longPressTimeout2, iMyPid, -1920778747, false, (String) objArr48[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, objArr47);
                    try {
                        str2 = str9;
                        long jLongValue6 = ((Long) Class.forName(str8).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue6);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                            char fadingEdgeLength = (char) (53893 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                            int mode2 = View.MeasureSpec.getMode(0) + 1320;
                            int iRed = Color.red(0) + 36;
                            byte b18 = $$a[7];
                            short s9 = b18;
                            Object[] objArr49 = new Object[1];
                            c(b18, s9, (byte) (s9 | 37), objArr49);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(fadingEdgeLength, mode2, iRed, -1273706634, false, (String) objArr49[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue6 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                            char absoluteGravity2 = (char) (Gravity.getAbsoluteGravity(0, 0) + 53893);
                            int i87 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1319;
                            int i88 = 36 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            byte b19 = (byte) ($$b & 46);
                            short s10 = $$a[7];
                            Object[] objArr50 = new Object[1];
                            c(b19, s10, (byte) s10, objArr50);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(absoluteGravity2, i87, i88, -1433084963, false, (String) objArr50[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, lValueOf6);
                    } catch (Exception unused3) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr47 = objArr47;
                    str11 = str11;
                    str2 = str9;
                    str10 = str10;
                }
                objArr3 = objArr47;
                c = 3;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (((int[]) objArr3[0])[0] != ((int[]) objArr3[c])[0]) {
            throw null;
        }
        Object[] objArr51 = {new int[]{i}, new int[1], strArr, new int[]{i}};
        int i89 = ((int[]) objArr3[1])[0];
        int i90 = ((int[]) objArr3[0])[0];
        int i91 = ((int[]) objArr3[3])[0];
        String[] strArr11 = (String[]) objArr3[2];
        int length2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.appli).substring(0, 5).length() + 184726474;
        int i92 = (~((-1301681450) | length2)) | 68419841;
        int i93 = ~length2;
        int i94 = i89 + 1045991550 + ((i92 | (~(1302207983 | i93))) * 886) + (((~(i93 | 1301681449)) | 68946375) * (-1772)) + ((~(i93 | 68946375)) * 886);
        int i95 = (i94 << 13) ^ i94;
        int i96 = i95 ^ (i95 >>> 17);
        ((int[]) objArr51[1])[0] = i96 ^ (i96 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
            char c4 = (char) (37568 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 626;
            int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0) + 15;
            byte b20 = (byte) ($$b & 46);
            short s11 = $$a[7];
            Object[] objArr52 = new Object[1];
            c(b20, s11, (byte) s11, objArr52);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(c4, bitsPerPixel, iLastIndexOf3, -477065106, false, (String) objArr52[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).getLong(null);
        long jLongValue7 = ((Long) Class.forName(str8).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
            char c5 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37567);
            int iIndexOf3 = 624 - TextUtils.indexOf((CharSequence) "", '0');
            int mode3 = View.MeasureSpec.getMode(0) + 14;
            byte b21 = $$a[7];
            Object[] objArr53 = new Object[1];
            c(b21, (short) (b21 | 89), (byte) 52, objArr53);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(c5, iIndexOf3, mode3, -976899241, false, (String) objArr53[0], null);
        }
        if (j4 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).getLong(null) << 52) >>> 52)) >> 12)) {
            int i97 = b + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i97 % 128;
            int i98 = i97 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                char c6 = (char) (37568 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int iMakeMeasureSpec = 625 - View.MeasureSpec.makeMeasureSpec(0, 0);
                int i99 = 15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                byte b22 = $$a[7];
                Object[] objArr54 = new Object[1];
                c(b22, (short) (b22 | 37), (byte) 52, objArr54);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(c6, iMakeMeasureSpec, i99, -973632554, false, (String) objArr54[0], null);
            }
            Object[] objArr55 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).get(null);
            int i100 = ((int[]) objArr55[2])[0];
            int i101 = ((int[]) objArr55[0])[0];
            String[] strArr12 = (String[]) objArr55[3];
            int[] iArr6 = {i100};
            int[] iArr7 = {i101};
            int i102 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i103 = ~i102;
            int i104 = 1483288534 + (((~(1401057875 | i103)) | 137462948) * (-1188));
            int i105 = (~(i102 | (-1401057876))) | 137462948;
            int i106 = ~(422680245 | i103);
            int i107 = ((i104 + ((i105 | i106) * 594)) + ((((~((-1401057876) | i103)) | 1115840578) | i106) * 594)) - 455100492;
            int i108 = (i107 << 13) ^ i107;
            int i109 = i108 ^ (i108 >>> 17);
            ((int[]) objArr4[1])[0] = i109 ^ (i109 << 5);
            objArr4 = new Object[]{iArr7, new int[1], iArr6, strArr12};
            str3 = str11;
        } else {
            Context baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                int i110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
                b = i110 % 128;
                int i111 = i110 % 2;
                baseContext3 = (Context) Class.forName(str12).getMethod(str, new Class[0]).invoke(null, null);
            }
            if (baseContext3 != null) {
                baseContext3 = ((baseContext3 instanceof ContextWrapper) && ((ContextWrapper) baseContext3).getBaseContext() == null) ? null : baseContext3.getApplicationContext();
            }
            str3 = str11;
            int iIntValue3 = ((Integer) Class.forName(str10).getMethod(str3, Object.class).invoke(null, this)).intValue();
            Object[] objArr56 = new Object[1];
            a(new int[]{1763552091, 391430702, -1920366395, -418539080, -398188185, 1659764188, -3615901, -739352192, -972326328, 1209045605, -2068998544, -1922971060, -209140991, 569953332, -957846950, -802080747, -1973802745, 1083175383, -592143904, 1989950564, -2047018139, -2121874222, -423218971, 621901305, 88554385, -1940711747, 1015243276, -393385177, 60573073, 855316366, -232225826, 1680992727, 837846264, -649473168}, 64 - Color.red(0), objArr56);
            String str16 = (String) objArr56[0];
            Object[] objArr57 = new Object[1];
            a(new int[]{628653577, -754200430, 1377828080, 1072244101, -1059724225, -460805110, -1564680802, 1265294544, 921940587, 2043576936, 1179357705, 289696187, -912053261, -683157273, 1389653664, 1692006854, -168145182, -695040010, 1499956986, -958216535, 1817480795, -1891367853, -924469597, 1285950899, 640725818, 588617868, 2054629847, 983738725, 2124242268, 299760889, -1425406912, 1954250249, -213470369, -1522606632}, 65 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr57);
            Object[] objArr58 = {baseContext3, new String[]{str16, (String) objArr57[0]}, Integer.valueOf(iIntValue3), 17, -455100492};
            byte[] bArr3 = $$d;
            Object[] objArr59 = new Object[1];
            d((byte) ($$e + 3), (short) 136, bArr3[18], objArr59);
            Class<?> cls3 = Class.forName((String) objArr59[0]);
            Object[] objArr60 = new Object[1];
            d((byte) (-bArr3[326]), (short) 160, bArr3[4], objArr60);
            Object[] objArr61 = (Object[]) cls3.getMethod((String) objArr60[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr58);
            int i112 = ((int[]) objArr61[0])[0];
            int i113 = ((int[]) objArr61[2])[0];
            if (baseContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                    char c7 = (char) (37568 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 625;
                    int i114 = 14 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    byte b23 = $$a[7];
                    Object[] objArr62 = new Object[1];
                    c(b23, (short) (b23 | 37), (byte) 52, objArr62);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(c7, scrollDefaultDelay2, i114, -973632554, false, (String) objArr62[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).set(null, objArr61);
                try {
                    long jLongValue8 = ((Long) Class.forName(str8).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf7 = Long.valueOf(jLongValue8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                        char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 37567);
                        int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 626;
                        int mirror = AndroidCharacter.getMirror('0') - '\"';
                        byte b24 = $$a[7];
                        Object[] objArr63 = new Object[1];
                        c(b24, (short) (b24 | 89), (byte) 52, objArr63);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(cCombineMeasuredStates, bitsPerPixel2, mirror, -976899241, false, (String) objArr63[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).set(null, lValueOf7);
                    Long lValueOf8 = Long.valueOf(jLongValue8 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                        char cCombineMeasuredStates2 = (char) (37567 - View.combineMeasuredStates(0, 0));
                        int i115 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 624;
                        int maxKeyCode3 = 14 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte b25 = (byte) ($$b & 46);
                        short s12 = $$a[7];
                        Object[] objArr64 = new Object[1];
                        c(b25, s12, (byte) s12, objArr64);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(cCombineMeasuredStates2, i115, maxKeyCode3, -477065106, false, (String) objArr64[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, lValueOf8);
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            } else {
                objArr61 = objArr61;
            }
            objArr4 = objArr61;
        }
        int i116 = ((int[]) objArr4[0])[0];
        int i117 = ((int[]) objArr4[2])[0];
        if (i117 == i116) {
            int i118 = ((int[]) objArr4[1])[0];
            int i119 = ((int[]) objArr4[2])[0];
            int i120 = ((int[]) objArr4[0])[0];
            String[] strArr13 = (String[]) objArr4[3];
            int[] iArr8 = {i119};
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i121 = ~iIdentityHashCode4;
            int i122 = i118 + 67305224 + (((-754305) | iIdentityHashCode4) * (-676)) + (((~(1005872452 | i121)) | 754304) * 676) + (((~(iIdentityHashCode4 | 1006626756)) | (~(i121 | (-817865669))) | 817111364) * 676);
            int i123 = (i122 << 13) ^ i122;
            int i124 = i123 ^ (i123 >>> 17);
            ((int[]) objArr[1])[0] = i124 ^ (i124 << 5);
            Object[] objArr65 = {new int[]{i120}, new int[1], iArr8, strArr13};
        } else {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr14 = (String[]) objArr4[3];
            if (strArr14 != null) {
                for (String str17 : strArr14) {
                    arrayList7.add(str17);
                }
            }
            Toast.makeText((Context) null, i117 / (((i117 - 1) * i117) % 2), 0).show();
            int i125 = ((int[]) objArr4[1])[0];
            int i126 = ((int[]) objArr4[2])[0];
            int i127 = ((int[]) objArr4[0])[0];
            String[] strArr15 = (String[]) objArr4[3];
            int[] iArr9 = {i126};
            int i128 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i129 = i125 + (-1752858148) + (((~((-215224586) | i128)) | (~((~i128) | 1608513535))) * (-318)) + (((~(248936409 | i128)) | 1359577126) * (-318)) + (((~(i128 | (-248936410))) | (-1574801712)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i130 = i129 ^ (i129 << 13);
            int i131 = i130 ^ (i130 >>> 17);
            ((int[]) objArr[1])[0] = i131 ^ (i131 << 5);
            Object[] objArr66 = {new int[]{i127}, new int[1], iArr9, strArr15};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
            char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
            int trimmedLength = TextUtils.getTrimmedLength(r4) + 2267;
            str4 = "";
            int iIndexOf4 = TextUtils.indexOf(str4, str4) + 33;
            byte b26 = $$a[7];
            Object[] objArr67 = new Object[1];
            c(b26, (short) (b26 | 37), (byte) 52, objArr67);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(packedPositionGroup2, trimmedLength, iIndexOf4, -887667012, false, (String) objArr67[0], null);
        } else {
            str4 = r4;
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                char longPressTimeout3 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int jumpTapTimeout = 2267 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int packedPositionGroup3 = 33 - ExpandableListView.getPackedPositionGroup(0L);
                byte b27 = $$a[7];
                short s13 = b27;
                Object[] objArr68 = new Object[1];
                c(b27, s13, (byte) (s13 | 37), objArr68);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(longPressTimeout3, jumpTapTimeout, packedPositionGroup3, -654680577, false, (String) objArr68[0], null);
            }
            Object[] objArr69 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).get(null);
            objArr5 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i132 = ((int[]) objArr69[0])[0];
            int i133 = ((int[]) objArr69[3])[0];
            String[] strArr16 = (String[]) objArr69[1];
            int i134 = ~System.identityHashCode(this);
            int i135 = ~(42144724 | i134);
            int i136 = (-143191157) + ((i135 | 766568591) * 764) + (((~(i134 | 766568591)) | 33755984) * (-1528)) + ((791935835 | i135) * 764) + 748278410;
            int i137 = (i136 << 13) ^ i136;
            int i138 = i137 ^ (i137 >>> 17);
            ((int[]) objArr5[2])[0] = i138 ^ (i138 << 5);
            str3 = str3;
        } else {
            Context baseContext4 = getBaseContext();
            if (baseContext4 == null) {
                baseContext4 = (Context) Class.forName(str12).getMethod(str, new Class[0]).invoke(null, null);
            }
            if (baseContext4 != null) {
                baseContext4 = ((baseContext4 instanceof ContextWrapper) && ((ContextWrapper) baseContext4).getBaseContext() == null) ? null : baseContext4.getApplicationContext();
            }
            Object[] objArr70 = {baseContext4, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str3, Object.class).invoke(null, this)).intValue()), 0, 748278410};
            byte[] bArr4 = $$d;
            Object[] objArr71 = new Object[1];
            d((byte) (-bArr4[112]), (short) 197, bArr4[80], objArr71);
            Class<?> cls4 = Class.forName((String) objArr71[0]);
            Object[] objArr72 = new Object[1];
            d(bArr4[108], (short) (-bArr4[449]), bArr4[4], objArr72);
            Object[] objArr73 = (Object[]) cls4.getMethod((String) objArr72[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr70);
            if (baseContext4 != null) {
                int i139 = b + 49;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i139 % 128;
                int i140 = i139 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                    char c8 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int gidForName2 = 2266 - Process.getGidForName(str4);
                    int i141 = 34 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte b28 = $$a[7];
                    short s14 = b28;
                    Object[] objArr74 = new Object[1];
                    c(b28, s14, (byte) (s14 | 37), objArr74);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(c8, gidForName2, i141, -654680577, false, (String) objArr74[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, objArr73);
                try {
                    long jLongValue9 = ((Long) Class.forName(str8).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue9);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                        char bitsPerPixel3 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                        int pressedStateDuration3 = 2267 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int maximumDrawingCacheSize2 = 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        byte b29 = $$a[7];
                        Object[] objArr75 = new Object[1];
                        c(b29, (short) (b29 | 89), (byte) 52, objArr75);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(bitsPerPixel3, pressedStateDuration3, maximumDrawingCacheSize2, -874156483, false, (String) objArr75[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue9 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                        char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int iArgb = Color.argb(0, 0, 0, 0) + 2267;
                        int maximumFlingVelocity = 33 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        byte b30 = $$a[7];
                        Object[] objArr76 = new Object[1];
                        c(b30, (short) (b30 | 37), (byte) 52, objArr76);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(fadingEdgeLength2, iArgb, maximumFlingVelocity, -887667012, false, (String) objArr76[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).set(null, lValueOf10);
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            } else {
                objArr73 = objArr73;
                str3 = str3;
            }
            objArr5 = objArr73;
        }
        int i142 = ((int[]) objArr5[3])[0];
        int i143 = ((int[]) objArr5[0])[0];
        if (i143 != i142) {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr17 = (String[]) objArr5[1];
            if (strArr17 != null) {
                for (String str18 : strArr17) {
                    arrayList8.add(str18);
                }
            }
            throw new RuntimeException(String.valueOf(i143));
        }
        Object[] objArr77 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i144 = ((int[]) objArr5[2])[0];
        int i145 = ((int[]) objArr5[0])[0];
        int i146 = ((int[]) objArr5[3])[0];
        String[] strArr18 = (String[]) objArr5[1];
        int i147 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        int i148 = ~i147;
        int i149 = i144 + 1507689751 + (((~((-870426058) | i148)) | (~(61712741 | i147))) * 217) + (((~(i147 | (-870426058))) | 809501832) * 217) + (((~(61712741 | i148)) | 870426057) * 217);
        int i150 = (i149 << 13) ^ i149;
        int i151 = i150 ^ (i150 >>> 17);
        ((int[]) objArr77[2])[0] = i151 ^ (i151 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
            char c9 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i152 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 877;
            int iLastIndexOf4 = 9 - TextUtils.lastIndexOf(str4, '0', 0, 0);
            byte b31 = $$a[7];
            short s15 = b31;
            Object[] objArr78 = new Object[1];
            c(b31, s15, (byte) (s15 | 37), objArr78);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(c9, i152, iLastIndexOf4, -1650998592, false, (String) objArr78[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).getLong(null);
        long jLongValue10 = ((Long) Class.forName(str8).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
            char capsMode = (char) TextUtils.getCapsMode(str4, 0, 0);
            int defaultSize2 = View.getDefaultSize(0, 0) + 876;
            int iRed2 = 10 - Color.red(0);
            byte b32 = $$a[7];
            Object[] objArr79 = new Object[1];
            c(b32, (short) (b32 | 37), (byte) 52, objArr79);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(capsMode, defaultSize2, iRed2, 2012020043, false, (String) objArr79[0], null);
        }
        if (j5 == ((jLongValue10 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int size = View.MeasureSpec.getSize(0) + 876;
                int i153 = 10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte b33 = $$a[7];
                Object[] objArr80 = new Object[1];
                c(b33, (short) (b33 | 89), (byte) 52, objArr80);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(keyRepeatTimeout2, size, i153, 2012931276, false, (String) objArr80[0], null);
            }
            Object[] objArr81 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).get(null);
            objArr6 = new Object[]{new int[]{((int[]) objArr81[0])[0]}, new int[1], new int[]{((int[]) objArr81[2])[0]}, (String[]) objArr81[3]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i154 = (-1784260556) + (((~((-400593475) | iFreeMemory)) | 358617152 | (~((-360283246) | iFreeMemory))) * (-754));
            int i155 = ~((-358617153) | iFreeMemory);
            int i156 = ~iFreeMemory;
            int i157 = i154 + ((i155 | (~((-1666094) | i156))) * (-754)) + ((i156 | (-400593475)) * 754) + 387571152;
            int i158 = (i157 << 13) ^ i157;
            int i159 = i158 ^ (i158 >>> 17);
            ((int[]) objArr6[1])[0] = i159 ^ (i159 << 5);
            str5 = str3;
        } else {
            Context baseContext5 = getBaseContext();
            if (baseContext5 == null) {
                baseContext5 = (Context) Class.forName(str12).getMethod(str, new Class[0]).invoke(null, null);
            }
            if (baseContext5 != null) {
                baseContext5 = ((baseContext5 instanceof ContextWrapper) && ((ContextWrapper) baseContext5).getBaseContext() == null) ? null : baseContext5.getApplicationContext();
            }
            str5 = str3;
            Object[] objArr82 = {baseContext5, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, 387571152};
            byte[] bArr5 = $$d;
            byte b34 = bArr5[250];
            Object[] objArr83 = new Object[1];
            d(b34, (short) (b34 | 176), bArr5[80], objArr83);
            Class<?> cls5 = Class.forName((String) objArr83[0]);
            Object[] objArr84 = new Object[1];
            d(bArr5[108], (short) 324, bArr5[4], objArr84);
            Object[] objArr85 = (Object[]) cls5.getMethod((String) objArr84[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr82);
            if (baseContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                    char cIndexOf3 = (char) TextUtils.indexOf(str4, str4, 0);
                    int threadPriority = 876 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int i160 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
                    byte b35 = $$a[7];
                    Object[] objArr86 = new Object[1];
                    c(b35, (short) (b35 | 89), (byte) 52, objArr86);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(cIndexOf3, threadPriority, i160, 2012931276, false, (String) objArr86[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, objArr85);
                try {
                    long jLongValue11 = ((Long) Class.forName(str8).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue11);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                        char pressedStateDuration4 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                        int i161 = 877 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int iResolveSizeAndState = 10 - View.resolveSizeAndState(0, 0, 0);
                        byte b36 = $$a[7];
                        Object[] objArr87 = new Object[1];
                        c(b36, (short) (b36 | 37), (byte) 52, objArr87);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(pressedStateDuration4, i161, iResolveSizeAndState, 2012020043, false, (String) objArr87[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue11 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                        char minimumFlingVelocity3 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i162 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 875;
                        int iRed3 = 10 - Color.red(0);
                        byte b37 = $$a[7];
                        short s16 = b37;
                        Object[] objArr88 = new Object[1];
                        c(b37, s16, (byte) (s16 | 37), objArr88);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(minimumFlingVelocity3, i162, iRed3, -1650998592, false, (String) objArr88[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).set(null, lValueOf12);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            } else {
                objArr85 = objArr85;
            }
            objArr6 = objArr85;
        }
        int i163 = ((int[]) objArr6[2])[0];
        int i164 = ((int[]) objArr6[0])[0];
        if (i164 == i163) {
            int i165 = ((int[]) objArr6[1])[0];
            Object[] objArr89 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            str6 = "currentApplication";
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod(str6, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_password_invalid).substring(12, 13).codePointAt(0) + 2013961385;
            int i166 = ~(117359653 | iCodePointAt);
            int i167 = i165 + 1999455591 + (((-117436022) | i166) * (-814)) + ((i166 | (~((~iCodePointAt) | 77049424)) | 76973056) * 407) + (((~((-117359654) | iCodePointAt)) | 76973056 | (~(iCodePointAt | (-77049425)))) * 407);
            int i168 = (i167 << 13) ^ i167;
            int i169 = i168 ^ (i168 >>> 17);
            ((int[]) objArr89[1])[0] = i169 ^ (i169 << 5);
            i2 = 0;
        } else {
            str6 = r12;
            int[] iArr10 = new int[i164];
            int i170 = i164 - 1;
            iArr10[i170] = 1;
            Toast.makeText((Context) null, iArr10[((i164 * i170) % 2) - 1], 1).show();
            int i171 = ((int[]) objArr6[1])[0];
            Object[] objArr90 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            int i172 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str6, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1589096180;
            int i173 = i171 + (((1001096684 + (((~i172) | 244913755) * 1444)) + (((~(i172 | (-911802440))) | ((~(952112668 | i172)) | 102301763)) * (-1444))) - 734072696);
            int i174 = (i173 << 13) ^ i173;
            int i175 = i174 ^ (i174 >>> 17);
            i2 = 0;
            ((int[]) objArr90[1])[0] = i175 ^ (i175 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(i2);
            int iIndexOf5 = 876 - TextUtils.indexOf(str4, str4, i2, i2);
            int longPressTimeout4 = (ViewConfiguration.getLongPressTimeout() >> 16) + 10;
            byte b38 = (byte) ($$b & 46);
            short s17 = $$a[7];
            Object[] objArr91 = new Object[1];
            c(b38, s17, (byte) s17, objArr91);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(cNormalizeMetaState, iIndexOf5, longPressTimeout4, 252381699, false, (String) objArr91[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).getLong(null);
        long jLongValue12 = ((Long) Class.forName(str8).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
            char c10 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
            int packedPositionGroup4 = ExpandableListView.getPackedPositionGroup(0L) + 876;
            int iIndexOf6 = TextUtils.indexOf((CharSequence) str4, '0', 0, 0) + 11;
            byte b39 = $$a[7];
            Object[] objArr92 = new Object[1];
            c(b39, (short) (b39 | 141), (byte) 52, objArr92);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(c10, packedPositionGroup4, iIndexOf6, 2009631821, false, (String) objArr92[0], null);
        }
        if (j6 != ((jLongValue12 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).getLong(null) << 52) >>> 52)) >> 12)) {
            Context baseContext6 = getBaseContext();
            if (baseContext6 == null) {
                baseContext6 = (Context) Class.forName(str12).getMethod(str, new Class[0]).invoke(null, null);
            }
            if (baseContext6 != null) {
                baseContext6 = ((baseContext6 instanceof ContextWrapper) && ((ContextWrapper) baseContext6).getBaseContext() == null) ? null : baseContext6.getApplicationContext();
            }
            Object[] objArr93 = {baseContext6, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str5, Object.class).invoke(null, this)).intValue()), -115668603};
            byte[] bArr6 = $$d;
            Object[] objArr94 = new Object[1];
            d(bArr6[35], (short) 376, bArr6[80], objArr94);
            Class<?> cls6 = Class.forName((String) objArr94[0]);
            byte b40 = bArr6[18];
            Object[] objArr95 = new Object[1];
            d(b40, (short) (b40 | 136), bArr6[110], objArr95);
            objArr7 = (Object[]) cls6.getMethod((String) objArr95[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr93);
            if (baseContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                    int keyRepeatTimeout3 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 876;
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 11;
                    byte[] bArr7 = $$a;
                    Object[] objArr96 = new Object[1];
                    c(bArr7[10], (short) ($$b & 993), bArr7[7], objArr96);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(packedPositionType, keyRepeatTimeout3, packedPositionChild, 256017550, false, (String) objArr96[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, objArr7);
                try {
                    str7 = str2;
                    long jLongValue13 = ((Long) Class.forName(str8).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue13);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                        char cIndexOf4 = (char) TextUtils.indexOf(str4, str4, 0);
                        int modifierMetaStateMask = 875 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int offsetAfter2 = 10 - TextUtils.getOffsetAfter(str4, 0);
                        byte b41 = $$a[7];
                        Object[] objArr97 = new Object[1];
                        c(b41, (short) (b41 | 141), (byte) 52, objArr97);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cIndexOf4, modifierMetaStateMask, offsetAfter2, 2009631821, false, (String) objArr97[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue13 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                        char c11 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 876;
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 10;
                        byte b42 = (byte) ($$b & 46);
                        short s18 = $$a[7];
                        Object[] objArr98 = new Object[1];
                        c(b42, s18, (byte) s18, objArr98);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(c11, threadPriority2, edgeSlop, 252381699, false, (String) objArr98[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).set(null, lValueOf14);
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            }
            i3 = ((int[]) objArr7[2])[0];
            i4 = ((int[]) objArr7[0])[0];
            if (i4 == i3) {
                int i176 = ((int[]) objArr7[1])[0];
                Object[] objArr99 = {new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int i177 = ~((Context) Class.forName("android.app.ActivityThread").getMethod(str6, new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
                int i178 = i176 + (-60872796) + ((1035960063 | i177) * 184) + (((~(i177 | 1009155796)) | 93918763) * 184);
                int i179 = (i178 << 13) ^ i178;
                int i180 = i179 ^ (i179 >>> 17);
                i5 = 0;
                ((int[]) objArr99[1])[0] = i180 ^ (i180 << 5);
            } else {
                Toast.makeText((Context) null, i4 / (((i4 - 1) * i4) % 2), 0).show();
                int i181 = ((int[]) objArr7[1])[0];
                Object[] objArr100 = {new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int i182 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str6, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
                int i183 = (~((-1024617380) | i182)) | 84945441;
                int i184 = i181 + 1521273620 + (i183 * 992) + ((i183 | (~((~i182) | (-44635213)))) * (-496)) + ((i182 | (-984307151)) * 496);
                int i185 = i184 ^ (i184 << 13);
                int i186 = i185 ^ (i185 >>> 17);
                i5 = 0;
                ((int[]) objArr100[1])[0] = i186 ^ (i186 << 5);
            }
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char offsetAfter3 = (char) TextUtils.getOffsetAfter(str4, i5);
                int iBlue2 = 651 - Color.blue(i5);
                int longPressTimeout5 = (ViewConfiguration.getLongPressTimeout() >> 16) + 44;
                byte b43 = $$a[7];
                Object[] objArr101 = new Object[1];
                c(b43, (short) (b43 | 141), (byte) 52, objArr101);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter3, iBlue2, longPressTimeout5, -459846511, false, (String) objArr101[0], null);
            }
            j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            jLongValue = ((Long) Class.forName(str8).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c12 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int iNormalizeMetaState = 651 - KeyEvent.normalizeMetaState(0);
                int keyRepeatTimeout4 = 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte b44 = (byte) ($$b & 46);
                short s19 = $$a[7];
                Object[] objArr102 = new Object[1];
                c(b44, s19, (byte) s19, objArr102);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c12, iNormalizeMetaState, keyRepeatTimeout4, -873460649, false, (String) objArr102[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                    char cRed = (char) Color.red(0);
                    int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 651;
                    int iRgb2 = (-16777172) - Color.rgb(0, 0, 0);
                    byte b45 = $$a[7];
                    short s20 = b45;
                    Object[] objArr103 = new Object[1];
                    c(b45, s20, (byte) (s20 | 37), objArr103);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cRed, packedPositionType2, iRgb2, -1595579076, false, (String) objArr103[0], null);
                }
                Object[] objArr104 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).get(null);
                objArr8 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i187 = ((int[]) objArr104[2])[0];
                int i188 = ((int[]) objArr104[0])[0];
                int i189 = ~System.identityHashCode(this);
                int i190 = 1068712656 + (((~(751437411 | i189)) | (-754868222)) * (-983)) + (((~(i189 | (-754868222))) | 751437409) * 983) + 1125547141;
                int i191 = (i190 << 13) ^ i190;
                int i192 = i191 ^ (i191 >>> 17);
                ((int[]) objArr8[3])[0] = i192 ^ (i192 << 5);
                i6 = 0;
            } else {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.combineMeasuredStates(0, 0), 1658 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr105 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(null), 1125547141, 0};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char defaultSize3 = (char) View.getDefaultSize(0, 0);
                    int i193 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 652;
                    int iLastIndexOf5 = TextUtils.lastIndexOf(str4, '0', 0) + 45;
                    byte b46 = (byte) ($$b & 46);
                    short s21 = $$a[7];
                    Object[] objArr106 = new Object[1];
                    c(b46, s21, (byte) s21, objArr106);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize3, i193, iLastIndexOf5, 2075921419, false, (String) objArr106[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Color.argb(0, 0, 0, 0) + 695, View.resolveSizeAndState(0, 0, 0) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63405 - TextUtils.indexOf((CharSequence) str4, '0', 0, 0)), 794 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 83 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), Integer.TYPE, Integer.TYPE});
                }
                objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr105);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c13 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int trimmedLength2 = TextUtils.getTrimmedLength(str4) + 651;
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 44;
                    byte b47 = $$a[7];
                    short s22 = b47;
                    Object[] objArr107 = new Object[1];
                    c(b47, s22, (byte) (s22 | 37), objArr107);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c13, trimmedLength2, windowTouchSlop, -1595579076, false, (String) objArr107[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArr8);
                try {
                    long jLongValue14 = ((Long) Class.forName(str8).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf15 = Long.valueOf(jLongValue14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf5 = (char) ((-1) - TextUtils.indexOf((CharSequence) str4, '0', 0));
                        int iBlue3 = 651 - Color.blue(0);
                        int bitsPerPixel4 = 43 - ImageFormat.getBitsPerPixel(0);
                        byte b48 = (byte) ($$b & 46);
                        short s23 = $$a[7];
                        Object[] objArr108 = new Object[1];
                        c(b48, s23, (byte) s23, objArr108);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf5, iBlue3, bitsPerPixel4, -873460649, false, (String) objArr108[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf15);
                    Long lValueOf16 = Long.valueOf(jLongValue14 >> 12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c14 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                        int i194 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 651;
                        int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 44;
                        byte b49 = $$a[7];
                        Object[] objArr109 = new Object[1];
                        c(b49, (short) (b49 | 141), (byte) 52, objArr109);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c14, i194, packedPositionType3, -459846511, false, (String) objArr109[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf16);
                    i6 = 0;
                } catch (Exception unused8) {
                    throw new RuntimeException();
                }
            }
            i7 = ((int[]) objArr8[i6])[i6];
            i8 = ((int[]) objArr8[2])[i6];
            if (i8 == i7) {
                Object[] objArr110 = new Object[4];
                int[] iArr11 = new int[1];
                objArr110[i6] = iArr11;
                int[] iArr12 = new int[1];
                objArr110[2] = iArr12;
                objArr110[3] = new int[1];
                int i195 = ((int[]) objArr8[3])[i6];
                int i196 = ((int[]) objArr8[2])[i6];
                int i197 = ((int[]) objArr8[i6])[i6];
                iArr12[i6] = i196;
                iArr11[i6] = i197;
                objArr110[1] = new String[i6];
                int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str6, new Class[i6]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_liveliness_object_active).substring(3, 4).codePointAt(i6) + 1030453454;
                int i198 = ~iCodePointAt2;
                int i199 = i195 + 1272830139 + (((~(69799477 | i198)) | (~((-73230288) | iCodePointAt2))) * (-370)) + (((~(i198 | (-73230288))) | (~(iCodePointAt2 | 69799477)) | 2099248) * (-370)) + 776721760;
                int i200 = (i199 << 13) ^ i199;
                int i201 = i200 ^ (i200 >>> 17);
                ((int[]) objArr110[3])[0] = i201 ^ (i201 << 5);
            } else {
                arrayList = new ArrayList();
                strArr = (String[]) objArr8[1];
                if (strArr != null) {
                    for (String str19 : strArr) {
                        arrayList.add(str19);
                    }
                }
                Toast.makeText((Context) null, i8 / (((i8 - 1) * i8) % 2), 0).show();
                Object[] objArr111 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i202 = ((int[]) objArr8[3])[0];
                int i203 = ((int[]) objArr8[2])[0];
                int i204 = ((int[]) objArr8[0])[0];
                int i205 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str6, new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
                int i206 = ~i205;
                int i207 = i202 + (-1090113676) + (((~(i206 | (-63359244))) | 313610 | (~((-3744421) | i205))) * 717) + (((~(i205 | (-63359244))) | (~(i206 | (-3744421))) | 313610) * 717);
                int i208 = i207 ^ (i207 << 13);
                int i209 = i208 ^ (i208 >>> 17);
                ((int[]) objArr111[3])[0] = i209 ^ (i209 << 5);
            }
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 46400), 40 - KeyEvent.keyCodeFromString(str4), TextUtils.getOffsetAfter(str4, 0) + 19, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) (46400 - TextUtils.getOffsetBefore(str4, 0)), 40 - (ViewConfiguration.getWindowTouchSlop() >> 8), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 18, 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(obj, null);
            super.onCreate(bundle);
            if (bundle != null) {
                googleApiActivity = this;
                googleApiActivity.zaa = bundle.getInt("resolution");
            } else {
                googleApiActivity = this;
            }
            if (googleApiActivity.zaa != 1) {
                zab();
            }
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i210 = 1031 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int i211 = 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                byte b50 = $$a[7];
                Object[] objArr112 = new Object[1];
                c(b50, (short) (b50 | 89), (byte) 52, objArr112);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(jumpTapTimeout2, i210, i211, 1357589585, false, (String) objArr112[0], null);
            }
            j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).getLong(null);
            jLongValue2 = ((Long) Class.forName(str8).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int i212 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1030;
                int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 15;
                byte b51 = $$a[7];
                Object[] objArr113 = new Object[1];
                c(b51, (short) (b51 | 37), (byte) 52, objArr113);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cMakeMeasureSpec, i212, iResolveSizeAndState2, 1344079056, false, (String) objArr113[0], null);
            }
            if (j2 == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).getLong(null) << 52) >>> 52)) >> 12)) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                    char cRed2 = (char) Color.red(0);
                    int pressedStateDuration5 = (ViewConfiguration.getPressedStateDuration() >> 16) + 1031;
                    int iArgb2 = 15 - Color.argb(0, 0, 0, 0);
                    byte b52 = (byte) ($$b & 46);
                    short s24 = $$a[7];
                    Object[] objArr114 = new Object[1];
                    c(b52, s24, (byte) s24, objArr114);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(cRed2, pressedStateDuration5, iArgb2, 632103528, false, (String) objArr114[0], null);
                }
                Object[] objArr115 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).get(null);
                objArr9 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i213 = ((int[]) objArr115[3])[0];
                int i214 = ((int[]) objArr115[1])[0];
                String[] strArr19 = (String[]) objArr115[0];
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i215 = ~startElapsedRealtime;
                int i216 = (~(308508739 | i215)) | 546341804;
                int i217 = ~(startElapsedRealtime | (-302061635));
                int i218 = ((((i216 | i217) * (-252)) + 483461305) + ((i217 | (~(i215 | 854850543))) * 252)) - 1303161135;
                int i219 = (i218 << 13) ^ i218;
                int i220 = i219 ^ (i219 >>> 17);
                ((int[]) objArr9[2])[0] = i220 ^ (i220 << 5);
            } else {
                int iIntValue4 = ((Integer) Class.forName(str10).getMethod(str5, Object.class).invoke(null, this)).intValue();
                Object[] objArr116 = {-639429246};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b((char) (46038 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1134, 18 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr117 = {Integer.valueOf(iIntValue4), 0, -1303161135, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).newInstance(objArr116), false};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cAlpha = (char) Color.alpha(0);
                    int offsetAfter4 = TextUtils.getOffsetAfter(str4, 0) + 1031;
                    int gidForName3 = Process.getGidForName(str4) + 16;
                    byte b53 = $$a[7];
                    Object[] objArr118 = new Object[1];
                    c(b53, (short) (b53 | 89), (byte) 52, objArr118);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cAlpha, offsetAfter4, gidForName3, 1298546779, false, (String) objArr118[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.indexOf((CharSequence) str4, '0') + 1118, 16 - MotionEvent.axisFromString(str4)), Boolean.TYPE});
                }
                objArr9 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr117);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cIndexOf6 = (char) ((-1) - TextUtils.indexOf((CharSequence) str4, '0', 0, 0));
                    int iIndexOf7 = TextUtils.indexOf(str4, str4, 0) + 1031;
                    int keyRepeatTimeout5 = 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte b54 = (byte) ($$b & 46);
                    short s25 = $$a[7];
                    Object[] objArr119 = new Object[1];
                    c(b54, s25, (byte) s25, objArr119);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf6, iIndexOf7, keyRepeatTimeout5, 632103528, false, (String) objArr119[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, objArr9);
                try {
                    long jLongValue15 = ((Long) Class.forName(str8).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                        char cIndexOf7 = (char) TextUtils.indexOf(str4, str4, 0);
                        int fadingEdgeLength3 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1031;
                        int iIndexOf8 = 15 - TextUtils.indexOf(str4, str4, 0, 0);
                        byte b55 = $$a[7];
                        Object[] objArr120 = new Object[1];
                        c(b55, (short) (b55 | 37), (byte) 52, objArr120);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cIndexOf7, fadingEdgeLength3, iIndexOf8, 1344079056, false, (String) objArr120[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue15 >> 12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                        char packedPositionType4 = (char) ExpandableListView.getPackedPositionType(0L);
                        int mode4 = 1031 - View.MeasureSpec.getMode(0);
                        int iGreen2 = Color.green(0) + 15;
                        byte b56 = $$a[7];
                        Object[] objArr121 = new Object[1];
                        c(b56, (short) (b56 | 89), (byte) 52, objArr121);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(packedPositionType4, mode4, iGreen2, 1357589585, false, (String) objArr121[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            }
            if (((int[]) objArr9[3])[0] == ((int[]) objArr9[1])[0]) {
                arrayList2 = new ArrayList();
                strArr2 = (String[]) objArr9[0];
                if (strArr2 != null) {
                    for (String str20 : strArr2) {
                        arrayList2.add(str20);
                    }
                }
                throw null;
            }
            Object[] objArr122 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i221 = ((int[]) objArr9[2])[0];
            int i222 = ((int[]) objArr9[3])[0];
            int i223 = ((int[]) objArr9[1])[0];
            String[] strArr20 = (String[]) objArr9[0];
            int i224 = ~System.identityHashCode(this);
            int i225 = i221 + (((~((-793811721) | i224)) | 252743680) * (-241)) + 1100767256 + (((~(i224 | (-541068041))) | (-802275231)) * 241);
            int i226 = (i225 << 13) ^ i225;
            int i227 = i226 ^ (i226 >>> 17);
            Object obj2 = objArr122[2];
            ((int[]) obj2)[0] = i227 ^ (i227 << 5);
            ((Field) isTerminated.b[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{871970596, 1772857533, 918138637}, ((int[]) obj2)[0], Integer.MAX_VALUE));
            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                char cIndexOf8 = (char) (TextUtils.indexOf(str4, str4) + 29944);
                int iBlue4 = 1755 - Color.blue(0);
                int scrollBarSize = 23 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte b57 = $$a[7];
                short s26 = b57;
                Object[] objArr123 = new Object[1];
                c(b57, s26, (byte) (s26 | 37), objArr123);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cIndexOf8, iBlue4, scrollBarSize, 986134021, false, (String) objArr123[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).getLong(null) != -1) {
                int i228 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
                b = i228 % 128;
                int i229 = i228 % 2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                    char maximumDrawingCacheSize3 = (char) (29944 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    int edgeSlop2 = 1755 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0) + 23;
                    byte b58 = $$a[7];
                    Object[] objArr124 = new Object[1];
                    c(b58, (short) (b58 | 37), (byte) 52, objArr124);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(maximumDrawingCacheSize3, edgeSlop2, absoluteGravity3, 1599039318, false, (String) objArr124[0], null);
                }
                Object[] objArr125 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).get(null);
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr125[0])[0]}, new int[]{((int[]) objArr125[1])[0]}, (Object[]) objArr125[2], new int[1], (String[]) objArr125[4]};
                int iIdentityHashCode5 = System.identityHashCode(this);
                int i230 = ~iIdentityHashCode5;
                int i231 = (-752199814) + ((iIdentityHashCode5 | 795734374) * (-859)) + (((~(iIdentityHashCode5 | (-220991555))) | (~(795734374 | i230))) * 859) + (((~(583131948 | i230)) | (-804123503)) * 859) + 1988000102;
                int i232 = (i231 << 13) ^ i231;
                int i233 = i232 ^ (i232 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i233 ^ (i233 << 5);
            } else {
                int iIntValue5 = ((Integer) Class.forName(str10).getMethod(str5, Object.class).invoke(null, this)).intValue();
                Object[] objArr126 = {1675337723};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 42049), Color.alpha(0) + 1726, 29 - (ViewConfiguration.getTouchSlop() >> 8), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue5, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).newInstance(objArr126), 1988000102);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                    char cResolveSize2 = (char) (View.resolveSize(0, 0) + 29944);
                    int iIndexOf9 = 1755 - TextUtils.indexOf(str4, str4, 0, 0);
                    int windowTouchSlop2 = 23 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte b59 = $$a[7];
                    Object[] objArr127 = new Object[1];
                    c(b59, (short) (b59 | 37), (byte) 52, objArr127);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cResolveSize2, iIndexOf9, windowTouchSlop2, 1599039318, false, (String) objArr127[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                try {
                    long jLongValue16 = ((Long) Class.forName(str8).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf19 = Long.valueOf(jLongValue16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                        char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 29944);
                        int keyRepeatTimeout6 = 1755 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int iRed4 = Color.red(0) + 23;
                        byte b60 = $$a[7];
                        Object[] objArr128 = new Object[1];
                        c(b60, (short) (b60 | 141), (byte) 52, objArr128);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(tapTimeout, keyRepeatTimeout6, iRed4, 1596667560, false, (String) objArr128[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, lValueOf19);
                    Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 29944);
                        int i234 = 1756 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int iIndexOf10 = TextUtils.indexOf(str4, str4, 0, 0) + 23;
                        byte b61 = $$a[7];
                        short s27 = b61;
                        Object[] objArr129 = new Object[1];
                        c(b61, s27, (byte) (s27 | 37), objArr129);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(deadChar, i234, iIndexOf10, 986134021, false, (String) objArr129[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf20);
                } catch (Exception unused10) {
                    throw new RuntimeException();
                }
            }
            i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
            i12 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
            if (i12 == i11) {
                arrayList3 = new ArrayList();
                strArr3 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
                if (strArr3 != null) {
                    for (String str21 : strArr3) {
                        arrayList3.add(str21);
                    }
                }
                throw new RuntimeException(String.valueOf(i12));
            }
            int i235 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr130 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
            int i236 = ~startElapsedRealtime2;
            int i237 = i235 + 2041781501 + ((startElapsedRealtime2 | (-281175542)) * 140) + (((~((-281175542) | i236)) | 272786469) * (-280)) + (((~(startElapsedRealtime2 | (-272786470))) | (~(493777967 | i236)) | (-502167040)) * 140);
            int i238 = (i237 << 13) ^ i237;
            int i239 = i238 ^ (i238 >>> 17);
            Object obj3 = objArr130[3];
            ((int[]) obj3)[0] = i239 ^ (i239 << 5);
            ((Field) newHandlerExecutor.TuitionPaymentFragmentbindingInflater1[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{447543892, 1315424513, 2117826565}, ((int[]) obj3)[0], Integer.MAX_VALUE) - (-281243565));
            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                char maxKeyCode4 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int offsetBefore = TextUtils.getOffsetBefore(str4, 0) + 876;
                int maximumDrawingCacheSize4 = 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte[] bArr8 = $$a;
                Object[] objArr131 = new Object[1];
                c((byte) (-bArr8[205]), (short) ($$b & 993), (byte) (-bArr8[9]), objArr131);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(maxKeyCode4, offsetBefore, maximumDrawingCacheSize4, -1199417970, false, (String) objArr131[0], null);
            }
            j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).getLong(null);
            jLongValue3 = ((Long) Class.forName(str8).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                char offsetBefore2 = (char) TextUtils.getOffsetBefore(str4, 0);
                int gidForName4 = Process.getGidForName(str4) + 877;
                int iBlue5 = 10 - Color.blue(0);
                byte[] bArr9 = $$a;
                Object[] objArr132 = new Object[1];
                c((byte) (-bArr9[27]), (short) ($$b & 1003), bArr9[7], objArr132);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(offsetBefore2, gidForName4, iBlue5, 254769921, false, (String) objArr132[0], null);
            }
            if (j3 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).getLong(null) << 52) >>> 52)) >> 12)) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                    char c15 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                    int iArgb3 = Color.argb(0, 0, 0, 0) + 876;
                    int deadChar2 = 10 - KeyEvent.getDeadChar(0, 0);
                    byte[] bArr10 = $$a;
                    Object[] objArr133 = new Object[1];
                    c((byte) (-bArr10[205]), (short) ($$b & 1003), bArr10[25], objArr133);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(c15, iArgb3, deadChar2, 1324201839, false, (String) objArr133[0], null);
                }
                Object[] objArr134 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).get(null);
                objArr10 = new Object[]{new int[]{((int[]) objArr134[0])[0]}, new int[1], new int[]{((int[]) objArr134[2])[0]}, (String[]) objArr134[3]};
                int iCodePointAt3 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str6, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step2).substring(4, 5).codePointAt(0) - 643072539;
                int i240 = 273682532 + (((~((-42991623) | iCodePointAt3)) | (~((~iCodePointAt3) | (-2681394)))) * (-318)) + (((~(181862414 | iCodePointAt3)) | (-184543808)) * (-318)) + (((~(iCodePointAt3 | (-181862415))) | 141552185) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 1212627669;
                int i241 = (i240 << 13) ^ i240;
                int i242 = i241 ^ (i241 >>> 17);
                ((int[]) objArr10[1])[0] = i242 ^ (i242 << 5);
            } else {
                Object[] objArr135 = {Integer.valueOf(((Integer) Class.forName(str10).getMethod(str5, Object.class).invoke(null, this)).intValue()), 1212627669};
                byte[] bArr11 = $$d;
                Object[] objArr136 = new Object[1];
                d((byte) (-bArr11[96]), (short) 389, bArr11[80], objArr136);
                Class<?> cls7 = Class.forName((String) objArr136[0]);
                Object[] objArr137 = new Object[1];
                d(bArr11[108], (short) (-bArr11[449]), bArr11[4], objArr137);
                Object[] objArr138 = (Object[]) cls7.getMethod((String) objArr137[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr135);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                    char cMakeMeasureSpec2 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                    int i243 = 877 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int maxKeyCode5 = 10 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte[] bArr12 = $$a;
                    Object[] objArr139 = new Object[1];
                    c((byte) (-bArr12[205]), (short) ($$b & 1003), bArr12[25], objArr139);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(cMakeMeasureSpec2, i243, maxKeyCode5, 1324201839, false, (String) objArr139[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, objArr138);
                try {
                    long jLongValue17 = ((Long) Class.forName(str8).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue17);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString(str4) + 1);
                        int iRed5 = 876 - Color.red(0);
                        int edgeSlop3 = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte[] bArr13 = $$a;
                        Object[] objArr140 = new Object[1];
                        c((byte) (-bArr13[27]), (short) ($$b & 1003), bArr13[7], objArr140);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cAxisFromString, iRed5, edgeSlop3, 254769921, false, (String) objArr140[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                        char minimumFlingVelocity4 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int iAlpha = 876 - Color.alpha(0);
                        int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 10;
                        byte[] bArr14 = $$a;
                        Object[] objArr141 = new Object[1];
                        c((byte) (-bArr14[205]), (short) ($$b & 993), (byte) (-bArr14[9]), objArr141);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(minimumFlingVelocity4, iAlpha, iNormalizeMetaState2, -1199417970, false, (String) objArr141[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf22);
                    objArr10 = objArr138;
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
            if (((int[]) objArr10[0])[0] == ((int[]) objArr10[2])[0]) {
                arrayList4 = new ArrayList();
                strArr4 = (String[]) objArr10[3];
                if (strArr4 != null) {
                    int i244 = b + 23;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i244 % 128;
                    int i245 = i244 % 2;
                    for (String str22 : strArr4) {
                        arrayList4.add(str22);
                    }
                }
                throw null;
            }
            int i246 = ((int[]) objArr10[1])[0];
            Object[] objArr142 = {new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i247 = ~iIdentityHashCode6;
            int i248 = i246 + 2029882472 + (((-46197313) | i247) * (-369)) + (((~((-87954872) | i247)) | (-47644643)) * (-369)) + (((~(iIdentityHashCode6 | 87954871)) | (-134152184) | (~(i247 | (-1447331)))) * 369);
            int i249 = (i248 << 13) ^ i248;
            int i250 = i249 ^ (i249 >>> 17);
            Object obj4 = objArr142[1];
            ((int[]) obj4)[0] = i250 ^ (i250 << 5);
            ((Field) myLooperExecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{500254004, 1255827802, 963528919}, ((int[]) obj4)[0], Integer.MAX_VALUE) - (-1901625681));
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
            char edgeSlop4 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int iRed6 = 876 - Color.red(0);
            int offsetAfter5 = 10 - TextUtils.getOffsetAfter(str4, 0);
            byte[] bArr15 = $$a;
            Object[] objArr143 = new Object[1];
            c(bArr15[10], (short) ($$b & 993), bArr15[7], objArr143);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(edgeSlop4, iRed6, offsetAfter5, 256017550, false, (String) objArr143[0], null);
        }
        Object[] objArr144 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).get(null);
        objArr7 = new Object[]{new int[]{((int[]) objArr144[0])[0]}, new int[1], new int[]{((int[]) objArr144[2])[0]}, (String[]) objArr144[3]};
        int i251 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str6, new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        int i252 = (((1858126516 + (((~(64914427 | i251)) | 67180544) * 336)) + (((~(i251 | 105224656)) | 26870315) * (-168))) + (((~((~i251) | 105224656)) | 64914427) * 168)) - 115668603;
        int i253 = (i252 << 13) ^ i252;
        int i254 = i253 ^ (i253 >>> 17);
        ((int[]) objArr7[1])[0] = i254 ^ (i254 << 5);
        str7 = str2;
        i3 = ((int[]) objArr7[2])[0];
        i4 = ((int[]) objArr7[0])[0];
        if (i4 == i3) {
            int i1710 = ((int[]) objArr7[1])[0];
            Object[] objArr910 = {new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i1711 = ~((Context) Class.forName("android.app.ActivityThread").getMethod(str6, new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            int i1712 = i1710 + (-60872796) + ((1035960063 | i1711) * 184) + (((~(i1711 | 1009155796)) | 93918763) * 184);
            int i1713 = (i1712 << 13) ^ i1712;
            int i1810 = i1713 ^ (i1713 >>> 17);
            i5 = 0;
            ((int[]) objArr910[1])[0] = i1810 ^ (i1810 << 5);
        } else {
            Toast.makeText((Context) null, i4 / (((i4 - 1) * i4) % 2), 0).show();
            int i1811 = ((int[]) objArr7[1])[0];
            Object[] objArr1010 = {new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i1812 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str6, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i1813 = (~((-1024617380) | i1812)) | 84945441;
            int i1814 = i1811 + 1521273620 + (i1813 * 992) + ((i1813 | (~((~i1812) | (-44635213)))) * (-496)) + ((i1812 | (-984307151)) * 496);
            int i1815 = i1814 ^ (i1814 << 13);
            int i1816 = i1815 ^ (i1815 >>> 17);
            i5 = 0;
            ((int[]) objArr1010[1])[0] = i1816 ^ (i1816 << 5);
        }
        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetAfter6 = (char) TextUtils.getOffsetAfter(str4, i5);
            int iBlue6 = 651 - Color.blue(i5);
            int longPressTimeout6 = (ViewConfiguration.getLongPressTimeout() >> 16) + 44;
            byte b410 = $$a[7];
            Object[] objArr1011 = new Object[1];
            c(b410, (short) (b410 | 141), (byte) 52, objArr1011);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter6, iBlue6, longPressTimeout6, -459846511, false, (String) objArr1011[0], null);
        }
        j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        jLongValue = ((Long) Class.forName(str8).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c16 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int iNormalizeMetaState3 = 651 - KeyEvent.normalizeMetaState(0);
            int keyRepeatTimeout7 = 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            byte b411 = (byte) ($$b & 46);
            short s110 = $$a[7];
            Object[] objArr1012 = new Object[1];
            c(b411, s110, (byte) s110, objArr1012);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c16, iNormalizeMetaState3, keyRepeatTimeout7, -873460649, false, (String) objArr1012[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                char cRed3 = (char) Color.red(0);
                int packedPositionType5 = ExpandableListView.getPackedPositionType(0L) + 651;
                int iRgb3 = (-16777172) - Color.rgb(0, 0, 0);
                byte b412 = $$a[7];
                short s28 = b412;
                Object[] objArr1013 = new Object[1];
                c(b412, s28, (byte) (s28 | 37), objArr1013);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cRed3, packedPositionType5, iRgb3, -1595579076, false, (String) objArr1013[0], null);
            }
            Object[] objArr1014 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).get(null);
            objArr8 = new Object[]{new int[]{i188}, new String[0], new int[]{i187}, new int[1]};
            int i1817 = ((int[]) objArr1014[2])[0];
            int i1818 = ((int[]) objArr1014[0])[0];
            int i1819 = ~System.identityHashCode(this);
            int i1910 = 1068712656 + (((~(751437411 | i1819)) | (-754868222)) * (-983)) + (((~(i1819 | (-754868222))) | 751437409) * 983) + 1125547141;
            int i1911 = (i1910 << 13) ^ i1910;
            int i1912 = i1911 ^ (i1911 >>> 17);
            ((int[]) objArr8[3])[0] = i1912 ^ (i1912 << 5);
            i6 = 0;
        } else {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.combineMeasuredStates(0, 0), 1658 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26, 2145681644, false, null, new Class[0]);
            }
            Object[] objArr1015 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(null), 1125547141, 0};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char defaultSize4 = (char) View.getDefaultSize(0, 0);
                int i1913 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 652;
                int iLastIndexOf6 = TextUtils.lastIndexOf(str4, '0', 0) + 45;
                byte b413 = (byte) ($$b & 46);
                short s29 = $$a[7];
                Object[] objArr1016 = new Object[1];
                c(b413, s29, (byte) s29, objArr1016);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize4, i1913, iLastIndexOf6, 2075921419, false, (String) objArr1016[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Color.argb(0, 0, 0, 0) + 695, View.resolveSizeAndState(0, 0, 0) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63405 - TextUtils.indexOf((CharSequence) str4, '0', 0, 0)), 794 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 83 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), Integer.TYPE, Integer.TYPE});
            }
            objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr1015);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char c17 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int trimmedLength3 = TextUtils.getTrimmedLength(str4) + 651;
                int windowTouchSlop3 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 44;
                byte b414 = $$a[7];
                short s210 = b414;
                Object[] objArr1017 = new Object[1];
                c(b414, s210, (byte) (s210 | 37), objArr1017);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c17, trimmedLength3, windowTouchSlop3, -1595579076, false, (String) objArr1017[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArr8);
            long jLongValue18 = ((Long) Class.forName(str8).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf110 = Long.valueOf(jLongValue18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char cIndexOf9 = (char) ((-1) - TextUtils.indexOf((CharSequence) str4, '0', 0));
                int iBlue7 = 651 - Color.blue(0);
                int bitsPerPixel5 = 43 - ImageFormat.getBitsPerPixel(0);
                byte b415 = (byte) ($$b & 46);
                short s211 = $$a[7];
                Object[] objArr1018 = new Object[1];
                c(b415, s211, (byte) s211, objArr1018);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf9, iBlue7, bitsPerPixel5, -873460649, false, (String) objArr1018[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf110);
            Long lValueOf111 = Long.valueOf(jLongValue18 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char c18 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                int i1914 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 651;
                int packedPositionType6 = ExpandableListView.getPackedPositionType(0L) + 44;
                byte b416 = $$a[7];
                Object[] objArr1019 = new Object[1];
                c(b416, (short) (b416 | 141), (byte) 52, objArr1019);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c18, i1914, packedPositionType6, -459846511, false, (String) objArr1019[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf111);
            i6 = 0;
        }
        i7 = ((int[]) objArr8[i6])[i6];
        i8 = ((int[]) objArr8[2])[i6];
        if (i8 == i7) {
            Object[] objArr1110 = new Object[4];
            int[] iArr13 = new int[1];
            objArr1110[i6] = iArr13;
            int[] iArr14 = new int[1];
            objArr1110[2] = iArr14;
            objArr1110[3] = new int[1];
            int i1915 = ((int[]) objArr8[3])[i6];
            int i1916 = ((int[]) objArr8[2])[i6];
            int i1917 = ((int[]) objArr8[i6])[i6];
            iArr14[i6] = i1916;
            iArr13[i6] = i1917;
            objArr1110[1] = new String[i6];
            int iCodePointAt4 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str6, new Class[i6]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_liveliness_object_active).substring(3, 4).codePointAt(i6) + 1030453454;
            int i1918 = ~iCodePointAt4;
            int i1919 = i1915 + 1272830139 + (((~(69799477 | i1918)) | (~((-73230288) | iCodePointAt4))) * (-370)) + (((~(i1918 | (-73230288))) | (~(iCodePointAt4 | 69799477)) | 2099248) * (-370)) + 776721760;
            int i2010 = (i1919 << 13) ^ i1919;
            int i2011 = i2010 ^ (i2010 >>> 17);
            ((int[]) objArr1110[3])[0] = i2011 ^ (i2011 << 5);
        } else {
            arrayList = new ArrayList();
            strArr = (String[]) objArr8[1];
            if (strArr != null) {
                while (i9 < strArr.length) {
                    arrayList.add(str19);
                }
            }
            Toast.makeText((Context) null, i8 / (((i8 - 1) * i8) % 2), 0).show();
            Object[] objArr1111 = {new int[]{i204}, new String[0], new int[]{i203}, new int[1]};
            int i2012 = ((int[]) objArr8[3])[0];
            int i2013 = ((int[]) objArr8[2])[0];
            int i2014 = ((int[]) objArr8[0])[0];
            int i2015 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str6, new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i2016 = ~i2015;
            int i2017 = i2012 + (-1090113676) + (((~(i2016 | (-63359244))) | 313610 | (~((-3744421) | i2015))) * 717) + (((~(i2015 | (-63359244))) | (~(i2016 | (-3744421))) | 313610) * 717);
            int i2018 = i2017 ^ (i2017 << 13);
            int i2019 = i2018 ^ (i2018 >>> 17);
            ((int[]) objArr1111[3])[0] = i2019 ^ (i2019 << 5);
        }
        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 46400), 40 - KeyEvent.keyCodeFromString(str4), TextUtils.getOffsetAfter(str4, 0) + 19, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) (46400 - TextUtils.getOffsetBefore(str4, 0)), 40 - (ViewConfiguration.getWindowTouchSlop() >> 8), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 18, 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(obj5, null);
        super.onCreate(bundle);
        if (bundle != null) {
            googleApiActivity = this;
            googleApiActivity.zaa = bundle.getInt("resolution");
        } else {
            googleApiActivity = this;
        }
        if (googleApiActivity.zaa != 1) {
            zab();
        }
        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
            char jumpTapTimeout3 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int i2110 = 1031 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int i2111 = 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            byte b510 = $$a[7];
            Object[] objArr1112 = new Object[1];
            c(b510, (short) (b510 | 89), (byte) 52, objArr1112);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(jumpTapTimeout3, i2110, i2111, 1357589585, false, (String) objArr1112[0], null);
        }
        j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).getLong(null);
        jLongValue2 = ((Long) Class.forName(str8).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
            char cMakeMeasureSpec3 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int i2112 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1030;
            int iResolveSizeAndState3 = View.resolveSizeAndState(0, 0, 0) + 15;
            byte b511 = $$a[7];
            Object[] objArr1113 = new Object[1];
            c(b511, (short) (b511 | 37), (byte) 52, objArr1113);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cMakeMeasureSpec3, i2112, iResolveSizeAndState3, 1344079056, false, (String) objArr1113[0], null);
        }
        if (j2 == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).getLong(null) << 52) >>> 52)) >> 12)) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                char cRed4 = (char) Color.red(0);
                int pressedStateDuration6 = (ViewConfiguration.getPressedStateDuration() >> 16) + 1031;
                int iArgb4 = 15 - Color.argb(0, 0, 0, 0);
                byte b512 = (byte) ($$b & 46);
                short s212 = $$a[7];
                Object[] objArr1114 = new Object[1];
                c(b512, s212, (byte) s212, objArr1114);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(cRed4, pressedStateDuration6, iArgb4, 632103528, false, (String) objArr1114[0], null);
            }
            Object[] objArr1115 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).get(null);
            objArr9 = new Object[]{strArr19, new int[]{i214}, new int[1], new int[]{i213}};
            int i2113 = ((int[]) objArr1115[3])[0];
            int i2114 = ((int[]) objArr1115[1])[0];
            String[] strArr110 = (String[]) objArr1115[0];
            int startElapsedRealtime3 = (int) Process.getStartElapsedRealtime();
            int i2115 = ~startElapsedRealtime3;
            int i2116 = (~(308508739 | i2115)) | 546341804;
            int i2117 = ~(startElapsedRealtime3 | (-302061635));
            int i2118 = ((((i2116 | i2117) * (-252)) + 483461305) + ((i2117 | (~(i2115 | 854850543))) * 252)) - 1303161135;
            int i2119 = (i2118 << 13) ^ i2118;
            int i2210 = i2119 ^ (i2119 >>> 17);
            ((int[]) objArr9[2])[0] = i2210 ^ (i2210 << 5);
        } else {
            int iIntValue6 = ((Integer) Class.forName(str10).getMethod(str5, Object.class).invoke(null, this)).intValue();
            Object[] objArr1116 = {-639429246};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b((char) (46038 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1134, 18 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr1117 = {Integer.valueOf(iIntValue6), 0, -1303161135, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).newInstance(objArr1116), false};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cAlpha2 = (char) Color.alpha(0);
                int offsetAfter7 = TextUtils.getOffsetAfter(str4, 0) + 1031;
                int gidForName5 = Process.getGidForName(str4) + 16;
                byte b513 = $$a[7];
                Object[] objArr1118 = new Object[1];
                c(b513, (short) (b513 | 89), (byte) 52, objArr1118);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cAlpha2, offsetAfter7, gidForName5, 1298546779, false, (String) objArr1118[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.indexOf((CharSequence) str4, '0') + 1118, 16 - MotionEvent.axisFromString(str4)), Boolean.TYPE});
            }
            objArr9 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr1117);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char cIndexOf10 = (char) ((-1) - TextUtils.indexOf((CharSequence) str4, '0', 0, 0));
                int iIndexOf11 = TextUtils.indexOf(str4, str4, 0) + 1031;
                int keyRepeatTimeout8 = 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte b514 = (byte) ($$b & 46);
                short s213 = $$a[7];
                Object[] objArr1119 = new Object[1];
                c(b514, s213, (byte) s213, objArr1119);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf10, iIndexOf11, keyRepeatTimeout8, 632103528, false, (String) objArr1119[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, objArr9);
            long jLongValue19 = ((Long) Class.forName(str8).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf112 = Long.valueOf(jLongValue19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                char cIndexOf11 = (char) TextUtils.indexOf(str4, str4, 0);
                int fadingEdgeLength4 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1031;
                int iIndexOf12 = 15 - TextUtils.indexOf(str4, str4, 0, 0);
                byte b515 = $$a[7];
                Object[] objArr1210 = new Object[1];
                c(b515, (short) (b515 | 37), (byte) 52, objArr1210);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cIndexOf11, fadingEdgeLength4, iIndexOf12, 1344079056, false, (String) objArr1210[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf112);
            Long lValueOf113 = Long.valueOf(jLongValue19 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                char packedPositionType7 = (char) ExpandableListView.getPackedPositionType(0L);
                int mode5 = 1031 - View.MeasureSpec.getMode(0);
                int iGreen3 = Color.green(0) + 15;
                byte b516 = $$a[7];
                Object[] objArr1211 = new Object[1];
                c(b516, (short) (b516 | 89), (byte) 52, objArr1211);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(packedPositionType7, mode5, iGreen3, 1357589585, false, (String) objArr1211[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf113);
        }
        if (((int[]) objArr9[3])[0] == ((int[]) objArr9[1])[0]) {
            arrayList2 = new ArrayList();
            strArr2 = (String[]) objArr9[0];
            if (strArr2 != null) {
                while (i10 < strArr2.length) {
                    arrayList2.add(str20);
                }
            }
            throw null;
        }
        Object[] objArr1212 = {strArr20, new int[]{i223}, new int[1], new int[]{i222}};
        int i2211 = ((int[]) objArr9[2])[0];
        int i2212 = ((int[]) objArr9[3])[0];
        int i2213 = ((int[]) objArr9[1])[0];
        String[] strArr21 = (String[]) objArr9[0];
        int i2214 = ~System.identityHashCode(this);
        int i2215 = i2211 + (((~((-793811721) | i2214)) | 252743680) * (-241)) + 1100767256 + (((~(i2214 | (-541068041))) | (-802275231)) * 241);
        int i2216 = (i2215 << 13) ^ i2215;
        int i2217 = i2216 ^ (i2216 >>> 17);
        Object obj6 = objArr1212[2];
        ((int[]) obj6)[0] = i2217 ^ (i2217 << 5);
        ((Field) isTerminated.b[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{871970596, 1772857533, 918138637}, ((int[]) obj6)[0], Integer.MAX_VALUE));
        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
            char cIndexOf12 = (char) (TextUtils.indexOf(str4, str4) + 29944);
            int iBlue8 = 1755 - Color.blue(0);
            int scrollBarSize2 = 23 - (ViewConfiguration.getScrollBarSize() >> 8);
            byte b517 = $$a[7];
            short s214 = b517;
            Object[] objArr1213 = new Object[1];
            c(b517, s214, (byte) (s214 | 37), objArr1213);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cIndexOf12, iBlue8, scrollBarSize2, 986134021, false, (String) objArr1213[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).getLong(null) != -1) {
            int i2218 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
            b = i2218 % 128;
            int i2219 = i2218 % 2;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                char maximumDrawingCacheSize5 = (char) (29944 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                int edgeSlop5 = 1755 - (ViewConfiguration.getEdgeSlop() >> 16);
                int absoluteGravity4 = Gravity.getAbsoluteGravity(0, 0) + 23;
                byte b518 = $$a[7];
                Object[] objArr1214 = new Object[1];
                c(b518, (short) (b518 | 37), (byte) 52, objArr1214);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(maximumDrawingCacheSize5, edgeSlop5, absoluteGravity4, 1599039318, false, (String) objArr1214[0], null);
            }
            Object[] objArr1215 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr1215[0])[0]}, new int[]{((int[]) objArr1215[1])[0]}, (Object[]) objArr1215[2], new int[1], (String[]) objArr1215[4]};
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i2310 = ~iIdentityHashCode7;
            int i2311 = (-752199814) + ((iIdentityHashCode7 | 795734374) * (-859)) + (((~(iIdentityHashCode7 | (-220991555))) | (~(795734374 | i2310))) * 859) + (((~(583131948 | i2310)) | (-804123503)) * 859) + 1988000102;
            int i2312 = (i2311 << 13) ^ i2311;
            int i2313 = i2312 ^ (i2312 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i2313 ^ (i2313 << 5);
        } else {
            int iIntValue7 = ((Integer) Class.forName(str10).getMethod(str5, Object.class).invoke(null, this)).intValue();
            Object[] objArr1216 = {1675337723};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 42049), Color.alpha(0) + 1726, 29 - (ViewConfiguration.getTouchSlop() >> 8), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue7, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).newInstance(objArr1216), 1988000102);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char cResolveSize3 = (char) (View.resolveSize(0, 0) + 29944);
                int iIndexOf13 = 1755 - TextUtils.indexOf(str4, str4, 0, 0);
                int windowTouchSlop4 = 23 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte b519 = $$a[7];
                Object[] objArr1217 = new Object[1];
                c(b519, (short) (b519 | 37), (byte) 52, objArr1217);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cResolveSize3, iIndexOf13, windowTouchSlop4, 1599039318, false, (String) objArr1217[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
            long jLongValue110 = ((Long) Class.forName(str8).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf114 = Long.valueOf(jLongValue110);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char tapTimeout2 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 29944);
                int keyRepeatTimeout9 = 1755 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int iRed7 = Color.red(0) + 23;
                byte b62 = $$a[7];
                Object[] objArr1218 = new Object[1];
                c(b62, (short) (b62 | 141), (byte) 52, objArr1218);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(tapTimeout2, keyRepeatTimeout9, iRed7, 1596667560, false, (String) objArr1218[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, lValueOf114);
            Long lValueOf23 = Long.valueOf(jLongValue110 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                char deadChar3 = (char) (KeyEvent.getDeadChar(0, 0) + 29944);
                int i2314 = 1756 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int iIndexOf14 = TextUtils.indexOf(str4, str4, 0, 0) + 23;
                byte b63 = $$a[7];
                short s215 = b63;
                Object[] objArr1219 = new Object[1];
                c(b63, s215, (byte) (s215 | 37), objArr1219);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(deadChar3, i2314, iIndexOf14, 986134021, false, (String) objArr1219[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf23);
        }
        i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
        i12 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        if (i12 == i11) {
            arrayList3 = new ArrayList();
            strArr3 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr3 != null) {
                while (i13 < strArr3.length) {
                    arrayList3.add(str21);
                }
            }
            throw new RuntimeException(String.valueOf(i12));
        }
        int i2315 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
        Object[] objArr1310 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
        int startElapsedRealtime4 = (int) Process.getStartElapsedRealtime();
        int i2316 = ~startElapsedRealtime4;
        int i2317 = i2315 + 2041781501 + ((startElapsedRealtime4 | (-281175542)) * 140) + (((~((-281175542) | i2316)) | 272786469) * (-280)) + (((~(startElapsedRealtime4 | (-272786470))) | (~(493777967 | i2316)) | (-502167040)) * 140);
        int i2318 = (i2317 << 13) ^ i2317;
        int i2319 = i2318 ^ (i2318 >>> 17);
        Object obj7 = objArr1310[3];
        ((int[]) obj7)[0] = i2319 ^ (i2319 << 5);
        ((Field) newHandlerExecutor.TuitionPaymentFragmentbindingInflater1[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{447543892, 1315424513, 2117826565}, ((int[]) obj7)[0], Integer.MAX_VALUE) - (-281243565));
        objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
            char maxKeyCode6 = (char) (KeyEvent.getMaxKeyCode() >> 16);
            int offsetBefore3 = TextUtils.getOffsetBefore(str4, 0) + 876;
            int maximumDrawingCacheSize6 = 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte[] bArr16 = $$a;
            Object[] objArr1311 = new Object[1];
            c((byte) (-bArr16[205]), (short) ($$b & 993), (byte) (-bArr16[9]), objArr1311);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(maxKeyCode6, offsetBefore3, maximumDrawingCacheSize6, -1199417970, false, (String) objArr1311[0], null);
        }
        j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).getLong(null);
        jLongValue3 = ((Long) Class.forName(str8).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
            char offsetBefore4 = (char) TextUtils.getOffsetBefore(str4, 0);
            int gidForName6 = Process.getGidForName(str4) + 877;
            int iBlue9 = 10 - Color.blue(0);
            byte[] bArr17 = $$a;
            Object[] objArr1312 = new Object[1];
            c((byte) (-bArr17[27]), (short) ($$b & 1003), bArr17[7], objArr1312);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(offsetBefore4, gidForName6, iBlue9, 254769921, false, (String) objArr1312[0], null);
        }
        if (j3 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).getLong(null) << 52) >>> 52)) >> 12)) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                char c19 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                int iArgb5 = Color.argb(0, 0, 0, 0) + 876;
                int deadChar4 = 10 - KeyEvent.getDeadChar(0, 0);
                byte[] bArr18 = $$a;
                Object[] objArr1313 = new Object[1];
                c((byte) (-bArr18[205]), (short) ($$b & 1003), bArr18[25], objArr1313);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(c19, iArgb5, deadChar4, 1324201839, false, (String) objArr1313[0], null);
            }
            Object[] objArr1314 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).get(null);
            objArr10 = new Object[]{new int[]{((int[]) objArr1314[0])[0]}, new int[1], new int[]{((int[]) objArr1314[2])[0]}, (String[]) objArr1314[3]};
            int iCodePointAt5 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str6, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step2).substring(4, 5).codePointAt(0) - 643072539;
            int i2410 = 273682532 + (((~((-42991623) | iCodePointAt5)) | (~((~iCodePointAt5) | (-2681394)))) * (-318)) + (((~(181862414 | iCodePointAt5)) | (-184543808)) * (-318)) + (((~(iCodePointAt5 | (-181862415))) | 141552185) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 1212627669;
            int i2411 = (i2410 << 13) ^ i2410;
            int i2412 = i2411 ^ (i2411 >>> 17);
            ((int[]) objArr10[1])[0] = i2412 ^ (i2412 << 5);
        } else {
            Object[] objArr1315 = {Integer.valueOf(((Integer) Class.forName(str10).getMethod(str5, Object.class).invoke(null, this)).intValue()), 1212627669};
            byte[] bArr19 = $$d;
            Object[] objArr1316 = new Object[1];
            d((byte) (-bArr19[96]), (short) 389, bArr19[80], objArr1316);
            Class<?> cls8 = Class.forName((String) objArr1316[0]);
            Object[] objArr1317 = new Object[1];
            d(bArr19[108], (short) (-bArr19[449]), bArr19[4], objArr1317);
            Object[] objArr1318 = (Object[]) cls8.getMethod((String) objArr1317[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr1315);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                char cMakeMeasureSpec4 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int i2413 = 877 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int maxKeyCode7 = 10 - (KeyEvent.getMaxKeyCode() >> 16);
                byte[] bArr110 = $$a;
                Object[] objArr1319 = new Object[1];
                c((byte) (-bArr110[205]), (short) ($$b & 1003), bArr110[25], objArr1319);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(cMakeMeasureSpec4, i2413, maxKeyCode7, 1324201839, false, (String) objArr1319[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, objArr1318);
            long jLongValue111 = ((Long) Class.forName(str8).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf24 = Long.valueOf(jLongValue111);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                char cAxisFromString2 = (char) (MotionEvent.axisFromString(str4) + 1);
                int iRed8 = 876 - Color.red(0);
                int edgeSlop6 = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
                byte[] bArr111 = $$a;
                Object[] objArr145 = new Object[1];
                c((byte) (-bArr111[27]), (short) ($$b & 1003), bArr111[7], objArr145);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cAxisFromString2, iRed8, edgeSlop6, 254769921, false, (String) objArr145[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf24);
            Long lValueOf25 = Long.valueOf(jLongValue111 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                char minimumFlingVelocity5 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iAlpha2 = 876 - Color.alpha(0);
                int iNormalizeMetaState4 = KeyEvent.normalizeMetaState(0) + 10;
                byte[] bArr112 = $$a;
                Object[] objArr146 = new Object[1];
                c((byte) (-bArr112[205]), (short) ($$b & 993), (byte) (-bArr112[9]), objArr146);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(minimumFlingVelocity5, iAlpha2, iNormalizeMetaState4, -1199417970, false, (String) objArr146[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf25);
            objArr10 = objArr1318;
        }
        if (((int[]) objArr10[0])[0] == ((int[]) objArr10[2])[0]) {
            arrayList4 = new ArrayList();
            strArr4 = (String[]) objArr10[3];
            if (strArr4 != null) {
                int i2414 = b + 23;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2414 % 128;
                int i2415 = i2414 % 2;
                while (i14 < strArr4.length) {
                    arrayList4.add(str22);
                }
            }
            throw null;
        }
        int i2416 = ((int[]) objArr10[1])[0];
        Object[] objArr147 = {new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
        int iIdentityHashCode8 = System.identityHashCode(this);
        int i2417 = ~iIdentityHashCode8;
        int i2418 = i2416 + 2029882472 + (((-46197313) | i2417) * (-369)) + (((~((-87954872) | i2417)) | (-47644643)) * (-369)) + (((~(iIdentityHashCode8 | 87954871)) | (-134152184) | (~(i2417 | (-1447331)))) * 369);
        int i2419 = (i2418 << 13) ^ i2418;
        int i255 = i2419 ^ (i2419 >>> 17);
        Object obj8 = objArr147[1];
        ((int[]) obj8)[0] = i255 ^ (i255 << 5);
        ((Field) myLooperExecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{500254004, 1255827802, 963528919}, ((int[]) obj8)[0], Integer.MAX_VALUE) - (-1901625681));
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = b + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        bundle.putInt("resolution", this.zaa);
        super.onSaveInstanceState(bundle);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c3, code lost:
    
        if (r1 != (((-82089954) + (((-68505615) | r6) * 494)) + (((~(r6 | 1632241968)) | (-1142904863)) * 494))) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c5, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.awaitTermination.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r6 = (int) java.lang.Runtime.getRuntime().totalMemory();
        r7 = ~r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f9, code lost:
    
        if (r1 != (((1198378817 + (((~(r7 | (-71346227))) | 185798912) * 220)) + (((~(r7 | (-609004799))) | 723457484) * (-440))) + ((r6 | (-71346227)) * 220))) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00fb, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.cacheInteropConfig.b[0]).getInt(null);
        r6 = android.os.Process.myUid();
        r7 = ~((-529360919) | r6);
        r8 = ~r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x013b, code lost:
    
        if (r1 != (((1461275464 + ((r7 | (~((-1359348462) | r8))) * (-1808))) + (((~((-243886099) | r6)) | (~(r8 | (-1073873642)))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN)) + ((((~(r6 | 1359348461)) | 285474820) | (~(529360918 | r8))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x013d, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ~((((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 207499490) | 57282090);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x017e, code lost:
    
        if (r1 != (((((-1792722664) | r2) * (-658)) + 2114841068) + ((r2 | (-1811599088)) * 658))) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0180, code lost:
    
        r1 = defpackage.initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x018a, code lost:
    
        if (r1 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x018c, code lost:
    
        r1 = defpackage.initSession.b((char) (46400 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 40, (-16777197) - android.graphics.Color.rgb(0, 0, 0), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x01b3, code lost:
    
        r1 = ((java.lang.reflect.Field) r1).get(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01bc, code lost:
    
        r3 = defpackage.initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01c0, code lost:
    
        if (r3 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01c2, code lost:
    
        r3 = defpackage.initSession.b((char) (46400 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 40, 19 - android.graphics.Color.red(0), 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01e6, code lost:
    
        ((java.lang.reflect.Method) r3).invoke(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01eb, code lost:
    
        super.onResume();
        r1 = com.google.android.gms.common.api.GoogleApiActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        com.google.android.gms.common.api.GoogleApiActivity.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01f7, code lost:
    
        if ((r1 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01f9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01fa, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01fd, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01fe, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01ff, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0203, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0205, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0206, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0207, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0208, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0209, code lost:
    
        r1 = 1268861056 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0212, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0213, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x021b, code lost:
    
        throw new java.lang.RuntimeException("753675594");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0046, code lost:
    
        if (r1 == (((1349561634 + (((~((~r6) | (-741912332))) | (-1143978702)) * (-235))) + (((~((-741912332) | r6)) | (-1143978702)) * (-470))) + (((~(r6 | (-69773834))) | (-1816117200)) * 235))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0094, code lost:
    
        if (r1 == ((((-1469091337) + (((~((~r6) | 1024871682)) | 589888) * 446)) + (((~(r6 | 1025461570)) | 622215424) * 446)) + 263090048)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0096, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.DirectExecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        r6 = ~new java.util.Random().nextInt(1790656100);
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApiActivity.onResume():void");
    }

    @Override // android.app.Activity
    protected void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = b + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.getDefaultSize(0, 0) + 46400), 40 - (KeyEvent.getMaxKeyCode() >> 16), 18 - ExpandableListView.getPackedPositionChild(0L), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46400 - Color.red(0)), (Process.myTid() >> 22) + 40, 19 - TextUtils.getOffsetAfter("", 0), 41588667, false, "b", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
            super.onPause();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 12 / 0;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 29944);
            int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0, 0);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24;
            byte b2 = $$a[7];
            short s = b2;
            Object[] objArr2 = new Object[1];
            c(b2, s, (byte) (s | 37), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, iLastIndexOf, iIndexOf, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i2 = b + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cCombineMeasuredStates = (char) (29944 - View.combineMeasuredStates(0, 0));
                int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 1755;
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 23;
                byte b3 = $$a[7];
                Object[] objArr3 = new Object[1];
                c(b3, (short) (b3 | 37), (byte) 52, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, iIndexOf2, tapTimeout, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 172833682;
            int i4 = (((1788584675 + (((~(431138923 | iCodePointAt)) | 429918282) * (-502))) + ((~((~iCodePointAt) | 1073659631)) * (-502))) + (((~(iCodePointAt | (-643741350))) | 431138923) * TypedValues.PositionType.TYPE_DRAWPATH)) - 487317246;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            a(new int[]{-776079623, -1868173187, 174537201, -176057660, -884632874, -1763246560, 968308494, 1306062793, 1226016571, -1776443230}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step3).substring(0, 1).codePointAt(0) - 51, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a(new int[]{-2092080144, -621420688, 943363041, 490785373, -1240413694, 198182681, 117529371, 790262218, -975967425, -1922948330}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-404338547};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (AndroidCharacter.getMirror('0') + 42001), Color.argb(0, 0, 0, 0) + 1726, 29 - Color.blue(0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = zzpu.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -487317246, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cKeyCodeFromString = (char) (29944 - KeyEvent.keyCodeFromString(""));
                    int i7 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1755;
                    int jumpTapTimeout = 23 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    byte b4 = $$a[7];
                    Object[] objArr8 = new Object[1];
                    c(b4, (short) (b4 | 37), (byte) 52, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cKeyCodeFromString, i7, jumpTapTimeout, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    a(new int[]{-1731451608, -1601602908, 1817432407, 734291081, 106304590, 872144152, -721907688, -847217688, -1669423247, -316142485, 1849285208, -1598630883, -32109610, -1998979481}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_qr_code).substring(1, 2).length() + 21, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    a(new int[]{1054582264, -1475515551, -34735432, -367108409, 2020721752, 1829823907, -257365442, 1844189524, -1530916251, 868747907}, 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char keyRepeatTimeout = (char) (29944 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1755;
                        int iNormalizeMetaState = 23 - KeyEvent.normalizeMetaState(0);
                        byte b5 = $$a[7];
                        Object[] objArr11 = new Object[1];
                        c(b5, (short) (b5 | 141), (byte) 52, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout, windowTouchSlop, iNormalizeMetaState, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char gidForName = (char) (29943 - Process.getGidForName(""));
                        int absoluteGravity = 1755 - Gravity.getAbsoluteGravity(0, 0);
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 23;
                        byte b6 = $$a[7];
                        short s2 = b6;
                        Object[] objArr12 = new Object[1];
                        c(b6, s2, (byte) (s2 | 37), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(gidForName, absoluteGravity, offsetAfter, 986134021, false, (String) objArr12[0], null);
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
        int i8 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        if (i9 == i8) {
            int i10 = b + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int i13 = (int) Runtime.getRuntime().totalMemory();
            int i14 = i12 + (((~((~i13) | 901706710)) * 130) - 1937811641) + (((~(i13 | 901706710)) | 554828048) * 130);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr13[3])[0] = i16 ^ (i16 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr != null) {
                int i17 = 0;
                while (i17 < strArr.length) {
                    int i18 = b + 57;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
                    if (i18 % 2 != 0) {
                        arrayList.add(strArr[i17]);
                        i17 += 91;
                    } else {
                        arrayList.add(strArr[i17]);
                        i17++;
                    }
                }
            }
            int[] iArr = new int[i9];
            int i19 = i9 - 1;
            iArr[i19] = 1;
            Toast.makeText((Context) null, iArr[((i9 * i19) % 2) - 1], 1).show();
            int i20 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_shippingcountry_empty).substring(10, 11).codePointAt(0) + 1480319020;
            int i21 = i20 + 1815103509 + (((~(610284365 | iCodePointAt2)) | 822886791) * (-366)) + (((~(iCodePointAt2 | 896299983)) | 536871173) * 366);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr14[3])[0] = i23 ^ (i23 << 5);
            int i24 = b + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i24 % 128;
            int i25 = i24 % 2;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
            int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0') + 1032;
            int i26 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15;
            byte b7 = $$a[7];
            Object[] objArr15 = new Object[1];
            c(b7, (short) (b7 | 89), (byte) 52, objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(maxKeyCode, iIndexOf3, i26, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        a(new int[]{-1731451608, -1601602908, 1817432407, 734291081, 106304590, 872144152, -721907688, -847217688, -1669423247, -316142485, 1849285208, -1598630883, -32109610, -1998979481}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 22, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        a(new int[]{1054582264, -1475515551, -34735432, -367108409, 2020721752, 1829823907, -257365442, 1844189524, -1530916251, 868747907}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int i27 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1031;
            int iMyTid = 15 - (Process.myTid() >> 22);
            byte b8 = $$a[7];
            Object[] objArr18 = new Object[1];
            c(b8, (short) (b8 | 37), (byte) 52, objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cResolveSize, i27, iMyTid, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                int mode = 1031 - View.MeasureSpec.getMode(0);
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 15;
                byte b9 = (byte) ($$b & 46);
                short s3 = $$a[7];
                Object[] objArr19 = new Object[1];
                c(b9, s3, (byte) s3, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c, mode, longPressTimeout, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr20[3])[0];
            int i29 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iMyTid2 = Process.myTid();
            int i30 = ~iMyTid2;
            int i31 = (((2032682791 + (((~((-354197853) | i30)) | (-109917683)) * (-602))) + ((((~(iMyTid2 | (-354197853))) | 286294028) | (~((-42013859) | i30))) * (-301))) + ((~(i30 | (-109917683))) * 301)) - 1089958697;
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr[2])[0] = i33 ^ (i33 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            a(new int[]{-776079623, -1868173187, 174537201, -176057660, -884632874, -1763246560, 968308494, 1306062793, 1226016571, -1776443230}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_general_network_error).substring(0, 37).length() - 21, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            a(new int[]{-2092080144, -621420688, 943363041, 490785373, -1240413694, 198182681, 117529371, 790262218, -975967425, -1922948330}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step2).substring(32, 33).length() + 15, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-404338547};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - ExpandableListView.getPackedPositionGroup(0L)), 1134 - Color.red(0), 18 - (ViewConfiguration.getPressedStateDuration() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -1089958697, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cCombineMeasuredStates2 = (char) View.combineMeasuredStates(0, 0);
                int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 1031;
                int maximumFlingVelocity = 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte b10 = $$a[7];
                Object[] objArr25 = new Object[1];
                c(b10, (short) (b10 | 89), (byte) 52, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cCombineMeasuredStates2, tapTimeout2, maximumFlingVelocity, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 45992), TextUtils.lastIndexOf("", '0') + 1118, Color.alpha(0) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cResolveSize2 = (char) View.resolveSize(0, 0);
                int iIndexOf4 = 1031 - TextUtils.indexOf("", "");
                int modifierMetaStateMask = 14 - ((byte) KeyEvent.getModifierMetaStateMask());
                byte b11 = (byte) ($$b & 46);
                short s4 = $$a[7];
                Object[] objArr26 = new Object[1];
                c(b11, s4, (byte) s4, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cResolveSize2, iIndexOf4, modifierMetaStateMask, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                a(new int[]{-1731451608, -1601602908, 1817432407, 734291081, 106304590, 872144152, -721907688, -847217688, -1669423247, -316142485, 1849285208, -1598630883, -32109610, -1998979481}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.next).substring(1, 2).length() + 21, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                a(new int[]{1054582264, -1475515551, -34735432, -367108409, 2020721752, 1829823907, -257365442, 1844189524, -1530916251, 868747907}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                    int iGreen = Color.green(0) + 1031;
                    int i34 = 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b12 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c(b12, (short) (b12 | 37), (byte) 52, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(capsMode, iGreen, i34, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                    int iRed = Color.red(0) + 1031;
                    int iIndexOf5 = 14 - TextUtils.indexOf((CharSequence) "", '0');
                    byte b13 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    c(b13, (short) (b13 | 89), (byte) 52, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cLastIndexOf, iRed, iIndexOf5, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i35 = ((int[]) objArr[1])[0];
        int i36 = ((int[]) objArr[3])[0];
        if (i36 != i35) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i37 = b + 15;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i37 % 128;
                int i38 = i37 % 2;
                for (String str : strArr3) {
                    arrayList2.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i36));
        }
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i39 = ((int[]) objArr[2])[0];
        int i40 = ((int[]) objArr[3])[0];
        int i41 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int i42 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi | (-370275773));
        int i43 = i39 + (((-917632447) | i42) * (-196)) + 869221285 + ((i42 | 547356674) * 196);
        int i44 = (i43 << 13) ^ i43;
        int i45 = i44 ^ (i44 >>> 17);
        ((int[]) objArr31[2])[0] = i45 ^ (i45 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -582672024
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // android.app.Activity
    protected void onStart() {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApiActivity.onStart():void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r7, int r8, short r9) {
        /*
            byte[] r0 = com.google.android.gms.common.api.GoogleApiActivity.$$c
            int r9 = r9 * 4
            int r9 = 3 - r9
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r7 = r7 * 56
            int r7 = 122 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2c:
            int r7 = r7 + r9
            r9 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApiActivity.$$g(int, int, short):java.lang.String");
    }
}
