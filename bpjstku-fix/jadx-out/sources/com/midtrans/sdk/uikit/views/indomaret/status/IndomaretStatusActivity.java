package com.midtrans.sdk.uikit.views.indomaret.status;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.bpjstku.R;
import com.google.android.gms.internal.auth.zzgx;
import com.google.zxing.BarcodeFormat;
import com.midtrans.sdk.corekit.core.Constants;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.abstracts.BaseActivity;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import com.midtrans.sdk.uikit.widgets.SemiBoldTextView;
import defpackage.DeviceProperties;
import defpackage.ViewPortBuilder;
import defpackage.calculateCameraUseCases;
import defpackage.createBitmapFromJpegImage;
import defpackage.createExtraPreview;
import defpackage.getBufferFormat;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.onConnectionFailed;
import defpackage.propagateChildrenTemplate;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class IndomaretStatusActivity extends BasePaymentActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private LinearLayout INotificationSideChannel;
    private DefaultTextView INotificationSideChannelDefault;
    private propagateChildrenTemplate INotificationSideChannelStub;
    private DefaultTextView INotificationSideChannelStubProxy;
    private SemiBoldTextView RemoteActionCompatParcelizer;
    private ImageView cancel;
    private AppCompatButton cancelAll;
    private FancyButton notify;
    private FancyButton onTransact;
    private static final byte[] $$j = {33, -59, 107, -108, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$k = 118;
    private static int read = 0;
    private static int connect = 1;
    private static long getInterfaceDescriptor = 3535964987275685291L;
    private final String asInterface = "Indomaret Payment Code";
    private final String d = "Done Indomaret";
    private final String g = "IndomaretStatusActivity";

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(IndomaretStatusActivity indomaretStatusActivity) {
        Drawable drawable;
        int i = 2 % 2;
        int i2 = ((BaseActivity) indomaretStatusActivity).b;
        if (i2 != 0) {
            int i3 = connect + 29;
            read = i3 % 128;
            int i4 = i3 % 2;
            if (indomaretStatusActivity.INotificationSideChannel.getVisibility() == 0) {
                int i5 = read + 61;
                connect = i5 % 128;
                if (i5 % 2 == 0) {
                    drawable = ContextCompat.getDrawable(indomaretStatusActivity, 2131231195);
                    indomaretStatusActivity.INotificationSideChannel.setVisibility(5);
                } else {
                    drawable = ContextCompat.getDrawable(indomaretStatusActivity, 2131231195);
                    indomaretStatusActivity.INotificationSideChannel.setVisibility(8);
                }
            } else {
                drawable = ContextCompat.getDrawable(indomaretStatusActivity, 2131231194);
                indomaretStatusActivity.INotificationSideChannel.setVisibility(0);
            }
            try {
                drawable.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
                indomaretStatusActivity.cancelAll.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                return;
            } catch (RuntimeException e2) {
                String str = indomaretStatusActivity.g;
                StringBuilder sb = new StringBuilder("changeToggleInstructionVisibility");
                sb.append(e2.getMessage());
                Logger.e(str, sb.toString());
            }
        }
        int i6 = read + 125;
        connect = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 3 / 0;
        }
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(IndomaretStatusActivity indomaretStatusActivity, String str, String str2) {
        int i = 2 % 2;
        int i2 = connect + 119;
        read = i2 % 128;
        int i3 = i2 % 2;
        ClipboardManager clipboardManager = (ClipboardManager) indomaretStatusActivity.getSystemService("clipboard");
        ClipData clipDataNewPlainText = ClipData.newPlainText(str, str2);
        if (clipboardManager == null) {
            return false;
        }
        int i4 = connect + 69;
        read = i4 % 128;
        int i5 = i4 % 2;
        clipboardManager.setPrimaryClip(clipDataNewPlainText);
        int i6 = connect + 109;
        read = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public static /* synthetic */ propagateChildrenTemplate TuitionPaymentFragmentspecialinlinedviewModeldefault1(IndomaretStatusActivity indomaretStatusActivity) {
        int i = 2 % 2;
        int i2 = connect;
        int i3 = i2 + 7;
        read = i3 % 128;
        int i4 = i3 % 2;
        propagateChildrenTemplate propagatechildrentemplate = indomaretStatusActivity.INotificationSideChannelStub;
        int i5 = i2 + 91;
        read = i5 % 128;
        int i6 = i5 % 2;
        return propagatechildrentemplate;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r6 = 197 - r6
            byte[] r0 = com.midtrans.sdk.uikit.views.indomaret.status.IndomaretStatusActivity.$$j
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r8
            r3 = r2
            r8 = r6
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L28:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            int r8 = r8 + 1
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.indomaret.status.IndomaretStatusActivity.m(short, byte, short, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = read + 111;
        connect = i2 % 128;
        int i3 = i2 % 2;
        setPrimaryBackgroundColor(this.notify);
        setTextColor(this.cancelAll);
        FancyButton fancyButton = this.onTransact;
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i4 != 0) {
            int i5 = read + 7;
            connect = i5 % 128;
            if (i5 % 2 == 0) {
                fancyButton.setBorderColor(i4);
                int i6 = 15 / 0;
            } else {
                fancyButton.setBorderColor(i4);
            }
        }
        setTextColor(this.onTransact);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        propagateChildrenTemplate propagatechildrentemplate = this.INotificationSideChannelStub;
        if (propagatechildrentemplate != null) {
            int i2 = read + 125;
            connect = i2 % 128;
            if (i2 % 2 == 0) {
                propagatechildrentemplate.TuitionPaymentFragmentbindingInflater1("Back", "Indomaret Payment Code");
                int i3 = 81 / 0;
            } else {
                propagatechildrentemplate.TuitionPaymentFragmentbindingInflater1("Back", "Indomaret Payment Code");
            }
            int i4 = read + 53;
            connect = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 4;
            }
        }
        super.onBackPressed();
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = read + 91;
        connect = i2 % 128;
        int i3 = i2 % 2;
        this.cancel = (ImageView) findViewById(R.id.barcode_container);
        this.onTransact = (FancyButton) findViewById(R.id.btn_copy_va);
        this.notify = (FancyButton) findViewById(R.id.button_primary);
        this.cancelAll = (AppCompatButton) findViewById(R.id.instruction_toggle);
        this.INotificationSideChannel = (LinearLayout) findViewById(R.id.instruction_layout);
        this.INotificationSideChannelDefault = (DefaultTextView) findViewById(R.id.text_validity);
        this.RemoteActionCompatParcelizer = (SemiBoldTextView) findViewById(R.id.text_page_title);
        this.INotificationSideChannelStubProxy = (DefaultTextView) findViewById(R.id.text_payment_code);
        int i4 = read + 91;
        connect = i4 % 128;
        int i5 = i4 % 2;
    }

    private void a() {
        int i;
        int i2 = 2 % 2;
        TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.INotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            if (TextUtils.isEmpty(transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3.getStatusCode()) || !(transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3.getStatusCode().equals(Constants.STATUS_CODE_200) || transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3.getStatusCode().equals(Constants.STATUS_CODE_201))) {
                this.INotificationSideChannelDefault.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_offer_failure));
                this.INotificationSideChannelDefault.setText(getString(R.string.payment_failed));
            } else {
                this.INotificationSideChannelDefault.setText(getString(R.string.text_format_valid_until, transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3.getIndomaretExpireTime()));
                if (transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3.getPaymentCodeResponse() != null) {
                    String paymentCodeResponse = this.INotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault3().getPaymentCodeResponse();
                    StringBuilder sb = new StringBuilder();
                    if (!TextUtils.isEmpty(paymentCodeResponse)) {
                        int i3 = read + 93;
                        connect = i3 % 128;
                        int i4 = i3 % 2;
                        int i5 = 0;
                        while (i5 < paymentCodeResponse.length()) {
                            int i6 = i5 + 4;
                            if (i6 < paymentCodeResponse.length()) {
                                int i7 = connect + 71;
                                read = i7 % 128;
                                if (i7 % 2 != 0) {
                                    sb.append(paymentCodeResponse.substring(i5, i6));
                                    sb.append(" ");
                                    int i8 = 6 / 0;
                                } else {
                                    sb.append(paymentCodeResponse.substring(i5, i6));
                                    sb.append(" ");
                                }
                            } else {
                                sb.append(paymentCodeResponse.substring(i5));
                                int i9 = connect + 67;
                                read = i9 % 128;
                                int i10 = i9 % 2;
                            }
                            i5 = i6;
                        }
                    }
                    String string = sb.toString();
                    ((DefaultTextView) findViewById(R.id.payment_code)).setText(string);
                    String paymentCodeResponse2 = transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3.getPaymentCodeResponse();
                    try {
                        getBufferFormat getbufferformatTuitionPaymentFragmentspecialinlinedviewModeldefault1 = new DeviceProperties().TuitionPaymentFragmentspecialinlinedviewModeldefault1(paymentCodeResponse2, BarcodeFormat.CODE_39, getResources().getDimensionPixelSize(R.dimen.barcode_width), getResources().getDimensionPixelSize(R.dimen.barcode_height));
                        new createBitmapFromJpegImage();
                        int i11 = getbufferformatTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i12 = getbufferformatTuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
                        int[] iArr = new int[i11 * i12];
                        for (int i13 = 0; i13 < i12; i13++) {
                            int i14 = connect + 101;
                            read = i14 % 128;
                            int i15 = i14 % 2;
                            for (int i16 = 0; i16 < i11; i16++) {
                                if (getbufferformatTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i16, i13)) {
                                    int i17 = connect + 55;
                                    read = i17 % 128;
                                    int i18 = i17 % 2;
                                    i = ViewCompat.MEASURED_STATE_MASK;
                                } else {
                                    i = -1;
                                }
                                iArr[(i13 * i11) + i16] = i;
                            }
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap.setPixels(iArr, 0, i11, 0, 0, i11, i12);
                        ImageView imageView = this.cancel;
                        if (imageView != null) {
                            imageView.setImageBitmap(bitmapCreateBitmap);
                            this.cancel.setVisibility(0);
                        }
                    } catch (Exception e2) {
                        Logger.e(e2.getMessage());
                    }
                    this.INotificationSideChannelStubProxy.setText(string);
                }
            }
        }
        this.notify.setText(getString(R.string.complete_payment_indomaret));
        this.notify.setTextBold();
        this.RemoteActionCompatParcelizer.setText(getString(R.string.indomaret));
        this.INotificationSideChannelStub.b("Indomaret Payment Code", false);
        onConnectionFailed.TuitionPaymentFragmentbindingInflater1();
        int i19 = read + 23;
        connect = i19 % 128;
        int i20 = i19 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:47:0x01a7  */
    private static void n(char[] cArr, int i, Object[] objArr) throws Throwable {
        Throwable cause;
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $11 + 69;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = $10 + 97;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 19472), 2623 - TextUtils.lastIndexOf("", '0', 0), 13 - View.getDefaultSize(0, 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (getInterfaceDescriptor ^ 9053247990562531611L);
                try {
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - View.getDefaultSize(0, 0)), 481 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 37 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause2 = th.getCause();
                    if (cause2 == null) {
                        throw th;
                    }
                    throw cause2;
                }
            } catch (Throwable th2) {
                Throwable cause3 = th2.getCause();
                if (cause3 == null) {
                    throw th2;
                }
                throw cause3;
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i8 = $10 + 119;
        while (true) {
            $11 = i8 % 128;
            int i9 = i8 % 2;
            if (getrealtimecapturelatency.b >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            int i10 = $11 + 35;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (Process.myTid() >> 22) + 481, ExpandableListView.getPackedPositionType(0L) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            try {
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 39423), 481 - View.resolveSizeAndState(0, 0, 0), Process.getGidForName("") + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                i8 = $10 + 79;
            } catch (Throwable th3) {
                cause = th3.getCause();
                if (cause != null) {
                    throw th3;
                }
                throw cause;
            }
            cause = th3.getCause();
            if (cause != null) {
                throw th3;
            }
            throw cause;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = connect + 19;
        read = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 797283699;
        int i5 = ~((-539013426) | iCodePointAt);
        int i6 = ~iCodePointAt;
        if (i4 != 958661281 + ((i5 | (~(i6 | 1941700413))) * 497) + (((~(iCodePointAt | 1941700413)) | (~((-572699446) | i6)) | 33686020) * 497)) {
            int i7 = 914055878 % 2;
            throw new ArithmeticException();
        }
        int i8 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
        if (i8 != (-1082856870) + (((~(i9 | 870722832)) | (-2012691805)) * 305) + (((~((~i9) | 870722832)) | (-1708333133)) * 305)) {
            throw new RuntimeException("1410974254");
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_indomaret_status);
        onConnectionFailed.b((AppCompatActivity) this);
        this.INotificationSideChannelStub = new propagateChildrenTemplate((TransactionResponse) getIntent().getSerializableExtra("extra.status"));
        this.onTransact.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.indomaret.status.IndomaretStatusActivity.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    IndomaretStatusActivity indomaretStatusActivity = IndomaretStatusActivity.this;
                    boolean zTuitionPaymentFragmentbindingInflater1 = IndomaretStatusActivity.TuitionPaymentFragmentbindingInflater1(indomaretStatusActivity, "Payment Code", IndomaretStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(indomaretStatusActivity).TuitionPaymentFragmentspecialinlinedviewModeldefault3().getPaymentCodeResponse());
                    IndomaretStatusActivity indomaretStatusActivity2 = IndomaretStatusActivity.this;
                    onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(indomaretStatusActivity2, indomaretStatusActivity2.getString(zTuitionPaymentFragmentbindingInflater1 ? R.string.copied_to_clipboard : R.string.failed_to_copy));
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.notify.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.indomaret.status.IndomaretStatusActivity.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    IndomaretStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(IndomaretStatusActivity.this).TuitionPaymentFragmentbindingInflater1("Done Indomaret", "Indomaret Payment Code");
                    IndomaretStatusActivity.this.finish();
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.cancelAll.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.indomaret.status.IndomaretStatusActivity.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    IndomaretStatusActivity.TuitionPaymentFragmentbindingInflater1(IndomaretStatusActivity.this);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        a();
        int i10 = connect + 11;
        read = i10 % 128;
        if (i10 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (29945 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1755;
            int iMakeMeasureSpec = 23 - View.MeasureSpec.makeMeasureSpec(0, 0);
            Object[] objArr2 = new Object[1];
            m((short) 193, (byte) 37, $$j[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, packedPositionGroup, iMakeMeasureSpec, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i3 = read + 121;
            connect = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c2 = (char) (29945 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1755;
                int i5 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 23;
                Object[] objArr3 = new Object[1];
                m((short) 156, (byte) ($$k & 189), $$j[7], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iNormalizeMetaState, i5, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iMyTid = Process.myTid();
            int i6 = (-1987310087) + (((~(839822898 | iMyTid)) | 212865100) * 576) + (((~((~iMyTid) | 1052687998)) | 839560224) * 576) + 835530668;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            n(new char[]{34010, 50540, 1980, 16870, 33386, 52333, 3775, 18677, 35135, 52027, 5505, 22486, 36895, 53853, 7299, 24270}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 16793, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            n(new char[]{34009, 37137, 44895, 50577, 54224, 59392, 1626, 7338, 10960, 18236, 23921, 27567, 33231, 40926, 46098, 49758}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_alfamart).substring(0, 8).codePointAt(5) + 5476, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {760304247};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 42049), TextUtils.getCapsMode("", 0, 0) + 1726, (ViewConfiguration.getLongPressTimeout() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -1515682644);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 29944);
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1755;
                    int keyRepeatTimeout = 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    Object[] objArr8 = new Object[1];
                    m((short) 156, (byte) ($$k & 189), $$j[7], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cKeyCodeFromString, packedPositionType, keyRepeatTimeout, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    n(new char[]{34001, 15919, 61750, 46097, 28443, 8812, 58738, 38921, 21335, 5818, 51700, 36024, 18309, 64254, 48618, 28874, 11213, 61170, 41006, 23356, 7687, 53534}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 47821, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    n(new char[]{34005, 42671, 49207, 58265, 3343, 10474, 19046, 30151, 38733, 45786, 56482, 65077, 6589, 15114, 26271}, TextUtils.indexOf("", "") + 8819, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 29944);
                        int defaultSize = View.getDefaultSize(0, 0) + 1755;
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 23;
                        short s = (short) 104;
                        Object[] objArr11 = new Object[1];
                        m(s, (byte) (s >>> 1), $$j[7], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, defaultSize, longPressTimeout, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c3 = (char) (29945 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int maximumDrawingCacheSize = 1755 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 23;
                        Object[] objArr12 = new Object[1];
                        m((short) 193, (byte) 37, $$j[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, maximumDrawingCacheSize, offsetBefore, 986134021, false, (String) objArr12[0], null);
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
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0];
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0];
        if (i10 != i9) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4];
            if (strArr != null) {
                int i11 = connect + 47;
                read = i11 % 128;
                int i12 = i11 % 2;
                while (i2 < strArr.length) {
                    int i13 = read + 29;
                    connect = i13 % 128;
                    if (i13 % 2 == 0) {
                        arrayList.add(strArr[i2]);
                        i2 += 49;
                    } else {
                        arrayList.add(strArr[i2]);
                        i2++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i10));
        }
        int i14 = read + 67;
        connect = i14 % 128;
        int i15 = i14 % 2;
        int i16 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1104199839;
        int i17 = ~length;
        int i18 = i16 + 912167081 + (((~(i17 | 717977126)) | (~(505374700 | i17)) | (-1054832623)) * 464) + (((-549457923) | length) * (-464)) + (((~(length | 717977126)) | (-1054832623)) * 464);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr13[3])[0] = i20 ^ (i20 << 5);
        int i21 = read + 35;
        connect = i21 % 128;
        int i22 = i21 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
            int iNormalizeMetaState2 = 1031 - KeyEvent.normalizeMetaState(0);
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 15;
            short s2 = (short) ($$k & 189);
            Object[] objArr14 = new Object[1];
            m(s2, (byte) s2, $$j[7], objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, iNormalizeMetaState2, edgeSlop, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        n(new char[]{34001, 15919, 61750, 46097, 28443, 8812, 58738, 38921, 21335, 5818, 51700, 36024, 18309, 64254, 48618, 28874, 11213, 61170, 41006, 23356, 7687, 53534}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step1).substring(0, 4).codePointAt(1) + 47811, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        n(new char[]{34005, 42671, 49207, 58265, 3343, 10474, 19046, 30151, 38733, 45786, 56482, 65077, 6589, 15114, 26271}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.minute).substring(0, 1).codePointAt(0) + 8710, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int i23 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1030;
            int iGreen = 15 - Color.green(0);
            Object[] objArr17 = new Object[1];
            m((short) 156, (byte) ($$k & 189), $$j[7], objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(edgeSlop2, i23, iGreen, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i24 = connect + 15;
            read = i24 % 128;
            int i25 = i24 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                int pressedStateDuration = 1031 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 15;
                byte[] bArr = $$j;
                short s3 = bArr[7];
                Object[] objArr18 = new Object[1];
                m(s3, (byte) s3, bArr[28], objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cLastIndexOf, pressedStateDuration, tapTimeout, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr19[3])[0];
            int i27 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int i28 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            int i29 = ((1183758754 + (((~((-42994737) | (~i28))) | (-201285434)) * (-591))) + ((i28 | (-42994737)) * 591)) - 1840055575;
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr[2])[0] = i31 ^ (i31 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            n(new char[]{34010, 50540, 1980, 16870, 33386, 52333, 3775, 18677, 35135, 52027, 5505, 22486, 36895, 53853, 7299, 24270}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.orderId).substring(0, 8).length() + 16821, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            n(new char[]{34009, 37137, 44895, 50577, 54224, 59392, 1626, 7338, 10960, 18236, 23921, 27567, 33231, 40926, 46098, 49758}, 5572 - ExpandableListView.getPackedPositionChild(0L), objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {760304247};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getScrollBarSize() >> 8) + 1134, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -1840055575, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                int i32 = 1031 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int iRed = Color.red(0) + 15;
                short s4 = (short) ($$k & 189);
                Object[] objArr24 = new Object[1];
                m(s4, (byte) s4, $$j[7], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cAxisFromString, i32, iRed, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((Process.myPid() >> 22) + 45993), (KeyEvent.getMaxKeyCode() >> 16) + 1117, TextUtils.indexOf((CharSequence) "", '0') + 18), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c4 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int iArgb = 1031 - Color.argb(0, 0, 0, 0);
                int threadPriority = 15 - ((Process.getThreadPriority(0) + 20) >> 6);
                byte[] bArr2 = $$j;
                short s5 = bArr2[7];
                Object[] objArr25 = new Object[1];
                m(s5, (byte) s5, bArr2[28], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c4, iArgb, threadPriority, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                n(new char[]{34001, 15919, 61750, 46097, 28443, 8812, 58738, 38921, 21335, 5818, 51700, 36024, 18309, 64254, 48618, 28874, 11213, 61170, 41006, 23356, 7687, 53534}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 47846, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                n(new char[]{34005, 42671, 49207, 58265, 3343, 10474, 19046, 30151, 38733, 45786, 56482, 65077, 6589, 15114, 26271}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_error_unable_to_decrypt_message).substring(0, 26).codePointAt(5) + 8718, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 1031;
                    int i33 = 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    Object[] objArr28 = new Object[1];
                    m((short) 156, (byte) ($$k & 189), $$j[7], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(fadingEdgeLength, packedPositionType2, i33, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int i34 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1031;
                    int iArgb2 = Color.argb(0, 0, 0, 0) + 15;
                    short s6 = (short) ($$k & 189);
                    Object[] objArr29 = new Object[1];
                    m(s6, (byte) s6, $$j[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(threadPriority2, i34, iArgb2, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i35 = ((int[]) objArr[1])[0];
        int i36 = ((int[]) objArr[3])[0];
        if (i36 != i35) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i37 = read + 65;
                connect = i37 % 128;
                for (int i38 = i37 % 2 != 0 ? 0 : 1; i38 < strArr3.length; i38++) {
                    int i39 = connect + 47;
                    read = i39 % 128;
                    int i40 = i39 % 2;
                    arrayList2.add(strArr3[i38]);
                }
            }
            throw new RuntimeException(String.valueOf(i36));
        }
        int i41 = connect + 27;
        read = i41 % 128;
        int i42 = i41 % 2;
        Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i43 = ((int[]) objArr[2])[0];
        int i44 = ((int[]) objArr[3])[0];
        int i45 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        int i46 = i43 + 263507870 + ((~(231667689 | layoutDirection)) * (-301)) + (((~((-29423562) | layoutDirection)) | (~((~layoutDirection) | 214856608))) * (-301)) + (((~(layoutDirection | (-214856609))) | (-29423562)) * 301);
        int i47 = i46 ^ (i46 << 13);
        int i48 = i47 ^ (i47 >>> 17);
        ((int[]) objArr30[2])[0] = i48 ^ (i48 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ea, code lost:
    
        if (r1 != ((2005562524 + (((~(2046339739 | r2)) | 330428408) * (-366))) + (((~(r2 | 2079977467)) | 296790680) * 366))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ec, code lost:
    
        super.onResume();
        r1 = com.midtrans.sdk.uikit.views.indomaret.status.IndomaretStatusActivity.read + 107;
        com.midtrans.sdk.uikit.views.indomaret.status.IndomaretStatusActivity.connect = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0100, code lost:
    
        throw new java.lang.RuntimeException("273928422");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0108, code lost:
    
        throw new java.lang.RuntimeException("2099977873");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004a, code lost:
    
        if (r1 == (((1672819944 + (((~(r7 | 841944746)) | ((~(1671932289 | r7)) | (-1940893612))) * 464)) + (((-268961323) | r6) * (-464))) + (((~(r6 | 841944746)) | (-1940893612)) * 464))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0093, code lost:
    
        if (r1 == (((441127802 + (((-740298823) | r6) * (-381))) + (((~((~r6) | (-1856254287))) | 1401923385) * 381)) - 1413990354)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0095, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_review_screen_backend_error_message_1058).substring(0, 53).length() + 952523478;
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.indomaret.status.IndomaretStatusActivity.onResume():void");
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -511304864
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.midtrans.sdk.uikit.views.indomaret.status.IndomaretStatusActivity.connect
            int r1 = r1 + 101
            int r2 = r1 % 128
            com.midtrans.sdk.uikit.views.indomaret.status.IndomaretStatusActivity.read = r2
            int r1 = r1 % r0
            java.lang.reflect.Member[] r1 = defpackage.calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            int r4 = java.lang.System.identityHashCode(r8)
            r5 = -1400616215(0xffffffffac844ae9, float:-3.7599823E-12)
            r6 = r4 | r5
            int r6 = ~r6
            r7 = 570628671(0x22031a3f, float:1.7767705E-18)
            r6 = r6 | r7
            int r6 = r6 * 191
            r7 = 619361469(0x24eab4bd, float:1.01787506E-16)
            int r7 = r7 + r6
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = ~r4
            r5 = 33755158(0x2031016, float:9.628976E-38)
            r4 = r4 | r5
            int r4 = r4 * 191
            int r7 = r7 + r4
            if (r1 == r7) goto L6a
            int r1 = com.midtrans.sdk.uikit.views.indomaret.status.IndomaretStatusActivity.connect
            int r1 = r1 + 119
            int r4 = r1 % 128
            com.midtrans.sdk.uikit.views.indomaret.status.IndomaretStatusActivity.read = r4
            int r1 = r1 % r0
            r4 = -1
            r5 = -511304865(0xffffffffe1861b5f, float:-3.092295E20)
            r6 = -511304864(0xffffffffe1861b60, float:-3.0922954E20)
            if (r1 == 0) goto L58
            int[] r1 = new int[r6]
            r1[r5] = r2
            r1 = r1[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r2)
            r1.show()
            goto L6a
        L58:
            int[] r1 = new int[r6]
            r6 = 1
            r1[r5] = r6
            r5 = -1981331296(0xffffffff89e748a0, float:-5.5679523E-33)
            int r5 = r5 % r0
            r1 = r1[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r6)
            r1.show()
        L6a:
            java.lang.reflect.Member[] r1 = defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
            long r3 = r3.freeMemory()
            int r3 = (int) r3
            int r3 = ~r3
            r4 = 1034646635(0x3dab746b, float:0.08371814)
            r3 = r3 | r4
            int r3 = ~r3
            r4 = 564274186(0x21a2240a, float:1.0987086E-18)
            r4 = r4 | r3
            int r4 = r4 * (-374)
            r5 = -956400062(0xffffffffc6fe7e42, float:-32575.129)
            int r4 = r4 + r5
            r5 = 470372449(0x1c095061, float:4.5433385E-22)
            r3 = r3 | r5
            int r3 = r3 * 374
            int r4 = r4 + r3
            if (r1 != r4) goto La8
            super.onStart()
            int r1 = com.midtrans.sdk.uikit.views.indomaret.status.IndomaretStatusActivity.connect
            int r1 = r1 + 101
            int r3 = r1 % 128
            com.midtrans.sdk.uikit.views.indomaret.status.IndomaretStatusActivity.read = r3
            int r1 = r1 % r0
            if (r1 == 0) goto La7
            r0 = 32
            int r0 = r0 / r2
        La7:
            return
        La8:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "-1294064564"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.indomaret.status.IndomaretStatusActivity.onStart():void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = read + 21;
        connect = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
    }
}
