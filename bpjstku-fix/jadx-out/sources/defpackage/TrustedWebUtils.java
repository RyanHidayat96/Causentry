package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemLoadMoreBinding;
import com.bpjstku.databinding.ItemNewsBinding;
import com.bpjstku.domain.news.model.News;
import com.google.android.material.card.MaterialCardView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001:\u0001\u0019B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\"\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"LTrustedWebUtils;", "LaddCaptureRequestOptionsInternal;", "Lcom/bpjstku/domain/news/model/News;", "Lr8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "", "getItemViewType", "(I)I", "getItemCount", "()I", "Landroid/view/ViewGroup;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/view/ViewGroup;I)Lr8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470;", "Landroid/content/Context;", "cancelAll", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentbindingInflater1", "b"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TrustedWebUtils extends addCaptureRequestOptionsInternal<News, r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470<News>> {
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final Function1<News, Unit> TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {102, -96, -78, -55};
    private static final int $$f = 74;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {14, 70, 6, -35, -11, 60, -73, 8, -1, -7, -22, 6, -18, 12, -24, 69, -64, -10, -11, 10, -18, -1, 8, -16, 57, -61, -20, 2, 6, -22, 6, -11, -4, -10, 64, -29, -52, 2, 6, -22, 6, -11, -4, -10, 74, -72, -3, -20, 28, -23, -19, -5, 5, -11, -4, 21, -32, -1, 1, -14, -38, 7, -16, 6, -11, -4, 25, -22, -29, 7, 3, -14, -11, 41, -49, 12, -11, -11, 3, -14, -11, -4, -2, 6, -3, -11, 3, -16, -2, -10, -3, -2, -10, 4, -4, -23, 8, -1, -23, 37, -39, 6, -6, -12, 3, -6, -6, 0, -25, 4, -13, 60};
    private static final int $$e = 144;
    private static final byte[] $$a = {17, 104, 102, -28, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 94;
    private static int INotificationSideChannelStubProxy = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static char onTransact = 24579;
    private static char INotificationSideChannel = 15501;
    private static char cancel = 23383;
    private static char notify = 31454;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r6 = r6 * 52
            int r6 = r6 + 4
            int r7 = r7 * 52
            int r0 = r7 + 1
            byte[] r1 = defpackage.TrustedWebUtils.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r3 = r3 + r8
            int r6 = r6 + 1
            int r8 = r3 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.TrustedWebUtils.c(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 21
            int r8 = 105 - r8
            int r7 = r7 * 4
            int r0 = r7 + 53
            byte[] r1 = defpackage.TrustedWebUtils.$$d
            int r6 = r6 * 56
            int r6 = 59 - r6
            byte[] r0 = new byte[r0]
            int r7 = r7 + 52
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2f
        L18:
            r3 = r2
        L19:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r5
        L2f:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-5)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.TrustedWebUtils.f(int, short, short, java.lang.Object[]):void");
    }

    public static final /* synthetic */ Context TuitionPaymentFragmentspecialinlinedviewModeldefault2(TrustedWebUtils trustedWebUtils) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 85;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Context context = trustedWebUtils.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i3 != 0) {
            return context;
        }
        throw null;
    }

    public static final /* synthetic */ Function1 b(TrustedWebUtils trustedWebUtils) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 47;
        int i3 = i2 % 128;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        Function1<News, Unit> function1 = trustedWebUtils.TuitionPaymentFragmentbindingInflater1;
        int i5 = i3 + 43;
        INotificationSideChannelStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return function1;
    }

    public /* synthetic */ TrustedWebUtils(Context context, List list, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            list = new ArrayList();
            int i2 = 2 % 2;
        }
        if ((i & 4) != 0) {
            int i3 = RemoteActionCompatParcelizer + 85;
            int i4 = i3 % 128;
            INotificationSideChannelStubProxy = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 15;
            RemoteActionCompatParcelizer = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            function1 = null;
        }
        this(context, list, function1);
    }

    public final class b extends r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470<News> {
        private final ItemNewsBinding TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ TrustedWebUtils TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(TrustedWebUtils trustedWebUtils, Context context, ItemNewsBinding itemNewsBinding, addCaptureRequestOptionsInternal.b bVar, addCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(itemNewsBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = trustedWebUtils;
            MaterialCardView root = itemNewsBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentbindingInflater1 = itemNewsBinding;
        }

        @Override // defpackage.r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470
        public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(News news) {
            final News news2 = news;
            ItemNewsBinding itemNewsBinding = this.TuitionPaymentFragmentbindingInflater1;
            final TrustedWebUtils trustedWebUtils = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (news2 != null) {
                ImageView imageView = itemNewsBinding.imgNews;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                lambdacreateCameraSelectorById0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageView, TrustedWebUtils.TuitionPaymentFragmentspecialinlinedviewModeldefault2(trustedWebUtils), news2.TuitionPaymentFragmentbindingInflater1, R.drawable.ic_placeholder, R.drawable.ic_placeholder);
                itemNewsBinding.tvNewsDate.setText(setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(news2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "dd-MM-yyyy hh:mm:ss", "dd MMM yyyy"));
                itemNewsBinding.tvNewsTitle.setText(news2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                MaterialCardView root = itemNewsBinding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                MaterialCardView materialCardView = root;
                Function1 function1 = new Function1() { // from class: onPostMessageServiceDisconnected
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TrustedWebUtils.b.b(trustedWebUtils, news2, (View) obj);
                    }
                };
                Intrinsics.checkNotNullParameter(materialCardView, "");
                Intrinsics.checkNotNullParameter(function1, "");
                materialCardView.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
            }
        }

        public static /* synthetic */ Unit b(TrustedWebUtils trustedWebUtils, News news, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1B = TrustedWebUtils.b(trustedWebUtils);
            if (function1B != null) {
                function1B.invoke(news);
            }
            return Unit.INSTANCE;
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i3 = $10 + 71;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i5 = $10 + 83;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            char c2 = 1;
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i7 = 58224;
            int i8 = 0;
            while (i8 < 16) {
                int i9 = $10 + 101;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                char c3 = cArr3[c2];
                char c4 = cArr3[c];
                int i11 = i8;
                int i12 = (c4 + i7) ^ ((c4 << 4) + ((char) (((long) cancel) ^ 8611973335120459638L)));
                int i13 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(notify);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[c2] = Integer.valueOf(i12);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 47773);
                        int trimmedLength = 468 - TextUtils.getTrimmedLength("");
                        int mode = 13 - View.MeasureSpec.getMode(0);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode, trimmedLength, mode, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) onTransact) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(INotificationSideChannel)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - TextUtils.getCapsMode("", 0, 0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 468, 13 - View.MeasureSpec.getSize(0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8 = i11 + 1;
                    c2 = 1;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getOffsetBefore("", 0), 2324 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 45 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    @Override // defpackage.addCaptureRequestOptionsInternal, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        int i3 = INotificationSideChannelStubProxy + 107;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 37567);
            int i5 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 625;
            int touchSlop2 = 14 - (ViewConfiguration.getTouchSlop() >> 8);
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, b2, bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, i5, touchSlop2, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{6540, 52610, 45486, 56943, 27302, 39359, 22268, 9797, 55723, 51655, 37288, 46260, 51029, 62889, 11129, 59845, 17700, 5108, 4334, 30521, 52692, 37587, 47896, 4547}, 22 - Color.green(0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{42963, 20372, 53273, 42850, 48749, 13759, 26414, 7111, 61604, 46217, 56391, 20681, 36368, 457, 62667, 43584, 20916, 22462}, (ViewConfiguration.getLongPressTimeout() >> 16) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (37566 - TextUtils.lastIndexOf("", '0'));
            int jumpTapTimeout = 625 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int tapTimeout = 14 - (ViewConfiguration.getTapTimeout() >> 16);
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b3, bArr2[5], b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, jumpTapTimeout, tapTimeout, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (37567 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int iGreen = 625 - Color.green(0);
                int iLastIndexOf = 13 - TextUtils.lastIndexOf("", '0', 0, 0);
                byte[] bArr3 = $$a;
                byte b4 = bArr3[5];
                Object[] objArr6 = new Object[1];
                c(b4, b4, bArr3[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iGreen, iLastIndexOf, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i7};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i8 = ~startElapsedRealtime;
            int i9 = ((((-205861112) + ((137048576 | i8) * (-192))) + (((~((-864341497) | i8)) | 822348048) * (-384))) + (((~(startElapsedRealtime | 1001390072)) | ((~(i8 | (-41993449))) | (~((-822348049) | startElapsedRealtime)))) * DerHeader.TAG_CLASS_PRIVATE)) - 824631680;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
            objArr = new Object[]{iArr, new int[1], new int[]{i6}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{52699, 3660, 24059, 2040, 56838, 58766, 37578, 5623, 14176, 44766, 49974, 47904, 60582, 4457, 'Y', 42267, 54774, 55070, 49570, 23214, 26639, 19958, 54102, 23649, 32248, 3726, 46519, 49269}, 26 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{29972, 34443, 48375, 10882, 60244, 25543, 15997, 21104, 38969, 58797, 38857, 44647, 65443, 58361, 8093, 39373, 59805, 48777, 48725, 25782}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i12 = INotificationSideChannelStubProxy + 43;
                    RemoteActionCompatParcelizer = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 3 % 5;
                    }
                }
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{35116, 35410, 17762, 12283, 23536, 61978, 9993, 4595, 14635, 30671, 33321, 59371, 21172, 31128, 56189, 33430, 57289, 64364, 46145, 3217, 49555, 1596, 26528, 40332, 58453, 485, 14844, 11812, 4972, 18750, 18161, 48702, 17712, 40415, 35163, 40089, 28696, 49865, 34166, 22775, 7923, 54758, 24558, 60089, 58379, 57000, 30813, 51281, 5823, 8346, 1634, 5442, 31087, 31805, 57688, 29764, 37999, 25553, 3099, 21555, 49770, 45066, 7545, 43720, 31632, 4380}, 63 - ExpandableListView.getPackedPositionChild(0L), objArr10);
            String str = (String) objArr10[0];
            Object[] objArr11 = new Object[1];
            e(new char[]{52976, 63613, 43413, 46514, 48659, 51508, 47568, 25169, 48743, 42568, 20031, 698, 28167, 41922, 13650, 59898, 56004, 20712, 15422, 44238, 33896, 60633, 3445, 10772, 7740, 40764, 5384, 25357, 45014, 40638, 14567, 25540, 51491, 38867, 27213, 13116, 1376, 38320, 17442, 23865, 30792, 54318, 51660, 10414, 17481, 63689, 58439, 11070, 25440, 15584, 52066, 25821, 24873, 4543, 26372, 6667, 12422, 37084, 41944, 54425, 63738, 57227, 64149, 31409, 22950, 1721}, TextUtils.lastIndexOf("", '0') + 65, objArr11);
            String[] strArr2 = {str, (String) objArr11[0]};
            int i14 = RemoteActionCompatParcelizer + 61;
            INotificationSideChannelStubProxy = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr12 = {applicationContext, strArr2, Integer.valueOf(i), 17, -824631680};
                byte[] bArr4 = $$d;
                byte b5 = bArr4[58];
                Object[] objArr13 = new Object[1];
                f(b5, b5, bArr4[107], objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                byte b6 = bArr4[107];
                Object[] objArr14 = new Object[1];
                f(b6, b6, bArr4[58], objArr14);
                objArr = (Object[]) cls3.getMethod((String) objArr14[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                int i16 = ((int[]) objArr[0])[0];
                int i17 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char tapTimeout2 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 37567);
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 626;
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 14;
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[5];
                        Object[] objArr15 = new Object[1];
                        c(b7, b7, bArr5[7], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(tapTimeout2, modifierMetaStateMask, windowTouchSlop, -973632554, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        e(new char[]{6540, 52610, 45486, 56943, 27302, 39359, 22268, 9797, 55723, 51655, 37288, 46260, 51029, 62889, 11129, 59845, 17700, 5108, 4334, 30521, 52692, 37587, 47896, 4547}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22, objArr16);
                        Class<?> cls4 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        e(new char[]{42963, 20372, 53273, 42850, 48749, 13759, 26414, 7111, 61604, 46217, 56391, 20681, 36368, 457, 62667, 43584, 20916, 22462}, 16 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr17);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char size = (char) (37567 - View.MeasureSpec.getSize(0));
                            int i18 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 625;
                            int iIndexOf = 13 - TextUtils.indexOf((CharSequence) "", '0');
                            byte[] bArr6 = $$a;
                            byte b8 = bArr6[7];
                            Object[] objArr18 = new Object[1];
                            c(b8, bArr6[5], b8, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(size, i18, iIndexOf, -976899241, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char longPressTimeout = (char) (37567 - (ViewConfiguration.getLongPressTimeout() >> 16));
                            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 626;
                            int maximumDrawingCacheSize = 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            byte[] bArr7 = $$a;
                            byte b9 = bArr7[7];
                            Object[] objArr19 = new Object[1];
                            c(b9, b9, bArr7[5], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(longPressTimeout, iLastIndexOf2, maximumDrawingCacheSize, -477065106, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i19 = ((int[]) objArr[0])[0];
        int i20 = ((int[]) objArr[2])[0];
        if (i20 == i19) {
            int i21 = INotificationSideChannelStubProxy + 17;
            RemoteActionCompatParcelizer = i21 % 128;
            int i22 = i21 % 2;
            int i23 = ((int[]) objArr[1])[0];
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[0])[0];
            new int[1][0] = i24;
            new int[1][0] = i25;
            int i26 = ~i;
            int i27 = i23 + 1181574826 + (((~(i26 | 1686733152)) | (-1823180777) | (~((-557345) | i))) * 717) + (((~(i26 | (-557345))) | (-1823180777) | (~(1686733152 | i))) * 717);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            int[] iArr2 = {i29 ^ (i29 << 5)};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str2 : strArr3) {
                    arrayList.add(str2);
                }
            }
            int[] iArr3 = new int[i20];
            int i30 = i20 - 1;
            iArr3[i30] = 1;
            Toast.makeText((Context) null, iArr3[((i20 * i30) % 2) - 1], 1).show();
            int i31 = ((int[]) objArr[1])[0];
            int i32 = ((int[]) objArr[2])[0];
            int i33 = ((int[]) objArr[0])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr4 = {i32};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i34 = ~elapsedCpuTime;
            int i35 = i31 + 1993488912 + (((~(elapsedCpuTime | 752717683)) | (~((-752093458) | i34)) | (-1071644664)) * (-68)) + ((~((-318926981) | i34)) * (-68)) + (((~((-752717684) | i34)) | (-1071020438)) * 68);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr[1])[0] = i37 ^ (i37 << 5);
            Object[] objArr20 = {new int[]{i33}, new int[1], iArr4, strArr4};
        }
        return onCreateViewHolder(viewGroup, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private TrustedWebUtils(Context context, List<News> list, Function1<? super News, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = context;
        this.TuitionPaymentFragmentbindingInflater1 = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int p0) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 57;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            List<Data> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Intrinsics.checkNotNullExpressionValue(list, "");
            Object orNull = CollectionsKt.getOrNull(list, p0);
            int i3 = 32 / 0;
            if (orNull != null) {
                return 985213;
            }
        } else {
            List<Data> list2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Intrinsics.checkNotNullExpressionValue(list2, "");
            if (CollectionsKt.getOrNull(list2, p0) != null) {
                return 985213;
            }
        }
        int i4 = RemoteActionCompatParcelizer + 97;
        INotificationSideChannelStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return 981923;
    }

    @Override // defpackage.addCaptureRequestOptionsInternal, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 59;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        int size = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size();
        int i4 = INotificationSideChannelStubProxy + 83;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    @Override // defpackage.addCaptureRequestOptionsInternal
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470<News> onCreateViewHolder(ViewGroup p0, int p1) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        INotificationSideChannelStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == 985213) {
            Context context = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            ItemNewsBinding itemNewsBindingInflate = ItemNewsBinding.inflate(LayoutInflater.from(p0.getContext()), p0, false);
            Intrinsics.checkNotNullExpressionValue(itemNewsBindingInflate, "");
            addCaptureRequestOptionsInternal.b bVar = this.d;
            addCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.asBinder;
            return new b(this, context, itemNewsBindingInflate, null, null);
        }
        if (p1 == 981923) {
            Context context2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            ItemLoadMoreBinding itemLoadMoreBindingInflate = ItemLoadMoreBinding.inflate(LayoutInflater.from(p0.getContext()), p0, false);
            Intrinsics.checkNotNullExpressionValue(itemLoadMoreBindingInflate, "");
            addCaptureRequestOptionsInternal.b bVar2 = this.d;
            addCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = this.asBinder;
            addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            Boolean boolTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Intrinsics.checkNotNullExpressionValue(boolTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            boolean zBooleanValue = boolTuitionPaymentFragmentspecialinlinedviewModeldefault3.booleanValue();
            Integer num = this.b;
            Intrinsics.checkNotNullExpressionValue(num, "");
            int iIntValue = num.intValue();
            Integer num2 = this.TuitionPaymentFragmentbindingInflater1;
            Intrinsics.checkNotNullExpressionValue(num2, "");
            return new updateConfig(context2, itemLoadMoreBindingInflate, null, null, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2, zBooleanValue, iIntValue, num2.intValue());
        }
        Context context3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        ItemLoadMoreBinding itemLoadMoreBindingInflate2 = ItemLoadMoreBinding.inflate(LayoutInflater.from(p0.getContext()), p0, false);
        Intrinsics.checkNotNullExpressionValue(itemLoadMoreBindingInflate2, "");
        addCaptureRequestOptionsInternal.b bVar3 = this.d;
        addCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault5 = this.asBinder;
        addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        Boolean boolTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Intrinsics.checkNotNullExpressionValue(boolTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
        boolean zBooleanValue2 = boolTuitionPaymentFragmentspecialinlinedviewModeldefault4.booleanValue();
        Integer num3 = this.b;
        Intrinsics.checkNotNullExpressionValue(num3, "");
        int iIntValue2 = num3.intValue();
        Integer num4 = this.TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNullExpressionValue(num4, "");
        updateConfig updateconfig = new updateConfig(context3, itemLoadMoreBindingInflate2, null, null, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3, zBooleanValue2, iIntValue2, num4.intValue());
        int i3 = RemoteActionCompatParcelizer + 63;
        INotificationSideChannelStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return updateconfig;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, short r8, short r9) {
        /*
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r0 = defpackage.TrustedWebUtils.$$c
            int r7 = r7 * 4
            int r7 = r7 + 1
            int r9 = r9 * 3
            int r9 = 108 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r5 = r2
            r9 = r8
            goto L2b
        L17:
            r3 = r2
        L18:
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
            r8 = r3
            r3 = r6
        L2b:
            int r8 = r8 + r3
            int r9 = r9 + 1
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.TrustedWebUtils.$$g(short, short, short):java.lang.String");
    }
}
