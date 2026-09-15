package com.midtrans.sdk.uikit.views.indosat_dompetku;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.R;
import com.bpjstku.data.point.PointDataStore;
import com.google.android.material.textfield.TextInputLayout;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import com.midtrans.sdk.uikit.widgets.SemiBoldTextView;
import defpackage.CameraUseCaseAdapter;
import defpackage.SessionProcessor;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.filterOutChildSizesCausingDoubleCropping;
import defpackage.getSharingNode;
import defpackage.handleMessage;
import defpackage.initSession;
import defpackage.onConnectionFailed;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class IndosatDompetkuPaymentActivity extends BasePaymentActivity implements filterOutChildSizesCausingDoubleCropping {
    private getSharingNode INotificationSideChannel;
    private final String asInterface = "Indosat Dompetku";
    private SemiBoldTextView cancel;
    private AppCompatEditText cancelAll;
    private FancyButton d;
    private int g;
    private TextInputLayout onTransact;
    private static final byte[] $$m = {83, -90, 68, -23};
    private static final int $$n = 56;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {15, -9, 64, -81, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$k = 202;
    private static int INotificationSideChannelStubProxy = 0;
    private static int getInterfaceDescriptor = 1;
    private static long notify = -6377398940819159759L;
    private static int RemoteActionCompatParcelizer = -981105359;
    private static char INotificationSideChannelDefault = 45934;

    public static /* synthetic */ getSharingNode TuitionPaymentFragmentbindingInflater1(IndosatDompetkuPaymentActivity indosatDompetkuPaymentActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy;
        int i3 = i2 + 95;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        getSharingNode getsharingnode = indosatDompetkuPaymentActivity.INotificationSideChannel;
        int i5 = i2 + 103;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
        return getsharingnode;
    }

    public static /* synthetic */ AppCompatEditText TuitionPaymentFragmentspecialinlinedviewModeldefault2(IndosatDompetkuPaymentActivity indosatDompetkuPaymentActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 113;
        int i3 = i2 % 128;
        INotificationSideChannelStubProxy = i3;
        int i4 = i2 % 2;
        AppCompatEditText appCompatEditText = indosatDompetkuPaymentActivity.cancelAll;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 39;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return appCompatEditText;
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(IndosatDompetkuPaymentActivity indosatDompetkuPaymentActivity, String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (!(!TextUtils.isEmpty(str))) {
            indosatDompetkuPaymentActivity.onTransact.setError(indosatDompetkuPaymentActivity.getString(R.string.indosat_error_empty_number));
            return false;
        }
        if (str.length() >= 10) {
            indosatDompetkuPaymentActivity.onTransact.setError("");
            return true;
        }
        int i4 = getInterfaceDescriptor + 121;
        INotificationSideChannelStubProxy = i4 % 128;
        int i5 = i4 % 2;
        indosatDompetkuPaymentActivity.onTransact.setError(indosatDompetkuPaymentActivity.getString(R.string.error_invalid_phone_number));
        return false;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(IndosatDompetkuPaymentActivity indosatDompetkuPaymentActivity, String str) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 117;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        indosatDompetkuPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
        int i4 = getInterfaceDescriptor + 77;
        INotificationSideChannelStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.views.indosat_dompetku.IndosatDompetkuPaymentActivity.$$j
            int r7 = 196 - r7
            int r1 = 53 - r6
            int r5 = r5 * 14
            int r5 = 98 - r5
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            int r7 = r7 + 1
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r7]
        L28:
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.indosat_dompetku.IndosatDompetkuPaymentActivity.m(int, int, int, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        INotificationSideChannelStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            setPrimaryBackgroundColor(this.d);
            b(this.cancelAll);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.onTransact);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setPrimaryBackgroundColor(this.d);
        b(this.cancelAll);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.onTransact);
        int i3 = getInterfaceDescriptor + 35;
        INotificationSideChannelStubProxy = i3 % 128;
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
            int i4 = INotificationSideChannelStubProxy + 5;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = getInterfaceDescriptor + 13;
        INotificationSideChannelStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 57;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        this.d = (FancyButton) findViewById(R.id.button_primary);
        this.cancelAll = (AppCompatEditText) findViewById(R.id.et_indosat_phone_number);
        this.onTransact = (TextInputLayout) findViewById(R.id.til_indosat_phone_number);
        this.cancel = (SemiBoldTextView) findViewById(R.id.text_page_title);
        int i4 = getInterfaceDescriptor + 123;
        INotificationSideChannelStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        getSharingNode getsharingnode = this.INotificationSideChannel;
        if (getsharingnode != null) {
            int i2 = getInterfaceDescriptor + 27;
            INotificationSideChannelStubProxy = i2 % 128;
            int i3 = i2 % 2;
            getsharingnode.TuitionPaymentFragmentbindingInflater1("Back", "Indosat Dompetku");
            int i4 = getInterfaceDescriptor + 115;
            INotificationSideChannelStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        super.onBackPressed();
        int i6 = INotificationSideChannelStubProxy + 27;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 83 / 0;
        }
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 13;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            b();
            boolean z = this.TuitionPaymentFragmentbindingInflater1;
            throw null;
        }
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
        }
        int i3 = getInterfaceDescriptor + 59;
        INotificationSideChannelStubProxy = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void b(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 7;
        INotificationSideChannelStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            b();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            int i3 = 85 / 0;
        } else {
            b();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        }
        int i4 = getInterfaceDescriptor + 121;
        INotificationSideChannelStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1384476180
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.indosat_dompetku.IndosatDompetkuPaymentActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        b();
        int i2 = this.g;
        if (i2 < 2) {
            this.g = i2 + 1;
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, transactionResponse).TuitionPaymentFragmentbindingInflater1);
            int i3 = INotificationSideChannelStubProxy + 51;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        if (transactionResponse != null) {
            int i5 = INotificationSideChannelStubProxy + 33;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            if (i6 == 0) {
                int i7 = 89 / 0;
            }
        }
    }

    private static void n(char[] cArr, char[] cArr2, char c, char[] cArr3, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $10 + 7;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8327 - TextUtils.lastIndexOf("", '0')), Drawable.resolveOpacity(0, 0) + 1235, 34 - ExpandableListView.getPackedPositionChild(0L), -653973969, false, $$u(b, b2, (byte) (b2 - 2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getOffsetAfter("", 0), 2764 - (Process.myTid() >> 22), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14, 1504416861, false, $$u(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.normalizeMetaState(0) + 43325), (ViewConfiguration.getScrollBarSize() >> 8) + 253, TextUtils.lastIndexOf("", '0', 0, 0) + 23, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.resolveSize(0, 0) + 65200), 2939 - AndroidCharacter.getMirror('0'), 17 - Color.argb(0, 0, 0, 0), 2012627446, false, $$u(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (notify ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) RemoteActionCompatParcelizer) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) INotificationSideChannelDefault) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $10 + 69;
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
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char defaultSize = (char) (29944 - View.getDefaultSize(0, 0));
            int i3 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1755;
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 23;
            byte[] bArr = $$j;
            Object[] objArr2 = new Object[1];
            m(bArr[28], bArr[0], (short) 193, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, i3, iResolveSizeAndState, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i4 = getInterfaceDescriptor + 69;
            INotificationSideChannelStubProxy = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 29944);
                int iArgb = 1755 - Color.argb(0, 0, 0, 0);
                int deadChar = 23 - KeyEvent.getDeadChar(0, 0);
                byte[] bArr2 = $$j;
                byte b = bArr2[28];
                byte b2 = bArr2[7];
                Object[] objArr3 = new Object[1];
                m(b, b2, (short) (b2 | 156), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatDelay, iArgb, deadChar, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = (-1226349376) + ((~((-3939359) | i6)) * 979) + ((iIdentityHashCode | 208663067) * (-979)) + (((~(iIdentityHashCode | (-3939359))) | (~(i6 | 208663067))) * 979) + 541677485;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            n(new char[]{21554, 42611, 61260, 16028, 39348, 37261, 43659, 55807, 41673, 48339, 49974, 14240, 40806, 59742, 53238, 34895}, new char[]{0, 0, 0, 0}, (char) (32301 - (Process.myTid() >> 22)), new char[]{11229, 64128, 11675, '~'}, ViewConfiguration.getTapTimeout() >> 16, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            n(new char[]{12712, 48730, 31896, 42716, 4401, 41821, 34829, 41877, 53787, 31033, 61042, 28743, 46286, 44467, 48773, 5739}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step5).substring(3, 4).length() + 6922), new char[]{10395, 5120, 3057, 52507}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {942093405};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 42048), 1727 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 541677485, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char maxKeyCode = (char) (29944 - (KeyEvent.getMaxKeyCode() >> 16));
                    int iResolveOpacity = 1755 - Drawable.resolveOpacity(0, 0);
                    int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    byte[] bArr3 = $$j;
                    byte b3 = bArr3[28];
                    byte b4 = bArr3[7];
                    Object[] objArr8 = new Object[1];
                    m(b3, b4, (short) (b4 | 156), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode, iResolveOpacity, iIndexOf, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    n(new char[]{28617, 23944, 28739, 24044, 12897, 47774, 59867, 64498, 13572, 36359, 16205, 59193, 31744, 3665, 24098, 38926, 51721, 45359, 23344, 55398, 33981, 57335}, new char[]{0, 0, 0, 0}, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{15422, 41577, 45467, 42638}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    n(new char[]{1971, 64872, 18554, 16260, 23542, 38982, 12495, 14144, 29069, 59545, 41099, 37804, 17670, 51497, 56151}, new char[]{0, 0, 0, 0}, (char) (64896 - (Process.myTid() >> 22)), new char[]{23019, 15228, 32870, 38909}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_paid_orderid).substring(0, 9).length() + 1715174480, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cResolveSizeAndState = (char) (29944 - View.resolveSizeAndState(0, 0, 0));
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1756;
                        int iIndexOf2 = 23 - TextUtils.indexOf("", "");
                        byte[] bArr4 = $$j;
                        byte b5 = bArr4[28];
                        byte b6 = bArr4[7];
                        Object[] objArr11 = new Object[1];
                        m(b5, b6, (short) (b6 | 104), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSizeAndState, iLastIndexOf, iIndexOf2, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) (29945 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        int iAxisFromString = MotionEvent.axisFromString("") + 1756;
                        int i10 = 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte[] bArr5 = $$j;
                        Object[] objArr12 = new Object[1];
                        m(bArr5[28], bArr5[0], (short) 193, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iAxisFromString, i10, 986134021, false, (String) objArr12[0], null);
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
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
        int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        if (i12 != i11) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr != null) {
                int i13 = getInterfaceDescriptor + 25;
                INotificationSideChannelStubProxy = i13 % 128;
                while (true) {
                    int i14 = i13 % 2;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    arrayList.add(strArr[i2]);
                    i2++;
                    i13 = INotificationSideChannelStubProxy + 61;
                    getInterfaceDescriptor = i13 % 128;
                }
            }
            throw new RuntimeException(String.valueOf(i12));
        }
        int i15 = getInterfaceDescriptor + 77;
        INotificationSideChannelStubProxy = i15 % 128;
        int i16 = i15 % 2;
        int i17 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i18 = i17 + 950188177 + (((~(168052855 | iIdentityHashCode2)) | (-178769400) | (~(44549570 | iIdentityHashCode2))) * (-744)) + (((~iIdentityHashCode2) | 33833026) * 744) + ((iIdentityHashCode2 | 178769399) * 744);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr13[3])[0] = i20 ^ (i20 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int iBlue = Color.blue(0) + 1031;
            int mirror = AndroidCharacter.getMirror('0') - '!';
            byte[] bArr6 = $$j;
            byte b7 = bArr6[28];
            byte b8 = bArr6[7];
            Object[] objArr14 = new Object[1];
            m(b7, b8, (short) (b8 | 52), objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(tapTimeout, iBlue, mirror, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        n(new char[]{28617, 23944, 28739, 24044, 12897, 47774, 59867, 64498, 13572, 36359, 16205, 59193, 31744, 3665, 24098, 38926, 51721, 45359, 23344, 55398, 33981, 57335}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), new char[]{15422, 41577, 45467, 42638}, KeyEvent.keyCodeFromString(""), objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        n(new char[]{1971, 64872, 18554, 16260, 23542, 38982, 12495, 14144, 29069, 59545, 41099, 37804, 17670, 51497, 56151}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 64885), new char[]{23019, 15228, 32870, 38909}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.maintenance_message).substring(0, 38).length() + 1715174451, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int i21 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
            int i22 = 16 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            byte[] bArr7 = $$j;
            byte b9 = bArr7[28];
            byte b10 = bArr7[7];
            Object[] objArr17 = new Object[1];
            m(b9, b10, (short) (b10 | 156), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, i21, i22, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int gidForName = 1030 - Process.getGidForName("");
                int mirror2 = AndroidCharacter.getMirror('0') - '!';
                byte b11 = $$j[7];
                byte b12 = b11;
                Object[] objArr18 = new Object[1];
                m(b12, (byte) (b12 | 52), b11, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(scrollBarSize, gidForName, mirror2, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i23 = ((int[]) objArr19[3])[0];
            int i24 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int i25 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
            int i26 = 462464089 + (((~((-533954765) | i25)) | 244547724 | (~(289674594 | i25))) * (-880));
            int i27 = (~((-533954765) | (~i25))) | (-289674595);
            int i28 = ~(i25 | 533954764);
            int i29 = ((i26 + ((i27 | i28) * (-880))) + (i28 * 880)) - 1139823934;
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr[2])[0] = i31 ^ (i31 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            n(new char[]{21554, 42611, 61260, 16028, 39348, 37261, 43659, 55807, 41673, 48339, 49974, 14240, 40806, 59742, 53238, 34895}, new char[]{0, 0, 0, 0}, (char) (ImageFormat.getBitsPerPixel(0) + 32302), new char[]{11229, 64128, 11675, '~'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_email_invalid_optional).substring(30, 31).codePointAt(0) - 97, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            n(new char[]{12712, 48730, 31896, 42716, 4401, 41821, 34829, 41877, 53787, 31033, 61042, 28743, 46286, 44467, 48773, 5739}, new char[]{0, 0, 0, 0}, (char) (6923 - (ViewConfiguration.getJumpTapTimeout() >> 16)), new char[]{10395, 5120, 3057, 52507}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.save_card_message).substring(0, 1).length() - 1, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {942093405};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46038), 1134 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -1139823934, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int iMyPid = 1031 - (Process.myPid() >> 22);
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 15;
                byte[] bArr8 = $$j;
                byte b13 = bArr8[28];
                byte b14 = bArr8[7];
                Object[] objArr24 = new Object[1];
                m(b13, b14, (short) (b14 | 52), objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cMakeMeasureSpec, iMyPid, iKeyCodeFromString, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 45993), 1117 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 17 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int keyRepeatDelay2 = 1031 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int i32 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15;
                byte b15 = $$j[7];
                byte b16 = b15;
                Object[] objArr25 = new Object[1];
                m(b16, (byte) (b16 | 52), b15, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(scrollBarFadeDuration, keyRepeatDelay2, i32, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                n(new char[]{28617, 23944, 28739, 24044, 12897, 47774, 59867, 64498, 13572, 36359, 16205, 59193, 31744, 3665, 24098, 38926, 51721, 45359, 23344, 55398, 33981, 57335}, new char[]{0, 0, 0, 0}, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{15422, 41577, 45467, 42638}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 106, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                n(new char[]{1971, 64872, 18554, 16260, 23542, 38982, 12495, 14144, 29069, 59545, 41099, 37804, 17670, 51497, 56151}, new char[]{0, 0, 0, 0}, (char) (TextUtils.lastIndexOf("", '0', 0) + 64897), new char[]{23019, 15228, 32870, 38909}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1715174453, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1031;
                    int trimmedLength = 15 - TextUtils.getTrimmedLength("");
                    byte[] bArr9 = $$j;
                    byte b17 = bArr9[28];
                    byte b18 = bArr9[7];
                    Object[] objArr28 = new Object[1];
                    m(b17, b18, (short) (b18 | 156), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(offsetAfter, fadingEdgeLength, trimmedLength, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cRed = (char) Color.red(0);
                    int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 1031;
                    int i33 = 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte[] bArr10 = $$j;
                    byte b19 = bArr10[28];
                    byte b20 = bArr10[7];
                    Object[] objArr29 = new Object[1];
                    m(b19, b20, (short) (b20 | 52), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cRed, iKeyCodeFromString2, i33, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i34 = ((int[]) objArr[1])[0];
        int i35 = ((int[]) objArr[3])[0];
        if (i35 == i34) {
            int i36 = getInterfaceDescriptor + 5;
            INotificationSideChannelStubProxy = i36 % 128;
            int i37 = i36 % 2;
            Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i38 = ((int[]) objArr[2])[0];
            int i39 = ((int[]) objArr[3])[0];
            int i40 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i41 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            int i42 = ~((-965352245) | (~i41));
            int i43 = i38 + (((((-1006288895) | i42) | (~(965352244 | i41))) * (-338)) - 578949957) + (((~(i41 | (-40936651))) | i42) * 338);
            int i44 = i43 ^ (i43 << 13);
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr30[2])[0] = i45 ^ (i45 << 5);
            int i46 = INotificationSideChannelStubProxy + 1;
            getInterfaceDescriptor = i46 % 128;
            if (i46 % 2 == 0) {
                int i47 = 29 / 0;
                return;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i48 = getInterfaceDescriptor + 77;
            INotificationSideChannelStubProxy = i48 % 128;
            int i49 = i48 % 2;
            for (String str : strArr4) {
                arrayList2.add(str);
            }
        }
        int[] iArr = new int[i35];
        int i50 = i35 - 1;
        iArr[i50] = 1;
        Toast.makeText((Context) null, iArr[((i35 * i50) % 2) - 1], 1).show();
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i51 = ((int[]) objArr[2])[0];
        int i52 = ((int[]) objArr[3])[0];
        int i53 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 2023200312;
        int i54 = ~iCodePointAt;
        int i55 = i51 + (-1983075958) + (((~((-16961809) | i54)) | 227318361) * 519) + (((~(i54 | (-147713))) | (~(227466073 | iCodePointAt))) * (-519)) + (((~(iCodePointAt | 227318361)) | 16961808) * 519);
        int i56 = (i55 << 13) ^ i55;
        int i57 = i56 ^ (i56 >>> 17);
        ((int[]) objArr31[2])[0] = i57 ^ (i57 << 5);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0095  */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 45;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            if (i3 != 1168966376 + (((~(983590613 | i4)) | 17271082) * 336) + (((~(i4 | 153603070)) | 847258625) * (-168)) + (((~((~i4) | 153603070)) | 983590613) * 168)) {
                int[] iArr = new int[442185426];
                iArr[442185425] = 1;
                int i5 = (-1834087054) % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            }
        } else {
            int i6 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = 1895288000 + ((iIdentityHashCode | 284087224) * (-859));
            int i8 = ~iIdentityHashCode;
            if (i6 != i7 + (((~(iIdentityHashCode | (-277385521))) | (~(284087224 | i8))) * 859) + (((~(1114074767 | i8)) | (-1391460288)) * 859)) {
                int[] iArr2 = new int[442185426];
                iArr2[442185425] = 1;
                int i9 = (-1834087054) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i10 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        if (i10 != (((-923635948) + (((~((~iIdentityHashCode2) | (-2045647501))) | 432671360) * 446)) + (((~(iIdentityHashCode2 | (-1612976141))) | 100737104) * 446)) - 302101760) {
            throw null;
        }
        super.onResume();
        int i11 = getInterfaceDescriptor + 19;
        INotificationSideChannelStubProxy = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 9;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null);
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            if (i3 != 1278322876 + (((-268961858) | (~iMaxMemory)) * (-490)) + (((~(iMaxMemory | 1775757212)) | (-2044719070)) * 490) + 429329668) {
                throw null;
            }
        } else {
            int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int i5 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step0).substring(40, 43).codePointAt(1) + 1422176392);
            if (i4 != ((1563865192 + (((~(i5 | 1052469117)) | (~((-134348837) | i5))) * (-184))) + (((44066369 | (~((-178415206) | i5))) | (~(1008402748 | i5))) * 184)) - 1912130040) {
                throw null;
            }
        }
        int i6 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step2).substring(15, 16).codePointAt(0) - 1288353140;
        int i7 = ~iCodePointAt;
        int i8 = (~((-710741523) | i7)) | 710673922;
        int i9 = ~(iCodePointAt | 1868382042);
        if (i6 != (-1439888056) + ((i8 | i9) * (-502)) + ((i9 | (~(i7 | (-67601)))) * TypedValues.PositionType.TYPE_DRAWPATH)) {
            throw null;
        }
        super.onStart();
        int i10 = INotificationSideChannelStubProxy + 47;
        getInterfaceDescriptor = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = INotificationSideChannelStubProxy + 103;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$u(int r5, byte r6, int r7) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.views.indosat_dompetku.IndosatDompetkuPaymentActivity.$$m
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r5 = r5 * 3
            int r1 = 1 - r5
            int r6 = 104 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r5 = 0 - r5
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            r3 = r0[r7]
        L26:
            int r7 = r7 + 1
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.indosat_dompetku.IndosatDompetkuPaymentActivity.$$u(int, byte, int):java.lang.String");
    }
}
