package com.midtrans.sdk.uikit.views.creditcard.bankpoints;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemProgramChosenBinding;
import com.midtrans.sdk.corekit.core.Currency;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.models.BankType;
import com.midtrans.sdk.corekit.models.snap.ItemDetails;
import com.midtrans.sdk.corekit.models.snap.TransactionDetails;
import com.midtrans.sdk.corekit.utilities.Utils;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.widgets.BoldTextView;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import com.midtrans.sdk.uikit.widgets.SemiBoldTextView;
import defpackage.CameraUseCaseAdapter;
import defpackage.ViewPortBuilder;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.getConfigs;
import defpackage.getPreferredChildSize;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.onConnectionFailed;
import defpackage.setSurfaceOccupancyPriority;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class BankPointsActivity extends BasePaymentActivity {
    private static final String d = "BankPointsActivity";
    private FancyButton INotificationSideChannel;
    private SemiBoldTextView INotificationSideChannelDefault;
    private TextView INotificationSideChannelStub;
    private FancyButton asInterface;
    private EditText cancel;
    private FancyButton cancelAll;
    private FancyButton g;
    private TextView getInterfaceDescriptor;
    private getPreferredChildSize notify;
    private ImageView onTransact;
    private static final byte[] $$m = {27, 65, -33, 120};
    private static final int $$n = 134;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {94, -56, 58, -24, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$k = 39;
    private static int INotificationSideChannelStubProxy = 0;
    private static int write = 1;
    private static char[] RemoteActionCompatParcelizer = {59708, 59746, 59744, 59771, 59751, 59757, 59714, 59717, 59770, 59739, 59723, 59757, 59773, 59768, 59751, 59746, 59731, 59740, 59750, 59746, 59756, 59757, 59820, 59833, 59809, 59796, 59816, 59803, 59817, 59816, 59834, 59813, 59796, 59809, 59816, 59816, 59808, 59710, 59758, 59744, 59744, 59724, 59718, 59757, 59756, 59745, 59713, 59723, 59757, 59773, 59768, 59751, 59746, 59711, 59757, 59759, 59746, 59770, 59749, 59749, 59773, 59755, 59743, 59745, 59750, 59742, 59730, 59746, 59759};

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(BankPointsActivity bankPointsActivity, boolean z) {
        int i = 2 % 2;
        int i2 = write + 85;
        INotificationSideChannelStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bankPointsActivity);
            throw null;
        }
        onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bankPointsActivity);
        String str = "0";
        String strTrim = z ? bankPointsActivity.cancel.getText().toString().trim() : "0";
        if (strTrim.isEmpty()) {
            int i3 = write + 123;
            INotificationSideChannelStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            str = strTrim;
        }
        float fFloatValue = Float.valueOf(str).floatValue();
        Intent intent = new Intent();
        intent.putExtra("point.redeemed", fFloatValue);
        bankPointsActivity.setResult(-1, intent);
        bankPointsActivity.finish();
    }

    public static /* synthetic */ EditText TuitionPaymentFragmentspecialinlinedviewModeldefault1(BankPointsActivity bankPointsActivity) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 67;
        INotificationSideChannelStubProxy = i3 % 128;
        int i4 = i3 % 2;
        EditText editText = bankPointsActivity.cancel;
        if (i4 != 0) {
            int i5 = 72 / 0;
        }
        int i6 = i2 + 21;
        INotificationSideChannelStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return editText;
    }

    public static /* synthetic */ getPreferredChildSize TuitionPaymentFragmentspecialinlinedviewModeldefault2(BankPointsActivity bankPointsActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 91;
        write = i2 % 128;
        int i3 = i2 % 2;
        getPreferredChildSize getpreferredchildsize = bankPointsActivity.notify;
        if (i3 != 0) {
            return getpreferredchildsize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(BankPointsActivity bankPointsActivity) {
        int i = 2 % 2;
        int i2 = write + 83;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        bankPointsActivity.cancel();
        int i4 = INotificationSideChannelStubProxy + 109;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ String g() {
        String str;
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 27;
        int i3 = i2 % 128;
        write = i3;
        if (i2 % 2 == 0) {
            str = d;
            int i4 = 57 / 0;
        } else {
            str = d;
        }
        int i5 = i3 + 23;
        INotificationSideChannelStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r0 = com.midtrans.sdk.uikit.views.creditcard.bankpoints.BankPointsActivity.$$j
            int r8 = 144 - r8
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2b:
            int r6 = r6 + r8
            int r6 = r6 + (-11)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.creditcard.bankpoints.BankPointsActivity.m(byte, int, short, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = write + 43;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        setResult(0);
        super.onBackPressed();
        int i4 = INotificationSideChannelStubProxy + 59;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void cancel() {
        String currency;
        int i = 2 % 2;
        double d2 = this.notify.TuitionPaymentFragmentbindingInflater1;
        TransactionDetails transactionDetails = this.notify.b().getTransaction().getTransactionDetails();
        if (transactionDetails != null) {
            int i2 = INotificationSideChannelStubProxy + 85;
            write = i2 % 128;
            if (i2 % 2 == 0) {
                transactionDetails.getCurrency();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            currency = transactionDetails.getCurrency();
        } else {
            currency = Currency.IDR;
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, d2, currency);
        this.getInterfaceDescriptor.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        BoldTextView boldTextView = ((BasePaymentActivity) this).f850a;
        if (boldTextView != null) {
            boldTextView.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        ItemDetails itemDetailsTuitionPaymentFragmentbindingInflater1 = this.notify.TuitionPaymentFragmentbindingInflater1();
        if (((BasePaymentActivity) this).asBinder != null) {
            new Handler().postDelayed(new BasePaymentActivity.AnonymousClass5(itemDetailsTuitionPaymentFragmentbindingInflater1), 200L);
        }
        int i3 = INotificationSideChannelStubProxy + 123;
        write = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        setPrimaryBackgroundColor(this.g);
        setSecondaryBackgroundColor(this.cancelAll);
        this.cancelAll.setAlpha(0.5f);
        setSecondaryBackgroundColor(this.INotificationSideChannel);
        this.INotificationSideChannel.setAlpha(0.5f);
        setTextColor(this.asInterface);
        FancyButton fancyButton = this.asInterface;
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object obj = null;
        if (i2 != 0) {
            int i3 = write + 57;
            INotificationSideChannelStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                fancyButton.setIconColorFilter(i2);
                obj.hashCode();
                throw null;
            }
            fancyButton.setIconColorFilter(i2);
        }
        int i4 = INotificationSideChannelStubProxy + 125;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void a() throws Throwable {
        int i = 2 % 2;
        float f = this.notify.g;
        if (f > this.notify.asInterface) {
            int i2 = INotificationSideChannelStubProxy + 125;
            write = i2 % 128;
            if (i2 % 2 == 0) {
                double d2 = this.notify.asInterface;
                throw null;
            }
            f = (float) this.notify.asInterface;
        }
        getPreferredChildSize getpreferredchildsize = this.notify;
        if (f >= 0.0f) {
            int i3 = write + 3;
            INotificationSideChannelStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                float f2 = getpreferredchildsize.g;
                throw null;
            }
            if (f <= getpreferredchildsize.g) {
                this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault3(f);
                long j = (long) f;
                this.notify.asBinder = j;
                this.cancel.setText(String.valueOf(j));
            }
        }
        int i4 = write + 41;
        INotificationSideChannelStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = write + 33;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.cancel = (AppCompatEditText) findViewById(R.id.redeemed_point_field);
        this.INotificationSideChannelStub = (TextView) findViewById(R.id.text_total_point);
        this.getInterfaceDescriptor = (TextView) findViewById(R.id.text_amount_to_pay);
        this.INotificationSideChannelDefault = (SemiBoldTextView) findViewById(R.id.text_page_title);
        this.onTransact = (ImageView) findViewById(R.id.bank_point_logo);
        this.g = (FancyButton) findViewById(R.id.button_primary);
        this.asInterface = (FancyButton) findViewById(R.id.button_pay_without_point);
        this.cancelAll = (FancyButton) findViewById(R.id.container_amount);
        this.INotificationSideChannel = (FancyButton) findViewById(R.id.container_total_point);
        int i4 = INotificationSideChannelStubProxy + 57;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:17:0x0149  */
    /* JADX WARN: Code duplicated, block: B:18:0x0157  */
    /* JADX WARN: Code duplicated, block: B:20:0x0177  */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        String string;
        TransactionDetails transactionDetails;
        String currency;
        int i = 2 % 2;
        int i2 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i3 = ~((-12609835) | elapsedCpuTime);
        int i4 = ~elapsedCpuTime;
        if (i2 != 1329081610 + ((i3 | (~(i4 | 989592939))) * 497) + (((~(elapsedCpuTime | 989592939)) | (~((-146995563) | i4)) | 134385728) * 497)) {
            throw null;
        }
        int i5 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i5 != 1558668858 + (((~((~iIdentityHashCode) | (-1031974815))) | 1547081150) * (-235)) + (((~((-1031974815) | iIdentityHashCode)) | 1547081150) * (-470)) + (((~(iIdentityHashCode | (-562047489))) | 1077153824) * 235)) {
            int i6 = 783131328 % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        this.notify = new getPreferredChildSize(getIntent().getFloatExtra("point.balance", 0.0f), getIntent().getStringExtra("point.bank"));
        setContentView(R.layout.activity_bank_points);
        this.cancel.addTextChangedListener(new TextWatcher() { // from class: com.midtrans.sdk.uikit.views.creditcard.bankpoints.BankPointsActivity.4
            /* JADX WARN: Code duplicated, block: B:22:0x0074  */
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) throws Throwable {
                float f;
                String string2 = editable.toString();
                try {
                    if (editable.length() == 0) {
                        editable.insert(0, "0");
                    } else if (string2.length() > 1 && string2.charAt(0) == '0') {
                        editable.delete(0, 1);
                    }
                    f = Float.parseFloat(string2);
                } catch (RuntimeException e2) {
                    String strG = BankPointsActivity.g();
                    StringBuilder sb = new StringBuilder("fieldRedeemedPoint:");
                    sb.append(e2.getMessage());
                    Logger.e(strG, sb.toString());
                    f = 0.0f;
                }
                if (f <= BankPointsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(BankPointsActivity.this).asInterface) {
                    getPreferredChildSize getpreferredchildsizeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = BankPointsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(BankPointsActivity.this);
                    if (f < 0.0f || f > getpreferredchildsizeTuitionPaymentFragmentspecialinlinedviewModeldefault2.g) {
                        BankPointsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(BankPointsActivity.this).setText(String.valueOf(BankPointsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(BankPointsActivity.this).asBinder));
                        BankPointsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(BankPointsActivity.this).setSelection(BankPointsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(BankPointsActivity.this).getText().length());
                    } else {
                        BankPointsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(BankPointsActivity.this).TuitionPaymentFragmentspecialinlinedviewModeldefault3(f);
                        BankPointsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(BankPointsActivity.this).asBinder = (long) f;
                    }
                } else {
                    BankPointsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(BankPointsActivity.this).setText(String.valueOf(BankPointsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(BankPointsActivity.this).asBinder));
                    BankPointsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(BankPointsActivity.this).setSelection(BankPointsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(BankPointsActivity.this).getText().length());
                }
                BankPointsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(BankPointsActivity.this);
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            }
        });
        a();
        cancel();
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.bankpoints.BankPointsActivity.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    BankPointsActivity.TuitionPaymentFragmentbindingInflater1(BankPointsActivity.this, true);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.asInterface.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.bankpoints.BankPointsActivity.2
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {41, 2, 45, -60, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 52;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static long b = 4116046205371101237L;

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 14
                    int r6 = r6 + 84
                    int r0 = 53 - r8
                    byte[] r1 = com.midtrans.sdk.uikit.views.creditcard.bankpoints.BankPointsActivity.AnonymousClass2.$$a
                    int r7 = 144 - r7
                    byte[] r0 = new byte[r0]
                    int r8 = 52 - r8
                    r2 = 0
                    if (r1 != 0) goto L14
                    r3 = r7
                    r4 = r2
                    goto L2c
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    int r7 = r7 + 1
                    int r4 = r3 + 1
                    if (r3 != r8) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L26:
                    r3 = r1[r7]
                    r5 = r7
                    r7 = r6
                    r6 = r3
                    r3 = r5
                L2c:
                    int r6 = -r6
                    int r7 = r7 + r6
                    int r6 = r7 + (-11)
                    r7 = r3
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.creditcard.bankpoints.BankPointsActivity.AnonymousClass2.c(short, short, int, java.lang.Object[]):void");
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int i7 = 2 % 2;
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                try {
                    if (i8 % 2 != 0) {
                        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                        BankPointsActivity.TuitionPaymentFragmentbindingInflater1(BankPointsActivity.this, true);
                    } else {
                        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                        BankPointsActivity.TuitionPaymentFragmentbindingInflater1(BankPointsActivity.this, false);
                    }
                    ViewPortBuilder.b();
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                    int i10 = i9 % 2;
                } catch (Throwable th) {
                    ViewPortBuilder.b();
                    throw th;
                }
            }

            private static void a(char[] cArr, int i7, Object[] objArr) throws Throwable {
                int i8 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i9 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19473 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 2625 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 13 - View.getDefaultSize(0, 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i9] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (b ^ 9053247990562531611L);
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (ViewConfiguration.getTapTimeout() >> 16)), 481 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr2 = new char[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i10 = $10 + 121;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 39422), 481 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (Process.myPid() >> 22) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    int i12 = $10 + 117;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                }
                objArr[0] = new String(cArr2);
            }

            /* JADX WARN: Code duplicated, block: B:101:0x0577  */
            /* JADX WARN: Code duplicated, block: B:108:0x0587 A[PHI: r22
  0x0587: PHI (r22v7 int) = (r22v6 int), (r22v9 int), (r22v10 int) binds: [B:107:0x0585, B:134:0x0587, B:99:0x0574] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:111:0x05a4  */
            /* JADX WARN: Code duplicated, block: B:113:0x05a9  */
            /* JADX WARN: Code duplicated, block: B:116:0x05d6  */
            /* JADX WARN: Code duplicated, block: B:127:0x0768  */
            /* JADX WARN: Code duplicated, block: B:142:0x0305 A[EXC_TOP_SPLITTER, PHI: r22
  0x0305: PHI (r22v5 int) = (r22v2 int), (r22v13 int) binds: [B:47:0x02f0, B:45:0x02ea] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:46:0x02ec A[PHI: r22
  0x02ec: PHI (r22v2 int) = (r22v1 int), (r22v13 int) binds: [B:39:0x0293, B:45:0x02ea] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:48:0x02f2  */
            /* JADX WARN: Code duplicated, block: B:50:0x02fd  */
            /* JADX WARN: Code duplicated, block: B:55:0x030b  */
            /* JADX WARN: Code duplicated, block: B:57:0x0316  */
            /* JADX WARN: Code duplicated, block: B:60:0x0330 A[Catch: Exception -> 0x0585, TRY_LEAVE, TryCatch #4 {Exception -> 0x0585, blocks: (B:52:0x0305, B:58:0x0318, B:59:0x032d, B:60:0x0330), top: B:142:0x0305 }] */
            /* JADX WARN: Code duplicated, block: B:64:0x0355 A[Catch: all -> 0x0455, TryCatch #1 {all -> 0x0455, blocks: (B:62:0x0348, B:64:0x0355, B:65:0x038d), top: B:137:0x0348, outer: #2 }] */
            /* JADX WARN: Code duplicated, block: B:68:0x03f3  */
            /* JADX WARN: Code duplicated, block: B:70:0x044b A[Catch: Exception -> 0x0587, TRY_LEAVE, TryCatch #2 {Exception -> 0x0587, blocks: (B:69:0x0415, B:70:0x044b, B:72:0x044f, B:73:0x0452, B:78:0x0458, B:80:0x045e, B:81:0x045f, B:82:0x0460, B:92:0x04ee, B:97:0x056f, B:103:0x057d, B:105:0x0583, B:106:0x0584, B:62:0x0348, B:64:0x0355, B:65:0x038d, B:93:0x0512, B:95:0x051f, B:96:0x0568), top: B:139:0x0309, inners: #1, #5 }] */
            /* JADX WARN: Code duplicated, block: B:82:0x0460 A[Catch: Exception -> 0x0587, TRY_LEAVE, TryCatch #2 {Exception -> 0x0587, blocks: (B:69:0x0415, B:70:0x044b, B:72:0x044f, B:73:0x0452, B:78:0x0458, B:80:0x045e, B:81:0x045f, B:82:0x0460, B:92:0x04ee, B:97:0x056f, B:103:0x057d, B:105:0x0583, B:106:0x0584, B:62:0x0348, B:64:0x0355, B:65:0x038d, B:93:0x0512, B:95:0x051f, B:96:0x0568), top: B:139:0x0309, inners: #1, #5 }] */
            /* JADX WARN: Code duplicated, block: B:85:0x04a5  */
            /* JADX WARN: Code duplicated, block: B:86:0x04aa  */
            /* JADX WARN: Code duplicated, block: B:89:0x04d3  */
            /* JADX WARN: Code duplicated, block: B:90:0x04d7  */
            /* JADX WARN: Code duplicated, block: B:95:0x051f A[Catch: all -> 0x057c, TryCatch #5 {all -> 0x057c, blocks: (B:93:0x0512, B:95:0x051f, B:96:0x0568), top: B:144:0x0512, outer: #2 }] */
            public static Object[] b(Context context, int i7, int i8, int i9) throws Throwable {
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                int i18;
                int i19;
                int i20;
                int i21;
                int i22;
                int i23;
                int i24;
                int iLastIndexOf;
                int i25;
                int i26;
                int i27;
                int i28;
                int i29;
                int i30;
                int i31;
                int i32;
                String str;
                Object[] objArr;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i33;
                Object obj;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                long j;
                long j2;
                int i34;
                int i35;
                int i36;
                int i37;
                int i38 = 2 % 2;
                Object obj2 = null;
                if (context != null) {
                    int i39 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i40 = (i39 ^ 11) + ((i39 & 11) << 1);
                    int i41 = i40 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i41;
                    if (i40 % 2 != 0) {
                        obj2.hashCode();
                        throw null;
                    }
                    int i42 = i41 + 121;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i42 % 128;
                    int i43 = i42 % 2;
                    try {
                        Object[] objArr2 = new Object[1];
                        a(new char[]{39247, 55339, 7068, 23837, 40173, 56912, 4552, 20717, 37397, 54658, 5998, 22211, 34895, 52015, 2688, 19525, 36829, 49498, 198, 17323, 34071, 50321, 1640}, 16746 - (~(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))), objArr2);
                        Class<?> cls = Class.forName((String) objArr2[0]);
                        char[] cArr = {39241, 26326, 26208, 26552, 26410, 26447, 25836, 25612, 26021, 26058, 25976, 25336, 25117, 25529, 25585, 25459, 24728, 24620};
                        int i44 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int i45 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i45 % 128;
                        if (i45 % 2 != 0) {
                            int i46 = (755 >> i44) >>> (-66190);
                            int i47 = ~((~i44) | 65437);
                            int i48 = ~i44;
                            int i49 = ~((i48 ^ i7) | (i48 & i7));
                            int i50 = (i47 ^ i49) | (i49 & i47);
                            int i51 = ~((i7 ^ 65437) | (i7 & 65437));
                            i35 = i46 % ((-754) % ((i50 ^ i51) | (i50 & i51)));
                        } else {
                            int i52 = i44 * 755;
                            int i53 = (i52 & (-49274061)) + (i52 | (-49274061));
                            int i54 = ~i44;
                            int i55 = (~(i54 | i7)) | (~((i54 ^ 65437) | (i54 & 65437)));
                            int i56 = ~((i7 ^ 65437) | (i7 & 65437));
                            i35 = (i53 - (~(-(-(((i55 ^ i56) | (i55 & i56)) * (-754)))))) - 1;
                        }
                        int i57 = ~(((i44 ^ (-1)) & 65437) | ((-65438) ^ i44) | i7);
                        int i58 = ~i7;
                        int i59 = ~((i58 ^ i44) | (i58 & i44) | 65437);
                        int i60 = i35 + ((-754) * ((i57 ^ i59) | (i57 & i59)));
                        int i61 = ~i44;
                        int i62 = (i60 - (~(((i61 & i58) | (i61 ^ i58)) * 754))) - 1;
                        Object[] objArr3 = new Object[1];
                        a(cArr, i62, objArr3);
                        Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context, null);
                        Object[] objArr4 = new Object[1];
                        a(new char[]{39247, 13001, 52824, 39879, 14181, 49386, 40060, 10687, 50437, 40592, 10778, 51129, 37671, 11445, 63524, 37895, 8654, 64858, 38562, 8772, 65514, 35683, 9348, 61448, 36245, 22830, 62128, 36404, 23485, 63429, 33641, 23767, 59496, 34280}, 43912 - (~(-Color.red(0))), objArr4);
                        Class<?> cls2 = Class.forName((String) objArr4[0]);
                        char[] cArr2 = {39240, 18815, 14645, 59902, 55721};
                        int i63 = -TextUtils.indexOf("", "", 0, 0);
                        int i64 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i65 = i64 + 3;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i65 % 128;
                        if (i65 % 2 == 0) {
                            int i66 = (i63 * TypedValues.Custom.TYPE_DIMENSION) >>> (-54212);
                            i36 = ~i63;
                            int i67 = -((~((i36 ^ i7) | (i36 & i7))) | (~((i58 ^ 53309) | (i58 & 53309))));
                            i37 = i66 << (((i67 | (-1808)) << 1) - (i67 ^ (-1808)));
                        } else {
                            int i68 = (i63 * TypedValues.Custom.TYPE_DIMENSION) - 48138027;
                            i36 = ~i63;
                            int i69 = ~((i36 ^ i7) | (i36 & i7));
                            int i70 = ~((~i7) | 53309);
                            int i71 = -(-(((i69 ^ i70) | (i69 & i70)) * (-1808)));
                            i37 = ((i68 | i71) << 1) - (i68 ^ i71);
                        }
                        int i72 = ((-53310) & i36) | (i36 ^ (-53310));
                        int i73 = (i58 ^ i63) | (i58 & i63);
                        int i74 = -(-(TypedValues.Custom.TYPE_BOOLEAN * ((~((i72 & i7) | (i72 ^ i7))) | (~((i73 & 53309) | (i73 ^ 53309))))));
                        int i75 = (i37 ^ i74) + ((i37 & i74) << 1);
                        int i76 = ~i63;
                        int i77 = ~((i76 & 53309) | (i76 ^ 53309));
                        int i78 = ~(((-53310) & i7) | ((-53310) ^ i7));
                        int i79 = (i64 & 21) + (i64 | 21);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i79 % 128;
                        int i80 = i79 % 2;
                        int i81 = (i77 & i78) | (i77 ^ i78);
                        int i82 = ~((~i7) | i63);
                        int i83 = TypedValues.Custom.TYPE_BOOLEAN * ((i81 & i82) | (i81 ^ i82));
                        int i84 = ((i75 | i83) << 1) - (i83 ^ i75);
                        Object[] objArr5 = new Object[1];
                        a(cArr2, i84, objArr5);
                        int i85 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                        int i86 = -i85;
                        int i87 = ((i85 & i86) | (i85 ^ i86)) >> 31;
                        int i88 = (~i87) & i7;
                        int i89 = i87 & ((i7 & (-2)) | (i58 & 1));
                        int i90 = (i89 & i88) | (i88 ^ i89);
                        int i91 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i92 = (i91 & 39) + (i91 | 39);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i92 % 128;
                        if (i92 % 2 == 0) {
                            int i93 = 4 % 2;
                        }
                        i10 = i90;
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
                        char cAlpha = (char) (Color.alpha(0) + 16949);
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 2739;
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 13;
                        i11 = 0;
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr6 = new Object[1];
                        c(b3, (short) (b3 | 141), b2, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, packedPositionType, edgeSlop, 1501733736, false, (String) objArr6[0], new Class[0]);
                    }
                    Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) (16950 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int i94 = 2740 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int keyRepeatTimeout = 13 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        i11 = 0;
                        byte b4 = $$a[7];
                        byte b5 = b4;
                        Object[] objArr7 = new Object[1];
                        c(b5, (short) (b5 | 89), b4, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, i94, keyRepeatTimeout, 47863026, false, (String) objArr7[0], null);
                    }
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null))) {
                        int i95 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i95 % 128;
                        int i96 = i95 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf = (char) (16948 - TextUtils.indexOf((CharSequence) "", '0'));
                            int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 2739;
                            int iResolveSizeAndState = 13 - View.resolveSizeAndState(0, 0, 0);
                            i11 = 0;
                            byte b6 = $$a[7];
                            Object[] objArr8 = new Object[1];
                            c(b6, (short) (b6 | 37), (byte) 15, objArr8);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, packedPositionType2, iResolveSizeAndState, 631063962, false, (String) objArr8[0], null);
                        }
                        if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                            if (Build.VERSION.SDK_INT > 33) {
                                i33 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i33 % 128;
                                if (i33 % 2 == 0) {
                                    Object[] objArr9 = new Object[1];
                                    a(new char[]{39169, 40180, 37412, 34928, 36861, 34300, 47930, 45438, 46242, 43702, 41012, 42615, 56753, 54265, 51569, 53115, 49851, 63715, 65077, 62564, 60325, 57828, 59174, 7531, 4259, 5799, 3130, 616}, 20922 / AndroidCharacter.getMirror('#'), objArr9);
                                    obj = objArr9[0];
                                } else {
                                    Object[] objArr10 = new Object[1];
                                    a(new char[]{39169, 40180, 37412, 34928, 36861, 34300, 47930, 45438, 46242, 43702, 41012, 42615, 56753, 54265, 51569, 53115, 49851, 63715, 65077, 62564, 60325, 57828, 59174, 7531, 4259, 5799, 3130, 616}, 1422 - (~(-(-AndroidCharacter.getMirror('0')))), objArr10);
                                    obj = objArr10[0];
                                }
                                Object[] objArr11 = {(String) obj};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                                    int pressedStateDuration = 993 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                    int bitsPerPixel = 7 - ImageFormat.getBitsPerPixel(0);
                                    byte[] bArr = $$a;
                                    Object[] objArr12 = new Object[1];
                                    c(bArr[5], bArr[7], (byte) $$b, objArr12);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionGroup, pressedStateDuration, bitsPerPixel, 410748506, false, (String) objArr12[0], new Class[]{String.class});
                                }
                                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr11)).longValue();
                                long j3 = 1226813002;
                                long j4 = -1;
                                long j5 = jLongValue ^ j4;
                                i11 = i10;
                                long j6 = i7;
                                long j7 = TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                                long j8 = j6 ^ j4;
                                j = (((long) 319) * j3) + (((long) (-317)) * jLongValue) + (((long) (-318)) * (j5 | (((j3 ^ j4) | j6) ^ j4))) + ((((j5 | j6) ^ j4) | (((j8 | j3) | jLongValue) ^ j4)) * j7) + (j7 * ((((j5 | j8) | j3) ^ j4) | ((j6 | (jLongValue | j3)) ^ j4))) + ((long) (-1427731239));
                                j2 = j >> 32;
                                i34 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i34 % 128;
                                if (i34 % 2 != 0) {
                                    Process.getStartElapsedRealtime();
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                                int i97 = (int) j2;
                                int i98 = ~i7;
                                int i99 = i97 & (1943169050 + (((~(1210174534 | i98)) | 92799264) * 184) + ((1075921922 | i7) * (-184)) + ((~(i98 | (-227051877))) * 184));
                                int i100 = (int) j;
                                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                int i101 = ~iMaxMemory;
                                int i102 = i100 & ((((~((-789083982) | i101)) | (~((-2068656905) | iMaxMemory)) | (~(i101 | 2068656904))) * 959) + 1990099740 + (((~(iMaxMemory | 2068656904)) | (~(i101 | (-2068656905))) | (~((-789083982) | iMaxMemory))) * 959));
                                i17 = (i99 & i102) | (i99 ^ i102);
                            } else {
                                i11 = i10;
                                char[] cArr3 = {39199};
                                iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
                                int i103 = iLastIndexOf * 592;
                                int i104 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i105 = ((i104 | 113) << 1) - (i104 ^ 113);
                                int i106 = i105 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i106;
                                int i107 = i105 % 2;
                                i25 = (i103 ^ (-24595920)) + ((i103 & (-24595920)) << 1);
                                i26 = ~iLastIndexOf;
                                i27 = (i26 ^ 41688) | (i26 & 41688);
                                i28 = ((i106 | 53) << 1) - (i106 ^ 53);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
                                if (i28 % 2 == 0) {
                                    i29 = i25 << ((-1182) << (~i27));
                                } else {
                                    int i108 = (~i27) * (-1182);
                                    i29 = (i25 ^ i108) + ((i108 & i25) << 1);
                                    i26 = ~iLastIndexOf;
                                }
                                int i109 = (i26 & (-41689)) | (i26 ^ (-41689));
                                int i110 = ~i7;
                                int i111 = ~((i109 & i110) | (i109 ^ i110));
                                int i112 = ~((41688 & iLastIndexOf) | (iLastIndexOf ^ 41688));
                                i30 = (i111 & i112) | (i111 ^ i112);
                                i31 = i106 + 123;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i31 % 128;
                                if (i31 % 2 == 0) {
                                    i32 = i29 * ((-591) >>> i30);
                                } else {
                                    int i113 = (-591) * i30;
                                    i32 = ((i29 | i113) << 1) - (i29 ^ i113);
                                }
                                int i114 = ~iLastIndexOf;
                                int i115 = (i114 & i7) | (i7 ^ i114);
                                Object[] objArr13 = new Object[1];
                                a(cArr3, i32 + (591 * ((i115 & (-41689)) | (i115 ^ (-41689)))), objArr13);
                                str = (String) objArr13[0];
                                Object[] objArr14 = new Object[1];
                                a(new char[]{39260, 32852, 43818, 53877, 64799, 58405, 3877, 14042, 20961, 30962, 25502, 35493, 46519}, 6420 - (~(-(-Color.argb(0, 0, 0, 0)))), objArr14);
                                objArr = new Object[]{(String) objArr14[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33602);
                                    int tapTimeout = 3085 - (ViewConfiguration.getTapTimeout() >> 16);
                                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 27;
                                    byte[] bArr2 = $$a;
                                    Object[] objArr15 = new Object[1];
                                    c(bArr2[5], bArr2[7], (byte) $$b, objArr15);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, tapTimeout, iIndexOf, 1411172903, false, (String) objArr15[0], new Class[]{String.class});
                                }
                                if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    i17 = 0;
                                } else {
                                    setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    i17 = 1;
                                }
                            }
                            int i116 = (i7 & (-11)) | ((~i7) & 10);
                            int i117 = -i17;
                            i18 = (i17 & i117) | (i17 ^ i117);
                            int i118 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i19 = ((i118 | 79) << 1) - (i118 ^ 79);
                            int i119 = i19 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i119;
                            if (i19 % 2 != 0) {
                                i20 = i18 % 31;
                            } else {
                                i20 = i18 >> 31;
                            }
                            int i120 = (~i20) & i7;
                            int i121 = i20 & i116;
                            i21 = (i121 & i120) | (i120 ^ i121);
                            int i122 = i8 & 32;
                            int i123 = ((i119 | 15) << 1) - (i119 ^ 15);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i123 % 128;
                            int i124 = i123 % 2;
                            int i125 = -i122;
                            i22 = ((i122 & i125) | (i122 ^ i125)) >> 31;
                            i23 = (i119 ^ 123) + ((i119 & 123) << 1);
                            i24 = i23 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i24;
                            if (i23 % 2 == 0) {
                                throw null;
                            }
                            int i126 = i21 & (~i22);
                            int i127 = i22 & i7;
                            i13 = (i126 & i127) | (i126 ^ i127);
                            int i128 = (i24 ^ 15) + ((i24 & 15) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i128 % 128;
                            int i129 = i128 % 2;
                        } else if (Build.VERSION.SDK_INT == 30) {
                            i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
                            if (i12 % 2 != 0) {
                                int i130 = 87 / 0;
                            }
                            i13 = i7;
                            i11 = i10;
                        } else {
                            if (Build.VERSION.SDK_INT > 33) {
                                i33 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i33 % 128;
                                if (i33 % 2 == 0) {
                                    Object[] objArr16 = new Object[1];
                                    a(new char[]{39169, 40180, 37412, 34928, 36861, 34300, 47930, 45438, 46242, 43702, 41012, 42615, 56753, 54265, 51569, 53115, 49851, 63715, 65077, 62564, 60325, 57828, 59174, 7531, 4259, 5799, 3130, 616}, 20922 / AndroidCharacter.getMirror('#'), objArr16);
                                    obj = objArr16[0];
                                } else {
                                    Object[] objArr17 = new Object[1];
                                    a(new char[]{39169, 40180, 37412, 34928, 36861, 34300, 47930, 45438, 46242, 43702, 41012, 42615, 56753, 54265, 51569, 53115, 49851, 63715, 65077, 62564, 60325, 57828, 59174, 7531, 4259, 5799, 3130, 616}, 1422 - (~(-(-AndroidCharacter.getMirror('0')))), objArr17);
                                    obj = objArr17[0];
                                }
                                Object[] objArr18 = {(String) obj};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
                                    int pressedStateDuration2 = 993 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                    int bitsPerPixel2 = 7 - ImageFormat.getBitsPerPixel(0);
                                    byte[] bArr3 = $$a;
                                    Object[] objArr19 = new Object[1];
                                    c(bArr3[5], bArr3[7], (byte) $$b, objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionGroup2, pressedStateDuration2, bitsPerPixel2, 410748506, false, (String) objArr19[0], new Class[]{String.class});
                                }
                                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr18)).longValue();
                                long j9 = 1226813002;
                                long j10 = -1;
                                long j11 = jLongValue2 ^ j10;
                                i11 = i10;
                                long j12 = i7;
                                long j13 = TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                                long j14 = j12 ^ j10;
                                j = (((long) 319) * j9) + (((long) (-317)) * jLongValue2) + (((long) (-318)) * (j11 | (((j9 ^ j10) | j12) ^ j10))) + ((((j11 | j12) ^ j10) | (((j14 | j9) | jLongValue2) ^ j10)) * j13) + (j13 * ((((j11 | j14) | j9) ^ j10) | ((j12 | (jLongValue2 | j9)) ^ j10))) + ((long) (-1427731239));
                                j2 = j >> 32;
                                i34 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i34 % 128;
                                if (i34 % 2 != 0) {
                                    Process.getStartElapsedRealtime();
                                    Object obj4 = null;
                                    obj4.hashCode();
                                    throw null;
                                }
                                int i910 = (int) j2;
                                int i911 = ~i7;
                                int i912 = i910 & (1943169050 + (((~(1210174534 | i911)) | 92799264) * 184) + ((1075921922 | i7) * (-184)) + ((~(i911 | (-227051877))) * 184));
                                int i1010 = (int) j;
                                int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
                                int i1011 = ~iMaxMemory2;
                                int i1012 = i1010 & ((((~((-789083982) | i1011)) | (~((-2068656905) | iMaxMemory2)) | (~(i1011 | 2068656904))) * 959) + 1990099740 + (((~(iMaxMemory2 | 2068656904)) | (~(i1011 | (-2068656905))) | (~((-789083982) | iMaxMemory2))) * 959));
                                i17 = (i912 & i1012) | (i912 ^ i1012);
                            } else {
                                i11 = i10;
                                char[] cArr4 = {39199};
                                iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
                                int i1013 = iLastIndexOf * 592;
                                int i1014 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i1015 = ((i1014 | 113) << 1) - (i1014 ^ 113);
                                int i1016 = i1015 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1016;
                                int i1017 = i1015 % 2;
                                i25 = (i1013 ^ (-24595920)) + ((i1013 & (-24595920)) << 1);
                                i26 = ~iLastIndexOf;
                                i27 = (i26 ^ 41688) | (i26 & 41688);
                                i28 = ((i1016 | 53) << 1) - (i1016 ^ 53);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
                                if (i28 % 2 == 0) {
                                    i29 = i25 << ((-1182) << (~i27));
                                } else {
                                    int i1018 = (~i27) * (-1182);
                                    i29 = (i25 ^ i1018) + ((i1018 & i25) << 1);
                                    i26 = ~iLastIndexOf;
                                }
                                int i1019 = (i26 & (-41689)) | (i26 ^ (-41689));
                                int i1110 = ~i7;
                                int i1111 = ~((i1019 & i1110) | (i1019 ^ i1110));
                                int i1112 = ~((41688 & iLastIndexOf) | (iLastIndexOf ^ 41688));
                                i30 = (i1111 & i1112) | (i1111 ^ i1112);
                                i31 = i1016 + 123;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i31 % 128;
                                if (i31 % 2 == 0) {
                                    i32 = i29 * ((-591) >>> i30);
                                } else {
                                    int i1113 = (-591) * i30;
                                    i32 = ((i29 | i1113) << 1) - (i29 ^ i1113);
                                }
                                int i1114 = ~iLastIndexOf;
                                int i1115 = (i1114 & i7) | (i7 ^ i1114);
                                Object[] objArr110 = new Object[1];
                                a(cArr4, i32 + (591 * ((i1115 & (-41689)) | (i1115 ^ (-41689)))), objArr110);
                                str = (String) objArr110[0];
                                Object[] objArr111 = new Object[1];
                                a(new char[]{39260, 32852, 43818, 53877, 64799, 58405, 3877, 14042, 20961, 30962, 25502, 35493, 46519}, 6420 - (~(-(-Color.argb(0, 0, 0, 0)))), objArr111);
                                objArr = new Object[]{(String) objArr111[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char maximumFlingVelocity2 = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33602);
                                    int tapTimeout2 = 3085 - (ViewConfiguration.getTapTimeout() >> 16);
                                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 27;
                                    byte[] bArr4 = $$a;
                                    Object[] objArr112 = new Object[1];
                                    c(bArr4[5], bArr4[7], (byte) $$b, objArr112);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity2, tapTimeout2, iIndexOf2, 1411172903, false, (String) objArr112[0], new Class[]{String.class});
                                }
                                if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    i17 = 0;
                                } else {
                                    setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    i17 = 1;
                                }
                            }
                            int i1116 = (i7 & (-11)) | ((~i7) & 10);
                            int i1117 = -i17;
                            i18 = (i17 & i1117) | (i17 ^ i1117);
                            int i1118 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i19 = ((i1118 | 79) << 1) - (i1118 ^ 79);
                            int i1119 = i19 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1119;
                            if (i19 % 2 != 0) {
                                i20 = i18 % 31;
                            } else {
                                i20 = i18 >> 31;
                            }
                            int i1210 = (~i20) & i7;
                            int i1211 = i20 & i1116;
                            i21 = (i1211 & i1210) | (i1210 ^ i1211);
                            int i1212 = i8 & 32;
                            int i1213 = ((i1119 | 15) << 1) - (i1119 ^ 15);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1213 % 128;
                            int i1214 = i1213 % 2;
                            int i1215 = -i1212;
                            i22 = ((i1212 & i1215) | (i1212 ^ i1215)) >> 31;
                            i23 = (i1119 ^ 123) + ((i1119 & 123) << 1);
                            i24 = i23 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i24;
                            if (i23 % 2 == 0) {
                                throw null;
                            }
                            int i1216 = i21 & (~i22);
                            int i1217 = i22 & i7;
                            i13 = (i1216 & i1217) | (i1216 ^ i1217);
                            int i1218 = (i24 ^ 15) + ((i24 & 15) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1218 % 128;
                            int i1219 = i1218 % 2;
                        }
                    } else if (Build.VERSION.SDK_INT == 30) {
                        i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
                        if (i12 % 2 != 0) {
                            int i131 = 87 / 0;
                        }
                        i13 = i7;
                        i11 = i10;
                    } else {
                        try {
                            try {
                                if (Build.VERSION.SDK_INT > 33) {
                                    i33 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i33 % 128;
                                    if (i33 % 2 == 0) {
                                        Object[] objArr113 = new Object[1];
                                        a(new char[]{39169, 40180, 37412, 34928, 36861, 34300, 47930, 45438, 46242, 43702, 41012, 42615, 56753, 54265, 51569, 53115, 49851, 63715, 65077, 62564, 60325, 57828, 59174, 7531, 4259, 5799, 3130, 616}, 20922 / AndroidCharacter.getMirror('#'), objArr113);
                                        obj = objArr113[0];
                                    } else {
                                        Object[] objArr114 = new Object[1];
                                        a(new char[]{39169, 40180, 37412, 34928, 36861, 34300, 47930, 45438, 46242, 43702, 41012, 42615, 56753, 54265, 51569, 53115, 49851, 63715, 65077, 62564, 60325, 57828, 59174, 7531, 4259, 5799, 3130, 616}, 1422 - (~(-(-AndroidCharacter.getMirror('0')))), objArr114);
                                        obj = objArr114[0];
                                    }
                                    try {
                                        Object[] objArr115 = {(String) obj};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char packedPositionGroup3 = (char) ExpandableListView.getPackedPositionGroup(0L);
                                            int pressedStateDuration3 = 993 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                            int bitsPerPixel3 = 7 - ImageFormat.getBitsPerPixel(0);
                                            byte[] bArr5 = $$a;
                                            Object[] objArr116 = new Object[1];
                                            c(bArr5[5], bArr5[7], (byte) $$b, objArr116);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionGroup3, pressedStateDuration3, bitsPerPixel3, 410748506, false, (String) objArr116[0], new Class[]{String.class});
                                        }
                                        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr115)).longValue();
                                        long j15 = 1226813002;
                                        long j16 = -1;
                                        long j17 = jLongValue3 ^ j16;
                                        i11 = i10;
                                        long j18 = i7;
                                        long j19 = TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                                        long j110 = j18 ^ j16;
                                        j = (((long) 319) * j15) + (((long) (-317)) * jLongValue3) + (((long) (-318)) * (j17 | (((j15 ^ j16) | j18) ^ j16))) + ((((j17 | j18) ^ j16) | (((j110 | j15) | jLongValue3) ^ j16)) * j19) + (j19 * ((((j17 | j110) | j15) ^ j16) | ((j18 | (jLongValue3 | j15)) ^ j16))) + ((long) (-1427731239));
                                        j2 = j >> 32;
                                        i34 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i34 % 128;
                                        if (i34 % 2 != 0) {
                                            Process.getStartElapsedRealtime();
                                            Object obj5 = null;
                                            obj5.hashCode();
                                            throw null;
                                        }
                                        int i913 = (int) j2;
                                        int i914 = ~i7;
                                        int i915 = i913 & (1943169050 + (((~(1210174534 | i914)) | 92799264) * 184) + ((1075921922 | i7) * (-184)) + ((~(i914 | (-227051877))) * 184));
                                        int i10110 = (int) j;
                                        int iMaxMemory3 = (int) Runtime.getRuntime().maxMemory();
                                        int i10111 = ~iMaxMemory3;
                                        int i10112 = i10110 & ((((~((-789083982) | i10111)) | (~((-2068656905) | iMaxMemory3)) | (~(i10111 | 2068656904))) * 959) + 1990099740 + (((~(iMaxMemory3 | 2068656904)) | (~(i10111 | (-2068656905))) | (~((-789083982) | iMaxMemory3))) * 959));
                                        i17 = (i915 & i10112) | (i915 ^ i10112);
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                } else {
                                    i11 = i10;
                                    char[] cArr5 = {39199};
                                    iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
                                    int i10113 = iLastIndexOf * 592;
                                    int i10114 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i10115 = ((i10114 | 113) << 1) - (i10114 ^ 113);
                                    int i10116 = i10115 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10116;
                                    int i10117 = i10115 % 2;
                                    i25 = (i10113 ^ (-24595920)) + ((i10113 & (-24595920)) << 1);
                                    i26 = ~iLastIndexOf;
                                    i27 = (i26 ^ 41688) | (i26 & 41688);
                                    i28 = ((i10116 | 53) << 1) - (i10116 ^ 53);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
                                    if (i28 % 2 == 0) {
                                        i29 = i25 << ((-1182) << (~i27));
                                    } else {
                                        int i10118 = (~i27) * (-1182);
                                        i29 = (i25 ^ i10118) + ((i10118 & i25) << 1);
                                        i26 = ~iLastIndexOf;
                                    }
                                    int i10119 = (i26 & (-41689)) | (i26 ^ (-41689));
                                    int i11110 = ~i7;
                                    int i11111 = ~((i10119 & i11110) | (i10119 ^ i11110));
                                    int i11112 = ~((41688 & iLastIndexOf) | (iLastIndexOf ^ 41688));
                                    i30 = (i11111 & i11112) | (i11111 ^ i11112);
                                    i31 = i10116 + 123;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i31 % 128;
                                    if (i31 % 2 == 0) {
                                        i32 = i29 * ((-591) >>> i30);
                                    } else {
                                        int i11113 = (-591) * i30;
                                        i32 = ((i29 | i11113) << 1) - (i29 ^ i11113);
                                    }
                                    int i11114 = ~iLastIndexOf;
                                    int i11115 = (i11114 & i7) | (i7 ^ i11114);
                                    Object[] objArr117 = new Object[1];
                                    a(cArr5, i32 + (591 * ((i11115 & (-41689)) | (i11115 ^ (-41689)))), objArr117);
                                    str = (String) objArr117[0];
                                    Object[] objArr118 = new Object[1];
                                    a(new char[]{39260, 32852, 43818, 53877, 64799, 58405, 3877, 14042, 20961, 30962, 25502, 35493, 46519}, 6420 - (~(-(-Color.argb(0, 0, 0, 0)))), objArr118);
                                    try {
                                        objArr = new Object[]{(String) objArr118[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char maximumFlingVelocity3 = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33602);
                                            int tapTimeout3 = 3085 - (ViewConfiguration.getTapTimeout() >> 16);
                                            int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0) + 27;
                                            byte[] bArr6 = $$a;
                                            Object[] objArr119 = new Object[1];
                                            c(bArr6[5], bArr6[7], (byte) $$b, objArr119);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity3, tapTimeout3, iIndexOf3, 1411172903, false, (String) objArr119[0], new Class[]{String.class});
                                        }
                                        if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                            i17 = 0;
                                        } else {
                                            setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
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
                                i17 = 0;
                            }
                        } catch (Exception unused2) {
                            i11 = i10;
                        }
                        int i11116 = (i7 & (-11)) | ((~i7) & 10);
                        int i11117 = -i17;
                        i18 = (i17 & i11117) | (i17 ^ i11117);
                        int i11118 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        i19 = ((i11118 | 79) << 1) - (i11118 ^ 79);
                        int i11119 = i19 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11119;
                        if (i19 % 2 != 0) {
                            i20 = i18 % 31;
                        } else {
                            i20 = i18 >> 31;
                        }
                        int i12110 = (~i20) & i7;
                        int i12111 = i20 & i11116;
                        i21 = (i12111 & i12110) | (i12110 ^ i12111);
                        int i12112 = i8 & 32;
                        int i12113 = ((i11119 | 15) << 1) - (i11119 ^ 15);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12113 % 128;
                        int i12114 = i12113 % 2;
                        int i12115 = -i12112;
                        i22 = ((i12112 & i12115) | (i12112 ^ i12115)) >> 31;
                        i23 = (i11119 ^ 123) + ((i11119 & 123) << 1);
                        i24 = i23 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i24;
                        if (i23 % 2 == 0) {
                            throw null;
                        }
                        int i12116 = i21 & (~i22);
                        int i12117 = i22 & i7;
                        i13 = (i12116 & i12117) | (i12116 ^ i12117);
                        int i12118 = (i24 ^ 15) + ((i24 & 15) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12118 % 128;
                        int i12119 = i12118 % 2;
                    }
                    int i132 = i7 ^ i11;
                    int i133 = -i132;
                    int i134 = ((i132 & i133) | (i132 ^ i133)) >> 31;
                    int i135 = i13 & (~i134);
                    int i136 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i137 = ((i136 | 21) << 1) - (i136 ^ 21);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i137 % 128;
                    int i138 = i137 % 2;
                    int i139 = i11 & i134;
                    int i140 = (i135 & i139) | (i135 ^ i139);
                    Object[] objArr20 = new Object[4];
                    objArr20[0] = new int[]{i7};
                    objArr20[1] = new int[1];
                    int[] iArr = new int[1];
                    objArr20[2] = iArr;
                    int i141 = i7 ^ i140;
                    int i142 = i136 + 71;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i142 % 128;
                    int i143 = i142 % 2;
                    int i144 = ((i141 | (-i141)) >> 31) & 16;
                    int i145 = (i136 & 119) + (i136 | 119);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i145 % 128;
                    if (i145 % 2 != 0) {
                        ((int[]) objArr20[5])[0] = i140;
                        objArr20[2] = null;
                        i14 = (-1696657600) + ((~((-27339332) | i7)) * (-301)) + (((~(967290823 | i7)) | (~((~i7) | 1007601052))) * (-301)) + ((967290823 | (~((-1007601053) | i7))) * 301);
                    } else {
                        iArr[0] = i140;
                        objArr20[3] = null;
                        int iUptimeMillis = (int) SystemClock.uptimeMillis();
                        int i146 = ~iUptimeMillis;
                        i14 = ((2070192700 + (((~(706220212 | i146)) | (~((-746530442) | iUptimeMillis))) * (-370))) + ((((~(iUptimeMillis | 706220212)) | (~(i146 | (-746530442)))) | 33558580) * (-370))) - 468227288;
                    }
                    int i147 = (i144 * 569) + (i14 * 569);
                    int i148 = ~i144;
                    int i149 = ~i14;
                    int i150 = ~((i148 ^ i149) | (i148 & i149));
                    int i151 = ~i144;
                    int i152 = ~i7;
                    int i153 = (i151 ^ i152) | (i151 & i152);
                    int i154 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i155 = (i154 ^ 69) + ((i154 & 69) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i155 % 128;
                    if (i155 % 2 != 0) {
                        int i156 = ~i153;
                        int i157 = (i156 & i150) | (i150 ^ i156);
                        int i158 = ~((i149 ^ i152) | (i149 & i152));
                        i15 = (i147 - (~(-(-((-1136) / ((i157 & i158) | (i157 ^ i158))))))) - 1;
                        i16 = (i151 ^ i7) | (i151 & i7);
                    } else {
                        int i159 = ~i153;
                        int i160 = (i150 & i159) | (i150 ^ i159);
                        int i161 = ~((i149 ^ i152) | (i149 & i152));
                        int i162 = ((i160 & i161) | (i160 ^ i161)) * (-1136);
                        i15 = (i147 | i162) + (i147 & i162);
                        i16 = (i148 & i7) | (i148 ^ i7);
                    }
                    int i163 = ~i16;
                    int i164 = ~(i149 | i7);
                    int i165 = -(-((-568) * ((i163 & i164) | (i163 ^ i164) | (~((i152 ^ i144) | (i152 & i144) | i14)))));
                    int i166 = ((i15 | i165) << 1) - (i15 ^ i165);
                    int i167 = ~i7;
                    int i168 = ~((i167 & i144) | (i167 ^ i144));
                    int i169 = ~((i152 ^ i14) | (i152 & i14));
                    int i170 = (i168 & i169) | (i168 ^ i169);
                    int i171 = ~i14;
                    int i172 = (i154 & 73) + (i154 | 73);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i172 % 128;
                    int i173 = i172 % 2;
                    int i174 = (i171 & i151) | (i151 ^ i171);
                    int i175 = ~((i7 & i174) | (i174 ^ i7));
                    int i176 = 568 * ((i170 & i175) | (i170 ^ i175));
                    int i177 = (i9 - (~(-(-((i166 ^ i176) + ((i176 & i166) << 1)))))) - 1;
                    int i178 = i177 ^ (i177 << 13);
                    int i179 = i178 >>> 17;
                    int i180 = ((~i178) & i179) | ((~i179) & i178);
                    int i181 = i180 << 5;
                    ((int[]) objArr20[1])[0] = (i180 | i181) & (~(i180 & i181));
                    return objArr20;
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            }
        });
        String str = this.notify.f965a;
        str.hashCode();
        if (str.equals(BankType.BNI)) {
            string = getString(R.string.redeem_bni_title);
            this.INotificationSideChannelDefault.setText(string);
            this.onTransact.setImageResource(2131230983);
            this.INotificationSideChannelStub.setText(getString(R.string.total_bni_reward_point, Utils.getFormattedAmount(this.notify.g)));
            findViewById(R.id.container_redeemed_point).setVisibility(0);
            findViewById(R.id.container_fiestapoin).setVisibility(8);
            new Handler().postDelayed(new Runnable() { // from class: com.midtrans.sdk.uikit.views.creditcard.bankpoints.BankPointsActivity.1
                @Override // java.lang.Runnable
                public final void run() {
                    BankPointsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(BankPointsActivity.this).requestFocus();
                    BankPointsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(BankPointsActivity.this).setSelection(BankPointsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(BankPointsActivity.this).getText().toString().length());
                    ((InputMethodManager) BankPointsActivity.this.getSystemService("input_method")).showSoftInput(BankPointsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(BankPointsActivity.this), 1);
                }
            }, 500L);
            this.g.setText(getString(R.string.pay_with_bni_point));
            this.g.setTextBold();
        } else {
            int i7 = write + 49;
            INotificationSideChannelStubProxy = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 99 / 0;
                if (str.equals(BankType.MANDIRI)) {
                    string = getString(R.string.redeem_mandiri_title);
                    this.INotificationSideChannelDefault.setText(string);
                    this.onTransact.setImageResource(2131231595);
                    this.INotificationSideChannelStub.setText(getString(R.string.total_mandiri_fiestapoint, Utils.getFormattedAmount(this.notify.g)));
                    findViewById(R.id.container_redeemed_point).setVisibility(8);
                    findViewById(R.id.container_fiestapoin).setVisibility(0);
                    float f = this.notify.g;
                    this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault3(f);
                    DefaultTextView defaultTextView = (DefaultTextView) findViewById(R.id.text_fiestapoin_discount);
                    double d2 = f;
                    transactionDetails = this.notify.b().getTransaction().getTransactionDetails();
                    if (transactionDetails != null) {
                        int i9 = INotificationSideChannelStubProxy + 21;
                        write = i9 % 128;
                        int i10 = i9 % 2;
                        currency = transactionDetails.getCurrency();
                    } else {
                        currency = Currency.IDR;
                    }
                    defaultTextView.setText(onConnectionFailed.TuitionPaymentFragmentbindingInflater1(this, d2, currency));
                    this.g.setText(getString(R.string.pay_with_mandiri_point));
                    this.g.setTextBold();
                    this.asInterface.setVisibility(0);
                } else {
                    string = "";
                }
            } else if (!(!str.equals(BankType.MANDIRI))) {
                string = getString(R.string.redeem_mandiri_title);
                this.INotificationSideChannelDefault.setText(string);
                this.onTransact.setImageResource(2131231595);
                this.INotificationSideChannelStub.setText(getString(R.string.total_mandiri_fiestapoint, Utils.getFormattedAmount(this.notify.g)));
                findViewById(R.id.container_redeemed_point).setVisibility(8);
                findViewById(R.id.container_fiestapoin).setVisibility(0);
                float f2 = this.notify.g;
                this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault3(f2);
                DefaultTextView defaultTextView2 = (DefaultTextView) findViewById(R.id.text_fiestapoin_discount);
                double d3 = f2;
                transactionDetails = this.notify.b().getTransaction().getTransactionDetails();
                if (transactionDetails != null) {
                    int i11 = INotificationSideChannelStubProxy + 21;
                    write = i11 % 128;
                    int i12 = i11 % 2;
                    currency = transactionDetails.getCurrency();
                } else {
                    currency = Currency.IDR;
                }
                defaultTextView2.setText(onConnectionFailed.TuitionPaymentFragmentbindingInflater1(this, d3, currency));
                this.g.setText(getString(R.string.pay_with_mandiri_point));
                this.g.setTextBold();
                this.asInterface.setVisibility(0);
            } else {
                string = "";
            }
        }
        this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = string;
        cancel();
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrB$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int iMyTid = (Process.myTid() >> 22) + 1031;
            int iIndexOf = 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            Object[] objArr2 = new Object[1];
            m($$j[132], (byte) 52, (short) 141, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, iMyTid, iIndexOf, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        n(new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0}, new int[]{0, 22, 0, 21}, false, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        n(null, new int[]{22, 15, 62, 13}, true, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char size = (char) View.MeasureSpec.getSize(0);
            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 1032;
            int i2 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
            Object[] objArr5 = new Object[1];
            m($$j[132], (byte) 52, (short) 89, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(size, iIndexOf2, i2, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = INotificationSideChannelStubProxy + 7;
            write = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                int i5 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1030;
                int i6 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14;
                byte b = $$j[7];
                byte b2 = b;
                Object[] objArr6 = new Object[1];
                m(b, b2, (short) (b2 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, i5, i6, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i7 = ((int[]) objArr7[3])[0];
            int i8 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
            int i10 = ((((~((-67436577) | i9)) | 151653189) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 2145509696) + ((~((~i9) | (-67436577))) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1205726326;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            n(new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, new int[]{37, 16, 0, 0}, false, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            n(new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, new int[]{53, 16, 0, 0}, false, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1931362102};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46039 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1134 - Drawable.resolveOpacity(0, 0), 18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1205726326, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int size2 = 1031 - View.MeasureSpec.getSize(0);
                    int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0');
                    Object[] objArr12 = new Object[1];
                    m($$j[132], (byte) 52, (short) 141, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(threadPriority, size2, iLastIndexOf, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - Gravity.getAbsoluteGravity(0, 0)), View.getDefaultSize(0, 0) + 1117, TextUtils.lastIndexOf("", '0', 0) + 18), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1031;
                    int i13 = 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte b3 = $$j[7];
                    byte b4 = b3;
                    Object[] objArr13 = new Object[1];
                    m(b3, b4, (short) (b4 | 37), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(threadPriority2, iResolveOpacity, i13, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    n(new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0}, new int[]{0, 22, 0, 21}, false, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    n(null, new int[]{22, 15, 62, 13}, true, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int i14 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1031;
                        int iAxisFromString = 14 - MotionEvent.axisFromString("");
                        Object[] objArr16 = new Object[1];
                        m($$j[132], (byte) 52, (short) 89, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(trimmedLength, i14, iAxisFromString, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                        int iRgb = (-16776185) - Color.rgb(0, 0, 0);
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 16;
                        Object[] objArr17 = new Object[1];
                        m($$j[132], (byte) 52, (short) 141, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(pressedStateDuration, iRgb, iLastIndexOf2, 1357589585, false, (String) objArr17[0], null);
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[3])[0];
        if (i16 == i15) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i17 = ((int[]) objArr[2])[0];
            int i18 = ((int[]) objArr[3])[0];
            int i19 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i20 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i21 = (~((-584411148) | i20)) | 579862538;
            int i22 = i17 + (-659599367) + (i21 * 992) + ((i21 | (~((~i20) | (-335582369)))) * (-496)) + ((i20 | (-340130978)) * 496);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr18[2])[0] = i24 ^ (i24 << 5);
            int i25 = INotificationSideChannelStubProxy + 95;
            write = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = 5 / 4;
            }
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr[2])[0];
            int i28 = ((int[]) objArr[3])[0];
            int i29 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i30 = ~iIdentityHashCode;
            int i31 = i27 + (-1480553191) + (((~(i30 | 559960192)) | (~(315680022 | i30)) | (-871429527)) * 464) + (((-555749505) | iIdentityHashCode) * (-464)) + (((~(iIdentityHashCode | 559960192)) | (-871429527)) * 464);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr19[2])[0] = i33 ^ (i33 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 29945);
            int iArgb = 1755 - Color.argb(0, 0, 0, 0);
            int iGreen = Color.green(0) + 23;
            byte b5 = $$j[132];
            byte b6 = (byte) (b5 | 36);
            Object[] objArr20 = new Object[1];
            m(b5, b6, b6, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cLastIndexOf, iArgb, iGreen, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cLastIndexOf2 = (char) (29943 - TextUtils.lastIndexOf("", '0', 0, 0));
                int maxKeyCode = 1755 - (KeyEvent.getMaxKeyCode() >> 16);
                int packedPositionChild = 22 - ExpandableListView.getPackedPositionChild(0L);
                Object[] objArr21 = new Object[1];
                m($$j[132], (byte) 52, (short) 89, objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cLastIndexOf2, maxKeyCode, packedPositionChild, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrB$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_6).substring(0, 1).codePointAt(0) - 1769595790;
            int i34 = (((-1601139227) + (((~(195558969 | iCodePointAt)) | 17043456) * (-756))) + (((~iCodePointAt) | 195558969) * 756)) - 394631444;
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i36 ^ (i36 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            n(new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, new int[]{37, 16, 0, 0}, false, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            n(new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, new int[]{53, 16, 0, 0}, false, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {1931362102};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42050 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1726, (ViewConfiguration.getLongPressTimeout() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$5f1425da = ItemProgramChosenBinding.b$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -394631444);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 29945);
                int i37 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1754;
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 23;
                Object[] objArr26 = new Object[1];
                m($$j[132], (byte) 52, (short) 89, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf2, i37, scrollBarSize, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                n(new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0}, new int[]{0, 22, 0, 21}, false, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                n(null, new int[]{22, 15, 62, 13}, true, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c = (char) (29944 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 1756;
                    int modifierMetaStateMask = 22 - ((byte) KeyEvent.getModifierMetaStateMask());
                    byte[] bArr = $$j;
                    Object[] objArr29 = new Object[1];
                    m(bArr[132], (byte) 52, bArr[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c, packedPositionChild2, modifierMetaStateMask, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cIndexOf3 = (char) (29944 - TextUtils.indexOf("", "", 0, 0));
                    int threadPriority3 = ((Process.getThreadPriority(0) + 20) >> 6) + 1755;
                    int absoluteGravity = 23 - Gravity.getAbsoluteGravity(0, 0);
                    byte b7 = $$j[132];
                    byte b8 = (byte) (b7 | 36);
                    Object[] objArr30 = new Object[1];
                    m(b7, b8, b8, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf3, threadPriority3, absoluteGravity, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i38 = ((int[]) objArrB$5f1425da[1])[0];
        int i39 = ((int[]) objArrB$5f1425da[0])[0];
        if (i39 != i38) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrB$5f1425da[4];
            if (strArr5 != null) {
                for (String str2 : strArr5) {
                    arrayList2.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i39));
        }
        int i40 = write + 53;
        INotificationSideChannelStubProxy = i40 % 128;
        int i41 = i40 % 2;
        int i42 = ((int[]) objArrB$5f1425da[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrB$5f1425da[0])[0]}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step1).substring(0, 1).codePointAt(0) + 44105;
        int i43 = ~iCodePointAt2;
        int i44 = i42 + (-2031993723) + ((iCodePointAt2 | (-721425032)) * 140) + (((~((-721425032) | i43)) | 587202689) * (-280)) + (((~(iCodePointAt2 | (-587202690))) | (~(934027457 | i43)) | (-1068249800)) * 140);
        int i45 = (i44 << 13) ^ i44;
        int i46 = i45 ^ (i45 >>> 17);
        ((int[]) objArr31[3])[0] = i46 ^ (i46 << 5);
    }

    private static void n(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        char c;
        int length;
        char[] cArr2;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr3 = RemoteActionCompatParcelizer;
        if (cArr3 != null) {
            int i8 = $11 + 123;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr3[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i3;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.myTid() >> 22), (KeyEvent.getMaxKeyCode() >> 16) + 1270, Color.rgb(i3, i3, i3) + 16777234, 407021364, false, $$u(b, b2, (byte) (b2 + 5)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i9++;
                    i3 = 0;
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
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr3, i4, cArr4, 0, i5);
        if (bArr != null) {
            int i10 = $10 + 81;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr = new char[i5];
                setvideostabilizationmode.b = 1;
                c = 1;
            } else {
                cArr = new char[i5];
                setvideostabilizationmode.b = 0;
                c = 0;
            }
            while (setvideostabilizationmode.b < i5) {
                int i11 = $10 + 61;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i13 = $11 + 105;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 3225 - Color.alpha(0), View.getDefaultSize(0, 0) + 13, 2133916302, false, $$u(b3, b4, (byte) (b4 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    int i16 = $10 + 5;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                } else {
                    int i18 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (29944 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1755, Color.red(0) + 23, 387247676, false, $$u(b5, b5, (byte) $$m.length), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i18] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41240 - ((byte) KeyEvent.getModifierMetaStateMask())), 1705 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), KeyEvent.keyCodeFromString("") + 21, -1434471773, false, $$u(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            System.arraycopy(cArr4, 0, cArr5, 0, i5);
            int i19 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr4, i19, i7);
            System.arraycopy(cArr5, i7, cArr4, 0, i19);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            setvideostabilizationmode.b = i;
            while (setvideostabilizationmode.b < i5) {
                cArr6[setvideostabilizationmode.b] = cArr4[(i5 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
                int i20 = $10 + 71;
                $11 = i20 % 128;
                int i21 = i20 % 2;
            }
            cArr4 = cArr6;
        }
        if (i6 > 0) {
            int i22 = 0;
            loop3: while (true) {
                setvideostabilizationmode.b = i22;
                while (true) {
                    if (setvideostabilizationmode.b >= i5) {
                        break loop3;
                    }
                    int i23 = $10 + 75;
                    $11 = i23 % 128;
                    if (i23 % 2 == 0) {
                        cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[3]);
                        setvideostabilizationmode.b >>>= 1;
                    }
                }
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                i22 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = write + 67;
        INotificationSideChannelStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[1]).getInt(null);
            int iNextInt = new Random().nextInt(344868770);
            int i4 = ~iNextInt;
            if (i3 != 800950453 + (((~((-104918261) | i4)) | (~(iNextInt | (-934905804)))) * 333) + (((~(iNextInt | (-104918261))) | (~(i4 | (-934905804)))) * 333)) {
                throw null;
            }
        } else {
            int i5 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int iMyTid = Process.myTid();
            if (i5 != (-410628888) + (((~(1240970821 | iMyTid)) | 268962090) * 104) + ((~((~iMyTid) | (-1098949634))) * (-104)) + ((iMyTid | 410983278) * 104)) {
                throw null;
            }
        }
        int i6 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        if (i6 != 221489124 + (((~iUptimeMillis) | (-1429648707)) * 1444) + (((~(iUptimeMillis | 1935919439)) | (~(643136525 | iUptimeMillis)) | (-2004352336)) * (-1444)) + 1414214692) {
            throw new RuntimeException("-203495379");
        }
        super.onResume();
        int i7 = INotificationSideChannelStubProxy + 101;
        write = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 107;
        write = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) CameraUseCaseAdapter.b[1]).getInt(null);
            int i4 = ~new Random().nextInt(1458635505);
            if (i3 != ((468676926 + (((~((-1017357956) | i4)) | 1847345498) * (-933))) + (((~(i4 | 1847345498)) | (-2126505948)) * 933)) - 252041800) {
                throw null;
            }
        } else {
            int i5 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i5 != (-1173282520) + (((~(1136782815 | iIdentityHashCode)) | 306795272) * (-366)) + (((~(iIdentityHashCode | 1405747167)) | 37830920) * 366)) {
                throw null;
            }
        }
        int i6 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        int i8 = ~i7;
        if (i6 != (((~((-1763234973) | i8)) | (~(i7 | 815820992))) * 959) + 247149559 + (((~(i7 | (-1763234973))) | (~(i8 | 815820992))) * 959)) {
            int i9 = 564243342 % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i10 = write + 65;
        INotificationSideChannelStubProxy = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 5;
        write = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
        int i4 = INotificationSideChannelStubProxy + 115;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$u(short r6, int r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r0 = 1 - r6
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r8 = 105 - r8
            byte[] r1 = com.midtrans.sdk.uikit.views.creditcard.bankpoints.BankPointsActivity.$$m
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2d
        L17:
            r3 = r2
        L18:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2d:
            int r7 = r7 + 1
            int r8 = r8 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.creditcard.bankpoints.BankPointsActivity.$$u(short, int, byte):java.lang.String");
    }
}
