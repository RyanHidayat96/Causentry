package com.midtrans.sdk.uikit.views.bca_klikbca.payment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.R;
import com.google.android.gms.tasks.zzu;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.midtrans.sdk.corekit.callback.TransactionCallback;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.views.bca_klikbca.status.KlikBcaStatusActivity;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import com.midtrans.sdk.uikit.widgets.SemiBoldTextView;
import defpackage.SessionProcessor;
import defpackage.ViewPortBuilder;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.filterOutChildSizesCausingDoubleCropping;
import defpackage.getConfigs;
import defpackage.handleMessage;
import defpackage.initSession;
import defpackage.onConnectionFailed;
import defpackage.sortByFov;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class KlikBcaPaymentActivity extends BasePaymentActivity implements filterOutChildSizesCausingDoubleCropping {
    private TextInputLayout INotificationSideChannel;
    private TextInputEditText cancel;
    private SemiBoldTextView cancelAll;
    private FancyButton d;
    private sortByFov notify;
    private static final byte[] $$m = {1, -81, 2, 79};
    private static final int $$n = 166;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {83, -4, -55, -17, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$k = 144;
    private static int INotificationSideChannelStub = 0;
    private static int INotificationSideChannelDefault = 1;
    private static long onTransact = -6377398940819159759L;
    private static int getInterfaceDescriptor = -981105359;
    private static char INotificationSideChannelStubProxy = 27562;
    private final String asInterface = "KlikBCA Instructions";
    private final String g = "Confirm Payment KlikBCA";

    public static /* synthetic */ sortByFov TuitionPaymentFragmentbindingInflater1(KlikBcaPaymentActivity klikBcaPaymentActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 67;
        INotificationSideChannelStub = i3 % 128;
        int i4 = i3 % 2;
        sortByFov sortbyfov = klikBcaPaymentActivity.notify;
        int i5 = i2 + 111;
        INotificationSideChannelStub = i5 % 128;
        int i6 = i5 % 2;
        return sortbyfov;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(KlikBcaPaymentActivity klikBcaPaymentActivity, String str) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 109;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        klikBcaPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(KlikBcaPaymentActivity klikBcaPaymentActivity, String str) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 65;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        if (!TextUtils.isEmpty(str)) {
            klikBcaPaymentActivity.INotificationSideChannel.setError("");
            return true;
        }
        klikBcaPaymentActivity.INotificationSideChannel.setError(klikBcaPaymentActivity.getString(R.string.error_user_id));
        int i4 = INotificationSideChannelDefault + 111;
        INotificationSideChannelStub = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public static /* synthetic */ TextInputEditText b(KlikBcaPaymentActivity klikBcaPaymentActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 35;
        INotificationSideChannelStub = i3 % 128;
        int i4 = i3 % 2;
        TextInputEditText textInputEditText = klikBcaPaymentActivity.cancel;
        int i5 = i2 + 71;
        INotificationSideChannelStub = i5 % 128;
        if (i5 % 2 == 0) {
            return textInputEditText;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.midtrans.sdk.uikit.views.bca_klikbca.payment.KlikBcaPaymentActivity.$$j
            int r7 = r7 + 1
            int r9 = r9 * 14
            int r9 = 98 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r5 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + (-11)
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.bca_klikbca.payment.KlikBcaPaymentActivity.m(int, short, byte, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 5;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        setPrimaryBackgroundColor(this.d);
        b(this.cancel);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.INotificationSideChannel);
        int i4 = INotificationSideChannelStub + 13;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = INotificationSideChannelStub + 7;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 == 0) {
            super.onActivityResult(i, i2, intent);
            if (i == 7848) {
                TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                Intent intent2 = new Intent();
                intent2.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                setResult(-1, intent2);
                finish();
            }
        } else {
            super.onActivityResult(i, i2, intent);
            if (i == 210) {
                TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault4 = this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                Intent intent3 = new Intent();
                intent3.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                setResult(-1, intent3);
                finish();
            }
        }
        int i5 = INotificationSideChannelDefault + 57;
        INotificationSideChannelStub = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 123;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        this.d = (FancyButton) findViewById(R.id.button_primary);
        this.cancel = (TextInputEditText) findViewById(R.id.edit_user_id);
        this.INotificationSideChannel = (TextInputLayout) findViewById(R.id.container_user_id);
        this.cancelAll = (SemiBoldTextView) findViewById(R.id.text_page_title);
        int i4 = INotificationSideChannelDefault + 31;
        INotificationSideChannelStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 35;
        INotificationSideChannelStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        sortByFov sortbyfov = this.notify;
        if (sortbyfov != null) {
            int i4 = i2 + 61;
            INotificationSideChannelStub = i4 % 128;
            if (i4 % 2 != 0) {
                sortbyfov.TuitionPaymentFragmentbindingInflater1("Back", "KlikBCA Instructions");
                throw null;
            }
            sortbyfov.TuitionPaymentFragmentbindingInflater1("Back", "KlikBCA Instructions");
            int i5 = INotificationSideChannelDefault + 95;
            INotificationSideChannelStub = i5 % 128;
            int i6 = i5 % 2;
        }
        super.onBackPressed();
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        int i = 2 % 2;
        b();
        if (!(!this.TuitionPaymentFragmentbindingInflater1)) {
            int i2 = INotificationSideChannelDefault + 31;
            INotificationSideChannelStub = i2 % 128;
            int i3 = i2 % 2;
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
        }
        int i4 = INotificationSideChannelDefault + 75;
        INotificationSideChannelStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 101;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 == 0) {
            b();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        } else {
            b();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 77;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_bca_prima).substring(0, 9).length() + 1688364791;
        int i5 = ~length;
        if (i4 != (-935803026) + (((~((-1575104379) | i5)) | 207619106) * (-108)) + (((~(i5 | 745116835)) | (~((-745116836) | length)) | (-2112602108)) * 54) + ((length | (-2112602108)) * 54)) {
            int[] iArr = new int[746293775];
            iArr[746293774] = 1;
            int i6 = (-261971246) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i7 = INotificationSideChannelDefault + 91;
            INotificationSideChannelStub = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i10 = ~((~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden) | 206276731);
        if (i9 != (((131098 | i10) * (-374)) - 1455936094) + ((i10 | 206145633) * 374)) {
            int i11 = 346147030 % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_bca_klikbca);
        this.notify = new sortByFov(this);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.bca_klikbca.payment.KlikBcaPaymentActivity.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(KlikBcaPaymentActivity.this);
                    String strTrim = KlikBcaPaymentActivity.b(KlikBcaPaymentActivity.this).getText().toString().trim();
                    if (KlikBcaPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(KlikBcaPaymentActivity.this, strTrim)) {
                        KlikBcaPaymentActivity klikBcaPaymentActivity = KlikBcaPaymentActivity.this;
                        KlikBcaPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(klikBcaPaymentActivity, klikBcaPaymentActivity.getString(R.string.processing_payment));
                        KlikBcaPaymentActivity.TuitionPaymentFragmentbindingInflater1(KlikBcaPaymentActivity.this).TuitionPaymentFragmentbindingInflater1("Confirm Payment KlikBCA", "KlikBCA Instructions");
                        sortByFov sortbyfovTuitionPaymentFragmentbindingInflater1 = KlikBcaPaymentActivity.TuitionPaymentFragmentbindingInflater1(KlikBcaPaymentActivity.this);
                        sortbyfovTuitionPaymentFragmentbindingInflater1.b().paymentUsingKlikBCA(sortbyfovTuitionPaymentFragmentbindingInflater1.b().readAuthenticationToken(), strTrim, new TransactionCallback() { // from class: sortByFov.4
                            public AnonymousClass4() {
                            }

                            @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                            public final void onError(Throwable th) {
                                ((filterOutChildSizesCausingDoubleCropping) sortByFov.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
                            }

                            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                            public final void onFailure(TransactionResponse transactionResponse, String str) {
                                sortByFov.this.b = transactionResponse;
                                ((filterOutChildSizesCausingDoubleCropping) sortByFov.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
                            }

                            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                            public final void onSuccess(TransactionResponse transactionResponse) {
                                sortByFov.this.b = transactionResponse;
                                ((filterOutChildSizesCausingDoubleCropping) sortByFov.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
                            }
                        });
                    }
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.d.setText(getString(R.string.confirm_payment));
        this.cancelAll.setText(getString(R.string.klik_bca));
        this.d.setTextBold();
        this.notify.b("KlikBCA Instructions", getIntent().getBooleanExtra("First Page", true));
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void b(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 31;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            Intent intent = new Intent(this, (Class<?>) KlikBcaStatusActivity.class);
            intent.putExtra("extra.status", transactionResponse);
            startActivityForResult(intent, 210);
            return;
        }
        TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Intent intent2 = new Intent();
        intent2.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        setResult(-1, intent2);
        finish();
        int i4 = INotificationSideChannelStub + 111;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        CharSequence charSequence;
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
            int mirror = 1079 - AndroidCharacter.getMirror('0');
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15;
            byte[] bArr = $$j;
            Object[] objArr3 = new Object[1];
            m((byte) 52, bArr[132], bArr[5], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, mirror, scrollDefaultDelay, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        n(new char[]{50919, 6296, 54459, 4649, 44750, 8487, 30026, 24422, 8355, 27291, 27622, 2313, 53907, 61877, 7374, 64596, 3527, 8772, 40242, 58440, 38407, 24654}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), new char[]{55398, 31992, 52553, 16655}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.shipping_cb_message).substring(0, 3).length() - 3, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        n(new char[]{27986, 37752, 15558, 16112, 36474, 29703, 28593, 21102, 7775, 49522, 48152, 55249, 50088, '-', 59597}, new char[]{0, 0, 0, 0}, (char) (TextUtils.lastIndexOf("", '0') + 46928), new char[]{52096, 35877, 20418, 11703}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_threat_detected_error).substring(0, 25).length() - 1031002702, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int iMyPid = 1031 - (Process.myPid() >> 22);
            int iResolveSize = View.resolveSize(0, 0) + 15;
            byte b = (byte) 52;
            Object[] objArr6 = new Object[1];
            m(b, (short) (b - 1), $$j[5], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatTimeout, iMyPid, iResolveSize, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            charSequence = "";
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) TextUtils.indexOf(charSequence, charSequence, 0);
                int iBlue = 1031 - Color.blue(0);
                int i3 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15;
                byte b2 = $$j[7];
                byte b3 = b2;
                Object[] objArr7 = new Object[1];
                m(b3, (short) (b3 | 103), b2, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iBlue, i3, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr8[3])[0];
            int i5 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = 723019557 + (((~((-268436523) | i6)) | (~((-8790786) | iIdentityHashCode)) | (~(301383659 | iIdentityHashCode))) * 765) + ((268436522 | (~((-277227308) | i6))) * 1530) + (((~(iIdentityHashCode | (-277227308))) | (~(i6 | 301383659))) * 765) + 755950837;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
        } else {
            charSequence = "";
            Object[] objArr9 = new Object[1];
            n(new char[]{33528, 44779, 32005, 64304, 46433, 29313, 1938, 26290, 9997, 58042, 39567, 1700, 33224, 34799, 62129, 21425}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_cta_text_try_later).substring(0, 20).codePointAt(19) + 36373), new char[]{39785, 62360, 32388, 46222}, View.resolveSizeAndState(0, 0, 0), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            n(new char[]{63934, 59057, 15922, 18795, 35118, 17140, 29720, 14005, 65207, 21009, 60941, 52471, 35508, 46355, 9339, 31618}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 47841), new char[]{27938, 20937, 1459, 45499}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr11 = {490216950};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 46037), KeyEvent.normalizeMetaState(0) + 1134, ExpandableListView.getPackedPositionType(0L) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, 755950837, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1031;
                    int i10 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14;
                    byte[] bArr2 = $$j;
                    Object[] objArr13 = new Object[1];
                    m((byte) 52, bArr2[132], bArr2[5], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iResolveSizeAndState, i10, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 45993), 1118 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 17 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int iMakeMeasureSpec = 1031 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int i11 = 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte b4 = $$j[7];
                    byte b5 = b4;
                    Object[] objArr14 = new Object[1];
                    m(b5, (short) (b5 | 103), b4, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(modifierMetaStateMask, iMakeMeasureSpec, i11, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    n(new char[]{50919, 6296, 54459, 4649, 44750, 8487, 30026, 24422, 8355, 27291, 27622, 2313, 53907, 61877, 7374, 64596, 3527, 8772, 40242, 58440, 38407, 24654}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.title_payment_successful).substring(0, 1).codePointAt(0) - 80), new char[]{55398, 31992, 52553, 16655}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    n(new char[]{27986, 37752, 15558, 16112, 36474, 29703, 28593, 21102, 7775, 49522, 48152, 55249, 50088, '-', 59597}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 46916), new char[]{52096, 35877, 20418, 11703}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.no_gojek_message).substring(35, 37).codePointAt(1) - 1031002784, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int iIndexOf = TextUtils.indexOf(charSequence, charSequence) + 1031;
                        int maxKeyCode = 15 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte b6 = (byte) 52;
                        Object[] objArr17 = new Object[1];
                        m(b6, (short) (b6 - 1), $$j[5], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(fadingEdgeLength, iIndexOf, maxKeyCode, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 1031;
                        int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte[] bArr3 = $$j;
                        Object[] objArr18 = new Object[1];
                        m((byte) 52, bArr3[132], bArr3[5], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionGroup, packedPositionGroup2, scrollBarFadeDuration, 1357589585, false, (String) objArr18[0], null);
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
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                int i14 = INotificationSideChannelDefault + 63;
                INotificationSideChannelStub = i14 % 128;
                int i15 = i14 % 2;
                while (i2 < strArr2.length) {
                    arrayList.add(strArr2[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i16 = ((int[]) objArr[2])[0];
        int i17 = ((int[]) objArr[3])[0];
        int i18 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i19 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        int i20 = i16 + 804911401 + (((~(i19 | 880729324)) | 25239810) * (-160)) + (((~(i19 | 636449154)) | 880729324) * 160);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr19[2])[0] = i22 ^ (i22 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char scrollBarFadeDuration2 = (char) (29944 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
            int iLastIndexOf = TextUtils.lastIndexOf(charSequence, '0', 0) + 1756;
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 23;
            byte b7 = (byte) 37;
            Object[] objArr20 = new Object[1];
            m(b7, (short) (b7 | 66), $$j[5], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(scrollBarFadeDuration2, iLastIndexOf, threadPriority, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c3 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29944);
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1756;
                int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23;
                byte b8 = (byte) 52;
                Object[] objArr21 = new Object[1];
                m(b8, (short) (b8 - 1), $$j[5], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c3, bitsPerPixel, keyRepeatTimeout2, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i23 = ((int[]) objArr22[0])[0];
            objArr2 = new Object[]{new int[]{i23}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i24 = ~iIdentityHashCode2;
            int i25 = (((1810699462 + ((~(486772978 | i24)) * 979)) + ((iIdentityHashCode2 | 699375404) * (-979))) + (((~(iIdentityHashCode2 | 486772978)) | (~(i24 | 699375404))) * 979)) - 10315191;
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr2[3])[0] = i27 ^ (i27 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            n(new char[]{33528, 44779, 32005, 64304, 46433, 29313, 1938, 26290, 9997, 58042, 39567, 1700, 33224, 34799, 62129, 21425}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.btn_save_card).substring(1, 2).length() + 36477), new char[]{39785, 62360, 32388, 46222}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            n(new char[]{63934, 59057, 15922, 18795, 35118, 17140, 29720, 14005, 65207, 21009, 60941, 52471, 35508, 46355, 9339, 31618}, new char[]{0, 0, 0, 0}, (char) (TextUtils.indexOf(charSequence, charSequence, 0, 0) + 47877), new char[]{27938, 20937, 1459, 45499}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {490216950};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (Process.myPid() >> 22) + 1726, 29 - (ViewConfiguration.getEdgeSlop() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -10315191, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cRgb = (char) ((-16747272) - Color.rgb(0, 0, 0));
                int capsMode = 1755 - TextUtils.getCapsMode(charSequence, 0, 0);
                int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 23;
                byte b9 = (byte) 52;
                Object[] objArr26 = new Object[1];
                m(b9, (short) (b9 - 1), $$j[5], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cRgb, capsMode, maxKeyCode2, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr27 = new Object[1];
                n(new char[]{50919, 6296, 54459, 4649, 44750, 8487, 30026, 24422, 8355, 27291, 27622, 2313, 53907, 61877, 7374, 64596, 3527, 8772, 40242, 58440, 38407, 24654}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_invalid_token_no).substring(0, 16).codePointAt(4) - 108), new char[]{55398, 31992, 52553, 16655}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                n(new char[]{27986, 37752, 15558, 16112, 36474, 29703, 28593, 21102, 7775, 49522, 48152, 55249, 50088, '-', 59597}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 46916), new char[]{52096, 35877, 20418, 11703}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.preview_atm_bersama).substring(1, 3).codePointAt(0) - 1031002774, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c4 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29943);
                    int i28 = 1756 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int offsetAfter = 23 - TextUtils.getOffsetAfter(charSequence, 0);
                    Object[] objArr29 = new Object[1];
                    m((byte) 52, (short) ($$k - 4), $$j[5], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c4, i28, offsetAfter, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
                    int fadingEdgeLength2 = 1755 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int packedPositionGroup3 = 23 - ExpandableListView.getPackedPositionGroup(0L);
                    byte b10 = (byte) 37;
                    Object[] objArr30 = new Object[1];
                    m(b10, (short) (b10 | 66), $$j[5], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(jumpTapTimeout, fadingEdgeLength2, packedPositionGroup3, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr2 = objArrTuitionPaymentFragmentbindingInflater1$7879113;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr2[0])[0] != ((int[]) objArr2[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArr2[4];
            if (strArr4 != null) {
                while (i2 < strArr4.length) {
                    int i29 = INotificationSideChannelStub + 57;
                    INotificationSideChannelDefault = i29 % 128;
                    if (i29 % 2 == 0) {
                        arrayList2.add(strArr4[i2]);
                        i2 += 111;
                    } else {
                        arrayList2.add(strArr4[i2]);
                        i2++;
                    }
                }
            }
            throw null;
        }
        int i30 = INotificationSideChannelStub + 47;
        INotificationSideChannelDefault = i30 % 128;
        int i31 = i30 % 2;
        int i32 = ((int[]) objArr2[3])[0];
        int i33 = ((int[]) objArr2[0])[0];
        Object[] objArr31 = {new int[]{i33}, new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[1], (String[]) objArr2[4]};
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 162880671;
        int i34 = ~iCodePointAt;
        int i35 = (~(277692199 | i34)) | (-498958184) | (~(490294625 | i34));
        int i36 = i32 + (-1928058245) + (((~(iCodePointAt | (-269028642))) | i35) * 590) + (i35 * (-1180)) + (((~((-490294626) | i34)) | (~(i34 | (-277692200)))) * 590);
        int i37 = (i36 << 13) ^ i36;
        int i38 = i37 ^ (i37 >>> 17);
        ((int[]) objArr31[3])[0] = i38 ^ (i38 << 5);
    }

    private static void n(char[] cArr, char[] cArr2, char c, char[] cArr3, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        int i6 = $11 + 113;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i8 = $11 + 73;
            $10 = i8 % 128;
            int i9 = i8 % i3;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char threadPriority = (char) (8328 - ((Process.getThreadPriority(i5) + 20) >> 6));
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1235;
                    int iResolveSize = 35 - View.resolveSize(i5, i5);
                    byte b = (byte) (-$$m[i5]);
                    byte b2 = (byte) (b + 1);
                    String str$$u = $$u(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, keyRepeatTimeout, iResolveSize, -653973969, false, str$$u, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int iResolveOpacity = Drawable.resolveOpacity(i5, i5) + 2764;
                        int iGreen = 14 - Color.green(i5);
                        byte[] bArr = $$m;
                        byte b3 = (byte) (-bArr[i5]);
                        String str$$u2 = $$u(b3, (byte) (b3 + 1), bArr[2]);
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i5] = Object.class;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iResolveOpacity, iGreen, 1504416861, false, str$$u2, clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    int i10 = cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718;
                    try {
                        Object[] objArr4 = new Object[3];
                        objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                        objArr4[1] = Integer.valueOf(i10);
                        objArr4[i5] = sessionProcessor;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char packedPositionChild = (char) (43324 - ExpandableListView.getPackedPositionChild(0L));
                            int threadPriority2 = ((Process.getThreadPriority(i5) + 20) >> 6) + 253;
                            int deadChar = 22 - KeyEvent.getDeadChar(i5, i5);
                            Class[] clsArr3 = new Class[3];
                            clsArr3[i5] = Object.class;
                            clsArr3[1] = Integer.TYPE;
                            clsArr3[2] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionChild, threadPriority2, deadChar, -721491957, false, "j", clsArr3);
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        int i11 = cArr4[iIntValue2] * 32718;
                        Object[] objArr5 = new Object[2];
                        objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                        objArr5[i5] = Integer.valueOf(i11);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cRgb = (char) ((-16712016) - Color.rgb(i5, i5, i5));
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2891;
                            int minimumFlingVelocity2 = 17 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            byte b4 = $$m[i5];
                            byte b5 = (byte) (-b4);
                            String str$$u3 = $$u(b5, (byte) (b5 + 1), b4);
                            i2 = 2;
                            Class[] clsArr4 = new Class[2];
                            clsArr4[i5] = Integer.TYPE;
                            clsArr4[1] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRgb, minimumFlingVelocity, minimumFlingVelocity2, 2012627446, false, str$$u3, clsArr4);
                        } else {
                            i2 = 2;
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = sessionProcessor.b;
                        cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) ((((long) ((int) (((long) getInterfaceDescriptor) ^ (-6377398940819159759L)))) ^ (((long) (cArr[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (onTransact ^ (-6377398940819159759L)))) ^ ((long) ((char) (((long) INotificationSideChannelStubProxy) ^ (-6377398940819159759L)))));
                        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                        i3 = i2;
                        i5 = 0;
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
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ac, code lost:
    
        if (r1 != ((595151497 + (((~((-963612927) | r3)) | (~(r2 | 1615443038))) * 333)) + (((~(r2 | (-963612927))) | (~(r3 | 1615443038))) * 333))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ae, code lost:
    
        super.onResume();
        r1 = com.midtrans.sdk.uikit.views.bca_klikbca.payment.KlikBcaPaymentActivity.INotificationSideChannelStub + 59;
        com.midtrans.sdk.uikit.views.bca_klikbca.payment.KlikBcaPaymentActivity.INotificationSideChannelDefault = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ba, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c2, code lost:
    
        throw new java.lang.RuntimeException("1856087033");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c3, code lost:
    
        r1 = (-551147108) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00cc, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0043, code lost:
    
        if (r1 == ((r7 + (((~(r4 | (-545785898))) | (~(750327979 | r6))) * 859)) + (((~(1580315522 | r6)) | (-2126101420)) * 859))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007b, code lost:
    
        if (r1 == ((r7 + (((~(656735737 | r6)) | (-2143157754)) * (-1976))) + ((((~(r4 | 1486723280)) | 301264) | (~((-1486723281) | r6))) * 988))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007d, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = (int) java.lang.Runtime.getRuntime().totalMemory();
        r3 = ~r2;
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.bca_klikbca.payment.KlikBcaPaymentActivity.onResume():void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 69;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        if (i4 != (-283720120) + (((~((-272852490) | (~i5))) | (~((-1102840033) | i5))) * (-272)) + (((~((-272889358) | i5)) | 36868) * (-272)) + (((~(i5 | 272889357)) | (-1102876901)) * 272)) {
            throw new RuntimeException("-1210812987");
        }
        int i6 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
        int i8 = ~i7;
        if (i6 != (-1395971716) + (((~((-592947384) | i8)) | 574720165 | (~((-1986108582) | i8))) * (-1136)) + (((~((-592947384) | i7)) | (~((-1986108582) | i7)) | (~(2004335799 | i8))) * (-568)) + (((~(i7 | (-574720166))) | (~(i8 | 1986108581)) | (~(592947383 | i8))) * 568)) {
            int i9 = INotificationSideChannelDefault + 19;
            INotificationSideChannelStub = i9 % 128;
            int i10 = i9 % 2;
            int[] iArr = new int[1691930113];
            iArr[1691930112] = 1;
            int i11 = (-1432564224) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        super.onStart();
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 3;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = INotificationSideChannelDefault + 9;
        INotificationSideChannelStub = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$u(short r6, int r7, byte r8) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.views.bca_klikbca.payment.KlikBcaPaymentActivity.$$m
            int r6 = r6 + 4
            int r8 = r8 + 102
            int r7 = r7 * 4
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L28
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L28:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.bca_klikbca.payment.KlikBcaPaymentActivity.$$u(short, int, byte):java.lang.String");
    }
}
