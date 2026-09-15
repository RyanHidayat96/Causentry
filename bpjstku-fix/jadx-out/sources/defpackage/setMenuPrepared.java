package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentBannerBinding;
import com.bpjstku.domain.banner.model.Banner;
import com.bumptech.glide.Glide;
import com.google.android.material.card.MaterialCardView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\t\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u00112\u0006\u0010\b\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018"}, d2 = {"LsetMenuPrepared;", "LMediaSessionCompatCallbackStubApi24;", "Lcom/bpjstku/domain/banner/model/Banner;", "Landroid/content/Context;", "p0", "", "p1", "", "p2", "Lkotlin/Function1;", "", "", "p3", "p4", "<init>", "(Landroid/content/Context;Ljava/util/List;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "Landroid/view/ViewGroup;", "Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/view/ViewGroup;)Landroid/view/View;", "TuitionPaymentFragmentbindingInflater1", "(Landroid/view/View;I)V", "b", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setMenuPrepared extends MediaSessionCompatCallbackStubApi24<Banner> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Function1<String, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Function1<String, Unit> b;
    private static final byte[] $$c = {8, -36, 87, -65};
    private static final int $$d = 71;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {14, 116, 92, -78, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 206;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1373a = 0;
    private static int asBinder = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {45565, 37841, 62910, 55175, 14719, 7002, 32042, 24391, 41195, 33492, 58604, 50766, 10305, 2600, 27650, 45556, 37825, 62860, 55174, 14698, 6979, 32040, 45561, 37843, 62907, 55173, 14691, 6998, 32042, 24379, 41185, 33478, 58542, 50793, 10321, 2614, 27667};
    private static long d = -1509073630208093249L;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 15
            int r0 = 53 - r7
            int r8 = r8 * 3
            int r8 = r8 + 84
            byte[] r1 = defpackage.setMenuPrepared.$$a
            int r6 = 93 - r6
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r8 + 1
            int r8 = r3 + (-11)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setMenuPrepared.c(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setMenuPrepared(Context context, List list, boolean z, Function1 function1, Function1 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            int i2 = f1373a;
            int i3 = i2 + 71;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 31;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            function1 = null;
        }
        this(context, list, z, function1, function2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private setMenuPrepared(Context context, List<Banner> list, boolean z, Function1<? super String, Unit> function1, Function1<? super String, Unit> function2) {
        super(context, list, z);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.b = function1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function2;
    }

    @Override // defpackage.MediaSessionCompatCallbackStubApi24
    public final View TuitionPaymentFragmentspecialinlinedviewModeldefault2(ViewGroup viewGroup) {
        FragmentBannerBinding fragmentBannerBindingInflate;
        int i = 2 % 2;
        int i2 = f1373a + 93;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            fragmentBannerBindingInflate = FragmentBannerBinding.inflate(LayoutInflater.from(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2), viewGroup, true);
            Intrinsics.checkNotNullExpressionValue(fragmentBannerBindingInflate, "");
        } else {
            fragmentBannerBindingInflate = FragmentBannerBinding.inflate(LayoutInflater.from(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(fragmentBannerBindingInflate, "");
        }
        MaterialCardView root = fragmentBannerBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2186, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 40, 841711447, false, $$e(b, b2, (byte) (b2 + 3)), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(d), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.keyCodeFromString("") + 33017), 3011 - TextUtils.indexOf("", ""), 26 - KeyEvent.keyCodeFromString(""), 321985076, false, $$e(b3, b4, (byte) (b4 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 36505), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3376, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16, -968507904, false, $$e(b5, b6, (byte) (-b6)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i5 = $11 + 71;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            try {
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - Drawable.resolveOpacity(0, 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3376, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 17, -968507904, false, $$e(b7, b8, (byte) (-b8)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                int i7 = $11 + 43;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr);
    }

    @Override // defpackage.MediaSessionCompatCallbackStubApi24
    public final void TuitionPaymentFragmentbindingInflater1(View view, int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        int i3 = asBinder + 79;
        f1373a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        FragmentBannerBinding fragmentBannerBindingBind = FragmentBannerBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(fragmentBannerBindingBind, "");
        final Banner banner = (Banner) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatDelay = (char) (29944 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
            int iRgb = (-16775461) - Color.rgb(0, 0, 0);
            int maximumFlingVelocity = 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) 89, bArr[5], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, iRgb, maximumFlingVelocity, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(ViewConfiguration.getKeyRepeatDelay() >> 16, 22 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(22 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15, (char) View.combineMeasuredStates(0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int iIndexOf = 1755 - TextUtils.indexOf("", "");
            int i5 = 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            byte b = $$a[7];
            Object[] objArr5 = new Object[1];
            c((byte) 52, b, b, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iIndexOf, i5, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = f1373a + 25;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 29944);
                int i8 = 1756 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int i9 = 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                c(b2, b3, b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority, i8, i9, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i10 = ~((-268440221) | startElapsedRealtime);
            int i11 = ~startElapsedRealtime;
            int i12 = (-2108100255) + ((i10 | (~(469604094 | i11))) * 920) + (((~((-413766301) | i11)) | 268440220) * 920) + (((~(startElapsedRealtime | 469604094)) | (~((-268440221) | i11)) | (~((-145326081) | startElapsedRealtime))) * 920) + 717696049;
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr[3])[0] = i14 ^ (i14 << 5);
        } else {
            try {
                Object[] objArr8 = {379140472};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (MotionEvent.axisFromString("") + 42050), TextUtils.getTrimmedLength("") + 1726, 29 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = DecorContentParent.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(i, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr8), 717696049);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29944);
                    int fadingEdgeLength = 1755 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i15 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr9 = new Object[1];
                    c(b4, b5, b5, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout, fadingEdgeLength, i15, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr10 = new Object[1];
                    e(KeyEvent.keyCodeFromString(""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21, (char) View.resolveSizeAndState(0, 0, 0), objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e((ViewConfiguration.getScrollBarSize() >> 8) + 22, 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr11);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char mirror = (char) (AndroidCharacter.getMirror('0') + 29896);
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1755;
                        int iMyPid = (Process.myPid() >> 22) + 23;
                        byte b6 = $$a[7];
                        Object[] objArr12 = new Object[1];
                        c((byte) 52, b6, b6, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, absoluteGravity, iMyPid, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cArgb = (char) (Color.argb(0, 0, 0, 0) + 29944);
                        int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 1755;
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 24;
                        byte[] bArr2 = $$a;
                        Object[] objArr13 = new Object[1];
                        c((byte) 89, bArr2[5], bArr2[7], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cArgb, threadPriority2, iLastIndexOf, 986134021, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    objArr = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
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
        if (((int[]) objArr[0])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i16 = f1373a + 43;
                asBinder = i16 % 128;
                int i17 = i16 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw null;
        }
        int i18 = ((int[]) objArr[3])[0];
        int i19 = ((int[]) objArr[0])[0];
        int i20 = ((int[]) objArr[1])[0];
        new int[1][0] = i19;
        new int[1][0] = i20;
        int i21 = i18 + 1878469249 + ((1030493126 | i) * 376) + (((~((~i) | 622836993)) | 408945350) * (-376)) + (((~(i | (-622836994))) | (-410234568)) * 376);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        int[] iArr = {i23 ^ (i23 << 5)};
        Glide.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2).TuitionPaymentFragmentspecialinlinedviewModeldefault2(banner.TuitionPaymentFragmentspecialinlinedviewModeldefault3).TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getResources().getDrawable(R.drawable.ic_placeholder_wide)).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getResources().getDrawable(R.drawable.ic_placeholder_wide)).into(fragmentBannerBindingBind.imgPromo);
        fragmentBannerBindingBind.imgPromo.setOnClickListener(new View.OnClickListener() { // from class: saveToolbarHierarchyState
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                setMenuPrepared.TuitionPaymentFragmentspecialinlinedviewModeldefault1(banner, this, view2);
            }
        });
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Banner banner, setMenuPrepared setmenuprepared, View view) {
        int i = 2 % 2;
        int i2 = f1373a + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (banner.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length() > 0) {
                int i4 = f1373a + 5;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                Function1<String, Unit> function1 = setmenuprepared.b;
                if (function1 != null) {
                    function1.invoke(banner.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            }
            setmenuprepared.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(banner.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } finally {
            ViewPortBuilder.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r7, short r8, short r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r0 = defpackage.setMenuPrepared.$$c
            int r9 = r9 * 3
            int r9 = 115 - r9
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r5 = r2
            r9 = r8
            goto L2a
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2a:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setMenuPrepared.$$e(int, short, short):java.lang.String");
    }
}
