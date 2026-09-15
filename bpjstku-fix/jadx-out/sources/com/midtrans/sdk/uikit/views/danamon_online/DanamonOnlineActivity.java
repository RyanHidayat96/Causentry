package com.midtrans.sdk.uikit.views.danamon_online;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.bpjstku.R;
import com.midtrans.sdk.corekit.callback.TransactionCallback;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.core.PaymentType;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.abstracts.BaseActivity;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.ViewPortBuilder;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.createSecondaryCamera;
import defpackage.filterOutChildSizesCausingDoubleCropping;
import defpackage.getSupportedPostviewSize;
import defpackage.handleMessage;
import defpackage.initSession;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import defpackage.onConnectionFailed;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
public class DanamonOnlineActivity extends BasePaymentActivity implements filterOutChildSizesCausingDoubleCropping {
    private FancyButton asInterface;
    private createSecondaryCamera cancelAll;
    private final String d = "DanamonOnlineActivity";
    private AppCompatButton g;
    private LinearLayout onTransact;
    private static final byte[] $$m = {15, -9, 64, -81};
    private static final int $$n = 217;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {91, -17, 90, 37, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$k = 213;
    private static int INotificationSideChannelStubProxy = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static char[] cancel = {47379, 47388, 47367, 47311, 47377, 47375, 47382, 47338, 47364, 47370, 47369, 47384, 47376, 47380, 47385, 47349, 47381, 47354, 47374, 47371, 47386, 47378, 47373, 47339};
    private static int notify = 2047719613;
    private static boolean INotificationSideChannel = true;
    private static boolean INotificationSideChannelDefault = true;

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(DanamonOnlineActivity danamonOnlineActivity) {
        Drawable drawable;
        int i = 2 % 2;
        int i2 = ((BaseActivity) danamonOnlineActivity).b;
        if (i2 != 0) {
            int i3 = INotificationSideChannelStubProxy + 97;
            RemoteActionCompatParcelizer = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 7 / 0;
                if (danamonOnlineActivity.onTransact.getVisibility() == 0) {
                    int i5 = INotificationSideChannelStubProxy + 115;
                    RemoteActionCompatParcelizer = i5 % 128;
                    int i6 = i5 % 2;
                    drawable = ContextCompat.getDrawable(danamonOnlineActivity, 2131231195);
                    danamonOnlineActivity.onTransact.setVisibility(8);
                } else {
                    drawable = ContextCompat.getDrawable(danamonOnlineActivity, 2131231194);
                    danamonOnlineActivity.onTransact.setVisibility(0);
                }
            } else if (danamonOnlineActivity.onTransact.getVisibility() == 0) {
                int i7 = INotificationSideChannelStubProxy + 115;
                RemoteActionCompatParcelizer = i7 % 128;
                int i8 = i7 % 2;
                drawable = ContextCompat.getDrawable(danamonOnlineActivity, 2131231195);
                danamonOnlineActivity.onTransact.setVisibility(8);
            } else {
                drawable = ContextCompat.getDrawable(danamonOnlineActivity, 2131231194);
                danamonOnlineActivity.onTransact.setVisibility(0);
            }
            try {
                drawable.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
                danamonOnlineActivity.g.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            } catch (RuntimeException e2) {
                String str = danamonOnlineActivity.d;
                StringBuilder sb = new StringBuilder("changeToggleInstructionVisibility");
                sb.append(e2.getMessage());
                Logger.e(str, sb.toString());
            }
        }
    }

    public static /* synthetic */ createSecondaryCamera TuitionPaymentFragmentspecialinlinedviewModeldefault1(DanamonOnlineActivity danamonOnlineActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy;
        int i3 = i2 + 31;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        createSecondaryCamera createsecondarycamera = danamonOnlineActivity.cancelAll;
        int i5 = i2 + 79;
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return createsecondarycamera;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(DanamonOnlineActivity danamonOnlineActivity, String str) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 79;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        danamonOnlineActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
        int i4 = RemoteActionCompatParcelizer + 25;
        INotificationSideChannelStubProxy = i4 % 128;
        int i5 = i4 % 2;
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
    private static void m(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r0 = 53 - r8
            byte[] r1 = com.midtrans.sdk.uikit.views.danamon_online.DanamonOnlineActivity.$$j
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2b:
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            int r7 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.danamon_online.DanamonOnlineActivity.m(byte, int, int, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 91;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            setPrimaryBackgroundColor(this.asInterface);
            setTextColor(this.g);
        } else {
            setPrimaryBackgroundColor(this.asInterface);
            setTextColor(this.g);
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 113;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            this.asInterface = (FancyButton) findViewById(R.id.button_primary);
            this.g = (AppCompatButton) findViewById(R.id.instruction_toggle);
            this.onTransact = (LinearLayout) findViewById(R.id.container_instruction);
            throw null;
        }
        this.asInterface = (FancyButton) findViewById(R.id.button_primary);
        this.g = (AppCompatButton) findViewById(R.id.instruction_toggle);
        this.onTransact = (LinearLayout) findViewById(R.id.container_instruction);
        int i3 = RemoteActionCompatParcelizer + 25;
        INotificationSideChannelStubProxy = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        if (i != 210) {
            int i4 = INotificationSideChannelStubProxy + 85;
            RemoteActionCompatParcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                if (i != 109) {
                    return;
                }
            } else if (i != 111) {
                return;
            }
        }
        TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Intent intent2 = new Intent();
        intent2.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        setResult(-1, intent2);
        finish();
        int i5 = INotificationSideChannelStubProxy + 31;
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 15;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
            int i4 = RemoteActionCompatParcelizer + 55;
            INotificationSideChannelStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        int i4 = RemoteActionCompatParcelizer + 5;
        INotificationSideChannelStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void b(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 85;
        INotificationSideChannelStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            b();
            b(transactionResponse, PaymentType.DANAMON_ONLINE);
        } else {
            b();
            b(transactionResponse, PaymentType.DANAMON_ONLINE);
            int i3 = 35 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 85;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        int i6 = ~i5;
        if (i4 != (((~(1943992311 | i6)) | (~((-1107345768) | i5))) * 988) + 1991059716 + (((~(i5 | 1666634087)) | 277358224 | (~(i6 | (-1107345768)))) * 988)) {
            int[] iArr = new int[1975347752];
            iArr[1975347751] = 1;
            int i7 = 89635864 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i8 = RemoteActionCompatParcelizer + 75;
            INotificationSideChannelStubProxy = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        if (i10 != 1454875858 + (((~((-441062062) | iElapsedRealtime)) | (~(2137993903 | iElapsedRealtime))) * 69) + (((~(iElapsedRealtime | 2137993903)) | (~((-441062062) | iElapsedRealtime))) * (-69)) + 1124180106) {
            throw null;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_danamon_online);
        this.cancelAll = new createSecondaryCamera(this);
        this.asInterface.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.danamon_online.DanamonOnlineActivity.1
            private static final byte[] $$d = {106, -66, 28, 119, -17, -3, 58, -62, -13, -5, 3, -10, 2, 50, -56, -18, 5, -19, -2, 1, 0, 49, -68, 7, -24, 10, -18, 4, 3, -16, 57, -58, -17, -2, -8, -8, 63, -76, -4, 6, -8, -2, -16, 6, -1, -19, 64, -40, -41, 15, -18, -11, 6, -22, 16, -18, 22, -35, 76, -36, -52, 8, -1, -24, 10, 30, -50, -14, 14, -19, 28, -24, -19, -7, 4, -13};
            private static final int $$e = 34;
            private static final byte[] $$a = {2, -84, 82, -15, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
            private static final int $$b = 40;

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r5, short r6, short r7, java.lang.Object[] r8) {
                /*
                    int r6 = r6 * 52
                    int r6 = 55 - r6
                    byte[] r0 = com.midtrans.sdk.uikit.views.danamon_online.DanamonOnlineActivity.AnonymousClass1.$$a
                    int r5 = r5 * 14
                    int r5 = r5 + 84
                    int r1 = 53 - r7
                    byte[] r1 = new byte[r1]
                    int r7 = 52 - r7
                    r2 = 0
                    if (r0 != 0) goto L16
                    r4 = r7
                    r3 = r2
                    goto L2a
                L16:
                    r3 = r2
                L17:
                    int r6 = r6 + 1
                    byte r4 = (byte) r5
                    r1[r3] = r4
                    if (r3 != r7) goto L26
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L26:
                    int r3 = r3 + 1
                    r4 = r0[r6]
                L2a:
                    int r4 = -r4
                    int r5 = r5 + r4
                    int r5 = r5 + (-10)
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.danamon_online.DanamonOnlineActivity.AnonymousClass1.a(int, short, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void b(int r6, short r7, short r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = com.midtrans.sdk.uikit.views.danamon_online.DanamonOnlineActivity.AnonymousClass1.$$d
                    int r7 = r7 * 72
                    int r7 = 76 - r7
                    int r6 = r6 * 72
                    int r1 = r6 + 1
                    int r8 = 99 - r8
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r8
                    r4 = r2
                    r8 = r7
                    goto L2a
                L15:
                    r3 = r2
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L19:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L28
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L28:
                    r3 = r0[r8]
                L2a:
                    int r3 = -r3
                    int r7 = r7 + r3
                    int r8 = r8 + 1
                    int r7 = r7 + (-5)
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.danamon_online.DanamonOnlineActivity.AnonymousClass1.b(int, short, short, java.lang.Object[]):void");
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr;
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    DanamonOnlineActivity danamonOnlineActivity = DanamonOnlineActivity.this;
                    DanamonOnlineActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(danamonOnlineActivity, danamonOnlineActivity.getString(R.string.processing_payment));
                    createSecondaryCamera createsecondarycameraTuitionPaymentFragmentspecialinlinedviewModeldefault1 = DanamonOnlineActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DanamonOnlineActivity.this);
                    String authenticationToken = createsecondarycameraTuitionPaymentFragmentspecialinlinedviewModeldefault1.b().readAuthenticationToken();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31532);
                        int gidForName = Process.getGidForName("") + 922;
                        int i11 = 28 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte b = $$a[7];
                        Object[] objArr2 = new Object[1];
                        a(b, b, (byte) 52, objArr2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, gidForName, i11, -1048449946, false, (String) objArr2[0], null);
                    }
                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                    long jLongValue = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cRgb = (char) ((-16745683) - Color.rgb(0, 0, 0));
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 921;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29;
                        byte[] bArr = $$a;
                        byte b2 = bArr[80];
                        Object[] objArr3 = new Object[1];
                        a(b2, bArr[7], b2, objArr3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, minimumFlingVelocity, iIndexOf, -778300370, false, (String) objArr3[0], null);
                    }
                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 31533);
                            int scrollDefaultDelay = 921 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 29;
                            byte[] bArr2 = $$a;
                            byte b3 = bArr2[80];
                            Object[] objArr4 = new Object[1];
                            a(b3, b3, (byte) (-bArr2[3]), objArr4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(edgeSlop, scrollDefaultDelay, modifierMetaStateMask, -1142834547, false, (String) objArr4[0], null);
                        }
                        Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                        objArr = new Object[]{new int[1], new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[]{((int[]) objArr5[3])[0]}, (String[]) objArr5[4]};
                        int iIdentityHashCode = System.identityHashCode(this);
                        int i12 = ~iIdentityHashCode;
                        int i13 = (~((-797339106) | i12)) | 92278081 | (~(976740538 | i12));
                        int i14 = (-993550723) + (((~(iIdentityHashCode | (-271679515))) | i13) * 590) + (i13 * (-1180)) + (((~((-976740539) | i12)) | (~(i12 | 797339105))) * 590) + 587127082;
                        int i15 = (i14 << 13) ^ i14;
                        int i16 = i15 ^ (i15 >>> 17);
                        ((int[]) objArr[0])[0] = i16 ^ (i16 << 5);
                    } else {
                        Context applicationContext = (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
                        if (applicationContext != null) {
                            applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                        }
                        try {
                            Object[] objArr6 = {applicationContext, Integer.valueOf(((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, createsecondarycameraTuitionPaymentFragmentspecialinlinedviewModeldefault1)).intValue()), 0, 587127082};
                            byte[] bArr3 = $$d;
                            byte b4 = bArr3[19];
                            Object[] objArr7 = new Object[1];
                            b(b4, b4, bArr3[20], objArr7);
                            Class<?> cls = Class.forName((String) objArr7[0]);
                            byte b5 = bArr3[20];
                            Object[] objArr8 = new Object[1];
                            b(b5, b5, bArr3[19], objArr8);
                            Object[] objArr9 = (Object[]) cls.getMethod((String) objArr8[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char maximumFlingVelocity = (char) (31533 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                int i17 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 920;
                                int i18 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 28;
                                byte[] bArr4 = $$a;
                                byte b6 = bArr4[80];
                                Object[] objArr10 = new Object[1];
                                a(b6, b6, (byte) (-bArr4[3]), objArr10);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumFlingVelocity, i17, i18, -1142834547, false, (String) objArr10[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr9);
                            try {
                                long jLongValue2 = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char c2 = (char) (31534 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                    int iIndexOf2 = TextUtils.indexOf("", "") + 921;
                                    int iIndexOf3 = 27 - TextUtils.indexOf((CharSequence) "", '0');
                                    byte[] bArr5 = $$a;
                                    byte b7 = bArr5[80];
                                    Object[] objArr11 = new Object[1];
                                    a(b7, bArr5[7], b7, objArr11);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iIndexOf2, iIndexOf3, -778300370, false, (String) objArr11[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char cAlpha = (char) (31533 - Color.alpha(0));
                                    int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 921;
                                    int i19 = 28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    byte b8 = $$a[7];
                                    Object[] objArr12 = new Object[1];
                                    a(b8, b8, (byte) 52, objArr12);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAlpha, maximumFlingVelocity2, i19, -1048449946, false, (String) objArr12[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                objArr = objArr9;
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
                    int i20 = ((int[]) objArr[1])[0];
                    int i21 = ((int[]) objArr[3])[0];
                    if (i21 != i20) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr[4];
                        if (strArr != null) {
                            for (String str : strArr) {
                                arrayList.add(str);
                            }
                        }
                        throw new RuntimeException(String.valueOf(i21));
                    }
                    int i22 = ((int[]) objArr[0])[0];
                    Object[] objArr13 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                    int i23 = i22 + 276401003 + (((~((-12607821) | (~iFreeMemory))) | (~(1761471823 | iFreeMemory))) * (-272)) + (((~((-150036813) | iFreeMemory)) | 137428992) * (-272)) + (((~(iFreeMemory | 150036812)) | 1624042831) * 272);
                    int i24 = (i23 << 13) ^ i23;
                    int i25 = i24 ^ (i24 >>> 17);
                    ((int[]) objArr13[0])[0] = i25 ^ (i25 << 5);
                    createsecondarycameraTuitionPaymentFragmentspecialinlinedviewModeldefault1.b().paymentUsingDanamonOnline(authenticationToken, new TransactionCallback() { // from class: createSecondaryCamera.4
                        public AnonymousClass4() {
                        }

                        @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                        public final void onError(Throwable th2) {
                            ((filterOutChildSizesCausingDoubleCropping) createSecondaryCamera.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th2);
                        }

                        @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                        public final void onFailure(TransactionResponse transactionResponse, String str2) {
                            createSecondaryCamera.this.b = transactionResponse;
                            ((filterOutChildSizesCausingDoubleCropping) createSecondaryCamera.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
                        }

                        @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                        public final void onSuccess(TransactionResponse transactionResponse) {
                            createSecondaryCamera.this.b = transactionResponse;
                            ((filterOutChildSizesCausingDoubleCropping) createSecondaryCamera.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
                        }
                    });
                    ViewPortBuilder.b();
                } catch (Throwable th2) {
                    ViewPortBuilder.b();
                    throw th2;
                }
            }
        });
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.danamon_online.DanamonOnlineActivity.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    DanamonOnlineActivity.TuitionPaymentFragmentbindingInflater1(DanamonOnlineActivity.this);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        b(getString(R.string.payment_method_danamon_online));
        this.asInterface.setText(getString(R.string.confirm_payment));
        this.asInterface.setTextBold();
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char gidForName = (char) (Process.getGidForName("") + 29945);
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1755;
            int iKeyCodeFromString = 23 - KeyEvent.keyCodeFromString("");
            byte[] bArr = $$j;
            byte b = bArr[28];
            short s = bArr[7];
            Object[] objArr2 = new Object[1];
            m(b, s, (byte) (s | 15), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName, jumpTapTimeout, iKeyCodeFromString, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cMyPid = (char) ((Process.myPid() >> 22) + 29944);
                int keyRepeatDelay = 1755 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int iMakeMeasureSpec = 23 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte[] bArr2 = $$j;
                Object[] objArr3 = new Object[1];
                m(bArr2[28], bArr2[3], bArr2[7], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, keyRepeatDelay, iMakeMeasureSpec, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i3 = ~i2;
            int i4 = 776129891 + (((~((-266373729) | i3)) | (-53771303)) * (-602)) + (((~(i2 | (-266373729))) | 213942848 | (~((-1340423) | i3))) * (-301)) + ((~(i3 | (-53771303))) * 301) + 351595490;
            int i5 = i4 ^ (i4 << 13);
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            n(128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), null, null, new byte[]{-115, -116, -117, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 116, null, null, new byte[]{-116, -113, -109, -110, -111, -118, -126, -112, -119, -117, -114, -117, -122, -116, -113, -114}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {461848545};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - (ViewConfiguration.getScrollBarSize() >> 8)), 1726 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 351595490, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 29945);
                    int absoluteGravity = 1755 - Gravity.getAbsoluteGravity(0, 0);
                    int i7 = 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte[] bArr3 = $$j;
                    Object[] objArr8 = new Object[1];
                    m(bArr3[28], bArr3[3], bArr3[7], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel, absoluteGravity, i7, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.see_instruction).substring(1, 2).length() + 126, null, null, new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    n(Color.green(0) + 127, null, null, new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char maximumFlingVelocity = (char) (29944 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1755;
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 23;
                        byte[] bArr4 = $$j;
                        byte b2 = bArr4[28];
                        Object[] objArr11 = new Object[1];
                        m(b2, (short) (b2 | 88), bArr4[7], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity, touchSlop, iResolveSizeAndState, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                        int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1755;
                        int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        byte[] bArr5 = $$j;
                        byte b3 = bArr5[28];
                        short s2 = bArr5[7];
                        Object[] objArr12 = new Object[1];
                        m(b3, s2, (byte) (s2 | 15), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration, keyRepeatDelay2, iIndexOf, 986134021, false, (String) objArr12[0], null);
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
        int i8 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i9 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i9 == i8) {
            int i10 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int i11 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i12 = i10 + 1152931347 + (((~(i11 | 209953135)) | 2649290) * 191) + (((~((~i11) | 209953135)) | 2641024) * 191);
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr13[3])[0] = i14 ^ (i14 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr != null) {
                int i15 = RemoteActionCompatParcelizer + 5;
                INotificationSideChannelStubProxy = i15 % 128;
                int i16 = i15 % 2 != 0 ? 1 : 0;
                while (i16 < strArr.length) {
                    arrayList.add(strArr[i16]);
                    i16++;
                    int i17 = RemoteActionCompatParcelizer + 47;
                    INotificationSideChannelStubProxy = i17 % 128;
                    if (i17 % 2 != 0) {
                        int i18 = 4 % 2;
                    }
                }
            }
            int[] iArr = new int[i9];
            int i19 = i9 - 1;
            iArr[i19] = 1;
            Toast.makeText((Context) null, iArr[((i9 * i19) % 2) - 1], 1).show();
            int i20 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int i21 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i22 = ~(861806559 | i21);
            int i23 = i20 + 327252565 + ((537005585 | i22) * (-476)) + (i22 * 952) + ((~((~i21) | 861806559)) * 476);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr14[3])[0] = i25 ^ (i25 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1031;
            int windowTouchSlop = 15 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            byte[] bArr6 = $$j;
            byte b4 = bArr6[28];
            Object[] objArr15 = new Object[1];
            m(b4, (short) (b4 | 140), bArr6[7], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(mirror, iCombineMeasuredStates, windowTouchSlop, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 81, null, null, new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 116, null, null, new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char mirror2 = (char) (AndroidCharacter.getMirror('0') - '0');
            int iIndexOf2 = 1031 - TextUtils.indexOf("", "");
            int fadingEdgeLength = 15 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            byte[] bArr7 = $$j;
            Object[] objArr18 = new Object[1];
            m(bArr7[28], bArr7[3], bArr7[7], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(mirror2, iIndexOf2, fadingEdgeLength, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                int i26 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int mode = 15 - View.MeasureSpec.getMode(0);
                byte b5 = $$j[7];
                Object[] objArr19 = new Object[1];
                m(b5, (short) (b5 | 193), (byte) 52, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(packedPositionType, i26, mode, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr20[3])[0];
            int i28 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iMyPid = Process.myPid();
            int i29 = ~iMyPid;
            int i30 = (-98567639) + ((i29 | 2049) * (-192)) + (((~(25304327 | i29)) | 269582448) * (-384)) + (((~(iMyPid | (-25302279))) | (~(i29 | 294886775)) | (~((-269582449) | iMyPid))) * DerHeader.TAG_CLASS_PRIVATE) + 172606322;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr[2])[0] = i32 ^ (i32 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            n(TextUtils.getOffsetBefore("", 0) + 127, null, null, new byte[]{-115, -116, -117, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            n((ViewConfiguration.getWindowTouchSlop() >> 8) + 127, null, null, new byte[]{-116, -113, -109, -110, -111, -118, -126, -112, -119, -117, -114, -117, -122, -116, -113, -114}, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {461848545};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46037 - ((byte) KeyEvent.getModifierMetaStateMask())), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1133, 17 - MotionEvent.axisFromString(""), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 172606322, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1031;
                int offsetBefore = 15 - TextUtils.getOffsetBefore("", 0);
                byte[] bArr8 = $$j;
                byte b6 = bArr8[28];
                Object[] objArr25 = new Object[1];
                m(b6, (short) (b6 | 140), bArr8[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c, packedPositionGroup, offsetBefore, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 1117, (KeyEvent.getMaxKeyCode() >> 16) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                int i33 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1031;
                int mirror3 = '?' - AndroidCharacter.getMirror('0');
                byte b7 = $$j[7];
                Object[] objArr26 = new Object[1];
                m(b7, (short) (b7 | 193), (byte) 52, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cAxisFromString, i33, mirror3, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_kioson).substring(1, 3).length() + 125, null, null, new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_4).substring(1, 2).length() + 126, null, null, new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                    int mirror4 = 1079 - AndroidCharacter.getMirror('0');
                    int i34 = 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte[] bArr9 = $$j;
                    Object[] objArr29 = new Object[1];
                    m(bArr9[28], bArr9[3], bArr9[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(edgeSlop, mirror4, i34, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int iRgb = Color.rgb(0, 0, 0) + 16778247;
                    int i35 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                    byte[] bArr10 = $$j;
                    byte b8 = bArr10[28];
                    Object[] objArr30 = new Object[1];
                    m(b8, (short) (b8 | 140), bArr10[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(windowTouchSlop2, iRgb, i35, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    int i36 = INotificationSideChannelStubProxy + 97;
                    RemoteActionCompatParcelizer = i36 % 128;
                    int i37 = i36 % 2;
                    arrayList2.add(str);
                }
            }
            throw null;
        }
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i38 = ((int[]) objArr[2])[0];
        int i39 = ((int[]) objArr[3])[0];
        int i40 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int i41 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 510283593;
        int i42 = i38 + ((((~(99223397 | i41)) | (-294876587)) * 398) - 1175169903) + (((~((~i41) | 99223397)) | (-294876587)) * 398);
        int i43 = (i42 << 13) ^ i42;
        int i44 = i43 ^ (i43 >>> 17);
        ((int[]) objArr31[2])[0] = i44 ^ (i44 << 5);
    }

    private static void n(int i, char[] cArr, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = cancel;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - (KeyEvent.getMaxKeyCode() >> 16)), AndroidCharacter.getMirror('0') + 2946, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17, 1182129903, false, $$u(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr4[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(notify)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.green(0) + 43325), ExpandableListView.getPackedPositionGroup(0L) + 253, 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            int i4 = 33602;
            int i5 = 1687675375;
            if (!INotificationSideChannelDefault) {
                if (!INotificationSideChannel) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                    char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    int i6 = $10 + 61;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.red(0) + i4), 3085 - View.MeasureSpec.getSize(0), 26 - Color.argb(0, 0, 0, 0), -2146875848, false, $$u(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    i4 = 33602;
                    i5 = 1687675375;
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i8 = $10 + 45;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            } else {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            }
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i9 = $10 + 15;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 33602), 3085 - View.combineMeasuredStates(0, 0), TextUtils.getOffsetBefore("", 0) + 26, -2146875848, false, $$u(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2);
            int i11 = $10 + 9;
            $11 = i11 % 128;
            if (i11 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00e3, code lost:
    
        if (r1 != (((((~(r3 | 1793563370)) | ((~((-785492595) | r3)) | 68165648)) * (-397)) + 514957940) + ((r2 | 1144402072) * 397))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00e5, code lost:
    
        super.onResume();
        r1 = com.midtrans.sdk.uikit.views.danamon_online.DanamonOnlineActivity.RemoteActionCompatParcelizer + 11;
        com.midtrans.sdk.uikit.views.danamon_online.DanamonOnlineActivity.INotificationSideChannelStubProxy = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f9, code lost:
    
        throw new java.lang.RuntimeException("-299364735");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00fa, code lost:
    
        r1 = (-1972848782) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0103, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0045, code lost:
    
        if (r1 == ((((-511209720) + (((~(r7 | 904386031)) | ((~(1734373574 | r7)) | (-2011690480))) * 464)) + (((-277316906) | r6) * (-464))) + (((~(r6 | 904386031)) | (-2011690480)) * 464))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x009d, code lost:
    
        if (r1 == (((225368852 + (((~(835586017 | r7)) | (~((-831128290) | r6))) * (-831))) + ((~(836726763 | r6)) * (-1662))) + (((~(r6 | (-835586018))) | ((~(r7 | (-5598475))) | (~(5598474 | r6)))) * 831))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009f, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        r3 = ~r2;
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.danamon_online.DanamonOnlineActivity.onResume():void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 71;
        INotificationSideChannelStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~(601489842 | iIdentityHashCode);
            if (i3 != 687808966 + (((-2010815932) | i4) * (-814)) + ((i4 | (~((~iIdentityHashCode) | 1431477385)) | 22151296) * 407) + (((~(iIdentityHashCode | (-1431477386))) | (~((-601489843) | iIdentityHashCode)) | 22151296) * 407)) {
                throw null;
            }
        } else {
            int i5 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            int i7 = ~i6;
            if (i5 != 2142254032 + (((-1208098018) | i7) * (-369)) + (((~((-382575135) | i7)) | (-1212562678)) * (-369)) + (((~(i6 | 382575134)) | (-1590673152) | (~(i7 | (-4464661)))) * 369)) {
                throw null;
            }
        }
        int i8 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
        if (i8 != (-683167236) + (((~(414852897 | i9)) | 1728102596 | (~((-2130764229) | i9))) * (-744)) + (((~i9) | 12191265) * 744) + ((i9 | (-1728102597)) * 744)) {
            int i10 = 1073854468 % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i11 = INotificationSideChannelStubProxy + 117;
        RemoteActionCompatParcelizer = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 51 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 23;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = INotificationSideChannelStubProxy + 53;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$u(int r5, short r6, short r7) {
        /*
            int r7 = r7 * 4
            int r0 = 1 - r7
            byte[] r1 = com.midtrans.sdk.uikit.views.danamon_online.DanamonOnlineActivity.$$m
            int r5 = r5 * 2
            int r5 = 3 - r5
            int r6 = 68 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r5 = r5 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r1[r5]
        L28:
            int r4 = -r4
            int r6 = r6 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.danamon_online.DanamonOnlineActivity.$$u(int, short, short):java.lang.String");
    }
}
