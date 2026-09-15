package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
public final class asPersistentRecording extends OutputResults<ViewPager2, RecyclerView.Adapter<?>> {
    private static final byte[] $$c = {39, 27, 2, 54};
    private static final int $$f = 123;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {48, -119, -71, 110, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 60, -4, -4, -5, 8, -24, 20, -16, 7, -13, 3, -4, -18, 4, -8, -1, -1, -58, 73, -3, -17, -3, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -70};
    private static final int $$e = 142;
    private static final byte[] $$a = {87, 51, -85, 78, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 45;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {60056, 60079, 60043, 60058, 60083, 60059, 60088, 60049, 60090, 59749, 59747, 60054, 60048, 60055, 60051, 60052, 59748, 60060, 60053, 60062, 60073, 60041, 60072, 60040, 60050, 60061, 60117, 59746, 60034, 59744, 59745, 59751, 60047, 60045, 60046, 60063};
    private static char b = 57191;

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = 107 - r6
            int r7 = r7 * 15
            int r0 = r7 + 38
            byte[] r1 = defpackage.asPersistentRecording.$$a
            int r8 = r8 * 2
            int r8 = 84 - r8
            byte[] r0 = new byte[r0]
            int r7 = r7 + 37
            r2 = 0
            if (r1 != 0) goto L19
            r8 = r6
            r3 = r7
            r4 = r2
            goto L30
        L19:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1d:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2c:
            int r8 = r8 + 1
            r3 = r1[r8]
        L30:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asPersistentRecording.a(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.asPersistentRecording.$$d
            int r7 = r7 * 15
            int r7 = 99 - r7
            int r1 = 54 - r6
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            int r6 = 53 - r6
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2d
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r8 = r8 + r7
            int r7 = r8 + 3
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asPersistentRecording.d(int, byte, int, java.lang.Object[]):void");
    }

    @Override // defpackage.OutputResults
    public final /* synthetic */ BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(ViewPager2 viewPager2, RecyclerView.Adapter<?> adapter) {
        int i = 2 % 2;
        ViewPager2 viewPager3 = viewPager2;
        Intrinsics.checkNotNullParameter(viewPager3, "");
        Intrinsics.checkNotNullParameter(adapter, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewPager3);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return tuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends RecyclerView.AdapterDataObserver {
        private /* synthetic */ Function0<Unit> b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function0<Unit> function0) {
            this.b = function0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onChanged() {
            super.onChanged();
            this.b.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2) {
            super.onItemRangeChanged(i, i2);
            this.b.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            super.onItemRangeChanged(i, i2, obj);
            this.b.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i, int i2) {
            super.onItemRangeInserted(i, i2);
            this.b.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i, int i2) {
            super.onItemRangeRemoved(i, i2);
            this.b.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i, int i2, int i3) {
            super.onItemRangeMoved(i, i2, i3);
            this.b.invoke();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1 {
        private ViewPager2.OnPageChangeCallback TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ ViewPager2 b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(ViewPager2 viewPager2) {
            this.b = viewPager2;
        }

        @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            ViewPager2 viewPager2 = this.b;
            Intrinsics.checkNotNullParameter(viewPager2, "");
            RecyclerView.Adapter adapter = viewPager2.getAdapter();
            return adapter != null && adapter.getItemCount() > 0;
        }

        @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.b.getCurrentItem();
        }

        @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1
        public final boolean TuitionPaymentFragmentbindingInflater1() {
            RecyclerView.Adapter adapter;
            ViewPager2 viewPager2 = this.b;
            return (viewPager2 == null || (adapter = viewPager2.getAdapter()) == null || adapter.getItemCount() != 0) ? false : true;
        }

        @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            RecyclerView.Adapter adapter = this.b.getAdapter();
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
            this.b.setCurrentItem(i, true);
        }

        @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1
        public final void b() {
            ViewPager2.OnPageChangeCallback onPageChangeCallback = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (onPageChangeCallback != null) {
                this.b.unregisterOnPageChangeCallback(onPageChangeCallback);
            }
        }

        /* JADX INFO: renamed from: asPersistentRecording$TuitionPaymentFragmentspecialinlinedviewModeldefault2$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: collision with other inner class name */
        public static final class C0137TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends ViewPager2.OnPageChangeCallback {
            private /* synthetic */ MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder TuitionPaymentFragmentbindingInflater1;

            C0137TuitionPaymentFragmentspecialinlinedviewModeldefault2(MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder mediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder) {
                this.TuitionPaymentFragmentbindingInflater1 = mediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder;
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public final void onPageScrolled(int i, float f, int i2) {
                super.onPageScrolled(i, f, i2);
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, f);
            }
        }

        @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentbindingInflater1(MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder mediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder) {
            Intrinsics.checkNotNullParameter(mediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder, "");
            C0137TuitionPaymentFragmentspecialinlinedviewModeldefault2 c0137TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new C0137TuitionPaymentFragmentspecialinlinedviewModeldefault2(mediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = c0137TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            ViewPager2 viewPager2 = this.b;
            Intrinsics.checkNotNull(c0137TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            viewPager2.registerOnPageChangeCallback(c0137TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0198  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:55:0x01fb A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:20:0x0088, B:22:0x0099, B:23:0x00c9, B:53:0x01b0, B:55:0x01fb, B:56:0x0273, B:60:0x0288, B:62:0x02c0, B:63:0x0322), top: B:84:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0286  */
    /* JADX WARN: Code duplicated, block: B:62:0x02c0 A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:20:0x0088, B:22:0x0099, B:23:0x00c9, B:53:0x01b0, B:55:0x01fb, B:56:0x0273, B:60:0x0288, B:62:0x02c0, B:63:0x0322), top: B:84:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0343  */
    /* JADX WARN: Code duplicated, block: B:67:0x034a  */
    /* JADX WARN: Code duplicated, block: B:68:0x037c  */
    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
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
                int i7 = $10 + 87;
                $11 = i7 % 128;
                if (i7 % i3 == 0) {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getOffsetAfter("", 0), 2268 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 33, -1927765101, false, $$g(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(obj, objArr3)).charValue();
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
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.MeasureSpec.getSize(0), 2267 - Drawable.resolveOpacity(0, 0), 33 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1927765101, false, $$g(b5, b6, (byte) (b6 - 3)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
                        i6++;
                        i3 = 2;
                        i5 = 1770390596;
                        obj = null;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr5 = {Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            long j = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                byte b7 = (byte) 0;
                byte b8 = (byte) (b7 + 3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), 2268 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), Color.blue(0) + 33, -1927765101, false, $$g(b7, b8, (byte) (b8 - 3)), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr5)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i8 = $10 + 69;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    i2 = i + 27;
                    cArr4[i2] = (char) (cArr[i2] >> b2);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b2);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    int i9 = $11 + 53;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        } else {
                            objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char c = (char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 49266);
                                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 3261;
                                int i10 = 30 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                byte b9 = $$c[2];
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, edgeSlop, i10, -127612708, false, $$g((byte) 0, b9, (byte) (b9 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b10 = (byte) 0;
                                    byte b11 = b10;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 22878), View.MeasureSpec.getSize(0) + 594, 18 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1570859318, false, $$g(b10, b11, b11), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                                int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                            } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i12 = $11 + 5;
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
                    } else {
                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        } else {
                            objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char c2 = (char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 49266);
                                int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 3261;
                                int i18 = 30 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                byte b12 = $$c[2];
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, edgeSlop2, i18, -127612708, false, $$g((byte) 0, b12, (byte) (b12 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                Object[] objArr7 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b13 = (byte) 0;
                                    byte b14 = b13;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 22878), View.MeasureSpec.getSize(0) + 594, 18 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1570859318, false, $$g(b13, b14, b14), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr7)).intValue();
                                int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                            } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i110 = $11 + 5;
                                $10 = i110 % 128;
                                int i111 = i110 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i112 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i113 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i112];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i113];
                            } else {
                                int i114 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i115 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i114];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i115];
                            }
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    j = 0;
                }
            }
            for (int i20 = 0; i20 < i; i20++) {
                cArr4[i20] = (char) (cArr4[i20] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    @Override // defpackage.OutputResults
    public final /* bridge */ /* synthetic */ RecyclerView.Adapter<?> TuitionPaymentFragmentspecialinlinedviewModeldefault3(ViewPager2 viewPager2) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
            int iMyPid = 2267 - (Process.myPid() >> 22);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 34;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[40], bArr[5], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, iMyPid, iLastIndexOf, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{0, 21, '!', 23, '\f', 27, ' ', 29, 17, 21, 28, 20, 29, 22, 31, 20, 6, 7, 14, 16, 6, 18}, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 30), TextUtils.lastIndexOf("", '0', 0, 0) + 23, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{25, 19, 4, 3, 18, 20, ' ', 23, 21, 1, 14, 31, 29, 6, 13891}, (byte) (68 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), View.MeasureSpec.getMode(0) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i2 = 2268 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int i3 = 33 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte[] bArr2 = $$a;
            byte b2 = bArr2[5];
            Object[] objArr5 = new Object[1];
            a(b2, b2, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration, i2, i3, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                int size = 2267 - View.MeasureSpec.getSize(0);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 34;
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                a(b3, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, size, iIndexOf, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr7[0])[0];
            int i7 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = ~((-277086209) | iIdentityHashCode);
            int i9 = ~iIdentityHashCode;
            int i10 = (-178194277) + ((i8 | (~((-84041731) | i9))) * 920) + (((~((-447585378) | i9)) | 277086208) * 920) + (((~(iIdentityHashCode | (-84041731))) | (~((-277086209) | i9)) | (~((-170499170) | iIdentityHashCode))) * 920) + 1619991900;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
            c = 3;
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{0, 21, '!', 23, '\f', 27, ' ', 29, 4, 3, '\b', ' ', 6, 2, 30, 26, 30, 27, Typography.quote, 26, 2, '\r', 22, 20, 5, '!'}, (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 27), (ViewConfiguration.getTouchSlop() >> 8) + 26, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{4, 30, 13871, 13871, 20, 19, 2, 14, 13873, 13873, '\f', 25, 1, 4, 30, 26, '\f', 21}, (byte) ((-16777145) - Color.rgb(0, 0, 0)), 18 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                int i14 = i13 % 2;
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                    int i16 = i15 % 2;
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
                    int i18 = i17 % 2;
                }
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{'\t', 1, 3, '\t', 25, 14, 0, 21, 14, 29, 28, Typography.quote, 20, '#', 23, 7}, (byte) (37 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 16 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{29, 30, 20, 19, 30, 26, Typography.quote, 26, 5, 4, 20, 17, '\t', '\f', 31, 23}, (byte) (118 - TextUtils.lastIndexOf("", '0', 0)), 16 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1619991900};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[50];
                byte b6 = (byte) (b5 + 1);
                Object[] objArr13 = new Object[1];
                d(b6, b6, b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = (byte) (-bArr3[50]);
                Object[] objArr14 = new Object[1];
                d(b7, b7, (byte) 52, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i19 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2266;
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 33;
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr16 = new Object[1];
                        a(b8, b9, b9, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(minimumFlingVelocity, i19, scrollDefaultDelay, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{0, 21, '!', 23, '\f', 27, ' ', 29, 17, 21, 28, 20, 29, 22, 31, 20, 6, 7, 14, 16, 6, 18}, (byte) ('M' - AndroidCharacter.getMirror('0')), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{25, 19, 4, 3, 18, 20, ' ', 23, 21, 1, 14, 31, 29, 6, 13891}, (byte) (67 - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getEdgeSlop() >> 16) + 15, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "");
                            int packedPositionType = 2267 - ExpandableListView.getPackedPositionType(0L);
                            int i20 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33;
                            byte[] bArr4 = $$a;
                            byte b10 = bArr4[5];
                            Object[] objArr19 = new Object[1];
                            a(b10, b10, bArr4[7], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, packedPositionType, i20, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c3 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                            int i21 = 2268 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int iLastIndexOf2 = 32 - TextUtils.lastIndexOf("", '0');
                            byte[] bArr5 = $$a;
                            Object[] objArr20 = new Object[1];
                            a(bArr5[40], bArr5[5], bArr5[7], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, i21, iLastIndexOf2, -887667012, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i22 = ((int[]) objArr[c])[0];
        int i23 = ((int[]) objArr[0])[0];
        if (i23 == i22) {
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[0])[0];
            int i26 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int i27 = ~System.identityHashCode(this);
            int i28 = i24 + 1032112521 + (((-94522371) | i27) * 494) + (((~(i27 | 709996625)) | (-800324676)) * 494);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr21[2])[0] = i30 ^ (i30 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                int i31 = 0;
                while (i31 < strArr3.length) {
                    int i32 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i32 % 128;
                    int i33 = i32 % 2;
                    arrayList.add(strArr3[i31]);
                    i31++;
                    int i34 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i34 % 128;
                    int i35 = i34 % 2;
                }
            }
            Toast.makeText((Context) null, i23 / (((i23 - 1) * i23) % 2), 0).show();
            Object[] objArr22 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i36 = ((int[]) objArr[2])[0];
            int i37 = ((int[]) objArr[0])[0];
            int i38 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i39 = ~iIdentityHashCode2;
            int i40 = i36 + 616626131 + (((~(i39 | 404149667)) | (~((-404563649) | i39)) | 598592) * 464) + (((-403965057) | iIdentityHashCode2) * (-464)) + (((~(iIdentityHashCode2 | 404149667)) | 598592) * 464);
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr22[2])[0] = i42 ^ (i42 << 5);
        }
        ViewPager2 viewPager3 = viewPager2;
        Intrinsics.checkNotNullParameter(viewPager3, "");
        return viewPager3.getAdapter();
    }

    @Override // defpackage.OutputResults
    public final /* synthetic */ void b(ViewPager2 viewPager2, RecyclerView.Adapter<?> adapter, Function0 function0) {
        int i = 2 % 2;
        RecyclerView.Adapter<?> adapter2 = adapter;
        Intrinsics.checkNotNullParameter(viewPager2, "");
        Intrinsics.checkNotNullParameter(adapter2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        adapter2.registerAdapterDataObserver(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(function0));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, short r8) {
        /*
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r7 = 116 - r7
            int r8 = r8 * 3
            int r0 = r8 + 1
            byte[] r1 = defpackage.asPersistentRecording.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asPersistentRecording.$$g(short, int, short):java.lang.String");
    }
}
