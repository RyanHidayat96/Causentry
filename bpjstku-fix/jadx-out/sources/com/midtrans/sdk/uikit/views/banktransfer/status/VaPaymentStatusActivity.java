package com.midtrans.sdk.uikit.views.banktransfer.status;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import com.bpjstku.R;
import com.bpjstku.data.point.PointDataStore;
import com.midtrans.sdk.corekit.core.PaymentType;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.CameraUseCaseAdapter;
import defpackage.ViewPortBuilder;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import defpackage.onConnectionFailed;
import defpackage.sortInDescendingOrder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes5.dex */
public class VaPaymentStatusActivity extends BaseVaPaymentStatusActivity {
    private String INotificationSideChannel;
    private String cancel;
    private FancyButton cancelAll;
    private DefaultTextView getInterfaceDescriptor;
    private DefaultTextView notify;
    private FancyButton onTransact;
    private static final byte[] $$x = {114, -59, 10, 31};
    private static final int $$y = 84;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {90, 46, 113, 8, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$n = 46;
    private static int read = 0;
    private static int connect = 1;
    private static char INotificationSideChannelStubProxy = 45852;
    private static char RemoteActionCompatParcelizer = 60227;
    private static char INotificationSideChannelStub = 20857;
    private static char INotificationSideChannelDefault = 15529;

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(VaPaymentStatusActivity vaPaymentStatusActivity) {
        int i;
        int i2 = 2 % 2;
        int i3 = connect + 7;
        read = i3 % 128;
        if (i3 % 2 != 0) {
            String string = vaPaymentStatusActivity.getString(R.string.message_virtual_account);
            String string2 = vaPaymentStatusActivity.notify.getText().toString();
            ClipData.newPlainText(string, string2);
            throw null;
        }
        String string3 = vaPaymentStatusActivity.getString(R.string.message_virtual_account);
        String string4 = vaPaymentStatusActivity.notify.getText().toString();
        ClipboardManager clipboardManager = (ClipboardManager) vaPaymentStatusActivity.getSystemService("clipboard");
        ClipData clipDataNewPlainText = ClipData.newPlainText(string3, string4);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
            int i4 = connect + 67;
            read = i4 % 128;
            int i5 = i4 % 2;
            i = R.string.copied_to_clipboard;
        } else {
            i = R.string.failed_to_copy;
        }
        onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(vaPaymentStatusActivity, vaPaymentStatusActivity.getString(i));
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1(VaPaymentStatusActivity vaPaymentStatusActivity) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 97;
        connect = i3 % 128;
        int i4 = i3 % 2;
        String str = vaPaymentStatusActivity.cancel;
        int i5 = i2 + 119;
        connect = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static /* synthetic */ sortInDescendingOrder TuitionPaymentFragmentspecialinlinedviewModeldefault2(VaPaymentStatusActivity vaPaymentStatusActivity) {
        int i = 2 % 2;
        int i2 = read + 47;
        connect = i2 % 128;
        int i3 = i2 % 2;
        sortInDescendingOrder sortindescendingorder = ((BaseVaPaymentStatusActivity) vaPaymentStatusActivity).d;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = connect + 45;
        read = i4 % 128;
        int i5 = i4 % 2;
        return sortindescendingorder;
    }

    public static /* synthetic */ sortInDescendingOrder TuitionPaymentFragmentspecialinlinedviewModeldefault3(VaPaymentStatusActivity vaPaymentStatusActivity) {
        int i = 2 % 2;
        int i2 = read + 41;
        connect = i2 % 128;
        int i3 = i2 % 2;
        sortInDescendingOrder sortindescendingorder = ((BaseVaPaymentStatusActivity) vaPaymentStatusActivity).d;
        int i4 = connect + 101;
        read = i4 % 128;
        if (i4 % 2 == 0) {
            return sortindescendingorder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String b(VaPaymentStatusActivity vaPaymentStatusActivity) {
        int i = 2 % 2;
        int i2 = connect;
        int i3 = i2 + 43;
        read = i3 % 128;
        int i4 = i3 % 2;
        String str = vaPaymentStatusActivity.INotificationSideChannel;
        int i5 = i2 + 83;
        read = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static /* synthetic */ void d(VaPaymentStatusActivity vaPaymentStatusActivity) {
        int i = 2 % 2;
        int i2 = read + 121;
        connect = i2 % 128;
        int i3 = i2 % 2;
        vaPaymentStatusActivity.setResult(-1);
        vaPaymentStatusActivity.finish();
        int i4 = read + 39;
        connect = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void o(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r6 + 1
            int r8 = r8 + 4
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r1 = com.midtrans.sdk.uikit.views.banktransfer.status.VaPaymentStatusActivity.$$m
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2e
        L12:
            r3 = r2
        L13:
            r5 = r8
            r8 = r7
            r7 = r5
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.banktransfer.status.VaPaymentStatusActivity.o(byte, byte, int, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity
    public final void a() {
        int i = 2 % 2;
        ((BaseVaPaymentStatusActivity) this).asInterface.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.banktransfer.status.VaPaymentStatusActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    if (!TextUtils.isEmpty(VaPaymentStatusActivity.b(VaPaymentStatusActivity.this)) && !TextUtils.isEmpty(VaPaymentStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(VaPaymentStatusActivity.this))) {
                        VaPaymentStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(VaPaymentStatusActivity.this).TuitionPaymentFragmentbindingInflater1(VaPaymentStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(VaPaymentStatusActivity.this), VaPaymentStatusActivity.b(VaPaymentStatusActivity.this));
                        VaPaymentStatusActivity.d(VaPaymentStatusActivity.this);
                    }
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        int i2 = connect + 109;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        if (((BaseVaPaymentStatusActivity) this).d != null) {
            int i2 = connect + 109;
            read = i2 % 128;
            int i3 = i2 % 2;
            if (!TextUtils.isEmpty(this.INotificationSideChannel)) {
                ((BaseVaPaymentStatusActivity) this).d.TuitionPaymentFragmentbindingInflater1("Back", this.INotificationSideChannel);
            }
        }
        setResult(-1);
        finish();
        int i4 = read + 47;
        connect = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = connect + 7;
        read = i2 % 128;
        int i3 = i2 % 2;
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        FancyButton fancyButton = this.onTransact;
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i4 != 0) {
            int i5 = connect + 53;
            read = i5 % 128;
            int i6 = i5 % 2;
            fancyButton.setBorderColor(i4);
            int i7 = read + 63;
            connect = i7 % 128;
            int i8 = i7 % 2;
        }
        setTextColor(this.onTransact);
        setTextColor(this.cancelAll);
        FancyButton fancyButton2 = this.cancelAll;
        int i9 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i9 != 0) {
            int i10 = read + 35;
            connect = i10 % 128;
            int i11 = i10 % 2;
            fancyButton2.setIconColorFilter(i9);
        }
        setPrimaryBackgroundColor(((BaseVaPaymentStatusActivity) this).asInterface);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = connect + 45;
        read = i2 % 128;
        int i3 = i2 % 2;
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        this.cancelAll = (FancyButton) findViewById(R.id.button_download_instruction);
        this.onTransact = (FancyButton) findViewById(R.id.button_copy_va);
        this.getInterfaceDescriptor = (DefaultTextView) findViewById(R.id.text_validity);
        this.notify = (DefaultTextView) findViewById(R.id.text_virtual_account_number);
        int i4 = read + 1;
        connect = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0143  */
    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity, com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        Object obj = null;
        int i2 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i2 != (-573117390) + (((~(iIdentityHashCode | 451661650)) | 1141121065) * 305) + (((~((~iIdentityHashCode) | 451661650)) | 1281649193) * 305)) {
            throw null;
        }
        int i3 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i4 = ~iMaxMemory;
        int i5 = (~((-201077923) | i4)) | 37757952;
        int i6 = ~(iMaxMemory | 2080309223);
        int i7 = 932464260 + ((i5 | i6) * (-713)) + (i6 * 1426) + ((~(1916989253 | i4)) * 713);
        byte b = -1;
        if (i3 != i7) {
            int[] iArr = new int[554671752];
            iArr[554671751] = 1;
            int i8 = (-452163144) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_bank_transfer_status);
        this.onTransact.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.banktransfer.status.VaPaymentStatusActivity.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    VaPaymentStatusActivity.TuitionPaymentFragmentbindingInflater1(VaPaymentStatusActivity.this);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.cancelAll.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.banktransfer.status.VaPaymentStatusActivity.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    TransactionResponse transactionResponse = VaPaymentStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(VaPaymentStatusActivity.this).b;
                    String pdfUrl = transactionResponse == null ? "" : transactionResponse.getPdfUrl();
                    VaPaymentStatusActivity vaPaymentStatusActivity = VaPaymentStatusActivity.this;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(pdfUrl));
                    vaPaymentStatusActivity.startActivity(intent);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        String pdfUrl = "";
        if (((BaseVaPaymentStatusActivity) this).d.g()) {
            int i9 = read + 75;
            connect = i9 % 128;
            int i10 = i9 % 2;
            this.getInterfaceDescriptor.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_offer_failure));
            this.getInterfaceDescriptor.setText(getString(R.string.payment_failed));
            this.notify.setText("");
            this.onTransact.setEnabled(false);
            this.cancelAll.setVisibility(8);
        } else {
            this.notify.setText(((BaseVaPaymentStatusActivity) this).d.TuitionPaymentFragmentbindingInflater1());
            this.getInterfaceDescriptor.setText(getString(R.string.text_format_valid_until, ((BaseVaPaymentStatusActivity) this).d.TuitionPaymentFragmentspecialinlinedviewModeldefault2()));
            TransactionResponse transactionResponse = ((BaseVaPaymentStatusActivity) this).d.b;
            if (transactionResponse == null) {
                int i11 = connect + 95;
                read = i11 % 128;
                if (i11 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
            } else {
                pdfUrl = transactionResponse.getPdfUrl();
            }
            if (TextUtils.isEmpty(pdfUrl)) {
                int i12 = read + 11;
                connect = i12 % 128;
                int i13 = i12 % 2;
                this.cancelAll.setVisibility(8);
            }
        }
        String str = ((BaseVaPaymentStatusActivity) this).d.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        str.hashCode();
        str.hashCode();
        switch (str.hashCode()) {
            case -1394897142:
                if (str.equals(PaymentType.BCA_VA)) {
                    b = 0;
                }
                break;
            case -1384500083:
                if (!(!str.equals(PaymentType.BNI_VA))) {
                    int i14 = connect + 97;
                    read = i14 % 128;
                    int i15 = i14 % 2;
                    b = 1;
                }
                break;
            case -1380805999:
                if (str.equals(PaymentType.BRI_VA)) {
                    int i16 = read + 39;
                    connect = i16 % 128;
                    if (i16 % 2 != 0) {
                        b = 2;
                    } else {
                        b = 4;
                    }
                }
                break;
            case -1171137990:
                if (str.equals(PaymentType.ALL_VA)) {
                    b = 3;
                }
                break;
            case -746273556:
                if (str.equals(PaymentType.PERMATA_VA)) {
                    b = 4;
                }
                break;
        }
        if (b == 0) {
            this.cancel = "Done Bank Transfer BCA";
            this.INotificationSideChannel = "Bank Transfer BCA Charge";
            ((BaseVaPaymentStatusActivity) this).d.b("Bank Transfer BCA Charge", false);
            return;
        }
        if (b == 1) {
            this.cancel = "Done Bank Transfer BNI";
            this.INotificationSideChannel = "Bank Transfer BNI Charge";
            ((BaseVaPaymentStatusActivity) this).d.b("Bank Transfer BNI Charge", false);
            return;
        }
        if (b == 2) {
            this.cancel = "Done Bank Transfer BRI";
            this.INotificationSideChannel = "Bank Transfer BRI Charge";
            ((BaseVaPaymentStatusActivity) this).d.b("Bank Transfer BRI Charge", false);
        } else if (b == 3) {
            this.cancel = "Done Bank Transfer All Bank";
            this.INotificationSideChannel = "Bank Transfer Other Charge";
            ((BaseVaPaymentStatusActivity) this).d.b("Bank Transfer Other Charge", false);
        } else {
            if (b != 4) {
                return;
            }
            this.cancel = "Done Bank Transfer Permata";
            this.INotificationSideChannel = "Bank Transfer Permata Charge";
            ((BaseVaPaymentStatusActivity) this).d.b("Bank Transfer Permata Charge", false);
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity, com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cBlue = (char) (29944 - Color.blue(0));
            int iCombineMeasuredStates = 1755 - View.combineMeasuredStates(0, 0);
            int iResolveSize = 23 - View.resolveSize(0, 0);
            byte[] bArr = $$m;
            Object[] objArr2 = new Object[1];
            o((byte) 37, bArr[28], bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, iCombineMeasuredStates, iResolveSize, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cMyPid = (char) ((Process.myPid() >> 22) + 29944);
                int iCombineMeasuredStates2 = 1755 - View.combineMeasuredStates(0, 0);
                int i3 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22;
                Object[] objArr3 = new Object[1];
                o((byte) 52, $$m[28], (short) ($$n & 245), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, iCombineMeasuredStates2, i3, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i4 = ((int[]) objArr4[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{i4}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i6 = 1875001378 + (((~((-234885185) | (~i5))) | 22282758) * (-591)) + ((i5 | (-234885185)) * 591) + 1054774339;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            p(new char[]{12519, 1569, 53844, 45623, 3959, 20191, 13241, 26328, 3286, 41974, 3377, 34163, 4125, 31570, 44435, 35249, 51299, 55007}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            p(new char[]{62450, 40113, 45038, 3431, 44878, 44867, 60597, 62726, 36354, 64026, 23180, 59479, 47277, 49000, 53054, 12793, 62733, 28933}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_xl_tunai).substring(1, 3).codePointAt(0) - 81, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {848983325};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - TextUtils.indexOf("", "")), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1725, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 1054774339, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char offsetAfter = (char) (29944 - TextUtils.getOffsetAfter("", 0));
                    int defaultSize = 1755 - View.getDefaultSize(0, 0);
                    int tapTimeout = 23 - (ViewConfiguration.getTapTimeout() >> 16);
                    Object[] objArr8 = new Object[1];
                    o((byte) 52, $$m[28], (short) ($$n & 245), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetAfter, defaultSize, tapTimeout, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    p(new char[]{51151, 36275, 61284, 31060, 8703, 16692, 7537, 22349, 64583, 58503, 27822, 8535, 23575, 21890, 64989, 3755, 51794, 21573, 58646, 14183, 46207, 54486, 23553, 48349}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    p(new char[]{38625, 28946, 26364, 31494, 43367, 19223, 7532, 54514, 61313, 45845, 55700, 25037, 43051, 44207, 49564, 23581, 41176, 1024}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 94, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 29944);
                        int packedPositionChild = 1754 - ExpandableListView.getPackedPositionChild(0L);
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 24;
                        Object[] objArr11 = new Object[1];
                        o((byte) 52, $$m[28], (short) 88, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, packedPositionChild, modifierMetaStateMask, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                        int iCombineMeasuredStates3 = View.combineMeasuredStates(0, 0) + 1755;
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 23;
                        byte[] bArr2 = $$m;
                        Object[] objArr12 = new Object[1];
                        o((byte) 37, bArr2[28], bArr2[5], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration, iCombineMeasuredStates3, touchSlop, 986134021, false, (String) objArr12[0], null);
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
                int i9 = read + 117;
                connect = i9 % 128;
                int i10 = i9 % 2;
                while (i2 < strArr.length) {
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
            throw null;
        }
        int i11 = connect + 117;
        read = i11 % 128;
        int i12 = i11 % 2;
        int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
        int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        Object[] objArr13 = {new int[]{i14}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i15 = ~iIdentityHashCode;
        int i16 = (~(527640033 | i15)) | (-1065301500) | (~(740242459 | i15));
        int i17 = i13 + (-513758941) + (((~(iIdentityHashCode | (-202580994))) | i16) * 590) + (i16 * (-1180)) + (((~((-740242460) | i15)) | (~(i15 | (-527640034)))) * 590);
        int i18 = (i17 << 13) ^ i17;
        int i19 = i18 ^ (i18 >>> 17);
        ((int[]) objArr13[3])[0] = i19 ^ (i19 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int i20 = 1032 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int iIndexOf = 14 - TextUtils.indexOf((CharSequence) "", '0');
            Object[] objArr14 = new Object[1];
            o((byte) 52, $$m[28], (short) 140, objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, i20, iIndexOf, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        p(new char[]{51151, 36275, 61284, 31060, 8703, 16692, 7537, 22349, 64583, 58503, 27822, 8535, 23575, 21890, 64989, 3755, 51794, 21573, 58646, 14183, 46207, 54486, 23553, 48349}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        p(new char[]{38625, 28946, 26364, 31494, 43367, 19223, 7532, 54514, 61313, 45845, 55700, 25037, 43051, 44207, 49564, 23581, 41176, 1024}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1041).substring(0, 25).codePointAt(22) - 88, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
            int threadPriority = 1031 - ((Process.getThreadPriority(0) + 20) >> 6);
            int deadChar = KeyEvent.getDeadChar(0, 0) + 15;
            Object[] objArr17 = new Object[1];
            o((byte) 52, $$m[28], (short) ($$n & 245), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(mirror, threadPriority, deadChar, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1032;
                int iNormalizeMetaState = 15 - KeyEvent.normalizeMetaState(0);
                byte b = $$m[7];
                byte b2 = b;
                Object[] objArr18 = new Object[1];
                o(b, b2, (short) (b2 | 192), objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cLastIndexOf, bitsPerPixel, iNormalizeMetaState, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i21 = ((int[]) objArr19[3])[0];
            int i22 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i23 = ~iIdentityHashCode2;
            int i24 = ((((-98567639) + ((821909 | i23) * (-192))) + (((~((-192049259) | i23)) | 51409002) * (-384))) + (((~(iIdentityHashCode2 | 192871167)) | ((~(i23 | (-140640257))) | (~((-51409003) | iIdentityHashCode2)))) * DerHeader.TAG_CLASS_PRIVATE)) - 623346633;
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr[2])[0] = i26 ^ (i26 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            p(new char[]{12519, 1569, 53844, 45623, 3959, 20191, 13241, 26328, 3286, 41974, 3377, 34163, 4125, 31570, 44435, 35249, 51299, 55007}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 91, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            p(new char[]{62450, 40113, 45038, 3431, 44878, 44867, 60597, 62726, 36354, 64026, 23180, 59479, 47277, 49000, 53054, 12793, 62733, 28933}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step5).substring(1, 7).codePointAt(0) - 95, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {848983325};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 46038), 1134 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -623346633, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i27 = 1032 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 16;
                Object[] objArr24 = new Object[1];
                o((byte) 52, $$m[28], (short) 140, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(jumpTapTimeout, i27, iIndexOf2, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45994 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 1118, 16 - TextUtils.lastIndexOf("", '0', 0)), Boolean.TYPE});
            }
            Object[] objArr25 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int iMakeMeasureSpec = 1031 - View.MeasureSpec.makeMeasureSpec(0, 0);
                int iRgb = Color.rgb(0, 0, 0) + 16777231;
                byte b3 = $$m[7];
                byte b4 = b3;
                Object[] objArr26 = new Object[1];
                o(b3, b4, (short) (b4 | 192), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(keyRepeatDelay, iMakeMeasureSpec, iRgb, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr25);
            try {
                Object[] objArr27 = new Object[1];
                p(new char[]{51151, 36275, 61284, 31060, 8703, 16692, 7537, 22349, 64583, 58503, 27822, 8535, 23575, 21890, 64989, 3755, 51794, 21573, 58646, 14183, 46207, 54486, 23553, 48349}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                p(new char[]{38625, 28946, 26364, 31494, 43367, 19223, 7532, 54514, 61313, 45845, 55700, 25037, 43051, 44207, 49564, 23581, 41176, 1024}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_payment_cant_open_deeplink).substring(5, 6).codePointAt(0) - 17, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1031;
                    int i28 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14;
                    Object[] objArr29 = new Object[1];
                    o((byte) 52, $$m[28], (short) ($$n & 245), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(packedPositionGroup, iKeyCodeFromString, i28, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                    int packedPositionGroup2 = 1031 - ExpandableListView.getPackedPositionGroup(0L);
                    int i29 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14;
                    Object[] objArr30 = new Object[1];
                    o((byte) 52, $$m[28], (short) 140, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cLastIndexOf2, packedPositionGroup2, i29, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr = objArr25;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i30 = ((int[]) objArr[1])[0];
        int i31 = ((int[]) objArr[3])[0];
        if (i31 != i30) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                while (i2 < strArr3.length) {
                    arrayList2.add(strArr3[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i31));
        }
        int i32 = read + 91;
        connect = i32 % 128;
        int i33 = i32 % 2;
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i34 = ((int[]) objArr[2])[0];
        int i35 = ((int[]) objArr[3])[0];
        int i36 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i37 = ~iIdentityHashCode3;
        int i38 = i34 + (-98567639) + ((673598273 | i37) * (-192)) + (((~(715612135 | i37)) | 286294032) * (-384)) + (((~(iIdentityHashCode3 | (-42013863))) | (~(i37 | 1001906167)) | (~((-286294033) | iIdentityHashCode3))) * DerHeader.TAG_CLASS_PRIVATE);
        int i39 = i38 ^ (i38 << 13);
        int i40 = i39 ^ (i39 >>> 17);
        ((int[]) objArr31[2])[0] = i40 ^ (i40 << 5);
    }

    private static void p(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i4 = $10 + 105;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = 0;
            while (i7 < 16) {
                int i8 = $11 + 97;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) INotificationSideChannelStub) ^ 8611973335120459638L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(INotificationSideChannelDefault);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cKeyCodeFromString = (char) (47773 - KeyEvent.keyCodeFromString(""));
                        int iArgb = 468 - Color.argb(i3, i3, i3, i3);
                        int iCombineMeasuredStates = 13 - View.combineMeasuredStates(i3, i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString, iArgb, iCombineMeasuredStates, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i12 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) INotificationSideChannelStubProxy) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(RemoteActionCompatParcelizer)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 47773), TextUtils.lastIndexOf("", '0', 0, 0) + 469, (-16777203) - Color.rgb(0, 0, 0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i12 + 1;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b = (byte) 0;
                byte b2 = b;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), AndroidCharacter.getMirror('0') + 2275, TextUtils.lastIndexOf("", '0', 0, 0) + 45, -1312321721, false, $$z(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00dd, code lost:
    
        if (r1 != ((((421535764 | r2) * (-374)) + 823720532) + ((r2 | 541067872) * 374))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00df, code lost:
    
        super.onResume();
        r1 = com.midtrans.sdk.uikit.views.banktransfer.status.VaPaymentStatusActivity.read + 113;
        com.midtrans.sdk.uikit.views.banktransfer.status.VaPaymentStatusActivity.connect = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00eb, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ed, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ee, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ef, code lost:
    
        r1 = (-2137330424) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f8, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0100, code lost:
    
        throw new java.lang.RuntimeException("-2122844044");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0060, code lost:
    
        if (r1 == ((((-1476895616) + (((~((~r2) | (-222314501))) | (~((-1108910850) | r2))) * (-302))) + ((~((-222314501) | r2)) * (-604))) + (((~(r2 | (-1331225350))) | (-1610148656)) * 302))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00b6, code lost:
    
        if (r1 == ((((-961401276) + (((-2147467120) | r3) * (-814))) + ((r3 | ((~((~r2) | 1492626979)) | 7799296)) * 407)) + (((~(r2 | (-1492626980))) | ((~((-662639437) | r2)) | 7799296)) * 407))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b8, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = ~((~java.lang.System.identityHashCode(r9)) | 962603636);
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity, com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.banktransfer.status.VaPaymentStatusActivity.onResume():void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity, com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = connect + 35;
        read = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        int i6 = (-528225052) + (((~((-591691590) | i5)) | 1421679132) * (-318));
        int i7 = ~(1421679132 | i5);
        int i8 = ~i5;
        if (i4 != i6 + ((i7 | (~(i8 | (-1421410329)))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i5 | (-1421410329))) | (~(2013101917 | i8))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) {
            int i9 = (-1621552400) % 2;
            throw new ArithmeticException();
        }
        int i10 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMyUid = Process.myUid();
        int i11 = ~iMyUid;
        int i12 = (~((-591844330) | i11)) | 574771553;
        int i13 = ~(iMyUid | 2004284411);
        if (i10 != (-943400558) + ((i12 | i13) * (-502)) + ((i13 | (~(i11 | (-17072777)))) * TypedValues.PositionType.TYPE_DRAWPATH)) {
            throw null;
        }
        super.onStart();
        int i14 = read + 51;
        connect = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity, com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = connect + 97;
        read = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$z(short r7, byte r8, byte r9) {
        /*
            int r9 = r9 * 3
            int r9 = r9 + 108
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r0 = com.midtrans.sdk.uikit.views.banktransfer.status.VaPaymentStatusActivity.$$x
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r7 = r7 + r3
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.banktransfer.status.VaPaymentStatusActivity.$$z(short, byte, byte):java.lang.String");
    }
}
