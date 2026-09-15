package com.midtrans.sdk.uikit.views.cimb_click;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.R;
import com.google.android.gms.tasks.zzu;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.CameraUseCaseAdapter;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.filterOutChildSizesCausingDoubleCropping;
import defpackage.handleMessage;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import defpackage.onConnectionFailed;
import defpackage.toRationalWithMod16Considered;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public class CimbClickPaymentActivity extends BasePaymentActivity implements filterOutChildSizesCausingDoubleCropping {
    private toRationalWithMod16Considered cancelAll;
    private FancyButton g;
    private static final byte[] $$u = {104, 27, -72, 120};
    private static final int $$v = 178;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {32, 1, 70, -122, -19, -5, 56, -64, -15, -7, 1, -12, 0, 48, -58, -20, 3, -21, -4, -1, -2, 47, -70, 5, -26, 8, -20, 2, 1, -18, 55, -61, -4, -26, 8, -18, 0, -1, -15, -1, -20, Base64.padSymbol, -38, -27, -26, 8, -20, 2, 1, -18, 34, -37, -18, 0, -16, 3, -4, -24, 71, -27, -40, 5, -18, 4, -13, -6, 23, -24, -31, 5, 1, -16, -13, 39, -51, 10, -13, -13, 1, -16, -13, -6, -4, 4, -5, -13, 1, -18, -4, -12, -5, -4, -12, 2, -6, -25, 6, -3, -25, 35, -41, 4, -8, -14, 1, -8, -8, -2, -27, 2, -15, 58};
    private static final int $$n = 52;
    private static final byte[] $$j = {1, -81, 2, 79, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$k = 17;
    private static int INotificationSideChannelStubProxy = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static char INotificationSideChannel = 49514;
    private static char onTransact = 51226;
    private static char notify = 63707;
    private static char cancel = 47026;
    private final String asInterface = "CIMB Clicks";
    private final String d = "Confirm Payment CIMB Clicks";

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CimbClickPaymentActivity cimbClickPaymentActivity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 97;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        cimbClickPaymentActivity.asBinder();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = INotificationSideChannelStubProxy + 7;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ toRationalWithMod16Considered b(CimbClickPaymentActivity cimbClickPaymentActivity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        int i3 = i2 % 128;
        INotificationSideChannelStubProxy = i3;
        int i4 = i2 % 2;
        toRationalWithMod16Considered torationalwithmod16considered = cimbClickPaymentActivity.cancelAll;
        int i5 = i3 + 85;
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return torationalwithmod16considered;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 84
            int r7 = 53 - r7
            int r6 = r6 * 52
            int r6 = 160 - r6
            byte[] r0 = com.midtrans.sdk.uikit.views.cimb_click.CimbClickPaymentActivity.$$j
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L25
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r6]
        L25:
            int r8 = r8 + r3
            int r6 = r6 + 1
            int r8 = r8 + (-11)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.cimb_click.CimbClickPaymentActivity.m(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void o(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 53
            int r8 = r8 * 15
            int r8 = 99 - r8
            byte[] r1 = com.midtrans.sdk.uikit.views.cimb_click.CimbClickPaymentActivity.$$m
            int r7 = r7 * 56
            int r7 = 59 - r7
            byte[] r0 = new byte[r0]
            int r6 = r6 + 52
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r6
            r8 = r7
            r4 = r2
            goto L32
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L32:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-7)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.cimb_click.CimbClickPaymentActivity.o(byte, short, short, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 17;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        setPrimaryBackgroundColor(this.g);
        int i4 = RemoteActionCompatParcelizer + 55;
        INotificationSideChannelStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.g = (FancyButton) findViewById(R.id.button_primary);
        int i4 = INotificationSideChannelStubProxy + 81;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = INotificationSideChannelStubProxy + 63;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        super.onActivityResult(i, i2, intent);
        if (i != 210) {
            int i6 = INotificationSideChannelStubProxy + 97;
            RemoteActionCompatParcelizer = i6 % 128;
            if (i6 % 2 == 0) {
                if (i != 69) {
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
        int i7 = RemoteActionCompatParcelizer + 79;
        INotificationSideChannelStubProxy = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        INotificationSideChannelStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        toRationalWithMod16Considered torationalwithmod16considered = this.cancelAll;
        if (torationalwithmod16considered != null) {
            torationalwithmod16considered.TuitionPaymentFragmentbindingInflater1("Back", "CIMB Clicks");
            int i3 = INotificationSideChannelStubProxy + 77;
            RemoteActionCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
        }
        super.onBackPressed();
    }

    private static void n(char[] cArr, int i, Object[] objArr) throws Throwable {
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
            int i4 = $11 + 125;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            }
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                int i7 = $10 + 53;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i9 = (c2 + i5) ^ ((c2 << 4) + ((char) (((long) notify) ^ 8611973335120459638L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(cancel);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cCombineMeasuredStates = (char) (View.combineMeasuredStates(i3, i3) + 47773);
                        int trimmedLength = TextUtils.getTrimmedLength("") + 468;
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, trimmedLength, pressedStateDuration, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i11 = i6;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) INotificationSideChannel) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onTransact)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - View.resolveSizeAndState(0, 0, 0)), 468 - (ViewConfiguration.getLongPressTimeout() >> 16), 12 - Process.getGidForName(""), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6 = i11 + 1;
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
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2324, Color.blue(0) + 44, -1312321721, false, $$w(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 67;
        RemoteActionCompatParcelizer = i2 % 128;
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
        }
        int i3 = RemoteActionCompatParcelizer + 49;
        INotificationSideChannelStubProxy = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        int i4 = INotificationSideChannelStubProxy + 17;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void b(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 3;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        b();
        b(transactionResponse, "cimb_clicks");
        int i4 = INotificationSideChannelStubProxy + 37;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1709594919
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.cimb_click.CimbClickPaymentActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 876;
            int trimmedLength = 10 - TextUtils.getTrimmedLength("");
            Object[] objArr2 = new Object[1];
            m($$j[14], (byte) 52, (byte) ($$k - 3), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, packedPositionGroup, trimmedLength, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        n(new char[]{22015, 39004, 58891, 47369, 61451, 7891, 61423, 38029, 41736, 45934, 24865, 5677, 31524, 49949, 3621, 38931, 44154, 19937, 49607, 4071, 19166, 19459, 14334, 49570}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indomaret_instruction_step2).substring(28, 29).codePointAt(0) - 75, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        n(new char[]{9688, 36769, 11732, 57177, 12100, 46456, 16556, 9705, 18139, 17420, 5436, 9956, 33945, 15606, 28492, 31178, 35702, 58571}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char gidForName = (char) ((-1) - Process.getGidForName(""));
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 876;
            int windowTouchSlop = 10 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            byte[] bArr = $$j;
            byte b = bArr[14];
            byte b2 = bArr[7];
            Object[] objArr5 = new Object[1];
            m(b, b2, b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName, threadPriority, windowTouchSlop, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int maximumFlingVelocity = 876 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int maximumDrawingCacheSize = 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte[] bArr2 = $$j;
                Object[] objArr6 = new Object[1];
                m(bArr2[2], (byte) 52, bArr2[54], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, maximumFlingVelocity, maximumDrawingCacheSize, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            int i5 = (-42326482) + (((~(i4 | (-672236315))) | 712546543) * (-1042)) + (((-672236315) | iIdentityHashCode) * 521) + (((~(iIdentityHashCode | (-712546544))) | 40376549 | (~(i4 | (-66321)))) * 521) + 994587122;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr8 = new Object[1];
                n(new char[]{59904, 25789, 40371, 39453, 61848, 63552, 25199, 24040, 6971, 32149, 35959, 39797, 30369, 26812, 41594, 10690, 24680, 4140, 7118, 13500, 5088, 29205, 64381, 13410, 36293, 39144, 49236, 55196}, 26 - View.resolveSize(0, 0), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                n(new char[]{18886, 39312, 58611, 9704, 49072, 46192, 30766, 32444, 58839, 47946, 28401, Typography.lessOrEqual, 32413, 10771, 6870, 57142, 62529, 1941, 61341, 54774}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction).substring(0, 6).codePointAt(0) - 55, objArr9);
                baseContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            n(new char[]{5097, 26193, 56743, 33259, 45030, 7246, 58803, 37473, 64199, 46865, 46272, 38401, 42623, 64384, 20526, 35271, 17384, 36033}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            n(new char[]{23838, 42758, 16749, 36987, 32464, 21541, 40640, 10852, 22016, 30507, 44841, 31350, 53420, 59377, 35425, 52563, 56766, 26557}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_internet_instruction_step1).substring(33, 69).length() - 20, objArr11);
            try {
                Object[] objArr12 = {baseContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 994587122};
                byte[] bArr3 = $$m;
                byte b3 = bArr3[1];
                Object[] objArr13 = new Object[1];
                o(b3, b3, bArr3[12], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b4 = bArr3[12];
                Object[] objArr14 = new Object[1];
                o(b4, b4, bArr3[1], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (baseContext != null) {
                    int i8 = INotificationSideChannelStubProxy + 99;
                    RemoteActionCompatParcelizer = i8 % 128;
                    int i9 = i8 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cArgb = (char) Color.argb(0, 0, 0, 0);
                        int iResolveOpacity = 876 - Drawable.resolveOpacity(0, 0);
                        int iCombineMeasuredStates = 10 - View.combineMeasuredStates(0, 0);
                        byte[] bArr4 = $$j;
                        Object[] objArr16 = new Object[1];
                        m(bArr4[2], (byte) 52, bArr4[54], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, iResolveOpacity, iCombineMeasuredStates, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        n(new char[]{22015, 39004, 58891, 47369, 61451, 7891, 61423, 38029, 41736, 45934, 24865, 5677, 31524, 49949, 3621, 38931, 44154, 19937, 49607, 4071, 19166, 19459, 14334, 49570}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_with_bni_point).substring(1, 3).length() + 20, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        n(new char[]{9688, 36769, 11732, 57177, 12100, 46456, 16556, 9705, 18139, 17420, 5436, 9956, 33945, 15606, 28492, 31178, 35702, 58571}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_web_instruction_5).substring(1, 2).length() + 14, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cMyPid = (char) (Process.myPid() >> 22);
                            int i10 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 876;
                            int gidForName2 = Process.getGidForName("") + 11;
                            byte[] bArr5 = $$j;
                            byte b5 = bArr5[14];
                            byte b6 = bArr5[7];
                            Object[] objArr19 = new Object[1];
                            m(b5, b6, b6, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyPid, i10, gidForName2, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                            int i11 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                            Object[] objArr20 = new Object[1];
                            m($$j[14], (byte) 52, (byte) ($$k - 3), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, i11, minimumFlingVelocity, 252381699, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i12 = ((int[]) objArr[2])[0];
        int i13 = ((int[]) objArr[0])[0];
        if (i13 != i12) {
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            int i14 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i15 = ~iMaxMemory;
            int i16 = (~((-642596808) | i15)) | 574892482;
            int i17 = ~(iMaxMemory | 669990903);
            int i18 = i14 + (-1416065826) + ((i16 | i17) * (-713)) + (i17 * 1426) + ((~(602286578 | i15)) * 713);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr21[1])[0] = i20 ^ (i20 << 5);
            return;
        }
        int i21 = RemoteActionCompatParcelizer + 19;
        INotificationSideChannelStubProxy = i21 % 128;
        int i22 = i21 % 2;
        int i23 = ((int[]) objArr[1])[0];
        Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        int i24 = i23 + ((((-756733616) + (((~((-134823937) | layoutDirection)) | (~((-94513708) | layoutDirection))) * 69)) + (((~(layoutDirection | (-938880700))) | ((~((-979190929) | layoutDirection)) | 844366992)) * (-69))) - 1071175852);
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        ((int[]) objArr22[1])[0] = i26 ^ (i26 << 5);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 21;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char trimmedLength = (char) TextUtils.getTrimmedLength("");
            int i5 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1031;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 16;
            byte[] bArr = $$j;
            byte b = bArr[2];
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            m(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength, i5, iLastIndexOf, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        n(new char[]{22015, 39004, 58891, 47369, 61451, 7891, 61423, 38029, 41736, 45934, 24865, 5677, 31524, 49949, 3621, 38931, 44154, 19937, 49607, 4071, 19166, 19459, 14334, 49570}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_app_name).substring(0, 12).length() + 10, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        n(new char[]{9688, 36769, 11732, 57177, 12100, 46456, 16556, 9705, 18139, 17420, 5436, 9956, 33945, 15606, 28492, 31178, 35702, 58571}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_dialog_screen_primary_cta_text).substring(5, 14).codePointAt(6) - 86, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
            int bitsPerPixel = 1030 - ImageFormat.getBitsPerPixel(0);
            int i6 = 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            byte[] bArr2 = $$j;
            byte b3 = bArr2[0];
            byte b4 = bArr2[7];
            Object[] objArr5 = new Object[1];
            m(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, bitsPerPixel, i6, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                int maxKeyCode = 1031 - (KeyEvent.getMaxKeyCode() >> 16);
                int minimumFlingVelocity = 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                Object[] objArr6 = new Object[1];
                m($$j[14], (byte) 52, (byte) ($$k - 3), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType2, maxKeyCode, minimumFlingVelocity, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i7 = ((int[]) objArr7[3])[0];
            int i8 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = ~iIdentityHashCode;
            int i10 = (-96276351) + (((~((-45264634) | i9)) | (~(iIdentityHashCode | 199015536))) * 333) + (((~(iIdentityHashCode | (-45264634))) | (~(i9 | 199015536))) * 333) + 1727077987;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            n(new char[]{5097, 26193, 56743, 33259, 45030, 7246, 58803, 37473, 64199, 46865, 46272, 38401, 42623, 64384, 20526, 35271, 17384, 36033}, 16 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            n(new char[]{23838, 42758, 16749, 36987, 32464, 21541, 40640, 10852, 22016, 30507, 44841, 31350, 53420, 59377, 35425, 52563, 56766, 26557}, TextUtils.indexOf("", "", 0) + 16, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1062072751};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46039 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1134, 19 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1727077987, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                    int iResolveSizeAndState = 1031 - View.resolveSizeAndState(0, 0, 0);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 15;
                    byte[] bArr3 = $$j;
                    byte b5 = bArr3[2];
                    byte b6 = bArr3[7];
                    Object[] objArr12 = new Object[1];
                    m(b5, b6, b6, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iResolveSizeAndState, iResolveOpacity, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1117, 17 - (ViewConfiguration.getWindowTouchSlop() >> 8)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iResolveOpacity2 = 1031 - Drawable.resolveOpacity(0, 0);
                    int fadingEdgeLength = 15 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    Object[] objArr13 = new Object[1];
                    m($$j[14], (byte) 52, (byte) ($$k - 3), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize, iResolveOpacity2, fadingEdgeLength, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    n(new char[]{22015, 39004, 58891, 47369, 61451, 7891, 61423, 38029, 41736, 45934, 24865, 5677, 31524, 49949, 3621, 38931, 44154, 19937, 49607, 4071, 19166, 19459, 14334, 49570}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.maintenance_message).substring(0, 38).codePointAt(6) - 83, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    n(new char[]{9688, 36769, 11732, 57177, 12100, 46456, 16556, 9705, 18139, 17420, 5436, 9956, 33945, 15606, 28492, 31178, 35702, 58571}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                        int windowTouchSlop = 1031 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int longPressTimeout = 15 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte[] bArr4 = $$j;
                        byte b7 = bArr4[0];
                        byte b8 = bArr4[7];
                        Object[] objArr16 = new Object[1];
                        m(b7, b8, b8, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(offsetAfter, windowTouchSlop, longPressTimeout, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                        int i13 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1031;
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 15;
                        byte[] bArr5 = $$j;
                        byte b9 = bArr5[2];
                        byte b10 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        m(b9, b10, b10, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cAxisFromString, i13, packedPositionGroup, 1357589585, false, (String) objArr17[0], null);
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
        if (i15 != i14) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                int i16 = INotificationSideChannelStubProxy + 69;
                RemoteActionCompatParcelizer = i16 % 128;
                int i17 = i16 % 2;
                while (i4 < strArr2.length) {
                    arrayList.add(strArr2[i4]);
                    i4++;
                }
            }
            throw new RuntimeException(String.valueOf(i15));
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i18 = ((int[]) objArr[2])[0];
        int i19 = ((int[]) objArr[3])[0];
        int i20 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_cta_text_submit).substring(0, 5).length() - 1082078321;
        int i21 = ~length;
        int i22 = i18 + (-1983075958) + (((~((-904147406) | i21)) | (-659867236)) * 519) + (((~(i21 | (-625213506))) | (~((-34653731) | length))) * (-519)) + (((~(length | (-659867236))) | 904147405) * 519);
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr18[2])[0] = i24 ^ (i24 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char edgeSlop = (char) (29944 - (ViewConfiguration.getEdgeSlop() >> 16));
            int iBlue = 1755 - Color.blue(0);
            int iMyTid = 23 - (Process.myTid() >> 22);
            byte b11 = $$j[7];
            byte b12 = b11;
            Object[] objArr19 = new Object[1];
            m(b12, (byte) (b12 | 15), b11, objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(edgeSlop, iBlue, iMyTid, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i25 = INotificationSideChannelStubProxy + 25;
            RemoteActionCompatParcelizer = i25 % 128;
            int i26 = i25 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c2 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29944);
                int i27 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1754;
                int i28 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23;
                byte[] bArr6 = $$j;
                byte b13 = bArr6[0];
                byte b14 = bArr6[7];
                Object[] objArr20 = new Object[1];
                m(b13, b14, b14, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c2, i27, i28, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i29 = ((int[]) objArr21[0])[0];
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{i29}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i30 = (((~((-555784448) | elapsedCpuTime)) | 2132165) * (-283)) + 816005120 + ((~(elapsedCpuTime | (-553652283))) * 283) + 600408497;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i32 ^ (i32 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            n(new char[]{5097, 26193, 56743, 33259, 45030, 7246, 58803, 37473, 64199, 46865, 46272, 38401, 42623, 64384, 20526, 35271, 17384, 36033}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_denied).substring(0, 6).codePointAt(4) - 99, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            n(new char[]{23838, 42758, 16749, 36987, 32464, 21541, 40640, 10852, 22016, 30507, 44841, 31350, 53420, 59377, 35425, 52563, 56766, 26557}, 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {-1062072751};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42048 - Process.getGidForName("")), 1726 - TextUtils.indexOf("", ""), 30 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 600408497, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cRgb = (char) ((-16747272) - Color.rgb(0, 0, 0));
                int maximumDrawingCacheSize2 = 1755 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i33 = 23 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr7 = $$j;
                byte b15 = bArr7[0];
                byte b16 = bArr7[7];
                Object[] objArr25 = new Object[1];
                m(b15, b16, b16, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cRgb, maximumDrawingCacheSize2, i33, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr26 = new Object[1];
                n(new char[]{22015, 39004, 58891, 47369, 61451, 7891, 61423, 38029, 41736, 45934, 24865, 5677, 31524, 49949, 3621, 38931, 44154, 19937, 49607, 4071, 19166, 19459, 14334, 49570}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                n(new char[]{9688, 36769, 11732, 57177, 12100, 46456, 16556, 9705, 18139, 17420, 5436, 9956, 33945, 15606, 28492, 31178, 35702, 58571}, Color.green(0) + 15, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cIndexOf = (char) (29944 - TextUtils.indexOf("", ""));
                    int deadChar = 1755 - KeyEvent.getDeadChar(0, 0);
                    int i34 = 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    byte[] bArr8 = $$j;
                    byte b17 = bArr8[14];
                    byte b18 = bArr8[7];
                    Object[] objArr28 = new Object[1];
                    m(b17, b18, b18, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf, deadChar, i34, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cIndexOf2 = (char) (29944 - TextUtils.indexOf("", ""));
                    int i35 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                    int iAxisFromString = 22 - MotionEvent.axisFromString("");
                    byte b19 = $$j[7];
                    byte b20 = b19;
                    Object[] objArr29 = new Object[1];
                    m(b20, (byte) (b20 | 15), b19, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf2, i35, iAxisFromString, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr4 == null) {
                throw null;
            }
            while (i4 < strArr4.length) {
                int i36 = INotificationSideChannelStubProxy + 71;
                RemoteActionCompatParcelizer = i36 % 128;
                if (i36 % 2 == 0) {
                    arrayList2.add(strArr4[i4]);
                    i4 += 80;
                } else {
                    arrayList2.add(strArr4[i4]);
                    i4++;
                }
            }
            throw null;
        }
        int i37 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        int i38 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        Object[] objArr30 = {new int[]{i38}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int length2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_uob).substring(1, 3).length() - 996867821;
        int i39 = ~length2;
        int i40 = i37 + (-144688828) + (((~((-636494465) | i39)) | (~(423892038 | i39))) * (-867)) + (((~((-636494465) | length2)) | 615522944 | (~(423892038 | length2))) * (-1734)) + (((~(length2 | 1039414982)) | (~(i39 | (-615522945))) | (~((-20971521) | length2))) * 867);
        int i41 = (i40 << 13) ^ i40;
        int i42 = i41 ^ (i41 >>> 17);
        ((int[]) objArr30[3])[0] = i42 ^ (i42 << 5);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 89;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 != (-414344861) + (((~((-880611010) | i5)) | (~(iIdentityHashCode | (-1710598553)))) * 333) + (((~(iIdentityHashCode | (-880611010))) | (~(i5 | (-1710598553)))) * 333)) {
            throw new RuntimeException("545880466");
        }
        int i6 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i7 = ~iFreeMemory;
        if (i6 != 607248884 + (((~((-2097797788) | i7)) | (~((-481258178) | iFreeMemory))) * 1900) + (((~(i7 | 481258177)) | (~(iFreeMemory | 2097797787))) * (-950)) + (((~(iFreeMemory | 481258177)) | (~(i7 | 2097797787))) * 950)) {
            throw null;
        }
        super.onResume();
        int i8 = RemoteActionCompatParcelizer + 123;
        INotificationSideChannelStubProxy = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 89;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = (-1869957560) + ((~(iIdentityHashCode | 924776170)) * 216);
        int i6 = ~iIdentityHashCode;
        if (i4 != i5 + ((2141190123 | i6) * (-216)) + (((~(i6 | 924776170)) | (-1754763714)) * 216)) {
            int i7 = (-566181690) % 2;
            throw new ArithmeticException();
        }
        int i8 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        if (i8 != 1264757240 + (((~(iIdentityHashCode2 | 914179875)) | (-1664876090)) * (-668)) + ((914179875 | (~((-1664876090) | iIdentityHashCode2))) * 1336) + ((iIdentityHashCode2 | (-1090697241)) * 668)) {
            int i9 = (-622860600) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i10 = RemoteActionCompatParcelizer + 115;
        INotificationSideChannelStubProxy = i10 % 128;
        if (i10 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$w(byte r6, int r7, short r8) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.views.cimb_click.CimbClickPaymentActivity.$$u
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r7 = r7 * 4
            int r7 = 108 - r7
            int r6 = r6 * 4
            int r6 = 1 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r3 = r0[r8]
        L28:
            int r7 = r7 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.cimb_click.CimbClickPaymentActivity.$$w(byte, int, short):java.lang.String");
    }
}
