package com.midtrans.sdk.uikit.fragments;

import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import com.bpjstku.R;
import com.google.android.material.textfield.TextInputLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.midtrans.sdk.corekit.core.MidtransSDK;
import com.midtrans.sdk.uikit.activities.UserDetailsActivity;
import com.midtrans.sdk.uikit.models.CountryCodeModel;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.ViewPortBuilder;
import defpackage.getServiceComponent;
import defpackage.initSession;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes4.dex */
public class UserAddressFragment extends Fragment {
    private getServiceComponent billingCountryAdapter;
    private String billingCountryCodeSelected;
    private FancyButton btnNext;
    private SwitchCompat cbShippingAddress;
    private AppCompatEditText etAddress;
    private AppCompatEditText etCity;
    private AppCompatAutoCompleteTextView etCountry;
    private AppCompatEditText etShippingAddress;
    private AppCompatEditText etShippingCity;
    private AppCompatAutoCompleteTextView etShippingCountry;
    private AppCompatEditText etShippingZipCode;
    private AppCompatEditText etZipCode;
    public MidtransSDK midtransSDK;
    private RelativeLayout shippingAddressContainer;
    private getServiceComponent shippingCountryAdapter;
    private String shippingCountryCodeSelected;
    private TextInputLayout tilAddress;
    private TextInputLayout tilCity;
    private TextInputLayout tilCountry;
    private TextInputLayout tilShippingAddress;
    private TextInputLayout tilShippingCity;
    private TextInputLayout tilShippingCountry;
    private TextInputLayout tilShippingZipCode;
    private TextInputLayout tilZipCode;
    private static final byte[] $$c = {67, -127, -109, 9};
    private static final int $$f = 139;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {67, -127, -109, 9, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 61;
    private static final byte[] $$a = {14, 70, 6, -35, 2, -10, 10};
    private static final int $$b = 16;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int[] TuitionPaymentFragmentbindingInflater1 = {1853513492, 1962363866, -74048091, -1142731008, -1835527846, -1505569155, 2821281, -1804599142, 1798851602, -1408036391, 9162333, -41848126, -179925109, 1923723740, 964915971, 308417191, 966908425, 1976969305};
    private final String TAG = "UserAddressFragment";
    private ArrayList<CountryCodeModel> countryCodeList = new ArrayList<>();

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 3
            int r5 = r5 + 4
            byte[] r0 = com.midtrans.sdk.uikit.fragments.UserAddressFragment.$$a
            int r6 = r6 * 2
            int r6 = r6 + 111
            int r7 = r7 * 4
            int r1 = r7 + 4
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r6
            r6 = r7
            r3 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r5]
        L2b:
            int r5 = r5 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-1)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.fragments.UserAddressFragment.a(byte, byte, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ void access$000(UserAddressFragment userAddressFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        b = i2 % 128;
        int i3 = i2 % 2;
        userAddressFragment.validateAndSaveAddress();
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ RelativeLayout access$100(UserAddressFragment userAddressFragment) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        Object obj = null;
        RelativeLayout relativeLayout = userAddressFragment.shippingAddressContainer;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return relativeLayout;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.fragments.UserAddressFragment.$$d
            int r7 = r7 + 84
            int r8 = r8 * 52
            int r1 = 53 - r8
            int r6 = r6 * 52
            int r6 = 55 - r6
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2e:
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.fragments.UserAddressFragment.c(byte, int, short, java.lang.Object[]):void");
    }

    public static UserAddressFragment newInstance() {
        int i = 2 % 2;
        UserAddressFragment userAddressFragment = new UserAddressFragment();
        int i2 = b + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 64 / 0;
        }
        return userAddressFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = b + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_user_address, viewGroup, false);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return viewInflate;
        }
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        UserDetailsActivity userDetailsActivity = (UserDetailsActivity) getActivity();
        if (userDetailsActivity != null) {
            int i2 = b + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            if (userDetailsActivity.getSupportActionBar() != null) {
                userDetailsActivity.getSupportActionBar().setTitle(getString(R.string.title_shipping_billing_address));
                int i4 = b + 57;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    public boolean isCountryCodeExist(String str, boolean z) {
        Iterator<CountryCodeModel> it;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            it = this.countryCodeList.iterator();
            int i3 = 95 / 0;
        } else {
            it = this.countryCodeList.iterator();
        }
        while (it.hasNext()) {
            CountryCodeModel next = it.next();
            if (next.name.equalsIgnoreCase(str)) {
                if (z) {
                    int i4 = b + 61;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        this.billingCountryCodeSelected = next.countryCodeAlpha;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    this.billingCountryCodeSelected = next.countryCodeAlpha;
                } else {
                    this.shippingCountryCodeSelected = next.countryCodeAlpha;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) throws Throwable {
        int i = 2 % 2;
        this.midtransSDK = MidtransSDK.getInstance();
        findViews(view);
        retrieveCountryCode();
        this.billingCountryAdapter = new getServiceComponent(getContext(), R.layout.layout_row_country_code, this.countryCodeList);
        this.shippingCountryAdapter = new getServiceComponent(getContext(), R.layout.layout_row_country_code, this.countryCodeList);
        this.etCountry.setAdapter(this.billingCountryAdapter);
        this.etCountry.setThreshold(1);
        this.etShippingCountry.setAdapter(this.shippingCountryAdapter);
        this.etShippingCountry.setThreshold(1);
        super.onViewCreated(view, bundle);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private void retrieveCountryCode() throws Throwable {
        int i;
        boolean z;
        int i2;
        Method method;
        int i3 = 2;
        int i4 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Class<?>[] clsArr = null;
        int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        byte b2 = (byte) 0;
        byte b3 = b2;
        Object[] objArr = new Object[1];
        a(b2, b3, b3, objArr);
        Method[] methodArr = {AssetManager.class.getMethod((String) objArr[0], String.class)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int i5 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2824;
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 22;
            byte[] bArr = $$d;
            byte b4 = (byte) (-bArr[5]);
            byte b5 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b4, b5, b5, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState, i5, offsetAfter, 1814927978, false, (String) objArr2[0], null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
        int i6 = 8;
        if (obj == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getScrollBarSize() >> 8) + 2823, (ViewConfiguration.getFadingEdgeLength() >> 16) + 22)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i7 = 0;
            while (i7 < length) {
                Method method2 = declaredMethods[i7];
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                b = i8 % 128;
                int i9 = i8 % i3;
                try {
                    Object[] objArr3 = new Object[1];
                    d(new int[]{-377443786, 1725334827, -1837303941, -48455207, -1763627813, 77049327, 1990401011, -1794038714, 1949342039, 727294161, -1593807451, -364191859, -875700743, 374237018}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23, objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    int[] iArr = new int[i6];
                    // fill-array-data instruction
                    iArr[0] = -1070711525;
                    iArr[1] = -1058520627;
                    iArr[2] = 1023851602;
                    iArr[3] = -398955059;
                    iArr[4] = 783140787;
                    iArr[5] = 2004111762;
                    iArr[6] = -1848880223;
                    iArr[7] = 234959256;
                    Object[] objArr4 = new Object[1];
                    d(iArr, 13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr4);
                    Object[] objArr5 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr4[0], clsArr).invoke(method2, clsArr)).intValue())};
                    Object[] objArr6 = new Object[1];
                    d(new int[]{-932592748, 1034644086, 1854334617, -1515116678, -1981367007, -1869112047, -511898491, 701850291, 940066022, -1559906974, -1991751750, -531034355, 1345068896, -1114139191, 1150664120, -2108071008}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26, objArr6);
                    Class<?> cls2 = Class.forName((String) objArr6[0]);
                    Object[] objArr7 = new Object[1];
                    d(new int[]{-366767839, -1511887275, -990137779, -316750304, -439875565, -1745394517}, 8 - TextUtils.indexOf("", ""), objArr7);
                    if (((Boolean) cls2.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).booleanValue()) {
                        Class cls3 = Long.TYPE;
                        Object[] objArr8 = new Object[1];
                        d(new int[]{-377443786, 1725334827, -1837303941, -48455207, -1763627813, 77049327, 1990401011, -1794038714, 1949342039, 727294161, -1593807451, -364191859, -875700743, 374237018}, 24 - Drawable.resolveOpacity(0, 0), objArr8);
                        Class<?> cls4 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        d(new int[]{445034346, -698096083, -1417509629, 2024952302, 2105260669, 1363902396, -762173571, -1986127890, 2019857820, 404801027}, TextUtils.lastIndexOf("", '0') + 14, objArr9);
                        if (cls3.equals(cls4.getMethod((String) objArr9[0], null).invoke(method2, null))) {
                            Object[] objArr10 = new Object[1];
                            d(new int[]{-377443786, 1725334827, -1837303941, -48455207, -1763627813, 77049327, 1990401011, -1794038714, 1949342039, 727294161, -1593807451, -364191859, -875700743, 374237018}, 23 - ExpandableListView.getPackedPositionChild(0L), objArr10);
                            Class<?> cls5 = Class.forName((String) objArr10[0]);
                            Object[] objArr11 = new Object[1];
                            d(new int[]{569815865, 2003767005, 929429512, 2051539150, 30945477, -635980701, -1756284768, -505755913, -1089092156, 1571410797, 981901261, 1444005601}, View.MeasureSpec.getMode(0) + 17, objArr11);
                            Object[] objArr12 = (Object[]) cls5.getMethod((String) objArr11[0], null).invoke(method2, null);
                            if (objArr12.length == 2 && Long.TYPE.equals(objArr12[0])) {
                                Object[] objArr13 = new Object[1];
                                d(new int[]{-377443786, 1725334827, -1837303941, -48455207, -1763627813, 77049327, 1990401011, -1794038714, 1949342039, 727294161, -1593807451, -364191859, -875700743, 374237018}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, objArr13);
                                if (Class.forName((String) objArr13[0]).equals(objArr12[1])) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int iIndexOf = TextUtils.indexOf("", "") + 2823;
                                        int trimmedLength = TextUtils.getTrimmedLength("") + 22;
                                        byte[] bArr2 = $$d;
                                        byte b6 = (byte) (-bArr2[5]);
                                        byte b7 = bArr2[7];
                                        Object[] objArr14 = new Object[1];
                                        c(b6, b7, b7, objArr14);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iIndexOf, trimmedLength, 1814927978, false, (String) objArr14[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 2823;
                                        int longPressTimeout = 22 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                        byte[] bArr3 = $$d;
                                        byte b8 = (byte) (-bArr3[5]);
                                        byte b9 = bArr3[7];
                                        Object[] objArr15 = new Object[1];
                                        c(b8, b9, b9, objArr15);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, iMakeMeasureSpec, longPressTimeout, 1814927978, false, (String) objArr15[0], null);
                                    }
                                    try {
                                        Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2823;
                                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 22;
                                            byte[] bArr4 = $$d;
                                            Object[] objArr17 = new Object[1];
                                            c(bArr4[7], bArr4[54], (byte) (-bArr4[5]), objArr17);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(pressedStateDuration, maximumDrawingCacheSize, iNormalizeMetaState, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr16)).longValue();
                                        break;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    i7++;
                    int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
                    b = i10 % 128;
                    int i11 = i10 % 2;
                    i3 = 2;
                    clsArr = null;
                    i6 = 8;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 2823;
            int iResolveOpacity = 22 - Drawable.resolveOpacity(0, 0);
            byte[] bArr5 = $$d;
            byte b10 = (byte) (-bArr5[5]);
            byte b11 = bArr5[7];
            Object[] objArr18 = new Object[1];
            c(b10, b11, b11, objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, edgeSlop, iResolveOpacity, 1814927978, false, (String) objArr18[0], null);
        }
        Object[] objArr19 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int windowTouchSlop = 2823 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            int iNormalizeMetaState2 = 22 - KeyEvent.normalizeMetaState(0);
            byte[] bArr6 = $$d;
            byte b12 = bArr6[7];
            Object[] objArr20 = new Object[1];
            c(b12, (byte) (b12 | 14), (byte) (-bArr6[5]), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSize, windowTouchSlop, iNormalizeMetaState2, 1025296417, false, (String) objArr20[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr19);
        Object[] objArr21 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 37657);
            int deadChar = KeyEvent.getDeadChar(0, 0) + 2720;
            int iLastIndexOf = 18 - TextUtils.lastIndexOf("", '0', 0);
            byte[] bArr7 = $$d;
            byte b13 = bArr7[7];
            Object[] objArr22 = new Object[1];
            c(b13, (byte) (b13 | 14), (byte) (-bArr7[5]), objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(keyRepeatDelay, deadChar, iLastIndexOf, -1568796068, false, (String) objArr22[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr21)).longValue();
        long j = -406210487;
        long j2 = -712;
        long j3 = -1;
        long j4 = jLongValue ^ j3;
        long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        long j5 = startElapsedRealtime ^ j3;
        long j6 = (j5 | j) ^ j3;
        long j7 = (((long) (-711)) * j) + (((long) 713) * jLongValue) + ((((j4 | j) ^ j3) | j6) * j2) + (j2 * ((((j4 | j5) | j) ^ j3) | ((startElapsedRealtime | (jLongValue | j)) ^ j3))) + (((long) 712) * (j4 | j6)) + ((long) (-1404195358));
        int iIdentityHashCode = System.identityHashCode(this);
        int i12 = ~iIdentityHashCode;
        int i13 = ((int) (j7 >> 32)) & ((((~((-604061697) | i12)) | (~((-52966689) | iIdentityHashCode))) * 988) + 1696245430 + (((~(iIdentityHashCode | (-2094254796))) | 1490193099 | (~(i12 | (-52966689)))) * 988));
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i14 = (-99055917) + (((~(1533633444 | iIdentityHashCode2)) | (-96407035)) * (-318));
        int i15 = ~((-96407035) | iIdentityHashCode2);
        int i16 = ~iIdentityHashCode2;
        int i17 = i13 | (((int) j7) & (i14 + ((i15 | (~((-1514168837) | i16))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode2 | (-1514168837))) | (~((-19464609) | i16))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)));
        int i18 = i17 >>> 24;
        int i19 = i17 & ViewCompat.MEASURED_SIZE_MASK;
        if (i18 != 0) {
            int i20 = b + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
            i = 2;
            int i21 = i20 % 2;
            z = true;
        } else {
            i = 2;
            int i22 = b + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
            int i23 = i22 % 2;
            z = false;
        }
        if (z) {
            int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
            b = i24 % 128;
            int i25 = i24 % i;
            i2 = 1;
        } else {
            i2 = 0;
        }
        arrayList.add((!z || i19 >= 1 || (method = methodArr[i19]) == null) ? null : method.toString());
        if ((i18 + 6) * i2 != 0) {
            throw new RuntimeException(String.valueOf(iIntValue));
        }
        try {
            InputStream inputStreamOpen = getContext().getAssets().open("country_code.json");
            byte[] bArr8 = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr8);
            inputStreamOpen.close();
            try {
                ArrayList<CountryCodeModel> arrayList2 = (ArrayList) new Gson().fromJson(new String(bArr8, Hex.DEFAULT_CHARSET_NAME), new TypeToken<ArrayList<CountryCodeModel>>() { // from class: com.midtrans.sdk.uikit.fragments.UserAddressFragment.1
                }.getType());
                if (arrayList2 != null) {
                    int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
                    b = i26 % 128;
                    int i27 = i26 % 2;
                    this.countryCodeList = arrayList2;
                }
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c2, code lost:
    
        if (r4.length() < 5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0128, code lost:
    
        if (r8.length() < 5) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void validateAndSaveAddress() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.fragments.UserAddressFragment.validateAndSaveAddress():void");
    }

    private static void d(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentbindingInflater1;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int i7 = $11 + 9;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 73;
                $11 = i10 % 128;
                if (i10 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 3292, (ViewConfiguration.getWindowTouchSlop() >> 8) + 31, 1948206109, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i9 >>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i9])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 3291, 31 - TextUtils.getCapsMode("", 0, 0), 1948206109, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i9++;
                }
                i2 = 2;
                i4 = -1870535734;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentbindingInflater1;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr4 = new Object[i5];
                objArr4[i6] = Integer.valueOf(iArr5[i11]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) i6;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.resolveSize(i6, i6), 3291 - (ViewConfiguration.getTouchSlop() >> 8), 31 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1948206109, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                i11++;
                i5 = 1;
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        int i12 = i6;
        System.arraycopy(iArr5, i12, iArr4, i12, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i13 = $10 + 5;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i15 = 17;
            for (int i16 = 1; i15 > i16; i16 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.red(0) + 2559, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29, 683220507, false, $$g(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i15--;
            }
            int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28880 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 348 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getFadingEdgeLength() >> 16) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
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

    private void findViews(View view) {
        int i = 2 % 2;
        this.tilAddress = (TextInputLayout) view.findViewById(R.id.address_til);
        this.tilCity = (TextInputLayout) view.findViewById(R.id.city_til);
        this.tilZipCode = (TextInputLayout) view.findViewById(R.id.zip_til);
        this.tilCountry = (TextInputLayout) view.findViewById(R.id.country_til);
        this.etAddress = (AppCompatEditText) view.findViewById(R.id.et_address);
        this.etCity = (AppCompatEditText) view.findViewById(R.id.et_city);
        this.etZipCode = (AppCompatEditText) view.findViewById(R.id.et_zipcode);
        this.etCountry = (AppCompatAutoCompleteTextView) view.findViewById(R.id.et_country);
        this.cbShippingAddress = (SwitchCompat) view.findViewById(R.id.cb_shipping_address);
        this.shippingAddressContainer = (RelativeLayout) view.findViewById(R.id.shipping_address_container);
        this.tilShippingAddress = (TextInputLayout) view.findViewById(R.id.shipping_address_til);
        this.tilShippingCity = (TextInputLayout) view.findViewById(R.id.shipping_city_til);
        this.tilShippingZipCode = (TextInputLayout) view.findViewById(R.id.shipping_zip_til);
        this.tilShippingCountry = (TextInputLayout) view.findViewById(R.id.shipping_country_til);
        this.etShippingAddress = (AppCompatEditText) view.findViewById(R.id.et_shipping_address);
        this.etShippingCity = (AppCompatEditText) view.findViewById(R.id.et_shipping_city);
        this.etShippingZipCode = (AppCompatEditText) view.findViewById(R.id.et_shipping_zipcode);
        this.etShippingCountry = (AppCompatAutoCompleteTextView) view.findViewById(R.id.et_shipping_country);
        this.btnNext = (FancyButton) view.findViewById(R.id.btn_next);
        this.etAddress.setSingleLine();
        this.etAddress.setImeOptions(5);
        this.etCity.setSingleLine();
        this.etCity.setImeOptions(5);
        this.etCountry.setSingleLine();
        this.etCountry.setImeOptions(6);
        this.etShippingAddress.setSingleLine();
        this.etShippingAddress.setImeOptions(5);
        this.etShippingCity.setSingleLine();
        this.etShippingCity.setImeOptions(5);
        this.etShippingCountry.setSingleLine();
        this.etShippingCountry.setImeOptions(6);
        MidtransSDK midtransSDK = this.midtransSDK;
        if (midtransSDK != null) {
            int i2 = b + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            if (midtransSDK.getSemiBoldText() != null) {
                int i4 = b + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
                this.btnNext.setCustomTextFont(this.midtransSDK.getSemiBoldText());
            }
            if (this.midtransSDK.getColorTheme() != null) {
                if (this.midtransSDK.getColorTheme().getSecondaryColor() != 0) {
                    try {
                        Field declaredField = TextInputLayout.class.getDeclaredField("mDefaultTextColor");
                        declaredField.setAccessible(true);
                        declaredField.set(this.tilAddress, new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        Field declaredField2 = TextInputLayout.class.getDeclaredField("mFocusedTextColor");
                        declaredField2.setAccessible(true);
                        declaredField2.set(this.tilAddress, new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        this.etAddress.setSupportBackgroundTintList(new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        Field declaredField3 = TextInputLayout.class.getDeclaredField("mDefaultTextColor");
                        declaredField3.setAccessible(true);
                        declaredField3.set(this.tilCity, new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        Field declaredField4 = TextInputLayout.class.getDeclaredField("mFocusedTextColor");
                        declaredField4.setAccessible(true);
                        declaredField4.set(this.tilCity, new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        this.etCity.setSupportBackgroundTintList(new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        Field declaredField5 = TextInputLayout.class.getDeclaredField("mDefaultTextColor");
                        declaredField5.setAccessible(true);
                        declaredField5.set(this.tilZipCode, new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        Field declaredField6 = TextInputLayout.class.getDeclaredField("mFocusedTextColor");
                        declaredField6.setAccessible(true);
                        declaredField6.set(this.tilZipCode, new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        this.etZipCode.setSupportBackgroundTintList(new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        Field declaredField7 = TextInputLayout.class.getDeclaredField("mDefaultTextColor");
                        declaredField7.setAccessible(true);
                        declaredField7.set(this.tilCountry, new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        Field declaredField8 = TextInputLayout.class.getDeclaredField("mFocusedTextColor");
                        declaredField8.setAccessible(true);
                        declaredField8.set(this.tilCountry, new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        this.etCountry.setSupportBackgroundTintList(new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        Field declaredField9 = TextInputLayout.class.getDeclaredField("mDefaultTextColor");
                        declaredField9.setAccessible(true);
                        declaredField9.set(this.tilShippingAddress, new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        Field declaredField10 = TextInputLayout.class.getDeclaredField("mFocusedTextColor");
                        declaredField10.setAccessible(true);
                        declaredField10.set(this.tilShippingAddress, new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        this.etShippingAddress.setSupportBackgroundTintList(new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        Field declaredField11 = TextInputLayout.class.getDeclaredField("mDefaultTextColor");
                        declaredField11.setAccessible(true);
                        declaredField11.set(this.tilShippingCity, new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        Field declaredField12 = TextInputLayout.class.getDeclaredField("mFocusedTextColor");
                        declaredField12.setAccessible(true);
                        declaredField12.set(this.tilShippingCity, new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        this.etShippingCity.setSupportBackgroundTintList(new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        Field declaredField13 = TextInputLayout.class.getDeclaredField("mDefaultTextColor");
                        declaredField13.setAccessible(true);
                        declaredField13.set(this.tilShippingZipCode, new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        Field declaredField14 = TextInputLayout.class.getDeclaredField("mFocusedTextColor");
                        declaredField14.setAccessible(true);
                        declaredField14.set(this.tilShippingZipCode, new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        this.etShippingZipCode.setSupportBackgroundTintList(new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        Field declaredField15 = TextInputLayout.class.getDeclaredField("mDefaultTextColor");
                        declaredField15.setAccessible(true);
                        declaredField15.set(this.tilShippingCountry, new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        TextInputLayout.class.getDeclaredField("mFocusedTextColor").setAccessible(true);
                        declaredField8.set(this.tilShippingCountry, new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                        this.etShippingCountry.setSupportBackgroundTintList(new ColorStateList(new int[][]{new int[]{0}}, new int[]{this.midtransSDK.getColorTheme().getSecondaryColor()}));
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    if (this.midtransSDK.getColorTheme().getPrimaryDarkColor() != 0) {
                        int[][] iArr = {new int[]{-16842912}, new int[]{android.R.attr.state_checked}};
                        int[] iArr2 = {-1, this.midtransSDK.getColorTheme().getPrimaryDarkColor()};
                        int[] iArr3 = {-7829368, this.midtransSDK.getColorTheme().getSecondaryColor()};
                        DrawableCompat.setTintList(DrawableCompat.wrap(this.cbShippingAddress.getThumbDrawable()), new ColorStateList(iArr, iArr2));
                        DrawableCompat.setTintList(DrawableCompat.wrap(this.cbShippingAddress.getTrackDrawable()), new ColorStateList(iArr, iArr3));
                    }
                }
                if (this.midtransSDK.getColorTheme().getPrimaryColor() != 0) {
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
                    b = i6 % 128;
                    int i7 = i6 % 2;
                    this.btnNext.setBackgroundColor(this.midtransSDK.getColorTheme().getPrimaryColor());
                }
            }
        }
        this.btnNext.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.fragments.UserAddressFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                try {
                    UserAddressFragment.access$000(UserAddressFragment.this);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.cbShippingAddress.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.midtrans.sdk.uikit.fragments.UserAddressFragment.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    UserAddressFragment.access$100(UserAddressFragment.this).setVisibility(8);
                } else {
                    UserAddressFragment.access$100(UserAddressFragment.this).setVisibility(0);
                }
            }
        });
    }

    private static String $$g(byte b2, int i, int i2) {
        int i3 = 3 - (i2 * 3);
        byte[] bArr = $$c;
        int i4 = b2 * 3;
        int i5 = 122 - (i * 56);
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5 += -i4;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i5;
            i3++;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i5 += -bArr[i3];
        }
    }
}
