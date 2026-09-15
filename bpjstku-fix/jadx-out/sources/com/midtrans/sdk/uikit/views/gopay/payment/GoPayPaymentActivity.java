package com.midtrans.sdk.uikit.views.gopay.payment;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
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
import androidx.appcompat.app.AlertDialog;
import com.bpjstku.R;
import com.datadog.android.core.internal.persistence.file.FileExtKt$readLinesSafe$1;
import com.midtrans.sdk.corekit.callback.TransactionCallback;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.views.gopay.status.GoPayStatusActivity;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.EncoderImplByteBufferInput;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.TransformExperimental;
import defpackage.createPrimaryCamera;
import defpackage.getCropRectAppliedByEffect;
import defpackage.handleMessage;
import defpackage.initSession;
import defpackage.onConnectionFailed;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class GoPayPaymentActivity extends BasePaymentActivity implements createPrimaryCamera {
    private static final String asInterface = "GoPayPaymentActivity";
    private View INotificationSideChannel;
    private getCropRectAppliedByEffect INotificationSideChannelDefault;
    private boolean INotificationSideChannelStubProxy;
    private boolean RemoteActionCompatParcelizer;
    private FancyButton cancel;
    private int cancelAll;
    private int d;
    private final String g = "com.gojek.app";
    private Boolean getInterfaceDescriptor;
    private boolean notify;
    private FancyButton onTransact;
    private static final byte[] $$m = {27, -8, 5, 78};
    private static final int $$n = 126;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {36, -74, -79, -21, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$k = 33;
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int[] INotificationSideChannelStub = {1832039522, -689568934, -1980609980, -554547744, -1354407873, -849133344, 827887192, 257617493, 1657425252, -1105822038, -816558967, -1565311377, -1608981144, -1184776915, -797913848, -1835964437, 424071304, 1096895460};

    public static /* synthetic */ getCropRectAppliedByEffect TuitionPaymentFragmentbindingInflater1(GoPayPaymentActivity goPayPaymentActivity) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 35;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        getCropRectAppliedByEffect getcroprectappliedbyeffect = goPayPaymentActivity.INotificationSideChannelDefault;
        int i5 = i2 + 33;
        IconCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return getcroprectappliedbyeffect;
    }

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~(i2 | i6);
        int i8 = ~(i6 | i3);
        int i9 = i7 | i8;
        int i10 = ~i2;
        int i11 = ~i6;
        int i12 = (~(i10 | i3)) | (~(i10 | i11)) | (~(i11 | i3));
        int i13 = ~i3;
        int i14 = i12 | (~(i13 | i2 | i6));
        int i15 = (~(i13 | i11)) | i2 | i8;
        int i16 = i2 + i6 + i4 + (1962400304 * i) + (1167700406 * i5);
        int i17 = i16 * i16;
        int i18 = ((i2 * (-1019457937)) - 559939584) + ((-1019457937) * i6) + (2001489518 * i9) + (i14 * (-2001489518)) + ((-2001489518) * i15) + (1274019840 * i4) + ((-1660944384) * i) + ((-325058560) * i5) + (867827712 * i17);
        int i19 = ((i2 * (-1629562239)) - 1134582380) + (i6 * (-1629562239)) + (i9 * (-910)) + (i14 * 910) + (i15 * 910) + (i4 * (-1629561329)) + (i * (-1621399344)) + (i5 * (-873382486)) + (i17 * 1407582208);
        return i18 + ((i19 * i19) * (-1895432192)) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(GoPayPaymentActivity goPayPaymentActivity, TransactionResponse transactionResponse) {
        int i = 2 % 2;
        Intent intent = new Intent();
        intent.putExtra("transaction_response", transactionResponse);
        goPayPaymentActivity.setResult(0, intent);
        goPayPaymentActivity.finish();
        int i2 = read + 15;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 25 / 0;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(GoPayPaymentActivity goPayPaymentActivity) {
        int i = 2 % 2;
        goPayPaymentActivity.asBinder();
        getCropRectAppliedByEffect getcroprectappliedbyeffect = goPayPaymentActivity.INotificationSideChannelDefault;
        getcroprectappliedbyeffect.b().paymentUsingGoPay(getcroprectappliedbyeffect.b().readAuthenticationToken(), new TransactionCallback() { // from class: getCropRectAppliedByEffect.3
            public AnonymousClass3() {
            }

            @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
            public final void onError(Throwable th) {
                ((createPrimaryCamera) getCropRectAppliedByEffect.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
            }

            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
            public final void onFailure(TransactionResponse transactionResponse, String str) {
                getCropRectAppliedByEffect.this.b = transactionResponse;
                ((createPrimaryCamera) getCropRectAppliedByEffect.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
            }

            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
            public final void onSuccess(TransactionResponse transactionResponse) {
                getCropRectAppliedByEffect.this.b = transactionResponse;
                ((createPrimaryCamera) getCropRectAppliedByEffect.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
            }
        });
        int i2 = read + 121;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(GoPayPaymentActivity goPayPaymentActivity, String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 63;
        read = i2 % 128;
        int i3 = i2 % 2;
        goPayPaymentActivity.TuitionPaymentFragmentbindingInflater1(str);
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        int i5 = IconCompatParcelizer + 39;
        read = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean b(GoPayPaymentActivity goPayPaymentActivity) {
        int i = 2 % 2;
        int i2 = read + 1;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        boolean z = goPayPaymentActivity.notify;
        if (i3 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
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
    private static void m(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = 197 - r7
            byte[] r0 = com.midtrans.sdk.uikit.views.gopay.payment.GoPayPaymentActivity.$$j
            int r6 = r6 * 14
            int r6 = 98 - r6
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
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L20:
            int r3 = r3 + 1
            r4 = r0[r7]
        L24:
            int r4 = -r4
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.gopay.payment.GoPayPaymentActivity.m(int, byte, short, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = read + 41;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        setPrimaryBackgroundColor(this.onTransact);
        int i4 = read + 113;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        read = i2 % 128;
        if (i2 % 2 != 0) {
            this.onTransact = (FancyButton) findViewById(R.id.button_primary);
            this.INotificationSideChannel = findViewById(R.id.layout_primary_button);
        } else {
            this.onTransact = (FancyButton) findViewById(R.id.button_primary);
            this.INotificationSideChannel = findViewById(R.id.layout_primary_button);
            throw null;
        }
    }

    private void TuitionPaymentFragmentbindingInflater1(String str) {
        int i = 2 % 2;
        if (str == null) {
            int i2 = read + 81;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            Toast.makeText(this, R.string.gopay_payment_cant_open_deeplink, 0).show();
            return;
        }
        Toast.makeText(this, getString(R.string.redirecting_to_gopay), 0).show();
        startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse(str)), 345);
        int i4 = IconCompatParcelizer + 17;
        read = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        if (i == 210) {
            TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Intent intent2 = new Intent();
            intent2.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            setResult(-1, intent2);
            finish();
            return;
        }
        if (i == 345) {
            int i4 = read + 61;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            this.cancelAll = i;
            if (i5 != 0) {
                int i6 = 90 / 0;
            }
        }
        int i7 = read + 101;
        IconCompatParcelizer = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        if (((BasePaymentActivity) this).TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = read + 1;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            d();
            return;
        }
        if (!this.notify) {
            super.onBackPressed();
            int i4 = read + 21;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        try {
            new AlertDialog.Builder(this, R.style.AlertDialogCustom).setPositiveButton(R.string.text_yes, new DialogInterface.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.gopay.payment.GoPayPaymentActivity.4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i6) {
                    if (GoPayPaymentActivity.this.isFinishing()) {
                        return;
                    }
                    dialogInterface.dismiss();
                    GoPayPaymentActivity goPayPaymentActivity = GoPayPaymentActivity.this;
                    GoPayPaymentActivity.TuitionPaymentFragmentbindingInflater1(goPayPaymentActivity, GoPayPaymentActivity.TuitionPaymentFragmentbindingInflater1(goPayPaymentActivity).TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                }
            }).setNegativeButton(R.string.text_no, new DialogInterface.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.gopay.payment.GoPayPaymentActivity.2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i6) {
                    if (GoPayPaymentActivity.this.isFinishing()) {
                        return;
                    }
                    dialogInterface.dismiss();
                }
            }).setTitle(R.string.cancel_transaction).setMessage(getString(R.string.confirm_gopay_deeplink)).create().show();
        } catch (Exception e2) {
            String str = asInterface;
            StringBuilder sb = new StringBuilder("showDialog:");
            sb.append(e2.getMessage());
            Logger.e(str, sb.toString());
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        GoPayPaymentActivity goPayPaymentActivity = (GoPayPaymentActivity) objArr[0];
        TransactionResponse transactionResponse = (TransactionResponse) objArr[1];
        int i = 2 % 2;
        int i2 = read + 55;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        goPayPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, goPayPaymentActivity.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        int i4 = IconCompatParcelizer + 69;
        read = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        int i = 2 % 2;
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
            int i2 = read + 105;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = IconCompatParcelizer + 95;
        read = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        read = i2 % 128;
        int i3 = i2 % 2;
        this.getInterfaceDescriptor = Boolean.valueOf(this.RemoteActionCompatParcelizer);
        super.onPause();
        int i4 = read + 25;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        GoPayPaymentActivity goPayPaymentActivity = (GoPayPaymentActivity) objArr[0];
        TransactionResponse transactionResponse = (TransactionResponse) objArr[1];
        int i = 2 % 2;
        int i2 = read + 49;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        goPayPaymentActivity.b();
        int i4 = goPayPaymentActivity.d;
        Object obj = null;
        if (i4 < 2) {
            goPayPaymentActivity.d = i4 + 1;
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(goPayPaymentActivity, goPayPaymentActivity.getString(R.string.error_gopay_transaction));
            int i5 = IconCompatParcelizer + 37;
            read = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        if (transactionResponse != null) {
            int i7 = IconCompatParcelizer + 77;
            read = i7 % 128;
            if (i7 % 2 == 0) {
                goPayPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, goPayPaymentActivity.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                obj.hashCode();
                throw null;
            }
            goPayPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, goPayPaymentActivity.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d5, code lost:
    
        if (r1 != (((-1082856870) + (((~(r3 | 471570846)) | (-2107620287)) * 305)) + (((~((~r3) | 471570846)) | (-2107485119)) * 305))) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d7, code lost:
    
        super.onCreate(r14);
        asBinder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e7, code lost:
    
        if (defpackage.onConnectionFailed.b((android.app.Activity) r13).equals("TABLET") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e9, code lost:
    
        r14 = com.midtrans.sdk.uikit.views.gopay.payment.GoPayPaymentActivity.IconCompatParcelizer + 101;
        com.midtrans.sdk.uikit.views.gopay.payment.GoPayPaymentActivity.read = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f5, code lost:
    
        if ((r14 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ff, code lost:
    
        if (getResources().getBoolean(com.bpjstku.R.bool.isTablet) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0102, code lost:
    
        getResources().getBoolean(com.bpjstku.R.bool.isTablet);
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x010c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x010d, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x010e, code lost:
    
        r13.INotificationSideChannelStubProxy = r2;
        r13.RemoteActionCompatParcelizer = defpackage.MediaBrowserCompatConnectionCallback.TuitionPaymentFragmentbindingInflater1(r13, "com.gojek.app");
        setContentView(com.bpjstku.R.layout.activity_gopay_payment);
        r13.INotificationSideChannelDefault = new defpackage.getCropRectAppliedByEffect(r13);
        r14 = (android.view.ViewStub) findViewById(com.bpjstku.R.id.gopay_layout_stub);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0130, code lost:
    
        if (r13.INotificationSideChannelStubProxy == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0132, code lost:
    
        r14.setLayoutResource(com.bpjstku.R.layout.layout_gopay_payment_tablet);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x013b, code lost:
    
        if (r13.RemoteActionCompatParcelizer == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x013d, code lost:
    
        r1 = com.midtrans.sdk.uikit.views.gopay.payment.GoPayPaymentActivity.read + 29;
        com.midtrans.sdk.uikit.views.gopay.payment.GoPayPaymentActivity.IconCompatParcelizer = r1 % 128;
        r1 = r1 % 2;
        r1 = com.bpjstku.R.layout.layout_gopay_payment;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x014a, code lost:
    
        r1 = com.bpjstku.R.layout.layout_install_gopay;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x014d, code lost:
    
        r14.setLayoutResource(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0150, code lost:
    
        r14.inflate();
        b(getString(com.bpjstku.R.string.gopay));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x015f, code lost:
    
        if (r13.RemoteActionCompatParcelizer != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0163, code lost:
    
        if (r13.INotificationSideChannelStubProxy != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0165, code lost:
    
        r13.INotificationSideChannel.setVisibility(8);
        findViewById(com.bpjstku.R.id.primary_button_separator).setVisibility(8);
        r14 = findViewById(com.bpjstku.R.id.container_item_details);
        r1 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        r1.addRule(12);
        r14.setLayoutParams(r1);
        r14 = (com.midtrans.sdk.uikit.widgets.FancyButton) findViewById(com.bpjstku.R.id.button_download_gojek);
        r13.cancel = r14;
        setTextColor(r14);
        r14 = r13.cancel;
        r1 = r13.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x019e, code lost:
    
        if (r1 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01a0, code lost:
    
        r14.setIconColorFilter(r1);
        r14 = com.midtrans.sdk.uikit.views.gopay.payment.GoPayPaymentActivity.read + 21;
        com.midtrans.sdk.uikit.views.gopay.payment.GoPayPaymentActivity.IconCompatParcelizer = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01ac, code lost:
    
        r13.cancel.setOnClickListener(new com.midtrans.sdk.uikit.views.gopay.payment.GoPayPaymentActivity.AnonymousClass5(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01b7, code lost:
    
        r13.onTransact.setOnClickListener(new com.midtrans.sdk.uikit.views.gopay.payment.GoPayPaymentActivity.AnonymousClass1(r13));
        r13.onTransact.setTextBold();
        r13.onTransact.setText(getString(com.bpjstku.R.string.gopay_confirm_button));
        r13.onTransact.setIconResource(2131231209);
        r13.onTransact.setIconPosition(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01df, code lost:
    
        b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01e2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ea, code lost:
    
        throw new java.lang.RuntimeException("1087613315");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01eb, code lost:
    
        r14 = (-706570398) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01f4, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0048, code lost:
    
        if (r1 == (((745815222 + (((~((-403793867) | r8)) | (-1233781410)) * (-602))) + ((((~(r7 | (-403793867))) | 269575498) | (~((-1099563042) | r8))) * (-301))) + ((~(r8 | (-1233781410))) * 301))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008e, code lost:
    
        if (r1 == ((1463199217 + (((~((-1032565471) | r8)) | (~(r7 | (-1862553014)))) * 333)) + (((~(r7 | (-1032565471))) | (~(r8 | (-1862553014)))) * 333))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0090, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r4 = (java.lang.Object[]) null;
        r3 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 441101541;
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r14) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.gopay.payment.GoPayPaymentActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00df  */
    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void b(TransactionResponse transactionResponse) throws NoSuchMethodException {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        b();
        if (!this.TuitionPaymentFragmentbindingInflater1) {
            TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Intent intent = new Intent();
            intent.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            setResult(-1, intent);
            finish();
            return;
        }
        int i5 = read + 111;
        IconCompatParcelizer = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            int i6 = 8 / 0;
            if (transactionResponse != null) {
                if (TextUtils.isEmpty(transactionResponse.getDeeplinkUrl())) {
                    if (!(!TextUtils.isEmpty(transactionResponse.getQrCodeUrl()))) {
                        i = read + 69;
                        i2 = i % 128;
                        IconCompatParcelizer = i2;
                        if (i % 2 == 0) {
                            throw null;
                        }
                        if (!(!this.INotificationSideChannelStubProxy)) {
                            int i7 = i2 + 37;
                            read = i7 % 128;
                            int i8 = i7 % 2;
                        }
                    }
                    if (this.INotificationSideChannelStubProxy) {
                        this.notify = true;
                        TuitionPaymentFragmentbindingInflater1(transactionResponse.getDeeplinkUrl());
                        return;
                    } else {
                        Intent intent2 = new Intent(this, (Class<?>) GoPayStatusActivity.class);
                        intent2.putExtra("extra.status", transactionResponse);
                        startActivityForResult(intent2, 210);
                        return;
                    }
                }
                i3 = IconCompatParcelizer + 113;
                read = i3 % 128;
                if (i3 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (this.INotificationSideChannelStubProxy) {
                    if (!(!TextUtils.isEmpty(transactionResponse.getQrCodeUrl()))) {
                        i = read + 69;
                        i2 = i % 128;
                        IconCompatParcelizer = i2;
                        if (i % 2 == 0) {
                            throw null;
                        }
                        if (!(!this.INotificationSideChannelStubProxy)) {
                            int i9 = i2 + 37;
                            read = i9 % 128;
                            int i10 = i9 % 2;
                        }
                    }
                    if (this.INotificationSideChannelStubProxy) {
                        this.notify = true;
                        TuitionPaymentFragmentbindingInflater1(transactionResponse.getDeeplinkUrl());
                        return;
                    } else {
                        Intent intent3 = new Intent(this, (Class<?>) GoPayStatusActivity.class);
                        intent3.putExtra("extra.status", transactionResponse);
                        startActivityForResult(intent3, 210);
                        return;
                    }
                }
            }
        } else if (transactionResponse != null) {
            if (TextUtils.isEmpty(transactionResponse.getDeeplinkUrl())) {
                if (!(!TextUtils.isEmpty(transactionResponse.getQrCodeUrl()))) {
                    i = read + 69;
                    i2 = i % 128;
                    IconCompatParcelizer = i2;
                    if (i % 2 == 0) {
                        throw null;
                    }
                    if (!(!this.INotificationSideChannelStubProxy)) {
                        int i11 = i2 + 37;
                        read = i11 % 128;
                        int i12 = i11 % 2;
                    }
                }
                if (this.INotificationSideChannelStubProxy) {
                    this.notify = true;
                    TuitionPaymentFragmentbindingInflater1(transactionResponse.getDeeplinkUrl());
                    return;
                } else {
                    Intent intent4 = new Intent(this, (Class<?>) GoPayStatusActivity.class);
                    intent4.putExtra("extra.status", transactionResponse);
                    startActivityForResult(intent4, 210);
                    return;
                }
            }
            i3 = IconCompatParcelizer + 113;
            read = i3 % 128;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (this.INotificationSideChannelStubProxy) {
                if (!(!TextUtils.isEmpty(transactionResponse.getQrCodeUrl()))) {
                    i = read + 69;
                    i2 = i % 128;
                    IconCompatParcelizer = i2;
                    if (i % 2 == 0) {
                        throw null;
                    }
                    if (!(!this.INotificationSideChannelStubProxy)) {
                        int i13 = i2 + 37;
                        read = i13 % 128;
                        int i14 = i13 % 2;
                    }
                }
                if (this.INotificationSideChannelStubProxy) {
                    this.notify = true;
                    TuitionPaymentFragmentbindingInflater1(transactionResponse.getDeeplinkUrl());
                    return;
                } else {
                    Intent intent5 = new Intent(this, (Class<?>) GoPayStatusActivity.class);
                    intent5.putExtra("extra.status", transactionResponse);
                    startActivityForResult(intent5, 210);
                    return;
                }
            }
        }
        TuitionPaymentFragmentbindingInflater1(new Object[]{this, transactionResponse}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1172293216, 1647738955, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 2130631778, FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TransformExperimental.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1647738955);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -420580053
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
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.gopay.payment.GoPayPaymentActivity.onResume():void");
    }

    private static void n(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = INotificationSideChannelStub;
        int i3 = -1870535734;
        long j = 0;
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(iArr2[i6]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i5;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(i5, i5) > j ? 1 : (ExpandableListView.getPackedPositionForChild(i5, i5) == j ? 0 : -1)) + 1), (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 3290, 30 - MotionEvent.axisFromString(""), 1948206109, false, $$u(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i6++;
                    int i7 = $10 + 47;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    i3 = -1870535734;
                    j = 0;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = INotificationSideChannelStub;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                int i10 = $10 + 77;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                Object[] objArr3 = new Object[i4];
                objArr3[0] = Integer.valueOf(iArr5[i9]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3290, 31 - (ViewConfiguration.getLongPressTimeout() >> 16), 1948206109, false, $$u(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i9++;
                iArr5 = iArr5;
                i4 = 1;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i12 = $10 + 69;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i14 = $10 + 109;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            for (int i16 = 17; i16 > 1; i16--) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i16];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2558, AndroidCharacter.getMirror('0') - 19, 683220507, false, $$u(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
            }
            int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 28879), 348 - TextUtils.getTrimmedLength(""), 26 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
            int size = 1755 - View.MeasureSpec.getSize(0);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 23;
            byte b = (byte) ($$k + 4);
            byte b2 = $$j[5];
            Object[] objArr2 = new Object[1];
            m(b, b2, (short) (b2 | 192), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, size, iCombineMeasuredStates, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i2 = IconCompatParcelizer + 51;
            read = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 29944);
                int longPressTimeout = 1755 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int minimumFlingVelocity = 23 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                Object[] objArr3 = new Object[1];
                m((byte) 52, $$j[5], (short) 156, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, longPressTimeout, minimumFlingVelocity, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bbm_money).substring(0, 9).length() + 958239651;
            int i4 = (((1491318700 + ((~((~length) | (-4924834))) * 433)) + (((~(80684977 | length)) | (-293287404)) * (-433))) + (((~(length | (-293287404))) | 75760144) * 433)) - 608370143;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            n(new int[]{-2128284178, 1085539353, -390315175, 2055135445, -64187282, -1361355831, -1976381364, -1902870138, -1799341966, 276417618}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_mobile_instruction_3).substring(5, 6).codePointAt(0) - 16, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            n(new int[]{1432961985, 459958329, 1534049579, -1390877223, 1029346312, -1857419408, -670830923, 752586831, -2085440910, -1731942678}, 16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-1380536745};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - ExpandableListView.getPackedPositionType(0L)), Gravity.getAbsoluteGravity(0, 0) + 1726, View.combineMeasuredStates(0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = EncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -608370143, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf2 = (char) (29944 - TextUtils.indexOf("", ""));
                    int iIndexOf = 1755 - TextUtils.indexOf("", "", 0);
                    int offsetBefore = 23 - TextUtils.getOffsetBefore("", 0);
                    Object[] objArr8 = new Object[1];
                    m((byte) 52, $$j[5], (short) 156, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, iIndexOf, offsetBefore, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    n(new int[]{-2102744909, 1228845731, 751168573, -154291603, -483690603, 756232440, -1006234150, -1249470585, 976940653, -1406647617, -1652484312, -299101403, -899579985, 558331517}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 84, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    n(new int[]{815031697, 120560370, 268971159, 1883151940, 356321292, -1239771148, -2146449443, 1025914869, -124166810, 1472418434}, Gravity.getAbsoluteGravity(0, 0) + 15, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 29944);
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1755;
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 24;
                        Object[] objArr11 = new Object[1];
                        m((byte) 52, $$j[5], (short) 104, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize, threadPriority, iIndexOf2, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 29943);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1755;
                        int iAlpha = 23 - Color.alpha(0);
                        byte b3 = (byte) ($$k + 4);
                        byte b4 = $$j[5];
                        Object[] objArr12 = new Object[1];
                        m(b3, b4, (short) (b4 | 192), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, tapTimeout, iAlpha, 986134021, false, (String) objArr12[0], null);
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
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw null;
        }
        int i7 = read + 123;
        IconCompatParcelizer = i7 % 128;
        int i8 = i7 % 2;
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i10 = ~((-221020299) | startElapsedRealtime);
        int i11 = ~startElapsedRealtime;
        int i12 = i9 + 101318010 + ((i10 | (~(230486779 | i11))) * 497) + (((~(startElapsedRealtime | 230486779)) | (~((-222068908) | i11)) | 1048609) * 497);
        int i13 = (i12 << 13) ^ i12;
        int i14 = i13 ^ (i13 >>> 17);
        ((int[]) objArr13[3])[0] = i14 ^ (i14 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c2 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int i15 = 1032 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int iMyPid = 15 - (Process.myPid() >> 22);
            Object[] objArr14 = new Object[1];
            m((byte) 52, $$j[5], (short) 52, objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, i15, iMyPid, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        n(new int[]{-2102744909, 1228845731, 751168573, -154291603, -483690603, 756232440, -1006234150, -1249470585, 976940653, -1406647617, -1652484312, -299101403, -899579985, 558331517}, View.combineMeasuredStates(0, 0) + 22, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        n(new int[]{815031697, 120560370, 268971159, 1883151940, 356321292, -1239771148, -2146449443, 1025914869, -124166810, 1472418434}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 100, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char trimmedLength = (char) TextUtils.getTrimmedLength("");
            int i16 = 1031 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            Object[] objArr17 = new Object[1];
            m((byte) 52, $$j[5], (short) 156, objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(trimmedLength, i16, scrollBarFadeDuration, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int i17 = 1032 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 15;
                byte b5 = $$j[7];
                byte b6 = b5;
                Object[] objArr18 = new Object[1];
                m(b5, b6, b6, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cMyTid, i17, iKeyCodeFromString, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i18 = ((int[]) objArr19[3])[0];
            int i19 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i20 = ~iIdentityHashCode;
            int i21 = 433629483 + (((~(26191269 | i20)) | (~((-270471440) | iIdentityHashCode))) * (-370)) + (((~(iIdentityHashCode | 26191269)) | (~(i20 | (-270471440))) | 25207968) * (-370)) + 1340651220;
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr[2])[0] = i23 ^ (i23 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            n(new int[]{-2128284178, 1085539353, -390315175, 2055135445, -64187282, -1361355831, -1976381364, -1902870138, -1799341966, 276417618}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_bri_epay).substring(0, 9).codePointAt(5) - 16, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            n(new int[]{1432961985, 459958329, 1534049579, -1390877223, 1029346312, -1857419408, -670830923, 752586831, -2085440910, -1731942678}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_card_register_success).substring(11, 12).length() + 15, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {-1380536745};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - Drawable.resolveOpacity(0, 0)), 1133 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 17 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 603637652, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                int iRgb = (-16776185) - Color.rgb(0, 0, 0);
                int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0');
                Object[] objArr24 = new Object[1];
                m((byte) 52, $$j[5], (short) 52, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf3, iRgb, iLastIndexOf, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 1117 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 17 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1031;
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 15;
                byte b7 = $$j[7];
                byte b8 = b7;
                Object[] objArr25 = new Object[1];
                m(b7, b8, b8, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cNormalizeMetaState, iResolveOpacity, maxKeyCode, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                n(new int[]{-2102744909, 1228845731, 751168573, -154291603, -483690603, 756232440, -1006234150, -1249470585, 976940653, -1406647617, -1652484312, -299101403, -899579985, 558331517}, 22 - Color.red(0), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                n(new int[]{815031697, 120560370, 268971159, 1883151940, 356321292, -1239771148, -2146449443, 1025914869, -124166810, 1472418434}, 15 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int gidForName = 1030 - Process.getGidForName("");
                    int iCombineMeasuredStates2 = 15 - View.combineMeasuredStates(0, 0);
                    Object[] objArr28 = new Object[1];
                    m((byte) 52, $$j[5], (short) 156, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(threadPriority2, gidForName, iCombineMeasuredStates2, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c3 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                    int iResolveSize = View.resolveSize(0, 0) + 1031;
                    int touchSlop = 15 - (ViewConfiguration.getTouchSlop() >> 8);
                    Object[] objArr29 = new Object[1];
                    m((byte) 52, $$j[5], (short) 52, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, iResolveSize, touchSlop, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i24 = ((int[]) objArr[1])[0];
        int i25 = ((int[]) objArr[3])[0];
        if (i25 == i24) {
            Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[3])[0];
            int i28 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.retrofit_network_message).substring(4, 5).codePointAt(0) + 2046824126;
            int i29 = i26 + 619471748 + (((~((~iCodePointAt) | 565147602)) | 301991976) * 529) + (((~(iCodePointAt | 565147602)) | 320867432) * 529);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr30[2])[0] = i31 ^ (i31 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i32 = IconCompatParcelizer + 71;
            read = i32 % 128;
            int i33 = (i32 % 2 == 0 ? 0 : 1) ^ 1;
            while (i33 < strArr4.length) {
                arrayList2.add(strArr4[i33]);
                i33++;
                int i34 = IconCompatParcelizer + 89;
                read = i34 % 128;
                if (i34 % 2 == 0) {
                    int i35 = 2 % 3;
                }
            }
        }
        int[] iArr = new int[i25];
        int i36 = i25 - 1;
        iArr[i36] = 1;
        Toast.makeText((Context) null, iArr[((i25 * i36) % 2) - 1], 1).show();
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i37 = ((int[]) objArr[2])[0];
        int i38 = ((int[]) objArr[3])[0];
        int i39 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i40 = ~elapsedCpuTime;
        int i41 = (~((-750503530) | i40)) | 203965033;
        int i42 = ~(elapsedCpuTime | 1052761855);
        int i43 = i37 + (-1357612838) + ((i41 | i42) * (-713)) + (i42 * 1426) + ((~(506223359 | i40)) * 713);
        int i44 = i43 ^ (i43 << 13);
        int i45 = i44 ^ (i44 >>> 17);
        ((int[]) objArr31[2])[0] = i45 ^ (i45 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c5, code lost:
    
        if (r1 != ((((-458405284) + ((10493952 | r4) * (-192))) + (((~((-2131730364) | r4)) | 436831649) * (-384))) + (((~(r2 | 2142224315)) | ((~(r4 | (-1694898715))) | (~((-436831650) | r2)))) * okhttp3.tls.internal.der.DerHeader.TAG_CLASS_PRIVATE))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c7, code lost:
    
        super.onStart();
        r1 = com.midtrans.sdk.uikit.views.gopay.payment.GoPayPaymentActivity.read + 117;
        com.midtrans.sdk.uikit.views.gopay.payment.GoPayPaymentActivity.IconCompatParcelizer = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00dc, code lost:
    
        throw new java.lang.RuntimeException("-1317649275");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005a, code lost:
    
        if (r1 == (((183490024 + ((((~((-509388213) | r5)) | 269002036) | (~(1339375755 | r5))) * (-1136))) + ((((~((-509388213) | r4)) | (~(1339375755 | r4))) | (~((-1098989580) | r5))) * (-568))) + (((~(r4 | (-269002037))) | ((~(r5 | (-1339375756))) | (~(509388212 | r5)))) * 568))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008a, code lost:
    
        if (r1 == ((((-961922664) + (((~((-917209883) | r5)) | 69369858) * 184)) + ((r4 | (-935062364)) * (-184))) + ((~((-87222340) | r5)) * 184))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008c, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r10);
        r4 = ~r2;
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.gopay.payment.GoPayPaymentActivity.onStart():void");
    }

    @Override // defpackage.createPrimaryCamera
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(TransactionResponse transactionResponse) {
        TuitionPaymentFragmentbindingInflater1(new Object[]{this, transactionResponse}, (-213701162) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, -1389563651, FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TransformExperimental.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1389563652);
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TransactionResponse transactionResponse) {
        TuitionPaymentFragmentbindingInflater1(new Object[]{this, transactionResponse}, 1172293216 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), 1647738955, (-2130631778) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TransformExperimental.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1647738955);
    }

    private static String $$u(int i, short s, short s2) {
        int i2 = 3 - (s * 4);
        int i3 = 122 - (s2 * 56);
        byte[] bArr = $$m;
        int i4 = i * 2;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3 = i5 + i3;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2++;
            i3 += bArr[i2];
        }
    }
}
