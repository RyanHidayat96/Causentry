package com.midtrans.sdk.uikit.views.xl_tunai;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemProgramChosenBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.midtrans.sdk.corekit.core.MidtransSDK;
import com.midtrans.sdk.uikit.activities.BaseActivity;
import com.midtrans.sdk.uikit.widgets.SemiBoldTextView;
import defpackage.CameraUseCaseAdapter;
import defpackage.ViewPortBuilder;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.deInitSession;
import defpackage.getConfigs;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class XlTunaiInstructionActivity extends BaseActivity {
    private Toolbar TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
    private static final byte[] $$m = {57, -56, 23, -36};
    private static final int $$n = 21;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {119, -102, -34, -3, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$h = 94;
    private static int d = 0;
    private static int asInterface = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {60049, 60062, 60083, 60055, 60072, 60034, 60048, 60058, 60053, 60063, 60073, 60041, 60117, 60043, 60047, 60057, 60052, 60054, 60060, 60045, 60040, 60050, 60056, 60088, 60051};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 57188;

    private static void k(byte b, short s, short s2, Object[] objArr) {
        byte[] bArr = $$g;
        int i = 98 - (b * 14);
        int i2 = 197 - s2;
        byte[] bArr2 = new byte[s + 1];
        int i3 = -1;
        if (bArr == null) {
            i = (i + s) - 11;
            i2++;
        }
        while (true) {
            i3++;
            bArr2[i3] = (byte) i;
            if (i3 == s) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i = (i + bArr[i2]) - 11;
                i2++;
            }
        }
    }

    @Override // com.midtrans.sdk.uikit.activities.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iMyPid = Process.myPid();
        int i3 = ~((-50948653) | iMyPid);
        int i4 = ~iMyPid;
        if (i2 != (-1745625752) + ((i3 | (~(i4 | 1070297023))) * 920) + (((~((-189360829) | i4)) | 50948652) * 920) + (((~(iMyPid | 1070297023)) | (~((-50948653) | i4)) | (~((-138412177) | iMyPid))) * 920)) {
            throw new RuntimeException("637869332");
        }
        int i5 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i6 = ~iIdentityHashCode;
        if (i5 != (-1091459136) + (((~((-1672408524) | i6)) | 906647441) * 226) + (((~(i6 | (-1101310027))) | (~((-906647442) | iIdentityHashCode)) | 335548944) * (-113)) + ((~(iIdentityHashCode | (-1672408524))) * 113)) {
            throw new RuntimeException("-1975411550");
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_instruction_xl_tunai);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (Toolbar) findViewById(R.id.main_toolbar);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Drawable drawable = ContextCompat.getDrawable(this, 2131231150);
        drawable.setColorFilter(ContextCompat.getColor(this, R.color.dark_gray), PorterDuff.Mode.MULTIPLY);
        ((SemiBoldTextView) findViewById(R.id.text_page_title)).setText(getString(R.string.xl_tunai_payment_instruction));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setNavigationIcon(drawable);
        setSupportActionBar(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        if (getSupportActionBar() != null) {
            int i7 = d + 23;
            asInterface = i7 % 128;
            if (i7 % 2 == 0) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            } else {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        }
        if (((BaseActivity) this).b) {
            int i8 = asInterface + 101;
            d = i8 % 128;
            int i9 = i8 % 2;
            Toolbar toolbar = (Toolbar) findViewById(R.id.main_toolbar);
            if (toolbar != null) {
                int i10 = d + 1;
                asInterface = i10 % 128;
                int i11 = i10 % 2;
                AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) toolbar.getLayoutParams();
                ((ViewGroup.LayoutParams) layoutParams).height += (int) getResources().getDimension(R.dimen.toolbar_expansion_size);
                toolbar.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(menuItem);
        try {
            if (menuItem.getItemId() == 16908332) {
                finish();
                if (MidtransSDK.getInstance().getUIKitCustomSetting() != null) {
                    int i2 = d + 35;
                    asInterface = i2 % 128;
                    if (i2 % 2 == 0) {
                        MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (!(!MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation())) {
                        overridePendingTransition(R.anim.slide_in_back, R.anim.slide_out_back);
                        int i3 = d + 117;
                        asInterface = i3 % 128;
                        int i4 = i3 % 2;
                    }
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static void l(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
        char c = '0';
        int i4 = 1770390596;
        Object obj2 = null;
        int i5 = 3;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i5;
                        byte b3 = (byte) (b2 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.blue(0), TextUtils.indexOf("", c, 0, 0) + 2268, 33 - (Process.myPid() >> 22), -1927765101, false, $$s(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    c = '0';
                    i4 = 1770390596;
                    i5 = 3;
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
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b4 = (byte) 3;
                byte b5 = (byte) (b4 - 3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 2267 - ExpandableListView.getPackedPositionType(0L), 33 - KeyEvent.keyCodeFromString(""), -1927765101, false, $$s(b4, b5, b5), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i7 = $10 + 111;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    i2 = i + 50;
                    cArr4[i2] = (char) (cArr[i2] * b);
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
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 2;
                                byte b7 = (byte) (b6 - 2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 49267), 3261 - TextUtils.getOffsetAfter("", 0), 29 - TextUtils.indexOf((CharSequence) "", '0'), -127612708, false, $$s(b6, b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                int i8 = $10 + 19;
                                $11 = i8 % 128;
                                int i9 = i8 % 2;
                                try {
                                    Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        byte b8 = (byte) 0;
                                        byte b9 = b8;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.alpha(0) + 22878), (ViewConfiguration.getEdgeSlop() >> 16) + 594, View.MeasureSpec.getMode(0) + 17, 1570859318, false, $$s(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                    int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i10];
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } else {
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i11 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i11];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                                } else {
                                    int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                                }
                            }
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    obj2 = obj;
                }
            }
            int i15 = 0;
            while (i15 < i) {
                int i16 = $11 + 17;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    cArr4[i15] = (char) (cArr4[i15] ^ 5202);
                    i15 += 43;
                } else {
                    cArr4[i15] = (char) (cArr4[i15] ^ 13722);
                    i15++;
                }
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }

    @Override // com.midtrans.sdk.uikit.activities.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionGroup = (char) (29944 - ExpandableListView.getPackedPositionGroup(0L));
            int i2 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1754;
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 23;
            byte b = $$g[28];
            Object[] objArr2 = new Object[1];
            k(b, (byte) (b | 36), (short) 193, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup, i2, iNormalizeMetaState, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cBlue = (char) (Color.blue(0) + 29944);
                int iAlpha = 1755 - Color.alpha(0);
                int i3 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22;
                Object[] objArr3 = new Object[1];
                k($$g[28], (byte) 52, (short) 156, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, iAlpha, i3, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrB$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
            int i5 = (((((~((-570558721) | i4)) | (-935206779)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1782313744) + ((~((~i4) | (-570558721))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) - 1529642308;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i7 ^ (i7 << 5);
            int i8 = d + 17;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
        } else {
            Object[] objArr5 = new Object[1];
            l(16 - TextUtils.indexOf("", ""), new char[]{2, 5, 17, '\t', '\r', 2, '\b', '\t', 17, '\r', 0, '\t', 24, '\n', 2, 16}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            l(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, new char[]{24, 6, 3, 6, 11, 24, '\n', '\t', 7, '\f', 21, 20, 21, 18, 6, 4}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_confirm_button).substring(1, 3).length() + 66), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {2015575205};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42050 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1725 - ExpandableListView.getPackedPositionChild(0L), (KeyEvent.getMaxKeyCode() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$5f1425da = ItemProgramChosenBinding.b$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -1529642308);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29943);
                    int iAxisFromString = MotionEvent.axisFromString("") + 1756;
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23;
                    Object[] objArr8 = new Object[1];
                    k($$g[28], (byte) 52, (short) 156, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iAxisFromString, doubleTapTimeout, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    l(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cimb_instruction_step2).substring(0, 6).length() + 16, new char[]{'\b', '\t', 6, 14, 21, 1, 7, 14, 15, 21, 14, 2, '\n', 0, 11, 4, 18, 22, 1, 18, 21, 7}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 3), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    l((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14, new char[]{2, 4, '\b', '\f', 21, 0, 5, 14, 2, 6, 4, '\r', 22, 16, 13904}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_internet_instruction_4).substring(3, 4).length() + 80), objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cAlpha = (char) (29944 - Color.alpha(0));
                        int maximumFlingVelocity = 1755 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int i10 = 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte b2 = (byte) 52;
                        Object[] objArr11 = new Object[1];
                        k($$g[28], b2, (short) (b2 << 1), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha, maximumFlingVelocity, i10, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cNormalizeMetaState = (char) (29944 - KeyEvent.normalizeMetaState(0));
                        int scrollBarFadeDuration = 1755 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 23;
                        byte b3 = $$g[28];
                        Object[] objArr12 = new Object[1];
                        k(b3, (byte) (b3 | 36), (short) 193, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cNormalizeMetaState, scrollBarFadeDuration, deadChar, 986134021, false, (String) objArr12[0], null);
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
        int i11 = ((int[]) objArrB$5f1425da[1])[0];
        int i12 = ((int[]) objArrB$5f1425da[0])[0];
        if (i12 != i11) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$5f1425da[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i12));
        }
        int i13 = ((int[]) objArrB$5f1425da[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrB$5f1425da[0])[0]}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int iMyTid = Process.myTid();
        int i14 = i13 + 1010136612 + (((~((~iMyTid) | 317583950)) | 67109904) * 529) + (((~(iMyTid | 317583950)) | 104981524) * 529);
        int i15 = (i14 << 13) ^ i14;
        int i16 = i15 ^ (i15 >>> 17);
        ((int[]) objArr13[3])[0] = i16 ^ (i16 << 5);
        int i17 = asInterface + 121;
        d = i17 % 128;
        int i18 = i17 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char gidForName = (char) (Process.getGidForName("") + 1);
            int iIndexOf = 1031 - TextUtils.indexOf("", "", 0);
            int iRgb = (-16777201) - Color.rgb(0, 0, 0);
            byte b4 = (byte) 52;
            Object[] objArr14 = new Object[1];
            k($$g[28], b4, b4, objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(gidForName, iIndexOf, iRgb, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        l(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, new char[]{'\b', '\t', 6, 14, 21, 1, 7, 14, 15, 21, 14, 2, '\n', 0, 11, 4, 18, 22, 1, 18, 21, 7}, (byte) (40 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        l(15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{2, 4, '\b', '\f', 21, 0, 5, 14, 2, 6, 4, '\r', 22, 16, 13904}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_dialog_screen_warning_text_blur_image).substring(30, 31).length() + 80), objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
            int mirror = AndroidCharacter.getMirror('0') + 983;
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 15;
            Object[] objArr17 = new Object[1];
            k($$g[28], (byte) 52, (short) 156, objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(capsMode, mirror, touchSlop, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int iMakeMeasureSpec = 1031 - View.MeasureSpec.makeMeasureSpec(0, 0);
                int scrollBarFadeDuration2 = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte b5 = $$g[7];
                byte b6 = b5;
                Object[] objArr18 = new Object[1];
                k(b5, b6, b6, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(windowTouchSlop, iMakeMeasureSpec, scrollBarFadeDuration2, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i19 = ((int[]) objArr19[3])[0];
            int i20 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int i21 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            int i22 = ~i21;
            int i23 = ((((-772379915) + (((~(i21 | (-59868325))) | ((~((-270561291) | i22)) | 26281120)) * (-68))) + ((~((-33587205) | i22)) * (-68))) + (((~(59868324 | i22)) | (-304148495)) * 68)) - 1799263005;
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr[2])[0] = i25 ^ (i25 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            l(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_bri).substring(1, 3).length() + 14, new char[]{2, 5, 17, '\t', '\r', 2, '\b', '\t', 17, '\r', 0, '\t', 24, '\n', 2, 16}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1), objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            l(16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{24, 6, 3, 6, 11, 24, '\n', '\t', 7, '\f', 21, 20, 21, 18, 6, 4}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 44), objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {2015575205};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - (ViewConfiguration.getScrollBarSize() >> 8)), 1134 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -1799263005, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1031;
                int iRgb2 = Color.rgb(0, 0, 0) + 16777231;
                byte b7 = (byte) 52;
                Object[] objArr24 = new Object[1];
                k($$g[28], b7, b7, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(maxKeyCode, jumpTapTimeout, iRgb2, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 45992), 1117 - KeyEvent.normalizeMetaState(0), KeyEvent.getDeadChar(0, 0) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                int mode = View.MeasureSpec.getMode(0) + 1031;
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15;
                byte b8 = $$g[7];
                byte b9 = b8;
                Object[] objArr25 = new Object[1];
                k(b8, b9, b9, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(fadingEdgeLength, mode, scrollDefaultDelay, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                l(23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{'\b', '\t', 6, 14, 21, 1, 7, 14, 15, 21, 14, 2, '\n', 0, 11, 4, 18, 22, 1, 18, 21, 7}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_network_error).substring(0, 13).length() + 26), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                l((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, new char[]{2, 4, '\b', '\f', 21, 0, 5, 14, 2, 6, 4, '\r', 22, 16, 13904}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 45), objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char gidForName2 = (char) (Process.getGidForName("") + 1);
                    int iMyPid = 1031 - (Process.myPid() >> 22);
                    int iGreen = 15 - Color.green(0);
                    Object[] objArr28 = new Object[1];
                    k($$g[28], (byte) 52, (short) 156, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(gidForName2, iMyPid, iGreen, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                    int iIndexOf2 = 1031 - TextUtils.indexOf("", "", 0);
                    int iResolveSize = View.resolveSize(0, 0) + 15;
                    byte b10 = (byte) 52;
                    Object[] objArr29 = new Object[1];
                    k($$g[28], b10, b10, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cLastIndexOf, iIndexOf2, iResolveSize, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i26 = ((int[]) objArr[1])[0];
        int i27 = ((int[]) objArr[3])[0];
        if (i27 == i26) {
            int i28 = asInterface + 77;
            d = i28 % 128;
            int i29 = i28 % 2;
            Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i30 = ((int[]) objArr[2])[0];
            int i31 = ((int[]) objArr[3])[0];
            int i32 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i33 = i30 + (((506352034 + (((-67239957) | iIdentityHashCode) * (-381))) + (((~((~iIdentityHashCode) | 167575531)) | (-225350806)) * 381)) - 151380540);
            int i34 = i33 ^ (i33 << 13);
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr30[2])[0] = i35 ^ (i35 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str2 : strArr4) {
                int i36 = d + 93;
                asInterface = i36 % 128;
                int i37 = i36 % 2;
                arrayList2.add(str2);
            }
        }
        Toast.makeText((Context) null, i27 / (((i27 - 1) * i27) % 2), 0).show();
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i38 = ((int[]) objArr[2])[0];
        int i39 = ((int[]) objArr[3])[0];
        int i40 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        int i41 = i38 + ((((-32342713) + (((~layoutDirection) | 529591722) * 1444)) + (((~(layoutDirection | (-685953329))) | ((~(930233498 | layoutDirection)) | 142655776)) * (-1444))) - 113134662);
        int i42 = (i41 << 13) ^ i41;
        int i43 = i42 ^ (i42 >>> 17);
        ((int[]) objArr31[2])[0] = i43 ^ (i43 << 5);
    }

    @Override // com.midtrans.sdk.uikit.activities.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        d = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        if (i4 != 992528308 + (((~(i5 | 608653107)) | 1438640650) * (-668)) + ((608653107 | (~(1438640650 | i5))) * 1336) + ((i5 | 1979707195) * 668)) {
            throw new RuntimeException("-1466478867");
        }
        int i6 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i7 = ~((-436488198) | iIdentityHashCode);
        int i8 = ~iIdentityHashCode;
        if (i6 != 669516476 + ((i7 | (~(i8 | (-1099961347)))) * 920) + (((~((-1042606422) | i8)) | 436488197) * 920) + (((~(iIdentityHashCode | (-1099961347))) | (~((-436488198) | i8)) | (~((-606118225) | iIdentityHashCode))) * 920)) {
            int i9 = asInterface + 119;
            d = i9 % 128;
            if (i9 % 2 != 0) {
                int[] iArr = new int[2112680389];
                iArr[2112680388] = 1;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            } else {
                int[] iArr2 = new int[2112680389];
                iArr2[2112680388] = 1;
                int i10 = (-1952477228) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        super.onResume();
        int i11 = asInterface + 103;
        d = i11 % 128;
        if (i11 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.activities.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            if (i3 != ((((~((-375103806) | i4)) | 105914388) * (-283)) - 920986812) + ((~(i4 | (-269189418))) * 283)) {
                throw null;
            }
        } else {
            int i5 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima5).substring(12, 13).codePointAt(0) - 649370614;
            int i6 = ~iCodePointAt;
            if (i5 != 1075016138 + (((~((-785222534) | i6)) | 1615210076) * (-865)) + ((~(iCodePointAt | 785222533)) * 865) + (((~(1615210076 | i6)) | (~(i6 | 785222533))) * 865)) {
                throw null;
            }
        }
        int i7 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i8 = (~Process.myTid()) | 160278745;
        if (i7 != (-2025171492) + (i8 * 495) + (((~i8) | 624769) * 495)) {
            throw null;
        }
        super.onStart();
        int i9 = d + 43;
        asInterface = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // com.midtrans.sdk.uikit.activities.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        d = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
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
    private static java.lang.String $$s(int r7, byte r8, int r9) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.views.xl_tunai.XlTunaiInstructionActivity.$$m
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r7 = 116 - r7
            int r9 = r9 * 4
            int r9 = 1 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r8
            r3 = r9
            r4 = r2
            goto L28
        L15:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r7]
        L28:
            int r3 = -r3
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.xl_tunai.XlTunaiInstructionActivity.$$s(int, byte, int):java.lang.String");
    }
}
