package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.DataSetObserver;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class OutputOptionsOutputOptionsInternalBuilder extends OutputResults<ViewPager, PagerAdapter> {
    @Override // defpackage.OutputResults
    public final /* synthetic */ BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(ViewPager viewPager, PagerAdapter pagerAdapter) {
        ViewPager viewPager2 = viewPager;
        Intrinsics.checkNotNullParameter(viewPager2, "");
        Intrinsics.checkNotNullParameter(pagerAdapter, "");
        return new b(viewPager2);
    }

    @Override // defpackage.OutputResults
    public final /* synthetic */ PagerAdapter TuitionPaymentFragmentspecialinlinedviewModeldefault3(ViewPager viewPager) {
        ViewPager viewPager2 = viewPager;
        Intrinsics.checkNotNullParameter(viewPager2, "");
        return viewPager2.getAdapter();
    }

    @Override // defpackage.OutputResults
    public final /* synthetic */ void b(ViewPager viewPager, PagerAdapter pagerAdapter, Function0 function0) {
        PagerAdapter pagerAdapter2 = pagerAdapter;
        Intrinsics.checkNotNullParameter(viewPager, "");
        Intrinsics.checkNotNullParameter(pagerAdapter2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        pagerAdapter2.registerDataSetObserver(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(function0));
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends DataSetObserver {
        private /* synthetic */ Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function0<Unit> function0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function0;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            super.onChanged();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invoke();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b implements BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1 {
        private static short[] asInterface;
        private /* synthetic */ ViewPager TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private ViewPager.OnPageChangeListener b;
        private static final byte[] $$c = {51, -5, 77, 89};
        private static final int $$f = 238;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {63, 56, -36, -117, -4, 12, -2, -14, 18, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, 2, 0, -8, 1, 9, -5, 14, 0, 8, 1, 0, 8, -6, 2, 21, -10, -1, 21, -39, 37, -8, 4, 10, -5, 4, 4, -2, 23, -6, 11, -63, 15, 1, -60, 55, 17, -3, 12, 4, -6, 13, -68, 69, 5, -10, 17, -11, 12, 9, -16, 22, -8, 9, 2, -61, 74, 2, -8, 6, -59, 40, 21, 16, 5, -16, 13, -7, 16, -20, 17, 0, 23, -10, -1, 21, -51, 37, 20, -8, 16, -10, 14, 8, -82, 82, 0, -8, 1, 9, -5, 14, -69, 3, 72, 8, 1, 0, 8, -6, 2, -61, 72, 8, -1, -2, 1, 20, -77, 67, 4, 4, -2, 23, -6, 11, -77, 16, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, 2, 0, -8, 1, 9, -5, 14, 0, 8, 1, 0, 8, -6, 2, 21, -10, -1, 21, -39, 37, -8, 4, 10, -5, 4, 4, -2, 23, -6, 11, -62};
        private static final int $$e = 170;
        private static final byte[] $$a = {83, ByteCompanionObject.MIN_VALUE, -37, -48, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
        private static final int $$b = 139;
        private static int d = 0;
        private static int asBinder = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1225730500;
        private static int TuitionPaymentFragmentbindingInflater1 = -1934795589;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -2023051907;
        private static byte[] g = {95, 86, -86, 93, 119, -120, 86, -81, 95, -92, 120, 123, -27, 90, 31, -108, -91, -92, -93, 80, -88, 83, 84, -96, 92, -83, 80, 83, -92, 75, -74, -89, -86, 91, 87, -83, 95, 91, 29, -30, -19, 20, 10, -59, 27, 21, -19, 19, -21, 15, 60, 13, -96, 30, 17, 45, -44, -27, -28, -29, 16, -24, 19, 83, -14, 11, -8, 30, -13, -9, -16, -15, 13, 34, -64, 11, 4, -2, 13, -16, 31, 85, -123, 124, -116, 119, -85, -88, 74, 116, ByteCompanionObject.MIN_VALUE, 120, -77, 64, 102, -104, 122, 85, 70, -78, 107, -100, -78, 85, 94, -120, 66, 76, -78, 65, 78, 70, -68};

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r5, short r6, short r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 14
                int r5 = 98 - r5
                int r0 = 53 - r6
                int r7 = 92 - r7
                byte[] r1 = OutputOptionsOutputOptionsInternalBuilder.b.$$a
                byte[] r0 = new byte[r0]
                int r6 = 52 - r6
                r2 = 0
                if (r1 != 0) goto L15
                r4 = r5
                r5 = r6
                r3 = r2
                goto L29
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r5
                r0[r3] = r4
                int r7 = r7 + 1
                if (r3 != r6) goto L25
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L25:
                r4 = r1[r7]
                int r3 = r3 + 1
            L29:
                int r5 = r5 + r4
                int r5 = r5 + (-11)
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: OutputOptionsOutputOptionsInternalBuilder.b.a(int, short, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(int r5, byte r6, byte r7, java.lang.Object[] r8) {
            /*
                int r5 = 147 - r5
                int r7 = r7 * 3
                int r7 = r7 + 84
                byte[] r0 = OutputOptionsOutputOptionsInternalBuilder.b.$$d
                int r1 = 87 - r6
                byte[] r1 = new byte[r1]
                int r6 = 86 - r6
                r2 = 0
                if (r0 != 0) goto L15
                r4 = r7
                r3 = r2
                r7 = r6
                goto L27
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r6) goto L23
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L23:
                int r3 = r3 + 1
                r4 = r0[r5]
            L27:
                int r5 = r5 + 1
                int r7 = r7 + r4
                int r7 = r7 + (-3)
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: OutputOptionsOutputOptionsInternalBuilder.b.e(int, byte, byte, java.lang.Object[]):void");
        }

        b(ViewPager viewPager) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = viewPager;
        }

        /* JADX INFO: renamed from: OutputOptionsOutputOptionsInternalBuilder$b$b, reason: collision with other inner class name */
        public static final class C0005b implements ViewPager.OnPageChangeListener {
            private /* synthetic */ MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault1;

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrollStateChanged(int i) {
            }

            C0005b(MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder mediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder;
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrolled(int i, float f, int i2) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, f);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageSelected(int i) {
                ViewPortBuilder.asInterface();
                try {
                } finally {
                    ViewPortBuilder.d();
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:61:0x024a  */
        /* JADX WARN: Code duplicated, block: B:62:0x026e  */
        private static void c(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
            int i4;
            boolean z;
            int i5 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), KeyEvent.getDeadChar(0, 0) + 2267, 33 - View.MeasureSpec.getSize(0), 1387473586, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                boolean z2 = iIntValue == -1;
                long j = 0;
                if (!(!z2)) {
                    byte[] bArr = g;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i6 = 0;
                        while (i6 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                                int i7 = (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 3357;
                                int keyRepeatTimeout = 18 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                byte length2 = (byte) $$c.length;
                                byte b4 = (byte) (length2 - 4);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetBefore, i7, keyRepeatTimeout, -1054011043, false, $$g(length2, b4, b4), new Class[]{Integer.TYPE});
                            }
                            bArr2[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i6++;
                            j = 0;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = g;
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2268, 33 - TextUtils.getOffsetAfter("", 0), 1387473586, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                    } else {
                        iIntValue = (short) (((short) (((long) asInterface[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                    }
                }
                if (iIntValue > 0) {
                    int i8 = $11;
                    int i9 = i8 + 113;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L));
                    if (!z2) {
                        i4 = 0;
                    } else {
                        int i12 = i8 + 75;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        i4 = 1;
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i11 + i4;
                    Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 1;
                        byte b8 = (byte) (b7 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 55905), 2855 - View.combineMeasuredStates(0, 0), 13 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1529949196, false, $$g(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr4 = g;
                    if (bArr4 != null) {
                        int length3 = bArr4.length;
                        byte[] bArr5 = new byte[length3];
                        for (int i14 = 0; i14 < length3; i14++) {
                            bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 3046761265686732006L);
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i15 = $11 + 43;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        int i17 = $11 + 9;
                        $10 = i17 % 128;
                        if (i17 % 2 != 0) {
                            int i18 = 58 / 0;
                            if (z) {
                                byte[] bArr6 = g;
                                int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i19]) ^ 3046761265686732006L)) + s)) ^ b));
                            } else {
                                short[] sArr = asInterface;
                                int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i20]) ^ 3046761265686732006L)) + s)) ^ b));
                            }
                        } else if (z) {
                            byte[] bArr7 = g;
                            int i110 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i110 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i110]) ^ 3046761265686732006L)) + s)) ^ b));
                        } else {
                            short[] sArr2 = asInterface;
                            int i21 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i21 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr2[i21]) ^ 3046761265686732006L)) + s)) ^ b));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0280  */
        /* JADX WARN: Code duplicated, block: B:28:0x0282  */
        @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                int edgeSlop = 876 - (ViewConfiguration.getEdgeSlop() >> 16);
                int keyRepeatTimeout = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte[] bArr = $$a;
                byte b = bArr[80];
                Object[] objArr2 = new Object[1];
                a(b, (byte) (b | 14), (byte) (-bArr[2]), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength, edgeSlop, keyRepeatTimeout, -1650998592, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(Color.argb(0, 0, 0, 0) - 197652794, (-94) - (Process.myTid() >> 22), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) - 72), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 979208922, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(TextUtils.getCapsMode("", 0, 0) - 197652790, TextUtils.getOffsetBefore("", 0) - 94, (short) Color.green(0), (byte) ((-66) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (-979208900) - ExpandableListView.getPackedPositionGroup(0L), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cArgb = (char) Color.argb(0, 0, 0, 0);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 877;
                int i2 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11;
                byte[] bArr2 = $$a;
                byte b2 = bArr2[80];
                byte b3 = bArr2[7];
                Object[] objArr5 = new Object[1];
                a(b2, b3, (byte) (b3 | 89), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cArgb, packedPositionChild, i2, 2012020043, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 876;
                    int iIndexOf = 9 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[80];
                    byte b5 = bArr3[7];
                    Object[] objArr6 = new Object[1];
                    a(b4, b5, b5, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, maximumFlingVelocity, iIndexOf, 2012931276, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int i3 = ~((~System.identityHashCode(this)) | (-878099195));
                int i4 = (((((-922745600) | i3) * (-970)) - 2027064094) + ((i3 | 44646405) * 970)) - 614386268;
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c((-197652794) - TextUtils.indexOf("", "", 0, 0), (-94) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 8), (-979208885) - View.MeasureSpec.makeMeasureSpec(0, 0), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c((-197652792) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-93) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (short) TextUtils.getOffsetBefore("", 0), (byte) ((-20) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) - 979208859, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i7 = asBinder;
                    int i8 = i7 + 89;
                    d = i8 % 128;
                    int i9 = i8 % 2;
                    if (applicationContext instanceof ContextWrapper) {
                        int i10 = i7 + 33;
                        d = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i11 = 13 / 0;
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                            } else {
                                applicationContext = null;
                            }
                        } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                }
                Object[] objArr10 = new Object[1];
                c((-197652786) - MotionEvent.axisFromString(""), TextUtils.indexOf((CharSequence) "", '0') - 93, (short) (KeyEvent.getMaxKeyCode() >> 16), (byte) (107 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 979208841, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(View.getDefaultSize(0, 0) - 197652786, TextUtils.lastIndexOf("", '0', 0) - 93, (short) ExpandableListView.getPackedPositionGroup(0L), (byte) ((-96) - ImageFormat.getBitsPerPixel(0)), (-979208826) - ExpandableListView.getPackedPositionChild(0L), objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -614386268};
                    byte[] bArr4 = $$d;
                    Object[] objArr13 = new Object[1];
                    e((short) 86, bArr4[31], bArr4[73], objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b6 = bArr4[31];
                    short s = b6;
                    Object[] objArr14 = new Object[1];
                    e(s, (byte) (s | 34), b6, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cResolveSize = (char) View.resolveSize(0, 0);
                            int scrollBarSize = 876 - (ViewConfiguration.getScrollBarSize() >> 8);
                            int longPressTimeout = 10 - (ViewConfiguration.getLongPressTimeout() >> 16);
                            byte[] bArr5 = $$a;
                            byte b7 = bArr5[80];
                            byte b8 = bArr5[7];
                            Object[] objArr16 = new Object[1];
                            a(b7, b8, b8, objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSize, scrollBarSize, longPressTimeout, 2012931276, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c((ViewConfiguration.getLongPressTimeout() >> 16) - 197652794, (-94) - ExpandableListView.getPackedPositionType(0L), (short) View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((-72) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 979208921, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c((-197652790) - (ViewConfiguration.getEdgeSlop() >> 16), (-94) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (short) View.MeasureSpec.getMode(0), (byte) ((-66) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), TextUtils.getCapsMode("", 0, 0) - 979208900, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                                int threadPriority = 876 - ((Process.getThreadPriority(0) + 20) >> 6);
                                int gidForName = 9 - Process.getGidForName("");
                                byte[] bArr6 = $$a;
                                byte b9 = bArr6[80];
                                byte b10 = bArr6[7];
                                Object[] objArr19 = new Object[1];
                                a(b9, b10, (byte) (b10 | 89), objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, threadPriority, gidForName, 2012020043, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                                int i12 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 876;
                                int mode = 10 - View.MeasureSpec.getMode(0);
                                byte[] bArr7 = $$a;
                                byte b11 = bArr7[80];
                                Object[] objArr20 = new Object[1];
                                a(b11, (byte) (b11 | 14), (byte) (-bArr7[2]), objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, i12, mode, -1650998592, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr15;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i13 = ((int[]) objArr[2])[0];
            int i14 = ((int[]) objArr[0])[0];
            if (i14 == i13) {
                int i15 = asBinder + 45;
                d = i15 % 128;
                int i16 = i15 % 2;
                int i17 = ((int[]) objArr[1])[0];
                Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i18 = i17 + (-208210156) + (((~((-841835621) | iIdentityHashCode)) | 271130720) * 1504) + ((~(iIdentityHashCode | (-570704901))) * (-1504)) + 489810624;
                int i19 = (i18 << 13) ^ i18;
                int i20 = i19 ^ (i19 >>> 17);
                ((int[]) objArr21[1])[0] = i20 ^ (i20 << 5);
            } else {
                Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
                int i21 = ((int[]) objArr[1])[0];
                Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i22 = i21 + (-340708924) + ((~((~elapsedCpuTime) | (-66641))) * (-116)) + ((174889637 | elapsedCpuTime) * 116) + (((~(elapsedCpuTime | 134579408)) | 40376869) * 116);
                int i23 = (i22 << 13) ^ i22;
                int i24 = i23 ^ (i23 >>> 17);
                ((int[]) objArr22[1])[0] = i24 ^ (i24 << 5);
            }
            ViewPager viewPager = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNullParameter(viewPager, "");
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                int i25 = d + 71;
                asBinder = i25 % 128;
                if (i25 % 2 == 0) {
                    adapter.getCount();
                    throw null;
                }
                if (adapter.getCount() > 0) {
                    return true;
                }
            } else {
                int i26 = asBinder + 113;
                d = i26 % 128;
                int i27 = i26 % 2;
            }
            return false;
        }

        @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            int i = 2 % 2;
            int i2 = d + 105;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            int currentItem = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getCurrentItem();
            int i4 = d + 45;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return currentItem;
        }

        @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1
        public final boolean TuitionPaymentFragmentbindingInflater1() {
            PagerAdapter adapter;
            int i = 2 % 2;
            int i2 = d + 113;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            ViewPager viewPager = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (viewPager == null || (adapter = viewPager.getAdapter()) == null || adapter.getCount() != 0) {
                return false;
            }
            int i3 = d + 89;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                return true;
            }
            throw null;
        }

        @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
            Object[] objArr;
            Object[] objArr2;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char mode = (char) (31533 - View.MeasureSpec.getMode(0));
                int iKeyCodeFromString = 921 - KeyEvent.keyCodeFromString("");
                int maxKeyCode = 28 - (KeyEvent.getMaxKeyCode() >> 16);
                byte b = $$a[7];
                Object[] objArr3 = new Object[1];
                a(b, (byte) (b | 52), (byte) 89, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mode, iKeyCodeFromString, maxKeyCode, -1048449946, false, (String) objArr3[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr4 = new Object[1];
            c((-197652794) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) - 94, (short) Color.green(0), (byte) ((-73) - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 979208922, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            c(TextUtils.indexOf("", "", 0) - 197652790, Gravity.getAbsoluteGravity(0, 0) - 94, (short) ('0' - AndroidCharacter.getMirror('0')), (byte) ((-66) - TextUtils.indexOf("", "")), (-979208900) - Color.blue(0), objArr5);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 31533);
                int packedPositionGroup = 921 - ExpandableListView.getPackedPositionGroup(0L);
                int i2 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
                byte[] bArr = $$a;
                byte b2 = bArr[80];
                byte b3 = bArr[7];
                Object[] objArr6 = new Object[1];
                a(b2, b3, (byte) (b3 | 89), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, packedPositionGroup, i2, -778300370, false, (String) objArr6[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i3 = asBinder + 111;
                d = i3 % 128;
                int i4 = i3 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cArgb = (char) (Color.argb(0, 0, 0, 0) + 31533);
                    int trimmedLength = 921 - TextUtils.getTrimmedLength("");
                    int iBlue = 28 - Color.blue(0);
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[80];
                    Object[] objArr7 = new Object[1];
                    a(b4, (byte) (b4 | 14), (byte) (-bArr2[2]), objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb, trimmedLength, iBlue, -1142834547, false, (String) objArr7[0], null);
                }
                Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i5 = 440064755 + (((-1639533660) | iIdentityHashCode) * 376) + (((~((~iIdentityHashCode) | 606309746)) | (-1706806652)) * (-376)) + (((~(iIdentityHashCode | (-606309747))) | 1167769897) * 376) + 382525014;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
            } else {
                Object[] objArr9 = new Object[1];
                c((-197652794) - View.MeasureSpec.getSize(0), TextUtils.lastIndexOf("", '0', 0) - 93, (short) ((-1) - ImageFormat.getBitsPerPixel(0)), (byte) ((-8) - KeyEvent.normalizeMetaState(0)), (-979208885) - KeyEvent.normalizeMetaState(0), objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                c(TextUtils.indexOf("", "", 0) - 197652792, KeyEvent.normalizeMetaState(0) - 94, (short) (ViewConfiguration.getScrollBarSize() >> 8), (byte) (TextUtils.getTrimmedLength("") - 21), (ViewConfiguration.getLongPressTimeout() >> 16) - 979208859, objArr10);
                Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i8 = asBinder + 51;
                    d = i8 % 128;
                    int i9 = i8 % 2;
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr11 = new Object[1];
                c(KeyEvent.getDeadChar(0, 0) - 197652785, 65490 - AndroidCharacter.getMirror('0'), (short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (View.getDefaultSize(0, 0) + 107), (-979208842) - ImageFormat.getBitsPerPixel(0), objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                c((-197652786) - (ViewConfiguration.getTapTimeout() >> 16), (-94) - (ViewConfiguration.getScrollBarSize() >> 8), (short) ('0' - AndroidCharacter.getMirror('0')), (byte) ((-95) - Drawable.resolveOpacity(0, 0)), (-979208825) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr12);
                try {
                    Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, 382525014};
                    byte[] bArr3 = $$d;
                    Object[] objArr14 = new Object[1];
                    e((short) 143, (byte) (bArr3[114] - 1), bArr3[59], objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    short s = (short) ($$e & 991);
                    Object[] objArr15 = new Object[1];
                    e(s, (byte) (s >>> 2), bArr3[31], objArr15);
                    Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cRgb = (char) ((-16745683) - Color.rgb(0, 0, 0));
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 921;
                        int mode2 = 28 - View.MeasureSpec.getMode(0);
                        byte[] bArr4 = $$a;
                        byte b5 = bArr4[80];
                        Object[] objArr17 = new Object[1];
                        a(b5, (byte) (b5 | 14), (byte) (-bArr4[2]), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRgb, keyRepeatTimeout, mode2, -1142834547, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                    try {
                        Object[] objArr18 = new Object[1];
                        c((-197652794) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) - 93, (short) (Process.myPid() >> 22), (byte) (View.MeasureSpec.getMode(0) - 72), (ViewConfiguration.getPressedStateDuration() >> 16) - 979208922, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        c((-197652790) - (ViewConfiguration.getKeyRepeatDelay() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) - 94, (short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) - 65), (ViewConfiguration.getLongPressTimeout() >> 16) - 979208900, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cMyPid = (char) ((Process.myPid() >> 22) + 31533);
                            int iIndexOf = 921 - TextUtils.indexOf("", "", 0);
                            int capsMode = 28 - TextUtils.getCapsMode("", 0, 0);
                            byte[] bArr5 = $$a;
                            byte b6 = bArr5[80];
                            byte b7 = bArr5[7];
                            Object[] objArr20 = new Object[1];
                            a(b6, b7, (byte) (b7 | 89), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyPid, iIndexOf, capsMode, -778300370, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 31533);
                            int capsMode2 = 921 - TextUtils.getCapsMode("", 0, 0);
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28;
                            byte b8 = $$a[7];
                            Object[] objArr21 = new Object[1];
                            a(b8, (byte) (b8 | 52), (byte) 89, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cNormalizeMetaState, capsMode2, maximumFlingVelocity, -1048449946, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr16;
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
            int i10 = ((int[]) objArr[1])[0];
            int i11 = ((int[]) objArr[3])[0];
            if (i11 == i10) {
                int i12 = ((int[]) objArr[0])[0];
                objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int i13 = ~System.identityHashCode(this);
                int i14 = i12 + 2142881953 + (((-154806353) | i13) * 494) + (((~(i13 | 1615074727)) | (-1765682516)) * 494);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr2[0])[0] = i16 ^ (i16 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    int i17 = asBinder + 77;
                    d = i17 % 128;
                    int i18 = i17 % 2;
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
                int i19 = ((int[]) objArr[0])[0];
                objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i20 = i19 + (-229984995) + (((~(1422886312 | iIdentityHashCode2)) | 2115667) * (-140)) + ((~(1425001979 | iIdentityHashCode2)) * 70) + (((~(iIdentityHashCode2 | 351193331)) | 1075924315) * 70);
                int i21 = (i20 << 13) ^ i20;
                int i22 = i21 ^ (i21 >>> 17);
                ((int[]) objArr2[0])[0] = i22 ^ (i22 << 5);
            }
            PagerAdapter adapter = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAdapter();
            if (adapter != null) {
                return adapter.getCount();
            }
            int i23 = ((int[]) objArr2[0])[0];
            int i24 = i23 * i23;
            int i25 = -(1489844589 * i23);
            int i26 = ((((i24 | i25) << 1) - (i24 ^ i25)) - (~(-(i23 * (-1514556363))))) - 1;
            int i27 = ((i26 | (-963946847)) << 1) - ((-963946847) ^ i26);
            int i28 = i27 >> 28;
            int i29 = ((i28 ^ (-31)) + ((i28 & (-31)) << 1)) / 16;
            int i30 = (i27 - (~(((i29 | 1) << 1) - (i29 ^ 1)))) - 1;
            int i31 = ((i27 >> 15) - 262143) / 131072;
            int i32 = -(i30 ^ ((i31 ^ 1) + ((i31 & 1) << 1)));
            int i33 = ((i32 | 2) << 1) - (i32 ^ 2);
            int i34 = ((i33 >> 24) - 511) / 256;
            int i35 = ((i34 | 1) << 1) - (i34 ^ 1);
            return 0 / (((-(((i35 | 1) << 1) - (i35 ^ 1))) & i33) * 1673);
        }

        @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
            int i2 = 2 % 2;
            int i3 = d + 91;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setCurrentItem(i, true);
            int i5 = d + 105;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1
        public final void b() {
            int i = 2 % 2;
            int i2 = d + 59;
            int i3 = i2 % 128;
            asBinder = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            ViewPager.OnPageChangeListener onPageChangeListener = this.b;
            if (onPageChangeListener != null) {
                int i4 = i3 + 117;
                d = i4 % 128;
                if (i4 % 2 != 0) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.removeOnPageChangeListener(onPageChangeListener);
                    obj.hashCode();
                    throw null;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.removeOnPageChangeListener(onPageChangeListener);
                int i5 = asBinder + 3;
                d = i5 % 128;
                int i6 = i5 % 2;
            }
            int i7 = asBinder + 75;
            d = i7 % 128;
            int i8 = i7 % 2;
        }

        @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentbindingInflater1(MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder mediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(mediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder, "");
            C0005b c0005b = new C0005b(mediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder);
            this.b = c0005b;
            ViewPager viewPager = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNull(c0005b);
            viewPager.addOnPageChangeListener(c0005b);
            int i2 = d + 93;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r7, short r8, byte r9) {
            /*
                int r7 = r7 + 117
                byte[] r0 = OutputOptionsOutputOptionsInternalBuilder.b.$$c
                int r9 = r9 * 3
                int r9 = 3 - r9
                int r8 = r8 * 4
                int r8 = r8 + 1
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r9
                r4 = r2
                goto L2a
            L14:
                r3 = r2
            L15:
                int r9 = r9 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r8) goto L24
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L24:
                r3 = r0[r9]
                r6 = r9
                r9 = r7
                r7 = r3
                r3 = r6
            L2a:
                int r7 = r7 + r9
                r9 = r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: OutputOptionsOutputOptionsInternalBuilder.b.$$g(byte, short, byte):java.lang.String");
        }
    }
}
