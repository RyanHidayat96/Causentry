package com.midtrans.sdk.uikit.views.banktransfer.status;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
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
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.bpjstku.R;
import com.datadog.android.core.internal.persistence.file.FileExtKt$readLinesSafe$1;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.EncoderImplByteBufferInput;
import defpackage.SessionProcessor;
import defpackage.ViewPortBuilder;
import defpackage.calculateCameraUseCases;
import defpackage.createExtraPreview;
import defpackage.deInitSession;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl;
import defpackage.onConnectionFailed;
import defpackage.sortInDescendingOrder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
public class MandiriBillStatusActivity extends BaseVaPaymentStatusActivity {
    private DefaultTextView INotificationSideChannelStub;
    private DefaultTextView INotificationSideChannelStubProxy;
    private FancyButton cancelAll;
    private DefaultTextView getInterfaceDescriptor;
    private FancyButton notify;
    private FancyButton onTransact;
    private static final byte[] $$x = {89, 92, -72, 43};
    private static final int $$y = 18;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {12, -88, 33, 118, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$n = 152;
    private static int MediaBrowserCompat = 0;
    private static int read = 1;
    private static long RemoteActionCompatParcelizer = -6377398940819159759L;
    private static int INotificationSideChannelDefault = -981105359;
    private static char write = 40037;
    private final String cancel = "Bank Transfer Mandiri Charge";
    private final String INotificationSideChannel = "Done Bank Transfer Mandiri";

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i5);
        int i9 = (~(i7 | (~i5) | i2)) | (~(i2 | i3 | i5));
        int i10 = ~i2;
        int i11 = (~(i5 | i3)) | (~(i10 | i5)) | (~(i10 | i3));
        int i12 = i2 + i3 + i + (1698977638 * i4) + (1466394737 * i6);
        int i13 = i12 * i12;
        int i14 = (((-1250291696) * i2) - 490274816) + ((-1116082190) * i3) + (i8 * (-67104753)) + ((-67104753) * i9) + (67104753 * i11) + ((-1183186944) * i) + (1553727488 * i4) + (1859780608 * i6) + (925827072 * i13);
        int i15 = ((i2 * (-1787956080)) - 1478154965) + (i3 * (-1787955198)) + (i8 * (-441)) + (i9 * (-441)) + (i11 * 441) + (i * (-1787955639)) + (i4 * 552005654) + (i6 * (-2013897159)) + (i13 * (-429457408));
        return i14 + ((i15 * i15) * (-402587648)) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : b(objArr);
    }

    public static /* synthetic */ sortInDescendingOrder TuitionPaymentFragmentbindingInflater1(MandiriBillStatusActivity mandiriBillStatusActivity) {
        int i = 2 % 2;
        int i2 = read + 7;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        sortInDescendingOrder sortindescendingorder = ((BaseVaPaymentStatusActivity) mandiriBillStatusActivity).d;
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
        return sortindescendingorder;
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(MandiriBillStatusActivity mandiriBillStatusActivity, String str, String str2) {
        int i = 2 % 2;
        int i2 = read + 31;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        ClipboardManager clipboardManager = (ClipboardManager) mandiriBillStatusActivity.getSystemService("clipboard");
        ClipData clipDataNewPlainText = ClipData.newPlainText(str, str2);
        if (clipboardManager == null) {
            return false;
        }
        int i4 = read + 49;
        MediaBrowserCompat = i4 % 128;
        if (i4 % 2 != 0) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
            return false;
        }
        clipboardManager.setPrimaryClip(clipDataNewPlainText);
        return true;
    }

    public static /* synthetic */ DefaultTextView TuitionPaymentFragmentspecialinlinedviewModeldefault1(MandiriBillStatusActivity mandiriBillStatusActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 43;
        int i3 = i2 % 128;
        read = i3;
        int i4 = i2 % 2;
        DefaultTextView defaultTextView = mandiriBillStatusActivity.INotificationSideChannelStubProxy;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 113;
        MediaBrowserCompat = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return defaultTextView;
    }

    public static /* synthetic */ sortInDescendingOrder TuitionPaymentFragmentspecialinlinedviewModeldefault2(MandiriBillStatusActivity mandiriBillStatusActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 53;
        read = i2 % 128;
        int i3 = i2 % 2;
        sortInDescendingOrder sortindescendingorder = ((BaseVaPaymentStatusActivity) mandiriBillStatusActivity).d;
        if (i3 != 0) {
            return sortindescendingorder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(MandiriBillStatusActivity mandiriBillStatusActivity) {
        int i = 2 % 2;
        int i2 = read + 105;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 != 0) {
            mandiriBillStatusActivity.setResult(-1);
            mandiriBillStatusActivity.finish();
            int i3 = 44 / 0;
        } else {
            mandiriBillStatusActivity.setResult(-1);
            mandiriBillStatusActivity.finish();
        }
        int i4 = read + 109;
        MediaBrowserCompat = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ DefaultTextView b(MandiriBillStatusActivity mandiriBillStatusActivity) {
        int i = 2 % 2;
        int i2 = read + 37;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        DefaultTextView defaultTextView = mandiriBillStatusActivity.getInterfaceDescriptor;
        if (i3 == 0) {
            return defaultTextView;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        r7 = com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.MediaBrowserCompat + 93;
        com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.read = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if ((r7 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        r1.setPrimaryClip(r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity r1 = (com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity) r1
            r2 = 1
            r3 = r7[r2]
            java.lang.String r3 = (java.lang.String) r3
            r4 = 2
            r7 = r7[r4]
            java.lang.String r7 = (java.lang.String) r7
            int r5 = r4 % r4
            int r5 = com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.read
            int r5 = r5 + 91
            int r6 = r5 % 128
            com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.MediaBrowserCompat = r6
            int r5 = r5 % r4
            java.lang.String r6 = "clipboard"
            if (r5 == 0) goto L2e
            java.lang.Object r1 = r1.getSystemService(r6)
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1
            android.content.ClipData r7 = android.content.ClipData.newPlainText(r3, r7)
            r3 = 66
            int r3 = r3 / r0
            if (r1 == 0) goto L42
            goto L3a
        L2e:
            java.lang.Object r1 = r1.getSystemService(r6)
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1
            android.content.ClipData r7 = android.content.ClipData.newPlainText(r3, r7)
            if (r1 == 0) goto L42
        L3a:
            r1.setPrimaryClip(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        L42:
            int r7 = com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.MediaBrowserCompat
            int r7 = r7 + 93
            int r1 = r7 % 128
            com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.read = r1
            int r7 = r7 % r4
            if (r7 == 0) goto L52
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            return r7
        L52:
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.b(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void o(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r9 = r9 + 4
            int r7 = 53 - r7
            byte[] r0 = com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.$$m
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r9
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2a:
            int r8 = -r8
            int r9 = r9 + r8
            int r8 = r9 + (-11)
            r9 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.o(int, byte, int, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity
    public final void a() {
        int i = 2 % 2;
        ((BaseVaPaymentStatusActivity) this).asInterface.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    MandiriBillStatusActivity.TuitionPaymentFragmentbindingInflater1(MandiriBillStatusActivity.this).TuitionPaymentFragmentbindingInflater1("Done Bank Transfer Mandiri", "Bank Transfer Mandiri Charge");
                    MandiriBillStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(MandiriBillStatusActivity.this);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        int i2 = MediaBrowserCompat + 103;
        read = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v5 sortInDescendingOrder) = (r1v4 sortInDescendingOrder), (r1v10 sortInDescendingOrder) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        sortInDescendingOrder sortindescendingorder;
        int i = 2 % 2;
        int i2 = read + 55;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 != 0) {
            sortindescendingorder = ((BaseVaPaymentStatusActivity) this).d;
            int i3 = 79 / 0;
            if (sortindescendingorder != null) {
                int i4 = read + 109;
                MediaBrowserCompat = i4 % 128;
                int i5 = i4 % 2;
                sortindescendingorder.TuitionPaymentFragmentbindingInflater1("Back", "Bank Transfer Mandiri Charge");
            }
        } else {
            sortindescendingorder = ((BaseVaPaymentStatusActivity) this).d;
            if (sortindescendingorder != null) {
                int i6 = read + 109;
                MediaBrowserCompat = i6 % 128;
                int i7 = i6 % 2;
                sortindescendingorder.TuitionPaymentFragmentbindingInflater1("Back", "Bank Transfer Mandiri Charge");
            }
        }
        setResult(-1);
        finish();
        int i8 = read + 35;
        MediaBrowserCompat = i8 % 128;
        int i9 = i8 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        MandiriBillStatusActivity mandiriBillStatusActivity = (MandiriBillStatusActivity) objArr[0];
        int i = 2 % 2;
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        FancyButton fancyButton = mandiriBillStatusActivity.cancelAll;
        int i2 = mandiriBillStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object obj = null;
        if (i2 != 0) {
            int i3 = read + 23;
            MediaBrowserCompat = i3 % 128;
            if (i3 % 2 != 0) {
                fancyButton.setBorderColor(i2);
                obj.hashCode();
                throw null;
            }
            fancyButton.setBorderColor(i2);
        }
        mandiriBillStatusActivity.setTextColor(mandiriBillStatusActivity.cancelAll);
        FancyButton fancyButton2 = mandiriBillStatusActivity.notify;
        int i4 = mandiriBillStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i4 != 0) {
            fancyButton2.setBorderColor(i4);
            int i5 = read + 115;
            MediaBrowserCompat = i5 % 128;
            int i6 = i5 % 2;
        }
        mandiriBillStatusActivity.setTextColor(mandiriBillStatusActivity.notify);
        mandiriBillStatusActivity.setTextColor(mandiriBillStatusActivity.onTransact);
        FancyButton fancyButton3 = mandiriBillStatusActivity.onTransact;
        int i7 = mandiriBillStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i7 != 0) {
            int i8 = read + 19;
            MediaBrowserCompat = i8 % 128;
            int i9 = i8 % 2;
            fancyButton3.setIconColorFilter(i7);
        }
        mandiriBillStatusActivity.setPrimaryBackgroundColor(((BaseVaPaymentStatusActivity) mandiriBillStatusActivity).asInterface);
        return null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 77;
        read = i2 % 128;
        int i3 = i2 % 2;
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        this.notify = (FancyButton) findViewById(R.id.button_copy_company_code);
        this.cancelAll = (FancyButton) findViewById(R.id.button_copy_bill_pay);
        this.onTransact = (FancyButton) findViewById(R.id.button_download_instruction);
        this.getInterfaceDescriptor = (DefaultTextView) findViewById(R.id.text_bill_pay_code);
        this.INotificationSideChannelStubProxy = (DefaultTextView) findViewById(R.id.text_company_code);
        this.INotificationSideChannelStub = (DefaultTextView) findViewById(R.id.text_validity);
        int i4 = MediaBrowserCompat + 93;
        read = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity, com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException {
        String companyCode;
        int i = 2 % 2;
        int i2 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        if (i2 != ((461955274 + (((-6440071) | i3) * (-381))) + (((~((~i3) | (-954396551))) | 1065925417) * 381)) - 1841300626) {
            int i4 = (-168769746) % 2;
            throw new ArithmeticException();
        }
        int i5 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        if (i5 != (-1798936063) + (((~(i6 | 1706853391)) | (-872202574)) * (-465)) + ((1706853391 | (~((-872202574) | i6))) * 930) + ((i6 | (-306200897)) * 465)) {
            throw new RuntimeException("-1205502532");
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_mandiri_bill_status);
        this.cancelAll.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.2
            private static final byte[] $$c = {99, -43, -44, -62};
            private static final int $$f = 178;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {30, 17, -35, 104, -11, 60, -73, 8, -1, -7, -22, 6, -18, 12, -24, 69, -64, -10, -11, 10, -18, -1, 8, -16, 57, -61, -20, 2, 6, -22, 6, -11, -4, -10, 64, -29, -52, 2, 6, -22, 6, -11, -4, -10, 74, -72, -3, -20, 28, -23, -19, -5, 5, -11, -4, 21, -32, -1, 1, -14, -38, 7, -16, 6, -11, -4, 25, -22, -29, 7, 3, -14, -11, 41, -49, 12, -11, -11, 3, -14, -11, -4, -2, 6, -3, -11, 3, -16, -2, -10, -3, -2, -10, 4, -4, -23, 8, -1, -23, 37, -39, 6, -6, -12, 3, -6, -6, 0, -25, 4, -13, 60};
            private static final int $$e = 106;
            private static final byte[] $$a = {25, 31, 20, 1, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 161;
            private static int asInterface = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f853a = 1;
            private static char[] b = {57186, 57189, 57191, 60047, 60088, 57190, 60062, 60058, 60105, 60041, 60109, 60053, 60108, 60034, 60054, 60035, 60098, 60118, 60060, 60116, 57195, 57197, 60110, 60052, 60040, 60090, 60117, 60048, 60072, 60057, 57194, 60099, 57188, 57184, 60050, 60107, 60043, 60106, 57187, 60061, 60111, 60046, 60104, 57192, 57193, 60063, 60055, 60056, 60082};
            private static char TuitionPaymentFragmentbindingInflater1 = 57190;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {29171, 48473, 59569, 5135, 17257, 36572, 47648, 59825, 5355, 16460, 36772, 47843, 58971, 5564, 16665, 10100, 60376, 48695, 17038, 5622, 55379, 60579, 48974, 17004, 5854, 55611, 60474, 45296, 17201, 6027, 56049, 60755, 45487, 17431, 6005, 56317, 60962, 45413, 17877, 2108, 56474, 59892, 9537, 28835, 35852, 56190, 5846, 8753, 29091, 36095, 55388, 6053, 8959, 32336, 36273, 55561, 5235, 9160, 32554, 18197, 35773, 56911, 8951, 30173, 47164, 36044, 57188, 8704, 30442, 47474, 35847, 53416, 9036, 30704, 47775, 45557, 32091, 10431, 54299, 33636, 20186, 31290, 10640, 54476, 32838, 20401, 31477, 9851, 54708, 33042, 19572, 45567, 32094, 10430, 54339, 33568, 20102, 31276, 10718, 54497, 32833, 20466, 31487, 9821, 54761, 33040, 19493, 31646, 10108, 53980, 33206, 19733, 30964, 10232, 54031, 40630, 19011, 31088, 9364, 53371, 40914, 19135, 30233, 9669, 53501, 39951, 19428, 30532, 8822, 53711, 40315, 18646, 30690, 9028, 61131, 40367, 18703, 29925, 8258, 61237, 39628, 18035, 30172, 8418, 60439, 39885, 18091, 29271, 8625, 60736, 38969, 18377, 29563, 16080, 60903, 45563, 32090, 10414, 54324, 33632, 20163, 31266, 10624, 54503, 32838, 20406, 31476, 9815, 54709, 33087, 19583, 31690, 10016, 20826, 40435, 51227, 13490, 25539, 13338, 63652, 44288, 20965, 1665, 52005, 65487, 44154, 20759, 1458, 51796, 65285, 41897};
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 5298262392068865343L;

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(short r6, int r7, short r8, java.lang.Object[] r9) {
                /*
                    int r0 = r7 + 1
                    byte[] r1 = com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.AnonymousClass2.$$a
                    int r6 = r6 * 14
                    int r6 = 98 - r6
                    int r8 = r8 * 52
                    int r8 = 159 - r8
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L15
                    r6 = r7
                    r3 = r8
                    r4 = r2
                    goto L2d
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    int r8 = r8 + 1
                    if (r3 != r7) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L25:
                    r4 = r1[r8]
                    int r3 = r3 + 1
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2d:
                    int r8 = -r8
                    int r6 = r6 + r8
                    int r6 = r6 + (-11)
                    r8 = r3
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.AnonymousClass2.c(short, int, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void f(short r7, int r8, int r9, java.lang.Object[] r10) {
                /*
                    int r8 = r8 * 21
                    int r8 = r8 + 84
                    int r7 = r7 * 4
                    int r7 = 57 - r7
                    byte[] r0 = com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.AnonymousClass2.$$d
                    int r9 = r9 * 56
                    int r9 = 59 - r9
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r9
                    r4 = r2
                    r9 = r7
                    goto L2f
                L17:
                    r3 = r2
                L18:
                    int r4 = r3 + 1
                    int r9 = r9 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r7) goto L29
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L29:
                    r3 = r0[r9]
                    r6 = r9
                    r9 = r8
                    r8 = r3
                    r3 = r6
                L2f:
                    int r8 = -r8
                    int r9 = r9 + r8
                    int r8 = r9 + (-5)
                    r9 = r3
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.AnonymousClass2.f(short, int, int, java.lang.Object[]):void");
            }

            private static void e(char c, int i7, int i8, Object[] objArr) throws Throwable {
                long j;
                int i9 = 2 % 2;
                lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                long[] jArr = new long[i8];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i10 = $11 + 19;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                while (true) {
                    j = 0;
                    if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i8) {
                        break;
                    }
                    int i12 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    try {
                        Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i7 + i12])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) (-1);
                            byte b3 = (byte) (b2 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - Process.getGidForName("")), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2186, ExpandableListView.getPackedPositionType(0L) + 40, 841711447, false, $$g(b2, b3, (byte) (b3 | 7)), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i12), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) (-1);
                            byte b5 = (byte) (b4 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 33017), (ViewConfiguration.getTouchSlop() >> 8) + 3011, 26 - TextUtils.indexOf("", ""), 321985076, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i12] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) (-1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 3376, 17 - (KeyEvent.getMaxKeyCode() >> 16), -968507904, false, $$g(b6, (byte) (b6 + 1), (byte) $$c.length), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr = new char[i8];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i8) {
                    int i13 = $11 + 55;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    try {
                        Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b7 = (byte) (-1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36504 - TextUtils.lastIndexOf("", '0', 0)), 3376 - (Process.myPid() >> 22), 17 - ExpandableListView.getPackedPositionType(j), -968507904, false, $$g(b7, (byte) (b7 + 1), (byte) $$c.length), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        j = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new String(cArr);
            }

            private static void d(char[] cArr, byte b2, int i7, Object[] objArr) throws Throwable {
                int i8;
                Object obj;
                char c;
                int length;
                char[] cArr2;
                int i9 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr3 = b;
                int i10 = 1770390596;
                Object obj2 = null;
                int i11 = -1;
                if (cArr3 != null) {
                    int i12 = $10 + 23;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        length = cArr3.length;
                        cArr2 = new char[length];
                    } else {
                        length = cArr3.length;
                        cArr2 = new char[length];
                    }
                    int i13 = 0;
                    while (i13 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr3[i13])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i10);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b3 = (byte) i11;
                                byte b4 = (byte) (b3 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.blue(0), TextUtils.indexOf((CharSequence) "", '0') + 2268, View.combineMeasuredStates(0, 0) + 33, -1927765101, false, $$g(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE});
                            }
                            cArr2[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i13++;
                            i10 = 1770390596;
                            i11 = -1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr3 = cArr2;
                }
                Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.getCapsMode("", 0, 0) + 2267, 33 - TextUtils.indexOf("", ""), -1927765101, false, $$g(b5, b6, (byte) (b6 + 3)), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i7];
                char c2 = 3;
                if (i7 % 2 != 0) {
                    int i14 = $11 + 3;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    i8 = i7 - 1;
                    cArr4[i8] = (char) (cArr[i8] - b2);
                } else {
                    i8 = i7;
                }
                if (i8 > 1) {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i8) {
                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                            obj = obj2;
                            c = c2;
                        } else {
                            Object[] objArr4 = new Object[13];
                            objArr4[12] = deinitsession;
                            objArr4[11] = Integer.valueOf(cCharValue);
                            objArr4[10] = deinitsession;
                            objArr4[9] = deinitsession;
                            objArr4[8] = Integer.valueOf(cCharValue);
                            objArr4[7] = deinitsession;
                            objArr4[6] = deinitsession;
                            objArr4[5] = Integer.valueOf(cCharValue);
                            objArr4[4] = deinitsession;
                            objArr4[c2] = deinitsession;
                            objArr4[2] = Integer.valueOf(cCharValue);
                            objArr4[1] = deinitsession;
                            objArr4[0] = deinitsession;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b7 = (byte) (-1);
                                byte b8 = (byte) (b7 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.getTrimmedLength("") + 49267), (ViewConfiguration.getLongPressTimeout() >> 16) + 3261, 29 - ((byte) KeyEvent.getModifierMetaStateMask()), -127612708, false, $$g(b7, b8, (byte) (b8 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                int i16 = $11 + 105;
                                $10 = i16 % 128;
                                int i17 = i16 % 2;
                                try {
                                    Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        byte b9 = (byte) (-1);
                                        byte b10 = (byte) (b9 + 1);
                                        c = 3;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 22878), 594 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17, 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    } else {
                                        c = 3;
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                    int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i18];
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } else {
                                obj = null;
                                c = 3;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    int i19 = $10 + 87;
                                    $11 = i19 % 128;
                                    int i20 = i19 % 2;
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i21 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i22 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i21];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i22];
                                } else {
                                    int i23 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i24 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i23];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i24];
                                }
                            }
                        }
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                        obj2 = obj;
                        c2 = c;
                    }
                }
                int i25 = 0;
                while (i25 < i7) {
                    cArr4[i25] = (char) (cArr4[i25] ^ 13722);
                    i25++;
                    int i26 = $10 + 23;
                    $11 = i26 % 128;
                    int i27 = i26 % 2;
                }
                objArr[0] = new String(cArr4);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr;
                int i7 = 2 % 2;
                int i8 = f853a + 15;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char bitsPerPixel = (char) (37566 - ImageFormat.getBitsPerPixel(0));
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 625;
                        int size = View.MeasureSpec.getSize(0) + 14;
                        byte[] bArr = $$a;
                        byte b2 = bArr[7];
                        Object[] objArr2 = new Object[1];
                        c(b2, b2, (byte) (-bArr[14]), objArr2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, packedPositionType, size, -477065106, false, (String) objArr2[0], null);
                    }
                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                    Object[] objArr3 = new Object[1];
                    d(new char[]{'\b', '\f', ',', '\n', 27, 30, '/', 24, 24, 25, 21, '!', '\n', 27, 4, 0, 18, 0, ',', 25, '0', 26}, (byte) (64 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), KeyEvent.normalizeMetaState(0) + 22, objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    e((char) (49161 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Color.green(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15, objArr4);
                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 37567);
                        int threadPriority = 625 - ((Process.getThreadPriority(0) + 20) >> 6);
                        int touchSlop = 14 - (ViewConfiguration.getTouchSlop() >> 8);
                        byte[] bArr2 = $$a;
                        Object[] objArr5 = new Object[1];
                        c(bArr2[3], (byte) 52, (byte) (-bArr2[14]), objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, threadPriority, touchSlop, -976899241, false, (String) objArr5[0], null);
                    }
                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                        int i10 = f853a + 75;
                        asInterface = i10 % 128;
                        int i11 = i10 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 37566);
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 625;
                            int i12 = 14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            byte[] bArr3 = $$a;
                            Object[] objArr6 = new Object[1];
                            c(bArr3[3], (byte) 52, bArr3[40], objArr6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, jumpTapTimeout, i12, -973632554, false, (String) objArr6[0], null);
                        }
                        Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                        int i13 = ((int[]) objArr7[2])[0];
                        int i14 = ((int[]) objArr7[0])[0];
                        String[] strArr = (String[]) objArr7[3];
                        int[] iArr = {i13};
                        int[] iArr2 = {i14};
                        int iIdentityHashCode = System.identityHashCode(this);
                        int i15 = ~((-1600264378) | iIdentityHashCode);
                        int i16 = ~iIdentityHashCode;
                        int i17 = ((((-1839980252) + ((i15 | (~(1601435903 | i16))) * (-406))) + ((~((-1377962161) | i16)) * (-406))) + (((~(iIdentityHashCode | (-223473744))) | (~(1600264377 | i16))) * 406)) - 1952109891;
                        int i18 = (i17 << 13) ^ i17;
                        int i19 = i18 ^ (i18 >>> 17);
                        ((int[]) objArr[1])[0] = i19 ^ (i19 << 5);
                        objArr = new Object[]{iArr2, new int[1], iArr, strArr};
                    } else {
                        Object[] objArr8 = new Object[1];
                        e((char) (TextUtils.getOffsetAfter("", 0) + 38537), 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 26 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr8);
                        Class<?> cls2 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        e((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22539), (ViewConfiguration.getTapTimeout() >> 16) + 41, 17 - ImageFormat.getBitsPerPixel(0), objArr9);
                        Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                        if (applicationContext != null) {
                            int i20 = asInterface + 5;
                            f853a = i20 % 128;
                            int i21 = i20 % 2;
                            if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                                applicationContext = null;
                            } else {
                                applicationContext = applicationContext.getApplicationContext();
                                int i22 = f853a + 61;
                                asInterface = i22 % 128;
                                int i23 = i22 % 2;
                            }
                        }
                        Object[] objArr10 = new Object[1];
                        e((char) (63203 - TextUtils.getTrimmedLength("")), 58 - Process.getGidForName(""), 16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr10);
                        Class<?> cls3 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        e((char) View.resolveSizeAndState(0, 0, 0), KeyEvent.getDeadChar(0, 0) + 75, View.getDefaultSize(0, 0) + 16, objArr11);
                        int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                        Object[] objArr12 = new Object[1];
                        d(new char[]{'\r', 1, '#', 11, '\b', 28, Typography.amp, 11, 18, '%', Typography.dollar, 25, 13889, 13889, '\b', 21, '\t', '(', '\r', 3, 26, '\b', '\b', '!', 5, '\r', 30, Typography.dollar, '+', '.', '%', 19, 14, '\t', '\t', 15, 13805, 13805, 28, '\n', Typography.dollar, 25, Typography.amp, '!', ')', 4, '+', 21, 14, '*', 28, '\n', Typography.amp, '!', 15, Typography.dollar, 17, 30, Typography.dollar, '!', ' ', Typography.dollar, 15, Typography.dollar}, (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 66), 63 - Process.getGidForName(""), objArr12);
                        Object[] objArr13 = new Object[1];
                        e((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 91 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 64, objArr13);
                        String[] strArr2 = {(String) objArr12[0], (String) objArr13[0]};
                        int i24 = f853a + 85;
                        asInterface = i24 % 128;
                        int i25 = i24 % 2;
                        try {
                            Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, -1952109891};
                            byte[] bArr4 = $$d;
                            byte b3 = bArr4[107];
                            byte b4 = bArr4[58];
                            Object[] objArr15 = new Object[1];
                            f(b3, b4, b4, objArr15);
                            Class<?> cls4 = Class.forName((String) objArr15[0]);
                            byte b5 = bArr4[58];
                            byte b6 = bArr4[107];
                            Object[] objArr16 = new Object[1];
                            f(b5, b6, b6, objArr16);
                            Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                            int i26 = ((int[]) objArr17[0])[0];
                            int i27 = ((int[]) objArr17[2])[0];
                            if (applicationContext != null) {
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char cResolveOpacity = (char) (37567 - Drawable.resolveOpacity(0, 0));
                                    int iGreen = 625 - Color.green(0);
                                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14;
                                    byte[] bArr5 = $$a;
                                    Object[] objArr18 = new Object[1];
                                    c(bArr5[3], (byte) 52, bArr5[40], objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveOpacity, iGreen, keyRepeatDelay, -973632554, false, (String) objArr18[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                                try {
                                    Object[] objArr19 = new Object[1];
                                    d(new char[]{'\b', '\f', ',', '\n', 27, 30, '/', 24, 24, 25, 21, '!', '\n', 27, 4, 0, 18, 0, ',', 25, '0', 26}, (byte) (63 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 22 - Color.argb(0, 0, 0, 0), objArr19);
                                    Class<?> cls5 = Class.forName((String) objArr19[0]);
                                    Object[] objArr20 = new Object[1];
                                    e((char) (49162 - ExpandableListView.getPackedPositionGroup(0L)), TextUtils.getCapsMode("", 0, 0), 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr20);
                                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                    Long lValueOf = Long.valueOf(jLongValue2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char touchSlop2 = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 37567);
                                        int mirror = 673 - AndroidCharacter.getMirror('0');
                                        int i28 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 13;
                                        byte[] bArr6 = $$a;
                                        Object[] objArr21 = new Object[1];
                                        c(bArr6[3], (byte) 52, (byte) (-bArr6[14]), objArr21);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop2, mirror, i28, -976899241, false, (String) objArr21[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                        char touchSlop3 = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 37567);
                                        int iIndexOf = 624 - TextUtils.indexOf((CharSequence) "", '0');
                                        int i29 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 13;
                                        byte[] bArr7 = $$a;
                                        byte b7 = bArr7[7];
                                        Object[] objArr22 = new Object[1];
                                        c(b7, b7, (byte) (-bArr7[14]), objArr22);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(touchSlop3, iIndexOf, i29, -477065106, false, (String) objArr22[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                } catch (Exception unused) {
                                    throw new RuntimeException();
                                }
                            }
                            objArr = objArr17;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr3 = (String[]) objArr[3];
                        if (strArr3 != null) {
                            for (String str : strArr3) {
                                arrayList.add(str);
                            }
                        }
                        throw new NullPointerException();
                    }
                    int i30 = f853a + 35;
                    asInterface = i30 % 128;
                    int i31 = i30 % 2;
                    int i32 = ((int[]) objArr[1])[0];
                    int i33 = ((int[]) objArr[2])[0];
                    int i34 = ((int[]) objArr[0])[0];
                    String[] strArr4 = (String[]) objArr[3];
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i35 = ~iIdentityHashCode2;
                    int i36 = i32 + (-343241632) + ((677817344 | i35) * (-757)) + ((~((-1141461257) | iIdentityHashCode2)) * 1514) + (((~(iIdentityHashCode2 | 1819278600)) | (~(i35 | (-1145920777))) | 4459520) * 757);
                    int i37 = (i36 << 13) ^ i36;
                    int i38 = i37 ^ (i37 >>> 17);
                    Object obj = new Object[]{new int[]{i34}, new int[1], new int[]{i33}, strArr4}[1];
                    ((int[]) obj)[0] = i38 ^ (i38 << 5);
                    MandiriBillStatusActivity mandiriBillStatusActivity = MandiriBillStatusActivity.this;
                    int i39 = ((int[]) obj)[0];
                    int i40 = i39 * i39;
                    int i41 = -(530713368 * i39);
                    int i42 = (((i40 ^ i41) + ((i40 & i41) << 1)) - (~(-(i39 * 963633646)))) - 527431928;
                    int i43 = i42 >> 22;
                    int i44 = i43 ^ (-2047);
                    int i45 = (((i43 | (-2047)) << 1) - i44) / 1024;
                    int i46 = ((i45 | 1) << 1) - (i45 ^ 1);
                    int i47 = -(((i42 ^ i46) + ((i42 & i46) << 1)) ^ (((i44 + ((i43 & (-2047)) << 1)) / 1024) + 1));
                    int i48 = ((i47 | 3) << 1) - (i47 ^ 3);
                    int i49 = i48 >> 23;
                    int i50 = (((i49 ^ (-1023)) + ((i49 & (-1023)) << 1)) / 512) + 1;
                    boolean zBooleanValue = ((Boolean) MandiriBillStatusActivity.TuitionPaymentFragmentbindingInflater1(new Object[]{mandiriBillStatusActivity, "25,0,19,23,Bill Code Number".substring(58707 / (((-((i50 & 1) + (i50 | 1))) & i48) * 1779)), MandiriBillStatusActivity.b(mandiriBillStatusActivity).getText().toString()}, lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), -72808934, 72808935, lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b())).booleanValue();
                    MandiriBillStatusActivity mandiriBillStatusActivity2 = MandiriBillStatusActivity.this;
                    onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mandiriBillStatusActivity2, mandiriBillStatusActivity2.getString(zBooleanValue ? R.string.copied_bill_code : R.string.failed_to_copy));
                    ViewPortBuilder.b();
                } catch (Throwable th2) {
                    ViewPortBuilder.b();
                    throw th2;
                }
            }

            /* JADX WARN: Code duplicated, block: B:109:0x037c A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:28:0x0362  */
            /* JADX WARN: Code duplicated, block: B:30:0x0368  */
            /* JADX WARN: Code duplicated, block: B:32:0x0377  */
            /* JADX WARN: Code duplicated, block: B:33:0x037a  */
            /* JADX WARN: Code duplicated, block: B:38:0x0382  */
            /* JADX WARN: Code duplicated, block: B:40:0x0391  */
            /* JADX WARN: Code duplicated, block: B:42:0x03a9 A[Catch: Exception -> 0x06a6, TRY_LEAVE, TryCatch #1 {Exception -> 0x06a6, blocks: (B:35:0x037c, B:41:0x0393, B:45:0x03c3, B:47:0x041a, B:53:0x04c0, B:55:0x04f8, B:57:0x052e, B:59:0x0534, B:60:0x0535, B:42:0x03a9, B:61:0x0536, B:66:0x0685, B:72:0x069e, B:74:0x06a4, B:75:0x06a5, B:62:0x062c, B:64:0x0639, B:65:0x067e, B:48:0x0423, B:50:0x0430, B:51:0x0471), top: B:109:0x037c, inners: #2, #3 }] */
            /* JADX WARN: Code duplicated, block: B:50:0x0430 A[Catch: all -> 0x052d, TryCatch #3 {all -> 0x052d, blocks: (B:48:0x0423, B:50:0x0430, B:51:0x0471), top: B:112:0x0423, outer: #1 }] */
            /* JADX WARN: Code duplicated, block: B:61:0x0536 A[Catch: Exception -> 0x06a6, TRY_LEAVE, TryCatch #1 {Exception -> 0x06a6, blocks: (B:35:0x037c, B:41:0x0393, B:45:0x03c3, B:47:0x041a, B:53:0x04c0, B:55:0x04f8, B:57:0x052e, B:59:0x0534, B:60:0x0535, B:42:0x03a9, B:61:0x0536, B:66:0x0685, B:72:0x069e, B:74:0x06a4, B:75:0x06a5, B:62:0x062c, B:64:0x0639, B:65:0x067e, B:48:0x0423, B:50:0x0430, B:51:0x0471), top: B:109:0x037c, inners: #2, #3 }] */
            /* JADX WARN: Code duplicated, block: B:64:0x0639 A[Catch: all -> 0x069d, TryCatch #2 {all -> 0x069d, blocks: (B:62:0x062c, B:64:0x0639, B:65:0x067e), top: B:110:0x062c, outer: #1 }] */
            /* JADX WARN: Code duplicated, block: B:69:0x068d  */
            /* JADX WARN: Code duplicated, block: B:70:0x069b  */
            /* JADX WARN: Code duplicated, block: B:79:0x06c0  */
            /* JADX WARN: Code duplicated, block: B:99:0x0863  */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i7, int i8, int i9) throws Throwable {
                int i10;
                int i11;
                int i12;
                int i13;
                Object[] objArr;
                int[] iArr;
                int i14;
                int i15;
                int i16;
                int i17;
                int i18;
                int i19;
                int i20;
                int i21;
                String str;
                Object[] objArr2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i22;
                char[] cArr;
                byte fadingEdgeLength;
                int i23;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i24 = 2 % 2;
                if (context != null) {
                    int i25 = ~i7;
                    FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    try {
                        byte bIndexOf = (byte) (TextUtils.indexOf("", "", 0) + 30);
                        int i26 = -View.resolveSize(0, 0);
                        int i27 = ((i26 | 23) << 1) - (i26 ^ 23);
                        Object[] objArr3 = new Object[1];
                        d(new char[]{'\b', '\f', ',', '\n', 27, 30, '/', 24, ',', 26, '\n', 4, 4, '\r', 5, 24, 2, 25, '\n', 4, 1, 20, 13836}, bIndexOf, i27, objArr3);
                        Class<?> cls = Class.forName((String) objArr3[0]);
                        char cIndexOf = (char) TextUtils.indexOf("", "");
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + ModuleDescriptor.MODULE_VERSION;
                        int i28 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                        int i29 = (i28 & 18) + (i28 | 18);
                        Object[] objArr4 = new Object[1];
                        e(cIndexOf, offsetBefore, i29, objArr4);
                        Object objInvoke = cls.getMethod((String) objArr4[0], null).invoke(context, null);
                        int i30 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i31 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 90) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 90);
                        int i32 = (((i30 * (-109)) + 9990) - (~(-(-(((~i30) | (~i31)) * (-220)))))) - 1;
                        int i33 = -(-(((~i31) | (~((i30 ^ 90) | (i30 & 90)))) * 220));
                        int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                        int i35 = ~i30;
                        int i36 = -(-(((~((i30 & (-91)) | ((-91) ^ i30))) | (~((i35 & 90) | (i35 ^ 90)))) * 110));
                        int i37 = (i34 & i36) + (i36 | i34);
                        int i38 = asInterface;
                        int i39 = ((i38 | 55) << 1) - (i38 ^ 55);
                        f853a = i39 % 128;
                        int i40 = i39 % 2;
                        byte b2 = (byte) i37;
                        int i41 = -View.getDefaultSize(0, 0);
                        int i42 = i41 * 46;
                        int i43 = ((i42 | 1564) << 1) - (i42 ^ 1564);
                        int i44 = ~i7;
                        int i45 = ~(((-35) & i44) | ((-35) ^ i44));
                        int i46 = ((i45 & i41) | (i41 ^ i45)) * (-90);
                        int i47 = ((i43 | i46) << 1) - (i43 ^ i46);
                        int i48 = ~(((-35) & i7) | ((-35) ^ i7));
                        int i49 = ~(i41 | 34);
                        int i50 = -(-(((i48 ^ i49) | (i48 & i49)) * (-45)));
                        int i51 = (i47 & i50) + (i50 | i47);
                        int i52 = f853a;
                        int i53 = (i52 ^ 91) + ((i52 & 91) << 1);
                        asInterface = i53 % 128;
                        int i54 = i53 % 2;
                        int i55 = ~i41;
                        int i56 = (~((i55 & i7) | (i55 ^ i7))) | (-35);
                        int i57 = ~((i25 & i41) | (i25 ^ i41));
                        int i58 = 45 * ((i57 & i56) | (i56 ^ i57));
                        int i59 = (i51 ^ i58) + ((i58 & i51) << 1);
                        Object[] objArr5 = new Object[1];
                        d(new char[]{'\b', '\f', ',', '\n', 27, 30, '/', 24, ',', 26, '\n', 4, 4, '\r', 5, 24, '#', 15, 27, 26, 13893, 13893, '0', ' ', '*', '\f', 6, 31, 25, '\t', '.', '\r', '%', 25}, b2, i59, objArr5);
                        Class<?> cls2 = Class.forName((String) objArr5[0]);
                        int i60 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i61 = i60 * (-167);
                        int i62 = ((i61 | (-9603168)) << 1) - (i61 ^ (-9603168));
                        int i63 = ~i60;
                        int i64 = ~((i63 & (-57505)) | (i63 ^ (-57505)));
                        int i65 = asInterface + 105;
                        f853a = i65 % 128;
                        int i66 = i65 % 2;
                        int i67 = ~(((-57505) & i7) | ((-57505) ^ i7));
                        int i68 = i62 + (336 * ((i67 & i64) | (i64 ^ i67)));
                        int i69 = ~((57504 & i60) | (i60 ^ 57504));
                        int i70 = ~((i60 ^ i7) | (i60 & i7));
                        int i71 = -(-(((i69 & i70) | (i69 ^ i70)) * (-168)));
                        char c = (char) ((i68 & i71) + (i71 | i68) + (((~((i44 ^ i60) | (i60 & i44))) | (-57505)) * 168));
                        int i72 = -Color.red(0);
                        int i73 = asInterface;
                        int i74 = (i73 ^ 123) + ((i73 & 123) << 1);
                        f853a = i74 % 128;
                        int i75 = i74 % 2;
                        int i76 = ~((~i72) | 173);
                        int i77 = ~(((-174) ^ i72) | ((-174) & i72));
                        int i78 = (i76 & i77) | (i76 ^ i77);
                        int i79 = ~(((-174) & i7) | ((-174) ^ i7));
                        int i80 = (((i72 * 399) + 69027) - (~(-(-(398 * ((i78 & i79) | (i78 ^ i79))))))) - 1;
                        int i81 = ((i72 ^ 173) | (i72 & 173)) * (-1194);
                        int i82 = (i80 & i81) + (i80 | i81);
                        int i83 = ~(((-174) & i44) | ((-174) ^ i44));
                        int i84 = ~((~i72) | 173);
                        int i85 = (i83 & i84) | (i83 ^ i84);
                        int i86 = ~(i72 | (-174));
                        int i87 = ((i86 & i85) | (i85 ^ i86)) * 398;
                        int i88 = (i82 & i87) + (i87 | i82);
                        int i89 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i90 = i89 * 55;
                        int i91 = (i90 ^ (-535)) + ((i90 & (-535)) << 1);
                        int i92 = ~((~i89) | 5);
                        int i93 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        int i94 = ~((i93 & 5) | (i93 ^ 5));
                        int i95 = ((i92 & i94) | (i92 ^ i94)) * (-108);
                        int i96 = (i91 ^ i95) + ((i95 & i91) << 1);
                        int i97 = ~i89;
                        int i98 = ~((i97 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i97 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i99 = ~(((-6) & i89) | ((-6) ^ i89));
                        int i100 = (i98 & i99) | (i98 ^ i99);
                        int i101 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        int i102 = ~((i101 & i89) | (i101 ^ i89));
                        int i103 = -(-(((i100 & i102) | (i100 ^ i102)) * 54));
                        int i104 = ((i96 | i103) << 1) - (i103 ^ i96);
                        int i105 = ~((i89 & (-6)) | ((-6) ^ i89));
                        int i106 = ((i105 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 ^ i105)) * 54;
                        int i107 = (i104 ^ i106) + ((i106 & i104) << 1);
                        Object[] objArr6 = new Object[1];
                        e(c, i88, i107, objArr6);
                        int i108 = cls2.getField((String) objArr6[0]).getInt(objInvoke) & 2;
                        int i109 = (~(i7 & 1)) & (i7 | 1);
                        int i110 = -i108;
                        int i111 = ((i108 & i110) | (i108 ^ i110)) >> 31;
                        int i112 = (~i111) & i7;
                        int i113 = i111 & i109;
                        int i114 = asInterface + 39;
                        f853a = i114 % 128;
                        int i115 = i114 % 2;
                        i10 = (i113 & i112) | (i112 ^ i113);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    i10 = i7;
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char longPressTimeout = (char) (16949 - (ViewConfiguration.getLongPressTimeout() >> 16));
                        int iRgb = (-16774477) - Color.rgb(0, 0, 0);
                        int gidForName = 12 - Process.getGidForName("");
                        byte b3 = $$a[3];
                        Object[] objArr7 = new Object[1];
                        c(b3, (byte) 52, b3, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(longPressTimeout, iRgb, gidForName, 1501733736, false, (String) objArr7[0], new Class[0]);
                    }
                    Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char absoluteGravity = (char) (16949 - Gravity.getAbsoluteGravity(0, 0));
                        int iIndexOf = 2739 - TextUtils.indexOf("", "");
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 14;
                        byte[] bArr = $$a;
                        Object[] objArr8 = new Object[1];
                        c(bArr[3], (byte) 52, (byte) (-bArr[14]), objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(absoluteGravity, iIndexOf, packedPositionChild, 47863026, false, (String) objArr8[0], null);
                    }
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null))) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 16950);
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2739;
                            int iCombineMeasuredStates = 13 - View.combineMeasuredStates(0, 0);
                            byte[] bArr2 = $$a;
                            byte b4 = bArr2[3];
                            Object[] objArr9 = new Object[1];
                            c(b4, (byte) (b4 | 36), bArr2[7], objArr9);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, iNormalizeMetaState, iCombineMeasuredStates, 631063962, false, (String) objArr9[0], null);
                        }
                        if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i116 = f853a;
                                i22 = (i116 ^ 57) + ((i116 & 57) << 1);
                                asInterface = i22 % 128;
                                if (i22 % 2 != 0) {
                                    cArr = new char[]{20, 5, 5, '-', 20, '!', '\r', ' ', 5, 17, 13934, 13934, 24, '0', 24, 3, 1, Typography.quote, '\'', 20, 14, 11, ' ', '+', 5, 27, '\f', ','};
                                    int fadingEdgeLength2 = ViewConfiguration.getFadingEdgeLength();
                                    fadingEdgeLength = (byte) (110 << ((fadingEdgeLength2 ^ 127) + ((fadingEdgeLength2 & 127) << 1)));
                                    i23 = 35;
                                } else {
                                    cArr = new char[]{20, 5, 5, '-', 20, '!', '\r', ' ', 5, 17, 13934, 13934, 24, '0', 24, 3, 1, Typography.quote, '\'', 20, 14, 11, ' ', '+', 5, 27, '\f', ','};
                                    fadingEdgeLength = (byte) (120 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                    i23 = 28;
                                }
                                int i117 = f853a + 3;
                                asInterface = i117 % 128;
                                int i118 = i117 % 2;
                                int trimmedLength = TextUtils.getTrimmedLength("");
                                int i119 = trimmedLength * (-1335);
                                int i120 = -(-(i23 * (-667)));
                                int i121 = ((i119 | i120) << 1) - (i119 ^ i120);
                                int i122 = f853a;
                                int i123 = i122 + 49;
                                asInterface = i123 % 128;
                                int i124 = i123 % 2;
                                int i125 = ~i23;
                                int i126 = (trimmedLength ^ i7) | (trimmedLength & i7);
                                int i127 = ~i126;
                                int i128 = (i121 - (~((-668) * ((i125 ^ i127) | (i127 & i125))))) - 1;
                                int i129 = (i122 ^ 15) + ((i122 & 15) << 1);
                                asInterface = i129 % 128;
                                int i130 = i129 % 2;
                                int i131 = ~i23;
                                int i132 = i128 + (1336 * (trimmedLength | (~(i131 | i7))));
                                int i133 = ((i122 | 7) << 1) - (i122 ^ 7);
                                asInterface = i133 % 128;
                                int i134 = i133 % 2;
                                int i135 = -(-(668 * ((i126 ^ i131) | (i131 & i126))));
                                int i136 = (i132 & i135) + (i135 | i132);
                                Object[] objArr10 = new Object[1];
                                d(cArr, fadingEdgeLength, i136, objArr10);
                                Object[] objArr11 = {(String) objArr10[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                    int i137 = 993 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int deadChar = 8 - KeyEvent.getDeadChar(0, 0);
                                    byte[] bArr3 = $$a;
                                    byte b5 = bArr3[7];
                                    byte b6 = (byte) (-bArr3[14]);
                                    Object[] objArr12 = new Object[1];
                                    c(b5, b5, b6, objArr12);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(jumpTapTimeout, i137, deadChar, 410748506, false, (String) objArr12[0], new Class[]{String.class});
                                }
                                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr11)).longValue();
                                long j = 590896910;
                                long j2 = -68;
                                long j3 = -1;
                                long j4 = j ^ j3;
                                long j5 = jLongValue ^ j3;
                                long j6 = i7;
                                long j7 = j6 ^ j3;
                                long j8 = (((long) 69) * j) + (((long) (-67)) * jLongValue) + ((((j6 | jLongValue) ^ j3) | (((j4 | j5) | j7) ^ j3) | ((j | jLongValue) ^ j3)) * j2) + (j2 * (((j4 | j7) | jLongValue) ^ j3)) + (((long) 68) * (j4 | (j3 ^ (j5 | j7)))) + ((long) (-791815147));
                                int i138 = (int) (j8 >> 32);
                                int iMyPid = Process.myPid();
                                int i139 = ~iMyPid;
                                int i140 = i138 & (1008898890 + (((~(866778857 | i139)) | 570447553) * 220) + (((~(i139 | 573167337)) | 864059073) * (-440)) + ((iMyPid | 866778857) * 220));
                                int i141 = (int) j8;
                                int i142 = f853a;
                                int i143 = (i142 ^ 53) + ((i142 & 53) << 1);
                                asInterface = i143 % 128;
                                int i144 = i143 % 2;
                                int iMyTid = Process.myTid();
                                int i145 = i141 & (237690373 + (((~(895473055 | (~iMyTid))) | (~((-541753355) | iMyTid))) * (-272)) + (((~(541840783 | iMyTid)) | 353632272) * (-272)) + (((~(iMyTid | (-541840784))) | (-895385627)) * 272));
                                i17 = (i140 & i145) | (i140 ^ i145);
                            } else {
                                int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0);
                                byte b7 = (byte) (((iCombineMeasuredStates2 | 45) << 1) - (iCombineMeasuredStates2 ^ 45));
                                int packedPositionType = ExpandableListView.getPackedPositionType(0L);
                                int i146 = packedPositionType * 615;
                                int i147 = (i146 ^ (-613)) + ((i146 & (-613)) << 1);
                                int i148 = ~packedPositionType;
                                int i149 = ~((i148 ^ 1) | (i148 & 1));
                                int i150 = (i7 ^ i149) | (i7 & i149);
                                int i151 = ~(((-2) ^ packedPositionType) | ((-2) & packedPositionType));
                                int i152 = -(-(((i150 & i151) | (i150 ^ i151)) * 614));
                                int i153 = (i147 & i152) + (i147 | i152);
                                int i154 = ~packedPositionType;
                                int i155 = ~i7;
                                int i156 = ~((i154 & i155) | (i154 ^ i155));
                                int i157 = i153 + (((i156 & i149) | (i156 ^ i149) | (~((i155 ^ 1) | (i155 & 1)))) * (-1228));
                                int i158 = i148 | (-2);
                                int i159 = ~i7;
                                int i160 = ~((i158 & i159) | (i158 ^ i159));
                                int i161 = ~(packedPositionType | i155 | 1);
                                int i162 = ((i161 & i160) | (i160 ^ i161)) * 614;
                                int i163 = (i157 & i162) + (i162 | i157);
                                Object[] objArr13 = new Object[1];
                                d(new char[]{13784}, b7, i163, objArr13);
                                str = (String) objArr13[0];
                                char c2 = (char) (34291 - (~(-(-(Process.myPid() >> 22)))));
                                int i164 = -TextUtils.lastIndexOf("", '0');
                                int i165 = ~((~i164) | (-178));
                                int i166 = ~i164;
                                int i167 = ~((i166 & i155) | (i166 ^ i155));
                                int i168 = (i165 & i167) | (i165 ^ i167) | (~(((-178) & i155) | ((-178) ^ i155)));
                                int i169 = (i164 ^ 177) | (i164 & 177);
                                int i170 = ~((i169 ^ i7) | (i169 & i7));
                                int i171 = (((i164 * 85) + 15045) - (~(((i168 & i170) | (i168 ^ i170)) * (-84)))) - 1;
                                int i172 = ~(((-178) & i7) | ((-178) ^ i7));
                                int i173 = (i164 & i172) | (i164 ^ i172);
                                int i174 = ~((i155 ^ 177) | (i155 & 177));
                                int i175 = (i171 - (~(-(-(((i173 & i174) | (i173 ^ i174)) * (-84)))))) - 1;
                                int i176 = ~((i159 ^ 177) | (i159 & 177));
                                int i177 = ~i169;
                                Object[] objArr14 = new Object[1];
                                e(c2, i175 + (((i176 & i177) | (i176 ^ i177)) * 84), 12 - (~ExpandableListView.getPackedPositionType(0L)), objArr14);
                                objArr2 = new Object[]{(String) objArr14[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char deadChar2 = (char) (KeyEvent.getDeadChar(0, 0) + 33602);
                                    int i178 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3084;
                                    int iResolveSize = 26 - View.resolveSize(0, 0);
                                    byte[] bArr4 = $$a;
                                    byte b8 = bArr4[7];
                                    Object[] objArr15 = new Object[1];
                                    c(b8, b8, (byte) (-bArr4[14]), objArr15);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar2, i178, iResolveSize, 1411172903, false, (String) objArr15[0], new Class[]{String.class});
                                }
                                if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                    int i179 = f853a;
                                    int i180 = (i179 & 49) + (i179 | 49);
                                    asInterface = i180 % 128;
                                    int i181 = i180 % 2;
                                    i17 = 0;
                                } else {
                                    i17 = 1;
                                }
                            }
                            i18 = (~(i7 & 10)) & (i7 | 10);
                            i19 = (i17 | (-i17)) >> 31;
                            i20 = asInterface;
                            i21 = (i20 & 33) + (i20 | 33);
                            f853a = i21 % 128;
                            if (i21 % 2 == 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            int i182 = (~i19) & i7;
                            int i183 = i19 & i18;
                            int i184 = (i183 & i182) | (i182 ^ i183);
                            int i185 = i8 & 32;
                            int i186 = -i185;
                            int i187 = ((i185 & i186) | (i185 ^ i186)) >> 31;
                            int i188 = i184 & (~i187);
                            int i189 = i187 & i7;
                            i12 = (i188 & i189) | (i188 ^ i189);
                            int i190 = (i20 ^ 113) + ((i20 & 113) << 1);
                            f853a = i190 % 128;
                            int i191 = i190 % 2;
                        } else if (Build.VERSION.SDK_INT == 30) {
                            int i192 = asInterface;
                            i11 = ((i192 | 57) << 1) - (i192 ^ 57);
                            f853a = i11 % 128;
                            if (i11 % 2 != 0) {
                                throw null;
                            }
                            i12 = i7;
                        } else {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i1110 = f853a;
                                i22 = (i1110 ^ 57) + ((i1110 & 57) << 1);
                                asInterface = i22 % 128;
                                if (i22 % 2 != 0) {
                                    cArr = new char[]{20, 5, 5, '-', 20, '!', '\r', ' ', 5, 17, 13934, 13934, 24, '0', 24, 3, 1, Typography.quote, '\'', 20, 14, 11, ' ', '+', 5, 27, '\f', ','};
                                    int fadingEdgeLength3 = ViewConfiguration.getFadingEdgeLength();
                                    fadingEdgeLength = (byte) (110 << ((fadingEdgeLength3 ^ 127) + ((fadingEdgeLength3 & 127) << 1)));
                                    i23 = 35;
                                } else {
                                    cArr = new char[]{20, 5, 5, '-', 20, '!', '\r', ' ', 5, 17, 13934, 13934, 24, '0', 24, 3, 1, Typography.quote, '\'', 20, 14, 11, ' ', '+', 5, 27, '\f', ','};
                                    fadingEdgeLength = (byte) (120 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                    i23 = 28;
                                }
                                int i1111 = f853a + 3;
                                asInterface = i1111 % 128;
                                int i1112 = i1111 % 2;
                                int trimmedLength2 = TextUtils.getTrimmedLength("");
                                int i1113 = trimmedLength2 * (-1335);
                                int i1210 = -(-(i23 * (-667)));
                                int i1211 = ((i1113 | i1210) << 1) - (i1113 ^ i1210);
                                int i1212 = f853a;
                                int i1213 = i1212 + 49;
                                asInterface = i1213 % 128;
                                int i1214 = i1213 % 2;
                                int i1215 = ~i23;
                                int i1216 = (trimmedLength2 ^ i7) | (trimmedLength2 & i7);
                                int i1217 = ~i1216;
                                int i1218 = (i1211 - (~((-668) * ((i1215 ^ i1217) | (i1217 & i1215))))) - 1;
                                int i1219 = (i1212 ^ 15) + ((i1212 & 15) << 1);
                                asInterface = i1219 % 128;
                                int i1310 = i1219 % 2;
                                int i1311 = ~i23;
                                int i1312 = i1218 + (1336 * (trimmedLength2 | (~(i1311 | i7))));
                                int i1313 = ((i1212 | 7) << 1) - (i1212 ^ 7);
                                asInterface = i1313 % 128;
                                int i1314 = i1313 % 2;
                                int i1315 = -(-(668 * ((i1216 ^ i1311) | (i1311 & i1216))));
                                int i1316 = (i1312 & i1315) + (i1315 | i1312);
                                Object[] objArr16 = new Object[1];
                                d(cArr, fadingEdgeLength, i1316, objArr16);
                                Object[] objArr17 = {(String) objArr16[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                    int i1317 = 993 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int deadChar3 = 8 - KeyEvent.getDeadChar(0, 0);
                                    byte[] bArr5 = $$a;
                                    byte b9 = bArr5[7];
                                    byte b10 = (byte) (-bArr5[14]);
                                    Object[] objArr18 = new Object[1];
                                    c(b9, b9, b10, objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(jumpTapTimeout2, i1317, deadChar3, 410748506, false, (String) objArr18[0], new Class[]{String.class});
                                }
                                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr17)).longValue();
                                long j9 = 590896910;
                                long j10 = -68;
                                long j11 = -1;
                                long j12 = j9 ^ j11;
                                long j13 = jLongValue2 ^ j11;
                                long j14 = i7;
                                long j15 = j14 ^ j11;
                                long j16 = (((long) 69) * j9) + (((long) (-67)) * jLongValue2) + ((((j14 | jLongValue2) ^ j11) | (((j12 | j13) | j15) ^ j11) | ((j9 | jLongValue2) ^ j11)) * j10) + (j10 * (((j12 | j15) | jLongValue2) ^ j11)) + (((long) 68) * (j12 | (j11 ^ (j13 | j15)))) + ((long) (-791815147));
                                int i1318 = (int) (j16 >> 32);
                                int iMyPid2 = Process.myPid();
                                int i1319 = ~iMyPid2;
                                int i1410 = i1318 & (1008898890 + (((~(866778857 | i1319)) | 570447553) * 220) + (((~(i1319 | 573167337)) | 864059073) * (-440)) + ((iMyPid2 | 866778857) * 220));
                                int i1411 = (int) j16;
                                int i1412 = f853a;
                                int i1413 = (i1412 ^ 53) + ((i1412 & 53) << 1);
                                asInterface = i1413 % 128;
                                int i1414 = i1413 % 2;
                                int iMyTid2 = Process.myTid();
                                int i1415 = i1411 & (237690373 + (((~(895473055 | (~iMyTid2))) | (~((-541753355) | iMyTid2))) * (-272)) + (((~(541840783 | iMyTid2)) | 353632272) * (-272)) + (((~(iMyTid2 | (-541840784))) | (-895385627)) * 272));
                                i17 = (i1410 & i1415) | (i1410 ^ i1415);
                            } else {
                                int iCombineMeasuredStates3 = View.combineMeasuredStates(0, 0);
                                byte b11 = (byte) (((iCombineMeasuredStates3 | 45) << 1) - (iCombineMeasuredStates3 ^ 45));
                                int packedPositionType2 = ExpandableListView.getPackedPositionType(0L);
                                int i1416 = packedPositionType2 * 615;
                                int i1417 = (i1416 ^ (-613)) + ((i1416 & (-613)) << 1);
                                int i1418 = ~packedPositionType2;
                                int i1419 = ~((i1418 ^ 1) | (i1418 & 1));
                                int i1510 = (i7 ^ i1419) | (i7 & i1419);
                                int i1511 = ~(((-2) ^ packedPositionType2) | ((-2) & packedPositionType2));
                                int i1512 = -(-(((i1510 & i1511) | (i1510 ^ i1511)) * 614));
                                int i1513 = (i1417 & i1512) + (i1417 | i1512);
                                int i1514 = ~packedPositionType2;
                                int i1515 = ~i7;
                                int i1516 = ~((i1514 & i1515) | (i1514 ^ i1515));
                                int i1517 = i1513 + (((i1516 & i1419) | (i1516 ^ i1419) | (~((i1515 ^ 1) | (i1515 & 1)))) * (-1228));
                                int i1518 = i1418 | (-2);
                                int i1519 = ~i7;
                                int i1610 = ~((i1518 & i1519) | (i1518 ^ i1519));
                                int i1611 = ~(packedPositionType2 | i1515 | 1);
                                int i1612 = ((i1611 & i1610) | (i1610 ^ i1611)) * 614;
                                int i1613 = (i1517 & i1612) + (i1612 | i1517);
                                Object[] objArr19 = new Object[1];
                                d(new char[]{13784}, b11, i1613, objArr19);
                                str = (String) objArr19[0];
                                char c3 = (char) (34291 - (~(-(-(Process.myPid() >> 22)))));
                                int i1614 = -TextUtils.lastIndexOf("", '0');
                                int i1615 = ~((~i1614) | (-178));
                                int i1616 = ~i1614;
                                int i1617 = ~((i1616 & i1515) | (i1616 ^ i1515));
                                int i1618 = (i1615 & i1617) | (i1615 ^ i1617) | (~(((-178) & i1515) | ((-178) ^ i1515)));
                                int i1619 = (i1614 ^ 177) | (i1614 & 177);
                                int i1710 = ~((i1619 ^ i7) | (i1619 & i7));
                                int i1711 = (((i1614 * 85) + 15045) - (~(((i1618 & i1710) | (i1618 ^ i1710)) * (-84)))) - 1;
                                int i1712 = ~(((-178) & i7) | ((-178) ^ i7));
                                int i1713 = (i1614 & i1712) | (i1614 ^ i1712);
                                int i1714 = ~((i1515 ^ 177) | (i1515 & 177));
                                int i1715 = (i1711 - (~(-(-(((i1713 & i1714) | (i1713 ^ i1714)) * (-84)))))) - 1;
                                int i1716 = ~((i1519 ^ 177) | (i1519 & 177));
                                int i1717 = ~i1619;
                                Object[] objArr110 = new Object[1];
                                e(c3, i1715 + (((i1716 & i1717) | (i1716 ^ i1717)) * 84), 12 - (~ExpandableListView.getPackedPositionType(0L)), objArr110);
                                objArr2 = new Object[]{(String) objArr110[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char deadChar4 = (char) (KeyEvent.getDeadChar(0, 0) + 33602);
                                    int i1718 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3084;
                                    int iResolveSize2 = 26 - View.resolveSize(0, 0);
                                    byte[] bArr6 = $$a;
                                    byte b12 = bArr6[7];
                                    Object[] objArr111 = new Object[1];
                                    c(b12, b12, (byte) (-bArr6[14]), objArr111);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar4, i1718, iResolveSize2, 1411172903, false, (String) objArr111[0], new Class[]{String.class});
                                }
                                if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                    int i1719 = f853a;
                                    int i1810 = (i1719 & 49) + (i1719 | 49);
                                    asInterface = i1810 % 128;
                                    int i1811 = i1810 % 2;
                                    i17 = 0;
                                } else {
                                    i17 = 1;
                                }
                            }
                            i18 = (~(i7 & 10)) & (i7 | 10);
                            i19 = (i17 | (-i17)) >> 31;
                            i20 = asInterface;
                            i21 = (i20 & 33) + (i20 | 33);
                            f853a = i21 % 128;
                            if (i21 % 2 == 0) {
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            int i1812 = (~i19) & i7;
                            int i1813 = i19 & i18;
                            int i1814 = (i1813 & i1812) | (i1812 ^ i1813);
                            int i1815 = i8 & 32;
                            int i1816 = -i1815;
                            int i1817 = ((i1815 & i1816) | (i1815 ^ i1816)) >> 31;
                            int i1818 = i1814 & (~i1817);
                            int i1819 = i1817 & i7;
                            i12 = (i1818 & i1819) | (i1818 ^ i1819);
                            int i193 = (i20 ^ 113) + ((i20 & 113) << 1);
                            f853a = i193 % 128;
                            int i194 = i193 % 2;
                        }
                    } else if (Build.VERSION.SDK_INT == 30) {
                        int i195 = asInterface;
                        i11 = ((i195 | 57) << 1) - (i195 ^ 57);
                        f853a = i11 % 128;
                        if (i11 % 2 != 0) {
                            throw null;
                        }
                        i12 = i7;
                    } else {
                        try {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i1114 = f853a;
                                i22 = (i1114 ^ 57) + ((i1114 & 57) << 1);
                                asInterface = i22 % 128;
                                if (i22 % 2 != 0) {
                                    cArr = new char[]{20, 5, 5, '-', 20, '!', '\r', ' ', 5, 17, 13934, 13934, 24, '0', 24, 3, 1, Typography.quote, '\'', 20, 14, 11, ' ', '+', 5, 27, '\f', ','};
                                    int fadingEdgeLength4 = ViewConfiguration.getFadingEdgeLength();
                                    fadingEdgeLength = (byte) (110 << ((fadingEdgeLength4 ^ 127) + ((fadingEdgeLength4 & 127) << 1)));
                                    i23 = 35;
                                } else {
                                    cArr = new char[]{20, 5, 5, '-', 20, '!', '\r', ' ', 5, 17, 13934, 13934, 24, '0', 24, 3, 1, Typography.quote, '\'', 20, 14, 11, ' ', '+', 5, 27, '\f', ','};
                                    fadingEdgeLength = (byte) (120 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                    i23 = 28;
                                }
                                int i1115 = f853a + 3;
                                asInterface = i1115 % 128;
                                int i1116 = i1115 % 2;
                                int trimmedLength3 = TextUtils.getTrimmedLength("");
                                int i1117 = trimmedLength3 * (-1335);
                                int i12110 = -(-(i23 * (-667)));
                                int i12111 = ((i1117 | i12110) << 1) - (i1117 ^ i12110);
                                int i12112 = f853a;
                                int i12113 = i12112 + 49;
                                asInterface = i12113 % 128;
                                int i12114 = i12113 % 2;
                                int i12115 = ~i23;
                                int i12116 = (trimmedLength3 ^ i7) | (trimmedLength3 & i7);
                                int i12117 = ~i12116;
                                int i12118 = (i12111 - (~((-668) * ((i12115 ^ i12117) | (i12117 & i12115))))) - 1;
                                int i12119 = (i12112 ^ 15) + ((i12112 & 15) << 1);
                                asInterface = i12119 % 128;
                                int i13110 = i12119 % 2;
                                int i13111 = ~i23;
                                int i13112 = i12118 + (1336 * (trimmedLength3 | (~(i13111 | i7))));
                                int i13113 = ((i12112 | 7) << 1) - (i12112 ^ 7);
                                asInterface = i13113 % 128;
                                int i13114 = i13113 % 2;
                                int i13115 = -(-(668 * ((i12116 ^ i13111) | (i13111 & i12116))));
                                int i13116 = (i13112 & i13115) + (i13115 | i13112);
                                Object[] objArr112 = new Object[1];
                                d(cArr, fadingEdgeLength, i13116, objArr112);
                                try {
                                    Object[] objArr113 = {(String) objArr112[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char jumpTapTimeout3 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                        int i13117 = 993 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int deadChar5 = 8 - KeyEvent.getDeadChar(0, 0);
                                        byte[] bArr7 = $$a;
                                        byte b13 = bArr7[7];
                                        byte b14 = (byte) (-bArr7[14]);
                                        Object[] objArr114 = new Object[1];
                                        c(b13, b13, b14, objArr114);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(jumpTapTimeout3, i13117, deadChar5, 410748506, false, (String) objArr114[0], new Class[]{String.class});
                                    }
                                    long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr113)).longValue();
                                    long j17 = 590896910;
                                    long j18 = -68;
                                    long j19 = -1;
                                    long j110 = j17 ^ j19;
                                    long j111 = jLongValue3 ^ j19;
                                    long j112 = i7;
                                    long j113 = j112 ^ j19;
                                    long j114 = (((long) 69) * j17) + (((long) (-67)) * jLongValue3) + ((((j112 | jLongValue3) ^ j19) | (((j110 | j111) | j113) ^ j19) | ((j17 | jLongValue3) ^ j19)) * j18) + (j18 * (((j110 | j113) | jLongValue3) ^ j19)) + (((long) 68) * (j110 | (j19 ^ (j111 | j113)))) + ((long) (-791815147));
                                    int i13118 = (int) (j114 >> 32);
                                    int iMyPid3 = Process.myPid();
                                    int i13119 = ~iMyPid3;
                                    int i14110 = i13118 & (1008898890 + (((~(866778857 | i13119)) | 570447553) * 220) + (((~(i13119 | 573167337)) | 864059073) * (-440)) + ((iMyPid3 | 866778857) * 220));
                                    int i14111 = (int) j114;
                                    int i14112 = f853a;
                                    int i14113 = (i14112 ^ 53) + ((i14112 & 53) << 1);
                                    asInterface = i14113 % 128;
                                    int i14114 = i14113 % 2;
                                    int iMyTid3 = Process.myTid();
                                    int i14115 = i14111 & (237690373 + (((~(895473055 | (~iMyTid3))) | (~((-541753355) | iMyTid3))) * (-272)) + (((~(541840783 | iMyTid3)) | 353632272) * (-272)) + (((~(iMyTid3 | (-541840784))) | (-895385627)) * 272));
                                    i17 = (i14110 & i14115) | (i14110 ^ i14115);
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            } else {
                                int iCombineMeasuredStates4 = View.combineMeasuredStates(0, 0);
                                byte b15 = (byte) (((iCombineMeasuredStates4 | 45) << 1) - (iCombineMeasuredStates4 ^ 45));
                                int packedPositionType3 = ExpandableListView.getPackedPositionType(0L);
                                int i14116 = packedPositionType3 * 615;
                                int i14117 = (i14116 ^ (-613)) + ((i14116 & (-613)) << 1);
                                int i14118 = ~packedPositionType3;
                                int i14119 = ~((i14118 ^ 1) | (i14118 & 1));
                                int i15110 = (i7 ^ i14119) | (i7 & i14119);
                                int i15111 = ~(((-2) ^ packedPositionType3) | ((-2) & packedPositionType3));
                                int i15112 = -(-(((i15110 & i15111) | (i15110 ^ i15111)) * 614));
                                int i15113 = (i14117 & i15112) + (i14117 | i15112);
                                int i15114 = ~packedPositionType3;
                                int i15115 = ~i7;
                                int i15116 = ~((i15114 & i15115) | (i15114 ^ i15115));
                                int i15117 = i15113 + (((i15116 & i14119) | (i15116 ^ i14119) | (~((i15115 ^ 1) | (i15115 & 1)))) * (-1228));
                                int i15118 = i14118 | (-2);
                                int i15119 = ~i7;
                                int i16110 = ~((i15118 & i15119) | (i15118 ^ i15119));
                                int i16111 = ~(packedPositionType3 | i15115 | 1);
                                int i16112 = ((i16111 & i16110) | (i16110 ^ i16111)) * 614;
                                int i16113 = (i15117 & i16112) + (i16112 | i15117);
                                Object[] objArr115 = new Object[1];
                                d(new char[]{13784}, b15, i16113, objArr115);
                                str = (String) objArr115[0];
                                char c4 = (char) (34291 - (~(-(-(Process.myPid() >> 22)))));
                                int i16114 = -TextUtils.lastIndexOf("", '0');
                                int i16115 = ~((~i16114) | (-178));
                                int i16116 = ~i16114;
                                int i16117 = ~((i16116 & i15115) | (i16116 ^ i15115));
                                int i16118 = (i16115 & i16117) | (i16115 ^ i16117) | (~(((-178) & i15115) | ((-178) ^ i15115)));
                                int i16119 = (i16114 ^ 177) | (i16114 & 177);
                                int i17110 = ~((i16119 ^ i7) | (i16119 & i7));
                                int i17111 = (((i16114 * 85) + 15045) - (~(((i16118 & i17110) | (i16118 ^ i17110)) * (-84)))) - 1;
                                int i17112 = ~(((-178) & i7) | ((-178) ^ i7));
                                int i17113 = (i16114 & i17112) | (i16114 ^ i17112);
                                int i17114 = ~((i15115 ^ 177) | (i15115 & 177));
                                int i17115 = (i17111 - (~(-(-(((i17113 & i17114) | (i17113 ^ i17114)) * (-84)))))) - 1;
                                int i17116 = ~((i15119 ^ 177) | (i15119 & 177));
                                int i17117 = ~i16119;
                                Object[] objArr116 = new Object[1];
                                e(c4, i17115 + (((i17116 & i17117) | (i17116 ^ i17117)) * 84), 12 - (~ExpandableListView.getPackedPositionType(0L)), objArr116);
                                try {
                                    objArr2 = new Object[]{(String) objArr116[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char deadChar6 = (char) (KeyEvent.getDeadChar(0, 0) + 33602);
                                        int i17118 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3084;
                                        int iResolveSize3 = 26 - View.resolveSize(0, 0);
                                        byte[] bArr8 = $$a;
                                        byte b16 = bArr8[7];
                                        Object[] objArr117 = new Object[1];
                                        c(b16, b16, (byte) (-bArr8[14]), objArr117);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar6, i17118, iResolveSize3, 1411172903, false, (String) objArr117[0], new Class[]{String.class});
                                    }
                                    if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                        int i17119 = f853a;
                                        int i18110 = (i17119 & 49) + (i17119 | 49);
                                        asInterface = i18110 % 128;
                                        int i18111 = i18110 % 2;
                                        i17 = 0;
                                    } else {
                                        i17 = 1;
                                    }
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Exception unused) {
                        }
                        i18 = (~(i7 & 10)) & (i7 | 10);
                        i19 = (i17 | (-i17)) >> 31;
                        i20 = asInterface;
                        i21 = (i20 & 33) + (i20 | 33);
                        f853a = i21 % 128;
                        if (i21 % 2 == 0) {
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        int i18112 = (~i19) & i7;
                        int i18113 = i19 & i18;
                        int i18114 = (i18113 & i18112) | (i18112 ^ i18113);
                        int i18115 = i8 & 32;
                        int i18116 = -i18115;
                        int i18117 = ((i18115 & i18116) | (i18115 ^ i18116)) >> 31;
                        int i18118 = i18114 & (~i18117);
                        int i18119 = i18117 & i7;
                        i12 = (i18118 & i18119) | (i18118 ^ i18119);
                        int i196 = (i20 ^ 113) + ((i20 & 113) << 1);
                        f853a = i196 % 128;
                        int i197 = i196 % 2;
                    }
                    int i198 = (~(i7 & i10)) & (i7 | i10);
                    int i199 = -i198;
                    int i200 = ((i198 & i199) | (i198 ^ i199)) >> 31;
                    int i201 = f853a;
                    int i202 = (i201 & 1) + (i201 | 1);
                    asInterface = i202 % 128;
                    char c5 = 4;
                    if (i202 % 2 != 0) {
                        i13 = (i12 & (~i200)) | (i200 & i10);
                        objArr = new Object[]{new int[0], new int[0]};
                        iArr = new int[0];
                    } else {
                        i13 = (i12 & (~i200)) | (i200 & i10);
                        objArr = new Object[4];
                        objArr[0] = new int[1];
                        objArr[1] = new int[1];
                        iArr = new int[1];
                        c5 = 2;
                    }
                    objArr[c5] = iArr;
                    int i203 = (~(i7 & i13)) & (i7 | i13);
                    int i204 = -i203;
                    int i205 = (((i203 & i204) | (i203 ^ i204)) >> 31) & 16;
                    ((int[]) objArr[0])[0] = i7;
                    int[] iArr2 = (int[]) objArr[2];
                    int i206 = (i201 ^ 35) + ((i201 & 35) << 1);
                    asInterface = i206 % 128;
                    if (i206 % 2 != 0) {
                        iArr2[0] = i13;
                        objArr[2] = null;
                        int iMyTid4 = Process.myTid();
                        i14 = (-340708924) + ((~((~iMyTid4) | (-244912706))) * (-116)) + ((828698046 | iMyTid4) * 116);
                        i15 = ((~(iMyTid4 | 788387817)) | 285222934) * 116;
                    } else {
                        iArr2[0] = i13;
                        objArr[3] = null;
                        int iUptimeMillis = (int) SystemClock.uptimeMillis();
                        int i207 = ~iUptimeMillis;
                        i14 = (-529821420) + ((133790271 | iUptimeMillis) * (-676)) + (((~(95975442 | i207)) | (-133790272)) * 676);
                        i15 = ((~(iUptimeMillis | (-37814830))) | (~(i207 | 55665213)) | 78125058) * 676;
                    }
                    int i208 = i14 + i15;
                    int i209 = f853a;
                    int i210 = (i209 ^ 21) + ((i209 & 21) << 1);
                    asInterface = i210 % 128;
                    if (i210 % 2 != 0) {
                        int i211 = (-391) / i205;
                        int i212 = -(i208 - 195);
                        i16 = (i211 & i212) + (i211 | i212);
                    } else {
                        i16 = ((i205 * (-391)) - (~(i208 * (-195)))) - 1;
                    }
                    int i213 = ~i208;
                    int i214 = ~((i213 & i205) | (i213 ^ i205));
                    int i215 = ~((i208 ^ i7) | (i208 & i7));
                    int i216 = (-196) * ((i214 & i215) | (i214 ^ i215));
                    int i217 = (((i16 ^ i216) + ((i216 & i16) << 1)) - (~(-(-((i205 | i208) * 392))))) - 1;
                    int i218 = ~i205;
                    int i219 = ~i208;
                    int i220 = ~((i218 & i219) | (i218 ^ i219));
                    int i221 = (i7 & i208) | (i208 ^ i7);
                    int i222 = i209 + 95;
                    asInterface = i222 % 128;
                    if (i222 % 2 != 0) {
                        int i223 = ~i221;
                        int i224 = i9 % (i217 * (196 % ((i223 & i220) | (i220 ^ i223))));
                        int i225 = i224 >>> 78;
                        int i226 = (i224 | i225) & (~(i224 & i225));
                        int i227 = i226 * 95;
                        int i228 = ((~i226) & i227) | ((~i227) & i226);
                        int i229 = i228 / 4;
                        ((int[]) objArr[1])[1] = (i228 | i229) & (~(i228 & i229));
                        return objArr;
                    }
                    int i230 = ~i221;
                    int i231 = -(-(((i230 & i220) | (i220 ^ i230)) * 196));
                    int i232 = -(-((i217 & i231) + (i231 | i217)));
                    int i233 = (i9 & i232) + (i9 | i232);
                    int i234 = i233 << 13;
                    int i235 = (i234 | i233) & (~(i233 & i234));
                    int i236 = i235 >>> 17;
                    int i237 = ((~i235) & i236) | ((~i236) & i235);
                    ((int[]) objArr[1])[0] = i237 ^ (i237 << 5);
                    return objArr;
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0022  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r7, short r8, int r9) {
                /*
                    int r8 = r8 * 4
                    int r8 = 1 - r8
                    int r9 = 116 - r9
                    int r7 = r7 + 4
                    byte[] r0 = com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.AnonymousClass2.$$c
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L12
                    r3 = r8
                    r4 = r2
                    goto L27
                L12:
                    r3 = r2
                L13:
                    int r7 = r7 + 1
                    int r4 = r3 + 1
                    byte r5 = (byte) r9
                    r1[r3] = r5
                    if (r4 != r8) goto L22
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L22:
                    r3 = r0[r7]
                    r6 = r3
                    r3 = r9
                    r9 = r6
                L27:
                    int r9 = -r9
                    int r9 = r9 + r3
                    r3 = r4
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.AnonymousClass2.$$g(byte, short, int):java.lang.String");
            }
        });
        this.notify.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    MandiriBillStatusActivity mandiriBillStatusActivity = MandiriBillStatusActivity.this;
                    boolean zTuitionPaymentFragmentbindingInflater1 = MandiriBillStatusActivity.TuitionPaymentFragmentbindingInflater1(mandiriBillStatusActivity, "Company Code Number", MandiriBillStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mandiriBillStatusActivity).getText().toString());
                    MandiriBillStatusActivity mandiriBillStatusActivity2 = MandiriBillStatusActivity.this;
                    onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mandiriBillStatusActivity2, mandiriBillStatusActivity2.getString(zTuitionPaymentFragmentbindingInflater1 ? R.string.copied_company_code : R.string.failed_to_copy));
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.onTransact.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    TransactionResponse transactionResponse = MandiriBillStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(MandiriBillStatusActivity.this).b;
                    String pdfUrl = transactionResponse == null ? "" : transactionResponse.getPdfUrl();
                    MandiriBillStatusActivity mandiriBillStatusActivity = MandiriBillStatusActivity.this;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(pdfUrl));
                    mandiriBillStatusActivity.startActivity(intent);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.getInterfaceDescriptor.setText(((BaseVaPaymentStatusActivity) this).d.TuitionPaymentFragmentbindingInflater1());
        DefaultTextView defaultTextView = this.INotificationSideChannelStubProxy;
        sortInDescendingOrder sortindescendingorder = ((BaseVaPaymentStatusActivity) this).d;
        TransactionResponse transactionResponse = sortindescendingorder.b;
        if (transactionResponse == null || !(!TextUtils.isEmpty(transactionResponse.getCompanyCode()))) {
            companyCode = "";
        } else {
            companyCode = sortindescendingorder.b.getCompanyCode();
            int i7 = MediaBrowserCompat + 9;
            read = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 3;
            }
        }
        defaultTextView.setText(companyCode);
        DefaultTextView defaultTextView2 = this.INotificationSideChannelStub;
        sortInDescendingOrder sortindescendingorder2 = ((BaseVaPaymentStatusActivity) this).d;
        TransactionResponse transactionResponse2 = sortindescendingorder2.b;
        defaultTextView2.setText(getString(R.string.text_format_valid_until, (transactionResponse2 == null || TextUtils.isEmpty(transactionResponse2.getMandiriBillExpiration())) ? "" : sortindescendingorder2.b.getMandiriBillExpiration()));
        TransactionResponse transactionResponse3 = ((BaseVaPaymentStatusActivity) this).d.b;
        if (TextUtils.isEmpty(transactionResponse3 == null ? "" : transactionResponse3.getPdfUrl())) {
            this.onTransact.setVisibility(8);
        }
        if (((BaseVaPaymentStatusActivity) this).d.g()) {
            int i9 = MediaBrowserCompat + 117;
            read = i9 % 128;
            int i10 = i9 % 2;
            this.INotificationSideChannelStub.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_offer_failure));
            this.INotificationSideChannelStub.setText(getString(R.string.payment_failed));
            this.getInterfaceDescriptor.setText("");
            this.INotificationSideChannelStubProxy.setText("");
            this.cancelAll.setEnabled(false);
            this.notify.setEnabled(false);
            this.onTransact.setVisibility(8);
            int i11 = read + 1;
            MediaBrowserCompat = i11 % 128;
            int i12 = i11 % 2;
        }
        ((BaseVaPaymentStatusActivity) this).d.b("Bank Transfer Mandiri Charge", getIntent().getBooleanExtra("First Page", true));
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity, com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char absoluteGravity = (char) (29944 - Gravity.getAbsoluteGravity(0, 0));
            int i2 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1755;
            int maximumFlingVelocity = 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte[] bArr = $$m;
            Object[] objArr2 = new Object[1];
            o((byte) 15, bArr[5], bArr[28], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(absoluteGravity, i2, maximumFlingVelocity, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char windowTouchSlop = (char) (29944 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1756;
                int iMyPid = 23 - (Process.myPid() >> 22);
                byte[] bArr2 = $$m;
                Object[] objArr3 = new Object[1];
                o(bArr2[7], bArr2[5], (short) (bArr2[17] + 1), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop, iLastIndexOf, iMyPid, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = ~iIdentityHashCode;
            int i4 = 896900853 + ((iIdentityHashCode | (-820433604)) * 140) + (((~((-820433604) | i3)) | 813875393) * (-280)) + (((~(iIdentityHashCode | (-813875394))) | (~(1033036029 | i3)) | (-1039594240)) * 140) + 1590267856;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            p(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_instruction_step4).substring(26, 27).codePointAt(0) - 97, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 4411), new char[]{12390, 31062, 50430, 12544, 5619, 14167, 61667, 39801, 32928, 54857, 32295, 23454, 43428, 17096, 6393, 35644}, new char[]{43015, 19872, 24486, 50705}, new char[]{0, 0, 0, 0}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            p(Process.myPid() >> 22, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_permata).substring(1, 3).length() + 12883), new char[]{20260, 54462, 13460, 63413, 29410, 52918, 56554, 22943, 20627, 60963, 61443, 45238, 16460, 2349, 43579, 46090}, new char[]{41970, 10493, 21985, 30002}, new char[]{0, 0, 0, 0}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-1365141593};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 42049), 1726 - Color.blue(0), 29 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = EncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 1590267856, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 1756;
                    int i7 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22;
                    byte[] bArr3 = $$m;
                    Object[] objArr8 = new Object[1];
                    o(bArr3[7], bArr3[5], (short) (bArr3[17] + 1), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyTid, iLastIndexOf2, i7, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    p(ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_invalid_expiry_date).substring(14, 16).codePointAt(0) - 97), new char[]{26371, 27343, 30449, 48720, 676, 14886, 49474, 31229, 4320, 10930, 65058, 7474, 45050, 20509, 53343, 33272, 49261, 64517, 172, 18315, 6167, 25442}, new char[]{48995, 7692, 3888, 34511}, new char[]{0, 0, 0, 0}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    p(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.success).substring(0, 7).codePointAt(1) - 669868538, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 4956), new char[]{27581, 28879, 22795, 64006, 10276, 54295, 20632, 15602, 57173, 50008, 5774, 53609, 20361, 16494, 11257}, new char[]{31502, 4766, 23768, 1811}, new char[]{0, 0, 0, 0}, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char packedPositionChild = (char) (29943 - ExpandableListView.getPackedPositionChild(0L));
                        int i8 = 1756 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int mode = View.MeasureSpec.getMode(0) + 23;
                        byte[] bArr4 = $$m;
                        Object[] objArr11 = new Object[1];
                        o(bArr4[7], bArr4[5], (short) (-bArr4[1]), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionChild, i8, mode, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char mirror = (char) (29992 - AndroidCharacter.getMirror('0'));
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1756;
                        int iMyTid = 23 - (Process.myTid() >> 22);
                        byte[] bArr5 = $$m;
                        Object[] objArr12 = new Object[1];
                        o((byte) 15, bArr5[5], bArr5[28], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, iIndexOf, iMyTid, 986134021, false, (String) objArr12[0], null);
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
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
            if (strArr == null) {
                throw null;
            }
            int i9 = MediaBrowserCompat + 39;
            read = i9 % 128;
            int i10 = i9 % 2;
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i11 = MediaBrowserCompat + 39;
        read = i11 % 128;
        int i12 = i11 % 2;
        int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 1984796008;
        int i14 = ~iCodePointAt;
        int i15 = i13 + ((((~(493097624 | i14)) | (~(iCodePointAt | 705700050))) * 959) - 1191661619) + (((~(iCodePointAt | 493097624)) | (~(i14 | 705700050))) * 959);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr13[3])[0] = i17 ^ (i17 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
            int touchSlop = 1031 - (ViewConfiguration.getTouchSlop() >> 8);
            int i18 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15;
            byte[] bArr6 = $$m;
            Object[] objArr14 = new Object[1];
            o(bArr6[7], bArr6[5], (short) 140, objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, touchSlop, i18, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        p(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_no_face).substring(13, 14).length() - 1, (char) (TextUtils.lastIndexOf("", '0') + 1), new char[]{26371, 27343, 30449, 48720, 676, 14886, 49474, 31229, 4320, 10930, 65058, 7474, 45050, 20509, 53343, 33272, 49261, 64517, 172, 18315, 6167, 25442}, new char[]{48995, 7692, 3888, 34511}, new char[]{0, 0, 0, 0}, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        p((-669868420) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (TextUtils.getCapsMode("", 0, 0) + 4956), new char[]{27581, 28879, 22795, 64006, 10276, 54295, 20632, 15602, 57173, 50008, 5774, 53609, 20361, 16494, 11257}, new char[]{31502, 4766, 23768, 1811}, new char[]{0, 0, 0, 0}, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char gidForName = (char) (Process.getGidForName("") + 1);
            int iResolveSize = View.resolveSize(0, 0) + 1031;
            int iAlpha = Color.alpha(0) + 15;
            byte[] bArr7 = $$m;
            Object[] objArr17 = new Object[1];
            o(bArr7[7], bArr7[5], (short) (bArr7[17] + 1), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(gidForName, iResolveSize, iAlpha, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i19 = MediaBrowserCompat + 45;
            read = i19 % 128;
            int i20 = i19 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                int touchSlop2 = 1031 - (ViewConfiguration.getTouchSlop() >> 8);
                int iMyPid2 = (Process.myPid() >> 22) + 15;
                byte b = $$m[7];
                Object[] objArr18 = new Object[1];
                o((byte) 52, b, (short) (b | 192), objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(absoluteGravity2, touchSlop2, iMyPid2, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i21 = ((int[]) objArr19[3])[0];
            int i22 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i23 = (~((-214058931) | iIdentityHashCode2)) | 12583858;
            int i24 = ~((~iIdentityHashCode2) | 231696311);
            int i25 = 1863726133 + ((i23 | i24) * (-470)) + (((~(iIdentityHashCode2 | (-201475073))) | i24) * 470) + 256302945;
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr[2])[0] = i27 ^ (i27 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            p(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_5).substring(3, 4).codePointAt(0) - 117, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4436), new char[]{12390, 31062, 50430, 12544, 5619, 14167, 61667, 39801, 32928, 54857, 32295, 23454, 43428, 17096, 6393, 35644}, new char[]{43015, 19872, 24486, 50705}, new char[]{0, 0, 0, 0}, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            p((-1) - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 12849), new char[]{20260, 54462, 13460, 63413, 29410, 52918, 56554, 22943, 20627, 60963, 61443, 45238, 16460, 2349, 43579, 46090}, new char[]{41970, 10493, 21985, 30002}, new char[]{0, 0, 0, 0}, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {-1365141593};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (MotionEvent.axisFromString("") + 46039), KeyEvent.getDeadChar(0, 0) + 1134, View.MeasureSpec.getSize(0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 256302945, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cMyTid2 = (char) (Process.myTid() >> 22);
                int fadingEdgeLength = 1031 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int iIndexOf2 = 14 - TextUtils.indexOf((CharSequence) "", '0');
                byte[] bArr8 = $$m;
                Object[] objArr24 = new Object[1];
                o(bArr8[7], bArr8[5], (short) 140, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cMyTid2, fadingEdgeLength, iIndexOf2, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.lastIndexOf("", '0', 0) + 45994), (ViewConfiguration.getEdgeSlop() >> 16) + 1117, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                int iResolveOpacity = 1031 - Drawable.resolveOpacity(0, 0);
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 15;
                byte b2 = $$m[7];
                Object[] objArr25 = new Object[1];
                o((byte) 52, b2, (short) (b2 | 192), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cLastIndexOf, iResolveOpacity, offsetAfter, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                p(ViewConfiguration.getTapTimeout() >> 16, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), new char[]{26371, 27343, 30449, 48720, 676, 14886, 49474, 31229, 4320, 10930, 65058, 7474, 45050, 20509, 53343, 33272, 49261, 64517, 172, 18315, 6167, 25442}, new char[]{48995, 7692, 3888, 34511}, new char[]{0, 0, 0, 0}, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                p((-669868421) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.next).substring(1, 2).length() + 4955), new char[]{27581, 28879, 22795, 64006, 10276, 54295, 20632, 15602, 57173, 50008, 5774, 53609, 20361, 16494, 11257}, new char[]{31502, 4766, 23768, 1811}, new char[]{0, 0, 0, 0}, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int iResolveSize2 = View.resolveSize(0, 0) + 1031;
                    int i28 = 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte[] bArr9 = $$m;
                    Object[] objArr28 = new Object[1];
                    o(bArr9[7], bArr9[5], (short) (bArr9[17] + 1), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cResolveSizeAndState, iResolveSize2, i28, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int iGreen = 1031 - Color.green(0);
                    int iResolveSize3 = 15 - View.resolveSize(0, 0);
                    byte[] bArr10 = $$m;
                    Object[] objArr29 = new Object[1];
                    o(bArr10[7], bArr10[5], (short) 140, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(keyRepeatDelay, iGreen, iResolveSize3, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i29 = ((int[]) objArr[1])[0];
        int i30 = ((int[]) objArr[3])[0];
        if (i30 != i29) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i31 = MediaBrowserCompat + 59;
                read = i31 % 128;
                for (int i32 = i31 % 2 != 0 ? 0 : 1; i32 < strArr3.length; i32++) {
                    arrayList2.add(strArr3[i32]);
                }
            }
            throw new RuntimeException(String.valueOf(i30));
        }
        int i33 = MediaBrowserCompat + 65;
        read = i33 % 128;
        int i34 = i33 % 2;
        Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i35 = ((int[]) objArr[2])[0];
        int i36 = ((int[]) objArr[3])[0];
        int i37 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 2081812209;
        int i38 = 1143913201 + ((~(iCodePointAt2 | 173932838)) * 216);
        int i39 = ~iCodePointAt2;
        int i40 = i35 + i38 + (((-69298754) | i39) * (-216)) + (((~(i39 | 173932838)) | 70347331) * 216);
        int i41 = i40 ^ (i40 << 13);
        int i42 = i41 ^ (i41 >>> 17);
        ((int[]) objArr30[2])[0] = i42 ^ (i42 << 5);
    }

    private static void p(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $11 + 43;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8327 - TextUtils.indexOf((CharSequence) "", '0')), Color.argb(0, 0, 0, 0) + 1235, 34 - ExpandableListView.getPackedPositionChild(0L), -653973969, false, $$z(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2763, 14 - ((Process.getThreadPriority(0) + 20) >> 6), 1504416861, false, $$z(b3, b4, (byte) (b4 - 2)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - TextUtils.getOffsetBefore("", 0)), 301 - AndroidCharacter.getMirror('0'), View.getDefaultSize(0, 0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.getMode(0) + 65200), 2891 - KeyEvent.getDeadChar(0, 0), 17 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2012627446, false, $$z(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (RemoteActionCompatParcelizer ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) INotificationSideChannelDefault) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) write) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $10 + 115;
                $11 = i6 % 128;
                int i7 = i6 % 2;
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
        int i8 = $10 + 77;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 1 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00da, code lost:
    
        if (r1 != ((((-458405284) + ((336625664 | r4) * (-192))) + (((~(2086109508 | r4)) | 33572513) * (-384))) + (((~(r2 | (-1749483845))) | ((~(r4 | 2119682021)) | (~((-33572514) | r2)))) * okhttp3.tls.internal.der.DerHeader.TAG_CLASS_PRIVATE))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00dc, code lost:
    
        super.onResume();
        r1 = com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.MediaBrowserCompat + 77;
        com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.read = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f1, code lost:
    
        throw new java.lang.RuntimeException("-490485551");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0044, code lost:
    
        if (r1 == ((((-497242392) + (((-2074046464) | r6) * (-712))) + (((~(r4 | (-1376322408))) | (~(r5 | 2074046463))) * (-712))) + ((1527711599 | r6) * 712))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0082, code lost:
    
        if (r1 == ((((-1259946512) + ((r5 | (~((-839435010) | r6))) * (-406))) + ((~(853409599 | r6)) * (-406))) + (((~(r4 | (-13974591))) | (~((-843962134) | r6))) * 406))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0084, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r4 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        r4 = ~r2;
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity, com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.onResume():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ee, code lost:
    
        if (r1 != ((r6 + (((~(3001861 | r5)) | (-1719520942)) * (-1976))) + ((((~(r2 | 1718913192)) | 2394112) | (~((-1718913193) | r5))) * 988))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f0, code lost:
    
        super.onStart();
        r1 = com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.MediaBrowserCompat + 11;
        com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.read = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fc, code lost:
    
        if ((r1 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00fe, code lost:
    
        r0 = 71 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0101, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0102, code lost:
    
        r1 = (-550419086) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x010b, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0113, code lost:
    
        throw new java.lang.RuntimeException("863926534");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005d, code lost:
    
        if (r1 == (((521392822 + ((r8 | r6) * (-713))) + (r6 * 1426)) + ((~(1512272506 | r7)) * 713))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x009e, code lost:
    
        if (r1 == (((1563865192 + (((~(r6 | 1876951039)) | (~((-541366805) | r6))) * (-184))) + (((252798346 | (~((-794165151) | r6))) | (~(1624152693 | r6))) * 184)) - 1664108144)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a0, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
        r6 = (-831806840) + ((r2 | 2394112) * 988);
        r5 = ~r2;
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity, com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.onStart():void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentbindingInflater1(new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1020720465, 1335037232, -1335037232, lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b());
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity, com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 119;
        read = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$z(byte r6, int r7, byte r8) {
        /*
            int r7 = r7 + 102
            byte[] r0 = com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.$$x
            int r6 = r6 * 3
            int r6 = r6 + 1
            int r8 = r8 * 2
            int r8 = 3 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r8]
        L27:
            int r7 = r7 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.banktransfer.status.MandiriBillStatusActivity.$$z(byte, int, byte):java.lang.String");
    }
}
