package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
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
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemMasterDataBinding;
import com.bpjstku.domain.asik.model.MaritalStatus;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0011B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"LAppCompatDelegateImplAutoTimeNightModeManager;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/domain/asik/model/MaritalStatus;", "LAppCompatDelegateImplAutoTimeNightModeManager$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/view/ViewGroup;)LAppCompatDelegateImplAutoTimeNightModeManager$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppCompatDelegateImplAutoTimeNightModeManager extends setVirtualCameraRotationDegrees<MaritalStatus, TuitionPaymentFragmentspecialinlinedviewModeldefault1> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Function1<MaritalStatus, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewGroup);
    }

    public /* synthetic */ AppCompatDelegateImplAutoTimeNightModeManager(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private AppCompatDelegateImplAutoTimeNightModeManager(Context context, List<MaritalStatus> list, Function1<? super MaritalStatus, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemMasterDataBinding itemMasterDataBindingInflate = ItemMasterDataBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemMasterDataBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, itemMasterDataBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends VirtualCameraInfo<MaritalStatus> {
        private /* synthetic */ AppCompatDelegateImplAutoTimeNightModeManager TuitionPaymentFragmentbindingInflater1;
        private final ItemMasterDataBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static final byte[] $$c = {57, -56, 23, -36};
        private static final int $$d = 75;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {87, -91, 60, 112, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
        private static final int $$b = 244;
        private static int b = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2607212352219959668L;

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 2
                int r7 = r7 + 53
                int r6 = r6 * 4
                int r6 = r6 + 4
                int r8 = r8 * 4
                int r8 = 84 - r8
                byte[] r0 = AppCompatDelegateImplAutoTimeNightModeManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$a
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L28
            L16:
                r3 = r2
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                r3 = r0[r6]
            L28:
                int r6 = r6 + 1
                int r8 = r8 + r3
                int r8 = r8 + (-11)
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: AppCompatDelegateImplAutoTimeNightModeManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1.c(short, short, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(AppCompatDelegateImplAutoTimeNightModeManager appCompatDelegateImplAutoTimeNightModeManager, ItemMasterDataBinding itemMasterDataBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) throws Throwable {
            Intrinsics.checkNotNullParameter(itemMasterDataBinding, "");
            this.TuitionPaymentFragmentbindingInflater1 = appCompatDelegateImplAutoTimeNightModeManager;
            Context context = appCompatDelegateImplAutoTimeNightModeManager.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            RelativeLayout root = itemMasterDataBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = itemMasterDataBinding;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            abortCapture abortcapture = new abortCapture();
            char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
            abortcapture.b = 4;
            while (abortcapture.b < cArrB.length) {
                int i3 = $11 + 35;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                int i5 = abortcapture.b;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64839 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 1356, 37 - TextUtils.lastIndexOf("", '0', 0), 894276454, false, $$e(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {abortcapture, abortcapture};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 47773), (Process.myPid() >> 22) + 468, TextUtils.indexOf("", "", 0, 0) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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
            }
            objArr[0] = new String(cArrB, 4, cArrB.length - 4);
            int i6 = $11 + 103;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(MaritalStatus maritalStatus) throws Throwable {
            long j;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 46401), 39 - ExpandableListView.getPackedPositionChild(0L), MotionEvent.axisFromString("") + 20, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            Object[] objArr = new Object[1];
            a(new char[]{47985, 47888, 35867, 7141, 46951, 14836, 28069, 34992, 22358, 43816, 31213, 42148, 25486, 40906, 21887, 45153, 32720, 29570, 8557, 20383, 2620, 24682, 15565, 23501, 9850, 21514}, ViewConfiguration.getFadingEdgeLength() >> 16, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(new char[]{41442, 41351, 2548, 19683, 12938, 41842, 15014, 4660, 19929, 11979, 12011, 15966, 30999, 6711, 571, 10944, 25939, 63091, 30330}, (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), objArr2);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
            long j2 = -1;
            long j3 = j2 ^ (-504522044529459100L);
            long elapsedCpuTime = ((((long) ((int) Process.getElapsedCpuTime())) ^ j2) | (-504522044529459100L)) ^ j2;
            long j4 = j2 ^ 2601779219271418087L;
            long j5 = (((long) (-1939)) * 2601779219271418087L) + (((long) 971) * (-504522044529459100L)) + (((long) (-970)) * (((j3 | 2601779219271418087L) ^ j2) | elapsedCpuTime)) + (((long) 1940) * ((j4 | (-504522044529459100L)) ^ j2)) + (((long) 970) * (elapsedCpuTime | ((j4 | j3) ^ j2)));
            int i3 = 0;
            while (true) {
                if (i3 == 10) {
                    Object[] objArr3 = new Object[1];
                    a(new char[]{63274, 63296, 7182, 40533, 10109, 53135, 59399, 32472, 6988, 15160, 64600, 21151, 12253, 3970, 53426, 17968, 13185, 58256, 42188, 47596}, Color.argb(0, 0, 0, 0), objArr3);
                    Class<?> cls2 = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    a(new char[]{34161, 34072, 43902, 55868, 36872, 29696, 44157, 50520, 26957, 35917, 47140, 59655, 23977, 47293, 38139, 64942, 16874, 21755, 57508, 619}, TextUtils.indexOf((CharSequence) "", '0') + 1, objArr4);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr5 = {-2041732252};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 46038), 1134 - Color.alpha(0), 17 - TextUtils.lastIndexOf("", '0', 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                        }
                        Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -1930652585, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), false};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cBlue = (char) Color.blue(0);
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1031;
                            int i4 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            byte b2 = $$a[7];
                            byte b3 = b2;
                            Object[] objArr7 = new Object[1];
                            c(b2, b3, b3, objArr7);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, maxKeyCode, i4, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Drawable.resolveOpacity(0, 0) + 45993), 1117 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 17), Boolean.TYPE});
                        }
                        Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6);
                        if (((int[]) objArr8[3])[0] == ((int[]) objArr8[1])[0]) {
                            break;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[0];
                        if (strArr != null) {
                            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
                            b = i5 % 128;
                            int i6 = i5 % 2;
                            for (String str : strArr) {
                                int i7 = b + 27;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                                int i8 = i7 % 2;
                                arrayList.add(str);
                            }
                        }
                        throw null;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37836 - TextUtils.getOffsetBefore("", 0)), 59 - (ViewConfiguration.getDoubleTapTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i9 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
                int i10 = 0;
                long j6 = jLongValue;
                while (true) {
                    int i11 = 0;
                    while (i11 != 8) {
                        i9 = (((((int) (j6 >> i11)) & 255) + (i9 << 6)) + (i9 << 16)) - i9;
                        i11++;
                        j5 = j5;
                    }
                    j = j5;
                    if (i10 != 0) {
                        break;
                    }
                    i10++;
                    j6 = j;
                    j5 = j6;
                }
                if (i9 == i2) {
                    break;
                }
                jLongValue -= 1024;
                i3++;
                int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
                b = i12 % 128;
                int i13 = i12 % 2;
                j5 = j;
            }
            final MaritalStatus maritalStatus2 = maritalStatus;
            Intrinsics.checkNotNullParameter(maritalStatus2, "");
            ItemMasterDataBinding itemMasterDataBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            final AppCompatDelegateImplAutoTimeNightModeManager appCompatDelegateImplAutoTimeNightModeManager = this.TuitionPaymentFragmentbindingInflater1;
            itemMasterDataBinding.tvName.setText(maritalStatus2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            if (maritalStatus2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                AppCompatImageView appCompatImageView = itemMasterDataBinding.imgSelected;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                appCompatImageView.setVisibility(0);
            } else {
                AppCompatImageView appCompatImageView2 = itemMasterDataBinding.imgSelected;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
                appCompatImageView2.setVisibility(4);
            }
            RelativeLayout root = itemMasterDataBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            RelativeLayout relativeLayout = root;
            Function1 function1 = new Function1() { // from class: setup
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AppCompatDelegateImplAutoTimeNightModeManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(appCompatDelegateImplAutoTimeNightModeManager, maritalStatus2, (View) obj);
                }
            };
            Intrinsics.checkNotNullParameter(relativeLayout, "");
            Intrinsics.checkNotNullParameter(function1, "");
            relativeLayout.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r4
  0x0024: PHI (r4v2 kotlin.jvm.functions.Function1) = (r4v1 kotlin.jvm.functions.Function1), (r4v7 kotlin.jvm.functions.Function1) binds: [B:8:0x0022, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
        public static /* synthetic */ Unit b(AppCompatDelegateImplAutoTimeNightModeManager appCompatDelegateImplAutoTimeNightModeManager, MaritalStatus maritalStatus, View view) {
            Function1 function1;
            int i = 2 % 2;
            int i2 = b + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            if (i3 == 0) {
                function1 = appCompatDelegateImplAutoTimeNightModeManager.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i4 = 69 / 0;
                if (function1 != null) {
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
                    b = i5 % 128;
                    int i6 = i5 % 2;
                    function1.invoke(maritalStatus);
                    int i7 = b + 87;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                    int i8 = i7 % 2;
                }
            } else {
                function1 = appCompatDelegateImplAutoTimeNightModeManager.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (function1 != null) {
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
                    b = i9 % 128;
                    int i10 = i9 % 2;
                    function1.invoke(maritalStatus);
                    int i11 = b + 87;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                    int i12 = i11 % 2;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(byte r5, int r6, short r7) {
            /*
                byte[] r0 = AppCompatDelegateImplAutoTimeNightModeManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$c
                int r5 = r5 * 4
                int r1 = r5 + 1
                int r6 = r6 * 3
                int r6 = 107 - r6
                int r7 = r7 * 4
                int r7 = 3 - r7
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L16
                r4 = r5
                r3 = r2
                goto L28
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                int r7 = r7 + 1
                r1[r3] = r4
                if (r3 != r5) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L24:
                int r3 = r3 + 1
                r4 = r0[r7]
            L28:
                int r4 = -r4
                int r6 = r6 + r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: AppCompatDelegateImplAutoTimeNightModeManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$e(byte, int, short):java.lang.String");
        }
    }
}
