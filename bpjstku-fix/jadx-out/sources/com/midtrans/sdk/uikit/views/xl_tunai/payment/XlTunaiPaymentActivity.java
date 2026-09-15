package com.midtrans.sdk.uikit.views.xl_tunai.payment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.R;
import com.datadog.android.rum.internal.domain.scope.RumViewScope$onStopView$1;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.views.xl_tunai.status.XlTunaiStatusActivity;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import com.midtrans.sdk.uikit.widgets.SemiBoldTextView;
import defpackage.VirtualCameraAdapter;
import defpackage.filterOutChildSizesCausingDoubleCropping;
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
public class XlTunaiPaymentActivity extends BasePaymentActivity implements filterOutChildSizesCausingDoubleCropping {
    private SemiBoldTextView INotificationSideChannel;
    private VirtualCameraAdapter asInterface;
    private FancyButton d;
    private final String g = "XL Tunai Overview";
    private static final byte[] $$m = {115, 25, -47, -94};
    private static final int $$n = 220;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {27, 65, -33, 120, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$k = 162;
    private static int cancelAll = 0;
    private static int cancel = 1;
    private static int onTransact = -83722488;

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(XlTunaiPaymentActivity xlTunaiPaymentActivity, String str) {
        int i = 2 % 2;
        int i2 = cancel + 77;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        xlTunaiPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ VirtualCameraAdapter b(XlTunaiPaymentActivity xlTunaiPaymentActivity) {
        int i = 2 % 2;
        int i2 = cancel + 111;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        VirtualCameraAdapter virtualCameraAdapter = xlTunaiPaymentActivity.asInterface;
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        return virtualCameraAdapter;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = 145 - r6
            int r0 = r5 + 1
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r1 = com.midtrans.sdk.uikit.views.xl_tunai.payment.XlTunaiPaymentActivity.$$j
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L12
            r3 = r7
            r7 = r6
            goto L27
        L12:
            r4 = r7
            r7 = r6
            r6 = r4
        L15:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r0[r2] = r3
            if (r2 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L25:
            r3 = r1[r7]
        L27:
            int r6 = r6 + r3
            int r7 = r7 + 1
            int r6 = r6 + (-11)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.xl_tunai.payment.XlTunaiPaymentActivity.m(byte, short, short, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = cancel + 97;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            setPrimaryBackgroundColor(this.d);
            throw null;
        }
        setPrimaryBackgroundColor(this.d);
        int i3 = cancel + 105;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancelAll + 97;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            this.d = (FancyButton) findViewById(R.id.button_primary);
            this.INotificationSideChannel = (SemiBoldTextView) findViewById(R.id.text_page_title);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.d = (FancyButton) findViewById(R.id.button_primary);
        this.INotificationSideChannel = (SemiBoldTextView) findViewById(R.id.text_page_title);
        int i3 = cancel + 47;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = cancel + 91;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
        super.onActivityResult(i, i2, intent);
        if (i == 210) {
            TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Intent intent2 = new Intent();
            intent2.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            setResult(-1, intent2);
            finish();
        }
        int i6 = cancel + 19;
        cancelAll = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 54 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = cancel + 93;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        VirtualCameraAdapter virtualCameraAdapter = this.asInterface;
        if (virtualCameraAdapter != null) {
            virtualCameraAdapter.TuitionPaymentFragmentbindingInflater1("Back", "XL Tunai Overview");
            int i3 = cancel + 37;
            cancelAll = i3 % 128;
            int i4 = i3 % 2;
        }
        super.onBackPressed();
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        int i = 2 % 2;
        int i2 = cancel + 9;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            b();
            boolean z = this.TuitionPaymentFragmentbindingInflater1;
            throw null;
        }
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            int i3 = cancel + 115;
            cancelAll = i3 % 128;
            if (i3 % 2 != 0) {
                onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
                throw null;
            }
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
        }
        int i4 = cancelAll + 9;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = cancelAll + 121;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            b();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        } else {
            b();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00f6, code lost:
    
        if (r1 != (((767966968 + ((2142712796 | r3) * (-369))) + (((~((-531764105) | r3)) | 2047291860) * (-369))) + ((((~(r2 | 531764104)) | 1610948692) | (~(r3 | (-95420937)))) * 369))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f8, code lost:
    
        super.onCreate(r11);
        setContentView(com.bpjstku.R.layout.activity_xl_tunai_payment);
        r10.asInterface = new defpackage.VirtualCameraAdapter(r10);
        r10.d.setOnClickListener(new com.midtrans.sdk.uikit.views.xl_tunai.payment.XlTunaiPaymentActivity.AnonymousClass4(r10));
        r10.d.setText(getString(com.bpjstku.R.string.confirm_payment));
        r10.INotificationSideChannel.setText(getString(com.bpjstku.R.string.xl_tunai));
        r10.d.setTextBold();
        r10.asInterface.b("XL Tunai Overview", getIntent().getBooleanExtra("First Page", true));
        r11 = com.midtrans.sdk.uikit.views.xl_tunai.payment.XlTunaiPaymentActivity.cancelAll + 47;
        com.midtrans.sdk.uikit.views.xl_tunai.payment.XlTunaiPaymentActivity.cancel = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0149, code lost:
    
        if ((r11 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x014b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x014c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0154, code lost:
    
        throw new java.lang.RuntimeException("-1416849343");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0155, code lost:
    
        r11 = (-1117754026) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x015e, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x006c, code lost:
    
        if (r1 == ((((-414498040) + (((~((-110133650) | (~r2))) | (~((-940121193) | r2))) * (-272))) + (((~((-114745748) | r2)) | 4612098) * (-272))) + (((~(r2 | 114745747)) | (-944733291)) * 272))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00b8, code lost:
    
        if (r1 == ((((-456403372) + (((~(992132218 | r2)) | 838900824) * (-502))) + ((~((~r2) | 1001045499)) * (-502))) + (((~(r2 | (-162144676))) | 992132218) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_DRAWPATH))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00ba, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = (int) java.lang.Runtime.getRuntime().totalMemory();
        r3 = ~r2;
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r11) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.xl_tunai.payment.XlTunaiPaymentActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void b(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = cancelAll + 105;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            b();
            boolean z = this.TuitionPaymentFragmentbindingInflater1;
            throw null;
        }
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            Intent intent = new Intent(this, (Class<?>) XlTunaiStatusActivity.class);
            intent.putExtra("extra.status", transactionResponse);
            startActivityForResult(intent, 210);
            return;
        }
        TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Intent intent2 = new Intent();
        intent2.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        setResult(-1, intent2);
        finish();
        int i3 = cancelAll + 21;
        cancel = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void n(char[] cArr, boolean z, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        int i6 = $11 + 67;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 5 / 2;
        }
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i) {
                break;
            }
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i2 + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i8 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onTransact)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 1), ImageFormat.getBitsPerPixel(0) + 3292, (Process.myPid() >> 22) + 31, 1199271174, false, $$u(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 1;
                        byte b4 = (byte) (-b3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.resolveSize(0, 0), 651 - (ViewConfiguration.getTouchSlop() >> 8), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 44, -450685997, false, $$u(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            int i9 = $10 + 3;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i) {
                int i11 = $11 + 113;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i % setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) / 0];
                    try {
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 1;
                            byte b6 = (byte) (-b5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) KeyEvent.normalizeMetaState(0), View.MeasureSpec.getMode(0) + 651, TextUtils.getCapsMode("", 0, 0) + 44, -450685997, false, $$u(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 1;
                        byte b8 = (byte) (-b7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getLongPressTimeout() >> 16), 651 - TextUtils.indexOf("", "", 0, 0), 44 - TextUtils.indexOf("", "", 0), -450685997, false, $$u(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                i4 = 29209604;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
            int i2 = 1032 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int iAlpha = 15 - Color.alpha(0);
            Object[] objArr2 = new Object[1];
            m((byte) 52, (short) 141, $$j[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup, i2, iAlpha, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        n(new char[]{6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1}, true, ((byte) KeyEvent.getModifierMetaStateMask()) + 23, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_uob).substring(1, 3).length() + 203, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 5, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        n(new char[]{'\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f'}, true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_delete_message).substring(1, 2).length() + 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step5).substring(1, 7).length() + 203, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 105, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1031;
            int packedPositionChild = 14 - ExpandableListView.getPackedPositionChild(0L);
            Object[] objArr5 = new Object[1];
            m((byte) 52, (short) 89, $$j[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, edgeSlop, packedPositionChild, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                int touchSlop = 1031 - (ViewConfiguration.getTouchSlop() >> 8);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 16;
                byte[] bArr = $$j;
                byte b = bArr[7];
                Object[] objArr6 = new Object[1];
                m(b, (short) (b | 37), bArr[132], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, touchSlop, iIndexOf, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i3 = ((int[]) objArr7[3])[0];
            int i4 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i5 = ~((~Process.myPid()) | (-285939840));
            int i6 = (((((-530291712) | i5) * (-970)) + 459280489) + ((i5 | 244351872) * 970)) - 19870202;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            n(new char[]{65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535}, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step6).substring(0, 3).codePointAt(1) + 158, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_password_empty).substring(7, 8).length() + 11, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            n(new char[]{'\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2}, true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cimb_clicks).substring(0, 11).length() + 5, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 110, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redeem_100_point).substring(0, 13).codePointAt(4) - 100, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1327688878};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 46038), 1134 - View.MeasureSpec.makeMeasureSpec(0, 0), 18 - View.combineMeasuredStates(0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -19870202, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iRed = Color.red(0) + 1031;
                    int keyRepeatTimeout = 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    Object[] objArr12 = new Object[1];
                    m((byte) 52, (short) 141, $$j[7], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(longPressTimeout, iRed, keyRepeatTimeout, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - TextUtils.getTrimmedLength("")), ((byte) KeyEvent.getModifierMetaStateMask()) + 1118, ((byte) KeyEvent.getModifierMetaStateMask()) + 18), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                    int packedPositionChild2 = 1030 - ExpandableListView.getPackedPositionChild(0L);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 15;
                    byte[] bArr2 = $$j;
                    byte b2 = bArr2[7];
                    Object[] objArr13 = new Object[1];
                    m(b2, (short) (b2 | 37), bArr2[132], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(bitsPerPixel, packedPositionChild2, iMakeMeasureSpec, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    n(new char[]{6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1}, true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_empty_tcash_token_field).substring(0, 6).length() + 199, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 30, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    n(new char[]{'\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f'}, true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 92, (Process.myTid() >> 22) + 209, 4 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 1);
                        int i9 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1031;
                        int iRgb = Color.rgb(0, 0, 0) + 16777231;
                        Object[] objArr16 = new Object[1];
                        m((byte) 52, (short) 89, $$j[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(gidForName, i9, iRgb, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int iArgb = 1031 - Color.argb(0, 0, 0, 0);
                        int i10 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                        Object[] objArr17 = new Object[1];
                        m((byte) 52, (short) 141, $$j[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(minimumFlingVelocity, iArgb, i10, 1357589585, false, (String) objArr17[0], null);
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
            int i13 = cancelAll + 51;
            cancel = i13 % 128;
            int i14 = i13 % 2;
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[3])[0];
            int i17 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i18 = (int) Runtime.getRuntime().totalMemory();
            int i19 = i15 + 1693156735 + (((~((~i18) | (-918018))) | (~((-135332129) | i18))) * (-302)) + ((~((-918018) | i18)) * (-604)) + (((~(i18 | (-136250146))) | (-515862444)) * 302);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr18[2])[0] = i21 ^ (i21 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i22 = cancel + 105;
                cancelAll = i22 % 128;
                for (int i23 = i22 % 2 != 0 ? 1 : 0; i23 < strArr3.length; i23++) {
                    arrayList.add(strArr3[i23]);
                }
            }
            Toast.makeText((Context) null, i12 / (((i12 - 1) * i12) % 2), 0).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[3])[0];
            int i26 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i27 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
            int i28 = i24 + ((((-1183043709) + (((-281119889) | (~i27)) * (-490))) + (((~(i27 | 590770471)) | (-871890360)) * 490)) - 1152921460);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr19[2])[0] = i30 ^ (i30 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char keyRepeatTimeout2 = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29944);
            int keyRepeatDelay = 1755 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 23;
            byte b3 = (byte) 37;
            Object[] objArr20 = new Object[1];
            m(b3, b3, $$j[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(keyRepeatTimeout2, keyRepeatDelay, iCombineMeasuredStates, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
                int i31 = 1756 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int maxKeyCode = 23 - (KeyEvent.getMaxKeyCode() >> 16);
                Object[] objArr21 = new Object[1];
                m((byte) 52, (short) 89, $$j[7], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(jumpTapTimeout, i31, maxKeyCode, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i32 = ~startUptimeMillis;
            int i33 = 1353485922 + (((-336855121) | i32) * (-369)) + (((~((-599904171) | i32)) | (-387301745)) * (-369)) + (((~(startUptimeMillis | 599904170)) | (-936759291) | (~(i32 | (-50446625)))) * 369) + 2117290696;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i35 ^ (i35 << 5);
            int i36 = cancelAll + 9;
            cancel = i36 % 128;
            int i37 = i36 % 2;
        } else {
            Object[] objArr23 = new Object[1];
            n(new char[]{65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535}, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_primary_cta_text).substring(0, 6).codePointAt(2) - 94, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 93, TextUtils.getOffsetAfter("", 0) + 12, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            n(new char[]{'\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2}, true, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 15, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_credit_card_3).substring(1, 3).length() + 206, 11 - TextUtils.indexOf("", "", 0), objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-1327688878};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 42048), 1726 - KeyEvent.getDeadChar(0, 0), 30 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = RumViewScope$onStopView$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 2117290696);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cIndexOf2 = (char) (29944 - TextUtils.indexOf("", "", 0, 0));
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 1756;
                int iMyPid = 23 - (Process.myPid() >> 22);
                Object[] objArr26 = new Object[1];
                m((byte) 52, (short) 89, $$j[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf2, iIndexOf2, iMyPid, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                n(new char[]{6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1}, true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_paid).substring(0, 6).length() + 16, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 169, 6 - View.getDefaultSize(0, 0), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                n(new char[]{'\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f'}, true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 210, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 32, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char threadPriority = (char) (29944 - ((Process.getThreadPriority(0) + 20) >> 6));
                    int longPressTimeout2 = 1755 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int i38 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22;
                    short s = $$j[7];
                    Object[] objArr29 = new Object[1];
                    m((byte) 52, s, (byte) s, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(threadPriority, longPressTimeout2, i38, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c = (char) (29944 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int keyRepeatTimeout3 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1755;
                    int keyRepeatTimeout4 = 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte b4 = (byte) 37;
                    Object[] objArr30 = new Object[1];
                    m(b4, b4, $$j[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c, keyRepeatTimeout3, keyRepeatTimeout4, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i39 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i40 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i40 == i39) {
            int i41 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int i42 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i43 = ~i42;
            int i44 = i41 + (-144688828) + (((~((-488553967) | i43)) | (~(275951540 | i43))) * (-867)) + (((~((-488553967) | i42)) | 218894410 | (~(275951540 | i42))) * (-1734)) + (((~(i42 | 494845950)) | (~(i43 | (-218894411))) | (~((-269659557) | i42))) * 867);
            int i45 = (i44 << 13) ^ i44;
            int i46 = i45 ^ (i45 >>> 17);
            ((int[]) objArr31[3])[0] = i46 ^ (i46 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
        if (strArr5 != null) {
            int i47 = cancel + 1;
            cancelAll = i47 % 128;
            int i48 = 2;
            int i49 = i47 % 2;
            int i50 = 0;
            while (i50 < strArr5.length) {
                int i51 = cancelAll + 97;
                cancel = i51 % 128;
                if (i51 % i48 == 0) {
                    arrayList2.add(strArr5[i50]);
                    i50 += 44;
                } else {
                    arrayList2.add(strArr5[i50]);
                    i50++;
                }
                i48 = 2;
            }
        }
        int[] iArr = new int[i40];
        int i52 = i40 - 1;
        iArr[i52] = 1;
        Toast.makeText((Context) null, iArr[((i40 * i52) % 2) - 1], 1).show();
        int i53 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
        int iNextInt = new Random().nextInt(1544876828);
        int i54 = i53 + (-569670474) + (((~((~iNextInt) | (-812339260))) | (-599736834)) * (-235)) + (((~((-812339260) | iNextInt)) | (-599736834)) * (-470)) + (((~(iNextInt | (-539705346))) | (-872370748)) * 235);
        int i55 = (i54 << 13) ^ i54;
        int i56 = i55 ^ (i55 >>> 17);
        ((int[]) objArr32[3])[0] = i56 ^ (i56 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d7, code lost:
    
        if (r1 == ((r7 + ((((~((-774727381) | r5)) | 69476436) | (~(1804328584 | r5))) * (-1228))) + (((~(r5 | 1873805020)) | (~((-705250945) | r5))) * 614))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d9, code lost:
    
        r1 = com.midtrans.sdk.uikit.views.xl_tunai.payment.XlTunaiPaymentActivity.cancel + 81;
        com.midtrans.sdk.uikit.views.xl_tunai.payment.XlTunaiPaymentActivity.cancelAll = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e9, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00eb, code lost:
    
        r0 = new int[827514650];
        r0[827514649(0x3152df19, float:3.0685838E-9)] = 0;
        android.widget.Toast.makeText((android.content.Context) null, r0[-1], 1).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f9, code lost:
    
        r1 = new int[827514650];
        r1[827514649(0x3152df19, float:3.0685838E-9)] = 1;
        r2 = 1908633482 % 2;
        android.widget.Toast.makeText((android.content.Context) null, r1[-1], 1).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x010a, code lost:
    
        super.onResume();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x010d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0115, code lost:
    
        throw new java.lang.RuntimeException("1542506228");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0038, code lost:
    
        if (r1 == (((-1806733070) + (((~((~r5) | 686677542)) | 1375871193) * 529)) + (((~(r5 | 686677542)) | 1516665085) * 529))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007b, code lost:
    
        if (r1 == ((((-938811068) + (((~(r5 | (-138412611))) | r7) * 590)) + (r7 * (-1180))) + (((~((-189305716) | r6)) | (~(r6 | (-1019293259)))) * 590))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007d, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r6 = (java.lang.Object[]) null;
        r5 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1280601977;
        r7 = 1764109220 + ((1168554076 | r5) * 614);
        r5 = ~r5;
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.xl_tunai.payment.XlTunaiPaymentActivity.onResume():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c2, code lost:
    
        if (r1 == (((2046466476 + (((-1074008085) | r2) * (-676))) + (((~(895216936 | r5)) | 1074008084) * 676)) + (((~(r2 | 1969225020)) | ((~(r5 | (-1683839029))) | 609830944)) * 676))) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c4, code lost:
    
        r1 = com.midtrans.sdk.uikit.views.xl_tunai.payment.XlTunaiPaymentActivity.cancel + 51;
        com.midtrans.sdk.uikit.views.xl_tunai.payment.XlTunaiPaymentActivity.cancelAll = r1 % 128;
        r1 = r1 % 2;
        r1 = new int[1721154434];
        r1[1721154433(0x6696bb81, float:3.559069E23)] = 1;
        r2 = 1998090882 % 2;
        android.widget.Toast.makeText((android.content.Context) null, r1[-1], 1).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e5, code lost:
    
        super.onStart();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f0, code lost:
    
        throw new java.lang.RuntimeException("2109093009");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0041, code lost:
    
        if (r1 == (((2047873600 + (((~((-962036768) | r5)) | 285704201) * 345)) + (((~((-962036768) | (~r5))) | (-2077728512)) * 345)) + ((~(r5 | (-285704202))) * 345))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006c, code lost:
    
        if (r1 == (((-573117390) + (((~(r5 | 487840060)) | 1116480515) * 305)) + (((~((~r5) | 487840060)) | 1317827603) * 305))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006e, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r5 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
        r5 = ~r2;
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.xl_tunai.payment.XlTunaiPaymentActivity.onStart():void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = cancel + 1;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$u(short r6, byte r7, int r8) {
        /*
            int r7 = r7 + 4
            int r6 = 120 - r6
            int r8 = r8 * 2
            int r0 = 1 - r8
            byte[] r1 = com.midtrans.sdk.uikit.views.xl_tunai.payment.XlTunaiPaymentActivity.$$m
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L15
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            r3 = r1[r6]
        L2a:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.xl_tunai.payment.XlTunaiPaymentActivity.$$u(short, byte, int):java.lang.String");
    }
}
