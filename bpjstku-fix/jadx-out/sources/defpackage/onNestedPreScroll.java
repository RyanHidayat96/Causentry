package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentShowBannerCloseServiceBinding;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u000f\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00198\u0015X\u0094D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0011\u001a\u00020\u001e8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b\u0014\u0010 R\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0018\u0010\u0016\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001c\u0010%"}, d2 = {"LonNestedPreScroll;", "LMediaSessionCompatMediaSessionImplApi181;", "Lkotlin/Function0;", "", "p0", "p1", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentbindingInflater1", "()V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "Lkotlin/jvm/functions/Function0;", "a", "Lcom/bpjstku/databinding/FragmentShowBannerCloseServiceBinding;", "Lcom/bpjstku/databinding/FragmentShowBannerCloseServiceBinding;", "", "asBinder", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()I", "", "Z", "()Z", "", "Ljava/lang/String;", "g", "LonNestedPreScroll$b;", "LonNestedPreScroll$b;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class onNestedPreScroll extends MediaSessionCompatMediaSessionImplApi181 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] asInterface;
    private static int cancel;
    private static long onTransact;
    private FragmentShowBannerCloseServiceBinding TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public b a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String g;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function0<Unit> b;
    private static final byte[] $$c = {93, -77, 2, Base64.padSymbol};
    private static final int $$f = 87;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {112, 19, -59, 97, 16, 2, -59, 56, 18, -2, 13, 5, -5, 14, -67, 70, 6, -9, 18, -10, 13, 10, -15, 23, -7, 10, 3, -60, 57, 16, 2, 7, 3, 8, -10, -51, 60, 3, 0, 23, 5, 1, -9, -51, 73, -12, 9, 11, 1, -7, 21, 5, -7, 5, 11, -62, 73, -12, 19, -9, 4, 13, -60, 41, 20, 9, 11, 1, -7, 21, -38, 37, 14, 5, -1, 7, 11, -34, 20, 19, -9, 4, 13, -31, 45, -76, 51, 20, 9, 11, 1, -7, 21, 5, -7, 5, 11, -36, 37, 14, 5, -1, 7, 11, -34, 20, 19, -9, 4, 13, -70, 21, -13, 73, 9, 12, -3, 0, -2, -61, 76, -7, 16, -7, 6, 1, -57, 19, -11, 76, -7, 16, -7, 6, 1, -57, 18, -10, 76, -7, 16, -7, 6, 1, -57, 17, -9, 4, 73, 9, 2, 1, 9, -5, 3, -60, 73, 15, -11, 12, 10, -75, 68, 5, 5, -1, 24, -5, 12, -76, 19, 37, -8, 15, -7, 10, 3, -26, 21, 28, -8, -4, 13, 10, -42, 48, -13, 10, 10, -4, 13, 10, 3, 1, -7, 2, 10, -4, 15, 1, 9, 2, 1, 9, -5, 3, 22, -9, 0, 22, -38, 38, -7, 5, 11, -4, 5, 5, -1, 24, -5, 12, -61};
    private static final int $$e = 57;
    private static final byte[] $$a = {49, 89, 41, 48, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
    private static final int $$b = 34;
    private static int cancelAll = 1;
    private static int INotificationSideChannel = 0;
    private static int notify = 1;

    public interface b {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = defpackage.onNestedPreScroll.$$a
            int r7 = r7 * 3
            int r7 = 100 - r7
            int r8 = 11 - r8
            int r9 = r9 * 10
            int r9 = r9 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r5 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r9 = -r9
            int r7 = r7 + r9
            int r7 = r7 + (-5)
            int r9 = r3 + 1
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.onNestedPreScroll.c(int, int, int, java.lang.Object[]):void");
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
    private static void f(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 167
            int r7 = 170 - r7
            int r8 = r8 * 15
            int r8 = r8 + 84
            byte[] r0 = defpackage.onNestedPreScroll.$$d
            int r9 = r9 * 115
            int r9 = r9 + 53
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r5 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L2e:
            int r7 = r7 + r3
            int r7 = r7 + (-4)
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.onNestedPreScroll.f(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ onNestedPreScroll(Function0 function0, Function0 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            function0 = null;
        }
        if ((i & 2) != 0) {
            int i3 = notify + 7;
            int i4 = i3 % 128;
            INotificationSideChannel = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = i4 + 43;
            notify = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            function1 = null;
        }
        this(function0, function1);
    }

    public onNestedPreScroll(Function0<Unit> function0, Function0<Unit> function1) {
        this.b = function0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = R.layout.fragment_show_banner_close_service;
        this.g = "";
    }

    /* JADX INFO: renamed from: onNestedPreScroll$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"LonNestedPreScroll$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "", "p0", "Lkotlin/Function0;", "", "p1", "p2", "LonNestedPreScroll;", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)LonNestedPreScroll;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static onNestedPreScroll TuitionPaymentFragmentbindingInflater1(String p0, Function0<Unit> p1, Function0<Unit> p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            onNestedPreScroll onnestedprescroll = new onNestedPreScroll(p1, p2);
            Bundle bundle = new Bundle();
            bundle.putString("result_dialog_image", p0);
            onnestedprescroll.setArguments(bundle);
            return onnestedprescroll;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i5 = $10 + 61;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $11 + 59;
            $10 = i7 % 128;
            if (i7 % i3 != 0) {
                int i8 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(asInterface[i >> i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - Process.getGidForName("")), KeyEvent.keyCodeFromString("") + 2187, (ViewConfiguration.getTapTimeout() >> 16) + 40, 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(onTransact), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 33017), 3059 - AndroidCharacter.getMirror('0'), MotionEvent.axisFromString("") + 27, 321985076, false, $$g(b4, b4, $$c[2]), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 36505), ExpandableListView.getPackedPositionType(0L) + 3376, TextUtils.lastIndexOf("", '0', 0) + 18, -968507904, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
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
                int i9 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(asInterface[i + i9])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 2188, 40 - TextUtils.indexOf("", "", 0, 0), 841711447, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i9), Long.valueOf(onTransact), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (View.MeasureSpec.getMode(0) + 33017), 3011 - View.MeasureSpec.getSize(0), Process.getGidForName("") + 27, 321985076, false, $$g(b9, b9, $$c[2]), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i9] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (36505 - Color.red(0)), 3377 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 17, -968507904, false, $$g(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
            i3 = 2;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i10 = $11 + 13;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            try {
                Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (36505 - TextUtils.indexOf("", "")), 3376 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 17 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -968507904, false, $$g(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getB() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 877;
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10;
            byte b2 = $$a[11];
            byte b3 = (byte) (b2 + 1);
            byte b4 = b2;
            Object[] objArr2 = new Object[1];
            c(b3, b4, b4, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop, modifierMetaStateMask, doubleTapTimeout, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 21 - TextUtils.indexOf((CharSequence) "", '0'), (char) (31200 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(22 - TextUtils.getOffsetAfter("", 0), 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int scrollBarFadeDuration = 876 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int scrollDefaultDelay = 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            byte[] bArr = $$a;
            byte b5 = bArr[11];
            Object[] objArr5 = new Object[1];
            c(b5, bArr[8], (byte) (b5 + 1), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, scrollBarFadeDuration, scrollDefaultDelay, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 876;
                int longPressTimeout = 10 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte b6 = (byte) ($$a[11] + 1);
                byte b7 = (byte) (b6 + 2);
                Object[] objArr6 = new Object[1];
                c(b6, b7, (byte) (b7 - 2), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup, jumpTapTimeout, longPressTimeout, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iMyPid = Process.myPid();
            int i2 = ~iMyPid;
            int i3 = ((((-501032786) + (((~((-89270209) | i2)) | 84944256) * (-108))) + (((~(i2 | 129580437)) | ((~((-129580438) | iMyPid)) | (-133906390))) * 54)) + ((iMyPid | (-133906390)) * 54)) - 572002892;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
            int i6 = INotificationSideChannel + 1;
            notify = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 5;
            }
        } else {
            Object[] objArr8 = new Object[1];
            e(((Process.getThreadPriority(0) + 20) >> 6) + 37, 17 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (TextUtils.getOffsetBefore("", 0) + 56965), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(53 - (ViewConfiguration.getLongPressTimeout() >> 16), 16 - TextUtils.getTrimmedLength(""), (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i8 = INotificationSideChannel + 121;
            notify = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr10 = {Integer.valueOf(iIntValue), -572002892};
                byte[] bArr2 = $$d;
                byte b8 = bArr2[41];
                byte b9 = b8;
                Object[] objArr11 = new Object[1];
                f(b8, b9, b9, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b10 = bArr2[38];
                byte b11 = b10;
                Object[] objArr12 = new Object[1];
                f(b10, b11, b11, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 877;
                    int keyRepeatTimeout = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte b12 = (byte) ($$a[11] + 1);
                    byte b13 = (byte) (b12 + 2);
                    Object[] objArr14 = new Object[1];
                    c(b12, b13, (byte) (b13 - 2), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(threadPriority, iIndexOf, keyRepeatTimeout, 1324201839, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    e(Color.red(0), 21 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 31199), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(Color.blue(0) + 22, 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) KeyEvent.keyCodeFromString(""), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int mirror = AndroidCharacter.getMirror('0') + 828;
                        int i10 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte[] bArr3 = $$a;
                        byte b14 = bArr3[11];
                        Object[] objArr17 = new Object[1];
                        c(b14, bArr3[8], (byte) (b14 + 1), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, mirror, i10, 254769921, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                        int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
                        int i11 = 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte b15 = $$a[11];
                        byte b16 = (byte) (b15 + 1);
                        byte b17 = b15;
                        Object[] objArr18 = new Object[1];
                        c(b16, b17, b17, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar, scrollDefaultDelay2, i11, -1199417970, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr == null) {
                throw null;
            }
            int i12 = INotificationSideChannel + 93;
            notify = i12 % 128;
            int i13 = i12 % 2;
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i14 = ((int[]) objArr[1])[0];
        Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int i15 = ~System.identityHashCode(this);
        int i16 = i14 + 1188827764 + ((914086517 | i15) * 184) + (((~(i15 | 914020389)) | 40442485) * 184);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr19[1])[0] = i18 ^ (i18 << 5);
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: d */
    public final boolean getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 37;
        int i3 = i2 % 128;
        notify = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = i3 + 87;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 43;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentShowBannerCloseServiceBinding fragmentShowBannerCloseServiceBindingInflate = FragmentShowBannerCloseServiceBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentbindingInflater1 = fragmentShowBannerCloseServiceBindingInflate;
        if (fragmentShowBannerCloseServiceBindingInflate == null) {
            int i4 = INotificationSideChannel + 107;
            notify = i4 % 128;
            int i5 = i4 % 2;
            Object obj = null;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 == 0) {
                obj.hashCode();
                throw null;
            }
            fragmentShowBannerCloseServiceBindingInflate = null;
        }
        FrameLayout root = fragmentShowBannerCloseServiceBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 103;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i4 = INotificationSideChannel + 27;
            notify = i4 % 128;
            int i5 = i4 % 2;
            String string = arguments.getString("result_dialog_image");
            if (i5 == 0) {
                int i6 = 39 / 0;
                if (string == null) {
                    string = "";
                }
            } else if (string == null) {
                string = "";
            }
            this.g = string;
        }
        int i7 = INotificationSideChannel + 33;
        notify = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 51;
        notify = i2 % 128;
        FragmentShowBannerCloseServiceBinding fragmentShowBannerCloseServiceBinding = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        FragmentShowBannerCloseServiceBinding fragmentShowBannerCloseServiceBinding2 = this.TuitionPaymentFragmentbindingInflater1;
        if (fragmentShowBannerCloseServiceBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = notify + 63;
            INotificationSideChannel = i3 % 128;
            int i4 = i3 % 2;
        } else {
            fragmentShowBannerCloseServiceBinding = fragmentShowBannerCloseServiceBinding2;
        }
        AppCompatImageView appCompatImageView = fragmentShowBannerCloseServiceBinding.imgBanner;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        lambdacreateCameraSelectorById0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(appCompatImageView, contextRequireContext, this.g, R.drawable.ic_placeholder, R.drawable.ic_placeholder);
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void b() {
        int i = 2 % 2;
        FragmentShowBannerCloseServiceBinding fragmentShowBannerCloseServiceBinding = this.TuitionPaymentFragmentbindingInflater1;
        FragmentShowBannerCloseServiceBinding fragmentShowBannerCloseServiceBinding2 = null;
        if (fragmentShowBannerCloseServiceBinding == null) {
            int i2 = notify + 115;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentShowBannerCloseServiceBinding = null;
        }
        AppCompatImageView appCompatImageView = fragmentShowBannerCloseServiceBinding.imgBanner;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: onNestedScrollAccepted
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onNestedPreScroll.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        FragmentShowBannerCloseServiceBinding fragmentShowBannerCloseServiceBinding3 = this.TuitionPaymentFragmentbindingInflater1;
        if (fragmentShowBannerCloseServiceBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = notify + 111;
            INotificationSideChannel = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 4;
            }
        } else {
            fragmentShowBannerCloseServiceBinding2 = fragmentShowBannerCloseServiceBinding3;
        }
        TextView textView = fragmentShowBannerCloseServiceBinding2.tvCloseBanner;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: restoreToolbarHierarchyState
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onNestedPreScroll.TuitionPaymentFragmentbindingInflater1(this.b, (View) obj);
            }
        }));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(onNestedPreScroll onnestedprescroll, View view) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 59;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0 = onnestedprescroll.b;
        if (function0 != null) {
            function0.invoke();
        }
        b bVar = onnestedprescroll.a;
        onnestedprescroll.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = notify + 121;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(onNestedPreScroll onnestedprescroll, View view) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 91;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            Function0<Unit> function0 = onnestedprescroll.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            throw null;
        }
        Function0<Unit> function1 = onnestedprescroll.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (function1 != null) {
            int i4 = notify + 105;
            INotificationSideChannel = i4 % 128;
            if (i4 % 2 != 0) {
                function1.invoke();
                int i5 = 49 / 0;
            } else {
                function1.invoke();
            }
        }
        b bVar = onnestedprescroll.a;
        onnestedprescroll.dismiss();
        return Unit.INSTANCE;
    }

    static {
        cancel = 0;
        asBinder();
        INSTANCE = new Companion(null);
        int i = cancelAll + 43;
        cancel = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public onNestedPreScroll() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = notify + 61;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 18 / 0;
        }
    }

    static void asBinder() {
        asInterface = new char[]{51234, 64686, 41249, 21944, 6688, 52901, 62261, 43000, 27700, 4267, 50547, 35249, 48670, 25239, 5917, 56203, 32798, 46259, 31001, 11669, 53788, 34455, 45561, 34163, 55547, 11365, 25571, 46966, 35562, 56923, 5601, 26982, 48366, 61513, 51153, 6998, 28371, 28531, 23547, 1641, 62193, 48443, 27130, 21610, 226, 52070, 47020, 25172, 11969, 6478, 50634, 45142, 31961, 45557, 34171, 55551, 11387, 25572, 46970, 35578, 56944, 5580, 26982, 48369, 61525, 51195, 6996, 28370, 41556};
        onTransact = -8553708106641930977L;
    }

    private static String $$g(int i, short s, short s2) {
        int i2 = 3 - (s * 4);
        int i3 = i * 4;
        int i4 = (s2 * 3) + 109;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i4 = i2 + i3;
            i2 = i2;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i2 + 1;
            bArr2[i6] = (byte) i4;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            i5 = i6;
            i4 = bArr[i7] + i4;
            i2 = i7;
        }
    }
}
