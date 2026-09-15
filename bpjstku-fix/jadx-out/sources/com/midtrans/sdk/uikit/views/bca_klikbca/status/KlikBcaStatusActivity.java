package com.midtrans.sdk.uikit.views.bca_klikbca.status;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;
import com.bpjstku.R;
import com.google.android.gms.tasks.zzu;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.uikit.abstracts.BaseActivity;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import com.midtrans.sdk.uikit.widgets.SemiBoldTextView;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.initSession;
import defpackage.propagateChildrenTemplate;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class KlikBcaStatusActivity extends BasePaymentActivity {
    private FancyButton INotificationSideChannel;
    private DefaultTextView INotificationSideChannelStub;
    private SemiBoldTextView RemoteActionCompatParcelizer;
    private LinearLayout cancel;
    private AppCompatButton cancelAll;
    private DefaultTextView notify;
    private propagateChildrenTemplate onTransact;
    private static final byte[] $$m = {56, 94, 119, -19};
    private static final int $$n = 194;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {64, 73, -26, 82, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$k = 12;
    private static int getInterfaceDescriptor = 0;
    private static int INotificationSideChannelDefault = 1;
    private static char[] INotificationSideChannelStubProxy = {59708, 59771, 59744, 59746, 59756, 59757, 59756, 59746, 59750, 59740, 59731, 59746, 59751, 59768, 59773, 59757, 59723, 59739, 59770, 59717, 59714, 59757, 59705, 59758, 59746, 59744, 59749, 59771, 59757, 59752, 59728, 59728, 59759, 59751, 59770, 59747, 59757, 59702, 59773, 59762, 59787, 59784, 59768, 59718, 59740, 59772, 59775, 59768, 59729, 59743, 59763, 59763, 59769, 59711, 59756, 59751, 59735, 59731, 59771, 59750, 59740, 59752, 59762, 59770, 59770, 59775, 59751, 59756, 59746};
    private final String d = "KlikBcaStatusActivity";
    private final String asInterface = "KlikBCA";
    private final String g = "Done KlikBCA";

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(KlikBcaStatusActivity klikBcaStatusActivity) {
        Drawable drawable;
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 1;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((BaseActivity) klikBcaStatusActivity).b;
        if (i4 != 0) {
            if (klikBcaStatusActivity.cancel.getVisibility() == 0) {
                int i5 = INotificationSideChannelDefault + 91;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                drawable = ContextCompat.getDrawable(klikBcaStatusActivity, 2131231195);
                klikBcaStatusActivity.cancel.setVisibility(8);
            } else {
                Drawable drawable2 = ContextCompat.getDrawable(klikBcaStatusActivity, 2131231194);
                klikBcaStatusActivity.cancel.setVisibility(0);
                int i7 = getInterfaceDescriptor + 41;
                INotificationSideChannelDefault = i7 % 128;
                int i8 = i7 % 2;
                drawable = drawable2;
            }
            try {
                drawable.setColorFilter(i4, PorterDuff.Mode.SRC_IN);
                klikBcaStatusActivity.cancelAll.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            } catch (RuntimeException e2) {
                String str = klikBcaStatusActivity.d;
                StringBuilder sb = new StringBuilder("changeToggleInstructionVisibility");
                sb.append(e2.getMessage());
                Logger.e(str, sb.toString());
            }
        }
    }

    public static /* synthetic */ propagateChildrenTemplate b(KlikBcaStatusActivity klikBcaStatusActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 35;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        propagateChildrenTemplate propagatechildrentemplate = klikBcaStatusActivity.onTransact;
        int i5 = i3 + 3;
        INotificationSideChannelDefault = i5 % 128;
        int i6 = i5 % 2;
        return propagatechildrentemplate;
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
    private static void m(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r6 + 1
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r7 = r7 + 4
            byte[] r1 = com.midtrans.sdk.uikit.views.bca_klikbca.status.KlikBcaStatusActivity.$$j
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            int r7 = r7 + 1
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.bca_klikbca.status.KlikBcaStatusActivity.m(short, short, short, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        setPrimaryBackgroundColor(this.INotificationSideChannel);
        setTextColor(this.cancelAll);
        int i4 = INotificationSideChannelDefault + 3;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 41;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        propagateChildrenTemplate propagatechildrentemplate = this.onTransact;
        if (propagatechildrentemplate != null) {
            propagatechildrentemplate.TuitionPaymentFragmentbindingInflater1("Back", "KlikBCA");
        }
        super.onBackPressed();
        int i3 = getInterfaceDescriptor + 7;
        INotificationSideChannelDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        this.INotificationSideChannel = (FancyButton) findViewById(R.id.button_primary);
        this.cancelAll = (AppCompatButton) findViewById(R.id.instruction_toggle);
        this.cancel = (LinearLayout) findViewById(R.id.instruction_layout);
        this.notify = (DefaultTextView) findViewById(R.id.text_expiry);
        this.RemoteActionCompatParcelizer = (SemiBoldTextView) findViewById(R.id.text_page_title);
        this.INotificationSideChannelStub = (DefaultTextView) findViewById(R.id.text_status_failed);
        int i4 = getInterfaceDescriptor + 17;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d5, code lost:
    
        if (r1 != ((((-1388002516) + (((~((-566381219) | r2)) | (~((~r2) | 2012674746))) * (-318))) + (((~(937851554 | r2)) | 1074823192) * (-318))) + (((~(r2 | (-937851555))) | (-1641204411)) * androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PIVOT_TARGET))) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d7, code lost:
    
        super.onCreate(r12);
        setContentView(com.bpjstku.R.layout.activity_bca_klikbca_status);
        r11.onTransact = new defpackage.propagateChildrenTemplate();
        r11.INotificationSideChannel.setOnClickListener(new com.midtrans.sdk.uikit.views.bca_klikbca.status.KlikBcaStatusActivity.AnonymousClass2(r11));
        r11.cancelAll.setOnClickListener(new com.midtrans.sdk.uikit.views.bca_klikbca.status.KlikBcaStatusActivity.AnonymousClass3(r11));
        r12 = (com.midtrans.sdk.corekit.models.TransactionResponse) getIntent().getSerializableExtra("extra.status");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0107, code lost:
    
        if (r12 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0109, code lost:
    
        r1 = com.midtrans.sdk.uikit.views.bca_klikbca.status.KlikBcaStatusActivity.INotificationSideChannelDefault + 51;
        com.midtrans.sdk.uikit.views.bca_klikbca.status.KlikBcaStatusActivity.getInterfaceDescriptor = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0112, code lost:
    
        if ((r1 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0114, code lost:
    
        r2 = 73 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x011f, code lost:
    
        if (android.text.TextUtils.isEmpty(r12.getStatusCode()) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x012a, code lost:
    
        if (android.text.TextUtils.isEmpty(r12.getStatusCode()) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0136, code lost:
    
        if (r12.getStatusCode().equals(com.midtrans.sdk.corekit.core.Constants.STATUS_CODE_200) == true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0138, code lost:
    
        r1 = com.midtrans.sdk.uikit.views.bca_klikbca.status.KlikBcaStatusActivity.INotificationSideChannelDefault + 95;
        com.midtrans.sdk.uikit.views.bca_klikbca.status.KlikBcaStatusActivity.getInterfaceDescriptor = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x014b, code lost:
    
        if (r12.getStatusCode().equals(com.midtrans.sdk.corekit.core.Constants.STATUS_CODE_201) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x014d, code lost:
    
        r11.notify.setText(getString(com.bpjstku.R.string.text_format_valid_until, r12.getBcaKlikBcaExpiration()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0162, code lost:
    
        r11.notify.setVisibility(8);
        r11.INotificationSideChannelStub.setText(defpackage.handleMessage.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r11, r12).TuitionPaymentFragmentbindingInflater1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0174, code lost:
    
        r11.INotificationSideChannel.setText(getString(com.bpjstku.R.string.complete_payment_at_klik_bca));
        r11.INotificationSideChannel.setTextBold();
        r11.RemoteActionCompatParcelizer.setText(getString(com.bpjstku.R.string.klik_bca));
        r11.onTransact.b("KlikBCA", getIntent().getBooleanExtra("First Page", true));
        r12 = com.midtrans.sdk.uikit.views.bca_klikbca.status.KlikBcaStatusActivity.getInterfaceDescriptor + 23;
        com.midtrans.sdk.uikit.views.bca_klikbca.status.KlikBcaStatusActivity.INotificationSideChannelDefault = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01ab, code lost:
    
        if ((r12 % 2) != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01ad, code lost:
    
        r12 = 58 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01b0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01b8, code lost:
    
        throw new java.lang.RuntimeException("951209030");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01b9, code lost:
    
        r12 = 1101809526 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01c2, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0052, code lost:
    
        if (r1 == (((((-1050192728) | r7) * (-658)) - 990238024) + ((r7 | (-1069531104)) * 658))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0082, code lost:
    
        if (r1 == ((((-522033256) + (((~((-1686307579) | r8)) | 537002018) * 184)) + ((r7 | (-2005625596)) * (-184))) + ((~((-856320036) | r8)) * 184))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0084, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r12) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.bca_klikbca.status.KlikBcaStatusActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
            int tapTimeout = 1031 - (ViewConfiguration.getTapTimeout() >> 16);
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 15;
            byte[] bArr = $$j;
            Object[] objArr2 = new Object[1];
            m((byte) 52, bArr[132], bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, tapTimeout, threadPriority, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        n(new byte[]{1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1}, new int[]{0, 22, 0, 5}, true, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        n(new byte[]{1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1}, new int[]{22, 15, 0, 1}, true, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cBlue = (char) Color.blue(0);
            int minimumFlingVelocity = 1031 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iGreen = Color.green(0) + 15;
            byte b = (byte) 52;
            Object[] objArr5 = new Object[1];
            m(b, (short) (b - 1), $$j[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, minimumFlingVelocity, iGreen, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = INotificationSideChannelDefault + 119;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int longPressTimeout = 1031 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 15;
                byte b2 = $$j[7];
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                m(b3, (short) (b3 | 103), b2, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, longPressTimeout, windowTouchSlop, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i7 = ((int[]) objArr7[3])[0];
            int i8 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_atm_instruction_5).substring(16, 17).length() - 1061397296;
            int i9 = ((((-1111539135) + ((((~(781328568 | length)) | 38214) | (~((-537048399) | length))) * (-744))) + (((~length) | 244318384) * 744)) + ((length | (-38215)) * 744)) - 695377963;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            n(new byte[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{37, 16, 13, 0}, true, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            n(new byte[]{0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, new int[]{53, 16, 3, 0}, true, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1627511446};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46037 - ExpandableListView.getPackedPositionChild(0L)), 1134 - View.resolveSizeAndState(0, 0, 0), 17 - ((byte) KeyEvent.getModifierMetaStateMask()), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -695377963, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0');
                    int iIndexOf2 = 15 - TextUtils.indexOf("", "");
                    byte[] bArr2 = $$j;
                    Object[] objArr12 = new Object[1];
                    m((byte) 52, bArr2[132], bArr2[5], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iIndexOf, iIndexOf2, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getScrollBarSize() >> 8)), 1116 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), MotionEvent.axisFromString("") + 18), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                    int mirror2 = AndroidCharacter.getMirror('0') + 983;
                    int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte b4 = $$j[7];
                    byte b5 = b4;
                    Object[] objArr13 = new Object[1];
                    m(b5, (short) (b5 | 103), b4, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, mirror2, scrollBarFadeDuration, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    n(new byte[]{1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1}, new int[]{0, 22, 0, 5}, true, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    n(new byte[]{1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1}, new int[]{22, 15, 0, 1}, true, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c3 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int minimumFlingVelocity2 = 1031 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int iMyTid = 15 - (Process.myTid() >> 22);
                        byte b6 = (byte) 52;
                        Object[] objArr16 = new Object[1];
                        m(b6, (short) (b6 - 1), $$j[5], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, minimumFlingVelocity2, iMyTid, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c4 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int i12 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1030;
                        int i13 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15;
                        byte[] bArr3 = $$j;
                        Object[] objArr17 = new Object[1];
                        m((byte) 52, bArr3[132], bArr3[5], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c4, i12, i13, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    int i14 = INotificationSideChannelDefault + 125;
                    getInterfaceDescriptor = i14 % 128;
                    int i15 = i14 % 2;
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 == null) {
                throw null;
            }
            while (i4 < strArr2.length) {
                arrayList.add(strArr2[i4]);
                i4++;
            }
            throw null;
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i16 = ((int[]) objArr[2])[0];
        int i17 = ((int[]) objArr[3])[0];
        int i18 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i19 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1785250803;
        int i20 = i16 + 1550919305 + (((~(i19 | (-422583433))) | (-666863603)) * (-465)) + (((-422583433) | (~((-666863603) | i19))) * 930) + ((i19 | (-19924097)) * 465);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr18[2])[0] = i22 ^ (i22 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c5 = (char) (29945 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int i23 = 1756 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int maximumDrawingCacheSize = 23 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte b7 = (byte) 37;
            Object[] objArr19 = new Object[1];
            m(b7, (short) (b7 | 66), $$j[5], objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c5, i23, maximumDrawingCacheSize, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i24 = INotificationSideChannelDefault + 45;
            getInterfaceDescriptor = i24 % 128;
            int i25 = i24 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 29944);
                int i26 = 1756 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0') + 24;
                byte b8 = (byte) 52;
                Object[] objArr20 = new Object[1];
                m(b8, (short) (b8 - 1), $$j[5], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(packedPositionType, i26, iIndexOf3, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i27 = ((int[]) objArr21[0])[0];
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{i27}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i28 = 2129672011 + (((~((-118964966) | iIdentityHashCode)) | 33751201 | (~(93637460 | iIdentityHashCode))) * (-754));
            int i29 = ~((-33751202) | iIdentityHashCode);
            int i30 = ~iIdentityHashCode;
            int i31 = ((i28 + ((i29 | (~(127388661 | i30))) * (-754))) + ((i30 | (-118964966)) * 754)) - 396931428;
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i33 ^ (i33 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            n(new byte[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{37, 16, 13, 0}, true, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            n(new byte[]{0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, new int[]{53, 16, 3, 0}, true, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {1627511446};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - (ViewConfiguration.getWindowTouchSlop() >> 8)), ExpandableListView.getPackedPositionChild(0L) + 1727, 29 - (ViewConfiguration.getTouchSlop() >> 8), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), -396931428, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char capsMode = (char) (29944 - TextUtils.getCapsMode("", 0, 0));
                int iIndexOf4 = TextUtils.indexOf("", "", 0) + 1755;
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 23;
                byte b9 = (byte) 52;
                Object[] objArr25 = new Object[1];
                m(b9, (short) (b9 - 1), $$j[5], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(capsMode, iIndexOf4, absoluteGravity, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr26 = new Object[1];
                n(new byte[]{1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1}, new int[]{0, 22, 0, 5}, true, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                n(new byte[]{1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1}, new int[]{22, 15, 0, 1}, true, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 29944);
                    int i34 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1755;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 24;
                    Object[] objArr28 = new Object[1];
                    m((byte) 52, (short) ($$k | 128), $$j[5], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(offsetAfter, i34, iLastIndexOf, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 29944);
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1755;
                    int i35 = 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    byte b10 = (byte) 37;
                    Object[] objArr29 = new Object[1];
                    m(b10, (short) (b10 | 66), $$j[5], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(packedPositionGroup, iCombineMeasuredStates, i35, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i36 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i37 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i37 != i36) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr4 != null) {
                while (i4 < strArr4.length) {
                    int i38 = getInterfaceDescriptor + 111;
                    INotificationSideChannelDefault = i38 % 128;
                    if (i38 % 2 == 0) {
                        arrayList2.add(strArr4[i4]);
                        i4 += 108;
                    } else {
                        arrayList2.add(strArr4[i4]);
                        i4++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i37));
        }
        int i39 = getInterfaceDescriptor + 83;
        INotificationSideChannelDefault = i39 % 128;
        int i40 = i39 % 2;
        int i41 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        int i42 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        Object[] objArr30 = {new int[]{i42}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i43 = ~((-444092302) | iIdentityHashCode2);
        int i44 = 304826693 + ((138952961 | i43) * (-280)) + ((i43 | (~(231489875 | iIdentityHashCode2))) * 140);
        int i45 = ~((-305139341) | iIdentityHashCode2);
        int i46 = ~iIdentityHashCode2;
        int i47 = i41 + i44 + (((~(i46 | 536629215)) | i45 | (~((-138952962) | i46))) * 140);
        int i48 = (i47 << 13) ^ i47;
        int i49 = i48 ^ (i48 >>> 17);
        ((int[]) objArr30[3])[0] = i49 ^ (i49 << 5);
    }

    private static void n(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = INotificationSideChannelStubProxy;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = new Object[i5];
                    objArr2[i3] = Integer.valueOf(cArr[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int packedPositionType = 1270 - ExpandableListView.getPackedPositionType(j);
                        int i10 = 19 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1));
                        byte b = (byte) i3;
                        byte b2 = (byte) (b + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop, packedPositionType, i10, 407021364, false, $$u(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i9++;
                    i3 = 0;
                    i5 = 1;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i4, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i6) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i11 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3225, TextUtils.getOffsetAfter("", 0) + 13, 2133916302, false, $$u(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (29943 - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1755, 23 - Color.alpha(0), 387247676, false, $$u(b5, b6, (byte) (b6 - 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1705 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (Process.myPid() >> 22) + 21, -1434471773, false, $$u(b7, (byte) (b7 | 6), b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            int i13 = $11 + 121;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i15 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i15, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i15);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i6];
            while (true) {
                setvideostabilizationmode.b = i;
                if (setvideostabilizationmode.b >= i6) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr3[(i6 - setvideostabilizationmode.b) - 1];
                i = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i16 = $10 + 113;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            int i18 = 0;
            loop3: while (true) {
                setvideostabilizationmode.b = i18;
                while (true) {
                    if (setvideostabilizationmode.b >= i6) {
                        break loop3;
                    }
                    int i19 = $10 + 53;
                    $11 = i19 % 128;
                    if (i19 % 2 == 0) {
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] + iArr[2]);
                        setvideostabilizationmode.b--;
                    }
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i18 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 41;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null);
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i4 = ~layoutDirection;
            int i5 = (~((-362330200) | i4)) | 84938758;
            int i6 = ~(layoutDirection | 1469709183);
            if (i3 != (-467567266) + ((i5 | i6) * (-713)) + (i6 * 1426) + ((~(1192317742 | i4)) * 713)) {
                throw null;
            }
        } else {
            int i7 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iMyUid = Process.myUid();
            if (i7 != 1855863560 + (((~((-272868690) | (~iMyUid))) | (~((-1102856233) | iMyUid))) * (-272)) + (((~((-474201428) | iMyUid)) | 201332738) * (-272)) + (((~(iMyUid | 474201427)) | (-1304188971)) * 272)) {
                throw null;
            }
        }
        int i8 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2043963678;
        int i10 = ~(1717489084 | i9);
        int i11 = ~i9;
        if (i8 != 422621688 + ((i10 | (~((-1715915941) | i11))) * (-406)) + ((~(1717493693 | i11)) * (-406)) + (((~(i9 | (-1577754))) | (~((-1717489085) | i11))) * 406)) {
            throw null;
        }
        super.onResume();
        int i12 = INotificationSideChannelDefault + 97;
        getInterfaceDescriptor = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b6, code lost:
    
        if (r1 != (((((~(r2 | 1040969963)) | 1538086001) * 56) - 407916452) + (((~((~r2) | 1538086001)) | 1040969963) * 56))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b8, code lost:
    
        super.onStart();
        r1 = com.midtrans.sdk.uikit.views.bca_klikbca.status.KlikBcaStatusActivity.INotificationSideChannelDefault + 29;
        com.midtrans.sdk.uikit.views.bca_klikbca.status.KlikBcaStatusActivity.getInterfaceDescriptor = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00cc, code lost:
    
        throw new java.lang.RuntimeException("-900170784");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00cd, code lost:
    
        r1 = 370500950 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d6, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003d, code lost:
    
        if (r1 == ((((-285595074) + ((~(1654626516 | r5)) * 979)) + ((r4 | 824638973) * (-979))) + (((~(r4 | 1654626516)) | (~(r5 | 824638973))) * 979))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008f, code lost:
    
        if (r1 == (((1312266488 + (((~(1485935797 | r5)) | (~((-655948255) | r4))) * (-370))) + ((((~(r4 | 1485935797)) | (~(r5 | (-655948255)))) | 1484850209) * (-370))) - 361236558)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0091, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r10);
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.bca_klikbca.status.KlikBcaStatusActivity.onStart():void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 123;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        int i5 = INotificationSideChannelDefault + 79;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    private static String $$u(short s, int i, int i2) {
        byte[] bArr = $$m;
        int i3 = s * 3;
        int i4 = (i2 * 3) + 4;
        int i5 = i + 99;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        int i7 = -1;
        if (bArr == null) {
            i4++;
            i5 += -i4;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            byte b = bArr[i4];
            i4++;
            i5 += -b;
        }
    }
}
