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
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentEditPhoneNumberDialogBinding;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u0003R\u0016\u0010\u0011\u001a\u00020\u00158\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00178\u0015X\u0095D¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0010\u001a\u00020\u001b8\u0015X\u0095D¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!"}, d2 = {"LDrawableRes;", "LMediaSessionCompatMediaSessionImplApi21ExtraSession;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "asInterface", "Lcom/bpjstku/databinding/FragmentEditPhoneNumberDialogBinding;", "Lcom/bpjstku/databinding/FragmentEditPhoneNumberDialogBinding;", "", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()I", "", "Z", "d", "()Z", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DrawableRes extends MediaSessionCompatMediaSessionImplApi21ExtraSession {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = R.layout.fragment_edit_phone_number_dialog;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final boolean b = true;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private Function1<? super String, Unit> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private FragmentEditPhoneNumberDialogBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentbindingInflater1() {
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentEditPhoneNumberDialogBinding fragmentEditPhoneNumberDialogBindingInflate = FragmentEditPhoneNumberDialogBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = fragmentEditPhoneNumberDialogBindingInflate;
        if (fragmentEditPhoneNumberDialogBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditPhoneNumberDialogBindingInflate = null;
        }
        FrameLayout root = fragmentEditPhoneNumberDialogBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void b() {
        final FragmentEditPhoneNumberDialogBinding fragmentEditPhoneNumberDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (fragmentEditPhoneNumberDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditPhoneNumberDialogBinding = null;
        }
        Button button = fragmentEditPhoneNumberDialogBinding.btnSavePhoneNumber;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: EmptySuper
            private static final byte[] $$c = {65, -122, -65, 2};
            private static final int $$f = 251;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {83, ByteCompanionObject.MIN_VALUE, -37, -48, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 60, -4, -4, -5, 8, -24, 1, 9, -5, -3, -1, -4, -67, 73, -3, -27, 13, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -69};
            private static final int $$e = 241;
            private static final byte[] $$a = {114, -115, 48, 84, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
            private static final int $$b = 56;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int d = 1;
            private static char[] b = {25183, 64585, 24168, 47111, 6709, 29738, 54988, 12479, 37529, 60588, 20202, 43390, 2923, 25864, 50964, 8492, 33731, 7636, 32656, 55690, 15273, 39512, 45561, 12265, 36303, 27559, 51595, 42884, 1390, 58209, 16689, 16156, 40202, 31483, 55513, 46772, 5287, 9842, 47204, 6725, 64554, 24088, 12295, 37601, 29842, 54970, 43138, 2713, 60718, 20350, 8501, 33593, 25869, 51189, 22995, 15269, 40369, 32691, 56950, 45127, 4681, 62506, 22022, 60141, 29922, 54990, 12471, 37519, 64669, 24172, 47200, 6710, 25631, 50712, 8692, 33729, 60842, 20388, 43408, 2929, 38217, 45558, 12260, 36312, 27574, 51670, 42893, 1387, 58205, 16691, 16211, 40245, 31478, 55491, 46765, 5287, 62086, 45557, 12257, 36299, 27577, 51596, 42888, 1406, 58186, 16668, 16156, 40213, 31463, 55539, 46774, 5286, 62094, 8137, 33159, 9135, 50641, 26622, 2532, 43787, 19810, 61194, 37244, 13159, 54493, 30386, 6363, 47812, 23737, 65116, 24675, 527, 42053, 17978, 59329, 35306, 11174, 52678, 28605, 4371, 45929, 21876, 63306, 39201, 15045, 56546, 32419, 57499, 33449, 9294, 50775, 26741, 2645, 44149, 19919, 61397, 37360, 13265, 54779, 30646, 6489, 47914, 23810, 65313, 24929, 731, 42222, 18063, 59590, 35514, 11346, 52837, 28762, 4677, 46184, 21959, 63422, 33836, 6711, 47129, 24114, 64539, 37383, 12475, 54999, 29922, 2760, 43141, 20286, 60678, 33592, 8567, 50956, 26093, 64469, 39355, 16295, 56718, 31861, 4623, 45126, 22133, 62474, 35495, 10453, 52928, 27811, 664, 41328, 18262, 58644, 31528, 6421, 49151, 23991, 62360, 37298, 14229, 54827, 29747, 2634, 43060, 19998, 60418, 33515, 8390, 50917, 25748, 64141, 39225, 16214, 56634, 29474, 4436, 47032, 21975, 60344, 35314, 12170, 52855, 27662};
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -9060676537918738555L;

            private static void a(byte b2, byte b3, byte b4, Object[] objArr) {
                byte[] bArr = $$a;
                int i = b3 * 52;
                int i2 = (b2 * 14) + 84;
                int i3 = b4 + 4;
                byte[] bArr2 = new byte[i + 1];
                int i4 = -1;
                if (bArr == null) {
                    i2 = (i + i3) - 11;
                    i3 = i3;
                    i4 = -1;
                }
                while (true) {
                    int i5 = i4 + 1;
                    bArr2[i5] = (byte) i2;
                    int i6 = i3 + 1;
                    if (i5 == i) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    } else {
                        i2 = (i2 + bArr[i6]) - 11;
                        i3 = i6;
                        i4 = i5;
                    }
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void e(int r6, short r7, int r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 48
                    int r6 = 52 - r6
                    int r8 = r8 * 15
                    int r8 = 99 - r8
                    byte[] r0 = defpackage.EmptySuper.$$d
                    int r7 = r7 * 4
                    int r7 = 53 - r7
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r8 = r6
                    r3 = r7
                    r4 = r2
                    goto L2e
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r7) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L27:
                    r4 = r0[r6]
                    r5 = r8
                    r8 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L2e:
                    int r3 = r3 + r6
                    int r6 = r3 + 3
                    int r8 = r8 + 1
                    r3 = r4
                    r5 = r8
                    r8 = r6
                    r6 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.EmptySuper.e(int, short, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:43:0x021e  */
            /* JADX WARN: Code duplicated, block: B:44:0x021f  */
            private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
                float f;
                Throwable cause;
                int i3 = 2 % 2;
                lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                long[] jArr = new long[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i4 = $10 + 77;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                while (true) {
                    f = 0.0f;
                    if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                        break;
                    }
                    int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    try {
                        Object[] objArr2 = {Integer.valueOf(b[i + i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 2188;
                            int iMyTid = (Process.myTid() >> 22) + 40;
                            byte b2 = $$c[3];
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, packedPositionChild, iMyTid, 841711447, false, $$g((byte) 0, b2, (byte) (b2 - 2)), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 33017), 3011 - (ViewConfiguration.getScrollBarSize() >> 8), ImageFormat.getBitsPerPixel(0) + 27, 321985076, false, $$g(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), TextUtils.indexOf((CharSequence) "", '0', 0) + 3377, TextUtils.indexOf("", "", 0, 0) + 17, -968507904, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
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
                char[] cArr = new char[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    int i7 = $10 + 35;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                        Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 36505);
                            int size = View.MeasureSpec.getSize(0) + 3376;
                            int i8 = 18 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1));
                            byte b7 = (byte) 0;
                            byte b8 = (byte) (b7 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetBefore, size, i8, -968507904, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        throw null;
                    }
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = (byte) (b9 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (36505 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (ViewConfiguration.getTapTimeout() >> 16) + 3376, 17 - (ViewConfiguration.getEdgeSlop() >> 16), -968507904, false, $$g(b9, b10, (byte) (b10 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    f = 0.0f;
                }
                objArr[0] = new String(cArr);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                int i2 = d + 51;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 37566);
                    int pressedStateDuration = 625 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int gidForName = Process.getGidForName("") + 15;
                    byte[] bArr = $$a;
                    byte b2 = bArr[5];
                    Object[] objArr2 = new Object[1];
                    a((byte) (-b2), bArr[7], b2, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, pressedStateDuration, gidForName, -477065106, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, TextUtils.indexOf((CharSequence) "", '0', 0) + 23, (char) (54178 - Gravity.getAbsoluteGravity(0, 0)), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14, (char) TextUtils.indexOf("", ""), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cLastIndexOf = (char) (37566 - TextUtils.lastIndexOf("", '0', 0));
                    int iIndexOf = TextUtils.indexOf("", "") + 625;
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 15;
                    byte[] bArr2 = $$a;
                    byte b3 = bArr2[7];
                    byte b4 = bArr2[5];
                    Object[] objArr5 = new Object[1];
                    a(b3, (byte) (-b4), b4, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, iIndexOf, iIndexOf2, -976899241, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cResolveOpacity = (char) (37567 - Drawable.resolveOpacity(0, 0));
                        int i4 = 625 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14;
                        byte[] bArr3 = $$a;
                        byte b5 = bArr3[7];
                        byte b6 = (byte) (-bArr3[5]);
                        Object[] objArr6 = new Object[1];
                        a(b5, b6, (byte) (b6 | 50), objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, i4, keyRepeatDelay, -973632554, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    int i5 = ((int[]) objArr7[2])[0];
                    int i6 = ((int[]) objArr7[0])[0];
                    String[] strArr = (String[]) objArr7[3];
                    int[] iArr = {i5};
                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i7 = ~iMaxMemory;
                    int i8 = (((~((-1749065893) | i7)) | (~(1803548927 | iMaxMemory))) * 988) + 1346316636 + (((~(iMaxMemory | (-1769255086))) | 20189193 | (~(i7 | 1803548927))) * 988) + 923034395;
                    int i9 = (i8 << 13) ^ i8;
                    int i10 = i9 ^ (i9 >>> 17);
                    ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
                    objArr = new Object[]{new int[]{i6}, new int[1], iArr, strArr};
                } else {
                    Object[] objArr8 = new Object[1];
                    c(36 - TextUtils.lastIndexOf("", '0', 0), 26 - View.MeasureSpec.getMode(0), (char) (38798 - ((byte) KeyEvent.getModifierMetaStateMask())), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 63, Color.argb(0, 0, 0, 0) + 18, (char) (23314 - Drawable.resolveOpacity(0, 0)), objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = (!((applicationContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    Object[] objArr10 = new Object[1];
                    c(81 - View.MeasureSpec.makeMeasureSpec(0, 0), 16 - ((Process.getThreadPriority(0) + 20) >> 6), (char) KeyEvent.keyCodeFromString(""), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(97 - ExpandableListView.getPackedPositionType(0L), Color.green(0) + 16, (char) ExpandableListView.getPackedPositionType(0L), objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    Object[] objArr12 = new Object[1];
                    c(113 - TextUtils.indexOf("", "", 0, 0), 63 - ImageFormat.getBitsPerPixel(0), (char) (44648 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr12);
                    String str = (String) objArr12[0];
                    Object[] objArr13 = new Object[1];
                    c(178 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 65, (char) (ExpandableListView.getPackedPositionType(0L) + 13779), objArr13);
                    try {
                        Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, 923034395};
                        byte[] bArr4 = $$d;
                        byte b7 = bArr4[41];
                        byte b8 = b7;
                        Object[] objArr15 = new Object[1];
                        e(b7, b8, (byte) (b8 - 1), objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        byte b9 = bArr4[41];
                        byte b10 = (byte) (b9 - 1);
                        Object[] objArr16 = new Object[1];
                        e(b10, b10, b9, objArr16);
                        Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                        int i11 = ((int[]) objArr17[0])[0];
                        int i12 = ((int[]) objArr17[2])[0];
                        if (applicationContext != null) {
                            int i13 = d + 3;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                            int i14 = i13 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char cResolveSize = (char) (37567 - View.resolveSize(0, 0));
                                int iBlue = 625 - Color.blue(0);
                                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 14;
                                byte[] bArr5 = $$a;
                                byte b11 = bArr5[7];
                                byte b12 = (byte) (-bArr5[5]);
                                Object[] objArr18 = new Object[1];
                                a(b11, b12, (byte) (b12 | 50), objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSize, iBlue, threadPriority, -973632554, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                            try {
                                Object[] objArr19 = new Object[1];
                                c(ImageFormat.getBitsPerPixel(0) + 1, 22 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (KeyEvent.getDeadChar(0, 0) + 54178), objArr19);
                                Class<?> cls5 = Class.forName((String) objArr19[0]);
                                Object[] objArr20 = new Object[1];
                                c(KeyEvent.getDeadChar(0, 0) + 22, View.combineMeasuredStates(0, 0) + 15, (char) View.resolveSize(0, 0), objArr20);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char defaultSize = (char) (View.getDefaultSize(0, 0) + 37567);
                                    int iGreen = Color.green(0) + 625;
                                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 14;
                                    byte[] bArr6 = $$a;
                                    byte b13 = bArr6[7];
                                    byte b14 = bArr6[5];
                                    Object[] objArr21 = new Object[1];
                                    a(b13, (byte) (-b14), b14, objArr21);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, iGreen, capsMode, -976899241, false, (String) objArr21[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 37567);
                                    int iIndexOf3 = 624 - TextUtils.indexOf((CharSequence) "", '0');
                                    int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 14;
                                    byte[] bArr7 = $$a;
                                    byte b15 = bArr7[5];
                                    Object[] objArr22 = new Object[1];
                                    a((byte) (-b15), bArr7[7], b15, objArr22);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(fadingEdgeLength, iIndexOf3, capsMode2, -477065106, false, (String) objArr22[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
                                d = i15 % 128;
                                int i16 = i15 % 2;
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                        objArr = objArr17;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i17 = ((int[]) objArr[0])[0];
                int i18 = ((int[]) objArr[2])[0];
                if (i18 == i17) {
                    int i19 = ((int[]) objArr[1])[0];
                    int i20 = ((int[]) objArr[2])[0];
                    int i21 = ((int[]) objArr[0])[0];
                    String[] strArr2 = (String[]) objArr[3];
                    int[] iArr2 = {i20};
                    int[] iArr3 = {i21};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i22 = (-1073794520) + (((~(104428839 | iIdentityHashCode)) | 1719309281) * 672);
                    int i23 = ~iIdentityHashCode;
                    int i24 = i19 + i22 + (((~(iIdentityHashCode | 1719309281)) | (~((-104428840) | i23))) * (-672)) + (((~((-1719309282) | i23)) | 1614971584) * 672);
                    int i25 = (i24 << 13) ^ i24;
                    int i26 = i25 ^ (i25 >>> 17);
                    ((int[]) objArr[1])[0] = i26 ^ (i26 << 5);
                    Object[] objArr23 = {iArr3, new int[1], iArr2, strArr2};
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr3 = (String[]) objArr[3];
                    if (strArr3 != null) {
                        int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
                        d = i27 % 128;
                        int i28 = i27 % 2;
                        for (String str2 : strArr3) {
                            arrayList.add(str2);
                        }
                    }
                    int[] iArr4 = new int[i18];
                    int i29 = i18 - 1;
                    iArr4[i29] = 1;
                    Toast.makeText((Context) null, iArr4[((i18 * i29) % 2) - 1], 1).show();
                    int i30 = ((int[]) objArr[1])[0];
                    int i31 = ((int[]) objArr[2])[0];
                    int i32 = ((int[]) objArr[0])[0];
                    String[] strArr4 = (String[]) objArr[3];
                    int[] iArr5 = {i31};
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i33 = (~((-1047117770) | iIdentityHashCode2)) | 776472841;
                    int i34 = ~iIdentityHashCode2;
                    int i35 = i30 + (-722909322) + ((i33 | (~(1047265279 | i34))) * 886) + (((~(i34 | 1047117769)) | 776620351) * (-1772)) + ((~(i34 | 776620351)) * 886);
                    int i36 = (i35 << 13) ^ i35;
                    int i37 = i36 ^ (i36 >>> 17);
                    ((int[]) objArr[1])[0] = i37 ^ (i37 << 5);
                    Object[] objArr24 = {new int[]{i32}, new int[1], iArr5, strArr4};
                }
                return DrawableRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3(fragmentEditPhoneNumberDialogBinding, this, (View) obj);
            }

            private static String $$g(byte b2, int i, byte b3) {
                int i2 = 115 - (i * 3);
                byte[] bArr = $$c;
                int i3 = b2 * 2;
                int i4 = 3 - (b3 * 2);
                byte[] bArr2 = new byte[i3 + 1];
                int i5 = -1;
                if (bArr == null) {
                    int i6 = i4 + i3;
                    i4 = i4;
                    i2 = i6;
                }
                while (true) {
                    i5++;
                    int i7 = i4 + 1;
                    bArr2[i5] = (byte) i2;
                    if (i5 == i3) {
                        return new String(bArr2, 0);
                    }
                    i4 = i7;
                    i2 += bArr[i7];
                }
            }
        }));
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        FragmentEditPhoneNumberDialogBinding fragmentEditPhoneNumberDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (fragmentEditPhoneNumberDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditPhoneNumberDialogBinding = null;
        }
        Button button = fragmentEditPhoneNumberDialogBinding.btnSavePhoneNumber;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        FragmentEditPhoneNumberDialogBinding fragmentEditPhoneNumberDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (fragmentEditPhoneNumberDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditPhoneNumberDialogBinding = null;
        }
        Button button = fragmentEditPhoneNumberDialogBinding.btnSavePhoneNumber;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(true);
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi21ExtraSession
    public final void asInterface() {
        FragmentEditPhoneNumberDialogBinding fragmentEditPhoneNumberDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (fragmentEditPhoneNumberDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEditPhoneNumberDialogBinding = null;
        }
        TextInputEditText textInputEditText = fragmentEditPhoneNumberDialogBinding.edtPhoneNumber;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.error_phone_number_length);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentbindingInflater1(new unregisterLifecycle(textInputEditText, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string2, 9, 12)})));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(FragmentEditPhoneNumberDialogBinding fragmentEditPhoneNumberDialogBinding, DrawableRes drawableRes, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        EditText editText = fragmentEditPhoneNumberDialogBinding.tilPhoneNumber.getEditText();
        if (StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString().length() > 0) {
            Function1<? super String, Unit> function1 = drawableRes.TuitionPaymentFragmentbindingInflater1;
            drawableRes.dismiss();
        }
        return Unit.INSTANCE;
    }
}
