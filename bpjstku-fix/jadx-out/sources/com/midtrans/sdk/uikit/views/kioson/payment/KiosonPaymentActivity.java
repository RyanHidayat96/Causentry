package com.midtrans.sdk.uikit.views.kioson.payment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
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
import androidx.compose.runtime.ComposerKt;
import com.bpjstku.R;
import com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda7;
import com.midtrans.sdk.corekit.callback.TransactionCallback;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.views.kioson.status.KiosonStatusActivity;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.CameraUseCaseAdapter;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.ViewPortBuilder;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.filterOutChildSizesCausingDoubleCropping;
import defpackage.getConfigs;
import defpackage.getSharingInputEdge;
import defpackage.handleMessage;
import defpackage.initSession;
import defpackage.onConnectionFailed;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public class KiosonPaymentActivity extends BasePaymentActivity implements filterOutChildSizesCausingDoubleCropping {
    private static short[] RemoteActionCompatParcelizer;
    private getSharingInputEdge INotificationSideChannel;
    private FancyButton d;
    private static final byte[] $$m = {ByteCompanionObject.MAX_VALUE, 43, -39, -37};
    private static final int $$n = 12;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {97, 58, 103, -72, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$k = 85;
    private static int getInterfaceDescriptor = 0;
    private static int INotificationSideChannelStub = 1;
    private static int onTransact = 1134842930;
    private static int cancelAll = -1934795625;
    private static int cancel = -2079751676;
    private static byte[] notify = {33, -91, 52, 14, -61, 33, -90, 54, -33, 19, 18, -100, 53, 118, -17, -36, -33, -38, 43, -93, 42, 70, 42, 125, 54, 55, 66, 95, 80, 67, 124, 47, 51, 125, 43, 84, -65, 79, -122, 98, 99, -123, -121, 75, -77, 122, -117, -87, 83, -75, -120, 100, -83, 114, 100, -69, -80, 78, -108, -126, 100, -105, ByteCompanionObject.MIN_VALUE, -120, -110, -26, -26, -26, -26};
    private final String g = "Kioson Overview";
    private final String asInterface = "Confirm Payment Kioson";

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(KiosonPaymentActivity kiosonPaymentActivity, String str) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 105;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        kiosonPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        int i5 = INotificationSideChannelStub + 49;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 4 / 0;
        }
    }

    public static /* synthetic */ getSharingInputEdge TuitionPaymentFragmentspecialinlinedviewModeldefault3(KiosonPaymentActivity kiosonPaymentActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 49;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        getSharingInputEdge getsharinginputedge = kiosonPaymentActivity.INotificationSideChannel;
        if (i3 == 0) {
            return getsharinginputedge;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(byte r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.views.kioson.payment.KiosonPaymentActivity.$$j
            int r6 = r6 + 4
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r5
            goto L27
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            r3 = r0[r6]
        L27:
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.kioson.payment.KiosonPaymentActivity.m(byte, short, byte, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 99;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        setPrimaryBackgroundColor(this.d);
        int i4 = INotificationSideChannelStub + 45;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 17;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            this.d = (FancyButton) findViewById(R.id.button_primary);
            throw null;
        }
        this.d = (FancyButton) findViewById(R.id.button_primary);
        int i3 = getInterfaceDescriptor + 43;
        INotificationSideChannelStub = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        if (i == 210) {
            TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Intent intent2 = new Intent();
            intent2.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            setResult(-1, intent2);
            finish();
            int i4 = getInterfaceDescriptor + 63;
            INotificationSideChannelStub = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = getInterfaceDescriptor + 121;
        INotificationSideChannelStub = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        getSharingInputEdge getsharinginputedge = this.INotificationSideChannel;
        if (getsharinginputedge != null) {
            int i2 = getInterfaceDescriptor + 123;
            INotificationSideChannelStub = i2 % 128;
            int i3 = i2 % 2;
            getsharinginputedge.TuitionPaymentFragmentbindingInflater1("Back", "Kioson Overview");
            int i4 = getInterfaceDescriptor + 1;
            INotificationSideChannelStub = i4 % 128;
            int i5 = i4 % 2;
        }
        super.onBackPressed();
        int i6 = getInterfaceDescriptor + 81;
        INotificationSideChannelStub = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 == 0) {
            b();
            boolean z = this.TuitionPaymentFragmentbindingInflater1;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
            int i3 = getInterfaceDescriptor + 51;
            INotificationSideChannelStub = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 25;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 != 0) {
            b();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        } else {
            b();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
        int i6 = ~i5;
        int i7 = (-1829464504) + (((~((-111211664) | i6)) | 111177865 | (~(941199206 | i6)) | (~((-941165409) | i5))) * (-84));
        int i8 = (~(i5 | 941199206)) | 111211663;
        int i9 = ~(i6 | (-941199207));
        if (i4 != i7 + ((i8 | i9) * (-84)) + ((941165408 | i9) * 84)) {
            int i10 = (-289263016) % 2;
            throw new ArithmeticException();
        }
        int i11 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i12 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
        if (i11 != (-1082856870) + (((~(i12 | 606164203)) | (-1974990076)) * 305) + (((~((~i12) | 606164203)) | (-1972891762)) * 305)) {
            throw null;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_kioson_payment);
        this.INotificationSideChannel = new getSharingInputEdge(this);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.kioson.payment.KiosonPaymentActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    KiosonPaymentActivity kiosonPaymentActivity = KiosonPaymentActivity.this;
                    KiosonPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(kiosonPaymentActivity, kiosonPaymentActivity.getString(R.string.processing_payment));
                    KiosonPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(KiosonPaymentActivity.this).TuitionPaymentFragmentbindingInflater1("Confirm Payment Kioson", "Kioson Overview");
                    getSharingInputEdge getsharinginputedgeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = KiosonPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(KiosonPaymentActivity.this);
                    getsharinginputedgeTuitionPaymentFragmentspecialinlinedviewModeldefault3.b().paymentUsingKiosan(getsharinginputedgeTuitionPaymentFragmentspecialinlinedviewModeldefault3.b().readAuthenticationToken(), new TransactionCallback() { // from class: getSharingInputEdge.5
                        public AnonymousClass5() {
                        }

                        @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                        public final void onError(Throwable th) {
                            ((filterOutChildSizesCausingDoubleCropping) getSharingInputEdge.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
                        }

                        @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                        public final void onFailure(TransactionResponse transactionResponse, String str) {
                            getSharingInputEdge.this.b = transactionResponse;
                            ((filterOutChildSizesCausingDoubleCropping) getSharingInputEdge.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
                        }

                        @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                        public final void onSuccess(TransactionResponse transactionResponse) {
                            getSharingInputEdge.this.b = transactionResponse;
                            ((filterOutChildSizesCausingDoubleCropping) getSharingInputEdge.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
                        }
                    });
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        b(getString(R.string.payment_method_kioson));
        this.d.setText(getString(R.string.confirm_payment));
        this.d.setTextBold();
        this.INotificationSideChannel.b("Kioson Overview", getIntent().getBooleanExtra("First Page", true));
        int i13 = INotificationSideChannelStub + 31;
        getInterfaceDescriptor = i13 % 128;
        int i14 = i13 % 2;
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void b(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 25;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            Intent intent = new Intent(this, (Class<?>) KiosonStatusActivity.class);
            intent.putExtra("extra.status", transactionResponse);
            startActivityForResult(intent, 210);
            int i4 = getInterfaceDescriptor + 55;
            INotificationSideChannelStub = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Intent intent2 = new Intent();
        intent2.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        setResult(-1, intent2);
        finish();
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrB$5f1425da;
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 5;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1031;
            int i4 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15;
            byte[] bArr = $$j;
            Object[] objArr2 = new Object[1];
            m((byte) 52, bArr[5], bArr[132], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSize, absoluteGravity, i4, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        n(821491500 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (-145022690) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_mobile_instruction_5).substring(6, 7).codePointAt(0), (short) (Color.argb(0, 0, 0, 0) - 7), (-91) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 92), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 821491405, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 145022600, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 91), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 98, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step9).substring(20, 21).codePointAt(0) - 226), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
            int i5 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 15;
            byte b = (byte) 52;
            Object[] objArr5 = new Object[1];
            m(b, (short) (b - 1), $$j[132], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionGroup, i5, absoluteGravity2, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = getInterfaceDescriptor + 45;
            INotificationSideChannelStub = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                int i8 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1030;
                int iAxisFromString = 14 - MotionEvent.axisFromString("");
                byte[] bArr2 = $$j;
                byte b2 = bArr2[7];
                Object[] objArr6 = new Object[1];
                m(b2, bArr2[2], b2, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetBefore, i8, iAxisFromString, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i9 = ((int[]) objArr7[3])[0];
            int i10 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i11 = (((-1330492805) + (((~((~iIdentityHashCode) | 713518964)) | 286298250) * 446)) + (((~(iIdentityHashCode | 999817214)) | 671500884) * 446)) - 2104088552;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[2])[0] = i13 ^ (i13 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            n(821491536 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_internal_detection_error_detected_image_is_null).substring(0, 24).codePointAt(11) - 145022700, (short) ((-4) - MotionEvent.axisFromString("")), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_save_card).substring(0, 1).codePointAt(0) - 180, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_user_canceled_liveness).substring(3, 4).length() - 90), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            n((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 821491549, TextUtils.getOffsetBefore("", 0) - 145022585, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + ComposerKt.defaultsKey), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 108, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 41), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {243439457};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 46038), 1134 - View.resolveSizeAndState(0, 0, 0), 18 - View.resolveSize(0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -944089172, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1031;
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
                    byte[] bArr3 = $$j;
                    Object[] objArr12 = new Object[1];
                    m((byte) 52, bArr3[5], bArr3[132], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, windowTouchSlop, minimumFlingVelocity, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf("", "", 0) + 45993), ((byte) KeyEvent.getModifierMetaStateMask()) + 1118, 17 - View.MeasureSpec.getSize(0)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                    int tapTimeout = 1031 - (ViewConfiguration.getTapTimeout() >> 16);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15;
                    byte[] bArr4 = $$j;
                    byte b3 = bArr4[7];
                    Object[] objArr13 = new Object[1];
                    m(b3, bArr4[2], b3, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetAfter, tapTimeout, maximumFlingVelocity, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 821491489, 8623 - AndroidCharacter.getMirror('0'), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 43), (-91) - TextUtils.getOffsetBefore("", 0), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 55), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 821491410, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_confirm_button).substring(1, 3).length() - 145022591, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 91), AndroidCharacter.getMirror('0') - 146, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.btn_cancel).substring(1, 2).codePointAt(0) - 208), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                        int iRgb = (-16776185) - Color.rgb(0, 0, 0);
                        int jumpTapTimeout = 15 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        byte b4 = (byte) 52;
                        Object[] objArr16 = new Object[1];
                        m(b4, (short) (b4 - 1), $$j[132], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(modifierMetaStateMask, iRgb, jumpTapTimeout, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int gidForName = 1030 - Process.getGidForName("");
                        int defaultSize = View.getDefaultSize(0, 0) + 15;
                        byte[] bArr5 = $$j;
                        Object[] objArr17 = new Object[1];
                        m((byte) 52, bArr5[5], bArr5[132], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(trimmedLength, gidForName, defaultSize, 1357589585, false, (String) objArr17[0], null);
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 == i14) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[3])[0];
            int i18 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i19 = ~((-798492150) | (~iIdentityHashCode2));
            int i20 = i16 + (((-798531584) | i19 | (~(798492149 | iIdentityHashCode2))) * (-338)) + 923544425 + (((~(iIdentityHashCode2 | (-39435))) | i19) * 338);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr18[2])[0] = i22 ^ (i22 << 5);
            int i23 = getInterfaceDescriptor + 77;
            INotificationSideChannelStub = i23 % 128;
            if (i23 % 2 == 0) {
                int i24 = 5 / 5;
            }
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i15];
            int i25 = i15 - 1;
            iArr[i25] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i25) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[3])[0];
            int i28 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i29 = i26 + 1735288292 + (((~(iIdentityHashCode3 | 1061622999)) | 11577640) * 305) + (((~((~iIdentityHashCode3) | 1061622999)) | 817342829) * 305);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr19[2])[0] = i31 ^ (i31 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c2 = (char) (29944 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
            int modifierMetaStateMask2 = 1754 - ((byte) KeyEvent.getModifierMetaStateMask());
            int i32 = 23 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte[] bArr6 = $$j;
            Object[] objArr20 = new Object[1];
            m((byte) 37, bArr6[2], bArr6[132], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, modifierMetaStateMask2, i32, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i33 = INotificationSideChannelStub + 71;
            getInterfaceDescriptor = i33 % 128;
            int i34 = i33 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cNormalizeMetaState = (char) (29944 - KeyEvent.normalizeMetaState(0));
                int iAlpha = 1755 - Color.alpha(0);
                int i35 = 24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                byte b5 = (byte) 52;
                Object[] objArr21 = new Object[1];
                m(b5, (short) (b5 - 1), $$j[132], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cNormalizeMetaState, iAlpha, i35, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrB$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i36 = (((-1963174803) + (((~((-111949486) | elapsedCpuTime)) | (-100652941)) * (-948))) + ((~((~elapsedCpuTime) | (-78386829))) * (-948))) - 56534352;
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i38 ^ (i38 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            n(821491536 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 145022595, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step4).substring(89, 91).codePointAt(1) - 113), Color.green(0) - 97, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1063).substring(0, 53).length() - 142), objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.xl_instruction_step2).substring(5, 8).codePointAt(2) + 821491518, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_tablet_step5).substring(28, 29).length() - 145022586, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_day_of_week_column_header).substring(0, 4).codePointAt(1) - 165), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 208, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_confirm_shopeepay_qr_scan_tablet).substring(12, 17).codePointAt(0) - 106), objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {243439457};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - ExpandableListView.getPackedPositionType(0L)), 1774 - AndroidCharacter.getMirror('0'), 29 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$5f1425da = PMIRegistrationDataStore$$ExternalSyntheticLambda7.b$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 1696094360);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char modifierMetaStateMask3 = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                int windowTouchSlop2 = 1755 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int mirror = AndroidCharacter.getMirror('0') - 25;
                byte b6 = (byte) 52;
                Object[] objArr26 = new Object[1];
                m(b6, (short) (b6 - 1), $$j[132], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(modifierMetaStateMask3, windowTouchSlop2, mirror, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                n(821491500 - Color.alpha(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 145022699, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_instruction_step4).substring(0, 1).codePointAt(0) - 87), (ViewConfiguration.getEdgeSlop() >> 16) - 91, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_utilized_orderid).substring(9, 10).length() - 57), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_gross_amount_required).substring(5, 6).codePointAt(0) + 821491489, (-145022589) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_successful).substring(0, 1).length() - 56), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 210, (byte) ((-111) - Color.alpha(0)), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char mirror2 = (char) (AndroidCharacter.getMirror('0') + 29896);
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1755;
                    int iIndexOf = 23 - TextUtils.indexOf("", "");
                    Object[] objArr29 = new Object[1];
                    m((byte) 52, (short) 140, $$j[132], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(mirror2, scrollBarSize, iIndexOf, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c3 = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int iResolveOpacity = 1755 - Drawable.resolveOpacity(0, 0);
                    int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 23;
                    byte[] bArr7 = $$j;
                    Object[] objArr30 = new Object[1];
                    m((byte) 37, bArr7[2], bArr7[132], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, iResolveOpacity, scrollBarSize2, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrB$5f1425da[0])[0] != ((int[]) objArrB$5f1425da[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrB$5f1425da[4];
            if (strArr5 == null) {
                throw null;
            }
            for (String str2 : strArr5) {
                int i39 = getInterfaceDescriptor + 119;
                INotificationSideChannelStub = i39 % 128;
                int i40 = i39 % 2;
                arrayList2.add(str2);
            }
            throw null;
        }
        int i41 = ((int[]) objArrB$5f1425da[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrB$5f1425da[0])[0]}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int iIdentityHashCode4 = System.identityHashCode(this);
        int i42 = i41 + 34829815 + (((-554967195) | (~iIdentityHashCode4)) * (-490)) + (((~(iIdentityHashCode4 | 485171044)) | (-1040138239)) * 490) + 1688382890;
        int i43 = (i42 << 13) ^ i42;
        int i44 = i43 ^ (i43 >>> 17);
        ((int[]) objArr31[3])[0] = i44 ^ (i44 << 5);
        int i45 = INotificationSideChannelStub + 73;
        getInterfaceDescriptor = i45 % 128;
        int i46 = i45 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x007a  */
    private static void n(int i, int i2, short s, int i3, byte b, Object[] objArr) throws Throwable {
        int i4;
        long j;
        boolean z;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(cancelAll)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 2267 - TextUtils.getTrimmedLength(""), View.getDefaultSize(0, 0) + 33, 1387473586, false, $$u(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $10 + 7;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
            } else {
                i4 = 0;
            }
            if (i4 == 0) {
                j = 3046761265686732006L;
            } else {
                byte[] bArr = notify;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char defaultSize = (char) View.getDefaultSize(0, 0);
                                int iIndexOf = 3358 - TextUtils.indexOf("", "");
                                int iIndexOf2 = TextUtils.indexOf("", "", 0) + 18;
                                byte length2 = (byte) $$m.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, iIndexOf, iIndexOf2, -1054011043, false, $$u((byte) 0, length2, (byte) (length2 - 5)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i7] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = notify;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onTransact)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 2267 - TextUtils.getTrimmedLength(""), (KeyEvent.getMaxKeyCode() >> 16) + 33, 1387473586, false, $$u(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) cancelAll) ^ 3046761265686732006L)));
                        j = 3046761265686732006L;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) RemoteActionCompatParcelizer[i + ((int) (((long) onTransact) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) cancelAll) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i + iIntValue) - 2) + ((int) (((long) onTransact) ^ j)) + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(cancel), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 55903), Process.getGidForName("") + 2856, 13 - ((Process.getThreadPriority(0) + 20) >> 6), -1529949196, false, $$u(b6, b7, (byte) (-b7)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = notify;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i8 = 0; i8 < length3; i8++) {
                        bArr5[i8] = (byte) (((long) bArr4[i8]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i9 = $11 + 77;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    z = true;
                } else {
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = notify;
                        int i11 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i11 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i11]) ^ 3046761265686732006L)) + s)) ^ b));
                    } else {
                        short[] sArr = RemoteActionCompatParcelizer;
                        int i12 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i12 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i12]) ^ 3046761265686732006L)) + s)) ^ b));
                        int i13 = $11 + 37;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        INotificationSideChannelStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[1]).getInt(null);
            int i4 = ~new Random().nextInt();
            if (i3 != ((1563865192 + (((~(i4 | 1857945559)) | (~((-539302401) | i4))) * (-184))) + (((244327808 | (~((-783630209) | i4))) | (~(1613617751 | i4))) * 184)) - 105529152) {
                throw null;
            }
        } else {
            int i5 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
            if (i5 != (-573117390) + (((~(i6 | 188709077)) | 880804648) * 305) + (((~((~i6) | 188709077)) | 1018696620) * 305)) {
                throw null;
            }
        }
        int i7 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i8 = ~iIdentityHashCode;
        int i9 = (~((-634099330) | i8)) | 67244032;
        int i10 = ~(iIdentityHashCode | (-1378101339));
        if (i7 != (-54299982) + ((i9 | i10) * (-713)) + (i10 * 1426) + ((~((-1944956636) | i8)) * 713)) {
            throw new RuntimeException("2068329781");
        }
        super.onResume();
        int i11 = getInterfaceDescriptor + 117;
        INotificationSideChannelStub = i11 % 128;
        if (i11 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i5 = ~(1757295242 | startElapsedRealtime);
        int i6 = ~startElapsedRealtime;
        if (i4 != 142911188 + ((i5 | (~((-1220157449) | i6))) * (-406)) + ((~(2147465147 | i6)) * (-406)) + (((~(startElapsedRealtime | (-927307700))) | (~((-1757295243) | i6))) * 406)) {
            throw null;
        }
        int i7 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iNextInt = new Random().nextInt(433639740);
        if (i7 != (-171761259) + (((~((~iNextInt) | (-363109454))) | (-2079020785)) * (-235)) + (((~((-363109454) | iNextInt)) | (-2079020785)) * (-470)) + (((~(iNextInt | (-295703617))) | (-2146426622)) * 235)) {
            throw null;
        }
        super.onStart();
        int i8 = getInterfaceDescriptor + 69;
        INotificationSideChannelStub = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 23;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = getInterfaceDescriptor + 107;
        INotificationSideChannelStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
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
    private static java.lang.String $$u(short r6, byte r7, short r8) {
        /*
            int r8 = r8 + 4
            int r7 = r7 + 117
            byte[] r0 = com.midtrans.sdk.uikit.views.kioson.payment.KiosonPaymentActivity.$$m
            int r6 = r6 * 4
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L28:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.kioson.payment.KiosonPaymentActivity.$$u(short, byte, short):java.lang.String");
    }
}
