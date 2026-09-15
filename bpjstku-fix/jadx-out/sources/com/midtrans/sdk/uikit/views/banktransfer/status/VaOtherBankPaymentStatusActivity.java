package com.midtrans.sdk.uikit.views.banktransfer.status;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import com.appsflyer.internal.AFg1xSDK;
import com.bpjstku.R;
import com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.CameraUseCaseAdapter;
import defpackage.ViewPortBuilder;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.initSession;
import defpackage.onConnectionFailed;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.sortInDescendingOrder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public class VaOtherBankPaymentStatusActivity extends BaseVaPaymentStatusActivity {
    private String INotificationSideChannel;
    private DefaultTextView INotificationSideChannelStub;
    private DefaultTextView RemoteActionCompatParcelizer;
    private FancyButton cancel;
    private FancyButton cancelAll;
    private String notify;
    private DefaultTextView onTransact;
    private static final byte[] $$x = {22, 102, 43, -6};
    private static final int $$y = 100;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {86, -48, ByteCompanionObject.MIN_VALUE, 88, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$n = 142;
    private static int INotificationSideChannelDefault = 0;
    private static int getInterfaceDescriptor = 1;
    private static int INotificationSideChannelStubProxy = -83722379;

    public static /* synthetic */ String TuitionPaymentFragmentbindingInflater1(VaOtherBankPaymentStatusActivity vaOtherBankPaymentStatusActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 99;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        String str = vaOtherBankPaymentStatusActivity.INotificationSideChannel;
        int i5 = i2 + 13;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static /* synthetic */ sortInDescendingOrder TuitionPaymentFragmentspecialinlinedviewModeldefault1(VaOtherBankPaymentStatusActivity vaOtherBankPaymentStatusActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 53;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        sortInDescendingOrder sortindescendingorder = ((BaseVaPaymentStatusActivity) vaOtherBankPaymentStatusActivity).d;
        if (i3 == 0) {
            return sortindescendingorder;
        }
        throw null;
    }

    public static /* synthetic */ sortInDescendingOrder TuitionPaymentFragmentspecialinlinedviewModeldefault2(VaOtherBankPaymentStatusActivity vaOtherBankPaymentStatusActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 97;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        sortInDescendingOrder sortindescendingorder = ((BaseVaPaymentStatusActivity) vaOtherBankPaymentStatusActivity).d;
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
        return sortindescendingorder;
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3(VaOtherBankPaymentStatusActivity vaOtherBankPaymentStatusActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 19;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        String str = vaOtherBankPaymentStatusActivity.notify;
        int i5 = i2 + 11;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void b(VaOtherBankPaymentStatusActivity vaOtherBankPaymentStatusActivity) {
        boolean z;
        int i;
        int i2 = 2 % 2;
        String string = vaOtherBankPaymentStatusActivity.getString(R.string.message_virtual_account);
        String string2 = vaOtherBankPaymentStatusActivity.INotificationSideChannelStub.getText().toString();
        ClipboardManager clipboardManager = (ClipboardManager) vaOtherBankPaymentStatusActivity.getSystemService("clipboard");
        ClipData clipDataNewPlainText = ClipData.newPlainText(string, string2);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
            z = true;
        } else {
            z = false;
        }
        if (!(!z)) {
            int i3 = INotificationSideChannelDefault + 29;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            i = R.string.copied_to_clipboard;
        } else {
            int i4 = INotificationSideChannelDefault + 37;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            i = R.string.failed_to_copy;
        }
        onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(vaOtherBankPaymentStatusActivity, vaOtherBankPaymentStatusActivity.getString(i));
    }

    public static /* synthetic */ void g(VaOtherBankPaymentStatusActivity vaOtherBankPaymentStatusActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 57;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        vaOtherBankPaymentStatusActivity.setResult(-1);
        vaOtherBankPaymentStatusActivity.finish();
        int i4 = INotificationSideChannelDefault + 17;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void o(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.views.banktransfer.status.VaOtherBankPaymentStatusActivity.$$m
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r6 = r6 + 4
            int r1 = 53 - r8
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.banktransfer.status.VaOtherBankPaymentStatusActivity.o(short, short, short, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity
    public final void a() {
        int i = 2 % 2;
        ((BaseVaPaymentStatusActivity) this).asInterface.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.banktransfer.status.VaOtherBankPaymentStatusActivity.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    if (!TextUtils.isEmpty(VaOtherBankPaymentStatusActivity.TuitionPaymentFragmentbindingInflater1(VaOtherBankPaymentStatusActivity.this)) && !TextUtils.isEmpty(VaOtherBankPaymentStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(VaOtherBankPaymentStatusActivity.this))) {
                        VaOtherBankPaymentStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(VaOtherBankPaymentStatusActivity.this).TuitionPaymentFragmentbindingInflater1(VaOtherBankPaymentStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(VaOtherBankPaymentStatusActivity.this), VaOtherBankPaymentStatusActivity.TuitionPaymentFragmentbindingInflater1(VaOtherBankPaymentStatusActivity.this));
                        VaOtherBankPaymentStatusActivity.g(VaOtherBankPaymentStatusActivity.this);
                    }
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        int i2 = getInterfaceDescriptor + 21;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 5;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        if (((BaseVaPaymentStatusActivity) this).d != null && !TextUtils.isEmpty(this.INotificationSideChannel)) {
            ((BaseVaPaymentStatusActivity) this).d.TuitionPaymentFragmentbindingInflater1("Back", this.INotificationSideChannel);
            int i4 = INotificationSideChannelDefault + 43;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
        setResult(-1);
        finish();
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 != 0) {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        FancyButton fancyButton = this.cancelAll;
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i4 != 0) {
            int i5 = INotificationSideChannelDefault + 13;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            fancyButton.setBorderColor(i4);
        }
        setTextColor(this.cancelAll);
        setTextColor(this.cancel);
        FancyButton fancyButton2 = this.cancel;
        int i7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i7 != 0) {
            fancyButton2.setIconColorFilter(i7);
        }
        setPrimaryBackgroundColor(((BaseVaPaymentStatusActivity) this).asInterface);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 97;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        this.cancel = (FancyButton) findViewById(R.id.button_download_instruction);
        this.cancelAll = (FancyButton) findViewById(R.id.button_copy_va);
        this.RemoteActionCompatParcelizer = (DefaultTextView) findViewById(R.id.text_validity);
        this.INotificationSideChannelStub = (DefaultTextView) findViewById(R.id.text_virtual_account_number);
        this.onTransact = (DefaultTextView) findViewById(R.id.text_va_bank_code);
        int i4 = getInterfaceDescriptor + 73;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1635816518
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity, com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.banktransfer.status.VaOtherBankPaymentStatusActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity, com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 53;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0');
            int iAxisFromString = MotionEvent.axisFromString("") + 16;
            byte[] bArr = $$m;
            byte b = bArr[7];
            Object[] objArr3 = new Object[1];
            o(b, bArr[132], b, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iIndexOf, iAxisFromString, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        p(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlStatusCardWarningTitle).substring(0, 20).length() - 2, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, new char[]{'\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_invalid_phone_number).substring(13, 14).length() + 121, false, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        p(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 112, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step1).substring(0, 1).length() + 14, new char[]{'\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5}, 126 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), false, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRed = (char) Color.red(0);
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1031;
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15;
            byte[] bArr2 = $$m;
            Object[] objArr6 = new Object[1];
            o((short) 52, bArr2[132], bArr2[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed, keyRepeatDelay, scrollDefaultDelay, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = INotificationSideChannelDefault + 101;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                int iMyPid = (Process.myPid() >> 22) + 1031;
                int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0', 0, 0);
                byte b2 = $$m[7];
                Object[] objArr7 = new Object[1];
                o((short) 104, b2, (byte) (b2 | 52), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb, iMyPid, iLastIndexOf, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i7 = ((int[]) objArr8[3])[0];
            int i8 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = 1092659967 + (((~(iIdentityHashCode | 58699489)) | (-185580681)) * (-465)) + ((58699489 | (~((-185580681) | iIdentityHashCode))) * 930) + ((iIdentityHashCode | (-134221833)) * 465) + 1878269495;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            p(8 - (ViewConfiguration.getLongPressTimeout() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 99, new char[]{'\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5}, (KeyEvent.getMaxKeyCode() >> 16) + 121, true, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            p(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 22, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, new char[]{65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534}, 125 - TextUtils.getOffsetBefore("", 0), false, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr11 = {285623871};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 1134 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getScrollBarSize() >> 8) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, 1878269495, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char defaultSize = (char) View.getDefaultSize(0, 0);
                    int iKeyCodeFromString = 1031 - KeyEvent.keyCodeFromString("");
                    int size = 15 - View.MeasureSpec.getSize(0);
                    byte[] bArr3 = $$m;
                    byte b3 = bArr3[7];
                    Object[] objArr13 = new Object[1];
                    o(b3, bArr3[132], b3, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, iKeyCodeFromString, size, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.getTrimmedLength("") + 45993), TextUtils.indexOf("", "", 0) + 1117, 17 - (ViewConfiguration.getTapTimeout() >> 16)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
                    int iResolveSize = 15 - View.resolveSize(0, 0);
                    byte b4 = $$m[7];
                    Object[] objArr14 = new Object[1];
                    o((short) 104, b4, (byte) (b4 | 52), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(doubleTapTimeout, keyRepeatTimeout, iResolveSize, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    p(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 18, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_instruction_step3).substring(3, 4).codePointAt(0) - 75, new char[]{'\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_mandiri_ecash).substring(0, 32).codePointAt(11) + 23, false, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    p(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 32, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_backend_liveness_is_not_configured).substring(0, 64).codePointAt(59) - 17, new char[]{'\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 126, false, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int iResolveSize2 = 1031 - View.resolveSize(0, 0);
                        int iIndexOf2 = 14 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        byte[] bArr4 = $$m;
                        Object[] objArr17 = new Object[1];
                        o((short) 52, bArr4[132], bArr4[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(edgeSlop, iResolveSize2, iIndexOf2, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1031;
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 15;
                        byte[] bArr5 = $$m;
                        byte b5 = bArr5[7];
                        Object[] objArr18 = new Object[1];
                        o(b5, bArr5[132], b5, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(windowTouchSlop, jumpTapTimeout, iResolveSizeAndState, 1357589585, false, (String) objArr18[0], null);
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 == i12) {
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i14 = ((int[]) objArr[2])[0];
            int i15 = ((int[]) objArr[3])[0];
            int i16 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i17 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i18 = i14 + 644797189 + (((~((-135332355) | i17)) | 379612524) * (-828)) + ((i17 | (-135332355)) * (-828)) + 386039416;
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr19[2])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            Object[] objArr20 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[3])[0];
            int i23 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i24 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
            int i25 = i21 + 819599845 + (((~((-181340755) | i24)) | (-62939416)) * (-948)) + ((~((~i24) | (-46137363))) * (-948)) + 676202316;
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr20[2])[0] = i27 ^ (i27 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
            int i28 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
            int edgeSlop2 = 23 - (ViewConfiguration.getEdgeSlop() >> 16);
            byte b6 = $$m[132];
            Object[] objArr21 = new Object[1];
            o((short) 104, b6, (byte) (b6 | 14), objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cMyTid, i28, edgeSlop2, 986134021, false, (String) objArr21[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 29944);
                int trimmedLength = TextUtils.getTrimmedLength("") + 1755;
                int packedPositionGroup = 23 - ExpandableListView.getPackedPositionGroup(0L);
                byte[] bArr6 = $$m;
                Object[] objArr22 = new Object[1];
                o((short) 52, bArr6[132], bArr6[7], objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(tapTimeout, trimmedLength, packedPositionGroup, 1599039318, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr23[0])[0]}, new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[1], (String[]) objArr23[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i29 = ~iIdentityHashCode2;
            int i30 = (-804391003) + (((~((-191769685) | i29)) | 404372110) * (-328)) + ((iIdentityHashCode2 | 404372110) * 164) + (((~(iIdentityHashCode2 | 191769684)) | 269488778 | (~(i29 | (-56886353)))) * 164) + 2125610803;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr2[3])[0] = i32 ^ (i32 << 5);
        } else {
            Object[] objArr24 = new Object[1];
            p(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_atm_bni).substring(0, 7).codePointAt(1) - 76, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 16, new char[]{'\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_now).substring(1, 3).length() + 119, true, objArr24);
            Class<?> cls4 = Class.forName((String) objArr24[0]);
            Object[] objArr25 = new Object[1];
            p((KeyEvent.getMaxKeyCode() >> 16) + 14, 16 - View.MeasureSpec.getSize(0), new char[]{65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_2).substring(5, 6).codePointAt(0) + 93, false, objArr25);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr25[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr26 = {285623871};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - KeyEvent.normalizeMetaState(0)), 1726 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getScrollBarSize() >> 8) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr26), 2125610803, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0'));
                int mode = 1755 - View.MeasureSpec.getMode(0);
                int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23;
                byte[] bArr7 = $$m;
                Object[] objArr27 = new Object[1];
                o((short) 52, bArr7[132], bArr7[7], objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cLastIndexOf, mode, scrollDefaultDelay2, 1599039318, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr28 = new Object[1];
                p(View.MeasureSpec.getMode(0) + 18, ExpandableListView.getPackedPositionGroup(0L) + 22, new char[]{'\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 111, false, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                p(4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{'\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.akulaku_instruction_step4).substring(0, 1).length() + 125, false, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cRgb2 = (char) ((-16747272) - Color.rgb(0, 0, 0));
                    int offsetBefore = 1755 - TextUtils.getOffsetBefore("", 0);
                    int size2 = View.MeasureSpec.getSize(0) + 23;
                    short s = (short) ($$n - 1);
                    byte[] bArr8 = $$m;
                    Object[] objArr30 = new Object[1];
                    o(s, bArr8[132], bArr8[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cRgb2, offsetBefore, size2, 1596667560, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char trimmedLength2 = (char) (TextUtils.getTrimmedLength("") + 29944);
                    int iLastIndexOf2 = 1754 - TextUtils.lastIndexOf("", '0');
                    int i33 = 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b7 = $$m[132];
                    Object[] objArr31 = new Object[1];
                    o((short) 104, b7, (byte) (b7 | 14), objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(trimmedLength2, iLastIndexOf2, i33, 986134021, false, (String) objArr31[0], null);
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
                while (i4 < strArr5.length) {
                    int i34 = getInterfaceDescriptor + 103;
                    INotificationSideChannelDefault = i34 % 128;
                    if (i34 % 2 != 0) {
                        arrayList2.add(strArr5[i4]);
                        i4 += 59;
                    } else {
                        arrayList2.add(strArr5[i4]);
                        i4++;
                    }
                }
            }
            throw null;
        }
        int i35 = INotificationSideChannelDefault + 7;
        getInterfaceDescriptor = i35 % 128;
        int i36 = i35 % 2;
        int i37 = ((int[]) objArr2[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArr2[0])[0]}, new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[1], (String[]) objArr2[4]};
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i38 = ~iFreeMemory;
        int i39 = i37 + (-1863990327) + ((~(944140019 | i38)) * (-560)) + ((~(iFreeMemory | 1004433147)) * (-560)) + (((~((-731537594) | i38)) | 671244465) * 560);
        int i40 = (i39 << 13) ^ i39;
        int i41 = i40 ^ (i40 >>> 17);
        ((int[]) objArr32[3])[0] = i41 ^ (i41 << 5);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0174  */
    /* JADX WARN: Code duplicated, block: B:38:0x0175  */
    private static void p(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i3 + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i6 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(INotificationSideChannelStubProxy)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), TextUtils.lastIndexOf("", '0') + 3292, Color.rgb(0, 0, 0) + 16777247, 1199271174, false, $$z(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (Process.myTid() >> 22) + 651, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44, -450685997, false, $$z(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
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
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i > 0) {
            int i7 = $11 + 125;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            int i9 = $11 + 111;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 651, (Process.myTid() >> 22) + 44, -450685997, false, $$z(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i4 = 29209604;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
        int i11 = $11 + 9;
        $10 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 71 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity, com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i5 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
        if (i4 != 717775224 + (((-69210113) | i5) * 494) + (((~(i5 | (-899962081))) | 831516393) * 494)) {
            throw new RuntimeException("-481666390");
        }
        int i6 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
        int i8 = ~i7;
        if (i6 != ((((~(i8 | (-1733435083))) | ((~((-17523752) | i8)) | android.R.id.mode_out)) * (-397)) - 493019252) + ((i7 | (-1717140206)) * 397)) {
            int i9 = 1228830216 % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i10 = getInterfaceDescriptor + 59;
        INotificationSideChannelDefault = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity, com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 93;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        if (i4 != 542264858 + ((~((-1098949993) | startElapsedRealtime)) * (-301)) + (((~(1803941230 | startElapsedRealtime)) | (~((~startElapsedRealtime) | 973953687))) * (-301)) + (((~(startElapsedRealtime | (-973953688))) | 1803941230) * 301)) {
            throw null;
        }
        int i5 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i6 = ~iIdentityHashCode;
        if (i5 != 1752456668 + ((~(231863362 | i6)) * (-560)) + ((~(iIdentityHashCode | 2111438567)) * (-560)) + (((~((-1947774694) | i6)) | 68199488) * 560)) {
            int i7 = (-928831020) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i8 = INotificationSideChannelDefault + 41;
        getInterfaceDescriptor = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity, com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 73;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$z(short r7, int r8, short r9) {
        /*
            int r9 = 120 - r9
            int r8 = r8 * 4
            int r8 = 1 - r8
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r0 = com.midtrans.sdk.uikit.views.banktransfer.status.VaOtherBankPaymentStatusActivity.$$x
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r4 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = -r7
            int r7 = r7 + r3
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.banktransfer.status.VaOtherBankPaymentStatusActivity.$$z(short, int, short):java.lang.String");
    }
}
