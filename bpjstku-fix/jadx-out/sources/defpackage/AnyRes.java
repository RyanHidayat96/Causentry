package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
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
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentChangePhotoDialogBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda0;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0016\u001a\u00020\u00198\u0015X\u0094D¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u001c8\u0015X\u0095D¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"LAnyRes;", "LMediaSessionCompatMediaSessionImplApi181;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "onDestroyView", "Lcom/bpjstku/databinding/FragmentChangePhotoDialogBinding;", "Lcom/bpjstku/databinding/FragmentChangePhotoDialogBinding;", "Lkotlin/Function0;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/jvm/functions/Function0;", "asInterface", "", "I", "()I", "", "Z", "d", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AnyRes extends MediaSessionCompatMediaSessionImplApi181 {
    private static int INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int asBinder;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = R.layout.fragment_change_photo_dialog;
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private Function0<Unit> b;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private Function0<Unit> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private FragmentChangePhotoDialogBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {89, 92, -72, 43};
    private static final int $$f = 218;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {107, 48, 57, 107, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 66, -13, -5, 4, -8, 2, -67, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -28, 2, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -69};
    private static final int $$e = 213;
    private static final byte[] $$a = {1, -81, 2, 79, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 19;
    private static int onTransact = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f62a = 0;
    private static int d = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = (~(i7 | i)) | (~(i7 | i4));
        int i9 = (~i) | i6;
        int i10 = ~(i9 | i4);
        int i11 = (~(i | (~i4))) | (~i9);
        int i12 = i6 + i4 + i5 + (243328196 * i2) + (549715570 * i3);
        int i13 = i12 * i12;
        int i14 = ((-90835549) * i6) + 1264254976 + ((-1099560353) * i4) + (i8 * 1643121246) + (1643121246 * i10) + ((-1643121246) * i11) + (1552285696 * i5) + (781713408 * i2) + (665583616 * i3) + (1005256704 * i13);
        int i15 = (i6 * 1467389705) + 421362043 + (i4 * 1467387837) + (i8 * (-934)) + (i10 * (-934)) + (i11 * 934) + (i5 * 1467388771) + (i2 * (-1383267380)) + (i3 * 1030937622) + (i13 * 484507648);
        return i14 + ((i15 * i15) * 1164771328) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.AnyRes.$$a
            int r6 = r6 * 52
            int r6 = 53 - r6
            int r8 = r8 * 52
            int r8 = r8 + 4
            int r7 = 103 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r8]
        L26:
            int r8 = r8 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AnyRes.c(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 4
            int r7 = r7 * 15
            int r7 = 99 - r7
            byte[] r0 = defpackage.AnyRes.$$d
            int r6 = r6 * 11
            int r1 = r6 + 42
            byte[] r1 = new byte[r1]
            int r6 = r6 + 41
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r5 = r5 + 1
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r5]
        L2a:
            int r7 = r7 + r4
            int r7 = r7 + 3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AnyRes.f(byte, int, short, java.lang.Object[]):void");
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(AnyRes anyRes, Function0 function0) {
        int i = 2 % 2;
        int i2 = f62a;
        int i3 = i2 + 107;
        d = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        anyRes.TuitionPaymentFragmentbindingInflater1 = function0;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 93;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AnyRes anyRes, Function0 function0) {
        int i = 2 % 2;
        int i2 = f62a + 105;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        anyRes.b = function0;
        int i5 = i3 + 89;
        f62a = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: AnyRes$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"LAnyRes$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lkotlin/Function0;", "", "p0", "p1", "LAnyRes;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)LAnyRes;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static AnyRes TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function0<Unit> p0, Function0<Unit> p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            AnyRes anyRes = new AnyRes();
            AnyRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3(anyRes, p0);
            AnyRes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(anyRes, p1);
            return anyRes;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = f62a + 75;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i6 = i3 + 19;
        f62a = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        FragmentChangePhotoDialogBinding fragmentChangePhotoDialogBindingInflate;
        int i = 2 % 2;
        int i2 = d + 77;
        f62a = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            fragmentChangePhotoDialogBindingInflate = FragmentChangePhotoDialogBinding.inflate(getLayoutInflater(), p1, true);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = fragmentChangePhotoDialogBindingInflate;
            Intrinsics.checkNotNull(fragmentChangePhotoDialogBindingInflate);
        } else {
            Intrinsics.checkNotNullParameter(p0, "");
            fragmentChangePhotoDialogBindingInflate = FragmentChangePhotoDialogBinding.inflate(getLayoutInflater(), p1, false);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = fragmentChangePhotoDialogBindingInflate;
            Intrinsics.checkNotNull(fragmentChangePhotoDialogBindingInflate);
        }
        FrameLayout root = fragmentChangePhotoDialogBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        FrameLayout frameLayout = root;
        int i3 = d + 97;
        f62a = i3 % 128;
        if (i3 % 2 == 0) {
            return frameLayout;
        }
        throw null;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: d */
    public final boolean getB() {
        boolean z;
        int i = 2 % 2;
        int i2 = d + 23;
        int i3 = i2 % 128;
        f62a = i3;
        if (i2 % 2 != 0) {
            z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i4 = 91 / 0;
        } else {
            z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int i5 = i3 + 121;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 46 / 0;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0181  */
    /* JADX WARN: Code duplicated, block: B:38:0x0182  */
    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        int i6 = $10 + 59;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 5 % 3;
        }
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            int i8 = $11 + 67;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i10 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(asBinder)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getOffsetBefore("", 0), 3291 - (ViewConfiguration.getScrollBarSize() >> 8), 31 - View.combineMeasuredStates(0, 0), 1199271174, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 652 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44, -450685997, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            int i11 = $10 + 103;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 652, 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -450685997, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i4 = 29209604;
            }
            int i13 = $10 + 51;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws Throwable {
        Object[] objArr2;
        Object[] objArr3;
        final AnyRes anyRes = (AnyRes) objArr[0];
        char c = 2;
        int i = 2 % 2;
        FragmentChangePhotoDialogBinding fragmentChangePhotoDialogBinding = anyRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Intrinsics.checkNotNull(fragmentChangePhotoDialogBinding);
        ImageButton imageButton = fragmentChangePhotoDialogBinding.imgTakeFromPhoto;
        Intrinsics.checkNotNullExpressionValue(imageButton, "");
        imageButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: AttrRes
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnyRes.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int i2 = 876 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int touchSlop = 10 - (ViewConfiguration.getTouchSlop() >> 8);
            byte[] bArr = $$a;
            byte b = bArr[0];
            Object[] objArr4 = new Object[1];
            c(b, (byte) (b + 4), bArr[7], objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, i2, touchSlop, 252381699, false, (String) objArr4[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr5 = new Object[1];
        e(true, Color.argb(0, 0, 0, 0) + ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 22 - TextUtils.getOffsetAfter("", 0), 18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t'}, objArr5);
        Class<?> cls = Class.forName((String) objArr5[0]);
        Object[] objArr6 = new Object[1];
        e(true, 16777470 + Color.rgb(0, 0, 0), 15 - KeyEvent.getDeadChar(0, 0), Gravity.getAbsoluteGravity(0, 0) + 2, new char[]{5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530}, objArr6);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr6[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int i3 = 876 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int i4 = 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            byte b2 = $$a[7];
            Object[] objArr7 = new Object[1];
            c(b2, (byte) $$b, b2, objArr7);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumDrawingCacheSize, i3, i4, 2009631821, false, (String) objArr7[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                int i5 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 876;
                int defaultSize = 10 - View.getDefaultSize(0, 0);
                byte[] bArr2 = $$a;
                byte b3 = bArr2[0];
                Object[] objArr8 = new Object[1];
                c(b3, bArr2[7], b3, objArr8);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, i5, defaultSize, 256017550, false, (String) objArr8[0], null);
            }
            Object[] objArr9 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
            int iMyUid = Process.myUid();
            int i6 = (((-875256932) + (((~iMyUid) | 75595781) * 1324)) + (((~(iMyUid | (-186286003))) | (~(226596231 | iMyUid))) * (-1324))) - 167577112;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr2[1])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr10 = new Object[1];
            e(false, 250 - View.MeasureSpec.getSize(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25, 11 - TextUtils.lastIndexOf("", '0'), new char[]{17, 6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0}, objArr10);
            Class<?> cls2 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(false, Color.argb(0, 0, 0, 0) + 257, 18 - TextUtils.getOffsetBefore("", 0), 15 - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{'\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b'}, objArr11);
            Context applicationContext = (Context) cls2.getMethod((String) objArr11[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    int i9 = d + 5;
                    f62a = i9 % 128;
                    int i10 = i9 % 2;
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr12 = new Object[1];
            e(false, (ViewConfiguration.getFadingEdgeLength() >> 16) + 249, 16 - TextUtils.getOffsetAfter("", 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5, new char[]{65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484}, objArr12);
            Class<?> cls3 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            e(false, 252 - ImageFormat.getBitsPerPixel(0), ((Process.getThreadPriority(0) + 20) >> 6) + 16, 1 - KeyEvent.keyCodeFromString(""), new char[]{65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534}, objArr13);
            try {
                Object[] objArr14 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr13[0], Object.class).invoke(null, anyRes)).intValue()), 221421964};
                byte[] bArr3 = $$d;
                byte b4 = (byte) (bArr3[87] + 1);
                byte b5 = (byte) (b4 + 1);
                Object[] objArr15 = new Object[1];
                f(b4, b5, b5, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b6 = (byte) (bArr3[59] - 1);
                byte b7 = (byte) ($$e & 3);
                Object[] objArr16 = new Object[1];
                f(b6, b7, b7, objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                if (applicationContext != null) {
                    int i11 = f62a + 83;
                    d = i11 % 128;
                    int i12 = i11 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int edgeSlop = 876 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10;
                        byte[] bArr4 = $$a;
                        byte b8 = bArr4[0];
                        Object[] objArr18 = new Object[1];
                        c(b8, bArr4[7], b8, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatDelay, edgeSlop, maximumFlingVelocity, 256017550, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        e(true, 249 - Process.getGidForName(""), 22 - ExpandableListView.getPackedPositionGroup(0L), 18 - Color.red(0), new char[]{65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t'}, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        e(true, TextUtils.indexOf((CharSequence) "", '0') + 255, 15 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1, new char[]{5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530}, objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                            int i13 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 876;
                            int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 10;
                            byte b9 = $$a[7];
                            Object[] objArr21 = new Object[1];
                            c(b9, (byte) $$b, b9, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cNormalizeMetaState, i13, touchSlop2, 2009631821, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                            int scrollBarSize = 876 - (ViewConfiguration.getScrollBarSize() >> 8);
                            int iRed = Color.red(0) + 10;
                            byte[] bArr5 = $$a;
                            byte b10 = bArr5[0];
                            Object[] objArr22 = new Object[1];
                            c(b10, (byte) (b10 + 4), bArr5[7], objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveOpacity, scrollBarSize, iRed, 252381699, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr2 = objArr17;
                c = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i14 = ((int[]) objArr2[c])[0];
        int i15 = ((int[]) objArr2[0])[0];
        if (i15 == i14) {
            int i16 = ((int[]) objArr2[1])[0];
            objArr3 = new Object[]{new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
            int i17 = ~(Process.myTid() | 973575824);
            int i18 = i16 + ((((-229053996) | i17) * (-658)) - 2018408460) + ((i17 | (-1067947708)) * 658);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr3[1])[0] = i20 ^ (i20 << 5);
        } else {
            Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
            int i21 = ((int[]) objArr2[1])[0];
            objArr3 = new Object[]{new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
            int iMyTid = Process.myTid();
            int i22 = ~iMyTid;
            int i23 = i21 + 1763393590 + (((~(i22 | (-808378860))) | 2752555 | (~((-43062785) | iMyTid))) * 717) + (((~(iMyTid | (-808378860))) | (~(i22 | (-43062785))) | 2752555) * 717);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr3[1])[0] = i25 ^ (i25 << 5);
        }
        FragmentChangePhotoDialogBinding fragmentChangePhotoDialogBinding2 = anyRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Intrinsics.checkNotNull(fragmentChangePhotoDialogBinding2);
        ImageButton imageButton2 = fragmentChangePhotoDialogBinding2.imgTakeFromGallery;
        int i26 = ((int[]) objArr3[1])[0];
        int i27 = i26 * i26;
        int i28 = -(675000649 * i26);
        int i29 = ((((i27 | i28) << 1) - (i27 ^ i28)) - (~(-(i26 * 1325808557)))) - 1;
        int i30 = (i29 ^ (-1190093031)) + (((-1190093031) & i29) << 1);
        int i31 = i30 >> 21;
        int i32 = ((i31 & (-4095)) + (i31 | (-4095))) / 2048;
        int i33 = (i30 - (~(((i32 | 1) << 1) - (i32 ^ 1)))) - 1;
        int i34 = i30 >> 19;
        int i35 = ((i34 ^ (-16383)) + ((i34 & (-16383)) << 1)) / 8192;
        int i36 = -(i33 ^ ((i35 ^ 1) + ((i35 & 1) << 1)));
        int i37 = ((i36 | 1) << 1) - (i36 ^ 1);
        int i38 = i37 >> 25;
        int i39 = (((i38 ^ (-255)) + ((i38 & (-255)) << 1)) / 128) + 1;
        Intrinsics.checkNotNullExpressionValue(imageButton2, "3/27/29/imgTakeFromGallery".substring(12600 / (((-((i39 ^ 1) + ((i39 & 1) << 1))) & i37) * 1575)));
        imageButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: AnyThread
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr23 = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj};
                return (Unit) AnyRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3(SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -428569887, SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr23, 428569888);
            }
        }));
        FragmentChangePhotoDialogBinding fragmentChangePhotoDialogBinding3 = anyRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Intrinsics.checkNotNull(fragmentChangePhotoDialogBinding3);
        MaterialButton materialButton = fragmentChangePhotoDialogBinding3.btnCancel;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: ArrayRes
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnyRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        int i40 = d + 61;
        f62a = i40 % 128;
        if (i40 % 2 != 0) {
            int i41 = 25 / 0;
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = 2 % 2;
        int i2 = d + 13;
        f62a = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroyView();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        int i4 = f62a + 105;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit b(AnyRes anyRes, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        FragmentActivity activity = anyRes.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_change_profile_photo", "change_profile_photo_from_camera"));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter("change_profile_photo_from_camera", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("change_profile_photo_from_camera", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("change_profile_photo_from_camera", mapMutableMapOf);
        Function0<Unit> function0 = anyRes.b;
        if (function0 != null) {
            int i2 = f62a + 67;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                function0.invoke();
                throw null;
            }
            function0.invoke();
        }
        anyRes.dismiss();
        Unit unit = Unit.INSTANCE;
        int i3 = d + 21;
        f62a = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 75 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        AnyRes anyRes = (AnyRes) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[1], "");
        FragmentActivity activity = anyRes.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_change_profile_photo", "change_profile_photo_from_gallery"));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter("change_profile_photo_from_gallery", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("change_profile_photo_from_gallery", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("change_profile_photo_from_gallery", mapMutableMapOf);
        Function0<Unit> function0 = anyRes.TuitionPaymentFragmentbindingInflater1;
        if (function0 != null) {
            int i2 = d + 73;
            f62a = i2 % 128;
            int i3 = i2 % 2;
            function0.invoke();
        }
        anyRes.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = d + 1;
        f62a = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(AnyRes anyRes, View view) {
        int i = 2 % 2;
        int i2 = d + 49;
        f62a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        anyRes.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = d + 41;
        f62a = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(AnyRes anyRes, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -428569887, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{anyRes, view}, 428569888);
    }

    static {
        INotificationSideChannel = 1;
        a();
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i = onTransact + 105;
        INotificationSideChannel = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void b() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1357956541, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, -1357956541);
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = f62a + 47;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = d + 37;
        f62a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = f62a + 75;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static void a() {
        asBinder = -83722251;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, byte r7, int r8) {
        /*
            int r7 = 120 - r7
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r8 = r8 * 4
            int r0 = r8 + 1
            byte[] r1 = defpackage.AnyRes.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r7 = r7 + 1
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AnyRes.$$g(short, byte, int):java.lang.String");
    }
}
