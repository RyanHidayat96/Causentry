package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
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
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemMasterDataBinding;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u000e\u0012\f0\u0004R\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002:\u0001\u0012B=\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0007\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0012\u001a\f0\u0004R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00028\u0000H'¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u000e\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\u000e\u0010\u0018J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0019R\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u001b8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u001b8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001d"}, d2 = {"LMediaSessionCompatMediaSessionImplApi28;", ExifInterface.GPS_DIRECTION_TRUE, "LsetVirtualCameraRotationDegrees;", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "LMediaSessionCompatMediaSessionImplApi28$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/view/ViewGroup;)LMediaSessionCompatMediaSessionImplApi28$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/Object;)Ljava/lang/String;", "", "(Ljava/lang/String;Ljava/lang/Object;)Z", "(Ljava/lang/String;)V", "Lkotlin/jvm/functions/Function1;", "", "b", "Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class MediaSessionCompatMediaSessionImplApi28<T> extends setVirtualCameraRotationDegrees<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>, MediaSessionCompatMediaSessionImplApi28<T>.TuitionPaymentFragmentspecialinlinedviewModeldefault2> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Function1<T, Unit> TuitionPaymentFragmentbindingInflater1;
    private final List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>> b;

    public abstract String TuitionPaymentFragmentbindingInflater1(T p0);

    public abstract boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0, T p1);

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewGroup);
    }

    public /* synthetic */ MediaSessionCompatMediaSessionImplApi28(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaSessionCompatMediaSessionImplApi28(Context context, List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>> list, Function1<? super T, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentbindingInflater1 = function1;
        this.b = new ArrayList();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.setVirtualCameraRotationDegrees
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        this.b.clear();
        List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>> list = this.b;
        Collection<? extends lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>> collection = this.d;
        Intrinsics.checkNotNullExpressionValue(collection, "");
        list.addAll(collection);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.clear();
        List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>> list2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Collection<? extends lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>> collection2 = this.d;
        Intrinsics.checkNotNullExpressionValue(collection2, "");
        list2.addAll(collection2);
    }

    private MediaSessionCompatMediaSessionImplApi28<T>.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemMasterDataBinding itemMasterDataBindingInflate = ItemMasterDataBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemMasterDataBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, itemMasterDataBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends VirtualCameraInfo<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>> {
        private final ItemMasterDataBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ MediaSessionCompatMediaSessionImplApi28<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static final byte[] $$c = {55, -47, -47, 67};
        private static final int $$f = 172;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {57, -56, 23, -36, -3, -20, 34, -25, -28, 50, -59, 16, 11, -24, -7, -7, -11, -4, 38, -49, -11, 2, -11, -38, 7, -16, 6, -11, -4, 25, -22, -29, 7, 3, -14, -11, 41, -49, 12, -11, -11, 3, -14, -11, 13, -12, -10, 5, -10, -10, 2, 25, -42, 3, -11, 6, -24, 10, -18, 60};
        private static final int $$e = 212;
        private static final byte[] $$a = {73, 55, 58, 33, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 19;
        private static int b = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;
        private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {999461922, 156575227, -885070233, 2053214512, -1472752305, 286799507, 1840561643, 1346323057, -1459661544, -159420281, -1854739797, -839788024, 2104274420, -80326203, 2051321094, -756401518, -1397257399, -1266542939};

        /* JADX WARN: Code duplicated, block: B:10:0x002c  */
        /* JADX WARN: Code duplicated, block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = MediaSessionCompatMediaSessionImplApi28.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$a
                int r6 = r6 * 52
                int r6 = 108 - r6
                int r7 = r7 * 15
                int r1 = r7 + 38
                int r8 = r8 * 2
                int r8 = r8 + 84
                byte[] r1 = new byte[r1]
                int r7 = r7 + 37
                r2 = 0
                if (r0 != 0) goto L19
                r3 = r8
                r4 = r2
                r8 = r6
                goto L2e
            L19:
                r3 = r2
                r5 = r8
                r8 = r6
                r6 = r5
            L1d:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L2c
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2c:
                r3 = r0[r8]
            L2e:
                int r3 = -r3
                int r6 = r6 + r3
                int r6 = r6 + (-11)
                int r8 = r8 + 1
                r3 = r4
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: MediaSessionCompatMediaSessionImplApi28.TuitionPaymentFragmentspecialinlinedviewModeldefault2.a(byte, int, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(byte r7, int r8, short r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 18
                int r7 = 38 - r7
                byte[] r0 = MediaSessionCompatMediaSessionImplApi28.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$d
                int r9 = r9 * 19
                int r9 = 103 - r9
                int r8 = r8 + 4
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r7
                r9 = r8
                r4 = r2
                goto L2d
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r7) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L25:
                int r8 = r8 + 1
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L2d:
                int r8 = -r8
                int r3 = r3 + r8
                int r8 = r3 + (-5)
                r3 = r4
                r6 = r9
                r9 = r8
                r8 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: MediaSessionCompatMediaSessionImplApi28.TuitionPaymentFragmentspecialinlinedviewModeldefault2.d(byte, int, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(MediaSessionCompatMediaSessionImplApi28 mediaSessionCompatMediaSessionImplApi28, ItemMasterDataBinding itemMasterDataBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) throws Throwable {
            Intrinsics.checkNotNullParameter(itemMasterDataBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mediaSessionCompatMediaSessionImplApi28;
            Context context = mediaSessionCompatMediaSessionImplApi28.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            RelativeLayout root = itemMasterDataBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = itemMasterDataBinding;
        }

        private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            long j = 0;
            int i3 = -1870535734;
            int i4 = 1;
            int i5 = 0;
            if (iArr2 != null) {
                int i6 = $10 + 31;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i8 = 0;
                while (i8 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i5] = Integer.valueOf(iArr2[i8]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                            int iCombineMeasuredStates = 3291 - View.combineMeasuredStates(i5, i5);
                            int packedPositionChild = 30 - ExpandableListView.getPackedPositionChild(j);
                            byte b2 = (byte) 1;
                            byte b3 = (byte) (b2 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, iCombineMeasuredStates, packedPositionChild, 1948206109, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i8++;
                        j = 0;
                        i3 = -1870535734;
                        i5 = 0;
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
                int i9 = $11 + 95;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i11 = 0;
                while (i11 < length3) {
                    try {
                        Object[] objArr3 = new Object[i4];
                        objArr3[0] = Integer.valueOf(iArr5[i11]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) i4;
                            byte b5 = (byte) (b4 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.rgb(0, 0, 0) + 16777216), 3291 - (Process.myPid() >> 22), 31 - (ViewConfiguration.getTapTimeout() >> 16), 1948206109, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr6[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i11++;
                        iArr5 = iArr5;
                        i4 = 1;
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
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            sessionConfigValidatingBuilder.b = 2;
            int i12 = $11 + 115;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                int i14 = $11 + 13;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                int i16 = 17;
                for (int i17 = 1; i16 > i17; i17 = 1) {
                    int i18 = $11 + 47;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i16];
                        Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2559 - ExpandableListView.getPackedPositionType(0L), 29 - (ViewConfiguration.getLongPressTimeout() >> 16), 683220507, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                        i16 += 13;
                    } else {
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i16];
                        Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.getDefaultSize(0, 0), 2558 - Process.getGidForName(""), 29 - TextUtils.getOffsetAfter("", 0), 683220507, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                        i16--;
                    }
                }
                int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i20 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr6 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28879 - (ViewConfiguration.getTapTimeout() >> 16)), 348 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 25 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
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

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) throws Throwable {
            Object[] objArr;
            char c;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            int i2 = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2267;
                int iNormalizeMetaState = 33 - KeyEvent.normalizeMetaState(0);
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                a(bArr[40], bArr[5], bArr[7], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, maximumDrawingCacheSize, iNormalizeMetaState, -887667012, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new int[]{-72588473, 1008655068, 1134183503, -769598016, 1174139540, 199724176, -297695335, -1454317112, -1805775534, -1361906799, -1369932162, 900656337, 1466752939, -1211384705}, 22 - TextUtils.getOffsetAfter("", 0), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new int[]{348592077, 1735898213, 1527498587, 536755615, -1377879888, -1543227891, -670775017, 173214319, -795970304, 1543712162}, TextUtils.lastIndexOf("", '0') + 16, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int gidForName = Process.getGidForName("") + 2268;
                int iMyTid = (Process.myTid() >> 22) + 33;
                byte[] bArr2 = $$a;
                byte b2 = bArr2[5];
                Object[] objArr5 = new Object[1];
                a(b2, b2, bArr2[7], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, gidForName, iMyTid, -874156483, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cAlpha = (char) Color.alpha(0);
                    int absoluteGravity = 2267 - Gravity.getAbsoluteGravity(0, 0);
                    int iArgb = Color.argb(0, 0, 0, 0) + 33;
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr6 = new Object[1];
                    a(b3, b4, b4, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, absoluteGravity, iArgb, -654680577, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i3 = ((int[]) objArr7[0])[0];
                int i4 = ((int[]) objArr7[3])[0];
                String[] strArr = (String[]) objArr7[1];
                int iIdentityHashCode = System.identityHashCode(this);
                int i5 = ~iIdentityHashCode;
                int i6 = 21155039 + (((~((-575080557) | i5)) | 4456548 | (~((-233632760) | i5)) | (~(804256767 | iIdentityHashCode))) * (-84));
                int i7 = (~(iIdentityHashCode | (-233632760))) | 575080556;
                int i8 = ~(i5 | 233632759);
                int i9 = i6 + ((i7 | i8) * (-84)) + (((-804256768) | i8) * 84) + 1459191036;
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
                c = 3;
            } else {
                Object[] objArr8 = new Object[1];
                c(new int[]{-1561843003, -1178425954, 1727587767, -290612641, 1570494313, 1070620942, -1330072080, 216800337, 1455847696, -496107715, 1746426034, -1369725739, -2011887124, 1151872420, -372029534, -781869543}, 25 - Process.getGidForName(""), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new int[]{1441743577, -1582178049, -1102717720, -533045993, 1075973813, -1455541205, -664866618, 218782627, 1610277073, -1451258057, 1284963518, -1520122417}, View.MeasureSpec.getSize(0) + 18, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = (!((applicationContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                c(new int[]{-1359950422, 198722310, -1636231118, -1221681809, -761383600, -1341443167, -572234064, -36609955, 1080748576, -472638157}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 16, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new int[]{-1077663312, -1226318306, -1689538257, -140785101, 807485802, 165230154, -1823305033, -1271056144, 1782904526, 1528900740}, 15 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1459191036};
                    byte[] bArr3 = $$d;
                    byte b5 = (byte) (bArr3[21] - 1);
                    byte b6 = (byte) (-b5);
                    Object[] objArr13 = new Object[1];
                    d(b5, b6, (byte) (b6 + 1), objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    d((byte) 0, (byte) (-bArr3[58]), (byte) (bArr3[21] - 1), objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        int i12 = TuitionPaymentFragmentbindingInflater1 + 35;
                        b = i12 % 128;
                        int i13 = i12 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c3 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2267;
                            int deadChar = KeyEvent.getDeadChar(0, 0) + 33;
                            byte b7 = $$a[7];
                            byte b8 = b7;
                            Object[] objArr16 = new Object[1];
                            a(b7, b8, b8, objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, iKeyCodeFromString, deadChar, -654680577, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c(new int[]{-72588473, 1008655068, 1134183503, -769598016, 1174139540, 199724176, -297695335, -1454317112, -1805775534, -1361906799, -1369932162, 900656337, 1466752939, -1211384705}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(new int[]{348592077, 1735898213, 1527498587, 536755615, -1377879888, -1543227891, -670775017, 173214319, -795970304, 1543712162}, 15 - View.combineMeasuredStates(0, 0), objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char defaultSize = (char) View.getDefaultSize(0, 0);
                                int deadChar2 = 2267 - KeyEvent.getDeadChar(0, 0);
                                int maximumFlingVelocity = 33 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                byte[] bArr4 = $$a;
                                byte b9 = bArr4[5];
                                Object[] objArr19 = new Object[1];
                                a(b9, b9, bArr4[7], objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, deadChar2, maximumFlingVelocity, -874156483, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                                int i14 = 2267 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int longPressTimeout = 33 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                byte[] bArr5 = $$a;
                                Object[] objArr20 = new Object[1];
                                a(bArr5[40], bArr5[5], bArr5[7], objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAxisFromString, i14, longPressTimeout, -887667012, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            int i15 = b + 79;
                            TuitionPaymentFragmentbindingInflater1 = i15 % 128;
                            int i16 = i15 % 2;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr15;
                    c = 3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i17 = ((int[]) objArr[c])[0];
            int i18 = ((int[]) objArr[0])[0];
            if (i18 != i17) {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr[1];
                if (strArr2 != null) {
                    while (i2 < strArr2.length) {
                        int i19 = b + 85;
                        TuitionPaymentFragmentbindingInflater1 = i19 % 128;
                        if (i19 % 2 == 0) {
                            arrayList.add(strArr2[i2]);
                            i2 += 24;
                        } else {
                            arrayList.add(strArr2[i2]);
                            i2++;
                        }
                    }
                }
                throw new RuntimeException(String.valueOf(i18));
            }
            int i20 = b + 43;
            TuitionPaymentFragmentbindingInflater1 = i20 % 128;
            int i21 = i20 % 2;
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i22 = ((int[]) objArr[2])[0];
            int i23 = ((int[]) objArr[0])[0];
            int i24 = ((int[]) objArr[3])[0];
            String[] strArr3 = (String[]) objArr[1];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i25 = i22 + 1065820892 + (((-136389401) | iIdentityHashCode2) * (-627)) + (((~((-399166632) | iIdentityHashCode2)) | 409546684) * (-627)) + (((~(iIdentityHashCode2 | 409546684)) | (~((~iIdentityHashCode2) | 399166631))) * 627);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr21[2])[0] = i27 ^ (i27 << 5);
            final lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy = (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) obj;
            Intrinsics.checkNotNullParameter(lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy, "");
            ItemMasterDataBinding itemMasterDataBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            final MediaSessionCompatMediaSessionImplApi28<T> mediaSessionCompatMediaSessionImplApi28 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            itemMasterDataBinding.tvName.setText(mediaSessionCompatMediaSessionImplApi28.TuitionPaymentFragmentbindingInflater1(lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            if (lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentbindingInflater1) {
                AppCompatImageView appCompatImageView = itemMasterDataBinding.imgSelected;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                appCompatImageView.setVisibility(0);
            } else {
                AppCompatImageView appCompatImageView2 = itemMasterDataBinding.imgSelected;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
                appCompatImageView2.setVisibility(8);
            }
            RelativeLayout root = itemMasterDataBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: MediaSessionCompatMediaSessionImplBase
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return MediaSessionCompatMediaSessionImplApi28.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mediaSessionCompatMediaSessionImplApi28, lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy, (View) obj2);
                }
            }));
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(MediaSessionCompatMediaSessionImplApi28 mediaSessionCompatMediaSessionImplApi28, lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy, View view) {
            int i = 2 % 2;
            int i2 = b + 69;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = mediaSessionCompatMediaSessionImplApi28.TuitionPaymentFragmentbindingInflater1;
            if (function1 != null) {
                int i4 = b + 89;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
                function1.invoke(lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r6, byte r7, short r8) {
            /*
                int r6 = r6 * 56
                int r6 = 122 - r6
                int r8 = r8 + 4
                int r7 = r7 * 3
                int r0 = 1 - r7
                byte[] r1 = MediaSessionCompatMediaSessionImplApi28.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                if (r1 != 0) goto L17
                r3 = r7
                r6 = r8
                r4 = r2
                goto L2c
            L17:
                r3 = r2
            L18:
                int r8 = r8 + 1
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L27:
                r3 = r1[r8]
                r5 = r8
                r8 = r6
                r6 = r5
            L2c:
                int r3 = -r3
                int r8 = r8 + r3
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: MediaSessionCompatMediaSessionImplApi28.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$g(int, byte, short):java.lang.String");
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void TuitionPaymentFragmentbindingInflater1(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0.length() == 0) {
            this.d.clear();
            this.d.addAll(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            this.b.clear();
            List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>> list = this.b;
            List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>> list2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, ((lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) t).TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                    arrayList.add(t);
                }
            }
            list.addAll(arrayList);
            this.d.clear();
            this.d.addAll(this.b);
        }
        notifyDataSetChanged();
    }
}
