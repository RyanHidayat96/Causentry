package com.midtrans.sdk.uikit.views.bri_epay;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.R;
import com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda7;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.SessionProcessor;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.filterOutChildSizesCausingDoubleCropping;
import defpackage.getPreferredChildSizeForViewport;
import defpackage.handleMessage;
import defpackage.initSession;
import defpackage.onConnectionFailed;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class BriEpayPaymentActivity extends BasePaymentActivity implements filterOutChildSizesCausingDoubleCropping {
    private getPreferredChildSizeForViewport cancelAll;
    private FancyButton g;
    private static final byte[] $$m = {31, 115, -100, -11};
    private static final int $$n = 203;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {59, -124, -78, 46, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$k = 204;
    private static int onTransact = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static long INotificationSideChannel = -7570006871257496549L;
    private static int cancel = -981105359;
    private static char notify = 34097;
    private final String asInterface = "BRI e-Pay";
    private final String d = "Confirm Payment BRI e-Pay";

    public static /* synthetic */ getPreferredChildSizeForViewport TuitionPaymentFragmentbindingInflater1(BriEpayPaymentActivity briEpayPaymentActivity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 119;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        getPreferredChildSizeForViewport getpreferredchildsizeforviewport = briEpayPaymentActivity.cancelAll;
        int i5 = i3 + 89;
        RemoteActionCompatParcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            return getpreferredchildsizeforviewport;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(BriEpayPaymentActivity briEpayPaymentActivity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        briEpayPaymentActivity.asBinder();
        if (i3 != 0) {
            throw null;
        }
        int i4 = onTransact + 99;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void m(int i, short s, byte b, Object[] objArr) {
        byte[] bArr = $$j;
        int i2 = 98 - (b * 14);
        int i3 = i + 4;
        byte[] bArr2 = new byte[53 - s];
        int i4 = 52 - s;
        int i5 = -1;
        if (bArr == null) {
            i2 = (i3 + i4) - 11;
            i3++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i6 = i2;
            i2 = (i6 + bArr[i3]) - 11;
            i3++;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            setPrimaryBackgroundColor(this.g);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setPrimaryBackgroundColor(this.g);
        int i3 = RemoteActionCompatParcelizer + 113;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.g = (FancyButton) findViewById(R.id.button_primary);
        int i4 = onTransact + 31;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 5;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        super.onActivityResult(i, i2, intent);
        if (i == 210 || i == 111) {
            TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Intent intent2 = new Intent();
            intent2.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            setResult(-1, intent2);
            finish();
            return;
        }
        int i6 = onTransact + 43;
        RemoteActionCompatParcelizer = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        getPreferredChildSizeForViewport getpreferredchildsizeforviewport = this.cancelAll;
        if (getpreferredchildsizeforviewport != null) {
            int i2 = RemoteActionCompatParcelizer + 77;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                getpreferredchildsizeforviewport.TuitionPaymentFragmentbindingInflater1("Back", "BRI e-Pay");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getpreferredchildsizeforviewport.TuitionPaymentFragmentbindingInflater1("Back", "BRI e-Pay");
        }
        super.onBackPressed();
        int i3 = RemoteActionCompatParcelizer + 125;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        int i = 2 % 2;
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            int i2 = RemoteActionCompatParcelizer + 27;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
        }
        int i4 = onTransact + 51;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        int i4 = onTransact + 107;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void b(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            b();
            b(transactionResponse, "bri_epay");
            throw null;
        }
        b();
        b(transactionResponse, "bri_epay");
        int i3 = onTransact + 115;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -832983102
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.bri_epay.BriEpayPaymentActivity.onCreate(android.os.Bundle):void");
    }

    private static void n(char[] cArr, char[] cArr2, char c, char[] cArr3, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $11 + 87;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 8329), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1235, (ViewConfiguration.getJumpTapTimeout() >> 16) + 35, -653973969, false, $$u(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ExpandableListView.getPackedPositionGroup(0L), 2764 - (ViewConfiguration.getFadingEdgeLength() >> 16), 14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1504416861, false, $$u(b3, b4, (byte) (b4 + 2)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43324), (ViewConfiguration.getPressedStateDuration() >> 16) + 253, 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 65200), TextUtils.indexOf("", "") + 2891, 17 - TextUtils.getCapsMode("", 0, 0), 2012627446, false, $$u(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (INotificationSideChannel ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) cancel) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) notify) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
        int i6 = $10 + 35;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrB$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int iKeyCodeFromString = 1031 - KeyEvent.keyCodeFromString("");
            int iRgb = (-16777201) - Color.rgb(0, 0, 0);
            byte[] bArr = $$j;
            short s = bArr[7];
            Object[] objArr2 = new Object[1];
            m(s, (byte) s, bArr[132], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, iKeyCodeFromString, iRgb, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        n(new char[]{8192, 22969, 9437, 35109, 55142, 19746, 2409, 27600, 48662, 5634, 64754, 33841, 61524, 34093, 51029, 58692, 10077, 44081, 27458, 17813, 11309, 21432}, new char[]{49450, 30443, 936, 12687}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_bersama1).substring(30, 31).length() - 1), new char[]{15403, 45463, 22137, 57339}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.company_code).substring(1, 2).length() - 1, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        n(new char[]{58501, 16298, 36871, 30957, 54487, 39891, 55152, 15588, 5684, 31882, 57895, 8697, 36068, 54539, 44809}, new char[]{49450, 30443, 936, 12687}, (char) (ExpandableListView.getPackedPositionGroup(0L) + 30657), new char[]{15561, 4260, 49421, 28023}, 219194419 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_open_with).substring(0, 9).length(), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int iKeyCodeFromString2 = 1031 - KeyEvent.keyCodeFromString("");
            int iIndexOf = 14 - TextUtils.indexOf((CharSequence) "", '0', 0);
            byte[] bArr2 = $$j;
            Object[] objArr5 = new Object[1];
            m((short) 52, bArr2[7], bArr2[132], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iKeyCodeFromString2, iIndexOf, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0', 0);
                int i2 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14;
                short s2 = (short) 104;
                Object[] objArr6 = new Object[1];
                m(s2, (byte) (s2 >>> 1), $$j[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength, iLastIndexOf, i2, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i3 = ((int[]) objArr7[3])[0];
            int i4 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i5 = (-1111539135) + (((~(1004482034 | iFreeMemory)) | 67158536 | (~((-760201865) | iFreeMemory))) * (-744)) + (((~iFreeMemory) | 311438706) * 744) + ((iFreeMemory | (-67158537)) * 744) + 1776044743;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[2])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            n(new char[]{64886, 12865, 40385, 17210, 33487, 29927, 296, 21291, 25367, 44938, 19299, 15062, 10697, 23989, 54662, 36266}, new char[]{49450, 30443, 936, 12687}, (char) (59781 - (ViewConfiguration.getEdgeSlop() >> 16)), new char[]{50004, 19962, 34054, 3561}, 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            n(new char[]{55146, 14857, 16209, 23929, 38335, 10578, 1750, 21535, 12267, 21542, 21717, 691, 9393, 19746, 9748, 6263}, new char[]{49450, 30443, 936, 12687}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 19308), new char[]{21162, 51886, 55019, 22603}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-753496977};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46037 - ExpandableListView.getPackedPositionChild(0L)), 1134 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1776044743, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                    int jumpTapTimeout = 1031 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int i8 = 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte[] bArr3 = $$j;
                    short s3 = bArr3[7];
                    Object[] objArr12 = new Object[1];
                    m(s3, (byte) s3, bArr3[132], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, jumpTapTimeout, i8, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((Process.myPid() >> 22) + 45993), 1117 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), ExpandableListView.getPackedPositionChild(0L) + 18), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iBlue = Color.blue(0) + 1031;
                    int keyRepeatTimeout = 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    short s4 = (short) 104;
                    Object[] objArr13 = new Object[1];
                    m(s4, (byte) (s4 >>> 1), $$j[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(fadingEdgeLength2, iBlue, keyRepeatTimeout, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    n(new char[]{8192, 22969, 9437, 35109, 55142, 19746, 2409, 27600, 48662, 5634, 64754, 33841, 61524, 34093, 51029, 58692, 10077, 44081, 27458, 17813, 11309, 21432}, new char[]{49450, 30443, 936, 12687}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_face_detected).substring(0, 43).length() - 43), new char[]{15403, 45463, 22137, 57339}, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    n(new char[]{58501, 16298, 36871, 30957, 54487, 39891, 55152, 15588, 5684, 31882, 57895, 8697, 36068, 54539, 44809}, new char[]{49450, 30443, 936, 12687}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_face_too_close).substring(18, 19).length() + 30656), new char[]{15561, 4260, 49421, 28023}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.card_detail_title).substring(8, 9).codePointAt(0) + 219194363, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                        int iRed = 1031 - Color.red(0);
                        int iArgb = Color.argb(0, 0, 0, 0) + 15;
                        byte[] bArr4 = $$j;
                        Object[] objArr16 = new Object[1];
                        m((short) 52, bArr4[7], bArr4[132], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, iRed, iArgb, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int keyRepeatTimeout2 = 1031 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int scrollBarFadeDuration2 = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte[] bArr5 = $$j;
                        short s5 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        m(s5, (byte) s5, bArr5[132], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(windowTouchSlop, keyRepeatTimeout2, scrollBarFadeDuration2, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i9 = ((int[]) objArr[1])[0];
        int i10 = ((int[]) objArr[3])[0];
        if (i10 == i9) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i11 = ((int[]) objArr[2])[0];
            int i12 = ((int[]) objArr[3])[0];
            int i13 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_web_instruction_1).substring(1, 3).codePointAt(0) - 1749906335;
            int i14 = i11 + 1735288292 + (((~(iCodePointAt | 727004967)) | 343984280) * 305) + (((~((~iCodePointAt) | 727004967)) | 482724797) * 305);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr18[2])[0] = i16 ^ (i16 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i17 = 0;
                while (i17 < strArr3.length) {
                    int i18 = onTransact + 11;
                    RemoteActionCompatParcelizer = i18 % 128;
                    if (i18 % 2 == 0) {
                        arrayList.add(strArr3[i17]);
                        i17 += 121;
                    } else {
                        arrayList.add(strArr3[i17]);
                        i17++;
                    }
                }
            }
            int[] iArr = new int[i10];
            int i19 = i10 - 1;
            iArr[i19] = 1;
            Toast.makeText((Context) null, iArr[((i10 * i19) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[3])[0];
            int i22 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i23 = ~iIdentityHashCode;
            int i24 = i20 + 1372746591 + (((~((-72001582) | i23)) | (~((-172278589) | iIdentityHashCode))) * 210) + (((~(iIdentityHashCode | (-67774466))) | (~(i23 | (-168051473)))) * 210);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr19[2])[0] = i26 ^ (i26 << 5);
            int i27 = onTransact + 91;
            RemoteActionCompatParcelizer = i27 % 128;
            int i28 = i27 % 2;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c4 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29943);
            int iIndexOf2 = 1755 - TextUtils.indexOf("", "", 0, 0);
            int trimmedLength = TextUtils.getTrimmedLength("") + 23;
            byte[] bArr6 = $$j;
            Object[] objArr20 = new Object[1];
            m((short) 104, (byte) (bArr6[33] - 1), bArr6[132], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c4, iIndexOf2, trimmedLength, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i29 = RemoteActionCompatParcelizer + 9;
            onTransact = i29 % 128;
            int i30 = i29 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cCombineMeasuredStates = (char) (29944 - View.combineMeasuredStates(0, 0));
                int size = 1755 - View.MeasureSpec.getSize(0);
                int mode = 23 - View.MeasureSpec.getMode(0);
                byte[] bArr7 = $$j;
                Object[] objArr21 = new Object[1];
                m((short) 52, bArr7[7], bArr7[132], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cCombineMeasuredStates, size, mode, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrB$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i31 = ((2014994758 + (((-5488689) | iIdentityHashCode2) * (-381))) + (((~((~iIdentityHashCode2) | 170667397)) | (-139709746)) * 381)) - 2114467556;
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i33 ^ (i33 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            n(new char[]{64886, 12865, 40385, 17210, 33487, 29927, 296, 21291, 25367, 44938, 19299, 15062, 10697, 23989, 54662, 36266}, new char[]{49450, 30443, 936, 12687}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 59770), new char[]{50004, 19962, 34054, 3561}, KeyEvent.normalizeMetaState(0), objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            n(new char[]{55146, 14857, 16209, 23929, 38335, 10578, 1750, 21535, 12267, 21542, 21717, 691, 9393, 19746, 9748, 6263}, new char[]{49450, 30443, 936, 12687}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellResolutionTitle).substring(0, 10).length() + 19404), new char[]{21162, 51886, 55019, 22603}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 46, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-753496977};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 42049), ExpandableListView.getPackedPositionType(0L) + 1726, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$5f1425da = PMIRegistrationDataStore$$ExternalSyntheticLambda7.b$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 89309612);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char bitsPerPixel = (char) (29943 - ImageFormat.getBitsPerPixel(0));
                int gidForName = 1754 - Process.getGidForName("");
                int deadChar = KeyEvent.getDeadChar(0, 0) + 23;
                byte[] bArr8 = $$j;
                Object[] objArr26 = new Object[1];
                m((short) 52, bArr8[7], bArr8[132], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(bitsPerPixel, gidForName, deadChar, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                n(new char[]{8192, 22969, 9437, 35109, 55142, 19746, 2409, 27600, 48662, 5634, 64754, 33841, 61524, 34093, 51029, 58692, 10077, 44081, 27458, 17813, 11309, 21432}, new char[]{49450, 30443, 936, 12687}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 98), new char[]{15403, 45463, 22137, 57339}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                n(new char[]{58501, 16298, 36871, 30957, 54487, 39891, 55152, 15588, 5684, 31882, 57895, 8697, 36068, 54539, 44809}, new char[]{49450, 30443, 936, 12687}, (char) (ExpandableListView.getPackedPositionType(0L) + 30657), new char[]{15561, 4260, 49421, 28023}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 219194319, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cGreen = (char) (Color.green(0) + 29944);
                    int i34 = 1756 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int i35 = 23 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte[] bArr9 = $$j;
                    Object[] objArr29 = new Object[1];
                    m((short) 141, bArr9[7], bArr9[132], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cGreen, i34, i35, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0'));
                    int size2 = View.MeasureSpec.getSize(0) + 1755;
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 23;
                    byte[] bArr10 = $$j;
                    Object[] objArr30 = new Object[1];
                    m((short) 104, (byte) (bArr10[33] - 1), bArr10[132], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cLastIndexOf, size2, iResolveOpacity, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i36 = ((int[]) objArrB$5f1425da[1])[0];
        int i37 = ((int[]) objArrB$5f1425da[0])[0];
        if (i37 == i36) {
            int i38 = onTransact + 71;
            RemoteActionCompatParcelizer = i38 % 128;
            int i39 = i38 % 2;
            int i40 = ((int[]) objArrB$5f1425da[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrB$5f1425da[0])[0]}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
            int iMyUid = Process.myUid();
            int i41 = i40 + ((((~(268351470 | iMyUid)) | 44737572) * 449) - 1076305376) + (((~((~iMyUid) | 268351470)) | 44737572) * 449);
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArr31[3])[0] = i43 ^ (i43 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrB$5f1425da[4];
        if (strArr5 != null) {
            for (String str : strArr5) {
                arrayList2.add(str);
            }
        }
        int[] iArr2 = new int[i37];
        int i44 = i37 - 1;
        iArr2[i44] = 1;
        Toast.makeText((Context) null, iArr2[((i37 * i44) % 2) - 1], 1).show();
        int i45 = ((int[]) objArrB$5f1425da[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrB$5f1425da[0])[0]}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i46 = ~iIdentityHashCode3;
        int i47 = i45 + 1541093546 + (((~((-9936717) | i46)) | 202665709) * 519) + (((~(i46 | (-8622337))) | (~(211288045 | iIdentityHashCode3))) * (-519)) + (((~(iIdentityHashCode3 | 202665709)) | 9936716) * 519);
        int i48 = (i47 << 13) ^ i47;
        int i49 = i48 ^ (i48 >>> 17);
        ((int[]) objArr32[3])[0] = i49 ^ (i49 << 5);
        int i50 = onTransact + 113;
        RemoteActionCompatParcelizer = i50 % 128;
        if (i50 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ~(new Random().nextInt() | (-836448374));
        if (i4 != (((-838579712) | i5) * (-196)) + 1894371200 + ((i5 | 2131338) * 196)) {
            throw null;
        }
        int i6 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        int i8 = ~i7;
        int i9 = 959243660 + (((~(1788519340 | i8)) | 84148240) * (-1188));
        int i10 = (~(i7 | (-1788519341))) | 84148240;
        int i11 = ~(790536624 | i8);
        if (i6 != i9 + ((i10 | i11) * 594) + (((~((-1788519341) | i8)) | 1082130956 | i11) * 594)) {
            throw null;
        }
        super.onResume();
        int i12 = RemoteActionCompatParcelizer + 9;
        onTransact = i12 % 128;
        if (i12 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b0, code lost:
    
        if (r1 != (((942615536 + (((~((-388641696) | r3)) | (~(2104553026 | r3))) * (-867))) + ((((~((-388641696) | r2)) | 34214301) | (~(2104553026 | r2))) * (-1734))) + (((~(r2 | 2138767327)) | ((~(r3 | (-34214302))) | (~((-354427395) | r2)))) * 867))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b2, code lost:
    
        super.onStart();
        r1 = com.midtrans.sdk.uikit.views.bri_epay.BriEpayPaymentActivity.onTransact + 109;
        com.midtrans.sdk.uikit.views.bri_epay.BriEpayPaymentActivity.RemoteActionCompatParcelizer = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00be, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c6, code lost:
    
        throw new java.lang.RuntimeException("1756936631");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c7, code lost:
    
        r1 = 1951410880 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d0, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0039, code lost:
    
        if (r1 == ((799780988 + (((~(1238390104 | r4)) | (-408402562)) * (-964))) + (((~((~r4) | 1238390104)) | (-1507327962)) * (-964)))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006b, code lost:
    
        if (r1 == (((-990184061) + ((((~(r5 | (-1166115089))) | 1098973440) | (~((-268985898) | r4))) * 717)) + (((~(r4 | (-1166115089))) | ((~(r5 | (-268985898))) | 1098973440)) * 717))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006d, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r11);
        r3 = ~r2;
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.bri_epay.BriEpayPaymentActivity.onStart():void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = RemoteActionCompatParcelizer + 67;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static String $$u(short s, int i, int i2) {
        int i3 = 3 - (s * 3);
        int i4 = i * 3;
        byte[] bArr = $$m;
        int i5 = i2 + 102;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i5 = (-i5) + i6;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i5;
            i3++;
            if (i8 == i6) {
                return new String(bArr2, 0);
            }
            i5 = (-bArr[i3]) + i5;
            i7 = i8;
        }
    }
}
