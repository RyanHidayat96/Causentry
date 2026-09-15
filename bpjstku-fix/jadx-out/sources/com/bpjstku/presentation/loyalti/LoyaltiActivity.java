package com.bpjstku.presentation.loyalti;

import android.content.Context;
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
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityLoyaltiBinding;
import com.bpjstku.presentation.loyalti.LoyaltiActivity;
import com.bpjstku.presentation.loyalti.model.LoyaltiMenu;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.timepicker.ClockHandView$$ExternalSyntheticLambda0;
import defpackage.MenuHelper;
import defpackage.ViewPortBuilder;
import defpackage.addCaptureCallback;
import defpackage.attachPreviewSurface;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0004R\u0015\u0010\u0013\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u00148UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00188UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019"}, d2 = {"Lcom/bpjstku/presentation/loyalti/LoyaltiActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityLoyaltiBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "asBinder", "LMenuHelper;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoyaltiActivity extends BindingBaseActivity<ActivityLoyaltiBinding> {
    private static boolean TuitionPaymentFragmentbindingInflater1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static boolean d;
    private static int g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: setOverrideVisibleItems
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LoyaltiActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
        }
    });
    private static final byte[] $$c = {46, 126, -84, 108};
    private static final int $$f = 57;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {60, 80, 13, 34, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 180;
    private static int asInterface = 1;
    private static int asBinder = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f493a = 1;

    private static void c(int i, short s, int i2, Object[] objArr) {
        byte[] bArr = $$a;
        int i3 = (i * 14) + 84;
        int i4 = 196 - s;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            int i6 = (i4 + i2) - 11;
            i4 = i4;
            i3 = i6;
        }
        while (true) {
            i5++;
            int i7 = i4 + 1;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 = i7;
            i3 = (i3 + bArr[i7]) - 11;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityLoyaltiBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = f493a + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        LoyaltiActivity$bindingInflater$1 loyaltiActivity$bindingInflater$1 = LoyaltiActivity$bindingInflater$1.b;
        int i4 = f493a + 37;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return loyaltiActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        LoyaltiActivity loyaltiActivity = this;
        Intrinsics.checkNotNullParameter(loyaltiActivity, "");
        loyaltiActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(((ActivityLoyaltiBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityLoyaltiBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.menu_loyalti));
        RecyclerView recyclerView = ((ActivityLoyaltiBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvLoyalti;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((MenuHelper) this.TuitionPaymentFragmentbindingInflater1.getValue());
        int i2 = asBinder + 19;
        f493a = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        f493a = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i4 = asBinder + 23;
                f493a = i4 % 128;
                if (i4 % 2 == 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    int i5 = 5 / 0;
                } else {
                    getOnBackPressedDispatcher().onBackPressed();
                }
                int i6 = f493a + 19;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
            }
            return super.onOptionsItemSelected(p0);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (29944 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1755;
            int scrollDefaultDelay = 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            c(b, (short) (b | 193), (byte) 37, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, scrollBarSize, scrollDefaultDelay, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
                int iAlpha = 1755 - Color.alpha(0);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 24;
                byte b2 = $$a[7];
                Object[] objArr3 = new Object[1];
                c(b2, (short) (b2 | 156), (byte) ($$b & 127), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, iAlpha, iIndexOf, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i3 = (-1339864147) + (((~(762119114 | i2)) | (-974721541)) * (-948)) + ((~((~i2) | (-303042565))) * (-948)) + 865782267;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(null, null, 126 - TextUtils.lastIndexOf("", '0', 0), new byte[]{-115, -116, -117, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) + 28, new byte[]{-116, -113, -109, -110, -111, -118, -126, -112, -119, -117, -114, -117, -122, -116, -113, -114}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-14456871};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1726, 29 - KeyEvent.normalizeMetaState(0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = ClockHandView$$ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 409826083, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                    int i6 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1755;
                    int iRed = 23 - Color.red(0);
                    byte b3 = $$a[7];
                    Object[] objArr8 = new Object[1];
                    c(b3, (short) (b3 | 156), (byte) ($$b & 127), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(pressedStateDuration, i6, iRed, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(null, null, 126 - TextUtils.lastIndexOf("", '0', 0, 0), new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(null, null, View.MeasureSpec.getSize(0) + 127, new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cArgb = (char) (Color.argb(0, 0, 0, 0) + 29944);
                        int touchSlop = 1755 - (ViewConfiguration.getTouchSlop() >> 8);
                        int iBlue = 23 - Color.blue(0);
                        byte b4 = $$a[7];
                        short s = (short) (b4 | 104);
                        Object[] objArr11 = new Object[1];
                        c(b4, s, (byte) (s >>> 1), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, touchSlop, iBlue, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29943);
                        int packedPositionChild = 1754 - ExpandableListView.getPackedPositionChild(0L);
                        int gidForName = 22 - Process.getGidForName("");
                        byte b5 = $$a[7];
                        Object[] objArr12 = new Object[1];
                        c(b5, (short) (b5 | 193), (byte) 37, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, packedPositionChild, gidForName, 986134021, false, (String) objArr12[0], null);
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
        int i7 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i8 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i8 != i7) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr != null) {
                int i9 = asBinder + 105;
                f493a = i9 % 128;
                int i10 = i9 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i8));
        }
        int i11 = asBinder + 73;
        f493a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int i14 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        int i15 = 1757788759 + ((i14 | 1023696208) * (-50));
        int i16 = ~((-218370113) | i14);
        int i17 = ~i14;
        int i18 = i13 + i15 + ((i16 | (~(1029463894 | i17))) * 50) + (((~(i17 | 1023696208)) | (~(811093782 | i17)) | (-1029463895)) * 50);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr13[3])[0] = i20 ^ (i20 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
            int modifierMetaStateMask = 1030 - ((byte) KeyEvent.getModifierMetaStateMask());
            int iNormalizeMetaState = 15 - KeyEvent.normalizeMetaState(0);
            byte b6 = $$a[7];
            short s2 = (short) (b6 | 52);
            Object[] objArr14 = new Object[1];
            c(b6, s2, (byte) s2, objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(bitsPerPixel, modifierMetaStateMask, iNormalizeMetaState, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(null, null, 127 - (ViewConfiguration.getTapTimeout() >> 16), new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(null, null, Color.argb(0, 0, 0, 0) + 127, new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1031;
            int iResolveSize = View.resolveSize(0, 0) + 15;
            byte b7 = $$a[7];
            Object[] objArr17 = new Object[1];
            c(b7, (short) (b7 | 156), (byte) ($$b & 127), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cKeyCodeFromString, maximumDrawingCacheSize, iResolveSize, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c3 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                int iRed2 = 1031 - Color.red(0);
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15;
                byte[] bArr = $$a;
                byte b8 = bArr[28];
                short s3 = bArr[7];
                Object[] objArr18 = new Object[1];
                c(b8, s3, (byte) s3, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c3, iRed2, keyRepeatDelay, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i21 = ((int[]) objArr19[3])[0];
            int i22 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 1441821018;
            int i23 = 1809690599 + (((~(iCodePointAt | (-201464199))) | (-445744369)) * (-465)) + (((-201464199) | (~((-445744369) | iCodePointAt))) * 930) + ((iCodePointAt | (-134217857)) * 465) + 845995289;
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr[2])[0] = i25 ^ (i25 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 16, new byte[]{-115, -116, -117, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, new byte[]{-116, -113, -109, -110, -111, -118, -126, -112, -119, -117, -114, -117, -122, -116, -113, -114}, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {-14456871};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 46038), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1134, 'B' - AndroidCharacter.getMirror('0'), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 845995289, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                int iIndexOf2 = TextUtils.indexOf("", "") + 1031;
                int iAxisFromString = 14 - MotionEvent.axisFromString("");
                byte b9 = $$a[7];
                short s4 = (short) (b9 | 52);
                Object[] objArr24 = new Object[1];
                c(b9, s4, (byte) s4, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf, iIndexOf2, iAxisFromString, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf((CharSequence) "", '0') + 45994), 1116 - Process.getGidForName(""), 17 - (ViewConfiguration.getJumpTapTimeout() >> 16)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1031;
                int iMyPid = (Process.myPid() >> 22) + 15;
                byte[] bArr2 = $$a;
                byte b10 = bArr2[28];
                short s5 = bArr2[7];
                Object[] objArr25 = new Object[1];
                c(b10, s5, (byte) s5, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cResolveOpacity, scrollBarFadeDuration, iMyPid, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(null, null, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.save_card_message).substring(0, 1).length() + 126, new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int i26 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1032;
                    int i27 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                    byte b11 = $$a[7];
                    Object[] objArr28 = new Object[1];
                    c(b11, (short) (b11 | 156), (byte) ($$b & 127), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(keyRepeatDelay2, i26, i27, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    int i28 = 1032 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15;
                    byte b12 = $$a[7];
                    short s6 = (short) (b12 | 52);
                    Object[] objArr29 = new Object[1];
                    c(b12, s6, (byte) s6, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cCombineMeasuredStates, i28, maximumDrawingCacheSize2, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i29 = ((int[]) objArr[1])[0];
        int i30 = ((int[]) objArr[3])[0];
        if (i30 == i29) {
            Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr[2])[0];
            int i32 = ((int[]) objArr[3])[0];
            int i33 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i34 = ~((int) Runtime.getRuntime().maxMemory());
            int i35 = i31 + (((25366322 + (((~((-738877664) | i34)) | 494597493) * (-933))) + (((~(i34 | 494597493)) | (-1031468544)) * 933)) - 1890615904);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr30[2])[0] = i37 ^ (i37 << 5);
            int i38 = f493a + 107;
            asBinder = i38 % 128;
            int i39 = i38 % 2;
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i40 = 0;
            while (i40 < strArr4.length) {
                int i41 = f493a + 65;
                asBinder = i41 % 128;
                if (i41 % 2 != 0) {
                    arrayList2.add(strArr4[i40]);
                    i40 += 108;
                } else {
                    arrayList2.add(strArr4[i40]);
                    i40++;
                }
            }
        }
        Toast.makeText((Context) null, i30 / (((i30 - 1) * i30) % 2), 0).show();
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i42 = ((int[]) objArr[2])[0];
        int i43 = ((int[]) objArr[3])[0];
        int i44 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i45 = (~(37911948 | iMaxMemory)) | 277971058;
        int i46 = ~((~iMaxMemory) | (-33690889));
        int i47 = i42 + 2041658549 + ((i45 | i46) * (-470)) + (((~(iMaxMemory | 315883006)) | i46) * 470);
        int i48 = i47 ^ (i47 << 13);
        int i49 = i48 ^ (i48 >>> 17);
        ((int[]) objArr31[2])[0] = i49 ^ (i49 << 5);
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        long j = 0;
        int i4 = -1;
        if (cArr2 != null) {
            int i5 = $10 + 111;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 83;
                $10 = i8 % 128;
                int i9 = i8 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cLastIndexOf = (char) (31338 - TextUtils.lastIndexOf("", '0', 0, 0));
                        int edgeSlop = 2994 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(j) + 18;
                        byte b = (byte) i4;
                        byte b2 = (byte) (b + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, edgeSlop, packedPositionChild, 1182129903, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i7++;
                    i2 = 2;
                    j = 0;
                    i4 = -1;
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
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - ExpandableListView.getPackedPositionType(0L)), Color.red(0) + 253, 22 - Color.blue(0), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            if (d) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i10 = $10 + 61;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33602 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getLongPressTimeout() >> 16) + 3085, 26 - (ViewConfiguration.getPressedStateDuration() >> 16), -2146875848, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!TuitionPaymentFragmentbindingInflater1) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i12 = $10 + 119;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getTouchSlop() >> 8) + 3085, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26, -2146875848, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                int i14 = $10 + 53;
                $11 = i14 % 128;
                int i15 = i14 % 2;
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00de, code lost:
    
        if (r1 != ((1581409810 + ((r5 | r2) * (-502))) + ((r2 | (~(r4 | (-18096395)))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_DRAWPATH))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00e0, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.loyalti.LoyaltiActivity.f493a + 95;
        com.bpjstku.presentation.loyalti.LoyaltiActivity.asBinder = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ec, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ee, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ef, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f7, code lost:
    
        throw new java.lang.RuntimeException("-1731657182");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ff, code lost:
    
        throw new java.lang.RuntimeException("2124346519");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0076, code lost:
    
        if (r1 == ((r8 + ((r4 | r7) * 594)) + ((((~(1578303744 | r5)) | (-2124113706)) | r7) * 594))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00af, code lost:
    
        if (r1 == (((1099697844 + ((r4 | (-1477712179)) * 140)) + (((~((-1477712179) | r6)) | 1054738) * (-280))) + (((~(r4 | (-1054739))) | ((~(647724635 | r6)) | (-2124382076))) * 140))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b1, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r9);
        r4 = ~r2;
        r5 = (~((-555118892) | r4)) | 537022497;
        r2 = ~(r2 | 2042033467);
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.loyalti.LoyaltiActivity.onResume():void");
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1349238706
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.loyalti.LoyaltiActivity.f493a
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.bpjstku.presentation.loyalti.LoyaltiActivity.asBinder = r2
            int r1 = r1 % r0
            java.lang.reflect.Member[] r1 = defpackage.calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            int r4 = java.lang.System.identityHashCode(r11)
            int r5 = ~r4
            r6 = -1858082667(0xffffffff913fe895, float:-1.5138913E-28)
            r7 = r5 | r6
            int r7 = ~r7
            r8 = 1115685736(0x42800368, float:64.00665)
            r7 = r7 | r8
            r9 = -285698194(0xffffffffeef8976e, float:-3.8467675E28)
            r10 = r9 | r4
            int r10 = ~r10
            r7 = r7 | r10
            int r7 = r7 * 717
            r10 = -1405327135(0xffffffffac3c68e1, float:-2.6774626E-12)
            int r10 = r10 + r7
            r5 = r5 | r9
            int r5 = ~r5
            r5 = r5 | r8
            r4 = r4 | r6
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = r4 * 717
            int r10 = r10 + r4
            if (r1 == r10) goto L71
            int r1 = com.bpjstku.presentation.loyalti.LoyaltiActivity.f493a
            int r1 = r1 + 55
            int r4 = r1 % 128
            com.bpjstku.presentation.loyalti.LoyaltiActivity.asBinder = r4
            int r1 = r1 % r0
            r4 = -1
            r5 = -1349238707(0xffffffffaf94404d, float:-2.6966732E-10)
            r6 = -1349238706(0xffffffffaf94404e, float:-2.6966734E-10)
            r7 = 1
            if (r1 == 0) goto L60
            int[] r0 = new int[r6]
            r0[r5] = r7
            r0 = r0[r4]
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r7)
            r0.show()
            goto L71
        L60:
            int[] r1 = new int[r6]
            r1[r5] = r7
            r5 = 1589827446(0x5ec2d776, float:7.01991E18)
            int r5 = r5 % r0
            r0 = r1[r4]
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r7)
            r0.show()
        L71:
            java.lang.reflect.Member[] r0 = defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1
            r0 = r0[r2]
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            int r0 = r0.getInt(r3)
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            int r1 = r1.nextInt()
            r2 = -1677722961(0xffffffff9bfffaaf, float:-4.2348212E-22)
            r2 = r2 | r1
            int r2 = ~r2
            int r2 = r2 * 623
            r4 = 936914058(0x37d82c8a, float:2.5769947E-5)
            int r4 = r4 + r2
            int r2 = ~r1
            r5 = 20525058(0x1393002, float:3.4013577E-38)
            r2 = r2 | r5
            int r2 = r2 * (-623)
            int r4 = r4 + r2
            r2 = -2118126934(0xffffffff81bff2aa, float:-7.0510525E-38)
            r2 = r2 | r1
            int r2 = ~r2
            r5 = 1677722960(0x64000550, float:9.446264E21)
            r2 = r2 | r5
            r5 = 460929031(0x1b793807, float:2.0614901E-22)
            r1 = r1 | r5
            int r1 = ~r1
            r1 = r1 | r2
            int r1 = r1 * 623
            int r4 = r4 + r1
            if (r0 != r4) goto Laf
            super.onStart()
            return
        Laf:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.loyalti.LoyaltiActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i3 = ~((-730723824) | (~iIdentityHashCode));
        if (i2 != (((-2140141040) | i3 | (~(730723823 | iIdentityHashCode))) * (-338)) + 1651813960 + (((~(iIdentityHashCode | (-1409417217))) | i3) * 338)) {
            int i4 = asBinder + 63;
            f493a = i4 % 128;
            int i5 = i4 % 2;
            int[] iArr = new int[1730604043];
            iArr[1730604042] = 1;
            int i6 = 1606507630 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i7 = f493a + 113;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 1042378746;
        if (i9 == (-238692436) + ((~((~iCodePointAt) | 1970093303)) * (-116)) + ((879560935 | iCodePointAt) * 116) + (((~(iCodePointAt | (-1699495030))) | 608962661) * 116)) {
            super.onCreate(bundle);
        } else {
            int i10 = 481802666 % 2;
            throw new ArithmeticException();
        }
    }

    public static /* synthetic */ MenuHelper TuitionPaymentFragmentspecialinlinedviewModeldefault3(final LoyaltiActivity loyaltiActivity) {
        int i = 2 % 2;
        String string = loyaltiActivity.getString(R.string.title_market_place_comarketing);
        Intrinsics.checkNotNullExpressionValue(string, "");
        MenuHelper menuHelper = new MenuHelper(loyaltiActivity, CollectionsKt.mutableListOf(new LoyaltiMenu("1", string, "", R.drawable.ic_marketplace)), new Function1() { // from class: stopDispatchingItemsChanged
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoyaltiActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (LoyaltiMenu) obj);
            }
        });
        int i2 = f493a + 103;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return menuHelper;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit b(LoyaltiActivity loyaltiActivity, LoyaltiMenu loyaltiMenu) {
        int i = 2 % 2;
        int i2 = f493a + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(loyaltiMenu, "");
        if (Intrinsics.areEqual(loyaltiMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3, "1")) {
            ListFeatureLoyaltiActivity.Companion companion = ListFeatureLoyaltiActivity.INSTANCE;
            ListFeatureLoyaltiActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(loyaltiActivity);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = f493a + 49;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = (~((~i6) | i8)) | i9;
        int i11 = i5 | i4;
        int i12 = (~(i6 | i8)) | i9;
        int i13 = i5 + i4 + i3 + (1258674323 * i) + ((-126594725) * i2);
        int i14 = i13 * i13;
        int i15 = ((-1449289074) * i5) + 1954676736 + ((-212912869) * i4) + (i10 * (-1236376205)) + (i11 * (-1236376205)) + ((-1236376205) * i12) + (1609302016 * i3) + (881065984 * i) + ((-991690752) * i2) + ((-541982720) * i14);
        int i16 = ((i5 * (-1656160718)) - 817430035) + (i4 * (-1656161339)) + (i10 * 621) + (i11 * 621) + (i12 * 621) + (i3 * (-1656160097)) + (i * (-2121497779)) + (i2 * 1378977669) + (i14 * (-275906560));
        if (i15 + (i16 * i16 * (-372375552)) == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        int i17 = 2 % 2;
        int i18 = asBinder + 13;
        f493a = i18 % 128;
        int i19 = i18 % 2;
        return null;
    }

    static {
        g = 0;
        d();
        INSTANCE = new Companion(null);
        int i = asInterface + 81;
        g = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = addCaptureCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iCodePointAt = (-688168805) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0);
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault2(addCaptureCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), (-1571596106) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, iCodePointAt, 362006327, -362006326, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this})).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int iB = attachPreviewSurface.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(addCaptureCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1642974296, attachPreviewSurface.b(), 464365356, -464365356, iB, new Object[]{this});
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        f493a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = f493a + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        f493a = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        f493a = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = f493a + 107;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    static void d() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{47440, 47449, 47428, 47372, 47438, 47436, 47443, 47399, 47425, 47431, 47430, 47445, 47437, 47441, 47446, 47410, 47442, 47415, 47435, 47432, 47447, 47439, 47434, 47400};
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2047719674;
        TuitionPaymentFragmentbindingInflater1 = true;
        d = true;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = f493a + 69;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return Integer.valueOf(R.layout.activity_loyalti);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, int r7, byte r8) {
        /*
            int r8 = 68 - r8
            int r6 = r6 + 4
            byte[] r0 = com.bpjstku.presentation.loyalti.LoyaltiActivity.$$c
            int r7 = r7 * 4
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L20:
            int r6 = r6 + 1
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.loyalti.LoyaltiActivity.$$i(int, int, byte):java.lang.String");
    }
}
