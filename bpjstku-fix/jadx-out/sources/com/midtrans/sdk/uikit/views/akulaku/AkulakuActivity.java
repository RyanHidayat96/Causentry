package com.midtrans.sdk.uikit.views.akulaku;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.R;
import com.midtrans.sdk.corekit.callback.TransactionCallback;
import com.midtrans.sdk.corekit.core.PaymentType;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.ViewPortBuilder;
import defpackage.abortCapture;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.filterOutChildSizesCausingDoubleCropping;
import defpackage.handleMessage;
import defpackage.hasUpscaling;
import defpackage.initSession;
import defpackage.onConnectionFailed;
import defpackage.onScroll;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class AkulakuActivity extends BasePaymentActivity implements filterOutChildSizesCausingDoubleCropping {
    private hasUpscaling INotificationSideChannel;
    private FancyButton cancel;
    private static final byte[] $$m = {119, -103, 14, -22};
    private static final int $$n = 209;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {118, 35, -100, -35, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$k = 254;
    private static int onTransact = 0;
    private static int cancelAll = 1;
    private static long notify = 5054284670469838319L;
    private final String d = "AkulakuActivity";
    private final String asInterface = "Akulaku";
    private final String g = "Confirm Payment Akulaku";

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(AkulakuActivity akulakuActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        akulakuActivity.asBinder();
        int i4 = cancelAll + 95;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ hasUpscaling b(AkulakuActivity akulakuActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        hasUpscaling hasupscaling = akulakuActivity.INotificationSideChannel;
        if (i3 == 0) {
            return hasupscaling;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void m(short s, short s2, byte b, Object[] objArr) {
        int i = 98 - (b * 14);
        byte[] bArr = $$j;
        int i2 = s + 4;
        byte[] bArr2 = new byte[s2 + 1];
        int i3 = -1;
        if (bArr == null) {
            i = (i + (-s2)) - 11;
        }
        while (true) {
            i2++;
            i3++;
            bArr2[i3] = (byte) i;
            if (i3 == s2) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i = (i + (-bArr[i2])) - 11;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = cancelAll + 43;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        setPrimaryBackgroundColor(this.cancel);
        int i4 = cancelAll + 41;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        this.cancel = (FancyButton) findViewById(R.id.button_primary);
        int i4 = cancelAll + 31;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = onTransact + 79;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            super.onActivityResult(i, i2, intent);
            if (i != 5976) {
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
        TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Intent intent2 = new Intent();
        intent2.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        setResult(-1, intent2);
        finish();
        int i5 = cancelAll + 49;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        hasUpscaling hasupscaling = this.INotificationSideChannel;
        Object obj = null;
        if (hasupscaling != null) {
            int i2 = onTransact + 33;
            cancelAll = i2 % 128;
            if (i2 % 2 == 0) {
                hasupscaling.TuitionPaymentFragmentbindingInflater1("Back", "Akulaku");
                throw null;
            }
            hasupscaling.TuitionPaymentFragmentbindingInflater1("Back", "Akulaku");
            int i3 = onTransact + 73;
            cancelAll = i3 % 128;
            int i4 = i3 % 2;
        }
        super.onBackPressed();
        int i5 = cancelAll + 51;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        int i = 2 % 2;
        int i2 = cancelAll + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
            int i4 = cancelAll + 37;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = cancelAll + 85;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            b();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        } else {
            b();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void b(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        b();
        b(transactionResponse, PaymentType.AKULAKU);
        int i4 = onTransact + 105;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = cancelAll + 19;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = (-1611376616) + (((~((-920257073) | iIdentityHashCode)) | 542244864 | (~((-1750244616) | iIdentityHashCode))) * (-754));
            int i5 = ~((-542244865) | iIdentityHashCode);
            int i6 = ~iIdentityHashCode;
            if (i3 != i4 + ((i5 | (~((-1207999752) | i6))) * (-754)) + ((i6 | (-920257073)) * 754)) {
                throw null;
            }
        } else {
            int i7 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i8 = ~elapsedCpuTime;
            if (i7 != (((((~(1690565930 | i8)) | (~((-860578388) | elapsedCpuTime))) | (~(i8 | 860578387))) * 959) - 2088322184) + (((~(elapsedCpuTime | 860578387)) | (~(i8 | (-860578388))) | (~(1690565930 | elapsedCpuTime))) * 959)) {
                throw null;
            }
        }
        int i9 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i10 = ~iUptimeMillis;
        if (i9 != (-947944364) + (((~(2114013404 | i10)) | (~((-398102074) | iUptimeMillis))) * (-370)) + (((~(iUptimeMillis | 2114013404)) | (~(i10 | (-398102074))) | 1744912580) * (-370)) + 1372560200) {
            throw new RuntimeException("-82248164");
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_akulaku);
        this.INotificationSideChannel = new hasUpscaling(this);
        this.cancel.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.akulaku.AkulakuActivity.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    AkulakuActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(AkulakuActivity.this);
                    AkulakuActivity.b(AkulakuActivity.this).TuitionPaymentFragmentbindingInflater1("Confirm Payment Akulaku", "Akulaku");
                    hasUpscaling hasupscalingB = AkulakuActivity.b(AkulakuActivity.this);
                    hasupscalingB.b().paymentUsingAkulaku(hasupscalingB.b().readAuthenticationToken(), new TransactionCallback() { // from class: hasUpscaling.4
                        public AnonymousClass4() {
                        }

                        @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                        public final void onError(Throwable th) {
                            ((filterOutChildSizesCausingDoubleCropping) hasUpscaling.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
                        }

                        @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                        public final void onFailure(TransactionResponse transactionResponse, String str) {
                            hasUpscaling.this.b = transactionResponse;
                            ((filterOutChildSizesCausingDoubleCropping) hasUpscaling.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
                        }

                        @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                        public final void onSuccess(TransactionResponse transactionResponse) {
                            hasUpscaling.this.b = transactionResponse;
                            ((filterOutChildSizesCausingDoubleCropping) hasUpscaling.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
                        }
                    });
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        b(getString(R.string.akulaku));
        this.cancel.setText(getString(R.string.confirm_payment));
        this.cancel.setTextBold();
        this.INotificationSideChannel.b("Akulaku", getIntent().getBooleanExtra("First Page", true));
        int i11 = cancelAll + 37;
        onTransact = i11 % 128;
        if (i11 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void n(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(notify ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $10 + 51;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(notify)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - TextUtils.getTrimmedLength("")), (ViewConfiguration.getTapTimeout() >> 16) + 1356, TextUtils.indexOf("", "") + 38, 894276454, false, $$u(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 47773), (KeyEvent.getMaxKeyCode() >> 16) + 468, 13 - View.resolveSizeAndState(0, 0, 0), 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $10 + 77;
                $11 = i6 % 128;
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

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29944);
            int scrollBarSize = 1755 - (ViewConfiguration.getScrollBarSize() >> 8);
            int iIndexOf = 23 - TextUtils.indexOf("", "");
            byte[] bArr = $$j;
            short s = bArr[28];
            Object[] objArr2 = new Object[1];
            m(s, (byte) (s & 37), bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, scrollBarSize, iIndexOf, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i3 = cancelAll + 117;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char maximumFlingVelocity = (char) (29944 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 1756;
                int i5 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23;
                short s2 = (short) ($$k & 37);
                Object[] objArr3 = new Object[1];
                m(s2, (byte) (s2 | 16), $$j[5], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumFlingVelocity, iIndexOf2, i5, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i6 = ((int[]) objArr4[0])[0];
            objArrB$7879113 = new Object[]{new int[]{i6}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~(266572351 | iIdentityHashCode);
            int i8 = ~iIdentityHashCode;
            int i9 = (-1913021229) + ((i7 | (~((-56627719) | i8))) * (-406)) + ((~(535802495 | i8)) * (-406)) + (((~(iIdentityHashCode | (-479174778))) | (~((-266572352) | i8))) * 406) + 1854271095;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i11 ^ (i11 << 5);
            int i12 = onTransact + 123;
            cancelAll = i12 % 128;
            int i13 = i12 % 2;
        } else {
            Object[] objArr5 = new Object[1];
            n(new char[]{47790, 47812, 18317, 14437, 39797, 12005, 17572, 25617, 20511, 17828, 39238, 11470, 18049, 17306, 40728, 10885, 16561, 16868, 40202, 10613}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri__e_cash_instruction_step5).substring(40, 41).codePointAt(0) - 31, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            n(new char[]{10174, 10199, 23559, 9194, 10680, 4899, 55790, 54991, 28118, 24110, 11149, 4368, 56254, 22618, 11750, 5981, 56721, 23152, 12245, 5300}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_card_prima).substring(46, 51).codePointAt(2) - 83, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-494621060};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - TextUtils.indexOf("", "", 0)), TextUtils.lastIndexOf("", '0') + 1727, TextUtils.lastIndexOf("", '0', 0) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = onScroll.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 1854271095, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (29945 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int i14 = 1755 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i15 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23;
                    short s3 = (short) ($$k & 37);
                    Object[] objArr8 = new Object[1];
                    m(s3, (byte) (s3 | 16), $$j[5], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, i14, i15, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    n(new char[]{1957, 1988, 18315, 14444, 3354, 15088, 63982, 62060, 17433, 17832, 3902, 14472, 64386, 17358, 2328, 16041, 64944, 16874, 2918, 15739, 65368, 16438, 1442, 13149, 61810, 20026}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 114, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    n(new char[]{48924, 49017, 48095, 50234, 65275, 17615, 16715, 392, 14884, 47602, 64730, 18121, 17201, 49034, 64190, 16563, 17689, 48546, 63635}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29944);
                        int i16 = 1756 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int iIndexOf3 = 22 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        int i17 = $$k;
                        Object[] objArr11 = new Object[1];
                        m((short) (i17 & 344), (byte) (i17 & 53), $$j[5], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, i16, iIndexOf3, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char windowTouchSlop = (char) (29944 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                        int iMyPid = 1755 - (Process.myPid() >> 22);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23;
                        byte[] bArr2 = $$j;
                        short s4 = bArr2[28];
                        Object[] objArr12 = new Object[1];
                        m(s4, (byte) (s4 & 37), bArr2[5], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(windowTouchSlop, iMyPid, scrollBarFadeDuration, 986134021, false, (String) objArr12[0], null);
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
        int i18 = ((int[]) objArrB$7879113[1])[0];
        int i19 = ((int[]) objArrB$7879113[0])[0];
        if (i19 != i18) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$7879113[4];
            if (strArr != null) {
                int i20 = cancelAll;
                int i21 = i20 + 99;
                onTransact = i21 % 128;
                int i22 = i21 % 2;
                int i23 = i20 + 59;
                onTransact = i23 % 128;
                int i24 = i23 % 2;
                while (i2 < strArr.length) {
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i19));
        }
        int i25 = ((int[]) objArrB$7879113[3])[0];
        int i26 = ((int[]) objArrB$7879113[0])[0];
        Object[] objArr13 = {new int[]{i26}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int iMyUid = Process.myUid();
        int i27 = i25 + 1687085357 + (((~(iMyUid | 8970786)) | 203631639) * 191) + (((~((~iMyUid) | 8970786)) | 203623445) * 191);
        int i28 = (i27 << 13) ^ i27;
        int i29 = i28 ^ (i28 >>> 17);
        ((int[]) objArr13[3])[0] = i29 ^ (i29 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char trimmedLength = (char) TextUtils.getTrimmedLength("");
            int minimumFlingVelocity = 1031 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0', 0);
            int i30 = $$k;
            Object[] objArr14 = new Object[1];
            m((short) (i30 & 909), (byte) (i30 & 53), $$j[5], objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(trimmedLength, minimumFlingVelocity, iLastIndexOf, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        n(new char[]{1957, 1988, 18315, 14444, 3354, 15088, 63982, 62060, 17433, 17832, 3902, 14472, 64386, 17358, 2328, 16041, 64944, 16874, 2918, 15739, 65368, 16438, 1442, 13149, 61810, 20026}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_full_name).substring(0, 12).codePointAt(0) - 77, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        n(new char[]{48924, 49017, 48095, 50234, 65275, 17615, 16715, 392, 14884, 47602, 64730, 18121, 17201, 49034, 64190, 16563, 17689, 48546, 63635}, Color.green(0) + 1, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
            int size = View.MeasureSpec.getSize(0) + 1031;
            int i31 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14;
            short s5 = (short) ($$k & 37);
            Object[] objArr17 = new Object[1];
            m(s5, (byte) (s5 | 16), $$j[5], objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cNormalizeMetaState, size, i31, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 1031;
                int doubleTapTimeout = 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                short s6 = (short) ($$k & 960);
                byte b = $$j[7];
                Object[] objArr18 = new Object[1];
                m(s6, b, b, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf, scrollBarSize2, doubleTapTimeout, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i32 = ((int[]) objArr19[3])[0];
            int i33 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iMyTid = Process.myTid();
            int i34 = ((((-2140082559) + (((~(758974150 | iMyTid)) | 314601520) * 336)) + (((~(iMyTid | 1003254320)) | 70321350) * (-168))) + (((~((~iMyTid) | 1003254320)) | 758974150) * 168)) - 848148152;
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr[2])[0] = i36 ^ (i36 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            n(new char[]{47790, 47812, 18317, 14437, 39797, 12005, 17572, 25617, 20511, 17828, 39238, 11470, 18049, 17306, 40728, 10885, 16561, 16868, 40202, 10613}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_indomaret).substring(0, 9).codePointAt(2) - 99, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            n(new char[]{10174, 10199, 23559, 9194, 10680, 4899, 55790, 54991, 28118, 24110, 11149, 4368, 56254, 22618, 11750, 5981, 56721, 23152, 12245, 5300}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_dompetku).substring(0, 16).length() - 15, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {-494621060};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 1134 - View.resolveSizeAndState(0, 0, 0), 17 - TextUtils.lastIndexOf("", '0', 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -848148152, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                int iArgb = 1031 - Color.argb(0, 0, 0, 0);
                int i37 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14;
                int i38 = $$k;
                Object[] objArr24 = new Object[1];
                m((short) (i38 & 909), (byte) (i38 & 53), $$j[5], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(deadChar, iArgb, i37, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 45993), TextUtils.indexOf((CharSequence) "", '0', 0) + 1118, (ViewConfiguration.getPressedStateDuration() >> 16) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                int iIndexOf4 = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                int absoluteGravity = 15 - Gravity.getAbsoluteGravity(0, 0);
                short s7 = (short) ($$k & 960);
                byte b2 = $$j[7];
                Object[] objArr25 = new Object[1];
                m(s7, b2, b2, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cLastIndexOf, iIndexOf4, absoluteGravity, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                n(new char[]{1957, 1988, 18315, 14444, 3354, 15088, 63982, 62060, 17433, 17832, 3902, 14472, 64386, 17358, 2328, 16041, 64944, 16874, 2918, 15739, 65368, 16438, 1442, 13149, 61810, 20026}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cimb_clicks).substring(0, 11).length() - 10, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                n(new char[]{48924, 49017, 48095, 50234, 65275, 17615, 16715, 392, 14884, 47602, 64730, 18121, 17201, 49034, 64190, 16563, 17689, 48546, 63635}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1051).substring(0, 32).codePointAt(8) - 96, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cBlue = (char) Color.blue(0);
                    int iLastIndexOf2 = 1030 - TextUtils.lastIndexOf("", '0');
                    int iGreen = Color.green(0) + 15;
                    short s8 = (short) ($$k & 37);
                    Object[] objArr28 = new Object[1];
                    m(s8, (byte) (s8 | 16), $$j[5], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cBlue, iLastIndexOf2, iGreen, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                    int i39 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int iIndexOf5 = 14 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int i40 = $$k;
                    Object[] objArr29 = new Object[1];
                    m((short) (i40 & 909), (byte) (i40 & 53), $$j[5], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(offsetAfter, i39, iIndexOf5, 1357589585, false, (String) objArr29[0], null);
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
            while (i2 < strArr3.length) {
                arrayList2.add(strArr3[i2]);
                i2++;
            }
            throw null;
        }
        int i41 = cancelAll + 99;
        onTransact = i41 % 128;
        int i42 = i41 % 2;
        Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i43 = ((int[]) objArr[2])[0];
        int i44 = ((int[]) objArr[3])[0];
        int i45 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_wearing_glass_text).substring(0, 8).codePointAt(0) + 2112589087;
        int i46 = ~iCodePointAt;
        int i47 = (~((-345777417) | i46)) | 67903752;
        int i48 = ~(iCodePointAt | 379370910);
        int i49 = i43 + 1323534984 + ((i47 | i48) * (-713)) + (i48 * 1426) + ((~(101497246 | i46)) * 713);
        int i50 = i49 ^ (i49 << 13);
        int i51 = i50 ^ (i50 >>> 17);
        ((int[]) objArr30[2])[0] = i51 ^ (i51 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -601929914
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.reflect.Member[] r1 = defpackage.CameraUseCaseAdapter.b
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            int r4 = android.os.Process.myPid()
            int r5 = ~r4
            r6 = -255862866(0xfffffffff0bfd7ae, float:-4.7497902E29)
            r5 = r5 | r6
            int r5 = ~r5
            r7 = 1085850408(0x40b8c328, float:5.773823)
            r5 = r5 | r7
            int r5 = r5 * (-591)
            r7 = 1848574926(0x6e2f03ce, float:1.3541119E28)
            int r7 = r7 + r5
            r4 = r4 | r6
            int r4 = r4 * 591
            int r7 = r7 + r4
            r4 = -1
            r5 = 1
            if (r1 == r7) goto L5b
            int r1 = com.midtrans.sdk.uikit.views.akulaku.AkulakuActivity.onTransact
            int r1 = r1 + 3
            int r6 = r1 % 128
            com.midtrans.sdk.uikit.views.akulaku.AkulakuActivity.cancelAll = r6
            int r1 = r1 % r0
            r6 = -601929915(0xffffffffdc1f4745, float:-1.7933153E17)
            r7 = -601929914(0xffffffffdc1f4746, float:-1.7933155E17)
            if (r1 != 0) goto L4a
            int[] r1 = new int[r7]
            r1[r6] = r2
            r1 = r1[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r5)
            r1.show()
            goto L5b
        L4a:
            int[] r1 = new int[r7]
            r1[r6] = r5
            r6 = -894656546(0xffffffffcaac9fde, float:-5656559.0)
            int r6 = r6 % r0
            r1 = r1[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r5)
            r1.show()
        L5b:
            java.lang.reflect.Member[] r1 = defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            java.lang.String r6 = "android.app.ActivityThread"
            java.lang.Class r6 = java.lang.Class.forName(r6)
            java.lang.String r7 = "currentApplication"
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r2 = r6.getMethod(r7, r2)
            r6 = r3
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            java.lang.Object r2 = r2.invoke(r3, r3)
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.smallestScreenWidthDp
            r6 = -1868221268(0xffffffff90a534ac, float:-6.516218E-29)
            r6 = r6 | r2
            int r6 = ~r6
            r7 = -710834698(0xffffffffd5a185f6, float:-2.2199591E13)
            r6 = r6 | r7
            int r6 = r6 * (-948)
            r7 = 269896548(0x10164b64, float:2.9640363E-29)
            int r7 = r7 + r6
            r6 = -710560258(0xffffffffd5a5b5fe, float:-2.2775134E13)
            int r2 = ~r2
            r2 = r2 | r6
            int r2 = ~r2
            int r2 = r2 * (-948)
            int r7 = r7 + r2
            r2 = 2048989348(0x7a2118a4, float:2.091149E35)
            int r7 = r7 + r2
            if (r1 == r7) goto Lc4
            int r1 = com.midtrans.sdk.uikit.views.akulaku.AkulakuActivity.cancelAll
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.midtrans.sdk.uikit.views.akulaku.AkulakuActivity.onTransact = r2
            int r1 = r1 % r0
            r1 = -887600376(0xffffffffcb184b08, float:-9980680.0)
            int[] r1 = new int[r1]
            r2 = -887600377(0xffffffffcb184b07, float:-9980679.0)
            r1[r2] = r5
            r2 = 207971640(0xc656538, float:1.7671978E-31)
            int r2 = r2 % r0
            r0 = r1[r4]
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r5)
            r0.show()
        Lc4:
            super.onResume()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.akulaku.AkulakuActivity.onResume():void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = cancelAll + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
        int i6 = ~i5;
        if (i4 != 976186041 + (((~((-1472747) | i6)) | (~(i5 | (-831460290)))) * 333) + (((~(i5 | (-1472747))) | (~(i6 | (-831460290)))) * 333)) {
            throw null;
        }
        int i7 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_email_optional).substring(2, 3).codePointAt(0) + 1861752595;
        if (i7 != (-507536578) + (((~((~iCodePointAt) | (-574722414))) | (-2004333552)) * (-591)) + ((iCodePointAt | (-574722414)) * 591)) {
            throw new RuntimeException("-859404698");
        }
        super.onStart();
        int i8 = cancelAll + 79;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = cancelAll + 41;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = onTransact + 15;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$u(short r6, int r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 107
            byte[] r0 = com.midtrans.sdk.uikit.views.akulaku.AkulakuActivity.$$m
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r8 = r8 * 3
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.akulaku.AkulakuActivity.$$u(short, int, short):java.lang.String");
    }
}
