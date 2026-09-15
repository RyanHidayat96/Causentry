package com.bpjstku.util.viewbinding;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.promo.model.response.ProvinceItem;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\f\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0005R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00028\u00000\u00118%X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0017\u001a\u00028\u00008EX\u0085\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Landroidx/viewbinding/ViewBinding;", "B", "Lcom/nbs/nucleosnucleo/presentation/BaseActivity;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "", "setContentView", "(I)V", "Landroid/view/View;", "(Landroid/view/View;)V", "c_", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "INotificationSideChannelStubProxy", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BindingBaseActivity<B extends ViewBinding> extends BaseActivity {

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    public final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: AspectRatio
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BindingBaseActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
        }
    });
    private static final byte[] $$l = {70, -114, 113, 8};
    private static final int $$m = 252;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {12, 11, -9, -106, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 187;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int b = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {9455, 63114, 32830, 21442, 27977, 14581, 51862, 58438, 47025, 16711, 7300, 11859, 63503, 35743, 42294, 28893, 579, 56775, 61334, 47423, 21669, 26199, 45561, 25498, 5417, 50898, 63559, 44523, 24452, 28968, 8873, 54343, 35284, 47974, 27917, 7827, 12341, 45526, 25527, 5406, 50915, 63546, 44482, 24481, 28980, 8843, 54312, 35275, 47947, 27959, 7850, 12309, 58855, 45557, 25490, 5421, 50892, 63552, 44519, 24468, 28931, 8836, 54343, 35275, 47994, 27943, 7825, 12340, 58831};
    private static long TuitionPaymentFragmentbindingInflater1 = 3073933226656097270L;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void j(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 144 - r8
            int r0 = 53 - r6
            byte[] r1 = com.bpjstku.util.viewbinding.BindingBaseActivity.$$d
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.viewbinding.BindingBaseActivity.j(short, short, short, java.lang.Object[]):void");
    }

    protected abstract Function1<LayoutInflater, B> TuitionPaymentFragmentbindingInflater1();

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(p0);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        setContentView(((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getRoot());
        c_();
        int i4 = b + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(int p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.setContentView(p0);
        c_();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(View p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.setContentView(p0);
        c_();
        int i4 = b + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final WindowInsetsCompat TuitionPaymentFragmentspecialinlinedviewModeldefault1(View view, View view2, WindowInsetsCompat windowInsetsCompat) {
        int iMax;
        int i = 2 % 2;
        int i2 = b + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view2, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets2, "");
        int i4 = insets.left;
        int i5 = insets.top;
        int i6 = insets.right;
        try {
            if (view.findViewById(view.getResources().getIdentifier("bnvMain", "id", view.getContext().getPackageName())) != null) {
                iMax = 0;
            } else {
                iMax = Math.max(insets.bottom, insets2.bottom);
                int i7 = b + 73;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                int i8 = i7 % 2;
            }
        } catch (Exception unused) {
        }
        view2.setPadding(i4, i5, i6, iMax);
        return windowInsetsCompat;
    }

    public void c_() {
        int i = 2 % 2;
        final View root = ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        ViewCompat.setOnApplyWindowInsetsListener(root, new OnApplyWindowInsetsListener() { // from class: AspectRatioRatio
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return BindingBaseActivity.b(root, view, windowInsetsCompat);
            }
        });
        if (Build.VERSION.SDK_INT >= 35) {
            int i2 = b + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            root.requestApplyInsets();
            int i4 = b + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static void k(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i) {
            int i5 = $11 + 93;
            $10 = i5 % 128;
            if (i5 % i3 != 0) {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i2 >>> i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), 2187 - (ViewConfiguration.getLongPressTimeout() >> 16), 39 - TextUtils.lastIndexOf("", '0'), 841711447, false, $$n(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 33017), View.MeasureSpec.getMode(0) + 3011, 26 - TextUtils.getOffsetAfter("", 0), 321985076, false, $$n(b4, b5, (byte) (b5 - 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.rgb(0, 0, 0) + 16813721), ((Process.getThreadPriority(0) + 20) >> 6) + 3376, 17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -968507904, false, $$n(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i2 + i7])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2187, ExpandableListView.getPackedPositionGroup(0L) + 40, 841711447, false, $$n(b8, b9, b9), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33017 - TextUtils.getOffsetBefore("", 0)), (Process.myPid() >> 22) + 3011, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25, 321985076, false, $$n(b10, b11, (byte) (b11 - 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((Process.myTid() >> 22) + 36505), KeyEvent.keyCodeFromString("") + 3376, Color.red(0) + 17, -968507904, false, $$n(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
            i3 = 2;
        }
        char[] cArr = new char[i];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i8 = $10 + 97;
        $11 = i8 % 128;
        int i9 = 2;
        int i10 = i8 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i) {
            int i11 = $11 + 49;
            $10 = i11 % 128;
            int i12 = i11 % i9;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                byte b14 = (byte) 0;
                byte b15 = (byte) (b14 + 1);
                i9 = 2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36504), (ViewConfiguration.getEdgeSlop() >> 16) + 3376, 17 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -968507904, false, $$n(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, Object.class});
            } else {
                i9 = 2;
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
            int i2 = 1032 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int iRed = Color.red(0) + 15;
            byte[] bArr = $$d;
            byte b2 = bArr[7];
            byte b3 = bArr[5];
            Object[] objArr2 = new Object[1];
            j(b2, b3, (short) (b3 | 140), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, i2, iRed, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        k(22 - (Process.myPid() >> 22), (char) (38161 - TextUtils.indexOf((CharSequence) "", '0')), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_indosat_phone_number).substring(0, 20).length() - 20, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        k(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_user_canceled_liveness_with_back).substring(0, 54).codePointAt(43) - 83, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_with_atm_bersama).substring(1, 3).length() - 2), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step8).substring(31, 33).length() + 20, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int i3 = 1032 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int i4 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
            byte[] bArr2 = $$d;
            byte b4 = bArr2[7];
            byte b5 = bArr2[5];
            Object[] objArr5 = new Object[1];
            j(b4, b5, (short) (b5 | 88), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(tapTimeout, i3, i4, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cRed = (char) Color.red(0);
                int deadChar = 1031 - KeyEvent.getDeadChar(0, 0);
                int defaultSize = 15 - View.getDefaultSize(0, 0);
                byte b6 = $$d[7];
                Object[] objArr6 = new Object[1];
                j((byte) 52, b6, (short) (b6 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRed, deadChar, defaultSize, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = (((-1111823214) + (((~((-269529195) | iIdentityHashCode)) | (~((-25249025) | iIdentityHashCode))) * 69)) + (((~(iIdentityHashCode | (-801721622))) | ((~((-1046001792) | iIdentityHashCode)) | 776472597)) * (-69))) - 216226934;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            k(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_face_too_close).substring(18, 19).length() + 15, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.xl_instruction_step3).substring(3, 4).length() + 31), 37 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            k((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 17, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 63, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1080057409};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46039 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1134 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 685635338, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int iRed2 = Color.red(0) + 1031;
                    int iIndexOf = 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    byte[] bArr3 = $$d;
                    byte b7 = bArr3[7];
                    byte b8 = bArr3[5];
                    Object[] objArr12 = new Object[1];
                    j(b7, b8, (short) (b8 | 140), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(windowTouchSlop, iRed2, iIndexOf, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Color.argb(0, 0, 0, 0) + 45993), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1117, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int iIndexOf2 = 1031 - TextUtils.indexOf("", "", 0, 0);
                    int iIndexOf3 = 15 - TextUtils.indexOf("", "", 0, 0);
                    byte b9 = $$d[7];
                    Object[] objArr13 = new Object[1];
                    j((byte) 52, b9, (short) (b9 | 37), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(threadPriority, iIndexOf2, iIndexOf3, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    k(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_3).substring(1, 3).length() + 20, (char) (38162 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_cvv).substring(0, 3).codePointAt(1) - 86, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    k(15 - Color.green(0), (char) Color.green(0), 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1032;
                        int modifierMetaStateMask2 = 14 - ((byte) KeyEvent.getModifierMetaStateMask());
                        byte[] bArr4 = $$d;
                        byte b10 = bArr4[7];
                        byte b11 = bArr4[5];
                        Object[] objArr16 = new Object[1];
                        j(b10, b11, (short) (b11 | 88), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, modifierMetaStateMask, modifierMetaStateMask2, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cIndexOf2 = (char) TextUtils.indexOf("", "", 0);
                        int offsetAfter = 1031 - TextUtils.getOffsetAfter("", 0);
                        int keyRepeatDelay = 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte[] bArr5 = $$d;
                        byte b12 = bArr5[7];
                        byte b13 = bArr5[5];
                        Object[] objArr17 = new Object[1];
                        j(b12, b13, (short) (b13 | 140), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf2, offsetAfter, keyRepeatDelay, 1357589585, false, (String) objArr17[0], null);
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
        int i10 = ((int[]) objArr[1])[0];
        int i11 = ((int[]) objArr[3])[0];
        if (i11 != i10) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
                b = i12 % 128;
                int i13 = i12 % 2;
                for (String str : strArr2) {
                    int i14 = b + 63;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                    int i15 = i14 % 2;
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i11));
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i16 = ((int[]) objArr[2])[0];
        int i17 = ((int[]) objArr[3])[0];
        int i18 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i19 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
        int i20 = ~((-602702789) | i19);
        int i21 = 1657850973 + ((21758016 | i20) * (-280)) + ((i20 | (~(358422618 | i19))) * 140);
        int i22 = ~((-580944773) | i19);
        int i23 = ~i19;
        int i24 = i16 + i21 + (((~(i23 | 939367390)) | i22 | (~((-21758017) | i23))) * 140);
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        ((int[]) objArr18[2])[0] = i26 ^ (i26 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 29944);
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1755;
            int iIndexOf4 = 22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            byte b14 = $$d[5];
            Object[] objArr19 = new Object[1];
            j((byte) 15, b14, (short) (b14 | 36), objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cResolveOpacity, maxKeyCode, iIndexOf4, 986134021, false, (String) objArr19[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null);
        Object[] objArr20 = new Object[1];
        k(TextUtils.lastIndexOf("", '0', 0, 0) + 23, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 38162), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_instruction_step2).substring(13, 14).length() - 1, objArr20);
        Class<?> cls4 = Class.forName((String) objArr20[0]);
        Object[] objArr21 = new Object[1];
        k((ViewConfiguration.getTapTimeout() >> 16) + 15, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.no_saved_cards).substring(7, 8).codePointAt(0) - 78, objArr21);
        long jLongValue3 = ((Long) cls4.getDeclaredMethod((String) objArr21[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
            char c = (char) (29945 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int i27 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1754;
            int trimmedLength = 23 - TextUtils.getTrimmedLength("");
            byte[] bArr6 = $$d;
            byte b15 = bArr6[7];
            Object[] objArr22 = new Object[1];
            j(b15, bArr6[5], b15, objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c, i27, trimmedLength, 1596667560, false, (String) objArr22[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cLastIndexOf2 = (char) (29943 - TextUtils.lastIndexOf("", '0', 0, 0));
                int i28 = 1756 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0', 0, 0);
                byte[] bArr7 = $$d;
                byte b16 = bArr7[7];
                byte b17 = bArr7[5];
                Object[] objArr23 = new Object[1];
                j(b16, b17, (short) (b17 | 88), objArr23);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cLastIndexOf2, i28, iLastIndexOf, 1599039318, false, (String) objArr23[0], null);
            }
            Object[] objArr24 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{((int[]) objArr24[0])[0]}, new int[]{((int[]) objArr24[1])[0]}, (Object[]) objArr24[2], new int[1], (String[]) objArr24[4]};
            int i29 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
            int i30 = ((153751189 + (((~(211549695 | i29)) | 1052730) * (-828))) + ((i29 | 211549695) * (-828))) - 1462908426;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i32 ^ (i32 << 5);
        } else {
            Object[] objArr25 = new Object[1];
            k(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 4), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1, objArr25);
            Class<?> cls5 = Class.forName((String) objArr25[0]);
            Object[] objArr26 = new Object[1];
            k(AndroidCharacter.getMirror('0') - ' ', (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 53 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr26);
            int iIntValue2 = ((Integer) cls5.getMethod((String) objArr26[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr27 = {-1080057409};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 42049), 1727 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = ProvinceItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).newInstance(objArr27), 1901548022, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char maximumFlingVelocity = (char) (29944 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                int size = View.MeasureSpec.getSize(0) + 1755;
                int i33 = 24 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                byte[] bArr8 = $$d;
                byte b18 = bArr8[7];
                byte b19 = bArr8[5];
                Object[] objArr28 = new Object[1];
                j(b18, b19, (short) (b19 | 88), objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(maximumFlingVelocity, size, i33, 1599039318, false, (String) objArr28[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
            try {
                Object[] objArr29 = new Object[1];
                k((Process.myTid() >> 22) + 22, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_denied).substring(0, 6).codePointAt(3) + 38052), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima4_permata).substring(19, 20).codePointAt(0) - 101, objArr29);
                Class<?> cls6 = Class.forName((String) objArr29[0]);
                Object[] objArr30 = new Object[1];
                k(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_password_empty).substring(7, 8).codePointAt(0) - 95, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 106), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr30);
                long jLongValue4 = ((Long) cls6.getDeclaredMethod((String) objArr30[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char scrollBarFadeDuration = (char) (29944 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1755;
                    int i34 = 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte[] bArr9 = $$d;
                    byte b20 = bArr9[7];
                    Object[] objArr31 = new Object[1];
                    j(b20, bArr9[5], b20, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(scrollBarFadeDuration, iResolveOpacity, i34, 1596667560, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char scrollBarFadeDuration2 = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
                    int defaultSize2 = View.getDefaultSize(0, 0) + 1755;
                    int edgeSlop = 23 - (ViewConfiguration.getEdgeSlop() >> 16);
                    byte b21 = $$d[5];
                    Object[] objArr32 = new Object[1];
                    j((byte) 15, b21, (short) (b21 | 36), objArr32);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(scrollBarFadeDuration2, defaultSize2, edgeSlop, 986134021, false, (String) objArr32[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i35 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0];
        int i36 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        if (i36 == i35) {
            int i37 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
            b = i37 % 128;
            int i38 = i37 % 2;
            int i39 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
            Object[] objArr33 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i40 = ~iIdentityHashCode2;
            int i41 = i39 + 1802896626 + (((~(i40 | 88287620)) | 124314805) * (-1042)) + ((88287620 | iIdentityHashCode2) * 521) + (((~(iIdentityHashCode2 | (-124314806))) | 88088708 | (~(i40 | 124513717))) * 521);
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArr33[3])[0] = i43 ^ (i43 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
        if (strArr4 != null) {
            int i44 = 0;
            while (i44 < strArr4.length) {
                int i45 = b + 85;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i45 % 128;
                if (i45 % 2 != 0) {
                    arrayList2.add(strArr4[i44]);
                    i44 += 99;
                } else {
                    arrayList2.add(strArr4[i44]);
                    i44++;
                }
                int i46 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
                b = i46 % 128;
                int i47 = i46 % 2;
            }
        }
        int[] iArr = new int[i36];
        int i48 = i36 - 1;
        iArr[i48] = 1;
        Toast.makeText((Context) null, iArr[((i36 * i48) % 2) - 1], 1).show();
        int i49 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
        Object[] objArr34 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
        int i50 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 756774982;
        int i51 = i49 + (-1752197470) + (((~((-239083777) | (~i50))) | 26481350) * (-591)) + ((i50 | (-239083777)) * 591);
        int i52 = (i51 << 13) ^ i51;
        int i53 = i52 ^ (i52 >>> 17);
        ((int[]) objArr34[3])[0] = i53 ^ (i53 << 5);
    }

    public static /* synthetic */ ViewBinding TuitionPaymentFragmentbindingInflater1(BindingBaseActivity bindingBaseActivity) {
        int i = 2 % 2;
        int i2 = b + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Function1<LayoutInflater, B> function1TuitionPaymentFragmentbindingInflater1 = bindingBaseActivity.TuitionPaymentFragmentbindingInflater1();
        LayoutInflater layoutInflater = bindingBaseActivity.getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
        B bInvoke = function1TuitionPaymentFragmentbindingInflater1.invoke(layoutInflater);
        int i4 = b + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return bInvoke;
    }

    public static /* synthetic */ WindowInsetsCompat b(View view, View view2, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = b + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        WindowInsetsCompat windowInsetsCompatTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, view2, windowInsetsCompat);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        b = i4 % 128;
        int i5 = i4 % 2;
        return windowInsetsCompatTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = b + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
        int i4 = b + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = b + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
        int i4 = b + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$n(byte r7, int r8, int r9) {
        /*
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r9 = r9 * 3
            int r9 = 3 - r9
            byte[] r0 = com.bpjstku.util.viewbinding.BindingBaseActivity.$$l
            int r8 = r8 * 3
            int r8 = r8 + 109
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r5 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2c:
            int r9 = -r9
            int r8 = r8 + r9
            r9 = r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.viewbinding.BindingBaseActivity.$$n(byte, int, int):java.lang.String");
    }
}
