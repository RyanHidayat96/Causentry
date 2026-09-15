package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemMasterDataBinding;
import com.bpjstku.domain.asik.model.ReligionStatus;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0014B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"LAppCompatDelegateImplListMenuDecorView;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/domain/asik/model/ReligionStatus;", "LAppCompatDelegateImplListMenuDecorView$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/view/ViewGroup;)LAppCompatDelegateImplListMenuDecorView$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "b", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppCompatDelegateImplListMenuDecorView extends setVirtualCameraRotationDegrees<ReligionStatus, TuitionPaymentFragmentspecialinlinedviewModeldefault3> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1<ReligionStatus, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {25, 31, 20, 1};
    private static final int $$d = 8;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {68, 83, 49, -116};
    private static final int $$b = 177;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -2180831403888321272L;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            byte[] r0 = defpackage.AppCompatDelegateImplListMenuDecorView.$$a
            int r9 = r9 * 2
            int r9 = 1 - r9
            int r8 = r8 * 3
            int r8 = r8 + 98
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2d
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = r7 + r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AppCompatDelegateImplListMenuDecorView.e(int, short, short, java.lang.Object[]):void");
    }

    public static final /* synthetic */ Context TuitionPaymentFragmentspecialinlinedviewModeldefault2(AppCompatDelegateImplListMenuDecorView appCompatDelegateImplListMenuDecorView) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Context context = appCompatDelegateImplListMenuDecorView.asBinder;
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        int i5 = TuitionPaymentFragmentbindingInflater1 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return context;
        }
        throw null;
    }

    public static final /* synthetic */ Function1 b(AppCompatDelegateImplListMenuDecorView appCompatDelegateImplListMenuDecorView) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        Function1<ReligionStatus, Unit> function1 = appCompatDelegateImplListMenuDecorView.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return function1;
        }
        throw null;
    }

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewGroup);
        int i5 = TuitionPaymentFragmentbindingInflater1 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        throw null;
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewGroup);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public /* synthetic */ AppCompatDelegateImplListMenuDecorView(Context context, List list, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            list = new ArrayList();
            int i2 = TuitionPaymentFragmentbindingInflater1 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 4) != 0) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 12 / 0;
            }
            int i6 = 2 % 2;
            function1 = null;
        }
        this(context, list, function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private AppCompatDelegateImplListMenuDecorView(Context context, List<ReligionStatus> list, Function1<? super ReligionStatus, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2(ViewGroup viewGroup) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemMasterDataBinding itemMasterDataBindingInflate = ItemMasterDataBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemMasterDataBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, itemMasterDataBindingInflate, null, null);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return tuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends VirtualCameraInfo<ReligionStatus> {
        private /* synthetic */ AppCompatDelegateImplListMenuDecorView TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final ItemMasterDataBinding b;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(AppCompatDelegateImplListMenuDecorView appCompatDelegateImplListMenuDecorView, ItemMasterDataBinding itemMasterDataBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) throws Throwable {
            Intrinsics.checkNotNullParameter(itemMasterDataBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = appCompatDelegateImplListMenuDecorView;
            Context contextTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AppCompatDelegateImplListMenuDecorView.TuitionPaymentFragmentspecialinlinedviewModeldefault2(appCompatDelegateImplListMenuDecorView);
            Intrinsics.checkNotNullExpressionValue(contextTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
            RelativeLayout root = itemMasterDataBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(contextTuitionPaymentFragmentspecialinlinedviewModeldefault2, root, null, null);
            this.b = itemMasterDataBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ReligionStatus religionStatus) throws Throwable {
            final ReligionStatus religionStatus2 = religionStatus;
            Intrinsics.checkNotNullParameter(religionStatus2, "");
            ItemMasterDataBinding itemMasterDataBinding = this.b;
            final AppCompatDelegateImplListMenuDecorView appCompatDelegateImplListMenuDecorView = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            itemMasterDataBinding.tvName.setText(religionStatus2.TuitionPaymentFragmentbindingInflater1);
            if (religionStatus2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
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
            Function1 function1 = new Function1() { // from class: onInterceptTouchEvent
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AppCompatDelegateImplListMenuDecorView.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(appCompatDelegateImplListMenuDecorView, religionStatus2, (View) obj);
                }
            };
            Intrinsics.checkNotNullParameter(relativeLayout, "");
            Intrinsics.checkNotNullParameter(function1, "");
            relativeLayout.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(AppCompatDelegateImplListMenuDecorView appCompatDelegateImplListMenuDecorView, ReligionStatus religionStatus, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1B = AppCompatDelegateImplListMenuDecorView.b(appCompatDelegateImplListMenuDecorView);
            if (function1B != null) {
                function1B.invoke(religionStatus);
            }
            return Unit.INSTANCE;
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $11 + 117;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) (64839 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1356;
                    int iResolveOpacity = 38 - Drawable.resolveOpacity(0, 0);
                    byte b = (byte) (-$$c[3]);
                    byte b2 = (byte) (b + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, minimumFlingVelocity, iResolveOpacity, 894276454, false, $$e(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.rgb(0, 0, 0) + 16824989), (ViewConfiguration.getTapTimeout() >> 16) + 468, 13 - View.resolveSizeAndState(0, 0, 0), 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i6 = $11 + 3;
        $10 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x042a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0439  */
    /* JADX WARN: Code duplicated, block: B:106:0x0469  */
    /* JADX WARN: Code duplicated, block: B:109:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:54:0x0298 A[Catch: Exception -> 0x043c, TRY_LEAVE, TryCatch #4 {Exception -> 0x043c, blocks: (B:52:0x026e, B:54:0x0298, B:64:0x0344, B:66:0x034c, B:69:0x0373, B:72:0x0384, B:81:0x03d6, B:90:0x0411, B:91:0x0417, B:92:0x0418, B:94:0x041c, B:95:0x041f, B:99:0x0423, B:100:0x0429, B:74:0x0398, B:77:0x03b7, B:78:0x03c3, B:79:0x03c8, B:55:0x02a2, B:57:0x02c2, B:63:0x0336), top: B:126:0x026e, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0313  */
    /* JADX WARN: Code duplicated, block: B:61:0x031b  */
    /* JADX WARN: Code duplicated, block: B:66:0x034c A[Catch: Exception -> 0x043c, TRY_LEAVE, TryCatch #4 {Exception -> 0x043c, blocks: (B:52:0x026e, B:54:0x0298, B:64:0x0344, B:66:0x034c, B:69:0x0373, B:72:0x0384, B:81:0x03d6, B:90:0x0411, B:91:0x0417, B:92:0x0418, B:94:0x041c, B:95:0x041f, B:99:0x0423, B:100:0x0429, B:74:0x0398, B:77:0x03b7, B:78:0x03c3, B:79:0x03c8, B:55:0x02a2, B:57:0x02c2, B:63:0x0336), top: B:126:0x026e, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0373 A[Catch: Exception -> 0x043c, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x043c, blocks: (B:52:0x026e, B:54:0x0298, B:64:0x0344, B:66:0x034c, B:69:0x0373, B:72:0x0384, B:81:0x03d6, B:90:0x0411, B:91:0x0417, B:92:0x0418, B:94:0x041c, B:95:0x041f, B:99:0x0423, B:100:0x0429, B:74:0x0398, B:77:0x03b7, B:78:0x03c3, B:79:0x03c8, B:55:0x02a2, B:57:0x02c2, B:63:0x0336), top: B:126:0x026e, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0379  */
    /* JADX WARN: Code duplicated, block: B:72:0x0384 A[Catch: Exception -> 0x043c, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x043c, blocks: (B:52:0x026e, B:54:0x0298, B:64:0x0344, B:66:0x034c, B:69:0x0373, B:72:0x0384, B:81:0x03d6, B:90:0x0411, B:91:0x0417, B:92:0x0418, B:94:0x041c, B:95:0x041f, B:99:0x0423, B:100:0x0429, B:74:0x0398, B:77:0x03b7, B:78:0x03c3, B:79:0x03c8, B:55:0x02a2, B:57:0x02c2, B:63:0x0336), top: B:126:0x026e, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x03b7 A[Catch: all -> 0x0410, TRY_ENTER, TryCatch #1 {all -> 0x0410, blocks: (B:74:0x0398, B:77:0x03b7, B:78:0x03c3, B:79:0x03c8), top: B:120:0x0398, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x03c8 A[Catch: all -> 0x0410, TRY_LEAVE, TryCatch #1 {all -> 0x0410, blocks: (B:74:0x0398, B:77:0x03b7, B:78:0x03c3, B:79:0x03c8), top: B:120:0x0398, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0418 A[Catch: Exception -> 0x043c, TRY_LEAVE, TryCatch #4 {Exception -> 0x043c, blocks: (B:52:0x026e, B:54:0x0298, B:64:0x0344, B:66:0x034c, B:69:0x0373, B:72:0x0384, B:81:0x03d6, B:90:0x0411, B:91:0x0417, B:92:0x0418, B:94:0x041c, B:95:0x041f, B:99:0x0423, B:100:0x0429, B:74:0x0398, B:77:0x03b7, B:78:0x03c3, B:79:0x03c8, B:55:0x02a2, B:57:0x02c2, B:63:0x0336), top: B:126:0x026e, inners: #1, #3 }] */
    public static Object[] b(int i, int i2) throws Throwable {
        int i3;
        int i4;
        String str;
        Object[] objArr;
        String[] strArr;
        int i5;
        File file;
        int i6;
        FileReader fileReader;
        BufferedReader bufferedReader;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean zEquals;
        File file2;
        int i13;
        FileReader fileReader2;
        BufferedReader bufferedReader2;
        char[] cArr;
        int iMyPid;
        int i14;
        String str2;
        boolean zEquals2;
        int i15;
        int i16;
        int i17 = 2 % 2;
        try {
            String[] strArr2 = new String[2];
            Object[] objArr2 = new Object[1];
            c(new char[]{38344, 38305, 62941, 2922, 17088, 27703, 18450, 26098, 55187, 10497, 20093, 18968, 11997, 12396, 20477, 43981, 3214, 4664, 28051, 62729, 58204, 27883, 32810}, TextUtils.indexOf((CharSequence) "", '0', 0) + 1, objArr2);
            strArr2[0] = (String) objArr2[0];
            int i18 = TuitionPaymentFragmentbindingInflater1;
            int i19 = (i18 ^ 11) + ((i18 & 11) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
            int i20 = i19 % 2;
            Object[] objArr3 = new Object[1];
            c(new char[]{3965, 3850, 5386, 24527, 41477, 8520, 53932, 12666, 14157, 32137, 818, 1910, 46178, 53417, 7026, 59049, 38455, 62182, 14617, 47203, 31224, 35897}, (-2) - (~(-TextUtils.lastIndexOf("", '0', 0))), objArr3);
            strArr2[1] = (String) objArr3[0];
            int i21 = TuitionPaymentFragmentbindingInflater1 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
            int i22 = i21 % 2;
            int i23 = 0;
            while (true) {
                if (i23 >= 2) {
                    i3 = i;
                    break;
                }
                String str3 = strArr2[i23];
                Object[] objArr4 = new Object[1];
                c(new char[]{27883, 27786, 42074, 24605, 4954, 64586, 45372, 3749, 34325, 16981, 56926, 55922, 55284, 25079, 9415, 15244, 62886, 17326, 1748, 25959}, ExpandableListView.getPackedPositionGroup(0L), objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                if (((Boolean) cls.getMethod(str3, new Class[0]).invoke(cls, null)).booleanValue()) {
                    i3 = (i & (-2)) | ((~i) & 1);
                    break;
                }
                i23 = ((i23 & 42) + (i23 | 42)) - 41;
            }
        } catch (Exception unused) {
            i3 = i ^ 2;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char size = (char) (2419 - View.MeasureSpec.getSize(0));
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 2845;
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 5;
                byte b = (byte) (-1);
                byte b2 = (byte) (b + 1);
                Object[] objArr5 = new Object[1];
                e(b, b2, b2, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, pressedStateDuration, scrollDefaultDelay, -501222268, false, (String) objArr5[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j = -719050261;
            long j2 = i;
            long j3 = -1;
            long j4 = jLongValue ^ j3;
            long j5 = 676;
            long j6 = j2 ^ j3;
            long j7 = (((long) 677) * j) + (((long) (-675)) * jLongValue) + (((long) (-676)) * (j | j2 | j4)) + ((((j4 | j) ^ j3) | ((j6 | j) ^ j3)) * j5) + (j5 * ((((j ^ j3) | j4) ^ j3) | ((j4 | j6) ^ j3) | ((j2 | (jLongValue | j)) ^ j3))) + ((long) (-440136425));
            int i24 = ~(2117433940 | i);
            int i25 = ~i;
            int i26 = ((int) (j7 >> 32)) & (395244050 + (((-2083535361) | i) * (-50)) + ((i24 | (~((-1343228417) | i25))) * 50) + (((~((-2083535361) | i25)) | (~(774205524 | i25)) | 1343228416) * 50));
            int iMyUid = Process.myUid();
            int i27 = i26 | (((int) j7) & (2005432269 + (((~((-409652724) | iMyUid)) | 275434594) * 104) + ((~((~iMyUid) | (-1712661005))) * (-104)) + ((iMyUid | (-1846879134)) * 104)));
            int i28 = i ^ 10;
            int i29 = TuitionPaymentFragmentbindingInflater1 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i29 % 128;
            if (i29 % 2 == 0) {
                i4 = (i27 | (-i27)) * 115;
            } else {
                int i30 = (i27 & (-2)) | ((~i27) & 1);
                int i31 = -i30;
                i4 = ((i30 & i31) | (i30 ^ i31)) >> 31;
            }
            int i32 = (i4 & i) | (i28 & (~i4));
            int i33 = (~(i & i3)) & (i | i3);
            int i34 = -i33;
            int i35 = ((i33 & i34) | (i33 ^ i34)) >> 31;
            int i36 = i32 & (~i35);
            int i37 = i3 & i35;
            int i38 = (i36 ^ i37) | (i37 & i36);
            try {
                try {
                    Object[] objArr6 = new Object[1];
                    c(new char[]{12355, 12396, 30996, 29939, 52745, 52438, 60884, 6742, 23364, 22183, 61087, 60143, 35677, 48306, 12406, 2938, 43279, 40698, 4656, 21992, 18116, 57448, 65438, 30647, 25786, 49772, 55627, 36963, 628, 10136, 47897, 45568, 8249, 2317, 25815, 56531, 56823, 27512, 18110, 65175, 64346, 19596, 8295, 7007}, '0' - AndroidCharacter.getMirror('0'), objArr6);
                    File file3 = new File((String) objArr6[0]);
                    int i39 = TuitionPaymentFragmentbindingInflater1;
                    int i40 = (i39 & 5) + (i39 | 5);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i40 % 128;
                    if (i40 % 2 == 0) {
                        file3.canRead();
                        throw null;
                    }
                    if (!(!file3.canRead())) {
                        FileReader fileReader3 = new FileReader(file3);
                        BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                        try {
                            String line = bufferedReader3.readLine();
                            Object[] objArr7 = new Object[1];
                            c(new char[]{56859, 56949, 21963, 45345, 58058, 57229, 38182}, Color.green(0), objArr7);
                            if (line.equals((String) objArr7[0])) {
                                fileReader3.close();
                                bufferedReader3.close();
                            } else {
                                int i41 = TuitionPaymentFragmentbindingInflater1 + 33;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i41 % 128;
                                if (i41 % 2 == 0) {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                                fileReader3.close();
                                bufferedReader3.close();
                                int i42 = TuitionPaymentFragmentbindingInflater1;
                                int i43 = ((i42 | 75) << 1) - (i42 ^ 75);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i43 % 128;
                                int i44 = i43 % 2;
                                str = line;
                            }
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
                            int i45 = ((iLastIndexOf | 1) << 1) - (iLastIndexOf ^ 1);
                            Object[] objArr8 = new Object[1];
                            c(new char[]{7358, 7313, 52937, 28737, 31191, 55655, 49509, 7919, 60638, 21000, 64313, 65346, 42941, 2854, 13512, 7837, 34276, 10543, 5774, 16476, 27249, 22527, 64295, 25114, 18503, 30130, 56830, 34303, 11915, 36871, 49058, 42938, 3290, 48836, 24687}, i45, objArr8);
                            file = new File((String) objArr8[0]);
                            if (!(!file.canRead())) {
                                fileReader = new FileReader(file);
                                bufferedReader = new BufferedReader(fileReader);
                                try {
                                    String line2 = bufferedReader.readLine();
                                    char[] cArr2 = {30530, 30579, 41775, 54166, 27720};
                                    i7 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                    int i46 = TuitionPaymentFragmentbindingInflater1;
                                    int i47 = (i46 & 27) + (i46 | 27);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i47 % 128;
                                    int i48 = i47 % 2;
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    int i49 = i7 * 659;
                                    int i50 = (i49 & (-657)) + (i49 | (-657));
                                    int i51 = ~i7;
                                    int i52 = ~((i51 & 1) | (i51 ^ 1));
                                    i8 = ((-2) ^ i7) | ((-2) & i7);
                                    int i53 = ~i8;
                                    int i54 = (i52 & i53) | (i52 ^ i53);
                                    int i55 = TuitionPaymentFragmentbindingInflater1;
                                    int i56 = (i55 ^ 43) + ((i55 & 43) << 1);
                                    int i57 = i56 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i57;
                                    int i58 = i56 % 2;
                                    int i59 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & i7) | (i7 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                    int i60 = ~i59;
                                    int i61 = -(-((-658) * ((i54 ^ i60) | (i54 & i60))));
                                    i9 = (i50 ^ i61) + ((i61 & i50) << 1);
                                    i10 = i57 + 17;
                                    TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        i12 = i9 << ((~(i7 | (-2))) * 658);
                                        i11 = ~i8;
                                    } else {
                                        int i62 = ((~((-2) | i7)) * 658) + i9;
                                        i11 = ~((i7 & (-2)) | ((-2) ^ i7));
                                        i12 = i62;
                                    }
                                    int i63 = ~i59;
                                    int i64 = -(-(658 * ((i63 & i11) | (i11 ^ i63))));
                                    int i65 = (i12 & i64) + (i12 | i64);
                                    Object[] objArr9 = new Object[1];
                                    c(cArr2, i65, objArr9);
                                    zEquals = line2.equals((String) objArr9[0]);
                                    fileReader.close();
                                    bufferedReader.close();
                                    if (zEquals) {
                                        Object[] objArr10 = new Object[1];
                                        c(new char[]{64991, 65008, 26672, 49415, 57133, 30237, 8264, 44962, 19040, 58195, 21588, 20516, 18113, 44438, 34178, 45489, 25747, 36830, 42948, 61219, 35672, 61772, 19050, 52604, 43302, 54088, 27839, 10920, 53224, 14012, 3834, 2252, 60854, 6200, 53551, 26136, 4216, 31324, 62289, 17472}, View.resolveSize(0, 0), objArr10);
                                        file2 = new File((String) objArr10[0]);
                                        i13 = TuitionPaymentFragmentbindingInflater1 + 97;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                                        if (i13 % 2 != 0) {
                                            file2.canRead();
                                            Object obj2 = null;
                                            obj2.hashCode();
                                            throw null;
                                        }
                                        if (file2.canRead()) {
                                            fileReader2 = new FileReader(file2);
                                            bufferedReader2 = new BufferedReader(fileReader2);
                                            int i66 = TuitionPaymentFragmentbindingInflater1 + 115;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i66 % 128;
                                            int i67 = i66 % 2;
                                            try {
                                                String line3 = bufferedReader2.readLine();
                                                cArr = new char[]{30530, 30579, 41775, 54166, 27720};
                                                iMyPid = Process.myPid();
                                                int i68 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                i14 = (i68 ^ 99) + ((i68 & 99) << 1);
                                                TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                                                if (i14 % 2 != 0) {
                                                    Object[] objArr11 = new Object[1];
                                                    c(cArr, iMyPid / 22, objArr11);
                                                    str2 = (String) objArr11[0];
                                                } else {
                                                    Object[] objArr12 = new Object[1];
                                                    c(cArr, iMyPid >> 22, objArr12);
                                                    str2 = (String) objArr12[0];
                                                }
                                                zEquals2 = line3.equals(str2);
                                                fileReader2.close();
                                                bufferedReader2.close();
                                                if (!zEquals2 && str != null) {
                                                    objArr = new Object[2];
                                                    objArr[0] = new int[1];
                                                    int i69 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
                                                    TuitionPaymentFragmentbindingInflater1 = i69 % 128;
                                                    if (i69 % 2 != 0) {
                                                        i16 = (i & (-28)) | (i25 & 27);
                                                        i15 = 1;
                                                    } else {
                                                        i15 = 1;
                                                        i16 = (~(i & 20)) & (i | 20);
                                                    }
                                                    String[] strArr3 = new String[i15];
                                                    strArr3[0] = str;
                                                    ((int[]) objArr[0])[0] = i16;
                                                    objArr[i15] = strArr3;
                                                }
                                            } catch (Throwable th) {
                                                fileReader2.close();
                                                bufferedReader2.close();
                                                throw th;
                                            }
                                        } else {
                                            int i70 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
                                            TuitionPaymentFragmentbindingInflater1 = i70 % 128;
                                            int i71 = i70 % 2;
                                        }
                                    }
                                    int i72 = ((int[]) objArr[0])[0];
                                    int i73 = (~(i & i38)) & (i | i38);
                                    int i74 = (i73 | (-i73)) >> 31;
                                    int i75 = (~i74) & i72;
                                    int i76 = i74 & i38;
                                    int i77 = (i76 & i75) | (i75 ^ i76);
                                    String[] strArr4 = (String[]) objArr[1];
                                    Object[] objArr13 = new Object[2];
                                    int i78 = ((~i72) & i) | (i72 & i25);
                                    int i79 = -i78;
                                    int i80 = (((i78 & i79) | (i78 ^ i79)) >> 31) & 1;
                                    int i81 = -i80;
                                    int i82 = (~(((i81 & i80) | (i80 ^ i81)) >> 31)) & 1;
                                    objArr13[i80] = null;
                                    int i83 = TuitionPaymentFragmentbindingInflater1 + 53;
                                    int i84 = i83 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i84;
                                    int i85 = i83 % 2;
                                    objArr13[i82] = strArr4;
                                    String[] strArr5 = (String[]) objArr13[0];
                                    int i86 = i ^ i77;
                                    int i87 = -i86;
                                    int i88 = ((i86 & i87) | (i86 ^ i87)) >> 31;
                                    int i89 = (i84 ^ 107) + ((i84 & 107) << 1);
                                    TuitionPaymentFragmentbindingInflater1 = i89 % 128;
                                    int i90 = i89 % 2;
                                    int i91 = i88 & 16;
                                    Object[] objArr14 = {new int[]{i}, new int[1], new int[]{i77}, strArr5};
                                    int i92 = 736158978 + (((~((-67635683) | i)) | (~(i25 | 498007551))) * 497) + (((~((-470682099) | i25)) | 403046416 | (~(498007551 | i))) * 497);
                                    int i93 = i84 + 5;
                                    TuitionPaymentFragmentbindingInflater1 = i93 % 128;
                                    int i94 = i93 % 2;
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    int i95 = i91 * (-574);
                                    int i96 = i92 * (-574);
                                    int i97 = ((i95 | i96) << 1) - (i95 ^ i96);
                                    int i98 = ~i91;
                                    int i99 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i100 = ~((i98 ^ i99) | (i98 & i99));
                                    int i101 = ~i92;
                                    int i102 = (i101 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i101 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                    int i103 = ~i102;
                                    int i104 = (i97 - (~(-(-(((i100 & i103) | (i100 ^ i103)) * 1150))))) - 1;
                                    int i105 = ~i102;
                                    int i106 = ~((i92 & i99) | (i99 ^ i92));
                                    int i107 = (i104 - (~(-(-(((i106 & i105) | (i105 ^ i106)) * (-575)))))) - 1;
                                    int i108 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault3 | i98);
                                    int i109 = ~((i99 ^ i91) | (i99 & i91));
                                    int i110 = ((i108 & i109) | (i108 ^ i109)) * 575;
                                    int i111 = (i107 ^ i110) + ((i110 & i107) << 1);
                                    int i112 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i113 = (i112 & 41) + (i112 | 41);
                                    TuitionPaymentFragmentbindingInflater1 = i113 % 128;
                                    int i114 = i113 % 2;
                                    int i115 = (i111 * (-519)) + (521 * i2);
                                    int i116 = ~i111;
                                    int i117 = ~i2;
                                    int i118 = (i116 ^ i117) | (i116 & i117);
                                    int i119 = ~((i118 & i25) | (i118 ^ i25));
                                    int i120 = ~((i2 ^ i) | (i2 & i));
                                    int i121 = ((i119 & i120) | (i119 ^ i120)) * 520;
                                    int i122 = (i115 ^ i121) + ((i115 & i121) << 1);
                                    int i123 = ~i2;
                                    int i124 = ~i;
                                    int i125 = ~((i123 & i124) | (i123 ^ i124));
                                    int i126 = i | i111;
                                    int i127 = ~i126;
                                    int i128 = ((i125 & i127) | (i125 ^ i127)) * (-1040);
                                    int i129 = (i122 ^ i128) + ((i128 & i122) << 1);
                                    int i130 = (~(i116 | i124)) | (~((i117 ^ i111) | (i111 & i117)));
                                    int i131 = ~i126;
                                    int i132 = ((i130 & i131) | (i130 ^ i131)) * 520;
                                    int i133 = (i129 ^ i132) + ((i132 & i129) << 1);
                                    int i134 = i133 << 13;
                                    int i135 = (i134 | i133) & (~(i133 & i134));
                                    int i136 = i135 >>> 17;
                                    int i137 = ((~i135) & i136) | ((~i136) & i135);
                                    ((int[]) objArr14[1])[0] = i137 ^ (i137 << 5);
                                    return objArr14;
                                } catch (Throwable th2) {
                                    fileReader.close();
                                    bufferedReader.close();
                                    throw th2;
                                }
                            }
                            int i138 = TuitionPaymentFragmentbindingInflater1;
                            i6 = (i138 & 109) + (i138 | 109);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                            if (i6 % 2 == 0) {
                                int i139 = 2 / 5;
                            }
                            objArr = new Object[2];
                            objArr[0] = new int[]{i};
                            strArr = new String[0];
                            int i140 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i141 = ((i140 | 63) << 1) - (i140 ^ 63);
                            TuitionPaymentFragmentbindingInflater1 = i141 % 128;
                            int i142 = i141 % 2;
                            i5 = ((i140 | 11) << 1) - (i140 ^ 11);
                            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                            if (i5 % 2 == 0) {
                                objArr[1] = strArr;
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            objArr[1] = strArr;
                            int i710 = ((int[]) objArr[0])[0];
                            int i711 = (~(i & i38)) & (i | i38);
                            int i712 = (i711 | (-i711)) >> 31;
                            int i713 = (~i712) & i710;
                            int i714 = i712 & i38;
                            int i715 = (i714 & i713) | (i713 ^ i714);
                            String[] strArr6 = (String[]) objArr[1];
                            Object[] objArr15 = new Object[2];
                            int i716 = ((~i710) & i) | (i710 & i25);
                            int i717 = -i716;
                            int i810 = (((i716 & i717) | (i716 ^ i717)) >> 31) & 1;
                            int i811 = -i810;
                            int i812 = (~(((i811 & i810) | (i810 ^ i811)) >> 31)) & 1;
                            objArr15[i810] = null;
                            int i813 = TuitionPaymentFragmentbindingInflater1 + 53;
                            int i814 = i813 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i814;
                            int i815 = i813 % 2;
                            objArr15[i812] = strArr6;
                            String[] strArr7 = (String[]) objArr15[0];
                            int i816 = i ^ i715;
                            int i817 = -i816;
                            int i818 = ((i816 & i817) | (i816 ^ i817)) >> 31;
                            int i819 = (i814 ^ 107) + ((i814 & 107) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i819 % 128;
                            int i910 = i819 % 2;
                            int i911 = i818 & 16;
                            Object[] objArr16 = {new int[]{i}, new int[1], new int[]{i715}, strArr7};
                            int i912 = 736158978 + (((~((-67635683) | i)) | (~(i25 | 498007551))) * 497) + (((~((-470682099) | i25)) | 403046416 | (~(498007551 | i))) * 497);
                            int i913 = i814 + 5;
                            TuitionPaymentFragmentbindingInflater1 = i913 % 128;
                            int i914 = i913 % 2;
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i915 = i911 * (-574);
                            int i916 = i912 * (-574);
                            int i917 = ((i915 | i916) << 1) - (i915 ^ i916);
                            int i918 = ~i911;
                            int i919 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                            int i1010 = ~((i918 ^ i919) | (i918 & i919));
                            int i1011 = ~i912;
                            int i1012 = (i1011 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i1011 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                            int i1013 = ~i1012;
                            int i1014 = (i917 - (~(-(-(((i1010 & i1013) | (i1010 ^ i1013)) * 1150))))) - 1;
                            int i1015 = ~i1012;
                            int i1016 = ~((i912 & i919) | (i919 ^ i912));
                            int i1017 = (i1014 - (~(-(-(((i1016 & i1015) | (i1015 ^ i1016)) * (-575)))))) - 1;
                            int i1018 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault4 | i918);
                            int i1019 = ~((i919 ^ i911) | (i919 & i911));
                            int i1110 = ((i1018 & i1019) | (i1018 ^ i1019)) * 575;
                            int i1111 = (i1017 ^ i1110) + ((i1110 & i1017) << 1);
                            int i1112 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i1113 = (i1112 & 41) + (i1112 | 41);
                            TuitionPaymentFragmentbindingInflater1 = i1113 % 128;
                            int i1114 = i1113 % 2;
                            int i1115 = (i1111 * (-519)) + (521 * i2);
                            int i1116 = ~i1111;
                            int i1117 = ~i2;
                            int i1118 = (i1116 ^ i1117) | (i1116 & i1117);
                            int i1119 = ~((i1118 & i25) | (i1118 ^ i25));
                            int i1210 = ~((i2 ^ i) | (i2 & i));
                            int i1211 = ((i1119 & i1210) | (i1119 ^ i1210)) * 520;
                            int i1212 = (i1115 ^ i1211) + ((i1115 & i1211) << 1);
                            int i1213 = ~i2;
                            int i1214 = ~i;
                            int i1215 = ~((i1213 & i1214) | (i1213 ^ i1214));
                            int i1216 = i | i1111;
                            int i1217 = ~i1216;
                            int i1218 = ((i1215 & i1217) | (i1215 ^ i1217)) * (-1040);
                            int i1219 = (i1212 ^ i1218) + ((i1218 & i1212) << 1);
                            int i1310 = (~(i1116 | i1214)) | (~((i1117 ^ i1111) | (i1111 & i1117)));
                            int i1311 = ~i1216;
                            int i1312 = ((i1310 & i1311) | (i1310 ^ i1311)) * 520;
                            int i1313 = (i1219 ^ i1312) + ((i1312 & i1219) << 1);
                            int i1314 = i1313 << 13;
                            int i1315 = (i1314 | i1313) & (~(i1313 & i1314));
                            int i1316 = i1315 >>> 17;
                            int i1317 = ((~i1315) & i1316) | ((~i1316) & i1315);
                            ((int[]) objArr16[1])[0] = i1317 ^ (i1317 << 5);
                            return objArr16;
                        } catch (Throwable th3) {
                            fileReader3.close();
                            bufferedReader3.close();
                            throw th3;
                        }
                    }
                    int i143 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
                    TuitionPaymentFragmentbindingInflater1 = i143 % 128;
                    int i144 = i143 % 2;
                } catch (Exception unused2) {
                }
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0);
                int i410 = ((iLastIndexOf2 | 1) << 1) - (iLastIndexOf2 ^ 1);
                Object[] objArr17 = new Object[1];
                c(new char[]{7358, 7313, 52937, 28737, 31191, 55655, 49509, 7919, 60638, 21000, 64313, 65346, 42941, 2854, 13512, 7837, 34276, 10543, 5774, 16476, 27249, 22527, 64295, 25114, 18503, 30130, 56830, 34303, 11915, 36871, 49058, 42938, 3290, 48836, 24687}, i410, objArr17);
                file = new File((String) objArr17[0]);
                if (!(!file.canRead())) {
                    fileReader = new FileReader(file);
                    bufferedReader = new BufferedReader(fileReader);
                    String line4 = bufferedReader.readLine();
                    char[] cArr3 = {30530, 30579, 41775, 54166, 27720};
                    i7 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int i411 = TuitionPaymentFragmentbindingInflater1;
                    int i412 = (i411 & 27) + (i411 | 27);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i412 % 128;
                    int i413 = i412 % 2;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i414 = i7 * 659;
                    int i510 = (i414 & (-657)) + (i414 | (-657));
                    int i511 = ~i7;
                    int i512 = ~((i511 & 1) | (i511 ^ 1));
                    i8 = ((-2) ^ i7) | ((-2) & i7);
                    int i513 = ~i8;
                    int i514 = (i512 & i513) | (i512 ^ i513);
                    int i515 = TuitionPaymentFragmentbindingInflater1;
                    int i516 = (i515 ^ 43) + ((i515 & 43) << 1);
                    int i517 = i516 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i517;
                    int i518 = i516 % 2;
                    int i519 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & i7) | (i7 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                    int i610 = ~i519;
                    int i611 = -(-((-658) * ((i514 ^ i610) | (i514 & i610))));
                    i9 = (i510 ^ i611) + ((i611 & i510) << 1);
                    i10 = i517 + 17;
                    TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                    if (i10 % 2 != 0) {
                        i12 = i9 << ((~(i7 | (-2))) * 658);
                        i11 = ~i8;
                    } else {
                        int i612 = ((~((-2) | i7)) * 658) + i9;
                        i11 = ~((i7 & (-2)) | ((-2) ^ i7));
                        i12 = i612;
                    }
                    int i613 = ~i519;
                    int i614 = -(-(658 * ((i613 & i11) | (i11 ^ i613))));
                    int i615 = (i12 & i614) + (i12 | i614);
                    Object[] objArr18 = new Object[1];
                    c(cArr3, i615, objArr18);
                    zEquals = line4.equals((String) objArr18[0]);
                    fileReader.close();
                    bufferedReader.close();
                    if (zEquals) {
                        Object[] objArr19 = new Object[1];
                        c(new char[]{64991, 65008, 26672, 49415, 57133, 30237, 8264, 44962, 19040, 58195, 21588, 20516, 18113, 44438, 34178, 45489, 25747, 36830, 42948, 61219, 35672, 61772, 19050, 52604, 43302, 54088, 27839, 10920, 53224, 14012, 3834, 2252, 60854, 6200, 53551, 26136, 4216, 31324, 62289, 17472}, View.resolveSize(0, 0), objArr19);
                        file2 = new File((String) objArr19[0]);
                        i13 = TuitionPaymentFragmentbindingInflater1 + 97;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                        if (i13 % 2 != 0) {
                            file2.canRead();
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }
                        if (file2.canRead()) {
                            int i718 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
                            TuitionPaymentFragmentbindingInflater1 = i718 % 128;
                            int i719 = i718 % 2;
                        } else {
                            fileReader2 = new FileReader(file2);
                            bufferedReader2 = new BufferedReader(fileReader2);
                            int i616 = TuitionPaymentFragmentbindingInflater1 + 115;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i616 % 128;
                            int i617 = i616 % 2;
                            String line5 = bufferedReader2.readLine();
                            cArr = new char[]{30530, 30579, 41775, 54166, 27720};
                            iMyPid = Process.myPid();
                            int i618 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            i14 = (i618 ^ 99) + ((i618 & 99) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                            if (i14 % 2 != 0) {
                                Object[] objArr110 = new Object[1];
                                c(cArr, iMyPid / 22, objArr110);
                                str2 = (String) objArr110[0];
                            } else {
                                Object[] objArr111 = new Object[1];
                                c(cArr, iMyPid >> 22, objArr111);
                                str2 = (String) objArr111[0];
                            }
                            zEquals2 = line5.equals(str2);
                            fileReader2.close();
                            bufferedReader2.close();
                            if (!zEquals2) {
                            }
                        }
                    }
                    int i7110 = ((int[]) objArr[0])[0];
                    int i7111 = (~(i & i38)) & (i | i38);
                    int i7112 = (i7111 | (-i7111)) >> 31;
                    int i7113 = (~i7112) & i7110;
                    int i7114 = i7112 & i38;
                    int i7115 = (i7114 & i7113) | (i7113 ^ i7114);
                    String[] strArr8 = (String[]) objArr[1];
                    Object[] objArr112 = new Object[2];
                    int i7116 = ((~i7110) & i) | (i7110 & i25);
                    int i7117 = -i7116;
                    int i8110 = (((i7116 & i7117) | (i7116 ^ i7117)) >> 31) & 1;
                    int i8111 = -i8110;
                    int i8112 = (~(((i8111 & i8110) | (i8110 ^ i8111)) >> 31)) & 1;
                    objArr112[i8110] = null;
                    int i8113 = TuitionPaymentFragmentbindingInflater1 + 53;
                    int i8114 = i8113 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8114;
                    int i8115 = i8113 % 2;
                    objArr112[i8112] = strArr8;
                    String[] strArr9 = (String[]) objArr112[0];
                    int i8116 = i ^ i7115;
                    int i8117 = -i8116;
                    int i8118 = ((i8116 & i8117) | (i8116 ^ i8117)) >> 31;
                    int i8119 = (i8114 ^ 107) + ((i8114 & 107) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i8119 % 128;
                    int i9110 = i8119 % 2;
                    int i9111 = i8118 & 16;
                    Object[] objArr113 = {new int[]{i}, new int[1], new int[]{i7115}, strArr9};
                    int i9112 = 736158978 + (((~((-67635683) | i)) | (~(i25 | 498007551))) * 497) + (((~((-470682099) | i25)) | 403046416 | (~(498007551 | i))) * 497);
                    int i9113 = i8114 + 5;
                    TuitionPaymentFragmentbindingInflater1 = i9113 % 128;
                    int i9114 = i9113 % 2;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i9115 = i9111 * (-574);
                    int i9116 = i9112 * (-574);
                    int i9117 = ((i9115 | i9116) << 1) - (i9115 ^ i9116);
                    int i9118 = ~i9111;
                    int i9119 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                    int i10110 = ~((i9118 ^ i9119) | (i9118 & i9119));
                    int i10111 = ~i9112;
                    int i10112 = (i10111 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i10111 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                    int i10113 = ~i10112;
                    int i10114 = (i9117 - (~(-(-(((i10110 & i10113) | (i10110 ^ i10113)) * 1150))))) - 1;
                    int i10115 = ~i10112;
                    int i10116 = ~((i9112 & i9119) | (i9119 ^ i9112));
                    int i10117 = (i10114 - (~(-(-(((i10116 & i10115) | (i10115 ^ i10116)) * (-575)))))) - 1;
                    int i10118 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault6 | i9118);
                    int i10119 = ~((i9119 ^ i9111) | (i9119 & i9111));
                    int i11110 = ((i10118 & i10119) | (i10118 ^ i10119)) * 575;
                    int i11111 = (i10117 ^ i11110) + ((i11110 & i10117) << 1);
                    int i11112 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i11113 = (i11112 & 41) + (i11112 | 41);
                    TuitionPaymentFragmentbindingInflater1 = i11113 % 128;
                    int i11114 = i11113 % 2;
                    int i11115 = (i11111 * (-519)) + (521 * i2);
                    int i11116 = ~i11111;
                    int i11117 = ~i2;
                    int i11118 = (i11116 ^ i11117) | (i11116 & i11117);
                    int i11119 = ~((i11118 & i25) | (i11118 ^ i25));
                    int i12110 = ~((i2 ^ i) | (i2 & i));
                    int i12111 = ((i11119 & i12110) | (i11119 ^ i12110)) * 520;
                    int i12112 = (i11115 ^ i12111) + ((i11115 & i12111) << 1);
                    int i12113 = ~i2;
                    int i12114 = ~i;
                    int i12115 = ~((i12113 & i12114) | (i12113 ^ i12114));
                    int i12116 = i | i11111;
                    int i12117 = ~i12116;
                    int i12118 = ((i12115 & i12117) | (i12115 ^ i12117)) * (-1040);
                    int i12119 = (i12112 ^ i12118) + ((i12118 & i12112) << 1);
                    int i1318 = (~(i11116 | i12114)) | (~((i11117 ^ i11111) | (i11111 & i11117)));
                    int i1319 = ~i12116;
                    int i13110 = ((i1318 & i1319) | (i1318 ^ i1319)) * 520;
                    int i13111 = (i12119 ^ i13110) + ((i13110 & i12119) << 1);
                    int i13112 = i13111 << 13;
                    int i13113 = (i13112 | i13111) & (~(i13111 & i13112));
                    int i13114 = i13113 >>> 17;
                    int i13115 = ((~i13113) & i13114) | ((~i13114) & i13113);
                    ((int[]) objArr113[1])[0] = i13115 ^ (i13115 << 5);
                    return objArr113;
                }
                int i1320 = TuitionPaymentFragmentbindingInflater1;
                i6 = (i1320 & 109) + (i1320 | 109);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i1321 = 2 / 5;
                }
            } catch (Exception unused3) {
            }
            str = null;
            objArr = new Object[2];
            objArr[0] = new int[]{i};
            strArr = new String[0];
            int i145 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i146 = ((i145 | 63) << 1) - (i145 ^ 63);
            TuitionPaymentFragmentbindingInflater1 = i146 % 128;
            int i147 = i146 % 2;
            i5 = ((i145 | 11) << 1) - (i145 ^ 11);
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            if (i5 % 2 == 0) {
                objArr[1] = strArr;
                Object obj5 = null;
                obj5.hashCode();
                throw null;
            }
            objArr[1] = strArr;
            int i7118 = ((int[]) objArr[0])[0];
            int i7119 = (~(i & i38)) & (i | i38);
            int i71110 = (i7119 | (-i7119)) >> 31;
            int i71111 = (~i71110) & i7118;
            int i71112 = i71110 & i38;
            int i71113 = (i71112 & i71111) | (i71111 ^ i71112);
            String[] strArr10 = (String[]) objArr[1];
            Object[] objArr114 = new Object[2];
            int i71114 = ((~i7118) & i) | (i7118 & i25);
            int i71115 = -i71114;
            int i81110 = (((i71114 & i71115) | (i71114 ^ i71115)) >> 31) & 1;
            int i81111 = -i81110;
            int i81112 = (~(((i81111 & i81110) | (i81110 ^ i81111)) >> 31)) & 1;
            objArr114[i81110] = null;
            int i81113 = TuitionPaymentFragmentbindingInflater1 + 53;
            int i81114 = i81113 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i81114;
            int i81115 = i81113 % 2;
            objArr114[i81112] = strArr10;
            String[] strArr11 = (String[]) objArr114[0];
            int i81116 = i ^ i71113;
            int i81117 = -i81116;
            int i81118 = ((i81116 & i81117) | (i81116 ^ i81117)) >> 31;
            int i81119 = (i81114 ^ 107) + ((i81114 & 107) << 1);
            TuitionPaymentFragmentbindingInflater1 = i81119 % 128;
            int i91110 = i81119 % 2;
            int i91111 = i81118 & 16;
            Object[] objArr115 = {new int[]{i}, new int[1], new int[]{i71113}, strArr11};
            int i91112 = 736158978 + (((~((-67635683) | i)) | (~(i25 | 498007551))) * 497) + (((~((-470682099) | i25)) | 403046416 | (~(498007551 | i))) * 497);
            int i91113 = i81114 + 5;
            TuitionPaymentFragmentbindingInflater1 = i91113 % 128;
            int i91114 = i91113 % 2;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i91115 = i91111 * (-574);
            int i91116 = i91112 * (-574);
            int i91117 = ((i91115 | i91116) << 1) - (i91115 ^ i91116);
            int i91118 = ~i91111;
            int i91119 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            int i101110 = ~((i91118 ^ i91119) | (i91118 & i91119));
            int i101111 = ~i91112;
            int i101112 = (i101111 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i101111 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7);
            int i101113 = ~i101112;
            int i101114 = (i91117 - (~(-(-(((i101110 & i101113) | (i101110 ^ i101113)) * 1150))))) - 1;
            int i101115 = ~i101112;
            int i101116 = ~((i91112 & i91119) | (i91119 ^ i91112));
            int i101117 = (i101114 - (~(-(-(((i101116 & i101115) | (i101115 ^ i101116)) * (-575)))))) - 1;
            int i101118 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault7 | i91118);
            int i101119 = ~((i91119 ^ i91111) | (i91119 & i91111));
            int i111110 = ((i101118 & i101119) | (i101118 ^ i101119)) * 575;
            int i111111 = (i101117 ^ i111110) + ((i111110 & i101117) << 1);
            int i111112 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i111113 = (i111112 & 41) + (i111112 | 41);
            TuitionPaymentFragmentbindingInflater1 = i111113 % 128;
            int i111114 = i111113 % 2;
            int i111115 = (i111111 * (-519)) + (521 * i2);
            int i111116 = ~i111111;
            int i111117 = ~i2;
            int i111118 = (i111116 ^ i111117) | (i111116 & i111117);
            int i111119 = ~((i111118 & i25) | (i111118 ^ i25));
            int i121110 = ~((i2 ^ i) | (i2 & i));
            int i121111 = ((i111119 & i121110) | (i111119 ^ i121110)) * 520;
            int i121112 = (i111115 ^ i121111) + ((i111115 & i121111) << 1);
            int i121113 = ~i2;
            int i121114 = ~i;
            int i121115 = ~((i121113 & i121114) | (i121113 ^ i121114));
            int i121116 = i | i111111;
            int i121117 = ~i121116;
            int i121118 = ((i121115 & i121117) | (i121115 ^ i121117)) * (-1040);
            int i121119 = (i121112 ^ i121118) + ((i121118 & i121112) << 1);
            int i13116 = (~(i111116 | i121114)) | (~((i111117 ^ i111111) | (i111111 & i111117)));
            int i13117 = ~i121116;
            int i13118 = ((i13116 & i13117) | (i13116 ^ i13117)) * 520;
            int i13119 = (i121119 ^ i13118) + ((i13118 & i121119) << 1);
            int i131110 = i13119 << 13;
            int i131111 = (i131110 | i13119) & (~(i13119 & i131110));
            int i131112 = i131111 >>> 17;
            int i131113 = ((~i131111) & i131112) | ((~i131112) & i131111);
            ((int[]) objArr115[1])[0] = i131113 ^ (i131113 << 5);
            return objArr115;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
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
    private static java.lang.String $$e(int r5, short r6, byte r7) {
        /*
            int r5 = r5 + 4
            byte[] r0 = defpackage.AppCompatDelegateImplListMenuDecorView.$$c
            int r6 = r6 * 4
            int r1 = 1 - r6
            int r7 = r7 * 4
            int r7 = r7 + 107
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r5 = r5 + 1
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r0[r5]
        L28:
            int r7 = r7 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AppCompatDelegateImplListMenuDecorView.$$e(int, short, byte):java.lang.String");
    }
}
