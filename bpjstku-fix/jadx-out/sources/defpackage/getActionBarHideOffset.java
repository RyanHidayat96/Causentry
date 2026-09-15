package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.bpjstku.R;
import com.bpjstku.data.config.model.AntreanMenuConfig;
import com.bpjstku.databinding.FragmentQueueingBottomSheetBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.gson.Gson;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0003R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a"}, d2 = {"LgetActionBarHideOffset;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "", "getTheme", "()I", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lcom/bpjstku/databinding/FragmentQueueingBottomSheetBinding;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/databinding/FragmentQueueingBottomSheetBinding;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Function0;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/jvm/functions/Function0;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getActionBarHideOffset extends BottomSheetDialogFragment {
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static boolean asBinder;
    private static int asInterface;
    private static int cancel;
    private static boolean d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private FragmentQueueingBottomSheetBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {97, 58, 103, -72};
    private static final int $$f = 130;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {90, 46, 113, 8, 17, -6, 18, 1, -2, -1, -50, 73, 6, -1, 4, 3, 7, 6, -66, 76, -62, -2, 67, -4, 3, 9, -4, -47, 40, 19, 23, -7, 9, -3, -32, 48, 2, 7, -11, 23, -76, 17, 37, -8, 15, -7, 10, 3, -26, 21, 28, -8, -4, 13, 10, -42, 48, -13, 10, 10, -4, 13, 10, 3, 1, -7, 2, 10, -4, 15, 1, 9, 2, 1, 9, -5, 3, 22, -9, 0, 22, -38, 38, -7, 5, 11, -4, 5, 5, -1, 24, -5, 12, -62};
    private static final int $$e = 206;
    private static final byte[] $$a = {83, -4, -55, -17, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 223;
    private static int cancelAll = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f908a = 0;
    private static int g = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 52
            int r8 = 56 - r8
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r0 = defpackage.getActionBarHideOffset.$$a
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-10)
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getActionBarHideOffset.c(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 38
            int r7 = 41 - r7
            byte[] r0 = defpackage.getActionBarHideOffset.$$d
            int r8 = r8 * 14
            int r8 = r8 + 39
            int r6 = r6 * 13
            int r6 = r6 + 84
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r6 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r7]
        L2b:
            int r6 = r6 + r3
            int r6 = r6 + (-4)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getActionBarHideOffset.f(short, byte, byte, java.lang.Object[]):void");
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getActionBarHideOffset getactionbarhideoffset, Function0 function0) {
        int i = 2 % 2;
        int i2 = f908a + 81;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        Object obj = null;
        getactionbarhideoffset.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function0;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 37;
        f908a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void b(getActionBarHideOffset getactionbarhideoffset, Function0 function0) {
        int i = 2 % 2;
        int i2 = f908a;
        int i3 = i2 + 25;
        g = i3 % 128;
        int i4 = i3 % 2;
        getactionbarhideoffset.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function0;
        int i5 = i2 + 77;
        g = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        int i = 2 % 2;
        int i2 = f908a + 41;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentQueueingBottomSheetBinding fragmentQueueingBottomSheetBindingInflate = FragmentQueueingBottomSheetBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = fragmentQueueingBottomSheetBindingInflate;
        Intrinsics.checkNotNull(fragmentQueueingBottomSheetBindingInflate);
        LinearLayout root = fragmentQueueingBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        LinearLayout linearLayout = root;
        int i4 = g + 107;
        f908a = i4 % 128;
        if (i4 % 2 == 0) {
            return linearLayout;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getActionBarHideOffset$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"LgetActionBarHideOffset$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lkotlin/Function0;", "", "p0", "p1", "LgetActionBarHideOffset;", "TuitionPaymentFragmentbindingInflater1", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)LgetActionBarHideOffset;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private static final byte[] $$c = {8, -36, 87, -65};
        private static final int $$d = 26;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {12, 11, -9, -106};
        private static final int $$b = 215;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int b = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {60060, 60057, 59747, 60052, 60093, 60116, 60044, 59753, 60068, 59752, 60058, 60063, 60040, 59751, 60056, 60046, 60050, 60088, 59750, 60062, 59749, 59746, 59745, 59744, 59748, 60117, 60061, 60034, 60043, 60106, 60041, 60095, 60047, 60053, 60055, 60048};
        private static char TuitionPaymentFragmentbindingInflater1 = 57191;

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 2
                int r0 = 1 - r6
                int r8 = r8 * 4
                int r8 = r8 + 98
                byte[] r1 = defpackage.getActionBarHideOffset.Companion.$$a
                int r7 = r7 + 4
                byte[] r0 = new byte[r0]
                r2 = 0
                int r6 = 0 - r6
                if (r1 != 0) goto L17
                r3 = r6
                r8 = r7
                r4 = r2
                goto L2f
            L17:
                r3 = r2
            L18:
                int r7 = r7 + 1
                byte r4 = (byte) r8
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L29:
                r3 = r1[r7]
                r5 = r8
                r8 = r7
                r7 = r3
                r3 = r5
            L2f:
                int r7 = -r7
                int r7 = r7 + r3
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.getActionBarHideOffset.Companion.c(short, byte, byte, java.lang.Object[]):void");
        }

        private Companion() {
        }

        public static getActionBarHideOffset TuitionPaymentFragmentbindingInflater1(Function0<Unit> p0, Function0<Unit> p1) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getActionBarHideOffset getactionbarhideoffset = new getActionBarHideOffset();
            getActionBarHideOffset.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getactionbarhideoffset, p0);
            getActionBarHideOffset.b(getactionbarhideoffset, p1);
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
            b = i2 % 128;
            int i3 = i2 % 2;
            return getactionbarhideoffset;
        }

        private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
            int i2;
            char c;
            int i3 = 2;
            int i4 = 2 % 2;
            deInitSession deinitsession = new deInitSession();
            char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i5 = 1770390596;
            Object obj = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $10 + 117;
                    $11 = i7 % 128;
                    if (i7 % i3 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), 2267 - TextUtils.getTrimmedLength(""), Color.alpha(0) + 33, -1927765101, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(obj, objArr2)).charValue();
                            i3 = 2;
                            i5 = 1770390596;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), Drawable.resolveOpacity(0, 0) + 2267, 34 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1927765101, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i6++;
                        i3 = 2;
                        i5 = 1770390596;
                        obj = null;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            char c2 = '0';
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b7 = (byte) 0;
                byte b8 = b7;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (AndroidCharacter.getMirror('0') - '0'), TextUtils.lastIndexOf("", '0') + 2268, 33 - Color.alpha(0), -1927765101, false, $$e(b7, b8, b8), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    int i8 = $11 + 5;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        int i10 = $10 + 91;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        c = c2;
                    } else {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = (byte) (b9 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 49267), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3261, 30 - (ViewConfiguration.getScrollBarSize() >> 8), -127612708, false, $$e(b9, b10, (byte) (b10 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                            Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                c = '0';
                                byte b11 = (byte) 0;
                                byte b12 = (byte) (b11 + 3);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 22878), 594 - View.getDefaultSize(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 18, 1570859318, false, $$e(b11, b12, (byte) (b12 - 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                c = '0';
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                            int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                        } else {
                            c = '0';
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                            } else {
                                int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                            }
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    c2 = c;
                }
            }
            int i17 = 0;
            while (i17 < i) {
                int i18 = $11;
                int i19 = i18 + 123;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    cArr4[i17] = (char) (cArr4[i17] ^ 25498);
                    i17 += 92;
                } else {
                    cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                    i17++;
                }
                int i20 = i18 + 1;
                $10 = i20 % 128;
                int i21 = i20 % 2;
            }
            objArr[0] = new String(cArr4);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(int r27, int r28) {
            /*
                Method dump skipped, instruction units count: 2388
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.getActionBarHideOffset.Companion.TuitionPaymentFragmentbindingInflater1(int, int):java.lang.Object[]");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0020  */
        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(int r5, byte r6, byte r7) {
            /*
                byte[] r0 = defpackage.getActionBarHideOffset.Companion.$$c
                int r6 = r6 + 113
                int r7 = r7 * 3
                int r7 = 4 - r7
                int r5 = r5 * 4
                int r1 = r5 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L14
                r4 = r7
                r3 = r2
                goto L24
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r5) goto L20
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L20:
                int r3 = r3 + 1
                r4 = r0[r7]
            L24:
                int r7 = r7 + 1
                int r6 = r6 + r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.getActionBarHideOffset.Companion.$$e(int, byte, byte):java.lang.String");
        }
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        long j;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        char c = '0';
        int i3 = -1;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i3;
                        byte b2 = (byte) (-b);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - (ViewConfiguration.getLongPressTimeout() >> 16)), 3042 - AndroidCharacter.getMirror(c), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 17, 1182129903, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i4++;
                    int i5 = $10 + 55;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    c = '0';
                    i3 = -1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(asInterface)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - View.MeasureSpec.getSize(0)), TextUtils.getOffsetAfter("", 0) + 253, 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            int i7 = 33602;
            if (asBinder) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i8 = $10 + 121;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i10 = getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1;
                        cArr5[i9] = (char) (cArr3[bArr[0 % getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] % i] >>> iIntValue);
                        Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b3 = (byte) (-1);
                            byte b4 = (byte) (b3 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + i7), 3085 - Color.argb(0, 0, 0, 0), 26 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -2146875848, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        j = 0;
                    } else {
                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                        Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            j = 0;
                            byte b5 = (byte) (-1);
                            byte b6 = (byte) (b5 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (AndroidCharacter.getMirror('0') + 33554), 3086 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25, -2146875848, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                        } else {
                            j = 0;
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                    i7 = 33602;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (!d) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i11 = $11 + 19;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 % 0) >>> getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] << i] - iIntValue);
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                    } else {
                        cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                    }
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i12 = $11 + 123;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            } else {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            }
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i13 = $10 + 105;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b7 = (byte) (-1);
                    byte b8 = (byte) (b7 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33602 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 3085 - Color.red(0), 26 - (Process.myPid() >> 22), -2146875848, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2);
            int i15 = $11 + 25;
            $10 = i15 % 128;
            if (i15 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = 2 % 2;
        int i2 = g + 15;
        f908a = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroyView();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        int i4 = g + 79;
        f908a = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(getActionBarHideOffset getactionbarhideoffset, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Function0<Unit> function0 = getactionbarhideoffset.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (function0 != null) {
                int i2 = g + 99;
                f908a = i2 % 128;
                int i3 = i2 % 2;
                function0.invoke();
            }
            getactionbarhideoffset.dismiss();
            ViewPortBuilder.b();
            int i4 = f908a + 25;
            g = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(getActionBarHideOffset getactionbarhideoffset, View view) {
        int i = 2 % 2;
        int i2 = f908a + 97;
        g = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Function0<Unit> function0 = getactionbarhideoffset.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (function0 != null) {
                function0.invoke();
                int i4 = f908a + 121;
                g = i4 % 128;
                int i5 = i4 % 2;
            }
            getactionbarhideoffset.dismiss();
        } finally {
            ViewPortBuilder.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0229  */
    /* JADX WARN: Code duplicated, block: B:26:0x0233  */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        super.onViewCreated(p0, p1);
        FragmentQueueingBottomSheetBinding fragmentQueueingBottomSheetBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Intrinsics.checkNotNull(fragmentQueueingBottomSheetBinding);
        fragmentQueueingBottomSheetBinding.cardPengajuanKlaim.setOnClickListener(new View.OnClickListener() { // from class: haltActionBarHideOffsetAnimations
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getActionBarHideOffset.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
        FragmentQueueingBottomSheetBinding fragmentQueueingBottomSheetBinding2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Intrinsics.checkNotNull(fragmentQueueingBottomSheetBinding2);
        fragmentQueueingBottomSheetBinding2.cardInformasiPengaduan.setOnClickListener(new View.OnClickListener() { // from class: initFeature
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getActionBarHideOffset.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char threadPriority = (char) (31533 - ((Process.getThreadPriority(0) + 20) >> 6));
            int deadChar = KeyEvent.getDeadChar(0, 0) + 921;
            int iGreen = 28 - Color.green(0);
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            c(b, (byte) 52, b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, deadChar, iGreen, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(null, null, 127 - TextUtils.indexOf("", "", 0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(null, null, Color.alpha(0) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cBlue = (char) (31533 - Color.blue(0));
            int size = View.MeasureSpec.getSize(0) + 921;
            int iCombineMeasuredStates = 28 - View.combineMeasuredStates(0, 0);
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr5 = new Object[1];
            c(b2, b2, bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, size, iCombineMeasuredStates, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31533);
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 921;
                int modifierMetaStateMask = 27 - ((byte) KeyEvent.getModifierMetaStateMask());
                byte[] bArr2 = $$a;
                byte b3 = bArr2[80];
                Object[] objArr6 = new Object[1];
                c(b3, (byte) (-bArr2[33]), b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, scrollDefaultDelay, modifierMetaStateMask, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i2 = ~iIdentityHashCode;
            int i3 = (-720528378) + ((1602090999 | i2) * (-369)) + (((~((-172062645) | i2)) | 1602016999) * (-369)) + (((~(iIdentityHashCode | 172062644)) | 1430028355 | (~(i2 | (-74001)))) * 369) + 641064366;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[0])[0] = i5 ^ (i5 << 5);
            int i6 = g + 15;
            f908a = i6 % 128;
            int i7 = i6 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            e(null, null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(null, null, 126 - TextUtils.lastIndexOf("", '0', 0), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i8 = g + 91;
                f908a = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 27 / 0;
                    if (applicationContext instanceof ContextWrapper) {
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    }
                } else if (applicationContext instanceof ContextWrapper) {
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = null;
                    }
                }
                applicationContext = applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(null, null, (Process.myPid() >> 22) + 127, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(null, null, (ViewConfiguration.getFadingEdgeLength() >> 16) + 127, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 641064366};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[7];
                Object[] objArr13 = new Object[1];
                f(b4, b4, bArr3[79], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = bArr3[79];
                Object[] objArr14 = new Object[1];
                f(b5, b5, bArr3[7], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 31534);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 922;
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 28;
                    byte[] bArr4 = $$a;
                    byte b6 = bArr4[80];
                    Object[] objArr16 = new Object[1];
                    c(b6, (byte) (-bArr4[33]), b6, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, iLastIndexOf, iMakeMeasureSpec, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    e(null, null, (ViewConfiguration.getTouchSlop() >> 8) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(null, null, 127 - (ViewConfiguration.getPressedStateDuration() >> 16), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cGreen = (char) (31533 - Color.green(0));
                        int iLastIndexOf2 = 920 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int i10 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 27;
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        c(b7, b7, bArr5[7], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cGreen, iLastIndexOf2, i10, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0') + 31534);
                        int i11 = 922 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int keyRepeatDelay = 28 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte b8 = $$a[7];
                        Object[] objArr20 = new Object[1];
                        c(b8, (byte) 52, b8, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf2, i11, keyRepeatDelay, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 == i12) {
            int i14 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i15 = (int) Runtime.getRuntime().totalMemory();
            int i16 = ~((-795783919) | i15);
            int i17 = ~i15;
            int i18 = i14 + (-7836637) + ((i16 | (~(978295725 | i17))) * (-1808)) + (((~((-709792429) | i15)) | (~(i17 | 1064287215))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(i15 | (-978295726))) | 85991490 | (~(795783918 | i17))) * TypedValues.Custom.TYPE_BOOLEAN);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr21[0])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i21 = g + 7;
                f908a = i21 % 128;
                int i22 = i21 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            int i23 = ((int[]) objArr[0])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i24 = ~iIdentityHashCode2;
            int i25 = i23 + (-1138773577) + (((~(1505619287 | i24)) | 268460356) * 220) + (((~(i24 | 1479337301)) | 294742342) * (-440)) + ((iIdentityHashCode2 | 1505619287) * 220);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr22[0])[0] = i27 ^ (i27 << 5);
        }
        try {
            getMaxImages getmaximages = getMaxImages.INSTANCE;
            String strB = getMaxImages.b();
            if (strB.length() <= 0 || !((AntreanMenuConfig) new Gson().fromJson(strB, AntreanMenuConfig.class)).getStatus()) {
                return;
            }
            int i28 = g + 39;
            f908a = i28 % 128;
            int i29 = i28 % 2;
            FragmentQueueingBottomSheetBinding fragmentQueueingBottomSheetBinding3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Intrinsics.checkNotNull(fragmentQueueingBottomSheetBinding3);
            fragmentQueueingBottomSheetBinding3.cardInformasiPengaduan.setVisibility(8);
        } catch (Exception unused2) {
        }
    }

    static {
        cancel = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        INSTANCE = new Companion(null);
        int i = cancelAll + 57;
        cancel = i % 128;
        int i2 = i % 2;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final int getTheme() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 83;
        f908a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 1;
        f908a = i5 % 128;
        int i6 = i5 % 2;
        return R.style.BpjstkuBottomSheetDialogTheme;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new char[]{47362, 47413, 47423, 47409, 47412, 47418, 47349, 47408, 47376, 47402, 47407, 47422, 47414, 47328, 47415, 47360, 47416, 47411, 47377, 47330, 47405, 47375, 47419, 47406, 47417, 47420, 47387};
        asInterface = 2047719587;
        d = true;
        asBinder = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, short r7, int r8) {
        /*
            int r8 = r8 * 3
            int r0 = 1 - r8
            int r6 = r6 + 4
            int r7 = r7 + 67
            byte[] r1 = defpackage.getActionBarHideOffset.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getActionBarHideOffset.$$g(byte, short, int):java.lang.String");
    }
}
