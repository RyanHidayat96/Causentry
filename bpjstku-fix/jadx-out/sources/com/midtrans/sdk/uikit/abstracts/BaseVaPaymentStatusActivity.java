package com.midtrans.sdk.uikit.abstracts;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.viewpager.widget.ViewPager;
import com.bpjstku.R;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.google.android.libraries.places.internal.zzbla;
import com.google.android.material.tabs.TabLayout;
import com.midtrans.sdk.corekit.core.PaymentType;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import com.midtrans.sdk.uikit.widgets.MagicViewPager;
import com.midtrans.sdk.uikit.widgets.SemiBoldTextView;
import defpackage.ViewPortBuilder;
import defpackage.deInitSession;
import defpackage.initSession;
import defpackage.sendCustomAction;
import defpackage.sortInDescendingOrder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseVaPaymentStatusActivity extends BasePaymentActivity {
    public FancyButton asInterface;
    private TabLayout cancelAll;
    public sortInDescendingOrder d;
    public MagicViewPager g;
    private SemiBoldTextView notify;
    private static final byte[] $$u = {87, -91, 60, 112};
    private static final int $$v = 54;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {6, 51, 46, 31, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$k = 79;
    private static int cancel = 0;
    private static int INotificationSideChannelStubProxy = 1;
    private static char[] onTransact = {60060, 60073, 60056, 59745, 60054, 60117, 60048, 60072, 60088, 60034, 60052, 60043, 60058, 60051, 60040, 60041, 60050, 60047, 60063, 60045, 60062, 60083, 60049, 60053, 60055};
    private static char INotificationSideChannel = 57188;

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(BaseVaPaymentStatusActivity baseVaPaymentStatusActivity) {
        int i = 2 % 2;
        int i2 = cancel + 79;
        INotificationSideChannelStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            baseVaPaymentStatusActivity.asInterface.setText(baseVaPaymentStatusActivity.getString(R.string.complete_payment_at_atm));
            baseVaPaymentStatusActivity.asInterface.setTextBold();
        } else {
            baseVaPaymentStatusActivity.asInterface.setText(baseVaPaymentStatusActivity.getString(R.string.complete_payment_at_atm));
            baseVaPaymentStatusActivity.asInterface.setTextBold();
            int i3 = 38 / 0;
        }
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
    private static void n(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = 196 - r8
            int r7 = r7 + 1
            byte[] r0 = com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity.$$j
            int r9 = r9 * 14
            int r9 = r9 + 84
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r5 = r2
            goto L2a
        L13:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L17:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            int r9 = r9 + 1
            if (r5 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r9]
        L2a:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity.n(byte, int, short, java.lang.Object[]):void");
    }

    public abstract void a();

    private static void m(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = onTransact;
        int i5 = 1770390596;
        Object obj2 = null;
        int i6 = 3;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = $10 + 93;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 93;
                $10 = i10 % 128;
                int i11 = i10 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i6;
                        byte b3 = (byte) (b2 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 2267, 33 - TextUtils.getOffsetBefore("", 0), -1927765101, false, $$w(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i9++;
                    i3 = 2;
                    i5 = 1770390596;
                    i6 = 3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(INotificationSideChannel)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b4 = (byte) 3;
                byte b5 = (byte) (b4 - 3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (MotionEvent.axisFromString("") + 1), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2268, 32 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1927765101, false, $$w(b4, b5, b5), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i12 = $11 + 25;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    i2 = i + 108;
                    cArr4[i2] = (char) (cArr[i2] + b);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        int i13 = $10 + 119;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char edgeSlop = (char) (49267 - (ViewConfiguration.getEdgeSlop() >> 16));
                            int defaultSize = 3261 - View.getDefaultSize(0, 0);
                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 30;
                            byte b6 = (byte) ($$v & 11);
                            byte b7 = (byte) (b6 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(edgeSlop, defaultSize, fadingEdgeLength, -127612708, false, $$w(b6, b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22878), 594 - Color.argb(0, 0, 0, 0), 18 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1570859318, false, $$w(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                            } else {
                                int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                            }
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    int i20 = $10 + 43;
                    $11 = i20 % 128;
                    int i21 = i20 % 2;
                    obj2 = obj;
                }
            }
            for (int i22 = 0; i22 < i; i22++) {
                cArr4[i22] = (char) (cArr4[i22] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 81;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        this.cancelAll.setSelectedTabIndicatorColor(((BaseActivity) this).b);
        int i4 = INotificationSideChannelStubProxy + 71;
        cancel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity
    public final void b(String str) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 31;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        this.notify.setText(str);
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = cancel + 53;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("bank.type");
        TransactionResponse transactionResponse = (TransactionResponse) getIntent().getSerializableExtra("bank.payment.result");
        if (stringExtra == null) {
            int i4 = INotificationSideChannelStubProxy + 45;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            stringExtra = "";
        }
        this.d = new sortInDescendingOrder(transactionResponse, stringExtra);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 43;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        this.notify = (SemiBoldTextView) findViewById(R.id.text_page_title);
        this.asInterface = (FancyButton) findViewById(R.id.button_primary);
        this.cancelAll = (TabLayout) findViewById(R.id.tab_instructions);
        this.g = (MagicViewPager) findViewById(R.id.pager_instruction);
        int i4 = INotificationSideChannelStubProxy + 99;
        cancel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:131:0x0b40  */
    /* JADX WARN: Code duplicated, block: B:164:0x0bb2  */
    /* JADX WARN: Code duplicated, block: B:165:0x0bb3  */
    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(int i) throws Throwable {
        byte b;
        ViewPager.OnPageChangeListener onPageChangeListener;
        Throwable cause;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        int i2 = 2 % 2;
        super.setContentView(i);
        this.g.setPageMargin(20);
        String str = this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        str.hashCode();
        str.hashCode();
        byte b2 = 0;
        switch (str.hashCode()) {
            case -1394897142:
                if (str.equals(PaymentType.BCA_VA)) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case -1384500083:
                if (str.equals(PaymentType.BNI_VA)) {
                    int i3 = cancel + 1;
                    INotificationSideChannelStubProxy = i3 % 128;
                    int i4 = i3 % 2;
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case -1380805999:
                if (str.equals(PaymentType.BRI_VA)) {
                    int i5 = cancel + 37;
                    INotificationSideChannelStubProxy = i5 % 128;
                    int i6 = i5 % 2;
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case -1171137990:
                if (str.equals(PaymentType.ALL_VA)) {
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            case -746273556:
                if (str.equals(PaymentType.PERMATA_VA)) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            case 669135102:
                if (str.equals("echannel")) {
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            default:
                b = -1;
                break;
        }
        this.g.setAdapter(new sendCustomAction(this, this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getSupportFragmentManager(), (b == 0 || b == 1 || b == 2 || b == 3) ? 3 : (b == 4 || b == 5) ? 2 : 0));
        this.g.clearOnPageChangeListeners();
        ViewPager.OnPageChangeListener onPageChangeListener2 = new ViewPager.OnPageChangeListener() { // from class: com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity.4
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrollStateChanged(int i7) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrolled(int i7, float f, int i8) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageSelected(int i7) {
                ViewPortBuilder.asInterface();
                try {
                    BaseVaPaymentStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(BaseVaPaymentStatusActivity.this);
                } finally {
                    ViewPortBuilder.d();
                }
            }
        };
        this.g.addOnPageChangeListener(onPageChangeListener2);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 46399), TextUtils.indexOf("", "", 0, 0) + 40, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i7 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        m(22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{'\r', 22, 19, 16, 11, 15, 15, '\b', 11, '\n', 6, '\b', 14, 19, 15, 22, 3, '\t', 20, 14, 1, 7}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.api_fail_message).substring(6, 7).codePointAt(0) - 37), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        m(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_list_header_atm_bersama).substring(0, 4).codePointAt(0) - 51, new char[]{21, 20, '\r', '\f', '\n', 24, 16, 3, 22, '\n', 22, 19, 19, 1, 13885}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 16), objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        int i8 = i7;
        long j = -1;
        long j2 = j ^ (-415803596372405106L);
        long startUptimeMillis = (int) Process.getStartUptimeMillis();
        long j3 = TypedValues.AttributesType.TYPE_PIVOT_TARGET;
        long j4 = startUptimeMillis ^ j;
        long j5 = (((long) 319) * 2513060771114364093L) + (((long) (-317)) * (-415803596372405106L)) + (((long) (-318)) * (j2 | (((j ^ 2513060771114364093L) | startUptimeMillis) ^ j))) + ((((j2 | startUptimeMillis) ^ j) | ((j4 | (-361712980645266241L)) ^ j)) * j3) + (j3 * ((((j2 | j4) | 2513060771114364093L) ^ j) | (j ^ ((-361712980645266241L) | startUptimeMillis))));
        int i9 = 0;
        while (true) {
            int i10 = 8;
            if (i9 != 10) {
                int i11 = INotificationSideChannelStubProxy + 57;
                cancel = i11 % 128;
                int i12 = i11 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37835 - ExpandableListView.getPackedPositionChild(0L)), 58 - TextUtils.indexOf((CharSequence) "", '0', 0), 18 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i13 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                int i14 = 0;
                long j6 = jLongValue;
                while (true) {
                    int i15 = 0;
                    while (i15 != i10) {
                        i13 = (((((int) (j6 >> i15)) & 255) + (i13 << 6)) + (i13 << 16)) - i13;
                        i15++;
                        onPageChangeListener2 = onPageChangeListener2;
                        i10 = 8;
                    }
                    onPageChangeListener = onPageChangeListener2;
                    if (i14 == 0) {
                        i14++;
                        j6 = j5;
                        onPageChangeListener2 = onPageChangeListener;
                        i10 = 8;
                    } else {
                        int i16 = i8;
                        if (i13 != i16) {
                            int i17 = INotificationSideChannelStubProxy + 51;
                            cancel = i17 % 128;
                            int i18 = i17 % 2;
                            jLongValue -= 1024;
                            i9++;
                            i8 = i16;
                            onPageChangeListener2 = onPageChangeListener;
                        }
                    }
                }
            } else {
                onPageChangeListener = onPageChangeListener2;
                Object[] objArr3 = new Object[1];
                m(TextUtils.indexOf("", "", 0, 0) + 16, new char[]{2, 17, 17, 14, '\t', 20, '\r', 22, 5, '\n', '\b', 5, '\f', 19, 24, 0}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.offer_not_applied).substring(8, 9).codePointAt(0) - 69), objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                m(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step2).substring(15, 16).length() + 15, new char[]{17, 19, 21, 24, 18, 17, 19, 7, 22, 11, '\n', 14, 5, '\r', 15, 23}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.ef_video).substring(0, 5).length() + 33), objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {-438517025};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 46038), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1133, TextUtils.indexOf((CharSequence) "", '0') + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 748486307, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr5), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int i19 = 1031 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int i20 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14;
                        byte[] bArr = $$j;
                        Object[] objArr7 = new Object[1];
                        n((byte) (bArr[1] + 1), (short) 193, bArr[7], objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cCombineMeasuredStates, i19, i20, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.getOffsetBefore("", 0) + 45993), KeyEvent.getDeadChar(0, 0) + 1117, 17 - Color.argb(0, 0, 0, 0)), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6);
                    int i21 = ((int[]) objArr8[1])[0];
                    int i22 = ((int[]) objArr8[3])[0];
                    if (i22 != i21) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[0];
                        if (strArr != null) {
                            int i23 = INotificationSideChannelStubProxy + 59;
                            cancel = i23 % 128;
                            int i24 = i23 % 2;
                            for (String str2 : strArr) {
                                arrayList.add(str2);
                            }
                        }
                        Toast.makeText((Context) null, i22 / (((i22 - 1) * i22) % 2), 0).show();
                    }
                } catch (Throwable th) {
                    th = th;
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        final ViewPager.OnPageChangeListener onPageChangeListener3 = onPageChangeListener;
        this.g.post(new Runnable() { // from class: com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity.5
            @Override // java.lang.Runnable
            public final void run() {
                onPageChangeListener3.onPageSelected(BaseVaPaymentStatusActivity.this.g.getCurrentItem());
            }
        });
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29944);
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1756;
            int mode = 23 - View.MeasureSpec.getMode(0);
            Object[] objArr9 = new Object[1];
            n((byte) 37, (short) 141, $$j[7], objArr9);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(windowTouchSlop, packedPositionChild, mode, 986134021, false, (String) objArr9[0], null);
        }
        long j7 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).getLong(null);
        Object[] objArr10 = new Object[1];
        m((ViewConfiguration.getPressedStateDuration() >> 16) + 22, new char[]{'\r', 22, 19, 16, 11, 15, 15, '\b', 11, '\n', 6, '\b', 14, 19, 15, 22, 3, '\t', 20, 14, 1, 7}, (byte) (67 - TextUtils.indexOf((CharSequence) "", '0')), objArr10);
        Class<?> cls3 = Class.forName((String) objArr10[0]);
        Object[] objArr11 = new Object[1];
        m(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, new char[]{21, 20, '\r', '\f', '\n', 24, 16, 3, 22, '\n', 22, 19, 19, 1, 13885}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 26), objArr11);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29943);
            int maximumFlingVelocity = 1755 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 24;
            byte[] bArr2 = $$j;
            byte b3 = (byte) (bArr2[1] + 1);
            Object[] objArr12 = new Object[1];
            n(b3, (short) (b3 << 1), bArr2[7], objArr12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, maximumFlingVelocity, iIndexOf, 1596667560, false, (String) objArr12[0], null);
        }
        if (j7 == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char keyRepeatDelay = (char) (29944 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1755;
                int threadPriority = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                byte[] bArr3 = $$j;
                byte b4 = (byte) (bArr3[1] + 1);
                Object[] objArr13 = new Object[1];
                n(b4, b4, bArr3[7], objArr13);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(keyRepeatDelay, maximumDrawingCacheSize, threadPriority, 1599039318, false, (String) objArr13[0], null);
            }
            Object[] objArr14 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr14[0])[0]}, new int[]{((int[]) objArr14[1])[0]}, (Object[]) objArr14[2], new int[1], (String[]) objArr14[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_with_prima).substring(1, 3).codePointAt(0) + 1675327212;
            int i25 = 1186260079 + (((~((-334796599) | iCodePointAt)) | 54558772 | (~((-122194173) | iCodePointAt))) * (-754));
            int i26 = ~((-54558773) | iCodePointAt);
            int i27 = ~iCodePointAt;
            int i28 = i25 + ((i26 | (~((-67635401) | i27))) * (-754)) + ((i27 | (-334796599)) * 754) + 672455569;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i30 ^ (i30 << 5);
        } else {
            Object[] objArr15 = new Object[1];
            m(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.klikbca_instruction_2).substring(3, 4).codePointAt(0) - 81, new char[]{2, 17, 17, 14, '\t', 20, '\r', 22, 5, '\n', '\b', 5, '\f', 19, 24, 0}, (byte) (31 - Color.red(0)), objArr15);
            Class<?> cls4 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            m(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step4).substring(7, 8).codePointAt(0) - 16, new char[]{17, 19, 21, 24, 18, 17, 19, 7, 22, 11, '\n', 14, 5, '\r', 15, 23}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.place_photo_viewer_previous_image_button_content_description).substring(0, 19).length() + 19), objArr16);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr17 = {-2114476995};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (42049 - (Process.myPid() >> 22)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1725, TextUtils.getOffsetAfter("", 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).newInstance(objArr17), 672455569);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char c2 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29944);
                    int modifierMetaStateMask = 1754 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int iIndexOf2 = 22 - TextUtils.indexOf((CharSequence) "", '0');
                    byte[] bArr4 = $$j;
                    byte b5 = (byte) (bArr4[1] + 1);
                    Object[] objArr18 = new Object[1];
                    n(b5, b5, bArr4[7], objArr18);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, modifierMetaStateMask, iIndexOf2, 1599039318, false, (String) objArr18[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr19 = new Object[1];
                    m(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_bank_transfer).substring(1, 3).length() + 20, new char[]{'\r', 22, 19, 16, 11, 15, 15, '\b', 11, '\n', 6, '\b', 14, 19, 15, 22, 3, '\t', 20, 14, 1, 7}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step4).substring(0, 1).length() + 67), objArr19);
                    Class<?> cls5 = Class.forName((String) objArr19[0]);
                    Object[] objArr20 = new Object[1];
                    m(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, new char[]{21, 20, '\r', '\f', '\n', 24, 16, 3, 22, '\n', 22, 19, 19, 1, 13885}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_unknown_error_while_encrypting_data).substring(0, 39).length() + 23), objArr20);
                    long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 29944);
                        int i31 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1755;
                        int iResolveSize = View.resolveSize(0, 0) + 23;
                        byte[] bArr5 = $$j;
                        byte b6 = (byte) (bArr5[1] + 1);
                        Object[] objArr21 = new Object[1];
                        n(b6, (short) (b6 << 1), bArr5[7], objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cNormalizeMetaState, i31, iResolveSize, 1596667560, false, (String) objArr21[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16807160);
                        int pressedStateDuration = 1755 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23;
                        Object[] objArr22 = new Object[1];
                        n((byte) 37, (short) 141, $$j[7], objArr22);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cRgb, pressedStateDuration, maximumFlingVelocity2, 986134021, false, (String) objArr22[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                th = th2;
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i32 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i33 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i33 == i32) {
            int i34 = INotificationSideChannelStubProxy + 25;
            cancel = i34 % 128;
            int i35 = i34 % 2;
            int i36 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr23 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i37 = i36 + ((((~((-69773314) | iIdentityHashCode)) | (-394050272)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 533398364) + ((~((~iIdentityHashCode) | (-69773314))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr23[3])[0] = i39 ^ (i39 << 5);
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr2 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr2 != null) {
                for (String str3 : strArr2) {
                    arrayList2.add(str3);
                }
            }
            int[] iArr = new int[i33];
            int i40 = i33 - 1;
            iArr[i40] = 1;
            Toast.makeText((Context) null, iArr[((i33 * i40) % 2) - 1], 1).show();
            int i41 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr24 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i42 = (-273699201) + ((iElapsedRealtime | 359136234) * (-50));
            int i43 = ~((-356782667) | iElapsedRealtime);
            int i44 = ~iElapsedRealtime;
            int i45 = i41 + i42 + ((i43 | (~(503316474 | i44))) * 50) + (((~(i44 | 359136234)) | (~(146533808 | i44)) | (-503316475)) * 50);
            int i46 = (i45 << 13) ^ i45;
            int i47 = i46 ^ (i46 >>> 17);
            ((int[]) objArr24[3])[0] = i47 ^ (i47 << 5);
        }
        this.cancelAll.setupWithViewPager(this.g);
        this.cancelAll.addOnTabSelectedListener((TabLayout.BaseOnTabSelectedListener) new TabLayout.OnTabSelectedListener() { // from class: com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity.3
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabSelected(TabLayout.Tab tab) throws Throwable {
                BaseVaPaymentStatusActivity.this.g.setCurrentItem(tab.getPosition());
                BaseVaPaymentStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(BaseVaPaymentStatusActivity.this);
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabUnselected(TabLayout.Tab tab) {
            }
        });
        a();
        String str4 = this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        str4.hashCode();
        str4.hashCode();
        switch (str4.hashCode()) {
            case -1394897142:
                if (!str4.equals(PaymentType.BCA_VA)) {
                    b2 = -1;
                }
                break;
            case -1384500083:
                if (str4.equals(PaymentType.BNI_VA)) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
                break;
            case -1380805999:
                if (str4.equals(PaymentType.BRI_VA)) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
                break;
            case -1171137990:
                if (str4.equals(PaymentType.ALL_VA)) {
                    b2 = 3;
                } else {
                    b2 = -1;
                }
                break;
            case -746273556:
                if (str4.equals(PaymentType.PERMATA_VA)) {
                    b2 = 4;
                } else {
                    b2 = -1;
                }
                break;
            case 669135102:
                if (str4.equals("echannel")) {
                    b2 = 5;
                } else {
                    b2 = -1;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            this.notify.setText(getString(R.string.bank_bca_transfer));
            return;
        }
        if (b2 == 1) {
            this.notify.setText(getString(R.string.bank_bni_transfer));
            return;
        }
        if (b2 == 2) {
            this.notify.setText(getString(R.string.bank_bri_transfer));
            return;
        }
        if (b2 == 3) {
            this.notify.setText(getString(R.string.other_bank_transfer));
        } else if (b2 == 4) {
            this.notify.setText(getString(R.string.bank_permata_transfer));
        } else {
            if (b2 != 5) {
                return;
            }
            this.notify.setText(getString(R.string.mandiri_bill_transfer));
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maxKeyCode = (char) (29944 - (KeyEvent.getMaxKeyCode() >> 16));
            int edgeSlop = 1755 - (ViewConfiguration.getEdgeSlop() >> 16);
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 23;
            Object[] objArr2 = new Object[1];
            n((byte) 37, (short) 141, $$j[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode, edgeSlop, offsetAfter, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char fadingEdgeLength = (char) (29944 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                int i2 = 1756 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int i3 = 23 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr = $$j;
                byte b = (byte) (bArr[1] + 1);
                Object[] objArr3 = new Object[1];
                n(b, b, bArr[7], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, i2, i3, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iNextInt = new Random().nextInt(2134506175);
            int i4 = ~iNextInt;
            int i5 = 1189776958 + (((~((-7167012) | i4)) | 205435414) * (-90)) + (((~((-7167012) | iNextInt)) | (-209714744)) * (-45)) + (((~(iNextInt | (-205435415))) | (-7167012) | (~(i4 | 205435414))) * 45) + 1933056856;
            int i6 = i5 ^ (i5 << 13);
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            m(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_at_atm).substring(4, 5).codePointAt(0) - 99, new char[]{2, 17, 17, 14, '\t', 20, '\r', 22, 5, '\n', '\b', 5, '\f', 19, 24, 0}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indomaret_instruction_step4).substring(45, 46).length() + 30), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            m(16 - Color.argb(0, 0, 0, 0), new char[]{17, 19, 21, 24, 18, 17, 19, 7, 22, 11, '\n', 14, 5, '\r', 15, 23}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.title_payment_successful).substring(0, 1).length() + 37), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {114827866};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), Process.getGidForName("") + 1727, 29 - (ViewConfiguration.getLongPressTimeout() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = zzbla.TuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 1933056856, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 29944);
                    int fadingEdgeLength2 = 1755 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24;
                    byte[] bArr2 = $$j;
                    byte b2 = (byte) (bArr2[1] + 1);
                    Object[] objArr8 = new Object[1];
                    n(b2, b2, bArr2[7], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveOpacity, fadingEdgeLength2, iIndexOf, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    m(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notificationOpenAppToActivateBody).substring(0, 65).codePointAt(44) - 89, new char[]{'\r', 22, 19, 16, 11, 15, 15, '\b', 11, '\n', 6, '\b', 14, 19, 15, 22, 3, '\t', 20, 14, 1, 7}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 57), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    m(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indomaret_instruction_step6).substring(20, 21).length() + 14, new char[]{21, 20, '\r', '\f', '\n', 24, 16, 3, 22, '\n', 22, 19, 19, 1, 13885}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 54), objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cCombineMeasuredStates = (char) (29944 - View.combineMeasuredStates(0, 0));
                        int capsMode = 1755 - TextUtils.getCapsMode("", 0, 0);
                        int i8 = 24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte[] bArr3 = $$j;
                        byte b3 = (byte) (bArr3[1] + 1);
                        Object[] objArr11 = new Object[1];
                        n(b3, (short) (b3 << 1), bArr3[7], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates, capsMode, i8, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) (29945 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1755;
                        int scrollBarSize = 23 - (ViewConfiguration.getScrollBarSize() >> 8);
                        Object[] objArr12 = new Object[1];
                        n((byte) 37, (short) 141, $$j[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iMakeMeasureSpec, scrollBarSize, 986134021, false, (String) objArr12[0], null);
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
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0];
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0];
        if (i10 == i9) {
            int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4]};
            int i12 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i13 = i11 + 604551085 + (((~(i12 | 1008433260)) | 795830834) * (-668)) + ((1008433260 | (~(795830834 | i12))) * 1336) + ((i12 | 1065319038) * 668);
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr13[3])[0] = i15 ^ (i15 << 5);
            int i16 = cancel + 19;
            INotificationSideChannelStubProxy = i16 % 128;
            int i17 = i16 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4];
            if (strArr != null) {
                int i18 = INotificationSideChannelStubProxy + 21;
                cancel = i18 % 128;
                int i19 = i18 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
            int i20 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i21 = ~iIdentityHashCode;
            int i22 = i20 + (((1566088347 + (((~((-105328362) | i21)) | (~((-107274065) | iIdentityHashCode))) * (-370))) + ((((~(iIdentityHashCode | (-105328362))) | (~(i21 | (-107274065)))) | (-107479034)) * (-370))) - 1112536916);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr14[3])[0] = i24 ^ (i24 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int i25 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1030;
            int iBlue = 15 - Color.blue(0);
            byte[] bArr4 = $$j;
            Object[] objArr15 = new Object[1];
            n((byte) (bArr4[1] + 1), (short) 193, bArr4[7], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(pressedStateDuration, i25, iBlue, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        m(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, new char[]{'\r', 22, 19, 16, 11, 15, 15, '\b', 11, '\n', 6, '\b', 14, 19, 15, 22, 3, '\t', 20, 14, 1, 7}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 48), objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        m(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_now).substring(1, 3).codePointAt(1) - 106, new char[]{21, 20, '\r', '\f', '\n', 24, 16, 3, 22, '\n', 22, 19, 19, 1, 13885}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 51), objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
            int i26 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1030;
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15;
            byte[] bArr5 = $$j;
            byte b4 = (byte) (bArr5[1] + 1);
            Object[] objArr18 = new Object[1];
            n(b4, b4, bArr5[7], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, i26, maximumFlingVelocity, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                int packedPositionGroup2 = 1031 - ExpandableListView.getPackedPositionGroup(0L);
                int minimumFlingVelocity = 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                byte[] bArr6 = $$j;
                byte b5 = bArr6[7];
                Object[] objArr19 = new Object[1];
                n(b5, b5, bArr6[5], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(packedPositionGroup, packedPositionGroup2, minimumFlingVelocity, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr20[3])[0];
            int i28 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iNextInt2 = new Random().nextInt(486834355);
            int i29 = ((129314555 + (((~(iNextInt2 | (-474059477))) | 718339646) * 191)) + (((~((~iNextInt2) | (-474059477))) | 138449428) * 191)) - 907436093;
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr[2])[0] = i31 ^ (i31 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            m(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_dialog_screen_warning_text_blur_image).substring(30, 31).codePointAt(0) - 16, new char[]{2, 17, 17, 14, '\t', 20, '\r', 22, 5, '\n', '\b', 5, '\f', 19, 24, 0}, (byte) (ImageFormat.getBitsPerPixel(0) + 32), objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            m(TextUtils.lastIndexOf("", '0') + 17, new char[]{17, 19, 21, 24, 18, 17, 19, 7, 22, 11, '\n', 14, 5, '\r', 15, 23}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step2).substring(0, 3).length() + 35), objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {114827866};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46037 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), View.resolveSizeAndState(0, 0, 0) + 1134, Drawable.resolveOpacity(0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -907436093, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int i32 = 1031 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int trimmedLength = 15 - TextUtils.getTrimmedLength("");
                byte[] bArr7 = $$j;
                Object[] objArr25 = new Object[1];
                n((byte) (bArr7[1] + 1), (short) 193, bArr7[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(scrollBarFadeDuration, i32, trimmedLength, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Process.getGidForName("") + 45994), 1117 - KeyEvent.getDeadChar(0, 0), Color.rgb(0, 0, 0) + 16777233), Boolean.TYPE});
            }
            Object[] objArr26 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int i33 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1030;
                int i34 = 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                byte[] bArr8 = $$j;
                byte b6 = bArr8[7];
                Object[] objArr27 = new Object[1];
                n(b6, b6, bArr8[5], objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(tapTimeout, i33, i34, 632103528, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr26);
            try {
                Object[] objArr28 = new Object[1];
                m(TextUtils.indexOf("", "", 0) + 22, new char[]{'\r', 22, 19, 16, 11, 15, 15, '\b', 11, '\n', 6, '\b', 14, 19, 15, 22, 3, '\t', 20, 14, 1, 7}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_card_atm_bersama).substring(52, 57).codePointAt(3) - 9), objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                m(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 97, new char[]{21, 20, '\r', '\f', '\n', 24, 16, 3, 22, '\n', 22, 19, 19, 1, 13885}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 51), objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                    int iBlue2 = Color.blue(0) + 1031;
                    int packedPositionType = 15 - ExpandableListView.getPackedPositionType(0L);
                    byte[] bArr9 = $$j;
                    byte b7 = (byte) (bArr9[1] + 1);
                    Object[] objArr30 = new Object[1];
                    n(b7, b7, bArr9[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cLastIndexOf, iBlue2, packedPositionType, 1344079056, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                    int iCombineMeasuredStates = 1031 - View.combineMeasuredStates(0, 0);
                    int mode = 15 - View.MeasureSpec.getMode(0);
                    byte[] bArr10 = $$j;
                    Object[] objArr31 = new Object[1];
                    n((byte) (bArr10[1] + 1), (short) 193, bArr10[7], objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, iCombineMeasuredStates, mode, 1357589585, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr = objArr26;
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
                for (String str2 : strArr3) {
                    arrayList2.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i36));
        }
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i37 = ((int[]) objArr[2])[0];
        int i38 = ((int[]) objArr[3])[0];
        int i39 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i40 = ~iMaxMemory;
        int i41 = i37 + (-178340663) + ((iMaxMemory | 393217) * 988) + (((~(422827 | i40)) | 243827732) * (-1976)) + (((~(iMaxMemory | (-243857343))) | 393217 | (~(243857342 | i40))) * 988);
        int i42 = (i41 << 13) ^ i41;
        int i43 = i42 ^ (i42 >>> 17);
        ((int[]) objArr32[2])[0] = i43 ^ (i43 << 5);
        int i44 = INotificationSideChannelStubProxy + 87;
        cancel = i44 % 128;
        if (i44 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = cancel + 79;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 121;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = cancel + 111;
        INotificationSideChannelStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = cancel + 57;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$w(int r6, byte r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r0 = com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity.$$u
            int r6 = 116 - r6
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r7]
        L24:
            int r7 = r7 + 1
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.abstracts.BaseVaPaymentStatusActivity.$$w(int, byte, byte):java.lang.String");
    }
}
