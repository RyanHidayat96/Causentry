package com.bpjstku.presentation.tuition;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.ViewPager;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityTuitionBinding;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity$special$$inlined$inject$default$2;
import com.bpjstku.util.constant.ProgramType;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import defpackage.DecorContentParent;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.TorchStateReset;
import defpackage.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
import defpackage.ViewPortBuilder;
import defpackage.calculateCameraUseCases;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.createExtraPreview;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.profileToDynamicRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00118\u0015X\u0094D¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00020\u00168UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0018"}, d2 = {"Lcom/bpjstku/presentation/tuition/TuitionActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityTuitionBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TuitionActivity extends BindingBaseActivity<ActivityTuitionBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1 = R.layout.activity_tuition;
    private static final byte[] $$c = {49, 84, -120, 101};
    private static final int $$f = 147;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {64, 73, -26, 82, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 223;
    private static int asInterface = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f644a = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = (~(i7 | i8)) | (~(i7 | i4));
        int i10 = ~(i5 | i4);
        int i11 = ~i4;
        int i12 = (~(i6 | i7 | i11)) | i10;
        int i13 = i7 | (~(i8 | i11));
        int i14 = i5 + i4 + i + ((-1570926368) * i3) + ((-1409401439) * i2);
        int i15 = i14 * i14;
        int i16 = (((-543990125) * i5) - 657981440) + (821186744 * i4) + ((-1953193618) * i9) + ((-976596809) * i12) + (976596809 * i13) + (1797783552 * i) + (1124073472 * i3) + ((-332922880) * i2) + ((-1182662656) * i15);
        int i17 = (i5 * 1410161459) + 847508490 + (i4 * 1410159032) + (i9 * (-1618)) + (i12 * (-809)) + (i13 * 809) + (i * 1410159841) + (i3 * 1126552800) + (i2 * (-1948647807)) + (i15 * (-1287520256));
        return i16 + ((i17 * i17) * (-1577189376)) != 1 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
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
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.tuition.TuitionActivity.$$a
            int r7 = 196 - r7
            int r6 = r6 * 14
            int r6 = r6 + 84
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2b:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            r7 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.tuition.TuitionActivity.c(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.tuition.TuitionActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/tuition/TuitionActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, TuitionActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        TuitionActivity tuitionActivity = (TuitionActivity) objArr[0];
        int i = 2 % 2;
        int i2 = f644a;
        int i3 = i2 + 77;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = tuitionActivity.TuitionPaymentFragmentbindingInflater1;
        int i6 = i2 + 119;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            return Integer.valueOf(i5);
        }
        int i7 = 1 / 0;
        return Integer.valueOf(i5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityTuitionBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = f644a + 63;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            TuitionActivity$bindingInflater$1 tuitionActivity$bindingInflater$1 = TuitionActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            throw null;
        }
        TuitionActivity$bindingInflater$1 tuitionActivity$bindingInflater$2 = TuitionActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = asInterface + 91;
        f644a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 61 / 0;
        }
        return tuitionActivity$bindingInflater$2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        f644a = i2 % 128;
        int i3 = i2 % 2;
        TuitionActivity tuitionActivity = this;
        Intrinsics.checkNotNullParameter(tuitionActivity, "");
        tuitionActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(((ActivityTuitionBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityTuitionBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_tuition));
        int i4 = f644a + 25;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws Throwable {
        TuitionActivity tuitionActivity = (TuitionActivity) objArr[0];
        int i = 2 % 2;
        ActivityTuitionBinding activityTuitionBinding = (ActivityTuitionBinding) ((ViewBinding) tuitionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        ViewPager viewPager = activityTuitionBinding.vpPaymentDetail;
        FragmentManager supportFragmentManager = tuitionActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3.Companion companion = TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE;
        profileToDynamicRange.Companion companion2 = profileToDynamicRange.INSTANCE;
        viewPager.setAdapter(new TorchStateReset(supportFragmentManager, CollectionsKt.mutableListOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), profileToDynamicRange.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1()), CollectionsKt.mutableListOf(tuitionActivity.getString(R.string.title_payment), tuitionActivity.getString(R.string.title_tuition_history))));
        activityTuitionBinding.tabPaymentDetail.setupWithViewPager(activityTuitionBinding.vpPaymentDetail);
        int i2 = f644a + 113;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        f644a = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                obj.hashCode();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i3 = f644a + 75;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                return zOnOptionsItemSelected;
            }
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char mode = (char) (29944 - View.MeasureSpec.getMode(0));
            int maxKeyCode = 1755 - (KeyEvent.getMaxKeyCode() >> 16);
            int scrollDefaultDelay = 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            c(b, (short) (b | 193), (byte) 37, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mode, maxKeyCode, scrollDefaultDelay, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29944);
                int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0, 0);
                int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23;
                byte b2 = $$a[7];
                Object[] objArr3 = new Object[1];
                c(b2, (short) (b2 | 156), (byte) 52, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatTimeout, iLastIndexOf, scrollDefaultDelay2, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i2 = ~(91649119 | layoutDirection);
            int i3 = ~layoutDirection;
            int i4 = ((((-1609277613) + ((i2 | (~((-89420871) | i3))) * (-406))) + ((~(393672415 | i3)) * (-406))) + (((~(layoutDirection | (-304251546))) | (~((-91649120) | i3))) * 406)) - 243445392;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new int[]{443150111, 424629069, -1936493539, 1771200678, -766937509, 943657445, 493352610, 1912649184, -952990766, 832163871}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new int[]{1846514061, 481649836, 734928556, -942269109, 1307116904, 1745046905, 1455010265, 1880034134, 1925651920, 27711445}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay).substring(0, 5).codePointAt(1) - 95, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-1537691027};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - KeyEvent.keyCodeFromString("")), 1726 - KeyEvent.getDeadChar(0, 0), ExpandableListView.getPackedPositionChild(0L) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = DecorContentParent.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -243445392);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char threadPriority = (char) (29944 - ((Process.getThreadPriority(0) + 20) >> 6));
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 1756;
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 23;
                    byte b3 = $$a[7];
                    Object[] objArr8 = new Object[1];
                    c(b3, (short) (b3 | 156), (byte) 52, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(threadPriority, iLastIndexOf2, jumpTapTimeout, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new int[]{-844758446, -522659717, 1129757801, 1601665273, -2007213834, -1843239489, 1595058336, 83247294, 219337878, -377396058, -1934098496, 1466549013, 421418116, 1154791006}, TextUtils.getOffsetAfter("", 0) + 22, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new int[]{452640624, -1414127907, 484718548, -737350792, -1754983695, 1118211125, -314820476, 1175967331, 54565505, -630256422}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.saved_card).substring(7, 9).length() + 13, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cResolveSizeAndState = (char) (29944 - View.resolveSizeAndState(0, 0, 0));
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1755;
                        int i7 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22;
                        byte b4 = $$a[7];
                        short s = (short) (b4 | 104);
                        Object[] objArr11 = new Object[1];
                        c(b4, s, (byte) (s >>> 1), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSizeAndState, keyRepeatDelay, i7, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 29944);
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1755;
                        int i8 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22;
                        byte b5 = $$a[7];
                        Object[] objArr12 = new Object[1];
                        c(b5, (short) (b5 | 193), (byte) 37, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar, iKeyCodeFromString, i8, 986134021, false, (String) objArr12[0], null);
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
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i10 == i9) {
            int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i12 = ~iIdentityHashCode;
            int i13 = i11 + (-1489812297) + (((~((-279715905) | i12)) | (~((-705760690) | iIdentityHashCode)) | (~(1052590071 | iIdentityHashCode))) * 765) + (((~((-985476594) | i12)) | 279715904) * 1530) + (((~(iIdentityHashCode | (-985476594))) | (~(i12 | 1052590071))) * 765);
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr13[3])[0] = i15 ^ (i15 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
            int i16 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step6).substring(117, 120).codePointAt(2) - 276599840;
            int i17 = ~iCodePointAt;
            int i18 = i16 + (((~((-42041637) | i17)) | (~(195546543 | iCodePointAt))) * 988) + 1880253937 + (((~(iCodePointAt | (-59097519))) | 17055882 | (~(i17 | 195546543))) * 988);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr14[3])[0] = i20 ^ (i20 << 5);
            int i21 = f644a + 69;
            asInterface = i21 % 128;
            int i22 = i21 % 2;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1031;
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 16;
            byte b6 = $$a[7];
            short s2 = (short) (b6 | 52);
            Object[] objArr15 = new Object[1];
            c(b6, s2, (byte) s2, objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, maximumDrawingCacheSize, iIndexOf, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new int[]{-844758446, -522659717, 1129757801, 1601665273, -2007213834, -1843239489, 1595058336, 83247294, 219337878, -377396058, -1934098496, 1466549013, 421418116, 1154791006}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.input_2).substring(3, 4).codePointAt(0) - 95, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new int[]{452640624, -1414127907, 484718548, -737350792, -1754983695, 1118211125, -314820476, 1175967331, 54565505, -630256422}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
            int modifierMetaStateMask = 1030 - ((byte) KeyEvent.getModifierMetaStateMask());
            int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 15;
            byte b7 = $$a[7];
            Object[] objArr18 = new Object[1];
            c(b7, (short) (b7 | 156), (byte) 52, objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionChild, modifierMetaStateMask, iKeyCodeFromString2, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                int iIndexOf2 = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                int size = 15 - View.MeasureSpec.getSize(0);
                byte[] bArr = $$a;
                byte b8 = bArr[5];
                short s3 = bArr[7];
                Object[] objArr19 = new Object[1];
                c(b8, s3, (byte) s3, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(bitsPerPixel, iIndexOf2, size, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i23 = ((int[]) objArr20[3])[0];
            int i24 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int i25 = ~((int) Runtime.getRuntime().totalMemory());
            int i26 = (((-1753597967) + (((~(i25 | 985001710)) | (~((-134545985) | i25))) * (-184))) + (((547367948 | (~((-681913933) | i25))) | (~(437633762 | i25))) * 184)) - 992328776;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr[2])[0] = i28 ^ (i28 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new int[]{443150111, 424629069, -1936493539, 1771200678, -766937509, 943657445, 493352610, 1912649184, -952990766, 832163871}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 95, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new int[]{1846514061, 481649836, 734928556, -942269109, 1307116904, 1745046905, 1455010265, 1880034134, 1925651920, 27711445}, View.resolveSizeAndState(0, 0, 0) + 16, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-1537691027};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - (ViewConfiguration.getLongPressTimeout() >> 16)), Color.blue(0) + 1134, 18 - View.MeasureSpec.makeMeasureSpec(0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -1058752288, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
                int iIndexOf3 = 14 - TextUtils.indexOf((CharSequence) "", '0');
                byte b9 = $$a[7];
                short s4 = (short) (b9 | 52);
                Object[] objArr25 = new Object[1];
                c(b9, s4, (byte) s4, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cMakeMeasureSpec, doubleTapTimeout, iIndexOf3, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45994 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1117, 16 - TextUtils.indexOf((CharSequence) "", '0', 0)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1031;
                int i29 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15;
                byte[] bArr2 = $$a;
                byte b10 = bArr2[5];
                short s5 = bArr2[7];
                Object[] objArr26 = new Object[1];
                c(b10, s5, (byte) s5, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c2, maximumDrawingCacheSize2, i29, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{-844758446, -522659717, 1129757801, 1601665273, -2007213834, -1843239489, 1595058336, 83247294, 219337878, -377396058, -1934098496, 1466549013, 421418116, 1154791006}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{452640624, -1414127907, 484718548, -737350792, -1754983695, 1118211125, -314820476, 1175967331, 54565505, -630256422}, 15 - TextUtils.indexOf("", "", 0), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                    int iIndexOf4 = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int iGreen = 15 - Color.green(0);
                    byte b11 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c(b11, (short) (b11 | 156), (byte) 52, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(deadChar2, iIndexOf4, iGreen, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char deadChar3 = (char) KeyEvent.getDeadChar(0, 0);
                    int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0) + 1032;
                    int i30 = 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    byte b12 = $$a[7];
                    short s6 = (short) (b12 | 52);
                    Object[] objArr30 = new Object[1];
                    c(b12, s6, (byte) s6, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(deadChar3, iLastIndexOf3, i30, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i31 = f644a + 63;
                asInterface = i31 % 128;
                int i32 = i31 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str2 : strArr3) {
                    arrayList2.add(str2);
                }
            }
            throw null;
        }
        int i33 = f644a + 115;
        asInterface = i33 % 128;
        int i34 = i33 % 2;
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i35 = ((int[]) objArr[2])[0];
        int i36 = ((int[]) objArr[3])[0];
        int i37 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iMyTid = Process.myTid();
        int i38 = i35 + 28562700 + (((~(iMyTid | (-604039324))) | (-848319494)) * (-465)) + (((-604039324) | (~((-848319494) | iMyTid))) * 930) + ((iMyTid | (-536887298)) * 465);
        int i39 = i38 ^ (i38 << 13);
        int i40 = i39 ^ (i39 >>> 17);
        ((int[]) objArr31[2])[0] = i40 ^ (i40 << 5);
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = -1870535734;
        float f = 0.0f;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 91;
                $11 = i8 % 128;
                int i9 = i8 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 3291, 31 - (KeyEvent.getMaxKeyCode() >> 16), 1948206109, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i7++;
                    i2 = 2;
                    i4 = -1870535734;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                try {
                    Object[] objArr3 = new Object[i5];
                    objArr3[i6] = Integer.valueOf(iArr5[i10]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int i11 = 3291 - (TypedValue.complexToFloat(i6) > 0.0f ? 1 : (TypedValue.complexToFloat(i6) == 0.0f ? 0 : -1));
                        int iRgb = Color.rgb(i6, i6, i6) + 16777247;
                        byte b3 = (byte) i6;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatDelay, i11, iRgb, 1948206109, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i10++;
                    i5 = 1;
                    i6 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        int i12 = i6;
        System.arraycopy(iArr5, i12, iArr4, i12, length2);
        int i13 = 2;
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i14 = $10 + 35;
            $11 = i14 % 128;
            int i15 = i14 % i13;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i16 = $10 + 55;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            for (int i18 = 17; i18 > 1; i18--) {
                int i19 = $10 + 49;
                $11 = i19 % 128;
                int i20 = i19 % 2;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i18];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2559, Drawable.resolveOpacity(0, 0) + 29, 683220507, false, $$i(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
            }
            int i21 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i22 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 28880), 348 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i13 = 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = f644a + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        int i6 = ~i5;
        int i7 = (~(883091010 | i6)) | (-933949292) | (~(53103467 | i6));
        if (i4 != 866051620 + (((~(i5 | (-2245187))) | i7) * 590) + (i7 * (-1180)) + (((~((-53103468) | i6)) | (~(i6 | (-883091011)))) * 590)) {
            int i8 = (-1374208052) % 2;
            throw new ArithmeticException();
        }
        int i9 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_password_invalid).substring(12, 13).length() - 1785333775;
        int i10 = ~length;
        int i11 = 305604268 + (((~((-481970562) | i10)) | (~(1559907203 | length))) * 520);
        int i12 = ~((-1559907204) | i10);
        int i13 = ~(length | 1019148761);
        if (i9 != i11 + ((i12 | i13) * (-1040)) + ((i13 | (~(i10 | (-1019148762))) | 1077936642) * 520)) {
            throw null;
        }
        super.onResume();
        int i14 = f644a + 5;
        asInterface = i14 % 128;
        int i15 = i14 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        f644a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 != (-818443212) + ((~(1158612493 | i5)) * 979) + ((iIdentityHashCode | 328624950) * (-979)) + (((~(iIdentityHashCode | 1158612493)) | (~(i5 | 328624950))) * 979)) {
            int i6 = (-600848396) % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        if (i7 != (-196223171) + (((~(i8 | (-1741803629))) | (-25892298)) * (-465)) + (((-1741803629) | (~((-25892298) | i8))) * 930) + ((i8 | (-25235529)) * 465)) {
            throw new RuntimeException("-860532422");
        }
        super.onStart();
        int i9 = f644a + 75;
        asInterface = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = f644a + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        int i6 = ~((-126049815) | i5);
        int i7 = 338361176 + ((8607748 | i6) * (-280)) + ((i6 | (~(956037357 | i5))) * 140);
        int i8 = ~((-117442067) | i5);
        int i9 = ~i5;
        if (i4 != i7 + (((~(i9 | 1073479423)) | i8 | (~((-8607749) | i9))) * 140)) {
            throw null;
        }
        int i10 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i11 = 110604700 + (((~((-219213989) | iIdentityHashCode)) | 201347232 | (~(1935125319 | iIdentityHashCode))) * (-880));
        int i12 = (~((-219213989) | (~iIdentityHashCode))) | (-1935125320);
        int i13 = ~(iIdentityHashCode | 219213988);
        if (i10 != i11 + ((i12 | i13) * (-880)) + (i13 * 880)) {
            int i14 = asInterface + 53;
            f644a = i14 % 128;
            if (i14 % 2 == 0) {
                int[] iArr = new int[1913206797];
                iArr[1913206796] = 0;
                int i15 = 522614940 / 2;
                Toast.makeText((Context) null, iArr[-1], 0).show();
            } else {
                int[] iArr2 = new int[1913206797];
                iArr2[1913206796] = 1;
                int i16 = 522614940 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        super.onCreate(bundle);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        g();
        INSTANCE = new Companion(null);
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int length = (-1552369322) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_without_fiesta_poin).substring(1, 3).length();
        int length2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indomaret_instruction_step3).substring(8, 19).length() + 399027567;
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 1350217354;
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault1(length2, (-2133725142) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1), iCodePointAt, new Object[]{this}, 208016231, -208016231, length)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = f644a + 13;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        f644a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 14 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = f644a + 123;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        f644a = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentbindingInflater1 = ProgramType.b.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentbindingInflater1, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, -1320952406, 1320952407, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        f644a = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        int i5 = f644a + 37;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new int[]{-1899187152, -714093699, -1580288065, -1561085577, -487914769, -208554421, -432143328, -1206252006, 1820397704, 1727109051, 1721890845, 1996685316, 759176835, 1566883397, 790201496, 504110037, -1268949476, 183583456};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r5, short r6, int r7) {
        /*
            int r7 = r7 * 56
            int r7 = 122 - r7
            int r6 = r6 * 4
            int r0 = 1 - r6
            int r5 = r5 * 4
            int r5 = 3 - r5
            byte[] r1 = com.bpjstku.presentation.tuition.TuitionActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L19
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L25:
            int r3 = r3 + 1
            int r5 = r5 + 1
            r4 = r1[r5]
        L2b:
            int r7 = r7 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.tuition.TuitionActivity.$$i(byte, short, int):java.lang.String");
    }
}
