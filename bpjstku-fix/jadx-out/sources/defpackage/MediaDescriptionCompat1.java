package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ImageFormat;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import coil.size.Scale;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityTermsConditionActivity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\b\b\b\u0007\u0018\u0000 M2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001MBE\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0017\u0010\u0014J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\bH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\"H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010\u0014J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\u0014J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¢\u0006\u0004\b*\u0010+J'\u0010-\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u0010\u0016J\u0019\u00101\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b4\u00105J\u0019\u00107\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u000106H\u0017¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\nH\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0010H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0010H\u0016¢\u0006\u0004\b=\u0010<J\u0017\u0010?\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020>H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0010H\u0016¢\u0006\u0004\bC\u0010<J\u001f\u0010D\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u001dH\u0001¢\u0006\u0004\bD\u0010EJ#\u0010F\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010F\u001a\u00020\u0010H\u0002¢\u0006\u0004\bF\u0010<R\u0014\u0010J\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010D\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010K\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010OR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020>0Q8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010RR\u0014\u0010P\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bS\u0010LR\u0014\u0010N\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bT\u0010LR\u0016\u0010T\u001a\u00020,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010S\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bW\u0010LR\u0016\u0010W\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bX\u0010LR\"\u0010U\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006@BX\u0087\u000e¢\u0006\u0006\n\u0004\bJ\u0010YR\u0016\u0010H\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010Y"}, d2 = {"LMediaDescriptionCompat1;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable$Callback;", "Landroidx/vectordrawable/graphics/drawable/Animatable2Compat;", "p0", "p1", "Lcoil/size/Scale;", "p2", "", "p3", "", "p4", "p5", "<init>", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lcoil/size/Scale;IZZ)V", "Landroid/graphics/Canvas;", "", "draw", "(Landroid/graphics/Canvas;)V", "getAlpha", "()I", "setAlpha", "(I)V", "getOpacity", "Landroid/graphics/ColorFilter;", "getColorFilter", "()Landroid/graphics/ColorFilter;", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "Landroid/graphics/Rect;", "onBoundsChange", "(Landroid/graphics/Rect;)V", "onLevelChange", "(I)Z", "", "onStateChange", "([I)Z", "getIntrinsicWidth", "getIntrinsicHeight", "Ljava/lang/Runnable;", "unscheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "", "scheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V", "setTint", "Landroid/content/res/ColorStateList;", "setTintList", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/PorterDuff$Mode;", "setTintMode", "(Landroid/graphics/PorterDuff$Mode;)V", "Landroid/graphics/BlendMode;", "setTintBlendMode", "(Landroid/graphics/BlendMode;)V", "isRunning", "()Z", "start", "()V", "stop", "Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;", "registerAnimationCallback", "(Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;)V", "unregisterAnimationCallback", "(Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;)Z", "clearAnimationCallbacks", "TuitionPaymentFragmentbindingInflater1", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Rect;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/Integer;Ljava/lang/Integer;)I", "notify", "Lcoil/size/Scale;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "I", "b", "g", "Z", "asInterface", "", "Ljava/util/List;", "d", "a", "INotificationSideChannel", "J", "asBinder", "cancelAll", "Landroid/graphics/drawable/Drawable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MediaDescriptionCompat1 extends Drawable implements Drawable.Callback, Animatable2Compat {
    private static char cancel;
    private static int getInterfaceDescriptor;
    private static char[] onTransact;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private long a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Drawable notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public Drawable INotificationSideChannel;
    private final List<Animatable2Compat.AnimationCallback> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final int b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int g;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private int d;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private int asBinder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int asInterface;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final Scale TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {49, -45, -112, 57};
    private static final int $$f = 103;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {58, -103, 118, 14, 17, 3, -58, 59, 2, 24, -14, 8, 16, -3, -52, 56, 18, -5, 19, 2, -1, 0, -49, 73, 8, -3, -58, 64, 10, 11, -10, 18, 1, -8, 16, -57, 59, 16, 3, -7, 13, 10, -59, 74, -11, 17, 6, -6, -50, 41, 40, -3, -18, 24, 1, 23, -31, 21, 17, 6, -6, -60, 73, -2, 18, -5, 13, -2, -27, 54, -12, 14, 11, -75, 18};
    private static final int $$e = 187;
    private static final byte[] $$a = {1, -81, 2, 79, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 171;
    private static int RemoteActionCompatParcelizer = 0;
    private static int INotificationSideChannelStub = 1;
    private static int INotificationSideChannelStubProxy = 0;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        boolean state;
        boolean state2;
        int i7 = (~((~i6) | i5)) | (~(i5 | i2));
        int i8 = (~i5) | (~i2);
        int i9 = i7 | (~(i8 | i6));
        int i10 = (~i8) | i6;
        int i11 = ~(i2 | i6);
        int i12 = i6 + i5 + i + ((-417414852) * i3) + (1247522396 * i4);
        int i13 = i12 * i12;
        int i14 = (i6 * (-1219797419)) + 1526988800 + ((-1219797419) * i5) + (825712212 * i9) + ((-1651424424) * i10) + ((-825712212) * i11) + ((-2045509632) * i) + ((-2135949312) * i3) + ((-953155584) * i4) + ((-430374912) * i13);
        int i15 = ((i6 * 184508743) - 476012450) + (i5 * 184508743) + (i9 * (-996)) + (i10 * 1992) + (i11 * 996) + (i * 184509739) + (i3 * (-953474796)) + (i4 * (-288057996)) + (i13 * (-839712768));
        int i16 = i14 + (i15 * i15 * 1709113344);
        if (i16 == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i16 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i16 == 3) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i16 != 4) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        MediaDescriptionCompat1 mediaDescriptionCompat1 = (MediaDescriptionCompat1) objArr[0];
        int[] iArr = (int[]) objArr[1];
        int i17 = 2 % 2;
        int i18 = RemoteActionCompatParcelizer + 37;
        int i19 = i18 % 128;
        INotificationSideChannelStub = i19;
        int i20 = i18 % 2;
        Drawable drawable = mediaDescriptionCompat1.INotificationSideChannel;
        if (drawable != null) {
            state = drawable.setState(iArr);
        } else {
            int i21 = i19 + 39;
            RemoteActionCompatParcelizer = i21 % 128;
            int i22 = i21 % 2;
            state = false;
        }
        Drawable drawable2 = mediaDescriptionCompat1.notify;
        if (drawable2 != null) {
            int i23 = INotificationSideChannelStub + 97;
            RemoteActionCompatParcelizer = i23 % 128;
            int i24 = i23 % 2;
            state2 = drawable2.setState(iArr);
        } else {
            state2 = false;
        }
        return state || state2;
    }

    private static void c(short s, int i, int i2, Object[] objArr) {
        int i3 = i2 + 4;
        byte[] bArr = $$a;
        int i4 = 84 - (i * 3);
        int i5 = s * 15;
        byte[] bArr2 = new byte[53 - i5];
        int i6 = 52 - i5;
        int i7 = -1;
        if (bArr == null) {
            i4 = (i3 + i4) - 11;
            i7 = -1;
        }
        while (true) {
            int i8 = i3;
            int i9 = i4;
            int i10 = i7 + 1;
            int i11 = i8 + 1;
            bArr2[i10] = (byte) i9;
            if (i10 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = i11;
                i4 = (i9 + bArr[i11]) - 11;
                i7 = i10;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 71
            int r9 = r9 + 1
            byte[] r0 = defpackage.MediaDescriptionCompat1.$$d
            int r7 = 99 - r7
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L2a:
            int r8 = r8 + r3
            int r8 = r8 + (-5)
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaDescriptionCompat1.f(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MediaDescriptionCompat1(Drawable drawable, Drawable drawable2, Scale scale, int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Scale scale2;
        int i3;
        boolean z3;
        if ((i2 & 4) != 0) {
            int i4 = 2 % 2;
            scale2 = Scale.FIT;
        } else {
            scale2 = scale;
        }
        if ((i2 & 8) != 0) {
            int i5 = INotificationSideChannelStub + 71;
            RemoteActionCompatParcelizer = i5 % 128;
            int i6 = 2 % 2;
            i3 = i5 % 2 != 0 ? 50 : 100;
        } else {
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            int i7 = RemoteActionCompatParcelizer + 47;
            INotificationSideChannelStub = i7 % 128;
            int i8 = i7 % 2;
            z3 = true;
        } else {
            z3 = z;
        }
        this(drawable, drawable2, scale2, i3, z3, (i2 & 32) != 0 ? false : z2);
    }

    public MediaDescriptionCompat1(Drawable drawable, Drawable drawable2, Scale scale, int i, boolean z, boolean z2) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = scale;
        this.b = i;
        this.TuitionPaymentFragmentbindingInflater1 = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList();
        if (drawable != null) {
            numValueOf = Integer.valueOf(drawable.getIntrinsicWidth());
            int i2 = 2 % 2;
        } else {
            int i3 = 2 % 2;
            numValueOf = null;
        }
        if (drawable2 != null) {
            int i4 = RemoteActionCompatParcelizer + 5;
            INotificationSideChannelStub = i4 % 128;
            int i5 = i4 % 2;
            numValueOf2 = Integer.valueOf(drawable2.getIntrinsicWidth());
        } else {
            numValueOf2 = null;
        }
        this.asInterface = TuitionPaymentFragmentspecialinlinedviewModeldefault2(numValueOf, numValueOf2);
        if (drawable != null) {
            numValueOf3 = Integer.valueOf(drawable.getIntrinsicHeight());
        } else {
            int i6 = 2 % 2;
            numValueOf3 = null;
        }
        this.g = TuitionPaymentFragmentspecialinlinedviewModeldefault2(numValueOf3, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.d = 255;
        this.INotificationSideChannel = drawable != null ? drawable.mutate() : null;
        Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
        this.notify = drawableMutate;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.".toString());
        }
        Drawable drawable3 = this.INotificationSideChannel;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        if (drawableMutate != null) {
            drawableMutate.setCallback(this);
            int i7 = RemoteActionCompatParcelizer + 19;
            INotificationSideChannelStub = i7 % 128;
            if (i7 % 2 == 0) {
                return;
            }
            int i8 = 2 % 2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas p0) {
        Drawable drawable;
        int i = 2 % 2;
        int i2 = this.asBinder;
        if (i2 == 0) {
            Drawable drawable2 = this.INotificationSideChannel;
            if (drawable2 != null) {
                drawable2.setAlpha(this.d);
                int iSave = p0.save();
                try {
                    drawable2.draw(p0);
                    return;
                } finally {
                    p0.restoreToCount(iSave);
                }
            }
            return;
        }
        Object obj = null;
        if (i2 == 2) {
            Drawable drawable3 = this.notify;
            if (drawable3 != null) {
                int i3 = INotificationSideChannelStub + 109;
                RemoteActionCompatParcelizer = i3 % 128;
                try {
                    if (i3 % 2 == 0) {
                        drawable3.setAlpha(this.d);
                        int iSave2 = p0.save();
                        drawable3.draw(p0);
                        p0.restoreToCount(iSave2);
                        return;
                    }
                    drawable3.setAlpha(this.d);
                    int iSave3 = p0.save();
                    drawable3.draw(p0);
                    p0.restoreToCount(iSave3);
                    obj.hashCode();
                    throw null;
                } catch (Throwable th) {
                    p0.restoreToCount(2);
                    throw th;
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.a) / ((double) this.b);
        double dCoerceIn = RangesKt.coerceIn(dUptimeMillis, 0.0d, 1.0d);
        int i4 = this.d;
        int i5 = (int) (dCoerceIn * ((double) i4));
        if (this.TuitionPaymentFragmentbindingInflater1) {
            int i6 = RemoteActionCompatParcelizer + 79;
            INotificationSideChannelStub = i6 % 128;
            int i7 = i6 % 2;
            i4 -= i5;
        }
        boolean z = false;
        if (dUptimeMillis >= 1.0d) {
            int i8 = RemoteActionCompatParcelizer + 115;
            INotificationSideChannelStub = i8 % 128;
            if (i8 % 2 != 0) {
                z = true;
            }
        }
        if (!z && (drawable = this.INotificationSideChannel) != null) {
            int i9 = RemoteActionCompatParcelizer + 101;
            INotificationSideChannelStub = i9 % 128;
            int i10 = i9 % 2;
            drawable.setAlpha(i4);
            int iSave4 = p0.save();
            try {
                drawable.draw(p0);
                p0.restoreToCount(iSave4);
            } catch (Throwable th2) {
                p0.restoreToCount(iSave4);
                throw th2;
            }
        }
        Drawable drawable4 = this.notify;
        if (drawable4 != null) {
            drawable4.setAlpha(i5);
            int iSave5 = p0.save();
            try {
                drawable4.draw(p0);
                p0.restoreToCount(iSave5);
            } catch (Throwable th3) {
                p0.restoreToCount(iSave5);
                throw th3;
            }
        }
        if (!z) {
            invalidateSelf();
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i11 = RemoteActionCompatParcelizer + 31;
        INotificationSideChannelStub = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.d;
        if (i3 == 0) {
            int i5 = 52 / 0;
        }
        return i4;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int p0) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 71;
        int i3 = i2 % 128;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (p0 >= 0) {
            int i5 = i3 + 15;
            INotificationSideChannelStub = i5 % 128;
            if (i5 % 2 != 0 ? p0 < 256 : p0 < 7018) {
                this.d = p0;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid alpha: ".concat(String.valueOf(p0)).toString());
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        MediaDescriptionCompat1 mediaDescriptionCompat1 = (MediaDescriptionCompat1) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub;
        int i3 = i2 + 33;
        int i4 = i3 % 128;
        RemoteActionCompatParcelizer = i4;
        if (i3 % 2 != 0) {
            Drawable drawable = mediaDescriptionCompat1.INotificationSideChannel;
            Drawable drawable2 = mediaDescriptionCompat1.notify;
            int i5 = mediaDescriptionCompat1.asBinder;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Drawable drawable3 = mediaDescriptionCompat1.INotificationSideChannel;
        Drawable drawable4 = mediaDescriptionCompat1.notify;
        int i6 = mediaDescriptionCompat1.asBinder;
        if (i6 == 0) {
            if (drawable3 != null) {
                return Integer.valueOf(drawable3.getOpacity());
            }
            return -2;
        }
        if (i6 == 2) {
            if (drawable4 == null) {
                return -2;
            }
            int i7 = i4 + 103;
            INotificationSideChannelStub = i7 % 128;
            int i8 = i7 % 2;
            return Integer.valueOf(drawable4.getOpacity());
        }
        if (drawable3 != null && drawable4 != null) {
            int i9 = i2 + 83;
            RemoteActionCompatParcelizer = i9 % 128;
            int i10 = i9 % 2;
            return Integer.valueOf(Drawable.resolveOpacity(drawable3.getOpacity(), drawable4.getOpacity()));
        }
        if (drawable3 != null) {
            int i11 = i4 + 125;
            INotificationSideChannelStub = i11 % 128;
            int i12 = i11 % 2;
            return Integer.valueOf(drawable3.getOpacity());
        }
        if (drawable4 == null) {
            return -2;
        }
        int i13 = i2 + 21;
        RemoteActionCompatParcelizer = i13 % 128;
        int i14 = i13 % 2;
        return Integer.valueOf(drawable4.getOpacity());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r2 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        r3 = r3 + 65;
        r1 = r3 % 128;
        defpackage.MediaDescriptionCompat1.INotificationSideChannelStub = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if ((r3 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r2 == 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if (r2 == 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        r1 = r1 + 67;
        defpackage.MediaDescriptionCompat1.RemoteActionCompatParcelizer = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        r2 = r6.notify;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r2 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        r1 = r1 + 55;
        defpackage.MediaDescriptionCompat1.RemoteActionCompatParcelizer = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        return r2.getColorFilter();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        r2 = r6.notify;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        r1 = r1 + 45;
        defpackage.MediaDescriptionCompat1.RemoteActionCompatParcelizer = r1 % 128;
        r1 = r1 % 2;
        r0 = r2.getColorFilter();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        r0 = r6.INotificationSideChannel;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        return r0.getColorFilter();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        r2 = r6.INotificationSideChannel;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        if (r2 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
    
        r1 = r1 + 95;
        defpackage.MediaDescriptionCompat1.RemoteActionCompatParcelizer = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
    
        return r2.getColorFilter();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r2 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 != 0) goto L9;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.ColorFilter getColorFilter() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = defpackage.MediaDescriptionCompat1.INotificationSideChannelStub
            int r2 = r1 + 121
            int r3 = r2 % 128
            defpackage.MediaDescriptionCompat1.RemoteActionCompatParcelizer = r3
            int r2 = r2 % r0
            r4 = 0
            if (r2 == 0) goto L18
            int r2 = r6.asBinder
            r5 = 61
            int r5 = r5 / 0
            if (r2 == 0) goto L62
            goto L1c
        L18:
            int r2 = r6.asBinder
            if (r2 == 0) goto L62
        L1c:
            r5 = 1
            if (r2 == r5) goto L46
            int r3 = r3 + 65
            int r1 = r3 % 128
            defpackage.MediaDescriptionCompat1.INotificationSideChannelStub = r1
            int r3 = r3 % r0
            if (r3 != 0) goto L2b
            if (r2 == r0) goto L35
            goto L2d
        L2b:
            if (r2 == r0) goto L35
        L2d:
            int r1 = r1 + 67
            int r2 = r1 % 128
            defpackage.MediaDescriptionCompat1.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            return r4
        L35:
            android.graphics.drawable.Drawable r2 = r6.notify
            if (r2 == 0) goto L45
            int r1 = r1 + 55
            int r3 = r1 % 128
            defpackage.MediaDescriptionCompat1.RemoteActionCompatParcelizer = r3
            int r1 = r1 % r0
            android.graphics.ColorFilter r0 = r2.getColorFilter()
            return r0
        L45:
            return r4
        L46:
            android.graphics.drawable.Drawable r2 = r6.notify
            if (r2 == 0) goto L58
            int r1 = r1 + 45
            int r3 = r1 % 128
            defpackage.MediaDescriptionCompat1.RemoteActionCompatParcelizer = r3
            int r1 = r1 % r0
            android.graphics.ColorFilter r0 = r2.getColorFilter()
            if (r0 == 0) goto L58
            return r0
        L58:
            android.graphics.drawable.Drawable r0 = r6.INotificationSideChannel
            if (r0 == 0) goto L61
            android.graphics.ColorFilter r0 = r0.getColorFilter()
            return r0
        L61:
            return r4
        L62:
            android.graphics.drawable.Drawable r2 = r6.INotificationSideChannel
            if (r2 == 0) goto L72
            int r1 = r1 + 95
            int r3 = r1 % 128
            defpackage.MediaDescriptionCompat1.RemoteActionCompatParcelizer = r3
            int r1 = r1 % r0
            android.graphics.ColorFilter r0 = r2.getColorFilter()
            return r0
        L72:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaDescriptionCompat1.getColorFilter():android.graphics.ColorFilter");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter p0) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 17;
        int i3 = i2 % 128;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        Drawable drawable = this.INotificationSideChannel;
        if (drawable != null) {
            int i5 = i3 + 91;
            INotificationSideChannelStub = i5 % 128;
            if (i5 % 2 == 0) {
                drawable.setColorFilter(p0);
                int i6 = 93 / 0;
            } else {
                drawable.setColorFilter(p0);
            }
        }
        Drawable drawable2 = this.notify;
        if (drawable2 != null) {
            int i7 = INotificationSideChannelStub + 49;
            RemoteActionCompatParcelizer = i7 % 128;
            int i8 = i7 % 2;
            drawable2.setColorFilter(p0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x011d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0133  */
    /* JADX WARN: Code duplicated, block: B:37:0x0181 A[Catch: all -> 0x035b, TryCatch #0 {all -> 0x035b, blocks: (B:7:0x0027, B:9:0x0035, B:10:0x0064, B:14:0x007c, B:16:0x008d, B:17:0x00bc, B:35:0x0135, B:37:0x0181, B:38:0x01f4, B:42:0x0209, B:44:0x0243, B:45:0x02a7), top: B:68:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0207  */
    /* JADX WARN: Code duplicated, block: B:44:0x0243 A[Catch: all -> 0x035b, TryCatch #0 {all -> 0x035b, blocks: (B:7:0x0027, B:9:0x0035, B:10:0x0064, B:14:0x007c, B:16:0x008d, B:17:0x00bc, B:35:0x0135, B:37:0x0181, B:38:0x01f4, B:42:0x0209, B:44:0x0243, B:45:0x02a7), top: B:68:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:49:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x0301  */
    private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = onTransact;
        int i4 = 1770390596;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = $11 + 91;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) KeyEvent.normalizeMetaState(0), (-16774949) - Color.rgb(0, 0, 0), 33 - TextUtils.getCapsMode("", 0, 0), -1927765101, false, $$g(b2, b3, (byte) (b3 - 3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                    i7++;
                    i4 = 1770390596;
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
        Object[] objArr4 = {Integer.valueOf(cancel)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            byte b4 = (byte) 0;
            byte b5 = (byte) (b4 + 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 2267 - Color.green(0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 34, -1927765101, false, $$g(b4, b5, (byte) (b5 - 3)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i8 = $10 + 101;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i10 = $10 + 49;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        obj = obj2;
                    } else {
                        objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 49267), 3261 - ExpandableListView.getPackedPositionType(0L), 30 - (ViewConfiguration.getPressedStateDuration() >> 16), -127612708, false, $$g(b6, b7, (byte) (b7 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22879 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 595 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 17, 1570859318, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                            int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i12 = $11 + 113;
                                $10 = i12 % 128;
                                int i13 = i12 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                            } else {
                                int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                            }
                        }
                    }
                } else {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        obj = obj2;
                    } else {
                        objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b10 = (byte) 0;
                            byte b11 = (byte) (b10 + 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 49267), 3261 - ExpandableListView.getPackedPositionType(0L), 30 - (ViewConfiguration.getPressedStateDuration() >> 16), -127612708, false, $$g(b10, b11, (byte) (b11 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b12 = (byte) 0;
                                byte b13 = b12;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22879 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 595 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 17, 1570859318, false, $$g(b12, b13, b13), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                            int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i18];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i19 = $11 + 113;
                                $10 = i19 % 128;
                                int i110 = i19 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i111 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i112 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i111];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i112];
                            } else {
                                int i113 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i114 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i113];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i114];
                            }
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        int i20 = $10 + 93;
        $11 = i20 % 128;
        if (i20 % 2 == 0) {
            int i21 = 3 % 2;
        }
        int i22 = 0;
        while (i22 < i) {
            int i23 = $10 + 91;
            $11 = i23 % 128;
            if (i23 % 2 == 0) {
                cArr4[i22] = (char) (cArr4[i22] ^ 3536);
                i22 += 115;
            } else {
                cArr4[i22] = (char) (cArr4[i22] ^ 13722);
                i22++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0217  */
    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
            int scrollBarSize = 2267 - (ViewConfiguration.getScrollBarSize() >> 8);
            int mirror = 'Q' - AndroidCharacter.getMirror('0');
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b, b, bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, scrollBarSize, mirror, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{'\t', 17, 21, '\b', 25, 18, 18, 14, 28, 18, 14, 6, 16, 23, '\r', ' ', 3, 19, 30, 27, 1, 26}, (byte) (Process.getGidForName("") + 109), 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{' ', Typography.quote, 6, '\b', 19, Typography.quote, 22, 14, '#', 7, ' ', 15, 25, 7, 13913}, (byte) (89 - ImageFormat.getBitsPerPixel(0)), 15 - Color.red(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2267;
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 33;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr5 = new Object[1];
            c(b2, b3, (byte) (b3 | 51), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetBefore, keyRepeatTimeout, iNormalizeMetaState, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = INotificationSideChannelStub + 41;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 2267;
                int iMyPid = 33 - (Process.myPid() >> 22);
                byte[] bArr2 = $$a;
                byte b4 = bArr2[0];
                byte b5 = bArr2[7];
                Object[] objArr6 = new Object[1];
                c(b4, b5, (byte) (b5 | 103), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority, touchSlop, iMyPid, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[0])[0];
            int i5 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i6 = (-1153688157) + (((~((-142024482) | elapsedCpuTime)) | 3415296) * 576) + (((~((~elapsedCpuTime) | (-138609186))) | 663273538) * 576) + 133855727;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{'\t', 17, 21, '\b', 25, 18, 18, 14, 6, '\b', 6, '\r', ' ', 0, '\r', 20, 25, 21, 15, '\f', 4, 24, 7, '!', '\b', 23}, (byte) (TextUtils.getOffsetAfter("", 0) + 95), 26 - TextUtils.indexOf("", "", 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{1, 14, 13908, 13908, '!', '\r', '\f', ' ', 13910, 13910, 31, 21, 5, '\b', '\r', 20, 27, '\f'}, (byte) (108 - TextUtils.getOffsetAfter("", 0)), 17 - MotionEvent.axisFromString(""), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i9 = INotificationSideChannelStub + 111;
                    RemoteActionCompatParcelizer = i9 % 128;
                    int i10 = i9 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{29, 17, 29, '\t', 15, 30, '\t', 17, 24, 14, 11, 14, 20, 16, 1, 7}, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 11), TextUtils.lastIndexOf("", '0', 0, 0) + 17, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{20, 21, '!', '\r', '\r', 20, 15, '\f', '#', '\b', 28, Typography.quote, 18, 27, 19, ' '}, (byte) (KeyEvent.getDeadChar(0, 0) + 106), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i11 = RemoteActionCompatParcelizer;
            int i12 = i11 + 5;
            INotificationSideChannelStub = i12 % 128;
            int i13 = i12 % 2;
            int i14 = i11 + 119;
            INotificationSideChannelStub = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -1833354769};
                byte[] bArr3 = $$d;
                Object[] objArr13 = new Object[1];
                f(bArr3[21], bArr3[20], bArr3[32], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                f(bArr3[32], (byte) 70, bArr3[21], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i16 = RemoteActionCompatParcelizer + 87;
                    INotificationSideChannelStub = i16 % 128;
                    int i17 = i16 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                        int iAlpha = Color.alpha(0) + 2267;
                        int i18 = 33 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        byte[] bArr4 = $$a;
                        byte b6 = bArr4[0];
                        byte b7 = bArr4[7];
                        Object[] objArr15 = new Object[1];
                        c(b6, b7, (byte) (b7 | 103), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMakeMeasureSpec, iAlpha, i18, -654680577, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        e(new char[]{'\t', 17, 21, '\b', 25, 18, 18, 14, 28, 18, 14, 6, 16, 23, '\r', ' ', 3, 19, 30, 27, 1, 26}, (byte) (107 - TextUtils.indexOf((CharSequence) "", '0', 0)), 22 - (ViewConfiguration.getTouchSlop() >> 8), objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        e(new char[]{' ', Typography.quote, 6, '\b', 19, Typography.quote, 22, 14, '#', 7, ' ', 15, 25, 7, 13913}, (byte) (89 - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.getOffsetAfter("", 0) + 15, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "");
                            int modifierMetaStateMask = 2266 - ((byte) KeyEvent.getModifierMetaStateMask());
                            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 34;
                            byte b8 = $$a[7];
                            byte b9 = b8;
                            Object[] objArr18 = new Object[1];
                            c(b8, b9, (byte) (b9 | 51), objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, modifierMetaStateMask, bitsPerPixel, -874156483, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 2267;
                            int absoluteGravity = 33 - Gravity.getAbsoluteGravity(0, 0);
                            byte[] bArr5 = $$a;
                            byte b10 = bArr5[7];
                            Object[] objArr19 = new Object[1];
                            c(b10, b10, bArr5[5], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(doubleTapTimeout, tapTimeout, absoluteGravity, -887667012, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i19 = ((int[]) objArr[3])[0];
        int i20 = ((int[]) objArr[0])[0];
        if (i20 == i19) {
            Object[] objArr20 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[0])[0];
            int i23 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i24 = i21 + (-1753310829) + (((~((-136188325) | iIdentityHashCode)) | 135528612) * 1504) + ((~(iIdentityHashCode | (-659713))) * (-1504)) + 590454608;
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr20[2])[0] = i26 ^ (i26 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    int i27 = INotificationSideChannelStub + 9;
                    RemoteActionCompatParcelizer = i27 % 128;
                    int i28 = i27 % 2;
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i20 / (((i20 - 1) * i20) % 2), 0).show();
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i29 = ((int[]) objArr[2])[0];
            int i30 = ((int[]) objArr[0])[0];
            int i31 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int i32 = ~((int) Process.getStartUptimeMillis());
            int i33 = ~(375456752 | i32);
            int i34 = i29 + (-696201669) + ((i33 | 433256563) * 764) + (((~(i32 | 433256563)) | 102826880) * (-1528)) + ((263453571 | i33) * 764);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr21[2])[0] = i36 ^ (i36 << 5);
        }
        Drawable drawable = this.INotificationSideChannel;
        if (drawable != null) {
            TuitionPaymentFragmentbindingInflater1(ClaimOldDaySecurityTermsConditionActivity.b.b(), ClaimOldDaySecurityTermsConditionActivity.b.b(), ClaimOldDaySecurityTermsConditionActivity.b.b(), ClaimOldDaySecurityTermsConditionActivity.b.b(), new Object[]{this, drawable, p0}, 565453360, -565453359);
        }
        Drawable drawable2 = this.notify;
        if (drawable2 != null) {
            TuitionPaymentFragmentbindingInflater1(ClaimOldDaySecurityTermsConditionActivity.b.b(), ClaimOldDaySecurityTermsConditionActivity.b.b(), ClaimOldDaySecurityTermsConditionActivity.b.b(), ClaimOldDaySecurityTermsConditionActivity.b.b(), new Object[]{this, drawable2, p0}, 565453360, -565453359);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int p0) {
        boolean level;
        boolean level2;
        int i = 2 % 2;
        Drawable drawable = this.INotificationSideChannel;
        Object obj = null;
        if (drawable != null) {
            int i2 = INotificationSideChannelStub + 69;
            RemoteActionCompatParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                level = drawable.setLevel(p0);
            } else {
                drawable.setLevel(p0);
                obj.hashCode();
                throw null;
            }
        } else {
            level = false;
        }
        Drawable drawable2 = this.notify;
        if (drawable2 != null) {
            level2 = drawable2.setLevel(p0);
        } else {
            int i3 = INotificationSideChannelStub + 91;
            RemoteActionCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
            level2 = false;
        }
        if (level) {
            return true;
        }
        int i5 = INotificationSideChannelStub;
        int i6 = i5 + 65;
        RemoteActionCompatParcelizer = i6 % 128;
        int i7 = i6 % 2;
        if (level2) {
            return true;
        }
        int i8 = i5 + 11;
        RemoteActionCompatParcelizer = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 73;
        int i4 = i3 % 128;
        INotificationSideChannelStub = i4;
        if (i3 % 2 == 0) {
            i = this.asInterface;
            int i5 = 47 / 0;
        } else {
            i = this.asInterface;
        }
        int i6 = i4 + 47;
        RemoteActionCompatParcelizer = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 36 / 0;
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 85;
        int i3 = i2 % 128;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = this.g;
        int i6 = i3 + 37;
        INotificationSideChannelStub = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable p0, Runnable p1) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 5;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        unscheduleSelf(p1);
        if (i3 != 0) {
            throw null;
        }
        int i4 = INotificationSideChannelStub + 3;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable p0) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 15;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        invalidateSelf();
        if (i3 != 0) {
            int i4 = 8 / 0;
        }
        int i5 = INotificationSideChannelStub + 53;
        RemoteActionCompatParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable p0, Runnable p1, long p2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        scheduleSelf(p1, p2);
        int i4 = INotificationSideChannelStub + 23;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int p0) {
        int i = 2 % 2;
        Drawable drawable = this.INotificationSideChannel;
        if (drawable != null) {
            int i2 = RemoteActionCompatParcelizer + 53;
            INotificationSideChannelStub = i2 % 128;
            if (i2 % 2 == 0) {
                drawable.setTint(p0);
                int i3 = 17 / 0;
            } else {
                drawable.setTint(p0);
            }
        }
        Drawable drawable2 = this.notify;
        if (drawable2 != null) {
            int i4 = RemoteActionCompatParcelizer + 59;
            INotificationSideChannelStub = i4 % 128;
            int i5 = i4 % 2;
            drawable2.setTint(p0);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList p0) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub;
        int i3 = i2 + 83;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawable = this.INotificationSideChannel;
        if (drawable != null) {
            int i5 = i2 + 51;
            RemoteActionCompatParcelizer = i5 % 128;
            if (i5 % 2 == 0) {
                drawable.setTintList(p0);
            } else {
                drawable.setTintList(p0);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        Drawable drawable2 = this.notify;
        if (drawable2 != null) {
            drawable2.setTintList(p0);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode p0) {
        int i = 2 % 2;
        Drawable drawable = this.INotificationSideChannel;
        if (drawable != null) {
            drawable.setTintMode(p0);
        }
        Drawable drawable2 = this.notify;
        if (drawable2 != null) {
            int i2 = RemoteActionCompatParcelizer + 125;
            INotificationSideChannelStub = i2 % 128;
            int i3 = i2 % 2;
            drawable2.setTintMode(p0);
            int i4 = RemoteActionCompatParcelizer + 89;
            INotificationSideChannelStub = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = RemoteActionCompatParcelizer + 35;
        INotificationSideChannelStub = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode p0) {
        int i = 2 % 2;
        Drawable drawable = this.INotificationSideChannel;
        if (drawable != null) {
            int i2 = RemoteActionCompatParcelizer + 101;
            INotificationSideChannelStub = i2 % 128;
            int i3 = i2 % 2;
            drawable.setTintBlendMode(p0);
        }
        Drawable drawable2 = this.notify;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(p0);
        }
        int i4 = RemoteActionCompatParcelizer + 13;
        INotificationSideChannelStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        int i = 2 % 2;
        if (this.asBinder != 1) {
            return false;
        }
        int i2 = RemoteActionCompatParcelizer + 19;
        int i3 = i2 % 128;
        INotificationSideChannelStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 75;
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Animatable animatable;
        int i = 2 % 2;
        Object obj = this.INotificationSideChannel;
        Object obj2 = null;
        if (obj instanceof Animatable) {
            int i2 = INotificationSideChannelStub + 3;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            animatable = (Animatable) obj;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            int i4 = RemoteActionCompatParcelizer + 65;
            INotificationSideChannelStub = i4 % 128;
            if (i4 % 2 == 0) {
                animatable.start();
                int i5 = 92 / 0;
            } else {
                animatable.start();
            }
        }
        Object obj3 = this.notify;
        Animatable animatable2 = obj3 instanceof Animatable ? (Animatable) obj3 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.asBinder != 0) {
            int i6 = RemoteActionCompatParcelizer + 21;
            INotificationSideChannelStub = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }
        this.asBinder = 1;
        this.a = SystemClock.uptimeMillis();
        List<Animatable2Compat.AnimationCallback> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            int i8 = INotificationSideChannelStub + 55;
            RemoteActionCompatParcelizer = i8 % 128;
            int i9 = i8 % 2;
            list.get(i7).onAnimationStart(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Animatable animatable;
        int i = 2 % 2;
        Object obj = this.INotificationSideChannel;
        if (!(!(obj instanceof Animatable))) {
            animatable = (Animatable) obj;
        } else {
            int i2 = RemoteActionCompatParcelizer + 7;
            INotificationSideChannelStub = i2 % 128;
            int i3 = i2 % 2;
            animatable = null;
        }
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.notify;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.asBinder != 2) {
            int i4 = RemoteActionCompatParcelizer + 115;
            INotificationSideChannelStub = i4 % 128;
            int i5 = i4 % 2;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (i5 == 0) {
                int i6 = 41 / 0;
            }
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final void registerAnimationCallback(Animatable2Compat.AnimationCallback p0) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 27;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(p0);
        int i4 = INotificationSideChannelStub + 97;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        MediaDescriptionCompat1 mediaDescriptionCompat1 = (MediaDescriptionCompat1) objArr[0];
        Animatable2Compat.AnimationCallback animationCallback = (Animatable2Compat.AnimationCallback) objArr[1];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 103;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zRemove = mediaDescriptionCompat1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.remove(animationCallback);
        int i4 = RemoteActionCompatParcelizer + 65;
        INotificationSideChannelStub = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zRemove);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        MediaDescriptionCompat1 mediaDescriptionCompat1 = (MediaDescriptionCompat1) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 87;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        mediaDescriptionCompat1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.clear();
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
        int i5 = RemoteActionCompatParcelizer + 31;
        INotificationSideChannelStub = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        MediaDescriptionCompat1 mediaDescriptionCompat1 = (MediaDescriptionCompat1) objArr[0];
        Drawable drawable = (Drawable) objArr[1];
        Rect rect = (Rect) objArr[2];
        int i = 2 % 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0) {
            int i2 = RemoteActionCompatParcelizer;
            int i3 = i2 + 111;
            INotificationSideChannelStub = i3 % 128;
            int i4 = i3 % 2;
            if (intrinsicHeight > 0) {
                int i5 = i2 + 43;
                INotificationSideChannelStub = i5 % 128;
                int i6 = i5 % 2;
                int iWidth = rect.width();
                int iHeight = rect.height();
                double dTuitionPaymentFragmentspecialinlinedviewModeldefault2 = MediaBrowserCompatApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault2(intrinsicWidth, intrinsicHeight, iWidth, iHeight, mediaDescriptionCompat1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int iRoundToInt = MathKt.roundToInt((((double) iWidth) - (((double) intrinsicWidth) * dTuitionPaymentFragmentspecialinlinedviewModeldefault2)) / 2.0d);
                int iRoundToInt2 = MathKt.roundToInt((((double) iHeight) - (dTuitionPaymentFragmentspecialinlinedviewModeldefault2 * ((double) intrinsicHeight))) / 2.0d);
                drawable.setBounds(rect.left + iRoundToInt, rect.top + iRoundToInt2, rect.right - iRoundToInt, rect.bottom - iRoundToInt2);
                int i7 = INotificationSideChannelStub + 37;
                RemoteActionCompatParcelizer = i7 % 128;
                int i8 = i7 % 2;
                return null;
            }
        }
        drawable.setBounds(rect);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r7.intValue() == (-1)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2(java.lang.Integer r6, java.lang.Integer r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r2 = 0
            r3 = -1
            if (r1 != 0) goto L38
            int r1 = defpackage.MediaDescriptionCompat1.INotificationSideChannelStub
            int r1 = r1 + 67
            int r4 = r1 % 128
            defpackage.MediaDescriptionCompat1.RemoteActionCompatParcelizer = r4
            int r1 = r1 % r0
            if (r6 == 0) goto L1a
            int r1 = r6.intValue()
            if (r1 == r3) goto L2b
        L1a:
            if (r7 == 0) goto L38
            int r1 = defpackage.MediaDescriptionCompat1.INotificationSideChannelStub
            int r1 = r1 + 5
            int r4 = r1 % 128
            defpackage.MediaDescriptionCompat1.RemoteActionCompatParcelizer = r4
            int r1 = r1 % r0
            int r1 = r7.intValue()
            if (r1 != r3) goto L38
        L2b:
            int r6 = defpackage.MediaDescriptionCompat1.INotificationSideChannelStub
            int r6 = r6 + 1
            int r7 = r6 % 128
            defpackage.MediaDescriptionCompat1.RemoteActionCompatParcelizer = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L37
            return r3
        L37:
            throw r2
        L38:
            if (r6 == 0) goto L51
            int r1 = defpackage.MediaDescriptionCompat1.INotificationSideChannelStub
            int r1 = r1 + 37
            int r4 = r1 % 128
            defpackage.MediaDescriptionCompat1.RemoteActionCompatParcelizer = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L4a
            int r6 = r6.intValue()
            goto L52
        L4a:
            r6.intValue()
            r2.hashCode()
            throw r2
        L51:
            r6 = r3
        L52:
            if (r7 == 0) goto L58
            int r3 = r7.intValue()
        L58:
            int r6 = java.lang.Math.max(r6, r3)
            int r7 = defpackage.MediaDescriptionCompat1.RemoteActionCompatParcelizer
            int r7 = r7 + 87
            int r1 = r7 % 128
            defpackage.MediaDescriptionCompat1.INotificationSideChannelStub = r1
            int r7 = r7 % r0
            if (r7 == 0) goto L68
            return r6
        L68:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaDescriptionCompat1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(java.lang.Integer, java.lang.Integer):int");
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        List<Animatable2Compat.AnimationCallback> list;
        int size;
        int i;
        int i2 = 2 % 2;
        int i3 = INotificationSideChannelStub + 25;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            this.asBinder = 4;
            this.INotificationSideChannel = null;
            list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            size = list.size();
            i = 1;
        } else {
            this.asBinder = 2;
            this.INotificationSideChannel = null;
            list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            size = list.size();
            i = 0;
        }
        while (i < size) {
            int i4 = RemoteActionCompatParcelizer + 33;
            INotificationSideChannelStub = i4 % 128;
            if (i4 % 2 == 0) {
                list.get(i).onAnimationEnd(this);
                i += 103;
            } else {
                list.get(i).onAnimationEnd(this);
                i++;
            }
        }
    }

    static {
        getInterfaceDescriptor = 1;
        b();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannelStubProxy + 57;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final void clearAnimationCallbacks() {
        int iB = ClaimOldDaySecurityTermsConditionActivity.b.b();
        TuitionPaymentFragmentbindingInflater1(ClaimOldDaySecurityTermsConditionActivity.b.b(), iB, ClaimOldDaySecurityTermsConditionActivity.b.b(), ClaimOldDaySecurityTermsConditionActivity.b.b(), new Object[]{this}, -303713138, 303713138);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public final int getOpacity() {
        int iB = ClaimOldDaySecurityTermsConditionActivity.b.b();
        return ((Integer) TuitionPaymentFragmentbindingInflater1(ClaimOldDaySecurityTermsConditionActivity.b.b(), iB, ClaimOldDaySecurityTermsConditionActivity.b.b(), ClaimOldDaySecurityTermsConditionActivity.b.b(), new Object[]{this}, -1039050480, 1039050482)).intValue();
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] p0) {
        int iB = ClaimOldDaySecurityTermsConditionActivity.b.b();
        return ((Boolean) TuitionPaymentFragmentbindingInflater1(ClaimOldDaySecurityTermsConditionActivity.b.b(), iB, ClaimOldDaySecurityTermsConditionActivity.b.b(), ClaimOldDaySecurityTermsConditionActivity.b.b(), new Object[]{this, p0}, -1668275783, 1668275787)).booleanValue();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback p0) {
        int iB = ClaimOldDaySecurityTermsConditionActivity.b.b();
        return ((Boolean) TuitionPaymentFragmentbindingInflater1(ClaimOldDaySecurityTermsConditionActivity.b.b(), iB, ClaimOldDaySecurityTermsConditionActivity.b.b(), ClaimOldDaySecurityTermsConditionActivity.b.b(), new Object[]{this, p0}, 1229098291, -1229098288)).booleanValue();
    }

    private void TuitionPaymentFragmentbindingInflater1(Drawable p0, Rect p1) {
        int iB = ClaimOldDaySecurityTermsConditionActivity.b.b();
        TuitionPaymentFragmentbindingInflater1(ClaimOldDaySecurityTermsConditionActivity.b.b(), iB, ClaimOldDaySecurityTermsConditionActivity.b.b(), ClaimOldDaySecurityTermsConditionActivity.b.b(), new Object[]{this, p0, p1}, 565453360, -565453359);
    }

    static void b() {
        onTransact = new char[]{60079, 60054, 60056, 60082, 60084, 60085, 60086, 60043, 60072, 60041, 60078, 60058, 60117, 60046, 60047, 60053, 60073, 60034, 60081, 60050, 60063, 60088, 60040, 60049, 60052, 60048, 60060, 60045, 60051, 60089, 60090, 60062, 60083, 60055, 60087, 60080};
        cancel = (char) 57191;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r5, byte r6, byte r7) {
        /*
            byte[] r0 = defpackage.MediaDescriptionCompat1.$$c
            int r7 = r7 * 2
            int r1 = r7 + 1
            int r5 = r5 * 4
            int r5 = r5 + 4
            int r6 = 116 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r6 = r7
            r4 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            r3 = r0[r5]
        L25:
            int r6 = r6 + r3
            int r5 = r5 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaDescriptionCompat1.$$g(int, byte, byte):java.lang.String");
    }
}
