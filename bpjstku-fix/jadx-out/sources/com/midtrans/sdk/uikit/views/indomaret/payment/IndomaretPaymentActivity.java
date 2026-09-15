package com.midtrans.sdk.uikit.views.indomaret.payment;

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
import com.bpjstku.R;
import com.google.android.libraries.places.internal.zzpu;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.views.indomaret.status.IndomaretStatusActivity;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.calculateCameraUseCases;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.createExtraPreview;
import defpackage.filterOutChildSizesCausingDoubleCropping;
import defpackage.getDualSharingNode;
import defpackage.handleMessage;
import defpackage.initSession;
import defpackage.onConnectionFailed;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class IndomaretPaymentActivity extends BasePaymentActivity implements filterOutChildSizesCausingDoubleCropping {
    private getDualSharingNode cancelAll;
    private FancyButton d;
    private static final byte[] $$m = {17, 104, 102, -28};
    private static final int $$n = 26;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {55, -64, 35, -71, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$k = 115;
    private static int INotificationSideChannel = 0;
    private static int onTransact = 1;
    private static int notify = -83722479;
    private final String asInterface = "Indomaret Overview";
    private final String g = "Confirm Payment Indomaret";

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(IndomaretPaymentActivity indomaretPaymentActivity, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        indomaretPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
        int i4 = onTransact + 91;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ getDualSharingNode TuitionPaymentFragmentspecialinlinedviewModeldefault1(IndomaretPaymentActivity indomaretPaymentActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        getDualSharingNode getdualsharingnode = indomaretPaymentActivity.cancelAll;
        if (i3 == 0) {
            return getdualsharingnode;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void n(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = 53 - r8
            byte[] r0 = com.midtrans.sdk.uikit.views.indomaret.payment.IndomaretPaymentActivity.$$j
            int r9 = r9 * 14
            int r9 = 98 - r9
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r4 = r2
            r9 = r7
            goto L28
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L28:
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.indomaret.payment.IndomaretPaymentActivity.n(short, int, short, java.lang.Object[]):void");
    }

    private static void m(char[] cArr, boolean z, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i2 + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(notify)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.combineMeasuredStates(0, 0), 3291 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 31, 1199271174, false, $$u(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Drawable.resolveOpacity(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 651, 44 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -450685997, false, $$u(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            int i6 = $10 + 103;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            int i8 = $10 + 75;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 651 - (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.green(0) + 44, -450685997, false, $$u(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        setPrimaryBackgroundColor(this.d);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            this.d = (FancyButton) findViewById(R.id.button_primary);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.d = (FancyButton) findViewById(R.id.button_primary);
        int i3 = onTransact + 39;
        INotificationSideChannel = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = INotificationSideChannel + 39;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            super.onActivityResult(i, i2, intent);
            if (i == 18273) {
                TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                Intent intent2 = new Intent();
                intent2.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                setResult(-1, intent2);
                finish();
            }
        } else {
            super.onActivityResult(i, i2, intent);
            if (i == 210) {
                TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault4 = this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                Intent intent3 = new Intent();
                intent3.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                setResult(-1, intent3);
                finish();
            }
        }
        int i5 = onTransact + 33;
        INotificationSideChannel = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 79;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        getDualSharingNode getdualsharingnode = this.cancelAll;
        if (getdualsharingnode != null) {
            int i5 = i2 + 19;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            getdualsharingnode.TuitionPaymentFragmentbindingInflater1("Back", "Indomaret Overview");
        }
        super.onBackPressed();
        int i7 = onTransact + 89;
        INotificationSideChannel = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            int i4 = INotificationSideChannel + 75;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
        }
        int i6 = onTransact + 37;
        INotificationSideChannel = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        int i4 = INotificationSideChannel + 61;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1356982049
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle r36) {
        /*
            Method dump skipped, instruction units count: 1546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.indomaret.payment.IndomaretPaymentActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void b(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            Intent intent = new Intent(this, (Class<?>) IndomaretStatusActivity.class);
            intent.putExtra("extra.status", transactionResponse);
            startActivityForResult(intent, 210);
            int i2 = INotificationSideChannel + 37;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Intent intent2 = new Intent();
        intent2.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        setResult(-1, intent2);
        finish();
        int i4 = onTransact + 71;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (29944 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
            int gidForName = 22 - Process.getGidForName("");
            byte[] bArr = $$j;
            Object[] objArr2 = new Object[1];
            n((short) 52, (byte) (bArr[33] - 1), bArr[80], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, scrollDefaultDelay, gidForName, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29944);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1756;
                int i2 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23;
                byte[] bArr2 = $$j;
                Object[] objArr3 = new Object[1];
                n((short) 89, bArr2[7], bArr2[80], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, packedPositionChild, i2, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = (((1320524901 + ((~((~iIdentityHashCode) | (-135529031))) * (-116))) + ((936107192 | iIdentityHashCode) * 116)) + (((~(iIdentityHashCode | 723504766)) | 348131456) * 116)) - 233478149;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            m(new char[]{18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17}, false, 16 - ExpandableListView.getPackedPositionType(0L), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 177, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.saved_card).substring(7, 9).length() + 1, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            m(new char[]{65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506}, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (ViewConfiguration.getPressedStateDuration() >> 16) + 217, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.telkomsel_instruction_step2).substring(3, 4).codePointAt(0) - 110, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {1280583963};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 42049), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1726, 29 - TextUtils.getOffsetAfter("", 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = zzpu.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -233478149, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 29944);
                    int iIndexOf = 1755 - TextUtils.indexOf("", "", 0, 0);
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 23;
                    byte[] bArr3 = $$j;
                    Object[] objArr8 = new Object[1];
                    n((short) 89, bArr3[7], bArr3[80], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(absoluteGravity, iIndexOf, iResolveSizeAndState, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    m(new char[]{16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17}, true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, 214 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), MotionEvent.axisFromString("") + 15, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    m(new char[]{65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515}, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 101, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_wearing_scarf_text).substring(0, 4).length() + 214, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 104, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 29945);
                        int tapTimeout = 1755 - (ViewConfiguration.getTapTimeout() >> 16);
                        int iResolveSizeAndState2 = 23 - View.resolveSizeAndState(0, 0, 0);
                        byte[] bArr4 = $$j;
                        Object[] objArr11 = new Object[1];
                        n((short) 141, bArr4[7], bArr4[80], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, tapTimeout, iResolveSizeAndState2, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char mode = (char) (View.MeasureSpec.getMode(0) + 29944);
                        int mode2 = 1755 - View.MeasureSpec.getMode(0);
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 23;
                        byte[] bArr5 = $$j;
                        Object[] objArr12 = new Object[1];
                        n((short) 52, (byte) (bArr5[33] - 1), bArr5[80], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode, mode2, iNormalizeMetaState, 986134021, false, (String) objArr12[0], null);
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
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr != null) {
                int i6 = onTransact + 29;
                INotificationSideChannel = i6 % 128;
                int i7 = i6 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw null;
        }
        int i8 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i9 = i8 + (-423213295) + (((~(702670531 | iIdentityHashCode2)) | 369889340) * 104) + ((~((~iIdentityHashCode2) | (-157286915))) * (-104)) + ((iIdentityHashCode2 | 915272957) * 104);
        int i10 = (i9 << 13) ^ i9;
        int i11 = i10 ^ (i10 >>> 17);
        ((int[]) objArr13[3])[0] = i11 ^ (i11 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
            int iIndexOf2 = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0);
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15;
            byte[] bArr6 = $$j;
            short s = bArr6[7];
            Object[] objArr14 = new Object[1];
            n(s, (byte) s, bArr6[80], objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(bitsPerPixel, iIndexOf2, keyRepeatDelay, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        m(new char[]{16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17}, true, Color.green(0) + 22, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_no_face).substring(13, 14).codePointAt(0) + 113, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 22, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        m(new char[]{65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515}, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 97, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_error_dialog_screen_primary_cta_text).substring(8, 13).codePointAt(4) + 117, 7 - KeyEvent.getDeadChar(0, 0), objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
            int i12 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1031;
            int i13 = 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            byte[] bArr7 = $$j;
            Object[] objArr17 = new Object[1];
            n((short) 89, bArr7[7], bArr7[80], objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(bitsPerPixel2, i12, i13, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cArgb = (char) Color.argb(0, 0, 0, 0);
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1031;
                int defaultSize = View.getDefaultSize(0, 0) + 15;
                Object[] objArr18 = new Object[1];
                n((short) 193, (byte) 52, $$j[7], objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cArgb, maximumFlingVelocity, defaultSize, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i14 = ((int[]) objArr19[3])[0];
            int i15 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iMyUid = Process.myUid();
            int i16 = ~iMyUid;
            int i17 = ((1283628694 + ((((~(i16 | (-124368502))) | 33592864) | (~((-277873035) | iMyUid))) * 717)) + (((~(iMyUid | (-124368502))) | ((~(i16 | (-277873035))) | 33592864)) * 717)) - 1755416723;
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr[2])[0] = i19 ^ (i19 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            m(new char[]{18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17}, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, AndroidCharacter.getMirror('0') + 165, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.offer_not_applied).substring(8, 9).codePointAt(0) - 97, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            m(new char[]{65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506}, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 101, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.timeout_message).substring(3, 4).codePointAt(0) + 102, 7 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {1280583963};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46039 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 1134 - Drawable.resolveOpacity(0, 0), 18 - Color.alpha(0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -1755416723, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int modifierMetaStateMask = 1030 - ((byte) KeyEvent.getModifierMetaStateMask());
                int touchSlop = 15 - (ViewConfiguration.getTouchSlop() >> 8);
                byte[] bArr8 = $$j;
                short s2 = bArr8[7];
                Object[] objArr24 = new Object[1];
                n(s2, (byte) s2, bArr8[80], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(longPressTimeout, modifierMetaStateMask, touchSlop, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 45993), (ViewConfiguration.getScrollBarSize() >> 8) + 1117, TextUtils.indexOf("", "", 0) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 1031;
                int iArgb = Color.argb(0, 0, 0, 0) + 15;
                Object[] objArr25 = new Object[1];
                n((short) 193, (byte) 52, $$j[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c2, tapTimeout2, iArgb, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                m(new char[]{16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17}, true, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_sample_valid_date).substring(0, 6).codePointAt(1) + 117, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_atm_transfer_step4).substring(4, 6).length() + 12, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                m(new char[]{65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515}, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_list_header_atm_bersama).substring(0, 4).length() + 11, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 111, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 29, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c3 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int i20 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1030;
                    int maximumDrawingCacheSize = 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    byte[] bArr9 = $$j;
                    Object[] objArr28 = new Object[1];
                    n((short) 89, bArr9[7], bArr9[80], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c3, i20, maximumDrawingCacheSize, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c4 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                    int i21 = 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 16;
                    byte[] bArr10 = $$j;
                    short s3 = bArr10[7];
                    Object[] objArr29 = new Object[1];
                    n(s3, (byte) s3, bArr10[80], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c4, i21, iLastIndexOf, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i22 = ((int[]) objArr[1])[0];
        int i23 = ((int[]) objArr[3])[0];
        if (i23 == i22) {
            int i24 = INotificationSideChannel + 79;
            onTransact = i24 % 128;
            int i25 = i24 % 2;
            Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[3])[0];
            int i28 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iNextInt = new Random().nextInt(1474544786);
            int i29 = ~iNextInt;
            int i30 = i26 + 356203581 + (((~(300403750 | i29)) | (-544683921) | (~((-300403751) | iNextInt))) * (-564)) + ((~(iNextInt | (-6751233))) * 1128) + (((~((-544683921) | i29)) | 293652518) * 564);
            int i31 = i30 ^ (i30 << 13);
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr30[2])[0] = i32 ^ (i32 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i33 = onTransact + 83;
            INotificationSideChannel = i33 % 128;
            int i34 = i33 % 2;
            for (String str2 : strArr4) {
                arrayList2.add(str2);
            }
        }
        Toast.makeText((Context) null, i23 / (((i23 - 1) * i23) % 2), 0).show();
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i35 = ((int[]) objArr[2])[0];
        int i36 = ((int[]) objArr[3])[0];
        int i37 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i38 = ~((~System.identityHashCode(this)) | 181788277);
        int i39 = i35 + (((138695169 | i38) * (-970)) - 1511001173) + ((i38 | 43093108) * 970);
        int i40 = (i39 << 13) ^ i39;
        int i41 = i40 ^ (i40 >>> 17);
        ((int[]) objArr31[2])[0] = i41 ^ (i41 << 5);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i5 = ~((-8947722) | iMaxMemory);
        int i6 = ~iMaxMemory;
        if (i4 != (-490988551) + ((i5 | (~(i6 | 920514303))) * 497) + (((~(iMaxMemory | 920514303)) | (~((-81579040) | i6)) | 72631318) * 497)) {
            int i7 = INotificationSideChannel + 27;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            int[] iArr = new int[846619958];
            iArr[846619957] = 1;
            int i9 = 1532314158 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i10 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i11 = ~iFreeMemory;
        if (i10 != (((~(i11 | (-1832794385))) | (~((-116883054) | i11)) | 70662144) * (-397)) + 1223818178 + ((iFreeMemory | (-1808353150)) * 397)) {
            throw null;
        }
        super.onResume();
        int i12 = onTransact + 67;
        INotificationSideChannel = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            if (i3 != 194757452 + (((~(1598419475 | i4)) | (-2144204608)) * 98) + (((~(i4 | (-768431933))) | 1598419475 | (~(768431932 | iIdentityHashCode))) * (-49)) + (((~(iIdentityHashCode | 1598419475)) | 1375772675) * 49)) {
                throw null;
            }
        } else {
            int i5 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 281322406;
            int i7 = ~i6;
            if (i5 != (-539458793) + (((~((-393794886) | i7)) | (-1223782429)) * (-602)) + (((~(i6 | (-393794886))) | 386434369 | (~((-1216421913) | i7))) * (-301)) + ((~(i7 | (-1223782429))) * 301)) {
                throw null;
            }
        }
        int i8 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        int i10 = 110604700 + (((~((-68192382) | i9)) | 67143773 | (~(1784103712 | i9))) * (-880));
        int i11 = (~((-68192382) | (~i9))) | (-1784103713);
        int i12 = ~(i9 | 68192381);
        if (i8 != i10 + ((i11 | i12) * (-880)) + (i12 * 880)) {
            throw null;
        }
        super.onStart();
        int i13 = onTransact + 37;
        INotificationSideChannel = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$u(short r6, short r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r8 = r8 + 119
            byte[] r0 = com.midtrans.sdk.uikit.views.indomaret.payment.IndomaretPaymentActivity.$$m
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r8 = r7
            r4 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r6]
        L25:
            int r6 = r6 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.indomaret.payment.IndomaretPaymentActivity.$$u(short, short, byte):java.lang.String");
    }
}
