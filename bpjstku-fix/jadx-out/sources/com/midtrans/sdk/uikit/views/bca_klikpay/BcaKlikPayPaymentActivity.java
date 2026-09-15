package com.midtrans.sdk.uikit.views.bca_klikpay;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.R;
import com.google.android.gms.tasks.zzu;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.calculateCameraUseCases;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.createExtraPreview;
import defpackage.deInitSession;
import defpackage.filterOutChildSizesCausingDoubleCropping;
import defpackage.handleMessage;
import defpackage.initSession;
import defpackage.onConnectionFailed;
import defpackage.shouldIncludeHighResolutions;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class BcaKlikPayPaymentActivity extends BasePaymentActivity implements filterOutChildSizesCausingDoubleCropping {
    private shouldIncludeHighResolutions INotificationSideChannel;
    private FancyButton asInterface;
    private static final byte[] $$m = {77, -106, 83, 4};
    private static final int $$n = 116;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {36, -74, -79, -21, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$k = 96;
    private static int onTransact = 0;
    private static int cancel = 1;
    private static char[] cancelAll = {60063, 60041, 60049, 60053, 60047, 60073, 60045, 60062, 60043, 60050, 60056, 60083, 60048, 60060, 60055, 60117, 60058, 60052, 60034, 60054, 60088, 60040, 60051, 59745, 60072};
    private static char notify = 57188;
    private final String g = "BCA KlikPay";
    private final String d = "Confirm Payment BCA KlikPay";

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(BcaKlikPayPaymentActivity bcaKlikPayPaymentActivity) {
        int i = 2 % 2;
        int i2 = cancel + 89;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        bcaKlikPayPaymentActivity.asBinder();
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
    }

    public static /* synthetic */ shouldIncludeHighResolutions TuitionPaymentFragmentspecialinlinedviewModeldefault3(BcaKlikPayPaymentActivity bcaKlikPayPaymentActivity) {
        int i = 2 % 2;
        int i2 = cancel;
        int i3 = i2 + 71;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        shouldIncludeHighResolutions shouldincludehighresolutions = bcaKlikPayPaymentActivity.INotificationSideChannel;
        int i5 = i2 + 41;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return shouldincludehighresolutions;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.views.bca_klikpay.BcaKlikPayPaymentActivity.$$j
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r6 = 145 - r6
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L20:
            int r3 = r3 + 1
            r4 = r0[r6]
        L24:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.bca_klikpay.BcaKlikPayPaymentActivity.m(short, short, int, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = cancel + 47;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            setPrimaryBackgroundColor(this.asInterface);
            int i3 = 84 / 0;
        } else {
            setPrimaryBackgroundColor(this.asInterface);
        }
        int i4 = onTransact + 1;
        cancel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            this.asInterface = (FancyButton) findViewById(R.id.button_primary);
            int i3 = 38 / 0;
        } else {
            this.asInterface = (FancyButton) findViewById(R.id.button_primary);
        }
        int i4 = cancel + 107;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        if (i != 210) {
            int i4 = cancel + 107;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            if (i != 111) {
                return;
            }
        }
        TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Intent intent2 = new Intent();
        intent2.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        setResult(-1, intent2);
        finish();
        int i6 = onTransact + 109;
        cancel = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        int i3 = i2 % 128;
        cancel = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        shouldIncludeHighResolutions shouldincludehighresolutions = this.INotificationSideChannel;
        if (shouldincludehighresolutions != null) {
            int i4 = i3 + 33;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                shouldincludehighresolutions.TuitionPaymentFragmentbindingInflater1("Back", "BCA KlikPay");
                obj.hashCode();
                throw null;
            }
            shouldincludehighresolutions.TuitionPaymentFragmentbindingInflater1("Back", "BCA KlikPay");
        }
        super.onBackPressed();
        int i5 = cancel + 61;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            b();
            boolean z = this.TuitionPaymentFragmentbindingInflater1;
            throw null;
        }
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
        }
        int i3 = onTransact + 65;
        cancel = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            b();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        } else {
            b();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            int i3 = 49 / 0;
        }
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void b(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = cancel + 73;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            b();
            b(transactionResponse, "bca_klikpay");
            obj.hashCode();
            throw null;
        }
        b();
        b(transactionResponse, "bca_klikpay");
        int i3 = onTransact + 91;
        cancel = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d7, code lost:
    
        if (r1 == ((((-1193462180) + (((~(2044282794 | r5)) | 33720325) * 576)) + (((~((~r5) | 2078003119)) | 294651138) * 576)) - 2051929280)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d9, code lost:
    
        r1 = com.midtrans.sdk.uikit.views.bca_klikpay.BcaKlikPayPaymentActivity.onTransact + 59;
        com.midtrans.sdk.uikit.views.bca_klikpay.BcaKlikPayPaymentActivity.cancel = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e9, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00eb, code lost:
    
        r1 = new int[2048115852];
        r1[2048115851(0x7a13c48b, float:1.918135E35)] = 0;
        android.widget.Toast.makeText((android.content.Context) null, r1[-1], 1).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f9, code lost:
    
        r1 = new int[2048115852];
        r1[2048115851(0x7a13c48b, float:1.918135E35)] = 1;
        r2 = (-1181030396) % 2;
        android.widget.Toast.makeText((android.content.Context) null, r1[-1], 1).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x010a, code lost:
    
        super.onCreate(r12);
        setContentView(com.bpjstku.R.layout.activity_bca_klikpay);
        r11.INotificationSideChannel = new defpackage.shouldIncludeHighResolutions(r11);
        r11.asInterface.setOnClickListener(new com.midtrans.sdk.uikit.views.bca_klikpay.BcaKlikPayPaymentActivity.AnonymousClass1(r11));
        b(getString(com.bpjstku.R.string.bca_klik));
        r11.asInterface.setText(getString(com.bpjstku.R.string.confirm_payment));
        r11.asInterface.setTextBold();
        r11.INotificationSideChannel.b("BCA KlikPay", getIntent().getBooleanExtra("First Page", true));
        r12 = com.midtrans.sdk.uikit.views.bca_klikpay.BcaKlikPayPaymentActivity.onTransact + 91;
        com.midtrans.sdk.uikit.views.bca_klikpay.BcaKlikPayPaymentActivity.cancel = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0159, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0161, code lost:
    
        throw new java.lang.RuntimeException("578257403");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0047, code lost:
    
        if (r1 == (((1563865192 + (((~(r5 | 1976303099)) | (~((-71458851) | r5))) * (-184))) + (((537428353 | (~((-608887204) | r5))) | (~(1438874746 | r5))) * 184)) + 1798545416)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008a, code lost:
    
        if (r1 == (((1164186536 + ((r6 | (~((-1653750484) | r7))) * (-1808))) + (((~((-285836589) | r5)) | (~(r7 | (-1115824132)))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN)) + ((((~(r5 | 1653750483)) | 537926352) | (~(823762940 | r7))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008c, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r6 = (java.lang.Object[]) null;
        r5 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r12) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.bca_klikpay.BcaKlikPayPaymentActivity.onCreate(android.os.Bundle):void");
    }

    private static void n(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = cancelAll;
        char c = '0';
        long j = 0;
        if (cArr2 != null) {
            int i5 = $11 + 99;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 39;
                $11 = i8 % 128;
                if (i8 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                            int i9 = (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 2267;
                            int iIndexOf = 32 - TextUtils.indexOf("", c);
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(absoluteGravity, i9, iIndexOf, -1927765101, false, $$u(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i7 /= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 2268 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 32, -1927765101, false, $$u(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i7++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = 2;
                c = '0';
                j = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(notify)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            byte b6 = (byte) 0;
            byte b7 = (byte) (b6 - 1);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.alpha(0), 2267 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33, -1927765101, false, $$u(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            int i10 = $10 + 123;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                } else {
                    Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 1;
                        byte b9 = (byte) (-b8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (49267 - Color.red(0)), 3261 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.getOffsetBefore("", 0) + 30, -127612708, false, $$u(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                        Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char mirror = (char) (AndroidCharacter.getMirror('0') + 22830);
                            int longPressTimeout = 594 - (ViewConfiguration.getLongPressTimeout() >> 16);
                            int i12 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16;
                            byte b10 = (byte) ($$m[3] - 1);
                            byte b11 = (byte) (b10 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mirror, longPressTimeout, i12, 1570859318, false, $$u(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                        int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                    } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                        int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                        int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                    } else {
                        int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                        int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int i2 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1030;
            int deadChar = KeyEvent.getDeadChar(0, 0) + 15;
            Object[] objArr2 = new Object[1];
            m((byte) 52, (short) 141, $$j[132], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i2, deadChar, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        n(23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{18, 1, 1, 2, 19, 7, 5, 20, 16, 22, 19, 20, 16, 23, 2, '\t', 15, 24, '\f', 19, 11, '\r'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step5).substring(3, 4).length() + 112), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.minutes).substring(0, 1).length() + 14, new char[]{'\t', '\f', 18, 6, 22, 6, 5, '\n', 6, 17, 19, '\t', 14, 24, 13864}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 30), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1031;
            int gidForName = Process.getGidForName("") + 16;
            Object[] objArr5 = new Object[1];
            m((byte) 52, (short) 89, $$j[132], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, iMakeMeasureSpec, gidForName, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = onTransact + 45;
            cancel = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                int tapTimeout = 1031 - (ViewConfiguration.getTapTimeout() >> 16);
                int gidForName2 = Process.getGidForName("") + 16;
                byte b = $$j[7];
                byte b2 = b;
                Object[] objArr6 = new Object[1];
                m(b2, (short) (b2 | 37), b, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar2, tapTimeout, gidForName2, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = (((1172307169 + (((~(iIdentityHashCode | 506592805)) | 262312635) * (-668))) + ((506592805 | (~(262312635 | iIdentityHashCode))) * 1336)) + ((iIdentityHashCode | 531889855) * 668)) - 917949669;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, new char[]{1, 17, 11, 21, 19, '\n', 18, 1, '\n', 18, 23, 19, 24, 1, '\t', 17}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto5_bni).substring(12, 13).length() + 30), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_wearing_scarf_text).substring(0, 4).codePointAt(2) - 81, new char[]{5, 4, '\b', 2, '\t', 14, 3, 19, 16, 21, 22, 23, 22, 15, 2, 5}, (byte) (17 - KeyEvent.keyCodeFromString("")), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-2089439367};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.red(0) + 46038), (ViewConfiguration.getScrollBarSize() >> 8) + 1134, 18 - TextUtils.getTrimmedLength(""), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -917949669, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1031;
                    int packedPositionGroup = 15 - ExpandableListView.getPackedPositionGroup(0L);
                    Object[] objArr12 = new Object[1];
                    m((byte) 52, (short) 141, $$j[132], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout, pressedStateDuration, packedPositionGroup, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getEdgeSlop() >> 16)), TextUtils.getTrimmedLength("") + 1117, 17 - Color.red(0)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0');
                    int iIndexOf2 = 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    byte b3 = $$j[7];
                    byte b4 = b3;
                    Object[] objArr13 = new Object[1];
                    m(b4, (short) (b4 | 37), b3, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarFadeDuration, iIndexOf, iIndexOf2, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    n(TextUtils.getTrimmedLength("") + 22, new char[]{18, 1, 1, 2, 19, 7, 5, 20, 16, 22, 19, 20, 16, 23, 2, '\t', 15, 24, '\f', 19, 11, '\r'}, (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 112), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    n(TextUtils.getOffsetBefore("", 0) + 15, new char[]{'\t', '\f', 18, 6, 22, 6, 5, '\n', 6, 17, 19, '\t', 14, 24, 13864}, (byte) (41 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                        int iIndexOf3 = 1030 - TextUtils.indexOf((CharSequence) "", '0');
                        int i10 = 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        Object[] objArr16 = new Object[1];
                        m((byte) 52, (short) 89, $$j[132], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, iIndexOf3, i10, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1031;
                        int gidForName3 = 14 - Process.getGidForName("");
                        Object[] objArr17 = new Object[1];
                        m((byte) 52, (short) 141, $$j[132], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cLastIndexOf2, edgeSlop, gidForName3, 1357589585, false, (String) objArr17[0], null);
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
        int i11 = ((int[]) objArr[1])[0];
        int i12 = ((int[]) objArr[3])[0];
        if (i12 == i11) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i13 = ((int[]) objArr[2])[0];
            int i14 = ((int[]) objArr[3])[0];
            int i15 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i16 = ~iUptimeMillis;
            int i17 = i13 + (-1889530328) + (((~((-735384385) | i16)) | (~(491104214 | iUptimeMillis))) * 217) + (((~(iUptimeMillis | (-735384385))) | 579866624) * 217) + (((~(491104214 | i16)) | 735384384) * 217);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr18[2])[0] = i19 ^ (i19 << 5);
            int i20 = onTransact + 37;
            cancel = i20 % 128;
            int i21 = i20 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i22 = onTransact + 19;
                cancel = i22 % 128;
                int i23 = 2;
                int i24 = i22 % 2 == 0 ? 1 : 0;
                while (i24 < strArr3.length) {
                    int i25 = onTransact + 1;
                    cancel = i25 % 128;
                    if (i25 % i23 == 0) {
                        arrayList.add(strArr3[i24]);
                        i24 += 84;
                    } else {
                        arrayList.add(strArr3[i24]);
                        i24++;
                    }
                    i23 = 2;
                }
            }
            int[] iArr = new int[i12];
            int i26 = i12 - 1;
            iArr[i26] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i26) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr[2])[0];
            int i28 = ((int[]) objArr[3])[0];
            int i29 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iNextInt = new Random().nextInt();
            int i30 = ~iNextInt;
            int i31 = i27 + ((((~(318803232 | i30)) | (~(iNextInt | 563083402))) * 959) - 134993219) + (((~(iNextInt | 318803232)) | (~(i30 | 563083402))) * 959);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr19[2])[0] = i33 ^ (i33 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cIndexOf2 = (char) (TextUtils.indexOf("", "", 0, 0) + 29944);
            int i34 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1754;
            int i35 = 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte[] bArr = $$j;
            byte b5 = (byte) (bArr[0] + 1);
            Object[] objArr20 = new Object[1];
            m(b5, b5, bArr[132], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf2, i34, i35, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i36 = onTransact + 21;
            cancel = i36 % 128;
            int i37 = i36 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char windowTouchSlop = (char) (29944 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                int iGreen = 1755 - Color.green(0);
                int tapTimeout2 = 23 - (ViewConfiguration.getTapTimeout() >> 16);
                Object[] objArr21 = new Object[1];
                m((byte) 52, (short) 89, $$j[132], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(windowTouchSlop, iGreen, tapTimeout2, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i38 = ~((-3149893) | iIdentityHashCode2);
            int i39 = ~iIdentityHashCode2;
            int i40 = (-2108100255) + ((i38 | (~((-206301601) | i39))) * 920) + (((~((-3150934) | i39)) | 3149892) * 920) + (((~(iIdentityHashCode2 | (-206301601))) | (~((-3149893) | i39)) | (~((-1042) | iIdentityHashCode2))) * 920) + 399486315;
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i42 ^ (i42 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, new char[]{1, 17, 11, 21, 19, '\n', 18, 1, '\n', 18, 23, 19, 24, 1, '\t', 17}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 81), objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            n(View.MeasureSpec.getMode(0) + 16, new char[]{5, 4, '\b', 2, '\t', 14, 3, 19, 16, 21, 22, 23, 22, 15, 2, 5}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 19), objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-2089439367};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 42049), TextUtils.lastIndexOf("", '0') + 1727, 29 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 399486315, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cNormalizeMetaState = (char) (29944 - KeyEvent.normalizeMetaState(0));
                int edgeSlop2 = 1755 - (ViewConfiguration.getEdgeSlop() >> 16);
                int edgeSlop3 = 23 - (ViewConfiguration.getEdgeSlop() >> 16);
                Object[] objArr26 = new Object[1];
                m((byte) 52, (short) 89, $$j[132], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cNormalizeMetaState, edgeSlop2, edgeSlop3, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr27 = new Object[1];
                n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.company_code).substring(1, 2).length() + 21, new char[]{18, 1, 1, 2, 19, 7, 5, 20, 16, 22, 19, 20, 16, 23, 2, '\t', 15, 24, '\f', 19, 11, '\r'}, (byte) (112 - TextUtils.indexOf((CharSequence) "", '0')), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.installment_required).substring(16, 18).length() + 13, new char[]{'\t', '\f', 18, 6, 22, 6, 5, '\n', 6, 17, 19, '\t', 14, 24, 13864}, (byte) (TextUtils.indexOf("", "", 0) + 41), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29944);
                    int edgeSlop4 = (ViewConfiguration.getEdgeSlop() >> 16) + 1755;
                    int iGreen2 = 23 - Color.green(0);
                    byte[] bArr2 = $$j;
                    Object[] objArr29 = new Object[1];
                    m((byte) 52, bArr2[7], bArr2[132], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cMakeMeasureSpec, edgeSlop4, iGreen2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char tapTimeout3 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 29944);
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                    int iIndexOf4 = 23 - TextUtils.indexOf("", "");
                    byte[] bArr3 = $$j;
                    byte b6 = (byte) (bArr3[0] + 1);
                    Object[] objArr30 = new Object[1];
                    m(b6, b6, bArr3[132], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(tapTimeout3, scrollDefaultDelay, iIndexOf4, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i43 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i44 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i44 == i43) {
            int i45 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int i46 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i47 = ~((-269487685) | i46);
            int i48 = ~i46;
            int i49 = i45 + (-2108100255) + ((i47 | (~(872312543 | i48))) * 920) + (((~((-815427286) | i48)) | 269487684) * 920) + (((~(i46 | 872312543)) | (~((-269487685) | i48)) | (~((-545939602) | i46))) * 920);
            int i50 = (i49 << 13) ^ i49;
            int i51 = i50 ^ (i50 >>> 17);
            ((int[]) objArr31[3])[0] = i51 ^ (i51 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
        if (strArr5 != null) {
            int i52 = 0;
            while (i52 < strArr5.length) {
                int i53 = cancel + 105;
                onTransact = i53 % 128;
                if (i53 % 2 != 0) {
                    arrayList2.add(strArr5[i52]);
                    i52 += 9;
                } else {
                    arrayList2.add(strArr5[i52]);
                    i52++;
                }
            }
        }
        int[] iArr2 = new int[i44];
        int i54 = i44 - 1;
        iArr2[i54] = 1;
        Toast.makeText((Context) null, iArr2[((i44 * i54) % 2) - 1], 1).show();
        int i55 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 1472730290;
        int i56 = i55 + (((~((~iCodePointAt) | 1056964062)) * 130) - 156968617) + (((~(iCodePointAt | 1056964062)) | 167775248) * 130);
        int i57 = (i56 << 13) ^ i56;
        int i58 = i57 ^ (i57 >>> 17);
        ((int[]) objArr32[3])[0] = i58 ^ (i58 << 5);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != ((((~((-320366148) | iIdentityHashCode)) | 1048578) * (-566)) - 236492396) + ((~(iIdentityHashCode | (-319317570))) * 566)) {
            throw new RuntimeException("320968413");
        }
        int i5 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_no_network_message).substring(0, 23).codePointAt(13) - 1102545786;
        if (i5 != (-879504513) + (((~((~iCodePointAt) | (-384397584))) | (-2100308915)) * (-235)) + (((~((-384397584) | iCodePointAt)) | (-2100308915)) * (-470)) + (((~(iCodePointAt | (-337649923))) | (-2147056576)) * 235)) {
            int i6 = onTransact + 35;
            cancel = i6 % 128;
            int i7 = i6 % 2;
            int[] iArr = new int[1477319636];
            iArr[1477319635] = 1;
            int i8 = 1982352316 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        super.onResume();
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = cancel + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != (((-22730376) + (((~((~iIdentityHashCode) | 1505907715)) | 537504044) * 446)) + (((~(iIdentityHashCode | 2043411759)) | 138416128) * 446)) - 791364952) {
            throw null;
        }
        int i5 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i6 = ~iIdentityHashCode2;
        if (i5 != 382196364 + (((~(2029512824 | i6)) | 549543140) * (-328)) + ((iIdentityHashCode2 | 549543140) * 164) + (((~(iIdentityHashCode2 | (-2029512825))) | 549537888 | (~(i6 | 2029518076))) * 164)) {
            int i7 = onTransact + 3;
            cancel = i7 % 128;
            int i8 = i7 % 2;
            int[] iArr = new int[1340094360];
            iArr[1340094359] = 1;
            int i9 = (-701336920) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i10 = onTransact + 83;
            cancel = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 3 % 5;
            }
        }
        super.onStart();
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = cancel + 83;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
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
    private static java.lang.String $$u(short r5, int r6, byte r7) {
        /*
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r1 = com.midtrans.sdk.uikit.views.bca_klikpay.BcaKlikPayPaymentActivity.$$m
            int r6 = r6 + 4
            int r5 = r5 + 113
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r5
            r5 = r7
            r4 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r5
            int r6 = r6 + 1
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            r3 = r1[r6]
        L25:
            int r5 = r5 + r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.bca_klikpay.BcaKlikPayPaymentActivity.$$u(short, int, byte):java.lang.String");
    }
}
