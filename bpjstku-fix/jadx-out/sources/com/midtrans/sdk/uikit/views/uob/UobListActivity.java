package com.midtrans.sdk.uikit.views.uob;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.google.android.material.timepicker.ClockHandView$$ExternalSyntheticLambda0;
import com.midtrans.sdk.corekit.core.Constants;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.core.MidtransSDK;
import com.midtrans.sdk.corekit.core.PaymentType;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.models.EnabledPayments;
import com.midtrans.sdk.uikit.views.uob.app.UobAppPaymentActivity;
import com.midtrans.sdk.uikit.views.uob.web.UobWebPaymentActivity;
import com.midtrans.sdk.uikit.widgets.SemiBoldTextView;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.generateCameraId;
import defpackage.getCropRectOfReferenceAspectRatio;
import defpackage.initSession;
import defpackage.jpegSnapshot;
import defpackage.lambdanew0androidxcameracorestreamsharingStreamSharing;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class UobListActivity extends BasePaymentActivity implements lambdanew0androidxcameracorestreamsharingStreamSharing.TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
    private final String asInterface = "UOB EZ Pay";
    private SemiBoldTextView cancel;
    private lambdanew0androidxcameracorestreamsharingStreamSharing d;
    private RecyclerView g;
    private jpegSnapshot onTransact;
    private static final byte[] $$m = {38, 31, -70, -1};
    private static final int $$n = 62;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {118, 35, -100, -35, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$k = 55;
    private static int INotificationSideChannelStub = 0;
    private static int INotificationSideChannelDefault = 1;
    private static char cancelAll = 62872;
    private static char INotificationSideChannel = 63758;
    private static char notify = 39129;
    private static char INotificationSideChannelStubProxy = 8856;

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.views.uob.UobListActivity.$$j
            int r8 = 145 - r8
            int r1 = r7 + 1
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.uob.UobListActivity.m(short, byte, int, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub;
        int i3 = i2 + 39;
        INotificationSideChannelDefault = i3 % 128;
        int i4 = i3 % 2;
        if (this.onTransact != null) {
            int i5 = i2 + 113;
            INotificationSideChannelDefault = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    MidtransSDK.getInstance().getmMixpanelAnalyticsManager().trackButtonClicked(MidtransSDK.getInstance().readAuthenticationToken(), "Back", "UOB EZ Pay");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                MidtransSDK.getInstance().getmMixpanelAnalyticsManager().trackButtonClicked(MidtransSDK.getInstance().readAuthenticationToken(), "Back", "UOB EZ Pay");
            } catch (NullPointerException e2) {
                StringBuilder sb = new StringBuilder("trackButtonClick():");
                sb.append(e2.getMessage());
                Logger.e(Constants.TAG, sb.toString());
            }
        }
        super.onBackPressed();
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 49;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 == 0) {
            str.equals(PaymentType.UOB_WEB);
            throw null;
        }
        if (str.equals(PaymentType.UOB_WEB)) {
            startActivityForResult(new Intent(this, (Class<?>) UobWebPaymentActivity.class), Constants.RESULT_CODE_PAYMENT_TRANSFER);
            return;
        }
        startActivityForResult(new Intent(this, (Class<?>) UobAppPaymentActivity.class), Constants.RESULT_CODE_PAYMENT_TRANSFER);
        int i3 = INotificationSideChannelStub + 33;
        INotificationSideChannelDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r8 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        setResult(-1, r8);
        finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r8 != null) goto L12;
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.midtrans.sdk.uikit.views.uob.UobListActivity.INotificationSideChannelDefault
            int r1 = r1 + 121
            int r2 = r1 % 128
            com.midtrans.sdk.uikit.views.uob.UobListActivity.INotificationSideChannelStub = r2
            int r1 = r1 % r0
            super.onActivityResult(r6, r7, r8)
            r1 = 5102(0x13ee, float:7.15E-42)
            if (r6 != r1) goto L50
            int r6 = com.midtrans.sdk.uikit.views.uob.UobListActivity.INotificationSideChannelDefault
            int r1 = r6 + 43
            int r2 = r1 % 128
            com.midtrans.sdk.uikit.views.uob.UobListActivity.INotificationSideChannelStub = r2
            int r1 = r1 % r0
            r1 = -1
            r2 = 0
            if (r7 != r1) goto L38
            int r3 = r6 + 99
            int r4 = r3 % 128
            com.midtrans.sdk.uikit.views.uob.UobListActivity.INotificationSideChannelStub = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L2f
            r3 = 51
            int r3 = r3 / r2
            if (r8 == 0) goto L38
            goto L31
        L2f:
            if (r8 == 0) goto L38
        L31:
            r5.setResult(r1, r8)
            r5.finish()
            return
        L38:
            if (r7 != 0) goto L50
            int r6 = r6 + 113
            int r7 = r6 % 128
            com.midtrans.sdk.uikit.views.uob.UobListActivity.INotificationSideChannelStub = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L4a
            r5.setResult(r2, r8)
            r5.finish()
            goto L50
        L4a:
            r5.setResult(r2, r8)
            r5.finish()
        L50:
            int r6 = com.midtrans.sdk.uikit.views.uob.UobListActivity.INotificationSideChannelDefault
            int r6 = r6 + 41
            int r7 = r6 % 128
            com.midtrans.sdk.uikit.views.uob.UobListActivity.INotificationSideChannelStub = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L5c
            return
        L5c:
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.uob.UobListActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    private void g() {
        int i = 2 % 2;
        this.onTransact = new jpegSnapshot(this, (EnabledPayments) getIntent().getSerializableExtra("extra.uob.list"));
        lambdanew0androidxcameracorestreamsharingStreamSharing lambdanew0androidxcameracorestreamsharingstreamsharing = new lambdanew0androidxcameracorestreamsharingStreamSharing(this);
        this.d = lambdanew0androidxcameracorestreamsharingstreamsharing;
        List<getCropRectOfReferenceAspectRatio> listTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.onTransact.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        lambdanew0androidxcameracorestreamsharingstreamsharing.TuitionPaymentFragmentbindingInflater1.clear();
        lambdanew0androidxcameracorestreamsharingstreamsharing.TuitionPaymentFragmentbindingInflater1.addAll(listTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        lambdanew0androidxcameracorestreamsharingstreamsharing.notifyDataSetChanged();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_bank_list);
        this.g = recyclerView;
        if (recyclerView == null) {
            Toast.makeText(this, getString(R.string.message_error_internal_server), 0).show();
            int i2 = INotificationSideChannelStub + 15;
            INotificationSideChannelDefault = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.g.setHasFixedSize(true);
        this.g.setAdapter(this.d);
        int i4 = INotificationSideChannelDefault + 81;
        INotificationSideChannelStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private void a() {
        int i = 2 % 2;
        SemiBoldTextView semiBoldTextView = (SemiBoldTextView) findViewById(R.id.text_page_title);
        this.cancel = semiBoldTextView;
        if (semiBoldTextView != null) {
            semiBoldTextView.setText(getString(R.string.activity_uob_list));
        }
        try {
            MidtransSDK.getInstance().getmMixpanelAnalyticsManager().trackPageViewed(MidtransSDK.getInstance().readAuthenticationToken(), "UOB EZ Pay", getIntent().getBooleanExtra("First Page", true));
            int i2 = INotificationSideChannelStub + 35;
            INotificationSideChannelDefault = i2 % 128;
            int i3 = i2 % 2;
        } catch (NullPointerException e2) {
            StringBuilder sb = new StringBuilder("trackPageView():");
            sb.append(e2.getMessage());
            Logger.e(Constants.TAG, sb.toString());
        }
        if (!(!this.onTransact.TuitionPaymentFragmentspecialinlinedviewModeldefault2().isEmpty())) {
            finish();
            return;
        }
        if (!getIntent().getBooleanExtra(PaymentType.UOB_WEB, false)) {
            if (getIntent().getBooleanExtra(PaymentType.UOB_APP, false)) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(PaymentType.UOB_APP);
            }
        } else {
            int i4 = INotificationSideChannelStub + 87;
            INotificationSideChannelDefault = i4 % 128;
            int i5 = i4 % 2;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(PaymentType.UOB_WEB);
        }
    }

    @Override // lambdanew0androidxcameracorestreamsharingStreamSharing.TuitionPaymentFragmentspecialinlinedviewModeldefault2
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        int i2 = 2 % 2;
        int i3 = INotificationSideChannelStub + 79;
        INotificationSideChannelDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.d.TuitionPaymentFragmentbindingInflater1.get(i).f926a);
            throw null;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.d.TuitionPaymentFragmentbindingInflater1.get(i).f926a);
        int i4 = INotificationSideChannelStub + 1;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ca, code lost:
    
        if (r1 != ((((-1553222370) + (((~((-266774320) | r4)) | 1982685650) * (-865))) + ((~(r2 | 266774319)) * 865)) + (((~(1982685650 | r4)) | (~(r4 | 266774319))) * 865))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00cc, code lost:
    
        super.onCreate(r12);
        setContentView(com.bpjstku.R.layout.activity_bank_transfer_list);
        g();
        a();
        r12 = com.midtrans.sdk.uikit.views.uob.UobListActivity.INotificationSideChannelDefault + 43;
        com.midtrans.sdk.uikit.views.uob.UobListActivity.INotificationSideChannelStub = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e4, code lost:
    
        if ((r12 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e8, code lost:
    
        r12 = (-1632797916) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f1, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f9, code lost:
    
        throw new java.lang.RuntimeException("-434409725");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0067, code lost:
    
        if (r1 == ((((((~(1112570803 | r5)) | (~((-282583261) | r4))) | (~(r5 | 282583260))) * 959) - 487732173) + (((~(r4 | 282583260)) | ((~(r5 | (-282583261))) | (~(1112570803 | r4)))) * 959))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0094, code lost:
    
        if (r1 == (((((~((-635095646) | r4)) | 89276436) * (-566)) - 1839132320) + ((~(r4 | (-545819210))) * 566))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0096, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = (int) java.lang.Runtime.getRuntime().maxMemory();
        r4 = ~r2;
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r12) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.uob.UobListActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 37;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
            int iGreen = Color.green(0) + 1031;
            int iBlue = 15 - Color.blue(0);
            Object[] objArr3 = new Object[1];
            m($$j[5], (byte) ($$k - 3), (short) 141, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, iGreen, iBlue, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        n(new char[]{19771, 31631, 37704, 4142, 4463, 62978, 6453, 41813, 55110, 25906, 9171, 12993, 58148, 55519, 24154, 33617, 42990, 54563, 57022, 54924, 13736, 18705, 30676, 25507}, 22 - Gravity.getAbsoluteGravity(0, 0), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        n(new char[]{11827, 62048, 7546, 44129, 43238, 9150, 4969, 6160, 3372, 47181, 10300, 55275, 61353, 26099, 43177, 59466, 41186, 33699}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int i4 = 1031 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int keyRepeatTimeout = 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            Object[] objArr6 = new Object[1];
            m($$j[5], (byte) ($$k - 3), (short) 89, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop, i4, keyRepeatTimeout, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int iIndexOf = 1031 - TextUtils.indexOf("", "", 0, 0);
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 15;
                byte b = $$j[7];
                byte b2 = b;
                Object[] objArr7 = new Object[1];
                m(b, b2, (short) (b2 | 37), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iIndexOf, fadingEdgeLength, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr8[3])[0];
            int i6 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
            int i8 = ~i7;
            int i9 = (((~(i8 | (-504409740))) | (~((-748689910) | i8)) | 201328769) * (-397)) + 1185491817 + ((i7 | (-850442111)) * 397) + 549804670;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            n(new char[]{56404, 4386, 52100, 20169, 32978, 38512, 42381, 58568, 56684, 42326, 18053, 54361, 46728, 56720, 59341, 42805, 50821, 21291}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            n(new char[]{13738, 22934, 28338, 65279, 54704, 31226, 21246, 3420, 29515, 23232, 58705, 27372, 10970, 5530, 60739, 24846, 54507, 58483}, 16 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr11 = {220879020};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-16731178) - Color.rgb(0, 0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1134, 18 - View.resolveSize(0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, 549804670, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cBlue = (char) Color.blue(0);
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1031;
                    int iAlpha = 15 - Color.alpha(0);
                    Object[] objArr13 = new Object[1];
                    m($$j[5], (byte) ($$k - 3), (short) 141, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cBlue, keyRepeatDelay, iAlpha, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 45993), 1117 - Color.alpha(0), 17 - View.getDefaultSize(0, 0)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                    int iBlue2 = Color.blue(0) + 1031;
                    int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0', 0, 0);
                    byte b3 = $$j[7];
                    byte b4 = b3;
                    Object[] objArr14 = new Object[1];
                    m(b3, b4, (short) (b4 | 37), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iBlue2, iLastIndexOf, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    n(new char[]{19771, 31631, 37704, 4142, 4463, 62978, 6453, 41813, 55110, 25906, 9171, 12993, 58148, 55519, 24154, 33617, 42990, 54563, 57022, 54924, 13736, 18705, 30676, 25507}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay).substring(0, 5).codePointAt(2) - 58, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    n(new char[]{11827, 62048, 7546, 44129, 43238, 9150, 4969, 6160, 3372, 47181, 10300, 55275, 61353, 26099, 43177, 59466, 41186, 33699}, 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                        int i12 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1030;
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 16;
                        Object[] objArr17 = new Object[1];
                        m($$j[5], (byte) ($$k - 3), (short) 89, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, i12, iLastIndexOf2, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c4 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1031;
                        int mode = View.MeasureSpec.getMode(0) + 15;
                        Object[] objArr18 = new Object[1];
                        m($$j[5], (byte) ($$k - 3), (short) 141, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c4, packedPositionType, mode, 1357589585, false, (String) objArr18[0], null);
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[3])[0];
            int i17 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i18 = (-435157805) + (((~((-823393483) | iIdentityHashCode)) | 579113312) * (-318));
            int i19 = ~(579113312 | iIdentityHashCode);
            int i20 = ~iIdentityHashCode;
            int i21 = i15 + i18 + ((i19 | (~((-42205473) | i20))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode | (-42205473))) | (~(865598954 | i20))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr19[2])[0] = i23 ^ (i23 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i24 = INotificationSideChannelStub + 15;
                INotificationSideChannelDefault = i24 % 128;
                for (int i25 = i24 % 2 == 0 ? 1 : 0; i25 < strArr3.length; i25++) {
                    arrayList.add(strArr3[i25]);
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            Object[] objArr20 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[3])[0];
            int i28 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i29 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i30 = i26 + (-2017159047) + (((~(i29 | 189887867)) | (-54392303)) * (-668)) + ((189887867 | (~((-54392303) | i29))) * 1336) + ((i29 | (-2916485)) * 668);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr20[2])[0] = i32 ^ (i32 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c5 = (char) (29945 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            int doubleTapTimeout = 1755 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int i33 = 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            byte b5 = $$j[5];
            byte b6 = (byte) (b5 | 36);
            Object[] objArr21 = new Object[1];
            m(b5, b6, b6, objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c5, doubleTapTimeout, i33, 986134021, false, (String) objArr21[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i34 = INotificationSideChannelDefault + 107;
            INotificationSideChannelStub = i34 % 128;
            int i35 = i34 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char mode2 = (char) (29944 - View.MeasureSpec.getMode(0));
                int iLastIndexOf3 = 1754 - TextUtils.lastIndexOf("", '0', 0);
                int i36 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22;
                Object[] objArr22 = new Object[1];
                m($$j[5], (byte) ($$k - 3), (short) 89, objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(mode2, iLastIndexOf3, i36, 1599039318, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr23[0])[0]}, new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[1], (String[]) objArr23[4]};
            int i37 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i38 = ((631833220 + (((~(i37 | 813773164)) | 55837202) * 305)) + (((~((~i37) | 813773164)) | 601170738) * 305)) - 502834915;
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr2[3])[0] = i40 ^ (i40 << 5);
        } else {
            Object[] objArr24 = new Object[1];
            n(new char[]{56404, 4386, 52100, 20169, 32978, 38512, 42381, 58568, 56684, 42326, 18053, 54361, 46728, 56720, 59341, 42805, 50821, 21291}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_bca).substring(1, 3).codePointAt(1) - 105, objArr24);
            Class<?> cls4 = Class.forName((String) objArr24[0]);
            Object[] objArr25 = new Object[1];
            n(new char[]{13738, 22934, 28338, 65279, 54704, 31226, 21246, 3420, 29515, 23232, 58705, 27372, 10970, 5530, 60739, 24846, 54507, 58483}, View.MeasureSpec.makeMeasureSpec(0, 0) + 16, objArr25);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr25[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr26 = {220879020};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (MotionEvent.axisFromString("") + 42050), 1726 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113 = ClockHandView$$ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr26), -502834915, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 29945);
                int i41 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1755;
                int doubleTapTimeout2 = 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                Object[] objArr27 = new Object[1];
                m($$j[5], (byte) ($$k - 3), (short) 89, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(bitsPerPixel, i41, doubleTapTimeout2, 1599039318, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr28 = new Object[1];
                n(new char[]{19771, 31631, 37704, 4142, 4463, 62978, 6453, 41813, 55110, 25906, 9171, 12993, 58148, 55519, 24154, 33617, 42990, 54563, 57022, 54924, 13736, 18705, 30676, 25507}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                n(new char[]{11827, 62048, 7546, 44129, 43238, 9150, 4969, 6160, 3372, 47181, 10300, 55275, 61353, 26099, 43177, 59466, 41186, 33699}, 15 - TextUtils.getOffsetBefore("", 0), objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cMyPid = (char) (29944 - (Process.myPid() >> 22));
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1755;
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 23;
                    byte[] bArr = $$j;
                    Object[] objArr30 = new Object[1];
                    m(bArr[5], (byte) ($$k - 3), bArr[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cMyPid, maximumFlingVelocity, tapTimeout, 1596667560, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cAlpha = (char) (29944 - Color.alpha(0));
                    int i42 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1754;
                    int i43 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                    byte b7 = $$j[5];
                    byte b8 = (byte) (b7 | 36);
                    Object[] objArr31 = new Object[1];
                    m(b7, b8, b8, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cAlpha, i42, i43, 986134021, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr2 = objArrTuitionPaymentFragmentbindingInflater1$7879113;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr2[0])[0] != ((int[]) objArr2[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArr2[4];
            if (strArr5 != null) {
                for (String str : strArr5) {
                    arrayList2.add(str);
                }
            }
            throw null;
        }
        int i44 = ((int[]) objArr2[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArr2[0])[0]}, new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[1], (String[]) objArr2[4]};
        int i45 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        int i46 = i44 + 950188177 + (((~(11315683 | i45)) | (-201321976) | (~(201286742 | i45))) * (-744)) + (((~i45) | 11280450) * 744) + ((i45 | 201321975) * 744);
        int i47 = (i46 << 13) ^ i46;
        int i48 = i47 ^ (i47 >>> 17);
        ((int[]) objArr32[3])[0] = i48 ^ (i48 << 5);
    }

    private static void n(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                break;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            char c2 = 1;
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                int i5 = $10 + 115;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                char c3 = cArr3[c2];
                char c4 = cArr3[c];
                int i7 = i4;
                int i8 = (c4 + i3) ^ ((c4 << 4) + ((char) (((long) notify) ^ 8611973335120459638L)));
                int i9 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(INotificationSideChannelStubProxy);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c2] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char doubleTapTimeout = (char) (47773 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        int iBlue = Color.blue(0) + 468;
                        int iResolveSizeAndState = 13 - View.resolveSizeAndState(0, 0, 0);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, iBlue, iResolveSizeAndState, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) cancelAll) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(INotificationSideChannel)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 468 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 13 - TextUtils.getOffsetAfter("", 0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i3 -= 40503;
                    i4 = i7 + 1;
                    c2 = 1;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                int deadChar = 2323 - KeyEvent.getDeadChar(0, 0);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 45;
                byte b = (byte) ($$m[3] + 1);
                byte b2 = b;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup, deadChar, iIndexOf, -1312321721, false, $$u(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
        int i10 = $11 + 5;
        $10 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 68 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i3 = ~(System.identityHashCode(this) | (-1354960059));
        if (i2 != ((((-1607171580) | i3) * (-196)) - 196855180) + ((i3 | 252211521) * 196)) {
            int i4 = INotificationSideChannelDefault + 65;
            INotificationSideChannelStub = i4 % 128;
            if (i4 % 2 != 0) {
                int[] iArr = new int[1426011297];
                iArr[1426011296] = 0;
                Toast.makeText((Context) null, iArr[-1], 0).show();
            } else {
                int[] iArr2 = new int[1426011297];
                iArr2[1426011296] = 1;
                int i5 = 915445920 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 40197106;
        int i8 = ~i7;
        if (i6 != 2004006644 + (((~(1821787026 | i8)) | (-105875696) | (~((-1821787027) | i7))) * (-564)) + ((~(i7 | (-67502211))) * 1128) + (((~((-105875696) | i8)) | 1754284816) * 564)) {
            int i9 = INotificationSideChannelStub + 101;
            INotificationSideChannelDefault = i9 % 128;
            int i10 = i9 % 2;
            int[] iArr3 = new int[189575543];
            iArr3[189575542] = 1;
            int i11 = 140579802 % 2;
            Toast.makeText((Context) null, iArr3[-1], 1).show();
        }
        super.onResume();
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 93;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = (~(841162308 | iIdentityHashCode)) | 8945961;
        int i6 = ~((~iIdentityHashCode) | (-838933505));
        if (i4 != (-920353170) + ((i5 | i6) * (-470)) + (((~(iIdentityHashCode | 850108269)) | i6) * 470)) {
            int i7 = 1351851032 % 2;
            throw new ArithmeticException();
        }
        int i8 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i9 = ~iIdentityHashCode2;
        int i10 = ~((-590368734) | i9);
        int i11 = ~((-1988687232) | iIdentityHashCode2);
        if (i8 != 1385593784 + ((i10 | i11) * 1150) + (((~(1988687231 | i9)) | i11) * (-575)) + (((~(iIdentityHashCode2 | (-590368734))) | (~(i9 | 590368733))) * 575)) {
            int i12 = INotificationSideChannelStub + 29;
            INotificationSideChannelDefault = i12 % 128;
            int i13 = i12 % 2;
            int[] iArr = new int[523220408];
            iArr[523220407] = 1;
            int i14 = (-1419903352) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        super.onStart();
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 73;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 21;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 65;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = INotificationSideChannelDefault + 39;
        INotificationSideChannelStub = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$u(byte r6, short r7, int r8) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.views.uob.UobListActivity.$$m
            int r7 = r7 * 3
            int r7 = 108 - r7
            int r8 = r8 * 3
            int r1 = 1 - r8
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L19
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2c
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r4
            int r7 = r7 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.uob.UobListActivity.$$u(byte, short, int):java.lang.String");
    }
}
