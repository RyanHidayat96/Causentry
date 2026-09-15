package com.midtrans.sdk.uikit.views.mandiri_ecash;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityLoginBinding;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.calculateCameraUseCases;
import defpackage.createExtraPreview;
import defpackage.filterOutChildSizesCausingDoubleCropping;
import defpackage.getMirroringAppliedByEffect;
import defpackage.getRealtimeCaptureLatency;
import defpackage.handleMessage;
import defpackage.initSession;
import defpackage.onConnectionFailed;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public class MandiriEcashPaymentActivity extends BasePaymentActivity implements filterOutChildSizesCausingDoubleCropping {
    private static int $10 = 0;
    private static int $11 = 1;
    private final String asInterface = "Mandiri e-Cash";
    private final String d = "Confirm Payment Mandiri e-Cash";
    private FancyButton g;
    private getMirroringAppliedByEffect notify;
    private static final byte[] $$j = {Base64.padSymbol, -108, 49, -100, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$k = 16;
    private static int cancel = 0;
    private static int onTransact = 1;
    private static long INotificationSideChannel = -11465665238061719L;

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(MandiriEcashPaymentActivity mandiriEcashPaymentActivity) {
        int i = 2 % 2;
        int i2 = cancel + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        mandiriEcashPaymentActivity.asBinder();
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
    }

    public static /* synthetic */ getMirroringAppliedByEffect TuitionPaymentFragmentspecialinlinedviewModeldefault1(MandiriEcashPaymentActivity mandiriEcashPaymentActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        int i3 = i2 % 128;
        cancel = i3;
        int i4 = i2 % 2;
        getMirroringAppliedByEffect getmirroringappliedbyeffect = mandiriEcashPaymentActivity.notify;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 7;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return getmirroringappliedbyeffect;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.views.mandiri_ecash.MandiriEcashPaymentActivity.$$j
            int r7 = 197 - r7
            int r9 = 53 - r9
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L28
        L13:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r8]
        L28:
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            int r8 = r8 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.mandiri_ecash.MandiriEcashPaymentActivity.m(int, short, byte, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        setPrimaryBackgroundColor(this.g);
        int i4 = onTransact + 43;
        cancel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        this.g = (FancyButton) findViewById(R.id.button_primary);
        int i4 = onTransact + 125;
        cancel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = cancel + 19;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            super.onActivityResult(i, i2, intent);
            if (i != 16371) {
                if (i != 111) {
                    return;
                }
            }
        } else {
            super.onActivityResult(i, i2, intent);
            if (i != 210) {
                if (i != 111) {
                    return;
                }
            }
        }
        TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Intent intent2 = new Intent();
        intent2.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        setResult(-1, intent2);
        finish();
        int i5 = cancel + 49;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        getMirroringAppliedByEffect getmirroringappliedbyeffect = this.notify;
        if (getmirroringappliedbyeffect != null) {
            int i2 = onTransact + 51;
            cancel = i2 % 128;
            if (i2 % 2 != 0) {
                getmirroringappliedbyeffect.TuitionPaymentFragmentbindingInflater1("Back", "Mandiri e-Cash");
                int i3 = 83 / 0;
            } else {
                getmirroringappliedbyeffect.TuitionPaymentFragmentbindingInflater1("Back", "Mandiri e-Cash");
            }
        }
        super.onBackPressed();
        int i4 = cancel + 31;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        int i = 2 % 2;
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            int i2 = cancel + 37;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
                int i3 = 42 / 0;
            } else {
                onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
            }
        }
        int i4 = onTransact + 95;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = cancel + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        int i4 = cancel + 101;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void b(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        b();
        b(transactionResponse, "mandiri_ecash");
        int i4 = cancel + 123;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void n(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $11 + 71;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - Drawable.resolveOpacity(0, 0)), 2624 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 13 - (ViewConfiguration.getPressedStateDuration() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() % (INotificationSideChannel + 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.getDefaultSize(0, 0) + 39422), AndroidCharacter.getMirror('0') + 433, ImageFormat.getBitsPerPixel(0) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.resolveSizeAndState(0, 0, 0) + 19472), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2623, 12 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (INotificationSideChannel ^ 9053247990562531611L);
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 39422), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 480, 37 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 39422), 481 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 37 - Color.blue(0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            int i6 = $11 + 69;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1347609129
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.mandiri_ecash.MandiriEcashPaymentActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cAlpha = (char) (Color.alpha(0) + 29944);
            int deadChar = 1755 - KeyEvent.getDeadChar(0, 0);
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23;
            byte b = $$j[7];
            Object[] objArr2 = new Object[1];
            m((short) 193, b, (byte) (b | 15), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha, deadChar, scrollDefaultDelay, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i2 = cancel + 35;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cMyPid = (char) (29944 - (Process.myPid() >> 22));
                int i4 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                int windowTouchSlop = 23 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                short s = (short) ($$k | 140);
                byte b2 = $$j[7];
                Object[] objArr3 = new Object[1];
                m(s, b2, b2, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, i4, windowTouchSlop, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i5 = ~iUptimeMillis;
            int i6 = 604724045 + (((~(494951190 | i5)) | (-707553617) | (~((-494951191) | iUptimeMillis))) * (-564)) + ((~(iUptimeMillis | (-134236433))) * 1128) + (((~((-707553617) | i5)) | 360714758) * 564) + 78590620;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            n(new char[]{33816, 17736, 1714, 49154, 33072, 17113, 3121, 52577, 36557, 18543, 2479, 51938, 37957, 21913, 5869, 53322}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 49463, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            n(new char[]{33819, 48183, 62549, 11391, 25730, 40126, 54464, 3308, 17714, 32058, 46411, 60785, 9661, 23984, 38360, 52728}, 14370 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-844582337};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42048 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1726, 29 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = ActivityLoginBinding.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 78590620);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0'));
                    int deadChar2 = 1755 - KeyEvent.getDeadChar(0, 0);
                    int size = View.MeasureSpec.getSize(0) + 23;
                    short s2 = (short) ($$k | 140);
                    byte b3 = $$j[7];
                    Object[] objArr8 = new Object[1];
                    m(s2, b3, b3, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, deadChar2, size, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    n(new char[]{33811, 55799, 16320, 40385, 62385, 20876, 46996, 5425, 27461, 51522, 12146, 36152, 58127, 16622, 42716, 1234, 23215, 47274, 7832, 31852, 53837, 12382}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.vida_preview_height) & (-865)) + 23915, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    n(new char[]{33815, 3281, 38285, 7791, 42813, 10268, 45260, 14729, 49775, 19284, 56328, 25827, 60847, 30364, 65349}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 35012, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int i9 = 1756 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
                        byte b4 = $$j[7];
                        Object[] objArr11 = new Object[1];
                        m((short) 104, b4, b4, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, i9, keyRepeatDelay, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29943);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1756;
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 23;
                        byte b5 = $$j[7];
                        Object[] objArr12 = new Object[1];
                        m((short) 193, b5, (byte) (b5 | 15), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iLastIndexOf, offsetBefore, 986134021, false, (String) objArr12[0], null);
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
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int i13 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
            int i14 = i12 + (((~((~i13) | (-2130178))) * 130) - 1180415305) + (((~(i13 | (-2130178))) | 8585344) * 130);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr13[3])[0] = i16 ^ (i16 << 5);
            int i17 = onTransact + 121;
            cancel = i17 % 128;
            int i18 = i17 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr != null) {
                int i19 = cancel + 69;
                onTransact = i19 % 128;
                int i20 = 2;
                int i21 = i19 % 2;
                int i22 = 0;
                while (i22 < strArr.length) {
                    int i23 = cancel + 115;
                    onTransact = i23 % 128;
                    if (i23 % i20 == 0) {
                        arrayList.add(strArr[i22]);
                        i22 += 34;
                    } else {
                        arrayList.add(strArr[i22]);
                        i22++;
                    }
                    i20 = 2;
                }
            }
            int[] iArr = new int[i11];
            int i24 = i11 - 1;
            iArr[i24] = 1;
            Toast.makeText((Context) null, iArr[((i11 * i24) % 2) - 1], 1).show();
            int i25 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 940664227;
            int i26 = ~length;
            int i27 = i25 + 247445448 + (((~(i26 | (-144873328))) | 144708166 | (~((-357310593) | length))) * 717) + (((~(length | (-144873328))) | (~(i26 | (-357310593))) | 144708166) * 717);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr14[3])[0] = i29 ^ (i29 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i30 = 1032 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int doubleTapTimeout = 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            short s3 = (short) ($$k | 36);
            byte b6 = $$j[7];
            Object[] objArr15 = new Object[1];
            m(s3, b6, b6, objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollBarFadeDuration, i30, doubleTapTimeout, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        n(new char[]{33811, 55799, 16320, 40385, 62385, 20876, 46996, 5425, 27461, 51522, 12146, 36152, 58127, 16622, 42716, 1234, 23215, 47274, 7832, 31852, 53837, 12382}, 24043 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        n(new char[]{33815, 3281, 38285, 7791, 42813, 10268, 45260, 14729, 49775, 19284, 56328, 25827, 60847, 30364, 65349}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 35012, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c3 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int i31 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1030;
            int iResolveOpacity = 15 - Drawable.resolveOpacity(0, 0);
            short s4 = (short) ($$k | 140);
            byte b7 = $$j[7];
            Object[] objArr18 = new Object[1];
            m(s4, b7, b7, objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, i31, iResolveOpacity, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i32 = cancel + 73;
            onTransact = i32 % 128;
            int i33 = i32 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int i34 = 1032 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int packedPositionType = 15 - ExpandableListView.getPackedPositionType(0L);
                byte[] bArr = $$j;
                Object[] objArr19 = new Object[1];
                m(bArr[7], bArr[28], (byte) ($$k | 36), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cCombineMeasuredStates, i34, packedPositionType, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i35 = ((int[]) objArr20[3])[0];
            int i36 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step2).substring(4, 5).codePointAt(0) - 889617444;
            int i37 = (~(481735588 | iCodePointAt)) | 591399946;
            int i38 = ~iCodePointAt;
            int i39 = ((((-130015905) + ((i37 | (~((-347119777) | i38))) * 886)) + (((~(i38 | (-481735589))) | 726015758) * (-1772))) + ((~(i38 | 726015758)) * 886)) - 799984993;
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr[2])[0] = i41 ^ (i41 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            n(new char[]{33816, 17736, 1714, 49154, 33072, 17113, 3121, 52577, 36557, 18543, 2479, 51938, 37957, 21913, 5869, 53322}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.danamon_online_description_2).substring(0, 1).length() + 49498, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            n(new char[]{33819, 48183, 62549, 11391, 25730, 40126, 54464, 3308, 17714, 32058, 46411, 60785, 9661, 23984, 38360, 52728}, TextUtils.lastIndexOf("", '0', 0, 0) + 14370, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-844582337};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - TextUtils.getOffsetBefore("", 0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1133, 18 - View.getDefaultSize(0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -799984993, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1031;
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 15;
                short s5 = (short) ($$k | 36);
                byte b8 = $$j[7];
                Object[] objArr25 = new Object[1];
                m(s5, b8, b8, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(scrollDefaultDelay2, iKeyCodeFromString, threadPriority, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45994 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1116, 17 - View.combineMeasuredStates(0, 0)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c4 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int iMyPid = 1031 - (Process.myPid() >> 22);
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 15;
                byte[] bArr2 = $$j;
                Object[] objArr26 = new Object[1];
                m(bArr2[7], bArr2[28], (byte) ($$k | 36), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c4, iMyPid, offsetAfter, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                n(new char[]{33811, 55799, 16320, 40385, 62385, 20876, 46996, 5425, 27461, 51522, 12146, 36152, 58127, 16622, 42716, 1234, 23215, 47274, 7832, 31852, 53837, 12382}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_1).substring(5, 6).length() + 24042, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                n(new char[]{33815, 3281, 38285, 7791, 42813, 10268, 45260, 14729, 49775, 19284, 56328, 25827, 60847, 30364, 65349}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.expand_link_prima).substring(1, 2).length() + 35022, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1031;
                    int iMyTid = 15 + (Process.myTid() >> 22);
                    short s6 = (short) ($$k | 140);
                    byte b9 = $$j[7];
                    Object[] objArr29 = new Object[1];
                    m(s6, b9, b9, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cResolveSizeAndState, maxKeyCode, iMyTid, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                    int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 1031;
                    int mirror = AndroidCharacter.getMirror('0') - '!';
                    short s7 = (short) ($$k | 36);
                    byte b10 = $$j[7];
                    Object[] objArr30 = new Object[1];
                    m(s7, b10, b10, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cNormalizeMetaState, iResolveOpacity2, mirror, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 == null) {
                throw null;
            }
            for (String str : strArr3) {
                arrayList2.add(str);
            }
            throw null;
        }
        int i42 = cancel + 53;
        onTransact = i42 % 128;
        int i43 = i42 % 2;
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i44 = ((int[]) objArr[2])[0];
        int i45 = ((int[]) objArr[3])[0];
        int i46 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iMyPid2 = Process.myPid();
        int i47 = i44 + (((1012946327 + (((-1048707) | (~iMyPid2)) * (-490))) + (((~(iMyPid2 | (-68764296))) | 67715589) * 490)) - 103432830);
        int i48 = i47 ^ (i47 << 13);
        int i49 = i48 ^ (i48 >>> 17);
        ((int[]) objArr31[2])[0] = i49 ^ (i49 << 5);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[1]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = (-1074585944) + (((~((-577580636) | iIdentityHashCode)) | 537405001 | (~(1407568178 | iIdentityHashCode))) * (-880));
            int i5 = (~((-577580636) | (~iIdentityHashCode))) | (-1407568179);
            int i6 = ~(iIdentityHashCode | 577580635);
            if (i3 != i4 + ((i5 | i6) * (-880)) + (i6 * 880)) {
                throw null;
            }
        } else {
            int i7 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int i8 = (~new Random().nextInt(2081598764)) | 29605830;
            if (i7 != 1413143673 + (i8 * 495) + (((~i8) | 12821826) * 495)) {
                throw null;
            }
        }
        int i9 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iMyTid = Process.myTid();
        int i10 = ~((-29364327) | iMyTid);
        int i11 = ~iMyTid;
        if (i9 != (-1897303098) + ((i10 | (~(i11 | 1809243135))) * 497) + (((~(iMyTid | 1809243135)) | (~((-63967479) | i11)) | 34603152) * 497)) {
            int i12 = (-343250576) % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i13 = cancel + 59;
        onTransact = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00da, code lost:
    
        if (r1 != (((246358680 + (((~(r2 | (-3227921))) | r5) * 590)) + (r5 * (-1180))) + (((~((-166805782) | r4)) | (~(r4 | (-1882717113)))) * 590))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00dc, code lost:
    
        super.onStart();
        r1 = com.midtrans.sdk.uikit.views.mandiri_ecash.MandiriEcashPaymentActivity.onTransact + 63;
        com.midtrans.sdk.uikit.views.mandiri_ecash.MandiriEcashPaymentActivity.cancel = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ea, code lost:
    
        r1 = 1176765722 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f3, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0070, code lost:
    
        if (r1 == ((((((-1541389804) | r5) | (~(433951178 | r4))) * (-338)) - 2128698480) + (((~(r4 | (-1107438626))) | r5) * 338))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0098, code lost:
    
        if (r1 == (((((~(r4 | 710467935)) | (-1540455479)) * 56) - 861201048) + (((~((~r4) | (-1540455479))) | 710467935) * 56))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009a, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r2 = new java.util.Random().nextInt();
        r4 = ~r2;
        r5 = ((~(1882717112 | r4)) | (-2046294974)) | (~(166805781 | r4));
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.mandiri_ecash.MandiriEcashPaymentActivity.onStart():void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = onTransact + 119;
        cancel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
    }
}
